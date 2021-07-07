package com.facebook.imagepipeline.producers;

import android.graphics.Bitmap;
import com.facebook.common.internal.ImmutableMap;
import com.facebook.common.internal.Preconditions;
import com.facebook.common.internal.VisibleForTesting;
import com.facebook.common.references.CloseableReference;
import com.facebook.imagepipeline.bitmaps.PlatformBitmapFactory;
import com.facebook.imagepipeline.image.CloseableImage;
import com.facebook.imagepipeline.image.CloseableStaticBitmap;
import com.facebook.imagepipeline.request.Postprocessor;
import com.facebook.imagepipeline.request.RepeatedPostprocessor;
import com.facebook.imagepipeline.request.RepeatedPostprocessorRunner;
import java.util.Map;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;

public class PostprocessorProducer implements Producer<CloseableReference<CloseableImage>> {
    public static final String NAME = "PostprocessorProducer";
    @VisibleForTesting
    public static final String POSTPROCESSOR = "Postprocessor";
    public final PlatformBitmapFactory mBitmapFactory;
    public final Executor mExecutor;
    public final Producer<CloseableReference<CloseableImage>> mInputProducer;

    public class PostprocessorConsumer extends DelegatingConsumer<CloseableReference<CloseableImage>, CloseableReference<CloseableImage>> {
        @GuardedBy("PostprocessorConsumer.this")
        public boolean mIsClosed;
        @GuardedBy("PostprocessorConsumer.this")
        public boolean mIsDirty = false;
        @GuardedBy("PostprocessorConsumer.this")
        public boolean mIsPostProcessingRunning = false;
        public final ProducerListener mListener;
        public final Postprocessor mPostprocessor;
        public final String mRequestId;
        @GuardedBy("PostprocessorConsumer.this")
        @Nullable
        public CloseableReference<CloseableImage> mSourceImageRef = null;
        @GuardedBy("PostprocessorConsumer.this")
        public int mStatus = 0;

        public PostprocessorConsumer(Consumer<CloseableReference<CloseableImage>> consumer, ProducerListener producerListener, String str, Postprocessor postprocessor, ProducerContext producerContext) {
            super(consumer);
            this.mListener = producerListener;
            this.mRequestId = str;
            this.mPostprocessor = postprocessor;
            producerContext.addCallbacks(new BaseProducerContextCallbacks(PostprocessorProducer.this) {
                /* class com.facebook.imagepipeline.producers.PostprocessorProducer.PostprocessorConsumer.C05611 */

                @Override // com.facebook.imagepipeline.producers.BaseProducerContextCallbacks, com.facebook.imagepipeline.producers.ProducerContextCallbacks
                public void onCancellationRequested() {
                    PostprocessorConsumer.this.maybeNotifyOnCancellation();
                }
            });
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        private void clearRunningAndStartIfDirty() {
            boolean runningIfDirtyAndNotRunning;
            synchronized (this) {
                this.mIsPostProcessingRunning = false;
                runningIfDirtyAndNotRunning = setRunningIfDirtyAndNotRunning();
            }
            if (runningIfDirtyAndNotRunning) {
                submitPostprocessing();
            }
        }

        private boolean close() {
            synchronized (this) {
                if (this.mIsClosed) {
                    return false;
                }
                CloseableReference<CloseableImage> closeableReference = this.mSourceImageRef;
                this.mSourceImageRef = null;
                this.mIsClosed = true;
                CloseableReference.closeSafely(closeableReference);
                return true;
            }
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        private void doPostprocessing(CloseableReference<CloseableImage> closeableReference, int i) {
            Preconditions.checkArgument(CloseableReference.isValid(closeableReference));
            if (!shouldPostprocess(closeableReference.get())) {
                maybeNotifyOnNewResult(closeableReference, i);
                return;
            }
            this.mListener.onProducerStart(this.mRequestId, PostprocessorProducer.NAME);
            try {
                CloseableReference<CloseableImage> postprocessInternal = postprocessInternal(closeableReference.get());
                try {
                    this.mListener.onProducerFinishWithSuccess(this.mRequestId, PostprocessorProducer.NAME, getExtraMap(this.mListener, this.mRequestId, this.mPostprocessor));
                    maybeNotifyOnNewResult(postprocessInternal, i);
                } finally {
                    CloseableReference.closeSafely(postprocessInternal);
                }
            } catch (Exception e) {
                this.mListener.onProducerFinishWithFailure(this.mRequestId, PostprocessorProducer.NAME, e, getExtraMap(this.mListener, this.mRequestId, this.mPostprocessor));
                maybeNotifyOnFailure(e);
                CloseableReference.closeSafely((CloseableReference<?>) null);
            }
        }

        private Map<String, String> getExtraMap(ProducerListener producerListener, String str, Postprocessor postprocessor) {
            if (!producerListener.requiresExtraMap(str)) {
                return null;
            }
            return ImmutableMap.m845of(PostprocessorProducer.POSTPROCESSOR, postprocessor.getName());
        }

        private synchronized boolean isClosed() {
            return this.mIsClosed;
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        private void maybeNotifyOnCancellation() {
            if (close()) {
                getConsumer().onCancellation();
            }
        }

        private void maybeNotifyOnFailure(Throwable th) {
            if (close()) {
                getConsumer().onFailure(th);
            }
        }

        private void maybeNotifyOnNewResult(CloseableReference<CloseableImage> closeableReference, int i) {
            boolean isLast = BaseConsumer.isLast(i);
            if ((!isLast && !isClosed()) || (isLast && close())) {
                getConsumer().onNewResult(closeableReference, i);
            }
        }

        private CloseableReference<CloseableImage> postprocessInternal(CloseableImage closeableImage) {
            CloseableStaticBitmap closeableStaticBitmap = (CloseableStaticBitmap) closeableImage;
            CloseableReference<Bitmap> process = this.mPostprocessor.process(closeableStaticBitmap.getUnderlyingBitmap(), PostprocessorProducer.this.mBitmapFactory);
            try {
                return CloseableReference.m937of(new CloseableStaticBitmap(process, closeableImage.getQualityInfo(), closeableStaticBitmap.getRotationAngle(), closeableStaticBitmap.getExifOrientation()));
            } finally {
                CloseableReference.closeSafely(process);
            }
        }

        private synchronized boolean setRunningIfDirtyAndNotRunning() {
            if (this.mIsClosed || !this.mIsDirty || this.mIsPostProcessingRunning || !CloseableReference.isValid(this.mSourceImageRef)) {
                return false;
            }
            this.mIsPostProcessingRunning = true;
            return true;
        }

        private boolean shouldPostprocess(CloseableImage closeableImage) {
            return closeableImage instanceof CloseableStaticBitmap;
        }

        private void submitPostprocessing() {
            PostprocessorProducer.this.mExecutor.execute(new Runnable() {
                /* class com.facebook.imagepipeline.producers.PostprocessorProducer.PostprocessorConsumer.RunnableC05622 */

                public void run() {
                    CloseableReference closeableReference;
                    int i;
                    synchronized (PostprocessorConsumer.this) {
                        closeableReference = PostprocessorConsumer.this.mSourceImageRef;
                        i = PostprocessorConsumer.this.mStatus;
                        PostprocessorConsumer.this.mSourceImageRef = null;
                        PostprocessorConsumer.this.mIsDirty = false;
                    }
                    if (CloseableReference.isValid(closeableReference)) {
                        try {
                            PostprocessorConsumer.this.doPostprocessing(closeableReference, i);
                        } finally {
                            CloseableReference.closeSafely(closeableReference);
                        }
                    }
                    PostprocessorConsumer.this.clearRunningAndStartIfDirty();
                }
            });
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x001e, code lost:
            submitPostprocessing();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:8:0x0019, code lost:
            com.facebook.common.references.CloseableReference.closeSafely(r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x001c, code lost:
            if (r2 == false) goto L_?;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private void updateSourceImageRef(@javax.annotation.Nullable com.facebook.common.references.CloseableReference<com.facebook.imagepipeline.image.CloseableImage> r2, int r3) {
            /*
                r1 = this;
                monitor-enter(r1)
                boolean r0 = r1.mIsClosed     // Catch:{ all -> 0x0022 }
                if (r0 == 0) goto L_0x0007
                monitor-exit(r1)     // Catch:{ all -> 0x0022 }
                return
            L_0x0007:
                com.facebook.common.references.CloseableReference<com.facebook.imagepipeline.image.CloseableImage> r0 = r1.mSourceImageRef     // Catch:{ all -> 0x0022 }
                com.facebook.common.references.CloseableReference r2 = com.facebook.common.references.CloseableReference.cloneOrNull(r2)     // Catch:{ all -> 0x0022 }
                r1.mSourceImageRef = r2     // Catch:{ all -> 0x0022 }
                r1.mStatus = r3     // Catch:{ all -> 0x0022 }
                r2 = 1
                r1.mIsDirty = r2     // Catch:{ all -> 0x0022 }
                boolean r2 = r1.setRunningIfDirtyAndNotRunning()     // Catch:{ all -> 0x0022 }
                monitor-exit(r1)     // Catch:{ all -> 0x0022 }
                com.facebook.common.references.CloseableReference.closeSafely(r0)
                if (r2 == 0) goto L_0x0021
                r1.submitPostprocessing()
            L_0x0021:
                return
            L_0x0022:
                r2 = move-exception
                monitor-exit(r1)
                throw r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.imagepipeline.producers.PostprocessorProducer.PostprocessorConsumer.updateSourceImageRef(com.facebook.common.references.CloseableReference, int):void");
        }

        @Override // com.facebook.imagepipeline.producers.BaseConsumer, com.facebook.imagepipeline.producers.DelegatingConsumer
        public void onCancellationImpl() {
            maybeNotifyOnCancellation();
        }

        @Override // com.facebook.imagepipeline.producers.BaseConsumer, com.facebook.imagepipeline.producers.DelegatingConsumer
        public void onFailureImpl(Throwable th) {
            maybeNotifyOnFailure(th);
        }

        public void onNewResultImpl(CloseableReference<CloseableImage> closeableReference, int i) {
            if (CloseableReference.isValid(closeableReference)) {
                updateSourceImageRef(closeableReference, i);
            } else if (BaseConsumer.isLast(i)) {
                maybeNotifyOnNewResult(null, i);
            }
        }
    }

    public class RepeatedPostprocessorConsumer extends DelegatingConsumer<CloseableReference<CloseableImage>, CloseableReference<CloseableImage>> implements RepeatedPostprocessorRunner {
        @GuardedBy("RepeatedPostprocessorConsumer.this")
        public boolean mIsClosed;
        @GuardedBy("RepeatedPostprocessorConsumer.this")
        @Nullable
        public CloseableReference<CloseableImage> mSourceImageRef;

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        private boolean close() {
            synchronized (this) {
                if (this.mIsClosed) {
                    return false;
                }
                CloseableReference<CloseableImage> closeableReference = this.mSourceImageRef;
                this.mSourceImageRef = null;
                this.mIsClosed = true;
                CloseableReference.closeSafely(closeableReference);
                return true;
            }
        }

        private void setSourceImageRef(CloseableReference<CloseableImage> closeableReference) {
            synchronized (this) {
                if (!this.mIsClosed) {
                    CloseableReference<CloseableImage> closeableReference2 = this.mSourceImageRef;
                    this.mSourceImageRef = CloseableReference.cloneOrNull(closeableReference);
                    CloseableReference.closeSafely(closeableReference2);
                }
            }
        }

        private void updateInternal() {
            synchronized (this) {
                if (!this.mIsClosed) {
                    CloseableReference cloneOrNull = CloseableReference.cloneOrNull(this.mSourceImageRef);
                    try {
                        getConsumer().onNewResult(cloneOrNull, 0);
                    } finally {
                        CloseableReference.closeSafely(cloneOrNull);
                    }
                }
            }
        }

        @Override // com.facebook.imagepipeline.producers.BaseConsumer, com.facebook.imagepipeline.producers.DelegatingConsumer
        public void onCancellationImpl() {
            if (close()) {
                getConsumer().onCancellation();
            }
        }

        @Override // com.facebook.imagepipeline.producers.BaseConsumer, com.facebook.imagepipeline.producers.DelegatingConsumer
        public void onFailureImpl(Throwable th) {
            if (close()) {
                getConsumer().onFailure(th);
            }
        }

        @Override // com.facebook.imagepipeline.request.RepeatedPostprocessorRunner
        public synchronized void update() {
            updateInternal();
        }

        public RepeatedPostprocessorConsumer(PostprocessorConsumer postprocessorConsumer, RepeatedPostprocessor repeatedPostprocessor, ProducerContext producerContext) {
            super(postprocessorConsumer);
            this.mIsClosed = false;
            this.mSourceImageRef = null;
            repeatedPostprocessor.setCallback(this);
            producerContext.addCallbacks(new BaseProducerContextCallbacks(PostprocessorProducer.this) {
                /* class com.facebook.imagepipeline.producers.PostprocessorProducer.RepeatedPostprocessorConsumer.C05631 */

                @Override // com.facebook.imagepipeline.producers.BaseProducerContextCallbacks, com.facebook.imagepipeline.producers.ProducerContextCallbacks
                public void onCancellationRequested() {
                    if (RepeatedPostprocessorConsumer.this.close()) {
                        RepeatedPostprocessorConsumer.this.getConsumer().onCancellation();
                    }
                }
            });
        }

        public void onNewResultImpl(CloseableReference<CloseableImage> closeableReference, int i) {
            if (!BaseConsumer.isNotLast(i)) {
                setSourceImageRef(closeableReference);
                updateInternal();
            }
        }
    }

    public class SingleUsePostprocessorConsumer extends DelegatingConsumer<CloseableReference<CloseableImage>, CloseableReference<CloseableImage>> {
        public SingleUsePostprocessorConsumer(PostprocessorConsumer postprocessorConsumer) {
            super(postprocessorConsumer);
        }

        public void onNewResultImpl(CloseableReference<CloseableImage> closeableReference, int i) {
            if (!BaseConsumer.isNotLast(i)) {
                getConsumer().onNewResult(closeableReference, i);
            }
        }
    }

    public PostprocessorProducer(Producer<CloseableReference<CloseableImage>> producer, PlatformBitmapFactory platformBitmapFactory, Executor executor) {
        this.mInputProducer = (Producer) Preconditions.checkNotNull(producer);
        this.mBitmapFactory = platformBitmapFactory;
        this.mExecutor = (Executor) Preconditions.checkNotNull(executor);
    }

    @Override // com.facebook.imagepipeline.producers.Producer
    public void produceResults(Consumer<CloseableReference<CloseableImage>> consumer, ProducerContext producerContext) {
        Consumer<CloseableReference<CloseableImage>> consumer2;
        ProducerListener listener = producerContext.getListener();
        Postprocessor postprocessor = producerContext.getImageRequest().getPostprocessor();
        PostprocessorConsumer postprocessorConsumer = new PostprocessorConsumer(consumer, listener, producerContext.getId(), postprocessor, producerContext);
        if (postprocessor instanceof RepeatedPostprocessor) {
            consumer2 = new RepeatedPostprocessorConsumer(postprocessorConsumer, (RepeatedPostprocessor) postprocessor, producerContext);
        } else {
            consumer2 = new SingleUsePostprocessorConsumer(postprocessorConsumer);
        }
        this.mInputProducer.produceResults(consumer2, producerContext);
    }
}

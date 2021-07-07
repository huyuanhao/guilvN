package com.facebook.imagepipeline.producers;

import android.net.Uri;
import com.facebook.cache.common.CacheKey;
import com.facebook.common.internal.ImmutableMap;
import com.facebook.common.internal.VisibleForTesting;
import com.facebook.common.logging.FLog;
import com.facebook.common.memory.ByteArrayPool;
import com.facebook.common.memory.PooledByteBufferFactory;
import com.facebook.common.memory.PooledByteBufferOutputStream;
import com.facebook.common.references.CloseableReference;
import com.facebook.imageformat.ImageFormat;
import com.facebook.imagepipeline.cache.BufferedDiskCache;
import com.facebook.imagepipeline.cache.CacheKeyFactory;
import com.facebook.imagepipeline.common.BytesRange;
import com.facebook.imagepipeline.image.EncodedImage;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import com.p118pd.sdk.AbstractC7390o0OOOO0;
import com.p118pd.sdk.C7391o0OOOO0o;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.annotation.Nullable;

public class PartialDiskCacheProducer implements Producer<EncodedImage> {
    public static final String ENCODED_IMAGE_SIZE = "encodedImageSize";
    public static final String EXTRA_CACHED_VALUE_FOUND = "cached_value_found";
    public static final String PRODUCER_NAME = "PartialDiskCacheProducer";
    public final ByteArrayPool mByteArrayPool;
    public final CacheKeyFactory mCacheKeyFactory;
    public final BufferedDiskCache mDefaultBufferedDiskCache;
    public final Producer<EncodedImage> mInputProducer;
    public final PooledByteBufferFactory mPooledByteBufferFactory;

    public static class PartialDiskCacheConsumer extends DelegatingConsumer<EncodedImage, EncodedImage> {
        public static final int READ_SIZE = 16384;
        public final ByteArrayPool mByteArrayPool;
        public final BufferedDiskCache mDefaultBufferedDiskCache;
        @Nullable
        public final EncodedImage mPartialEncodedImageFromCache;
        public final CacheKey mPartialImageCacheKey;
        public final PooledByteBufferFactory mPooledByteBufferFactory;

        private void copy(InputStream inputStream, OutputStream outputStream, int i) throws IOException {
            byte[] bArr = (byte[]) this.mByteArrayPool.get(16384);
            int i2 = i;
            while (i2 > 0) {
                try {
                    int read = inputStream.read(bArr, 0, Math.min(16384, i2));
                    if (read < 0) {
                        break;
                    } else if (read > 0) {
                        outputStream.write(bArr, 0, read);
                        i2 -= read;
                    }
                } catch (Throwable th) {
                    this.mByteArrayPool.release(bArr);
                    throw th;
                }
            }
            this.mByteArrayPool.release(bArr);
            if (i2 > 0) {
                throw new IOException(String.format(null, "Failed to read %d bytes - finished %d short", Integer.valueOf(i), Integer.valueOf(i2)));
            }
        }

        private PooledByteBufferOutputStream merge(EncodedImage encodedImage, EncodedImage encodedImage2) throws IOException {
            PooledByteBufferOutputStream newOutputStream = this.mPooledByteBufferFactory.newOutputStream(encodedImage2.getSize() + encodedImage2.getBytesRange().from);
            copy(encodedImage.getInputStream(), newOutputStream, encodedImage2.getBytesRange().from);
            copy(encodedImage2.getInputStream(), newOutputStream, encodedImage2.getSize());
            return newOutputStream;
        }

        private void sendFinalResultToConsumer(PooledByteBufferOutputStream pooledByteBufferOutputStream) {
            EncodedImage encodedImage;
            Throwable th;
            CloseableReference of = CloseableReference.m937of(pooledByteBufferOutputStream.toByteBuffer());
            try {
                encodedImage = new EncodedImage(of);
                try {
                    encodedImage.parseMetaData();
                    getConsumer().onNewResult(encodedImage, 1);
                    EncodedImage.closeSafely(encodedImage);
                    CloseableReference.closeSafely(of);
                } catch (Throwable th2) {
                    th = th2;
                    EncodedImage.closeSafely(encodedImage);
                    CloseableReference.closeSafely(of);
                    throw th;
                }
            } catch (Throwable th3) {
                encodedImage = null;
                th = th3;
                EncodedImage.closeSafely(encodedImage);
                CloseableReference.closeSafely(of);
                throw th;
            }
        }

        public PartialDiskCacheConsumer(Consumer<EncodedImage> consumer, BufferedDiskCache bufferedDiskCache, CacheKey cacheKey, PooledByteBufferFactory pooledByteBufferFactory, ByteArrayPool byteArrayPool, @Nullable EncodedImage encodedImage) {
            super(consumer);
            this.mDefaultBufferedDiskCache = bufferedDiskCache;
            this.mPartialImageCacheKey = cacheKey;
            this.mPooledByteBufferFactory = pooledByteBufferFactory;
            this.mByteArrayPool = byteArrayPool;
            this.mPartialEncodedImageFromCache = encodedImage;
        }

        public void onNewResultImpl(EncodedImage encodedImage, int i) {
            if (!BaseConsumer.isNotLast(i)) {
                if (this.mPartialEncodedImageFromCache != null && encodedImage.getBytesRange() != null) {
                    try {
                        sendFinalResultToConsumer(merge(this.mPartialEncodedImageFromCache, encodedImage));
                    } catch (IOException e) {
                        FLog.m874e(PartialDiskCacheProducer.PRODUCER_NAME, "Error while merging image data", e);
                        getConsumer().onFailure(e);
                    } catch (Throwable th) {
                        encodedImage.close();
                        this.mPartialEncodedImageFromCache.close();
                        throw th;
                    }
                    encodedImage.close();
                    this.mPartialEncodedImageFromCache.close();
                    this.mDefaultBufferedDiskCache.remove(this.mPartialImageCacheKey);
                } else if (!BaseConsumer.statusHasFlag(i, 8) || !BaseConsumer.isLast(i) || encodedImage.getImageFormat() == ImageFormat.UNKNOWN) {
                    getConsumer().onNewResult(encodedImage, i);
                } else {
                    this.mDefaultBufferedDiskCache.put(this.mPartialImageCacheKey, encodedImage);
                    getConsumer().onNewResult(encodedImage, i);
                }
            }
        }
    }

    public PartialDiskCacheProducer(BufferedDiskCache bufferedDiskCache, CacheKeyFactory cacheKeyFactory, PooledByteBufferFactory pooledByteBufferFactory, ByteArrayPool byteArrayPool, Producer<EncodedImage> producer) {
        this.mDefaultBufferedDiskCache = bufferedDiskCache;
        this.mCacheKeyFactory = cacheKeyFactory;
        this.mPooledByteBufferFactory = pooledByteBufferFactory;
        this.mByteArrayPool = byteArrayPool;
        this.mInputProducer = producer;
    }

    public static Uri createUriForPartialCacheKey(ImageRequest imageRequest) {
        return imageRequest.getSourceUri().buildUpon().appendQueryParameter("fresco_partial", "true").build();
    }

    @VisibleForTesting
    @Nullable
    public static Map<String, String> getExtraMap(ProducerListener producerListener, String str, boolean z, int i) {
        if (!producerListener.requiresExtraMap(str)) {
            return null;
        }
        if (z) {
            return ImmutableMap.m846of("cached_value_found", String.valueOf(z), "encodedImageSize", String.valueOf(i));
        }
        return ImmutableMap.m845of("cached_value_found", String.valueOf(z));
    }

    public static boolean isTaskCancelled(C7391o0OOOO0o<?> o0oooo0o) {
        return o0oooo0o.m18933OooO00o() || (o0oooo0o.m18938OooO0OO() && (o0oooo0o.m18930OooO00o() instanceof CancellationException));
    }

    private AbstractC7390o0OOOO0<EncodedImage, Void> onFinishDiskReads(final Consumer<EncodedImage> consumer, final ProducerContext producerContext, final CacheKey cacheKey) {
        final String id = producerContext.getId();
        final ProducerListener listener = producerContext.getListener();
        return new AbstractC7390o0OOOO0<EncodedImage, Void>() {
            /* class com.facebook.imagepipeline.producers.PartialDiskCacheProducer.C05581 */

            @Override // com.p118pd.sdk.AbstractC7390o0OOOO0
            public Void then(C7391o0OOOO0o<EncodedImage> o0oooo0o) throws Exception {
                if (PartialDiskCacheProducer.isTaskCancelled(o0oooo0o)) {
                    listener.onProducerFinishWithCancellation(id, PartialDiskCacheProducer.PRODUCER_NAME, null);
                    consumer.onCancellation();
                } else if (o0oooo0o.m18938OooO0OO()) {
                    listener.onProducerFinishWithFailure(id, PartialDiskCacheProducer.PRODUCER_NAME, o0oooo0o.m18930OooO00o(), null);
                    PartialDiskCacheProducer.this.startInputProducer(consumer, producerContext, cacheKey, null);
                } else {
                    EncodedImage OooO00o = o0oooo0o.m18931OooO00o();
                    if (OooO00o != null) {
                        ProducerListener producerListener = listener;
                        String str = id;
                        producerListener.onProducerFinishWithSuccess(str, PartialDiskCacheProducer.PRODUCER_NAME, PartialDiskCacheProducer.getExtraMap(producerListener, str, true, OooO00o.getSize()));
                        BytesRange max = BytesRange.toMax(OooO00o.getSize() - 1);
                        OooO00o.setBytesRange(max);
                        int size = OooO00o.getSize();
                        ImageRequest imageRequest = producerContext.getImageRequest();
                        if (max.contains(imageRequest.getBytesRange())) {
                            listener.onUltimateProducerReached(id, PartialDiskCacheProducer.PRODUCER_NAME, true);
                            consumer.onNewResult(OooO00o, 9);
                        } else {
                            consumer.onNewResult(OooO00o, 8);
                            PartialDiskCacheProducer.this.startInputProducer(consumer, new SettableProducerContext(ImageRequestBuilder.fromRequest(imageRequest).setBytesRange(BytesRange.from(size - 1)).build(), producerContext), cacheKey, OooO00o);
                        }
                    } else {
                        ProducerListener producerListener2 = listener;
                        String str2 = id;
                        producerListener2.onProducerFinishWithSuccess(str2, PartialDiskCacheProducer.PRODUCER_NAME, PartialDiskCacheProducer.getExtraMap(producerListener2, str2, false, 0));
                        PartialDiskCacheProducer.this.startInputProducer(consumer, producerContext, cacheKey, OooO00o);
                    }
                }
                return null;
            }
        };
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void startInputProducer(Consumer<EncodedImage> consumer, ProducerContext producerContext, CacheKey cacheKey, @Nullable EncodedImage encodedImage) {
        this.mInputProducer.produceResults(new PartialDiskCacheConsumer(consumer, this.mDefaultBufferedDiskCache, cacheKey, this.mPooledByteBufferFactory, this.mByteArrayPool, encodedImage), producerContext);
    }

    private void subscribeTaskForRequestCancellation(final AtomicBoolean atomicBoolean, ProducerContext producerContext) {
        producerContext.addCallbacks(new BaseProducerContextCallbacks() {
            /* class com.facebook.imagepipeline.producers.PartialDiskCacheProducer.C05592 */

            @Override // com.facebook.imagepipeline.producers.BaseProducerContextCallbacks, com.facebook.imagepipeline.producers.ProducerContextCallbacks
            public void onCancellationRequested() {
                atomicBoolean.set(true);
            }
        });
    }

    @Override // com.facebook.imagepipeline.producers.Producer
    public void produceResults(Consumer<EncodedImage> consumer, ProducerContext producerContext) {
        ImageRequest imageRequest = producerContext.getImageRequest();
        if (!imageRequest.isDiskCacheEnabled()) {
            this.mInputProducer.produceResults(consumer, producerContext);
            return;
        }
        producerContext.getListener().onProducerStart(producerContext.getId(), PRODUCER_NAME);
        CacheKey encodedCacheKey = this.mCacheKeyFactory.getEncodedCacheKey(imageRequest, createUriForPartialCacheKey(imageRequest), producerContext.getCallerContext());
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        this.mDefaultBufferedDiskCache.get(encodedCacheKey, atomicBoolean).OooO00o((AbstractC7390o0OOOO0<EncodedImage, TContinuationResult>) onFinishDiskReads(consumer, producerContext, encodedCacheKey));
        subscribeTaskForRequestCancellation(atomicBoolean, producerContext);
    }
}

package com.facebook.imagepipeline.producers;

import com.facebook.common.internal.ImmutableList;
import com.facebook.common.internal.ImmutableMap;
import com.facebook.common.internal.Preconditions;
import com.facebook.common.internal.VisibleForTesting;
import com.facebook.common.memory.PooledByteBufferFactory;
import com.facebook.common.util.TriState;
import com.facebook.imageformat.DefaultImageFormats;
import com.facebook.imageformat.ImageFormat;
import com.facebook.imagepipeline.common.ResizeOptions;
import com.facebook.imagepipeline.common.RotationOptions;
import com.facebook.imagepipeline.image.EncodedImage;
import com.facebook.imagepipeline.producers.JobScheduler;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.react.views.text.FontMetricsUtil;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;

public class ResizeAndRotateProducer implements Producer<EncodedImage> {
    @VisibleForTesting
    public static final int DEFAULT_JPEG_QUALITY = 85;
    public static final String DOWNSAMPLE_ENUMERATOR_KEY = "downsampleEnumerator";
    public static final String FRACTION_KEY = "Fraction";
    public static final int FULL_ROUND = 360;
    public static final ImmutableList<Integer> INVERTED_EXIF_ORIENTATIONS = ImmutableList.m843of(2, 7, 4, 5);
    @VisibleForTesting
    public static final int MAX_JPEG_SCALE_NUMERATOR = 8;
    @VisibleForTesting
    public static final int MIN_TRANSFORM_INTERVAL_MS = 100;
    public static final String ORIGINAL_SIZE_KEY = "Original size";
    public static final String PRODUCER_NAME = "ResizeAndRotateProducer";
    public static final String REQUESTED_SIZE_KEY = "Requested size";
    public static final String ROTATION_ANGLE_KEY = "rotationAngle";
    public static final String SOFTWARE_ENUMERATOR_KEY = "softwareEnumerator";
    public final Executor mExecutor;
    public final Producer<EncodedImage> mInputProducer;
    public final PooledByteBufferFactory mPooledByteBufferFactory;
    public final boolean mResizingEnabled;
    public final boolean mUseDownsamplingRatio;

    public class TransformingConsumer extends DelegatingConsumer<EncodedImage, EncodedImage> {
        public boolean mIsCancelled = false;
        public final JobScheduler mJobScheduler;
        public final ProducerContext mProducerContext;

        public TransformingConsumer(final Consumer<EncodedImage> consumer, ProducerContext producerContext) {
            super(consumer);
            this.mProducerContext = producerContext;
            this.mJobScheduler = new JobScheduler(ResizeAndRotateProducer.this.mExecutor, new JobScheduler.JobRunnable(ResizeAndRotateProducer.this) {
                /* class com.facebook.imagepipeline.producers.ResizeAndRotateProducer.TransformingConsumer.C05651 */

                @Override // com.facebook.imagepipeline.producers.JobScheduler.JobRunnable
                public void run(EncodedImage encodedImage, int i) {
                    TransformingConsumer.this.doTransform(encodedImage, i);
                }
            }, 100);
            this.mProducerContext.addCallbacks(new BaseProducerContextCallbacks(ResizeAndRotateProducer.this) {
                /* class com.facebook.imagepipeline.producers.ResizeAndRotateProducer.TransformingConsumer.C05662 */

                @Override // com.facebook.imagepipeline.producers.BaseProducerContextCallbacks, com.facebook.imagepipeline.producers.ProducerContextCallbacks
                public void onCancellationRequested() {
                    TransformingConsumer.this.mJobScheduler.clearJob();
                    TransformingConsumer.this.mIsCancelled = true;
                    consumer.onCancellation();
                }

                @Override // com.facebook.imagepipeline.producers.BaseProducerContextCallbacks, com.facebook.imagepipeline.producers.ProducerContextCallbacks
                public void onIsIntermediateResultExpectedChanged() {
                    if (TransformingConsumer.this.mProducerContext.isIntermediateResultExpected()) {
                        TransformingConsumer.this.mJobScheduler.scheduleJob();
                    }
                }
            });
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        /* JADX WARNING: Removed duplicated region for block: B:48:0x00fe A[Catch:{ all -> 0x010c }] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private void doTransform(com.facebook.imagepipeline.image.EncodedImage r18, int r19) {
            /*
            // Method dump skipped, instructions count: 277
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.imagepipeline.producers.ResizeAndRotateProducer.TransformingConsumer.doTransform(com.facebook.imagepipeline.image.EncodedImage, int):void");
        }

        private Map<String, String> getExtraMap(EncodedImage encodedImage, ImageRequest imageRequest, int i, int i2, int i3, int i4) {
            String str;
            String str2;
            if (!this.mProducerContext.getListener().requiresExtraMap(this.mProducerContext.getId())) {
                return null;
            }
            String str3 = encodedImage.getWidth() + FontMetricsUtil.X_HEIGHT_MEASUREMENT_TEXT + encodedImage.getHeight();
            if (imageRequest.getResizeOptions() != null) {
                str = imageRequest.getResizeOptions().width + FontMetricsUtil.X_HEIGHT_MEASUREMENT_TEXT + imageRequest.getResizeOptions().height;
            } else {
                str = "Unspecified";
            }
            if (i > 0) {
                str2 = i + "/8";
            } else {
                str2 = "";
            }
            HashMap hashMap = new HashMap();
            hashMap.put(ResizeAndRotateProducer.ORIGINAL_SIZE_KEY, str3);
            hashMap.put(ResizeAndRotateProducer.REQUESTED_SIZE_KEY, str);
            hashMap.put(ResizeAndRotateProducer.FRACTION_KEY, str2);
            hashMap.put(JobScheduler.QUEUE_TIME_KEY, String.valueOf(this.mJobScheduler.getQueuedTime()));
            hashMap.put(ResizeAndRotateProducer.DOWNSAMPLE_ENUMERATOR_KEY, Integer.toString(i2));
            hashMap.put(ResizeAndRotateProducer.SOFTWARE_ENUMERATOR_KEY, Integer.toString(i3));
            hashMap.put(ResizeAndRotateProducer.ROTATION_ANGLE_KEY, Integer.toString(i4));
            return ImmutableMap.copyOf(hashMap);
        }

        private EncodedImage moveImage(EncodedImage encodedImage) {
            EncodedImage cloneOrNull = EncodedImage.cloneOrNull(encodedImage);
            encodedImage.close();
            return cloneOrNull;
        }

        public void onNewResultImpl(@Nullable EncodedImage encodedImage, int i) {
            if (!this.mIsCancelled) {
                boolean isLast = BaseConsumer.isLast(i);
                if (encodedImage != null) {
                    TriState shouldTransform = ResizeAndRotateProducer.shouldTransform(this.mProducerContext.getImageRequest(), encodedImage, ResizeAndRotateProducer.this.mResizingEnabled);
                    if (!isLast && shouldTransform == TriState.UNSET) {
                        return;
                    }
                    if (shouldTransform != TriState.YES) {
                        if (!(this.mProducerContext.getImageRequest().getRotationOptions().canDeferUntilRendered() || encodedImage.getRotationAngle() == 0 || encodedImage.getRotationAngle() == -1)) {
                            encodedImage = moveImage(encodedImage);
                            encodedImage.setRotationAngle(0);
                        }
                        getConsumer().onNewResult(encodedImage, i);
                    } else if (this.mJobScheduler.updateJob(encodedImage, i)) {
                        if (isLast || this.mProducerContext.isIntermediateResultExpected()) {
                            this.mJobScheduler.scheduleJob();
                        }
                    }
                } else if (isLast) {
                    getConsumer().onNewResult(null, 1);
                }
            }
        }
    }

    public ResizeAndRotateProducer(Executor executor, PooledByteBufferFactory pooledByteBufferFactory, boolean z, Producer<EncodedImage> producer, boolean z2) {
        this.mExecutor = (Executor) Preconditions.checkNotNull(executor);
        this.mPooledByteBufferFactory = (PooledByteBufferFactory) Preconditions.checkNotNull(pooledByteBufferFactory);
        this.mResizingEnabled = z;
        this.mInputProducer = (Producer) Preconditions.checkNotNull(producer);
        this.mUseDownsamplingRatio = z2;
    }

    @VisibleForTesting
    public static int calculateDownsampleNumerator(int i) {
        return Math.max(1, 8 / i);
    }

    @VisibleForTesting
    public static float determineResizeRatio(ResizeOptions resizeOptions, int i, int i2) {
        if (resizeOptions == null) {
            return 1.0f;
        }
        float f = (float) i;
        float f2 = (float) i2;
        float max = Math.max(((float) resizeOptions.width) / f, ((float) resizeOptions.height) / f2);
        float f3 = resizeOptions.maxBitmapSize;
        if (f * max > f3) {
            max = f3 / f;
        }
        float f4 = resizeOptions.maxBitmapSize;
        return f2 * max > f4 ? f4 / f2 : max;
    }

    public static int extractOrientationFromMetadata(EncodedImage encodedImage) {
        int rotationAngle = encodedImage.getRotationAngle();
        if (rotationAngle == 90 || rotationAngle == 180 || rotationAngle == 270) {
            return encodedImage.getRotationAngle();
        }
        return 0;
    }

    public static int getForceRotatedInvertedExifOrientation(RotationOptions rotationOptions, EncodedImage encodedImage) {
        int indexOf = INVERTED_EXIF_ORIENTATIONS.indexOf(Integer.valueOf(encodedImage.getExifOrientation()));
        if (indexOf >= 0) {
            int i = 0;
            if (!rotationOptions.useImageMetadata()) {
                i = rotationOptions.getForcedAngle();
            }
            ImmutableList<Integer> immutableList = INVERTED_EXIF_ORIENTATIONS;
            return immutableList.get((indexOf + (i / 90)) % immutableList.size()).intValue();
        }
        throw new IllegalArgumentException("Only accepts inverted exif orientations");
    }

    public static int getRotationAngle(RotationOptions rotationOptions, EncodedImage encodedImage) {
        if (!rotationOptions.rotationEnabled()) {
            return 0;
        }
        int extractOrientationFromMetadata = extractOrientationFromMetadata(encodedImage);
        if (rotationOptions.useImageMetadata()) {
            return extractOrientationFromMetadata;
        }
        return (extractOrientationFromMetadata + rotationOptions.getForcedAngle()) % 360;
    }

    public static int getSoftwareNumerator(ImageRequest imageRequest, EncodedImage encodedImage, boolean z) {
        ResizeOptions resizeOptions;
        int i;
        int i2;
        if (!z || (resizeOptions = imageRequest.getResizeOptions()) == null) {
            return 8;
        }
        int rotationAngle = getRotationAngle(imageRequest.getRotationOptions(), encodedImage);
        boolean z2 = false;
        int forceRotatedInvertedExifOrientation = INVERTED_EXIF_ORIENTATIONS.contains(Integer.valueOf(encodedImage.getExifOrientation())) ? getForceRotatedInvertedExifOrientation(imageRequest.getRotationOptions(), encodedImage) : 0;
        if (rotationAngle == 90 || rotationAngle == 270 || forceRotatedInvertedExifOrientation == 5 || forceRotatedInvertedExifOrientation == 7) {
            z2 = true;
        }
        if (z2) {
            i = encodedImage.getHeight();
        } else {
            i = encodedImage.getWidth();
        }
        if (z2) {
            i2 = encodedImage.getWidth();
        } else {
            i2 = encodedImage.getHeight();
        }
        int roundNumerator = roundNumerator(determineResizeRatio(resizeOptions, i, i2), resizeOptions.roundUpFraction);
        if (roundNumerator > 8) {
            return 8;
        }
        if (roundNumerator < 1) {
            return 1;
        }
        return roundNumerator;
    }

    @VisibleForTesting
    public static int roundNumerator(float f, float f2) {
        return (int) (f2 + (f * 8.0f));
    }

    public static boolean shouldResize(int i) {
        return i < 8;
    }

    public static boolean shouldRotate(RotationOptions rotationOptions, EncodedImage encodedImage) {
        return !rotationOptions.canDeferUntilRendered() && (getRotationAngle(rotationOptions, encodedImage) != 0 || shouldRotateUsingExifOrientation(rotationOptions, encodedImage));
    }

    public static boolean shouldRotateUsingExifOrientation(RotationOptions rotationOptions, EncodedImage encodedImage) {
        if (rotationOptions.rotationEnabled() && !rotationOptions.canDeferUntilRendered()) {
            return INVERTED_EXIF_ORIENTATIONS.contains(Integer.valueOf(encodedImage.getExifOrientation()));
        }
        encodedImage.setExifOrientation(0);
        return false;
    }

    public static TriState shouldTransform(ImageRequest imageRequest, EncodedImage encodedImage, boolean z) {
        if (encodedImage == null || encodedImage.getImageFormat() == ImageFormat.UNKNOWN) {
            return TriState.UNSET;
        }
        if (encodedImage.getImageFormat() != DefaultImageFormats.JPEG) {
            return TriState.NO;
        }
        return TriState.valueOf(shouldRotate(imageRequest.getRotationOptions(), encodedImage) || shouldResize(getSoftwareNumerator(imageRequest, encodedImage, z)));
    }

    @Override // com.facebook.imagepipeline.producers.Producer
    public void produceResults(Consumer<EncodedImage> consumer, ProducerContext producerContext) {
        this.mInputProducer.produceResults(new TransformingConsumer(consumer, producerContext), producerContext);
    }
}

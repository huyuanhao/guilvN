package com.facebook.imagepipeline.producers;

import com.facebook.common.internal.Preconditions;
import com.facebook.imagepipeline.common.ResizeOptions;
import com.facebook.imagepipeline.image.EncodedImage;

public class ThumbnailBranchProducer implements Producer<EncodedImage> {
    public final ThumbnailProducer<EncodedImage>[] mThumbnailProducers;

    public class ThumbnailConsumer extends DelegatingConsumer<EncodedImage, EncodedImage> {
        public final ProducerContext mProducerContext;
        public final int mProducerIndex;
        public final ResizeOptions mResizeOptions;

        public ThumbnailConsumer(Consumer<EncodedImage> consumer, ProducerContext producerContext, int i) {
            super(consumer);
            this.mProducerContext = producerContext;
            this.mProducerIndex = i;
            this.mResizeOptions = producerContext.getImageRequest().getResizeOptions();
        }

        @Override // com.facebook.imagepipeline.producers.BaseConsumer, com.facebook.imagepipeline.producers.DelegatingConsumer
        public void onFailureImpl(Throwable th) {
            if (!ThumbnailBranchProducer.this.produceResultsFromThumbnailProducer(this.mProducerIndex + 1, getConsumer(), this.mProducerContext)) {
                getConsumer().onFailure(th);
            }
        }

        public void onNewResultImpl(EncodedImage encodedImage, int i) {
            if (encodedImage != null && (BaseConsumer.isNotLast(i) || ThumbnailSizeChecker.isImageBigEnough(encodedImage, this.mResizeOptions))) {
                getConsumer().onNewResult(encodedImage, i);
            } else if (BaseConsumer.isLast(i)) {
                EncodedImage.closeSafely(encodedImage);
                if (!ThumbnailBranchProducer.this.produceResultsFromThumbnailProducer(this.mProducerIndex + 1, getConsumer(), this.mProducerContext)) {
                    getConsumer().onNewResult(null, 1);
                }
            }
        }
    }

    public ThumbnailBranchProducer(ThumbnailProducer<EncodedImage>... thumbnailProducerArr) {
        ThumbnailProducer<EncodedImage>[] thumbnailProducerArr2 = (ThumbnailProducer[]) Preconditions.checkNotNull(thumbnailProducerArr);
        this.mThumbnailProducers = thumbnailProducerArr2;
        Preconditions.checkElementIndex(0, thumbnailProducerArr2.length);
    }

    private int findFirstProducerForSize(int i, ResizeOptions resizeOptions) {
        while (true) {
            ThumbnailProducer<EncodedImage>[] thumbnailProducerArr = this.mThumbnailProducers;
            if (i >= thumbnailProducerArr.length) {
                return -1;
            }
            if (thumbnailProducerArr[i].canProvideImageForSize(resizeOptions)) {
                return i;
            }
            i++;
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private boolean produceResultsFromThumbnailProducer(int i, Consumer<EncodedImage> consumer, ProducerContext producerContext) {
        int findFirstProducerForSize = findFirstProducerForSize(i, producerContext.getImageRequest().getResizeOptions());
        if (findFirstProducerForSize == -1) {
            return false;
        }
        this.mThumbnailProducers[findFirstProducerForSize].produceResults(new ThumbnailConsumer(consumer, producerContext, findFirstProducerForSize), producerContext);
        return true;
    }

    @Override // com.facebook.imagepipeline.producers.Producer
    public void produceResults(Consumer<EncodedImage> consumer, ProducerContext producerContext) {
        if (producerContext.getImageRequest().getResizeOptions() == null) {
            consumer.onNewResult(null, 1);
        } else if (!produceResultsFromThumbnailProducer(0, consumer, producerContext)) {
            consumer.onNewResult(null, 1);
        }
    }
}

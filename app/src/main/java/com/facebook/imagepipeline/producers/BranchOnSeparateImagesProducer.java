package com.facebook.imagepipeline.producers;

import com.facebook.imagepipeline.image.EncodedImage;
import com.facebook.imagepipeline.request.ImageRequest;

public class BranchOnSeparateImagesProducer implements Producer<EncodedImage> {
    public final Producer<EncodedImage> mInputProducer1;
    public final Producer<EncodedImage> mInputProducer2;

    public class OnFirstImageConsumer extends DelegatingConsumer<EncodedImage, EncodedImage> {
        public ProducerContext mProducerContext;

        @Override // com.facebook.imagepipeline.producers.BaseConsumer, com.facebook.imagepipeline.producers.DelegatingConsumer
        public void onFailureImpl(Throwable th) {
            BranchOnSeparateImagesProducer.this.mInputProducer2.produceResults(getConsumer(), this.mProducerContext);
        }

        public OnFirstImageConsumer(Consumer<EncodedImage> consumer, ProducerContext producerContext) {
            super(consumer);
            this.mProducerContext = producerContext;
        }

        public void onNewResultImpl(EncodedImage encodedImage, int i) {
            ImageRequest imageRequest = this.mProducerContext.getImageRequest();
            boolean isLast = BaseConsumer.isLast(i);
            boolean isImageBigEnough = ThumbnailSizeChecker.isImageBigEnough(encodedImage, imageRequest.getResizeOptions());
            if (encodedImage != null && (isImageBigEnough || imageRequest.getLocalThumbnailPreviewsEnabled())) {
                if (!isLast || !isImageBigEnough) {
                    getConsumer().onNewResult(encodedImage, BaseConsumer.turnOffStatusFlag(i, 1));
                } else {
                    getConsumer().onNewResult(encodedImage, i);
                }
            }
            if (isLast && !isImageBigEnough) {
                EncodedImage.closeSafely(encodedImage);
                BranchOnSeparateImagesProducer.this.mInputProducer2.produceResults(getConsumer(), this.mProducerContext);
            }
        }
    }

    public BranchOnSeparateImagesProducer(Producer<EncodedImage> producer, Producer<EncodedImage> producer2) {
        this.mInputProducer1 = producer;
        this.mInputProducer2 = producer2;
    }

    @Override // com.facebook.imagepipeline.producers.Producer
    public void produceResults(Consumer<EncodedImage> consumer, ProducerContext producerContext) {
        this.mInputProducer1.produceResults(new OnFirstImageConsumer(consumer, producerContext), producerContext);
    }
}

package com.facebook.imagepipeline.producers;

import com.facebook.imagepipeline.image.EncodedImage;

public class AddImageTransformMetaDataProducer implements Producer<EncodedImage> {
    public final Producer<EncodedImage> mInputProducer;

    public static class AddImageTransformMetaDataConsumer extends DelegatingConsumer<EncodedImage, EncodedImage> {
        public AddImageTransformMetaDataConsumer(Consumer<EncodedImage> consumer) {
            super(consumer);
        }

        public void onNewResultImpl(EncodedImage encodedImage, int i) {
            if (encodedImage == null) {
                getConsumer().onNewResult(null, i);
                return;
            }
            if (!EncodedImage.isMetaDataAvailable(encodedImage)) {
                encodedImage.parseMetaData();
            }
            getConsumer().onNewResult(encodedImage, i);
        }
    }

    public AddImageTransformMetaDataProducer(Producer<EncodedImage> producer) {
        this.mInputProducer = producer;
    }

    @Override // com.facebook.imagepipeline.producers.Producer
    public void produceResults(Consumer<EncodedImage> consumer, ProducerContext producerContext) {
        this.mInputProducer.produceResults(new AddImageTransformMetaDataConsumer(consumer), producerContext);
    }
}

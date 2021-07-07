package com.facebook.imagepipeline.producers;

import com.facebook.common.memory.PooledByteBuffer;
import com.facebook.common.references.CloseableReference;
import com.facebook.imagepipeline.image.EncodedImage;

public class RemoveImageTransformMetaDataProducer implements Producer<CloseableReference<PooledByteBuffer>> {
    public final Producer<EncodedImage> mInputProducer;

    public class RemoveImageTransformMetaDataConsumer extends DelegatingConsumer<EncodedImage, CloseableReference<PooledByteBuffer>> {
        public RemoveImageTransformMetaDataConsumer(Consumer<CloseableReference<PooledByteBuffer>> consumer) {
            super(consumer);
        }

        public void onNewResultImpl(EncodedImage encodedImage, int i) {
            CloseableReference<PooledByteBuffer> closeableReference = null;
            try {
                if (EncodedImage.isValid(encodedImage)) {
                    closeableReference = encodedImage.getByteBufferRef();
                }
                getConsumer().onNewResult(closeableReference, i);
            } finally {
                CloseableReference.closeSafely(closeableReference);
            }
        }
    }

    public RemoveImageTransformMetaDataProducer(Producer<EncodedImage> producer) {
        this.mInputProducer = producer;
    }

    @Override // com.facebook.imagepipeline.producers.Producer
    public void produceResults(Consumer<CloseableReference<PooledByteBuffer>> consumer, ProducerContext producerContext) {
        this.mInputProducer.produceResults(new RemoveImageTransformMetaDataConsumer(consumer), producerContext);
    }
}

package com.facebook.imagepipeline.producers;

import android.graphics.Bitmap;
import com.facebook.common.internal.Preconditions;
import com.facebook.common.references.CloseableReference;
import com.facebook.imagepipeline.image.CloseableImage;
import com.facebook.imagepipeline.image.CloseableStaticBitmap;

public class BitmapPrepareProducer implements Producer<CloseableReference<CloseableImage>> {
    public static final String PRODUCER_NAME = "BitmapPrepareProducer";
    public final Producer<CloseableReference<CloseableImage>> mInputProducer;
    public final int mMaxBitmapSizeBytes;
    public final int mMinBitmapSizeBytes;
    public final boolean mPreparePrefetch;

    public static class BitmapPrepareConsumer extends DelegatingConsumer<CloseableReference<CloseableImage>, CloseableReference<CloseableImage>> {
        public final int mMaxBitmapSizeBytes;
        public final int mMinBitmapSizeBytes;

        public BitmapPrepareConsumer(Consumer<CloseableReference<CloseableImage>> consumer, int i, int i2) {
            super(consumer);
            this.mMinBitmapSizeBytes = i;
            this.mMaxBitmapSizeBytes = i2;
        }

        private void internalPrepareBitmap(CloseableReference<CloseableImage> closeableReference) {
            CloseableImage closeableImage;
            Bitmap underlyingBitmap;
            int rowBytes;
            if (closeableReference != null && closeableReference.isValid() && (closeableImage = closeableReference.get()) != null && !closeableImage.isClosed() && (closeableImage instanceof CloseableStaticBitmap) && (underlyingBitmap = ((CloseableStaticBitmap) closeableImage).getUnderlyingBitmap()) != null && (rowBytes = underlyingBitmap.getRowBytes() * underlyingBitmap.getHeight()) >= this.mMinBitmapSizeBytes && rowBytes <= this.mMaxBitmapSizeBytes) {
                underlyingBitmap.prepareToDraw();
            }
        }

        public void onNewResultImpl(CloseableReference<CloseableImage> closeableReference, int i) {
            internalPrepareBitmap(closeableReference);
            getConsumer().onNewResult(closeableReference, i);
        }
    }

    public BitmapPrepareProducer(Producer<CloseableReference<CloseableImage>> producer, int i, int i2, boolean z) {
        Preconditions.checkArgument(i <= i2);
        this.mInputProducer = (Producer) Preconditions.checkNotNull(producer);
        this.mMinBitmapSizeBytes = i;
        this.mMaxBitmapSizeBytes = i2;
        this.mPreparePrefetch = z;
    }

    @Override // com.facebook.imagepipeline.producers.Producer
    public void produceResults(Consumer<CloseableReference<CloseableImage>> consumer, ProducerContext producerContext) {
        if (!producerContext.isPrefetch() || this.mPreparePrefetch) {
            this.mInputProducer.produceResults(new BitmapPrepareConsumer(consumer, this.mMinBitmapSizeBytes, this.mMaxBitmapSizeBytes), producerContext);
        } else {
            this.mInputProducer.produceResults(consumer, producerContext);
        }
    }
}

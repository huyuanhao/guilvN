package com.facebook.imagepipeline.producers;

import com.facebook.cache.common.CacheKey;
import com.facebook.common.internal.VisibleForTesting;
import com.facebook.imageformat.ImageFormat;
import com.facebook.imagepipeline.cache.BufferedDiskCache;
import com.facebook.imagepipeline.cache.CacheKeyFactory;
import com.facebook.imagepipeline.image.EncodedImage;
import com.facebook.imagepipeline.request.ImageRequest;

public class DiskCacheWriteProducer implements Producer<EncodedImage> {
    @VisibleForTesting
    public static final String PRODUCER_NAME = "DiskCacheProducer";
    public final CacheKeyFactory mCacheKeyFactory;
    public final BufferedDiskCache mDefaultBufferedDiskCache;
    public final Producer<EncodedImage> mInputProducer;
    public final BufferedDiskCache mSmallImageBufferedDiskCache;

    public static class DiskCacheWriteConsumer extends DelegatingConsumer<EncodedImage, EncodedImage> {
        public final CacheKeyFactory mCacheKeyFactory;
        public final BufferedDiskCache mDefaultBufferedDiskCache;
        public final ProducerContext mProducerContext;
        public final BufferedDiskCache mSmallImageBufferedDiskCache;

        public DiskCacheWriteConsumer(Consumer<EncodedImage> consumer, ProducerContext producerContext, BufferedDiskCache bufferedDiskCache, BufferedDiskCache bufferedDiskCache2, CacheKeyFactory cacheKeyFactory) {
            super(consumer);
            this.mProducerContext = producerContext;
            this.mDefaultBufferedDiskCache = bufferedDiskCache;
            this.mSmallImageBufferedDiskCache = bufferedDiskCache2;
            this.mCacheKeyFactory = cacheKeyFactory;
        }

        public void onNewResultImpl(EncodedImage encodedImage, int i) {
            if (BaseConsumer.isNotLast(i) || encodedImage == null || BaseConsumer.statusHasAnyFlag(i, 10) || encodedImage.getImageFormat() == ImageFormat.UNKNOWN) {
                getConsumer().onNewResult(encodedImage, i);
                return;
            }
            ImageRequest imageRequest = this.mProducerContext.getImageRequest();
            CacheKey encodedCacheKey = this.mCacheKeyFactory.getEncodedCacheKey(imageRequest, this.mProducerContext.getCallerContext());
            if (imageRequest.getCacheChoice() == ImageRequest.CacheChoice.SMALL) {
                this.mSmallImageBufferedDiskCache.put(encodedCacheKey, encodedImage);
            } else {
                this.mDefaultBufferedDiskCache.put(encodedCacheKey, encodedImage);
            }
            getConsumer().onNewResult(encodedImage, i);
        }
    }

    public DiskCacheWriteProducer(BufferedDiskCache bufferedDiskCache, BufferedDiskCache bufferedDiskCache2, CacheKeyFactory cacheKeyFactory, Producer<EncodedImage> producer) {
        this.mDefaultBufferedDiskCache = bufferedDiskCache;
        this.mSmallImageBufferedDiskCache = bufferedDiskCache2;
        this.mCacheKeyFactory = cacheKeyFactory;
        this.mInputProducer = producer;
    }

    private void maybeStartInputProducer(Consumer<EncodedImage> consumer, ProducerContext producerContext) {
        if (producerContext.getLowestPermittedRequestLevel().getValue() >= ImageRequest.RequestLevel.DISK_CACHE.getValue()) {
            consumer.onNewResult(null, 1);
            return;
        }
        if (producerContext.getImageRequest().isDiskCacheEnabled()) {
            consumer = new DiskCacheWriteConsumer(consumer, producerContext, this.mDefaultBufferedDiskCache, this.mSmallImageBufferedDiskCache, this.mCacheKeyFactory);
        }
        this.mInputProducer.produceResults(consumer, producerContext);
    }

    @Override // com.facebook.imagepipeline.producers.Producer
    public void produceResults(Consumer<EncodedImage> consumer, ProducerContext producerContext) {
        maybeStartInputProducer(consumer, producerContext);
    }
}

package com.facebook.imagepipeline.producers;

import com.facebook.cache.common.CacheKey;
import com.facebook.common.internal.ImmutableMap;
import com.facebook.common.memory.PooledByteBuffer;
import com.facebook.common.references.CloseableReference;
import com.facebook.imagepipeline.cache.CacheKeyFactory;
import com.facebook.imagepipeline.cache.MemoryCache;
import com.facebook.imagepipeline.image.EncodedImage;
import com.facebook.imagepipeline.request.ImageRequest;
import java.util.Map;

public class EncodedMemoryCacheProducer implements Producer<EncodedImage> {
    public static final String EXTRA_CACHED_VALUE_FOUND = "cached_value_found";
    public static final String PRODUCER_NAME = "EncodedMemoryCacheProducer";
    public final CacheKeyFactory mCacheKeyFactory;
    public final Producer<EncodedImage> mInputProducer;
    public final MemoryCache<CacheKey, PooledByteBuffer> mMemoryCache;

    public static class EncodedMemoryCacheConsumer extends DelegatingConsumer<EncodedImage, EncodedImage> {
        public final boolean mIsMemoryCacheEnabled;
        public final MemoryCache<CacheKey, PooledByteBuffer> mMemoryCache;
        public final CacheKey mRequestedCacheKey;

        public EncodedMemoryCacheConsumer(Consumer<EncodedImage> consumer, MemoryCache<CacheKey, PooledByteBuffer> memoryCache, CacheKey cacheKey, boolean z) {
            super(consumer);
            this.mMemoryCache = memoryCache;
            this.mRequestedCacheKey = cacheKey;
            this.mIsMemoryCacheEnabled = z;
        }

        public void onNewResultImpl(EncodedImage encodedImage, int i) {
            if (BaseConsumer.isNotLast(i) || encodedImage == null || BaseConsumer.statusHasAnyFlag(i, 10)) {
                getConsumer().onNewResult(encodedImage, i);
                return;
            }
            CloseableReference<PooledByteBuffer> byteBufferRef = encodedImage.getByteBufferRef();
            if (byteBufferRef != null) {
                CloseableReference<PooledByteBuffer> closeableReference = null;
                try {
                    if (this.mIsMemoryCacheEnabled) {
                        closeableReference = this.mMemoryCache.cache(this.mRequestedCacheKey, byteBufferRef);
                    }
                    if (closeableReference != null) {
                        try {
                            EncodedImage encodedImage2 = new EncodedImage(closeableReference);
                            encodedImage2.copyMetaDataFrom(encodedImage);
                            try {
                                getConsumer().onProgressUpdate(1.0f);
                                getConsumer().onNewResult(encodedImage2, i);
                                return;
                            } finally {
                                EncodedImage.closeSafely(encodedImage2);
                            }
                        } finally {
                            CloseableReference.closeSafely(closeableReference);
                        }
                    }
                } finally {
                    CloseableReference.closeSafely(byteBufferRef);
                }
            }
            getConsumer().onNewResult(encodedImage, i);
        }
    }

    public EncodedMemoryCacheProducer(MemoryCache<CacheKey, PooledByteBuffer> memoryCache, CacheKeyFactory cacheKeyFactory, Producer<EncodedImage> producer) {
        this.mMemoryCache = memoryCache;
        this.mCacheKeyFactory = cacheKeyFactory;
        this.mInputProducer = producer;
    }

    /* JADX INFO: finally extract failed */
    @Override // com.facebook.imagepipeline.producers.Producer
    public void produceResults(Consumer<EncodedImage> consumer, ProducerContext producerContext) {
        String id = producerContext.getId();
        ProducerListener listener = producerContext.getListener();
        listener.onProducerStart(id, PRODUCER_NAME);
        CacheKey encodedCacheKey = this.mCacheKeyFactory.getEncodedCacheKey(producerContext.getImageRequest(), producerContext.getCallerContext());
        CloseableReference<PooledByteBuffer> closeableReference = this.mMemoryCache.get(encodedCacheKey);
        Map<String, String> map = null;
        if (closeableReference != null) {
            try {
                EncodedImage encodedImage = new EncodedImage(closeableReference);
                try {
                    if (listener.requiresExtraMap(id)) {
                        map = ImmutableMap.m845of("cached_value_found", "true");
                    }
                    listener.onProducerFinishWithSuccess(id, PRODUCER_NAME, map);
                    listener.onUltimateProducerReached(id, PRODUCER_NAME, true);
                    consumer.onProgressUpdate(1.0f);
                    consumer.onNewResult(encodedImage, 1);
                    EncodedImage.closeSafely(encodedImage);
                } catch (Throwable th) {
                    EncodedImage.closeSafely(encodedImage);
                    throw th;
                }
            } finally {
                CloseableReference.closeSafely(closeableReference);
            }
        } else if (producerContext.getLowestPermittedRequestLevel().getValue() >= ImageRequest.RequestLevel.ENCODED_MEMORY_CACHE.getValue()) {
            listener.onProducerFinishWithSuccess(id, PRODUCER_NAME, listener.requiresExtraMap(id) ? ImmutableMap.m845of("cached_value_found", "false") : null);
            listener.onUltimateProducerReached(id, PRODUCER_NAME, false);
            consumer.onNewResult(null, 1);
            CloseableReference.closeSafely(closeableReference);
        } else {
            EncodedMemoryCacheConsumer encodedMemoryCacheConsumer = new EncodedMemoryCacheConsumer(consumer, this.mMemoryCache, encodedCacheKey, producerContext.getImageRequest().isMemoryCacheEnabled());
            if (listener.requiresExtraMap(id)) {
                map = ImmutableMap.m845of("cached_value_found", "false");
            }
            listener.onProducerFinishWithSuccess(id, PRODUCER_NAME, map);
            this.mInputProducer.produceResults(encodedMemoryCacheConsumer, producerContext);
            CloseableReference.closeSafely(closeableReference);
        }
    }
}

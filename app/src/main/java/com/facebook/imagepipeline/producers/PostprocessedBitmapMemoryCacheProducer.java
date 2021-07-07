package com.facebook.imagepipeline.producers;

import com.facebook.cache.common.CacheKey;
import com.facebook.common.internal.ImmutableMap;
import com.facebook.common.internal.VisibleForTesting;
import com.facebook.common.references.CloseableReference;
import com.facebook.imagepipeline.cache.CacheKeyFactory;
import com.facebook.imagepipeline.cache.MemoryCache;
import com.facebook.imagepipeline.image.CloseableImage;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.imagepipeline.request.Postprocessor;
import com.facebook.imagepipeline.request.RepeatedPostprocessor;
import java.util.Map;

public class PostprocessedBitmapMemoryCacheProducer implements Producer<CloseableReference<CloseableImage>> {
    public static final String PRODUCER_NAME = "PostprocessedBitmapMemoryCacheProducer";
    @VisibleForTesting
    public static final String VALUE_FOUND = "cached_value_found";
    public final CacheKeyFactory mCacheKeyFactory;
    public final Producer<CloseableReference<CloseableImage>> mInputProducer;
    public final MemoryCache<CacheKey, CloseableImage> mMemoryCache;

    public static class CachedPostprocessorConsumer extends DelegatingConsumer<CloseableReference<CloseableImage>, CloseableReference<CloseableImage>> {
        public final CacheKey mCacheKey;
        public final boolean mIsMemoryCachedEnabled;
        public final boolean mIsRepeatedProcessor;
        public final MemoryCache<CacheKey, CloseableImage> mMemoryCache;

        public CachedPostprocessorConsumer(Consumer<CloseableReference<CloseableImage>> consumer, CacheKey cacheKey, boolean z, MemoryCache<CacheKey, CloseableImage> memoryCache, boolean z2) {
            super(consumer);
            this.mCacheKey = cacheKey;
            this.mIsRepeatedProcessor = z;
            this.mMemoryCache = memoryCache;
            this.mIsMemoryCachedEnabled = z2;
        }

        public void onNewResultImpl(CloseableReference<CloseableImage> closeableReference, int i) {
            CloseableReference<CloseableImage> closeableReference2 = null;
            if (closeableReference == null) {
                if (BaseConsumer.isLast(i)) {
                    getConsumer().onNewResult(closeableReference2, i);
                }
            } else if (!BaseConsumer.isNotLast(i) || this.mIsRepeatedProcessor) {
                if (this.mIsMemoryCachedEnabled) {
                    closeableReference2 = this.mMemoryCache.cache(this.mCacheKey, closeableReference);
                }
                try {
                    getConsumer().onProgressUpdate(1.0f);
                    Consumer consumer = getConsumer();
                    if (closeableReference2 != null) {
                        closeableReference = closeableReference2;
                    }
                    consumer.onNewResult(closeableReference, i);
                } finally {
                    CloseableReference.closeSafely(closeableReference2);
                }
            }
        }
    }

    public PostprocessedBitmapMemoryCacheProducer(MemoryCache<CacheKey, CloseableImage> memoryCache, CacheKeyFactory cacheKeyFactory, Producer<CloseableReference<CloseableImage>> producer) {
        this.mMemoryCache = memoryCache;
        this.mCacheKeyFactory = cacheKeyFactory;
        this.mInputProducer = producer;
    }

    public String getProducerName() {
        return PRODUCER_NAME;
    }

    @Override // com.facebook.imagepipeline.producers.Producer
    public void produceResults(Consumer<CloseableReference<CloseableImage>> consumer, ProducerContext producerContext) {
        ProducerListener listener = producerContext.getListener();
        String id = producerContext.getId();
        ImageRequest imageRequest = producerContext.getImageRequest();
        Object callerContext = producerContext.getCallerContext();
        Postprocessor postprocessor = imageRequest.getPostprocessor();
        if (postprocessor == null || postprocessor.getPostprocessorCacheKey() == null) {
            this.mInputProducer.produceResults(consumer, producerContext);
            return;
        }
        listener.onProducerStart(id, getProducerName());
        CacheKey postprocessedBitmapCacheKey = this.mCacheKeyFactory.getPostprocessedBitmapCacheKey(imageRequest, callerContext);
        CloseableReference<CloseableImage> closeableReference = this.mMemoryCache.get(postprocessedBitmapCacheKey);
        Map<String, String> map = null;
        if (closeableReference != null) {
            String producerName = getProducerName();
            if (listener.requiresExtraMap(id)) {
                map = ImmutableMap.m845of("cached_value_found", "true");
            }
            listener.onProducerFinishWithSuccess(id, producerName, map);
            listener.onUltimateProducerReached(id, PRODUCER_NAME, true);
            consumer.onProgressUpdate(1.0f);
            consumer.onNewResult(closeableReference, 1);
            closeableReference.close();
            return;
        }
        CachedPostprocessorConsumer cachedPostprocessorConsumer = new CachedPostprocessorConsumer(consumer, postprocessedBitmapCacheKey, postprocessor instanceof RepeatedPostprocessor, this.mMemoryCache, producerContext.getImageRequest().isMemoryCacheEnabled());
        String producerName2 = getProducerName();
        if (listener.requiresExtraMap(id)) {
            map = ImmutableMap.m845of("cached_value_found", "false");
        }
        listener.onProducerFinishWithSuccess(id, producerName2, map);
        this.mInputProducer.produceResults(cachedPostprocessorConsumer, producerContext);
    }
}

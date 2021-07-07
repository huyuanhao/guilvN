package com.facebook.imagepipeline.producers;

import com.facebook.cache.common.CacheKey;
import com.facebook.common.internal.ImmutableMap;
import com.facebook.common.internal.VisibleForTesting;
import com.facebook.imagepipeline.cache.BufferedDiskCache;
import com.facebook.imagepipeline.cache.CacheKeyFactory;
import com.facebook.imagepipeline.image.EncodedImage;
import com.facebook.imagepipeline.request.ImageRequest;
import com.p118pd.sdk.AbstractC7390o0OOOO0;
import com.p118pd.sdk.C7391o0OOOO0o;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;

public class DiskCacheReadProducer implements Producer<EncodedImage> {
    public static final String ENCODED_IMAGE_SIZE = "encodedImageSize";
    public static final String EXTRA_CACHED_VALUE_FOUND = "cached_value_found";
    public static final String PRODUCER_NAME = "DiskCacheProducer";
    public final CacheKeyFactory mCacheKeyFactory;
    public final BufferedDiskCache mDefaultBufferedDiskCache;
    public final Producer<EncodedImage> mInputProducer;
    public final BufferedDiskCache mSmallImageBufferedDiskCache;

    public DiskCacheReadProducer(BufferedDiskCache bufferedDiskCache, BufferedDiskCache bufferedDiskCache2, CacheKeyFactory cacheKeyFactory, Producer<EncodedImage> producer) {
        this.mDefaultBufferedDiskCache = bufferedDiskCache;
        this.mSmallImageBufferedDiskCache = bufferedDiskCache2;
        this.mCacheKeyFactory = cacheKeyFactory;
        this.mInputProducer = producer;
    }

    @VisibleForTesting
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

    private void maybeStartInputProducer(Consumer<EncodedImage> consumer, ProducerContext producerContext) {
        if (producerContext.getLowestPermittedRequestLevel().getValue() >= ImageRequest.RequestLevel.DISK_CACHE.getValue()) {
            consumer.onNewResult(null, 1);
        } else {
            this.mInputProducer.produceResults(consumer, producerContext);
        }
    }

    private AbstractC7390o0OOOO0<EncodedImage, Void> onFinishDiskReads(final Consumer<EncodedImage> consumer, final ProducerContext producerContext) {
        final String id = producerContext.getId();
        final ProducerListener listener = producerContext.getListener();
        return new AbstractC7390o0OOOO0<EncodedImage, Void>() {
            /* class com.facebook.imagepipeline.producers.DiskCacheReadProducer.C05411 */

            @Override // com.p118pd.sdk.AbstractC7390o0OOOO0
            public Void then(C7391o0OOOO0o<EncodedImage> o0oooo0o) throws Exception {
                if (DiskCacheReadProducer.isTaskCancelled(o0oooo0o)) {
                    listener.onProducerFinishWithCancellation(id, "DiskCacheProducer", null);
                    consumer.onCancellation();
                } else if (o0oooo0o.m18938OooO0OO()) {
                    listener.onProducerFinishWithFailure(id, "DiskCacheProducer", o0oooo0o.m18930OooO00o(), null);
                    DiskCacheReadProducer.this.mInputProducer.produceResults(consumer, producerContext);
                } else {
                    EncodedImage OooO00o = o0oooo0o.m18931OooO00o();
                    if (OooO00o != null) {
                        ProducerListener producerListener = listener;
                        String str = id;
                        producerListener.onProducerFinishWithSuccess(str, "DiskCacheProducer", DiskCacheReadProducer.getExtraMap(producerListener, str, true, OooO00o.getSize()));
                        listener.onUltimateProducerReached(id, "DiskCacheProducer", true);
                        consumer.onProgressUpdate(1.0f);
                        consumer.onNewResult(OooO00o, 1);
                        OooO00o.close();
                    } else {
                        ProducerListener producerListener2 = listener;
                        String str2 = id;
                        producerListener2.onProducerFinishWithSuccess(str2, "DiskCacheProducer", DiskCacheReadProducer.getExtraMap(producerListener2, str2, false, 0));
                        DiskCacheReadProducer.this.mInputProducer.produceResults(consumer, producerContext);
                    }
                }
                return null;
            }
        };
    }

    private void subscribeTaskForRequestCancellation(final AtomicBoolean atomicBoolean, ProducerContext producerContext) {
        producerContext.addCallbacks(new BaseProducerContextCallbacks() {
            /* class com.facebook.imagepipeline.producers.DiskCacheReadProducer.C05422 */

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
            maybeStartInputProducer(consumer, producerContext);
            return;
        }
        producerContext.getListener().onProducerStart(producerContext.getId(), "DiskCacheProducer");
        CacheKey encodedCacheKey = this.mCacheKeyFactory.getEncodedCacheKey(imageRequest, producerContext.getCallerContext());
        BufferedDiskCache bufferedDiskCache = imageRequest.getCacheChoice() == ImageRequest.CacheChoice.SMALL ? this.mSmallImageBufferedDiskCache : this.mDefaultBufferedDiskCache;
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        bufferedDiskCache.get(encodedCacheKey, atomicBoolean).OooO00o((AbstractC7390o0OOOO0<EncodedImage, TContinuationResult>) onFinishDiskReads(consumer, producerContext));
        subscribeTaskForRequestCancellation(atomicBoolean, producerContext);
    }
}

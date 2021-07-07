package com.facebook.imagepipeline.producers;

import android.os.SystemClock;
import com.facebook.common.internal.VisibleForTesting;
import com.facebook.common.memory.ByteArrayPool;
import com.facebook.common.memory.PooledByteBufferFactory;
import com.facebook.common.memory.PooledByteBufferOutputStream;
import com.facebook.common.references.CloseableReference;
import com.facebook.imagepipeline.common.BytesRange;
import com.facebook.imagepipeline.image.EncodedImage;
import com.facebook.imagepipeline.producers.NetworkFetcher;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import javax.annotation.Nullable;

public class NetworkFetchProducer implements Producer<EncodedImage> {
    public static final String INTERMEDIATE_RESULT_PRODUCER_EVENT = "intermediate_result";
    public static final String PRODUCER_NAME = "NetworkFetchProducer";
    public static final int READ_SIZE = 16384;
    @VisibleForTesting
    public static final long TIME_BETWEEN_PARTIAL_RESULTS_MS = 100;
    public final ByteArrayPool mByteArrayPool;
    public final NetworkFetcher mNetworkFetcher;
    public final PooledByteBufferFactory mPooledByteBufferFactory;

    public NetworkFetchProducer(PooledByteBufferFactory pooledByteBufferFactory, ByteArrayPool byteArrayPool, NetworkFetcher networkFetcher) {
        this.mPooledByteBufferFactory = pooledByteBufferFactory;
        this.mByteArrayPool = byteArrayPool;
        this.mNetworkFetcher = networkFetcher;
    }

    public static float calculateProgress(int i, int i2) {
        if (i2 > 0) {
            return ((float) i) / ((float) i2);
        }
        double d = (double) (-i);
        Double.isNaN(d);
        return 1.0f - ((float) Math.exp(d / 50000.0d));
    }

    @Nullable
    private Map<String, String> getExtraMap(FetchState fetchState, int i) {
        if (!fetchState.getListener().requiresExtraMap(fetchState.getId())) {
            return null;
        }
        return this.mNetworkFetcher.getExtraMap(fetchState, i);
    }

    private void notifyConsumer(PooledByteBufferOutputStream pooledByteBufferOutputStream, int i, @Nullable BytesRange bytesRange, Consumer<EncodedImage> consumer) {
        Throwable th;
        CloseableReference of = CloseableReference.m937of(pooledByteBufferOutputStream.toByteBuffer());
        EncodedImage encodedImage = null;
        try {
            EncodedImage encodedImage2 = new EncodedImage(of);
            try {
                encodedImage2.setBytesRange(bytesRange);
                encodedImage2.parseMetaData();
                consumer.onNewResult(encodedImage2, i);
                EncodedImage.closeSafely(encodedImage2);
                CloseableReference.closeSafely(of);
            } catch (Throwable th2) {
                th = th2;
                encodedImage = encodedImage2;
                EncodedImage.closeSafely(encodedImage);
                CloseableReference.closeSafely(of);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            EncodedImage.closeSafely(encodedImage);
            CloseableReference.closeSafely(of);
            throw th;
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void onCancellation(FetchState fetchState) {
        fetchState.getListener().onProducerFinishWithCancellation(fetchState.getId(), PRODUCER_NAME, null);
        fetchState.getConsumer().onCancellation();
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void onFailure(FetchState fetchState, Throwable th) {
        fetchState.getListener().onProducerFinishWithFailure(fetchState.getId(), PRODUCER_NAME, th, null);
        fetchState.getListener().onUltimateProducerReached(fetchState.getId(), PRODUCER_NAME, false);
        fetchState.getConsumer().onFailure(th);
    }

    private boolean shouldPropagateIntermediateResults(FetchState fetchState) {
        if (!fetchState.getContext().isIntermediateResultExpected()) {
            return false;
        }
        return this.mNetworkFetcher.shouldPropagate(fetchState);
    }

    public void handleFinalResult(PooledByteBufferOutputStream pooledByteBufferOutputStream, FetchState fetchState) {
        Map<String, String> extraMap = getExtraMap(fetchState, pooledByteBufferOutputStream.size());
        ProducerListener listener = fetchState.getListener();
        listener.onProducerFinishWithSuccess(fetchState.getId(), PRODUCER_NAME, extraMap);
        listener.onUltimateProducerReached(fetchState.getId(), PRODUCER_NAME, true);
        notifyConsumer(pooledByteBufferOutputStream, fetchState.getOnNewResultStatusFlags() | 1, fetchState.getResponseBytesRange(), fetchState.getConsumer());
    }

    public void maybeHandleIntermediateResult(PooledByteBufferOutputStream pooledByteBufferOutputStream, FetchState fetchState) {
        long uptimeMillis = SystemClock.uptimeMillis();
        if (shouldPropagateIntermediateResults(fetchState) && uptimeMillis - fetchState.getLastIntermediateResultTimeMs() >= 100) {
            fetchState.setLastIntermediateResultTimeMs(uptimeMillis);
            fetchState.getListener().onProducerEvent(fetchState.getId(), PRODUCER_NAME, INTERMEDIATE_RESULT_PRODUCER_EVENT);
            notifyConsumer(pooledByteBufferOutputStream, fetchState.getOnNewResultStatusFlags(), fetchState.getResponseBytesRange(), fetchState.getConsumer());
        }
    }

    public void onResponse(FetchState fetchState, InputStream inputStream, int i) throws IOException {
        PooledByteBufferOutputStream pooledByteBufferOutputStream;
        if (i > 0) {
            pooledByteBufferOutputStream = this.mPooledByteBufferFactory.newOutputStream(i);
        } else {
            pooledByteBufferOutputStream = this.mPooledByteBufferFactory.newOutputStream();
        }
        byte[] bArr = (byte[]) this.mByteArrayPool.get(16384);
        while (true) {
            try {
                int read = inputStream.read(bArr);
                if (read < 0) {
                    this.mNetworkFetcher.onFetchCompletion(fetchState, pooledByteBufferOutputStream.size());
                    handleFinalResult(pooledByteBufferOutputStream, fetchState);
                    return;
                } else if (read > 0) {
                    pooledByteBufferOutputStream.write(bArr, 0, read);
                    maybeHandleIntermediateResult(pooledByteBufferOutputStream, fetchState);
                    fetchState.getConsumer().onProgressUpdate(calculateProgress(pooledByteBufferOutputStream.size(), i));
                }
            } finally {
                this.mByteArrayPool.release(bArr);
                pooledByteBufferOutputStream.close();
            }
        }
    }

    @Override // com.facebook.imagepipeline.producers.Producer
    public void produceResults(Consumer<EncodedImage> consumer, ProducerContext producerContext) {
        producerContext.getListener().onProducerStart(producerContext.getId(), PRODUCER_NAME);
        final FetchState createFetchState = this.mNetworkFetcher.createFetchState(consumer, producerContext);
        this.mNetworkFetcher.fetch(createFetchState, new NetworkFetcher.Callback() {
            /* class com.facebook.imagepipeline.producers.NetworkFetchProducer.C05571 */

            @Override // com.facebook.imagepipeline.producers.NetworkFetcher.Callback
            public void onCancellation() {
                NetworkFetchProducer.this.onCancellation(createFetchState);
            }

            @Override // com.facebook.imagepipeline.producers.NetworkFetcher.Callback
            public void onFailure(Throwable th) {
                NetworkFetchProducer.this.onFailure(createFetchState, th);
            }

            @Override // com.facebook.imagepipeline.producers.NetworkFetcher.Callback
            public void onResponse(InputStream inputStream, int i) throws IOException {
                NetworkFetchProducer.this.onResponse(createFetchState, inputStream, i);
            }
        });
    }
}

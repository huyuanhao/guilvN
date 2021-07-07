package com.facebook.imagepipeline.producers;

import android.util.Pair;
import com.facebook.common.internal.Preconditions;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import javax.annotation.concurrent.GuardedBy;

public class ThrottlingProducer<T> implements Producer<T> {
    public static final String PRODUCER_NAME = "ThrottlingProducer";
    public final Executor mExecutor;
    public final Producer<T> mInputProducer;
    public final int mMaxSimultaneousRequests;
    @GuardedBy("this")
    public int mNumCurrentRequests = 0;
    @GuardedBy("this")
    public final ConcurrentLinkedQueue<Pair<Consumer<T>, ProducerContext>> mPendingRequests = new ConcurrentLinkedQueue<>();

    public class ThrottlerConsumer extends DelegatingConsumer<T, T> {
        private void onRequestFinished() {
            final Pair pair;
            synchronized (ThrottlingProducer.this) {
                pair = (Pair) ThrottlingProducer.this.mPendingRequests.poll();
                if (pair == null) {
                    ThrottlingProducer.access$210(ThrottlingProducer.this);
                }
            }
            if (pair != null) {
                ThrottlingProducer.this.mExecutor.execute(new Runnable() {
                    /* class com.facebook.imagepipeline.producers.ThrottlingProducer.ThrottlerConsumer.RunnableC05711 */

                    public void run() {
                        ThrottlingProducer throttlingProducer = ThrottlingProducer.this;
                        Pair pair = pair;
                        throttlingProducer.produceResultsInternal((Consumer) pair.first, (ProducerContext) pair.second);
                    }
                });
            }
        }

        @Override // com.facebook.imagepipeline.producers.BaseConsumer, com.facebook.imagepipeline.producers.DelegatingConsumer
        public void onCancellationImpl() {
            getConsumer().onCancellation();
            onRequestFinished();
        }

        @Override // com.facebook.imagepipeline.producers.BaseConsumer, com.facebook.imagepipeline.producers.DelegatingConsumer
        public void onFailureImpl(Throwable th) {
            getConsumer().onFailure(th);
            onRequestFinished();
        }

        @Override // com.facebook.imagepipeline.producers.BaseConsumer
        public void onNewResultImpl(T t, int i) {
            getConsumer().onNewResult(t, i);
            if (BaseConsumer.isLast(i)) {
                onRequestFinished();
            }
        }

        public ThrottlerConsumer(Consumer<T> consumer) {
            super(consumer);
        }
    }

    public ThrottlingProducer(int i, Executor executor, Producer<T> producer) {
        this.mMaxSimultaneousRequests = i;
        this.mExecutor = (Executor) Preconditions.checkNotNull(executor);
        this.mInputProducer = (Producer) Preconditions.checkNotNull(producer);
    }

    public static /* synthetic */ int access$210(ThrottlingProducer throttlingProducer) {
        int i = throttlingProducer.mNumCurrentRequests;
        throttlingProducer.mNumCurrentRequests = i - 1;
        return i;
    }

    @Override // com.facebook.imagepipeline.producers.Producer
    public void produceResults(Consumer<T> consumer, ProducerContext producerContext) {
        boolean z;
        producerContext.getListener().onProducerStart(producerContext.getId(), PRODUCER_NAME);
        synchronized (this) {
            z = true;
            if (this.mNumCurrentRequests >= this.mMaxSimultaneousRequests) {
                this.mPendingRequests.add(Pair.create(consumer, producerContext));
            } else {
                this.mNumCurrentRequests++;
                z = false;
            }
        }
        if (!z) {
            produceResultsInternal(consumer, producerContext);
        }
    }

    public void produceResultsInternal(Consumer<T> consumer, ProducerContext producerContext) {
        producerContext.getListener().onProducerFinishWithSuccess(producerContext.getId(), PRODUCER_NAME, null);
        this.mInputProducer.produceResults(new ThrottlerConsumer(consumer), producerContext);
    }
}

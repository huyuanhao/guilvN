package com.facebook.imagepipeline.producers;

import com.facebook.common.internal.Preconditions;

public class ThreadHandoffProducer<T> implements Producer<T> {
    public static final String PRODUCER_NAME = "BackgroundThreadHandoffProducer";
    public final Producer<T> mInputProducer;
    public final ThreadHandoffProducerQueue mThreadHandoffProducerQueue;

    public ThreadHandoffProducer(Producer<T> producer, ThreadHandoffProducerQueue threadHandoffProducerQueue) {
        this.mInputProducer = (Producer) Preconditions.checkNotNull(producer);
        this.mThreadHandoffProducerQueue = threadHandoffProducerQueue;
    }

    @Override // com.facebook.imagepipeline.producers.Producer
    public void produceResults(final Consumer<T> consumer, final ProducerContext producerContext) {
        final ProducerListener listener = producerContext.getListener();
        final String id = producerContext.getId();
        final C05681 r10 = new StatefulProducerRunnable<T>(PRODUCER_NAME, listener, id, consumer) {
            /* class com.facebook.imagepipeline.producers.ThreadHandoffProducer.C05681 */

            @Override // com.facebook.imagepipeline.producers.StatefulProducerRunnable, com.facebook.common.executors.StatefulRunnable
            public void disposeResult(T t) {
            }

            @Override // com.facebook.common.executors.StatefulRunnable
            public T getResult() throws Exception {
                return null;
            }

            @Override // com.facebook.imagepipeline.producers.StatefulProducerRunnable, com.facebook.common.executors.StatefulRunnable
            public void onSuccess(T t) {
                listener.onProducerFinishWithSuccess(id, ThreadHandoffProducer.PRODUCER_NAME, null);
                ThreadHandoffProducer.this.mInputProducer.produceResults(consumer, producerContext);
            }
        };
        producerContext.addCallbacks(new BaseProducerContextCallbacks() {
            /* class com.facebook.imagepipeline.producers.ThreadHandoffProducer.C05692 */

            @Override // com.facebook.imagepipeline.producers.BaseProducerContextCallbacks, com.facebook.imagepipeline.producers.ProducerContextCallbacks
            public void onCancellationRequested() {
                r10.cancel();
                ThreadHandoffProducer.this.mThreadHandoffProducerQueue.remove(r10);
            }
        });
        this.mThreadHandoffProducerQueue.addToQueueOrExecute(r10);
    }
}

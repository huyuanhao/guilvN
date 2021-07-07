package com.facebook.imagepipeline.producers;

public abstract class DelegatingConsumer<I, O> extends BaseConsumer<I> {
    public final Consumer<O> mConsumer;

    public DelegatingConsumer(Consumer<O> consumer) {
        this.mConsumer = consumer;
    }

    public Consumer<O> getConsumer() {
        return this.mConsumer;
    }

    @Override // com.facebook.imagepipeline.producers.BaseConsumer
    public void onCancellationImpl() {
        this.mConsumer.onCancellation();
    }

    @Override // com.facebook.imagepipeline.producers.BaseConsumer
    public void onFailureImpl(Throwable th) {
        this.mConsumer.onFailure(th);
    }

    @Override // com.facebook.imagepipeline.producers.BaseConsumer
    public void onProgressUpdateImpl(float f) {
        this.mConsumer.onProgressUpdate(f);
    }
}

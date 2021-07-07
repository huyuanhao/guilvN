package com.facebook.imagepipeline.producers;

import com.facebook.common.executors.StatefulRunnable;
import java.util.Map;

public abstract class StatefulProducerRunnable<T> extends StatefulRunnable<T> {
    public final Consumer<T> mConsumer;
    public final ProducerListener mProducerListener;
    public final String mProducerName;
    public final String mRequestId;

    public StatefulProducerRunnable(Consumer<T> consumer, ProducerListener producerListener, String str, String str2) {
        this.mConsumer = consumer;
        this.mProducerListener = producerListener;
        this.mProducerName = str;
        this.mRequestId = str2;
        producerListener.onProducerStart(str2, str);
    }

    @Override // com.facebook.common.executors.StatefulRunnable
    public abstract void disposeResult(T t);

    public Map<String, String> getExtraMapOnCancellation() {
        return null;
    }

    public Map<String, String> getExtraMapOnFailure(Exception exc) {
        return null;
    }

    public Map<String, String> getExtraMapOnSuccess(T t) {
        return null;
    }

    @Override // com.facebook.common.executors.StatefulRunnable
    public void onCancellation() {
        ProducerListener producerListener = this.mProducerListener;
        String str = this.mRequestId;
        producerListener.onProducerFinishWithCancellation(str, this.mProducerName, producerListener.requiresExtraMap(str) ? getExtraMapOnCancellation() : null);
        this.mConsumer.onCancellation();
    }

    @Override // com.facebook.common.executors.StatefulRunnable
    public void onFailure(Exception exc) {
        ProducerListener producerListener = this.mProducerListener;
        String str = this.mRequestId;
        producerListener.onProducerFinishWithFailure(str, this.mProducerName, exc, producerListener.requiresExtraMap(str) ? getExtraMapOnFailure(exc) : null);
        this.mConsumer.onFailure(exc);
    }

    @Override // com.facebook.common.executors.StatefulRunnable
    public void onSuccess(T t) {
        ProducerListener producerListener = this.mProducerListener;
        String str = this.mRequestId;
        producerListener.onProducerFinishWithSuccess(str, this.mProducerName, producerListener.requiresExtraMap(str) ? getExtraMapOnSuccess(t) : null);
        this.mConsumer.onNewResult(t, 1);
    }
}

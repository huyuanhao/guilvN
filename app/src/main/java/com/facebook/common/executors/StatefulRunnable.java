package com.facebook.common.executors;

import java.util.concurrent.atomic.AtomicInteger;

public abstract class StatefulRunnable<T> implements Runnable {
    public static final int STATE_CANCELLED = 2;
    public static final int STATE_CREATED = 0;
    public static final int STATE_FAILED = 4;
    public static final int STATE_FINISHED = 3;
    public static final int STATE_STARTED = 1;
    public final AtomicInteger mState = new AtomicInteger(0);

    public void cancel() {
        if (this.mState.compareAndSet(0, 2)) {
            onCancellation();
        }
    }

    public void disposeResult(T t) {
    }

    public abstract T getResult() throws Exception;

    public void onCancellation() {
    }

    public void onFailure(Exception exc) {
    }

    public void onSuccess(T t) {
    }

    public final void run() {
        if (this.mState.compareAndSet(0, 1)) {
            try {
                T result = getResult();
                this.mState.set(3);
                try {
                    onSuccess(result);
                } finally {
                    disposeResult(result);
                }
            } catch (Exception e) {
                this.mState.set(4);
                onFailure(e);
            }
        }
    }
}

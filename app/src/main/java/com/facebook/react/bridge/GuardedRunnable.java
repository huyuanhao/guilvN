package com.facebook.react.bridge;

public abstract class GuardedRunnable implements Runnable {
    public final ReactContext mReactContext;

    public GuardedRunnable(ReactContext reactContext) {
        this.mReactContext = reactContext;
    }

    public final void run() {
        try {
            runGuarded();
        } catch (RuntimeException e) {
            this.mReactContext.handleException(e);
        }
    }

    public abstract void runGuarded();
}

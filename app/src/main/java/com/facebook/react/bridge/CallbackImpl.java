package com.facebook.react.bridge;

public final class CallbackImpl implements Callback {
    public final int mCallbackId;
    public boolean mInvoked = false;
    public final JSInstance mJSInstance;

    public CallbackImpl(JSInstance jSInstance, int i) {
        this.mJSInstance = jSInstance;
        this.mCallbackId = i;
    }

    @Override // com.facebook.react.bridge.Callback
    public void invoke(Object... objArr) {
        if (!this.mInvoked) {
            this.mJSInstance.invokeCallback(this.mCallbackId, Arguments.fromJavaArgs(objArr));
            this.mInvoked = true;
            return;
        }
        throw new RuntimeException("Illegal callback invocation from native module. This callback type only permits a single invocation from native code.");
    }
}

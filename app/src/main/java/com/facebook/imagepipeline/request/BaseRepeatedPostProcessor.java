package com.facebook.imagepipeline.request;

public abstract class BaseRepeatedPostProcessor extends BasePostprocessor implements RepeatedPostprocessor {
    public RepeatedPostprocessorRunner mCallback;

    private synchronized RepeatedPostprocessorRunner getCallback() {
        return this.mCallback;
    }

    @Override // com.facebook.imagepipeline.request.RepeatedPostprocessor
    public synchronized void setCallback(RepeatedPostprocessorRunner repeatedPostprocessorRunner) {
        this.mCallback = repeatedPostprocessorRunner;
    }

    public void update() {
        RepeatedPostprocessorRunner callback = getCallback();
        if (callback != null) {
            callback.update();
        }
    }
}

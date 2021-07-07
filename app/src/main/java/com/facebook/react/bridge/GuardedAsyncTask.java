package com.facebook.react.bridge;

import android.os.AsyncTask;

public abstract class GuardedAsyncTask<Params, Progress> extends AsyncTask<Params, Progress, Void> {
    public final ReactContext mReactContext;

    public GuardedAsyncTask(ReactContext reactContext) {
        this.mReactContext = reactContext;
    }

    public abstract void doInBackgroundGuarded(Params... paramsArr);

    @Override // android.os.AsyncTask
    public final Void doInBackground(Params... paramsArr) {
        try {
            doInBackgroundGuarded(paramsArr);
            return null;
        } catch (RuntimeException e) {
            this.mReactContext.handleException(e);
            return null;
        }
    }
}

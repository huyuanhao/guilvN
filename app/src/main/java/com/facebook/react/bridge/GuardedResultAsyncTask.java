package com.facebook.react.bridge;

import android.os.AsyncTask;

public abstract class GuardedResultAsyncTask<Result> extends AsyncTask<Void, Void, Result> {
    public final ReactContext mReactContext;

    public GuardedResultAsyncTask(ReactContext reactContext) {
        this.mReactContext = reactContext;
    }

    public abstract Result doInBackgroundGuarded();

    @Override // android.os.AsyncTask
    public final void onPostExecute(Result result) {
        try {
            onPostExecuteGuarded(result);
        } catch (RuntimeException e) {
            this.mReactContext.handleException(e);
        }
    }

    public abstract void onPostExecuteGuarded(Result result);

    public final Result doInBackground(Void... voidArr) {
        try {
            return doInBackgroundGuarded();
        } catch (RuntimeException e) {
            this.mReactContext.handleException(e);
            throw e;
        }
    }
}

package com.google.android.cameraview;

import android.hardware.Camera;
import android.os.AsyncTask;
import android.util.Log;
import com.facebook.react.uimanager.ViewProps;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.RejectedExecutionException;

public final class AutoFocusManager implements Camera.AutoFocusCallback {
    public static final long AUTO_FOCUS_INTERVAL_MS = 1500;
    public static final Collection<String> FOCUS_MODES_CALLING_AF;
    public static final String TAG = AutoFocusManager.class.getSimpleName();
    public final Camera camera;
    public boolean focusing;
    public AsyncTask<?, ?, ?> outstandingTask;
    public boolean stopped;
    public final boolean useAutoFocus;

    public final class AutoFocusTask extends AsyncTask<Object, Object, Object> {
        public AutoFocusTask() {
        }

        @Override // android.os.AsyncTask
        public Object doInBackground(Object... objArr) {
            try {
                Thread.sleep(AutoFocusManager.AUTO_FOCUS_INTERVAL_MS);
            } catch (InterruptedException unused) {
            }
            AutoFocusManager.this.start();
            return null;
        }
    }

    static {
        ArrayList arrayList = new ArrayList(2);
        FOCUS_MODES_CALLING_AF = arrayList;
        arrayList.add("auto");
        FOCUS_MODES_CALLING_AF.add("macro");
    }

    public AutoFocusManager(Camera camera2) {
        this.camera = camera2;
        String focusMode = camera2.getParameters().getFocusMode();
        this.useAutoFocus = FOCUS_MODES_CALLING_AF.contains(focusMode);
        String str = TAG;
        Log.i(str, "Current focus mode '" + focusMode + "'; use auto focus? " + this.useAutoFocus);
        start();
    }

    private synchronized void autoFocusAgainLater() {
        String str = TAG;
        Log.i(str, "autoFocusAgainLater stopped=" + this.stopped + " outstandingTask=" + this.outstandingTask);
        if (!this.stopped && this.outstandingTask == null) {
            Log.i(TAG, "autoFocusAgainLater new");
            AutoFocusTask autoFocusTask = new AutoFocusTask();
            try {
                autoFocusTask.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Object[0]);
                this.outstandingTask = autoFocusTask;
            } catch (RejectedExecutionException unused) {
            }
        }
    }

    private synchronized void cancelOutstandingTask() {
        if (this.outstandingTask != null) {
            if (this.outstandingTask.getStatus() != AsyncTask.Status.FINISHED) {
                this.outstandingTask.cancel(true);
            }
            this.outstandingTask = null;
        }
    }

    public synchronized void onAutoFocus(boolean z, Camera camera2) {
        this.focusing = false;
        autoFocusAgainLater();
    }

    public synchronized void start() {
        Log.i(TAG, ViewProps.START);
        if (this.useAutoFocus) {
            this.outstandingTask = null;
            if (!this.stopped && !this.focusing) {
                try {
                    Log.i(TAG, "autoFocus");
                    this.camera.autoFocus(this);
                    this.focusing = true;
                } catch (RuntimeException unused) {
                    autoFocusAgainLater();
                }
            }
        }
    }

    public synchronized void stop() {
        Log.i(TAG, "stop");
        this.stopped = true;
        if (this.useAutoFocus) {
            Log.i(TAG, "cancelAutoFocus");
            cancelOutstandingTask();
            try {
                this.camera.cancelAutoFocus();
            } catch (RuntimeException unused) {
            }
        }
    }
}

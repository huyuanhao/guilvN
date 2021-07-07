package com.facebook.react.modules.core;

import android.os.Handler;
import android.view.Choreographer;
import com.facebook.react.bridge.UiThreadUtil;

public class ChoreographerCompat {
    public static final long ONE_FRAME_MILLIS = 17;
    public static ChoreographerCompat sInstance;
    public Choreographer mChoreographer = getChoreographer();
    public Handler mHandler;

    public static abstract class FrameCallback {
        public Choreographer.FrameCallback mFrameCallback;
        public Runnable mRunnable;

        public abstract void doFrame(long j);

        public Choreographer.FrameCallback getFrameCallback() {
            if (this.mFrameCallback == null) {
                this.mFrameCallback = new Choreographer.FrameCallback() {
                    /* class com.facebook.react.modules.core.ChoreographerCompat.FrameCallback.Choreographer$FrameCallbackC07511 */

                    public void doFrame(long j) {
                        FrameCallback.this.doFrame(j);
                    }
                };
            }
            return this.mFrameCallback;
        }

        public Runnable getRunnable() {
            if (this.mRunnable == null) {
                this.mRunnable = new Runnable() {
                    /* class com.facebook.react.modules.core.ChoreographerCompat.FrameCallback.RunnableC07522 */

                    public void run() {
                        FrameCallback.this.doFrame(System.nanoTime());
                    }
                };
            }
            return this.mRunnable;
        }
    }

    private void choreographerPostFrameCallback(Choreographer.FrameCallback frameCallback) {
        this.mChoreographer.postFrameCallback(frameCallback);
    }

    private void choreographerPostFrameCallbackDelayed(Choreographer.FrameCallback frameCallback, long j) {
        this.mChoreographer.postFrameCallbackDelayed(frameCallback, j);
    }

    private void choreographerRemoveFrameCallback(Choreographer.FrameCallback frameCallback) {
        this.mChoreographer.removeFrameCallback(frameCallback);
    }

    private Choreographer getChoreographer() {
        return Choreographer.getInstance();
    }

    public static ChoreographerCompat getInstance() {
        UiThreadUtil.assertOnUiThread();
        if (sInstance == null) {
            sInstance = new ChoreographerCompat();
        }
        return sInstance;
    }

    public void postFrameCallback(FrameCallback frameCallback) {
        choreographerPostFrameCallback(frameCallback.getFrameCallback());
    }

    public void postFrameCallbackDelayed(FrameCallback frameCallback, long j) {
        choreographerPostFrameCallbackDelayed(frameCallback.getFrameCallback(), j);
    }

    public void removeFrameCallback(FrameCallback frameCallback) {
        choreographerRemoveFrameCallback(frameCallback.getFrameCallback());
    }
}

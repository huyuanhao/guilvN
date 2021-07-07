package com.google.android.cameraview;

import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.View;

public abstract class PreviewImpl {
    public Callback mCallback;
    public int mHeight;
    public int mWidth;

    public interface Callback {
        void onSurfaceChanged();

        void onSurfaceDestroyed();
    }

    public void dispatchSurfaceChanged() {
        this.mCallback.onSurfaceChanged();
    }

    public void dispatchSurfaceDestroyed() {
        this.mCallback.onSurfaceDestroyed();
    }

    public int getHeight() {
        return this.mHeight;
    }

    public abstract Class getOutputClass();

    public abstract Surface getSurface();

    public SurfaceHolder getSurfaceHolder() {
        return null;
    }

    public Object getSurfaceTexture() {
        return null;
    }

    public abstract View getView();

    public int getWidth() {
        return this.mWidth;
    }

    public abstract boolean isReady();

    public void setBufferSize(int i, int i2) {
    }

    public void setCallback(Callback callback) {
        this.mCallback = callback;
    }

    public abstract void setDisplayOrientation(int i);

    public void setSize(int i, int i2) {
        this.mWidth = i;
        this.mHeight = i2;
    }
}

package com.google.android.cameraview;

import android.content.Context;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.ViewCompat;
import org.reactnative.camera.C4858R;

public class SurfaceViewPreview extends PreviewImpl {
    public final SurfaceView mSurfaceView;

    public SurfaceViewPreview(Context context, ViewGroup viewGroup) {
        SurfaceView surfaceView = (SurfaceView) View.inflate(context, C4858R.layout.surface_view, viewGroup).findViewById(C4858R.C4861id.surface_view);
        this.mSurfaceView = surfaceView;
        SurfaceHolder holder = surfaceView.getHolder();
        holder.setType(3);
        holder.addCallback(new SurfaceHolder.Callback() {
            /* class com.google.android.cameraview.SurfaceViewPreview.SurfaceHolder$CallbackC09471 */

            public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
                SurfaceViewPreview.this.setSize(i2, i3);
                if (!ViewCompat.m14610OooOO0o((View) SurfaceViewPreview.this.mSurfaceView)) {
                    SurfaceViewPreview.this.dispatchSurfaceChanged();
                }
            }

            public void surfaceCreated(SurfaceHolder surfaceHolder) {
            }

            public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
                SurfaceViewPreview.this.setSize(0, 0);
            }
        });
    }

    @Override // com.google.android.cameraview.PreviewImpl
    public Class getOutputClass() {
        return SurfaceHolder.class;
    }

    @Override // com.google.android.cameraview.PreviewImpl
    public Surface getSurface() {
        return getSurfaceHolder().getSurface();
    }

    @Override // com.google.android.cameraview.PreviewImpl
    public SurfaceHolder getSurfaceHolder() {
        return this.mSurfaceView.getHolder();
    }

    @Override // com.google.android.cameraview.PreviewImpl
    public View getView() {
        return this.mSurfaceView;
    }

    @Override // com.google.android.cameraview.PreviewImpl
    public boolean isReady() {
        return (getWidth() == 0 || getHeight() == 0) ? false : true;
    }

    @Override // com.google.android.cameraview.PreviewImpl
    public void setDisplayOrientation(int i) {
    }
}

package com.google.android.cameraview;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import org.reactnative.camera.C4858R;

@TargetApi(14)
public class TextureViewPreview extends PreviewImpl {
    public int mDisplayOrientation;
    public final TextureView mTextureView;

    public TextureViewPreview(Context context, ViewGroup viewGroup) {
        TextureView textureView = (TextureView) View.inflate(context, C4858R.layout.texture_view, viewGroup).findViewById(C4858R.C4861id.texture_view);
        this.mTextureView = textureView;
        textureView.setSurfaceTextureListener(new TextureView.SurfaceTextureListener() {
            /* class com.google.android.cameraview.TextureViewPreview.TextureView$SurfaceTextureListenerC09481 */

            public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
                TextureViewPreview.this.setSize(i, i2);
                TextureViewPreview.this.configureTransform();
                TextureViewPreview.this.dispatchSurfaceChanged();
            }

            public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
                TextureViewPreview.this.setSize(0, 0);
                TextureViewPreview.this.dispatchSurfaceDestroyed();
                return true;
            }

            public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
                TextureViewPreview.this.setSize(i, i2);
                TextureViewPreview.this.configureTransform();
                TextureViewPreview.this.dispatchSurfaceChanged();
            }

            public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
            }
        });
    }

    public void configureTransform() {
        Matrix matrix = new Matrix();
        int i = this.mDisplayOrientation;
        if (i % 180 == 90) {
            float width = (float) getWidth();
            float height = (float) getHeight();
            matrix.setPolyToPoly(new float[]{0.0f, 0.0f, width, 0.0f, 0.0f, height, width, height}, 0, this.mDisplayOrientation == 90 ? new float[]{0.0f, height, 0.0f, 0.0f, width, height, width, 0.0f} : new float[]{width, 0.0f, width, height, 0.0f, 0.0f, 0.0f, height}, 0, 4);
        } else if (i == 180) {
            matrix.postRotate(180.0f, (float) (getWidth() / 2), (float) (getHeight() / 2));
        }
        this.mTextureView.setTransform(matrix);
    }

    @Override // com.google.android.cameraview.PreviewImpl
    public Class getOutputClass() {
        return SurfaceTexture.class;
    }

    @Override // com.google.android.cameraview.PreviewImpl
    public Surface getSurface() {
        return new Surface(this.mTextureView.getSurfaceTexture());
    }

    @Override // com.google.android.cameraview.PreviewImpl
    public View getView() {
        return this.mTextureView;
    }

    @Override // com.google.android.cameraview.PreviewImpl
    public boolean isReady() {
        return this.mTextureView.getSurfaceTexture() != null;
    }

    @Override // com.google.android.cameraview.PreviewImpl
    @TargetApi(15)
    public void setBufferSize(int i, int i2) {
        this.mTextureView.getSurfaceTexture().setDefaultBufferSize(i, i2);
    }

    @Override // com.google.android.cameraview.PreviewImpl
    public void setDisplayOrientation(int i) {
        this.mDisplayOrientation = i;
        configureTransform();
    }

    @Override // com.google.android.cameraview.PreviewImpl
    public SurfaceTexture getSurfaceTexture() {
        return this.mTextureView.getSurfaceTexture();
    }
}

package com.google.android.cameraview;

import android.graphics.SurfaceTexture;
import android.media.CamcorderProfile;
import android.os.Handler;
import android.view.View;
import com.facebook.react.bridge.ReadableMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.Set;
import java.util.SortedSet;

public abstract class CameraViewImpl {
    public final Handler mBgHandler;
    public final Callback mCallback;
    public final PreviewImpl mPreview;

    public interface Callback {
        void onCameraClosed();

        void onCameraOpened();

        void onFramePreview(byte[] bArr, int i, int i2, int i3);

        void onMountError();

        void onPictureTaken(byte[] bArr, int i);

        void onRecordingEnd();

        void onRecordingStart(String str, int i, int i2);

        void onVideoRecorded(String str, int i, int i2);
    }

    public CameraViewImpl(Callback callback, PreviewImpl previewImpl, Handler handler) {
        this.mCallback = callback;
        this.mPreview = previewImpl;
        this.mBgHandler = handler;
    }

    public abstract AspectRatio getAspectRatio();

    public abstract boolean getAutoFocus();

    public abstract SortedSet<Size> getAvailablePictureSizes(AspectRatio aspectRatio);

    public abstract String getCameraId();

    public abstract List<Properties> getCameraIds();

    public abstract int getCameraOrientation();

    public abstract float getExposureCompensation();

    public abstract int getFacing();

    public abstract int getFlash();

    public abstract float getFocusDepth();

    public abstract Size getPictureSize();

    public abstract boolean getPlaySoundOnCapture();

    public abstract Size getPreviewSize();

    public abstract boolean getScanning();

    public abstract Set<AspectRatio> getSupportedAspectRatios();

    public abstract ArrayList<int[]> getSupportedPreviewFpsRange();

    public View getView() {
        return this.mPreview.getView();
    }

    public abstract int getWhiteBalance();

    public abstract float getZoom();

    public abstract boolean isCameraOpened();

    public abstract void pausePreview();

    public abstract boolean record(String str, int i, int i2, boolean z, CamcorderProfile camcorderProfile, int i3, int i4);

    public abstract void resumePreview();

    public abstract boolean setAspectRatio(AspectRatio aspectRatio);

    public abstract void setAutoFocus(boolean z);

    public abstract void setCameraId(String str);

    public abstract void setDeviceOrientation(int i);

    public abstract void setDisplayOrientation(int i);

    public abstract void setExposureCompensation(float f);

    public abstract void setFacing(int i);

    public abstract void setFlash(int i);

    public abstract void setFocusArea(float f, float f2);

    public abstract void setFocusDepth(float f);

    public abstract void setPictureSize(Size size);

    public abstract void setPlaySoundOnCapture(boolean z);

    public abstract void setPreviewTexture(SurfaceTexture surfaceTexture);

    public abstract void setScanning(boolean z);

    public abstract void setWhiteBalance(int i);

    public abstract void setZoom(float f);

    public abstract boolean start();

    public abstract void stop();

    public abstract void stopRecording();

    public abstract void takePicture(ReadableMap readableMap);
}

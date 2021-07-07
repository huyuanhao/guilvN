package com.google.android.cameraview;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.media.CamcorderProfile;
import android.media.MediaActionSound;
import android.media.MediaRecorder;
import android.os.Build;
import android.os.Handler;
import android.view.SurfaceHolder;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.ViewProps;
import com.google.android.cameraview.CameraViewImpl;
import com.google.android.cameraview.PreviewImpl;
import com.p118pd.sdk.C5308ILiI;
import com.p118pd.sdk.C7010o000Ooo;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;
import java.util.Set;
import java.util.SortedSet;
import java.util.concurrent.atomic.AtomicBoolean;

public class Camera1 extends CameraViewImpl implements MediaRecorder.OnInfoListener, MediaRecorder.OnErrorListener, Camera.PreviewCallback {
    public static final int DELAY_MILLIS_BEFORE_RESETTING_FOCUS = 3000;
    public static final C7010o000Ooo<String> FLASH_MODES;
    public static final int FOCUS_AREA_SIZE_DEFAULT = 300;
    public static final int FOCUS_METERING_AREA_WEIGHT_DEFAULT = 1000;
    public static final int INVALID_CAMERA_ID = -1;
    public static final C7010o000Ooo<String> WB_MODES;
    public String _mCameraId;
    public AutoFocusManager autoFocusManager;
    public final AtomicBoolean isPictureCaptureInProgress = new AtomicBoolean(false);
    public AspectRatio mAspectRatio;
    public boolean mAutoFocus;
    public Camera mCamera;
    public int mCameraId;
    public final Camera.CameraInfo mCameraInfo = new Camera.CameraInfo();
    public Camera.Parameters mCameraParameters;
    public int mDeviceOrientation;
    public int mDisplayOrientation;
    public float mExposure;
    public int mFacing;
    public int mFlash;
    public Handler mHandler = new Handler();
    public boolean mIsPreviewActive = false;
    public final AtomicBoolean mIsRecording = new AtomicBoolean(false);
    public boolean mIsScanning;
    public MediaRecorder mMediaRecorder;
    public int mOrientation = 0;
    public Size mPictureSize;
    public final SizeMap mPictureSizes = new SizeMap();
    public Boolean mPlaySoundOnCapture = false;
    public final SizeMap mPreviewSizes = new SizeMap();
    public SurfaceTexture mPreviewTexture;
    public boolean mShowingPreview = true;
    public String mVideoPath;
    public int mWhiteBalance;
    public float mZoom;
    public boolean mustUpdateSurface;
    public MediaActionSound sound = new MediaActionSound();
    public boolean surfaceWasDestroyed;

    static {
        C7010o000Ooo<String> o000ooo = new C7010o000Ooo<>();
        FLASH_MODES = o000ooo;
        o000ooo.OooO0O0(0, "off");
        FLASH_MODES.OooO0O0(1, ViewProps.f984ON);
        FLASH_MODES.OooO0O0(2, "torch");
        FLASH_MODES.OooO0O0(3, "auto");
        FLASH_MODES.OooO0O0(4, "red-eye");
        C7010o000Ooo<String> o000ooo2 = new C7010o000Ooo<>();
        WB_MODES = o000ooo2;
        o000ooo2.OooO0O0(0, "auto");
        WB_MODES.OooO0O0(1, "cloudy-daylight");
        WB_MODES.OooO0O0(2, "daylight");
        WB_MODES.OooO0O0(3, "shade");
        WB_MODES.OooO0O0(4, "fluorescent");
        WB_MODES.OooO0O0(5, "incandescent");
    }

    public Camera1(CameraViewImpl.Callback callback, PreviewImpl previewImpl, Handler handler) {
        super(callback, previewImpl, handler);
        previewImpl.setCallback(new PreviewImpl.Callback() {
            /* class com.google.android.cameraview.Camera1.C09191 */

            @Override // com.google.android.cameraview.PreviewImpl.Callback
            public void onSurfaceChanged() {
                synchronized (Camera1.this) {
                    if (!Camera1.this.surfaceWasDestroyed) {
                        Camera1.this.updateSurface();
                    } else {
                        Camera1.this.mBgHandler.post(new Runnable() {
                            /* class com.google.android.cameraview.Camera1.C09191.RunnableC09201 */

                            public void run() {
                                Camera1.this.start();
                            }
                        });
                    }
                }
            }

            @Override // com.google.android.cameraview.PreviewImpl.Callback
            public void onSurfaceDestroyed() {
                synchronized (Camera1.this) {
                    if (Camera1.this.mCamera != null) {
                        Camera1.this.surfaceWasDestroyed = true;
                        try {
                            Camera1.this.mCamera.setPreviewCallback(null);
                            Camera1.this.mCamera.setPreviewDisplay(null);
                        } catch (Exception unused) {
                        }
                    }
                }
                Camera1.this.mBgHandler.post(new Runnable() {
                    /* class com.google.android.cameraview.Camera1.C09191.RunnableC09212 */

                    public void run() {
                        Camera1.this.stop();
                    }
                });
            }
        });
    }

    private int calcCameraRotation(int i) {
        Camera.CameraInfo cameraInfo = this.mCameraInfo;
        if (cameraInfo.facing == 0) {
            return (cameraInfo.orientation + i) % 360;
        }
        return ((this.mCameraInfo.orientation + i) + (isLandscape(i) ? 180 : 0)) % 360;
    }

    private int calcDisplayOrientation(int i) {
        Camera.CameraInfo cameraInfo = this.mCameraInfo;
        if (cameraInfo.facing == 1) {
            return (360 - ((cameraInfo.orientation + i) % 360)) % 360;
        }
        return ((cameraInfo.orientation - i) + 360) % 360;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private Rect calculateFocusArea(float f, float f2) {
        int i = (int) (f * 2000.0f);
        int i2 = (int) (f2 * 2000.0f);
        int i3 = i - 150;
        int i4 = i2 - 150;
        int i5 = i + 150;
        int i6 = i2 + 150;
        if (i3 < 0) {
            i3 = 0;
        }
        if (i5 > 2000) {
            i5 = 2000;
        }
        if (i4 < 0) {
            i4 = 0;
        }
        if (i6 > 2000) {
            i6 = 2000;
        }
        return new Rect(i3 - 1000, i4 - 1000, i5 - 1000, i6 - 1000);
    }

    private AspectRatio chooseAspectRatio() {
        Iterator<AspectRatio> it = this.mPreviewSizes.ratios().iterator();
        AspectRatio aspectRatio = null;
        while (it.hasNext()) {
            aspectRatio = it.next();
            if (aspectRatio.equals(Constants.DEFAULT_ASPECT_RATIO)) {
                break;
            }
        }
        return aspectRatio;
    }

    private void chooseCamera() {
        String str = this._mCameraId;
        if (str == null) {
            try {
                int numberOfCameras = Camera.getNumberOfCameras();
                if (numberOfCameras == 0) {
                    this.mCameraId = -1;
                    return;
                }
                for (int i = 0; i < numberOfCameras; i++) {
                    Camera.getCameraInfo(i, this.mCameraInfo);
                    if (this.mCameraInfo.facing == this.mFacing) {
                        this.mCameraId = i;
                        return;
                    }
                }
                this.mCameraId = 0;
                Camera.getCameraInfo(0, this.mCameraInfo);
            } catch (Exception unused) {
                this.mCameraId = -1;
            }
        } else {
            try {
                int parseInt = Integer.parseInt(str);
                this.mCameraId = parseInt;
                Camera.getCameraInfo(parseInt, this.mCameraInfo);
            } catch (Exception unused2) {
                this.mCameraId = -1;
            }
        }
    }

    private Size chooseOptimalSize(SortedSet<Size> sortedSet) {
        if (!this.mPreview.isReady()) {
            return sortedSet.first();
        }
        int width = this.mPreview.getWidth();
        int height = this.mPreview.getHeight();
        if (isLandscape(this.mDisplayOrientation)) {
            height = width;
            width = height;
        }
        Size size = null;
        Iterator<Size> it = sortedSet.iterator();
        while (it.hasNext()) {
            size = it.next();
            if (width <= size.getWidth() && height <= size.getHeight()) {
                break;
            }
        }
        return size;
    }

    private boolean isCompatibleWithDevice(int i) {
        boolean z;
        int i2 = i * 1000;
        Iterator<int[]> it = getSupportedPreviewFpsRange().iterator();
        do {
            z = false;
            if (!it.hasNext()) {
                return false;
            }
            int[] next = it.next();
            boolean z2 = i2 >= next[0] && i2 <= next[1];
            boolean z3 = i2 > 0;
            if (z2 && z3) {
                z = true;
                continue;
            }
        } while (!z);
        return true;
    }

    private boolean isLandscape(int i) {
        return i == 90 || i == 270;
    }

    private boolean openCamera() {
        if (this.mCamera != null) {
            releaseCamera();
        }
        int i = this.mCameraId;
        if (i == -1) {
            return false;
        }
        try {
            Camera open = Camera.open(i);
            this.mCamera = open;
            this.mCameraParameters = open.getParameters();
            this.mPreviewSizes.clear();
            for (Camera.Size size : this.mCameraParameters.getSupportedPreviewSizes()) {
                this.mPreviewSizes.add(new Size(size.width, size.height));
            }
            this.mPictureSizes.clear();
            for (Camera.Size size2 : this.mCameraParameters.getSupportedPictureSizes()) {
                this.mPictureSizes.add(new Size(size2.width, size2.height));
            }
            for (AspectRatio aspectRatio : this.mPreviewSizes.ratios()) {
                if (this.mPictureSizes.sizes(aspectRatio) == null) {
                    this.mPreviewSizes.remove(aspectRatio);
                }
            }
            if (this.mAspectRatio == null) {
                this.mAspectRatio = Constants.DEFAULT_ASPECT_RATIO;
            }
            adjustCameraParameters();
            this.mCamera.setDisplayOrientation(calcDisplayOrientation(this.mDisplayOrientation));
            this.mCallback.onCameraOpened();
            return true;
        } catch (RuntimeException unused) {
            return false;
        }
    }

    private void releaseCamera() {
        Camera camera = this.mCamera;
        if (camera != null) {
            camera.release();
            this.mCamera = null;
            this.mPictureSize = null;
            this.mCallback.onCameraClosed();
            this.isPictureCaptureInProgress.set(false);
            this.mIsRecording.set(false);
        }
    }

    private void resetFocus(boolean z, Camera camera) {
        this.mHandler.removeCallbacksAndMessages(null);
        this.mHandler.postDelayed(new Runnable() {
            /* class com.google.android.cameraview.Camera1.RunnableC092210 */

            public void run() {
                Camera.Parameters parameters;
                Camera camera = Camera1.this.mCamera;
                if (camera != null) {
                    camera.cancelAutoFocus();
                    try {
                        parameters = Camera1.this.mCamera.getParameters();
                    } catch (Exception unused) {
                        parameters = null;
                    }
                    if (parameters != null) {
                        if (parameters.getFocusMode() != "continuous-picture") {
                            parameters.setFocusMode("continuous-picture");
                            parameters.setFocusAreas(null);
                            parameters.setMeteringAreas(null);
                            try {
                                Camera1.this.mCamera.setParameters(parameters);
                            } catch (RuntimeException unused2) {
                            }
                        }
                        Camera1.this.mCamera.cancelAutoFocus();
                    }
                }
            }
        }, 3000);
    }

    private boolean setAutoFocusInternal(boolean z) {
        this.mAutoFocus = z;
        if (!isCameraOpened()) {
            return false;
        }
        List<String> supportedFocusModes = this.mCameraParameters.getSupportedFocusModes();
        if (z && supportedFocusModes.contains("continuous-picture")) {
            this.mCameraParameters.setFocusMode("auto");
            return true;
        } else if (z && supportedFocusModes.contains("continuous-picture")) {
            this.mCameraParameters.setFocusMode("continuous-picture");
            return true;
        } else if (supportedFocusModes.contains("fixed")) {
            this.mCameraParameters.setFocusMode("fixed");
            return true;
        } else if (supportedFocusModes.contains("infinity")) {
            this.mCameraParameters.setFocusMode("infinity");
            return true;
        } else {
            this.mCameraParameters.setFocusMode(supportedFocusModes.get(0));
            return true;
        }
    }

    private void setCamcorderProfile(CamcorderProfile camcorderProfile, boolean z, int i) {
        if (!isCompatibleWithDevice(i)) {
            i = camcorderProfile.videoFrameRate;
        }
        this.mMediaRecorder.setOutputFormat(camcorderProfile.fileFormat);
        this.mMediaRecorder.setVideoFrameRate(i);
        this.mMediaRecorder.setVideoSize(camcorderProfile.videoFrameWidth, camcorderProfile.videoFrameHeight);
        this.mMediaRecorder.setVideoEncodingBitRate(camcorderProfile.videoBitRate);
        this.mMediaRecorder.setVideoEncoder(camcorderProfile.videoCodec);
        if (z) {
            this.mMediaRecorder.setAudioEncodingBitRate(camcorderProfile.audioBitRate);
            this.mMediaRecorder.setAudioChannels(camcorderProfile.audioChannels);
            this.mMediaRecorder.setAudioSamplingRate(camcorderProfile.audioSampleRate);
            this.mMediaRecorder.setAudioEncoder(camcorderProfile.audioCodec);
        }
    }

    private boolean setExposureInternal(float f) {
        int minExposureCompensation;
        int maxExposureCompensation;
        this.mExposure = f;
        int i = 0;
        if (!isCameraOpened() || (minExposureCompensation = this.mCameraParameters.getMinExposureCompensation()) == (maxExposureCompensation = this.mCameraParameters.getMaxExposureCompensation())) {
            return false;
        }
        float f2 = this.mExposure;
        if (f2 >= 0.0f && f2 <= 1.0f) {
            i = ((int) (f2 * ((float) (maxExposureCompensation - minExposureCompensation)))) + minExposureCompensation;
        }
        this.mCameraParameters.setExposureCompensation(i);
        return true;
    }

    private boolean setFlashInternal(int i) {
        if (isCameraOpened()) {
            List<String> supportedFlashModes = this.mCameraParameters.getSupportedFlashModes();
            String OooO00o = FLASH_MODES.m18264OooO00o(i);
            if (supportedFlashModes == null) {
                return false;
            }
            if (supportedFlashModes.contains(OooO00o)) {
                this.mCameraParameters.setFlashMode(OooO00o);
                this.mFlash = i;
                return true;
            } else if (supportedFlashModes.contains(FLASH_MODES.m18264OooO00o(this.mFlash))) {
                return false;
            } else {
                this.mCameraParameters.setFlashMode("off");
                return true;
            }
        } else {
            this.mFlash = i;
            return false;
        }
    }

    private void setPlaySoundInternal(boolean z) {
        this.mPlaySoundOnCapture = Boolean.valueOf(z);
        Camera camera = this.mCamera;
        if (camera != null) {
            try {
                if (!camera.enableShutterSound(false)) {
                    this.mPlaySoundOnCapture = false;
                }
            } catch (Exception unused) {
                this.mPlaySoundOnCapture = false;
            }
        }
    }

    private void setScanningInternal(boolean z) {
        this.mIsScanning = z;
        if (!isCameraOpened()) {
            return;
        }
        if (this.mIsScanning) {
            this.mCamera.setPreviewCallback(this);
        } else {
            this.mCamera.setPreviewCallback(null);
        }
    }

    private void setUpMediaRecorder(String str, int i, int i2, boolean z, CamcorderProfile camcorderProfile, int i3) {
        CamcorderProfile camcorderProfile2;
        this.mMediaRecorder = new MediaRecorder();
        this.mCamera.unlock();
        this.mMediaRecorder.setCamera(this.mCamera);
        this.mMediaRecorder.setVideoSource(1);
        if (z) {
            this.mMediaRecorder.setAudioSource(5);
        }
        this.mMediaRecorder.setOutputFile(str);
        this.mVideoPath = str;
        if (CamcorderProfile.hasProfile(this.mCameraId, camcorderProfile.quality)) {
            camcorderProfile2 = CamcorderProfile.get(this.mCameraId, camcorderProfile.quality);
        } else {
            camcorderProfile2 = CamcorderProfile.get(this.mCameraId, 1);
        }
        camcorderProfile2.videoBitRate = camcorderProfile.videoBitRate;
        setCamcorderProfile(camcorderProfile2, z, i3);
        MediaRecorder mediaRecorder = this.mMediaRecorder;
        int i4 = this.mOrientation;
        mediaRecorder.setOrientationHint(calcCameraRotation(i4 != 0 ? orientationEnumToRotation(i4) : this.mDeviceOrientation));
        if (i != -1) {
            this.mMediaRecorder.setMaxDuration(i);
        }
        if (i2 != -1) {
            this.mMediaRecorder.setMaxFileSize((long) i2);
        }
        this.mMediaRecorder.setOnInfoListener(this);
        this.mMediaRecorder.setOnErrorListener(this);
    }

    private boolean setWhiteBalanceInternal(int i) {
        this.mWhiteBalance = i;
        if (!isCameraOpened()) {
            return false;
        }
        List<String> supportedWhiteBalance = this.mCameraParameters.getSupportedWhiteBalance();
        String OooO00o = WB_MODES.m18264OooO00o(i);
        if (supportedWhiteBalance == null || !supportedWhiteBalance.contains(OooO00o)) {
            String OooO00o2 = WB_MODES.m18264OooO00o(this.mWhiteBalance);
            if (supportedWhiteBalance != null && supportedWhiteBalance.contains(OooO00o2)) {
                return false;
            }
            this.mCameraParameters.setWhiteBalance("auto");
            return true;
        }
        this.mCameraParameters.setWhiteBalance(OooO00o);
        return true;
    }

    private boolean setZoomInternal(float f) {
        if (!isCameraOpened() || !this.mCameraParameters.isZoomSupported()) {
            this.mZoom = f;
            return false;
        }
        this.mCameraParameters.setZoom((int) (((float) this.mCameraParameters.getMaxZoom()) * f));
        this.mZoom = f;
        return true;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void startCameraPreview() {
        Camera camera;
        if (!this.mIsPreviewActive && (camera = this.mCamera) != null) {
            try {
                this.mIsPreviewActive = true;
                camera.startPreview();
                if (this.mIsScanning) {
                    this.mCamera.setPreviewCallback(this);
                }
                this.autoFocusManager = new AutoFocusManager(this.mCamera);
            } catch (Exception unused) {
                this.mIsPreviewActive = false;
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:5|6|7|8|9) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x000b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void stopMediaRecorder() {
        /*
            r5 = this;
            monitor-enter(r5)
            android.media.MediaRecorder r0 = r5.mMediaRecorder     // Catch:{ all -> 0x0056 }
            r1 = 0
            if (r0 == 0) goto L_0x0017
            android.media.MediaRecorder r0 = r5.mMediaRecorder     // Catch:{ RuntimeException -> 0x000b }
            r0.stop()     // Catch:{ RuntimeException -> 0x000b }
        L_0x000b:
            android.media.MediaRecorder r0 = r5.mMediaRecorder     // Catch:{ RuntimeException -> 0x0015 }
            r0.reset()     // Catch:{ RuntimeException -> 0x0015 }
            android.media.MediaRecorder r0 = r5.mMediaRecorder     // Catch:{ RuntimeException -> 0x0015 }
            r0.release()     // Catch:{ RuntimeException -> 0x0015 }
        L_0x0015:
            r5.mMediaRecorder = r1
        L_0x0017:
            com.google.android.cameraview.CameraViewImpl$Callback r0 = r5.mCallback
            r0.onRecordingEnd()
            int r0 = r5.mDeviceOrientation
            int r0 = r5.displayOrientationToOrientationEnum(r0)
            java.lang.String r2 = r5.mVideoPath
            if (r2 == 0) goto L_0x0047
            java.io.File r2 = new java.io.File
            java.lang.String r3 = r5.mVideoPath
            r2.<init>(r3)
            boolean r2 = r2.exists()
            if (r2 != 0) goto L_0x0034
            goto L_0x0047
        L_0x0034:
            com.google.android.cameraview.CameraViewImpl$Callback r2 = r5.mCallback
            java.lang.String r3 = r5.mVideoPath
            int r4 = r5.mOrientation
            if (r4 == 0) goto L_0x003f
            int r4 = r5.mOrientation
            goto L_0x0040
        L_0x003f:
            r4 = r0
        L_0x0040:
            r2.onVideoRecorded(r3, r4, r0)
            r5.mVideoPath = r1
            monitor-exit(r5)
            return
        L_0x0047:
            com.google.android.cameraview.CameraViewImpl$Callback r2 = r5.mCallback
            int r3 = r5.mOrientation
            if (r3 == 0) goto L_0x0050
            int r3 = r5.mOrientation
            goto L_0x0051
        L_0x0050:
            r3 = r0
        L_0x0051:
            r2.onVideoRecorded(r1, r3, r0)
            monitor-exit(r5)
            return
        L_0x0056:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.cameraview.Camera1.stopMediaRecorder():void");
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void updateSurface() {
        if (this.mCamera == null) {
            return;
        }
        if (this.isPictureCaptureInProgress.get() || this.mIsRecording.get()) {
            this.mustUpdateSurface = true;
        } else {
            this.mBgHandler.post(new Runnable() {
                /* class com.google.android.cameraview.Camera1.RunnableC09232 */

                public void run() {
                    synchronized (Camera1.this) {
                        if (Camera1.this.mCamera != null) {
                            Camera1.this.mustUpdateSurface = false;
                            Camera1.this.setUpPreview();
                            Camera1.this.adjustCameraParameters();
                            if (Camera1.this.mShowingPreview) {
                                Camera1.this.startCameraPreview();
                            }
                        }
                    }
                }
            });
        }
    }

    public void adjustCameraParameters() {
        SortedSet<Size> sizes = this.mPreviewSizes.sizes(this.mAspectRatio);
        if (sizes == null) {
            AspectRatio chooseAspectRatio = chooseAspectRatio();
            this.mAspectRatio = chooseAspectRatio;
            sizes = this.mPreviewSizes.sizes(chooseAspectRatio);
        }
        Size chooseOptimalSize = chooseOptimalSize(sizes);
        this.mPictureSize = this.mPictureSizes.sizes(this.mAspectRatio).last();
        boolean z = this.mIsPreviewActive;
        if (z) {
            this.mCamera.stopPreview();
            this.mIsPreviewActive = false;
        }
        this.mCameraParameters.setPreviewSize(chooseOptimalSize.getWidth(), chooseOptimalSize.getHeight());
        this.mCameraParameters.setPictureSize(this.mPictureSize.getWidth(), this.mPictureSize.getHeight());
        int i = this.mOrientation;
        if (i != 0) {
            this.mCameraParameters.setRotation(calcCameraRotation(orientationEnumToRotation(i)));
        } else {
            this.mCameraParameters.setRotation(calcCameraRotation(this.mDeviceOrientation));
        }
        setAutoFocusInternal(this.mAutoFocus);
        setFlashInternal(this.mFlash);
        setExposureInternal(this.mExposure);
        setAspectRatio(this.mAspectRatio);
        setZoomInternal(this.mZoom);
        setWhiteBalanceInternal(this.mWhiteBalance);
        setScanningInternal(this.mIsScanning);
        setPlaySoundInternal(this.mPlaySoundOnCapture.booleanValue());
        try {
            this.mCamera.setParameters(this.mCameraParameters);
        } catch (RuntimeException unused) {
        }
        if (z) {
            startCameraPreview();
        }
    }

    public int displayOrientationToOrientationEnum(int i) {
        if (i == 90) {
            return 4;
        }
        if (i != 180) {
            return i != 270 ? 1 : 3;
        }
        return 2;
    }

    @Override // com.google.android.cameraview.CameraViewImpl
    public AspectRatio getAspectRatio() {
        return this.mAspectRatio;
    }

    @Override // com.google.android.cameraview.CameraViewImpl
    public boolean getAutoFocus() {
        if (!isCameraOpened()) {
            return this.mAutoFocus;
        }
        String focusMode = this.mCameraParameters.getFocusMode();
        return focusMode != null && focusMode.contains("continuous");
    }

    @Override // com.google.android.cameraview.CameraViewImpl
    public SortedSet<Size> getAvailablePictureSizes(AspectRatio aspectRatio) {
        return this.mPictureSizes.sizes(aspectRatio);
    }

    @Override // com.google.android.cameraview.CameraViewImpl
    public String getCameraId() {
        return this._mCameraId;
    }

    @Override // com.google.android.cameraview.CameraViewImpl
    public List<Properties> getCameraIds() {
        ArrayList arrayList = new ArrayList();
        Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
        int numberOfCameras = Camera.getNumberOfCameras();
        for (int i = 0; i < numberOfCameras; i++) {
            Properties properties = new Properties();
            Camera.getCameraInfo(i, cameraInfo);
            properties.put("id", String.valueOf(i));
            properties.put("type", String.valueOf(cameraInfo.facing));
            arrayList.add(properties);
        }
        return arrayList;
    }

    @Override // com.google.android.cameraview.CameraViewImpl
    public int getCameraOrientation() {
        return this.mCameraInfo.orientation;
    }

    @Override // com.google.android.cameraview.CameraViewImpl
    public float getExposureCompensation() {
        return this.mExposure;
    }

    @Override // com.google.android.cameraview.CameraViewImpl
    public int getFacing() {
        return this.mFacing;
    }

    @Override // com.google.android.cameraview.CameraViewImpl
    public int getFlash() {
        return this.mFlash;
    }

    @Override // com.google.android.cameraview.CameraViewImpl
    public float getFocusDepth() {
        return 0.0f;
    }

    @Override // com.google.android.cameraview.CameraViewImpl
    public Size getPictureSize() {
        return this.mPictureSize;
    }

    @Override // com.google.android.cameraview.CameraViewImpl
    public boolean getPlaySoundOnCapture() {
        return this.mPlaySoundOnCapture.booleanValue();
    }

    @Override // com.google.android.cameraview.CameraViewImpl
    public Size getPreviewSize() {
        Camera.Size previewSize = this.mCameraParameters.getPreviewSize();
        return new Size(previewSize.width, previewSize.height);
    }

    @Override // com.google.android.cameraview.CameraViewImpl
    public boolean getScanning() {
        return this.mIsScanning;
    }

    @Override // com.google.android.cameraview.CameraViewImpl
    public Set<AspectRatio> getSupportedAspectRatios() {
        SizeMap sizeMap = this.mPreviewSizes;
        for (AspectRatio aspectRatio : sizeMap.ratios()) {
            if (this.mPictureSizes.sizes(aspectRatio) == null) {
                sizeMap.remove(aspectRatio);
            }
        }
        return sizeMap.ratios();
    }

    @Override // com.google.android.cameraview.CameraViewImpl
    public ArrayList<int[]> getSupportedPreviewFpsRange() {
        return (ArrayList) this.mCameraParameters.getSupportedPreviewFpsRange();
    }

    @Override // com.google.android.cameraview.CameraViewImpl
    public int getWhiteBalance() {
        return this.mWhiteBalance;
    }

    @Override // com.google.android.cameraview.CameraViewImpl
    public float getZoom() {
        return this.mZoom;
    }

    @Override // com.google.android.cameraview.CameraViewImpl
    public boolean isCameraOpened() {
        return this.mCamera != null;
    }

    public void onError(MediaRecorder mediaRecorder, int i, int i2) {
        stopRecording();
    }

    public void onInfo(MediaRecorder mediaRecorder, int i, int i2) {
        if (i == 800 || i == 801) {
            stopRecording();
        }
    }

    public void onPreviewFrame(byte[] bArr, Camera camera) {
        Camera.Size previewSize = this.mCameraParameters.getPreviewSize();
        this.mCallback.onFramePreview(bArr, previewSize.width, previewSize.height, this.mDeviceOrientation);
    }

    public int orientationEnumToRotation(int i) {
        if (i == 1) {
            return 0;
        }
        if (i == 2) {
            return 180;
        }
        if (i != 3) {
            return i != 4 ? 1 : 90;
        }
        return 270;
    }

    @Override // com.google.android.cameraview.CameraViewImpl
    public void pausePreview() {
        synchronized (this) {
            this.mIsPreviewActive = false;
            this.mShowingPreview = false;
            if (this.mCamera != null) {
                this.mCamera.stopPreview();
            }
        }
    }

    @Override // com.google.android.cameraview.CameraViewImpl
    public boolean record(String str, int i, int i2, boolean z, CamcorderProfile camcorderProfile, int i3, int i4) {
        if (!this.isPictureCaptureInProgress.get() && this.mIsRecording.compareAndSet(false, true)) {
            if (i3 != 0) {
                this.mOrientation = i3;
            }
            try {
                setUpMediaRecorder(str, i, i2, z, camcorderProfile, i4);
                this.mMediaRecorder.prepare();
                this.mMediaRecorder.start();
                try {
                    this.mCamera.setParameters(this.mCameraParameters);
                } catch (Exception unused) {
                }
                int displayOrientationToOrientationEnum = displayOrientationToOrientationEnum(this.mDeviceOrientation);
                this.mCallback.onRecordingStart(str, this.mOrientation != 0 ? this.mOrientation : displayOrientationToOrientationEnum, displayOrientationToOrientationEnum);
                return true;
            } catch (Exception unused2) {
                this.mIsRecording.set(false);
            }
        }
        return false;
    }

    @Override // com.google.android.cameraview.CameraViewImpl
    public void resumePreview() {
        this.mBgHandler.post(new Runnable() {
            /* class com.google.android.cameraview.Camera1.RunnableC09243 */

            public void run() {
                synchronized (this) {
                    Camera1.this.mShowingPreview = true;
                    Camera1.this.startCameraPreview();
                }
            }
        });
    }

    @Override // com.google.android.cameraview.CameraViewImpl
    public boolean setAspectRatio(AspectRatio aspectRatio) {
        if (this.mAspectRatio == null || !isCameraOpened()) {
            this.mAspectRatio = aspectRatio;
            return true;
        } else if (this.mAspectRatio.equals(aspectRatio) || this.mPreviewSizes.sizes(aspectRatio) == null) {
            return false;
        } else {
            this.mAspectRatio = aspectRatio;
            this.mBgHandler.post(new Runnable() {
                /* class com.google.android.cameraview.Camera1.RunnableC09276 */

                public void run() {
                    synchronized (Camera1.this) {
                        if (Camera1.this.mCamera != null) {
                            Camera1.this.adjustCameraParameters();
                        }
                    }
                }
            });
            return true;
        }
    }

    @Override // com.google.android.cameraview.CameraViewImpl
    public void setAutoFocus(boolean z) {
        if (this.mAutoFocus != z) {
            synchronized (this) {
                if (setAutoFocusInternal(z)) {
                    try {
                        if (this.mCamera != null) {
                            this.mCamera.setParameters(this.mCameraParameters);
                        }
                    } catch (RuntimeException unused) {
                    }
                }
            }
        }
    }

    @Override // com.google.android.cameraview.CameraViewImpl
    public void setCameraId(String str) {
        if (!C5308ILiI.OooO00o(this._mCameraId, str)) {
            this._mCameraId = str;
            if (!C5308ILiI.OooO00o(str, String.valueOf(this.mCameraId))) {
                this.mBgHandler.post(new Runnable() {
                    /* class com.google.android.cameraview.Camera1.RunnableC09265 */

                    public void run() {
                        if (Camera1.this.isCameraOpened()) {
                            Camera1.this.stop();
                            Camera1.this.start();
                        }
                    }
                });
            }
        }
    }

    @Override // com.google.android.cameraview.CameraViewImpl
    public void setDeviceOrientation(int i) {
        synchronized (this) {
            if (this.mDeviceOrientation != i) {
                this.mDeviceOrientation = i;
                if (isCameraOpened() && this.mOrientation == 0 && !this.mIsRecording.get() && !this.isPictureCaptureInProgress.get()) {
                    this.mCameraParameters.setRotation(calcCameraRotation(i));
                    try {
                        this.mCamera.setParameters(this.mCameraParameters);
                    } catch (RuntimeException unused) {
                    }
                }
            }
        }
    }

    @Override // com.google.android.cameraview.CameraViewImpl
    public void setDisplayOrientation(int i) {
        synchronized (this) {
            if (this.mDisplayOrientation != i) {
                this.mDisplayOrientation = i;
                if (isCameraOpened()) {
                    boolean z = this.mIsPreviewActive && Build.VERSION.SDK_INT < 14;
                    if (z) {
                        this.mCamera.stopPreview();
                        this.mIsPreviewActive = false;
                    }
                    try {
                        this.mCamera.setDisplayOrientation(calcDisplayOrientation(i));
                    } catch (RuntimeException unused) {
                    }
                    if (z) {
                        startCameraPreview();
                    }
                }
            }
        }
    }

    @Override // com.google.android.cameraview.CameraViewImpl
    public void setExposureCompensation(float f) {
        if (f != this.mExposure && setExposureInternal(f)) {
            try {
                if (this.mCamera != null) {
                    this.mCamera.setParameters(this.mCameraParameters);
                }
            } catch (RuntimeException unused) {
            }
        }
    }

    @Override // com.google.android.cameraview.CameraViewImpl
    public void setFacing(int i) {
        if (this.mFacing != i) {
            this.mFacing = i;
            this.mBgHandler.post(new Runnable() {
                /* class com.google.android.cameraview.Camera1.RunnableC09254 */

                public void run() {
                    if (Camera1.this.isCameraOpened()) {
                        Camera1.this.stop();
                        Camera1.this.start();
                    }
                }
            });
        }
    }

    @Override // com.google.android.cameraview.CameraViewImpl
    public void setFlash(int i) {
        if (i != this.mFlash && setFlashInternal(i)) {
            try {
                if (this.mCamera != null) {
                    this.mCamera.setParameters(this.mCameraParameters);
                }
            } catch (RuntimeException unused) {
            }
        }
    }

    @Override // com.google.android.cameraview.CameraViewImpl
    public void setFocusArea(final float f, final float f2) {
        this.mBgHandler.post(new Runnable() {
            /* class com.google.android.cameraview.Camera1.RunnableC09309 */

            /* JADX WARNING: Failed to process nested try/catch */
            /* JADX WARNING: Missing exception handler attribute for start block: B:32:0x0082 */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void run() {
                /*
                // Method dump skipped, instructions count: 211
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.android.cameraview.Camera1.RunnableC09309.run():void");
            }
        });
    }

    @Override // com.google.android.cameraview.CameraViewImpl
    public void setFocusDepth(float f) {
    }

    @Override // com.google.android.cameraview.CameraViewImpl
    public void setPictureSize(Size size) {
        if (size == null) {
            AspectRatio aspectRatio = this.mAspectRatio;
            if (aspectRatio != null) {
                SortedSet<Size> sizes = this.mPictureSizes.sizes(aspectRatio);
                if (sizes != null && !sizes.isEmpty()) {
                    this.mPictureSize = sizes.last();
                }
            } else {
                return;
            }
        } else {
            this.mPictureSize = size;
        }
        synchronized (this) {
            if (!(this.mCameraParameters == null || this.mCamera == null)) {
                this.mCameraParameters.setPictureSize(this.mPictureSize.getWidth(), this.mPictureSize.getHeight());
                try {
                    this.mCamera.setParameters(this.mCameraParameters);
                } catch (RuntimeException unused) {
                }
            }
        }
    }

    @Override // com.google.android.cameraview.CameraViewImpl
    public void setPlaySoundOnCapture(boolean z) {
        if (z != this.mPlaySoundOnCapture.booleanValue()) {
            setPlaySoundInternal(z);
        }
    }

    @Override // com.google.android.cameraview.CameraViewImpl
    public void setPreviewTexture(final SurfaceTexture surfaceTexture) {
        this.mBgHandler.post(new Runnable() {
            /* class com.google.android.cameraview.Camera1.RunnableC09298 */

            public void run() {
                try {
                    if (Camera1.this.mCamera == null) {
                        Camera1.this.mPreviewTexture = surfaceTexture;
                        return;
                    }
                    Camera1.this.mCamera.stopPreview();
                    Camera1.this.mIsPreviewActive = false;
                    if (surfaceTexture == null) {
                        Camera1.this.mCamera.setPreviewTexture((SurfaceTexture) Camera1.this.mPreview.getSurfaceTexture());
                    } else {
                        Camera1.this.mCamera.setPreviewTexture(surfaceTexture);
                    }
                    Camera1.this.mPreviewTexture = surfaceTexture;
                    Camera1.this.startCameraPreview();
                } catch (IOException unused) {
                }
            }
        });
    }

    @Override // com.google.android.cameraview.CameraViewImpl
    public void setScanning(boolean z) {
        if (z != this.mIsScanning) {
            setScanningInternal(z);
        }
    }

    @SuppressLint({"NewApi"})
    public void setUpPreview() {
        try {
            this.surfaceWasDestroyed = false;
            if (this.mCamera == null) {
                return;
            }
            if (this.mPreviewTexture != null) {
                this.mCamera.setPreviewTexture(this.mPreviewTexture);
            } else if (this.mPreview.getOutputClass() == SurfaceHolder.class) {
                boolean z = this.mIsPreviewActive && Build.VERSION.SDK_INT < 14;
                if (z) {
                    this.mCamera.stopPreview();
                    this.mIsPreviewActive = false;
                }
                this.mCamera.setPreviewDisplay(this.mPreview.getSurfaceHolder());
                if (z) {
                    startCameraPreview();
                }
            } else {
                this.mCamera.setPreviewTexture((SurfaceTexture) this.mPreview.getSurfaceTexture());
            }
        } catch (Exception unused) {
        }
    }

    @Override // com.google.android.cameraview.CameraViewImpl
    public void setWhiteBalance(int i) {
        if (i != this.mWhiteBalance && setWhiteBalanceInternal(i)) {
            try {
                if (this.mCamera != null) {
                    this.mCamera.setParameters(this.mCameraParameters);
                }
            } catch (RuntimeException unused) {
            }
        }
    }

    @Override // com.google.android.cameraview.CameraViewImpl
    public void setZoom(float f) {
        if (f != this.mZoom && setZoomInternal(f)) {
            try {
                if (this.mCamera != null) {
                    this.mCamera.setParameters(this.mCameraParameters);
                }
            } catch (RuntimeException unused) {
            }
        }
    }

    @Override // com.google.android.cameraview.CameraViewImpl
    public boolean start() {
        synchronized (this) {
            chooseCamera();
            if (!openCamera()) {
                this.mCallback.onMountError();
                return true;
            }
            if (this.mPreview.isReady()) {
                setUpPreview();
                if (this.mShowingPreview) {
                    startCameraPreview();
                }
            }
            return true;
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:5|6|7|8|9|(3:12|(1:14)(1:15)|16)) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x000b */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x001f  */
    @Override // com.google.android.cameraview.CameraViewImpl
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void stop() {
        /*
            r5 = this;
            monitor-enter(r5)
            android.media.MediaRecorder r0 = r5.mMediaRecorder     // Catch:{ all -> 0x005a }
            r1 = 0
            if (r0 == 0) goto L_0x0039
            android.media.MediaRecorder r0 = r5.mMediaRecorder     // Catch:{ RuntimeException -> 0x000b }
            r0.stop()     // Catch:{ RuntimeException -> 0x000b }
        L_0x000b:
            android.media.MediaRecorder r0 = r5.mMediaRecorder     // Catch:{ RuntimeException -> 0x0015 }
            r0.reset()     // Catch:{ RuntimeException -> 0x0015 }
            android.media.MediaRecorder r0 = r5.mMediaRecorder     // Catch:{ RuntimeException -> 0x0015 }
            r0.release()     // Catch:{ RuntimeException -> 0x0015 }
        L_0x0015:
            r5.mMediaRecorder = r1
            java.util.concurrent.atomic.AtomicBoolean r0 = r5.mIsRecording
            boolean r0 = r0.get()
            if (r0 == 0) goto L_0x0039
            com.google.android.cameraview.CameraViewImpl$Callback r0 = r5.mCallback
            r0.onRecordingEnd()
            int r0 = r5.mDeviceOrientation
            int r0 = r5.displayOrientationToOrientationEnum(r0)
            com.google.android.cameraview.CameraViewImpl$Callback r2 = r5.mCallback
            java.lang.String r3 = r5.mVideoPath
            int r4 = r5.mOrientation
            if (r4 == 0) goto L_0x0035
            int r4 = r5.mOrientation
            goto L_0x0036
        L_0x0035:
            r4 = r0
        L_0x0036:
            r2.onVideoRecorded(r3, r4, r0)
        L_0x0039:
            android.hardware.Camera r0 = r5.mCamera
            if (r0 == 0) goto L_0x0055
            r0 = 0
            r5.mIsPreviewActive = r0
            android.hardware.Camera r0 = r5.mCamera     // Catch:{ Exception -> 0x004a }
            r0.stopPreview()     // Catch:{ Exception -> 0x004a }
            android.hardware.Camera r0 = r5.mCamera     // Catch:{ Exception -> 0x004a }
            r0.setPreviewCallback(r1)     // Catch:{ Exception -> 0x004a }
        L_0x004a:
            com.google.android.cameraview.AutoFocusManager r0 = r5.autoFocusManager
            if (r0 == 0) goto L_0x0055
            com.google.android.cameraview.AutoFocusManager r0 = r5.autoFocusManager
            r0.stop()
            r5.autoFocusManager = r1
        L_0x0055:
            r5.releaseCamera()
            monitor-exit(r5)
            return
        L_0x005a:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.cameraview.Camera1.stop():void");
    }

    @Override // com.google.android.cameraview.CameraViewImpl
    public void stopRecording() {
        if (this.mIsRecording.compareAndSet(true, false)) {
            stopMediaRecorder();
            Camera camera = this.mCamera;
            if (camera != null) {
                camera.lock();
            }
            if (this.mustUpdateSurface) {
                updateSurface();
            }
        }
    }

    @Override // com.google.android.cameraview.CameraViewImpl
    public void takePicture(ReadableMap readableMap) {
        if (!isCameraOpened()) {
            throw new IllegalStateException("Camera is not ready. Call start() before takePicture().");
        } else if (this.mIsPreviewActive) {
            takePictureInternal(readableMap);
        } else {
            throw new IllegalStateException("Preview is paused - resume it before taking a picture.");
        }
    }

    public void takePictureInternal(final ReadableMap readableMap) {
        if (this.mIsRecording.get() || !this.isPictureCaptureInProgress.compareAndSet(false, true)) {
            throw new IllegalStateException("Camera capture failed. Camera is already capturing.");
        }
        try {
            if (readableMap.hasKey("orientation") && readableMap.getInt("orientation") != 0) {
                int i = readableMap.getInt("orientation");
                this.mOrientation = i;
                this.mCameraParameters.setRotation(calcCameraRotation(orientationEnumToRotation(i)));
                try {
                    this.mCamera.setParameters(this.mCameraParameters);
                } catch (RuntimeException unused) {
                }
            }
            if (readableMap.hasKey("quality")) {
                this.mCameraParameters.setJpegQuality((int) (readableMap.getDouble("quality") * 100.0d));
                try {
                    this.mCamera.setParameters(this.mCameraParameters);
                } catch (RuntimeException unused2) {
                }
            }
            this.mCamera.takePicture(null, null, null, new Camera.PictureCallback() {
                /* class com.google.android.cameraview.Camera1.C09287 */

                public void onPictureTaken(byte[] bArr, Camera camera) {
                    if (Camera1.this.mPlaySoundOnCapture.booleanValue()) {
                        Camera1.this.sound.play(0);
                    }
                    synchronized (Camera1.this) {
                        if (Camera1.this.mCamera != null) {
                            if (!readableMap.hasKey("pauseAfterCapture") || readableMap.getBoolean("pauseAfterCapture")) {
                                Camera1.this.mCamera.stopPreview();
                                Camera1.this.mIsPreviewActive = false;
                                Camera1.this.mCamera.setPreviewCallback(null);
                            } else {
                                Camera1.this.mCamera.startPreview();
                                Camera1.this.mIsPreviewActive = true;
                                if (Camera1.this.mIsScanning) {
                                    Camera1.this.mCamera.setPreviewCallback(Camera1.this);
                                }
                            }
                        }
                    }
                    Camera1.this.isPictureCaptureInProgress.set(false);
                    Camera1.this.mOrientation = 0;
                    Camera1 camera1 = Camera1.this;
                    camera1.mCallback.onPictureTaken(bArr, camera1.displayOrientationToOrientationEnum(camera1.mDeviceOrientation));
                    if (Camera1.this.mustUpdateSurface) {
                        Camera1.this.updateSurface();
                    }
                }
            });
        } catch (Exception e) {
            this.isPictureCaptureInProgress.set(false);
            throw e;
        }
    }
}

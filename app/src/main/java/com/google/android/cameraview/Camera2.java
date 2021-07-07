package com.google.android.cameraview;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.hardware.camera2.params.MeteringRectangle;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.media.CamcorderProfile;
import android.media.ImageReader;
import android.media.MediaActionSound;
import android.media.MediaRecorder;
import android.os.Handler;
import android.os.Looper;
import android.util.Size;
import android.util.SparseIntArray;
import android.view.Surface;
import androidx.annotation.NonNull;
import com.facebook.react.bridge.ReadableMap;
import com.google.android.cameraview.CameraViewImpl;
import com.google.android.cameraview.PreviewImpl;
import com.p118pd.sdk.C5308ILiI;
import com.umeng.message.proguard.C3848l;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Properties;
import java.util.Set;
import java.util.SortedSet;

@TargetApi(21)
public class Camera2 extends CameraViewImpl implements MediaRecorder.OnInfoListener, MediaRecorder.OnErrorListener {
    public static final int FOCUS_AREA_SIZE_DEFAULT = 300;
    public static final int FOCUS_METERING_AREA_WEIGHT_DEFAULT = 1000;
    public static final SparseIntArray INTERNAL_FACINGS;
    public static final int MAX_PREVIEW_HEIGHT = 1080;
    public static final int MAX_PREVIEW_WIDTH = 1920;
    public static final String TAG = "Camera2";
    public String _mCameraId;
    public AspectRatio mAspectRatio = Constants.DEFAULT_ASPECT_RATIO;
    public boolean mAutoFocus;
    public Set<String> mAvailableCameras = new HashSet();
    public CameraDevice mCamera;
    public CameraCharacteristics mCameraCharacteristics;
    public final CameraDevice.StateCallback mCameraDeviceCallback = new CameraDevice.StateCallback() {
        /* class com.google.android.cameraview.Camera2.C09341 */

        public void onClosed(@NonNull CameraDevice cameraDevice) {
            Camera2.this.mCallback.onCameraClosed();
        }

        public void onDisconnected(@NonNull CameraDevice cameraDevice) {
            Camera2.this.mCamera = null;
        }

        public void onError(@NonNull CameraDevice cameraDevice, int i) {
            String str = "onError: " + cameraDevice.getId() + " (" + i + C3848l.f10402t;
            Camera2.this.mCamera = null;
        }

        public void onOpened(@NonNull CameraDevice cameraDevice) {
            Camera2 camera2 = Camera2.this;
            camera2.mCamera = cameraDevice;
            camera2.mCallback.onCameraOpened();
            Camera2.this.startCaptureSession();
        }
    };
    public String mCameraId;
    public final CameraManager mCameraManager;
    public int mCameraOrientation;
    public PictureCaptureCallback mCaptureCallback = new PictureCaptureCallback() {
        /* class com.google.android.cameraview.Camera2.C09363 */

        @Override // com.google.android.cameraview.Camera2.PictureCaptureCallback
        public void onPrecaptureRequired() {
            Camera2.this.mPreviewRequestBuilder.set(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER, 1);
            setState(3);
            try {
                Camera2.this.mCaptureSession.capture(Camera2.this.mPreviewRequestBuilder.build(), this, null);
                Camera2.this.mPreviewRequestBuilder.set(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER, 0);
            } catch (CameraAccessException unused) {
            }
        }

        @Override // com.google.android.cameraview.Camera2.PictureCaptureCallback
        public void onReady() {
            Camera2.this.captureStillPicture();
        }
    };
    public CameraCaptureSession mCaptureSession;
    public int mDeviceOrientation;
    public int mDisplayOrientation;
    public float mExposure;
    public int mFacing;
    public int mFlash;
    public float mFocusDepth;
    public int mImageFormat;
    public Rect mInitialCropRegion;
    public AspectRatio mInitialRatio;
    public boolean mIsRecording;
    public boolean mIsScanning;
    public MediaRecorder mMediaRecorder;
    public final ImageReader.OnImageAvailableListener mOnImageAvailableListener = new ImageReader.OnImageAvailableListener() {
        /* class com.google.android.cameraview.Camera2.C09374 */

        /* JADX WARNING: Code restructure failed: missing block: B:14:0x004b, code lost:
            r1 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x004c, code lost:
            if (r6 != null) goto L_0x004e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
            r6.close();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x0052, code lost:
            r6 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:0x0053, code lost:
            r0.addSuppressed(r6);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:0x0056, code lost:
            throw r1;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onImageAvailable(android.media.ImageReader r6) {
            /*
                r5 = this;
                android.media.Image r6 = r6.acquireNextImage()
                android.media.Image$Plane[] r0 = r6.getPlanes()     // Catch:{ all -> 0x0049 }
                int r1 = r0.length     // Catch:{ all -> 0x0049 }
                if (r1 <= 0) goto L_0x0043
                r1 = 0
                r0 = r0[r1]     // Catch:{ all -> 0x0049 }
                java.nio.ByteBuffer r0 = r0.getBuffer()     // Catch:{ all -> 0x0049 }
                int r2 = r0.remaining()     // Catch:{ all -> 0x0049 }
                byte[] r2 = new byte[r2]     // Catch:{ all -> 0x0049 }
                r0.get(r2)     // Catch:{ all -> 0x0049 }
                int r0 = r6.getFormat()     // Catch:{ all -> 0x0049 }
                r3 = 256(0x100, float:3.59E-43)
                if (r0 != r3) goto L_0x002b
                com.google.android.cameraview.Camera2 r0 = com.google.android.cameraview.Camera2.this     // Catch:{ all -> 0x0049 }
                com.google.android.cameraview.CameraViewImpl$Callback r0 = r0.mCallback     // Catch:{ all -> 0x0049 }
                r0.onPictureTaken(r2, r1)     // Catch:{ all -> 0x0049 }
                goto L_0x0040
            L_0x002b:
                com.google.android.cameraview.Camera2 r0 = com.google.android.cameraview.Camera2.this     // Catch:{ all -> 0x0049 }
                com.google.android.cameraview.CameraViewImpl$Callback r0 = r0.mCallback     // Catch:{ all -> 0x0049 }
                int r1 = r6.getWidth()     // Catch:{ all -> 0x0049 }
                int r3 = r6.getHeight()     // Catch:{ all -> 0x0049 }
                com.google.android.cameraview.Camera2 r4 = com.google.android.cameraview.Camera2.this     // Catch:{ all -> 0x0049 }
                int r4 = com.google.android.cameraview.Camera2.access$100(r4)     // Catch:{ all -> 0x0049 }
                r0.onFramePreview(r2, r1, r3, r4)     // Catch:{ all -> 0x0049 }
            L_0x0040:
                r6.close()     // Catch:{ all -> 0x0049 }
            L_0x0043:
                if (r6 == 0) goto L_0x0048
                r6.close()
            L_0x0048:
                return
            L_0x0049:
                r0 = move-exception
                throw r0     // Catch:{ all -> 0x004b }
            L_0x004b:
                r1 = move-exception
                if (r6 == 0) goto L_0x0056
                r6.close()     // Catch:{ all -> 0x0052 }
                goto L_0x0056
            L_0x0052:
                r6 = move-exception
                r0.addSuppressed(r6)
            L_0x0056:
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.cameraview.Camera2.C09374.onImageAvailable(android.media.ImageReader):void");
        }
    };
    public Size mPictureSize;
    public final SizeMap mPictureSizes = new SizeMap();
    public Boolean mPlaySoundOnCapture = false;
    public CaptureRequest.Builder mPreviewRequestBuilder;
    public final SizeMap mPreviewSizes = new SizeMap();
    public Surface mPreviewSurface;
    public ImageReader mScanImageReader;
    public final CameraCaptureSession.StateCallback mSessionCallback = new CameraCaptureSession.StateCallback() {
        /* class com.google.android.cameraview.Camera2.C09352 */

        public void onClosed(@NonNull CameraCaptureSession cameraCaptureSession) {
            CameraCaptureSession cameraCaptureSession2 = Camera2.this.mCaptureSession;
            if (cameraCaptureSession2 != null && cameraCaptureSession2.equals(cameraCaptureSession)) {
                Camera2.this.mCaptureSession = null;
            }
        }

        public void onConfigureFailed(@NonNull CameraCaptureSession cameraCaptureSession) {
        }

        public void onConfigured(@NonNull CameraCaptureSession cameraCaptureSession) {
            Camera2 camera2 = Camera2.this;
            if (camera2.mCamera != null) {
                camera2.mCaptureSession = cameraCaptureSession;
                camera2.mInitialCropRegion = (Rect) camera2.mPreviewRequestBuilder.get(CaptureRequest.SCALER_CROP_REGION);
                Camera2.this.updateAutoFocus();
                Camera2.this.updateFlash();
                Camera2.this.updateFocusDepth();
                Camera2.this.updateWhiteBalance();
                Camera2.this.updateZoom();
                try {
                    Camera2.this.mCaptureSession.setRepeatingRequest(Camera2.this.mPreviewRequestBuilder.build(), Camera2.this.mCaptureCallback, null);
                } catch (CameraAccessException | IllegalStateException unused) {
                }
            }
        }
    };
    public ImageReader mStillImageReader;
    public String mVideoPath;
    public int mWhiteBalance;
    public float mZoom;
    public MediaActionSound sound = new MediaActionSound();

    public static abstract class PictureCaptureCallback extends CameraCaptureSession.CaptureCallback {
        public static final int STATE_CAPTURING = 5;
        public static final int STATE_LOCKED = 2;
        public static final int STATE_LOCKING = 1;
        public static final int STATE_PRECAPTURE = 3;
        public static final int STATE_PREVIEW = 0;
        public static final int STATE_WAITING = 4;
        public ReadableMap mOptions = null;
        public int mState;

        private void process(@NonNull CaptureResult captureResult) {
            int i = this.mState;
            if (i == 1) {
                Integer num = (Integer) captureResult.get(CaptureResult.CONTROL_AF_STATE);
                if (num != null) {
                    if (num.intValue() == 4 || num.intValue() == 5) {
                        Integer num2 = (Integer) captureResult.get(CaptureResult.CONTROL_AE_STATE);
                        if (num2 == null || num2.intValue() == 2) {
                            setState(5);
                            onReady();
                            return;
                        }
                        setState(2);
                        onPrecaptureRequired();
                    }
                }
            } else if (i == 3) {
                Integer num3 = (Integer) captureResult.get(CaptureResult.CONTROL_AE_STATE);
                if (num3 == null || num3.intValue() == 5 || num3.intValue() == 4 || num3.intValue() == 2) {
                    setState(4);
                }
            } else if (i == 4) {
                Integer num4 = (Integer) captureResult.get(CaptureResult.CONTROL_AE_STATE);
                if (num4 == null || num4.intValue() != 5) {
                    setState(5);
                    onReady();
                }
            }
        }

        public ReadableMap getOptions() {
            return this.mOptions;
        }

        public void onCaptureCompleted(@NonNull CameraCaptureSession cameraCaptureSession, @NonNull CaptureRequest captureRequest, @NonNull TotalCaptureResult totalCaptureResult) {
            process(totalCaptureResult);
        }

        public void onCaptureProgressed(@NonNull CameraCaptureSession cameraCaptureSession, @NonNull CaptureRequest captureRequest, @NonNull CaptureResult captureResult) {
            process(captureResult);
        }

        public abstract void onPrecaptureRequired();

        public abstract void onReady();

        public void setOptions(ReadableMap readableMap) {
            this.mOptions = readableMap;
        }

        public void setState(int i) {
            this.mState = i;
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        INTERNAL_FACINGS = sparseIntArray;
        sparseIntArray.put(0, 1);
        INTERNAL_FACINGS.put(1, 0);
    }

    public Camera2(CameraViewImpl.Callback callback, PreviewImpl previewImpl, Context context, Handler handler) {
        super(callback, previewImpl, handler);
        CameraManager cameraManager = (CameraManager) context.getSystemService("camera");
        this.mCameraManager = cameraManager;
        cameraManager.registerAvailabilityCallback(new CameraManager.AvailabilityCallback() {
            /* class com.google.android.cameraview.Camera2.C09385 */

            public void onCameraAvailable(@NonNull String str) {
                super.onCameraAvailable(str);
                Camera2.this.mAvailableCameras.add(str);
            }

            public void onCameraUnavailable(@NonNull String str) {
                super.onCameraUnavailable(str);
                Camera2.this.mAvailableCameras.remove(str);
            }
        }, (Handler) null);
        this.mImageFormat = this.mIsScanning ? 35 : 256;
        this.mPreview.setCallback(new PreviewImpl.Callback() {
            /* class com.google.android.cameraview.Camera2.C09396 */

            @Override // com.google.android.cameraview.PreviewImpl.Callback
            public void onSurfaceChanged() {
                Camera2.this.startCaptureSession();
            }

            @Override // com.google.android.cameraview.PreviewImpl.Callback
            public void onSurfaceDestroyed() {
                Camera2.this.stop();
            }
        });
    }

    private MeteringRectangle calculateFocusArea(float f, float f2) {
        Rect rect = (Rect) this.mCameraCharacteristics.get(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
        return new MeteringRectangle(Math.max(((int) (f * ((float) rect.width()))) - 150, 0), Math.max(((int) (f2 * ((float) rect.height()))) - 150, 0), 300, 300, 999);
    }

    private boolean chooseCameraIdByFacing() {
        String str = this._mCameraId;
        if (str == null) {
            try {
                int i = INTERNAL_FACINGS.get(this.mFacing);
                String[] cameraIdList = this.mCameraManager.getCameraIdList();
                if (cameraIdList.length == 0) {
                    return false;
                }
                for (String str2 : cameraIdList) {
                    CameraCharacteristics cameraCharacteristics = this.mCameraManager.getCameraCharacteristics(str2);
                    Integer num = (Integer) cameraCharacteristics.get(CameraCharacteristics.LENS_FACING);
                    if (num != null) {
                        if (num.intValue() == i) {
                            this.mCameraId = str2;
                            this.mCameraCharacteristics = cameraCharacteristics;
                            return true;
                        }
                    }
                }
                String str3 = cameraIdList[0];
                this.mCameraId = str3;
                CameraCharacteristics cameraCharacteristics2 = this.mCameraManager.getCameraCharacteristics(str3);
                this.mCameraCharacteristics = cameraCharacteristics2;
                Integer num2 = (Integer) cameraCharacteristics2.get(CameraCharacteristics.LENS_FACING);
                if (num2 == null) {
                    return false;
                }
                int size = INTERNAL_FACINGS.size();
                for (int i2 = 0; i2 < size; i2++) {
                    if (INTERNAL_FACINGS.valueAt(i2) == num2.intValue()) {
                        this.mFacing = INTERNAL_FACINGS.keyAt(i2);
                        return true;
                    }
                }
                this.mFacing = 0;
                return true;
            } catch (CameraAccessException unused) {
                return false;
            }
        } else {
            try {
                CameraCharacteristics cameraCharacteristics3 = this.mCameraManager.getCameraCharacteristics(str);
                this.mCameraCharacteristics = cameraCharacteristics3;
                Integer num3 = (Integer) cameraCharacteristics3.get(CameraCharacteristics.LENS_FACING);
                if (num3 == null) {
                    return false;
                }
                int size2 = INTERNAL_FACINGS.size();
                int i3 = 0;
                while (true) {
                    if (i3 >= size2) {
                        break;
                    } else if (INTERNAL_FACINGS.valueAt(i3) == num3.intValue()) {
                        this.mFacing = INTERNAL_FACINGS.keyAt(i3);
                        break;
                    } else {
                        i3++;
                    }
                }
                this.mCameraId = this._mCameraId;
                return true;
            } catch (Exception unused2) {
                return false;
            }
        }
    }

    private Size chooseOptimalSize() {
        int width = this.mPreview.getWidth();
        int height = this.mPreview.getHeight();
        if (width < height) {
            height = width;
            width = height;
        }
        SortedSet<Size> sizes = this.mPreviewSizes.sizes(this.mAspectRatio);
        for (Size size : sizes) {
            if (size.getWidth() >= width && size.getHeight() >= height) {
                return size;
            }
        }
        return sizes.last();
    }

    private void collectCameraInfo() {
        StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) this.mCameraCharacteristics.get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
        if (streamConfigurationMap != null) {
            this.mPreviewSizes.clear();
            Size[] outputSizes = streamConfigurationMap.getOutputSizes(this.mPreview.getOutputClass());
            for (Size size : outputSizes) {
                int width = size.getWidth();
                int height = size.getHeight();
                if (width <= 1920 && height <= 1080) {
                    this.mPreviewSizes.add(new Size(width, height));
                }
            }
            this.mPictureSizes.clear();
            collectPictureSizes(this.mPictureSizes, streamConfigurationMap);
            if (this.mPictureSize == null) {
                this.mPictureSize = this.mPictureSizes.sizes(this.mAspectRatio).last();
            }
            for (AspectRatio aspectRatio : this.mPreviewSizes.ratios()) {
                if (!this.mPictureSizes.ratios().contains(aspectRatio)) {
                    this.mPreviewSizes.remove(aspectRatio);
                }
            }
            if (!this.mPreviewSizes.ratios().contains(this.mAspectRatio)) {
                this.mAspectRatio = this.mPreviewSizes.ratios().iterator().next();
            }
            this.mCameraOrientation = ((Integer) this.mCameraCharacteristics.get(CameraCharacteristics.SENSOR_ORIENTATION)).intValue();
            return;
        }
        throw new IllegalStateException("Failed to get configuration map: " + this.mCameraId);
    }

    private int getOutputRotation() {
        int intValue = ((Integer) this.mCameraCharacteristics.get(CameraCharacteristics.SENSOR_ORIENTATION)).intValue();
        if (this.mFacing == 0) {
            return (intValue + this.mDeviceOrientation) % 360;
        }
        return ((intValue + this.mDeviceOrientation) + (isLandscape(this.mDeviceOrientation) ? 180 : 0)) % 360;
    }

    private boolean isLandscape(int i) {
        return i == 90 || i == 270;
    }

    public static boolean isLegacy(Context context) {
        try {
            CameraManager cameraManager = (CameraManager) context.getSystemService("camera");
            for (String str : cameraManager.getCameraIdList()) {
                Integer num = (Integer) cameraManager.getCameraCharacteristics(str).get(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
                if (num == null || num.intValue() == 2) {
                    return true;
                }
            }
            return false;
        } catch (CameraAccessException unused) {
            return true;
        }
    }

    private boolean isMeteringAreaAFSupported() {
        return ((Integer) this.mCameraCharacteristics.get(CameraCharacteristics.CONTROL_MAX_REGIONS_AF)).intValue() >= 1;
    }

    private void lockFocus() {
        this.mPreviewRequestBuilder.set(CaptureRequest.CONTROL_AF_TRIGGER, 1);
        try {
            this.mCaptureCallback.setState(1);
            this.mCaptureSession.capture(this.mPreviewRequestBuilder.build(), this.mCaptureCallback, null);
        } catch (CameraAccessException unused) {
        }
    }

    private void prepareScanImageReader() {
        ImageReader imageReader = this.mScanImageReader;
        if (imageReader != null) {
            imageReader.close();
        }
        Size last = this.mPreviewSizes.sizes(this.mAspectRatio).last();
        ImageReader newInstance = ImageReader.newInstance(last.getWidth(), last.getHeight(), 35, 1);
        this.mScanImageReader = newInstance;
        newInstance.setOnImageAvailableListener(this.mOnImageAvailableListener, null);
    }

    private void prepareStillImageReader() {
        ImageReader imageReader = this.mStillImageReader;
        if (imageReader != null) {
            imageReader.close();
        }
        ImageReader newInstance = ImageReader.newInstance(this.mPictureSize.getWidth(), this.mPictureSize.getHeight(), 256, 1);
        this.mStillImageReader = newInstance;
        newInstance.setOnImageAvailableListener(this.mOnImageAvailableListener, null);
    }

    private void setCamcorderProfile(CamcorderProfile camcorderProfile, boolean z) {
        this.mMediaRecorder.setOutputFormat(camcorderProfile.fileFormat);
        this.mMediaRecorder.setVideoFrameRate(camcorderProfile.videoFrameRate);
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

    private void setUpMediaRecorder(String str, int i, int i2, boolean z, CamcorderProfile camcorderProfile) {
        MediaRecorder mediaRecorder = new MediaRecorder();
        this.mMediaRecorder = mediaRecorder;
        mediaRecorder.setVideoSource(2);
        if (z) {
            this.mMediaRecorder.setAudioSource(1);
        }
        this.mMediaRecorder.setOutputFile(str);
        this.mVideoPath = str;
        CamcorderProfile camcorderProfile2 = !CamcorderProfile.hasProfile(Integer.parseInt(this.mCameraId), camcorderProfile.quality) ? CamcorderProfile.get(1) : camcorderProfile;
        camcorderProfile2.videoBitRate = camcorderProfile.videoBitRate;
        setCamcorderProfile(camcorderProfile2, z);
        this.mMediaRecorder.setOrientationHint(getOutputRotation());
        if (i != -1) {
            this.mMediaRecorder.setMaxDuration(i);
        }
        if (i2 != -1) {
            this.mMediaRecorder.setMaxFileSize((long) i2);
        }
        this.mMediaRecorder.setOnInfoListener(this);
        this.mMediaRecorder.setOnErrorListener(this);
    }

    private void startOpeningCamera() {
        try {
            this.mCameraManager.openCamera(this.mCameraId, this.mCameraDeviceCallback, (Handler) null);
        } catch (CameraAccessException e) {
            throw new RuntimeException("Failed to open camera: " + this.mCameraId, e);
        }
    }

    private void stopMediaRecorder() {
        this.mIsRecording = false;
        try {
            this.mCaptureSession.stopRepeating();
            this.mCaptureSession.abortCaptures();
            this.mMediaRecorder.stop();
        } catch (Exception e) {
            e.printStackTrace();
        }
        this.mMediaRecorder.reset();
        this.mMediaRecorder.release();
        this.mMediaRecorder = null;
        this.mCallback.onRecordingEnd();
        if (this.mVideoPath == null || !new File(this.mVideoPath).exists()) {
            this.mCallback.onVideoRecorded(null, 0, 0);
            return;
        }
        this.mCallback.onVideoRecorded(this.mVideoPath, 0, 0);
        this.mVideoPath = null;
    }

    public void captureStillPicture() {
        try {
            CaptureRequest.Builder createCaptureRequest = this.mCamera.createCaptureRequest(2);
            if (this.mIsScanning) {
                this.mImageFormat = 256;
                createCaptureRequest.removeTarget(this.mScanImageReader.getSurface());
            }
            createCaptureRequest.addTarget(this.mStillImageReader.getSurface());
            createCaptureRequest.set(CaptureRequest.CONTROL_AF_MODE, this.mPreviewRequestBuilder.get(CaptureRequest.CONTROL_AF_MODE));
            int i = this.mFlash;
            if (i == 0) {
                createCaptureRequest.set(CaptureRequest.CONTROL_AE_MODE, 1);
                createCaptureRequest.set(CaptureRequest.FLASH_MODE, 0);
            } else if (i == 1) {
                createCaptureRequest.set(CaptureRequest.CONTROL_AE_MODE, 3);
            } else if (i == 2) {
                createCaptureRequest.set(CaptureRequest.CONTROL_AE_MODE, 1);
                createCaptureRequest.set(CaptureRequest.FLASH_MODE, 2);
            } else if (i == 3) {
                createCaptureRequest.set(CaptureRequest.CONTROL_AE_MODE, 2);
            } else if (i == 4) {
                createCaptureRequest.set(CaptureRequest.CONTROL_AE_MODE, 2);
            }
            createCaptureRequest.set(CaptureRequest.JPEG_ORIENTATION, Integer.valueOf(getOutputRotation()));
            if (this.mCaptureCallback.getOptions().hasKey("quality")) {
                createCaptureRequest.set(CaptureRequest.JPEG_QUALITY, Byte.valueOf((byte) ((int) (this.mCaptureCallback.getOptions().getDouble("quality") * 100.0d))));
            }
            createCaptureRequest.set(CaptureRequest.SCALER_CROP_REGION, this.mPreviewRequestBuilder.get(CaptureRequest.SCALER_CROP_REGION));
            this.mCaptureSession.stopRepeating();
            this.mCaptureSession.capture(createCaptureRequest.build(), new CameraCaptureSession.CaptureCallback() {
                /* class com.google.android.cameraview.Camera2.C09429 */

                public void onCaptureCompleted(@NonNull CameraCaptureSession cameraCaptureSession, @NonNull CaptureRequest captureRequest, @NonNull TotalCaptureResult totalCaptureResult) {
                    if (Camera2.this.mCaptureCallback.getOptions().hasKey("pauseAfterCapture") && !Camera2.this.mCaptureCallback.getOptions().getBoolean("pauseAfterCapture")) {
                        Camera2.this.unlockFocus();
                    }
                    if (Camera2.this.mPlaySoundOnCapture.booleanValue()) {
                        Camera2.this.sound.play(0);
                    }
                }
            }, null);
        } catch (CameraAccessException unused) {
        }
    }

    public void collectPictureSizes(SizeMap sizeMap, StreamConfigurationMap streamConfigurationMap) {
        Size[] outputSizes = streamConfigurationMap.getOutputSizes(this.mImageFormat);
        for (Size size : outputSizes) {
            this.mPictureSizes.add(new Size(size.getWidth(), size.getHeight()));
        }
    }

    @Override // com.google.android.cameraview.CameraViewImpl
    public AspectRatio getAspectRatio() {
        return this.mAspectRatio;
    }

    @Override // com.google.android.cameraview.CameraViewImpl
    public boolean getAutoFocus() {
        return this.mAutoFocus;
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
        try {
            ArrayList arrayList = new ArrayList();
            String[] cameraIdList = this.mCameraManager.getCameraIdList();
            for (String str : cameraIdList) {
                Properties properties = new Properties();
                properties.put("id", str);
                properties.put("type", String.valueOf(((Integer) this.mCameraManager.getCameraCharacteristics(str).get(CameraCharacteristics.LENS_FACING)).intValue() == 0 ? 1 : 0));
                arrayList.add(properties);
            }
            return arrayList;
        } catch (CameraAccessException e) {
            throw new RuntimeException("Failed to get a list of camera ids", e);
        }
    }

    @Override // com.google.android.cameraview.CameraViewImpl
    public int getCameraOrientation() {
        return this.mCameraOrientation;
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
        return this.mFocusDepth;
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
        return new Size(this.mPreview.getWidth(), this.mPreview.getHeight());
    }

    public Surface getPreviewSurface() {
        Surface surface = this.mPreviewSurface;
        if (surface != null) {
            return surface;
        }
        return this.mPreview.getSurface();
    }

    @Override // com.google.android.cameraview.CameraViewImpl
    public boolean getScanning() {
        return this.mIsScanning;
    }

    @Override // com.google.android.cameraview.CameraViewImpl
    public Set<AspectRatio> getSupportedAspectRatios() {
        return this.mPreviewSizes.ratios();
    }

    @Override // com.google.android.cameraview.CameraViewImpl
    public ArrayList<int[]> getSupportedPreviewFpsRange() {
        return new ArrayList<>();
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

    @Override // com.google.android.cameraview.CameraViewImpl
    public void pausePreview() {
        try {
            this.mCaptureSession.stopRepeating();
        } catch (CameraAccessException e) {
            e.printStackTrace();
        }
    }

    @Override // com.google.android.cameraview.CameraViewImpl
    public boolean record(String str, int i, int i2, boolean z, CamcorderProfile camcorderProfile, int i3, int i4) {
        if (!this.mIsRecording) {
            setUpMediaRecorder(str, i, i2, z, camcorderProfile);
            try {
                this.mMediaRecorder.prepare();
                if (this.mCaptureSession != null) {
                    this.mCaptureSession.close();
                    this.mCaptureSession = null;
                }
                Size chooseOptimalSize = chooseOptimalSize();
                this.mPreview.setBufferSize(chooseOptimalSize.getWidth(), chooseOptimalSize.getHeight());
                Surface previewSurface = getPreviewSurface();
                Surface surface = this.mMediaRecorder.getSurface();
                CaptureRequest.Builder createCaptureRequest = this.mCamera.createCaptureRequest(3);
                this.mPreviewRequestBuilder = createCaptureRequest;
                createCaptureRequest.addTarget(previewSurface);
                this.mPreviewRequestBuilder.addTarget(surface);
                this.mCamera.createCaptureSession(Arrays.asList(previewSurface, surface), this.mSessionCallback, null);
                this.mMediaRecorder.start();
                this.mIsRecording = true;
                this.mCallback.onRecordingStart(this.mVideoPath, 0, 0);
                return true;
            } catch (CameraAccessException | IOException e) {
                e.printStackTrace();
            }
        }
        return false;
    }

    @Override // com.google.android.cameraview.CameraViewImpl
    public void resumePreview() {
        unlockFocus();
    }

    @Override // com.google.android.cameraview.CameraViewImpl
    public boolean setAspectRatio(AspectRatio aspectRatio) {
        if (aspectRatio != null && this.mPreviewSizes.isEmpty()) {
            this.mInitialRatio = aspectRatio;
            return false;
        } else if (aspectRatio == null || aspectRatio.equals(this.mAspectRatio) || !this.mPreviewSizes.ratios().contains(aspectRatio)) {
            return false;
        } else {
            this.mAspectRatio = aspectRatio;
            prepareStillImageReader();
            prepareScanImageReader();
            CameraCaptureSession cameraCaptureSession = this.mCaptureSession;
            if (cameraCaptureSession == null) {
                return true;
            }
            cameraCaptureSession.close();
            this.mCaptureSession = null;
            startCaptureSession();
            return true;
        }
    }

    @Override // com.google.android.cameraview.CameraViewImpl
    public void setAutoFocus(boolean z) {
        if (this.mAutoFocus != z) {
            this.mAutoFocus = z;
            if (this.mPreviewRequestBuilder != null) {
                updateAutoFocus();
                CameraCaptureSession cameraCaptureSession = this.mCaptureSession;
                if (cameraCaptureSession != null) {
                    try {
                        cameraCaptureSession.setRepeatingRequest(this.mPreviewRequestBuilder.build(), this.mCaptureCallback, null);
                    } catch (CameraAccessException unused) {
                        this.mAutoFocus = !this.mAutoFocus;
                    }
                }
            }
        }
    }

    @Override // com.google.android.cameraview.CameraViewImpl
    public void setCameraId(String str) {
        if (!C5308ILiI.OooO00o(this._mCameraId, str)) {
            this._mCameraId = str;
            if (!C5308ILiI.OooO00o(str, this.mCameraId) && isCameraOpened()) {
                stop();
                start();
            }
        }
    }

    @Override // com.google.android.cameraview.CameraViewImpl
    public void setDeviceOrientation(int i) {
        this.mDeviceOrientation = i;
    }

    @Override // com.google.android.cameraview.CameraViewImpl
    public void setDisplayOrientation(int i) {
        this.mDisplayOrientation = i;
        this.mPreview.setDisplayOrientation(i);
    }

    @Override // com.google.android.cameraview.CameraViewImpl
    public void setExposureCompensation(float f) {
    }

    @Override // com.google.android.cameraview.CameraViewImpl
    public void setFacing(int i) {
        if (this.mFacing != i) {
            this.mFacing = i;
            if (isCameraOpened()) {
                stop();
                start();
            }
        }
    }

    @Override // com.google.android.cameraview.CameraViewImpl
    public void setFlash(int i) {
        int i2 = this.mFlash;
        if (i2 != i) {
            this.mFlash = i;
            if (this.mPreviewRequestBuilder != null) {
                updateFlash();
                CameraCaptureSession cameraCaptureSession = this.mCaptureSession;
                if (cameraCaptureSession != null) {
                    try {
                        cameraCaptureSession.setRepeatingRequest(this.mPreviewRequestBuilder.build(), this.mCaptureCallback, null);
                    } catch (CameraAccessException unused) {
                        this.mFlash = i2;
                    }
                }
            }
        }
    }

    @Override // com.google.android.cameraview.CameraViewImpl
    public void setFocusArea(float f, float f2) {
        if (this.mCaptureSession != null) {
            C09418 r0 = new CameraCaptureSession.CaptureCallback() {
                /* class com.google.android.cameraview.Camera2.C09418 */

                public void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
                    super.onCaptureCompleted(cameraCaptureSession, captureRequest, totalCaptureResult);
                    if (captureRequest.getTag() == "FOCUS_TAG") {
                        Camera2.this.mPreviewRequestBuilder.set(CaptureRequest.CONTROL_AF_TRIGGER, null);
                        try {
                            Camera2.this.mCaptureSession.setRepeatingRequest(Camera2.this.mPreviewRequestBuilder.build(), null, null);
                        } catch (CameraAccessException unused) {
                        }
                    }
                }

                public void onCaptureFailed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
                    super.onCaptureFailed(cameraCaptureSession, captureRequest, captureFailure);
                    String str = "Manual AF failure: " + captureFailure;
                }
            };
            try {
                this.mCaptureSession.stopRepeating();
            } catch (CameraAccessException unused) {
            }
            this.mPreviewRequestBuilder.set(CaptureRequest.CONTROL_AF_TRIGGER, 2);
            this.mPreviewRequestBuilder.set(CaptureRequest.CONTROL_AF_MODE, 0);
            try {
                this.mCaptureSession.capture(this.mPreviewRequestBuilder.build(), r0, null);
            } catch (CameraAccessException unused2) {
            }
            if (isMeteringAreaAFSupported()) {
                MeteringRectangle calculateFocusArea = calculateFocusArea(f, f2);
                this.mPreviewRequestBuilder.set(CaptureRequest.CONTROL_AF_REGIONS, new MeteringRectangle[]{calculateFocusArea});
            }
            this.mPreviewRequestBuilder.set(CaptureRequest.CONTROL_MODE, 1);
            this.mPreviewRequestBuilder.set(CaptureRequest.CONTROL_AF_MODE, 1);
            this.mPreviewRequestBuilder.set(CaptureRequest.CONTROL_AF_TRIGGER, 1);
            this.mPreviewRequestBuilder.setTag("FOCUS_TAG");
            try {
                this.mCaptureSession.capture(this.mPreviewRequestBuilder.build(), r0, null);
            } catch (CameraAccessException unused3) {
            }
        }
    }

    @Override // com.google.android.cameraview.CameraViewImpl
    public void setFocusDepth(float f) {
        float f2 = this.mFocusDepth;
        if (f2 != f) {
            this.mFocusDepth = f;
            if (this.mCaptureSession != null) {
                updateFocusDepth();
                try {
                    this.mCaptureSession.setRepeatingRequest(this.mPreviewRequestBuilder.build(), this.mCaptureCallback, null);
                } catch (CameraAccessException unused) {
                    this.mFocusDepth = f2;
                }
            }
        }
    }

    @Override // com.google.android.cameraview.CameraViewImpl
    public void setPictureSize(Size size) {
        CameraCaptureSession cameraCaptureSession = this.mCaptureSession;
        if (cameraCaptureSession != null) {
            try {
                cameraCaptureSession.stopRepeating();
            } catch (CameraAccessException e) {
                e.printStackTrace();
            }
            this.mCaptureSession.close();
            this.mCaptureSession = null;
        }
        ImageReader imageReader = this.mStillImageReader;
        if (imageReader != null) {
            imageReader.close();
        }
        if (size == null) {
            AspectRatio aspectRatio = this.mAspectRatio;
            if (aspectRatio != null && this.mPictureSize != null) {
                this.mPictureSizes.sizes(aspectRatio).last();
            } else {
                return;
            }
        } else {
            this.mPictureSize = size;
        }
        prepareStillImageReader();
        startCaptureSession();
    }

    @Override // com.google.android.cameraview.CameraViewImpl
    public void setPlaySoundOnCapture(boolean z) {
        this.mPlaySoundOnCapture = Boolean.valueOf(z);
    }

    @Override // com.google.android.cameraview.CameraViewImpl
    public void setPreviewTexture(SurfaceTexture surfaceTexture) {
        if (surfaceTexture != null) {
            this.mPreviewSurface = new Surface(surfaceTexture);
        } else {
            this.mPreviewSurface = null;
        }
        new Handler(Looper.getMainLooper()).post(new Runnable() {
            /* class com.google.android.cameraview.Camera2.RunnableC09407 */

            public void run() {
                CameraCaptureSession cameraCaptureSession = Camera2.this.mCaptureSession;
                if (cameraCaptureSession != null) {
                    cameraCaptureSession.close();
                    Camera2.this.mCaptureSession = null;
                }
                Camera2.this.startCaptureSession();
            }
        });
    }

    @Override // com.google.android.cameraview.CameraViewImpl
    public void setScanning(boolean z) {
        if (this.mIsScanning != z) {
            this.mIsScanning = z;
            if (!z) {
                this.mImageFormat = 256;
            } else {
                this.mImageFormat = 35;
            }
            CameraCaptureSession cameraCaptureSession = this.mCaptureSession;
            if (cameraCaptureSession != null) {
                cameraCaptureSession.close();
                this.mCaptureSession = null;
            }
            startCaptureSession();
        }
    }

    @Override // com.google.android.cameraview.CameraViewImpl
    public void setWhiteBalance(int i) {
        int i2 = this.mWhiteBalance;
        if (i2 != i) {
            this.mWhiteBalance = i;
            if (this.mCaptureSession != null) {
                updateWhiteBalance();
                try {
                    this.mCaptureSession.setRepeatingRequest(this.mPreviewRequestBuilder.build(), this.mCaptureCallback, null);
                } catch (CameraAccessException unused) {
                    this.mWhiteBalance = i2;
                }
            }
        }
    }

    @Override // com.google.android.cameraview.CameraViewImpl
    public void setZoom(float f) {
        float f2 = this.mZoom;
        if (f2 != f) {
            this.mZoom = f;
            if (this.mCaptureSession != null) {
                updateZoom();
                try {
                    this.mCaptureSession.setRepeatingRequest(this.mPreviewRequestBuilder.build(), this.mCaptureCallback, null);
                } catch (CameraAccessException unused) {
                    this.mZoom = f2;
                }
            }
        }
    }

    @Override // com.google.android.cameraview.CameraViewImpl
    public boolean start() {
        if (!chooseCameraIdByFacing()) {
            this.mAspectRatio = this.mInitialRatio;
            this.mCallback.onMountError();
            return false;
        }
        collectCameraInfo();
        setAspectRatio(this.mInitialRatio);
        this.mInitialRatio = null;
        prepareStillImageReader();
        prepareScanImageReader();
        startOpeningCamera();
        return true;
    }

    public void startCaptureSession() {
        if (isCameraOpened() && this.mPreview.isReady() && this.mStillImageReader != null && this.mScanImageReader != null) {
            Size chooseOptimalSize = chooseOptimalSize();
            this.mPreview.setBufferSize(chooseOptimalSize.getWidth(), chooseOptimalSize.getHeight());
            Surface previewSurface = getPreviewSurface();
            try {
                CaptureRequest.Builder createCaptureRequest = this.mCamera.createCaptureRequest(1);
                this.mPreviewRequestBuilder = createCaptureRequest;
                createCaptureRequest.addTarget(previewSurface);
                if (this.mIsScanning) {
                    this.mPreviewRequestBuilder.addTarget(this.mScanImageReader.getSurface());
                }
                this.mCamera.createCaptureSession(Arrays.asList(previewSurface, this.mStillImageReader.getSurface(), this.mScanImageReader.getSurface()), this.mSessionCallback, null);
            } catch (CameraAccessException unused) {
                this.mCallback.onMountError();
            }
        }
    }

    @Override // com.google.android.cameraview.CameraViewImpl
    public void stop() {
        CameraCaptureSession cameraCaptureSession = this.mCaptureSession;
        if (cameraCaptureSession != null) {
            cameraCaptureSession.close();
            this.mCaptureSession = null;
        }
        CameraDevice cameraDevice = this.mCamera;
        if (cameraDevice != null) {
            cameraDevice.close();
            this.mCamera = null;
        }
        ImageReader imageReader = this.mStillImageReader;
        if (imageReader != null) {
            imageReader.close();
            this.mStillImageReader = null;
        }
        ImageReader imageReader2 = this.mScanImageReader;
        if (imageReader2 != null) {
            imageReader2.close();
            this.mScanImageReader = null;
        }
        MediaRecorder mediaRecorder = this.mMediaRecorder;
        if (mediaRecorder != null) {
            mediaRecorder.stop();
            this.mMediaRecorder.reset();
            this.mMediaRecorder.release();
            this.mMediaRecorder = null;
            if (this.mIsRecording) {
                this.mCallback.onRecordingEnd();
                this.mCallback.onVideoRecorded(this.mVideoPath, 0, 0);
                this.mIsRecording = false;
            }
        }
    }

    @Override // com.google.android.cameraview.CameraViewImpl
    public void stopRecording() {
        if (this.mIsRecording) {
            stopMediaRecorder();
            CameraCaptureSession cameraCaptureSession = this.mCaptureSession;
            if (cameraCaptureSession != null) {
                cameraCaptureSession.close();
                this.mCaptureSession = null;
            }
            startCaptureSession();
        }
    }

    @Override // com.google.android.cameraview.CameraViewImpl
    public void takePicture(ReadableMap readableMap) {
        this.mCaptureCallback.setOptions(readableMap);
        if (this.mAutoFocus) {
            lockFocus();
        } else {
            captureStillPicture();
        }
    }

    public void unlockFocus() {
        this.mPreviewRequestBuilder.set(CaptureRequest.CONTROL_AF_TRIGGER, 2);
        try {
            this.mCaptureSession.capture(this.mPreviewRequestBuilder.build(), this.mCaptureCallback, null);
            updateAutoFocus();
            updateFlash();
            if (this.mIsScanning) {
                this.mImageFormat = 35;
                startCaptureSession();
                return;
            }
            this.mPreviewRequestBuilder.set(CaptureRequest.CONTROL_AF_TRIGGER, 0);
            this.mCaptureSession.setRepeatingRequest(this.mPreviewRequestBuilder.build(), this.mCaptureCallback, null);
            this.mCaptureCallback.setState(0);
        } catch (CameraAccessException unused) {
        }
    }

    public void updateAutoFocus() {
        if (this.mAutoFocus) {
            int[] iArr = (int[]) this.mCameraCharacteristics.get(CameraCharacteristics.CONTROL_AF_AVAILABLE_MODES);
            if (iArr == null || iArr.length == 0 || (iArr.length == 1 && iArr[0] == 0)) {
                this.mAutoFocus = false;
                this.mPreviewRequestBuilder.set(CaptureRequest.CONTROL_AF_MODE, 0);
                return;
            }
            this.mPreviewRequestBuilder.set(CaptureRequest.CONTROL_AF_MODE, 4);
            return;
        }
        this.mPreviewRequestBuilder.set(CaptureRequest.CONTROL_AF_MODE, 0);
    }

    public void updateFlash() {
        int i = this.mFlash;
        if (i == 0) {
            this.mPreviewRequestBuilder.set(CaptureRequest.CONTROL_AE_MODE, 1);
            this.mPreviewRequestBuilder.set(CaptureRequest.FLASH_MODE, 0);
        } else if (i == 1) {
            this.mPreviewRequestBuilder.set(CaptureRequest.CONTROL_AE_MODE, 3);
            this.mPreviewRequestBuilder.set(CaptureRequest.FLASH_MODE, 0);
        } else if (i == 2) {
            this.mPreviewRequestBuilder.set(CaptureRequest.CONTROL_AE_MODE, 1);
            this.mPreviewRequestBuilder.set(CaptureRequest.FLASH_MODE, 2);
        } else if (i == 3) {
            this.mPreviewRequestBuilder.set(CaptureRequest.CONTROL_AE_MODE, 2);
            this.mPreviewRequestBuilder.set(CaptureRequest.FLASH_MODE, 0);
        } else if (i == 4) {
            this.mPreviewRequestBuilder.set(CaptureRequest.CONTROL_AE_MODE, 4);
            this.mPreviewRequestBuilder.set(CaptureRequest.FLASH_MODE, 0);
        }
    }

    public void updateFocusDepth() {
        if (!this.mAutoFocus) {
            Float f = (Float) this.mCameraCharacteristics.get(CameraCharacteristics.LENS_INFO_MINIMUM_FOCUS_DISTANCE);
            if (f != null) {
                this.mPreviewRequestBuilder.set(CaptureRequest.LENS_FOCUS_DISTANCE, Float.valueOf(this.mFocusDepth * f.floatValue()));
                return;
            }
            throw new NullPointerException("Unexpected state: LENS_INFO_MINIMUM_FOCUS_DISTANCE null");
        }
    }

    public void updateWhiteBalance() {
        int i = this.mWhiteBalance;
        if (i == 0) {
            this.mPreviewRequestBuilder.set(CaptureRequest.CONTROL_AWB_MODE, 1);
        } else if (i == 1) {
            this.mPreviewRequestBuilder.set(CaptureRequest.CONTROL_AWB_MODE, 6);
        } else if (i == 2) {
            this.mPreviewRequestBuilder.set(CaptureRequest.CONTROL_AWB_MODE, 5);
        } else if (i == 3) {
            this.mPreviewRequestBuilder.set(CaptureRequest.CONTROL_AWB_MODE, 8);
        } else if (i == 4) {
            this.mPreviewRequestBuilder.set(CaptureRequest.CONTROL_AWB_MODE, 3);
        } else if (i == 5) {
            this.mPreviewRequestBuilder.set(CaptureRequest.CONTROL_AWB_MODE, 2);
        }
    }

    public void updateZoom() {
        float floatValue = (this.mZoom * (((Float) this.mCameraCharacteristics.get(CameraCharacteristics.SCALER_AVAILABLE_MAX_DIGITAL_ZOOM)).floatValue() - 1.0f)) + 1.0f;
        Rect rect = (Rect) this.mCameraCharacteristics.get(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
        if (rect != null) {
            int width = rect.width();
            int height = rect.height();
            int i = (width - ((int) (((float) width) / floatValue))) / 2;
            int i2 = (height - ((int) (((float) height) / floatValue))) / 2;
            Rect rect2 = new Rect(rect.left + i, rect.top + i2, rect.right - i, rect.bottom - i2);
            if (floatValue != 1.0f) {
                this.mPreviewRequestBuilder.set(CaptureRequest.SCALER_CROP_REGION, rect2);
            } else {
                this.mPreviewRequestBuilder.set(CaptureRequest.SCALER_CROP_REGION, this.mInitialCropRegion);
            }
        }
    }
}

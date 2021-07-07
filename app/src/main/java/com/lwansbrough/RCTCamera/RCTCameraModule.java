package com.lwansbrough.RCTCamera;

import android.hardware.Camera;
import android.media.CamcorderProfile;
import android.media.MediaActionSound;
import android.media.MediaRecorder;
import android.media.MediaScannerConnection;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Environment;
import androidx.exifinterface.media.ExifInterface;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.uimanager.ViewProps;
import com.lwansbrough.RCTCamera.MutableImage;
import com.p118pd.sdk.AbstractC8753oo0oo000;
import com.p118pd.sdk.C7546o0o000O0;
import com.p118pd.sdk.C8745oo0oOoO0;
import com.p118pd.sdk.C8749oo0oOooo;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public class RCTCameraModule extends ReactContextBaseJavaModule implements MediaRecorder.OnInfoListener, MediaRecorder.OnErrorListener, LifecycleEventListener {
    public static final int MEDIA_TYPE_IMAGE = 1;
    public static final int MEDIA_TYPE_VIDEO = 2;
    public static final int RCT_CAMERA_ASPECT_FILL = 0;
    public static final int RCT_CAMERA_ASPECT_FIT = 1;
    public static final int RCT_CAMERA_ASPECT_STRETCH = 2;
    public static final int RCT_CAMERA_CAPTURE_MODE_STILL = 0;
    public static final int RCT_CAMERA_CAPTURE_MODE_VIDEO = 1;
    public static final String RCT_CAMERA_CAPTURE_QUALITY_1080P = "1080p";
    public static final String RCT_CAMERA_CAPTURE_QUALITY_480P = "480p";
    public static final String RCT_CAMERA_CAPTURE_QUALITY_720P = "720p";
    public static final String RCT_CAMERA_CAPTURE_QUALITY_HIGH = "high";
    public static final String RCT_CAMERA_CAPTURE_QUALITY_LOW = "low";
    public static final String RCT_CAMERA_CAPTURE_QUALITY_MEDIUM = "medium";
    public static final String RCT_CAMERA_CAPTURE_QUALITY_PREVIEW = "preview";
    public static final int RCT_CAMERA_CAPTURE_TARGET_CAMERA_ROLL = 2;
    public static final int RCT_CAMERA_CAPTURE_TARGET_DISK = 1;
    public static final int RCT_CAMERA_CAPTURE_TARGET_MEMORY = 0;
    public static final int RCT_CAMERA_CAPTURE_TARGET_TEMP = 3;
    public static final int RCT_CAMERA_FLASH_MODE_AUTO = 2;
    public static final int RCT_CAMERA_FLASH_MODE_OFF = 0;
    public static final int RCT_CAMERA_FLASH_MODE_ON = 1;
    public static final int RCT_CAMERA_ORIENTATION_AUTO = Integer.MAX_VALUE;
    public static final int RCT_CAMERA_ORIENTATION_LANDSCAPE_LEFT = 1;
    public static final int RCT_CAMERA_ORIENTATION_LANDSCAPE_RIGHT = 3;
    public static final int RCT_CAMERA_ORIENTATION_PORTRAIT = 0;
    public static final int RCT_CAMERA_ORIENTATION_PORTRAIT_UPSIDE_DOWN = 2;
    public static final int RCT_CAMERA_TORCH_MODE_AUTO = 2;
    public static final int RCT_CAMERA_TORCH_MODE_OFF = 0;
    public static final int RCT_CAMERA_TORCH_MODE_ON = 1;
    public static final int RCT_CAMERA_TYPE_BACK = 2;
    public static final int RCT_CAMERA_TYPE_FRONT = 1;
    public static final String TAG = "RCTCameraModule";
    public static ReactApplicationContext _reactContext;
    public long MRStartTime;
    public C8749oo0oOooo _sensorOrientationChecker;
    public Camera mCamera = null;
    public MediaRecorder mMediaRecorder;
    public ReadableMap mRecordingOptions;
    public Promise mRecordingPromise = null;
    public Boolean mSafeToCapture = true;
    public File mVideoFile;

    public class OooO00o implements AbstractC8753oo0oo000 {
        public final /* synthetic */ Promise OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ ReadableMap f15066OooO00o;

        public OooO00o(ReadableMap readableMap, Promise promise) {
            this.f15066OooO00o = readableMap;
            this.OooO00o = promise;
        }

        @Override // com.p118pd.sdk.AbstractC8753oo0oo000
        public void OooO00o() {
            int OooO00o2 = RCTCameraModule.this._sensorOrientationChecker.OooO00o();
            RCTCameraModule.this._sensorOrientationChecker.OooO0OO();
            RCTCameraModule.this._sensorOrientationChecker.m20394OooO00o();
            RCTCameraModule.this.captureWithOrientation(this.f15066OooO00o, this.OooO00o, OooO00o2);
        }
    }

    public class OooO0O0 implements Camera.PictureCallback {
        public final /* synthetic */ Promise OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ ReadableMap f15068OooO00o;

        public class OooO00o implements Runnable {

            /* renamed from: OooO00o  reason: collision with other field name */
            public final /* synthetic */ byte[] f15070OooO00o;

            public OooO00o(byte[] bArr) {
                this.f15070OooO00o = bArr;
            }

            public void run() {
                RCTCameraModule rCTCameraModule = RCTCameraModule.this;
                MutableImage mutableImage = new MutableImage(this.f15070OooO00o);
                OooO0O0 oooO0O0 = OooO0O0.this;
                rCTCameraModule.processImage(mutableImage, oooO0O0.f15068OooO00o, oooO0O0.OooO00o);
            }
        }

        public OooO0O0(ReadableMap readableMap, Promise promise) {
            this.f15068OooO00o = readableMap;
            this.OooO00o = promise;
        }

        public void onPictureTaken(byte[] bArr, Camera camera) {
            camera.stopPreview();
            camera.startPreview();
            AsyncTask.execute(new OooO00o(bArr));
            RCTCameraModule.this.mSafeToCapture = true;
        }
    }

    public class OooO0OO implements Camera.ShutterCallback {
        public final /* synthetic */ Camera OooO00o;

        public OooO0OO(Camera camera) {
            this.OooO00o = camera;
        }

        public void onShutter() {
            try {
                this.OooO00o.setPreviewCallback(null);
                this.OooO00o.setPreviewTexture(null);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: com.lwansbrough.RCTCamera.RCTCameraModule$OooO0Oo  reason: case insensitive filesystem */
    public class C5126OooO0Oo implements MediaScannerConnection.OnScanCompletedListener {
        public final /* synthetic */ Promise OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ WritableMap f15072OooO00o;

        public C5126OooO0Oo(WritableMap writableMap, Promise promise) {
            this.f15072OooO00o = writableMap;
            this.OooO00o = promise;
        }

        public void onScanCompleted(String str, Uri uri) {
            if (uri != null) {
                this.f15072OooO00o.putString("mediaUri", uri.toString());
            }
            this.OooO00o.resolve(this.f15072OooO00o);
        }
    }

    public RCTCameraModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        _reactContext = reactApplicationContext;
        this._sensorOrientationChecker = new C8749oo0oOooo(reactApplicationContext);
        _reactContext.addLifecycleEventListener(this);
    }

    private void addToMediaStore(String str) {
        MediaScannerConnection.scanFile(_reactContext, new String[]{str}, null, null);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void captureWithOrientation(ReadableMap readableMap, Promise promise, int i) {
        Camera OooO00o2 = C8745oo0oOoO0.OooO00o().m20380OooO00o(readableMap.getInt("type"));
        if (OooO00o2 == null) {
            promise.reject("No camera found.");
        } else if (readableMap.getInt("mode") == 1) {
            record(readableMap, promise, i);
        } else {
            C8745oo0oOoO0.OooO00o().m20383OooO00o(readableMap.getInt("type"), readableMap.getString("quality"));
            if (readableMap.hasKey("playSoundOnCapture") && readableMap.getBoolean("playSoundOnCapture")) {
                new MediaActionSound().play(0);
            }
            if (readableMap.hasKey("quality")) {
                C8745oo0oOoO0.OooO00o().m20383OooO00o(readableMap.getInt("type"), readableMap.getString("quality"));
            }
            C8745oo0oOoO0.OooO00o().OooO00o(readableMap.getInt("type"), i);
            OooO00o2.setPreviewCallback(null);
            OooO0O0 oooO0O0 = new OooO0O0(readableMap, promise);
            OooO0OO oooO0OO = new OooO0OO(OooO00o2);
            if (this.mSafeToCapture.booleanValue()) {
                try {
                    OooO00o2.takePicture(oooO0OO, null, oooO0O0);
                    this.mSafeToCapture = false;
                } catch (RuntimeException unused) {
                }
            }
        }
    }

    public static byte[] convertFileToByteArray(File file) {
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr = new byte[8192];
            while (true) {
                int read = fileInputStream.read(bArr);
                if (read == -1) {
                    return byteArrayOutputStream.toByteArray();
                }
                byteArrayOutputStream.write(bArr, 0, read);
            }
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    private File getOutputCameraRollFile(int i) {
        return getOutputFile(i, Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DCIM));
    }

    private File getOutputFile(int i, File file) {
        String str;
        if (file.exists() || file.mkdirs()) {
            String format = String.format("%s", new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date()));
            if (i == 1) {
                str = String.format("IMG_%s.jpg", format);
            } else if (i == 2) {
                str = String.format("VID_%s.mp4", format);
            } else {
                String str2 = "Unsupported media type:" + i;
                return null;
            }
            return new File(String.format("%s%s%s", file.getPath(), File.separator, str));
        }
        String str3 = "failed to create directory:" + file.getAbsolutePath();
        return null;
    }

    private File getOutputMediaFile(int i) {
        String str;
        if (i == 1) {
            str = Environment.DIRECTORY_PICTURES;
        } else if (i == 2) {
            str = Environment.DIRECTORY_MOVIES;
        } else {
            String str2 = "Unsupported media type:" + i;
            return null;
        }
        return getOutputFile(i, Environment.getExternalStoragePublicDirectory(str));
    }

    public static ReactApplicationContext getReactContextSingleton() {
        return _reactContext;
    }

    private File getTempMediaFile(int i) {
        try {
            String format = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
            File cacheDir = _reactContext.getCacheDir();
            if (i == 1) {
                return File.createTempFile("IMG_" + format, ".jpg", cacheDir);
            } else if (i == 2) {
                return File.createTempFile("VID_" + format, ".mp4", cacheDir);
            } else {
                String str = "Unsupported media type:" + i;
                return null;
            }
        } catch (Exception e) {
            e.getMessage();
            return null;
        }
    }

    private Throwable prepareMediaRecorder(ReadableMap readableMap, int i) {
        CamcorderProfile OooO00o2 = C8745oo0oOoO0.OooO00o().OooO00o(readableMap.getInt("type"), readableMap.getString("quality"));
        if (OooO00o2 == null) {
            return new RuntimeException("CamcorderProfile not found in prepareMediaRecorder.");
        }
        this.mCamera.unlock();
        MediaRecorder mediaRecorder = new MediaRecorder();
        this.mMediaRecorder = mediaRecorder;
        mediaRecorder.setOnInfoListener(this);
        this.mMediaRecorder.setOnErrorListener(this);
        this.mMediaRecorder.setCamera(this.mCamera);
        this.mMediaRecorder.setAudioSource(5);
        this.mMediaRecorder.setVideoSource(1);
        if (i == 0) {
            this.mMediaRecorder.setOrientationHint(90);
        } else if (i == 1) {
            this.mMediaRecorder.setOrientationHint(0);
        } else if (i == 2) {
            this.mMediaRecorder.setOrientationHint(270);
        } else if (i == 3) {
            this.mMediaRecorder.setOrientationHint(180);
        }
        OooO00o2.fileFormat = 2;
        this.mMediaRecorder.setProfile(OooO00o2);
        this.mVideoFile = null;
        int i2 = readableMap.getInt("target");
        if (i2 == 0) {
            this.mVideoFile = getTempMediaFile(2);
        } else if (i2 == 2) {
            this.mVideoFile = getOutputCameraRollFile(2);
        } else if (i2 != 3) {
            this.mVideoFile = getOutputMediaFile(2);
        } else {
            this.mVideoFile = getTempMediaFile(2);
        }
        File file = this.mVideoFile;
        if (file == null) {
            return new RuntimeException("Error while preparing output file in prepareMediaRecorder.");
        }
        this.mMediaRecorder.setOutputFile(file.getPath());
        if (readableMap.hasKey("totalSeconds")) {
            this.mMediaRecorder.setMaxDuration(readableMap.getInt("totalSeconds") * 1000);
        }
        if (readableMap.hasKey("maxFileSize")) {
            this.mMediaRecorder.setMaxFileSize((long) readableMap.getInt("maxFileSize"));
        }
        try {
            this.mMediaRecorder.prepare();
            return null;
        } catch (Exception e) {
            releaseMediaRecorder();
            return e;
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private synchronized void processImage(MutableImage mutableImage, ReadableMap readableMap, Promise promise) {
        boolean z;
        boolean z2 = false;
        if (readableMap.hasKey("fixOrientation") && readableMap.getBoolean("fixOrientation")) {
            try {
                mutableImage.m15129OooO00o();
            } catch (MutableImage.ImageMutationFailedException e) {
                promise.reject("Error fixing orientation image", e);
            }
        }
        double OooO0O02 = (double) mutableImage.OooO0O0();
        double OooO00o2 = (double) mutableImage.m15127OooO00o();
        Double.isNaN(OooO0O02);
        Double.isNaN(OooO00o2);
        double d = OooO0O02 / OooO00o2;
        try {
            int i = readableMap.getInt("type");
            double OooO0OO2 = (double) C8745oo0oOoO0.OooO00o().OooO0OO(i);
            double OooO0O03 = (double) C8745oo0oOoO0.OooO00o().OooO0O0(i);
            Double.isNaN(OooO0OO2);
            Double.isNaN(OooO0O03);
            double d2 = OooO0OO2 / OooO0O03;
            z = ((d2 > 1.0d ? 1 : (d2 == 1.0d ? 0 : -1)) > 0) != ((d > 1.0d ? 1 : (d == 1.0d ? 0 : -1)) > 0);
            d = d2;
        } catch (IllegalArgumentException unused) {
            z = false;
        }
        if (readableMap.hasKey("cropToPreview") && readableMap.getBoolean("cropToPreview")) {
            if (z) {
                d = 1.0d / d;
            }
            try {
                mutableImage.OooO00o(d);
            } catch (IllegalArgumentException e2) {
                promise.reject("Error cropping image to preview", e2);
            }
        }
        if (readableMap.hasKey("mirrorImage") && readableMap.getBoolean("mirrorImage")) {
            z2 = true;
        }
        if (z2) {
            try {
                mutableImage.m15130OooO0O0();
            } catch (MutableImage.ImageMutationFailedException e3) {
                promise.reject("Error mirroring image", e3);
            }
        }
        int i2 = 80;
        if (readableMap.hasKey("jpegQuality")) {
            i2 = readableMap.getInt("jpegQuality");
        }
        int OooO00o3 = z ? mutableImage.m15127OooO00o() : mutableImage.OooO0O0();
        int OooO0O04 = z ? mutableImage.OooO0O0() : mutableImage.m15127OooO00o();
        int i3 = readableMap.getInt("target");
        if (i3 == 0) {
            String OooO00o4 = mutableImage.m15128OooO00o(i2);
            WritableNativeMap writableNativeMap = new WritableNativeMap();
            writableNativeMap.putString("data", OooO00o4);
            writableNativeMap.putInt("width", OooO00o3);
            writableNativeMap.putInt("height", OooO0O04);
            promise.resolve(writableNativeMap);
        } else if (i3 == 1) {
            File outputMediaFile = getOutputMediaFile(1);
            if (outputMediaFile == null) {
                promise.reject("Error creating media file.");
                return;
            }
            try {
                mutableImage.OooO00o(outputMediaFile, readableMap, i2);
                resolveImage(outputMediaFile, OooO00o3, OooO0O04, promise, false);
            } catch (IOException e4) {
                promise.reject("failed to save image file", e4);
            }
        } else if (i3 == 2) {
            File outputCameraRollFile = getOutputCameraRollFile(1);
            if (outputCameraRollFile == null) {
                promise.reject("Error creating media file.");
                return;
            }
            try {
                mutableImage.OooO00o(outputCameraRollFile, readableMap, i2);
                addToMediaStore(outputCameraRollFile.getAbsolutePath());
                resolveImage(outputCameraRollFile, OooO00o3, OooO0O04, promise, true);
            } catch (IOException | NullPointerException e5) {
                promise.reject("failed to save image file", e5);
            }
        } else if (i3 == 3) {
            File tempMediaFile = getTempMediaFile(1);
            if (tempMediaFile == null) {
                promise.reject("Error creating media file.");
                return;
            }
            try {
                mutableImage.OooO00o(tempMediaFile, readableMap, i2);
                resolveImage(tempMediaFile, OooO00o3, OooO0O04, promise, false);
            } catch (IOException e6) {
                promise.reject("failed to save image file", e6);
            }
        }
    }

    private void record(ReadableMap readableMap, Promise promise, int i) {
        if (this.mRecordingPromise == null) {
            Camera OooO00o2 = C8745oo0oOoO0.OooO00o().m20380OooO00o(readableMap.getInt("type"));
            this.mCamera = OooO00o2;
            if (OooO00o2 == null) {
                promise.reject(new RuntimeException("No camera found."));
                return;
            }
            Throwable prepareMediaRecorder = prepareMediaRecorder(readableMap, i);
            if (prepareMediaRecorder != null) {
                promise.reject(prepareMediaRecorder);
                return;
            }
            try {
                this.mMediaRecorder.start();
                this.MRStartTime = System.currentTimeMillis();
                this.mRecordingOptions = readableMap;
                this.mRecordingPromise = promise;
            } catch (Exception e) {
                promise.reject(e);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0072, code lost:
        if (r4 != 3) goto L_0x0132;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void releaseMediaRecorder() {
        /*
        // Method dump skipped, instructions count: 309
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lwansbrough.RCTCamera.RCTCameraModule.releaseMediaRecorder():void");
    }

    private void resolveImage(File file, int i, int i2, Promise promise, boolean z) {
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        writableNativeMap.putString("path", Uri.fromFile(file).toString());
        writableNativeMap.putInt("width", i);
        writableNativeMap.putInt("height", i2);
        if (z) {
            MediaScannerConnection.scanFile(_reactContext, new String[]{file.getAbsolutePath()}, null, new C5126OooO0Oo(writableNativeMap, promise));
            return;
        }
        promise.resolve(writableNativeMap);
    }

    @ReactMethod
    public void capture(ReadableMap readableMap, Promise promise) {
        if (C8745oo0oOoO0.OooO00o() == null) {
            promise.reject("Camera is not ready yet.");
            return;
        }
        int i = readableMap.hasKey("orientation") ? readableMap.getInt("orientation") : C8745oo0oOoO0.OooO00o().OooO0OO();
        if (i == Integer.MAX_VALUE) {
            this._sensorOrientationChecker.OooO0O0();
            this._sensorOrientationChecker.OooO00o(new OooO00o(readableMap, promise));
            return;
        }
        captureWithOrientation(readableMap, promise, i);
    }

    @Override // com.facebook.react.bridge.BaseJavaModule
    @Nullable
    public Map<String, Object> getConstants() {
        return Collections.unmodifiableMap(new HashMap<String, Object>() {
            /* class com.lwansbrough.RCTCamera.RCTCameraModule.C14431 */

            {
                put("Aspect", OooO0O0());
                put("BarCodeType", OooO0OO());
                put("Type", OooOO0());
                put("CaptureQuality", OooO0o0());
                put("CaptureMode", OooO0Oo());
                put("CaptureTarget", OooO0o());
                put(ExifInterface.f14146OooO0oo, OooO0oo());
                put("FlashMode", OooO0oO());
                put("TorchMode", OooO());
            }

            private Map<String, Object> OooO() {
                return Collections.unmodifiableMap(new HashMap<String, Object>() {
                    /* class com.lwansbrough.RCTCamera.RCTCameraModule.C14431.C14529 */

                    {
                        put("off", 0);
                        put(ViewProps.f984ON, 1);
                        put("auto", 2);
                    }
                });
            }

            private Map<String, Object> OooO0O0() {
                return Collections.unmodifiableMap(new HashMap<String, Object>() {
                    /* class com.lwansbrough.RCTCamera.RCTCameraModule.C14431.C14441 */

                    {
                        put("stretch", 2);
                        put("fit", 1);
                        put("fill", 0);
                    }
                });
            }

            private Map<String, Object> OooO0OO() {
                return Collections.unmodifiableMap(new HashMap<String, Object>() {
                    /* class com.lwansbrough.RCTCamera.RCTCameraModule.C14431.C14452 */
                });
            }

            private Map<String, Object> OooO0Oo() {
                return Collections.unmodifiableMap(new HashMap<String, Object>() {
                    /* class com.lwansbrough.RCTCamera.RCTCameraModule.C14431.C14485 */

                    {
                        put("still", 0);
                        put("video", 1);
                    }
                });
            }

            private Map<String, Object> OooO0o() {
                return Collections.unmodifiableMap(new HashMap<String, Object>() {
                    /* class com.lwansbrough.RCTCamera.RCTCameraModule.C14431.C14496 */

                    {
                        put("memory", 0);
                        put("disk", 1);
                        put("cameraRoll", 2);
                        put("temp", 3);
                    }
                });
            }

            private Map<String, Object> OooO0o0() {
                return Collections.unmodifiableMap(new HashMap<String, Object>() {
                    /* class com.lwansbrough.RCTCamera.RCTCameraModule.C14431.C14474 */

                    {
                        put(RCTCameraModule.RCT_CAMERA_CAPTURE_QUALITY_LOW, RCTCameraModule.RCT_CAMERA_CAPTURE_QUALITY_LOW);
                        put(RCTCameraModule.RCT_CAMERA_CAPTURE_QUALITY_MEDIUM, RCTCameraModule.RCT_CAMERA_CAPTURE_QUALITY_MEDIUM);
                        put(RCTCameraModule.RCT_CAMERA_CAPTURE_QUALITY_HIGH, RCTCameraModule.RCT_CAMERA_CAPTURE_QUALITY_HIGH);
                        put("photo", RCTCameraModule.RCT_CAMERA_CAPTURE_QUALITY_HIGH);
                        put(RCTCameraModule.RCT_CAMERA_CAPTURE_QUALITY_PREVIEW, RCTCameraModule.RCT_CAMERA_CAPTURE_QUALITY_PREVIEW);
                        put(RCTCameraModule.RCT_CAMERA_CAPTURE_QUALITY_480P, RCTCameraModule.RCT_CAMERA_CAPTURE_QUALITY_480P);
                        put(RCTCameraModule.RCT_CAMERA_CAPTURE_QUALITY_720P, RCTCameraModule.RCT_CAMERA_CAPTURE_QUALITY_720P);
                        put(RCTCameraModule.RCT_CAMERA_CAPTURE_QUALITY_1080P, RCTCameraModule.RCT_CAMERA_CAPTURE_QUALITY_1080P);
                    }
                });
            }

            private Map<String, Object> OooO0oO() {
                return Collections.unmodifiableMap(new HashMap<String, Object>() {
                    /* class com.lwansbrough.RCTCamera.RCTCameraModule.C14431.C14518 */

                    {
                        put("off", 0);
                        put(ViewProps.f984ON, 1);
                        put("auto", 2);
                    }
                });
            }

            private Map<String, Object> OooO0oo() {
                return Collections.unmodifiableMap(new HashMap<String, Object>() {
                    /* class com.lwansbrough.RCTCamera.RCTCameraModule.C14431.C14507 */

                    {
                        put("auto", Integer.MAX_VALUE);
                        put("landscapeLeft", 1);
                        put("landscapeRight", 3);
                        put("portrait", 0);
                        put("portraitUpsideDown", 2);
                    }
                });
            }

            private Map<String, Object> OooOO0() {
                return Collections.unmodifiableMap(new HashMap<String, Object>() {
                    /* class com.lwansbrough.RCTCamera.RCTCameraModule.C14431.C14463 */

                    {
                        put("front", 1);
                        put(C7546o0o000O0.o000000o, 2);
                    }
                });
            }
        });
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return TAG;
    }

    @ReactMethod
    public void hasFlash(ReadableMap readableMap, Promise promise) {
        Camera OooO00o2 = C8745oo0oOoO0.OooO00o().m20380OooO00o(readableMap.getInt("type"));
        if (OooO00o2 == null) {
            promise.reject("No camera found.");
            return;
        }
        List<String> supportedFlashModes = OooO00o2.getParameters().getSupportedFlashModes();
        promise.resolve(Boolean.valueOf(supportedFlashModes != null && !supportedFlashModes.isEmpty()));
    }

    public void onError(MediaRecorder mediaRecorder, int i, int i2) {
        if (this.mRecordingPromise != null) {
            releaseMediaRecorder();
        }
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostDestroy() {
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostPause() {
        if (this.mRecordingPromise != null) {
            releaseMediaRecorder();
        }
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostResume() {
        this.mSafeToCapture = true;
    }

    public void onInfo(MediaRecorder mediaRecorder, int i, int i2) {
        if ((i == 800 || i == 801) && this.mRecordingPromise != null) {
            releaseMediaRecorder();
        }
    }

    @ReactMethod
    public void setZoom(ReadableMap readableMap, int i) {
        Camera OooO00o2;
        C8745oo0oOoO0 OooO00o3 = C8745oo0oOoO0.OooO00o();
        if (OooO00o3 != null && (OooO00o2 = OooO00o3.m20380OooO00o(readableMap.getInt("type"))) != null) {
            Camera.Parameters parameters = OooO00o2.getParameters();
            int maxZoom = parameters.getMaxZoom();
            if (parameters.isZoomSupported() && i >= 0 && i < maxZoom) {
                parameters.setZoom(i);
                try {
                    OooO00o2.setParameters(parameters);
                } catch (RuntimeException unused) {
                }
            }
        }
    }

    @ReactMethod
    public void stopCapture(Promise promise) {
        if (this.mRecordingPromise != null) {
            releaseMediaRecorder();
            promise.resolve("Finished recording.");
            return;
        }
        promise.resolve("Not recording.");
    }
}

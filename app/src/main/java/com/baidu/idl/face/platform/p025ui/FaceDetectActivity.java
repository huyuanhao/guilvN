package com.baidu.idl.face.platform.p025ui;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.hardware.Camera;
import android.media.AudioManager;
import android.os.Bundle;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.baidu.aip.face.stat.Ast;
import com.baidu.idl.face.platform.FaceConfig;
import com.baidu.idl.face.platform.FaceStatusEnum;
import com.baidu.idl.face.platform.IDetectStrategy;
import com.baidu.idl.face.platform.IDetectStrategyCallback;
import com.baidu.idl.face.platform.p025ui.utils.CameraUtils;
import com.baidu.idl.face.platform.p025ui.utils.VolumeUtils;
import com.baidu.idl.face.platform.p025ui.widget.FaceDetectRoundView;
import com.baidu.idl.face.platform.utils.CameraPreviewUtils;
import com.facebook.react.uimanager.BaseViewManager;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import s.h.e.l.l.C;

/* renamed from: com.baidu.idl.face.platform.ui.FaceDetectActivity */
public class FaceDetectActivity extends Activity implements SurfaceHolder.Callback, Camera.PreviewCallback, Camera.ErrorCallback, VolumeUtils.VolumeCallback, IDetectStrategyCallback {
    public static final String DETECT_CONFIG = "FaceOptions";
    public static final String TAG = FaceDetectActivity.class.getSimpleName();
    public HashMap<String, String> mBase64ImageMap = new HashMap<>();
    public Camera mCamera;
    public int mCameraId;
    public Camera.Parameters mCameraParam;
    public ImageView mCloseView;
    public int mDisplayHeight = 0;
    public int mDisplayWidth = 0;
    public FaceConfig mFaceConfig;
    public FaceDetectRoundView mFaceDetectRoundView;
    public FrameLayout mFrameLayout;
    public IDetectStrategy mIDetectStrategy;
    public LinearLayout mImageLayout;
    public volatile boolean mIsCompletion = false;
    public boolean mIsCreateSurface = false;
    public volatile boolean mIsEnableSound = true;
    public int mPreviewDegree;
    public int mPreviewHight;
    public Rect mPreviewRect = new Rect();
    public int mPreviewWidth;
    public View mRootView;
    public ImageView mSoundView;
    public ImageView mSuccessView;
    public int mSurfaceHeight = 0;
    public SurfaceHolder mSurfaceHolder;
    public SurfaceView mSurfaceView;
    public int mSurfaceWidth = 0;
    public TextView mTipsBottomView;
    public Drawable mTipsIcon;
    public TextView mTipsTopView;
    public BroadcastReceiver mVolumeReceiver;

    /* renamed from: com.baidu.idl.face.platform.ui.FaceDetectActivity$3 */
    public static /* synthetic */ class C04253 {
        public static final /* synthetic */ int[] $SwitchMap$com$baidu$idl$face$platform$FaceStatusEnum;

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.baidu.idl.face.platform.FaceStatusEnum[] r0 = com.baidu.idl.face.platform.FaceStatusEnum.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.baidu.idl.face.platform.p025ui.FaceDetectActivity.C04253.$SwitchMap$com$baidu$idl$face$platform$FaceStatusEnum = r0
                com.baidu.idl.face.platform.FaceStatusEnum r1 = com.baidu.idl.face.platform.FaceStatusEnum.OK     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.baidu.idl.face.platform.p025ui.FaceDetectActivity.C04253.$SwitchMap$com$baidu$idl$face$platform$FaceStatusEnum     // Catch:{ NoSuchFieldError -> 0x001d }
                com.baidu.idl.face.platform.FaceStatusEnum r1 = com.baidu.idl.face.platform.FaceStatusEnum.Detect_PitchOutOfUpMaxRange     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = com.baidu.idl.face.platform.p025ui.FaceDetectActivity.C04253.$SwitchMap$com$baidu$idl$face$platform$FaceStatusEnum     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.baidu.idl.face.platform.FaceStatusEnum r1 = com.baidu.idl.face.platform.FaceStatusEnum.Detect_PitchOutOfDownMaxRange     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = com.baidu.idl.face.platform.p025ui.FaceDetectActivity.C04253.$SwitchMap$com$baidu$idl$face$platform$FaceStatusEnum     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.baidu.idl.face.platform.FaceStatusEnum r1 = com.baidu.idl.face.platform.FaceStatusEnum.Detect_PitchOutOfLeftMaxRange     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = com.baidu.idl.face.platform.p025ui.FaceDetectActivity.C04253.$SwitchMap$com$baidu$idl$face$platform$FaceStatusEnum     // Catch:{ NoSuchFieldError -> 0x003e }
                com.baidu.idl.face.platform.FaceStatusEnum r1 = com.baidu.idl.face.platform.FaceStatusEnum.Detect_PitchOutOfRightMaxRange     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.baidu.idl.face.platform.p025ui.FaceDetectActivity.C04253.<clinit>():void");
        }
    }

    static {
        C.i(1);
    }

    public static native Bitmap base64ToBitmap(String str);

    private native int displayOrientation(Context context);

    private native void onRefreshSuccessView(boolean z);

    private native void onRefreshTipsView(boolean z, String str);

    private native void onRefreshView(FaceStatusEnum faceStatusEnum, String str);

    private native Camera open();

    private void saveImage(HashMap<String, String> hashMap) {
        Set<Map.Entry<String, String>> entrySet = hashMap.entrySet();
        this.mImageLayout.removeAllViews();
        for (Map.Entry<String, String> entry : entrySet) {
            Bitmap base64ToBitmap = base64ToBitmap(entry.getValue());
            ImageView imageView = new ImageView(this);
            imageView.setImageBitmap(base64ToBitmap);
            this.mImageLayout.addView(imageView, new LinearLayout.LayoutParams(300, 300));
        }
    }

    public native void finish();

    public native void onCreate(Bundle bundle);

    @Override // com.baidu.idl.face.platform.IDetectStrategyCallback
    public void onDetectCompletion(FaceStatusEnum faceStatusEnum, String str, HashMap<String, String> hashMap) {
        if (!this.mIsCompletion) {
            onRefreshView(faceStatusEnum, str);
            if (faceStatusEnum == FaceStatusEnum.OK) {
                this.mIsCompletion = true;
                saveImage(hashMap);
            }
            Ast.getInstance().faceHit("detect");
        }
    }

    public native void onError(int i, Camera camera);

    public native void onPause();

    public native void onPreviewFrame(byte[] bArr, Camera camera);

    public native void onResume();

    public native void onStop();

    public void startPreview() {
        SurfaceView surfaceView = this.mSurfaceView;
        if (!(surfaceView == null || surfaceView.getHolder() == null)) {
            SurfaceHolder holder = this.mSurfaceView.getHolder();
            this.mSurfaceHolder = holder;
            holder.addCallback(this);
        }
        if (this.mCamera == null) {
            try {
                this.mCamera = open();
            } catch (RuntimeException e) {
                e.printStackTrace();
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        Camera camera = this.mCamera;
        if (camera != null) {
            if (this.mCameraParam == null) {
                this.mCameraParam = camera.getParameters();
            }
            this.mCameraParam.setPictureFormat(256);
            int displayOrientation = displayOrientation(this);
            this.mCamera.setDisplayOrientation(displayOrientation);
            this.mCameraParam.set(BaseViewManager.PROP_ROTATION, displayOrientation);
            this.mPreviewDegree = displayOrientation;
            IDetectStrategy iDetectStrategy = this.mIDetectStrategy;
            if (iDetectStrategy != null) {
                iDetectStrategy.setPreviewDegree(displayOrientation);
            }
            Point bestPreview = CameraPreviewUtils.getBestPreview(this.mCameraParam, new Point(this.mDisplayWidth, this.mDisplayHeight));
            int i = bestPreview.x;
            this.mPreviewWidth = i;
            int i2 = bestPreview.y;
            this.mPreviewHight = i2;
            this.mPreviewRect.set(0, 0, i2, i);
            this.mCameraParam.setPreviewSize(this.mPreviewWidth, this.mPreviewHight);
            this.mCamera.setParameters(this.mCameraParam);
            try {
                this.mCamera.setPreviewDisplay(this.mSurfaceHolder);
                this.mCamera.stopPreview();
                this.mCamera.setErrorCallback(this);
                this.mCamera.setPreviewCallback(this);
                this.mCamera.startPreview();
            } catch (RuntimeException e3) {
                e3.printStackTrace();
                CameraUtils.releaseCamera(this.mCamera);
                this.mCamera = null;
            } catch (Exception e4) {
                e4.printStackTrace();
                CameraUtils.releaseCamera(this.mCamera);
                this.mCamera = null;
            }
        }
    }

    public void stopPreview() {
        Camera camera = this.mCamera;
        if (camera != null) {
            try {
                camera.setErrorCallback(null);
                this.mCamera.setPreviewCallback(null);
                this.mCamera.stopPreview();
            } catch (RuntimeException e) {
                e.printStackTrace();
            } catch (Exception e2) {
                e2.printStackTrace();
            } catch (Throwable th) {
                CameraUtils.releaseCamera(this.mCamera);
                this.mCamera = null;
                throw th;
            }
            CameraUtils.releaseCamera(this.mCamera);
            this.mCamera = null;
        }
        SurfaceHolder surfaceHolder = this.mSurfaceHolder;
        if (surfaceHolder != null) {
            surfaceHolder.removeCallback(this);
        }
        if (this.mIDetectStrategy != null) {
            this.mIDetectStrategy = null;
        }
    }

    public native void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3);

    public native void surfaceCreated(SurfaceHolder surfaceHolder);

    public native void surfaceDestroyed(SurfaceHolder surfaceHolder);

    @Override // com.baidu.idl.face.platform.p025ui.utils.VolumeUtils.VolumeCallback
    public void volumeChanged() {
        try {
            AudioManager audioManager = (AudioManager) getSystemService("audio");
            if (audioManager != null) {
                this.mIsEnableSound = audioManager.getStreamVolume(3) > 0;
                this.mSoundView.setImageResource(this.mIsEnableSound ? C0429R.mipmap.ic_enable_sound_ext : C0429R.mipmap.ic_disable_sound_ext);
                if (this.mIDetectStrategy != null) {
                    this.mIDetectStrategy.setDetectStrategySoundEnable(this.mIsEnableSound);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

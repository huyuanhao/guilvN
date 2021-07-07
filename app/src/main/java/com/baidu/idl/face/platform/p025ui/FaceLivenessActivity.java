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
import com.baidu.idl.face.platform.ILivenessStrategy;
import com.baidu.idl.face.platform.ILivenessStrategyCallback;
import com.baidu.idl.face.platform.p025ui.utils.CameraUtils;
import com.baidu.idl.face.platform.p025ui.utils.VolumeUtils;
import com.baidu.idl.face.platform.p025ui.widget.FaceDetectRoundView;
import com.baidu.idl.face.platform.utils.CameraPreviewUtils;
import com.facebook.react.uimanager.BaseViewManager;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import s.h.e.l.l.C;

/* renamed from: com.baidu.idl.face.platform.ui.FaceLivenessActivity */
public class FaceLivenessActivity extends Activity implements SurfaceHolder.Callback, Camera.PreviewCallback, Camera.ErrorCallback, VolumeUtils.VolumeCallback, ILivenessStrategyCallback {
    public static final String TAG = FaceLivenessActivity.class.getSimpleName();
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
    public ILivenessStrategy mILivenessStrategy;
    public LinearLayout mImageLayout;
    public boolean mIsCompletion = false;
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

    /* renamed from: com.baidu.idl.face.platform.ui.FaceLivenessActivity$3 */
    public static /* synthetic */ class C04283 {
        public static final /* synthetic */ int[] $SwitchMap$com$baidu$idl$face$platform$FaceStatusEnum;

        /* JADX WARNING: Can't wrap try/catch for region: R(32:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|32) */
        /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x006c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0078 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0084 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0090 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x009c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x00a8 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
            // Method dump skipped, instructions count: 181
            */
            throw new UnsupportedOperationException("Method not decompiled: com.baidu.idl.face.platform.p025ui.FaceLivenessActivity.C04283.<clinit>():void");
        }
    }

    static {
        C.i(2);
    }

    public static native Bitmap base64ToBitmap(String str);

    private native int displayOrientation(Context context);

    private native void onRefreshSuccessView(boolean z);

    private native void onRefreshTipsView(boolean z, String str);

    private void onRefreshView(FaceStatusEnum faceStatusEnum, String str) {
        switch (C04283.$SwitchMap$com$baidu$idl$face$platform$FaceStatusEnum[faceStatusEnum.ordinal()]) {
            case 1:
            case 2:
            case 3:
                onRefreshTipsView(false, str);
                this.mTipsBottomView.setText("");
                this.mFaceDetectRoundView.processDrawState(false);
                onRefreshSuccessView(true);
                return;
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                onRefreshTipsView(false, str);
                this.mTipsBottomView.setText("");
                this.mFaceDetectRoundView.processDrawState(false);
                onRefreshSuccessView(false);
                return;
            case 12:
            case 13:
            case 14:
            case 15:
                onRefreshTipsView(true, str);
                this.mTipsBottomView.setText(str);
                this.mFaceDetectRoundView.processDrawState(true);
                onRefreshSuccessView(false);
                return;
            default:
                onRefreshTipsView(false, str);
                this.mTipsBottomView.setText("");
                this.mFaceDetectRoundView.processDrawState(true);
                onRefreshSuccessView(false);
                return;
        }
    }

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

    public native void onError(int i, Camera camera);

    @Override // com.baidu.idl.face.platform.ILivenessStrategyCallback
    public void onLivenessCompletion(FaceStatusEnum faceStatusEnum, String str, HashMap<String, String> hashMap) {
        if (!this.mIsCompletion) {
            onRefreshView(faceStatusEnum, str);
            if (faceStatusEnum == FaceStatusEnum.OK) {
                this.mIsCompletion = true;
                saveImage(hashMap);
            }
            Ast.getInstance().faceHit("liveness");
        }
    }

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
            Point bestPreview = CameraPreviewUtils.getBestPreview(this.mCameraParam, new Point(this.mDisplayWidth, this.mDisplayHeight));
            this.mPreviewWidth = bestPreview.x;
            this.mPreviewHight = bestPreview.y;
            ILivenessStrategy iLivenessStrategy = this.mILivenessStrategy;
            if (iLivenessStrategy != null) {
                iLivenessStrategy.setPreviewDegree(displayOrientation);
            }
            this.mPreviewRect.set(0, 0, this.mPreviewHight, this.mPreviewWidth);
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
        if (this.mILivenessStrategy != null) {
            this.mILivenessStrategy = null;
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
                if (this.mILivenessStrategy != null) {
                    this.mILivenessStrategy.setLivenessStrategySoundEnable(this.mIsEnableSound);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

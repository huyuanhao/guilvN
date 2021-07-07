package com.baidu.idl.face.platform.decode;

import android.graphics.Bitmap;
import com.baidu.idl.face.platform.FaceStatusEnum;
import com.baidu.idl.face.platform.IDetect;
import com.baidu.idl.face.platform.ILiveness;
import com.baidu.idl.face.platform.LivenessTypeEnum;
import com.baidu.idl.face.platform.model.FaceExtInfo;
import com.baidu.idl.face.platform.model.FaceModel;
import com.baidu.idl.face.platform.utils.BitmapUtils;
import com.baidu.idl.facesdk.FaceInfo;
import com.baidu.idl.facesdk.FaceSDK;
import com.baidu.idl.facesdk.FaceTracker;
import com.baidu.idl.facesdk.FaceVerifyData;
import com.p118pd.sdk.C8932ooOOO0o;
import java.util.ArrayList;

public class FaceModule implements IDetect, ILiveness {
    public static final String TAG = "FaceModule";
    public int[] mArgbData = null;
    public int mDegree = 90;
    public int mErrCode = 0;
    public FaceExtInfo mFaceExtInfo;
    public FaceExtInfo[] mFaceExtInfos;
    public FaceModel mFaceModel;
    public FaceTracker mFaceTracker;
    public int mImageHeight = 0;
    public int mImageWidth = 0;
    public boolean mLivenessFlag = false;
    public int[] mSaveFaceArgbData = null;

    public FaceModule(FaceTracker faceTracker) {
        this.mFaceTracker = faceTracker;
        if (faceTracker != null) {
            faceTracker.clearTrackedFaces();
        }
    }

    private FaceInfo[] faceTrackerDecode(byte[] bArr, int i, int i2) {
        if (this.mArgbData == null || i * i2 != this.mImageWidth * this.mImageHeight) {
            this.mArgbData = new int[(i * i2)];
            this.mImageWidth = i;
            this.mImageHeight = i2;
        }
        System.nanoTime();
        if (FaceSDK.getAuthorityStatus() != 0) {
            return null;
        }
        FaceSDK.getARGBFromYUVimg(bArr, this.mArgbData, i, i2, 360 - this.mDegree, 1);
        this.mErrCode = this.mFaceTracker.faceVerification(this.mArgbData, i, i2, FaceSDK.ImgType.ARGB, FaceTracker.ActionType.RECOGNIZE).ordinal();
        FaceInfo[] faceInfoArr = this.mFaceTracker.get_TrackedFaceInfo();
        System.nanoTime();
        if (faceInfoArr == null || faceInfoArr.length <= 0 || this.mErrCode != FaceTracker.ErrCode.OK.ordinal()) {
            return faceInfoArr;
        }
        this.mSaveFaceArgbData = this.mArgbData;
        return faceInfoArr;
    }

    private FaceExtInfo[] getExtInfo(FaceInfo[] faceInfoArr) {
        if (this.mFaceExtInfos == null) {
            this.mFaceExtInfos = new FaceExtInfo[1];
            this.mFaceExtInfo = new FaceExtInfo();
        }
        if (faceInfoArr == null || faceInfoArr.length <= 0) {
            this.mFaceExtInfos[0] = null;
        } else {
            if (this.mFaceExtInfo == null) {
                this.mFaceExtInfo = new FaceExtInfo();
            }
            this.mFaceExtInfo.addFaceInfo(faceInfoArr[0]);
            this.mFaceExtInfos[0] = this.mFaceExtInfo;
        }
        return this.mFaceExtInfos;
    }

    private FaceStatusEnum getModuleState(int i) {
        FaceStatusEnum faceStatusEnum = FaceStatusEnum.Detect_NoFace;
        if (i == FaceTracker.ErrCode.OK.ordinal()) {
            return FaceStatusEnum.OK;
        }
        if (i == FaceTracker.ErrCode.PITCH_OUT_OF_DOWN_MAX_RANGE.ordinal()) {
            return FaceStatusEnum.Detect_PitchOutOfDownMaxRange;
        }
        if (i == FaceTracker.ErrCode.PITCH_OUT_OF_UP_MAX_RANGE.ordinal()) {
            return FaceStatusEnum.Detect_PitchOutOfUpMaxRange;
        }
        if (i == FaceTracker.ErrCode.YAW_OUT_OF_LEFT_MAX_RANGE.ordinal()) {
            return FaceStatusEnum.Detect_PitchOutOfLeftMaxRange;
        }
        if (i == FaceTracker.ErrCode.YAW_OUT_OF_RIGHT_MAX_RANGE.ordinal()) {
            return FaceStatusEnum.Detect_PitchOutOfRightMaxRange;
        }
        if (i == FaceTracker.ErrCode.POOR_ILLUMINATION.ordinal()) {
            return FaceStatusEnum.Detect_PoorIllumintion;
        }
        if (i == FaceTracker.ErrCode.NO_FACE_DETECTED.ordinal()) {
            return FaceStatusEnum.Detect_NoFace;
        }
        if (i == FaceTracker.ErrCode.DATA_NOT_READY.ordinal()) {
            return FaceStatusEnum.Detect_DataNotReady;
        }
        if (i == FaceTracker.ErrCode.DATA_HIT_ONE.ordinal()) {
            return FaceStatusEnum.Detect_DataHitOne;
        }
        if (i == FaceTracker.ErrCode.DATA_HIT_LAST.ordinal()) {
            return FaceStatusEnum.Detect_DataHitLast;
        }
        if (i == FaceTracker.ErrCode.IMG_BLURED.ordinal()) {
            return FaceStatusEnum.Detect_ImageBlured;
        }
        if (i == FaceTracker.ErrCode.OCCLUSION_LEFT_EYE.ordinal()) {
            return FaceStatusEnum.Detect_OccLeftEye;
        }
        if (i == FaceTracker.ErrCode.OCCLUSION_RIGHT_EYE.ordinal()) {
            return FaceStatusEnum.Detect_OccRightEye;
        }
        if (i == FaceTracker.ErrCode.OCCLUSION_NOSE.ordinal()) {
            return FaceStatusEnum.Detect_OccNose;
        }
        if (i == FaceTracker.ErrCode.OCCLUSION_MOUTH.ordinal()) {
            return FaceStatusEnum.Detect_OccMouth;
        }
        if (i == FaceTracker.ErrCode.OCCLUSION_LEFT_CONTOUR.ordinal()) {
            return FaceStatusEnum.Detect_OccLeftContour;
        }
        if (i == FaceTracker.ErrCode.OCCLUSION_RIGHT_CONTOUR.ordinal()) {
            return FaceStatusEnum.Detect_OccRightContour;
        }
        if (i == FaceTracker.ErrCode.OCCLUSION_CHIN_CONTOUR.ordinal()) {
            return FaceStatusEnum.Detect_OccChin;
        }
        if (i == FaceTracker.ErrCode.FACE_NOT_COMPLETE.ordinal()) {
            return FaceStatusEnum.Detect_FaceNotComplete;
        }
        return i == FaceTracker.ErrCode.UNKNOW_TYPE.ordinal() ? FaceStatusEnum.Detect_NoFace : faceStatusEnum;
    }

    @Override // com.baidu.idl.face.platform.IDetect
    public FaceModel detect(byte[] bArr, int i, int i2) {
        if (bArr == null || i <= 0 || i2 <= 0) {
            return null;
        }
        FaceModel faceModel = new FaceModel();
        FaceInfo[] faceTrackerDecode = faceTrackerDecode(bArr, i, i2);
        faceModel.setArgbImage(this.mArgbData);
        faceModel.setFaceInfos(getExtInfo(faceTrackerDecode));
        faceModel.setFaceModuleState(getModuleState(this.mErrCode));
        faceModel.setFrameTime(System.currentTimeMillis());
        return faceModel;
    }

    @Override // com.baidu.idl.face.platform.IDetect
    public int[] getBestFaceImage() {
        return this.mSaveFaceArgbData;
    }

    public String getDetectBestImage(int i) {
        FaceVerifyData[] faceVerifyDataArr = this.mFaceTracker.get_FaceVerifyData(0);
        if (faceVerifyDataArr == null || faceVerifyDataArr.length <= 0) {
            return "";
        }
        int length = faceVerifyDataArr.length - 1;
        Bitmap createBitmap = Bitmap.createBitmap(faceVerifyDataArr[length].cols, faceVerifyDataArr[length].rows, Bitmap.Config.ARGB_8888);
        createBitmap.setPixels(faceVerifyDataArr[length].mRegImg, 0, faceVerifyDataArr[length].cols, 0, 0, faceVerifyDataArr[length].cols, faceVerifyDataArr[length].rows);
        String bitmapToJpegBase64 = BitmapUtils.bitmapToJpegBase64(createBitmap, 100);
        return (bitmapToJpegBase64 == null || bitmapToJpegBase64.length() <= 0) ? bitmapToJpegBase64 : bitmapToJpegBase64.replace("\\/", C8932ooOOO0o.OooO0OO);
    }

    public ArrayList<String> getDetectBestImageList() {
        ArrayList<String> arrayList = new ArrayList<>();
        FaceVerifyData[] faceVerifyDataArr = this.mFaceTracker.get_FaceVerifyData(0);
        if (faceVerifyDataArr != null && faceVerifyDataArr.length > 0) {
            for (int i = 0; i < faceVerifyDataArr.length; i++) {
                Bitmap createBitmap = Bitmap.createBitmap(faceVerifyDataArr[i].cols, faceVerifyDataArr[i].rows, Bitmap.Config.ARGB_8888);
                createBitmap.setPixels(faceVerifyDataArr[i].mRegImg, 0, faceVerifyDataArr[i].cols, 0, 0, faceVerifyDataArr[i].cols, faceVerifyDataArr[i].rows);
                String bitmapToJpegBase64 = BitmapUtils.bitmapToJpegBase64(createBitmap, 100);
                if (bitmapToJpegBase64 != null && bitmapToJpegBase64.length() > 0) {
                    bitmapToJpegBase64 = bitmapToJpegBase64.replace("\\/", C8932ooOOO0o.OooO0OO);
                }
                arrayList.add(bitmapToJpegBase64);
            }
        }
        return arrayList;
    }

    @Override // com.baidu.idl.face.platform.ILiveness
    public FaceModel liveness(LivenessTypeEnum livenessTypeEnum, byte[] bArr, int i, int i2) {
        if (bArr == null || livenessTypeEnum == null || i <= 0 || i2 <= 0) {
            return null;
        }
        FaceModel faceModel = new FaceModel();
        FaceInfo[] faceTrackerDecode = faceTrackerDecode(bArr, i, i2);
        faceModel.setArgbImage(this.mArgbData);
        faceModel.setFaceInfos(getExtInfo(faceTrackerDecode));
        faceModel.setFaceModuleState(getModuleState(this.mErrCode));
        faceModel.setFrameTime(System.currentTimeMillis());
        return faceModel;
    }

    @Override // com.baidu.idl.face.platform.IDetect, com.baidu.idl.face.platform.ILiveness
    public void reset() {
        FaceTracker faceTracker = this.mFaceTracker;
        if (faceTracker != null) {
            faceTracker.re_collect_reg_imgs();
            this.mFaceTracker.clearTrackedFaces();
        }
    }

    public void setPreviewDegree(int i) {
        if (i >= 0 && i <= 360) {
            this.mDegree = i;
        }
    }

    public String getDetectBestImage() {
        FaceVerifyData[] faceVerifyDataArr = this.mFaceTracker.get_FaceVerifyData(0);
        if (faceVerifyDataArr == null || faceVerifyDataArr.length <= 0) {
            return "";
        }
        int length = faceVerifyDataArr.length - 1;
        Bitmap createBitmap = Bitmap.createBitmap(faceVerifyDataArr[length].cols, faceVerifyDataArr[length].rows, Bitmap.Config.ARGB_8888);
        createBitmap.setPixels(faceVerifyDataArr[length].mRegImg, 0, faceVerifyDataArr[length].cols, 0, 0, faceVerifyDataArr[length].cols, faceVerifyDataArr[length].rows);
        String bitmapToJpegBase64 = BitmapUtils.bitmapToJpegBase64(createBitmap, 100);
        return (bitmapToJpegBase64 == null || bitmapToJpegBase64.length() <= 0) ? bitmapToJpegBase64 : bitmapToJpegBase64.replace("\\/", C8932ooOOO0o.OooO0OO);
    }
}

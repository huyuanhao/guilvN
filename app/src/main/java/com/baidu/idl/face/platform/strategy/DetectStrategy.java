package com.baidu.idl.face.platform.strategy;

import android.graphics.Rect;
import com.baidu.idl.face.platform.FaceEnvironment;
import com.baidu.idl.face.platform.FaceStatusEnum;
import com.baidu.idl.face.platform.LivenessTypeEnum;

public class DetectStrategy {
    public static final String TAG = "DetectStrategy";
    public FaceStatusEnum mCurrentFaceStatus;
    public long mDuration = 0;
    public int mHeadPitchValue = 10;
    public int mHeadRollValue = 10;
    public int mHeadYawValue = 10;
    public boolean mIsDetectSuccess = false;
    public LivenessTypeEnum mLivenessTypeEnum;
    public boolean mTimeoutFlag = false;

    /* renamed from: com.baidu.idl.face.platform.strategy.DetectStrategy$1 */
    public static /* synthetic */ class C04161 {
        public static final /* synthetic */ int[] $SwitchMap$com$baidu$idl$face$platform$FaceStatusEnum;

        /* JADX WARNING: Can't wrap try/catch for region: R(32:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|(3:31|32|34)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(34:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|34) */
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
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x00b4 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
            // Method dump skipped, instructions count: 193
            */
            throw new UnsupportedOperationException("Method not decompiled: com.baidu.idl.face.platform.strategy.DetectStrategy.C04161.<clinit>():void");
        }
    }

    private void checkTimeout(FaceStatusEnum faceStatusEnum) {
        FaceStatusEnum faceStatusEnum2 = this.mCurrentFaceStatus;
        if (faceStatusEnum2 == null || faceStatusEnum2 != faceStatusEnum) {
            this.mCurrentFaceStatus = faceStatusEnum;
            this.mDuration = System.currentTimeMillis();
            this.mTimeoutFlag = false;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (this.mCurrentFaceStatus == faceStatusEnum && currentTimeMillis - this.mDuration > FaceEnvironment.TIME_DETECT_MODULE) {
            this.mTimeoutFlag = true;
        }
    }

    private FaceStatusEnum getHeadPose(float f, float f2) {
        LivenessTypeEnum livenessTypeEnum;
        LivenessTypeEnum livenessTypeEnum2;
        int i = this.mHeadYawValue;
        float f3 = (float) i;
        float f4 = (float) i;
        int i2 = this.mHeadPitchValue;
        float f5 = (float) i2;
        float f6 = (float) i2;
        if (f > f5 && this.mLivenessTypeEnum != LivenessTypeEnum.HeadDown) {
            return FaceStatusEnum.Detect_PitchOutOfDownMaxRange;
        }
        if (f < f6 * -1.0f && this.mLivenessTypeEnum != LivenessTypeEnum.HeadUp) {
            return FaceStatusEnum.Detect_PitchOutOfUpMaxRange;
        }
        if (f2 > f3 && (livenessTypeEnum2 = this.mLivenessTypeEnum) != LivenessTypeEnum.HeadLeft && livenessTypeEnum2 != LivenessTypeEnum.HeadLeftOrRight) {
            return FaceStatusEnum.Detect_PitchOutOfLeftMaxRange;
        }
        if (f2 >= f4 * -1.0f || (livenessTypeEnum = this.mLivenessTypeEnum) == LivenessTypeEnum.HeadRight || livenessTypeEnum == LivenessTypeEnum.HeadLeftOrRight) {
            return null;
        }
        return FaceStatusEnum.Detect_PitchOutOfRightMaxRange;
    }

    private boolean isDefaultDetectStatus(FaceStatusEnum faceStatusEnum) {
        switch (C04161.$SwitchMap$com$baidu$idl$face$platform$FaceStatusEnum[faceStatusEnum.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
                return true;
            default:
                return false;
        }
    }

    public FaceStatusEnum checkDetect(Rect rect, Rect rect2, float f, float f2, int i, int i2, FaceStatusEnum faceStatusEnum) {
        if (isDefaultDetectStatus(faceStatusEnum)) {
            checkTimeout(faceStatusEnum);
            return faceStatusEnum;
        } else if (i2 > rect2.width() * 1) {
            FaceStatusEnum faceStatusEnum2 = FaceStatusEnum.Detect_FaceZoomOut;
            checkTimeout(faceStatusEnum2);
            return faceStatusEnum2;
        } else if (((float) i2) < ((float) rect2.width()) * 0.4f) {
            FaceStatusEnum faceStatusEnum3 = FaceStatusEnum.Detect_FaceZoomIn;
            checkTimeout(faceStatusEnum3);
            return faceStatusEnum3;
        } else {
            FaceStatusEnum headPose = getHeadPose(f, f2);
            if (headPose != null) {
                faceStatusEnum = headPose;
            }
            if (i > 10) {
                FaceStatusEnum faceStatusEnum4 = FaceStatusEnum.Detect_FacePointOut;
                checkTimeout(faceStatusEnum4);
                return faceStatusEnum4;
            }
            checkTimeout(faceStatusEnum);
            if (faceStatusEnum == FaceStatusEnum.OK) {
                this.mIsDetectSuccess = true;
            }
            return faceStatusEnum;
        }
    }

    public boolean isDetectCheckSuccess() {
        return this.mIsDetectSuccess;
    }

    public boolean isTimeout() {
        return this.mTimeoutFlag;
    }

    public void reset() {
        this.mDuration = 0;
        this.mTimeoutFlag = false;
        this.mIsDetectSuccess = false;
        this.mCurrentFaceStatus = null;
    }

    public void setHeadAngle(int i, int i2, int i3) {
        this.mHeadPitchValue = i;
        this.mHeadYawValue = i2;
        this.mHeadRollValue = i3;
    }

    public void setLiveness(LivenessTypeEnum livenessTypeEnum) {
        this.mLivenessTypeEnum = livenessTypeEnum;
    }
}

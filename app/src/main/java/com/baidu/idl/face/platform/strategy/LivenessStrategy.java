package com.baidu.idl.face.platform.strategy;

import com.baidu.idl.face.platform.FaceEnvironment;
import com.baidu.idl.face.platform.FaceStatusEnum;
import com.baidu.idl.face.platform.LivenessTypeEnum;
import java.util.List;

@Deprecated
public class LivenessStrategy {
    public static final String TAG = "LivenessStrategy";
    public volatile LivenessTypeEnum mCurrentLivenessTypeEnum;
    public long mDuration;
    public volatile int mIndex;
    public volatile boolean mIsCurrentCheckSuccess;
    public List<LivenessTypeEnum> mLivenessList;
    public boolean mTimeoutFlag;

    /* renamed from: com.baidu.idl.face.platform.strategy.LivenessStrategy$1 */
    public static /* synthetic */ class C04221 {
        public static final /* synthetic */ int[] $SwitchMap$com$baidu$idl$face$platform$LivenessTypeEnum;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|(3:13|14|16)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(16:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|16) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.baidu.idl.face.platform.LivenessTypeEnum[] r0 = com.baidu.idl.face.platform.LivenessTypeEnum.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.baidu.idl.face.platform.strategy.LivenessStrategy.C04221.$SwitchMap$com$baidu$idl$face$platform$LivenessTypeEnum = r0
                com.baidu.idl.face.platform.LivenessTypeEnum r1 = com.baidu.idl.face.platform.LivenessTypeEnum.Eye     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.baidu.idl.face.platform.strategy.LivenessStrategy.C04221.$SwitchMap$com$baidu$idl$face$platform$LivenessTypeEnum     // Catch:{ NoSuchFieldError -> 0x001d }
                com.baidu.idl.face.platform.LivenessTypeEnum r1 = com.baidu.idl.face.platform.LivenessTypeEnum.Mouth     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = com.baidu.idl.face.platform.strategy.LivenessStrategy.C04221.$SwitchMap$com$baidu$idl$face$platform$LivenessTypeEnum     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.baidu.idl.face.platform.LivenessTypeEnum r1 = com.baidu.idl.face.platform.LivenessTypeEnum.HeadUp     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = com.baidu.idl.face.platform.strategy.LivenessStrategy.C04221.$SwitchMap$com$baidu$idl$face$platform$LivenessTypeEnum     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.baidu.idl.face.platform.LivenessTypeEnum r1 = com.baidu.idl.face.platform.LivenessTypeEnum.HeadDown     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = com.baidu.idl.face.platform.strategy.LivenessStrategy.C04221.$SwitchMap$com$baidu$idl$face$platform$LivenessTypeEnum     // Catch:{ NoSuchFieldError -> 0x003e }
                com.baidu.idl.face.platform.LivenessTypeEnum r1 = com.baidu.idl.face.platform.LivenessTypeEnum.HeadLeft     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = com.baidu.idl.face.platform.strategy.LivenessStrategy.C04221.$SwitchMap$com$baidu$idl$face$platform$LivenessTypeEnum     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.baidu.idl.face.platform.LivenessTypeEnum r1 = com.baidu.idl.face.platform.LivenessTypeEnum.HeadRight     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = com.baidu.idl.face.platform.strategy.LivenessStrategy.C04221.$SwitchMap$com$baidu$idl$face$platform$LivenessTypeEnum     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.baidu.idl.face.platform.LivenessTypeEnum r1 = com.baidu.idl.face.platform.LivenessTypeEnum.HeadLeftOrRight     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.baidu.idl.face.platform.strategy.LivenessStrategy.C04221.<clinit>():void");
        }
    }

    public LivenessStrategy() {
        this.mDuration = 0;
        this.mIndex = 0;
        this.mCurrentLivenessTypeEnum = null;
        this.mIsCurrentCheckSuccess = false;
        this.mTimeoutFlag = false;
        this.mIndex = 0;
        this.mDuration = System.currentTimeMillis();
    }

    /* JADX WARNING: Removed duplicated region for block: B:4:0x000a A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean getLivenessStatus(int[] r5, com.baidu.idl.face.platform.LivenessTypeEnum r6) {
        /*
            com.baidu.idl.face.platform.LivenessTypeEnum r0 = com.baidu.idl.face.platform.LivenessTypeEnum.Eye
            r1 = 0
            r2 = 1
            if (r6 != r0) goto L_0x000c
            r5 = r5[r1]
            if (r5 != r2) goto L_0x004d
        L_0x000a:
            r1 = 1
            goto L_0x004d
        L_0x000c:
            com.baidu.idl.face.platform.LivenessTypeEnum r0 = com.baidu.idl.face.platform.LivenessTypeEnum.Mouth
            if (r6 != r0) goto L_0x0016
            r6 = 3
            r5 = r5[r6]
            if (r5 != r2) goto L_0x004d
            goto L_0x000a
        L_0x0016:
            com.baidu.idl.face.platform.LivenessTypeEnum r0 = com.baidu.idl.face.platform.LivenessTypeEnum.HeadLeft
            r3 = 5
            if (r6 != r0) goto L_0x0020
            r5 = r5[r3]
            if (r5 != r2) goto L_0x004d
            goto L_0x000a
        L_0x0020:
            com.baidu.idl.face.platform.LivenessTypeEnum r0 = com.baidu.idl.face.platform.LivenessTypeEnum.HeadRight
            r4 = 6
            if (r6 != r0) goto L_0x002a
            r5 = r5[r4]
            if (r5 != r2) goto L_0x004d
            goto L_0x000a
        L_0x002a:
            com.baidu.idl.face.platform.LivenessTypeEnum r0 = com.baidu.idl.face.platform.LivenessTypeEnum.HeadUp
            if (r6 != r0) goto L_0x0035
            r6 = 8
            r5 = r5[r6]
            if (r5 != r2) goto L_0x004d
            goto L_0x000a
        L_0x0035:
            com.baidu.idl.face.platform.LivenessTypeEnum r0 = com.baidu.idl.face.platform.LivenessTypeEnum.HeadDown
            if (r6 != r0) goto L_0x0040
            r6 = 9
            r5 = r5[r6]
            if (r5 != r2) goto L_0x004d
            goto L_0x000a
        L_0x0040:
            com.baidu.idl.face.platform.LivenessTypeEnum r0 = com.baidu.idl.face.platform.LivenessTypeEnum.HeadLeftOrRight
            if (r6 != r0) goto L_0x004d
            r6 = r5[r3]
            if (r6 == r2) goto L_0x000a
            r5 = r5[r4]
            if (r5 != r2) goto L_0x004d
            goto L_0x000a
        L_0x004d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baidu.idl.face.platform.strategy.LivenessStrategy.getLivenessStatus(int[], com.baidu.idl.face.platform.LivenessTypeEnum):boolean");
    }

    public void checkLiveness(int[] iArr) {
        if (this.mIndex < this.mLivenessList.size() && !this.mIsCurrentCheckSuccess) {
            if (System.currentTimeMillis() - this.mDuration > FaceEnvironment.TIME_LIVENESS_MODULE) {
                this.mTimeoutFlag = true;
                this.mIsCurrentCheckSuccess = false;
                return;
            }
            this.mIsCurrentCheckSuccess = getLivenessStatus(iArr, this.mCurrentLivenessTypeEnum);
        }
    }

    public FaceStatusEnum getCurrentLivenessStatus() {
        if (this.mCurrentLivenessTypeEnum != null) {
            switch (C04221.$SwitchMap$com$baidu$idl$face$platform$LivenessTypeEnum[this.mCurrentLivenessTypeEnum.ordinal()]) {
                case 1:
                    return FaceStatusEnum.Liveness_Eye;
                case 2:
                    return FaceStatusEnum.Liveness_Mouth;
                case 3:
                    return FaceStatusEnum.Liveness_HeadUp;
                case 4:
                    return FaceStatusEnum.Liveness_HeadDown;
                case 5:
                    return FaceStatusEnum.Liveness_HeadLeft;
                case 6:
                    return FaceStatusEnum.Liveness_HeadRight;
                case 7:
                    return FaceStatusEnum.Liveness_HeadLeftRight;
            }
        }
        return null;
    }

    public LivenessTypeEnum getCurrentLivenessType() {
        return this.mCurrentLivenessTypeEnum;
    }

    public boolean isCurrentLivenessCheckSuccess() {
        return this.mIsCurrentCheckSuccess;
    }

    public boolean isLivenessCheckSuccess() {
        return this.mIsCurrentCheckSuccess && this.mIndex >= this.mLivenessList.size() - 1;
    }

    public boolean isTimeout() {
        return this.mTimeoutFlag;
    }

    public void nextLiveness() {
        if (this.mIndex + 1 < this.mLivenessList.size()) {
            this.mIndex++;
            this.mIsCurrentCheckSuccess = false;
            this.mCurrentLivenessTypeEnum = this.mLivenessList.get(this.mIndex);
            this.mDuration = System.currentTimeMillis();
        }
    }

    public void reset() {
        this.mIsCurrentCheckSuccess = false;
        this.mIndex = 0;
        if (this.mLivenessList != null && this.mIndex < this.mLivenessList.size()) {
            this.mCurrentLivenessTypeEnum = this.mLivenessList.get(this.mIndex);
        }
        this.mDuration = System.currentTimeMillis();
        this.mTimeoutFlag = false;
    }

    public void resetState() {
        this.mIsCurrentCheckSuccess = false;
        this.mDuration = System.currentTimeMillis();
        this.mTimeoutFlag = false;
    }

    public void setLivenessList(List<LivenessTypeEnum> list) {
        this.mLivenessList = list;
        if (list != null && this.mIndex < this.mLivenessList.size()) {
            this.mCurrentLivenessTypeEnum = this.mLivenessList.get(this.mIndex);
        }
    }
}

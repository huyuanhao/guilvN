package com.baidu.idl.face.platform.strategy;

import com.baidu.idl.face.platform.FaceEnvironment;
import com.baidu.idl.face.platform.FaceStatusEnum;
import com.baidu.idl.face.platform.LivenessTypeEnum;
import com.baidu.idl.face.platform.model.FaceExtInfo;
import com.xiaomi.mipush.sdk.Constants;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LivenessStatusStrategy {
    public static final String TAG = "LivenessStatusStrategy";
    public volatile LivenessTypeEnum mCurrentLivenessTypeEnum;
    public long mFaceID;
    public long mLivenessDuration;
    public volatile int mLivenessIndex;
    public List<LivenessTypeEnum> mLivenessList;
    public HashMap<LivenessTypeEnum, Boolean> mLivenessStatusMap;
    public boolean mLivenessTimeoutFlag;

    /* renamed from: com.baidu.idl.face.platform.strategy.LivenessStatusStrategy$1 */
    public static /* synthetic */ class C04211 {
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
                com.baidu.idl.face.platform.strategy.LivenessStatusStrategy.C04211.$SwitchMap$com$baidu$idl$face$platform$LivenessTypeEnum = r0
                com.baidu.idl.face.platform.LivenessTypeEnum r1 = com.baidu.idl.face.platform.LivenessTypeEnum.Eye     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.baidu.idl.face.platform.strategy.LivenessStatusStrategy.C04211.$SwitchMap$com$baidu$idl$face$platform$LivenessTypeEnum     // Catch:{ NoSuchFieldError -> 0x001d }
                com.baidu.idl.face.platform.LivenessTypeEnum r1 = com.baidu.idl.face.platform.LivenessTypeEnum.Mouth     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = com.baidu.idl.face.platform.strategy.LivenessStatusStrategy.C04211.$SwitchMap$com$baidu$idl$face$platform$LivenessTypeEnum     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.baidu.idl.face.platform.LivenessTypeEnum r1 = com.baidu.idl.face.platform.LivenessTypeEnum.HeadUp     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = com.baidu.idl.face.platform.strategy.LivenessStatusStrategy.C04211.$SwitchMap$com$baidu$idl$face$platform$LivenessTypeEnum     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.baidu.idl.face.platform.LivenessTypeEnum r1 = com.baidu.idl.face.platform.LivenessTypeEnum.HeadDown     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = com.baidu.idl.face.platform.strategy.LivenessStatusStrategy.C04211.$SwitchMap$com$baidu$idl$face$platform$LivenessTypeEnum     // Catch:{ NoSuchFieldError -> 0x003e }
                com.baidu.idl.face.platform.LivenessTypeEnum r1 = com.baidu.idl.face.platform.LivenessTypeEnum.HeadLeft     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = com.baidu.idl.face.platform.strategy.LivenessStatusStrategy.C04211.$SwitchMap$com$baidu$idl$face$platform$LivenessTypeEnum     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.baidu.idl.face.platform.LivenessTypeEnum r1 = com.baidu.idl.face.platform.LivenessTypeEnum.HeadRight     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = com.baidu.idl.face.platform.strategy.LivenessStatusStrategy.C04211.$SwitchMap$com$baidu$idl$face$platform$LivenessTypeEnum     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.baidu.idl.face.platform.LivenessTypeEnum r1 = com.baidu.idl.face.platform.LivenessTypeEnum.HeadLeftOrRight     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.baidu.idl.face.platform.strategy.LivenessStatusStrategy.C04211.<clinit>():void");
        }
    }

    public LivenessStatusStrategy() {
        this.mLivenessDuration = 0;
        this.mLivenessIndex = 0;
        this.mLivenessTimeoutFlag = false;
        this.mCurrentLivenessTypeEnum = null;
        this.mFaceID = -1;
        this.mLivenessStatusMap = new HashMap<>();
        this.mLivenessIndex = 0;
        this.mLivenessDuration = System.currentTimeMillis();
    }

    private void clearLivenessStatus() {
        this.mLivenessStatusMap.clear();
        for (int i = 0; i < this.mLivenessList.size(); i++) {
            this.mLivenessStatusMap.put(this.mLivenessList.get(i), false);
        }
    }

    public FaceStatusEnum getCurrentLivenessStatus() {
        if (this.mCurrentLivenessTypeEnum != null) {
            switch (C04211.$SwitchMap$com$baidu$idl$face$platform$LivenessTypeEnum[this.mCurrentLivenessTypeEnum.ordinal()]) {
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

    public boolean isCurrentLivenessSuccess() {
        if (this.mLivenessStatusMap.containsKey(this.mCurrentLivenessTypeEnum)) {
            return this.mLivenessStatusMap.get(this.mCurrentLivenessTypeEnum).booleanValue();
        }
        return false;
    }

    public boolean isLivenessSuccess() {
        for (Map.Entry<LivenessTypeEnum, Boolean> entry : this.mLivenessStatusMap.entrySet()) {
            if (!entry.getValue().booleanValue()) {
                entry.getKey().name();
                return false;
            }
        }
        return true;
    }

    public boolean isTimeout() {
        return this.mLivenessTimeoutFlag;
    }

    public boolean nextLiveness() {
        if (this.mLivenessIndex + 1 >= this.mLivenessList.size()) {
            return false;
        }
        this.mLivenessIndex++;
        this.mCurrentLivenessTypeEnum = this.mLivenessList.get(this.mLivenessIndex);
        this.mLivenessDuration = System.currentTimeMillis();
        return true;
    }

    public void processLiveness(FaceExtInfo faceExtInfo) {
        if (System.currentTimeMillis() - this.mLivenessDuration > FaceEnvironment.TIME_LIVENESS_MODULE) {
            this.mLivenessTimeoutFlag = true;
        } else if (faceExtInfo != null) {
            if (((long) faceExtInfo.getFaceId()) != this.mFaceID) {
                this.mFaceID = (long) faceExtInfo.getFaceId();
            }
            switch (C04211.$SwitchMap$com$baidu$idl$face$platform$LivenessTypeEnum[this.mCurrentLivenessTypeEnum.ordinal()]) {
                case 1:
                    String str = "ext Eye " + faceExtInfo.isLiveEye();
                    break;
                case 2:
                    String str2 = "ext Mouth " + faceExtInfo.isLiveMouth();
                    break;
                case 3:
                    String str3 = "ext HeadUp " + faceExtInfo.isLiveHeadUp();
                    break;
                case 4:
                    String str4 = "ext HeadDown " + faceExtInfo.isLiveHeadDown();
                    break;
                case 5:
                    String str5 = "ext HeadLeft " + faceExtInfo.isLiveHeadTurnLeft();
                    break;
                case 6:
                    String str6 = "ext HeadRight " + faceExtInfo.isLiveHeadTurnRight();
                    break;
                case 7:
                    String str7 = "ext HeadLeftOrRight " + faceExtInfo.isLiveHeadTurnLeft() + Constants.ACCEPT_TIME_SEPARATOR_SERVER + faceExtInfo.isLiveHeadTurnRight();
                    break;
            }
            if (this.mLivenessList.contains(LivenessTypeEnum.Eye) && !this.mLivenessStatusMap.containsKey(LivenessTypeEnum.Eye)) {
                this.mLivenessStatusMap.put(LivenessTypeEnum.Eye, Boolean.valueOf(faceExtInfo.isLiveEye()));
            } else if (this.mCurrentLivenessTypeEnum == LivenessTypeEnum.Eye && faceExtInfo.isLiveEye()) {
                this.mLivenessStatusMap.put(LivenessTypeEnum.Eye, Boolean.valueOf(faceExtInfo.isLiveEye()));
            }
            if (this.mLivenessList.contains(LivenessTypeEnum.Mouth) && !this.mLivenessStatusMap.containsKey(LivenessTypeEnum.Mouth)) {
                this.mLivenessStatusMap.put(LivenessTypeEnum.Mouth, Boolean.valueOf(faceExtInfo.isLiveMouth()));
            } else if (this.mCurrentLivenessTypeEnum == LivenessTypeEnum.Mouth && faceExtInfo.isLiveMouth()) {
                this.mLivenessStatusMap.put(LivenessTypeEnum.Mouth, Boolean.valueOf(faceExtInfo.isLiveMouth()));
            }
            if (this.mLivenessList.contains(LivenessTypeEnum.HeadUp) && !this.mLivenessStatusMap.containsKey(LivenessTypeEnum.HeadUp)) {
                this.mLivenessStatusMap.put(LivenessTypeEnum.HeadUp, Boolean.valueOf(faceExtInfo.isLiveHeadUp()));
            } else if (this.mCurrentLivenessTypeEnum == LivenessTypeEnum.HeadUp && faceExtInfo.isLiveHeadUp()) {
                this.mLivenessStatusMap.put(LivenessTypeEnum.HeadUp, Boolean.valueOf(faceExtInfo.isLiveHeadUp()));
            }
            if (this.mLivenessList.contains(LivenessTypeEnum.HeadDown) && !this.mLivenessStatusMap.containsKey(LivenessTypeEnum.HeadDown)) {
                this.mLivenessStatusMap.put(LivenessTypeEnum.HeadDown, Boolean.valueOf(faceExtInfo.isLiveHeadDown()));
            } else if (this.mCurrentLivenessTypeEnum == LivenessTypeEnum.HeadDown && faceExtInfo.isLiveHeadDown()) {
                this.mLivenessStatusMap.put(LivenessTypeEnum.HeadDown, Boolean.valueOf(faceExtInfo.isLiveHeadDown()));
            }
            if (this.mLivenessList.contains(LivenessTypeEnum.HeadLeft) && !this.mLivenessStatusMap.containsKey(LivenessTypeEnum.HeadLeft)) {
                this.mLivenessStatusMap.put(LivenessTypeEnum.HeadLeft, Boolean.valueOf(faceExtInfo.isLiveHeadTurnLeft()));
            } else if (this.mCurrentLivenessTypeEnum == LivenessTypeEnum.HeadLeft && faceExtInfo.isLiveHeadTurnLeft()) {
                this.mLivenessStatusMap.put(LivenessTypeEnum.HeadLeft, Boolean.valueOf(faceExtInfo.isLiveHeadTurnLeft()));
            }
            if (this.mLivenessList.contains(LivenessTypeEnum.HeadRight) && !this.mLivenessStatusMap.containsKey(LivenessTypeEnum.HeadRight)) {
                this.mLivenessStatusMap.put(LivenessTypeEnum.HeadRight, Boolean.valueOf(faceExtInfo.isLiveHeadTurnRight()));
            } else if (this.mCurrentLivenessTypeEnum == LivenessTypeEnum.HeadRight && faceExtInfo.isLiveHeadTurnRight()) {
                this.mLivenessStatusMap.put(LivenessTypeEnum.HeadRight, Boolean.valueOf(faceExtInfo.isLiveHeadTurnRight()));
            }
            if (this.mLivenessList.contains(LivenessTypeEnum.HeadLeftOrRight) && !this.mLivenessStatusMap.containsKey(LivenessTypeEnum.HeadLeftOrRight)) {
                this.mLivenessStatusMap.put(LivenessTypeEnum.HeadLeftOrRight, Boolean.valueOf(faceExtInfo.isLiveHeadTurnLeftOrRight()));
            } else if (this.mCurrentLivenessTypeEnum == LivenessTypeEnum.HeadLeftOrRight && faceExtInfo.isLiveHeadTurnLeftOrRight()) {
                this.mLivenessStatusMap.put(LivenessTypeEnum.HeadLeftOrRight, Boolean.valueOf(faceExtInfo.isLiveHeadTurnLeftOrRight()));
            }
        }
    }

    public void reset() {
        this.mLivenessIndex = 0;
        clearLivenessStatus();
        if (this.mLivenessList != null && this.mLivenessIndex < this.mLivenessList.size()) {
            this.mCurrentLivenessTypeEnum = this.mLivenessList.get(this.mLivenessIndex);
        }
        this.mLivenessDuration = System.currentTimeMillis();
        this.mLivenessTimeoutFlag = false;
    }

    public void resetState() {
        this.mLivenessDuration = System.currentTimeMillis();
        this.mLivenessTimeoutFlag = false;
    }

    public void setLivenessList(List<LivenessTypeEnum> list) {
        if (list != null && list.size() > 0) {
            this.mLivenessList = list;
            this.mCurrentLivenessTypeEnum = list.get(0);
            clearLivenessStatus();
            StringBuilder sb = new StringBuilder();
            for (LivenessTypeEnum livenessTypeEnum : this.mLivenessList) {
                sb.append(livenessTypeEnum.name());
                sb.append(Constants.ACCEPT_TIME_SEPARATOR_SERVER);
            }
        }
    }
}

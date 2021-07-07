package com.baidu.idl.face.platform;

import java.util.ArrayList;
import java.util.List;

public final class FaceEnvironment {
    public static final int AG_ID = 3;

    /* renamed from: OS */
    public static final String f946OS = "android";
    public static final String SDK_VERSION = "3.1.0.0";
    public static final String TAG = "Baidu-IDL-FaceSDK";
    public static long TIME_DETECT_MODULE = 15000;
    public static long TIME_DETECT_NO_FACE_CONTINUOUS = 1000;
    public static long TIME_LIVENESS_MODULE = 15000;
    public static long TIME_MODULE = 0;
    public static long TIME_TIPS_REPEAT = 3000;
    public static final float VALUE_BLURNESS = 0.5f;
    public static final float VALUE_BRIGHTNESS = 40.0f;
    public static final int VALUE_CROP_FACE_SIZE = 400;
    public static final int VALUE_DECODE_THREAD_NUM = 2;
    public static final int VALUE_HEAD_PITCH = 10;
    public static final int VALUE_HEAD_ROLL = 10;
    public static final int VALUE_HEAD_YAW = 10;
    public static final boolean VALUE_IS_CHECK_QUALITY = true;
    public static final int VALUE_LIVENESS_DEFAULT_RANDOM_COUNT = 3;
    public static final int VALUE_MAX_CROP_IMAGE_NUM = 1;
    public static final int VALUE_MIN_FACE_SIZE = 200;
    public static final float VALUE_NOT_FACE_THRESHOLD = 0.6f;
    public static final float VALUE_OCCLUSION = 0.5f;
    public static final List<LivenessTypeEnum> livenessTypeDefaultList;
    public static boolean mIsDebug;
    public static int[] mSoundIds = new int[FaceStatusEnum.values().length];
    public static int[] mTipsTextIds = new int[FaceStatusEnum.values().length];

    static {
        ArrayList arrayList = new ArrayList();
        livenessTypeDefaultList = arrayList;
        arrayList.add(LivenessTypeEnum.Eye);
        livenessTypeDefaultList.add(LivenessTypeEnum.Mouth);
        livenessTypeDefaultList.add(LivenessTypeEnum.HeadUp);
        livenessTypeDefaultList.add(LivenessTypeEnum.HeadDown);
        livenessTypeDefaultList.add(LivenessTypeEnum.HeadLeft);
        livenessTypeDefaultList.add(LivenessTypeEnum.HeadRight);
        int i = 0;
        while (true) {
            int[] iArr = mSoundIds;
            if (i < iArr.length) {
                iArr[i] = 0;
                mTipsTextIds[i] = 0;
                i++;
            } else {
                return;
            }
        }
    }

    public static int getSoundId(FaceStatusEnum faceStatusEnum) {
        return mSoundIds[faceStatusEnum.ordinal()];
    }

    public static int getTipsId(FaceStatusEnum faceStatusEnum) {
        return mTipsTextIds[faceStatusEnum.ordinal()];
    }

    public static boolean isDebugable() {
        return mIsDebug;
    }

    public static void setSoundId(FaceStatusEnum faceStatusEnum, int i) {
        int[] iArr = mSoundIds;
        if (iArr != null) {
            try {
                iArr[faceStatusEnum.ordinal()] = i;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static void setTipsId(FaceStatusEnum faceStatusEnum, int i) {
        int[] iArr = mTipsTextIds;
        if (iArr != null) {
            try {
                iArr[faceStatusEnum.ordinal()] = i;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}

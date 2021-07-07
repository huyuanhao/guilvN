package com.baidu.idl.face.platform;

import java.util.HashMap;

public interface ILivenessStrategyCallback {
    public static final String IMAGE_KEY_BEST_IMAGE = "bestImage";

    void onLivenessCompletion(FaceStatusEnum faceStatusEnum, String str, HashMap<String, String> hashMap);
}

package com.baidu.idl.face.platform;

import android.graphics.Rect;
import java.util.List;

public interface ILivenessStrategy {
    String getBestFaceImage();

    void livenessStrategy(byte[] bArr);

    void reset();

    void setLivenessStrategyConfig(List<LivenessTypeEnum> list, Rect rect, Rect rect2, ILivenessStrategyCallback iLivenessStrategyCallback);

    void setLivenessStrategySoundEnable(boolean z);

    void setPreviewDegree(int i);
}

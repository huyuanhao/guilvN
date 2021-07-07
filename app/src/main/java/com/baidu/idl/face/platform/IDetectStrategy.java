package com.baidu.idl.face.platform;

import android.graphics.Rect;

public interface IDetectStrategy {
    void detectStrategy(byte[] bArr);

    String getBestFaceImage();

    void reset();

    void setDetectStrategyConfig(Rect rect, Rect rect2, IDetectStrategyCallback iDetectStrategyCallback);

    void setDetectStrategySoundEnable(boolean z);

    void setPreviewDegree(int i);
}

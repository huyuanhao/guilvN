package com.baidu.idl.face.platform;

import com.baidu.idl.face.platform.model.FaceModel;

public interface IDetect {
    FaceModel detect(byte[] bArr, int i, int i2);

    int[] getBestFaceImage();

    void reset();
}

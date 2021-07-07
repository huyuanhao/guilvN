package com.baidu.idl.face.platform;

import com.baidu.idl.face.platform.model.FaceModel;

public interface ILiveness {
    FaceModel liveness(LivenessTypeEnum livenessTypeEnum, byte[] bArr, int i, int i2);

    void reset();
}

package com.baidu.idl.face.platform.model;

import com.baidu.idl.face.platform.FaceStatusEnum;

public class FaceModel {
    public int[] argbImage;
    public FaceExtInfo[] faceInfos;
    public FaceStatusEnum faceStatus;
    public long frameTime;

    public int[] getArgbImage() {
        return this.argbImage;
    }

    public FaceExtInfo[] getFaceInfos() {
        return this.faceInfos;
    }

    public FaceStatusEnum getFaceModuleState() {
        return this.faceStatus;
    }

    public long getFrameTime() {
        return this.frameTime;
    }

    public void setArgbImage(int[] iArr) {
        this.argbImage = iArr;
    }

    public void setFaceInfos(FaceExtInfo[] faceExtInfoArr) {
        this.faceInfos = faceExtInfoArr;
    }

    public void setFaceModuleState(FaceStatusEnum faceStatusEnum) {
        this.faceStatus = faceStatusEnum;
    }

    public void setFrameTime(long j) {
        this.frameTime = j;
    }
}

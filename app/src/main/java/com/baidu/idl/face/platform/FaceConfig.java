package com.baidu.idl.face.platform;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FaceConfig implements Serializable {
    public static final String TAG = FaceConfig.class.getSimpleName();
    public float blurnessValue = 0.5f;
    public float brightnessValue = 40.0f;
    public int cropFaceValue = 400;
    public int faceDecodeNumberOfThreads = 0;
    public int headPitchValue = 10;
    public int headRollValue = 10;
    public int headYawValue = 10;
    public boolean isCheckFaceQuality = true;
    public boolean isLivenessRandom = false;
    public boolean isSound = true;
    public boolean isVerifyLive = true;
    public int livenessRandomCount = 3;
    public List<LivenessTypeEnum> livenessTypeList = FaceEnvironment.livenessTypeDefaultList;
    public int maxCropImageNum = 1;
    public int minFaceSize = 200;
    public float notFaceValue = 0.6f;
    public float occlusionValue = 0.5f;

    public float getBlurnessValue() {
        return this.blurnessValue;
    }

    public float getBrightnessValue() {
        return this.brightnessValue;
    }

    public int getCropFaceValue() {
        return this.cropFaceValue;
    }

    public int getFaceDecodeNumberOfThreads() {
        return this.faceDecodeNumberOfThreads;
    }

    public int getHeadPitchValue() {
        return this.headPitchValue;
    }

    public int getHeadRollValue() {
        return this.headRollValue;
    }

    public int getHeadYawValue() {
        return this.headYawValue;
    }

    public int getLivenessRandomCount() {
        return this.livenessRandomCount;
    }

    public List<LivenessTypeEnum> getLivenessTypeList() {
        List<LivenessTypeEnum> list = this.livenessTypeList;
        if (list == null || list.size() == 0) {
            ArrayList arrayList = new ArrayList();
            this.livenessTypeList = arrayList;
            arrayList.addAll(FaceEnvironment.livenessTypeDefaultList);
            Collections.shuffle(this.livenessTypeList);
            this.livenessTypeList = this.livenessTypeList.subList(0, 3);
        } else if (this.isLivenessRandom) {
            Collections.shuffle(this.livenessTypeList);
        }
        return this.livenessTypeList;
    }

    public int getMaxCropImageNum() {
        return this.maxCropImageNum;
    }

    public int getMinFaceSize() {
        return this.minFaceSize;
    }

    public float getNotFaceValue() {
        return this.notFaceValue;
    }

    public float getOcclusionValue() {
        return this.occlusionValue;
    }

    public boolean isCheckFaceQuality() {
        return this.isCheckFaceQuality;
    }

    public boolean isLivenessRandom() {
        return this.isLivenessRandom;
    }

    public boolean isSound() {
        return this.isSound;
    }

    public boolean isVerifyLive() {
        return this.isVerifyLive;
    }

    public void setBlurnessValue(float f) {
        this.blurnessValue = f;
    }

    public void setBrightnessValue(float f) {
        this.brightnessValue = f;
    }

    public void setCheckFaceQuality(boolean z) {
        this.isCheckFaceQuality = z;
    }

    public void setCropFaceValue(int i) {
        this.cropFaceValue = i;
    }

    public void setFaceDecodeNumberOfThreads(int i) {
        this.faceDecodeNumberOfThreads = i;
    }

    public void setHeadPitchValue(int i) {
        this.headPitchValue = i;
    }

    public void setHeadRollValue(int i) {
        this.headRollValue = i;
    }

    public void setHeadYawValue(int i) {
        this.headYawValue = i;
    }

    public void setLivenessRandom(boolean z) {
        this.isLivenessRandom = z;
    }

    public void setLivenessRandomCount(int i) {
        int size = FaceEnvironment.livenessTypeDefaultList.size();
        if (i > size) {
            i = size;
        }
        this.livenessRandomCount = i;
    }

    public void setLivenessTypeList(List<LivenessTypeEnum> list) {
        this.livenessTypeList = list;
    }

    public void setMaxCropImageNum(int i) {
        this.maxCropImageNum = i;
    }

    public void setMinFaceSize(int i) {
        this.minFaceSize = i;
    }

    public void setNotFaceValue(float f) {
        this.notFaceValue = f;
    }

    public void setOcclusionValue(float f) {
        this.occlusionValue = f;
    }

    public void setSound(boolean z) {
        this.isSound = z;
    }

    public void setVerifyLive(boolean z) {
        this.isVerifyLive = z;
    }
}

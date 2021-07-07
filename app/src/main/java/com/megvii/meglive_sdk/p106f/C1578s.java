package com.megvii.meglive_sdk.p106f;

import android.opengl.GLES20;

/* renamed from: com.megvii.meglive_sdk.f.s */
public final class C1578s {
    /* renamed from: a */
    public static int m2671a() {
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        GLES20.glBindTexture(36197, iArr[0]);
        GLES20.glTexParameterf(36197, 10241, 9729.0f);
        GLES20.glTexParameterf(36197, 10240, 9729.0f);
        GLES20.glTexParameteri(36197, 10242, 33071);
        GLES20.glTexParameteri(36197, 10243, 33071);
        return iArr[0];
    }
}

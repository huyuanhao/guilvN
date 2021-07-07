package com.p118pd.sdk;

import android.content.Context;
import android.util.SparseArray;
import com.google.android.gms.vision.face.Face;
import com.google.android.gms.vision.face.FaceDetector;

/* renamed from: com.pd.sdk.I1丨  reason: invalid class name */
public class I1 {
    public static int OooO = 0;
    public static int OooO0Oo = 1;
    public static int OooO0o = 1;
    public static int OooO0o0 = 0;
    public static int OooO0oO = 0;
    public static int OooO0oo = 1;
    public float OooO00o = 0.15f;

    /* renamed from: OooO00o  reason: collision with other field name */
    public int f15420OooO00o = OooO0o0;

    /* renamed from: OooO00o  reason: collision with other field name */
    public FaceDetector.Builder f15421OooO00o = null;

    /* renamed from: OooO00o  reason: collision with other field name */
    public FaceDetector f15422OooO00o = null;

    /* renamed from: OooO00o  reason: collision with other field name */
    public I1iI1 f15423OooO00o;
    public int OooO0O0 = OooO0oO;
    public int OooO0OO = OooO;

    public I1(Context context) {
        FaceDetector.Builder builder = new FaceDetector.Builder(context);
        this.f15421OooO00o = builder;
        builder.setMinFaceSize(this.OooO00o);
        this.f15421OooO00o.setMode(this.OooO0OO);
        this.f15421OooO00o.setLandmarkType(this.OooO0O0);
        this.f15421OooO00o.setClassificationType(this.f15420OooO00o);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m15337OooO00o() {
        if (this.f15422OooO00o == null) {
            OooO0O0();
        }
        return this.f15422OooO00o.isOperational();
    }

    public void OooO0O0(int i) {
        if (i != this.OooO0O0) {
            OooO00o();
            this.f15421OooO00o.setLandmarkType(i);
            this.OooO0O0 = i;
        }
    }

    public void OooO0OO(int i) {
        if (i != this.OooO0OO) {
            OooO00o();
            this.f15421OooO00o.setMode(i);
            this.OooO0OO = i;
        }
    }

    public SparseArray<Face> OooO00o(C1ILI r3) {
        if (!r3.m21270OooO00o().equals(this.f15423OooO00o)) {
            OooO0OO();
        }
        if (this.f15422OooO00o == null) {
            OooO0O0();
            this.f15423OooO00o = r3.m21270OooO00o();
        }
        return this.f15422OooO00o.detect(r3.OooO00o());
    }

    private void OooO0O0() {
        this.f15422OooO00o = this.f15421OooO00o.build();
    }

    private void OooO0OO() {
        FaceDetector faceDetector = this.f15422OooO00o;
        if (faceDetector != null) {
            faceDetector.release();
            this.f15422OooO00o = null;
        }
    }

    public void OooO00o(boolean z) {
        OooO00o();
        this.f15421OooO00o.setTrackingEnabled(z);
    }

    public void OooO00o(int i) {
        if (i != this.f15420OooO00o) {
            OooO00o();
            this.f15421OooO00o.setClassificationType(i);
            this.f15420OooO00o = i;
        }
    }

    public void OooO00o() {
        OooO0OO();
        this.f15423OooO00o = null;
    }
}

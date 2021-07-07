package com.p118pd.sdk;

import android.os.AsyncTask;
import android.util.SparseArray;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.google.android.gms.vision.face.Face;

/* renamed from: com.pd.sdk.ii1L  reason: case insensitive filesystem */
public class AsyncTaskC6221ii1L extends AsyncTask<Void, Void, SparseArray<Face>> {
    public double OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public int f17835OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public I1iI1 f17836OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public I1 f17837OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public AbstractC6289iillI f17838OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public byte[] f17839OooO00o;
    public double OooO0O0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public int f17840OooO0O0;
    public int OooO0OO;
    public int OooO0Oo;
    public int OooO0o0;

    public AsyncTaskC6221ii1L(AbstractC6289iillI r1, I1 r2, byte[] bArr, int i, int i2, int i3, float f, int i4, int i5, int i6, int i7, int i8) {
        this.f17839OooO00o = bArr;
        this.f17835OooO00o = i;
        this.f17840OooO0O0 = i2;
        this.OooO0OO = i3;
        this.f17838OooO00o = r1;
        this.f17837OooO00o = r2;
        I1iI1 r12 = new I1iI1(i, i2, i3, i4);
        this.f17836OooO00o = r12;
        double d = (double) i5;
        double OooO0Oo2 = (double) (((float) r12.OooO0Oo()) * f);
        Double.isNaN(d);
        Double.isNaN(OooO0Oo2);
        this.OooO00o = d / OooO0Oo2;
        double d2 = (double) i6;
        double OooO0O02 = (double) (((float) this.f17836OooO00o.OooO0O0()) * f);
        Double.isNaN(d2);
        Double.isNaN(OooO0O02);
        this.OooO0O0 = d2 / OooO0O02;
        this.OooO0Oo = i7;
        this.OooO0o0 = i8;
    }

    /* renamed from: OooO00o */
    public SparseArray<Face> doInBackground(Void... voidArr) {
        I1 r4;
        if (isCancelled() || this.f17838OooO00o == null || (r4 = this.f17837OooO00o) == null || !r4.m15337OooO00o()) {
            return null;
        }
        return this.f17837OooO00o.OooO00o(C5606L11l.OooO00o(this.f17839OooO00o, this.f17835OooO00o, this.f17840OooO0O0, this.OooO0OO));
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public void onPostExecute(SparseArray<Face> sparseArray) {
        super.onPostExecute(sparseArray);
        if (sparseArray == null) {
            this.f17838OooO00o.OooO00o(this.f17837OooO00o);
            return;
        }
        if (sparseArray.size() > 0) {
            this.f17838OooO00o.OooO0O0(OooO00o(sparseArray));
        }
        this.f17838OooO00o.OooO0Oo();
    }

    private WritableArray OooO00o(SparseArray<Face> sparseArray) {
        WritableMap writableMap;
        WritableArray createArray = Arguments.createArray();
        for (int i = 0; i < sparseArray.size(); i++) {
            WritableMap OooO00o2 = liIli11.OooO00o(sparseArray.valueAt(i), this.OooO00o, this.OooO0O0, this.f17835OooO00o, this.f17840OooO0O0, this.OooO0Oo, this.OooO0o0);
            if (this.f17836OooO00o.OooO00o() == 1) {
                writableMap = liIli11.OooO00o(OooO00o2, this.f17836OooO00o.OooO0Oo(), this.OooO00o);
            } else {
                writableMap = liIli11.OooO00o(OooO00o2);
            }
            createArray.pushMap(writableMap);
        }
        return createArray;
    }
}

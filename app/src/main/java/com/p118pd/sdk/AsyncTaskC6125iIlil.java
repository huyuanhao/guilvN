package com.p118pd.sdk;

import android.graphics.Rect;
import android.os.AsyncTask;
import android.util.SparseArray;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.views.text.FontMetricsUtil;
import com.google.android.gms.vision.barcode.Barcode;
import com.qiyukf.unicorn.api.msg.attachment.FileAttachment;

/* renamed from: com.pd.sdk.iIlil  reason: case insensitive filesystem */
public class AsyncTaskC6125iIlil extends AsyncTask<Void, Void, SparseArray<Barcode>> {
    public double OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public int f17591OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public I1iI1 f17592OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C6321ilLLl f17593OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public AbstractC9498LLiI f17594OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public byte[] f17595OooO00o;
    public double OooO0O0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public int f17596OooO0O0;
    public int OooO0OO;
    public int OooO0Oo;
    public int OooO0o0;

    public AsyncTaskC6125iIlil(AbstractC9498LLiI r1, C6321ilLLl r2, byte[] bArr, int i, int i2, int i3, float f, int i4, int i5, int i6, int i7, int i8) {
        this.f17595OooO00o = bArr;
        this.f17591OooO00o = i;
        this.f17596OooO0O0 = i2;
        this.OooO0OO = i3;
        this.f17594OooO00o = r1;
        this.f17593OooO00o = r2;
        I1iI1 r12 = new I1iI1(i, i2, i3, i4);
        this.f17592OooO00o = r12;
        double d = (double) i5;
        double OooO0Oo2 = (double) (((float) r12.OooO0Oo()) * f);
        Double.isNaN(d);
        Double.isNaN(OooO0Oo2);
        this.OooO00o = d / OooO0Oo2;
        double d2 = (double) i6;
        double OooO0O02 = (double) (((float) this.f17592OooO00o.OooO0O0()) * f);
        Double.isNaN(d2);
        Double.isNaN(OooO0O02);
        this.OooO0O0 = d2 / OooO0O02;
        this.OooO0Oo = i7;
        this.OooO0o0 = i8;
    }

    /* renamed from: OooO00o */
    public SparseArray<Barcode> doInBackground(Void... voidArr) {
        C6321ilLLl r4;
        if (isCancelled() || this.f17594OooO00o == null || (r4 = this.f17593OooO00o) == null || !r4.m17367OooO00o()) {
            return null;
        }
        return this.f17593OooO00o.OooO00o(C5606L11l.OooO00o(this.f17595OooO00o, this.f17591OooO00o, this.f17596OooO0O0, this.OooO0OO));
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public void onPostExecute(SparseArray<Barcode> sparseArray) {
        super.onPostExecute(sparseArray);
        if (sparseArray == null) {
            this.f17594OooO00o.OooO00o(this.f17593OooO00o);
            return;
        }
        if (sparseArray.size() > 0) {
            this.f17594OooO00o.OooO00o(OooO00o(sparseArray));
        }
        this.f17594OooO00o.OooO0OO();
    }

    private WritableArray OooO00o(SparseArray<Barcode> sparseArray) {
        WritableArray createArray = Arguments.createArray();
        for (int i = 0; i < sparseArray.size(); i++) {
            Barcode valueAt = sparseArray.valueAt(i);
            WritableMap createMap = Arguments.createMap();
            createMap.putString("data", valueAt.displayValue);
            createMap.putString("rawData", valueAt.rawValue);
            createMap.putString("type", C9707liLi.OooO00o(valueAt.format));
            createMap.putMap("bounds", OooO00o(valueAt.getBoundingBox()));
            createArray.pushMap(createMap);
        }
        return createArray;
    }

    private WritableMap OooO00o(Rect rect) {
        WritableMap createMap = Arguments.createMap();
        int i = rect.left;
        int i2 = rect.top;
        int i3 = this.f17591OooO00o;
        if (i < i3 / 2) {
            i += this.OooO0Oo / 2;
        } else if (i > i3 / 2) {
            i -= this.OooO0Oo / 2;
        }
        int i4 = rect.top;
        int i5 = this.f17596OooO0O0;
        if (i4 < i5 / 2) {
            i2 += this.OooO0o0 / 2;
        } else if (i4 > i5 / 2) {
            i2 -= this.OooO0o0 / 2;
        }
        double d = (double) i;
        double d2 = this.OooO00o;
        Double.isNaN(d);
        createMap.putDouble(FontMetricsUtil.X_HEIGHT_MEASUREMENT_TEXT, d * d2);
        double d3 = (double) i2;
        double d4 = this.OooO0O0;
        Double.isNaN(d3);
        createMap.putDouble("y", d3 * d4);
        WritableMap createMap2 = Arguments.createMap();
        double width = (double) rect.width();
        double d5 = this.OooO00o;
        Double.isNaN(width);
        createMap2.putDouble("width", width * d5);
        double height = (double) rect.height();
        double d6 = this.OooO0O0;
        Double.isNaN(height);
        createMap2.putDouble("height", height * d6);
        WritableMap createMap3 = Arguments.createMap();
        createMap3.putMap("origin", createMap);
        createMap3.putMap(FileAttachment.KEY_SIZE, createMap2);
        return createMap3;
    }
}

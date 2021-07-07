package com.p118pd.sdk;

import android.content.Context;
import android.util.SparseArray;
import com.google.android.gms.vision.barcode.Barcode;
import com.google.android.gms.vision.barcode.BarcodeDetector;

/* renamed from: com.pd.sdk.ilL丨Ll  reason: invalid class name and case insensitive filesystem */
public class C6321ilLLl {
    public static int OooO0O0 = 0;
    public static int OooO0OO = 1;
    public static int OooO0Oo = 2;
    public static int OooO0o0;
    public int OooO00o = 0;

    /* renamed from: OooO00o  reason: collision with other field name */
    public BarcodeDetector.Builder f18032OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public BarcodeDetector f18033OooO00o = null;

    /* renamed from: OooO00o  reason: collision with other field name */
    public I1iI1 f18034OooO00o;

    public C6321ilLLl(Context context) {
        this.f18032OooO00o = new BarcodeDetector.Builder(context).setBarcodeFormats(this.OooO00o);
    }

    private void OooO0O0() {
        this.f18033OooO00o = this.f18032OooO00o.build();
    }

    private void OooO0OO() {
        BarcodeDetector barcodeDetector = this.f18033OooO00o;
        if (barcodeDetector != null) {
            barcodeDetector.release();
            this.f18033OooO00o = null;
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m17367OooO00o() {
        if (this.f18033OooO00o == null) {
            OooO0O0();
        }
        return this.f18033OooO00o.isOperational();
    }

    public SparseArray<Barcode> OooO00o(C1ILI r3) {
        if (!r3.m21270OooO00o().equals(this.f18034OooO00o)) {
            OooO0OO();
        }
        if (this.f18033OooO00o == null) {
            OooO0O0();
            this.f18034OooO00o = r3.m21270OooO00o();
        }
        return this.f18033OooO00o.detect(r3.OooO00o());
    }

    public void OooO00o(int i) {
        if (i != this.OooO00o) {
            OooO00o();
            this.f18032OooO00o.setBarcodeFormats(i);
            this.OooO00o = i;
        }
    }

    public void OooO00o() {
        OooO0OO();
        this.f18034OooO00o = null;
    }
}

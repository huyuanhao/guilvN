package com.p118pd.sdk;

import android.os.Parcel;
import android.os.Parcelable;
import com.p118pd.sdk.C8348oOoOOo0;
import java.util.List;

/* renamed from: com.pd.sdk.oOoOOo00  reason: case insensitive filesystem */
public class C8349oOoOOo00 extends C8348oOoOOo0.OooO00o {
    public static final Parcelable.Creator<C8349oOoOOo00> OooO00o = new OooO00o();

    /* renamed from: OooO00o  reason: collision with other field name */
    public static C8348oOoOOo0<C8349oOoOOo00> f21455OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public float f21456OooO00o;
    public float OooO0O0;

    static {
        C8348oOoOOo0<C8349oOoOOo00> OooO00o2 = C8348oOoOOo0.OooO00o(32, new C8349oOoOOo00(0.0f, 0.0f));
        f21455OooO00o = OooO00o2;
        OooO00o2.OooO00o(0.5f);
    }

    public C8349oOoOOo00() {
    }

    public static C8349oOoOOo00 OooO00o(float f, float f2) {
        C8349oOoOOo00 OooO00o2 = f21455OooO00o.m20014OooO00o();
        OooO00o2.f21456OooO00o = f;
        OooO00o2.OooO0O0 = f2;
        return OooO00o2;
    }

    public float OooO0O0() {
        return this.OooO0O0;
    }

    /* renamed from: com.pd.sdk.oOoOOo00$OooO00o */
    public static class OooO00o implements Parcelable.Creator<C8349oOoOOo00> {
        /* renamed from: OooO00o */
        public C8349oOoOOo00 createFromParcel(Parcel parcel) {
            C8349oOoOOo00 oooooo00 = new C8349oOoOOo00(0.0f, 0.0f);
            oooooo00.OooO00o(parcel);
            return oooooo00;
        }

        /* renamed from: OooO00o */
        public C8349oOoOOo00[] newArray(int i) {
            return new C8349oOoOOo00[i];
        }
    }

    public C8349oOoOOo00(float f, float f2) {
        this.f21456OooO00o = f;
        this.OooO0O0 = f2;
    }

    public static C8349oOoOOo00 OooO00o() {
        return f21455OooO00o.m20014OooO00o();
    }

    public static C8349oOoOOo00 OooO00o(C8349oOoOOo00 oooooo00) {
        C8349oOoOOo00 OooO00o2 = f21455OooO00o.m20014OooO00o();
        OooO00o2.f21456OooO00o = oooooo00.f21456OooO00o;
        OooO00o2.OooO0O0 = oooooo00.OooO0O0;
        return OooO00o2;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static void m20016OooO00o(C8349oOoOOo00 oooooo00) {
        f21455OooO00o.OooO00o(oooooo00);
    }

    public static void OooO00o(List<C8349oOoOOo00> list) {
        f21455OooO00o.OooO00o(list);
    }

    public void OooO00o(Parcel parcel) {
        this.f21456OooO00o = parcel.readFloat();
        this.OooO0O0 = parcel.readFloat();
    }

    @Override // com.p118pd.sdk.C8348oOoOOo0.OooO00o
    /* renamed from: OooO00o  reason: collision with other method in class */
    public float m20017OooO00o() {
        return this.f21456OooO00o;
    }

    @Override // com.p118pd.sdk.C8348oOoOOo0.OooO00o
    /* renamed from: OooO00o  reason: collision with other method in class */
    public C8348oOoOOo0.OooO00o m20018OooO00o() {
        return new C8349oOoOOo00(0.0f, 0.0f);
    }
}

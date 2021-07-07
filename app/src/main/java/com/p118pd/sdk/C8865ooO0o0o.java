package com.p118pd.sdk;

import java.util.ArrayList;
import java.util.List;

/* renamed from: com.pd.sdk.ooO0o0o  reason: case insensitive filesystem */
public class C8865ooO0o0o<T> {
    public int OooO00o = 0;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C8865ooO0o0o<T>.OooO0O0 f22073OooO00o;
    public final int OooO0O0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public C8865ooO0o0o<T>.OooO0O0 f22074OooO0O0;

    /* renamed from: com.pd.sdk.ooO0o0o$OooO0O0 */
    public class OooO0O0 {
        public C8865ooO0o0o<T>.OooO0O0 OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public T f22076OooO00o;

        public OooO0O0() {
        }
    }

    public C8865ooO0o0o(int i) {
        if (i > 0) {
            this.OooO0O0 = i;
            return;
        }
        throw new IllegalArgumentException("capacity invalid");
    }

    private void OooO0O0(T t) {
        int i = this.OooO00o;
        if (i == 0) {
            C8865ooO0o0o<T>.OooO0O0 oooO0O0 = new OooO0O0();
            this.f22073OooO00o = oooO0O0;
            oooO0O0.f22076OooO00o = t;
            this.f22074OooO0O0 = oooO0O0;
            this.OooO00o++;
        } else if (i > 0) {
            C8865ooO0o0o<T>.OooO0O0 oooO0O02 = new OooO0O0();
            oooO0O02.f22076OooO00o = t;
            this.f22074OooO0O0.OooO00o = oooO0O02;
            this.f22074OooO0O0 = oooO0O02;
            this.OooO00o++;
        }
    }

    public void OooO00o(T t) {
        if (OooO00o() == this.OooO0O0) {
            m20500OooO00o();
            OooO0O0(t);
            return;
        }
        OooO0O0(t);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public T m20500OooO00o() {
        int i = this.OooO00o;
        if (i != 0) {
            C8865ooO0o0o<T>.OooO0O0 oooO0O0 = this.f22073OooO00o;
            this.f22073OooO00o = oooO0O0.OooO00o;
            this.OooO00o = i - 1;
            return oooO0O0.f22076OooO00o;
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m20502OooO00o() {
        while (OooO00o() != 0) {
            m20500OooO00o();
        }
    }

    public int OooO00o() {
        return this.OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m20503OooO00o() {
        return this.OooO00o == 0;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public List<T> m20501OooO00o() {
        ArrayList arrayList = new ArrayList(OooO00o());
        for (C8865ooO0o0o<T>.OooO0O0 oooO0O0 = this.f22073OooO00o; oooO0O0 != null; oooO0O0 = oooO0O0.OooO00o) {
            arrayList.add(oooO0O0.f22076OooO00o);
        }
        return arrayList;
    }
}

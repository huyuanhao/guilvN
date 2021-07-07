package com.p118pd.sdk;

import com.github.mikephil.charting.data.Entry;
import java.util.Collection;

/* renamed from: com.pd.sdk.oOoOOooo  reason: case insensitive filesystem */
public class C8358oOoOOooo implements AbstractC8239oOOoo00O {
    public int OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public String[] f21482OooO00o;

    public C8358oOoOOooo() {
        this.f21482OooO00o = new String[0];
        this.OooO00o = 0;
    }

    public String[] OooO00o() {
        return this.f21482OooO00o;
    }

    public void OooO00o(String[] strArr) {
        if (strArr == null) {
            strArr = new String[0];
        }
        this.f21482OooO00o = strArr;
        this.OooO00o = strArr.length;
    }

    public C8358oOoOOooo(String[] strArr) {
        this.f21482OooO00o = new String[0];
        this.OooO00o = 0;
        if (strArr != null) {
            OooO00o(strArr);
        }
    }

    @Override // com.p118pd.sdk.AbstractC8239oOOoo00O
    public String OooO00o(float f, Entry entry, int i, C8353oOoOOoOO oooooooo) {
        int round = Math.round(entry.OooO0O0());
        return (round < 0 || round >= this.OooO00o || round != ((int) entry.OooO0O0())) ? "" : this.f21482OooO00o[round];
    }

    public C8358oOoOOooo(Collection<String> collection) {
        this.f21482OooO00o = new String[0];
        this.OooO00o = 0;
        if (collection != null) {
            OooO00o((String[]) collection.toArray(new String[collection.size()]));
        }
    }
}

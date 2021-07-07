package com.p118pd.sdk;

import java.util.Collection;

/* renamed from: com.pd.sdk.oOOoo00o  reason: case insensitive filesystem */
public class C8240oOOoo00o implements AbstractC8238oOOoo000 {
    public int OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public String[] f21352OooO00o;

    public C8240oOOoo00o() {
        this.f21352OooO00o = new String[0];
        this.OooO00o = 0;
    }

    @Override // com.p118pd.sdk.AbstractC8238oOOoo000
    public String OooO00o(float f, AbstractC8201oOOo0oO0 oooo0oo0) {
        int round = Math.round(f);
        return (round < 0 || round >= this.OooO00o || round != ((int) f)) ? "" : this.f21352OooO00o[round];
    }

    public C8240oOOoo00o(String[] strArr) {
        this.f21352OooO00o = new String[0];
        this.OooO00o = 0;
        if (strArr != null) {
            OooO00o(strArr);
        }
    }

    public String[] OooO00o() {
        return this.f21352OooO00o;
    }

    public void OooO00o(String[] strArr) {
        if (strArr == null) {
            strArr = new String[0];
        }
        this.f21352OooO00o = strArr;
        this.OooO00o = strArr.length;
    }

    public C8240oOOoo00o(Collection<String> collection) {
        this.f21352OooO00o = new String[0];
        this.OooO00o = 0;
        if (collection != null) {
            OooO00o((String[]) collection.toArray(new String[collection.size()]));
        }
    }
}

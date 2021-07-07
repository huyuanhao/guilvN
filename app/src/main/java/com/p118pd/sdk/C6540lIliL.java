package com.p118pd.sdk;

import java.util.ArrayList;
import java.util.List;
import org.bouncycastle.cert.path.CertPathValidationException;

/* renamed from: com.pd.sdk.lI丨liL  reason: invalid class name and case insensitive filesystem */
public class C6540lIliL {
    public final C5692LLlIl OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final List<Integer> f18420OooO00o = new ArrayList();
    public final List<Integer> OooO0O0 = new ArrayList();
    public final List<CertPathValidationException> OooO0OO = new ArrayList();

    public C6540lIliL(C5692LLlIl r2) {
        this.OooO00o = r2;
    }

    private int[] OooO00o(List<Integer> list) {
        int size = list.size();
        int[] iArr = new int[size];
        for (int i = 0; i != size; i++) {
            iArr[i] = list.get(i).intValue();
        }
        return iArr;
    }

    public L1LLL OooO00o() {
        if (this.OooO0OO.isEmpty()) {
            return new L1LLL(this.OooO00o);
        }
        C5692LLlIl r1 = this.OooO00o;
        int[] OooO00o2 = OooO00o(this.f18420OooO00o);
        int[] OooO00o3 = OooO00o(this.OooO0O0);
        List<CertPathValidationException> list = this.OooO0OO;
        return new L1LLL(r1, OooO00o2, OooO00o3, (CertPathValidationException[]) list.toArray(new CertPathValidationException[list.size()]));
    }

    public void OooO00o(int i, int i2, CertPathValidationException certPathValidationException) {
        this.f18420OooO00o.add(I11I.OooO00o(i));
        this.OooO0O0.add(I11I.OooO00o(i2));
        this.OooO0OO.add(certPathValidationException);
    }
}

package com.p118pd.sdk;

import com.p118pd.sdk.C5844LI1L;
import com.p118pd.sdk.C6394iiIlI;
import com.p118pd.sdk.iL1iI1L;
import java.security.SecureRandom;
import org.bouncycastle.pqc.crypto.xmss.BDS;
import org.bouncycastle.pqc.crypto.xmss.XMSSNode;

/* renamed from: com.pd.sdk.丨li1LL  reason: invalid class name and case insensitive filesystem */
public final class C9699li1LL {
    public C9341I1iilI1 OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public SecureRandom f23323OooO00o;

    private C5844LI1L OooO00o(C9341I1iilI1 r5, SecureRandom secureRandom) {
        int OooO00o2 = r5.OooO00o();
        byte[] bArr = new byte[OooO00o2];
        secureRandom.nextBytes(bArr);
        byte[] bArr2 = new byte[OooO00o2];
        secureRandom.nextBytes(bArr2);
        byte[] bArr3 = new byte[OooO00o2];
        secureRandom.nextBytes(bArr3);
        return new C5844LI1L.OooO0O0(r5).OooO0Oo(bArr).OooO0OO(bArr2).OooO00o(bArr3).OooO00o(new BDS(r5, bArr3, bArr, (iL1iI1L) new iL1iI1L.OooO0O0().OooO00o())).OooO00o();
    }

    public i1LLl1L OooO00o() {
        C5844LI1L OooO00o2 = OooO00o(this.OooO00o, this.f23323OooO00o);
        XMSSNode root = OooO00o2.m16429OooO00o().getRoot();
        C5844LI1L OooO00o3 = new C5844LI1L.OooO0O0(this.OooO00o).OooO0Oo(OooO00o2.OooO0o0()).OooO0OO(OooO00o2.OooO0Oo()).OooO00o(OooO00o2.OooO0O0()).OooO0O0(root.getValue()).OooO00o(OooO00o2.m16429OooO00o()).OooO00o();
        return new i1LLl1L((C6213iL11I) new C6394iiIlI.OooO0O0(this.OooO00o).OooO0OO(root.getValue()).OooO0O0(OooO00o3.OooO0O0()).OooO00o(), (C6213iL11I) OooO00o3);
    }

    public void OooO00o(C6470l1i r2) {
        C9589iIi r22 = (C9589iIi) r2;
        this.f23323OooO00o = r22.m17607OooO00o();
        this.OooO00o = r22.OooO00o();
    }
}

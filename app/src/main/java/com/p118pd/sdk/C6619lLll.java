package com.p118pd.sdk;

import com.p118pd.sdk.C5736Liiil;
import com.p118pd.sdk.C6643li1l;
import com.p118pd.sdk.iL1iI1L;
import java.security.SecureRandom;
import org.bouncycastle.pqc.crypto.xmss.BDS;
import org.bouncycastle.pqc.crypto.xmss.BDSStateMap;
import org.bouncycastle.pqc.crypto.xmss.XMSSNode;

/* renamed from: com.pd.sdk.lLll  reason: case insensitive filesystem */
public final class C6619lLll {
    public C6454l1ii OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C9341I1iilI1 f18552OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public SecureRandom f18553OooO00o;

    private C6643li1l OooO00o(BDSStateMap bDSStateMap) {
        int OooO00o2 = this.OooO00o.OooO00o();
        byte[] bArr = new byte[OooO00o2];
        this.f18553OooO00o.nextBytes(bArr);
        byte[] bArr2 = new byte[OooO00o2];
        this.f18553OooO00o.nextBytes(bArr2);
        byte[] bArr3 = new byte[OooO00o2];
        this.f18553OooO00o.nextBytes(bArr3);
        return new C6643li1l.OooO0O0(this.OooO00o).OooO0Oo(bArr).OooO0OO(bArr2).OooO00o(bArr3).OooO00o(bDSStateMap).OooO00o();
    }

    public i1LLl1L OooO00o() {
        C6643li1l OooO00o2 = OooO00o(new C6643li1l.OooO0O0(this.OooO00o).OooO00o().m17735OooO00o());
        this.f18552OooO00o.m21385OooO00o().OooO00o(new byte[this.OooO00o.OooO00o()], OooO00o2.OooO0O0());
        int OooO0OO = this.OooO00o.OooO0OO() - 1;
        BDS bds = new BDS(this.f18552OooO00o, OooO00o2.OooO0O0(), OooO00o2.OooO0o0(), (iL1iI1L) ((iL1iI1L.OooO0O0) new iL1iI1L.OooO0O0().OooO0O0(OooO0OO)).OooO00o());
        XMSSNode root = bds.getRoot();
        OooO00o2.m17735OooO00o().put(OooO0OO, bds);
        C6643li1l OooO00o3 = new C6643li1l.OooO0O0(this.OooO00o).OooO0Oo(OooO00o2.OooO0o0()).OooO0OO(OooO00o2.OooO0Oo()).OooO00o(OooO00o2.OooO0O0()).OooO0O0(root.getValue()).OooO00o(OooO00o2.m17735OooO00o()).OooO00o();
        return new i1LLl1L((C6213iL11I) new C5736Liiil.OooO0O0(this.OooO00o).OooO0OO(root.getValue()).OooO0O0(OooO00o3.OooO0O0()).OooO00o(), (C6213iL11I) OooO00o3);
    }

    public void OooO00o(C6470l1i r2) {
        C6366iI1 r22 = (C6366iI1) r2;
        this.f18553OooO00o = r22.m17607OooO00o();
        C6454l1ii OooO00o2 = r22.OooO00o();
        this.OooO00o = OooO00o2;
        this.f18552OooO00o = OooO00o2.m17580OooO00o();
    }
}

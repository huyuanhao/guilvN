package org.bouncycastle.pqc.jcajce.provider.xmss;

import com.p118pd.sdk.AbstractC6370iIIIl;
import com.p118pd.sdk.AbstractC6419i1;
import com.p118pd.sdk.C5464IlilIi;
import com.p118pd.sdk.C5532IiIllL;
import com.p118pd.sdk.C6194iLlil;
import com.p118pd.sdk.C6454l1ii;
import com.p118pd.sdk.C6456l1ilL;
import com.p118pd.sdk.C6533lIII1;
import com.p118pd.sdk.C6574lLIi;
import com.p118pd.sdk.C6643li1l;
import com.p118pd.sdk.C9586iIILl;
import com.p118pd.sdk.IlLllLIi;
import com.p118pd.sdk.L1iiiiI;
import com.p118pd.sdk.LlLI1;
import java.io.IOException;
import java.security.PrivateKey;
import org.bouncycastle.pqc.crypto.xmss.BDSStateMap;

public class BCXMSSMTPrivateKey implements PrivateKey, AbstractC6419i1 {
    public final C6643li1l keyParams;
    public final LlLI1 treeDigest;

    public BCXMSSMTPrivateKey(C5464IlilIi r6) throws IOException {
        C6533lIII1 OooO00o = C6533lIII1.OooO00o(r6.m15707OooO0O0().m17587OooO0O0());
        this.treeDigest = OooO00o.OooO00o().OooO00o();
        IlLllLIi OooO00o2 = IlLllLIi.OooO00o(r6.m15708OooO0O0());
        try {
            C6643li1l.OooO0O0 OooO0O0 = new C6643li1l.OooO0O0(new C6454l1ii(OooO00o.OooO0O0(), OooO00o.OooO0OO(), C6194iLlil.OooO00o(this.treeDigest))).OooO00o((long) OooO00o2.OooO0O0()).OooO0Oo(OooO00o2.OooO0o0()).OooO0OO(OooO00o2.OooO0Oo()).OooO00o(OooO00o2.m15677OooO0O0()).OooO0O0(OooO00o2.OooO0OO());
            if (OooO00o2.OooO00o() != null) {
                OooO0O0.OooO00o((BDSStateMap) C5532IiIllL.OooO00o(OooO00o2.OooO00o(), BDSStateMap.class));
            }
            this.keyParams = OooO0O0.OooO00o();
        } catch (ClassNotFoundException e) {
            throw new IOException("ClassNotFoundException processing BDS state: " + e.getMessage());
        }
    }

    public BCXMSSMTPrivateKey(LlLI1 llLI1, C6643li1l r2) {
        this.treeDigest = llLI1;
        this.keyParams = r2;
    }

    private C6574lLIi OooO00o() {
        byte[] OooO00o = this.keyParams.m17736OooO00o();
        int OooO00o2 = this.keyParams.m17733OooO00o().OooO00o();
        int OooO0O0 = this.keyParams.m17733OooO00o().OooO0O0();
        int i = (OooO0O0 + 7) / 8;
        int OooO00o3 = (int) C5532IiIllL.OooO00o(OooO00o, 0, i);
        if (C5532IiIllL.OooO00o(OooO0O0, (long) OooO00o3)) {
            int i2 = i + 0;
            byte[] OooO00o4 = C5532IiIllL.m15807OooO00o(OooO00o, i2, OooO00o2);
            int i3 = i2 + OooO00o2;
            byte[] OooO00o5 = C5532IiIllL.m15807OooO00o(OooO00o, i3, OooO00o2);
            int i4 = i3 + OooO00o2;
            byte[] OooO00o6 = C5532IiIllL.m15807OooO00o(OooO00o, i4, OooO00o2);
            int i5 = i4 + OooO00o2;
            byte[] OooO00o7 = C5532IiIllL.m15807OooO00o(OooO00o, i5, OooO00o2);
            int i6 = i5 + OooO00o2;
            return new C6574lLIi(OooO00o3, OooO00o4, OooO00o5, OooO00o6, OooO00o7, C5532IiIllL.m15807OooO00o(OooO00o, i6, OooO00o.length - i6));
        }
        throw new IllegalArgumentException("index out of bounds");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BCXMSSMTPrivateKey)) {
            return false;
        }
        BCXMSSMTPrivateKey bCXMSSMTPrivateKey = (BCXMSSMTPrivateKey) obj;
        return this.treeDigest.equals(bCXMSSMTPrivateKey.treeDigest) && C9586iIILl.m21627OooO00o(this.keyParams.m17736OooO00o(), bCXMSSMTPrivateKey.keyParams.m17736OooO00o());
    }

    public String getAlgorithm() {
        return "XMSSMT";
    }

    public byte[] getEncoded() {
        try {
            return new C5464IlilIi(new C6456l1ilL(L1iiiiI.OooOoo0, new C6533lIII1(this.keyParams.m17733OooO00o().OooO0O0(), this.keyParams.m17733OooO00o().OooO0OO(), new C6456l1ilL(this.treeDigest))), OooO00o()).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    public String getFormat() {
        return "PKCS#8";
    }

    @Override // com.p118pd.sdk.AbstractC6419i1
    public int getHeight() {
        return this.keyParams.m17733OooO00o().OooO0O0();
    }

    public AbstractC6370iIIIl getKeyParams() {
        return this.keyParams;
    }

    @Override // com.p118pd.sdk.AbstractC6419i1
    public int getLayers() {
        return this.keyParams.m17733OooO00o().OooO0OO();
    }

    @Override // com.p118pd.sdk.AbstractC6419i1
    public String getTreeDigest() {
        return C6194iLlil.m17163OooO00o(this.treeDigest);
    }

    public LlLI1 getTreeDigestOID() {
        return this.treeDigest;
    }

    public int hashCode() {
        return this.treeDigest.hashCode() + (C9586iIILl.OooO00o(this.keyParams.m17736OooO00o()) * 37);
    }
}

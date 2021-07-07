package org.bouncycastle.pqc.jcajce.provider.xmss;

import com.p118pd.sdk.AbstractC6370iIIIl;
import com.p118pd.sdk.C5464IlilIi;
import com.p118pd.sdk.C5532IiIllL;
import com.p118pd.sdk.C5844LI1L;
import com.p118pd.sdk.C6194iLlil;
import com.p118pd.sdk.C6456l1ilL;
import com.p118pd.sdk.C6758llIL;
import com.p118pd.sdk.C9341I1iilI1;
import com.p118pd.sdk.C9586iIILl;
import com.p118pd.sdk.IlLllLIi;
import com.p118pd.sdk.L1iiiiI;
import com.p118pd.sdk.LIl1Li;
import com.p118pd.sdk.LlLI1;
import java.io.IOException;
import java.security.PrivateKey;
import org.bouncycastle.pqc.crypto.xmss.BDS;

public class BCXMSSPrivateKey implements PrivateKey, LIl1Li {
    public final C5844LI1L keyParams;
    public final LlLI1 treeDigest;

    public BCXMSSPrivateKey(C5464IlilIi r5) throws IOException {
        C6758llIL OooO00o = C6758llIL.OooO00o(r5.m15707OooO0O0().m17587OooO0O0());
        this.treeDigest = OooO00o.OooO00o().OooO00o();
        IlLllLIi OooO00o2 = IlLllLIi.OooO00o(r5.m15708OooO0O0());
        try {
            C5844LI1L.OooO0O0 OooO0O0 = new C5844LI1L.OooO0O0(new C9341I1iilI1(OooO00o.OooO0O0(), C6194iLlil.OooO00o(this.treeDigest))).OooO00o(OooO00o2.OooO0O0()).OooO0Oo(OooO00o2.OooO0o0()).OooO0OO(OooO00o2.OooO0Oo()).OooO00o(OooO00o2.m15677OooO0O0()).OooO0O0(OooO00o2.OooO0OO());
            if (OooO00o2.OooO00o() != null) {
                OooO0O0.OooO00o((BDS) C5532IiIllL.OooO00o(OooO00o2.OooO00o(), BDS.class));
            }
            this.keyParams = OooO0O0.OooO00o();
        } catch (ClassNotFoundException e) {
            throw new IOException("ClassNotFoundException processing BDS state: " + e.getMessage());
        }
    }

    public BCXMSSPrivateKey(LlLI1 llLI1, C5844LI1L r2) {
        this.treeDigest = llLI1;
        this.keyParams = r2;
    }

    private IlLllLIi OooO00o() {
        byte[] OooO00o = this.keyParams.m16430OooO00o();
        int OooO00o2 = this.keyParams.m16428OooO00o().OooO00o();
        int OooO0O0 = this.keyParams.m16428OooO00o().OooO0O0();
        int OooO00o3 = (int) C5532IiIllL.OooO00o(OooO00o, 0, 4);
        if (C5532IiIllL.OooO00o(OooO0O0, (long) OooO00o3)) {
            byte[] OooO00o4 = C5532IiIllL.m15807OooO00o(OooO00o, 4, OooO00o2);
            int i = 4 + OooO00o2;
            byte[] OooO00o5 = C5532IiIllL.m15807OooO00o(OooO00o, i, OooO00o2);
            int i2 = i + OooO00o2;
            byte[] OooO00o6 = C5532IiIllL.m15807OooO00o(OooO00o, i2, OooO00o2);
            int i3 = i2 + OooO00o2;
            byte[] OooO00o7 = C5532IiIllL.m15807OooO00o(OooO00o, i3, OooO00o2);
            int i4 = i3 + OooO00o2;
            return new IlLllLIi(OooO00o3, OooO00o4, OooO00o5, OooO00o6, OooO00o7, C5532IiIllL.m15807OooO00o(OooO00o, i4, OooO00o.length - i4));
        }
        throw new IllegalArgumentException("index out of bounds");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BCXMSSPrivateKey)) {
            return false;
        }
        BCXMSSPrivateKey bCXMSSPrivateKey = (BCXMSSPrivateKey) obj;
        return this.treeDigest.equals(bCXMSSPrivateKey.treeDigest) && C9586iIILl.m21627OooO00o(this.keyParams.m16430OooO00o(), bCXMSSPrivateKey.keyParams.m16430OooO00o());
    }

    public String getAlgorithm() {
        return "XMSS";
    }

    public byte[] getEncoded() {
        try {
            return new C5464IlilIi(new C6456l1ilL(L1iiiiI.OooOo0o, new C6758llIL(this.keyParams.m16428OooO00o().OooO0O0(), new C6456l1ilL(this.treeDigest))), OooO00o()).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    public String getFormat() {
        return "PKCS#8";
    }

    @Override // com.p118pd.sdk.LIl1Li
    public int getHeight() {
        return this.keyParams.m16428OooO00o().OooO0O0();
    }

    public AbstractC6370iIIIl getKeyParams() {
        return this.keyParams;
    }

    @Override // com.p118pd.sdk.LIl1Li
    public String getTreeDigest() {
        return C6194iLlil.m17163OooO00o(this.treeDigest);
    }

    public LlLI1 getTreeDigestOID() {
        return this.treeDigest;
    }

    public int hashCode() {
        return this.treeDigest.hashCode() + (C9586iIILl.OooO00o(this.keyParams.m16430OooO00o()) * 37);
    }
}

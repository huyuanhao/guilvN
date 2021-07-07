package org.bouncycastle.pqc.jcajce.provider.xmss;

import com.p118pd.sdk.AbstractC6370iIIIl;
import com.p118pd.sdk.AbstractC6419i1;
import com.p118pd.sdk.C5736Liiil;
import com.p118pd.sdk.C6194iLlil;
import com.p118pd.sdk.C6454l1ii;
import com.p118pd.sdk.C6456l1ilL;
import com.p118pd.sdk.C6533lIII1;
import com.p118pd.sdk.C6888ll;
import com.p118pd.sdk.C9586iIILl;
import com.p118pd.sdk.C9820LLL;
import com.p118pd.sdk.L1iiiiI;
import com.p118pd.sdk.LlLI1;
import java.io.IOException;
import java.security.PublicKey;

public class BCXMSSMTPublicKey implements PublicKey, AbstractC6419i1 {
    public final C5736Liiil keyParams;
    public final LlLI1 treeDigest;

    public BCXMSSMTPublicKey(LlLI1 llLI1, C5736Liiil r2) {
        this.treeDigest = llLI1;
        this.keyParams = r2;
    }

    public BCXMSSMTPublicKey(C6888ll r6) throws IOException {
        C6533lIII1 OooO00o = C6533lIII1.OooO00o(r6.m18041OooO00o().m17587OooO0O0());
        this.treeDigest = OooO00o.OooO00o().OooO00o();
        C9820LLL OooO00o2 = C9820LLL.OooO00o(r6.OooO0o0());
        this.keyParams = new C5736Liiil.OooO0O0(new C6454l1ii(OooO00o.OooO0O0(), OooO00o.OooO0OO(), C6194iLlil.OooO00o(this.treeDigest))).OooO0O0(OooO00o2.OooO00o()).OooO0OO(OooO00o2.m21909OooO0O0()).OooO00o();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BCXMSSMTPublicKey)) {
            return false;
        }
        BCXMSSMTPublicKey bCXMSSMTPublicKey = (BCXMSSMTPublicKey) obj;
        return this.treeDigest.equals(bCXMSSMTPublicKey.treeDigest) && C9586iIILl.m21627OooO00o(this.keyParams.m16315OooO00o(), bCXMSSMTPublicKey.keyParams.m16315OooO00o());
    }

    public final String getAlgorithm() {
        return "XMSSMT";
    }

    public byte[] getEncoded() {
        try {
            return new C6888ll(new C6456l1ilL(L1iiiiI.OooOoo0, new C6533lIII1(this.keyParams.OooO00o().OooO0O0(), this.keyParams.OooO00o().OooO0OO(), new C6456l1ilL(this.treeDigest))), new C9820LLL(this.keyParams.OooO0O0(), this.keyParams.OooO0OO())).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    public String getFormat() {
        return "X.509";
    }

    @Override // com.p118pd.sdk.AbstractC6419i1
    public int getHeight() {
        return this.keyParams.OooO00o().OooO0O0();
    }

    public AbstractC6370iIIIl getKeyParams() {
        return this.keyParams;
    }

    @Override // com.p118pd.sdk.AbstractC6419i1
    public int getLayers() {
        return this.keyParams.OooO00o().OooO0OO();
    }

    @Override // com.p118pd.sdk.AbstractC6419i1
    public String getTreeDigest() {
        return C6194iLlil.m17163OooO00o(this.treeDigest);
    }

    public int hashCode() {
        return this.treeDigest.hashCode() + (C9586iIILl.OooO00o(this.keyParams.m16315OooO00o()) * 37);
    }
}

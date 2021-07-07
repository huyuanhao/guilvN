package org.bouncycastle.pqc.jcajce.provider.xmss;

import com.p118pd.sdk.AbstractC6370iIIIl;
import com.p118pd.sdk.C6194iLlil;
import com.p118pd.sdk.C6394iiIlI;
import com.p118pd.sdk.C6456l1ilL;
import com.p118pd.sdk.C6758llIL;
import com.p118pd.sdk.C6888ll;
import com.p118pd.sdk.C9341I1iilI1;
import com.p118pd.sdk.C9586iIILl;
import com.p118pd.sdk.C9820LLL;
import com.p118pd.sdk.L1iiiiI;
import com.p118pd.sdk.LIl1Li;
import com.p118pd.sdk.LlLI1;
import java.io.IOException;
import java.security.PublicKey;

public class BCXMSSPublicKey implements PublicKey, LIl1Li {
    public final C6394iiIlI keyParams;
    public final LlLI1 treeDigest;

    public BCXMSSPublicKey(LlLI1 llLI1, C6394iiIlI r2) {
        this.treeDigest = llLI1;
        this.keyParams = r2;
    }

    public BCXMSSPublicKey(C6888ll r5) throws IOException {
        C6758llIL OooO00o = C6758llIL.OooO00o(r5.m18041OooO00o().m17587OooO0O0());
        this.treeDigest = OooO00o.OooO00o().OooO00o();
        C9820LLL OooO00o2 = C9820LLL.OooO00o(r5.OooO0o0());
        this.keyParams = new C6394iiIlI.OooO0O0(new C9341I1iilI1(OooO00o.OooO0O0(), C6194iLlil.OooO00o(this.treeDigest))).OooO0O0(OooO00o2.OooO00o()).OooO0OO(OooO00o2.m21909OooO0O0()).OooO00o();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BCXMSSPublicKey)) {
            return false;
        }
        BCXMSSPublicKey bCXMSSPublicKey = (BCXMSSPublicKey) obj;
        return this.treeDigest.equals(bCXMSSPublicKey.treeDigest) && C9586iIILl.m21627OooO00o(this.keyParams.m17515OooO00o(), bCXMSSPublicKey.keyParams.m17515OooO00o());
    }

    public final String getAlgorithm() {
        return "XMSS";
    }

    public byte[] getEncoded() {
        try {
            return new C6888ll(new C6456l1ilL(L1iiiiI.OooOo0o, new C6758llIL(this.keyParams.OooO00o().OooO0O0(), new C6456l1ilL(this.treeDigest))), new C9820LLL(this.keyParams.OooO0O0(), this.keyParams.OooO0OO())).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    public String getFormat() {
        return "X.509";
    }

    @Override // com.p118pd.sdk.LIl1Li
    public int getHeight() {
        return this.keyParams.OooO00o().OooO0O0();
    }

    public AbstractC6370iIIIl getKeyParams() {
        return this.keyParams;
    }

    @Override // com.p118pd.sdk.LIl1Li
    public String getTreeDigest() {
        return C6194iLlil.m17163OooO00o(this.treeDigest);
    }

    public int hashCode() {
        return this.treeDigest.hashCode() + (C9586iIILl.OooO00o(this.keyParams.m17515OooO00o()) * 37);
    }
}

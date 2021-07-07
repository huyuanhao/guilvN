package org.bouncycastle.pqc.jcajce.provider.sphincs;

import com.p118pd.sdk.AbstractC6370iIIIl;
import com.p118pd.sdk.AbstractC6804llL1ii;
import com.p118pd.sdk.C5464IlilIi;
import com.p118pd.sdk.C5830L1i;
import com.p118pd.sdk.C6456l1ilL;
import com.p118pd.sdk.C6487lIIiIlL;
import com.p118pd.sdk.C9586iIILl;
import com.p118pd.sdk.IilIilI;
import com.p118pd.sdk.L1iiiiI;
import com.p118pd.sdk.LlLI1;
import java.io.IOException;
import java.security.PrivateKey;
import org.bouncycastle.pqc.jcajce.interfaces.SPHINCSKey;

public class BCSphincs256PrivateKey implements PrivateKey, SPHINCSKey {
    public static final long serialVersionUID = 1;
    public final IilIilI params;
    public final LlLI1 treeDigest;

    public BCSphincs256PrivateKey(C5464IlilIi r2) throws IOException {
        this.treeDigest = C5830L1i.OooO00o(r2.m15707OooO0O0().m17587OooO0O0()).OooO00o().OooO00o();
        this.params = new IilIilI(AbstractC6804llL1ii.OooO00o(r2.m15708OooO0O0()).m17938OooO00o());
    }

    public BCSphincs256PrivateKey(LlLI1 llLI1, IilIilI iilIilI) {
        this.treeDigest = llLI1;
        this.params = iilIilI;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BCSphincs256PrivateKey)) {
            return false;
        }
        BCSphincs256PrivateKey bCSphincs256PrivateKey = (BCSphincs256PrivateKey) obj;
        return this.treeDigest.equals(bCSphincs256PrivateKey.treeDigest) && C9586iIILl.m21627OooO00o(this.params.OooO0O0(), bCSphincs256PrivateKey.params.OooO0O0());
    }

    public final String getAlgorithm() {
        return "SPHINCS-256";
    }

    public byte[] getEncoded() {
        try {
            return new C5464IlilIi(new C6456l1ilL(L1iiiiI.OooOOo, new C5830L1i(new C6456l1ilL(this.treeDigest))), new C6487lIIiIlL(this.params.OooO0O0())).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    public String getFormat() {
        return "PKCS#8";
    }

    @Override // org.bouncycastle.pqc.jcajce.interfaces.SPHINCSKey
    public byte[] getKeyData() {
        return this.params.OooO0O0();
    }

    public AbstractC6370iIIIl getKeyParams() {
        return this.params;
    }

    public int hashCode() {
        return this.treeDigest.hashCode() + (C9586iIILl.OooO00o(this.params.OooO0O0()) * 37);
    }
}

package org.bouncycastle.pqc.jcajce.provider.sphincs;

import com.p118pd.sdk.AbstractC6370iIIIl;
import com.p118pd.sdk.C5830L1i;
import com.p118pd.sdk.C6456l1ilL;
import com.p118pd.sdk.C6888ll;
import com.p118pd.sdk.C9586iIILl;
import com.p118pd.sdk.L1iiiiI;
import com.p118pd.sdk.LlLI1;
import com.p118pd.sdk.iII111;
import java.io.IOException;
import java.security.PublicKey;
import org.bouncycastle.pqc.jcajce.interfaces.SPHINCSKey;

public class BCSphincs256PublicKey implements PublicKey, SPHINCSKey {
    public static final long serialVersionUID = 1;
    public final iII111 params;
    public final LlLI1 treeDigest;

    public BCSphincs256PublicKey(LlLI1 llLI1, iII111 r2) {
        this.treeDigest = llLI1;
        this.params = r2;
    }

    public BCSphincs256PublicKey(C6888ll r2) {
        this.treeDigest = C5830L1i.OooO00o(r2.m18041OooO00o().m17587OooO0O0()).OooO00o().OooO00o();
        this.params = new iII111(r2.OooO00o().m15475OooO00o());
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BCSphincs256PublicKey)) {
            return false;
        }
        BCSphincs256PublicKey bCSphincs256PublicKey = (BCSphincs256PublicKey) obj;
        return this.treeDigest.equals(bCSphincs256PublicKey.treeDigest) && C9586iIILl.m21627OooO00o(this.params.OooO0O0(), bCSphincs256PublicKey.params.OooO0O0());
    }

    public final String getAlgorithm() {
        return "SPHINCS-256";
    }

    public byte[] getEncoded() {
        try {
            return new C6888ll(new C6456l1ilL(L1iiiiI.OooOOo, new C5830L1i(new C6456l1ilL(this.treeDigest))), this.params.OooO0O0()).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    public String getFormat() {
        return "X.509";
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

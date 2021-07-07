package org.bouncycastle.pqc.jcajce.provider.newhope;

import com.p118pd.sdk.AbstractC6370iIIIl;
import com.p118pd.sdk.C6456l1ilL;
import com.p118pd.sdk.C6888ll;
import com.p118pd.sdk.C9586iIILl;
import com.p118pd.sdk.IL1IILIl;
import com.p118pd.sdk.L1iiiiI;
import java.io.IOException;
import org.bouncycastle.pqc.jcajce.interfaces.NHPublicKey;

public class BCNHPublicKey implements NHPublicKey {
    public static final long serialVersionUID = 1;
    public final IL1IILIl params;

    public BCNHPublicKey(IL1IILIl iL1IILIl) {
        this.params = iL1IILIl;
    }

    public BCNHPublicKey(C6888ll r2) {
        this.params = new IL1IILIl(r2.OooO00o().m15475OooO00o());
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof BCNHPublicKey)) {
            return false;
        }
        return C9586iIILl.m21627OooO00o(this.params.OooO0O0(), ((BCNHPublicKey) obj).params.OooO0O0());
    }

    public final String getAlgorithm() {
        return "NH";
    }

    public byte[] getEncoded() {
        try {
            return new C6888ll(new C6456l1ilL(L1iiiiI.OooOo0O), this.params.OooO0O0()).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    public String getFormat() {
        return "X.509";
    }

    public AbstractC6370iIIIl getKeyParams() {
        return this.params;
    }

    @Override // org.bouncycastle.pqc.jcajce.interfaces.NHPublicKey
    public byte[] getPublicData() {
        return this.params.OooO0O0();
    }

    public int hashCode() {
        return C9586iIILl.OooO00o(this.params.OooO0O0());
    }
}

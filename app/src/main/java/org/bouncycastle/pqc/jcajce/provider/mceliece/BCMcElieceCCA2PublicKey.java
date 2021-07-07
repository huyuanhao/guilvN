package org.bouncycastle.pqc.jcajce.provider.mceliece;

import com.p118pd.sdk.AbstractC6370iIIIl;
import com.p118pd.sdk.C6213iL11I;
import com.p118pd.sdk.C6254iiL;
import com.p118pd.sdk.C6303ilIil;
import com.p118pd.sdk.C6456l1ilL;
import com.p118pd.sdk.C6888ll;
import com.p118pd.sdk.C93221;
import com.p118pd.sdk.L1iiiiI;
import com.p118pd.sdk.llILLI1;
import java.io.IOException;
import java.security.PublicKey;

public class BCMcElieceCCA2PublicKey implements AbstractC6370iIIIl, PublicKey {
    public static final long serialVersionUID = 1;
    public C93221 params;

    public BCMcElieceCCA2PublicKey(C93221 r1) {
        this.params = r1;
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof BCMcElieceCCA2PublicKey)) {
            return false;
        }
        BCMcElieceCCA2PublicKey bCMcElieceCCA2PublicKey = (BCMcElieceCCA2PublicKey) obj;
        return this.params.OooO0O0() == bCMcElieceCCA2PublicKey.getN() && this.params.OooO0OO() == bCMcElieceCCA2PublicKey.getT() && this.params.m21358OooO00o().equals(bCMcElieceCCA2PublicKey.getG());
    }

    public String getAlgorithm() {
        return "McEliece-CCA2";
    }

    public byte[] getEncoded() {
        try {
            return new C6888ll(new C6456l1ilL(L1iiiiI.OooOOO), new C6303ilIil(this.params.OooO0O0(), this.params.OooO0OO(), this.params.m21358OooO00o(), C6254iiL.OooO00o(this.params.OooO00o()))).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    public String getFormat() {
        return "X.509";
    }

    public llILLI1 getG() {
        return this.params.m21358OooO00o();
    }

    public int getK() {
        return this.params.OooO00o();
    }

    public C6213iL11I getKeyParams() {
        return this.params;
    }

    public int getN() {
        return this.params.OooO0O0();
    }

    public int getT() {
        return this.params.OooO0OO();
    }

    public int hashCode() {
        return ((this.params.OooO0O0() + (this.params.OooO0OO() * 37)) * 37) + this.params.m21358OooO00o().hashCode();
    }

    public String toString() {
        return (("McEliecePublicKey:\n" + " length of the code         : " + this.params.OooO0O0() + "\n") + " error correction capability: " + this.params.OooO0OO() + "\n") + " generator matrix           : " + this.params.m21358OooO00o().toString();
    }
}

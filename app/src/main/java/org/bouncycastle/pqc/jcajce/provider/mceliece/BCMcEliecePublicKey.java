package org.bouncycastle.pqc.jcajce.provider.mceliece;

import com.p118pd.sdk.C6213iL11I;
import com.p118pd.sdk.C6456l1ilL;
import com.p118pd.sdk.C6888ll;
import com.p118pd.sdk.L1iiiiI;
import com.p118pd.sdk.LllLllL;
import com.p118pd.sdk.i1iILI;
import com.p118pd.sdk.llILLI1;
import java.io.IOException;
import java.security.PublicKey;

public class BCMcEliecePublicKey implements PublicKey {
    public static final long serialVersionUID = 1;
    public i1iILI params;

    public BCMcEliecePublicKey(i1iILI i1iili) {
        this.params = i1iili;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof BCMcEliecePublicKey)) {
            return false;
        }
        BCMcEliecePublicKey bCMcEliecePublicKey = (BCMcEliecePublicKey) obj;
        return this.params.OooO0O0() == bCMcEliecePublicKey.getN() && this.params.OooO0OO() == bCMcEliecePublicKey.getT() && this.params.m16886OooO00o().equals(bCMcEliecePublicKey.getG());
    }

    public String getAlgorithm() {
        return "McEliece";
    }

    public byte[] getEncoded() {
        try {
            return new C6888ll(new C6456l1ilL(L1iiiiI.OooOOO0), new LllLllL(this.params.OooO0O0(), this.params.OooO0OO(), this.params.m16886OooO00o())).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    public String getFormat() {
        return "X.509";
    }

    public llILLI1 getG() {
        return this.params.m16886OooO00o();
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
        return ((this.params.OooO0O0() + (this.params.OooO0OO() * 37)) * 37) + this.params.m16886OooO00o().hashCode();
    }

    public String toString() {
        return (("McEliecePublicKey:\n" + " length of the code         : " + this.params.OooO0O0() + "\n") + " error correction capability: " + this.params.OooO0OO() + "\n") + " generator matrix           : " + this.params.m16886OooO00o();
    }
}

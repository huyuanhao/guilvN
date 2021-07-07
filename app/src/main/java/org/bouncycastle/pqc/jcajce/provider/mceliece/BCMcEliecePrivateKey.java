package org.bouncycastle.pqc.jcajce.provider.mceliece;

import com.p118pd.sdk.AbstractC6370iIIIl;
import com.p118pd.sdk.C5464IlilIi;
import com.p118pd.sdk.C5585L1L;
import com.p118pd.sdk.C6051i1lli;
import com.p118pd.sdk.C6213iL11I;
import com.p118pd.sdk.C6456l1ilL;
import com.p118pd.sdk.C6855lLl;
import com.p118pd.sdk.L1iiiiI;
import com.p118pd.sdk.LIi1L1;
import com.p118pd.sdk.Ll111;
import com.p118pd.sdk.llILLI1;
import java.io.IOException;
import java.security.PrivateKey;

public class BCMcEliecePrivateKey implements AbstractC6370iIIIl, PrivateKey {
    public static final long serialVersionUID = 1;
    public LIi1L1 params;

    public BCMcEliecePrivateKey(LIi1L1 r1) {
        this.params = r1;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof BCMcEliecePrivateKey)) {
            return false;
        }
        BCMcEliecePrivateKey bCMcEliecePrivateKey = (BCMcEliecePrivateKey) obj;
        return getN() == bCMcEliecePrivateKey.getN() && getK() == bCMcEliecePrivateKey.getK() && getField().equals(bCMcEliecePrivateKey.getField()) && getGoppaPoly().equals(bCMcEliecePrivateKey.getGoppaPoly()) && getSInv().equals(bCMcEliecePrivateKey.getSInv()) && getP1().equals(bCMcEliecePrivateKey.getP1()) && getP2().equals(bCMcEliecePrivateKey.getP2());
    }

    public String getAlgorithm() {
        return "McEliece";
    }

    public byte[] getEncoded() {
        try {
            return new C5464IlilIi(new C6456l1ilL(L1iiiiI.OooOOO0), new C6855lLl(this.params.OooO0O0(), this.params.OooO00o(), this.params.m16070OooO00o(), this.params.m16069OooO00o(), this.params.m16071OooO00o(), this.params.m16074OooO0O0(), this.params.m16075OooO0O0())).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    public Ll111 getField() {
        return this.params.m16070OooO00o();
    }

    public String getFormat() {
        return "PKCS#8";
    }

    public C5585L1L getGoppaPoly() {
        return this.params.m16069OooO00o();
    }

    public llILLI1 getH() {
        return this.params.m16072OooO00o();
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

    public C6051i1lli getP1() {
        return this.params.m16071OooO00o();
    }

    public C6051i1lli getP2() {
        return this.params.m16074OooO0O0();
    }

    public C5585L1L[] getQInv() {
        return this.params.m16073OooO00o();
    }

    public llILLI1 getSInv() {
        return this.params.m16075OooO0O0();
    }

    public int hashCode() {
        return (((((((((((this.params.OooO00o() * 37) + this.params.OooO0O0()) * 37) + this.params.m16070OooO00o().hashCode()) * 37) + this.params.m16069OooO00o().hashCode()) * 37) + this.params.m16071OooO00o().hashCode()) * 37) + this.params.m16074OooO0O0().hashCode()) * 37) + this.params.m16075OooO0O0().hashCode();
    }
}

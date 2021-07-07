package org.bouncycastle.pqc.jcajce.provider.mceliece;

import com.p118pd.sdk.C5464IlilIi;
import com.p118pd.sdk.C5585L1L;
import com.p118pd.sdk.C6051i1lli;
import com.p118pd.sdk.C6213iL11I;
import com.p118pd.sdk.C6254iiL;
import com.p118pd.sdk.C6297il1l;
import com.p118pd.sdk.C6456l1ilL;
import com.p118pd.sdk.C9844iLi;
import com.p118pd.sdk.L1iiiiI;
import com.p118pd.sdk.Ll111;
import com.p118pd.sdk.llILLI1;
import java.io.IOException;
import java.security.PrivateKey;

public class BCMcElieceCCA2PrivateKey implements PrivateKey {
    public static final long serialVersionUID = 1;
    public C9844iLi params;

    public BCMcElieceCCA2PrivateKey(C9844iLi r1) {
        this.params = r1;
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof BCMcElieceCCA2PrivateKey)) {
            return false;
        }
        BCMcElieceCCA2PrivateKey bCMcElieceCCA2PrivateKey = (BCMcElieceCCA2PrivateKey) obj;
        return getN() == bCMcElieceCCA2PrivateKey.getN() && getK() == bCMcElieceCCA2PrivateKey.getK() && getField().equals(bCMcElieceCCA2PrivateKey.getField()) && getGoppaPoly().equals(bCMcElieceCCA2PrivateKey.getGoppaPoly()) && getP().equals(bCMcElieceCCA2PrivateKey.getP()) && getH().equals(bCMcElieceCCA2PrivateKey.getH());
    }

    public String getAlgorithm() {
        return "McEliece-CCA2";
    }

    public byte[] getEncoded() {
        try {
            return new C5464IlilIi(new C6456l1ilL(L1iiiiI.OooOOO), new C6297il1l(getN(), getK(), getField(), getGoppaPoly(), getP(), C6254iiL.OooO00o(this.params.OooO00o()))).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    public Ll111 getField() {
        return this.params.m21927OooO00o();
    }

    public String getFormat() {
        return "PKCS#8";
    }

    public C5585L1L getGoppaPoly() {
        return this.params.m21926OooO00o();
    }

    public llILLI1 getH() {
        return this.params.m21929OooO00o();
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

    public C6051i1lli getP() {
        return this.params.m21928OooO00o();
    }

    public C5585L1L[] getQInv() {
        return this.params.m21930OooO00o();
    }

    public int getT() {
        return this.params.m21926OooO00o().m15964OooO00o();
    }

    public int hashCode() {
        return (((((((((this.params.OooO00o() * 37) + this.params.OooO0O0()) * 37) + this.params.m21927OooO00o().hashCode()) * 37) + this.params.m21926OooO00o().hashCode()) * 37) + this.params.m21928OooO00o().hashCode()) * 37) + this.params.m21929OooO00o().hashCode();
    }
}

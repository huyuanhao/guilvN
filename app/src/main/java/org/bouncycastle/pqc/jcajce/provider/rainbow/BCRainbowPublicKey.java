package org.bouncycastle.pqc.jcajce.provider.rainbow;

import com.p118pd.sdk.C5601L1i;
import com.p118pd.sdk.C6195iLllLLIi;
import com.p118pd.sdk.C6216iLLL1;
import com.p118pd.sdk.C6452l1Lll;
import com.p118pd.sdk.C6456l1ilL;
import com.p118pd.sdk.C9586iIILl;
import com.p118pd.sdk.L1iiiiI;
import com.p118pd.sdk.L1l1ILI;
import com.p118pd.sdk.LlIlI1L;
import com.p118pd.sdk.iii1Ll;
import java.security.PublicKey;

public class BCRainbowPublicKey implements PublicKey {
    public static final long serialVersionUID = 1;
    public short[][] coeffquadratic;
    public short[] coeffscalar;
    public short[][] coeffsingular;
    public int docLength;
    public C6216iLLL1 rainbowParams;

    public BCRainbowPublicKey(int i, short[][] sArr, short[][] sArr2, short[] sArr3) {
        this.docLength = i;
        this.coeffquadratic = sArr;
        this.coeffsingular = sArr2;
        this.coeffscalar = sArr3;
    }

    public BCRainbowPublicKey(L1l1ILI l1l1ILI) {
        this(l1l1ILI.OooO00o(), l1l1ILI.m15981OooO00o(), l1l1ILI.OooO0O0(), l1l1ILI.m15980OooO00o());
    }

    public BCRainbowPublicKey(C6195iLllLLIi illlllii) {
        this(illlllii.OooO00o(), illlllii.m17167OooO00o(), illlllii.OooO0O0(), illlllii.OooO00o());
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof BCRainbowPublicKey)) {
            return false;
        }
        BCRainbowPublicKey bCRainbowPublicKey = (BCRainbowPublicKey) obj;
        return this.docLength == bCRainbowPublicKey.getDocLength() && C5601L1i.OooO00o(this.coeffquadratic, bCRainbowPublicKey.getCoeffQuadratic()) && C5601L1i.OooO00o(this.coeffsingular, bCRainbowPublicKey.getCoeffSingular()) && C5601L1i.OooO00o(this.coeffscalar, bCRainbowPublicKey.getCoeffScalar());
    }

    public final String getAlgorithm() {
        return "Rainbow";
    }

    public short[][] getCoeffQuadratic() {
        return this.coeffquadratic;
    }

    public short[] getCoeffScalar() {
        return C9586iIILl.m21642OooO00o(this.coeffscalar);
    }

    public short[][] getCoeffSingular() {
        short[][] sArr = new short[this.coeffsingular.length][];
        int i = 0;
        while (true) {
            short[][] sArr2 = this.coeffsingular;
            if (i == sArr2.length) {
                return sArr;
            }
            sArr[i] = C9586iIILl.m21642OooO00o(sArr2[i]);
            i++;
        }
    }

    public int getDocLength() {
        return this.docLength;
    }

    public byte[] getEncoded() {
        return iii1Ll.OooO0O0(new C6456l1ilL(L1iiiiI.OooO00o, C6452l1Lll.OooO00o), new LlIlI1L(this.docLength, this.coeffquadratic, this.coeffsingular, this.coeffscalar));
    }

    public String getFormat() {
        return "X.509";
    }

    public int hashCode() {
        return (((((this.docLength * 37) + C9586iIILl.OooO00o(this.coeffquadratic)) * 37) + C9586iIILl.OooO00o(this.coeffsingular)) * 37) + C9586iIILl.OooO00o(this.coeffscalar);
    }
}

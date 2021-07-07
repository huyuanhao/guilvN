package org.bouncycastle.pqc.jcajce.provider.rainbow;

import com.p118pd.sdk.C5464IlilIi;
import com.p118pd.sdk.C5601L1i;
import com.p118pd.sdk.C6179iLiL;
import com.p118pd.sdk.C6217iLLLL;
import com.p118pd.sdk.C6452l1Lll;
import com.p118pd.sdk.C6456l1ilL;
import com.p118pd.sdk.C6509lIiLIIi;
import com.p118pd.sdk.C9586iIILl;
import com.p118pd.sdk.L1iiiiI;
import com.p118pd.sdk.iiLIiL;
import java.io.IOException;
import java.security.PrivateKey;
import java.util.Arrays;

public class BCRainbowPrivateKey implements PrivateKey {
    public static final long serialVersionUID = 1;
    public short[][] A1inv;
    public short[][] A2inv;

    /* renamed from: b1 */
    public short[] f13505b1;

    /* renamed from: b2 */
    public short[] f13506b2;
    public C6179iLiL[] layers;

    /* renamed from: vi */
    public int[] f13507vi;

    public BCRainbowPrivateKey(C6217iLLLL r8) {
        this(r8.m17203OooO00o(), r8.m17202OooO00o(), r8.m17204OooO0O0(), r8.OooO0O0(), r8.OooO00o(), r8.m17201OooO00o());
    }

    public BCRainbowPrivateKey(iiLIiL r8) {
        this(r8.m17256OooO00o(), r8.m17255OooO00o(), r8.m17257OooO0O0(), r8.OooO0O0(), r8.OooO00o(), r8.m17254OooO00o());
    }

    public BCRainbowPrivateKey(short[][] sArr, short[] sArr2, short[][] sArr3, short[] sArr4, int[] iArr, C6179iLiL[] ililArr) {
        this.A1inv = sArr;
        this.f13505b1 = sArr2;
        this.A2inv = sArr3;
        this.f13506b2 = sArr4;
        this.f13507vi = iArr;
        this.layers = ililArr;
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof BCRainbowPrivateKey)) {
            return false;
        }
        BCRainbowPrivateKey bCRainbowPrivateKey = (BCRainbowPrivateKey) obj;
        boolean z = ((((C5601L1i.OooO00o(this.A1inv, bCRainbowPrivateKey.getInvA1())) && C5601L1i.OooO00o(this.A2inv, bCRainbowPrivateKey.getInvA2())) && C5601L1i.OooO00o(this.f13505b1, bCRainbowPrivateKey.getB1())) && C5601L1i.OooO00o(this.f13506b2, bCRainbowPrivateKey.getB2())) && Arrays.equals(this.f13507vi, bCRainbowPrivateKey.getVi());
        if (this.layers.length != bCRainbowPrivateKey.getLayers().length) {
            return false;
        }
        for (int length = this.layers.length - 1; length >= 0; length--) {
            z &= this.layers[length].equals(bCRainbowPrivateKey.getLayers()[length]);
        }
        return z;
    }

    public final String getAlgorithm() {
        return "Rainbow";
    }

    public short[] getB1() {
        return this.f13505b1;
    }

    public short[] getB2() {
        return this.f13506b2;
    }

    public byte[] getEncoded() {
        try {
            return new C5464IlilIi(new C6456l1ilL(L1iiiiI.OooO00o, C6452l1Lll.OooO00o), new C6509lIiLIIi(this.A1inv, this.f13505b1, this.A2inv, this.f13506b2, this.f13507vi, this.layers)).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    public String getFormat() {
        return "PKCS#8";
    }

    public short[][] getInvA1() {
        return this.A1inv;
    }

    public short[][] getInvA2() {
        return this.A2inv;
    }

    public C6179iLiL[] getLayers() {
        return this.layers;
    }

    public int[] getVi() {
        return this.f13507vi;
    }

    public int hashCode() {
        int length = (((((((((this.layers.length * 37) + C9586iIILl.OooO00o(this.A1inv)) * 37) + C9586iIILl.OooO00o(this.f13505b1)) * 37) + C9586iIILl.OooO00o(this.A2inv)) * 37) + C9586iIILl.OooO00o(this.f13506b2)) * 37) + C9586iIILl.OooO00o(this.f13507vi);
        for (int length2 = this.layers.length - 1; length2 >= 0; length2--) {
            length = (length * 37) + this.layers[length2].hashCode();
        }
        return length;
    }
}

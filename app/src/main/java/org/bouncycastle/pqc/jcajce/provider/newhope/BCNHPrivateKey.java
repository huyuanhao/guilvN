package org.bouncycastle.pqc.jcajce.provider.newhope;

import com.p118pd.sdk.AbstractC6370iIIIl;
import com.p118pd.sdk.AbstractC6464l1l;
import com.p118pd.sdk.AbstractC6804llL1ii;
import com.p118pd.sdk.C5464IlilIi;
import com.p118pd.sdk.C6456l1ilL;
import com.p118pd.sdk.C6487lIIiIlL;
import com.p118pd.sdk.C9586iIILl;
import com.p118pd.sdk.L1iiiiI;
import com.p118pd.sdk.LiL1L;
import java.io.IOException;
import org.bouncycastle.pqc.jcajce.interfaces.NHPrivateKey;

public class BCNHPrivateKey implements NHPrivateKey {
    public static final long serialVersionUID = 1;
    public final LiL1L params;

    public BCNHPrivateKey(C5464IlilIi r2) throws IOException {
        this.params = new LiL1L(OooO00o(AbstractC6804llL1ii.OooO00o(r2.m15708OooO0O0()).m17938OooO00o()));
    }

    public BCNHPrivateKey(LiL1L liL1L) {
        this.params = liL1L;
    }

    public static short[] OooO00o(byte[] bArr) {
        int length = bArr.length / 2;
        short[] sArr = new short[length];
        for (int i = 0; i != length; i++) {
            sArr[i] = AbstractC6464l1l.m17602OooO0O0(bArr, i * 2);
        }
        return sArr;
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof BCNHPrivateKey)) {
            return false;
        }
        return C9586iIILl.OooO00o(this.params.OooO00o(), ((BCNHPrivateKey) obj).params.OooO00o());
    }

    public final String getAlgorithm() {
        return "NH";
    }

    public byte[] getEncoded() {
        try {
            C6456l1ilL r0 = new C6456l1ilL(L1iiiiI.OooOo0O);
            short[] OooO00o = this.params.OooO00o();
            byte[] bArr = new byte[(OooO00o.length * 2)];
            for (int i = 0; i != OooO00o.length; i++) {
                AbstractC6464l1l.OooO00o(OooO00o[i], bArr, i * 2);
            }
            return new C5464IlilIi(r0, new C6487lIIiIlL(bArr)).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    public String getFormat() {
        return "PKCS#8";
    }

    public AbstractC6370iIIIl getKeyParams() {
        return this.params;
    }

    @Override // org.bouncycastle.pqc.jcajce.interfaces.NHPrivateKey
    public short[] getSecretData() {
        return this.params.OooO00o();
    }

    public int hashCode() {
        return C9586iIILl.OooO00o(this.params.OooO00o());
    }
}

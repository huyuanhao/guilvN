package org.bouncycastle.pqc.jcajce.provider.gmss;

import com.p118pd.sdk.AbstractC6370iIIIl;
import com.p118pd.sdk.C5673LLll;
import com.p118pd.sdk.C6112iIiii;
import com.p118pd.sdk.C6456l1ilL;
import com.p118pd.sdk.C6472l1l1l;
import com.p118pd.sdk.I11LI;
import com.p118pd.sdk.II11;
import com.p118pd.sdk.L1iiiiI;
import com.p118pd.sdk.iii1Ll;
import java.security.PublicKey;

public class BCGMSSPublicKey implements AbstractC6370iIIIl, PublicKey {
    public static final long serialVersionUID = 1;
    public C5673LLll gmssParameterSet;
    public C5673LLll gmssParams;
    public byte[] publicKeyBytes;

    public BCGMSSPublicKey(II11 r2) {
        this(r2.OooO0O0(), r2.OooO00o());
    }

    public BCGMSSPublicKey(byte[] bArr, C5673LLll r2) {
        this.gmssParameterSet = r2;
        this.publicKeyBytes = bArr;
    }

    public String getAlgorithm() {
        return "GMSS";
    }

    public byte[] getEncoded() {
        return iii1Ll.OooO0O0(new C6456l1ilL(L1iiiiI.OooO0oO, new C6112iIiii(this.gmssParameterSet.OooO00o(), this.gmssParameterSet.m16250OooO00o(), this.gmssParameterSet.OooO0OO(), this.gmssParameterSet.OooO0O0()).m16994OooO0O0()), new I11LI(this.publicKeyBytes));
    }

    public String getFormat() {
        return "X.509";
    }

    public C5673LLll getParameterSet() {
        return this.gmssParameterSet;
    }

    public byte[] getPublicKeyBytes() {
        return this.publicKeyBytes;
    }

    public String toString() {
        String str = "GMSS public key : " + new String(C6472l1l1l.OooO0O0(this.publicKeyBytes)) + "\nHeight of Trees: \n";
        for (int i = 0; i < this.gmssParameterSet.m16250OooO00o().length; i++) {
            str = str + "Layer " + i + " : " + this.gmssParameterSet.m16250OooO00o()[i] + " WinternitzParameter: " + this.gmssParameterSet.OooO0OO()[i] + " K: " + this.gmssParameterSet.OooO0O0()[i] + "\n";
        }
        return str;
    }
}

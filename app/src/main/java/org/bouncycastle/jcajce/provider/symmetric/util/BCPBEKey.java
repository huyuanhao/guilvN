package org.bouncycastle.jcajce.provider.symmetric.util;

import com.p118pd.sdk.AbstractC6370iIIIl;
import com.p118pd.sdk.C6274iilL1L;
import com.p118pd.sdk.C6642li1LI;
import com.p118pd.sdk.LlLI1;
import com.p118pd.sdk.lLLL1iL;
import java.security.spec.KeySpec;
import javax.crypto.interfaces.PBEKey;
import javax.crypto.spec.PBEKeySpec;

public class BCPBEKey implements PBEKey {
    public String algorithm;
    public int digest;
    public int ivSize;
    public int keySize;
    public LlLI1 oid;
    public AbstractC6370iIIIl param;
    public PBEKeySpec pbeKeySpec;
    public boolean tryWrong = false;
    public int type;

    public BCPBEKey(String str, LlLI1 llLI1, int i, int i2, int i3, int i4, PBEKeySpec pBEKeySpec, AbstractC6370iIIIl r9) {
        this.algorithm = str;
        this.oid = llLI1;
        this.type = i;
        this.digest = i2;
        this.keySize = i3;
        this.ivSize = i4;
        this.pbeKeySpec = pBEKeySpec;
        this.param = r9;
    }

    public BCPBEKey(String str, KeySpec keySpec, AbstractC6370iIIIl r3) {
        this.algorithm = str;
        this.param = r3;
    }

    public String getAlgorithm() {
        return this.algorithm;
    }

    public int getDigest() {
        return this.digest;
    }

    public byte[] getEncoded() {
        AbstractC6370iIIIl r0 = this.param;
        if (r0 != null) {
            if (r0 instanceof C6274iilL1L) {
                r0 = ((C6274iilL1L) r0).OooO00o();
            }
            return ((C6642li1LI) r0).OooO00o();
        }
        int i = this.type;
        return i == 2 ? lLLL1iL.OooO00o(this.pbeKeySpec.getPassword()) : i == 5 ? lLLL1iL.OooO0OO(this.pbeKeySpec.getPassword()) : lLLL1iL.OooO0O0(this.pbeKeySpec.getPassword());
    }

    public String getFormat() {
        return "RAW";
    }

    public int getIterationCount() {
        return this.pbeKeySpec.getIterationCount();
    }

    public int getIvSize() {
        return this.ivSize;
    }

    public int getKeySize() {
        return this.keySize;
    }

    public LlLI1 getOID() {
        return this.oid;
    }

    public AbstractC6370iIIIl getParam() {
        return this.param;
    }

    public char[] getPassword() {
        return this.pbeKeySpec.getPassword();
    }

    public byte[] getSalt() {
        return this.pbeKeySpec.getSalt();
    }

    public int getType() {
        return this.type;
    }

    public void setTryWrongPKCS12Zero(boolean z) {
        this.tryWrong = z;
    }

    public boolean shouldTryWrongPKCS12() {
        return this.tryWrong;
    }
}

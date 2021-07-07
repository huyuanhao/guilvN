package com.p118pd.sdk;

import com.p118pd.sdk.AbstractC6840lI;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import javax.crypto.SecretKey;
import javax.crypto.spec.PBEKeySpec;
import org.bouncycastle.jcajce.provider.symmetric.util.BCPBEKey;

/* renamed from: com.pd.sdk.LlL1丨i  reason: invalid class name and case insensitive filesystem */
public class C5788LlL1i extends C6338illll implements AbstractC6840lI {
    public boolean OooO0O0;
    public int o00oO0O;
    public int o0ooOO0;
    public int o0ooOOo;
    public int o0ooOoO;

    public C5788LlL1i(String str, LlLI1 llLI1, boolean z, int i, int i2, int i3, int i4) {
        super(str, llLI1);
        this.OooO0O0 = z;
        this.o00oO0O = i;
        this.o0ooOO0 = i2;
        this.o0ooOOo = i3;
        this.o0ooOoO = i4;
    }

    @Override // javax.crypto.SecretKeyFactorySpi, com.p118pd.sdk.C6338illll
    public SecretKey engineGenerateSecret(KeySpec keySpec) throws InvalidKeySpecException {
        if (keySpec instanceof PBEKeySpec) {
            PBEKeySpec pBEKeySpec = (PBEKeySpec) keySpec;
            if (pBEKeySpec.getSalt() == null) {
                return new BCPBEKey(super.o0ooOOo, this.o00OoOOo, this.o00oO0O, this.o0ooOO0, this.o0ooOOo, this.o0ooOoO, pBEKeySpec, null);
            }
            return new BCPBEKey(super.o0ooOOo, this.o00OoOOo, this.o00oO0O, this.o0ooOO0, this.o0ooOOo, this.o0ooOoO, pBEKeySpec, this.OooO0O0 ? AbstractC6840lI.OooO00o.OooO00o(pBEKeySpec, this.o00oO0O, this.o0ooOO0, this.o0ooOOo, this.o0ooOoO) : AbstractC6840lI.OooO00o.OooO00o(pBEKeySpec, this.o00oO0O, this.o0ooOO0, this.o0ooOOo));
        }
        throw new InvalidKeySpecException("Invalid KeySpec");
    }
}

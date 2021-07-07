package com.p118pd.sdk;

import java.security.PrivateKey;
import org.bouncycastle.util.p292io.pem.PemGenerationException;

/* renamed from: com.pd.sdk.IIlI丨1Ll  reason: invalid class name */
public class IIlI1Ll extends ILL1LlLl {
    public IIlI1Ll(PrivateKey privateKey, AbstractC5650LIL r2) throws PemGenerationException {
        super(C5464IlilIi.OooO00o(privateKey.getEncoded()), r2);
    }
}

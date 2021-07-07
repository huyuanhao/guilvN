package com.p118pd.sdk;

import java.io.IOException;
import java.security.SignatureException;

/* renamed from: com.pd.sdk.l1illL */
public class l1illL extends C6123iIlLii {
    @Override // com.p118pd.sdk.C6123iIlLii
    public void OooO00o(byte[] bArr) {
        for (int i = 0; i < bArr.length / 2; i++) {
            byte b = bArr[i];
            bArr[i] = bArr[(bArr.length - 1) - i];
            bArr[(bArr.length - 1) - i] = b;
        }
    }

    @Override // java.security.SignatureSpi, com.p118pd.sdk.C6123iIlLii
    public byte[] engineSign() throws SignatureException {
        byte[] OooO00o = AbstractC6804llL1ii.OooO00o((Object) super.engineSign()).m17938OooO00o();
        OooO00o(OooO00o);
        try {
            return new C6487lIIiIlL(OooO00o).getEncoded();
        } catch (Exception e) {
            throw new SignatureException(e.toString());
        }
    }

    @Override // java.security.SignatureSpi, com.p118pd.sdk.C6123iIlLii
    public boolean engineVerify(byte[] bArr) throws SignatureException {
        try {
            byte[] OooO00o = ((AbstractC6804llL1ii) AbstractC6122iIlLiL.OooO00o(bArr)).m17938OooO00o();
            OooO00o(OooO00o);
            try {
                return super.engineVerify(new C6487lIIiIlL(OooO00o).getEncoded());
            } catch (SignatureException e) {
                throw e;
            } catch (Exception e2) {
                throw new SignatureException(e2.toString());
            }
        } catch (IOException unused) {
            throw new SignatureException("error decoding signature bytes.");
        }
    }
}

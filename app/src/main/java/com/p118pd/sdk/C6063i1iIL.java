package com.p118pd.sdk;

import java.io.IOException;
import java.io.OutputStream;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.tls.TlsFatalAlert;

/* renamed from: com.pd.sdk.i1丨i丨I丨L  reason: invalid class name and case insensitive filesystem */
public class C6063i1iIL {
    public static byte[] OooO00o(iL1liI il1lii, liLI1l1i lili1l1i, OutputStream outputStream) throws IOException {
        byte[] bArr = new byte[48];
        il1lii.m17078OooO00o().nextBytes(bArr);
        L1LL1Ii.OooO00o(il1lii.OooO00o(), bArr, 0);
        iLlilLI r2 = new iLlilLI(new C6114iIiI());
        r2.OooO00o(true, (AbstractC6370iIIIl) new liLL1l(lili1l1i, il1lii.m17078OooO00o()));
        try {
            byte[] OooO00o = r2.OooO00o(bArr, 0, 48);
            if (L1LL1Ii.OooO00o(il1lii)) {
                outputStream.write(OooO00o);
            } else {
                L1LL1Ii.OooO00o(OooO00o, outputStream);
            }
            return bArr;
        } catch (InvalidCipherTextException e) {
            throw new TlsFatalAlert(80, e);
        }
    }

    public static byte[] OooO00o(iL1liI il1lii, liLI1l1i lili1l1i, byte[] bArr) {
        i1iiIl OooO00o = il1lii.OooO00o();
        byte[] bArr2 = new byte[48];
        il1lii.m17078OooO00o().nextBytes(bArr2);
        byte[] OooO00o2 = C9586iIILl.m21630OooO00o(bArr2);
        try {
            iLlilLI r5 = new iLlilLI(new C6114iIiI(), bArr2);
            r5.OooO00o(false, (AbstractC6370iIIIl) new liLL1l(lili1l1i, il1lii.m17078OooO00o()));
            OooO00o2 = r5.OooO00o(bArr, 0, bArr.length);
        } catch (Exception unused) {
        }
        int OooO0O0 = (OooO00o.OooO0O0() ^ (OooO00o2[0] & 255)) | (OooO00o.OooO0OO() ^ (OooO00o2[1] & 255));
        int i = OooO0O0 | (OooO0O0 >> 1);
        int i2 = i | (i >> 2);
        int i3 = (((i2 | (i2 >> 4)) & 1) - 1) ^ -1;
        for (int i4 = 0; i4 < 48; i4++) {
            OooO00o2[i4] = (byte) ((OooO00o2[i4] & (i3 ^ -1)) | (bArr2[i4] & i3));
        }
        return OooO00o2;
    }
}

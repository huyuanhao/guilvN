package com.p118pd.sdk;

import java.io.IOException;
import java.io.OutputStream;
import org.bouncycastle.cert.CertIOException;
import org.bouncycastle.cert.crmf.CRMFRuntimeException;

/* renamed from: com.pd.sdk.IiIl1丨i  reason: invalid class name and case insensitive filesystem */
public class C5353IiIl1i {
    public static void OooO00o(L11l1i r0, LlLI1 llLI1, boolean z, AbstractC6854lLi1LL r3) throws CertIOException {
        try {
            r0.OooO00o(llLI1, z, r3);
        } catch (IOException e) {
            throw new CertIOException("cannot encode extension: " + e.getMessage(), e);
        }
    }

    public static void OooO00o(AbstractC6854lLi1LL r2, OutputStream outputStream) {
        C6119iIl1il r0 = new C6119iIl1il(outputStream);
        try {
            r0.OooO00o(r2);
            r0.m16965OooO00o();
        } catch (IOException e) {
            throw new CRMFRuntimeException("unable to DER encode object: " + e.getMessage(), e);
        }
    }
}

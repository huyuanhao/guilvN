package com.p118pd.sdk;

import java.io.IOException;
import java.io.OutputStream;
import org.bouncycastle.cert.cmp.CMPRuntimeException;

/* renamed from: com.pd.sdk.丨丨iL  reason: invalid class name and case insensitive filesystem */
public class C9836iL {
    public static void OooO00o(AbstractC6854lLi1LL r2, OutputStream outputStream) {
        C6119iIl1il r0 = new C6119iIl1il(outputStream);
        try {
            r0.OooO00o(r2);
            r0.m16965OooO00o();
        } catch (IOException e) {
            throw new CMPRuntimeException("unable to DER encode object: " + e.getMessage(), e);
        }
    }
}

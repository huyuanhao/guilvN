package com.p118pd.sdk;

import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.pd.sdk.IlIIi丨lL  reason: invalid class name */
public class IlIIilL {
    public final String OooO00o;
    public final String OooO0O0;
    public final String OooO0OO = "-----BEGIN PKCS7-----";
    public final String OooO0Oo;
    public final String OooO0o;
    public final String OooO0o0;

    public IlIIilL(String str) {
        this.OooO00o = C9428Ill1L.o0ooOOo + str + "-----";
        this.OooO0O0 = "-----BEGIN X509 " + str + "-----";
        this.OooO0Oo = C9428Ill1L.o0ooOoO + str + "-----";
        this.OooO0o0 = "-----END X509 " + str + "-----";
        this.OooO0o = "-----END PKCS7-----";
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0022 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.String OooO00o(java.io.InputStream r6) throws java.io.IOException {
        /*
            r5 = this;
            java.lang.StringBuffer r0 = new java.lang.StringBuffer
            r0.<init>()
        L_0x0005:
            int r1 = r6.read()
            r2 = 10
            r3 = 13
            if (r1 == r3) goto L_0x0018
            if (r1 == r2) goto L_0x0018
            if (r1 < 0) goto L_0x0018
            char r1 = (char) r1
            r0.append(r1)
            goto L_0x0005
        L_0x0018:
            if (r1 < 0) goto L_0x0020
            int r4 = r0.length()
            if (r4 == 0) goto L_0x0005
        L_0x0020:
            if (r1 >= 0) goto L_0x0024
            r6 = 0
            return r6
        L_0x0024:
            if (r1 != r3) goto L_0x0038
            r1 = 1
            r6.mark(r1)
            int r3 = r6.read()
            if (r3 != r2) goto L_0x0033
            r6.mark(r1)
        L_0x0033:
            if (r3 <= 0) goto L_0x0038
            r6.reset()
        L_0x0038:
            java.lang.String r6 = r0.toString()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p118pd.sdk.IlIIilL.OooO00o(java.io.InputStream):java.lang.String");
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public I11li1 m15659OooO00o(InputStream inputStream) throws IOException {
        String OooO00o2;
        StringBuffer stringBuffer = new StringBuffer();
        do {
            OooO00o2 = OooO00o(inputStream);
            if (OooO00o2 == null || OooO00o2.startsWith(this.OooO00o) || OooO00o2.startsWith(this.OooO0O0)) {
            }
        } while (!OooO00o2.startsWith(this.OooO0OO));
        while (true) {
            String OooO00o3 = OooO00o(inputStream);
            if (OooO00o3 != null && !OooO00o3.startsWith(this.OooO0Oo) && !OooO00o3.startsWith(this.OooO0o0) && !OooO00o3.startsWith(this.OooO0o)) {
                stringBuffer.append(OooO00o3);
            }
        }
        if (stringBuffer.length() == 0) {
            return null;
        }
        try {
            return I11li1.OooO00o((Object) C6808lllI.OooO00o(stringBuffer.toString()));
        } catch (Exception unused) {
            throw new IOException("malformed PEM data encountered");
        }
    }
}

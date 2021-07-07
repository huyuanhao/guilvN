package com.p118pd.sdk;

import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.pd.sdk.LliiiLi  reason: case insensitive filesystem */
public class C5795LliiiLi {
    public final String OooO00o;
    public final String OooO0O0;
    public final String OooO0OO;
    public final String OooO0Oo;

    public C5795LliiiLi(String str) {
        this.OooO00o = C9428Ill1L.o0ooOOo + str + "-----";
        this.OooO0O0 = "-----BEGIN X509 " + str + "-----";
        this.OooO0OO = C9428Ill1L.o0ooOoO + str + "-----";
        this.OooO0Oo = "-----END X509 " + str + "-----";
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0025 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0027  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.String OooO00o(java.io.InputStream r5) throws java.io.IOException {
        /*
            r4 = this;
            java.lang.StringBuffer r0 = new java.lang.StringBuffer
            r0.<init>()
        L_0x0005:
            int r1 = r5.read()
            r2 = 13
            if (r1 == r2) goto L_0x001b
            r3 = 10
            if (r1 == r3) goto L_0x001b
            if (r1 < 0) goto L_0x001b
            if (r1 != r2) goto L_0x0016
            goto L_0x0005
        L_0x0016:
            char r1 = (char) r1
            r0.append(r1)
            goto L_0x0005
        L_0x001b:
            if (r1 < 0) goto L_0x0023
            int r2 = r0.length()
            if (r2 == 0) goto L_0x0005
        L_0x0023:
            if (r1 >= 0) goto L_0x0027
            r5 = 0
            return r5
        L_0x0027:
            java.lang.String r5 = r0.toString()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p118pd.sdk.C5795LliiiLi.OooO00o(java.io.InputStream):java.lang.String");
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public I11li1 m16398OooO00o(InputStream inputStream) throws IOException {
        String OooO00o2;
        StringBuffer stringBuffer = new StringBuffer();
        do {
            OooO00o2 = OooO00o(inputStream);
            if (OooO00o2 == null || OooO00o2.startsWith(this.OooO00o)) {
            }
        } while (!OooO00o2.startsWith(this.OooO0O0));
        while (true) {
            String OooO00o3 = OooO00o(inputStream);
            if (OooO00o3 != null && !OooO00o3.startsWith(this.OooO0OO) && !OooO00o3.startsWith(this.OooO0Oo)) {
                stringBuffer.append(OooO00o3);
            }
        }
        if (stringBuffer.length() == 0) {
            return null;
        }
        AbstractC6122iIlLiL OooO00o4 = new C5805Ll1(C6808lllI.OooO00o(stringBuffer.toString())).OooO00o();
        if (OooO00o4 instanceof I11li1) {
            return (I11li1) OooO00o4;
        }
        throw new IOException("malformed PEM data encountered");
    }
}

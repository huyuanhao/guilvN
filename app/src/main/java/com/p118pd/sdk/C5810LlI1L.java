package com.p118pd.sdk;

import java.io.IOException;
import java.io.OutputStream;
import java.net.URL;
import java.nio.charset.Charset;
import org.bouncycastle.est.ESTException;

/* renamed from: com.pd.sdk.Ll丨I1L丨丨  reason: invalid class name and case insensitive filesystem */
public class C5810LlI1L implements iLL11Ll1 {
    public static final Charset OooO00o = Charset.forName("UTF-8");

    /* renamed from: OooO00o  reason: collision with other field name */
    public static byte[] f16758OooO00o = {13, 10};

    /* renamed from: OooO00o  reason: collision with other field name */
    public final iLlLIL1 f16759OooO00o;

    /* renamed from: com.pd.sdk.Ll丨I1L丨丨$OooO00o */
    public class OooO00o extends OutputStream {

        /* renamed from: OooO00o  reason: collision with other field name */
        public final OutputStream f16760OooO00o;

        public OooO00o(OutputStream outputStream) {
            this.f16760OooO00o = outputStream;
        }

        @Override // java.io.OutputStream
        public void write(int i) throws IOException {
            System.out.print(String.valueOf((char) i));
            this.f16760OooO00o.write(i);
        }
    }

    public C5810LlI1L(iLlLIL1 r1) {
        this.f16759OooO00o = r1;
    }

    public static void OooO00o(OutputStream outputStream, String str) throws IOException {
        outputStream.write(str.getBytes());
        outputStream.write(f16758OooO00o);
    }

    public C6773llLi OooO00o(C6860liLi r7) throws IOException {
        C6773llLi r0;
        C6820lI1ii r02;
        if (r7.OooO00o() < 300 || r7.OooO00o() > 399) {
            r0 = null;
        } else {
            switch (r7.OooO00o()) {
                case 304:
                case 305:
                default:
                    throw new ESTException("Client does not handle http status code: " + r7.OooO00o());
                case 301:
                case 302:
                case 303:
                case 306:
                case 307:
                    String OooO00o2 = r7.OooO00o("Location");
                    if (!"".equals(OooO00o2)) {
                        C6820lI1ii r1 = new C6820lI1ii(r7.m18007OooO00o());
                        if (OooO00o2.startsWith("http")) {
                            r02 = r1.OooO00o(new URL(OooO00o2));
                        } else {
                            URL OooO00o3 = r7.m18007OooO00o().m17893OooO00o();
                            r02 = r1.OooO00o(new URL(OooO00o3.getProtocol(), OooO00o3.getHost(), OooO00o3.getPort(), OooO00o2));
                        }
                        r0 = r02.OooO00o();
                        break;
                    } else {
                        throw new ESTException("Redirect status type: " + r7.OooO00o() + " but no location header");
                    }
            }
        }
        if (r0 != null) {
            r7.m18013OooO00o();
        }
        return r0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:7:0x0015 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0016  */
    @Override // com.p118pd.sdk.iLL11Ll1
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.p118pd.sdk.C6860liLi OooO00o(com.p118pd.sdk.C6773llLi r3) throws java.io.IOException {
        /*
            r2 = this;
            r0 = 15
        L_0x0002:
            com.pd.sdk.l丨iLi r3 = r2.OooO0O0(r3)
            com.pd.sdk.llLi丨 r1 = r2.OooO00o(r3)
            if (r1 == 0) goto L_0x0013
            int r0 = r0 + -1
            if (r0 > 0) goto L_0x0011
            goto L_0x0013
        L_0x0011:
            r3 = r1
            goto L_0x0002
        L_0x0013:
            if (r0 == 0) goto L_0x0016
            return r3
        L_0x0016:
            org.bouncycastle.est.ESTException r3 = new org.bouncycastle.est.ESTException
            java.lang.String r0 = "Too many redirects.."
            r3.<init>(r0)
            goto L_0x001f
        L_0x001e:
            throw r3
        L_0x001f:
            goto L_0x001e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p118pd.sdk.C5810LlI1L.OooO00o(com.pd.sdk.llLi丨):com.pd.sdk.l丨iLi");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0066 A[Catch:{ all -> 0x014f }] */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x006f A[Catch:{ all -> 0x014f }] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0087 A[Catch:{ all -> 0x014f }] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00b8  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00f3  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0139  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0149  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.p118pd.sdk.C6860liLi OooO0O0(com.p118pd.sdk.C6773llLi r10) throws java.io.IOException {
        /*
        // Method dump skipped, instructions count: 344
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p118pd.sdk.C5810LlI1L.OooO0O0(com.pd.sdk.llLi丨):com.pd.sdk.l丨iLi");
    }
}

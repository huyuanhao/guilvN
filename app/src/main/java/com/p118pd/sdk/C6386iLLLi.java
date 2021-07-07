package com.p118pd.sdk;

import anet.channel.util.HttpConstant;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.net.URL;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;
import org.bouncycastle.cert.X509CertificateHolder;

/* renamed from: com.pd.sdk.i丨L丨LLi  reason: invalid class name and case insensitive filesystem */
public class C6386iLLLi {
    public static final Set<String> OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final Pattern f18185OooO00o = Pattern.compile("^[0-9a-zA-Z_\\-.~!$&'()*+,;=]+");
    public static final String OooO0O0 = "/cacerts";
    public static final String OooO0OO = "/simpleenroll";
    public static final String OooO0Oo = "/simplereenroll";
    public static final String OooO0o = "/serverkeygen";
    public static final String OooO0o0 = "/fullcmc";
    public static final String OooO0oO = "/csrattrs";

    /* renamed from: OooO00o  reason: collision with other field name */
    public final AbstractC9522Ll1 f18186OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final String f18187OooO00o;

    /* renamed from: com.pd.sdk.i丨L丨LLi$OooO00o */
    public class OooO00o implements iLIlLI {
        public final /* synthetic */ Lii1ii1 OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ iIL1i f18188OooO00o;

        public OooO00o(iIL1i iil1i, Lii1ii1 r3) {
            this.f18188OooO00o = iil1i;
            this.OooO00o = r3;
        }

        @Override // com.p118pd.sdk.iLIlLI
        public C6773llLi OooO00o(C111 r5, C6773llLi r6) throws IOException {
            if (r5 instanceof LI1ILl) {
                LI1ILl r52 = (LI1ILl) r5;
                if (r52.OooO00o()) {
                    iIL1i iil1i = new iIL1i(this.f18188OooO00o);
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    iil1i.OooO0O0(AbstractC5711LiLli.oo0o0Oo, new LI11(C6808lllI.OooO00o(r52.m16012OooO00o())));
                    byteArrayOutputStream.write(C6386iLLLi.this.OooO00o((C6386iLLLi) iil1i.OooO00o(this.OooO00o).m17585OooO00o()).getBytes());
                    byteArrayOutputStream.flush();
                    C6820lI1ii OooO00o2 = new C6820lI1ii(r6).OooO00o(byteArrayOutputStream.toByteArray());
                    OooO00o2.OooO0O0("Content-Type", "application/pkcs10");
                    OooO00o2.OooO0O0("Content-Transfer-Encoding", "base64");
                    OooO00o2.OooO0O0("Content-Length", Long.toString((long) byteArrayOutputStream.size()));
                    return OooO00o2.OooO00o();
                }
            }
            throw new IOException("Source does not supply TLS unique.");
        }
    }

    static {
        HashSet hashSet = new HashSet();
        OooO00o = hashSet;
        hashSet.add("cacerts");
        OooO00o.add("simpleenroll");
        OooO00o.add("simplereenroll");
        OooO00o.add("fullcmc");
        OooO00o.add("serverkeygen");
        OooO00o.add("csrattrs");
    }

    public C6386iLLLi(String str, String str2, AbstractC9522Ll1 r5) {
        String str3;
        String OooO0O02 = OooO0O0(str);
        if (str2 != null) {
            str3 = "https://" + OooO0O02 + "/.well-known/est/" + OooO00o(str2);
        } else {
            str3 = "https://" + OooO0O02 + "/.well-known/est";
        }
        this.f18187OooO00o = str3;
        this.f18186OooO00o = r5;
    }

    private String OooO00o(String str) {
        while (str.endsWith(C8932ooOOO0o.OooO0OO) && str.length() > 0) {
            str = str.substring(0, str.length() - 1);
        }
        while (str.startsWith(C8932ooOOO0o.OooO0OO) && str.length() > 0) {
            str = str.substring(1);
        }
        if (str.length() == 0) {
            throw new IllegalArgumentException("Label set but after trimming '/' is not zero length string.");
        } else if (!f18185OooO00o.matcher(str).matches()) {
            throw new IllegalArgumentException("Server path " + str + " contains invalid characters");
        } else if (!OooO00o.contains(str)) {
            return str;
        } else {
            throw new IllegalArgumentException("Label " + str + " is a reserved path segment.");
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private String OooO00o(byte[] bArr) {
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        int i = 0;
        do {
            int i2 = i + 48;
            if (i2 < bArr.length) {
                printWriter.print(C6808lllI.OooO00o(bArr, i, 48));
                i = i2;
            } else {
                printWriter.print(C6808lllI.OooO00o(bArr, i, bArr.length - i));
                i = bArr.length;
            }
            printWriter.print('\n');
        } while (i < bArr.length);
        printWriter.flush();
        return stringWriter.toString();
    }

    public static X509CertificateHolder[] OooO00o(AbstractC6271iilI<X509CertificateHolder> iili) {
        return OooO00o(iili, (AbstractC6317ilLi<X509CertificateHolder>) null);
    }

    public static X509CertificateHolder[] OooO00o(AbstractC6271iilI<X509CertificateHolder> iili, AbstractC6317ilLi<X509CertificateHolder> illi) {
        Collection<X509CertificateHolder> OooO00o2 = iili.OooO00o(illi);
        return (X509CertificateHolder[]) OooO00o2.toArray(new X509CertificateHolder[OooO00o2.size()]);
    }

    private String OooO0O0(String str) {
        while (str.endsWith(C8932ooOOO0o.OooO0OO) && str.length() > 0) {
            try {
                str = str.substring(0, str.length() - 1);
            } catch (Exception e) {
                if (e instanceof IllegalArgumentException) {
                    throw ((IllegalArgumentException) e);
                }
                throw new IllegalArgumentException("Scheme and host is invalid: " + e.getMessage(), e);
            }
        }
        if (!str.contains(HttpConstant.SCHEME_SPLIT)) {
            URL url = new URL("https://" + str);
            if (url.getPath().length() != 0) {
                if (!url.getPath().equals(C8932ooOOO0o.OooO0OO)) {
                    throw new IllegalArgumentException("Server contains path, must only be <dnsname/ipaddress>:port, a path of '/.well-known/est/<label>' will be added arbitrarily.");
                }
            }
            return str;
        }
        throw new IllegalArgumentException("Server contains scheme, must only be <dnsname/ipaddress>:port, https:// will be added arbitrarily.");
    }

    /* JADX WARNING: Removed duplicated region for block: B:50:0x017a A[Catch:{ all -> 0x0187 }] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x017d A[Catch:{ all -> 0x0187 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.p118pd.sdk.C5564I1 OooO00o() throws java.lang.Exception {
        /*
        // Method dump skipped, instructions count: 398
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p118pd.sdk.C6386iLLLi.OooO00o():com.pd.sdk.I丨丨1");
    }

    public LILII OooO00o(LILII lilii) throws Exception {
        if (this.f18186OooO00o.m21583OooO00o()) {
            C6860liLi r0 = null;
            try {
                iLL11Ll1 OooO00o2 = this.f18186OooO00o.OooO00o();
                r0 = OooO00o2.OooO00o(new C6820lI1ii(lilii.m16044OooO00o()).OooO00o(OooO00o2).OooO00o());
                LILII OooO00o3 = OooO00o(r0);
                if (r0 != null) {
                    r0.m18013OooO00o();
                }
                return OooO00o3;
            } catch (Throwable th) {
                if (r0 != null) {
                    r0.m18013OooO00o();
                }
                throw th;
            }
        } else {
            throw new IllegalStateException("No trust anchors.");
        }
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:4:0x0015 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v13, resolved type: java.lang.String */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v19, types: [long] */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x004a, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x007d, code lost:
        throw new org.bouncycastle.est.ESTException("Unable to parse Retry-After header:" + r4.m17893OooO00o().toString() + " " + r0.getMessage(), null, r9.OooO00o(), r9.m18009OooO00o());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:?, code lost:
        r2 = new java.text.SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss z", java.util.Locale.US);
        r2.setTimeZone(java.util.TimeZone.getTimeZone("GMT"));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x003d, code lost:
        r2 = r2.parse(r0).getTime();
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0023 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.p118pd.sdk.LILII OooO00o(com.p118pd.sdk.C6860liLi r9) throws java.io.IOException {
        /*
        // Method dump skipped, instructions count: 259
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p118pd.sdk.C6386iLLLi.OooO00o(com.pd.sdk.l丨iLi):com.pd.sdk.LILII");
    }

    public LILII OooO00o(boolean z, iIL1i iil1i, Lii1ii1 r7, AbstractC6371iIIll r8) throws IOException {
        if (this.f18186OooO00o.m21583OooO00o()) {
            C6860liLi r0 = null;
            try {
                StringBuilder sb = new StringBuilder();
                sb.append(this.f18187OooO00o);
                sb.append(z ? OooO0Oo : OooO0OO);
                URL url = new URL(sb.toString());
                iLL11Ll1 OooO00o2 = this.f18186OooO00o.OooO00o();
                C6820lI1ii OooO00o3 = new C6820lI1ii("POST", url).OooO00o(OooO00o2).OooO00o(new OooO00o(iil1i, r7));
                if (r8 != null) {
                    r8.OooO00o(OooO00o3);
                }
                C6860liLi OooO00o4 = OooO00o2.OooO00o(OooO00o3.OooO00o());
                LILII OooO00o5 = OooO00o(OooO00o4);
                if (OooO00o4 != null) {
                    OooO00o4.m18013OooO00o();
                }
                return OooO00o5;
            } catch (Throwable th) {
                if (0 != 0) {
                    r0.m18013OooO00o();
                }
                throw th;
            }
        } else {
            throw new IllegalStateException("No trust anchors.");
        }
    }

    public LILII OooO00o(boolean z, l1ili1 r7, AbstractC6371iIIll r8) throws IOException {
        if (this.f18186OooO00o.m21583OooO00o()) {
            C6860liLi r0 = null;
            try {
                byte[] bytes = OooO00o(r7.m17585OooO00o()).getBytes();
                StringBuilder sb = new StringBuilder();
                sb.append(this.f18187OooO00o);
                sb.append(z ? OooO0Oo : OooO0OO);
                URL url = new URL(sb.toString());
                iLL11Ll1 OooO00o2 = this.f18186OooO00o.OooO00o();
                C6820lI1ii OooO00o3 = new C6820lI1ii("POST", url).OooO00o(bytes).OooO00o(OooO00o2);
                OooO00o3.OooO00o("Content-Type", "application/pkcs10");
                OooO00o3.OooO00o("Content-Length", "" + bytes.length);
                OooO00o3.OooO00o("Content-Transfer-Encoding", "base64");
                if (r8 != null) {
                    r8.OooO00o(OooO00o3);
                }
                C6860liLi OooO00o4 = OooO00o2.OooO00o(OooO00o3.OooO00o());
                LILII OooO00o5 = OooO00o(OooO00o4);
                if (OooO00o4 != null) {
                    OooO00o4.m18013OooO00o();
                }
                return OooO00o5;
            } catch (Throwable th) {
                if (0 != 0) {
                    r0.m18013OooO00o();
                }
                throw th;
            }
        } else {
            throw new IllegalStateException("No trust anchors.");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x00a2 A[SYNTHETIC, Splitter:B:23:0x00a2] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00c0  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0104 A[Catch:{ all -> 0x0111 }] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0107 A[Catch:{ all -> 0x0111 }] */
    /* renamed from: OooO00o  reason: collision with other method in class */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.p118pd.sdk.C6411ilLI m17502OooO00o() throws org.bouncycastle.est.ESTException {
        /*
        // Method dump skipped, instructions count: 290
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p118pd.sdk.C6386iLLLi.m17502OooO00o():com.pd.sdk.i丨lL丨I");
    }
}

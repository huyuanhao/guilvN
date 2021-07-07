package com.p118pd.sdk;

import java.io.IOException;
import java.io.InputStream;
import java.util.Set;
import org.bouncycastle.est.HttpUtil;
import org.bouncycastle.util.Strings;

/* renamed from: com.pd.sdk.l丨iLi  reason: invalid class name and case insensitive filesystem */
public class C6860liLi {
    public static final Long OooO0OO = 0L;
    public int OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public long f18925OooO00o = 0;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final C6773llLi f18926OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final C111 f18927OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public InputStream f18928OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Long f18929OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public String f18930OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final HttpUtil.Headers f18931OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final byte[] f18932OooO00o;
    public Long OooO0O0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public String f18933OooO0O0;

    /* renamed from: com.pd.sdk.l丨iLi$OooO00o */
    public class OooO00o extends InputStream {
        public OooO00o() {
        }

        @Override // java.io.InputStream
        public int read() throws IOException {
            return -1;
        }
    }

    /* renamed from: com.pd.sdk.l丨iLi$OooO0O0 */
    public class OooO0O0 extends InputStream {

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ InputStream f18934OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ Long f18935OooO00o;

        public OooO0O0(InputStream inputStream, Long l) {
            this.f18934OooO00o = inputStream;
            this.f18935OooO00o = l;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable, java.io.InputStream
        public void close() throws IOException {
            if (C6860liLi.this.f18929OooO00o != null && C6860liLi.this.f18929OooO00o.longValue() - 1 > C6860liLi.this.f18925OooO00o) {
                throw new IOException("Stream closed before limit fully read, Read: " + C6860liLi.this.f18925OooO00o + " ContentLength: " + C6860liLi.this.f18929OooO00o);
            } else if (this.f18934OooO00o.available() <= 0) {
                this.f18934OooO00o.close();
            } else {
                throw new IOException("Stream closed with extra content in pipe that exceeds content length.");
            }
        }

        @Override // java.io.InputStream
        public int read() throws IOException {
            int read = this.f18934OooO00o.read();
            if (read > -1) {
                C6860liLi.OooO0O0(C6860liLi.this);
                if (this.f18935OooO00o != null && C6860liLi.this.f18925OooO00o >= this.f18935OooO00o.longValue()) {
                    throw new IOException("Absolute Read Limit exceeded: " + this.f18935OooO00o);
                }
            }
            return read;
        }
    }

    /* renamed from: com.pd.sdk.l丨iLi$OooO0OO */
    public class OooO0OO extends InputStream {

        /* renamed from: OooO00o  reason: collision with other field name */
        public final InputStream f18936OooO00o;

        public OooO0OO(InputStream inputStream) {
            this.f18936OooO00o = inputStream;
        }

        public /* synthetic */ OooO0OO(C6860liLi r1, InputStream inputStream, OooO00o oooO00o) {
            this(inputStream);
        }

        @Override // java.io.InputStream
        public int available() throws IOException {
            return this.f18936OooO00o.available();
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable, java.io.InputStream
        public void close() throws IOException {
            this.f18936OooO00o.close();
        }

        @Override // java.io.InputStream
        public int read() throws IOException {
            int read = this.f18936OooO00o.read();
            System.out.print(String.valueOf((char) read));
            return read;
        }
    }

    public C6860liLi(C6773llLi r3, C111 r4) throws IOException {
        this.f18926OooO00o = r3;
        this.f18927OooO00o = r4;
        if (r4 instanceof AbstractC6007i11i) {
            this.OooO0O0 = ((AbstractC6007i11i) r4).OooO00o();
        }
        Set<String> OooO00o2 = C9358II1.m21421OooO00o("org.bouncycastle.debug.est");
        this.f18928OooO00o = (OooO00o2.contains("input") || OooO00o2.contains("all")) ? new OooO0OO(this, r4.OooO00o(), null) : r4.OooO00o();
        this.f18931OooO00o = new HttpUtil.Headers();
        this.f18932OooO00o = new byte[1024];
        OooO0O0();
    }

    public static /* synthetic */ long OooO0O0(C6860liLi r4) {
        long j = r4.f18925OooO00o;
        r4.f18925OooO00o = 1 + j;
        return j;
    }

    private void OooO0O0() throws IOException {
        this.f18930OooO00o = OooO00o(' ');
        this.OooO00o = Integer.parseInt(OooO00o(' '));
        this.f18933OooO0O0 = OooO00o('\n');
        while (true) {
            String OooO00o2 = OooO00o('\n');
            if (OooO00o2.length() <= 0) {
                break;
            }
            int indexOf = OooO00o2.indexOf(58);
            if (indexOf > -1) {
                this.f18931OooO00o.add(Strings.OooO00o(OooO00o2.substring(0, indexOf).trim()), OooO00o2.substring(indexOf + 1).trim());
            }
        }
        this.f18929OooO00o = m18010OooO00o();
        int i = this.OooO00o;
        if (i == 204 || i == 202) {
            Long l = this.f18929OooO00o;
            if (l == null) {
                this.f18929OooO00o = 0L;
            } else if (this.OooO00o == 204 && l.longValue() > 0) {
                throw new IOException("Got HTTP status 204 but Content-length > 0.");
            }
        }
        Long l2 = this.f18929OooO00o;
        if (l2 != null) {
            if (l2.equals(OooO0OO)) {
                this.f18928OooO00o = new OooO00o();
            }
            Long l3 = this.f18929OooO00o;
            if (l3 != null) {
                if (l3.longValue() < 0) {
                    throw new IOException("Server returned negative content length: " + this.OooO0O0);
                } else if (this.OooO0O0 != null && this.f18929OooO00o.longValue() >= this.OooO0O0.longValue()) {
                    throw new IOException("Content length longer than absolute read limit: " + this.OooO0O0 + " Content-Length: " + this.f18929OooO00o);
                }
            }
            this.f18928OooO00o = OooO00o(this.f18928OooO00o, this.OooO0O0);
            if ("base64".equalsIgnoreCase(OooO00o("content-transfer-encoding"))) {
                this.f18928OooO00o = new C5574L11I(this.f18928OooO00o, m18010OooO00o());
                return;
            }
            return;
        }
        throw new IOException("No Content-length header.");
    }

    public int OooO00o() {
        return this.OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C6773llLi m18007OooO00o() {
        return this.f18926OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C111 m18008OooO00o() {
        return this.f18927OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public InputStream m18009OooO00o() {
        return this.f18928OooO00o;
    }

    public InputStream OooO00o(InputStream inputStream, Long l) {
        return new OooO0O0(inputStream, l);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public Long m18010OooO00o() {
        String firstValue = this.f18931OooO00o.getFirstValue("Content-Length");
        if (firstValue == null) {
            return null;
        }
        try {
            return Long.valueOf(Long.parseLong(firstValue));
        } catch (RuntimeException e) {
            throw new RuntimeException("Content Length: '" + firstValue + "' invalid. " + e.getMessage());
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public String m18011OooO00o() {
        return this.f18930OooO00o;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x001c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String OooO00o(char r7) throws java.io.IOException {
        /*
            r6 = this;
            r0 = 0
            r1 = 0
        L_0x0002:
            java.io.InputStream r2 = r6.f18928OooO00o
            int r2 = r2.read()
            byte[] r3 = r6.f18932OooO00o
            int r4 = r1 + 1
            byte r5 = (byte) r2
            r3[r1] = r5
            int r1 = r3.length
            if (r4 >= r1) goto L_0x002e
            r1 = -1
            if (r2 == r7) goto L_0x001a
            if (r2 > r1) goto L_0x0018
            goto L_0x001a
        L_0x0018:
            r1 = r4
            goto L_0x0002
        L_0x001a:
            if (r2 == r1) goto L_0x0028
            java.lang.String r7 = new java.lang.String
            byte[] r1 = r6.f18932OooO00o
            r7.<init>(r1, r0, r4)
            java.lang.String r7 = r7.trim()
            return r7
        L_0x0028:
            java.io.EOFException r7 = new java.io.EOFException
            r7.<init>()
            throw r7
        L_0x002e:
            java.io.IOException r7 = new java.io.IOException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Server sent line > "
            r0.append(r1)
            byte[] r1 = r6.f18932OooO00o
            int r1 = r1.length
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r7.<init>(r0)
            goto L_0x0049
        L_0x0048:
            throw r7
        L_0x0049:
            goto L_0x0048
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p118pd.sdk.C6860liLi.OooO00o(char):java.lang.String");
    }

    public String OooO00o(String str) {
        return this.f18931OooO00o.getFirstValue(str);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public HttpUtil.Headers m18012OooO00o() {
        return this.f18931OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m18013OooO00o() throws IOException {
        InputStream inputStream = this.f18928OooO00o;
        if (inputStream != null) {
            inputStream.close();
        }
        this.f18927OooO00o.close();
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public String m18014OooO0O0() {
        return this.f18933OooO0O0;
    }
}

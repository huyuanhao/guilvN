package com.xiaomi.push;

import android.text.TextUtils;
import com.xiaomi.channel.commonutils.logger.AbstractC4163b;
import com.xiaomi.push.C4387em;
import com.xiaomi.push.service.C4611am;
import java.io.BufferedInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.zip.Adler32;

/* renamed from: com.xiaomi.push.fo */
public class C4429fo {

    /* renamed from: a */
    public C4431fq f11934a;

    /* renamed from: a */
    public C4433fs f11935a;

    /* renamed from: a */
    public InputStream f11936a;

    /* renamed from: a */
    public ByteBuffer f11937a = ByteBuffer.allocate(2048);

    /* renamed from: a */
    public Adler32 f11938a = new Adler32();

    /* renamed from: a */
    public volatile boolean f11939a;

    /* renamed from: a */
    public byte[] f11940a;

    /* renamed from: b */
    public ByteBuffer f11941b = ByteBuffer.allocate(4);

    public C4429fo(InputStream inputStream, C4433fs fsVar) {
        this.f11936a = new BufferedInputStream(inputStream);
        this.f11935a = fsVar;
        this.f11934a = new C4431fq();
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x00be  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x00cf  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.nio.ByteBuffer mo41880a() {
        /*
        // Method dump skipped, instructions count: 268
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.C4429fo.mo41880a():java.nio.ByteBuffer");
    }

    /* renamed from: a */
    private void m12620a(ByteBuffer byteBuffer, int i) {
        int position = byteBuffer.position();
        do {
            int read = this.f11936a.read(byteBuffer.array(), position, i);
            if (read != -1) {
                i -= read;
                position += read;
            } else {
                throw new EOFException();
            }
        } while (i > 0);
        byteBuffer.position(position);
    }

    /* renamed from: c */
    private void m12621c() {
        C4428fn a;
        StringBuilder sb;
        String sb2;
        boolean z = false;
        this.f11939a = false;
        C4428fn a2 = m12622a();
        if ("CONN".equals(a2.m12598a())) {
            C4387em.C4393f a3 = C4387em.C4393f.m12353a(a2.m12608a());
            if (a3.m12362a()) {
                this.f11935a.mo41900a(a3.m12360a());
                z = true;
            }
            if (a3.mo41764c()) {
                C4387em.C4389b a4 = a3.m12356a();
                C4428fn fnVar = new C4428fn();
                fnVar.mo41869a("SYNC", "CONF");
                fnVar.mo41871a(a4.m12147a(), (String) null);
                this.f11935a.mo41888a(fnVar);
            }
            AbstractC4163b.m11301a("[Slim] CONN: host = " + a3.m12365b());
        }
        if (z) {
            this.f11940a = this.f11935a.m12643a();
            while (!this.f11939a) {
                a = m12622a();
                this.f11935a.mo41907c();
                short a5 = a.m12600a();
                if (a5 != 1) {
                    if (a5 != 2) {
                        if (a5 != 3) {
                            sb2 = "[Slim] unknow blob type " + ((int) a.m12600a());
                        } else {
                            try {
                                this.f11935a.mo41895b(this.f11934a.mo41885a(a.m12608a(), this.f11935a));
                            } catch (Exception e) {
                                e = e;
                                sb = new StringBuilder();
                            }
                        }
                    } else if ("SECMSG".equals(a.m12598a()) && ((a.mo41864a() == 2 || a.mo41864a() == 3) && TextUtils.isEmpty(a.m12611b()))) {
                        try {
                            this.f11935a.mo41895b(this.f11934a.mo41885a(a.m12609a(C4611am.mo42670a().mo42671a(Integer.valueOf(a.mo41864a()).toString(), a.mo41878g()).f13195h), this.f11935a));
                        } catch (Exception e2) {
                            e = e2;
                            sb = new StringBuilder();
                        }
                    }
                    AbstractC4163b.m11301a(sb2);
                }
                this.f11935a.mo41888a(a);
            }
            return;
        }
        AbstractC4163b.m11301a("[Slim] Invalid CONN");
        throw new IOException("Invalid Connection");
        sb.append("[Slim] Parse packet from Blob chid=");
        sb.append(a.mo41864a());
        sb.append("; Id=");
        sb.append(a.mo41876e());
        sb.append(" failure:");
        sb.append(e.getMessage());
        sb2 = sb.toString();
        AbstractC4163b.m11301a(sb2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0073  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.xiaomi.push.C4428fn m12622a() {
        /*
        // Method dump skipped, instructions count: 144
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.C4429fo.m12622a():com.xiaomi.push.fn");
    }

    /* renamed from: a */
    public void m12623a() {
        try {
            m12621c();
        } catch (IOException e) {
            if (!this.f11939a) {
                throw e;
            }
        }
    }

    /* renamed from: b */
    public void mo41881b() {
        this.f11939a = true;
    }
}

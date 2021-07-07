package com.xiaomi.push;

import android.os.Build;
import com.p118pd.sdk.C7522o0Ooo0o;
import com.xiaomi.channel.commonutils.logger.AbstractC4163b;
import com.xiaomi.mipush.sdk.Constants;
import com.xiaomi.push.C4387em;
import com.xiaomi.push.service.C4628av;
import com.xiaomi.push.service.C4635bb;
import java.io.BufferedOutputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.util.Locale;
import java.util.TimeZone;
import java.util.zip.Adler32;

/* renamed from: com.xiaomi.push.fp */
public class C4430fp {

    /* renamed from: a */
    public int f11942a;

    /* renamed from: a */
    public C4433fs f11943a;

    /* renamed from: a */
    public OutputStream f11944a;

    /* renamed from: a */
    public ByteBuffer f11945a = ByteBuffer.allocate(2048);

    /* renamed from: a */
    public Adler32 f11946a = new Adler32();

    /* renamed from: a */
    public byte[] f11947a;

    /* renamed from: b */
    public int f11948b;

    /* renamed from: b */
    public ByteBuffer f11949b = ByteBuffer.allocate(4);

    public C4430fp(OutputStream outputStream, C4433fs fsVar) {
        this.f11944a = new BufferedOutputStream(outputStream);
        this.f11943a = fsVar;
        TimeZone timeZone = TimeZone.getDefault();
        this.f11942a = timeZone.getRawOffset() / 3600000;
        this.f11948b = timeZone.useDaylightTime() ? 1 : 0;
    }

    /* renamed from: a */
    public int mo41882a(C4428fn fnVar) {
        int c = fnVar.mo41874c();
        if (c > 32768) {
            AbstractC4163b.m11301a("Blob size=" + c + " should be less than " + 32768 + " Drop blob chid=" + fnVar.mo41864a() + " id=" + fnVar.mo41876e());
            return 0;
        }
        this.f11945a.clear();
        int i = c + 8 + 4;
        if (i > this.f11945a.capacity() || this.f11945a.capacity() > 4096) {
            this.f11945a = ByteBuffer.allocate(i);
        }
        this.f11945a.putShort(-15618);
        this.f11945a.putShort(5);
        this.f11945a.putInt(c);
        int position = this.f11945a.position();
        this.f11945a = fnVar.m12599a(this.f11945a);
        if (!"CONN".equals(fnVar.m12598a())) {
            if (this.f11947a == null) {
                this.f11947a = this.f11943a.m12643a();
            }
            C4628av.m14007a(this.f11947a, this.f11945a.array(), true, position, c);
        }
        this.f11946a.reset();
        this.f11946a.update(this.f11945a.array(), 0, this.f11945a.position());
        this.f11949b.putInt(0, (int) this.f11946a.getValue());
        this.f11944a.write(this.f11945a.array(), 0, this.f11945a.position());
        this.f11944a.write(this.f11949b.array(), 0, 4);
        this.f11944a.flush();
        int position2 = this.f11945a.position() + 4;
        AbstractC4163b.m11305c("[Slim] Wrote {cmd=" + fnVar.m12598a() + ";chid=" + fnVar.mo41864a() + ";len=" + position2 + C7522o0Ooo0o.OooO0Oo);
        return position2;
    }

    /* renamed from: a */
    public void mo41883a() {
        C4387em.C4392e eVar = new C4387em.C4392e();
        eVar.mo41743a(106);
        eVar.mo41745a(Build.MODEL);
        eVar.mo41747b(C4688t.m14220a());
        eVar.mo41750c(C4635bb.m14028a());
        eVar.mo41746b(38);
        eVar.mo41752d(this.f11943a.m12663b());
        eVar.mo41754e(this.f11943a.mo41886a());
        eVar.mo41755f(Locale.getDefault().toString());
        eVar.mo41749c(Build.VERSION.SDK_INT);
        byte[] a = this.f11943a.m12650a().m12684a();
        if (a != null) {
            eVar.mo41744a(C4387em.C4389b.m12259a(a));
        }
        C4428fn fnVar = new C4428fn();
        fnVar.mo41866a(0);
        fnVar.mo41869a("CONN", (String) null);
        fnVar.mo41867a(0, "xiaomi.com", null);
        fnVar.mo41871a(eVar.m12147a(), (String) null);
        mo41882a(fnVar);
        AbstractC4163b.m11301a("[slim] open conn: andver=" + Build.VERSION.SDK_INT + " sdk=" + 38 + " hash=" + C4635bb.m14028a() + " tz=" + this.f11942a + Constants.COLON_SEPARATOR + this.f11948b + " Model=" + Build.MODEL + " os=" + Build.VERSION.INCREMENTAL);
    }

    /* renamed from: b */
    public void mo41884b() {
        C4428fn fnVar = new C4428fn();
        fnVar.mo41869a("CLOSE", (String) null);
        mo41882a(fnVar);
        this.f11944a.close();
    }
}

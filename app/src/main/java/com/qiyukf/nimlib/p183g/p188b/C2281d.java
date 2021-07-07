package com.qiyukf.nimlib.p183g.p188b;

import android.content.Context;
import com.p118pd.sdk.O0O00O;
import com.qiyukf.basesdk.p119a.C1709a;
import com.qiyukf.nimlib.p155a.p162c.AbstractC2131a;
import com.qiyukf.nimlib.p155a.p168d.AbstractC2148a;
import com.qiyukf.nimlib.p183g.p184a.p186b.C2253a;
import com.qiyukf.nimlib.p183g.p184a.p187c.C2258a;
import com.qiyukf.nimlib.p183g.p191c.C2289a;
import com.qiyukf.nimlib.p183g.p191c.p192a.C2290a;
import com.qiyukf.nimlib.p183g.p191c.p192a.C2291b;
import com.qiyukf.nimlib.p183g.p191c.p194c.C2295b;
import com.qiyukf.nimlib.p183g.p191c.p194c.C2297d;
import com.qiyukf.nimlib.p183g.p191c.p194c.C2298e;
import com.qiyukf.nimlib.p183g.p191c.p194c.C2299f;
import com.qiyukf.nimlib.p183g.p191c.p194c.C2300g;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.util.zip.Deflater;

/* renamed from: com.qiyukf.nimlib.g.b.d */
public final class C2281d {

    /* renamed from: a */
    public Context f4553a;

    /* renamed from: b */
    public AbstractC2283b f4554b;

    /* renamed from: c */
    public boolean f4555c;

    /* renamed from: d */
    public AbstractC2131a.C2132a f4556d;

    /* renamed from: e */
    public C2265a f4557e;

    /* renamed from: f */
    public C2284c f4558f;

    /* renamed from: g */
    public C2285d f4559g;

    /* renamed from: com.qiyukf.nimlib.g.b.d$a */
    public class C2282a {

        /* renamed from: b */
        public final byte[] f4561b;

        /* renamed from: c */
        public final C2290a f4562c;

        /* renamed from: d */
        public final C2290a f4563d = new C2290a(this.f4561b);

        public C2282a() {
            byte[] bArr = new byte[16];
            new SecureRandom(SecureRandom.getSeed(32)).nextBytes(bArr);
            this.f4561b = bArr;
            this.f4562c = new C2290a(bArr);
        }

        /* renamed from: a */
        public static /* synthetic */ void m4830a(C2282a aVar, C2295b bVar) {
            aVar.f4562c.mo34952a(bVar.mo34972b().array(), 0, bVar.mo34959a());
        }

        /* renamed from: a */
        public final void mo34925a(byte[] bArr, int i, int i2) {
            this.f4563d.mo34952a(bArr, i, i2);
        }
    }

    /* renamed from: com.qiyukf.nimlib.g.b.d$b */
    public interface AbstractC2283b {
        /* renamed from: a */
        void mo34908a();

        /* renamed from: a */
        void mo34909a(AbstractC2131a.C2132a aVar, boolean z);
    }

    /* renamed from: com.qiyukf.nimlib.g.b.d$c */
    public class C2284c {

        /* renamed from: b */
        public final C2282a f4565b;

        /* renamed from: c */
        public final PublicKey f4566c;

        public C2284c(C2282a aVar, PublicKey publicKey) {
            this.f4565b = aVar;
            this.f4566c = publicKey;
        }

        /* renamed from: a */
        public final AbstractC2131a.C2132a mo34926a(AbstractC2131a.C2132a aVar) {
            byte[] bArr;
            if (aVar == null) {
                bArr = null;
            } else {
                C2295b bVar = new C2295b();
                bVar.mo34971b(this.f4565b.f4561b);
                bVar.mo34965a(C2281d.m4824a(aVar, false).mo34972b());
                bArr = C2291b.m4867a(this.f4566c, bVar.mo34972b().array(), 0, bVar.mo34959a());
            }
            C2253a aVar2 = new C2253a(C2281d.this.f4557e.f4511a, bArr);
            return new AbstractC2131a.C2132a(aVar2.mo34667a(), aVar2.mo34669b().mo34972b());
        }

        /* renamed from: a */
        public final C2295b mo34927a(AbstractC2131a.C2132a aVar, boolean z) {
            C2295b a = C2281d.m4824a(aVar, true);
            C1709a.m3011a("core", "send " + aVar.f4285a);
            if (!z) {
                C2282a.m4830a(this.f4565b, a);
            }
            return a;
        }
    }

    /* renamed from: com.qiyukf.nimlib.g.b.d$d */
    public class C2285d {

        /* renamed from: b */
        public final C2282a f4568b;

        /* renamed from: c */
        public final byte[] f4569c = new byte[4];

        /* renamed from: d */
        public int f4570d;

        public C2285d(C2282a aVar) {
            this.f4568b = aVar;
            this.f4570d = -1;
        }

        /* renamed from: a */
        public final void mo34928a() {
            this.f4570d = -1;
        }

        /* renamed from: a */
        public final byte[] mo34929a(ByteBuffer byteBuffer) {
            byte b;
            if (this.f4570d <= 5) {
                if (byteBuffer.remaining() < 4) {
                    return null;
                }
                byteBuffer.get(this.f4569c);
                this.f4568b.mo34925a(this.f4569c, 0, 4);
                byte[] bArr = this.f4569c;
                int i = 0;
                int i2 = 0;
                int i3 = 1;
                do {
                    b = bArr[i];
                    i2 += (b & O0O00O.OooO0O0) * i3;
                    i3 <<= 7;
                    i++;
                } while ((b & O0O00O.OooO00o) != 0);
                this.f4570d = i2;
                if (i2 > 5) {
                    this.f4570d = i2 + C2297d.m4896b(i2);
                } else {
                    this.f4570d = -1;
                    throw new C2300g();
                }
            }
            C1709a.m3014b("core", String.format("received packetSize: %d, readableBytes: %d", Integer.valueOf(this.f4570d), Integer.valueOf(byteBuffer.remaining())));
            int i4 = this.f4570d - 4;
            if (byteBuffer.remaining() < i4) {
                return null;
            }
            byte[] bArr2 = new byte[this.f4570d];
            System.arraycopy(this.f4569c, 0, bArr2, 0, 4);
            byteBuffer.get(bArr2, 4, i4);
            this.f4568b.mo34925a(bArr2, 4, i4);
            this.f4570d = -1;
            return bArr2;
        }
    }

    public C2281d(Context context, AbstractC2283b bVar) {
        this.f4553a = context.getApplicationContext();
        this.f4554b = bVar;
        m4825c();
    }

    /* renamed from: a */
    public static /* synthetic */ C2295b m4824a(AbstractC2131a.C2132a aVar, boolean z) {
        C2295b bVar = new C2295b();
        int limit = aVar.f4286b.limit();
        ByteBuffer byteBuffer = aVar.f4286b;
        if (z && limit >= 1024 && !aVar.f4285a.mo34942c()) {
            ByteBuffer byteBuffer2 = aVar.f4286b;
            byte[] array = byteBuffer2.array();
            int position = byteBuffer2.position();
            int limit2 = byteBuffer2.limit() - byteBuffer2.position();
            byte[] bArr = new byte[(limit2 + 4 + (limit2 / 1000) + 12)];
            Deflater deflater = new Deflater();
            deflater.setInput(array, position, limit2);
            deflater.finish();
            int deflate = deflater.deflate(bArr);
            deflater.end();
            byteBuffer = ByteBuffer.allocate(deflate + 4);
            byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
            byteBuffer.putInt(limit2);
            byteBuffer.put(bArr, 0, deflate);
            byteBuffer.flip();
            limit = byteBuffer.limit();
            aVar.f4285a.mo34944e();
        }
        C2289a aVar2 = aVar.f4285a;
        int i = 5;
        if (aVar2.mo34943d()) {
            i = 7;
        }
        aVar2.mo34936a(i + limit);
        bVar.mo34963a(aVar.f4285a);
        bVar.mo34965a(byteBuffer);
        return bVar;
    }

    /* renamed from: c */
    private void m4825c() {
        this.f4557e = C2265a.m4763a(this.f4553a);
        this.f4558f = null;
        this.f4559g = null;
        this.f4555c = false;
    }

    /* renamed from: a */
    public final AbstractC2148a.C2149a mo34921a(ByteBuffer byteBuffer) {
        byte[] a;
        C2285d dVar = this.f4559g;
        if (dVar == null || (a = dVar.mo34929a(byteBuffer)) == null) {
            return null;
        }
        C2299f fVar = new C2299f(a);
        C2289a aVar = new C2289a();
        fVar.mo34975a(aVar);
        C1709a.m3011a("core", "received " + aVar);
        if (aVar.mo34942c()) {
            C2299f fVar2 = new C2299f(C2298e.m4897a(fVar));
            aVar.mo34945f();
            fVar = fVar2;
        }
        AbstractC2148a.C2149a aVar2 = new AbstractC2148a.C2149a();
        aVar2.f4312a = aVar;
        aVar2.f4313b = fVar;
        if (aVar.mo34946g() == 1 && aVar2.f4312a.mo34947h() == 1) {
            C2258a aVar3 = new C2258a();
            aVar3.mo34689a(aVar2.f4312a);
            short e = aVar3.mo34693e();
            if (e == 201) {
                try {
                    aVar3.mo34642a(aVar2.f4313b);
                    C2265a.m4766a(aVar3.mo34882f(), aVar3.mo34883g(), aVar3.mo34884h());
                    m4825c();
                    C1709a.m3011a("core", "public key updated to: " + aVar3.mo34882f());
                    if (this.f4554b != null) {
                        this.f4554b.mo34909a(this.f4556d, true);
                    }
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            } else if (e != 200) {
                C1709a.m3011a("core", "Handshake fail[code=" + ((int) aVar3.mo34688a().mo34949j()) + "]");
                C2265a.m4765a();
                if (this.f4554b != null) {
                    this.f4554b.mo34908a();
                }
            } else if (this.f4554b != null) {
                this.f4554b.mo34909a(this.f4556d, false);
            }
            this.f4556d = null;
            return null;
        } else if (aVar2.f4312a.mo34948i() >= 0 && aVar2.f4312a.mo34950k() >= 0) {
            return aVar2;
        } else {
            throw new C2300g("invalid headers, connection may be corrupted");
        }
    }

    /* renamed from: a */
    public final C2295b mo34922a(AbstractC2131a.C2132a aVar) {
        if (this.f4555c) {
            return this.f4558f.mo34927a(aVar, false);
        }
        this.f4555c = true;
        this.f4556d = aVar;
        return this.f4558f.mo34927a(this.f4558f.mo34926a(aVar), true);
    }

    /* renamed from: a */
    public final void mo34923a() {
        C2282a aVar = new C2282a();
        this.f4558f = new C2284c(aVar, this.f4557e.f4512b);
        this.f4559g = new C2285d(aVar);
        this.f4555c = false;
    }

    /* renamed from: b */
    public final void mo34924b() {
        C2285d dVar = this.f4559g;
        if (dVar != null) {
            dVar.mo34928a();
        }
    }
}

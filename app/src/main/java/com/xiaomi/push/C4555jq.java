package com.xiaomi.push;

import com.xiaomi.push.C4544jg;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;

/* renamed from: com.xiaomi.push.jq */
public class C4555jq extends C4544jg {

    /* renamed from: b */
    public static int f13033b = 10000;

    /* renamed from: c */
    public static int f13034c = 10000;

    /* renamed from: d */
    public static int f13035d = 10000;

    /* renamed from: e */
    public static int f13036e = 10485760;

    /* renamed from: f */
    public static int f13037f = 104857600;

    /* renamed from: com.xiaomi.push.jq$a */
    public static class C4556a extends C4544jg.C4545a {
        public C4556a() {
            super(false, true);
        }

        public C4556a(boolean z, boolean z2, int i) {
            super(z, z2, i);
        }

        @Override // com.xiaomi.push.C4544jg.C4545a, com.xiaomi.push.AbstractC4551jm
        /* renamed from: a */
        public AbstractC4549jk mo42592a(AbstractC4560ju juVar) {
            C4555jq jqVar = new C4555jq(juVar, ((C4544jg.C4545a) this).f13017a, this.f13018b);
            int i = ((C4544jg.C4545a) this).f13016a;
            if (i != 0) {
                jqVar.mo42582b(i);
            }
            return jqVar;
        }
    }

    public C4555jq(AbstractC4560ju juVar, boolean z, boolean z2) {
        super(juVar, z, z2);
    }

    @Override // com.xiaomi.push.C4544jg, com.xiaomi.push.C4544jg, com.xiaomi.push.C4544jg, com.xiaomi.push.C4544jg, com.xiaomi.push.C4544jg, com.xiaomi.push.C4544jg, com.xiaomi.push.C4544jg, com.xiaomi.push.C4544jg, com.xiaomi.push.C4544jg, com.xiaomi.push.C4544jg, com.xiaomi.push.C4544jg, com.xiaomi.push.C4544jg, com.xiaomi.push.C4544jg, com.xiaomi.push.C4544jg, com.xiaomi.push.AbstractC4549jk, com.xiaomi.push.AbstractC4549jk, com.xiaomi.push.AbstractC4549jk, com.xiaomi.push.AbstractC4549jk, com.xiaomi.push.AbstractC4549jk, com.xiaomi.push.AbstractC4549jk, com.xiaomi.push.AbstractC4549jk, com.xiaomi.push.AbstractC4549jk, com.xiaomi.push.AbstractC4549jk, com.xiaomi.push.AbstractC4549jk, com.xiaomi.push.AbstractC4549jk, com.xiaomi.push.AbstractC4549jk, com.xiaomi.push.AbstractC4549jk, com.xiaomi.push.AbstractC4549jk
    /* renamed from: a */
    public C4547ji mo42569a() {
        byte a = mo42569a();
        int a2 = m13621a();
        if (a2 <= f13034c) {
            return new C4547ji(a, a2);
        }
        throw new C4550jl(3, "Thrift list size " + a2 + " out of range!");
    }

    @Override // com.xiaomi.push.C4544jg, com.xiaomi.push.C4544jg, com.xiaomi.push.C4544jg, com.xiaomi.push.C4544jg, com.xiaomi.push.C4544jg, com.xiaomi.push.C4544jg, com.xiaomi.push.C4544jg, com.xiaomi.push.C4544jg, com.xiaomi.push.C4544jg, com.xiaomi.push.C4544jg, com.xiaomi.push.C4544jg, com.xiaomi.push.C4544jg, com.xiaomi.push.C4544jg, com.xiaomi.push.C4544jg, com.xiaomi.push.AbstractC4549jk, com.xiaomi.push.AbstractC4549jk, com.xiaomi.push.AbstractC4549jk, com.xiaomi.push.AbstractC4549jk, com.xiaomi.push.AbstractC4549jk, com.xiaomi.push.AbstractC4549jk, com.xiaomi.push.AbstractC4549jk, com.xiaomi.push.AbstractC4549jk, com.xiaomi.push.AbstractC4549jk, com.xiaomi.push.AbstractC4549jk, com.xiaomi.push.AbstractC4549jk, com.xiaomi.push.AbstractC4549jk, com.xiaomi.push.AbstractC4549jk, com.xiaomi.push.AbstractC4549jk
    /* renamed from: a */
    public C4548jj m13696a() {
        byte a = mo42569a();
        byte a2 = mo42569a();
        int a3 = m13621a();
        if (a3 <= f13033b) {
            return new C4548jj(a, a2, a3);
        }
        throw new C4550jl(3, "Thrift map size " + a3 + " out of range!");
    }

    @Override // com.xiaomi.push.C4544jg, com.xiaomi.push.C4544jg, com.xiaomi.push.C4544jg, com.xiaomi.push.C4544jg, com.xiaomi.push.C4544jg, com.xiaomi.push.C4544jg, com.xiaomi.push.C4544jg, com.xiaomi.push.C4544jg, com.xiaomi.push.C4544jg, com.xiaomi.push.C4544jg, com.xiaomi.push.C4544jg, com.xiaomi.push.C4544jg, com.xiaomi.push.C4544jg, com.xiaomi.push.C4544jg, com.xiaomi.push.AbstractC4549jk, com.xiaomi.push.AbstractC4549jk, com.xiaomi.push.AbstractC4549jk, com.xiaomi.push.AbstractC4549jk, com.xiaomi.push.AbstractC4549jk, com.xiaomi.push.AbstractC4549jk, com.xiaomi.push.AbstractC4549jk, com.xiaomi.push.AbstractC4549jk, com.xiaomi.push.AbstractC4549jk, com.xiaomi.push.AbstractC4549jk, com.xiaomi.push.AbstractC4549jk, com.xiaomi.push.AbstractC4549jk, com.xiaomi.push.AbstractC4549jk, com.xiaomi.push.AbstractC4549jk
    /* renamed from: a */
    public C4553jo m13697a() {
        byte a = mo42569a();
        int a2 = m13621a();
        if (a2 <= f13035d) {
            return new C4553jo(a, a2);
        }
        throw new C4550jl(3, "Thrift set size " + a2 + " out of range!");
    }

    @Override // com.xiaomi.push.C4544jg, com.xiaomi.push.C4544jg, com.xiaomi.push.C4544jg, com.xiaomi.push.C4544jg, com.xiaomi.push.C4544jg, com.xiaomi.push.C4544jg, com.xiaomi.push.C4544jg, com.xiaomi.push.C4544jg, com.xiaomi.push.C4544jg, com.xiaomi.push.C4544jg, com.xiaomi.push.C4544jg, com.xiaomi.push.C4544jg, com.xiaomi.push.C4544jg, com.xiaomi.push.C4544jg, com.xiaomi.push.AbstractC4549jk, com.xiaomi.push.AbstractC4549jk, com.xiaomi.push.AbstractC4549jk, com.xiaomi.push.AbstractC4549jk, com.xiaomi.push.AbstractC4549jk, com.xiaomi.push.AbstractC4549jk, com.xiaomi.push.AbstractC4549jk, com.xiaomi.push.AbstractC4549jk, com.xiaomi.push.AbstractC4549jk, com.xiaomi.push.AbstractC4549jk, com.xiaomi.push.AbstractC4549jk, com.xiaomi.push.AbstractC4549jk, com.xiaomi.push.AbstractC4549jk, com.xiaomi.push.AbstractC4549jk
    /* renamed from: a */
    public String m13698a() {
        int a = m13621a();
        if (a > f13036e) {
            throw new C4550jl(3, "Thrift string size " + a + " out of range!");
        } else if (((AbstractC4549jk) this).f13027a.mo42600b() < a) {
            return mo42570a(a);
        } else {
            try {
                String str = new String(((AbstractC4549jk) this).f13027a.m13718a(), ((AbstractC4549jk) this).f13027a.mo42597a(), a, "UTF-8");
                ((AbstractC4549jk) this).f13027a.mo42598a(a);
                return str;
            } catch (UnsupportedEncodingException unused) {
                throw new C4542je("JVM DOES NOT SUPPORT UTF-8");
            }
        }
    }

    @Override // com.xiaomi.push.C4544jg, com.xiaomi.push.C4544jg, com.xiaomi.push.C4544jg, com.xiaomi.push.C4544jg, com.xiaomi.push.C4544jg, com.xiaomi.push.C4544jg, com.xiaomi.push.C4544jg, com.xiaomi.push.C4544jg, com.xiaomi.push.C4544jg, com.xiaomi.push.C4544jg, com.xiaomi.push.C4544jg, com.xiaomi.push.C4544jg, com.xiaomi.push.C4544jg, com.xiaomi.push.C4544jg, com.xiaomi.push.AbstractC4549jk, com.xiaomi.push.AbstractC4549jk, com.xiaomi.push.AbstractC4549jk, com.xiaomi.push.AbstractC4549jk, com.xiaomi.push.AbstractC4549jk, com.xiaomi.push.AbstractC4549jk, com.xiaomi.push.AbstractC4549jk, com.xiaomi.push.AbstractC4549jk, com.xiaomi.push.AbstractC4549jk, com.xiaomi.push.AbstractC4549jk, com.xiaomi.push.AbstractC4549jk, com.xiaomi.push.AbstractC4549jk, com.xiaomi.push.AbstractC4549jk, com.xiaomi.push.AbstractC4549jk
    /* renamed from: a */
    public ByteBuffer m13699a() {
        int a = m13621a();
        if (a <= f13037f) {
            mo42584c(a);
            if (((AbstractC4549jk) this).f13027a.mo42600b() >= a) {
                ByteBuffer wrap = ByteBuffer.wrap(((AbstractC4549jk) this).f13027a.m13718a(), ((AbstractC4549jk) this).f13027a.mo42597a(), a);
                ((AbstractC4549jk) this).f13027a.mo42598a(a);
                return wrap;
            }
            byte[] bArr = new byte[a];
            ((AbstractC4549jk) this).f13027a.mo42601b(bArr, 0, a);
            return ByteBuffer.wrap(bArr);
        }
        throw new C4550jl(3, "Thrift binary size " + a + " out of range!");
    }
}

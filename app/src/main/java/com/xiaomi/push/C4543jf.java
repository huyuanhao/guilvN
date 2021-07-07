package com.xiaomi.push;

import com.xiaomi.push.C4544jg;
import java.io.ByteArrayOutputStream;

/* renamed from: com.xiaomi.push.jf */
public class C4543jf {

    /* renamed from: a */
    public AbstractC4549jk f13000a;

    /* renamed from: a */
    public final C4557jr f13001a;

    /* renamed from: a */
    public final ByteArrayOutputStream f13002a;

    public C4543jf() {
        this(new C4544jg.C4545a());
    }

    public C4543jf(AbstractC4551jm jmVar) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        this.f13002a = byteArrayOutputStream;
        C4557jr jrVar = new C4557jr(byteArrayOutputStream);
        this.f13001a = jrVar;
        this.f13000a = jmVar.mo42592a(jrVar);
    }

    /* renamed from: a */
    public byte[] mo42568a(AbstractC4532iz izVar) {
        this.f13002a.reset();
        izVar.mo41832b(this.f13000a);
        return this.f13002a.toByteArray();
    }
}

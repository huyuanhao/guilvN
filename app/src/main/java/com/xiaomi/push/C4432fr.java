package com.xiaomi.push;

import java.nio.ByteBuffer;

/* renamed from: com.xiaomi.push.fr */
public final class C4432fr extends C4428fn {
    public C4432fr() {
        mo41869a("PING", (String) null);
        mo41868a("0");
        mo41866a(0);
    }

    @Override // com.xiaomi.push.C4428fn
    /* renamed from: a */
    public ByteBuffer mo41865a(ByteBuffer byteBuffer) {
        return m12608a().length == 0 ? byteBuffer : super.m12599a(byteBuffer);
    }

    @Override // com.xiaomi.push.C4428fn, com.xiaomi.push.C4428fn
    /* renamed from: c */
    public int mo41874c() {
        if (m12608a().length == 0) {
            return 0;
        }
        return super.mo41874c();
    }
}

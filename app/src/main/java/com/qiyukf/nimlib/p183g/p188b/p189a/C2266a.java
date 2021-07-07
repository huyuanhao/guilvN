package com.qiyukf.nimlib.p183g.p188b.p189a;

import com.qiyukf.basesdk.p119a.C1709a;
import com.qiyukf.basesdk.p120b.p132b.p134b.AbstractC1787a;
import com.qiyukf.nimlib.p155a.p168d.AbstractC2148a;
import com.qiyukf.nimlib.p183g.p188b.C2281d;
import com.qiyukf.nimlib.p183g.p191c.p194c.C2300g;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.List;

/* renamed from: com.qiyukf.nimlib.g.b.a.a */
public final class C2266a extends AbstractC1787a {

    /* renamed from: b */
    public C2281d f4513b;

    public C2266a(C2281d dVar) {
        this.f4513b = dVar;
    }

    @Override // com.qiyukf.basesdk.p120b.p132b.p134b.AbstractC1787a
    /* renamed from: a */
    public final void mo34042a(ByteBuffer byteBuffer, List<Object> list) {
        ByteBuffer order = byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        while (order.remaining() > 0) {
            try {
                AbstractC2148a.C2149a a = this.f4513b.mo34921a(order);
                if (a != null) {
                    list.add(a);
                } else {
                    return;
                }
            } catch (C2300g e) {
                e.printStackTrace();
                C1709a.m3011a("netty", "on decode exception");
                order.clear();
                this.f3304a.mo34006f().mo33987e();
                return;
            }
        }
    }

    @Override // com.qiyukf.basesdk.p120b.p132b.p134b.AbstractC1787a, com.qiyukf.basesdk.p120b.p132b.p135c.C1791a, com.qiyukf.basesdk.p120b.p132b.p135c.AbstractC1794d
    /* renamed from: h */
    public final void mo34040h() {
        super.mo34040h();
        this.f4513b.mo34924b();
    }
}

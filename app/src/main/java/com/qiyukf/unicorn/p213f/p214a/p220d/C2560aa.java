package com.qiyukf.unicorn.p213f.p214a.p220d;

import com.qiyukf.unicorn.p213f.p214a.AbstractC2498a;
import com.qiyukf.unicorn.p213f.p214a.AbstractC2597e;
import com.qiyukf.unicorn.p213f.p214a.p218b.AbstractC2548a;
import com.qiyukf.unicorn.p213f.p214a.p218b.AbstractC2549b;

@AbstractC2549b(mo35941a = 57)
/* renamed from: com.qiyukf.unicorn.f.a.d.aa */
public class C2560aa extends AbstractC2597e {
    @AbstractC2548a(mo35940a = "config")

    /* renamed from: a */
    public C2561a f5186a;

    /* renamed from: com.qiyukf.unicorn.f.a.d.aa$a */
    public static class C2561a implements AbstractC2498a {
        @AbstractC2548a(mo35940a = "switch")

        /* renamed from: a */
        public int f5187a;
        @AbstractC2548a(mo35940a = "sendingRate")

        /* renamed from: b */
        public String f5188b;
    }

    /* renamed from: a */
    public final boolean mo36013a() {
        C2561a aVar = this.f5186a;
        return aVar != null && aVar.f5187a > 0;
    }

    /* renamed from: b */
    public final float mo36014b() {
        C2561a aVar = this.f5186a;
        if (aVar == null) {
            return 0.0f;
        }
        try {
            return Float.parseFloat(aVar.f5188b);
        } catch (Exception e) {
            e.printStackTrace();
            return 0.0f;
        }
    }
}

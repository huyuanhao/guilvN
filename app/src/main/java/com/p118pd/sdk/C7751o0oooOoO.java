package com.p118pd.sdk;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: com.pd.sdk.o0oooOoO  reason: case insensitive filesystem */
public final class C7751o0oooOoO {
    public int OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final List<C7754o0oooo00> f20773OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final Map<C7754o0oooo00, Integer> f20774OooO00o;
    public int OooO0O0;

    public C7751o0oooOoO(Map<C7754o0oooo00, Integer> map) {
        this.f20774OooO00o = map;
        this.f20773OooO00o = new ArrayList(map.keySet());
        for (Integer num : map.values()) {
            this.OooO00o += num.intValue();
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C7754o0oooo00 m19396OooO00o() {
        C7754o0oooo00 o0oooo00 = this.f20773OooO00o.get(this.OooO0O0);
        Integer num = this.f20774OooO00o.get(o0oooo00);
        if (num.intValue() == 1) {
            this.f20774OooO00o.remove(o0oooo00);
            this.f20773OooO00o.remove(this.OooO0O0);
        } else {
            this.f20774OooO00o.put(o0oooo00, Integer.valueOf(num.intValue() - 1));
        }
        this.OooO00o--;
        this.OooO0O0 = this.f20773OooO00o.isEmpty() ? 0 : (this.OooO0O0 + 1) % this.f20773OooO00o.size();
        return o0oooo00;
    }

    public int OooO00o() {
        return this.OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m19397OooO00o() {
        return this.OooO00o == 0;
    }
}

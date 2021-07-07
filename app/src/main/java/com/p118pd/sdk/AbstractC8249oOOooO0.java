package com.p118pd.sdk;

import com.p118pd.sdk.AbstractC8199oOOo0o0o;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.pd.sdk.oOOooO0  reason: case insensitive filesystem */
public abstract class AbstractC8249oOOooO0<T extends AbstractC8199oOOo0o0o> implements AbstractC8235oOOoo {
    public T OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public List<C8246oOOoo0oO> f21360OooO00o = new ArrayList();

    public AbstractC8249oOOooO0(T t) {
        this.OooO00o = t;
    }

    @Override // com.p118pd.sdk.AbstractC8235oOOoo
    public C8246oOOoo0oO OooO00o(float f, float f2) {
        if (this.OooO00o.OooO00o(f, f2) > this.OooO00o.getRadius()) {
            return null;
        }
        float OooO0O0 = this.OooO00o.OooO0O0(f, f2);
        T t = this.OooO00o;
        if (t instanceof C8198oOOo0o0O) {
            OooO0O0 /= t.getAnimator().OooO0O0();
        }
        int OooO00o2 = this.OooO00o.OooO00o(OooO0O0);
        if (OooO00o2 < 0 || OooO00o2 >= this.OooO00o.getData().m19904OooO00o().OooO0Oo()) {
            return null;
        }
        return OooO00o(OooO00o2, f, f2);
    }

    public abstract C8246oOOoo0oO OooO00o(int i, float f, float f2);
}

package com.p118pd.sdk;

import androidx.annotation.VisibleForTesting;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.pd.sdk.o0oo0oO0  reason: case insensitive filesystem */
public final class C7697o0oo0oO0 {
    public final Map<AbstractC7644o0oOoOO, C7689o0oo0OoO<?>> OooO00o = new HashMap();
    public final Map<AbstractC7644o0oOoOO, C7689o0oo0OoO<?>> OooO0O0 = new HashMap();

    @VisibleForTesting
    public Map<AbstractC7644o0oOoOO, C7689o0oo0OoO<?>> OooO00o() {
        return Collections.unmodifiableMap(this.OooO00o);
    }

    public void OooO0O0(AbstractC7644o0oOoOO o0ooooo, C7689o0oo0OoO<?> o0oo0ooo) {
        Map<AbstractC7644o0oOoOO, C7689o0oo0OoO<?>> OooO00o2 = OooO00o(o0oo0ooo.m19332OooO0O0());
        if (o0oo0ooo.equals(OooO00o2.get(o0ooooo))) {
            OooO00o2.remove(o0ooooo);
        }
    }

    public C7689o0oo0OoO<?> OooO00o(AbstractC7644o0oOoOO o0ooooo, boolean z) {
        return OooO00o(z).get(o0ooooo);
    }

    public void OooO00o(AbstractC7644o0oOoOO o0ooooo, C7689o0oo0OoO<?> o0oo0ooo) {
        OooO00o(o0oo0ooo.m19332OooO0O0()).put(o0ooooo, o0oo0ooo);
    }

    private Map<AbstractC7644o0oOoOO, C7689o0oo0OoO<?>> OooO00o(boolean z) {
        return z ? this.OooO0O0 : this.OooO00o;
    }
}

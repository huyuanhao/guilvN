package com.p118pd.sdk;

import java.util.HashMap;

/* renamed from: com.pd.sdk.o00oo0OO  reason: case insensitive filesystem */
public class C7219o00oo0OO {
    public final HashMap<String, AbstractC7216o00oo00O> OooO00o = new HashMap<>();

    public final void OooO00o(String str, AbstractC7216o00oo00O o00oo00o) {
        AbstractC7216o00oo00O put = this.OooO00o.put(str, o00oo00o);
        if (put != null) {
            put.OooO00o();
        }
    }

    public final AbstractC7216o00oo00O OooO00o(String str) {
        return this.OooO00o.get(str);
    }

    public final void OooO00o() {
        for (AbstractC7216o00oo00O o00oo00o : this.OooO00o.values()) {
            o00oo00o.OooO00o();
        }
        this.OooO00o.clear();
    }
}

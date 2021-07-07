package com.p118pd.sdk;

import android.content.Context;

/* renamed from: com.pd.sdk.ooO0O0  reason: case insensitive filesystem */
public abstract class AbstractC8821ooO0O0 {
    public int OooO00o;

    public AbstractC8821ooO0O0(int i) {
        this.OooO00o = i;
    }

    public boolean OooO00o() {
        return C8797ooO000O.m20439OooO00o(this.OooO00o);
    }

    public abstract boolean OooO00o(Context context);

    public abstract boolean OooO0O0();

    public final boolean OooO0O0(Context context) {
        return OooO00o() && OooO00o(context) && OooO0O0() && OooO0OO(context);
    }

    public abstract boolean OooO0OO(Context context);
}

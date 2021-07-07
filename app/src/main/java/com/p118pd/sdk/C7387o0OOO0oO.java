package com.p118pd.sdk;

import java.util.Locale;
import java.util.concurrent.CancellationException;

/* renamed from: com.pd.sdk.o0OOO0oO  reason: case insensitive filesystem */
public class C7387o0OOO0oO {
    public final C7401o0OOOOoO OooO00o;

    public C7387o0OOO0oO(C7401o0OOOOoO o0oooooo) {
        this.OooO00o = o0oooooo;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m18918OooO00o() {
        return this.OooO00o.m18944OooO00o();
    }

    public String toString() {
        return String.format(Locale.US, "%s@%s[cancellationRequested=%s]", C7387o0OOO0oO.class.getName(), Integer.toHexString(hashCode()), Boolean.toString(this.OooO00o.m18944OooO00o()));
    }

    public C7388o0OOO0oo OooO00o(Runnable runnable) {
        return this.OooO00o.OooO00o(runnable);
    }

    public void OooO00o() throws CancellationException {
        this.OooO00o.OooO0O0();
    }
}

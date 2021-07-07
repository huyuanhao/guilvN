package com.p118pd.sdk;

/* renamed from: com.pd.sdk.o0OOOO  reason: case insensitive filesystem */
public class C7389o0OOOO<TResult> {
    public final C7391o0OOOO0o<TResult> OooO00o = new C7391o0OOOO0o<>();

    public C7391o0OOOO0o<TResult> OooO00o() {
        return this.OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m18920OooO00o() {
        return this.OooO00o.OooO0Oo();
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m18922OooO00o(TResult tresult) {
        return this.OooO00o.m18935OooO00o((Object) tresult);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m18921OooO00o(Exception exc) {
        return this.OooO00o.m18934OooO00o(exc);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m18919OooO00o() {
        if (!m18920OooO00o()) {
            throw new IllegalStateException("Cannot cancel a completed task.");
        }
    }

    public void OooO00o(TResult tresult) {
        if (!m18922OooO00o((Object) tresult)) {
            throw new IllegalStateException("Cannot set the result of a completed task.");
        }
    }

    public void OooO00o(Exception exc) {
        if (!m18921OooO00o(exc)) {
            throw new IllegalStateException("Cannot set the error on a completed task.");
        }
    }
}

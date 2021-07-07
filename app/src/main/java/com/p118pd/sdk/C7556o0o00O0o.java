package com.p118pd.sdk;

import java.util.Iterator;
import java.util.Stack;

/* renamed from: com.pd.sdk.o0o00O0o  reason: case insensitive filesystem */
public class C7556o0o00O0o {
    public Stack<C7532o0OoooO> OooO00o = new Stack<>();

    public C7532o0OoooO OooO00o() {
        return this.OooO00o.pop();
    }

    public void OooO00o(C7532o0OoooO o0ooooo) {
        this.OooO00o.push(o0ooooo);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m19208OooO00o() {
        return this.OooO00o.isEmpty();
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m19207OooO00o() {
        if (!m19208OooO00o()) {
            Iterator<C7532o0OoooO> it = this.OooO00o.iterator();
            while (it.hasNext()) {
                it.next().OooO00o();
            }
            this.OooO00o.clear();
        }
    }
}

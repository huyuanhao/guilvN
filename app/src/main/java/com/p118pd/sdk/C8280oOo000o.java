package com.p118pd.sdk;

import android.view.View;
import com.p118pd.sdk.C8348oOoOOo0;

/* renamed from: com.pd.sdk.oOo000o  reason: case insensitive filesystem */
public class C8280oOo000o extends AbstractRunnableC8285oOo00O0 {
    public static C8348oOoOOo0<C8280oOo000o> OooO00o;

    static {
        C8348oOoOOo0<C8280oOo000o> OooO00o2 = C8348oOoOOo0.OooO00o(2, new C8280oOo000o(null, 0.0f, 0.0f, null, null));
        OooO00o = OooO00o2;
        OooO00o2.OooO00o(0.5f);
    }

    public C8280oOo000o(C8353oOoOOoOO oooooooo, float f, float f2, C8351oOoOOo0o oooooo0o, View view) {
        super(oooooooo, f, f2, oooooo0o, view);
    }

    public static C8280oOo000o OooO00o(C8353oOoOOoOO oooooooo, float f, float f2, C8351oOoOOo0o oooooo0o, View view) {
        C8280oOo000o OooO00o2 = OooO00o.m20014OooO00o();
        ((AbstractRunnableC8285oOo00O0) OooO00o2).f21373OooO00o = oooooooo;
        OooO00o2.OooO0Oo = f;
        OooO00o2.OooO0o0 = f2;
        ((AbstractRunnableC8285oOo00O0) OooO00o2).f21372OooO00o = oooooo0o;
        ((AbstractRunnableC8285oOo00O0) OooO00o2).OooO00o = view;
        return OooO00o2;
    }

    public void run() {
        float[] fArr = ((AbstractRunnableC8285oOo00O0) this).f21374OooO00o;
        fArr[0] = this.OooO0Oo;
        fArr[1] = this.OooO0o0;
        ((AbstractRunnableC8285oOo00O0) this).f21372OooO00o.OooO0O0(fArr);
        ((AbstractRunnableC8285oOo00O0) this).f21373OooO00o.OooO00o(((AbstractRunnableC8285oOo00O0) this).f21374OooO00o, ((AbstractRunnableC8285oOo00O0) this).OooO00o);
        OooO00o(this);
    }

    public static void OooO00o(C8280oOo000o ooo000o) {
        OooO00o.OooO00o(ooo000o);
    }

    @Override // com.p118pd.sdk.AbstractRunnableC8285oOo00O0, com.p118pd.sdk.C8348oOoOOo0.OooO00o
    public C8348oOoOOo0.OooO00o OooO00o() {
        return new C8280oOo000o(((AbstractRunnableC8285oOo00O0) this).f21373OooO00o, this.OooO0Oo, this.OooO0o0, ((AbstractRunnableC8285oOo00O0) this).f21372OooO00o, ((AbstractRunnableC8285oOo00O0) this).OooO00o);
    }
}

package com.p118pd.sdk;

/* renamed from: com.pd.sdk.oOoOOo  reason: case insensitive filesystem */
public class C8347oOoOOo extends C8351oOoOOo0o {
    public C8347oOoOOo(C8353oOoOOoOO oooooooo) {
        super(oooooooo);
    }

    @Override // com.p118pd.sdk.C8351oOoOOo0o
    public void OooO00o(boolean z) {
        ((C8351oOoOOo0o) this).OooO0O0.reset();
        if (!z) {
            ((C8351oOoOOo0o) this).OooO0O0.postTranslate(((C8351oOoOOo0o) this).f21458OooO00o.OooOOoo(), ((C8351oOoOOo0o) this).f21458OooO00o.OooO0oO() - ((C8351oOoOOo0o) this).f21458OooO00o.OooOOo());
            return;
        }
        ((C8351oOoOOo0o) this).OooO0O0.setTranslate(-(((C8351oOoOOo0o) this).f21458OooO00o.OooO0oo() - ((C8351oOoOOo0o) this).f21458OooO00o.OooOo00()), ((C8351oOoOOo0o) this).f21458OooO00o.OooO0oO() - ((C8351oOoOOo0o) this).f21458OooO00o.OooOOo());
        ((C8351oOoOOo0o) this).OooO0O0.postScale(-1.0f, 1.0f);
    }
}

package com.p118pd.sdk;

import android.content.Context;
import android.util.AttributeSet;

/* renamed from: com.pd.sdk.oOOo0o0  reason: case insensitive filesystem */
public class C8197oOOo0o0 extends AbstractC8191oOOo0OOo<C8220oOOoOOo> implements AbstractC8258oOOooOoO {
    public C8197oOOo0o0(Context context) {
        super(context);
    }

    @Override // com.p118pd.sdk.AbstractC8191oOOo0OOo, com.p118pd.sdk.AbstractC8194oOOo0OoO, com.p118pd.sdk.AbstractC8194oOOo0OoO
    public void OooO0oo() {
        super.OooO0oo();
        ((AbstractC8194oOOo0OoO) this).f21273OooO00o = new C8325oOoOO000(this, ((AbstractC8194oOOo0OoO) this).f21265OooO00o, ((AbstractC8194oOOo0OoO) this).f21275OooO00o);
    }

    @Override // com.p118pd.sdk.AbstractC8258oOOooOoO
    public C8220oOOoOOo getLineData() {
        return (C8220oOOoOOo) ((AbstractC8194oOOo0OoO) this).f21268OooO00o;
    }

    @Override // com.p118pd.sdk.AbstractC8194oOOo0OoO
    public void onDetachedFromWindow() {
        AbstractC8321oOoO0ooO oooo0ooo = ((AbstractC8194oOOo0OoO) this).f21273OooO00o;
        if (oooo0ooo != null && (oooo0ooo instanceof C8325oOoOO000)) {
            ((C8325oOoOO000) oooo0ooo).OooO0O0();
        }
        super.onDetachedFromWindow();
    }

    public C8197oOOo0o0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public C8197oOOo0o0(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}

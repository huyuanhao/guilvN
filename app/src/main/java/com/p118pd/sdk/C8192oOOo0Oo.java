package com.p118pd.sdk;

import android.content.Context;
import android.util.AttributeSet;

/* renamed from: com.pd.sdk.oOOo0Oo  reason: case insensitive filesystem */
public class C8192oOOo0Oo extends AbstractC8191oOOo0OOo<C8216oOOoOOO> implements AbstractC8255oOOooOOo {
    public C8192oOOo0Oo(Context context) {
        super(context);
    }

    @Override // com.p118pd.sdk.AbstractC8191oOOo0OOo, com.p118pd.sdk.AbstractC8194oOOo0OoO, com.p118pd.sdk.AbstractC8194oOOo0OoO
    public void OooO0oo() {
        super.OooO0oo();
        ((AbstractC8194oOOo0OoO) this).f21273OooO00o = new C8309oOo0O00o(this, ((AbstractC8194oOOo0OoO) this).f21265OooO00o, ((AbstractC8194oOOo0OoO) this).f21275OooO00o);
        getXAxis().OooOO0o(0.5f);
        getXAxis().OooOO0O(0.5f);
    }

    @Override // com.p118pd.sdk.AbstractC8255oOOooOOo
    public C8216oOOoOOO getCandleData() {
        return (C8216oOOoOOO) ((AbstractC8194oOOo0OoO) this).f21268OooO00o;
    }

    public C8192oOOo0Oo(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public C8192oOOo0Oo(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}

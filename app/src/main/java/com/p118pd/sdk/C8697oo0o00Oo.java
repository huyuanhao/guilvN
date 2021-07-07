package com.p118pd.sdk;

import com.jinhui365.router.core.InterceptorState;

/* renamed from: com.pd.sdk.oo0o00Oo  reason: case insensitive filesystem */
public class C8697oo0o00Oo implements AbstractC8694oo0o00O {
    public C8700oo0o00oo OooO00o;

    public C8697oo0o00Oo(C8700oo0o00oo oo0o00oo) {
        this.OooO00o = oo0o00oo;
    }

    @Override // com.p118pd.sdk.AbstractC8694oo0o00O
    public void OooO00o(InterceptorState interceptorState) {
        if (InterceptorState.SUCCESS == interceptorState) {
            this.OooO00o.m20313OooO00o().OooO0O0();
        } else {
            this.OooO00o.m20311OooO00o().getTask().execute(this.OooO00o);
        }
    }
}

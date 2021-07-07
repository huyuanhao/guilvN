package com.p118pd.sdk;

import com.jinhui365.router.core.InterceptorLifeCycle;
import com.jinhui365.router.core.InterceptorState;

/* renamed from: com.pd.sdk.oo0o00OO  reason: case insensitive filesystem */
public class C8696oo0o00OO implements AbstractC8694oo0o00O {
    public C8700oo0o00oo OooO00o;

    public C8696oo0o00OO(C8700oo0o00oo oo0o00oo) {
        this.OooO00o = oo0o00oo;
    }

    @Override // com.p118pd.sdk.AbstractC8694oo0o00O
    public void OooO00o(InterceptorState interceptorState) {
        AbstractC8692oo0o000O OooO00o2 = this.OooO00o.m20312OooO00o();
        OooO00o2.OooO00o(InterceptorLifeCycle.CHECK);
        if (InterceptorState.SUCCESS == interceptorState) {
            this.OooO00o.OooO0O0();
        } else if (InterceptorState.FAIL == interceptorState) {
            OooO00o2.OooO0O0();
        } else {
            OooO00o2.OooO0O0(interceptorState);
        }
    }
}

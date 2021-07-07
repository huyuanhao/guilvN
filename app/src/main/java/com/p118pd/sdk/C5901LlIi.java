package com.p118pd.sdk;

import com.p118pd.sdk.C9349III;

/* renamed from: com.pd.sdk.L丨lI丨丨i  reason: invalid class name and case insensitive filesystem */
public final class C5901LlIi<T> implements C9349III.OooO00o<T> {
    public final C9349III<T> OooO00o;

    /* renamed from: com.pd.sdk.L丨lI丨丨i$OooO00o */
    public static final class OooO00o<T> extends AbstractC6730ll1Il<T, T> {
        public static final Object OooO0O0 = new Object();

        public OooO00o(AbstractC9508LiLi<? super T> r1) {
            super(r1);
            ((AbstractC6730ll1Il) this).f18708OooO00o = (R) OooO0O0;
        }

        @Override // com.p118pd.sdk.AbstractC6730ll1Il, com.p118pd.sdk.AbstractC5477Il11
        public void onCompleted() {
            R r = ((AbstractC6730ll1Il) this).f18708OooO00o;
            if (r == OooO0O0) {
                OooO0OO();
            } else {
                OooO00o((Object) r);
            }
        }

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: T */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onNext(T t) {
            ((AbstractC6730ll1Il) this).f18708OooO00o = t;
        }
    }

    public C5901LlIi(C9349III<T> r1) {
        this.OooO00o = r1;
    }

    /* renamed from: OooO00o */
    public void call(AbstractC9508LiLi<? super T> r2) {
        new OooO00o(r2).OooO00o((C9349III) this.OooO00o);
    }
}

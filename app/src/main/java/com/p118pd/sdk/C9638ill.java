package com.p118pd.sdk;

import java.util.concurrent.Future;

/* renamed from: com.pd.sdk.丨ill  reason: invalid class name and case insensitive filesystem */
public final class C9638ill {
    public static final OooO0O0 OooO00o = new OooO0O0();

    /* renamed from: com.pd.sdk.丨ill$OooO00o */
    public static final class OooO00o implements LlIiLii {
        public final Future<?> OooO00o;

        public OooO00o(Future<?> future) {
            this.OooO00o = future;
        }

        @Override // com.p118pd.sdk.LlIiLii
        public boolean isUnsubscribed() {
            return this.OooO00o.isCancelled();
        }

        @Override // com.p118pd.sdk.LlIiLii
        public void unsubscribe() {
            this.OooO00o.cancel(true);
        }
    }

    /* renamed from: com.pd.sdk.丨ill$OooO0O0 */
    public static final class OooO0O0 implements LlIiLii {
        @Override // com.p118pd.sdk.LlIiLii
        public boolean isUnsubscribed() {
            return true;
        }

        @Override // com.p118pd.sdk.LlIiLii
        public void unsubscribe() {
        }
    }

    public C9638ill() {
        throw new IllegalStateException("No instances!");
    }

    public static LlIiLii OooO00o() {
        return i1i11IL.OooO00o();
    }

    public static LlIiLii OooO0O0() {
        return OooO00o;
    }

    public static LlIiLii OooO00o(liii1l r0) {
        return i1i11IL.OooO00o(r0);
    }

    public static LlIiLii OooO00o(Future<?> future) {
        return new OooO00o(future);
    }

    public static IIlIIiI1 OooO00o(LlIiLii... llIiLiiArr) {
        return new IIlIIiI1(llIiLiiArr);
    }
}

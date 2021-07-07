package com.p118pd.sdk;

import com.p118pd.sdk.LL1LL;
import java.util.concurrent.TimeUnit;

/* renamed from: com.pd.sdk.LllL1Ll */
public final class LllL1Ll extends LL1LL {
    public static final LllL1Ll OooO00o = new LllL1Ll();

    @Override // com.p118pd.sdk.LL1LL, com.p118pd.sdk.LL1LL
    public LL1LL.OooO00o OooO00o() {
        return new OooO00o();
    }

    /* renamed from: com.pd.sdk.LllL1Ll$OooO00o */
    public final class OooO00o extends LL1LL.OooO00o implements LlIiLii {

        /* renamed from: OooO00o  reason: collision with other field name */
        public final i1i11IL f16740OooO00o = new i1i11IL();

        public OooO00o() {
        }

        @Override // com.p118pd.sdk.LL1LL.OooO00o
        public LlIiLii OooO00o(liii1l r3, long j, TimeUnit timeUnit) {
            return OooO00o(new IIlIlI(r3, this, LllL1Ll.this.OooO00o() + timeUnit.toMillis(j)));
        }

        @Override // com.p118pd.sdk.LlIiLii
        public boolean isUnsubscribed() {
            return this.f16740OooO00o.isUnsubscribed();
        }

        @Override // com.p118pd.sdk.LlIiLii
        public void unsubscribe() {
            this.f16740OooO00o.unsubscribe();
        }

        @Override // com.p118pd.sdk.LL1LL.OooO00o
        public LlIiLii OooO00o(liii1l r1) {
            r1.call();
            return C9638ill.OooO0O0();
        }
    }
}

package com.p118pd.sdk;

import java.util.concurrent.atomic.AtomicReference;
import s.h.e.l.l.C;

/* renamed from: com.pd.sdk.I11l1Iii */
public abstract class I11l1Iii implements AbstractC6473l1II, LlIiLii {
    public static final OooO00o OooO00o = new OooO00o();

    /* renamed from: OooO00o  reason: collision with other field name */
    public final AtomicReference<LlIiLii> f15283OooO00o = new AtomicReference<>();

    /* renamed from: com.pd.sdk.I11l1Iii$OooO00o */
    public static final class OooO00o implements LlIiLii {
        @Override // com.p118pd.sdk.LlIiLii
        public boolean isUnsubscribed() {
            return true;
        }

        @Override // com.p118pd.sdk.LlIiLii
        public void unsubscribe() {
        }
    }

    static {
        C.i(33554504);
    }

    public final native void OooO00o();

    @Override // com.p118pd.sdk.LlIiLii
    public final native boolean isUnsubscribed();

    public native void onStart();

    @Override // com.p118pd.sdk.AbstractC6473l1II
    public final native void onSubscribe(LlIiLii llIiLii);

    @Override // com.p118pd.sdk.LlIiLii
    public final native void unsubscribe();
}

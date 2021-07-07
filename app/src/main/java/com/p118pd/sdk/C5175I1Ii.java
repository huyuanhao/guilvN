package com.p118pd.sdk;

import com.p118pd.sdk.C5876LlIl;
import p293rx.exceptions.AssemblyStackTraceException;

/* renamed from: com.pd.sdk.I1Ii丨  reason: invalid class name and case insensitive filesystem */
public final class C5175I1Ii<T> implements C5876LlIl.AbstractC5898Oooo0O0 {
    public static volatile boolean OooO0O0;
    public final C5876LlIl.AbstractC5898Oooo0O0 OooO00o;
    public final String o0ooOOo = IlLlIII.OooO00o();

    /* renamed from: com.pd.sdk.I1Ii丨$OooO00o */
    public static final class OooO00o implements AbstractC6473l1II {
        public final AbstractC6473l1II OooO00o;
        public final String o0ooOOo;

        public OooO00o(AbstractC6473l1II r1, String str) {
            this.OooO00o = r1;
            this.o0ooOOo = str;
        }

        @Override // com.p118pd.sdk.AbstractC6473l1II
        public void onCompleted() {
            this.OooO00o.onCompleted();
        }

        @Override // com.p118pd.sdk.AbstractC6473l1II
        public void onError(Throwable th) {
            new AssemblyStackTraceException(this.o0ooOOo).attachTo(th);
            this.OooO00o.onError(th);
        }

        @Override // com.p118pd.sdk.AbstractC6473l1II
        public void onSubscribe(LlIiLii llIiLii) {
            this.OooO00o.onSubscribe(llIiLii);
        }
    }

    public C5175I1Ii(C5876LlIl.AbstractC5898Oooo0O0 oooo0O0) {
        this.OooO00o = oooo0O0;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.pd.sdk.L丨lI丨l$Oooo0O0 */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: OooO00o */
    public void call(AbstractC6473l1II r4) {
        this.OooO00o.call(new OooO00o(r4, this.o0ooOOo));
    }
}

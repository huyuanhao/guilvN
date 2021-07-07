package com.p118pd.sdk;

import com.p118pd.sdk.LLil11;
import p293rx.exceptions.AssemblyStackTraceException;

/* renamed from: com.pd.sdk.lL丨i111  reason: invalid class name */
public final class lLi111<T> implements LLil11.OooOo00<T> {
    public static volatile boolean OooO0O0;
    public final LLil11.OooOo00<T> OooO00o;
    public final String o0ooOOo = IlLlIII.OooO00o();

    /* renamed from: com.pd.sdk.lL丨i111$OooO00o */
    public static final class OooO00o<T> extends AbstractC93021L<T> {
        public final AbstractC93021L<? super T> OooO00o;
        public final String o0ooOOo;

        public OooO00o(AbstractC93021L<? super T> r1, String str) {
            this.OooO00o = r1;
            this.o0ooOOo = str;
            r1.OooO00o((LlIiLii) this);
        }

        @Override // com.p118pd.sdk.AbstractC93021L
        public void OooO00o(T t) {
            this.OooO00o.OooO00o((Object) t);
        }

        @Override // com.p118pd.sdk.AbstractC93021L
        public void onError(Throwable th) {
            new AssemblyStackTraceException(this.o0ooOOo).attachTo(th);
            this.OooO00o.onError(th);
        }
    }

    public lLi111(LLil11.OooOo00<T> oooOo00) {
        this.OooO00o = oooOo00;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.pd.sdk.LL丨il11$OooOo00<T> */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: OooO00o */
    public void call(AbstractC93021L<? super T> r4) {
        this.OooO00o.call(new OooO00o(r4, this.o0ooOOo));
    }
}

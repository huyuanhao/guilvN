package com.p118pd.sdk;

import com.p118pd.sdk.C9349III;

/* renamed from: com.pd.sdk.丨丨LLIlLL  reason: invalid class name and case insensitive filesystem */
public class C9814LLIlLL<K, T> extends C9349III<T> {
    public final K OooO00o;

    /* renamed from: com.pd.sdk.丨丨LLIlLL$OooO00o */
    public static class OooO00o implements C9349III.OooO00o<T> {
        public final /* synthetic */ C9349III OooO00o;

        public OooO00o(C9349III r1) {
            this.OooO00o = r1;
        }

        /* renamed from: OooO00o */
        public void call(AbstractC9508LiLi<? super T> r2) {
            this.OooO00o.OooO0O0((AbstractC9508LiLi) r2);
        }
    }

    public C9814LLIlLL(K k, C9349III.OooO00o<T> oooO00o) {
        super(oooO00o);
        this.OooO00o = k;
    }

    public static <K, T> C9814LLIlLL<K, T> OooO00o(K k, C9349III<T> r3) {
        return new C9814LLIlLL<>(k, new OooO00o(r3));
    }

    public static <K, T> C9814LLIlLL<K, T> OooO00o(K k, C9349III.OooO00o<T> oooO00o) {
        return new C9814LLIlLL<>(k, oooO00o);
    }

    @Override // com.p118pd.sdk.C9349III, com.p118pd.sdk.C9349III, com.p118pd.sdk.C9349III, com.p118pd.sdk.C9349III, com.p118pd.sdk.C9349III, com.p118pd.sdk.C9349III
    public K OooO00o() {
        return this.OooO00o;
    }
}

package com.p118pd.sdk;

import com.bumptech.glide.load.DataSource;
import com.p118pd.sdk.AbstractC7837oO00ooOo;

/* renamed from: com.pd.sdk.oO00ooOO  reason: case insensitive filesystem */
public class C7836oO00ooOO<R> implements AbstractC7837oO00ooOo<R> {
    public static final C7836oO00ooOO<?> OooO00o = new C7836oO00ooOO<>();

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final AbstractC8274oOo0000O<?> f20885OooO00o = new OooO00o();

    /* renamed from: com.pd.sdk.oO00ooOO$OooO00o */
    public static class OooO00o<R> implements AbstractC8274oOo0000O<R> {
        @Override // com.p118pd.sdk.AbstractC8274oOo0000O
        public AbstractC7837oO00ooOo<R> OooO00o(DataSource dataSource, boolean z) {
            return C7836oO00ooOO.OooO00o;
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static <R> AbstractC8274oOo0000O<R> m19513OooO00o() {
        return (AbstractC8274oOo0000O<R>) f20885OooO00o;
    }

    @Override // com.p118pd.sdk.AbstractC7837oO00ooOo
    public boolean OooO00o(Object obj, AbstractC7837oO00ooOo.OooO00o oooO00o) {
        return false;
    }

    public static <R> AbstractC7837oO00ooOo<R> OooO00o() {
        return OooO00o;
    }
}

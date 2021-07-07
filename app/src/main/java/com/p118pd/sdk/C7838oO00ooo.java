package com.p118pd.sdk;

import com.bumptech.glide.load.DataSource;
import com.p118pd.sdk.C8283oOo000oo;

/* renamed from: com.pd.sdk.oO00ooo  reason: case insensitive filesystem */
public class C7838oO00ooo<R> implements AbstractC8274oOo0000O<R> {
    public final C8283oOo000oo.OooO00o OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C8283oOo000oo<R> f20886OooO00o;

    public C7838oO00ooo(C8283oOo000oo.OooO00o oooO00o) {
        this.OooO00o = oooO00o;
    }

    @Override // com.p118pd.sdk.AbstractC8274oOo0000O
    public AbstractC7837oO00ooOo<R> OooO00o(DataSource dataSource, boolean z) {
        if (dataSource == DataSource.MEMORY_CACHE || !z) {
            return C7836oO00ooOO.OooO00o();
        }
        if (this.f20886OooO00o == null) {
            this.f20886OooO00o = new C8283oOo000oo<>(this.OooO00o);
        }
        return this.f20886OooO00o;
    }
}

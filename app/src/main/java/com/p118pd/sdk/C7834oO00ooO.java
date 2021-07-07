package com.p118pd.sdk;

import android.graphics.drawable.Drawable;
import com.bumptech.glide.load.DataSource;

/* renamed from: com.pd.sdk.oO00ooO  reason: case insensitive filesystem */
public class C7834oO00ooO implements AbstractC8274oOo0000O<Drawable> {
    public final int OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C8279oOo000Oo f20882OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final boolean f20883OooO00o;

    /* renamed from: com.pd.sdk.oO00ooO$OooO00o */
    public static class OooO00o {
        public static final int OooO0O0 = 300;
        public final int OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public boolean f20884OooO00o;

        public OooO00o() {
            this(300);
        }

        public OooO00o OooO00o(boolean z) {
            this.f20884OooO00o = z;
            return this;
        }

        public OooO00o(int i) {
            this.OooO00o = i;
        }

        public C7834oO00ooO OooO00o() {
            return new C7834oO00ooO(this.OooO00o, this.f20884OooO00o);
        }
    }

    public C7834oO00ooO(int i, boolean z) {
        this.OooO00o = i;
        this.f20883OooO00o = z;
    }

    @Override // com.p118pd.sdk.AbstractC8274oOo0000O
    public AbstractC7837oO00ooOo<Drawable> OooO00o(DataSource dataSource, boolean z) {
        return dataSource == DataSource.MEMORY_CACHE ? C7836oO00ooOO.OooO00o() : OooO00o();
    }

    private AbstractC7837oO00ooOo<Drawable> OooO00o() {
        if (this.f20882OooO00o == null) {
            this.f20882OooO00o = new C8279oOo000Oo(this.OooO00o, this.f20883OooO00o);
        }
        return this.f20882OooO00o;
    }
}

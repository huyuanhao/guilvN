package com.p118pd.sdk;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.load.DataSource;
import com.p118pd.sdk.AbstractC7837oO00ooOo;

/* renamed from: com.pd.sdk.ooOOOOoO  reason: case insensitive filesystem */
public abstract class AbstractC8948ooOOOOoO<R> implements AbstractC8274oOo0000O<R> {
    public final AbstractC8274oOo0000O<Drawable> OooO00o;

    /* renamed from: com.pd.sdk.ooOOOOoO$OooO00o */
    public final class OooO00o implements AbstractC7837oO00ooOo<R> {
        public final AbstractC7837oO00ooOo<Drawable> OooO00o;

        public OooO00o(AbstractC7837oO00ooOo<Drawable> oo00oooo) {
            this.OooO00o = oo00oooo;
        }

        @Override // com.p118pd.sdk.AbstractC7837oO00ooOo
        public boolean OooO00o(R r, AbstractC7837oO00ooOo.OooO00o oooO00o) {
            return this.OooO00o.OooO00o(new BitmapDrawable(oooO00o.m19514OooO00o().getResources(), AbstractC8948ooOOOOoO.this.OooO00o(r)), oooO00o);
        }
    }

    public AbstractC8948ooOOOOoO(AbstractC8274oOo0000O<Drawable> ooo0000o) {
        this.OooO00o = ooo0000o;
    }

    public abstract Bitmap OooO00o(R r);

    @Override // com.p118pd.sdk.AbstractC8274oOo0000O
    public AbstractC7837oO00ooOo<R> OooO00o(DataSource dataSource, boolean z) {
        return new OooO00o(this.OooO00o.OooO00o(dataSource, z));
    }
}

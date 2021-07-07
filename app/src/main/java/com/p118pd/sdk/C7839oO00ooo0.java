package com.p118pd.sdk;

import android.content.Context;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import com.bumptech.glide.load.DataSource;
import com.p118pd.sdk.C8281oOo000o0;

/* renamed from: com.pd.sdk.oO00ooo0  reason: case insensitive filesystem */
public class C7839oO00ooo0<R> implements AbstractC8274oOo0000O<R> {
    public AbstractC7837oO00ooOo<R> OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final C8281oOo000o0.OooO00o f20887OooO00o;

    /* renamed from: com.pd.sdk.oO00ooo0$OooO00o */
    public static class OooO00o implements C8281oOo000o0.OooO00o {
        public final Animation OooO00o;

        public OooO00o(Animation animation) {
            this.OooO00o = animation;
        }

        @Override // com.p118pd.sdk.C8281oOo000o0.OooO00o
        public Animation OooO00o(Context context) {
            return this.OooO00o;
        }
    }

    /* renamed from: com.pd.sdk.oO00ooo0$OooO0O0 */
    public static class OooO0O0 implements C8281oOo000o0.OooO00o {
        public final int OooO00o;

        public OooO0O0(int i) {
            this.OooO00o = i;
        }

        @Override // com.p118pd.sdk.C8281oOo000o0.OooO00o
        public Animation OooO00o(Context context) {
            return AnimationUtils.loadAnimation(context, this.OooO00o);
        }
    }

    public C7839oO00ooo0(Animation animation) {
        this(new OooO00o(animation));
    }

    @Override // com.p118pd.sdk.AbstractC8274oOo0000O
    public AbstractC7837oO00ooOo<R> OooO00o(DataSource dataSource, boolean z) {
        if (dataSource == DataSource.MEMORY_CACHE || !z) {
            return C7836oO00ooOO.OooO00o();
        }
        if (this.OooO00o == null) {
            this.OooO00o = new C8281oOo000o0(this.f20887OooO00o);
        }
        return this.OooO00o;
    }

    public C7839oO00ooo0(int i) {
        this(new OooO0O0(i));
    }

    public C7839oO00ooo0(C8281oOo000o0.OooO00o oooO00o) {
        this.f20887OooO00o = oooO00o;
    }
}

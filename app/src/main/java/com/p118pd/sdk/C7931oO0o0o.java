package com.p118pd.sdk;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p118pd.sdk.AbstractC7770oO00000o;
import java.io.InputStream;

/* renamed from: com.pd.sdk.oO0o0o  reason: case insensitive filesystem */
public class C7931oO0o0o implements AbstractC7770oO00000o<C7764o0ooooo0, InputStream> {
    public static final C7647o0oOoOOo<Integer> OooO00o = C7647o0oOoOOo.OooO00o("com.bumptech.glide.load.model.stream.HttpGlideUrlLoader.Timeout", (Object) 2500);
    @Nullable

    /* renamed from: OooO00o  reason: collision with other field name */
    public final C7769oO00000<C7764o0ooooo0, C7764o0ooooo0> f20999OooO00o;

    /* renamed from: com.pd.sdk.oO0o0o$OooO00o */
    public static class OooO00o implements AbstractC7771oO0000O<C7764o0ooooo0, InputStream> {
        public final C7769oO00000<C7764o0ooooo0, C7764o0ooooo0> OooO00o = new C7769oO00000<>(500);

        @Override // com.p118pd.sdk.AbstractC7771oO0000O
        @NonNull
        public AbstractC7770oO00000o<C7764o0ooooo0, InputStream> OooO00o(C7772oO0000o oo0000o) {
            return new C7931oO0o0o(this.OooO00o);
        }

        @Override // com.p118pd.sdk.AbstractC7771oO0000O
        public void OooO00o() {
        }
    }

    public C7931oO0o0o() {
        this(null);
    }

    public boolean OooO00o(@NonNull C7764o0ooooo0 o0ooooo0) {
        return true;
    }

    public C7931oO0o0o(@Nullable C7769oO00000<C7764o0ooooo0, C7764o0ooooo0> oo00000) {
        this.f20999OooO00o = oo00000;
    }

    public AbstractC7770oO00000o.OooO00o<InputStream> OooO00o(@NonNull C7764o0ooooo0 o0ooooo0, int i, int i2, @NonNull C7648o0oOoOo o0ooooo) {
        C7769oO00000<C7764o0ooooo0, C7764o0ooooo0> oo00000 = this.f20999OooO00o;
        if (oo00000 != null) {
            C7764o0ooooo0 OooO00o2 = oo00000.OooO00o(o0ooooo0, 0, 0);
            if (OooO00o2 == null) {
                this.f20999OooO00o.OooO00o(o0ooooo0, 0, 0, o0ooooo0);
            } else {
                o0ooooo0 = OooO00o2;
            }
        }
        return new AbstractC7770oO00000o.OooO00o<>(o0ooooo0, new C7669o0oo00O0(o0ooooo0, ((Integer) o0ooooo.OooO00o(OooO00o)).intValue()));
    }
}

package com.p118pd.sdk;

import androidx.annotation.NonNull;
import com.p118pd.sdk.AbstractC7770oO00000o;
import java.io.InputStream;
import java.net.URL;

/* renamed from: com.pd.sdk.oO0OoOOO  reason: case insensitive filesystem */
public class C7899oO0OoOOO implements AbstractC7770oO00000o<URL, InputStream> {
    public final AbstractC7770oO00000o<C7764o0ooooo0, InputStream> OooO00o;

    /* renamed from: com.pd.sdk.oO0OoOOO$OooO00o */
    public static class OooO00o implements AbstractC7771oO0000O<URL, InputStream> {
        @Override // com.p118pd.sdk.AbstractC7771oO0000O
        @NonNull
        public AbstractC7770oO00000o<URL, InputStream> OooO00o(C7772oO0000o oo0000o) {
            return new C7899oO0OoOOO(oo0000o.OooO00o(C7764o0ooooo0.class, InputStream.class));
        }

        @Override // com.p118pd.sdk.AbstractC7771oO0000O
        public void OooO00o() {
        }
    }

    public C7899oO0OoOOO(AbstractC7770oO00000o<C7764o0ooooo0, InputStream> oo00000o) {
        this.OooO00o = oo00000o;
    }

    public boolean OooO00o(@NonNull URL url) {
        return true;
    }

    public AbstractC7770oO00000o.OooO00o<InputStream> OooO00o(@NonNull URL url, int i, int i2, @NonNull C7648o0oOoOo o0ooooo) {
        return this.OooO00o.OooO00o(new C7764o0ooooo0(url), i, i2, o0ooooo);
    }
}

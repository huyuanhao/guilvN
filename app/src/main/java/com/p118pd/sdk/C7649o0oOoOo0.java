package com.p118pd.sdk;

import androidx.annotation.NonNull;
import com.p118pd.sdk.AbstractC7770oO00000o;
import java.io.InputStream;
import okhttp3.Call;
import okhttp3.OkHttpClient;

/* renamed from: com.pd.sdk.o0oOoOo0  reason: case insensitive filesystem */
public class C7649o0oOoOo0 implements AbstractC7770oO00000o<C7764o0ooooo0, InputStream> {
    public final Call.Factory OooO00o;

    /* renamed from: com.pd.sdk.o0oOoOo0$OooO00o */
    public static class OooO00o implements AbstractC7771oO0000O<C7764o0ooooo0, InputStream> {
        public static volatile Call.Factory OooO0O0;
        public final Call.Factory OooO00o;

        public OooO00o() {
            this(OooO00o());
        }

        public static Call.Factory OooO00o() {
            if (OooO0O0 == null) {
                synchronized (OooO00o.class) {
                    if (OooO0O0 == null) {
                        OooO0O0 = new OkHttpClient();
                    }
                }
            }
            return OooO0O0;
        }

        @Override // com.p118pd.sdk.AbstractC7771oO0000O
        /* renamed from: OooO00o  reason: collision with other method in class */
        public void m19294OooO00o() {
        }

        public OooO00o(@NonNull Call.Factory factory) {
            this.OooO00o = factory;
        }

        @Override // com.p118pd.sdk.AbstractC7771oO0000O
        @NonNull
        public AbstractC7770oO00000o<C7764o0ooooo0, InputStream> OooO00o(C7772oO0000o oo0000o) {
            return new C7649o0oOoOo0(this.OooO00o);
        }
    }

    public C7649o0oOoOo0(@NonNull Call.Factory factory) {
        this.OooO00o = factory;
    }

    public boolean OooO00o(@NonNull C7764o0ooooo0 o0ooooo0) {
        return true;
    }

    public AbstractC7770oO00000o.OooO00o<InputStream> OooO00o(@NonNull C7764o0ooooo0 o0ooooo0, int i, int i2, @NonNull C7648o0oOoOo o0ooooo) {
        return new AbstractC7770oO00000o.OooO00o<>(o0ooooo0, new C7643o0oOoO0o(this.OooO00o, o0ooooo0));
    }
}

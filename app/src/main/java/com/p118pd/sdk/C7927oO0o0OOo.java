package com.p118pd.sdk;

import com.drew.lang.annotations.NotNull;
import com.drew.lang.annotations.Nullable;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

/* renamed from: com.pd.sdk.oO0o0OOo  reason: case insensitive filesystem */
public final class C7927oO0o0OOo {
    @Nullable
    public final Charset OooO00o;
    @NotNull

    /* renamed from: OooO00o  reason: collision with other field name */
    public final byte[] f20996OooO00o;

    public C7927oO0o0OOo(@NotNull byte[] bArr, @Nullable Charset charset) {
        this.f20996OooO00o = bArr;
        this.OooO00o = charset;
    }

    @NotNull
    /* renamed from: OooO00o  reason: collision with other method in class */
    public byte[] m19665OooO00o() {
        return this.f20996OooO00o;
    }

    public String toString() {
        return OooO00o(this.OooO00o);
    }

    @Nullable
    public Charset OooO00o() {
        return this.OooO00o;
    }

    public String OooO00o(@Nullable Charset charset) {
        if (charset != null) {
            try {
                return new String(this.f20996OooO00o, charset.name());
            } catch (UnsupportedEncodingException unused) {
            }
        }
        return new String(this.f20996OooO00o);
    }
}

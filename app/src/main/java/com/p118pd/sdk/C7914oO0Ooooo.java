package com.p118pd.sdk;

import android.net.Uri;
import androidx.annotation.NonNull;
import com.p118pd.sdk.AbstractC7770oO00000o;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.pd.sdk.oO0Ooooo  reason: case insensitive filesystem */
public class C7914oO0Ooooo<Data> implements AbstractC7770oO00000o<Uri, Data> {
    public static final Set<String> OooO00o = Collections.unmodifiableSet(new HashSet(Arrays.asList("http", "https")));

    /* renamed from: OooO00o  reason: collision with other field name */
    public final AbstractC7770oO00000o<C7764o0ooooo0, Data> f20983OooO00o;

    /* renamed from: com.pd.sdk.oO0Ooooo$OooO00o */
    public static class OooO00o implements AbstractC7771oO0000O<Uri, InputStream> {
        @Override // com.p118pd.sdk.AbstractC7771oO0000O
        @NonNull
        public AbstractC7770oO00000o<Uri, InputStream> OooO00o(C7772oO0000o oo0000o) {
            return new C7914oO0Ooooo(oo0000o.OooO00o(C7764o0ooooo0.class, (Class) InputStream.class));
        }

        @Override // com.p118pd.sdk.AbstractC7771oO0000O
        public void OooO00o() {
        }
    }

    public C7914oO0Ooooo(AbstractC7770oO00000o<C7764o0ooooo0, Data> oo00000o) {
        this.f20983OooO00o = oo00000o;
    }

    public AbstractC7770oO00000o.OooO00o<Data> OooO00o(@NonNull Uri uri, int i, int i2, @NonNull C7648o0oOoOo o0ooooo) {
        return this.f20983OooO00o.OooO00o(new C7764o0ooooo0(uri.toString()), i, i2, o0ooooo);
    }

    public boolean OooO00o(@NonNull Uri uri) {
        return OooO00o.contains(uri.getScheme());
    }
}

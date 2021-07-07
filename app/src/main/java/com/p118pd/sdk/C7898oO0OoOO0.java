package com.p118pd.sdk;

import android.content.Context;
import android.net.Uri;
import androidx.annotation.NonNull;
import com.p118pd.sdk.AbstractC7770oO00000o;
import java.io.InputStream;

/* renamed from: com.pd.sdk.oO0OoOO0  reason: case insensitive filesystem */
public class C7898oO0OoOO0 implements AbstractC7770oO00000o<Uri, InputStream> {
    public final Context OooO00o;

    /* renamed from: com.pd.sdk.oO0OoOO0$OooO00o */
    public static class OooO00o implements AbstractC7771oO0000O<Uri, InputStream> {
        public final Context OooO00o;

        public OooO00o(Context context) {
            this.OooO00o = context;
        }

        @Override // com.p118pd.sdk.AbstractC7771oO0000O
        @NonNull
        public AbstractC7770oO00000o<Uri, InputStream> OooO00o(C7772oO0000o oo0000o) {
            return new C7898oO0OoOO0(this.OooO00o);
        }

        @Override // com.p118pd.sdk.AbstractC7771oO0000O
        public void OooO00o() {
        }
    }

    public C7898oO0OoOO0(Context context) {
        this.OooO00o = context.getApplicationContext();
    }

    public AbstractC7770oO00000o.OooO00o<InputStream> OooO00o(@NonNull Uri uri, int i, int i2, @NonNull C7648o0oOoOo o0ooooo) {
        if (C7674o0oo00oO.OooO00o(i, i2)) {
            return new AbstractC7770oO00000o.OooO00o<>(new C7885oO0Oo00O(uri), C7675o0oo00oo.OooO00o(this.OooO00o, uri));
        }
        return null;
    }

    public boolean OooO00o(@NonNull Uri uri) {
        return C7674o0oo00oO.OooO00o(uri);
    }
}

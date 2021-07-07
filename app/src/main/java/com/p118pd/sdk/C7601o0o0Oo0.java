package com.p118pd.sdk;

import android.content.Context;
import androidx.annotation.NonNull;
import com.dylanvann.fastimage.GlideRequests;
import com.p118pd.sdk.C7815oO00o000;

/* renamed from: com.pd.sdk.o0o0Oo0  reason: case insensitive filesystem */
public final class C7601o0o0Oo0 implements C7815oO00o000.OooO0O0 {
    @Override // com.p118pd.sdk.C7815oO00o000.OooO0O0
    @NonNull
    public C7658o0oOooOO OooO00o(@NonNull ComponentCallbacks2C7604o0o0Oo0o o0o0oo0o, @NonNull AbstractC7809oO00Ooo oo00ooo, @NonNull AbstractC7814oO00o00 oo00o00, @NonNull Context context) {
        return new GlideRequests(o0o0oo0o, oo00ooo, oo00o00, context);
    }
}

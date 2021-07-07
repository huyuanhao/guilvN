package com.p118pd.sdk;

import android.content.Context;
import androidx.annotation.NonNull;
import com.bumptech.glide.Registry;
import com.p118pd.sdk.C7649o0oOoOo0;
import java.io.InputStream;

/* renamed from: com.pd.sdk.o0oOoO0  reason: case insensitive filesystem */
public final class C7642o0oOoO0 extends AbstractC8963ooOOo0 {
    @Override // com.p118pd.sdk.AbstractC7870oO0OOOoo, com.p118pd.sdk.AbstractC8963ooOOo0
    public void registerComponents(@NonNull Context context, @NonNull ComponentCallbacks2C7604o0o0Oo0o o0o0oo0o, @NonNull Registry registry) {
        registry.OooO0OO(C7764o0ooooo0.class, InputStream.class, new C7649o0oOoOo0.OooO00o());
    }
}

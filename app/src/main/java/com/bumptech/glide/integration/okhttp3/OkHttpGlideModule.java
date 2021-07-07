package com.bumptech.glide.integration.okhttp3;

import android.content.Context;
import androidx.annotation.NonNull;
import com.bumptech.glide.Registry;
import com.p118pd.sdk.AbstractC7816oO00o00o;
import com.p118pd.sdk.C7605o0o0OoO;
import com.p118pd.sdk.C7649o0oOoOo0;
import com.p118pd.sdk.C7764o0ooooo0;
import com.p118pd.sdk.ComponentCallbacks2C7604o0o0Oo0o;
import java.io.InputStream;

@Deprecated
public class OkHttpGlideModule implements AbstractC7816oO00o00o {
    @Override // com.p118pd.sdk.AbstractC7878oO0OOoOO
    public void applyOptions(@NonNull Context context, @NonNull C7605o0o0OoO o0o0ooo) {
    }

    @Override // com.p118pd.sdk.AbstractC7870oO0OOOoo
    public void registerComponents(Context context, ComponentCallbacks2C7604o0o0Oo0o o0o0oo0o, Registry registry) {
        registry.OooO0OO(C7764o0ooooo0.class, InputStream.class, new C7649o0oOoOo0.OooO00o());
    }
}

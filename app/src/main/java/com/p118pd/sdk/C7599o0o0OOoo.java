package com.p118pd.sdk;

import android.content.Context;
import android.util.Log;
import androidx.annotation.NonNull;
import com.bumptech.glide.Registry;
import com.dylanvann.fastimage.FastImageGlideModule;
import com.dylanvann.fastimage.FastImageOkHttpProgressGlideModule;
import java.util.Collections;
import java.util.Set;

/* renamed from: com.pd.sdk.o0o0OOoo  reason: case insensitive filesystem */
public final class C7599o0o0OOoo extends AbstractC7598o0o0OOoO {
    public final FastImageGlideModule OooO00o = new FastImageGlideModule();

    public C7599o0o0OOoo() {
        Log.isLoggable("Glide", 3);
    }

    @Override // com.p118pd.sdk.AbstractC7878oO0OOoOO, com.p118pd.sdk.oO00o00O
    public void applyOptions(@NonNull Context context, @NonNull C7605o0o0OoO o0o0ooo) {
        this.OooO00o.applyOptions(context, o0o0ooo);
    }

    @Override // com.p118pd.sdk.oO00o00O
    public boolean isManifestParsingEnabled() {
        return this.OooO00o.isManifestParsingEnabled();
    }

    @Override // com.p118pd.sdk.AbstractC7870oO0OOOoo, com.p118pd.sdk.AbstractC8963ooOOo0
    public void registerComponents(@NonNull Context context, @NonNull ComponentCallbacks2C7604o0o0Oo0o o0o0oo0o, @NonNull Registry registry) {
        new C7642o0oOoO0().registerComponents(context, o0o0oo0o, registry);
        new FastImageOkHttpProgressGlideModule().registerComponents(context, o0o0oo0o, registry);
        this.OooO00o.registerComponents(context, o0o0oo0o, registry);
    }

    @Override // com.p118pd.sdk.AbstractC7598o0o0OOoO, com.p118pd.sdk.AbstractC7598o0o0OOoO
    @NonNull
    /* renamed from: OooO00o  reason: collision with other method in class */
    public Set<Class<?>> m19229OooO00o() {
        return Collections.emptySet();
    }

    @Override // com.p118pd.sdk.AbstractC7598o0o0OOoO, com.p118pd.sdk.AbstractC7598o0o0OOoO
    @NonNull
    public C7601o0o0Oo0 OooO00o() {
        return new C7601o0o0Oo0();
    }
}

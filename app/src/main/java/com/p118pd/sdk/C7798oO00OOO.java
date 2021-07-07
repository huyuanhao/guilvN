package com.p118pd.sdk;

import android.util.Log;
import androidx.annotation.NonNull;
import com.bumptech.glide.load.EncodeStrategy;
import java.io.File;
import java.io.IOException;

/* renamed from: com.pd.sdk.oO00OOO  reason: case insensitive filesystem */
public class C7798oO00OOO implements AbstractC7653o0oOoo0<C7796oO00OO> {
    public static final String OooO00o = "GifEncoder";

    @Override // com.p118pd.sdk.AbstractC7653o0oOoo0
    @NonNull
    public EncodeStrategy OooO00o(@NonNull C7648o0oOoOo o0ooooo) {
        return EncodeStrategy.SOURCE;
    }

    public boolean OooO00o(@NonNull AbstractC7700o0oo0oo0<C7796oO00OO> o0oo0oo0, @NonNull File file, @NonNull C7648o0oOoOo o0ooooo) {
        try {
            C8984ooOOoOo0.OooO00o(o0oo0oo0.get().m19488OooO00o(), file);
            return true;
        } catch (IOException unused) {
            Log.isLoggable(OooO00o, 5);
            return false;
        }
    }
}

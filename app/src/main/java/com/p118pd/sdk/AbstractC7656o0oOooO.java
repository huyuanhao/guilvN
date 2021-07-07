package com.p118pd.sdk;

import android.content.res.AssetManager;
import android.util.Log;
import androidx.annotation.NonNull;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.p118pd.sdk.AbstractC7662o0oOooo0;
import java.io.IOException;

/* renamed from: com.pd.sdk.o0oOooO  reason: case insensitive filesystem */
public abstract class AbstractC7656o0oOooO<T> implements AbstractC7662o0oOooo0<T> {
    public static final String o0ooOoO = "AssetPathFetcher";
    public final AssetManager OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public T f20537OooO00o;
    public final String o0ooOOo;

    public AbstractC7656o0oOooO(AssetManager assetManager, String str) {
        this.OooO00o = assetManager;
        this.o0ooOOo = str;
    }

    public abstract T OooO00o(AssetManager assetManager, String str) throws IOException;

    @Override // com.p118pd.sdk.AbstractC7662o0oOooo0
    public void OooO00o(@NonNull Priority priority, @NonNull AbstractC7662o0oOooo0.OooO00o<? super T> oooO00o) {
        try {
            T OooO00o2 = OooO00o(this.OooO00o, this.o0ooOOo);
            this.f20537OooO00o = OooO00o2;
            oooO00o.OooO00o((Object) OooO00o2);
        } catch (IOException e) {
            Log.isLoggable(o0ooOoO, 3);
            oooO00o.OooO00o((Exception) e);
        }
    }

    public abstract void OooO00o(T t) throws IOException;

    @Override // com.p118pd.sdk.AbstractC7662o0oOooo0
    public void cancel() {
    }

    @Override // com.p118pd.sdk.AbstractC7662o0oOooo0, com.p118pd.sdk.AbstractC7662o0oOooo0, com.p118pd.sdk.AbstractC7662o0oOooo0
    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m19295OooO00o() {
        T t = this.f20537OooO00o;
        if (t != null) {
            try {
                OooO00o(t);
            } catch (IOException unused) {
            }
        }
    }

    @Override // com.p118pd.sdk.AbstractC7662o0oOooo0, com.p118pd.sdk.AbstractC7662o0oOooo0, com.p118pd.sdk.AbstractC7662o0oOooo0
    @NonNull
    public DataSource OooO00o() {
        return DataSource.LOCAL;
    }
}

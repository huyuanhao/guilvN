package com.p118pd.sdk;

import android.content.ContentResolver;
import android.net.Uri;
import android.util.Log;
import androidx.annotation.NonNull;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.p118pd.sdk.AbstractC7662o0oOooo0;
import java.io.FileNotFoundException;
import java.io.IOException;

/* renamed from: com.pd.sdk.o0oo00OO  reason: case insensitive filesystem */
public abstract class AbstractC7670o0oo00OO<T> implements AbstractC7662o0oOooo0<T> {
    public static final String o0ooOOo = "LocalUriFetcher";
    public final ContentResolver OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final Uri f20549OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public T f20550OooO00o;

    public AbstractC7670o0oo00OO(ContentResolver contentResolver, Uri uri) {
        this.OooO00o = contentResolver;
        this.f20549OooO00o = uri;
    }

    public abstract T OooO00o(Uri uri, ContentResolver contentResolver) throws FileNotFoundException;

    @Override // com.p118pd.sdk.AbstractC7662o0oOooo0
    public final void OooO00o(@NonNull Priority priority, @NonNull AbstractC7662o0oOooo0.OooO00o<? super T> oooO00o) {
        try {
            T OooO00o2 = OooO00o(this.f20549OooO00o, this.OooO00o);
            this.f20550OooO00o = OooO00o2;
            oooO00o.OooO00o((Object) OooO00o2);
        } catch (FileNotFoundException e) {
            Log.isLoggable(o0ooOOo, 3);
            oooO00o.OooO00o((Exception) e);
        }
    }

    public abstract void OooO00o(T t) throws IOException;

    @Override // com.p118pd.sdk.AbstractC7662o0oOooo0
    public void cancel() {
    }

    @Override // com.p118pd.sdk.AbstractC7662o0oOooo0, com.p118pd.sdk.AbstractC7662o0oOooo0, com.p118pd.sdk.AbstractC7662o0oOooo0
    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m19303OooO00o() {
        T t = this.f20550OooO00o;
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

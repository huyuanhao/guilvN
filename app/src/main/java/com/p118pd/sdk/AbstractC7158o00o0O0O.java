package com.p118pd.sdk;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.provider.DocumentsContract;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.File;

/* renamed from: com.pd.sdk.o00o0O0O  reason: case insensitive filesystem */
public abstract class AbstractC7158o00o0O0O {
    public static final String OooO00o = "DocumentFile";
    @Nullable

    /* renamed from: OooO00o  reason: collision with other field name */
    public final AbstractC7158o00o0O0O f19556OooO00o;

    public AbstractC7158o00o0O0O(@Nullable AbstractC7158o00o0O0O o00o0o0o) {
        this.f19556OooO00o = o00o0o0o;
    }

    @NonNull
    public static AbstractC7158o00o0O0O OooO00o(@NonNull File file) {
        return new C7159o00o0OO(null, file);
    }

    @Nullable
    public static AbstractC7158o00o0O0O OooO0O0(@NonNull Context context, @NonNull Uri uri) {
        if (Build.VERSION.SDK_INT >= 21) {
            return new C7162o00o0OOo(null, context, DocumentsContract.buildDocumentUriUsingTree(uri, DocumentsContract.getTreeDocumentId(uri)));
        }
        return null;
    }

    public abstract long OooO00o();

    @NonNull
    /* renamed from: OooO00o  reason: collision with other method in class */
    public abstract Uri m18563OooO00o();

    @Nullable
    public abstract AbstractC7158o00o0O0O OooO00o(@NonNull String str);

    @Nullable
    public abstract AbstractC7158o00o0O0O OooO00o(@NonNull String str, @NonNull String str2);

    @Nullable
    /* renamed from: OooO00o  reason: collision with other method in class */
    public abstract String m18565OooO00o();

    /* renamed from: OooO00o  reason: collision with other method in class */
    public abstract boolean m18566OooO00o();

    /* renamed from: OooO00o  reason: collision with other method in class */
    public abstract boolean m18567OooO00o(@NonNull String str);

    @NonNull
    /* renamed from: OooO00o  reason: collision with other method in class */
    public abstract AbstractC7158o00o0O0O[] m18568OooO00o();

    public abstract long OooO0O0();

    @Nullable
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public abstract String m18569OooO0O0();

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public abstract boolean m18570OooO0O0();

    public abstract boolean OooO0OO();

    public abstract boolean OooO0Oo();

    public abstract boolean OooO0o();

    public abstract boolean OooO0o0();

    public abstract boolean OooO0oO();

    @Nullable
    public static AbstractC7158o00o0O0O OooO00o(@NonNull Context context, @NonNull Uri uri) {
        if (Build.VERSION.SDK_INT >= 19) {
            return new C7161o00o0OOO(null, context, uri);
        }
        return null;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static boolean m18562OooO00o(@NonNull Context context, @Nullable Uri uri) {
        if (Build.VERSION.SDK_INT >= 19) {
            return DocumentsContract.isDocumentUri(context, uri);
        }
        return false;
    }

    @Nullable
    public AbstractC7158o00o0O0O OooO0O0(@NonNull String str) {
        AbstractC7158o00o0O0O[] OooO00o2 = m18568OooO00o();
        for (AbstractC7158o00o0O0O o00o0o0o : OooO00o2) {
            if (str.equals(o00o0o0o.m18565OooO00o())) {
                return o00o0o0o;
            }
        }
        return null;
    }

    @Nullable
    /* renamed from: OooO00o  reason: collision with other method in class */
    public AbstractC7158o00o0O0O m18564OooO00o() {
        return this.f19556OooO00o;
    }
}

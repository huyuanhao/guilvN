package com.p118pd.sdk;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.p118pd.sdk.AbstractC7662o0oOooo0;
import com.p118pd.sdk.AbstractC7770oO00000o;
import java.io.File;
import java.io.FileNotFoundException;

/* renamed from: com.pd.sdk.o0oooooo  reason: case insensitive filesystem */
public final class C7766o0oooooo implements AbstractC7770oO00000o<Uri, File> {
    public final Context OooO00o;

    /* renamed from: com.pd.sdk.o0oooooo$OooO00o */
    public static final class OooO00o implements AbstractC7771oO0000O<Uri, File> {
        public final Context OooO00o;

        public OooO00o(Context context) {
            this.OooO00o = context;
        }

        @Override // com.p118pd.sdk.AbstractC7771oO0000O
        @NonNull
        public AbstractC7770oO00000o<Uri, File> OooO00o(C7772oO0000o oo0000o) {
            return new C7766o0oooooo(this.OooO00o);
        }

        @Override // com.p118pd.sdk.AbstractC7771oO0000O
        public void OooO00o() {
        }
    }

    public C7766o0oooooo(Context context) {
        this.OooO00o = context;
    }

    public AbstractC7770oO00000o.OooO00o<File> OooO00o(@NonNull Uri uri, int i, int i2, @NonNull C7648o0oOoOo o0ooooo) {
        return new AbstractC7770oO00000o.OooO00o<>(new C7885oO0Oo00O(uri), new OooO0O0(this.OooO00o, uri));
    }

    public boolean OooO00o(@NonNull Uri uri) {
        return C7674o0oo00oO.OooO0O0(uri);
    }

    /* renamed from: com.pd.sdk.o0oooooo$OooO0O0 */
    public static class OooO0O0 implements AbstractC7662o0oOooo0<File> {
        public static final String[] OooO00o = {"_data"};

        /* renamed from: OooO00o  reason: collision with other field name */
        public final Context f20795OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final Uri f20796OooO00o;

        public OooO0O0(Context context, Uri uri) {
            this.f20795OooO00o = context;
            this.f20796OooO00o = uri;
        }

        @Override // com.p118pd.sdk.AbstractC7662o0oOooo0, com.p118pd.sdk.AbstractC7662o0oOooo0, com.p118pd.sdk.AbstractC7662o0oOooo0
        /* renamed from: OooO00o  reason: collision with other method in class */
        public void m19416OooO00o() {
        }

        @Override // com.p118pd.sdk.AbstractC7662o0oOooo0
        public void OooO00o(@NonNull Priority priority, @NonNull AbstractC7662o0oOooo0.OooO00o<? super File> oooO00o) {
            Cursor query = this.f20795OooO00o.getContentResolver().query(this.f20796OooO00o, OooO00o, null, null, null);
            String str = null;
            if (query != null) {
                try {
                    if (query.moveToFirst()) {
                        str = query.getString(query.getColumnIndexOrThrow("_data"));
                    }
                } finally {
                    query.close();
                }
            }
            if (TextUtils.isEmpty(str)) {
                oooO00o.OooO00o((Exception) new FileNotFoundException("Failed to find file path for: " + this.f20796OooO00o));
                return;
            }
            oooO00o.OooO00o(new File(str));
        }

        @Override // com.p118pd.sdk.AbstractC7662o0oOooo0
        public void cancel() {
        }

        @Override // com.p118pd.sdk.AbstractC7662o0oOooo0, com.p118pd.sdk.AbstractC7662o0oOooo0, com.p118pd.sdk.AbstractC7662o0oOooo0
        @NonNull
        /* renamed from: OooO00o  reason: collision with other method in class */
        public Class<File> m19415OooO00o() {
            return File.class;
        }

        /* Return type fixed from 'com.bumptech.glide.load.DataSource' to match base method */
        @Override // com.p118pd.sdk.AbstractC7662o0oOooo0, com.p118pd.sdk.AbstractC7662o0oOooo0, com.p118pd.sdk.AbstractC7662o0oOooo0
        @NonNull
        public Class<File> OooO00o() {
            return DataSource.LOCAL;
        }
    }
}

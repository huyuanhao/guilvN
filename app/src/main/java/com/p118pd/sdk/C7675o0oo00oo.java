package com.p118pd.sdk;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.bumptech.glide.load.DataSource;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.pd.sdk.o0oo00oo  reason: case insensitive filesystem */
public class C7675o0oo00oo implements AbstractC7662o0oOooo0<InputStream> {
    public static final String o0ooOOo = "MediaStoreThumbFetcher";
    public final Uri OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final C7677o0oo0O0 f20551OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public InputStream f20552OooO00o;

    /* renamed from: com.pd.sdk.o0oo00oo$OooO00o */
    public static class OooO00o implements AbstractC7665o0oo0 {
        public static final String OooO00o = "kind = 1 AND image_id = ?";

        /* renamed from: OooO00o  reason: collision with other field name */
        public static final String[] f20553OooO00o = {"_data"};

        /* renamed from: OooO00o  reason: collision with other field name */
        public final ContentResolver f20554OooO00o;

        public OooO00o(ContentResolver contentResolver) {
            this.f20554OooO00o = contentResolver;
        }

        @Override // com.p118pd.sdk.AbstractC7665o0oo0
        public Cursor OooO00o(Uri uri) {
            String lastPathSegment = uri.getLastPathSegment();
            return this.f20554OooO00o.query(MediaStore.Images.Thumbnails.EXTERNAL_CONTENT_URI, f20553OooO00o, OooO00o, new String[]{lastPathSegment}, null);
        }
    }

    /* renamed from: com.pd.sdk.o0oo00oo$OooO0O0 */
    public static class OooO0O0 implements AbstractC7665o0oo0 {
        public static final String OooO00o = "kind = 1 AND video_id = ?";

        /* renamed from: OooO00o  reason: collision with other field name */
        public static final String[] f20555OooO00o = {"_data"};

        /* renamed from: OooO00o  reason: collision with other field name */
        public final ContentResolver f20556OooO00o;

        public OooO0O0(ContentResolver contentResolver) {
            this.f20556OooO00o = contentResolver;
        }

        @Override // com.p118pd.sdk.AbstractC7665o0oo0
        public Cursor OooO00o(Uri uri) {
            String lastPathSegment = uri.getLastPathSegment();
            return this.f20556OooO00o.query(MediaStore.Video.Thumbnails.EXTERNAL_CONTENT_URI, f20555OooO00o, OooO00o, new String[]{lastPathSegment}, null);
        }
    }

    @VisibleForTesting
    public C7675o0oo00oo(Uri uri, C7677o0oo0O0 o0oo0o0) {
        this.OooO00o = uri;
        this.f20551OooO00o = o0oo0o0;
    }

    public static C7675o0oo00oo OooO00o(Context context, Uri uri) {
        return OooO00o(context, uri, new OooO00o(context.getContentResolver()));
    }

    public static C7675o0oo00oo OooO0O0(Context context, Uri uri) {
        return OooO00o(context, uri, new OooO0O0(context.getContentResolver()));
    }

    @Override // com.p118pd.sdk.AbstractC7662o0oOooo0
    public void cancel() {
    }

    public static C7675o0oo00oo OooO00o(Context context, Uri uri, AbstractC7665o0oo0 o0oo0) {
        return new C7675o0oo00oo(uri, new C7677o0oo0O0(ComponentCallbacks2C7604o0o0Oo0o.OooO00o(context).m19235OooO00o().OooO00o(), o0oo0, ComponentCallbacks2C7604o0o0Oo0o.OooO00o(context).m19237OooO00o(), context.getContentResolver()));
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, java.io.InputStream] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @Override // com.p118pd.sdk.AbstractC7662o0oOooo0
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void OooO00o(@androidx.annotation.NonNull com.bumptech.glide.Priority r3, @androidx.annotation.NonNull com.p118pd.sdk.AbstractC7662o0oOooo0.OooO00o<? super java.io.InputStream> r4) {
        /*
            r2 = this;
            java.io.InputStream r3 = r2.OooO00o()     // Catch:{ FileNotFoundException -> 0x000a }
            r2.f20552OooO00o = r3     // Catch:{ FileNotFoundException -> 0x000a }
            r4.OooO00o(r3)
            return
        L_0x000a:
            r3 = move-exception
            r0 = 3
            java.lang.String r1 = "MediaStoreThumbFetcher"
            boolean r0 = android.util.Log.isLoggable(r1, r0)
            r4.OooO00o(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p118pd.sdk.C7675o0oo00oo.OooO00o(com.bumptech.glide.Priority, com.pd.sdk.o0oOooo0$OooO00o):void");
    }

    /* Return type fixed from 'java.io.InputStream' to match base method */
    @Override // com.p118pd.sdk.AbstractC7662o0oOooo0, com.p118pd.sdk.AbstractC7662o0oOooo0, com.p118pd.sdk.AbstractC7662o0oOooo0
    private Class<InputStream> OooO00o() throws FileNotFoundException {
        InputStream OooO00o2 = this.f20551OooO00o.m19309OooO00o(this.OooO00o);
        int OooO00o3 = OooO00o2 != null ? this.f20551OooO00o.m19308OooO00o(this.OooO00o) : -1;
        return OooO00o3 != -1 ? new C7664o0oOoooo(OooO00o2, OooO00o3) : OooO00o2;
    }

    @Override // com.p118pd.sdk.AbstractC7662o0oOooo0, com.p118pd.sdk.AbstractC7662o0oOooo0, com.p118pd.sdk.AbstractC7662o0oOooo0
    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m19307OooO00o() {
        InputStream inputStream = this.f20552OooO00o;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
    }

    @Override // com.p118pd.sdk.AbstractC7662o0oOooo0, com.p118pd.sdk.AbstractC7662o0oOooo0, com.p118pd.sdk.AbstractC7662o0oOooo0
    @NonNull
    /* renamed from: OooO00o  reason: collision with other method in class */
    public Class<InputStream> m19306OooO00o() {
        return InputStream.class;
    }

    /* Return type fixed from 'com.bumptech.glide.load.DataSource' to match base method */
    @Override // com.p118pd.sdk.AbstractC7662o0oOooo0, com.p118pd.sdk.AbstractC7662o0oOooo0, com.p118pd.sdk.AbstractC7662o0oOooo0
    @NonNull
    /* renamed from: OooO00o  reason: collision with other method in class */
    public Class<InputStream> m19305OooO00o() {
        return DataSource.LOCAL;
    }
}

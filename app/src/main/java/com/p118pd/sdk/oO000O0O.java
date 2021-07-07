package com.p118pd.sdk;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import androidx.annotation.NonNull;
import com.p118pd.sdk.AbstractC7770oO00000o;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.pd.sdk.oO000O0O */
public class oO000O0O<Data> implements AbstractC7770oO00000o<Uri, Data> {
    public static final Set<String> OooO00o = Collections.unmodifiableSet(new HashSet(Arrays.asList("file", "android.resource", "content")));

    /* renamed from: OooO00o  reason: collision with other field name */
    public final OooO0OO<Data> f20817OooO00o;

    /* renamed from: com.pd.sdk.oO000O0O$OooO00o */
    public static final class OooO00o implements AbstractC7771oO0000O<Uri, AssetFileDescriptor>, OooO0OO<AssetFileDescriptor> {
        public final ContentResolver OooO00o;

        public OooO00o(ContentResolver contentResolver) {
            this.OooO00o = contentResolver;
        }

        @Override // com.p118pd.sdk.AbstractC7771oO0000O
        public AbstractC7770oO00000o<Uri, AssetFileDescriptor> OooO00o(C7772oO0000o oo0000o) {
            return new oO000O0O(this);
        }

        @Override // com.p118pd.sdk.AbstractC7771oO0000O
        public void OooO00o() {
        }

        @Override // com.p118pd.sdk.oO000O0O.OooO0OO
        public AbstractC7662o0oOooo0<AssetFileDescriptor> OooO00o(Uri uri) {
            return new C7652o0oOoo(this.OooO00o, uri);
        }
    }

    /* renamed from: com.pd.sdk.oO000O0O$OooO0O0 */
    public static class OooO0O0 implements AbstractC7771oO0000O<Uri, ParcelFileDescriptor>, OooO0OO<ParcelFileDescriptor> {
        public final ContentResolver OooO00o;

        public OooO0O0(ContentResolver contentResolver) {
            this.OooO00o = contentResolver;
        }

        @Override // com.p118pd.sdk.oO000O0O.OooO0OO
        public AbstractC7662o0oOooo0<ParcelFileDescriptor> OooO00o(Uri uri) {
            return new C7667o0oo000O(this.OooO00o, uri);
        }

        @Override // com.p118pd.sdk.AbstractC7771oO0000O
        public void OooO00o() {
        }

        @Override // com.p118pd.sdk.AbstractC7771oO0000O
        @NonNull
        public AbstractC7770oO00000o<Uri, ParcelFileDescriptor> OooO00o(C7772oO0000o oo0000o) {
            return new oO000O0O(this);
        }
    }

    /* renamed from: com.pd.sdk.oO000O0O$OooO0OO */
    public interface OooO0OO<Data> {
        AbstractC7662o0oOooo0<Data> OooO00o(Uri uri);
    }

    /* renamed from: com.pd.sdk.oO000O0O$OooO0Oo  reason: case insensitive filesystem */
    public static class C7777OooO0Oo implements AbstractC7771oO0000O<Uri, InputStream>, OooO0OO<InputStream> {
        public final ContentResolver OooO00o;

        public C7777OooO0Oo(ContentResolver contentResolver) {
            this.OooO00o = contentResolver;
        }

        @Override // com.p118pd.sdk.oO000O0O.OooO0OO
        public AbstractC7662o0oOooo0<InputStream> OooO00o(Uri uri) {
            return new C7673o0oo00o0(this.OooO00o, uri);
        }

        @Override // com.p118pd.sdk.AbstractC7771oO0000O
        public void OooO00o() {
        }

        @Override // com.p118pd.sdk.AbstractC7771oO0000O
        @NonNull
        public AbstractC7770oO00000o<Uri, InputStream> OooO00o(C7772oO0000o oo0000o) {
            return new oO000O0O(this);
        }
    }

    public oO000O0O(OooO0OO<Data> oooO0OO) {
        this.f20817OooO00o = oooO0OO;
    }

    public AbstractC7770oO00000o.OooO00o<Data> OooO00o(@NonNull Uri uri, int i, int i2, @NonNull C7648o0oOoOo o0ooooo) {
        return new AbstractC7770oO00000o.OooO00o<>(new C7885oO0Oo00O(uri), this.f20817OooO00o.OooO00o(uri));
    }

    public boolean OooO00o(@NonNull Uri uri) {
        return OooO00o.contains(uri.getScheme());
    }
}

package com.p118pd.sdk;

import android.content.res.AssetManager;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import androidx.annotation.NonNull;
import com.p118pd.sdk.AbstractC7770oO00000o;
import java.io.InputStream;

/* renamed from: com.pd.sdk.o0oooo0  reason: case insensitive filesystem */
public class C7753o0oooo0<Data> implements AbstractC7770oO00000o<Uri, Data> {
    public static final int OooO00o = 22;

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final String f20775OooO00o = "android_asset";
    public static final String OooO0O0 = "file:///android_asset/";

    /* renamed from: OooO00o  reason: collision with other field name */
    public final AssetManager f20776OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final OooO00o<Data> f20777OooO00o;

    /* renamed from: com.pd.sdk.o0oooo0$OooO00o */
    public interface OooO00o<Data> {
        AbstractC7662o0oOooo0<Data> OooO00o(AssetManager assetManager, String str);
    }

    /* renamed from: com.pd.sdk.o0oooo0$OooO0O0 */
    public static class OooO0O0 implements AbstractC7771oO0000O<Uri, ParcelFileDescriptor>, OooO00o<ParcelFileDescriptor> {
        public final AssetManager OooO00o;

        public OooO0O0(AssetManager assetManager) {
            this.OooO00o = assetManager;
        }

        @Override // com.p118pd.sdk.AbstractC7771oO0000O
        @NonNull
        public AbstractC7770oO00000o<Uri, ParcelFileDescriptor> OooO00o(C7772oO0000o oo0000o) {
            return new C7753o0oooo0(this.OooO00o, this);
        }

        @Override // com.p118pd.sdk.AbstractC7771oO0000O
        public void OooO00o() {
        }

        @Override // com.p118pd.sdk.C7753o0oooo0.OooO00o
        public AbstractC7662o0oOooo0<ParcelFileDescriptor> OooO00o(AssetManager assetManager, String str) {
            return new C7666o0oo0000(assetManager, str);
        }
    }

    /* renamed from: com.pd.sdk.o0oooo0$OooO0OO */
    public static class OooO0OO implements AbstractC7771oO0000O<Uri, InputStream>, OooO00o<InputStream> {
        public final AssetManager OooO00o;

        public OooO0OO(AssetManager assetManager) {
            this.OooO00o = assetManager;
        }

        @Override // com.p118pd.sdk.AbstractC7771oO0000O
        @NonNull
        public AbstractC7770oO00000o<Uri, InputStream> OooO00o(C7772oO0000o oo0000o) {
            return new C7753o0oooo0(this.OooO00o, this);
        }

        @Override // com.p118pd.sdk.AbstractC7771oO0000O
        public void OooO00o() {
        }

        @Override // com.p118pd.sdk.C7753o0oooo0.OooO00o
        public AbstractC7662o0oOooo0<InputStream> OooO00o(AssetManager assetManager, String str) {
            return new C7671o0oo00Oo(assetManager, str);
        }
    }

    public C7753o0oooo0(AssetManager assetManager, OooO00o<Data> oooO00o) {
        this.f20776OooO00o = assetManager;
        this.f20777OooO00o = oooO00o;
    }

    public AbstractC7770oO00000o.OooO00o<Data> OooO00o(@NonNull Uri uri, int i, int i2, @NonNull C7648o0oOoOo o0ooooo) {
        return new AbstractC7770oO00000o.OooO00o<>(new C7885oO0Oo00O(uri), this.f20777OooO00o.OooO00o(this.f20776OooO00o, uri.toString().substring(OooO00o)));
    }

    public boolean OooO00o(@NonNull Uri uri) {
        if (!"file".equals(uri.getScheme()) || uri.getPathSegments().isEmpty() || !f20775OooO00o.equals(uri.getPathSegments().get(0))) {
            return false;
        }
        return true;
    }
}

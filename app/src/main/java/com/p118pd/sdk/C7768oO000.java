package com.p118pd.sdk;

import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p118pd.sdk.AbstractC7770oO00000o;
import java.io.File;
import java.io.InputStream;

/* renamed from: com.pd.sdk.oO000  reason: case insensitive filesystem */
public class C7768oO000<Data> implements AbstractC7770oO00000o<String, Data> {
    public final AbstractC7770oO00000o<Uri, Data> OooO00o;

    /* renamed from: com.pd.sdk.oO000$OooO00o */
    public static final class OooO00o implements AbstractC7771oO0000O<String, AssetFileDescriptor> {
        @Override // com.p118pd.sdk.AbstractC7771oO0000O
        public AbstractC7770oO00000o<String, AssetFileDescriptor> OooO00o(@NonNull C7772oO0000o oo0000o) {
            return new C7768oO000(oo0000o.OooO00o(Uri.class, (Class) AssetFileDescriptor.class));
        }

        @Override // com.p118pd.sdk.AbstractC7771oO0000O
        public void OooO00o() {
        }
    }

    /* renamed from: com.pd.sdk.oO000$OooO0O0 */
    public static class OooO0O0 implements AbstractC7771oO0000O<String, ParcelFileDescriptor> {
        @Override // com.p118pd.sdk.AbstractC7771oO0000O
        @NonNull
        public AbstractC7770oO00000o<String, ParcelFileDescriptor> OooO00o(@NonNull C7772oO0000o oo0000o) {
            return new C7768oO000(oo0000o.OooO00o(Uri.class, (Class) ParcelFileDescriptor.class));
        }

        @Override // com.p118pd.sdk.AbstractC7771oO0000O
        public void OooO00o() {
        }
    }

    /* renamed from: com.pd.sdk.oO000$OooO0OO */
    public static class OooO0OO implements AbstractC7771oO0000O<String, InputStream> {
        @Override // com.p118pd.sdk.AbstractC7771oO0000O
        @NonNull
        public AbstractC7770oO00000o<String, InputStream> OooO00o(@NonNull C7772oO0000o oo0000o) {
            return new C7768oO000(oo0000o.OooO00o(Uri.class, (Class) InputStream.class));
        }

        @Override // com.p118pd.sdk.AbstractC7771oO0000O
        public void OooO00o() {
        }
    }

    public C7768oO000(AbstractC7770oO00000o<Uri, Data> oo00000o) {
        this.OooO00o = oo00000o;
    }

    public static Uri OooO0O0(String str) {
        return Uri.fromFile(new File(str));
    }

    public boolean OooO00o(@NonNull String str) {
        return true;
    }

    public AbstractC7770oO00000o.OooO00o<Data> OooO00o(@NonNull String str, int i, int i2, @NonNull C7648o0oOoOo o0ooooo) {
        Uri OooO00o2 = OooO00o(str);
        if (OooO00o2 == null || !this.OooO00o.OooO00o(OooO00o2)) {
            return null;
        }
        return this.OooO00o.OooO00o(OooO00o2, i, i2, o0ooooo);
    }

    @Nullable
    public static Uri OooO00o(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.charAt(0) == '/') {
            return OooO0O0(str);
        }
        Uri parse = Uri.parse(str);
        return parse.getScheme() == null ? OooO0O0(str) : parse;
    }
}

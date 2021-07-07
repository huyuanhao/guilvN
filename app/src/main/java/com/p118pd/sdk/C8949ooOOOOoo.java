package com.p118pd.sdk;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.load.EncodeStrategy;

/* renamed from: com.pd.sdk.ooOOOOoo  reason: case insensitive filesystem */
public class C8949ooOOOOoo implements AbstractC7653o0oOoo0<Bitmap> {
    public static final C7647o0oOoOOo<Integer> OooO00o = C7647o0oOoOOo.OooO00o("com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionQuality", (Object) 90);

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final String f22210OooO00o = "BitmapEncoder";
    public static final C7647o0oOoOOo<Bitmap.CompressFormat> OooO0O0 = C7647o0oOoOOo.OooO00o("com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionFormat");
    @Nullable

    /* renamed from: OooO00o  reason: collision with other field name */
    public final AbstractC7707o0ooO00O f22211OooO00o;

    public C8949ooOOOOoo(@NonNull AbstractC7707o0ooO00O o0ooo00o) {
        this.f22211OooO00o = o0ooo00o;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x005d, code lost:
        if (r6 != null) goto L_0x004d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00af A[SYNTHETIC, Splitter:B:32:0x00af] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean OooO00o(@androidx.annotation.NonNull com.p118pd.sdk.AbstractC7700o0oo0oo0<android.graphics.Bitmap> r9, @androidx.annotation.NonNull java.io.File r10, @androidx.annotation.NonNull com.p118pd.sdk.C7648o0oOoOo r11) {
        /*
        // Method dump skipped, instructions count: 186
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p118pd.sdk.C8949ooOOOOoo.OooO00o(com.pd.sdk.o0oo0oo0, java.io.File, com.pd.sdk.o0oOoOo):boolean");
    }

    @Deprecated
    public C8949ooOOOOoo() {
        this.f22211OooO00o = null;
    }

    private Bitmap.CompressFormat OooO00o(Bitmap bitmap, C7648o0oOoOo o0ooooo) {
        Bitmap.CompressFormat compressFormat = (Bitmap.CompressFormat) o0ooooo.OooO00o(OooO0O0);
        if (compressFormat != null) {
            return compressFormat;
        }
        if (bitmap.hasAlpha()) {
            return Bitmap.CompressFormat.PNG;
        }
        return Bitmap.CompressFormat.JPEG;
    }

    @Override // com.p118pd.sdk.AbstractC7653o0oOoo0
    @NonNull
    public EncodeStrategy OooO00o(@NonNull C7648o0oOoOo o0ooooo) {
        return EncodeStrategy.TRANSFORMED;
    }
}

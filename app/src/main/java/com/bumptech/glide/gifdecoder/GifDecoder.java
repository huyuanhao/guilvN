package com.bumptech.glide.gifdecoder;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p118pd.sdk.C7635o0oOo0O;
import java.io.InputStream;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.nio.ByteBuffer;

public interface GifDecoder {
    public static final int OooO00o = 0;
    public static final int OooO0O0 = 1;
    public static final int OooO0OO = 2;
    public static final int OooO0Oo = 3;
    public static final int OooO0o0 = 0;

    @Retention(RetentionPolicy.SOURCE)
    public @interface GifDecodeStatus {
    }

    public interface OooO00o {
        @NonNull
        Bitmap OooO00o(int i, int i2, @NonNull Bitmap.Config config);

        void OooO00o(@NonNull Bitmap bitmap);

        void OooO00o(@NonNull byte[] bArr);

        void OooO00o(@NonNull int[] iArr);

        @NonNull
        byte[] OooO00o(int i);

        @NonNull
        /* renamed from: OooO00o  reason: collision with other method in class */
        int[] m14990OooO00o(int i);
    }

    int OooO00o();

    int OooO00o(int i);

    int OooO00o(@Nullable InputStream inputStream, int i);

    @Nullable
    /* renamed from: OooO00o  reason: collision with other method in class */
    Bitmap m14986OooO00o();

    @NonNull
    /* renamed from: OooO00o  reason: collision with other method in class */
    ByteBuffer m14987OooO00o();

    /* renamed from: OooO00o  reason: collision with other method in class */
    void m14988OooO00o();

    void OooO00o(@NonNull Bitmap.Config config);

    void OooO00o(@NonNull C7635o0oOo0O o0ooo0o, @NonNull ByteBuffer byteBuffer);

    void OooO00o(@NonNull C7635o0oOo0O o0ooo0o, @NonNull ByteBuffer byteBuffer, int i);

    void OooO00o(@NonNull C7635o0oOo0O o0ooo0o, @NonNull byte[] bArr);

    @Deprecated
    int OooO0O0();

    /* renamed from: OooO0O0  reason: collision with other method in class */
    void m14989OooO0O0();

    int OooO0OO();

    int OooO0Oo();

    int OooO0o();

    int OooO0o0();

    int OooO0oO();

    int OooO0oo();

    void clear();

    int getHeight();

    int getWidth();

    int read(@Nullable byte[] bArr);
}

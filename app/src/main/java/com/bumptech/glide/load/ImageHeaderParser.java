package com.bumptech.glide.load;

import androidx.annotation.NonNull;
import com.p118pd.sdk.AbstractC7707o0ooO00O;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public interface ImageHeaderParser {
    public static final int OooO00o = -1;

    public enum ImageType {
        GIF(true),
        JPEG(false),
        RAW(false),
        PNG_A(true),
        PNG(false),
        WEBP_A(true),
        WEBP(false),
        UNKNOWN(false);
        
        public final boolean hasAlpha;

        /* access modifiers changed from: public */
        ImageType(boolean z) {
            this.hasAlpha = z;
        }

        public boolean hasAlpha() {
            return this.hasAlpha;
        }
    }

    int OooO00o(@NonNull InputStream inputStream, @NonNull AbstractC7707o0ooO00O o0ooo00o) throws IOException;

    int OooO00o(@NonNull ByteBuffer byteBuffer, @NonNull AbstractC7707o0ooO00O o0ooo00o) throws IOException;

    @NonNull
    ImageType OooO00o(@NonNull InputStream inputStream) throws IOException;

    @NonNull
    ImageType OooO00o(@NonNull ByteBuffer byteBuffer) throws IOException;
}

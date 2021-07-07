package com.p118pd.sdk;

import android.media.ExifInterface;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

@RequiresApi(27)
/* renamed from: com.pd.sdk.oO000o0o  reason: case insensitive filesystem */
public final class C7786oO000o0o implements ImageHeaderParser {
    @Override // com.bumptech.glide.load.ImageHeaderParser
    @NonNull
    public ImageHeaderParser.ImageType OooO00o(@NonNull InputStream inputStream) throws IOException {
        return ImageHeaderParser.ImageType.UNKNOWN;
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    @NonNull
    public ImageHeaderParser.ImageType OooO00o(@NonNull ByteBuffer byteBuffer) throws IOException {
        return ImageHeaderParser.ImageType.UNKNOWN;
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public int OooO00o(@NonNull InputStream inputStream, @NonNull AbstractC7707o0ooO00O o0ooo00o) throws IOException {
        int attributeInt = new ExifInterface(inputStream).getAttributeInt(androidx.exifinterface.media.ExifInterface.f14146OooO0oo, 1);
        if (attributeInt == 0) {
            return -1;
        }
        return attributeInt;
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public int OooO00o(@NonNull ByteBuffer byteBuffer, @NonNull AbstractC7707o0ooO00O o0ooo00o) throws IOException {
        return OooO00o(C8984ooOOoOo0.m20650OooO00o(byteBuffer), o0ooo00o);
    }
}

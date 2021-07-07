package com.p118pd.sdk;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.resource.bitmap.RecyclableBufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* renamed from: com.pd.sdk.o0oOoOO0  reason: case insensitive filesystem */
public final class C7645o0oOoOO0 {
    public static final int OooO00o = 5242880;

    /* JADX INFO: finally extract failed */
    @NonNull
    /* renamed from: OooO00o  reason: collision with other method in class */
    public static ImageHeaderParser.ImageType m19291OooO00o(@NonNull List<ImageHeaderParser> list, @Nullable InputStream inputStream, @NonNull AbstractC7707o0ooO00O o0ooo00o) throws IOException {
        if (inputStream == null) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
        if (!inputStream.markSupported()) {
            inputStream = new RecyclableBufferedInputStream(inputStream, o0ooo00o);
        }
        inputStream.mark(5242880);
        int size = list.size();
        for (int i = 0; i < size; i++) {
            try {
                ImageHeaderParser.ImageType OooO00o2 = list.get(i).OooO00o(inputStream);
                if (OooO00o2 != ImageHeaderParser.ImageType.UNKNOWN) {
                    inputStream.reset();
                    return OooO00o2;
                }
                inputStream.reset();
            } catch (Throwable th) {
                inputStream.reset();
                throw th;
            }
        }
        return ImageHeaderParser.ImageType.UNKNOWN;
    }

    @NonNull
    public static ImageHeaderParser.ImageType OooO00o(@NonNull List<ImageHeaderParser> list, @Nullable ByteBuffer byteBuffer) throws IOException {
        if (byteBuffer == null) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ImageHeaderParser.ImageType OooO00o2 = list.get(i).OooO00o(byteBuffer);
            if (OooO00o2 != ImageHeaderParser.ImageType.UNKNOWN) {
                return OooO00o2;
            }
        }
        return ImageHeaderParser.ImageType.UNKNOWN;
    }

    /* JADX INFO: finally extract failed */
    public static int OooO00o(@NonNull List<ImageHeaderParser> list, @Nullable InputStream inputStream, @NonNull AbstractC7707o0ooO00O o0ooo00o) throws IOException {
        if (inputStream == null) {
            return -1;
        }
        if (!inputStream.markSupported()) {
            inputStream = new RecyclableBufferedInputStream(inputStream, o0ooo00o);
        }
        inputStream.mark(5242880);
        int size = list.size();
        for (int i = 0; i < size; i++) {
            try {
                int OooO00o2 = list.get(i).OooO00o(inputStream, o0ooo00o);
                if (OooO00o2 != -1) {
                    inputStream.reset();
                    return OooO00o2;
                }
                inputStream.reset();
            } catch (Throwable th) {
                inputStream.reset();
                throw th;
            }
        }
        return -1;
    }
}

package com.facebook.imagepipeline.platform;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import androidx.core.util.Pools;
import com.facebook.common.internal.Preconditions;
import com.facebook.common.internal.VisibleForTesting;
import com.facebook.common.references.CloseableReference;
import com.facebook.common.streams.LimitedInputStream;
import com.facebook.common.streams.TailAppendingInputStream;
import com.facebook.imagepipeline.image.EncodedImage;
import com.facebook.imagepipeline.memory.BitmapPool;
import java.nio.ByteBuffer;
import javax.annotation.Nullable;
import javax.annotation.concurrent.ThreadSafe;

@ThreadSafe
@TargetApi(21)
public class ArtDecoder implements PlatformDecoder {
    public static final int DECODE_BUFFER_SIZE = 16384;
    public static final byte[] EOI_TAIL = {-1, -39};
    public static final Class<?> TAG = ArtDecoder.class;
    public final BitmapPool mBitmapPool;
    @VisibleForTesting
    public final Pools.OooO0O0<ByteBuffer> mDecodeBuffers;

    public ArtDecoder(BitmapPool bitmapPool, int i, Pools.OooO0O0 oooO0O0) {
        this.mBitmapPool = bitmapPool;
        this.mDecodeBuffers = oooO0O0;
        for (int i2 = 0; i2 < i; i2++) {
            this.mDecodeBuffers.release(ByteBuffer.allocate(16384));
        }
    }

    public static BitmapFactory.Options getDecodeOptionsForStream(EncodedImage encodedImage, Bitmap.Config config) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inSampleSize = encodedImage.getSampleSize();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeStream(encodedImage.getInputStream(), null, options);
        if (options.outWidth == -1 || options.outHeight == -1) {
            throw new IllegalArgumentException();
        }
        options.inJustDecodeBounds = false;
        options.inDither = true;
        options.inPreferredConfig = config;
        options.inMutable = true;
        return options;
    }

    @Override // com.facebook.imagepipeline.platform.PlatformDecoder
    public CloseableReference<Bitmap> decodeFromEncodedImage(EncodedImage encodedImage, Bitmap.Config config, @Nullable Rect rect) {
        BitmapFactory.Options decodeOptionsForStream = getDecodeOptionsForStream(encodedImage, config);
        boolean z = decodeOptionsForStream.inPreferredConfig != Bitmap.Config.ARGB_8888;
        try {
            return decodeStaticImageFromStream(encodedImage.getInputStream(), decodeOptionsForStream, rect);
        } catch (RuntimeException e) {
            if (z) {
                return decodeFromEncodedImage(encodedImage, Bitmap.Config.ARGB_8888, rect);
            }
            throw e;
        }
    }

    @Override // com.facebook.imagepipeline.platform.PlatformDecoder
    public CloseableReference<Bitmap> decodeJPEGFromEncodedImage(EncodedImage encodedImage, Bitmap.Config config, @Nullable Rect rect, int i) {
        boolean isCompleteAt = encodedImage.isCompleteAt(i);
        BitmapFactory.Options decodeOptionsForStream = getDecodeOptionsForStream(encodedImage, config);
        TailAppendingInputStream inputStream = encodedImage.getInputStream();
        Preconditions.checkNotNull(inputStream);
        if (encodedImage.getSize() > i) {
            inputStream = new LimitedInputStream(inputStream, i);
        }
        if (!isCompleteAt) {
            inputStream = new TailAppendingInputStream(inputStream, EOI_TAIL);
        }
        boolean z = decodeOptionsForStream.inPreferredConfig != Bitmap.Config.ARGB_8888;
        try {
            return decodeStaticImageFromStream(inputStream, decodeOptionsForStream, rect);
        } catch (RuntimeException e) {
            if (z) {
                return decodeFromEncodedImage(encodedImage, Bitmap.Config.ARGB_8888, rect);
            }
            throw e;
        }
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:15:0x0046 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [android.graphics.Rect] */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r11v8, types: [android.graphics.Bitmap] */
    /* JADX WARNING: Can't wrap try/catch for region: R(3:22|23|(1:25)) */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        com.facebook.common.logging.FLog.m871e(com.facebook.imagepipeline.platform.ArtDecoder.TAG, "Could not decode region %s, decoding full bitmap instead.", (java.lang.Object[]) new java.lang.Object[]{r11});
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x005f, code lost:
        if (r0 != null) goto L_0x0061;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0061, code lost:
        r0.recycle();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0065, code lost:
        r10 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0066, code lost:
        r4 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0069, code lost:
        r4.recycle();
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:22:0x0053 */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0082  */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.facebook.common.references.CloseableReference<android.graphics.Bitmap> decodeStaticImageFromStream(java.io.InputStream r9, android.graphics.BitmapFactory.Options r10, @javax.annotation.Nullable android.graphics.Rect r11) {
        /*
        // Method dump skipped, instructions count: 198
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.imagepipeline.platform.ArtDecoder.decodeStaticImageFromStream(java.io.InputStream, android.graphics.BitmapFactory$Options, android.graphics.Rect):com.facebook.common.references.CloseableReference");
    }
}

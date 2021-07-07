package com.facebook.imagepipeline.platform;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.os.MemoryFile;
import com.facebook.common.internal.ByteStreams;
import com.facebook.common.internal.Closeables;
import com.facebook.common.internal.Throwables;
import com.facebook.common.memory.PooledByteBuffer;
import com.facebook.common.memory.PooledByteBufferInputStream;
import com.facebook.common.references.CloseableReference;
import com.facebook.common.streams.LimitedInputStream;
import com.facebook.imagepipeline.image.EncodedImage;
import java.io.Closeable;
import java.io.FileDescriptor;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.reflect.Method;
import javax.annotation.Nullable;

public class GingerbreadPurgeableDecoder extends DalvikPurgeableDecoder {
    public static Method sGetFileDescriptorMethod;

    public static MemoryFile copyToMemoryFile(CloseableReference<PooledByteBuffer> closeableReference, int i, @Nullable byte[] bArr) throws IOException {
        Closeable closeable;
        Throwable th;
        LimitedInputStream limitedInputStream;
        PooledByteBufferInputStream pooledByteBufferInputStream = null;
        MemoryFile memoryFile = new MemoryFile(null, (bArr == null ? 0 : bArr.length) + i);
        memoryFile.allowPurging(false);
        try {
            PooledByteBufferInputStream pooledByteBufferInputStream2 = new PooledByteBufferInputStream(closeableReference.get());
            try {
                limitedInputStream = new LimitedInputStream(pooledByteBufferInputStream2, i);
                try {
                    OutputStream outputStream = memoryFile.getOutputStream();
                    ByteStreams.copy(limitedInputStream, outputStream);
                    if (bArr != null) {
                        memoryFile.writeBytes(bArr, 0, i, bArr.length);
                    }
                    CloseableReference.closeSafely(closeableReference);
                    Closeables.closeQuietly(pooledByteBufferInputStream2);
                    Closeables.closeQuietly(limitedInputStream);
                    Closeables.close(outputStream, true);
                    return memoryFile;
                } catch (Throwable th2) {
                    th = th2;
                    closeable = null;
                    pooledByteBufferInputStream = pooledByteBufferInputStream2;
                    CloseableReference.closeSafely(closeableReference);
                    Closeables.closeQuietly(pooledByteBufferInputStream);
                    Closeables.closeQuietly(limitedInputStream);
                    Closeables.close(closeable, true);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                closeable = null;
                limitedInputStream = null;
                pooledByteBufferInputStream = pooledByteBufferInputStream2;
                CloseableReference.closeSafely(closeableReference);
                Closeables.closeQuietly(pooledByteBufferInputStream);
                Closeables.closeQuietly(limitedInputStream);
                Closeables.close(closeable, true);
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            closeable = null;
            limitedInputStream = null;
            CloseableReference.closeSafely(closeableReference);
            Closeables.closeQuietly(pooledByteBufferInputStream);
            Closeables.closeQuietly(limitedInputStream);
            Closeables.close(closeable, true);
            throw th;
        }
    }

    private synchronized Method getFileDescriptorMethod() {
        if (sGetFileDescriptorMethod == null) {
            try {
                sGetFileDescriptorMethod = MemoryFile.class.getDeclaredMethod("getFileDescriptor", new Class[0]);
            } catch (Exception e) {
                throw Throwables.propagate(e);
            }
        }
        return sGetFileDescriptorMethod;
    }

    private FileDescriptor getMemoryFileDescriptor(MemoryFile memoryFile) {
        try {
            return (FileDescriptor) getFileDescriptorMethod().invoke(memoryFile, new Object[0]);
        } catch (Exception e) {
            throw Throwables.propagate(e);
        }
    }

    @Override // com.facebook.imagepipeline.platform.DalvikPurgeableDecoder
    public Bitmap decodeByteArrayAsPurgeable(CloseableReference<PooledByteBuffer> closeableReference, BitmapFactory.Options options) {
        return decodeFileDescriptorAsPurgeable(closeableReference, closeableReference.get().size(), null, options);
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x002d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.graphics.Bitmap decodeFileDescriptorAsPurgeable(com.facebook.common.references.CloseableReference<com.facebook.common.memory.PooledByteBuffer> r2, int r3, byte[] r4, android.graphics.BitmapFactory.Options r5) {
        /*
            r1 = this;
            r0 = 0
            android.os.MemoryFile r2 = copyToMemoryFile(r2, r3, r4)     // Catch:{ IOException -> 0x0025 }
            java.io.FileDescriptor r3 = r1.getMemoryFileDescriptor(r2)     // Catch:{ IOException -> 0x0020, all -> 0x001d }
            com.facebook.common.webp.WebpBitmapFactory r4 = com.facebook.common.webp.WebpSupportStatus.sWebpBitmapFactory     // Catch:{ IOException -> 0x0020, all -> 0x001d }
            android.graphics.Bitmap r3 = r4.decodeFileDescriptor(r3, r0, r5)     // Catch:{ IOException -> 0x0020, all -> 0x001d }
            java.lang.String r4 = "BitmapFactory returned null"
            java.lang.Object r3 = com.facebook.common.internal.Preconditions.checkNotNull(r3, r4)     // Catch:{ IOException -> 0x0020, all -> 0x001d }
            android.graphics.Bitmap r3 = (android.graphics.Bitmap) r3     // Catch:{ IOException -> 0x0020, all -> 0x001d }
            if (r2 == 0) goto L_0x001c
            r2.close()
        L_0x001c:
            return r3
        L_0x001d:
            r3 = move-exception
            r0 = r2
            goto L_0x002b
        L_0x0020:
            r3 = move-exception
            r0 = r2
            goto L_0x0026
        L_0x0023:
            r3 = move-exception
            goto L_0x002b
        L_0x0025:
            r3 = move-exception
        L_0x0026:
            java.lang.RuntimeException r2 = com.facebook.common.internal.Throwables.propagate(r3)     // Catch:{ all -> 0x0023 }
            throw r2     // Catch:{ all -> 0x0023 }
        L_0x002b:
            if (r0 == 0) goto L_0x0030
            r0.close()
        L_0x0030:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.imagepipeline.platform.GingerbreadPurgeableDecoder.decodeFileDescriptorAsPurgeable(com.facebook.common.references.CloseableReference, int, byte[], android.graphics.BitmapFactory$Options):android.graphics.Bitmap");
    }

    @Override // com.facebook.imagepipeline.platform.DalvikPurgeableDecoder, com.facebook.imagepipeline.platform.PlatformDecoder
    public /* bridge */ /* synthetic */ CloseableReference decodeFromEncodedImage(EncodedImage encodedImage, Bitmap.Config config, @Nullable Rect rect) {
        return super.decodeFromEncodedImage(encodedImage, config, rect);
    }

    @Override // com.facebook.imagepipeline.platform.DalvikPurgeableDecoder
    public Bitmap decodeJPEGByteArrayAsPurgeable(CloseableReference<PooledByteBuffer> closeableReference, int i, BitmapFactory.Options options) {
        return decodeFileDescriptorAsPurgeable(closeableReference, i, DalvikPurgeableDecoder.endsWithEOI(closeableReference, i) ? null : DalvikPurgeableDecoder.EOI, options);
    }

    @Override // com.facebook.imagepipeline.platform.DalvikPurgeableDecoder, com.facebook.imagepipeline.platform.PlatformDecoder
    public /* bridge */ /* synthetic */ CloseableReference decodeJPEGFromEncodedImage(EncodedImage encodedImage, Bitmap.Config config, @Nullable Rect rect, int i) {
        return super.decodeJPEGFromEncodedImage(encodedImage, config, rect, i);
    }

    @Override // com.facebook.imagepipeline.platform.DalvikPurgeableDecoder
    public /* bridge */ /* synthetic */ CloseableReference pinBitmap(Bitmap bitmap) {
        return super.pinBitmap(bitmap);
    }
}

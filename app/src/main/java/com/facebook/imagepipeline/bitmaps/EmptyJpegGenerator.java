package com.facebook.imagepipeline.bitmaps;

import androidx.exifinterface.media.ExifInterface;
import com.facebook.common.memory.PooledByteBuffer;
import com.facebook.common.memory.PooledByteBufferFactory;
import com.facebook.common.memory.PooledByteBufferOutputStream;
import com.facebook.common.references.CloseableReference;
import com.p118pd.sdk.C8027oOO00oo;
import com.umeng.commonsdk.proguard.C3571am;
import java.io.IOException;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;

public class EmptyJpegGenerator {
    public static final byte[] EMPTY_JPEG_PREFIX = {-1, ExifInterface.OooO0OO, -1, -37, 0, 67, 0, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, ExifInterface.OooO0Oo, 0, 17, 8};
    public static final byte[] EMPTY_JPEG_SUFFIX = {3, 1, 34, 0, 2, 17, 0, 3, 17, 0, -1, -60, 0, C3571am.f9204j, 0, 0, 1, 5, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, -1, -60, 0, -75, 16, 0, 2, 1, 3, 3, 2, 4, 3, 5, 5, 4, 4, 0, 0, 1, 125, 1, 2, 3, 0, 4, 17, 5, 18, PublicSuffixDatabase.EXCEPTION_MARKER, 49, C8027oOO00oo.OooO00o, 6, 19, 81, 97, 7, 34, 113, 20, 50, -127, -111, -95, 8, 35, 66, -79, ExifInterface.OooO0o0, 21, 82, -47, -16, 36, 51, 98, 114, C3571am.f9202h, 9, 10, 22, 23, 24, 25, 26, C8027oOO00oo.OooO0OO, 38, 39, 40, 41, ExifInterface.OooO00o, 52, 53, 54, 55, 56, 57, 58, 67, 68, 69, 70, C8027oOO00oo.OooO0O0, 72, 73, 74, 83, 84, 85, 86, 87, 88, 89, 90, 99, 100, 101, 102, 103, 104, 105, 106, 115, 116, 117, 118, 119, 120, 121, 122, -125, -124, -123, -122, -121, -120, -119, -118, -110, -109, -108, -107, -106, -105, -104, -103, -102, -94, -93, -92, -91, -90, -89, -88, -87, -86, -78, -77, -76, -75, -74, -73, -72, -71, -70, ExifInterface.OooO0o, ExifInterface.OooO0oO, -60, ExifInterface.OooO0oo, ExifInterface.OooO, ExifInterface.OooOO0, -56, ExifInterface.OooOO0O, ExifInterface.OooOO0o, -46, -45, -44, -43, -42, -41, ExifInterface.OooO0OO, -39, -38, ExifInterface.OooOOo, -30, -29, -28, -27, -26, -25, -24, -23, -22, -15, -14, -13, -12, -11, -10, -9, -8, -7, -6, -1, -60, 0, C3571am.f9204j, 1, 0, 3, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, -1, -60, 0, -75, 17, 0, 2, 1, 2, 4, 4, 3, 4, 7, 5, 4, 4, 0, 1, 2, 119, 0, 1, 2, 3, 17, 4, 5, PublicSuffixDatabase.EXCEPTION_MARKER, 49, 6, 18, C8027oOO00oo.OooO00o, 81, 7, 97, 113, 19, 34, 50, -127, 8, 20, 66, -111, -95, -79, ExifInterface.OooO0o0, 9, 35, 51, 82, -16, 21, 98, 114, -47, 10, 22, 36, 52, ExifInterface.OooOOo, C8027oOO00oo.OooO0OO, -15, 23, 24, 25, 26, 38, 39, 40, 41, ExifInterface.OooO00o, 53, 54, 55, 56, 57, 58, 67, 68, 69, 70, C8027oOO00oo.OooO0O0, 72, 73, 74, 83, 84, 85, 86, 87, 88, 89, 90, 99, 100, 101, 102, 103, 104, 105, 106, 115, 116, 117, 118, 119, 120, 121, 122, C3571am.f9202h, -125, -124, -123, -122, -121, -120, -119, -118, -110, -109, -108, -107, -106, -105, -104, -103, -102, -94, -93, -92, -91, -90, -89, -88, -87, -86, -78, -77, -76, -75, -74, -73, -72, -71, -70, ExifInterface.OooO0o, ExifInterface.OooO0oO, -60, ExifInterface.OooO0oo, ExifInterface.OooO, ExifInterface.OooOO0, -56, ExifInterface.OooOO0O, ExifInterface.OooOO0o, -46, -45, -44, -43, -42, -41, ExifInterface.OooO0OO, -39, -38, -30, -29, -28, -27, -26, -25, -24, -23, -22, -14, -13, -12, -11, -10, -9, -8, -7, -6, -1, -38, 0, 12, 3, 1, 0, 2, 17, 3, 17, 0, 63, 0, -114, -118, 40, -96, 15, -1, -39};
    public final PooledByteBufferFactory mPooledByteBufferFactory;

    public EmptyJpegGenerator(PooledByteBufferFactory pooledByteBufferFactory) {
        this.mPooledByteBufferFactory = pooledByteBufferFactory;
    }

    public CloseableReference<PooledByteBuffer> generate(short s, short s2) {
        PooledByteBufferOutputStream pooledByteBufferOutputStream = null;
        try {
            pooledByteBufferOutputStream = this.mPooledByteBufferFactory.newOutputStream(EMPTY_JPEG_PREFIX.length + EMPTY_JPEG_SUFFIX.length + 4);
            pooledByteBufferOutputStream.write(EMPTY_JPEG_PREFIX);
            pooledByteBufferOutputStream.write((byte) (s2 >> 8));
            pooledByteBufferOutputStream.write((byte) (s2 & 255));
            pooledByteBufferOutputStream.write((byte) (s >> 8));
            pooledByteBufferOutputStream.write((byte) (s & 255));
            pooledByteBufferOutputStream.write(EMPTY_JPEG_SUFFIX);
            CloseableReference<PooledByteBuffer> of = CloseableReference.m937of(pooledByteBufferOutputStream.toByteBuffer());
            if (pooledByteBufferOutputStream != null) {
                pooledByteBufferOutputStream.close();
            }
            return of;
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (Throwable th) {
            if (pooledByteBufferOutputStream != null) {
                pooledByteBufferOutputStream.close();
            }
            throw th;
        }
    }
}

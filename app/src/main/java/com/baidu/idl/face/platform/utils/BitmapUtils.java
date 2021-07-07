package com.baidu.idl.face.platform.utils;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.media.ExifInterface;
import android.os.Environment;
import android.text.TextUtils;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;

public final class BitmapUtils {
    public static final int CONNECTTIMEOUT = 3000;
    public static final int DEFAULT_IMAGE_JPG_QUALITY = 50;
    public static final int DEFAULT_JPEG_QUALITY = 90;
    public static final int DEFAULT_MAX_SIZE_CELL_NETWORK = 600;
    public static final int IMAGEBOUND = 128;
    public static final String IMAGE_KEY_SUFFIX = "jpg";
    public static final int MAXLENTH = 1024;
    public static final int PIC_COMPRESS_SIZE = 4;
    public static final int QUALITY = 100;
    public static final int QUESTION_IMAGE_JPG_QUALITY = 75;
    public static final int QUESTION_MAX_SIZE_CELL_NETWORK = 1024;
    public static final int ROTATE0 = 0;
    public static final int ROTATE180 = 180;
    public static final int ROTATE270 = 270;
    public static final int ROTATE360 = 360;
    public static final int ROTATE90 = 90;
    public static final String TAG = "ImageUtils";

    public static String bitmapToJpegBase64(Bitmap bitmap, int i, float f) {
        try {
            float max = f / ((float) Math.max(bitmap.getWidth(), bitmap.getHeight()));
            if (max < 1.0f) {
                bitmap = scale(bitmap, max);
            }
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            bitmap.compress(Bitmap.CompressFormat.JPEG, i, byteArrayOutputStream);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            return Base64Utils.encodeToString(byteArray, 2);
        } catch (Exception unused) {
            return null;
        }
    }

    public static Bitmap calculateInSampleSize(Bitmap bitmap, int i, int i2) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        if (height <= i2 && width <= i) {
            return bitmap;
        }
        float f = ((float) i2) / ((float) height);
        float f2 = ((float) i) / ((float) width);
        if (f >= f2) {
            f = f2;
        }
        return scale(bitmap, f);
    }

    public static void compressToFile(Bitmap bitmap, String str) {
        compressToFile(bitmap, 90, str);
    }

    public static int computeInitialSampleSize(BitmapFactory.Options options, int i, int i2) {
        int i3;
        int i4;
        double d = (double) options.outWidth;
        double d2 = (double) options.outHeight;
        if (i2 == -1) {
            i3 = 1;
        } else {
            Double.isNaN(d);
            Double.isNaN(d2);
            double d3 = (double) i2;
            Double.isNaN(d3);
            i3 = (int) Math.ceil(Math.sqrt((d * d2) / d3));
        }
        if (i == -1) {
            i4 = 128;
        } else {
            double d4 = (double) i;
            Double.isNaN(d);
            Double.isNaN(d4);
            double floor = Math.floor(d / d4);
            Double.isNaN(d2);
            Double.isNaN(d4);
            i4 = (int) Math.min(floor, Math.floor(d2 / d4));
        }
        if (i4 < i3) {
            return i3;
        }
        if (i2 == -1 && i == -1) {
            return 1;
        }
        return i == -1 ? i3 : i4;
    }

    public static int computeSampleSize(BitmapFactory.Options options, int i, int i2) {
        int computeInitialSampleSize = computeInitialSampleSize(options, i, i2);
        if (computeInitialSampleSize > 8) {
            return ((computeInitialSampleSize + 7) / 8) * 8;
        }
        int i3 = 1;
        while (i3 < computeInitialSampleSize) {
            i3 <<= 1;
        }
        return i3;
    }

    public static Bitmap createBitmap(Context context, byte[] bArr, float f) {
        Bitmap bitmap;
        BitmapFactory.Options options = new BitmapFactory.Options();
        Bitmap bitmap2 = null;
        try {
            int min = Math.min(DensityUtils.getDisplayWidth(context), DensityUtils.getDisplayHeight(context));
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
            options.inSampleSize = computeSampleSize(options, min, 1048576);
            options.inJustDecodeBounds = false;
            bitmap2 = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
            bitmap = rotateBitmap(f, bitmap2);
        } catch (OutOfMemoryError e) {
            e.printStackTrace();
            if (bitmap2 != null && !bitmap2.isRecycled()) {
                bitmap2.recycle();
            }
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
            options.inSampleSize = computeSampleSize(options, -1, (options.outWidth * options.outHeight) / 4);
            options.inJustDecodeBounds = false;
            bitmap2 = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
            bitmap = rotateBitmap(f, bitmap2);
        }
        if (!(bitmap == bitmap2 || bitmap2 == null)) {
            bitmap2.recycle();
        }
        return bitmap;
    }

    public static Bitmap createLivenessBitmap(Context context, int[] iArr, Rect rect, Rect rect2, int i) {
        Bitmap bitmap;
        OutOfMemoryError e;
        Bitmap bitmap2 = null;
        try {
            new BitmapFactory.Options().inJustDecodeBounds = false;
            try {
                bitmap = Bitmap.createBitmap(Bitmap.createBitmap(iArr, rect.width(), rect.height(), Bitmap.Config.ARGB_8888), rect2.left, rect2.top, rect2.width(), rect2.height());
                bitmap2 = rotateBitmap((float) i, bitmap);
            } catch (OutOfMemoryError e2) {
                e = e2;
            }
        } catch (OutOfMemoryError e3) {
            e = e3;
            bitmap = null;
            e.printStackTrace();
            if (bitmap != null) {
                bitmap.recycle();
            }
            bitmap.recycle();
            return bitmap2;
        }
        if (!(bitmap2 == bitmap || bitmap == null)) {
            bitmap.recycle();
        }
        return bitmap2;
    }

    public static int decodeImageDegree(String str) {
        try {
            int attributeInt = new ExifInterface(str).getAttributeInt(androidx.exifinterface.media.ExifInterface.f14146OooO0oo, 1);
            if (attributeInt == 3) {
                return 180;
            }
            if (attributeInt == 6) {
                return 90;
            }
            if (attributeInt != 8) {
                return 0;
            }
            return 270;
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    public static boolean ensureDirectoryExist(File file) {
        if (file == null) {
            return false;
        }
        if (file.exists()) {
            return true;
        }
        try {
            file.mkdirs();
            return true;
        } catch (SecurityException unused) {
            return false;
        }
    }

    public static int getQuealityParams(Context context, String str) {
        if (str == null) {
        }
        return 50;
    }

    public static int getSizeParams(Context context, String str) {
        if (str == null) {
        }
        return 600;
    }

    public static String getTakePictureCacheDir(Context context) {
        File externalStorageDirectory = TextUtils.equals("mounted", Environment.getExternalStorageState()) ? Environment.getExternalStorageDirectory() : null;
        if (externalStorageDirectory != null) {
            return externalStorageDirectory.getAbsolutePath();
        }
        return null;
    }

    public static Bitmap loadBitmapFromFile(String str) {
        if (str == null) {
            return null;
        }
        try {
            return BitmapFactory.decodeFile(str);
        } catch (OutOfMemoryError e) {
            e.printStackTrace();
            return null;
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public static Bitmap rotateBitmap(float f, Bitmap bitmap) {
        Matrix matrix = new Matrix();
        if (f == 0.0f) {
            return bitmap;
        }
        matrix.setRotate(f);
        return Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x003d A[SYNTHETIC, Splitter:B:26:0x003d] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x004a A[SYNTHETIC, Splitter:B:34:0x004a] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.net.Uri saveTakePictureImage(byte[] r1, java.lang.String r2, java.lang.String r3) {
        /*
            java.io.File r0 = new java.io.File
            r0.<init>(r2, r3)
            r2 = 0
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x0022, all -> 0x0020 }
            r3.<init>(r0)     // Catch:{ Exception -> 0x0022, all -> 0x0020 }
            r3.write(r1)     // Catch:{ Exception -> 0x001e }
            r3.flush()     // Catch:{ Exception -> 0x001e }
            r3.close()     // Catch:{ IOException -> 0x0015 }
            goto L_0x0019
        L_0x0015:
            r1 = move-exception
            r1.printStackTrace()
        L_0x0019:
            android.net.Uri r1 = android.net.Uri.fromFile(r0)
            return r1
        L_0x001e:
            r1 = move-exception
            goto L_0x0024
        L_0x0020:
            r1 = move-exception
            goto L_0x0048
        L_0x0022:
            r1 = move-exception
            r3 = r2
        L_0x0024:
            r1.printStackTrace()     // Catch:{ all -> 0x0046 }
            boolean r1 = r0.exists()     // Catch:{ Exception -> 0x0037 }
            if (r1 == 0) goto L_0x003b
            boolean r1 = r0.isFile()     // Catch:{ Exception -> 0x0037 }
            if (r1 == 0) goto L_0x003b
            r0.delete()     // Catch:{ Exception -> 0x0037 }
            goto L_0x003b
        L_0x0037:
            r1 = move-exception
            r1.printStackTrace()
        L_0x003b:
            if (r3 == 0) goto L_0x0045
            r3.close()     // Catch:{ IOException -> 0x0041 }
            goto L_0x0045
        L_0x0041:
            r1 = move-exception
            r1.printStackTrace()
        L_0x0045:
            return r2
        L_0x0046:
            r1 = move-exception
            r2 = r3
        L_0x0048:
            if (r2 == 0) goto L_0x0052
            r2.close()     // Catch:{ IOException -> 0x004e }
            goto L_0x0052
        L_0x004e:
            r2 = move-exception
            r2.printStackTrace()
        L_0x0052:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baidu.idl.face.platform.utils.BitmapUtils.saveTakePictureImage(byte[], java.lang.String, java.lang.String):android.net.Uri");
    }

    public static boolean saveTakePictureResult(Context context, String str, Bitmap bitmap) {
        boolean z;
        String takePictureCacheDir = getTakePictureCacheDir(context);
        if (TextUtils.isEmpty(takePictureCacheDir)) {
            return false;
        }
        String str2 = takePictureCacheDir + File.separator + str;
        if (!ensureDirectoryExist(new File(str2))) {
            return false;
        }
        String format = String.format("B%s.%s", Long.valueOf(System.currentTimeMillis() / 1000), IMAGE_KEY_SUFFIX);
        File file = new File(str + File.separator + format);
        try {
            z = !file.exists() ? file.createNewFile() : true;
        } catch (IOException unused) {
            z = false;
        }
        if (!z) {
            return false;
        }
        compressToFile(bitmap, 100, str2 + File.separator + format);
        return true;
    }

    public static Bitmap scale(Bitmap bitmap, float f) {
        Matrix matrix = new Matrix();
        matrix.postScale(f, f);
        return Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
    }

    public static void compressToFile(Bitmap bitmap, int i, String str) {
        compressToFile(bitmap, Bitmap.CompressFormat.JPEG, i, str);
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x001f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void compressToFile(android.graphics.Bitmap r2, android.graphics.Bitmap.CompressFormat r3, int r4, java.lang.String r5) {
        /*
            java.io.File r0 = new java.io.File
            r0.<init>(r5)
            r5 = 0
            java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x0034, Exception -> 0x001f }
            r1.<init>(r0)     // Catch:{ IOException -> 0x0034, Exception -> 0x001f }
            r2.compress(r3, r4, r1)     // Catch:{ IOException -> 0x001a, Exception -> 0x0018, all -> 0x0015 }
            r1.flush()     // Catch:{ IOException -> 0x001a, Exception -> 0x0018, all -> 0x0015 }
            com.baidu.idl.face.platform.utils.IoUtils.closeQuietly(r1)
            goto L_0x004f
        L_0x0015:
            r2 = move-exception
            r5 = r1
            goto L_0x0050
        L_0x0018:
            r5 = r1
            goto L_0x001f
        L_0x001a:
            r2 = move-exception
            r5 = r1
            goto L_0x0035
        L_0x001d:
            r2 = move-exception
            goto L_0x0050
        L_0x001f:
            boolean r2 = r0.exists()     // Catch:{ Exception -> 0x002f }
            if (r2 == 0) goto L_0x004c
            boolean r2 = r0.isFile()     // Catch:{ Exception -> 0x002f }
            if (r2 == 0) goto L_0x004c
            r0.delete()     // Catch:{ Exception -> 0x002f }
            goto L_0x004c
        L_0x002f:
            r2 = move-exception
            r2.printStackTrace()     // Catch:{ all -> 0x001d }
            goto L_0x004c
        L_0x0034:
            r2 = move-exception
        L_0x0035:
            r2.printStackTrace()     // Catch:{ all -> 0x001d }
            boolean r2 = r0.exists()     // Catch:{ Exception -> 0x0048 }
            if (r2 == 0) goto L_0x004c
            boolean r2 = r0.isFile()     // Catch:{ Exception -> 0x0048 }
            if (r2 == 0) goto L_0x004c
            r0.delete()     // Catch:{ Exception -> 0x0048 }
            goto L_0x004c
        L_0x0048:
            r2 = move-exception
            r2.printStackTrace()
        L_0x004c:
            com.baidu.idl.face.platform.utils.IoUtils.closeQuietly(r5)
        L_0x004f:
            return
        L_0x0050:
            com.baidu.idl.face.platform.utils.IoUtils.closeQuietly(r5)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baidu.idl.face.platform.utils.BitmapUtils.compressToFile(android.graphics.Bitmap, android.graphics.Bitmap$CompressFormat, int, java.lang.String):void");
    }

    public static int decodeImageDegree(byte[] bArr) {
        return ImageExif.getOrientation(bArr);
    }

    public static Bitmap loadBitmapFromFile(Context context, String str) {
        if (str == null) {
            return null;
        }
        try {
            return createBitmap(context, str, decodeImageDegree(str));
        } catch (OutOfMemoryError e) {
            e.printStackTrace();
            return null;
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public static Bitmap scale(Bitmap bitmap, int i, int i2) {
        if (bitmap == null) {
            return null;
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        Matrix matrix = new Matrix();
        matrix.postScale(((float) i) / ((float) width), ((float) i2) / ((float) height));
        return Bitmap.createBitmap(bitmap, 0, 0, width, height, matrix, true);
    }

    public static String bitmapToJpegBase64(Context context, String str, Bitmap bitmap) {
        float sizeParams = ((float) getSizeParams(context, str)) * 1.0f;
        int quealityParams = getQuealityParams(context, str);
        try {
            float max = sizeParams / ((float) Math.max(bitmap.getWidth(), bitmap.getHeight()));
            if (max < 1.0f) {
                bitmap = scale(bitmap, max);
            }
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            bitmap.compress(Bitmap.CompressFormat.JPEG, quealityParams, byteArrayOutputStream);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            return Base64Utils.encodeToString(byteArray, 2);
        } catch (Exception unused) {
            return null;
        }
    }

    public static Bitmap createLivenessBitmap(Context context, int[] iArr, Rect rect) {
        try {
            return Bitmap.createBitmap(iArr, rect.width(), rect.height(), Bitmap.Config.ARGB_8888);
        } catch (OutOfMemoryError e) {
            e.printStackTrace();
            return null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0025 A[SYNTHETIC, Splitter:B:15:0x0025] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0031 A[SYNTHETIC, Splitter:B:23:0x0031] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String bitmapToJpegBase64(android.graphics.Bitmap r3, int r4) {
        /*
            r0 = 0
            java.io.ByteArrayOutputStream r1 = new java.io.ByteArrayOutputStream     // Catch:{ Exception -> 0x002e, all -> 0x0022 }
            r1.<init>()     // Catch:{ Exception -> 0x002e, all -> 0x0022 }
            android.graphics.Bitmap$CompressFormat r2 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch:{ Exception -> 0x0020, all -> 0x001d }
            r3.compress(r2, r4, r1)     // Catch:{ Exception -> 0x0020, all -> 0x001d }
            byte[] r3 = r1.toByteArray()     // Catch:{ Exception -> 0x0020, all -> 0x001d }
            r4 = 2
            java.lang.String r3 = com.baidu.idl.face.platform.utils.Base64Utils.encodeToString(r3, r4)     // Catch:{ Exception -> 0x0020, all -> 0x001d }
            r1.close()     // Catch:{ IOException -> 0x0018 }
            goto L_0x001c
        L_0x0018:
            r4 = move-exception
            r4.printStackTrace()
        L_0x001c:
            return r3
        L_0x001d:
            r3 = move-exception
            r0 = r1
            goto L_0x0023
        L_0x0020:
            goto L_0x002f
        L_0x0022:
            r3 = move-exception
        L_0x0023:
            if (r0 == 0) goto L_0x002d
            r0.close()     // Catch:{ IOException -> 0x0029 }
            goto L_0x002d
        L_0x0029:
            r4 = move-exception
            r4.printStackTrace()
        L_0x002d:
            throw r3
        L_0x002e:
            r1 = r0
        L_0x002f:
            if (r1 == 0) goto L_0x0039
            r1.close()     // Catch:{ IOException -> 0x0035 }
            goto L_0x0039
        L_0x0035:
            r3 = move-exception
            r3.printStackTrace()
        L_0x0039:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baidu.idl.face.platform.utils.BitmapUtils.bitmapToJpegBase64(android.graphics.Bitmap, int):java.lang.String");
    }

    public static Bitmap createBitmap(Context context, String str, int i) {
        Bitmap bitmap;
        BitmapFactory.Options options = new BitmapFactory.Options();
        Bitmap bitmap2 = null;
        try {
            int min = Math.min(DensityUtils.getDisplayWidth(context), DensityUtils.getDisplayHeight(context));
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeFile(str, options);
            options.inSampleSize = computeSampleSize(options, min, 1048576);
            options.inJustDecodeBounds = false;
            bitmap2 = BitmapFactory.decodeFile(str, options);
            bitmap = rotateBitmap((float) i, bitmap2);
        } catch (OutOfMemoryError e) {
            e.printStackTrace();
            if (bitmap2 != null) {
                bitmap2.recycle();
            }
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeFile(str, options);
            options.inSampleSize = computeSampleSize(options, -1, (options.outWidth * options.outHeight) / 4);
            options.inJustDecodeBounds = false;
            bitmap2 = BitmapFactory.decodeFile(str, options);
            bitmap = rotateBitmap((float) i, bitmap2);
        }
        if (!(bitmap == bitmap2 || bitmap2 == null)) {
            bitmap2.recycle();
        }
        return bitmap;
    }

    public static Bitmap createBitmap(Context context, byte[] bArr, int i) {
        Bitmap bitmap;
        BitmapFactory.Options options = new BitmapFactory.Options();
        Bitmap bitmap2 = null;
        try {
            Math.min(DensityUtils.getDisplayWidth(context), DensityUtils.getDisplayHeight(context));
            options.inJustDecodeBounds = false;
            bitmap2 = BitmapFactory.decodeByteArray(bArr, 0, bArr.length);
            bitmap = rotateBitmap((float) i, bitmap2);
        } catch (OutOfMemoryError e) {
            e.printStackTrace();
            if (bitmap2 != null) {
                bitmap2.recycle();
            }
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
            options.inSampleSize = computeSampleSize(options, -1, (options.outWidth * options.outHeight) / 4);
            options.inJustDecodeBounds = false;
            bitmap2 = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
            bitmap = rotateBitmap((float) i, bitmap2);
        }
        if (!(bitmap == bitmap2 || bitmap2 == null)) {
            bitmap2.recycle();
        }
        return bitmap;
    }

    public static Bitmap createBitmap(Context context, int[] iArr, Rect rect, Rect rect2, int i) {
        Bitmap bitmap;
        OutOfMemoryError e;
        Bitmap bitmap2 = null;
        try {
            new BitmapFactory.Options().inJustDecodeBounds = false;
            try {
                bitmap = Bitmap.createBitmap(Bitmap.createBitmap(iArr, rect.width(), rect.height(), Bitmap.Config.ARGB_8888), rect2.left, rect2.top, rect2.width(), rect2.height());
                bitmap2 = rotateBitmap((float) i, bitmap);
            } catch (OutOfMemoryError e2) {
                e = e2;
            }
        } catch (OutOfMemoryError e3) {
            e = e3;
            bitmap = null;
            e.printStackTrace();
            if (bitmap != null) {
                bitmap.recycle();
            }
            bitmap.recycle();
            return bitmap2;
        }
        if (!(bitmap2 == bitmap || bitmap == null)) {
            bitmap.recycle();
        }
        return bitmap2;
    }

    public static Bitmap createBitmap(Context context, int i, int i2, int[] iArr) {
        Bitmap bitmap;
        BitmapFactory.Options options = new BitmapFactory.Options();
        try {
            Math.min(DensityUtils.getDisplayWidth(context), DensityUtils.getDisplayHeight(context));
            options.inJustDecodeBounds = false;
            bitmap = Bitmap.createBitmap(iArr, i, i2, Bitmap.Config.RGB_565);
        } catch (OutOfMemoryError e) {
            e.printStackTrace();
            bitmap = null;
        }
        if (!(bitmap == null || bitmap == null)) {
            bitmap.recycle();
        }
        return null;
    }
}

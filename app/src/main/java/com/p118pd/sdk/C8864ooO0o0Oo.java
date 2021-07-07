package com.p118pd.sdk;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.pd.sdk.ooO0o0Oo  reason: case insensitive filesystem */
public class C8864ooO0o0Oo {
    public static Bitmap OooO00o(Resources resources, int i) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inPreferredConfig = Bitmap.Config.RGB_565;
        try {
            return BitmapFactory.decodeResource(resources, i, options);
        } catch (OutOfMemoryError e) {
            e.printStackTrace();
            return null;
        }
    }

    public static Bitmap OooO00o(String str) {
        return OooO00o(str, 1);
    }

    public static Bitmap OooO00o(InputStream inputStream) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inPreferredConfig = Bitmap.Config.RGB_565;
        try {
            if (inputStream.markSupported()) {
                inputStream.reset();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            return BitmapFactory.decodeStream(inputStream, null, options);
        } catch (OutOfMemoryError e2) {
            e2.printStackTrace();
            return null;
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static int[] m20497OooO00o(Resources resources, int i) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeResource(resources, i, options);
        return new int[]{options.outWidth, options.outHeight};
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static int[] m20499OooO00o(String str) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(str, options);
        return new int[]{options.outWidth, options.outHeight};
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static int[] m20498OooO00o(InputStream inputStream) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeStream(inputStream, null, options);
        return new int[]{options.outWidth, options.outHeight};
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0021 A[SYNTHETIC, Splitter:B:19:0x0021] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0032 A[SYNTHETIC, Splitter:B:26:0x0032] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int[] OooO00o(java.io.File r2) {
        /*
            r0 = 0
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch:{ FileNotFoundException -> 0x001b }
            r1.<init>(r2)     // Catch:{ FileNotFoundException -> 0x001b }
            int[] r2 = m20498OooO00o(r1)     // Catch:{ FileNotFoundException -> 0x0016, all -> 0x0013 }
            r1.close()     // Catch:{ IOException -> 0x000e }
            goto L_0x0012
        L_0x000e:
            r0 = move-exception
            r0.printStackTrace()
        L_0x0012:
            return r2
        L_0x0013:
            r2 = move-exception
            r0 = r1
            goto L_0x0030
        L_0x0016:
            r2 = move-exception
            r0 = r1
            goto L_0x001c
        L_0x0019:
            r2 = move-exception
            goto L_0x0030
        L_0x001b:
            r2 = move-exception
        L_0x001c:
            r2.printStackTrace()     // Catch:{ all -> 0x0019 }
            if (r0 == 0) goto L_0x0029
            r0.close()     // Catch:{ IOException -> 0x0025 }
            goto L_0x0029
        L_0x0025:
            r2 = move-exception
            r2.printStackTrace()
        L_0x0029:
            r2 = 2
            int[] r2 = new int[r2]
            r2 = {x003c: FILL_ARRAY_DATA  , data: [0, 0} // fill-array
            return r2
        L_0x0030:
            if (r0 == 0) goto L_0x003a
            r0.close()     // Catch:{ IOException -> 0x0036 }
            goto L_0x003a
        L_0x0036:
            r0 = move-exception
            r0.printStackTrace()
        L_0x003a:
            throw r2
            fill-array 0x003c: FILL_ARRAY_DATA  , data: [0, 0]
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p118pd.sdk.C8864ooO0o0Oo.OooO00o(java.io.File):int[]");
    }

    public static Bitmap OooO00o(Resources resources, int i, int i2) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inPreferredConfig = Bitmap.Config.RGB_565;
        options.inSampleSize = i2;
        try {
            return BitmapFactory.decodeResource(resources, i, options);
        } catch (OutOfMemoryError e) {
            e.printStackTrace();
            return null;
        }
    }

    public static Bitmap OooO00o(String str, int i) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inPreferredConfig = Bitmap.Config.RGB_565;
        options.inSampleSize = i;
        try {
            return BitmapFactory.decodeFile(str, options);
        } catch (OutOfMemoryError e) {
            e.printStackTrace();
            return null;
        }
    }

    public static Bitmap OooO00o(InputStream inputStream, int i) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inPreferredConfig = Bitmap.Config.RGB_565;
        options.inSampleSize = i;
        try {
            return BitmapFactory.decodeStream(inputStream, null, options);
        } catch (OutOfMemoryError e) {
            e.printStackTrace();
            return null;
        }
    }

    public static Bitmap OooO00o(File file, int i) {
        try {
            return OooO00o(new FileInputStream(file), i);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static int[] OooO00o(int[] iArr, int[][] iArr2, float f) {
        float f2 = 0.0f;
        float f3 = iArr[1] == 0 ? 0.0f : ((float) iArr[0]) / ((float) iArr[1]);
        if (iArr[0] != 0) {
            f2 = ((float) iArr[1]) / ((float) iArr[0]);
        }
        if (f3 >= f) {
            return iArr2[0];
        }
        if (f2 >= f) {
            return iArr2[1];
        }
        return iArr2[2];
    }
}

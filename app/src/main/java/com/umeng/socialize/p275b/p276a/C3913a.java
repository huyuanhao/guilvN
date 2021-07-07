package com.umeng.socialize.p275b.p276a;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.Build;
import com.umeng.socialize.media.UMImage;
import com.umeng.socialize.net.utils.SocializeNetUtils;
import com.umeng.socialize.p275b.p277b.C3914a;
import com.umeng.socialize.p275b.p277b.C3917b;
import com.umeng.socialize.p275b.p277b.C3919d;
import com.umeng.socialize.utils.DefaultClass;
import com.umeng.socialize.utils.SLog;
import com.umeng.socialize.utils.SocializeUtils;
import com.umeng.socialize.utils.UmengText;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/* renamed from: com.umeng.socialize.b.a.a */
public class C3913a {
    static {
        C3914a.m10782a();
    }

    /* renamed from: a */
    public static byte[] m10771a(UMImage uMImage, int i) {
        if (uMImage == null) {
            return DefaultClass.getBytes();
        }
        if (uMImage.asBinImage() == null || m10764a(uMImage) < i) {
            return uMImage.asBinImage();
        }
        if (uMImage.compressStyle == UMImage.CompressStyle.QUALITY) {
            return m10774a(uMImage.asBinImage(), i, uMImage.compressFormat);
        }
        try {
            byte[] asBinImage = uMImage.asBinImage();
            if (asBinImage == null) {
                return new byte[1];
            }
            if (asBinImage.length <= 0) {
                return uMImage.asBinImage();
            }
            Bitmap decodeByteArray = BitmapFactory.decodeByteArray(asBinImage, 0, asBinImage.length);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byteArrayOutputStream.write(asBinImage, 0, asBinImage.length);
            while (byteArrayOutputStream.toByteArray().length > i) {
                double length = (double) asBinImage.length;
                Double.isNaN(length);
                double d = (double) i;
                Double.isNaN(d);
                double sqrt = Math.sqrt((length * 1.0d) / d);
                double width = (double) decodeByteArray.getWidth();
                Double.isNaN(width);
                int i2 = (int) (width / sqrt);
                double height = (double) decodeByteArray.getHeight();
                Double.isNaN(height);
                decodeByteArray = Bitmap.createScaledBitmap(decodeByteArray, i2, (int) (height / sqrt), true);
                byteArrayOutputStream.reset();
                if (decodeByteArray != null) {
                    decodeByteArray.compress(uMImage.compressFormat, 100, byteArrayOutputStream);
                    asBinImage = byteArrayOutputStream.toByteArray();
                }
            }
            if (byteArrayOutputStream.toByteArray().length > i) {
                return null;
            }
            return asBinImage;
        } catch (Throwable th) {
            SLog.error(th);
            return DefaultClass.getBytes();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x004f A[SYNTHETIC, Splitter:B:27:0x004f] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0060 A[SYNTHETIC, Splitter:B:34:0x0060] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static byte[] m10777b(android.graphics.Bitmap r4, android.graphics.Bitmap.CompressFormat r5) {
        /*
        // Method dump skipped, instructions count: 108
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.socialize.p275b.p276a.C3913a.m10777b(android.graphics.Bitmap, android.graphics.Bitmap$CompressFormat):byte[]");
    }

    /* renamed from: c */
    public static String m10779c(byte[] bArr) {
        return C3919d.m10792a(bArr);
    }

    /* renamed from: d */
    public static BitmapFactory.Options m10780d(byte[] bArr) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
        int ceil = (int) Math.ceil((double) (options.outWidth / UMImage.MAX_WIDTH));
        int ceil2 = (int) Math.ceil((double) (options.outHeight / UMImage.MAX_HEIGHT));
        if (ceil2 <= 1 || ceil <= 1) {
            if (ceil2 > 2) {
                options.inSampleSize = ceil2;
            } else if (ceil > 2) {
                options.inSampleSize = ceil;
            }
        } else if (ceil2 > ceil) {
            options.inSampleSize = ceil2;
        } else {
            options.inSampleSize = ceil;
        }
        options.inJustDecodeBounds = false;
        return options;
    }

    /* renamed from: e */
    public static int m10781e(byte[] bArr) {
        if (bArr != null) {
            return bArr.length;
        }
        return 0;
    }

    /* renamed from: b */
    public static File m10776b(byte[] bArr) {
        try {
            return m10768a(bArr, C3917b.m10787a().mo40265b());
        } catch (IOException e) {
            SLog.error(UmengText.IMAGE.BINARYTOFILE, e);
            return null;
        }
    }

    /* renamed from: b */
    public static byte[] m10778b(File file, Bitmap.CompressFormat compressFormat) {
        if (file != null && file.getAbsoluteFile().exists()) {
            byte[] a = C3917b.m10787a().mo40264a(file);
            if (SocializeUtils.assertBinaryInvalid(a)) {
                if (C3919d.f10714m[1].equals(C3919d.m10792a(a))) {
                    return a;
                }
                return m10775a(a, compressFormat);
            }
        }
        return null;
    }

    /* renamed from: a */
    public static byte[] m10773a(String str) {
        return SocializeNetUtils.getNetData(str);
    }

    /* renamed from: a */
    public static Bitmap m10767a(byte[] bArr) {
        if (bArr != null) {
            return BitmapFactory.decodeByteArray(bArr, 0, bArr.length);
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0022  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x002f A[SYNTHETIC, Splitter:B:21:0x002f] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.io.File m10768a(byte[] r3, java.io.File r4) {
        /*
            r0 = 0
            java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x001a }
            r1.<init>(r4)     // Catch:{ Exception -> 0x001a }
            java.io.BufferedOutputStream r2 = new java.io.BufferedOutputStream     // Catch:{ Exception -> 0x001a }
            r2.<init>(r1)     // Catch:{ Exception -> 0x001a }
            r2.write(r3)     // Catch:{ Exception -> 0x0015, all -> 0x0012 }
            r2.close()     // Catch:{ IOException -> 0x0026 }
            goto L_0x002c
        L_0x0012:
            r3 = move-exception
            r0 = r2
            goto L_0x002d
        L_0x0015:
            r3 = move-exception
            r0 = r2
            goto L_0x001b
        L_0x0018:
            r3 = move-exception
            goto L_0x002d
        L_0x001a:
            r3 = move-exception
        L_0x001b:
            java.lang.String r1 = com.umeng.socialize.utils.UmengText.IMAGE.GET_FILE_FROM_BINARY     // Catch:{ all -> 0x0018 }
            com.umeng.socialize.utils.SLog.error(r1, r3)     // Catch:{ all -> 0x0018 }
            if (r0 == 0) goto L_0x002c
            r0.close()
            goto L_0x002c
        L_0x0026:
            r3 = move-exception
            java.lang.String r0 = com.umeng.socialize.utils.UmengText.IMAGE.CLOSE
            com.umeng.socialize.utils.SLog.error(r0, r3)
        L_0x002c:
            return r4
        L_0x002d:
            if (r0 == 0) goto L_0x0039
            r0.close()     // Catch:{ IOException -> 0x0033 }
            goto L_0x0039
        L_0x0033:
            r4 = move-exception
            java.lang.String r0 = com.umeng.socialize.utils.UmengText.IMAGE.CLOSE
            com.umeng.socialize.utils.SLog.error(r0, r4)
        L_0x0039:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.socialize.p275b.p276a.C3913a.m10768a(byte[], java.io.File):java.io.File");
    }

    /* renamed from: a */
    public static byte[] m10770a(Bitmap bitmap, Bitmap.CompressFormat compressFormat) {
        return m10777b(bitmap, compressFormat);
    }

    /* renamed from: a */
    public static Bitmap m10766a(Drawable drawable) {
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        Bitmap createBitmap = Bitmap.createBitmap(intrinsicWidth, intrinsicHeight, drawable.getOpacity() != -1 ? Bitmap.Config.ARGB_8888 : Bitmap.Config.RGB_565);
        Canvas canvas = new Canvas(createBitmap);
        drawable.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
        drawable.draw(canvas);
        return createBitmap;
    }

    /* renamed from: a */
    public static byte[] m10769a(Context context, int i, boolean z, Bitmap.CompressFormat compressFormat) {
        Drawable drawable;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        if (!z) {
            Resources resources = context.getResources();
            if (Build.VERSION.SDK_INT >= 21) {
                drawable = resources.getDrawable(i, null);
            } else {
                drawable = resources.getDrawable(i);
            }
            Bitmap a = m10766a(drawable);
            if (a != null) {
                a.compress(compressFormat, 100, byteArrayOutputStream);
            }
            return byteArrayOutputStream.toByteArray();
        }
        byte[] bArr = new byte[0];
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inPreferredConfig = Bitmap.Config.RGB_565;
            Bitmap decodeStream = BitmapFactory.decodeStream(context.getResources().openRawResource(i), null, options);
            if (decodeStream != null) {
                decodeStream.compress(compressFormat, 100, byteArrayOutputStream);
            }
            return byteArrayOutputStream.toByteArray();
        } catch (Error e) {
            SLog.error(UmengText.IMAGE.TOOBIG, e);
            return bArr;
        }
    }

    /* renamed from: a */
    public static byte[] m10772a(File file, Bitmap.CompressFormat compressFormat) {
        return m10778b(file, compressFormat);
    }

    /* renamed from: a */
    public static int m10764a(UMImage uMImage) {
        if (uMImage.getImageStyle() == UMImage.FILE_IMAGE) {
            return m10765a(uMImage.asFileImage());
        }
        return m10781e(uMImage.asBinImage());
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0041 A[SYNTHETIC, Splitter:B:24:0x0041] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static byte[] m10775a(byte[] r4, android.graphics.Bitmap.CompressFormat r5) {
        /*
            r0 = 0
            android.graphics.BitmapFactory$Options r1 = m10780d(r4)     // Catch:{ Exception -> 0x0030, all -> 0x002e }
            r2 = 0
            int r3 = r4.length     // Catch:{ Exception -> 0x0030, all -> 0x002e }
            android.graphics.Bitmap r4 = android.graphics.BitmapFactory.decodeByteArray(r4, r2, r3, r1)     // Catch:{ Exception -> 0x0030, all -> 0x002e }
            java.io.ByteArrayOutputStream r1 = new java.io.ByteArrayOutputStream     // Catch:{ Exception -> 0x0030, all -> 0x002e }
            r1.<init>()     // Catch:{ Exception -> 0x0030, all -> 0x002e }
            if (r4 == 0) goto L_0x001d
            r2 = 100
            r4.compress(r5, r2, r1)     // Catch:{ Exception -> 0x002c }
            r4.recycle()     // Catch:{ Exception -> 0x002c }
            java.lang.System.gc()     // Catch:{ Exception -> 0x002c }
        L_0x001d:
            byte[] r0 = r1.toByteArray()     // Catch:{ Exception -> 0x002c }
            r1.close()     // Catch:{ IOException -> 0x0025 }
            goto L_0x003c
        L_0x0025:
            r4 = move-exception
            java.lang.String r5 = com.umeng.socialize.utils.UmengText.IMAGE.CLOSE
            com.umeng.socialize.utils.SLog.error(r5, r4)
            goto L_0x003c
        L_0x002c:
            r4 = move-exception
            goto L_0x0032
        L_0x002e:
            r4 = move-exception
            goto L_0x003f
        L_0x0030:
            r4 = move-exception
            r1 = r0
        L_0x0032:
            java.lang.String r5 = com.umeng.socialize.utils.UmengText.IMAGE.FILE_TO_BINARY_ERROR     // Catch:{ all -> 0x003d }
            com.umeng.socialize.utils.SLog.error(r5, r4)     // Catch:{ all -> 0x003d }
            if (r1 == 0) goto L_0x003c
            r1.close()
        L_0x003c:
            return r0
        L_0x003d:
            r4 = move-exception
            r0 = r1
        L_0x003f:
            if (r0 == 0) goto L_0x004b
            r0.close()     // Catch:{ IOException -> 0x0045 }
            goto L_0x004b
        L_0x0045:
            r5 = move-exception
            java.lang.String r0 = com.umeng.socialize.utils.UmengText.IMAGE.CLOSE
            com.umeng.socialize.utils.SLog.error(r0, r5)
        L_0x004b:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.socialize.p275b.p276a.C3913a.m10775a(byte[], android.graphics.Bitmap$CompressFormat):byte[]");
    }

    /* renamed from: a */
    public static byte[] m10774a(byte[] bArr, int i, Bitmap.CompressFormat compressFormat) {
        if (bArr == null || bArr.length < i) {
            return bArr;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        boolean z = false;
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length);
        int i2 = 1;
        while (!z && i2 <= 10) {
            int pow = (int) (Math.pow(0.8d, (double) i2) * 100.0d);
            if (decodeByteArray != null) {
                decodeByteArray.compress(compressFormat, pow, byteArrayOutputStream);
            }
            if (byteArrayOutputStream.size() < i) {
                z = true;
            } else {
                byteArrayOutputStream.reset();
                i2++;
            }
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        if (!decodeByteArray.isRecycled()) {
            decodeByteArray.recycle();
        }
        if (byteArray != null && byteArray.length <= 0) {
            SLog.m10856E(UmengText.IMAGE.THUMB_ERROR);
        }
        return byteArray;
    }

    /* renamed from: a */
    public static int m10765a(File file) {
        if (file == null) {
            return 0;
        }
        try {
            return new FileInputStream(file).available();
        } catch (Throwable th) {
            SLog.error(UmengText.IMAGE.GET_IMAGE_SCALE_ERROR, th);
            return 0;
        }
    }
}

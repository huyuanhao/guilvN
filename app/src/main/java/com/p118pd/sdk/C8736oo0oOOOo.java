package com.p118pd.sdk;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.ExifInterface;
import android.net.Uri;
import android.os.Environment;
import android.util.Base64;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

/* renamed from: com.pd.sdk.oo0oOOOo  reason: case insensitive filesystem */
public class C8736oo0oOOOo {
    public static final int OooO00o = 1024;

    public static boolean OooO00o(Context context, String str, String str2) {
        File file;
        try {
            if ("mounted".equals(Environment.getExternalStorageState())) {
                File externalStoragePublicDirectory = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES);
                if (externalStoragePublicDirectory.exists()) {
                    file = new File(externalStoragePublicDirectory.getAbsolutePath() + File.separator + C8742oo0oOo00.m20365OooO00o(context, "APP_NAME"));
                } else {
                    file = C8742oo0oOo00.OooO00o(context, C8742oo0oOo00.m20365OooO00o(context, "APP_NAME"));
                }
                if (!file.exists()) {
                    file.mkdirs();
                }
                File file2 = new File(file, str2 + ".png");
                FileOutputStream fileOutputStream = new FileOutputStream(file2);
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(Base64.decode(str, 0));
                byte[] bArr = new byte[1024];
                while (true) {
                    int read = byteArrayInputStream.read(bArr);
                    if (read != -1) {
                        fileOutputStream.write(bArr, 0, read);
                    } else {
                        byteArrayInputStream.close();
                        fileOutputStream.close();
                        Intent intent = new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE");
                        intent.setData(Uri.fromFile(file2));
                        context.sendBroadcast(intent);
                        return true;
                    }
                }
            }
        } catch (Exception unused) {
        }
        return false;
    }

    public static final Bitmap OooO0O0(String str) {
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            httpURLConnection.setDoInput(true);
            httpURLConnection.connect();
            return BitmapFactory.decodeStream(httpURLConnection.getInputStream());
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e2) {
            e2.printStackTrace();
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0029 A[SYNTHETIC, Splitter:B:14:0x0029] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0039 A[SYNTHETIC, Splitter:B:21:0x0039] */
    /* JADX WARNING: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /* renamed from: OooO0O0  reason: collision with other method in class */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m20354OooO0O0(android.graphics.Bitmap r3, int r4) {
        /*
            r0 = 0
            if (r3 == 0) goto L_0x0045
            java.io.ByteArrayOutputStream r1 = new java.io.ByteArrayOutputStream     // Catch:{ IOException -> 0x0022, all -> 0x0020 }
            r1.<init>()     // Catch:{ IOException -> 0x0022, all -> 0x0020 }
            android.graphics.Bitmap$CompressFormat r2 = android.graphics.Bitmap.CompressFormat.PNG     // Catch:{ IOException -> 0x001e }
            r3.compress(r2, r4, r1)     // Catch:{ IOException -> 0x001e }
            r1.flush()     // Catch:{ IOException -> 0x001e }
            r1.close()     // Catch:{ IOException -> 0x001e }
            byte[] r3 = r1.toByteArray()     // Catch:{ IOException -> 0x001e }
            r4 = 0
            java.lang.String r3 = android.util.Base64.encodeToString(r3, r4)     // Catch:{ IOException -> 0x001e }
            r0 = r1
            goto L_0x0046
        L_0x001e:
            r3 = move-exception
            goto L_0x0024
        L_0x0020:
            r3 = move-exception
            goto L_0x0037
        L_0x0022:
            r3 = move-exception
            r1 = r0
        L_0x0024:
            r3.printStackTrace()     // Catch:{ all -> 0x0035 }
            if (r1 == 0) goto L_0x0054
            r1.flush()     // Catch:{ IOException -> 0x0030 }
            r1.close()     // Catch:{ IOException -> 0x0030 }
            goto L_0x0054
        L_0x0030:
            r3 = move-exception
            r3.printStackTrace()
            goto L_0x0054
        L_0x0035:
            r3 = move-exception
            r0 = r1
        L_0x0037:
            if (r0 == 0) goto L_0x0044
            r0.flush()     // Catch:{ IOException -> 0x0040 }
            r0.close()     // Catch:{ IOException -> 0x0040 }
            goto L_0x0044
        L_0x0040:
            r4 = move-exception
            r4.printStackTrace()
        L_0x0044:
            throw r3
        L_0x0045:
            r3 = r0
        L_0x0046:
            if (r0 == 0) goto L_0x0053
            r0.flush()     // Catch:{ IOException -> 0x004f }
            r0.close()     // Catch:{ IOException -> 0x004f }
            goto L_0x0053
        L_0x004f:
            r4 = move-exception
            r4.printStackTrace()
        L_0x0053:
            r0 = r3
        L_0x0054:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p118pd.sdk.C8736oo0oOOOo.m20354OooO0O0(android.graphics.Bitmap, int):java.lang.String");
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static Bitmap m20350OooO00o(String str) {
        byte[] decode = Base64.decode(str, 0);
        return BitmapFactory.decodeByteArray(decode, 0, decode.length);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static String m20351OooO00o(Bitmap bitmap) {
        return m20352OooO00o(bitmap, 60);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0029 A[SYNTHETIC, Splitter:B:14:0x0029] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0039 A[SYNTHETIC, Splitter:B:21:0x0039] */
    /* JADX WARNING: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /* renamed from: OooO00o  reason: collision with other method in class */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m20352OooO00o(android.graphics.Bitmap r3, int r4) {
        /*
            r0 = 0
            if (r3 == 0) goto L_0x0045
            java.io.ByteArrayOutputStream r1 = new java.io.ByteArrayOutputStream     // Catch:{ IOException -> 0x0022, all -> 0x0020 }
            r1.<init>()     // Catch:{ IOException -> 0x0022, all -> 0x0020 }
            android.graphics.Bitmap$CompressFormat r2 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch:{ IOException -> 0x001e }
            r3.compress(r2, r4, r1)     // Catch:{ IOException -> 0x001e }
            r1.flush()     // Catch:{ IOException -> 0x001e }
            r1.close()     // Catch:{ IOException -> 0x001e }
            byte[] r3 = r1.toByteArray()     // Catch:{ IOException -> 0x001e }
            r4 = 0
            java.lang.String r3 = android.util.Base64.encodeToString(r3, r4)     // Catch:{ IOException -> 0x001e }
            r0 = r1
            goto L_0x0046
        L_0x001e:
            r3 = move-exception
            goto L_0x0024
        L_0x0020:
            r3 = move-exception
            goto L_0x0037
        L_0x0022:
            r3 = move-exception
            r1 = r0
        L_0x0024:
            r3.printStackTrace()     // Catch:{ all -> 0x0035 }
            if (r1 == 0) goto L_0x0054
            r1.flush()     // Catch:{ IOException -> 0x0030 }
            r1.close()     // Catch:{ IOException -> 0x0030 }
            goto L_0x0054
        L_0x0030:
            r3 = move-exception
            r3.printStackTrace()
            goto L_0x0054
        L_0x0035:
            r3 = move-exception
            r0 = r1
        L_0x0037:
            if (r0 == 0) goto L_0x0044
            r0.flush()     // Catch:{ IOException -> 0x0040 }
            r0.close()     // Catch:{ IOException -> 0x0040 }
            goto L_0x0044
        L_0x0040:
            r4 = move-exception
            r4.printStackTrace()
        L_0x0044:
            throw r3
        L_0x0045:
            r3 = r0
        L_0x0046:
            if (r0 == 0) goto L_0x0053
            r0.flush()     // Catch:{ IOException -> 0x004f }
            r0.close()     // Catch:{ IOException -> 0x004f }
            goto L_0x0053
        L_0x004f:
            r4 = move-exception
            r4.printStackTrace()
        L_0x0053:
            r0 = r3
        L_0x0054:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p118pd.sdk.C8736oo0oOOOo.m20352OooO00o(android.graphics.Bitmap, int):java.lang.String");
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0029  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0026  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Bitmap OooO0O0(android.graphics.Bitmap r7, int r8) {
        /*
            android.graphics.Matrix r5 = new android.graphics.Matrix
            r5.<init>()
            float r8 = (float) r8
            r5.postRotate(r8)
            r1 = 0
            r2 = 0
            int r3 = r7.getWidth()     // Catch:{ OutOfMemoryError -> 0x001f, Exception -> 0x001a }
            int r4 = r7.getHeight()     // Catch:{ OutOfMemoryError -> 0x001f, Exception -> 0x001a }
            r6 = 1
            r0 = r7
            android.graphics.Bitmap r8 = android.graphics.Bitmap.createBitmap(r0, r1, r2, r3, r4, r5, r6)     // Catch:{ OutOfMemoryError -> 0x001f, Exception -> 0x001a }
            goto L_0x0024
        L_0x001a:
            r8 = move-exception
            r8.printStackTrace()
            goto L_0x0023
        L_0x001f:
            r8 = move-exception
            r8.printStackTrace()
        L_0x0023:
            r8 = 0
        L_0x0024:
            if (r8 != 0) goto L_0x0027
            r8 = r7
        L_0x0027:
            if (r7 == r8) goto L_0x002c
            r7.recycle()
        L_0x002c:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p118pd.sdk.C8736oo0oOOOo.OooO0O0(android.graphics.Bitmap, int):android.graphics.Bitmap");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x004a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Bitmap OooO00o(android.content.Context r9, android.net.Uri r10) throws java.io.FileNotFoundException, java.io.IOException {
        /*
        // Method dump skipped, instructions count: 115
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p118pd.sdk.C8736oo0oOOOo.OooO00o(android.content.Context, android.net.Uri):android.graphics.Bitmap");
    }

    public static int OooO00o(String str) {
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
        } catch (IOException e) {
            e.printStackTrace();
            return 0;
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static String m20353OooO00o(String str) {
        return OooO00o(str, 1024);
    }

    public static String OooO00o(String str, String str2) {
        return OooO00o(str, str2, 1024);
    }

    public static String OooO00o(String str, int i) {
        return OooO00o(str, (String) null, i);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x006c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String OooO00o(java.lang.String r7, java.lang.String r8, int r9) {
        /*
        // Method dump skipped, instructions count: 138
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p118pd.sdk.C8736oo0oOOOo.OooO00o(java.lang.String, java.lang.String, int):java.lang.String");
    }

    public static String OooO00o(Bitmap bitmap, int i, String str) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i2 = 100;
        bitmap.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream);
        while (byteArrayOutputStream.toByteArray().length / 1024 > i && i2 > 60) {
            byteArrayOutputStream.reset();
            bitmap.compress(Bitmap.CompressFormat.JPEG, i2, byteArrayOutputStream);
            i2 -= 5;
        }
        FileOutputStream fileOutputStream = null;
        try {
            FileOutputStream fileOutputStream2 = new FileOutputStream(new File(str));
            try {
                fileOutputStream2.write(byteArrayOutputStream.toByteArray());
                fileOutputStream2.flush();
                fileOutputStream2.close();
            } catch (IOException unused) {
                fileOutputStream = fileOutputStream2;
            }
        } catch (IOException unused2) {
            if (fileOutputStream != null) {
                try {
                    fileOutputStream.close();
                } catch (Exception unused3) {
                }
            }
            byteArrayOutputStream.reset();
            return str;
        }
        return str;
    }

    public static Bitmap OooO00o(Bitmap bitmap) {
        return OooO00o(bitmap, 1024);
    }

    public static Bitmap OooO00o(Bitmap bitmap, int i) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            int i2 = 100;
            bitmap.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream);
            while (byteArrayOutputStream.toByteArray().length / 1024 > i && i2 > 60) {
                byteArrayOutputStream.reset();
                bitmap.compress(Bitmap.CompressFormat.JPEG, i2, byteArrayOutputStream);
                i2 -= 5;
            }
            return BitmapFactory.decodeStream(new ByteArrayInputStream(byteArrayOutputStream.toByteArray()), null, null);
        } catch (Exception unused) {
            return null;
        }
    }
}

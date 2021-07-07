package com.xiaomi.push.service;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import com.xiaomi.channel.commonutils.logger.AbstractC4163b;
import com.xiaomi.push.C4285bf;
import com.xiaomi.push.C4692x;
import com.xiaomi.push.C4693y;
import java.io.ByteArrayInputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.xiaomi.push.service.ag */
public class C4602ag {

    /* renamed from: a */
    public static long f13157a;

    /* renamed from: com.xiaomi.push.service.ag$a */
    public static class C4603a {

        /* renamed from: a */
        public int f13158a;

        /* renamed from: a */
        public byte[] f13159a;

        public C4603a(byte[] bArr, int i) {
            this.f13159a = bArr;
            this.f13158a = i;
        }
    }

    /* renamed from: com.xiaomi.push.service.ag$b */
    public static class C4604b {

        /* renamed from: a */
        public long f13160a;

        /* renamed from: a */
        public Bitmap f13161a;

        public C4604b(Bitmap bitmap, long j) {
            this.f13161a = bitmap;
            this.f13160a = j;
        }
    }

    /* renamed from: a */
    public static int m13912a(Context context, InputStream inputStream) {
        int i;
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeStream(inputStream, null, options);
        if (options.outWidth == -1 || options.outHeight == -1) {
            AbstractC4163b.m11301a("decode dimension failed for bitmap.");
            return 1;
        }
        int round = Math.round((((float) context.getResources().getDisplayMetrics().densityDpi) / 160.0f) * 48.0f);
        int i2 = options.outWidth;
        if (i2 <= round || (i = options.outHeight) <= round) {
            return 1;
        }
        return Math.min(i2 / round, i / round);
    }

    /* renamed from: a */
    public static Bitmap m13913a(Context context, String str) {
        Throwable th;
        InputStream inputStream;
        IOException e;
        InputStream inputStream2;
        int a;
        Uri parse = Uri.parse(str);
        InputStream inputStream3 = null;
        try {
            inputStream = context.getContentResolver().openInputStream(parse);
            try {
                a = m13912a(context, inputStream);
                inputStream2 = context.getContentResolver().openInputStream(parse);
            } catch (IOException e2) {
                e = e2;
                inputStream2 = null;
                try {
                    AbstractC4163b.m11303a(e);
                    C4693y.m14236a(inputStream2);
                    C4693y.m14236a(inputStream);
                    return null;
                } catch (Throwable th2) {
                    th = th2;
                    inputStream3 = inputStream2;
                    C4693y.m14236a(inputStream3);
                    C4693y.m14236a(inputStream);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                C4693y.m14236a(inputStream3);
                C4693y.m14236a(inputStream);
                throw th;
            }
            try {
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inSampleSize = a;
                Bitmap decodeStream = BitmapFactory.decodeStream(inputStream2, null, options);
                C4693y.m14236a(inputStream2);
                C4693y.m14236a(inputStream);
                return decodeStream;
            } catch (IOException e3) {
                e = e3;
                AbstractC4163b.m11303a(e);
                C4693y.m14236a(inputStream2);
                C4693y.m14236a(inputStream);
                return null;
            }
        } catch (IOException e4) {
            e = e4;
            inputStream2 = null;
            inputStream = null;
            AbstractC4163b.m11303a(e);
            C4693y.m14236a(inputStream2);
            C4693y.m14236a(inputStream);
            return null;
        } catch (Throwable th4) {
            th = th4;
            inputStream = null;
            C4693y.m14236a(inputStream3);
            C4693y.m14236a(inputStream);
            throw th;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00dd, code lost:
        if (r1 == null) goto L_0x00ff;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00df, code lost:
        r1.disconnect();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x00fc, code lost:
        if (r1 == null) goto L_0x00ff;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x00ff, code lost:
        return null;
     */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0107  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.xiaomi.push.service.C4602ag.C4603a m13914a(java.lang.String r10, boolean r11) {
        /*
        // Method dump skipped, instructions count: 269
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.service.C4602ag.m13914a(java.lang.String, boolean):com.xiaomi.push.service.ag$a");
    }

    /* renamed from: a */
    public static C4604b m13915a(Context context, String str, boolean z) {
        Throwable th;
        Exception e;
        ByteArrayInputStream byteArrayInputStream = null;
        C4604b bVar = new C4604b(null, 0);
        Bitmap b = m13918b(context, str);
        if (b != null) {
            bVar.f13161a = b;
            return bVar;
        }
        try {
            C4603a a = m13914a(str, z);
            if (a == null) {
                C4693y.m14236a((Closeable) null);
                return bVar;
            }
            bVar.f13160a = (long) a.f13158a;
            byte[] bArr = a.f13159a;
            if (bArr != null) {
                if (z) {
                    ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(bArr);
                    try {
                        int a2 = m13912a(context, byteArrayInputStream2);
                        BitmapFactory.Options options = new BitmapFactory.Options();
                        options.inSampleSize = a2;
                        bVar.f13161a = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
                        byteArrayInputStream = byteArrayInputStream2;
                    } catch (Exception e2) {
                        e = e2;
                        byteArrayInputStream = byteArrayInputStream2;
                        try {
                            AbstractC4163b.m11303a(e);
                            C4693y.m14236a(byteArrayInputStream);
                            return bVar;
                        } catch (Throwable th2) {
                            th = th2;
                            C4693y.m14236a(byteArrayInputStream);
                            throw th;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        byteArrayInputStream = byteArrayInputStream2;
                        C4693y.m14236a(byteArrayInputStream);
                        throw th;
                    }
                } else {
                    bVar.f13161a = BitmapFactory.decodeByteArray(bArr, 0, bArr.length);
                }
            }
            m13917a(context, a.f13159a, str);
            C4693y.m14236a(byteArrayInputStream);
            return bVar;
        } catch (Exception e3) {
            e = e3;
            AbstractC4163b.m11303a(e);
            C4693y.m14236a(byteArrayInputStream);
            return bVar;
        }
    }

    /* renamed from: a */
    public static void m13916a(Context context) {
        File file = new File(context.getCacheDir().getPath() + File.separator + "mipush_icon");
        if (file.exists()) {
            if (f13157a == 0) {
                f13157a = C4692x.m14234a(file);
            }
            if (f13157a > 15728640) {
                try {
                    File[] listFiles = file.listFiles();
                    for (int i = 0; i < listFiles.length; i++) {
                        if (!listFiles[i].isDirectory() && Math.abs(System.currentTimeMillis() - listFiles[i].lastModified()) > 1209600) {
                            listFiles[i].delete();
                        }
                    }
                } catch (Exception e) {
                    AbstractC4163b.m11303a(e);
                }
                f13157a = 0;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m13917a(android.content.Context r5, byte[] r6, java.lang.String r7) {
        /*
        // Method dump skipped, instructions count: 177
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.service.C4602ag.m13917a(android.content.Context, byte[], java.lang.String):void");
    }

    /* renamed from: b */
    public static Bitmap m13918b(Context context, String str) {
        Throwable th;
        Bitmap bitmap;
        Exception e;
        File file = new File(context.getCacheDir().getPath() + File.separator + "mipush_icon", C4285bf.m11800a(str));
        FileInputStream fileInputStream = null;
        Bitmap bitmap2 = null;
        if (!file.exists()) {
            return null;
        }
        try {
            FileInputStream fileInputStream2 = new FileInputStream(file);
            try {
                bitmap2 = BitmapFactory.decodeStream(fileInputStream2);
                file.setLastModified(System.currentTimeMillis());
                C4693y.m14236a(fileInputStream2);
                return bitmap2;
            } catch (Exception e2) {
                e = e2;
                fileInputStream = fileInputStream2;
                bitmap = bitmap2;
                try {
                    AbstractC4163b.m11303a(e);
                    C4693y.m14236a(fileInputStream);
                    return bitmap;
                } catch (Throwable th2) {
                    th = th2;
                    fileInputStream2 = fileInputStream;
                    C4693y.m14236a(fileInputStream2);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                C4693y.m14236a(fileInputStream2);
                throw th;
            }
        } catch (Exception e3) {
            e = e3;
            bitmap = null;
            AbstractC4163b.m11303a(e);
            C4693y.m14236a(fileInputStream);
            return bitmap;
        }
    }
}

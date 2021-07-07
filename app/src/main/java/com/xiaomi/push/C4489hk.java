package com.xiaomi.push;

import android.content.Context;
import android.content.SharedPreferences;
import com.xiaomi.channel.commonutils.logger.AbstractC4163b;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;

/* renamed from: com.xiaomi.push.hk */
public class C4489hk {

    /* renamed from: a */
    public static boolean f12171a;

    /* renamed from: com.xiaomi.push.hk$a */
    public static class RunnableC4490a implements Runnable {

        /* renamed from: a */
        public Context f12172a;

        /* renamed from: a */
        public AbstractC4493hn f12173a;

        public RunnableC4490a(Context context, AbstractC4493hn hnVar) {
            this.f12173a = hnVar;
            this.f12172a = context;
        }

        public void run() {
            C4489hk.m12914c(this.f12172a, this.f12173a);
        }
    }

    /* renamed from: a */
    public static void m12909a(Context context) {
        File file = new File(context.getFilesDir() + "/tdReadTemp");
        if (!file.exists()) {
            file.mkdirs();
        }
    }

    /* renamed from: a */
    public static void m12910a(Context context, AbstractC4493hn hnVar) {
        C4251ai.m11641a(context).mo41474a(new RunnableC4490a(context, hnVar));
    }

    /* renamed from: a */
    public static void m12911a(Context context, AbstractC4493hn hnVar, File file, byte[] bArr) {
        Throwable th;
        Exception e;
        String str;
        int a;
        ArrayList arrayList = new ArrayList();
        byte[] bArr2 = new byte[4];
        BufferedInputStream bufferedInputStream = null;
        try {
            BufferedInputStream bufferedInputStream2 = new BufferedInputStream(new FileInputStream(file));
            loop0:
            while (true) {
                int i = 0;
                int i2 = 0;
                while (true) {
                    try {
                        int read = bufferedInputStream2.read(bArr2);
                        if (read == -1) {
                            break loop0;
                        } else if (read != 4) {
                            str = "TinyData read from cache file failed cause lengthBuffer error. size:" + read;
                            break loop0;
                        } else {
                            a = C4245ac.m11630a(bArr2);
                            if (a < 1 || a > 10240) {
                                str = "TinyData read from cache file failed cause lengthBuffer < 1 || too big. length:" + a;
                            } else {
                                byte[] bArr3 = new byte[a];
                                int read2 = bufferedInputStream2.read(bArr3);
                                if (read2 != a) {
                                    str = "TinyData read from cache file failed cause buffer size not equal length. size:" + read2 + "__length:" + a;
                                    break loop0;
                                }
                                byte[] a2 = C4475h.m12856a(bArr, bArr3);
                                if (a2 == null || a2.length == 0) {
                                    AbstractC4163b.m11306d("TinyData read from cache file failed cause decrypt fail");
                                } else {
                                    C4498hs hsVar = new C4498hs();
                                    C4531iy.m13589a(hsVar, a2);
                                    arrayList.add(hsVar);
                                    i++;
                                    i2 += a2.length;
                                    if (i >= 8 || i2 >= 10240) {
                                        AbstractC4163b.m11301a("TinyData readTinyDataFromFile upload tiny data by part. items:" + arrayList.size() + " ts:" + System.currentTimeMillis());
                                        C4491hl.m12917a(context, hnVar, arrayList);
                                        arrayList = new ArrayList();
                                    }
                                }
                            }
                        }
                    } catch (Exception e2) {
                        e = e2;
                        bufferedInputStream = bufferedInputStream2;
                        try {
                            AbstractC4163b.m11303a(e);
                            C4693y.m14236a(bufferedInputStream);
                        } catch (Throwable th2) {
                            th = th2;
                            C4693y.m14236a(bufferedInputStream);
                            throw th;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        bufferedInputStream = bufferedInputStream2;
                        C4693y.m14236a(bufferedInputStream);
                        throw th;
                    }
                }
            }
            str = "TinyData read from cache file failed cause lengthBuffer < 1 || too big. length:" + a;
            AbstractC4163b.m11306d(str);
            C4491hl.m12917a(context, hnVar, arrayList);
            AbstractC4163b.m11301a("TinyData readTinyDataFromFile upload tiny data at last. items:" + arrayList.size() + " ts:" + System.currentTimeMillis());
            if (file != null && file.exists() && !file.delete()) {
                AbstractC4163b.m11301a("TinyData delete reading temp file failed");
            }
            C4693y.m14236a(bufferedInputStream2);
        } catch (Exception e3) {
            e = e3;
            AbstractC4163b.m11303a(e);
            C4693y.m14236a(bufferedInputStream);
        }
    }

    /* renamed from: b */
    public static void m12912b(Context context) {
        SharedPreferences.Editor edit = context.getSharedPreferences("mipush_extra", 4).edit();
        edit.putLong("last_tiny_data_upload_timestamp", System.currentTimeMillis() / 1000);
        edit.commit();
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x00b7  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00bb  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m12914c(android.content.Context r11, com.xiaomi.push.AbstractC4493hn r12) {
        /*
        // Method dump skipped, instructions count: 227
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.C4489hk.m12914c(android.content.Context, com.xiaomi.push.hn):void");
    }
}

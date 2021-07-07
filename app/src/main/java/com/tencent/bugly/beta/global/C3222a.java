package com.tencent.bugly.beta.global;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PaintFlagsDrawFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Parcelable;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import com.tencent.bugly.beta.utils.C3250c;
import com.tencent.bugly.crashreport.common.info.C3269a;
import com.tencent.bugly.proguard.C3321an;
import com.tencent.bugly.proguard.C3325ap;
import com.tencent.bugly.proguard.C3360p;
import com.umeng.socialize.net.dplus.CommonNetImpl;
import java.io.File;
import java.util.Map;

/* renamed from: com.tencent.bugly.beta.global.a */
public class C3222a {
    /* renamed from: a */
    public static int m7751a(Context context) {
        TelephonyManager telephonyManager;
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo == null) {
                return 0;
            }
            if (activeNetworkInfo.getType() == 1) {
                return 1;
            }
            if (activeNetworkInfo.getType() == 0 && (telephonyManager = (TelephonyManager) context.getSystemService("phone")) != null) {
                switch (telephonyManager.getNetworkType()) {
                    case 1:
                    case 2:
                    case 4:
                    case 7:
                    case 11:
                        return 2;
                    case 3:
                    case 5:
                    case 6:
                    case 8:
                    case 9:
                    case 10:
                    case 12:
                    case 14:
                    case 15:
                        return 3;
                    case 13:
                        return 4;
                    default:
                        return 0;
                }
            }
            return 0;
        } catch (Exception e) {
            if (!C3321an.m8350a(e)) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: b */
    public static String m7766b(String str) {
        return new C3250c(str).mo38058a();
    }

    /* renamed from: b */
    public static String m7767b(String str, String str2) {
        SharedPreferences sharedPreferences = C3226e.f7357E.f7359A;
        return sharedPreferences != null ? sharedPreferences.getString(str, str2) : str2;
    }

    /* renamed from: b */
    public static boolean m7768b(String str, boolean z) {
        SharedPreferences sharedPreferences = C3226e.f7357E.f7359A;
        return sharedPreferences != null ? sharedPreferences.getBoolean(str, z) : z;
    }

    /* renamed from: a */
    public static int m7752a(Context context, float f) {
        return (int) ((f * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    /* renamed from: a */
    public static BitmapDrawable m7755a(Bitmap bitmap, int i, int i2, float f) {
        DisplayMetrics displayMetrics = C3226e.f7357E.f7360B;
        int i3 = (int) (((float) (displayMetrics.widthPixels * displayMetrics.heightPixels)) * 0.8f);
        if (bitmap == null || i * i2 > i3) {
            return null;
        }
        Bitmap createBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint();
        Rect rect = new Rect(0, 0, i, i2);
        RectF rectF = new RectF(rect);
        canvas.setDrawFilter(new PaintFlagsDrawFilter(0, 3));
        canvas.drawARGB(0, 0, 0, 0);
        paint.setColor(-16777216);
        canvas.drawRoundRect(rectF, f, f, paint);
        canvas.drawRect(0.0f, f, (float) i, (float) i2, paint);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        canvas.drawBitmap(bitmap, new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight()), rect, paint);
        return new BitmapDrawable(createBitmap);
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0053 A[Catch:{ Exception -> 0x003a }] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00f1  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00f6  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00ff  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Bitmap m7753a(android.content.Context r18, int r19, java.lang.Object... r20) {
        /*
        // Method dump skipped, instructions count: 274
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.bugly.beta.global.C3222a.m7753a(android.content.Context, int, java.lang.Object[]):android.graphics.Bitmap");
    }

    /* renamed from: a */
    public static boolean m7761a(Context context, File file, String str) {
        if (file != null) {
            try {
                if (file.exists() && file.getName().endsWith(".apk")) {
                    String a = C3325ap.m8390a(file, "MD5");
                    if (TextUtils.isEmpty(str) || TextUtils.equals(str.toUpperCase(), a)) {
                        Runtime.getRuntime().exec("chmod 777 " + file.getAbsolutePath());
                        Intent intent = new Intent("android.intent.action.VIEW");
                        if (Build.VERSION.SDK_INT >= 24) {
                            intent.addFlags(1);
                            if (Class.forName("androidx.core.content.FileProvider") == null) {
                                C3321an.m8357e("can't find class android.support.v4.content.FileProvider", new Object[0]);
                                return false;
                            }
                            Uri uri = (Uri) C3325ap.m8384a("androidx.core.content.FileProvider", "getUriForFile", null, new Class[]{Context.class, String.class, File.class}, new Object[]{context, C3269a.m7965a(context).f7680d + ".fileProvider", file});
                            if (uri == null) {
                                C3321an.m8357e("file location is " + file.toString(), new Object[0]);
                                C3321an.m8357e("install failed, contentUri is null!", new Object[0]);
                                return false;
                            }
                            C3321an.m8355c("contentUri is " + uri, new Object[0]);
                            intent.setDataAndType(uri, "application/vnd.android.package-archive");
                        } else {
                            intent.setDataAndType(Uri.fromFile(file), "application/vnd.android.package-archive");
                        }
                        intent.addFlags(CommonNetImpl.FLAG_AUTH);
                        context.startActivity(intent);
                        m7759a("installApkMd5", a);
                        return true;
                    }
                    C3321an.m8349a("md5 error [file md5: %s] [target md5: %s]", a, str);
                    return false;
                }
            } catch (Exception e) {
                if (!C3321an.m8353b(e)) {
                    e.printStackTrace();
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m7763a(File file, String str, String str2) {
        if (file != null) {
            try {
                if (file.exists()) {
                    String a = C3325ap.m8390a(file, str2);
                    if (!TextUtils.isEmpty(str)) {
                        if (TextUtils.equals(str.toUpperCase(), a)) {
                            return true;
                        }
                    }
                    C3321an.m8349a("checkFileUniqueId failed [file  uniqueId %s] [target uniqueId %s]", a, str);
                    return false;
                }
            } catch (Exception unused) {
                C3321an.m8357e("checkFileUniqueId exception", new Object[0]);
            }
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0059 A[SYNTHETIC, Splitter:B:44:0x0059] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0061 A[Catch:{ IOException -> 0x005d }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m7762a(java.io.File r3, java.io.File r4) {
        /*
        // Method dump skipped, instructions count: 106
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.bugly.beta.global.C3222a.m7762a(java.io.File, java.io.File):boolean");
    }

    /* renamed from: a */
    public static Bitmap m7754a(Drawable drawable) {
        Bitmap bitmap;
        if (drawable instanceof BitmapDrawable) {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            if (bitmapDrawable.getBitmap() != null) {
                return bitmapDrawable.getBitmap();
            }
        }
        if (drawable.getIntrinsicWidth() <= 0 || drawable.getIntrinsicHeight() <= 0) {
            bitmap = Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
        } else {
            bitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
        }
        Canvas canvas = new Canvas(bitmap);
        drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        drawable.draw(canvas);
        return bitmap;
    }

    /* renamed from: a */
    public static void m7758a(File file) {
        File[] listFiles;
        if (file != null && file.exists() && file.isDirectory() && (listFiles = file.listFiles()) != null && listFiles.length > 0) {
            for (File file2 : listFiles) {
                if (!file2.delete()) {
                    C3321an.m8357e("cannot delete file:%s", file2.getAbsolutePath());
                }
            }
        }
    }

    /* renamed from: a */
    public static synchronized <T extends Parcelable> boolean m7765a(String str, T t) {
        synchronized (C3222a.class) {
            boolean z = false;
            if (t == null) {
                return false;
            }
            byte[] a = C3325ap.m8407a(t);
            if (a != null && C3360p.f8238a.mo38498a(1002, str, a)) {
                z = true;
            }
            return z;
        }
    }

    /* renamed from: a */
    public static synchronized <T extends Parcelable> T m7756a(String str, Parcelable.Creator<T> creator) {
        synchronized (C3222a.class) {
            Map<String, byte[]> c = C3360p.f8238a.mo38504c();
            if (c == null) {
                return null;
            }
            byte[] bArr = c.get(str);
            if (bArr == null || bArr.length <= 0) {
                return null;
            }
            return (T) ((Parcelable) C3325ap.m8385a(bArr, creator));
        }
    }

    /* renamed from: a */
    public static synchronized boolean m7764a(String str) {
        boolean c;
        synchronized (C3222a.class) {
            c = C3360p.f8238a.mo38505c(str);
        }
        return c;
    }

    /* renamed from: a */
    public static void m7759a(String str, String str2) {
        SharedPreferences sharedPreferences = C3226e.f7357E.f7359A;
        if (sharedPreferences != null) {
            sharedPreferences.edit().putString(str, str2).apply();
        }
    }

    /* renamed from: a */
    public static void m7760a(String str, boolean z) {
        SharedPreferences sharedPreferences = C3226e.f7357E.f7359A;
        if (sharedPreferences != null) {
            sharedPreferences.edit().putBoolean(str, z).apply();
        }
    }

    /* renamed from: a */
    public static String m7757a(Context context, String str) {
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
            if (applicationInfo == null) {
                return null;
            }
            if (applicationInfo.metaData == null) {
                return null;
            }
            Object obj = applicationInfo.metaData.get(str);
            if (obj != null) {
                return String.valueOf(obj);
            }
            return null;
        } catch (Exception e) {
            C3321an.m8354c(C3222a.class, "getManifestMetaDataValue exception:" + e.getMessage(), new Object[0]);
            return null;
        }
    }
}

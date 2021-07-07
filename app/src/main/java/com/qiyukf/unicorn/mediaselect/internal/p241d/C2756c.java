package com.qiyukf.unicorn.mediaselect.internal.p241d;

import android.app.Activity;
import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Point;
import android.media.ExifInterface;
import android.net.Uri;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import com.p118pd.sdk.C9058ooOoOoOO;
import com.qiyukf.unicorn.C2364R;
import com.qiyukf.unicorn.mediaselect.EnumC2731b;
import com.qiyukf.unicorn.mediaselect.internal.p238a.C2742c;
import com.qiyukf.unicorn.mediaselect.internal.p238a.C2743d;
import com.qiyukf.unicorn.mediaselect.internal.p238a.C2745e;
import com.qiyukf.unicorn.mediaselect.p235b.AbstractC2732a;
import com.xiaomi.mipush.sdk.Constants;
import java.io.IOException;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Iterator;
import java.util.Locale;

/* renamed from: com.qiyukf.unicorn.mediaselect.internal.d.c */
public final class C2756c {

    /* renamed from: a */
    public static final String f5722a = "c";

    public C2756c() {
        throw new AssertionError("oops! the utility class is about to be instantiated...");
    }

    /* renamed from: a */
    public static float m6384a(long j) {
        DecimalFormat decimalFormat = (DecimalFormat) NumberFormat.getNumberInstance(Locale.US);
        decimalFormat.applyPattern("0.0");
        String format = decimalFormat.format((double) ((((float) j) / 1024.0f) / 1024.0f));
        String str = "getSizeInMB: " + format;
        return Float.valueOf(format.replaceAll(Constants.ACCEPT_TIME_SEPARATOR_SP, C9058ooOoOoOO.OooOO0)).floatValue();
    }

    /* renamed from: a */
    public static Point m6385a(Uri uri, Activity activity) {
        ContentResolver contentResolver = activity.getContentResolver();
        Point b = m6388b(contentResolver, uri);
        int i = b.x;
        int i2 = b.y;
        if (m6389c(contentResolver, uri)) {
            i = b.y;
            i2 = b.x;
        }
        if (i2 == 0) {
            return new Point(1600, 1600);
        }
        DisplayMetrics displayMetrics = new DisplayMetrics();
        activity.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        float f = (float) i;
        float f2 = ((float) displayMetrics.widthPixels) / f;
        float f3 = (float) i2;
        float f4 = ((float) displayMetrics.heightPixels) / f3;
        return f2 > f4 ? new Point((int) (f * f2), (int) (f3 * f4)) : new Point((int) (f * f2), (int) (f3 * f4));
    }

    /* renamed from: a */
    public static C2742c m6386a(Context context, C2743d dVar) {
        boolean z;
        if (context != null) {
            ContentResolver contentResolver = context.getContentResolver();
            Iterator<EnumC2731b> it = C2745e.m6339a().f5674a.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (it.next().mo36484a(contentResolver, dVar.f5671c)) {
                        z = true;
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        z = false;
        if (!z) {
            return new C2742c(context.getString(C2364R.string.ysf_error_file_type));
        }
        if (C2745e.m6339a().f5683j == null) {
            return null;
        }
        for (AbstractC2732a aVar : C2745e.m6339a().f5683j) {
            C2742c a = aVar.mo36486a(context, dVar);
            if (a != null) {
                return a;
            }
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0044  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m6387a(android.content.ContentResolver r9, android.net.Uri r10) {
        /*
            java.lang.String r0 = "_data"
            r1 = 0
            if (r10 != 0) goto L_0x0006
            return r1
        L_0x0006:
            java.lang.String r2 = r10.getScheme()
            java.lang.String r3 = "content"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x0048
            r2 = 1
            java.lang.String[] r5 = new java.lang.String[r2]     // Catch:{ all -> 0x0041 }
            r2 = 0
            r5[r2] = r0     // Catch:{ all -> 0x0041 }
            r6 = 0
            r7 = 0
            r8 = 0
            r3 = r9
            r4 = r10
            android.database.Cursor r9 = r3.query(r4, r5, r6, r7, r8)     // Catch:{ all -> 0x0041 }
            if (r9 == 0) goto L_0x003b
            boolean r10 = r9.moveToFirst()     // Catch:{ all -> 0x0038 }
            if (r10 != 0) goto L_0x002a
            goto L_0x003b
        L_0x002a:
            int r10 = r9.getColumnIndex(r0)     // Catch:{ all -> 0x0038 }
            java.lang.String r10 = r9.getString(r10)     // Catch:{ all -> 0x0038 }
            if (r9 == 0) goto L_0x0037
            r9.close()
        L_0x0037:
            return r10
        L_0x0038:
            r10 = move-exception
            r1 = r9
            goto L_0x0042
        L_0x003b:
            if (r9 == 0) goto L_0x0040
            r9.close()
        L_0x0040:
            return r1
        L_0x0041:
            r10 = move-exception
        L_0x0042:
            if (r1 == 0) goto L_0x0047
            r1.close()
        L_0x0047:
            throw r10
        L_0x0048:
            java.lang.String r9 = r10.getPath()
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.qiyukf.unicorn.mediaselect.internal.p241d.C2756c.m6387a(android.content.ContentResolver, android.net.Uri):java.lang.String");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0037, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0038, code lost:
        r4.printStackTrace();
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x002b */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0033 A[SYNTHETIC, Splitter:B:19:0x0033] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x003e A[SYNTHETIC, Splitter:B:25:0x003e] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Point m6388b(android.content.ContentResolver r3, android.net.Uri r4) {
        /*
            r0 = 0
            android.graphics.BitmapFactory$Options r1 = new android.graphics.BitmapFactory$Options     // Catch:{ FileNotFoundException -> 0x002b }
            r1.<init>()     // Catch:{ FileNotFoundException -> 0x002b }
            r2 = 1
            r1.inJustDecodeBounds = r2     // Catch:{ FileNotFoundException -> 0x002b }
            java.io.InputStream r3 = r3.openInputStream(r4)     // Catch:{ FileNotFoundException -> 0x002b }
            android.graphics.BitmapFactory.decodeStream(r3, r0, r1)     // Catch:{ FileNotFoundException -> 0x0027, all -> 0x0024 }
            int r4 = r1.outWidth     // Catch:{ FileNotFoundException -> 0x0027, all -> 0x0024 }
            int r0 = r1.outHeight     // Catch:{ FileNotFoundException -> 0x0027, all -> 0x0024 }
            android.graphics.Point r1 = new android.graphics.Point     // Catch:{ FileNotFoundException -> 0x0027, all -> 0x0024 }
            r1.<init>(r4, r0)     // Catch:{ FileNotFoundException -> 0x0027, all -> 0x0024 }
            if (r3 == 0) goto L_0x0023
            r3.close()     // Catch:{ IOException -> 0x001f }
            goto L_0x0023
        L_0x001f:
            r3 = move-exception
            r3.printStackTrace()
        L_0x0023:
            return r1
        L_0x0024:
            r4 = move-exception
            r0 = r3
            goto L_0x003c
        L_0x0027:
            r0 = r3
            goto L_0x002b
        L_0x0029:
            r4 = move-exception
            goto L_0x003c
        L_0x002b:
            android.graphics.Point r3 = new android.graphics.Point     // Catch:{ all -> 0x0029 }
            r4 = 0
            r3.<init>(r4, r4)     // Catch:{ all -> 0x0029 }
            if (r0 == 0) goto L_0x003b
            r0.close()     // Catch:{ IOException -> 0x0037 }
            goto L_0x003b
        L_0x0037:
            r4 = move-exception
            r4.printStackTrace()
        L_0x003b:
            return r3
        L_0x003c:
            if (r0 == 0) goto L_0x0046
            r0.close()     // Catch:{ IOException -> 0x0042 }
            goto L_0x0046
        L_0x0042:
            r3 = move-exception
            r3.printStackTrace()
        L_0x0046:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.qiyukf.unicorn.mediaselect.internal.p241d.C2756c.m6388b(android.content.ContentResolver, android.net.Uri):android.graphics.Point");
    }

    /* renamed from: c */
    public static boolean m6389c(ContentResolver contentResolver, Uri uri) {
        try {
            String a = m6387a(contentResolver, uri);
            if (!TextUtils.isEmpty(a)) {
                int attributeInt = new ExifInterface(a).getAttributeInt(androidx.exifinterface.media.ExifInterface.f14146OooO0oo, -1);
                return attributeInt == 6 || attributeInt == 8;
            }
            throw new NullPointerException("filename should not be null");
        } catch (IOException unused) {
            String str = "could not read exif info of the image: " + uri;
            return false;
        }
    }
}

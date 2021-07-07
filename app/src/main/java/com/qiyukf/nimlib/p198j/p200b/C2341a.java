package com.qiyukf.nimlib.p198j.p200b;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.ThumbnailUtils;
import android.net.Uri;
import android.text.TextUtils;
import com.qiyukf.basesdk.p138c.p139a.C1806a;
import com.qiyukf.basesdk.p138c.p143d.C1862c;
import java.io.File;

/* renamed from: com.qiyukf.nimlib.j.b.a */
public final class C2341a {
    /* renamed from: a */
    public static Bitmap m5084a(Uri uri) {
        int[] iArr = {C1862c.m3539a() << 1, C1862c.m3542b()};
        int[] iArr2 = {C1862c.m3539a(), C1862c.m3542b() << 1};
        double a = (double) C1862c.m3539a();
        Double.isNaN(a);
        double b = (double) C1862c.m3542b();
        Double.isNaN(b);
        int[] b2 = m5091b(uri);
        int[] a2 = m5089a(b2, new int[][]{iArr, iArr2, new int[]{(int) (a * 1.414d), (int) (b * 1.414d)}});
        int i = b2[0];
        int i2 = b2[1];
        int a3 = C2344c.m5103a(C2344c.m5104a(i, i2, a2[0], a2[1]), i, i2);
        Bitmap a4 = m5085a(uri, a3);
        int i3 = 5;
        while (a4 == null && i3 > 0) {
            a3++;
            i3--;
            a4 = m5085a(uri, a3);
        }
        return a4;
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0044 A[SYNTHETIC, Splitter:B:24:0x0044] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0062 A[SYNTHETIC, Splitter:B:33:0x0062] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0074 A[SYNTHETIC, Splitter:B:42:0x0074] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0081 A[SYNTHETIC, Splitter:B:50:0x0081] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Bitmap m5085a(android.net.Uri r5, int r6) {
        /*
        // Method dump skipped, instructions count: 138
        */
        throw new UnsupportedOperationException("Method not decompiled: com.qiyukf.nimlib.p198j.p200b.C2341a.m5085a(android.net.Uri, int):android.graphics.Bitmap");
    }

    /* renamed from: a */
    public static Bitmap m5086a(String str, int i, boolean z) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inPreferredConfig = z ? Bitmap.Config.ARGB_8888 : Bitmap.Config.RGB_565;
        if (i > 2) {
            i -= 2;
        }
        options.inSampleSize = i;
        try {
            return BitmapFactory.decodeFile(str, options);
        } catch (OutOfMemoryError e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: a */
    public static boolean m5087a(String str, String str2, int i, int i2) {
        if (!TextUtils.isEmpty(str2) && new File(str2).exists()) {
            return false;
        }
        C1806a.m3411a(ThumbnailUtils.extractThumbnail(ThumbnailUtils.createVideoThumbnail(str, 1), i, i2, 2), str2);
        return true;
    }

    /* renamed from: a */
    public static int[] m5088a(String str) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(str, options);
        return new int[]{options.outWidth, options.outHeight};
    }

    /* renamed from: a */
    public static int[] m5089a(int[] iArr, int[][] iArr2) {
        float f = 0.0f;
        float f2 = iArr[1] == 0 ? 0.0f : ((float) iArr[0]) / ((float) iArr[1]);
        if (iArr[0] != 0) {
            f = ((float) iArr[1]) / ((float) iArr[0]);
        }
        return f2 >= 5.0f ? iArr2[0] : f >= 5.0f ? iArr2[1] : iArr2[2];
    }

    /* renamed from: b */
    public static Bitmap m5090b(String str) {
        int[] iArr = {C1862c.m3539a() << 1, C1862c.m3542b()};
        int[] iArr2 = {C1862c.m3539a(), C1862c.m3542b() << 1};
        double a = (double) C1862c.m3539a();
        Double.isNaN(a);
        double b = (double) C1862c.m3542b();
        Double.isNaN(b);
        int[] a2 = m5088a(str);
        int[] a3 = m5089a(a2, new int[][]{iArr, iArr2, new int[]{(int) (a * 1.414d), (int) (b * 1.414d)}});
        int i = a2[0];
        int i2 = a2[1];
        int a4 = C2344c.m5103a(C2344c.m5104a(i, i2, a3[0], a3[1]), i, i2);
        Bitmap a5 = m5086a(str, a4, true);
        int i3 = 5;
        while (a5 == null && i3 > 0) {
            a4++;
            i3--;
            a5 = m5086a(str, a4, true);
        }
        return a5;
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x005a A[SYNTHETIC, Splitter:B:30:0x005a] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x006a A[SYNTHETIC, Splitter:B:37:0x006a] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int[] m5091b(android.net.Uri r6) {
        /*
        // Method dump skipped, instructions count: 124
        */
        throw new UnsupportedOperationException("Method not decompiled: com.qiyukf.nimlib.p198j.p200b.C2341a.m5091b(android.net.Uri):int[]");
    }
}

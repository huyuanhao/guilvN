package com.qiyukf.nimlib.p198j.p200b;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.media.ExifInterface;
import android.text.TextUtils;
import com.baidu.idl.face.platform.utils.BitmapUtils;
import com.p118pd.sdk.C9058ooOoOoOO;
import com.qiyukf.basesdk.p138c.p139a.C1806a;
import com.qiyukf.basesdk.p138c.p139a.C1807b;
import com.qiyukf.basesdk.p138c.p142c.C1853d;
import com.qiyukf.basesdk.p138c.p143d.C1862c;
import com.qiyukf.nim.uikit.session.viewholder.AbstractC2098i;
import com.qiyukf.nimlib.C2180b;
import com.qiyukf.nimlib.p198j.p201c.C2349d;
import com.qiyukf.nimlib.p198j.p201c.EnumC2347c;
import com.qiyukf.unicorn.C2364R;
import java.io.File;
import java.io.IOException;

/* renamed from: com.qiyukf.nimlib.j.b.b */
public final class C2342b {

    /* renamed from: com.qiyukf.nimlib.j.b.b$a */
    public static class C2343a {

        /* renamed from: a */
        public int f4693a = 0;

        /* renamed from: b */
        public int f4694b = 0;

        public C2343a(int i, int i2) {
            this.f4693a = i;
            this.f4694b = i2;
        }
    }

    /* renamed from: a */
    public static int m5092a(String str) {
        try {
            int attributeInt = new ExifInterface(str).getAttributeInt(androidx.exifinterface.media.ExifInterface.f14146OooO0oo, 1);
            if (attributeInt == 3) {
                return 180;
            }
            if (attributeInt != 6) {
                return attributeInt != 8 ? 0 : 270;
            }
            return 90;
        } catch (IOException unused) {
            return 0;
        }
    }

    /* renamed from: a */
    public static Bitmap m5093a() {
        try {
            return m5095a(C2180b.m4471a().getResources(), C2364R.C2366drawable.ysf_image_placeholder_fail);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: a */
    public static Bitmap m5094a(int i) {
        try {
            return m5095a(C2180b.m4471a().getResources(), i);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: a */
    public static Bitmap m5095a(Resources resources, int i) {
        Drawable drawable = resources.getDrawable(i);
        return ((drawable == null || !(drawable instanceof BitmapDrawable)) ? null : ((BitmapDrawable) drawable).getBitmap()).copy(Bitmap.Config.ARGB_8888, false);
    }

    /* renamed from: a */
    public static Bitmap m5096a(String str, Bitmap bitmap) {
        if (TextUtils.isEmpty(str) || bitmap == null) {
            return null;
        }
        try {
            int a = m5092a(str);
            if (a == 0) {
                return bitmap;
            }
            Matrix matrix = new Matrix();
            matrix.postRotate((float) a);
            Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, false);
            if (createBitmap == null) {
                return bitmap;
            }
            if (!bitmap.isRecycled()) {
                bitmap.recycle();
            }
            return createBitmap;
        } catch (OutOfMemoryError e) {
            e.printStackTrace();
            return bitmap;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001e, code lost:
        if (r4 > r5) goto L_0x0032;
     */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0034  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.qiyukf.nimlib.p198j.p200b.C2342b.C2343a m5097a(float r3, float r4, float r5, float r6) {
        /*
            r0 = 0
            int r1 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r1 <= 0) goto L_0x003f
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 > 0) goto L_0x000a
            goto L_0x003f
        L_0x000a:
            int r0 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
            if (r0 >= 0) goto L_0x0013
            r0 = 0
            r2 = r4
            r4 = r3
            r3 = r2
            goto L_0x0014
        L_0x0013:
            r0 = 1
        L_0x0014:
            int r1 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r1 >= 0) goto L_0x0021
            float r3 = r6 / r3
            float r4 = r4 * r3
            int r3 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r3 <= 0) goto L_0x0031
            goto L_0x0032
        L_0x0021:
            int r1 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r1 <= 0) goto L_0x0030
            float r4 = r5 / r4
            float r3 = r3 * r4
            int r4 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r4 >= 0) goto L_0x002e
            goto L_0x0032
        L_0x002e:
            r6 = r3
            goto L_0x0032
        L_0x0030:
            r6 = r3
        L_0x0031:
            r5 = r4
        L_0x0032:
            if (r0 == 0) goto L_0x0037
            r2 = r6
            r6 = r5
            r5 = r2
        L_0x0037:
            com.qiyukf.nimlib.j.b.b$a r3 = new com.qiyukf.nimlib.j.b.b$a
            int r4 = (int) r5
            int r5 = (int) r6
            r3.<init>(r4, r5)
            return r3
        L_0x003f:
            com.qiyukf.nimlib.j.b.b$a r3 = new com.qiyukf.nimlib.j.b.b$a
            int r4 = (int) r6
            r3.<init>(r4, r4)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.qiyukf.nimlib.p198j.p200b.C2342b.m5097a(float, float, float, float):com.qiyukf.nimlib.j.b.b$a");
    }

    /* renamed from: a */
    public static File m5098a(File file, String str) {
        String path = file.getPath();
        String lowerCase = str.toLowerCase();
        if (!(lowerCase.contains(BitmapUtils.IMAGE_KEY_SUFFIX) || lowerCase.contains("jpeg") || lowerCase.toLowerCase().contains("png") || lowerCase.toLowerCase().contains("bmp") || lowerCase.toLowerCase().contains("gif"))) {
            return null;
        }
        String a = C1807b.m3416a(path);
        File a2 = C1806a.m3409a(C2349d.m5123a("temp_image_" + C1853d.m3514a() + C9058ooOoOoOO.OooOO0 + a, EnumC2347c.TYPE_TEMP));
        if (a2 != null && m5100a(file, a2, Bitmap.CompressFormat.JPEG).booleanValue()) {
            return a2;
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0102, code lost:
        if (r1.isRecycled() == false) goto L_0x0104;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0104, code lost:
        r1.recycle();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x014a, code lost:
        if (r1.isRecycled() == false) goto L_0x0104;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x016f, code lost:
        if (r1.isRecycled() == false) goto L_0x0104;
     */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x0177 A[SYNTHETIC, Splitter:B:102:0x0177] */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0130 A[SYNTHETIC, Splitter:B:72:0x0130] */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0146  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0155 A[SYNTHETIC, Splitter:B:87:0x0155] */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x016b  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.Boolean m5099a(java.io.File r16, java.io.File r17, int r18, int r19, android.graphics.Bitmap.CompressFormat r20) {
        /*
        // Method dump skipped, instructions count: 409
        */
        throw new UnsupportedOperationException("Method not decompiled: com.qiyukf.nimlib.p198j.p200b.C2342b.m5099a(java.io.File, java.io.File, int, int, android.graphics.Bitmap$CompressFormat):java.lang.Boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00b0, code lost:
        r12 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00b1, code lost:
        r12.printStackTrace();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00b5, code lost:
        r12 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00b6, code lost:
        r12.printStackTrace();
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00b5 A[ExcHandler: Exception (r12v1 'e' java.lang.Exception A[CUSTOM_DECLARE]), Splitter:B:1:0x0005] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.Boolean m5100a(java.io.File r12, java.io.File r13, android.graphics.Bitmap.CompressFormat r14) {
        /*
        // Method dump skipped, instructions count: 186
        */
        throw new UnsupportedOperationException("Method not decompiled: com.qiyukf.nimlib.p198j.p200b.C2342b.m5100a(java.io.File, java.io.File, android.graphics.Bitmap$CompressFormat):java.lang.Boolean");
    }

    /* renamed from: a */
    public static String m5101a(File file) {
        String a = C2349d.m5123a(file.getName(), EnumC2347c.TYPE_THUMB_IMAGE);
        File a2 = C1806a.m3409a(a);
        if (a2 == null) {
            return null;
        }
        if (m5099a(file, a2, C1862c.m3540a(140.0f), AbstractC2098i.m4260c(), Bitmap.CompressFormat.JPEG).booleanValue()) {
            return a;
        }
        C1806a.m3412b(a);
        return null;
    }
}

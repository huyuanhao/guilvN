package com.qiyukf.nim.uikit.common.media.picker.p149b;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import com.qiyukf.basesdk.p119a.C1709a;
import com.qiyukf.nimlib.p198j.p200b.C2342b;

/* renamed from: com.qiyukf.nim.uikit.common.media.picker.b.a */
public final class C1908a {
    /* renamed from: a */
    public static Bitmap m3662a(Bitmap bitmap, String str) {
        String str2;
        Throwable e;
        String str3;
        int a = C2342b.m5092a(str);
        if (a == 0) {
            return bitmap;
        }
        try {
            Matrix matrix = new Matrix();
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            matrix.setRotate((float) a, (float) (width / 2), (float) (height / 2));
            return Bitmap.createBitmap(bitmap, 0, 0, width, height, matrix, true);
        } catch (Exception e2) {
            e = e2;
            str2 = "path:" + str;
            str3 = "reviewPicRotate is error";
        } catch (OutOfMemoryError e3) {
            e = e3;
            str2 = "path:" + str;
            str3 = "reviewPicRotate is outofmemory";
        }
        C1709a.m3015b(str3, str2, e);
        return bitmap;
    }
}

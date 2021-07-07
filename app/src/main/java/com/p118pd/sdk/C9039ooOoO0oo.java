package com.p118pd.sdk;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import java.io.ByteArrayOutputStream;
import java.io.File;

/* renamed from: com.pd.sdk.ooOoO0oo  reason: case insensitive filesystem */
public class C9039ooOoO0oo {
    public static Bitmap OooO00o(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return null;
        }
        return BitmapFactory.decodeByteArray(bArr, 0, bArr.length);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static byte[] m20692OooO00o(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

    public static Drawable OooO00o(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        return new BitmapDrawable(bitmap);
    }

    public static Bitmap OooO00o(Drawable drawable) {
        if (drawable == null) {
            return null;
        }
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        Bitmap createBitmap = Bitmap.createBitmap(intrinsicWidth, intrinsicHeight, drawable.getOpacity() != -1 ? Bitmap.Config.ARGB_8888 : Bitmap.Config.RGB_565);
        Canvas canvas = new Canvas(createBitmap);
        drawable.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
        drawable.draw(canvas);
        return createBitmap;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static Drawable m20691OooO00o(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return null;
        }
        return OooO00o(OooO00o(bArr));
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static byte[] m20693OooO00o(Drawable drawable) {
        if (drawable == null) {
            return null;
        }
        return m20692OooO00o(OooO00o(drawable));
    }

    public static Bitmap OooO00o(String str) throws Exception {
        if (new File(str).exists()) {
            return BitmapFactory.decodeFile(str);
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x0059 A[SYNTHETIC, Splitter:B:30:0x0059] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x006f A[SYNTHETIC, Splitter:B:40:0x006f] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0079 A[SYNTHETIC, Splitter:B:45:0x0079] */
    /* JADX WARNING: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void OooO00o(byte[] r3, java.lang.String r4, java.lang.String r5) {
        /*
        // Method dump skipped, instructions count: 130
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p118pd.sdk.C9039ooOoO0oo.OooO00o(byte[], java.lang.String, java.lang.String):void");
    }
}

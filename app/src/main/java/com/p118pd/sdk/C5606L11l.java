package com.p118pd.sdk;

import android.graphics.Bitmap;
import com.google.android.gms.vision.Frame;
import java.nio.ByteBuffer;

/* renamed from: com.pd.sdk.L1丨丨1l  reason: invalid class name and case insensitive filesystem */
public class C5606L11l {
    public static C1ILI OooO00o(byte[] bArr, int i, int i2, int i3) {
        Frame.Builder builder = new Frame.Builder();
        builder.setImageData(ByteBuffer.wrap(bArr), i, i2, 17);
        if (i3 == 90) {
            builder.setRotation(1);
        } else if (i3 == 180) {
            builder.setRotation(2);
        } else if (i3 != 270) {
            builder.setRotation(0);
        } else {
            builder.setRotation(3);
        }
        return new C1ILI(builder.build(), new I1iI1(i, i2, i3));
    }

    public static C1ILI OooO00o(Bitmap bitmap) {
        Frame.Builder builder = new Frame.Builder();
        builder.setBitmap(bitmap);
        return new C1ILI(builder.build(), new I1iI1(bitmap.getWidth(), bitmap.getHeight()));
    }
}

package com.p118pd.sdk;

import android.graphics.Bitmap;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/* renamed from: com.pd.sdk.ooOo0ooO  reason: case insensitive filesystem */
public class C9026ooOo0ooO {
    public static long OooO00o(Serializable serializable) throws IOException {
        Throwable th;
        ByteArrayOutputStream byteArrayOutputStream;
        ObjectOutputStream objectOutputStream;
        if (serializable == null) {
            return 0;
        }
        ObjectOutputStream objectOutputStream2 = null;
        try {
            byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            } catch (Throwable th2) {
                th = th2;
                C9035ooOoO0Oo.OooO00o(objectOutputStream2);
                C9035ooOoO0Oo.OooO00o(byteArrayOutputStream);
                throw th;
            }
            try {
                objectOutputStream.writeObject(serializable);
                objectOutputStream.flush();
                long size = (long) byteArrayOutputStream.size();
                C9035ooOoO0Oo.OooO00o(objectOutputStream);
                C9035ooOoO0Oo.OooO00o(byteArrayOutputStream);
                return size;
            } catch (Throwable th3) {
                th = th3;
                objectOutputStream2 = objectOutputStream;
                C9035ooOoO0Oo.OooO00o(objectOutputStream2);
                C9035ooOoO0Oo.OooO00o(byteArrayOutputStream);
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            byteArrayOutputStream = null;
            C9035ooOoO0Oo.OooO00o(objectOutputStream2);
            C9035ooOoO0Oo.OooO00o(byteArrayOutputStream);
            throw th;
        }
    }

    public static long OooO00o(Bitmap bitmap) {
        Throwable th;
        if (bitmap == null) {
            return 0;
        }
        ByteArrayOutputStream byteArrayOutputStream = null;
        try {
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
            try {
                bitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream2);
                long size = (long) byteArrayOutputStream2.size();
                C9035ooOoO0Oo.OooO00o(byteArrayOutputStream2);
                return size;
            } catch (Throwable th2) {
                th = th2;
                byteArrayOutputStream = byteArrayOutputStream2;
                C9035ooOoO0Oo.OooO00o(byteArrayOutputStream);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            C9035ooOoO0Oo.OooO00o(byteArrayOutputStream);
            throw th;
        }
    }
}

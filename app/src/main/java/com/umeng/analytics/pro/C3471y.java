package com.umeng.analytics.pro;

import android.text.TextUtils;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/* renamed from: com.umeng.analytics.pro.y */
public class C3471y {
    /* renamed from: a */
    public static String m8942a(Serializable serializable) {
        if (serializable == null) {
            return "";
        }
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            objectOutputStream.writeObject(serializable);
            objectOutputStream.close();
            return m8943a(byteArrayOutputStream.toByteArray());
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: b */
    public static byte[] m8944b(String str) {
        byte[] bArr = new byte[(str.length() / 2)];
        for (int i = 0; i < str.length(); i += 2) {
            int i2 = i / 2;
            bArr[i2] = (byte) ((str.charAt(i) - 'a') << 4);
            bArr[i2] = (byte) (bArr[i2] + (str.charAt(i + 1) - 'a'));
        }
        return bArr;
    }

    /* renamed from: a */
    public static Object m8941a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return new ObjectInputStream(new ByteArrayInputStream(m8944b(str))).readObject();
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static String m8943a(byte[] bArr) {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < bArr.length; i++) {
            stringBuffer.append((char) (((bArr[i] >> 4) & 15) + 97));
            stringBuffer.append((char) ((bArr[i] & 15) + 97));
        }
        return stringBuffer.toString();
    }
}

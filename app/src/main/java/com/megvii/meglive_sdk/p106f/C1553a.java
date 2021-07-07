package com.megvii.meglive_sdk.p106f;

import java.security.NoSuchAlgorithmException;
import javax.crypto.KeyGenerator;

/* renamed from: com.megvii.meglive_sdk.f.a */
public final class C1553a {
    /* renamed from: a */
    public static String m2618a() {
        try {
            KeyGenerator instance = KeyGenerator.getInstance("AES");
            instance.init(128);
            byte[] encoded = instance.generateKey().getEncoded();
            StringBuffer stringBuffer = new StringBuffer();
            for (byte b : encoded) {
                String hexString = Integer.toHexString(b);
                if (hexString.length() > 3) {
                    stringBuffer.append(hexString.substring(6));
                } else if (hexString.length() < 2) {
                    stringBuffer.append("0".concat(String.valueOf(hexString)));
                } else {
                    stringBuffer.append(hexString);
                }
            }
            return stringBuffer.toString();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return "";
        }
    }
}

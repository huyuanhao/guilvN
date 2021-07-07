package com.vivo.push.util;

import android.util.Base64;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.Signature;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;

/* renamed from: com.vivo.push.util.t */
public final class C4150t {

    /* renamed from: a */
    public static String f11127a = "RSA";

    /* renamed from: a */
    public static PublicKey m11236a(String str) throws Exception {
        try {
            return KeyFactory.getInstance(f11127a).generatePublic(new X509EncodedKeySpec(Base64.decode(str, 2)));
        } catch (NoSuchAlgorithmException unused) {
            throw new Exception("无此算法");
        } catch (InvalidKeySpecException unused2) {
            throw new Exception("公钥非法");
        } catch (NullPointerException unused3) {
            throw new Exception("公钥数据为空");
        }
    }

    /* renamed from: a */
    public static boolean m11237a(byte[] bArr, PublicKey publicKey, byte[] bArr2) throws Exception {
        Signature instance = Signature.getInstance("MD5withRSA");
        instance.initVerify(publicKey);
        instance.update(bArr);
        return instance.verify(bArr2);
    }
}

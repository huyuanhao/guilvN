package com.huawei.hianalytics.p030f.p031g;

import com.p118pd.sdk.AbstractC8522oo00O000;
import com.p118pd.sdk.AbstractC8536oo00OO0O;
import com.p118pd.sdk.C7491o0OoOOO;
import com.p118pd.sdk.C8490oo00000o;
import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;

/* renamed from: com.huawei.hianalytics.f.g.f */
public class C1097f {

    /* renamed from: com.huawei.hianalytics.f.g.f$a */
    public static class C1098a extends Exception {
        public C1098a() {
            super("Fail to encrypt with RSA");
        }
    }

    public static String OooO00o(String str) {
        try {
            return OooO0O0(str);
        } catch (C1098a unused) {
            AbstractC8536oo00OO0O.OooO0OO("RsaCryPter", "rsaEncrypt(): Fail to encrypt with RSA!");
            return "";
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static PublicKey m15109OooO00o(String str) {
        return KeyFactory.getInstance(C7491o0OoOOO.OooO00o).generatePublic(new X509EncodedKeySpec(AbstractC8522oo00O000.OooO00o(str)));
    }

    public static byte[] OooO00o(byte[] bArr) {
        try {
            PublicKey OooO00o = m15109OooO00o(C8490oo00000o.OooO0O0() + "2d1e55658d041b98ce28d81f5c7fe8b85b528f6afea350f28da6e833df875e19a6c71c59050298b28323c8910980c12a8e731e0c47dc14da076e88e25a8b7e9a7c33b27baf12e1c9de861523af15f577789389b700578670b6e37ff5e" + AbstractC8522oo00O000.OooO0Oo());
            if (OooO00o != null) {
                Cipher instance = Cipher.getInstance("RSA/ECB/OAEPWITHSHA-1ANDMGF1PADDING");
                instance.init(1, OooO00o);
                return instance.doFinal(bArr);
            }
            throw new UnsupportedEncodingException();
        } catch (UnsupportedEncodingException unused) {
            AbstractC8536oo00OO0O.OooO0OO("RsaCryPter", "rsaEncrypt(): getBytes - Unsupported coding format!");
            throw new C1098a();
        } catch (NoSuchAlgorithmException unused2) {
            AbstractC8536oo00OO0O.OooO0OO("RsaCryPter", "rsaEncrypt(): getInstance - No such algorithm,transformation");
            throw new C1098a();
        } catch (InvalidKeyException unused3) {
            AbstractC8536oo00OO0O.OooO0OO("RsaCryPter", "rsaEncrypt(): init - Invalid key!");
            throw new C1098a();
        } catch (NoSuchPaddingException unused4) {
            AbstractC8536oo00OO0O.OooO0OO("RsaCryPter", "rsaEncrypt():  No such filling parameters ");
            throw new C1098a();
        } catch (BadPaddingException unused5) {
            AbstractC8536oo00OO0O.OooO0OO("RsaCryPter", "rsaEncrypt():False filling parameters!");
            throw new C1098a();
        } catch (InvalidKeySpecException unused6) {
            AbstractC8536oo00OO0O.OooO0OO("RsaCryPter", "rsaEncrypt(): Invalid key specification");
            throw new C1098a();
        } catch (IllegalBlockSizeException unused7) {
            AbstractC8536oo00OO0O.OooO0OO("RsaCryPter", "rsaEncrypt(): doFinal - The provided block is not filled with");
            throw new C1098a();
        }
    }

    public static String OooO0O0(String str) {
        try {
            return AbstractC8522oo00O000.OooO00o(OooO00o(str.getBytes("UTF-8")));
        } catch (UnsupportedEncodingException unused) {
            AbstractC8536oo00OO0O.OooO0OO("RsaCryPter", "rsaEncrypt(): Unsupported Encoding - utf-8!");
            throw new C1098a();
        }
    }
}

package com.tencent.bugly.proguard;

import java.security.NoSuchAlgorithmException;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

/* renamed from: com.tencent.bugly.proguard.av */
public class C3331av implements AbstractC3333ax {

    /* renamed from: a */
    public String f8078a = null;

    @Override // com.tencent.bugly.proguard.AbstractC3333ax
    /* renamed from: a */
    public byte[] mo38408a(byte[] bArr) throws Exception {
        if (this.f8078a == null || bArr == null) {
            return null;
        }
        Cipher instance = Cipher.getInstance("DES/CBC/PKCS5Padding");
        instance.init(2, SecretKeyFactory.getInstance("DES").generateSecret(new DESKeySpec(this.f8078a.getBytes("UTF-8"))), new IvParameterSpec(this.f8078a.getBytes("UTF-8")));
        return instance.doFinal(bArr);
    }

    @Override // com.tencent.bugly.proguard.AbstractC3333ax
    /* renamed from: b */
    public byte[] mo38409b(byte[] bArr) throws Exception, NoSuchAlgorithmException {
        if (this.f8078a == null || bArr == null) {
            return null;
        }
        Cipher instance = Cipher.getInstance("DES/CBC/PKCS5Padding");
        instance.init(1, SecretKeyFactory.getInstance("DES").generateSecret(new DESKeySpec(this.f8078a.getBytes("UTF-8"))), new IvParameterSpec(this.f8078a.getBytes("UTF-8")));
        return instance.doFinal(bArr);
    }

    @Override // com.tencent.bugly.proguard.AbstractC3333ax
    /* renamed from: a */
    public void mo38407a(String str) {
        if (str != null) {
            this.f8078a = str;
        }
    }
}

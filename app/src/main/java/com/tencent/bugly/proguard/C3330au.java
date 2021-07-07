package com.tencent.bugly.proguard;

import java.security.NoSuchAlgorithmException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: com.tencent.bugly.proguard.au */
public class C3330au implements AbstractC3333ax {

    /* renamed from: a */
    public String f8077a = null;

    @Override // com.tencent.bugly.proguard.AbstractC3333ax
    /* renamed from: a */
    public byte[] mo38408a(byte[] bArr) throws Exception {
        if (this.f8077a == null || bArr == null) {
            return null;
        }
        StringBuffer stringBuffer = new StringBuffer();
        for (byte b : bArr) {
            stringBuffer.append(((int) b) + " ");
        }
        SecretKeySpec secretKeySpec = new SecretKeySpec(this.f8077a.getBytes(), "AES");
        Cipher instance = Cipher.getInstance("AES/CBC/PKCS5Padding");
        instance.init(2, secretKeySpec, new IvParameterSpec(this.f8077a.getBytes()));
        byte[] doFinal = instance.doFinal(bArr);
        StringBuffer stringBuffer2 = new StringBuffer();
        for (byte b2 : doFinal) {
            stringBuffer2.append(((int) b2) + " ");
        }
        return doFinal;
    }

    @Override // com.tencent.bugly.proguard.AbstractC3333ax
    /* renamed from: b */
    public byte[] mo38409b(byte[] bArr) throws Exception, NoSuchAlgorithmException {
        if (this.f8077a == null || bArr == null) {
            return null;
        }
        StringBuffer stringBuffer = new StringBuffer();
        for (byte b : bArr) {
            stringBuffer.append(((int) b) + " ");
        }
        SecretKeySpec secretKeySpec = new SecretKeySpec(this.f8077a.getBytes(), "AES");
        Cipher instance = Cipher.getInstance("AES/CBC/PKCS5Padding");
        instance.init(1, secretKeySpec, new IvParameterSpec(this.f8077a.getBytes()));
        byte[] doFinal = instance.doFinal(bArr);
        StringBuffer stringBuffer2 = new StringBuffer();
        for (byte b2 : doFinal) {
            stringBuffer2.append(((int) b2) + " ");
        }
        return doFinal;
    }

    @Override // com.tencent.bugly.proguard.AbstractC3333ax
    /* renamed from: a */
    public void mo38407a(String str) {
        if (str != null) {
            for (int length = str.length(); length < 16; length++) {
                str = str + "0";
            }
            this.f8077a = str.substring(0, 16);
        }
    }
}

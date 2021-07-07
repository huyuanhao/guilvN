package com.p118pd.sdk;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintStream;
import java.io.Serializable;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: com.pd.sdk.ooOoO0oO  reason: case insensitive filesystem */
public class C9038ooOoO0oO {
    public static final String OooO00o = "DESFileCoder";

    /* renamed from: OooO00o  reason: collision with other field name */
    public Key f22350OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Cipher f22351OooO00o;
    public Cipher OooO0O0;

    public C9038ooOoO0oO(String str) throws Exception {
        m20690OooO00o(str);
        OooO00o();
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m20690OooO00o(String str) {
        byte[] bytes = str.getBytes();
        byte[] bArr = new byte[8];
        int i = 0;
        while (i < 8 && i < bytes.length) {
            bArr[i] = bytes[i];
            i++;
        }
        this.f22350OooO00o = new SecretKeySpec(bArr, "DES");
    }

    private void OooO00o() throws Exception {
        Cipher instance = Cipher.getInstance("DES");
        this.OooO0O0 = instance;
        instance.init(1, this.f22350OooO00o);
        Cipher instance2 = Cipher.getInstance("DES");
        this.f22351OooO00o = instance2;
        instance2.init(2, this.f22350OooO00o);
    }

    public void OooO00o(Serializable serializable, String str) {
        OooO00o(new ByteArrayInputStream(OooO00o(serializable)), str);
    }

    private byte[] OooO00o(Serializable serializable) {
        byte[] bArr = new byte[1024];
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            objectOutputStream.writeObject(serializable);
            bArr = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            objectOutputStream.close();
            return bArr;
        } catch (Exception e) {
            PrintStream printStream = System.out;
            printStream.println("translation" + e.getMessage());
            e.getMessage();
            return bArr;
        }
    }

    public void OooO00o(InputStream inputStream, String str) {
        if (inputStream == null) {
            System.out.println("inputstream is null");
            return;
        }
        try {
            CipherInputStream cipherInputStream = new CipherInputStream(inputStream, this.OooO0O0);
            FileOutputStream fileOutputStream = new FileOutputStream(str);
            byte[] bArr = new byte[1024];
            while (true) {
                int read = cipherInputStream.read(bArr);
                if (read > 0) {
                    fileOutputStream.write(bArr, 0, read);
                    fileOutputStream.flush();
                } else {
                    fileOutputStream.close();
                    cipherInputStream.close();
                    inputStream.close();
                    System.out.println("加密成功");
                    return;
                }
            }
        } catch (Exception e) {
            System.out.println("加密失败");
            e.getMessage();
        }
    }

    public void OooO00o(String str, String str2) throws FileNotFoundException {
        OooO00o(new FileInputStream(str), str2);
    }

    public Object OooO00o(InputStream inputStream) {
        Object obj = null;
        if (inputStream == null) {
            System.out.println("inputstream is null");
            return null;
        }
        try {
            CipherInputStream cipherInputStream = new CipherInputStream(inputStream, this.f22351OooO00o);
            BufferedInputStream bufferedInputStream = new BufferedInputStream(cipherInputStream);
            obj = new ObjectInputStream(bufferedInputStream).readObject();
            cipherInputStream.close();
            inputStream.close();
            bufferedInputStream.close();
            System.out.println("解密成功");
            return obj;
        } catch (Exception e) {
            System.out.println("解密失败");
            e.getMessage();
            return obj;
        }
    }

    public Object OooO00o(String str) throws Exception {
        return OooO00o(new FileInputStream(str));
    }
}

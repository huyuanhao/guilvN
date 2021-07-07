package com.p118pd.sdk;

import android.util.Base64;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.security.MessageDigest;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;

/* renamed from: com.pd.sdk.ooOoO0o  reason: case insensitive filesystem */
public class C9036ooOoO0o {
    public static final String OooO0O0 = "DESCoder";
    public static String OooO0OO = "UTF-8";
    public String OooO00o = "";

    public C9036ooOoO0o(String str) {
        this.OooO00o = str;
    }

    public static byte[] OooO0o0(byte[] bArr) throws Exception {
        try {
            MessageDigest instance = MessageDigest.getInstance(LL1i.OooO0O0);
            instance.reset();
            instance.update(bArr);
            return instance.digest();
        } catch (Exception e) {
            throw e;
        }
    }

    public String OooO00o(String str) {
        if (str == null || str.length() <= 0) {
            return str;
        }
        try {
            return new String(OooO0OO(Base64.decode(str, 0)), OooO0OO);
        } catch (Exception e) {
            e.getMessage();
            return str;
        }
    }

    public String OooO0O0(String str) {
        if (str == null || str.length() <= 0) {
            return str;
        }
        try {
            return Base64.encodeToString(OooO0Oo(str.getBytes(OooO0OO)), 0);
        } catch (Exception e) {
            e.getMessage();
            return str;
        }
    }

    public byte[] OooO0OO(byte[] bArr) throws Exception {
        try {
            SecretKey generateSecret = SecretKeyFactory.getInstance("DES").generateSecret(new DESKeySpec(this.OooO00o.getBytes()));
            Cipher instance = Cipher.getInstance("DES");
            instance.init(2, generateSecret);
            return instance.doFinal(bArr);
        } catch (Exception e) {
            throw e;
        }
    }

    public byte[] OooO0Oo(byte[] bArr) throws Exception {
        try {
            SecretKey generateSecret = SecretKeyFactory.getInstance("DES").generateSecret(new DESKeySpec(this.OooO00o.getBytes()));
            Cipher instance = Cipher.getInstance("DES");
            instance.init(1, generateSecret);
            return instance.doFinal(bArr);
        } catch (Exception e) {
            throw e;
        }
    }

    public byte[] OooO0O0(byte[] bArr) {
        if (bArr != null && bArr.length > 0) {
            try {
                return Base64.encode(OooO0Oo(bArr), 0);
            } catch (Exception e) {
                e.getMessage();
            }
        }
        return null;
    }

    public byte[] OooO00o(byte[] bArr) {
        if (bArr == null || bArr.length <= 0) {
            return null;
        }
        try {
            byte[] OooO0OO2 = OooO0OO(Base64.decode(new String(bArr, OooO0OO), 0));
            new String(OooO0OO2).getBytes(OooO0OO);
            return new String(OooO0OO2).getBytes();
        } catch (Exception e) {
            e.getMessage();
            return null;
        }
    }

    public void OooO0O0(String str, String str2) {
        Throwable th;
        FileInputStream fileInputStream;
        FileNotFoundException e;
        IOException e2;
        FileOutputStream fileOutputStream;
        FileOutputStream fileOutputStream2 = null;
        try {
            fileInputStream = new FileInputStream(str);
            try {
                fileOutputStream = new FileOutputStream(str2);
            } catch (FileNotFoundException e3) {
                e = e3;
                e.getMessage();
                fileOutputStream2.close();
                fileInputStream.close();
            } catch (IOException e4) {
                e2 = e4;
                try {
                    e2.getMessage();
                    fileOutputStream2.close();
                    fileInputStream.close();
                } catch (Throwable th2) {
                    th = th2;
                    try {
                        fileOutputStream2.close();
                        fileInputStream.close();
                    } catch (IOException e5) {
                        e5.getMessage();
                    }
                    throw th;
                }
            }
            try {
                byte[] bArr = new byte[1024];
                while (fileInputStream.read(bArr) > 0) {
                    fileOutputStream.write(OooO0O0(bArr));
                }
                try {
                    fileOutputStream.close();
                    fileInputStream.close();
                } catch (IOException e6) {
                    e6.getMessage();
                }
            } catch (FileNotFoundException e7) {
                e = e7;
                fileOutputStream2 = fileOutputStream;
                e.getMessage();
                fileOutputStream2.close();
                fileInputStream.close();
            } catch (IOException e8) {
                e2 = e8;
                fileOutputStream2 = fileOutputStream;
                e2.getMessage();
                fileOutputStream2.close();
                fileInputStream.close();
            } catch (Throwable th3) {
                th = th3;
                fileOutputStream2 = fileOutputStream;
                fileOutputStream2.close();
                fileInputStream.close();
                throw th;
            }
        } catch (FileNotFoundException e9) {
            e = e9;
            fileInputStream = null;
            e.getMessage();
            fileOutputStream2.close();
            fileInputStream.close();
        } catch (IOException e10) {
            e2 = e10;
            fileInputStream = null;
            e2.getMessage();
            fileOutputStream2.close();
            fileInputStream.close();
        } catch (Throwable th4) {
            th = th4;
            fileInputStream = null;
            fileOutputStream2.close();
            fileInputStream.close();
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.io.FileInputStream, java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void OooO0OO(java.lang.String r7, java.lang.String r8) throws java.lang.Exception {
        /*
        // Method dump skipped, instructions count: 110
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p118pd.sdk.C9036ooOoO0o.OooO0OO(java.lang.String, java.lang.String):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.io.FileInputStream, java.io.InputStream] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void OooO0Oo(java.lang.String r7, java.lang.String r8) throws java.lang.Exception {
        /*
        // Method dump skipped, instructions count: 110
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p118pd.sdk.C9036ooOoO0o.OooO0Oo(java.lang.String, java.lang.String):void");
    }

    public void OooO00o(String str, String str2) {
        Throwable th;
        FileInputStream fileInputStream;
        FileNotFoundException e;
        IOException e2;
        FileOutputStream fileOutputStream;
        FileOutputStream fileOutputStream2 = null;
        try {
            fileInputStream = new FileInputStream(str);
            try {
                fileOutputStream = new FileOutputStream(str2);
            } catch (FileNotFoundException e3) {
                e = e3;
                e.getMessage();
                fileOutputStream2.close();
                fileInputStream.close();
            } catch (IOException e4) {
                e2 = e4;
                try {
                    e2.getMessage();
                    fileOutputStream2.close();
                    fileInputStream.close();
                } catch (Throwable th2) {
                    th = th2;
                    try {
                        fileOutputStream2.close();
                        fileInputStream.close();
                    } catch (IOException e5) {
                        e5.getMessage();
                    }
                    throw th;
                }
            }
            try {
                byte[] bArr = new byte[1412];
                while (fileInputStream.read(bArr) > 0) {
                    fileOutputStream.write(OooO00o(bArr));
                }
                try {
                    fileOutputStream.close();
                    fileInputStream.close();
                } catch (IOException e6) {
                    e6.getMessage();
                }
            } catch (FileNotFoundException e7) {
                e = e7;
                fileOutputStream2 = fileOutputStream;
                e.getMessage();
                fileOutputStream2.close();
                fileInputStream.close();
            } catch (IOException e8) {
                e2 = e8;
                fileOutputStream2 = fileOutputStream;
                e2.getMessage();
                fileOutputStream2.close();
                fileInputStream.close();
            } catch (Throwable th3) {
                th = th3;
                fileOutputStream2 = fileOutputStream;
                fileOutputStream2.close();
                fileInputStream.close();
                throw th;
            }
        } catch (FileNotFoundException e9) {
            e = e9;
            fileInputStream = null;
            e.getMessage();
            fileOutputStream2.close();
            fileInputStream.close();
        } catch (IOException e10) {
            e2 = e10;
            fileInputStream = null;
            e2.getMessage();
            fileOutputStream2.close();
            fileInputStream.close();
        } catch (Throwable th4) {
            th = th4;
            fileInputStream = null;
            fileOutputStream2.close();
            fileInputStream.close();
            throw th;
        }
    }
}

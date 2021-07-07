package com.p118pd.sdk;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: com.pd.sdk.ooOoooO  reason: case insensitive filesystem */
public class C9092ooOoooO {
    public static String OooO00o = "";

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final /* synthetic */ boolean f22444OooO00o = (!C9092ooOoooO.class.desiredAssertionStatus());

    public static byte[] OooO00o(byte[] bArr, byte[] bArr2) {
        return OooO00o(bArr, bArr2, true, false);
    }

    public static byte[] OooO0O0(byte[] bArr, byte[] bArr2) {
        return OooO00o(bArr, bArr2, true, true);
    }

    public static byte[] OooO00o(byte[] bArr, byte[] bArr2, boolean z) {
        return OooO00o(bArr, bArr2, z, true);
    }

    public static boolean OooO0O0(File file, String str, String str2) {
        try {
            byte[] OooO00o2 = OooO00o(file);
            if (OooO00o2 != null) {
                if (OooO00o2.length != 0) {
                    return OooO00o(OooO00o2, str, str2);
                }
            }
            return false;
        } catch (Exception e) {
            C9111oooO0000.OooO00o(e);
            return false;
        }
    }

    public static byte[] OooO00o(byte[] bArr, byte[] bArr2, boolean z, boolean z2) {
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0});
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr2, "AES");
        Cipher instance = Cipher.getInstance("AES/CBC/PKCS5Padding");
        instance.init(z ? 1 : 2, secretKeySpec, ivParameterSpec);
        if (!z) {
            return instance.doFinal(bArr);
        }
        if (!z2) {
            bArr = OooO00o(bArr);
        }
        return instance.doFinal(bArr);
    }

    public static byte[] OooO00o(byte[] bArr) {
        byte[] bArr2 = new byte[(bArr.length + 16)];
        int length = bArr.length;
        bArr2[0] = (byte) ((length >> 0) & 255);
        bArr2[1] = (byte) ((length >> 8) & 255);
        bArr2[2] = (byte) ((length >> 16) & 255);
        bArr2[3] = (byte) ((length >> 24) & 255);
        for (int i = 4; i < 16; i++) {
            bArr2[i] = 0;
        }
        System.arraycopy(bArr, 0, bArr2, 16, bArr.length);
        return bArr2;
    }

    public static byte[] OooO00o() {
        return new byte[]{48, 25, 6, 55};
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:40:? */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.io.ByteArrayOutputStream, java.io.Closeable] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0098 A[SYNTHETIC, Splitter:B:42:0x0098] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static byte[] OooO00o(java.lang.String r7, byte[] r8) {
        /*
        // Method dump skipped, instructions count: 156
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p118pd.sdk.C9092ooOoooO.OooO00o(java.lang.String, byte[]):byte[]");
    }

    public static void OooO00o(byte[] bArr, int i, byte[] bArr2) {
        if (f22444OooO00o || bArr2.length == 4) {
            for (int i2 = 0; i2 < 4; i2++) {
                bArr[i2 + i] = bArr2[i2];
            }
            return;
        }
        throw new AssertionError();
    }

    public static byte[] OooO00o(File file) {
        FileInputStream fileInputStream;
        Throwable th;
        byte[] bArr;
        Exception e;
        BufferedInputStream bufferedInputStream = null;
        if (!file.isFile()) {
            return null;
        }
        try {
            int length = (int) file.length();
            fileInputStream = new FileInputStream(file);
            try {
                BufferedInputStream bufferedInputStream2 = new BufferedInputStream(fileInputStream);
                try {
                    byte[] bArr2 = new byte[length];
                    int i = 0;
                    while (i < length) {
                        int read = bufferedInputStream2.read(bArr2, i, length - i);
                        if (-1 == read) {
                            break;
                        }
                        i += read;
                    }
                    C9111oooO0000.OooO00o(bufferedInputStream2);
                    C9111oooO0000.OooO00o(fileInputStream);
                    return bArr2;
                } catch (Exception e2) {
                    e = e2;
                    bufferedInputStream = bufferedInputStream2;
                    bArr = null;
                    try {
                        C9111oooO0000.OooO0O0(e);
                        C9111oooO0000.OooO00o(bufferedInputStream);
                        C9111oooO0000.OooO00o(fileInputStream);
                        return bArr;
                    } catch (Throwable th2) {
                        th = th2;
                        C9111oooO0000.OooO00o(bufferedInputStream);
                        C9111oooO0000.OooO00o(fileInputStream);
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    bufferedInputStream = bufferedInputStream2;
                    C9111oooO0000.OooO00o(bufferedInputStream);
                    C9111oooO0000.OooO00o(fileInputStream);
                    throw th;
                }
            } catch (Exception e3) {
                e = e3;
                bArr = null;
                C9111oooO0000.OooO0O0(e);
                C9111oooO0000.OooO00o(bufferedInputStream);
                C9111oooO0000.OooO00o(fileInputStream);
                return bArr;
            }
        } catch (Exception e4) {
            e = e4;
            bArr = null;
            fileInputStream = null;
            C9111oooO0000.OooO0O0(e);
            C9111oooO0000.OooO00o(bufferedInputStream);
            C9111oooO0000.OooO00o(fileInputStream);
            return bArr;
        } catch (Throwable th4) {
            th = th4;
            fileInputStream = null;
            C9111oooO0000.OooO00o(bufferedInputStream);
            C9111oooO0000.OooO00o(fileInputStream);
            throw th;
        }
    }

    public static boolean OooO00o(File file, String str, String str2) {
        for (int i = 0; i < 2; i++) {
            if (OooO0O0(file, str, str2)) {
                return true;
            }
            C9090ooOooo0O.OooO00o("crashsdk", "upload try again: " + str);
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:52:0x0144 A[SYNTHETIC, Splitter:B:52:0x0144] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean OooO00o(byte[] r10, java.lang.String r11, java.lang.String r12) {
        /*
        // Method dump skipped, instructions count: 346
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p118pd.sdk.C9092ooOoooO.OooO00o(byte[], java.lang.String, java.lang.String):boolean");
    }
}

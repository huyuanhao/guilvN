package com.p118pd.sdk;

import com.facebook.imageutils.JfifUtil;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/* renamed from: com.pd.sdk.ooOoooO0  reason: case insensitive filesystem */
public final class C9093ooOoooO0 {
    public static final int[] OooO00o = {126, 147, 115, 241, 101, 198, JfifUtil.MARKER_RST7, 134};
    public static final int[] OooO0O0 = {C7531o0Oooo0o.OooO0O0, 185, 233, 226, 129, 142, 151, 176};
    public static final int[] OooO0OO = {238, 185, 233, 179, 129, 142, 151, 167};

    public static String OooO00o(String str) {
        Throwable th;
        Exception e;
        FileInputStream fileInputStream;
        File file = new File(str);
        FileInputStream fileInputStream2 = null;
        if (!file.exists()) {
            return null;
        }
        try {
            FileInputStream fileInputStream3 = new FileInputStream(file);
            try {
                byte[] bArr = new byte[((int) file.length())];
                fileInputStream3.read(bArr);
                C9111oooO0000.OooO00o(fileInputStream3);
                byte[] OooO00o2 = OooO00o(bArr, OooO00o);
                if (OooO00o2 == null || OooO00o2.length <= 0) {
                    C9111oooO0000.OooO00o((Closeable) null);
                    return null;
                }
                int length = OooO00o2.length - 1;
                String str2 = OooO00o2[length] == 10 ? new String(OooO00o2, 0, length) : new String(OooO00o2);
                C9111oooO0000.OooO00o((Closeable) null);
                return str2;
            } catch (Exception e2) {
                fileInputStream = fileInputStream3;
                e = e2;
                try {
                    C9111oooO0000.OooO00o(e);
                    C9111oooO0000.OooO00o(fileInputStream);
                    return null;
                } catch (Throwable th2) {
                    th = th2;
                    fileInputStream2 = fileInputStream;
                    C9111oooO0000.OooO00o(fileInputStream2);
                    throw th;
                }
            } catch (Throwable th3) {
                fileInputStream2 = fileInputStream3;
                th = th3;
                C9111oooO0000.OooO00o(fileInputStream2);
                throw th;
            }
        } catch (Exception e3) {
            e = e3;
            fileInputStream = null;
            C9111oooO0000.OooO00o(e);
            C9111oooO0000.OooO00o(fileInputStream);
            return null;
        } catch (Throwable th4) {
            th = th4;
            C9111oooO0000.OooO00o(fileInputStream2);
            throw th;
        }
    }

    public static byte[] OooO0O0(byte[] bArr, int[] iArr) {
        if (!(bArr == null || iArr == null || iArr.length != 8)) {
            int length = bArr.length;
            try {
                byte[] bArr2 = new byte[(length + 2)];
                byte b = 0;
                for (int i = 0; i < length; i++) {
                    byte b2 = bArr[i];
                    bArr2[i] = (byte) (iArr[i % 8] ^ b2);
                    b = (byte) (b ^ b2);
                }
                bArr2[length] = (byte) (iArr[0] ^ b);
                bArr2[length + 1] = (byte) (iArr[1] ^ b);
                return bArr2;
            } catch (Exception e) {
                C9111oooO0000.OooO00o(e);
            }
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0022, code lost:
        r1 = com.p118pd.sdk.C9111oooO0000.m20792OooO00o(r0);
     */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0065 A[ADDED_TO_REGION] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String OooO00o(java.lang.String r7, java.lang.String r8, boolean r9) {
        /*
        // Method dump skipped, instructions count: 193
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p118pd.sdk.C9093ooOoooO0.OooO00o(java.lang.String, java.lang.String, boolean):java.lang.String");
    }

    public static byte[] OooO00o(byte[] bArr, int[] iArr) {
        if (bArr.length - 0 >= 2 && iArr != null && iArr.length == 8) {
            int length = (bArr.length - 2) - 0;
            try {
                byte[] bArr2 = new byte[length];
                byte b = 0;
                for (int i = 0; i < length; i++) {
                    byte b2 = (byte) (bArr[i + 0] ^ iArr[i % 8]);
                    bArr2[i] = b2;
                    b = (byte) (b ^ b2);
                }
                if (bArr[length + 0] == ((byte) ((iArr[0] ^ b) & 255)) && bArr[length + 1 + 0] == ((byte) ((iArr[1] ^ b) & 255))) {
                    return bArr2;
                }
                return null;
            } catch (Exception e) {
                C9111oooO0000.OooO00o(e);
            }
        }
        return null;
    }

    public static boolean OooO00o(String str, String str2) {
        FileOutputStream fileOutputStream;
        try {
            File file = new File(str);
            if (file.exists()) {
                file.delete();
            }
            fileOutputStream = new FileOutputStream(file);
        } catch (Throwable th) {
            C9111oooO0000.OooO00o(th);
            fileOutputStream = null;
        }
        boolean z = false;
        if (fileOutputStream == null) {
            return false;
        }
        byte[] OooO0O02 = OooO0O0(str2.getBytes(), OooO00o);
        if (OooO0O02 == null) {
            C9111oooO0000.OooO00o(fileOutputStream);
            return false;
        }
        try {
            fileOutputStream.write(OooO0O02);
            z = true;
        } catch (Throwable th2) {
            C9111oooO0000.OooO00o(fileOutputStream);
            throw th2;
        }
        C9111oooO0000.OooO00o(fileOutputStream);
        return z;
    }
}

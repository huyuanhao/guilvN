package com.p118pd.sdk;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import org.bouncycastle.util.p292io.StreamOverflowException;

/* renamed from: com.pd.sdk.ilIi丨1  reason: invalid class name and case insensitive filesystem */
public final class C6304ilIi1 {
    public static int OooO00o = 4096;

    public static int OooO00o(InputStream inputStream, byte[] bArr) throws IOException {
        return OooO00o(inputStream, bArr, 0, bArr.length);
    }

    public static int OooO00o(InputStream inputStream, byte[] bArr, int i, int i2) throws IOException {
        int i3 = 0;
        while (i3 < i2) {
            int read = inputStream.read(bArr, i + i3, i2 - i3);
            if (read < 0) {
                break;
            }
            i3 += read;
        }
        return i3;
    }

    public static long OooO00o(InputStream inputStream, long j, OutputStream outputStream) throws IOException {
        int i = OooO00o;
        byte[] bArr = new byte[i];
        long j2 = 0;
        while (true) {
            int read = inputStream.read(bArr, 0, i);
            if (read < 0) {
                return j2;
            }
            long j3 = (long) read;
            if (j - j2 >= j3) {
                j2 += j3;
                outputStream.write(bArr, 0, read);
            } else {
                throw new StreamOverflowException("Data Overflow");
            }
        }
    }

    public static void OooO00o(ByteArrayOutputStream byteArrayOutputStream, OutputStream outputStream) throws IOException {
        byteArrayOutputStream.writeTo(outputStream);
    }

    public static void OooO00o(InputStream inputStream) throws IOException {
        int i = OooO00o;
        do {
        } while (inputStream.read(new byte[i], 0, i) >= 0);
    }

    public static void OooO00o(InputStream inputStream, OutputStream outputStream) throws IOException {
        int i = OooO00o;
        byte[] bArr = new byte[i];
        while (true) {
            int read = inputStream.read(bArr, 0, i);
            if (read >= 0) {
                outputStream.write(bArr, 0, read);
            } else {
                return;
            }
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static byte[] m17339OooO00o(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        OooO00o(inputStream, byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

    public static byte[] OooO00o(InputStream inputStream, int i) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        OooO00o(inputStream, (long) i, byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }
}

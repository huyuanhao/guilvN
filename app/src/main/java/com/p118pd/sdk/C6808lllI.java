package com.p118pd.sdk;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import org.bouncycastle.util.Strings;
import org.bouncycastle.util.encoders.DecoderException;
import org.bouncycastle.util.encoders.EncoderException;

/* renamed from: com.pd.sdk.ll丨lI  reason: invalid class name and case insensitive filesystem */
public class C6808lllI {
    public static final AbstractC6469l1LIL OooO00o = new C6529lI1Ii();

    public static int OooO00o(String str, OutputStream outputStream) throws IOException {
        return OooO00o.OooO00o(str, outputStream);
    }

    public static int OooO00o(byte[] bArr, int i, int i2, OutputStream outputStream) {
        try {
            return OooO00o.OooO00o(bArr, i, i2, outputStream);
        } catch (Exception e) {
            throw new DecoderException("unable to decode base64 data: " + e.getMessage(), e);
        }
    }

    public static int OooO00o(byte[] bArr, OutputStream outputStream) throws IOException {
        return OooO00o.OooO0O0(bArr, 0, bArr.length, outputStream);
    }

    public static String OooO00o(byte[] bArr) {
        return OooO00o(bArr, 0, bArr.length);
    }

    public static String OooO00o(byte[] bArr, int i, int i2) {
        return Strings.OooO00o(m17940OooO00o(bArr, i, i2));
    }

    public static byte[] OooO00o(String str) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream((str.length() / 4) * 3);
        try {
            OooO00o.OooO00o(str, byteArrayOutputStream);
            return byteArrayOutputStream.toByteArray();
        } catch (Exception e) {
            throw new DecoderException("unable to decode base64 string: " + e.getMessage(), e);
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static byte[] m17939OooO00o(byte[] bArr) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream((bArr.length / 4) * 3);
        try {
            OooO00o.OooO00o(bArr, 0, bArr.length, byteArrayOutputStream);
            return byteArrayOutputStream.toByteArray();
        } catch (Exception e) {
            throw new DecoderException("unable to decode base64 data: " + e.getMessage(), e);
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static byte[] m17940OooO00o(byte[] bArr, int i, int i2) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(((i2 + 2) / 3) * 4);
        try {
            OooO00o.OooO0O0(bArr, i, i2, byteArrayOutputStream);
            return byteArrayOutputStream.toByteArray();
        } catch (Exception e) {
            throw new EncoderException("exception encoding base64 string: " + e.getMessage(), e);
        }
    }

    public static int OooO0O0(byte[] bArr, int i, int i2, OutputStream outputStream) throws IOException {
        return OooO00o.OooO0O0(bArr, i, i2, outputStream);
    }

    public static byte[] OooO0O0(byte[] bArr) {
        return m17940OooO00o(bArr, 0, bArr.length);
    }
}

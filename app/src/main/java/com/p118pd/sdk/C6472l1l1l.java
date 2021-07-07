package com.p118pd.sdk;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import org.bouncycastle.util.Strings;
import org.bouncycastle.util.encoders.DecoderException;
import org.bouncycastle.util.encoders.EncoderException;

/* renamed from: com.pd.sdk.l1丨l1l  reason: invalid class name and case insensitive filesystem */
public class C6472l1l1l {
    public static final AbstractC6469l1LIL OooO00o = new lIliii();

    public static int OooO00o(String str, OutputStream outputStream) throws IOException {
        return OooO00o.OooO00o(str, outputStream);
    }

    public static int OooO00o(byte[] bArr, int i, int i2, OutputStream outputStream) throws IOException {
        return OooO00o.OooO0O0(bArr, i, i2, outputStream);
    }

    public static int OooO00o(byte[] bArr, OutputStream outputStream) throws IOException {
        return OooO00o.OooO0O0(bArr, 0, bArr.length, outputStream);
    }

    public static String OooO00o(byte[] bArr) {
        return OooO00o(bArr, 0, bArr.length);
    }

    public static String OooO00o(byte[] bArr, int i, int i2) {
        return Strings.OooO00o(m17609OooO00o(bArr, i, i2));
    }

    public static byte[] OooO00o(String str) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            OooO00o.OooO00o(str, byteArrayOutputStream);
            return byteArrayOutputStream.toByteArray();
        } catch (Exception e) {
            throw new DecoderException("exception decoding Hex string: " + e.getMessage(), e);
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static byte[] m17608OooO00o(byte[] bArr) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            OooO00o.OooO00o(bArr, 0, bArr.length, byteArrayOutputStream);
            return byteArrayOutputStream.toByteArray();
        } catch (Exception e) {
            throw new DecoderException("exception decoding Hex data: " + e.getMessage(), e);
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static byte[] m17609OooO00o(byte[] bArr, int i, int i2) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            OooO00o.OooO0O0(bArr, i, i2, byteArrayOutputStream);
            return byteArrayOutputStream.toByteArray();
        } catch (Exception e) {
            throw new EncoderException("exception encoding Hex string: " + e.getMessage(), e);
        }
    }

    public static byte[] OooO0O0(byte[] bArr) {
        return m17609OooO00o(bArr, 0, bArr.length);
    }
}

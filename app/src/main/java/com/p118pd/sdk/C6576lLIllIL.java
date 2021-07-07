package com.p118pd.sdk;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import org.bouncycastle.util.encoders.DecoderException;
import org.bouncycastle.util.encoders.EncoderException;

/* renamed from: com.pd.sdk.lLIllIL  reason: case insensitive filesystem */
public class C6576lLIllIL {
    public static final AbstractC6469l1LIL OooO00o = new C9350IIIiL1();

    public static int OooO00o(String str, OutputStream outputStream) throws IOException {
        return OooO00o.OooO00o(str, outputStream);
    }

    public static int OooO00o(byte[] bArr, OutputStream outputStream) throws IOException {
        return OooO00o.OooO00o(bArr, 0, bArr.length, outputStream);
    }

    public static byte[] OooO00o(String str) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            OooO00o.OooO00o(str, byteArrayOutputStream);
            return byteArrayOutputStream.toByteArray();
        } catch (Exception e) {
            throw new DecoderException("exception decoding URL safe base64 string: " + e.getMessage(), e);
        }
    }

    public static byte[] OooO00o(byte[] bArr) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            OooO00o.OooO00o(bArr, 0, bArr.length, byteArrayOutputStream);
            return byteArrayOutputStream.toByteArray();
        } catch (Exception e) {
            throw new DecoderException("exception decoding URL safe base64 string: " + e.getMessage(), e);
        }
    }

    public static int OooO0O0(byte[] bArr, OutputStream outputStream) throws IOException {
        return OooO00o.OooO0O0(bArr, 0, bArr.length, outputStream);
    }

    public static byte[] OooO0O0(byte[] bArr) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            OooO00o.OooO0O0(bArr, 0, bArr.length, byteArrayOutputStream);
            return byteArrayOutputStream.toByteArray();
        } catch (Exception e) {
            throw new EncoderException("exception encoding URL safe base64 data: " + e.getMessage(), e);
        }
    }
}

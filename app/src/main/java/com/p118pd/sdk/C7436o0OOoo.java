package com.p118pd.sdk;

import com.adobe.xmp.XMPException;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;

/* renamed from: com.pd.sdk.o0OOoo  reason: case insensitive filesystem */
public class C7436o0OOoo {
    public static String OooO00o(C7433o0OOoOOO o0oooooo, C7456o0Oo0O00 o0oo0o00) throws XMPException {
        if (o0oo0o00 == null) {
            o0oo0o00 = new C7456o0Oo0O00();
        }
        o0oo0o00.OooO00o(true);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(2048);
        OooO00o(o0oooooo, byteArrayOutputStream, o0oo0o00);
        try {
            return byteArrayOutputStream.toString(o0oo0o00.m19084OooO0O0());
        } catch (UnsupportedEncodingException unused) {
            return byteArrayOutputStream.toString();
        }
    }

    public static void OooO00o(C7433o0OOoOOO o0oooooo, OutputStream outputStream, C7456o0Oo0O00 o0oo0o00) throws XMPException {
        if (o0oo0o00 == null) {
            o0oo0o00 = new C7456o0Oo0O00();
        }
        if (o0oo0o00.OooO()) {
            o0oooooo.m19018OooO00o();
        }
        new C7440o0OOooO().OooO00o(o0oooooo, outputStream, o0oo0o00);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static byte[] m19046OooO00o(C7433o0OOoOOO o0oooooo, C7456o0Oo0O00 o0oo0o00) throws XMPException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(2048);
        OooO00o(o0oooooo, byteArrayOutputStream, o0oo0o00);
        return byteArrayOutputStream.toByteArray();
    }
}

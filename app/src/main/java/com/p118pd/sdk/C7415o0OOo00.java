package com.p118pd.sdk;

import com.adobe.xmp.XMPException;
import java.io.InputStream;
import java.io.OutputStream;

/* renamed from: com.pd.sdk.o0OOo00  reason: case insensitive filesystem */
public final class C7415o0OOo00 {
    public static AbstractC7418o0OOo00o OooO00o = new C7439o0OOoo0o();

    /* renamed from: OooO00o  reason: collision with other field name */
    public static AbstractC7527o0OooOo f20235OooO00o = null;

    /* renamed from: com.pd.sdk.o0OOo00$OooO00o */
    public static class OooO00o implements AbstractC7527o0OooOo {
        @Override // com.p118pd.sdk.AbstractC7527o0OooOo, com.p118pd.sdk.AbstractC7527o0OooOo, com.p118pd.sdk.AbstractC7527o0OooOo
        public int OooO00o() {
            return 5;
        }

        @Override // com.p118pd.sdk.AbstractC7527o0OooOo, com.p118pd.sdk.AbstractC7527o0OooOo, com.p118pd.sdk.AbstractC7527o0OooOo
        /* renamed from: OooO00o  reason: collision with other method in class */
        public String m18956OooO00o() {
            return "Adobe XMP Core 5.1.0-jc003";
        }

        @Override // com.p118pd.sdk.AbstractC7527o0OooOo, com.p118pd.sdk.AbstractC7527o0OooOo, com.p118pd.sdk.AbstractC7527o0OooOo
        /* renamed from: OooO00o  reason: collision with other method in class */
        public boolean m18957OooO00o() {
            return false;
        }

        @Override // com.p118pd.sdk.AbstractC7527o0OooOo
        public int OooO0O0() {
            return 0;
        }

        @Override // com.p118pd.sdk.AbstractC7527o0OooOo
        public int OooO0OO() {
            return 1;
        }

        @Override // com.p118pd.sdk.AbstractC7527o0OooOo
        public int OooO0Oo() {
            return 3;
        }

        public String toString() {
            return "Adobe XMP Core 5.1.0-jc003";
        }
    }

    public static AbstractC7416o0OOo000 OooO00o() {
        return new C7433o0OOoOOO();
    }

    public static AbstractC7416o0OOo000 OooO00o(InputStream inputStream) throws XMPException {
        return OooO00o(inputStream, (C7448o0Oo0) null);
    }

    public static AbstractC7416o0OOo000 OooO00o(InputStream inputStream, C7448o0Oo0 o0oo0) throws XMPException {
        return C7435o0OOoOo0.OooO00o((Object) inputStream, o0oo0);
    }

    public static AbstractC7416o0OOo000 OooO00o(String str) throws XMPException {
        return OooO00o(str, (C7448o0Oo0) null);
    }

    public static AbstractC7416o0OOo000 OooO00o(String str, C7448o0Oo0 o0oo0) throws XMPException {
        return C7435o0OOoOo0.OooO00o((Object) str, o0oo0);
    }

    public static AbstractC7416o0OOo000 OooO00o(byte[] bArr) throws XMPException {
        return OooO00o(bArr, (C7448o0Oo0) null);
    }

    public static AbstractC7416o0OOo000 OooO00o(byte[] bArr, C7448o0Oo0 o0oo0) throws XMPException {
        return C7435o0OOoOo0.OooO00o((Object) bArr, o0oo0);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static AbstractC7418o0OOo00o m18952OooO00o() {
        return OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static synchronized AbstractC7527o0OooOo m18953OooO00o() {
        AbstractC7527o0OooOo o0ooooo;
        synchronized (C7415o0OOo00.class) {
            if (f20235OooO00o == null) {
                try {
                    f20235OooO00o = new OooO00o();
                } catch (Throwable th) {
                    System.out.println(th);
                }
            }
            o0ooooo = f20235OooO00o;
        }
        return o0ooooo;
    }

    public static String OooO00o(AbstractC7416o0OOo000 o0ooo000, C7456o0Oo0O00 o0oo0o00) throws XMPException {
        OooO00o(o0ooo000);
        return C7436o0OOoo.OooO00o((C7433o0OOoOOO) o0ooo000, o0oo0o00);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static void m18954OooO00o() {
        OooO00o = new C7439o0OOoo0o();
    }

    public static void OooO00o(AbstractC7416o0OOo000 o0ooo000) {
        if (!(o0ooo000 instanceof C7433o0OOoOOO)) {
            throw new UnsupportedOperationException("The serializing service works onlywith the XMPMeta implementation of this library");
        }
    }

    public static void OooO00o(AbstractC7416o0OOo000 o0ooo000, OutputStream outputStream) throws XMPException {
        OooO00o(o0ooo000, outputStream, null);
    }

    public static void OooO00o(AbstractC7416o0OOo000 o0ooo000, OutputStream outputStream, C7456o0Oo0O00 o0oo0o00) throws XMPException {
        OooO00o(o0ooo000);
        C7436o0OOoo.OooO00o((C7433o0OOoOOO) o0ooo000, outputStream, o0oo0o00);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static byte[] m18955OooO00o(AbstractC7416o0OOo000 o0ooo000, C7456o0Oo0O00 o0oo0o00) throws XMPException {
        OooO00o(o0ooo000);
        return C7436o0OOoo.m19046OooO00o((C7433o0OOoOOO) o0ooo000, o0oo0o00);
    }
}

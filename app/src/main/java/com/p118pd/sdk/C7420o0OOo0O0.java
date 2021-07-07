package com.p118pd.sdk;

import com.adobe.xmp.XMPException;
import com.facebook.react.uimanager.ViewProps;

/* renamed from: com.pd.sdk.o0OOo0O0  reason: case insensitive filesystem */
public class C7420o0OOo0O0 {
    public static double OooO00o(String str) throws XMPException {
        if (str != null) {
            try {
                if (str.length() != 0) {
                    return Double.parseDouble(str);
                }
            } catch (NumberFormatException unused) {
                throw new XMPException("Invalid double string", 5);
            }
        }
        throw new XMPException("Empty convert-string", 5);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static int m18981OooO00o(String str) throws XMPException {
        if (str != null) {
            try {
                if (str.length() != 0) {
                    return str.startsWith("0x") ? Integer.parseInt(str.substring(2), 16) : Integer.parseInt(str);
                }
            } catch (NumberFormatException unused) {
                throw new XMPException("Invalid integer string", 5);
            }
        }
        throw new XMPException("Empty convert-string", 5);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static long m18982OooO00o(String str) throws XMPException {
        if (str != null) {
            try {
                if (str.length() != 0) {
                    return str.startsWith("0x") ? Long.parseLong(str.substring(2), 16) : Long.parseLong(str);
                }
            } catch (NumberFormatException unused) {
                throw new XMPException("Invalid long string", 5);
            }
        }
        throw new XMPException("Empty convert-string", 5);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static AbstractC7412o0OOOoo0 m18983OooO00o(String str) throws XMPException {
        if (str != null && str.length() != 0) {
            return C7423o0OOo0o.OooO00o(str);
        }
        throw new XMPException("Empty convert-string", 5);
    }

    public static String OooO00o(double d) {
        return String.valueOf(d);
    }

    public static String OooO00o(int i) {
        return String.valueOf(i);
    }

    public static String OooO00o(long j) {
        return String.valueOf(j);
    }

    public static String OooO00o(AbstractC7412o0OOOoo0 o0ooooo0) {
        return C7423o0OOo0o.OooO00o(o0ooooo0);
    }

    public static String OooO00o(AbstractC7416o0OOo000 o0ooo000, String str, String str2, String str3, String str4, boolean z) throws XMPException {
        return C7442o0OOooOO.OooO00o(o0ooo000, str, str2, str3, str4, z);
    }

    public static String OooO00o(boolean z) {
        return z ? AbstractC7410o0OOOoOo.OooooOo : AbstractC7410o0OOOoOo.Oooooo0;
    }

    public static String OooO00o(byte[] bArr) {
        return new String(C7419o0OOo0O.OooO0O0(bArr));
    }

    public static void OooO00o(AbstractC7416o0OOo000 o0ooo000, AbstractC7416o0OOo000 o0ooo0002, boolean z, boolean z2) throws XMPException {
        OooO00o(o0ooo000, o0ooo0002, z, z2, false);
    }

    public static void OooO00o(AbstractC7416o0OOo000 o0ooo000, AbstractC7416o0OOo000 o0ooo0002, boolean z, boolean z2, boolean z3) throws XMPException {
        C7442o0OOooOO.OooO00o(o0ooo000, o0ooo0002, z, z2, z3);
    }

    public static void OooO00o(AbstractC7416o0OOo000 o0ooo000, String str, String str2, String str3, C7710o0ooO0O0 o0ooo0o0, boolean z) throws XMPException {
        C7442o0OOooOO.OooO00o(o0ooo000, str, str2, str3, o0ooo0o0, z);
    }

    public static void OooO00o(AbstractC7416o0OOo000 o0ooo000, String str, String str2, boolean z, boolean z2) throws XMPException {
        C7442o0OOooOO.OooO00o(o0ooo000, str, str2, z, z2);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static boolean m18984OooO00o(String str) throws XMPException {
        if (str == null || str.length() == 0) {
            throw new XMPException("Empty convert-string", 5);
        }
        String lowerCase = str.toLowerCase();
        try {
            return Integer.parseInt(lowerCase) != 0;
        } catch (NumberFormatException unused) {
            return "true".equals(lowerCase) || "t".equals(lowerCase) || ViewProps.f984ON.equals(lowerCase) || "yes".equals(lowerCase);
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static byte[] m18985OooO00o(String str) throws XMPException {
        try {
            return C7419o0OOo0O.OooO00o(str.getBytes());
        } catch (Throwable th) {
            throw new XMPException("Invalid base64 string", 5, th);
        }
    }
}

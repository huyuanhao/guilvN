package com.p118pd.sdk;

import com.adobe.xmp.XMPException;

/* renamed from: com.pd.sdk.o0OOo0oo  reason: case insensitive filesystem */
public class C7426o0OOo0oo implements AbstractC7410o0OOOoOo {
    public static void OooO00o(AbstractC7416o0OOo000 o0ooo000) throws XMPException {
        if (o0ooo000 == null) {
            throw new XMPException("Parameter must not be null", 4);
        } else if (!(o0ooo000 instanceof C7433o0OOoOOO)) {
            throw new XMPException("The XMPMeta-object is not compatible with this implementation", 4);
        }
    }

    public static void OooO00o(Object obj) throws XMPException {
        if (obj == null) {
            throw new XMPException("Parameter must not be null", 4);
        } else if ((obj instanceof String) && ((String) obj).length() == 0) {
            throw new XMPException("Parameter must not be null or empty", 4);
        }
    }

    public static void OooO00o(String str) throws XMPException {
        if (str == null || str.length() == 0) {
            throw new XMPException("Empty array name", 4);
        }
    }

    public static void OooO0O0(String str) throws XMPException {
        if (str == null || str.length() == 0) {
            throw new XMPException("Empty prefix", 4);
        }
    }

    public static void OooO0OO(String str) throws XMPException {
        if (str == null || str.length() == 0) {
            throw new XMPException("Empty property name", 4);
        }
    }

    public static void OooO0Oo(String str) throws XMPException {
        if (str == null || str.length() == 0) {
            throw new XMPException("Empty schema namespace URI", 4);
        }
    }

    public static void OooO0o(String str) throws XMPException {
        if (str == null || str.length() == 0) {
            throw new XMPException("Empty array name", 4);
        }
    }

    public static void OooO0o0(String str) throws XMPException {
        if (str == null || str.length() == 0) {
            throw new XMPException("Empty specific language", 4);
        }
    }
}

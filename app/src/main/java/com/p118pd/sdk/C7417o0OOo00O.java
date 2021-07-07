package com.p118pd.sdk;

import com.adobe.xmp.XMPException;

/* renamed from: com.pd.sdk.o0OOo00O  reason: case insensitive filesystem */
public final class C7417o0OOo00O {
    public static String OooO00o(String str, int i) throws XMPException {
        if (i > 0) {
            return str + '[' + i + ']';
        } else if (i == -1) {
            return str + "[last()]";
        } else {
            throw new XMPException("Array index must be larger than zero", 104);
        }
    }

    public static String OooO00o(String str, String str2) {
        return str + "[?xml:lang=\"" + C7431o0OOoO0o.OooO00o(str2) + "\"]";
    }

    public static String OooO00o(String str, String str2, String str3, String str4) throws XMPException {
        C7445o0OOooo0 OooO00o = C7444o0OOooo.OooO00o(str2, str3);
        if (OooO00o.OooO00o() == 2) {
            return str + '[' + OooO00o.OooO00o(1).m19070OooO00o() + "=\"" + str4 + "\"]";
        }
        throw new XMPException("The fieldName name must be simple", 102);
    }

    public static void OooO00o(String str) throws XMPException {
        if (str == null || str.length() == 0) {
            throw new XMPException("Empty field namespace URI", 101);
        }
    }

    public static String OooO0O0(String str, String str2) throws XMPException {
        OooO0OO(str);
        OooO0Oo(str2);
        C7445o0OOooo0 OooO00o = C7444o0OOooo.OooO00o(str, str2);
        if (OooO00o.OooO00o() == 2) {
            return "/?" + OooO00o.OooO00o(1).m19070OooO00o();
        }
        throw new XMPException("The qualifier name must be simple", 102);
    }

    public static void OooO0O0(String str) throws XMPException {
        if (str == null || str.length() == 0) {
            throw new XMPException("Empty f name", 102);
        }
    }

    public static String OooO0OO(String str, String str2) throws XMPException {
        OooO00o(str);
        OooO0O0(str2);
        C7445o0OOooo0 OooO00o = C7444o0OOooo.OooO00o(str, str2);
        if (OooO00o.OooO00o() == 2) {
            return '/' + OooO00o.OooO00o(1).m19070OooO00o();
        }
        throw new XMPException("The field name must be simple", 102);
    }

    public static void OooO0OO(String str) throws XMPException {
        if (str == null || str.length() == 0) {
            throw new XMPException("Empty qualifier namespace URI", 101);
        }
    }

    public static void OooO0Oo(String str) throws XMPException {
        if (str == null || str.length() == 0) {
            throw new XMPException("Empty qualifier name", 102);
        }
    }
}

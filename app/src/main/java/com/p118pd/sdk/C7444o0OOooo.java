package com.p118pd.sdk;

import com.adobe.xmp.XMPException;

/* renamed from: com.pd.sdk.o0OOooo  reason: case insensitive filesystem */
public final class C7444o0OOooo {
    public static C7445o0OOooo0 OooO00o(String str, String str2) throws XMPException {
        if (str == null || str2 == null) {
            throw new XMPException("Parameter must not be null", 4);
        }
        C7445o0OOooo0 o0ooooo0 = new C7445o0OOooo0();
        C7443o0OOooOo o0oooooo = new C7443o0OOooOo();
        o0oooooo.f20274OooO00o = str2;
        OooO00o(str, o0oooooo, o0ooooo0);
        while (o0oooooo.OooO0Oo < str2.length()) {
            o0oooooo.OooO0OO = o0oooooo.OooO0Oo;
            OooO00o(str2, o0oooooo);
            int i = o0oooooo.OooO0OO;
            o0oooooo.OooO0Oo = i;
            C7451o0Oo00o0 OooO0O0 = str2.charAt(i) != '[' ? OooO0O0(o0oooooo) : OooO00o(o0oooooo);
            if (OooO0O0.OooO0O0() == 1) {
                if (OooO0O0.m19070OooO00o().charAt(0) == '@') {
                    OooO0O0.OooO00o(C8932ooOOO0o.f22176OooO00o + OooO0O0.m19070OooO00o().substring(1));
                    if (!"?xml:lang".equals(OooO0O0.m19070OooO00o())) {
                        throw new XMPException("Only xml:lang allowed with '@'", 102);
                    }
                }
                if (OooO0O0.m19070OooO00o().charAt(0) == '?') {
                    o0oooooo.OooO00o++;
                    OooO0O0.OooO0O0(2);
                }
            } else {
                if (OooO0O0.OooO0O0() != 6) {
                    continue;
                } else {
                    if (OooO0O0.m19070OooO00o().charAt(1) == '@') {
                        OooO0O0.OooO00o("[?" + OooO0O0.m19070OooO00o().substring(2));
                        if (!OooO0O0.m19070OooO00o().startsWith("[?xml:lang=")) {
                            throw new XMPException("Only xml:lang allowed with '@'", 102);
                        }
                    }
                    if (OooO0O0.m19070OooO00o().charAt(1) == '?') {
                        o0oooooo.OooO00o++;
                        OooO0O0.OooO0O0(5);
                    }
                }
                o0ooooo0.OooO00o(OooO0O0);
            }
            OooO00o(o0oooooo.f20274OooO00o.substring(o0oooooo.OooO00o, o0oooooo.OooO0O0));
            o0ooooo0.OooO00o(OooO0O0);
        }
        return o0ooooo0;
    }

    public static C7451o0Oo00o0 OooO00o(C7443o0OOooOo o0oooooo) throws XMPException {
        C7451o0Oo00o0 o0oo00o0;
        int i = o0oooooo.OooO0Oo + 1;
        o0oooooo.OooO0Oo = i;
        if ('0' > o0oooooo.f20274OooO00o.charAt(i) || o0oooooo.f20274OooO00o.charAt(o0oooooo.OooO0Oo) > '9') {
            while (o0oooooo.OooO0Oo < o0oooooo.f20274OooO00o.length() && o0oooooo.f20274OooO00o.charAt(o0oooooo.OooO0Oo) != ']' && o0oooooo.f20274OooO00o.charAt(o0oooooo.OooO0Oo) != '=') {
                o0oooooo.OooO0Oo++;
            }
            if (o0oooooo.OooO0Oo >= o0oooooo.f20274OooO00o.length()) {
                throw new XMPException("Missing ']' or '=' for array index", 102);
            } else if (o0oooooo.f20274OooO00o.charAt(o0oooooo.OooO0Oo) != ']') {
                o0oooooo.OooO00o = o0oooooo.OooO0OO + 1;
                int i2 = o0oooooo.OooO0Oo;
                o0oooooo.OooO0O0 = i2;
                int i3 = i2 + 1;
                o0oooooo.OooO0Oo = i3;
                char charAt = o0oooooo.f20274OooO00o.charAt(i3);
                if (charAt == '\'' || charAt == '\"') {
                    while (true) {
                        o0oooooo.OooO0Oo++;
                        if (o0oooooo.OooO0Oo < o0oooooo.f20274OooO00o.length()) {
                            if (o0oooooo.f20274OooO00o.charAt(o0oooooo.OooO0Oo) == charAt) {
                                if (o0oooooo.OooO0Oo + 1 >= o0oooooo.f20274OooO00o.length() || o0oooooo.f20274OooO00o.charAt(o0oooooo.OooO0Oo + 1) != charAt) {
                                    break;
                                }
                                o0oooooo.OooO0Oo++;
                            }
                        } else {
                            break;
                        }
                    }
                    if (o0oooooo.OooO0Oo < o0oooooo.f20274OooO00o.length()) {
                        o0oooooo.OooO0Oo++;
                        o0oo00o0 = new C7451o0Oo00o0(null, 6);
                    } else {
                        throw new XMPException("No terminating quote for array selector", 102);
                    }
                } else {
                    throw new XMPException("Invalid quote in array selector", 102);
                }
            } else if ("[last()".equals(o0oooooo.f20274OooO00o.substring(o0oooooo.OooO0OO, o0oooooo.OooO0Oo))) {
                o0oo00o0 = new C7451o0Oo00o0(null, 4);
            } else {
                throw new XMPException("Invalid non-numeric array index", 102);
            }
        } else {
            while (o0oooooo.OooO0Oo < o0oooooo.f20274OooO00o.length() && '0' <= o0oooooo.f20274OooO00o.charAt(o0oooooo.OooO0Oo) && o0oooooo.f20274OooO00o.charAt(o0oooooo.OooO0Oo) <= '9') {
                o0oooooo.OooO0Oo++;
            }
            o0oo00o0 = new C7451o0Oo00o0(null, 3);
        }
        if (o0oooooo.OooO0Oo >= o0oooooo.f20274OooO00o.length() || o0oooooo.f20274OooO00o.charAt(o0oooooo.OooO0Oo) != ']') {
            throw new XMPException("Missing ']' for array index", 102);
        }
        int i4 = o0oooooo.OooO0Oo + 1;
        o0oooooo.OooO0Oo = i4;
        o0oo00o0.OooO00o(o0oooooo.f20274OooO00o.substring(o0oooooo.OooO0OO, i4));
        return o0oo00o0;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static String m19064OooO00o(String str, String str2) throws XMPException {
        if (str == null || str.length() == 0) {
            throw new XMPException("Schema namespace URI is required", 101);
        } else if (str2.charAt(0) == '?' || str2.charAt(0) == '@') {
            throw new XMPException("Top level name must not be a qualifier", 102);
        } else if (str2.indexOf(47) >= 0 || str2.indexOf(91) >= 0) {
            throw new XMPException("Top level name must be simple", 102);
        } else {
            String OooO00o = C7415o0OOo00.m18952OooO00o().m18977OooO00o(str);
            if (OooO00o != null) {
                int indexOf = str2.indexOf(58);
                if (indexOf < 0) {
                    OooO0O0(str2);
                    return OooO00o + str2;
                }
                OooO0O0(str2.substring(0, indexOf));
                OooO0O0(str2.substring(indexOf));
                String substring = str2.substring(0, indexOf + 1);
                String OooO00o2 = C7415o0OOo00.m18952OooO00o().m18977OooO00o(str);
                if (OooO00o2 == null) {
                    throw new XMPException("Unknown schema namespace prefix", 101);
                } else if (substring.equals(OooO00o2)) {
                    return str2;
                } else {
                    throw new XMPException("Schema namespace URI and prefix mismatch", 101);
                }
            } else {
                throw new XMPException("Unregistered schema namespace URI", 101);
            }
        }
    }

    public static void OooO00o(String str) throws XMPException {
        int indexOf = str.indexOf(58);
        if (indexOf > 0) {
            String substring = str.substring(0, indexOf);
            if (C7431o0OOoO0o.OooO0OO(substring)) {
                if (C7415o0OOo00.m18952OooO00o().OooO0O0(substring) == null) {
                    throw new XMPException("Unknown namespace prefix for qualified name", 102);
                }
                return;
            }
        }
        throw new XMPException("Ill-formed qualified name", 102);
    }

    public static void OooO00o(String str, C7443o0OOooOo o0oooooo) throws XMPException {
        if (str.charAt(o0oooooo.OooO0OO) == '/') {
            int i = o0oooooo.OooO0OO + 1;
            o0oooooo.OooO0OO = i;
            if (i >= str.length()) {
                throw new XMPException("Empty XMPPath segment", 102);
            }
        }
        if (str.charAt(o0oooooo.OooO0OO) == '*') {
            int i2 = o0oooooo.OooO0OO + 1;
            o0oooooo.OooO0OO = i2;
            if (i2 >= str.length() || str.charAt(o0oooooo.OooO0OO) != '[') {
                throw new XMPException("Missing '[' after '*'", 102);
            }
        }
    }

    public static void OooO00o(String str, C7443o0OOooOo o0oooooo, C7445o0OOooo0 o0ooooo0) throws XMPException {
        C7451o0Oo00o0 o0oo00o0;
        while (o0oooooo.OooO0Oo < o0oooooo.f20274OooO00o.length() && "/[*".indexOf(o0oooooo.f20274OooO00o.charAt(o0oooooo.OooO0Oo)) < 0) {
            o0oooooo.OooO0Oo++;
        }
        int i = o0oooooo.OooO0Oo;
        int i2 = o0oooooo.OooO0OO;
        if (i != i2) {
            String OooO00o = m19064OooO00o(str, o0oooooo.f20274OooO00o.substring(i2, i));
            AbstractC7455o0Oo0O0 OooO00o2 = C7415o0OOo00.m18952OooO00o().OooO00o(OooO00o);
            if (OooO00o2 == null) {
                o0ooooo0.OooO00o(new C7451o0Oo00o0(str, Integer.MIN_VALUE));
                o0oo00o0 = new C7451o0Oo00o0(OooO00o, 1);
            } else {
                o0ooooo0.OooO00o(new C7451o0Oo00o0(OooO00o2.getNamespace(), Integer.MIN_VALUE));
                C7451o0Oo00o0 o0oo00o02 = new C7451o0Oo00o0(m19064OooO00o(OooO00o2.getNamespace(), OooO00o2.OooO0O0()), 1);
                o0oo00o02.OooO00o(true);
                o0oo00o02.OooO00o(OooO00o2.OooO00o().m19073OooO00o());
                o0ooooo0.OooO00o(o0oo00o02);
                if (OooO00o2.OooO00o().m19069OooO0O0()) {
                    o0oo00o0 = new C7451o0Oo00o0("[?xml:lang='x-default']", 5);
                } else if (OooO00o2.OooO00o().m19068OooO00o()) {
                    o0oo00o0 = new C7451o0Oo00o0("[1]", 3);
                } else {
                    return;
                }
                o0oo00o0.OooO00o(true);
                o0oo00o0.OooO00o(OooO00o2.OooO00o().m19073OooO00o());
            }
            o0ooooo0.OooO00o(o0oo00o0);
            return;
        }
        throw new XMPException("Empty initial XMPPath step", 102);
    }

    public static C7451o0Oo00o0 OooO0O0(C7443o0OOooOo o0oooooo) throws XMPException {
        o0oooooo.OooO00o = o0oooooo.OooO0OO;
        while (o0oooooo.OooO0Oo < o0oooooo.f20274OooO00o.length() && "/[*".indexOf(o0oooooo.f20274OooO00o.charAt(o0oooooo.OooO0Oo)) < 0) {
            o0oooooo.OooO0Oo++;
        }
        int i = o0oooooo.OooO0Oo;
        o0oooooo.OooO0O0 = i;
        int i2 = o0oooooo.OooO0OO;
        if (i != i2) {
            return new C7451o0Oo00o0(o0oooooo.f20274OooO00o.substring(i2, i), 1);
        }
        throw new XMPException("Empty XMPPath segment", 102);
    }

    public static void OooO0O0(String str) throws XMPException {
        if (!C7431o0OOoO0o.m19000OooO0O0(str)) {
            throw new XMPException("Bad XML name", 102);
        }
    }
}

package com.p118pd.sdk;

import com.adobe.xmp.XMPException;
import java.util.Iterator;

/* renamed from: com.pd.sdk.o0OOooOO  reason: case insensitive filesystem */
public class C7442o0OOooOO implements AbstractC7410o0OOOoOo {
    public static final /* synthetic */ boolean OooO0O0 = false;
    public static final int o00oO0O = 0;
    public static final String o0OO00O = "  ";
    public static final int o0OOO0o = 4;

    /* renamed from: o0OOO0o  reason: collision with other field name */
    public static final String f20270o0OOO0o = ";；﹔؛;";
    public static final int o0Oo0oo = 5;

    /* renamed from: o0Oo0oo  reason: collision with other field name */
    public static final String f20271o0Oo0oo = "\"«»〝〞〟―‹›";
    public static final int o0ooOO0 = 1;
    public static final int o0ooOOo = 2;

    /* renamed from: o0ooOOo  reason: collision with other field name */
    public static final String f20272o0ooOOo = " 　〿";
    public static final int o0ooOoO = 3;

    /* renamed from: o0ooOoO  reason: collision with other field name */
    public static final String f20273o0ooOoO = ",，､﹐﹑、،՝";

    public static char OooO00o(char c) {
        switch (c) {
            case '\"':
                return C8318oOo0oooo.OooO00o;
            case 171:
                return C8318oOo0oooo.OooOOO0;
            case 187:
                return C8318oOo0oooo.OooOO0o;
            case 8213:
                return 8213;
            case 8216:
                return C8318oOo0oooo.OooOo0o;
            case 8218:
                return 8219;
            case 8220:
                return C8318oOo0oooo.OooOoO;
            case C8010oOO000oO.Oooo00O /*{ENCODED_INT: 8222}*/:
                return 8223;
            case 8249:
                return 8250;
            case 8250:
                return 8249;
            case C8400oOoo00oO.OooOoOO /*{ENCODED_INT: 12296}*/:
                return 12297;
            case C8400oOoo00oO.OooOoo /*{ENCODED_INT: 12298}*/:
                return 12299;
            case C8400oOoo00oO.OooOooo /*{ENCODED_INT: 12300}*/:
                return 12301;
            case C8400oOoo00oO.Oooo00O /*{ENCODED_INT: 12302}*/:
                return 12303;
            case 12317:
                return 12319;
            default:
                return 0;
        }
    }

    public static char OooO00o(String str, char c) throws XMPException {
        char c2;
        if (m19063OooO00o(c) == 4) {
            if (str.length() == 1) {
                c2 = c;
            } else {
                c2 = str.charAt(1);
                if (m19063OooO00o(c2) != 4) {
                    throw new XMPException("Invalid quoting character", 4);
                }
            }
            if (c2 == OooO00o(c)) {
                return c2;
            }
            throw new XMPException("Mismatched quote pair", 4);
        }
        throw new XMPException("Invalid quoting character", 4);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static int m19063OooO00o(char c) {
        if (f20272o0ooOOo.indexOf(c) >= 0) {
            return 1;
        }
        if (8192 <= c && c <= 8203) {
            return 1;
        }
        if (f20273o0ooOoO.indexOf(c) >= 0) {
            return 2;
        }
        if (f20270o0OOO0o.indexOf(c) >= 0) {
            return 3;
        }
        if (f20271o0Oo0oo.indexOf(c) >= 0) {
            return 4;
        }
        if (12296 <= c && c <= 12303) {
            return 4;
        }
        if (8216 > c || c > 8223) {
            return (c < ' ' || o0OO00O.indexOf(c) >= 0) ? 5 : 0;
        }
        return 4;
    }

    public static C7434o0OOoOo OooO00o(String str, String str2, C7710o0ooO0O0 o0ooo0o0, C7433o0OOoOOO o0oooooo) throws XMPException {
        C7710o0ooO0O0 OooO00o = C7437o0OOoo0.OooO00o(o0ooo0o0, (Object) null);
        if (OooO00o.OooO()) {
            C7445o0OOooo0 OooO00o2 = C7444o0OOooo.OooO00o(str, str2);
            C7434o0OOoOo OooO00o3 = C7437o0OOoo0.OooO00o(o0oooooo.m19008OooO00o(), OooO00o2, false, (C7710o0ooO0O0) null);
            if (OooO00o3 != null) {
                C7710o0ooO0O0 OooO00o4 = OooO00o3.m19030OooO00o();
                if (!OooO00o4.OooO0Oo() || OooO00o4.OooO0o()) {
                    throw new XMPException("Named property must be non-alternate array", 102);
                } else if (OooO00o.m19350OooO00o(OooO00o4)) {
                    throw new XMPException("Mismatch of specified and existing array form", 102);
                }
            } else {
                OooO00o3 = C7437o0OOoo0.OooO00o(o0oooooo.m19008OooO00o(), OooO00o2, true, OooO00o.OooO00o(true));
                if (OooO00o3 == null) {
                    throw new XMPException("Failed to create named array", 102);
                }
            }
            return OooO00o3;
        }
        throw new XMPException("Options can only provide array form", 103);
    }

    public static String OooO00o(AbstractC7416o0OOo000 o0ooo000, String str, String str2, String str3, String str4, boolean z) throws XMPException {
        C7426o0OOo0oo.OooO0Oo(str);
        C7426o0OOo0oo.OooO00o(str2);
        C7426o0OOo0oo.OooO00o(o0ooo000);
        if (str3 == null || str3.length() == 0) {
            str3 = "; ";
        }
        if (str4 == null || str4.length() == 0) {
            str4 = "\"";
        }
        C7434o0OOoOo OooO00o = C7437o0OOoo0.OooO00o(((C7433o0OOoOOO) o0ooo000).m19008OooO00o(), C7444o0OOooo.OooO00o(str, str2), false, (C7710o0ooO0O0) null);
        if (OooO00o == null) {
            return "";
        }
        if (!OooO00o.m19030OooO00o().OooO0Oo() || OooO00o.m19030OooO00o().OooO0o()) {
            throw new XMPException("Named property must be non-alternate array", 4);
        }
        OooO00o(str3);
        char charAt = str4.charAt(0);
        char OooO00o2 = OooO00o(str4, charAt);
        StringBuffer stringBuffer = new StringBuffer();
        Iterator OooO00o3 = OooO00o.m19032OooO00o();
        while (OooO00o3.hasNext()) {
            C7434o0OOoOo o0ooooo = (C7434o0OOoOo) OooO00o3.next();
            if (!o0ooooo.m19030OooO00o().OooO0oo()) {
                stringBuffer.append(OooO00o(o0ooooo.m19037OooO0O0(), charAt, OooO00o2, z));
                if (OooO00o3.hasNext()) {
                    stringBuffer.append(str3);
                }
            } else {
                throw new XMPException("Array items must be simple", 4);
            }
        }
        return stringBuffer.toString();
    }

    public static String OooO00o(String str, char c, char c2, boolean z) {
        if (str == null) {
            str = "";
        }
        int i = 0;
        boolean z2 = false;
        while (i < str.length()) {
            int OooO00o = m19063OooO00o(str.charAt(i));
            if (i == 0 && OooO00o == 4) {
                break;
            }
            if (OooO00o != 1) {
                if (OooO00o == 3 || OooO00o == 5 || (OooO00o == 2 && !z)) {
                    break;
                }
                z2 = false;
            } else if (z2) {
                break;
            } else {
                z2 = true;
            }
            i++;
        }
        if (i >= str.length()) {
            return str;
        }
        StringBuffer stringBuffer = new StringBuffer(str.length() + 2);
        int i2 = 0;
        while (i2 <= i && m19063OooO00o(str.charAt(i)) != 4) {
            i2++;
        }
        stringBuffer.append(c);
        stringBuffer.append(str.substring(0, i2));
        while (i2 < str.length()) {
            stringBuffer.append(str.charAt(i2));
            if (m19063OooO00o(str.charAt(i2)) == 4 && OooO0O0(str.charAt(i2), c, c2)) {
                stringBuffer.append(str.charAt(i2));
            }
            i2++;
        }
        stringBuffer.append(c2);
        return stringBuffer.toString();
    }

    public static void OooO00o(AbstractC7416o0OOo000 o0ooo000, AbstractC7416o0OOo000 o0ooo0002, boolean z, boolean z2, boolean z3) throws XMPException {
        C7426o0OOo0oo.OooO00o(o0ooo000);
        C7426o0OOo0oo.OooO00o(o0ooo0002);
        C7433o0OOoOOO o0oooooo = (C7433o0OOoOOO) o0ooo0002;
        Iterator OooO00o = ((C7433o0OOoOOO) o0ooo000).m19008OooO00o().m19032OooO00o();
        while (OooO00o.hasNext()) {
            C7434o0OOoOo o0ooooo = (C7434o0OOoOo) OooO00o.next();
            boolean z4 = false;
            C7434o0OOoOo OooO0OO = C7437o0OOoo0.OooO0OO(o0oooooo.m19008OooO00o(), o0ooooo.m19031OooO00o(), false);
            if (OooO0OO == null) {
                OooO0OO = new C7434o0OOoOo(o0ooooo.m19031OooO00o(), o0ooooo.m19037OooO0O0(), new C7710o0ooO0O0().OooO(true));
                o0oooooo.m19008OooO00o().OooO00o(OooO0OO);
                z4 = true;
            }
            Iterator OooO00o2 = o0ooooo.m19032OooO00o();
            while (OooO00o2.hasNext()) {
                C7434o0OOoOo o0ooooo2 = (C7434o0OOoOo) OooO00o2.next();
                if (z || !C7431o0OOoO0o.OooO00o(o0ooooo.m19031OooO00o(), o0ooooo2.m19031OooO00o())) {
                    OooO00o(o0oooooo, o0ooooo2, OooO0OO, z2, z3);
                }
            }
            if (!OooO0OO.OooO0o() && (z4 || z3)) {
                o0oooooo.m19008OooO00o().OooO0Oo(OooO0OO);
            }
        }
    }

    public static void OooO00o(AbstractC7416o0OOo000 o0ooo000, String str, String str2, String str3, C7710o0ooO0O0 o0ooo0o0, boolean z) throws XMPException {
        String str4;
        int i;
        StringBuilder sb;
        char c;
        int i2;
        int OooO00o;
        C7426o0OOo0oo.OooO0Oo(str);
        C7426o0OOo0oo.OooO00o(str2);
        if (str3 != null) {
            C7426o0OOo0oo.OooO00o(o0ooo000);
            C7434o0OOoOo OooO00o2 = OooO00o(str, str2, o0ooo0o0, (C7433o0OOoOOO) o0ooo000);
            int length = str3.length();
            int i3 = 0;
            int i4 = 0;
            char c2 = 0;
            while (i3 < length) {
                while (i3 < length) {
                    c2 = str3.charAt(i3);
                    i4 = m19063OooO00o(c2);
                    if (i4 == 0 || i4 == 4) {
                        break;
                    }
                    i3++;
                }
                if (i3 < length) {
                    int i5 = 1;
                    if (i4 != 4) {
                        i = i3;
                        while (i < length) {
                            c2 = str3.charAt(i);
                            i4 = m19063OooO00o(c2);
                            if (i4 != 0 && i4 != 4 && ((i4 != 2 || !z) && (i4 != 1 || (i2 = i + 1) >= length || ((OooO00o = m19063OooO00o((c2 = str3.charAt(i2)))) != 0 && OooO00o != 4 && (OooO00o != 2 || !z))))) {
                                break;
                            }
                            i++;
                        }
                        str4 = str3.substring(i3, i);
                    } else {
                        char OooO00o3 = OooO00o(c2);
                        int i6 = i3 + 1;
                        String str5 = "";
                        char c3 = c2;
                        while (true) {
                            if (i6 >= length) {
                                i = i6;
                                str4 = str5;
                                c2 = c3;
                                break;
                            }
                            c3 = str3.charAt(i6);
                            i4 = m19063OooO00o(c3);
                            if (i4 == 4 && OooO0O0(c3, c2, OooO00o3)) {
                                int i7 = i6 + 1;
                                if (i7 < length) {
                                    c = str3.charAt(i7);
                                    m19063OooO00o(c);
                                } else {
                                    c = ';';
                                }
                                if (c3 != c) {
                                    if (OooO00o(c3, c2, OooO00o3)) {
                                        str4 = str5;
                                        c2 = c3;
                                        i = i7;
                                        break;
                                    }
                                    sb = new StringBuilder();
                                } else {
                                    str5 = str5 + c3;
                                    i6 = i7;
                                    i6++;
                                }
                            } else {
                                sb = new StringBuilder();
                            }
                            sb.append(str5);
                            sb.append(c3);
                            str5 = sb.toString();
                            i6++;
                        }
                    }
                    int i8 = -1;
                    while (true) {
                        if (i5 > OooO00o2.OooO00o()) {
                            break;
                        } else if (str4.equals(OooO00o2.OooO00o(i5).m19037OooO0O0())) {
                            i8 = i5;
                            break;
                        } else {
                            i5++;
                        }
                    }
                    if (i8 < 0) {
                        OooO00o2.OooO00o(new C7434o0OOoOo("[]", str4, null));
                    }
                    i3 = i;
                } else {
                    return;
                }
            }
            return;
        }
        throw new XMPException("Parameter must not be null", 4);
    }

    public static void OooO00o(AbstractC7416o0OOo000 o0ooo000, String str, String str2, boolean z, boolean z2) throws XMPException {
        C7426o0OOo0oo.OooO00o(o0ooo000);
        C7433o0OOoOOO o0oooooo = (C7433o0OOoOOO) o0ooo000;
        if (str2 == null || str2.length() <= 0) {
            if (str == null || str.length() <= 0) {
                Iterator OooO00o = o0oooooo.m19008OooO00o().m19032OooO00o();
                while (OooO00o.hasNext()) {
                    if (OooO00o((C7434o0OOoOo) OooO00o.next(), z)) {
                        OooO00o.remove();
                    }
                }
                return;
            }
            C7434o0OOoOo OooO0OO = C7437o0OOoo0.OooO0OO(o0oooooo.m19008OooO00o(), str, false);
            if (OooO0OO != null && OooO00o(OooO0OO, z)) {
                o0oooooo.m19008OooO00o().OooO0Oo(OooO0OO);
            }
            if (z2) {
                AbstractC7455o0Oo0O0[] OooO00o2 = C7415o0OOo00.m18952OooO00o().m18980OooO00o(str);
                for (AbstractC7455o0Oo0O0 o0oo0o0 : OooO00o2) {
                    C7434o0OOoOo OooO00o3 = C7437o0OOoo0.OooO00o(o0oooooo.m19008OooO00o(), C7444o0OOooo.OooO00o(o0oo0o0.getNamespace(), o0oo0o0.OooO0O0()), false, (C7710o0ooO0O0) null);
                    if (OooO00o3 != null) {
                        OooO00o3.m19029OooO00o().OooO0Oo(OooO00o3);
                    }
                }
            }
        } else if (str == null || str.length() == 0) {
            throw new XMPException("Property name requires schema namespace", 4);
        } else {
            C7445o0OOooo0 OooO00o4 = C7444o0OOooo.OooO00o(str, str2);
            C7434o0OOoOo OooO00o5 = C7437o0OOoo0.OooO00o(o0oooooo.m19008OooO00o(), OooO00o4, false, (C7710o0ooO0O0) null);
            if (OooO00o5 == null) {
                return;
            }
            if (z || !C7431o0OOoO0o.OooO00o(OooO00o4.OooO00o(0).m19070OooO00o(), OooO00o4.OooO00o(1).m19070OooO00o())) {
                C7434o0OOoOo OooO00o6 = OooO00o5.m19029OooO00o();
                OooO00o6.OooO0Oo(OooO00o5);
                if (OooO00o6.m19030OooO00o().OooOO0O() && !OooO00o6.OooO0o()) {
                    OooO00o6.m19029OooO00o().OooO0Oo(OooO00o6);
                }
            }
        }
    }

    public static void OooO00o(C7433o0OOoOOO o0oooooo, C7434o0OOoOo o0ooooo, C7434o0OOoOo o0ooooo2, boolean z, boolean z2) throws XMPException {
        C7434o0OOoOo OooO00o = C7437o0OOoo0.m19047OooO00o(o0ooooo2, o0ooooo.m19031OooO00o(), false);
        boolean z3 = z2 && (!o0ooooo.m19030OooO00o().OooOO0o() ? !o0ooooo.OooO0o() : o0ooooo.m19037OooO0O0() == null || o0ooooo.m19037OooO0O0().length() == 0);
        if (!z2 || !z3) {
            if (OooO00o != null) {
                if (z) {
                    o0oooooo.OooO00o(OooO00o, (Object) o0ooooo.m19037OooO0O0(), o0ooooo.m19030OooO00o(), true);
                    o0ooooo2.OooO0Oo(OooO00o);
                } else {
                    C7710o0ooO0O0 OooO00o2 = o0ooooo.m19030OooO00o();
                    if (OooO00o2 == OooO00o.m19030OooO00o()) {
                        if (OooO00o2.OooOOO0()) {
                            Iterator OooO00o3 = o0ooooo.m19032OooO00o();
                            while (OooO00o3.hasNext()) {
                                OooO00o(o0oooooo, (C7434o0OOoOo) OooO00o3.next(), OooO00o, z, z2);
                                if (z2 && !OooO00o.OooO0o()) {
                                    o0ooooo2.OooO0Oo(OooO00o);
                                }
                            }
                            return;
                        } else if (OooO00o2.OooO0o0()) {
                            Iterator OooO00o4 = o0ooooo.m19032OooO00o();
                            while (OooO00o4.hasNext()) {
                                C7434o0OOoOo o0ooooo3 = (C7434o0OOoOo) OooO00o4.next();
                                if (o0ooooo3.OooO0oO() && AbstractC7410o0OOOoOo.Ooooooo.equals(o0ooooo3.OooO0O0(1).m19031OooO00o())) {
                                    int OooO00o5 = C7437o0OOoo0.OooO00o(OooO00o, o0ooooo3.OooO0O0(1).m19037OooO0O0());
                                    if (!z2 || !(o0ooooo3.m19037OooO0O0() == null || o0ooooo3.m19037OooO0O0().length() == 0)) {
                                        if (OooO00o5 == -1) {
                                            if (!AbstractC7410o0OOOoOo.OoooooO.equals(o0ooooo3.OooO0O0(1).m19037OooO0O0()) || !OooO00o.OooO0o()) {
                                                o0ooooo3.OooO0OO(OooO00o);
                                            } else {
                                                C7434o0OOoOo o0ooooo4 = new C7434o0OOoOo(o0ooooo3.m19031OooO00o(), o0ooooo3.m19037OooO0O0(), o0ooooo3.m19030OooO00o());
                                                o0ooooo3.OooO0OO(o0ooooo4);
                                                OooO00o.OooO00o(1, o0ooooo4);
                                            }
                                        }
                                    } else if (OooO00o5 != -1) {
                                        OooO00o.OooO0o(OooO00o5);
                                        if (!OooO00o.OooO0o()) {
                                            o0ooooo2.OooO0Oo(OooO00o);
                                        }
                                    }
                                }
                            }
                            return;
                        } else if (OooO00o2.OooO0Oo()) {
                            Iterator OooO00o6 = o0ooooo.m19032OooO00o();
                            while (OooO00o6.hasNext()) {
                                C7434o0OOoOo o0ooooo5 = (C7434o0OOoOo) OooO00o6.next();
                                Iterator OooO00o7 = OooO00o.m19032OooO00o();
                                boolean z4 = false;
                                while (OooO00o7.hasNext()) {
                                    if (OooO00o(o0ooooo5, (C7434o0OOoOo) OooO00o7.next())) {
                                        z4 = true;
                                    }
                                }
                                if (!z4) {
                                    C7434o0OOoOo o0ooooo6 = (C7434o0OOoOo) o0ooooo5.clone();
                                    o0ooooo2.OooO00o(o0ooooo6);
                                    OooO00o = o0ooooo6;
                                }
                            }
                            return;
                        } else {
                            return;
                        }
                    } else {
                        return;
                    }
                }
            }
            o0ooooo2.OooO00o((C7434o0OOoOo) o0ooooo.clone());
        } else if (OooO00o != null) {
            o0ooooo2.OooO0Oo(OooO00o);
        }
    }

    public static void OooO00o(String str) throws XMPException {
        boolean z = false;
        for (int i = 0; i < str.length(); i++) {
            int OooO00o = m19063OooO00o(str.charAt(i));
            if (OooO00o == 3) {
                if (!z) {
                    z = true;
                } else {
                    throw new XMPException("Separator can have only one semicolon", 4);
                }
            } else if (OooO00o != 1) {
                throw new XMPException("Separator can have only spaces and one semicolon", 4);
            }
        }
        if (!z) {
            throw new XMPException("Separator must have one semicolon", 4);
        }
    }

    public static boolean OooO00o(char c, char c2, char c3) {
        return c == c3 || (c2 == 12317 && c == 12318) || c == 12319;
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0075  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean OooO00o(com.p118pd.sdk.C7434o0OOoOo r5, com.p118pd.sdk.C7434o0OOoOo r6) throws com.adobe.xmp.XMPException {
        /*
        // Method dump skipped, instructions count: 185
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p118pd.sdk.C7442o0OOooOO.OooO00o(com.pd.sdk.o0OOoOo, com.pd.sdk.o0OOoOo):boolean");
    }

    public static boolean OooO00o(C7434o0OOoOo o0ooooo, boolean z) {
        Iterator OooO00o = o0ooooo.m19032OooO00o();
        while (OooO00o.hasNext()) {
            C7434o0OOoOo o0ooooo2 = (C7434o0OOoOo) OooO00o.next();
            if (z || !C7431o0OOoO0o.OooO00o(o0ooooo.m19031OooO00o(), o0ooooo2.m19031OooO00o())) {
                OooO00o.remove();
            }
        }
        return !o0ooooo.OooO0o();
    }

    public static boolean OooO0O0(char c, char c2, char c3) {
        return c == c2 || OooO00o(c, c2, c3);
    }
}

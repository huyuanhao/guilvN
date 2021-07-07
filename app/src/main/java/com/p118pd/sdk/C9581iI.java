package com.p118pd.sdk;

import java.io.IOException;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;
import org.bouncycastle.util.Strings;

/* renamed from: com.pd.sdk.丨iI  reason: invalid class name and case insensitive filesystem */
public class C9581iI {
    public static int OooO00o(char c) {
        if ('0' <= c && c <= '9') {
            return c - '0';
        }
        return (('a' > c || c > 'f') ? c - 'A' : c - 'a') + 10;
    }

    public static LlLI1 OooO00o(String str, Hashtable hashtable) {
        if (Strings.OooO0O0(str).startsWith("OID.")) {
            return new LlLI1(str.substring(4));
        }
        if (str.charAt(0) >= '0' && str.charAt(0) <= '9') {
            return new LlLI1(str);
        }
        LlLI1 llLI1 = (LlLI1) hashtable.get(Strings.OooO00o(str));
        if (llLI1 != null) {
            return llLI1;
        }
        throw new IllegalArgumentException("Unknown object id - " + str + " - passed to distinguished name");
    }

    public static AbstractC6122iIlLiL OooO00o(String str) {
        try {
            return AbstractC6122iIlLiL.OooO00o(C6472l1l1l.OooO00o(str.substring(1)));
        } catch (IOException e) {
            throw new IllegalStateException("unknown encoding in name: " + e);
        }
    }

    public static AbstractC6854lLi1LL OooO00o(String str, int i) throws IOException {
        int length = (str.length() - i) / 2;
        byte[] bArr = new byte[length];
        for (int i2 = 0; i2 != length; i2++) {
            int i3 = (i2 * 2) + i;
            char charAt = str.charAt(i3);
            bArr[i2] = (byte) (OooO00o(str.charAt(i3 + 1)) | (OooO00o(charAt) << 4));
        }
        return AbstractC6122iIlLiL.OooO00o(bArr);
    }

    public static String OooO00o(AbstractC6854lLi1LL r8) {
        StringBuffer stringBuffer = new StringBuffer();
        int i = 0;
        if (!(r8 instanceof AbstractC98681) || (r8 instanceof LIlLi)) {
            try {
                stringBuffer.append("#" + OooO00o(C6472l1l1l.OooO0O0(r8.OooO0O0().OooO00o(AbstractC5533IiL.OooO00o))));
            } catch (IOException unused) {
                throw new IllegalArgumentException("Other value has no encoded form");
            }
        } else {
            String OooO00o = ((AbstractC98681) r8).OooO00o();
            if (OooO00o.length() > 0 && OooO00o.charAt(0) == '#') {
                OooO00o = "\\" + OooO00o;
            }
            stringBuffer.append(OooO00o);
        }
        int length = stringBuffer.length();
        int i2 = 2;
        if (!(stringBuffer.length() >= 2 && stringBuffer.charAt(0) == '\\' && stringBuffer.charAt(1) == '#')) {
            i2 = 0;
        }
        while (i2 != length) {
            if (stringBuffer.charAt(i2) == ',' || stringBuffer.charAt(i2) == '\"' || stringBuffer.charAt(i2) == '\\' || stringBuffer.charAt(i2) == '+' || stringBuffer.charAt(i2) == '=' || stringBuffer.charAt(i2) == '<' || stringBuffer.charAt(i2) == '>' || stringBuffer.charAt(i2) == ';') {
                stringBuffer.insert(i2, "\\");
                i2++;
                length++;
            }
            i2++;
        }
        if (stringBuffer.length() > 0) {
            while (stringBuffer.length() > i && stringBuffer.charAt(i) == ' ') {
                stringBuffer.insert(i, "\\");
                i += 2;
            }
        }
        int length2 = stringBuffer.length() - 1;
        while (length2 >= 0 && stringBuffer.charAt(length2) == ' ') {
            stringBuffer.insert(length2, '\\');
            length2--;
        }
        return stringBuffer.toString();
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static String m21622OooO00o(String str) {
        String OooO00o = Strings.OooO00o(str);
        int i = 0;
        if (OooO00o.length() > 0 && OooO00o.charAt(0) == '#') {
            AbstractC6122iIlLiL OooO00o2 = OooO00o(OooO00o);
            if (OooO00o2 instanceof AbstractC98681) {
                OooO00o = Strings.OooO00o(((AbstractC98681) OooO00o2).OooO00o());
            }
        }
        if (OooO00o.length() > 1) {
            while (true) {
                int i2 = i + 1;
                if (i2 < OooO00o.length() && OooO00o.charAt(i) == '\\' && OooO00o.charAt(i2) == ' ') {
                    i += 2;
                } else {
                    int length = OooO00o.length() - 1;
                }
            }
            int length2 = OooO00o.length() - 1;
            while (true) {
                int i3 = length2 - 1;
                if (i3 > 0 && OooO00o.charAt(i3) == '\\' && OooO00o.charAt(length2) == ' ') {
                    length2 -= 2;
                } else if (i > 0 || length2 < OooO00o.length() - 1) {
                    OooO00o = OooO00o.substring(i, length2 + 1);
                }
            }
            OooO00o = OooO00o.substring(i, length2 + 1);
        }
        return OooO0O0(OooO00o);
    }

    public static String OooO00o(byte[] bArr) {
        int length = bArr.length;
        char[] cArr = new char[length];
        for (int i = 0; i != length; i++) {
            cArr[i] = (char) (bArr[i] & 255);
        }
        return new String(cArr);
    }

    public static void OooO00o(StringBuffer stringBuffer, C5605L1ll r2, Hashtable hashtable) {
        String str = (String) hashtable.get(r2.OooO00o());
        if (str == null) {
            str = r2.OooO00o().m16387OooO0O0();
        }
        stringBuffer.append(str);
        stringBuffer.append(C7490o0OoOO0o.OooO00o);
        stringBuffer.append(OooO00o(r2.m16007OooO0O0()));
    }

    public static void OooO00o(StringBuffer stringBuffer, LILlIL lILlIL, Hashtable hashtable) {
        if (lILlIL.m16060OooO00o()) {
            C5605L1ll[] OooO00o = lILlIL.m16061OooO00o();
            boolean z = true;
            for (int i = 0; i != OooO00o.length; i++) {
                if (z) {
                    z = false;
                } else {
                    stringBuffer.append('+');
                }
                OooO00o(stringBuffer, OooO00o[i], hashtable);
            }
        } else if (lILlIL.OooO00o() != null) {
            OooO00o(stringBuffer, lILlIL.OooO00o(), hashtable);
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static boolean m21623OooO00o(char c) {
        return ('0' <= c && c <= '9') || ('a' <= c && c <= 'f') || ('A' <= c && c <= 'F');
    }

    public static boolean OooO00o(C5605L1ll r4, C5605L1ll r5) {
        if (r4 == r5) {
            return true;
        }
        return r4 != null && r5 != null && r4.OooO00o().equals(r5.OooO00o()) && m21622OooO00o(OooO00o(r4.m16007OooO0O0())).equals(m21622OooO00o(OooO00o(r5.m16007OooO0O0())));
    }

    public static boolean OooO00o(LILlIL lILlIL, LILlIL lILlIL2) {
        if (lILlIL.m16060OooO00o()) {
            if (!lILlIL2.m16060OooO00o()) {
                return false;
            }
            C5605L1ll[] OooO00o = lILlIL.m16061OooO00o();
            C5605L1ll[] OooO00o2 = lILlIL2.m16061OooO00o();
            if (OooO00o.length != OooO00o2.length) {
                return false;
            }
            for (int i = 0; i != OooO00o.length; i++) {
                if (!OooO00o(OooO00o[i], OooO00o2[i])) {
                    return false;
                }
            }
            return true;
        } else if (!lILlIL2.m16060OooO00o()) {
            return OooO00o(lILlIL.OooO00o(), lILlIL2.OooO00o());
        } else {
            return false;
        }
    }

    public static LILlIL[] OooO00o(String str, AbstractC5662LLi lLi) {
        C6585lLLL1 llll1 = new C6585lLLL1(str);
        C5426IlI ilI = new C5426IlI(lLi);
        while (llll1.m17685OooO00o()) {
            String OooO00o = llll1.OooO00o();
            if (OooO00o.indexOf(43) > 0) {
                C6585lLLL1 llll12 = new C6585lLLL1(OooO00o, '+');
                C6585lLLL1 llll13 = new C6585lLLL1(llll12.OooO00o(), C7490o0OoOO0o.OooO00o);
                String OooO00o2 = llll13.OooO00o();
                if (llll13.m17685OooO00o()) {
                    String OooO00o3 = llll13.OooO00o();
                    LlLI1 OooO00o4 = lLi.OooO00o(OooO00o2.trim());
                    if (llll12.m17685OooO00o()) {
                        Vector vector = new Vector();
                        Vector vector2 = new Vector();
                        while (true) {
                            vector.addElement(OooO00o4);
                            vector2.addElement(OooO0OO(OooO00o3));
                            if (!llll12.m17685OooO00o()) {
                                ilI.OooO00o(OooO00o(vector), m21624OooO00o(vector2));
                                break;
                            }
                            C6585lLLL1 llll14 = new C6585lLLL1(llll12.OooO00o(), C7490o0OoOO0o.OooO00o);
                            String OooO00o5 = llll14.OooO00o();
                            if (llll14.m17685OooO00o()) {
                                OooO00o3 = llll14.OooO00o();
                                OooO00o4 = lLi.OooO00o(OooO00o5.trim());
                            } else {
                                throw new IllegalArgumentException("badly formatted directory string");
                            }
                        }
                    } else {
                        ilI.OooO00o(OooO00o4, OooO0OO(OooO00o3));
                    }
                } else {
                    throw new IllegalArgumentException("badly formatted directory string");
                }
            } else {
                C6585lLLL1 llll15 = new C6585lLLL1(OooO00o, C7490o0OoOO0o.OooO00o);
                String OooO00o6 = llll15.OooO00o();
                if (llll15.m17685OooO00o()) {
                    ilI.OooO00o(lLi.OooO00o(OooO00o6.trim()), OooO0OO(llll15.OooO00o()));
                } else {
                    throw new IllegalArgumentException("badly formatted directory string");
                }
            }
        }
        return ilI.OooO00o().m17571OooO00o();
    }

    public static LlLI1[] OooO00o(Vector vector) {
        int size = vector.size();
        LlLI1[] llLI1Arr = new LlLI1[size];
        for (int i = 0; i != size; i++) {
            llLI1Arr[i] = (LlLI1) vector.elementAt(i);
        }
        return llLI1Arr;
    }

    public static String[] OooO00o(LlLI1 llLI1, Hashtable hashtable) {
        Enumeration elements = hashtable.elements();
        int i = 0;
        int i2 = 0;
        while (elements.hasMoreElements()) {
            if (llLI1.equals(elements.nextElement())) {
                i2++;
            }
        }
        String[] strArr = new String[i2];
        Enumeration keys = hashtable.keys();
        while (keys.hasMoreElements()) {
            String str = (String) keys.nextElement();
            if (llLI1.equals(hashtable.get(str))) {
                strArr[i] = str;
                i++;
            }
        }
        return strArr;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static String[] m21624OooO00o(Vector vector) {
        int size = vector.size();
        String[] strArr = new String[size];
        for (int i = 0; i != size; i++) {
            strArr[i] = (String) vector.elementAt(i);
        }
        return strArr;
    }

    public static String OooO0O0(String str) {
        StringBuffer stringBuffer = new StringBuffer();
        if (str.length() != 0) {
            char charAt = str.charAt(0);
            stringBuffer.append(charAt);
            int i = 1;
            while (i < str.length()) {
                char charAt2 = str.charAt(i);
                if (charAt != ' ' || charAt2 != ' ') {
                    stringBuffer.append(charAt2);
                }
                i++;
                charAt = charAt2;
            }
        }
        return stringBuffer.toString();
    }

    public static String OooO0OO(String str) {
        int i;
        if (str.length() == 0 || (str.indexOf(92) < 0 && str.indexOf(34) < 0)) {
            return str.trim();
        }
        char[] charArray = str.toCharArray();
        StringBuffer stringBuffer = new StringBuffer(str.length());
        if (charArray[0] == '\\' && charArray[1] == '#') {
            i = 2;
            stringBuffer.append("\\#");
        } else {
            i = 0;
        }
        boolean z = false;
        int i2 = 0;
        boolean z2 = false;
        boolean z3 = false;
        char c = 0;
        while (i != charArray.length) {
            char c2 = charArray[i];
            if (c2 != ' ') {
                z3 = true;
            }
            if (c2 == '\"') {
                if (!z) {
                    z2 = !z2;
                }
                stringBuffer.append(c2);
            } else if (c2 == '\\' && !z && !z2) {
                i2 = stringBuffer.length();
                z = true;
                i++;
            } else if (c2 != ' ' || z || z3) {
                if (z && m21623OooO00o(c2)) {
                    if (c != 0) {
                        stringBuffer.append((char) ((OooO00o(c) * 16) + OooO00o(c2)));
                        z = false;
                        c = 0;
                    } else {
                        c = c2;
                    }
                    i++;
                }
                stringBuffer.append(c2);
            } else {
                i++;
            }
            z = false;
            i++;
        }
        if (stringBuffer.length() > 0) {
            while (stringBuffer.charAt(stringBuffer.length() - 1) == ' ' && i2 != stringBuffer.length() - 1) {
                stringBuffer.setLength(stringBuffer.length() - 1);
            }
        }
        return stringBuffer.toString();
    }
}

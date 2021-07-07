package com.p118pd.sdk;

/* renamed from: com.pd.sdk.o0OOoO0o  reason: case insensitive filesystem */
public class C7431o0OOoO0o implements AbstractC7410o0OOOoOo {
    public static boolean[] OooO00o = null;
    public static boolean[] OooO0O0 = null;
    public static final int o00oO0O = 4;
    public static final int o0ooOO0 = 36;

    static {
        OooO00o();
    }

    public static String OooO00o(String str) {
        if (AbstractC7410o0OOOoOo.OoooooO.equals(str)) {
            return str;
        }
        StringBuffer stringBuffer = new StringBuffer();
        int i = 1;
        for (int i2 = 0; i2 < str.length(); i2++) {
            char charAt = str.charAt(i2);
            if (charAt != ' ') {
                if (charAt == '-' || charAt == '_') {
                    stringBuffer.append('-');
                    i++;
                } else {
                    stringBuffer.append(i != 2 ? Character.toLowerCase(str.charAt(i2)) : Character.toUpperCase(str.charAt(i2)));
                }
            }
        }
        return stringBuffer.toString();
    }

    public static String OooO00o(String str, boolean z, boolean z2) {
        boolean z3;
        String str2;
        int i = 0;
        while (true) {
            if (i >= str.length()) {
                z3 = false;
                break;
            }
            char charAt = str.charAt(i);
            if (charAt == '<' || charAt == '>' || charAt == '&' || ((z2 && (charAt == '\t' || charAt == '\n' || charAt == '\r')) || (z && charAt == '\"'))) {
                z3 = true;
            } else {
                i++;
            }
        }
        z3 = true;
        if (!z3) {
            return str;
        }
        StringBuffer stringBuffer = new StringBuffer((str.length() * 4) / 3);
        for (int i2 = 0; i2 < str.length(); i2++) {
            char charAt2 = str.charAt(i2);
            if (!z2 || !(charAt2 == '\t' || charAt2 == '\n' || charAt2 == '\r')) {
                if (charAt2 == '\"') {
                    str2 = z ? "&quot;" : "\"";
                } else if (charAt2 == '&') {
                    str2 = "&amp;";
                } else if (charAt2 == '<') {
                    str2 = "&lt;";
                } else if (charAt2 == '>') {
                    str2 = "&gt;";
                }
                stringBuffer.append(str2);
            } else {
                stringBuffer.append("&#x");
                stringBuffer.append(Integer.toHexString(charAt2).toUpperCase());
                charAt2 = ';';
            }
            stringBuffer.append(charAt2);
        }
        return stringBuffer.toString();
    }

    public static void OooO00o() {
        OooO0O0 = new boolean[256];
        OooO00o = new boolean[256];
        char c = 0;
        while (c < OooO0O0.length) {
            boolean z = true;
            OooO00o[c] = c == ':' || ('A' <= c && c <= 'Z') || c == '_' || (('a' <= c && c <= 'z') || ((192 <= c && c <= 214) || ((216 <= c && c <= 246) || (248 <= c && c <= 255))));
            boolean[] zArr = OooO0O0;
            if (!OooO00o[c] && c != '-' && c != '.' && (('0' > c || c > '9') && c != 183)) {
                z = false;
            }
            zArr[c] = z;
            c = (char) (c + 1);
        }
    }

    public static boolean OooO00o(char c) {
        return ((c > 31 && c != 127) || c == '\t' || c == '\n' || c == '\r') ? false : true;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static boolean m18998OooO00o(String str) {
        if (str == null) {
            return false;
        }
        int i = 0;
        boolean z = true;
        int i2 = 0;
        while (i < str.length()) {
            if (str.charAt(i) == '-') {
                i2++;
                z = z && (i == 8 || i == 13 || i == 18 || i == 23);
            }
            i++;
        }
        return z && 4 == i2 && 36 == i;
    }

    /* JADX WARNING: Removed duplicated region for block: B:6:0x001a A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean OooO00o(java.lang.String r3, java.lang.String r4) {
        /*
        // Method dump skipped, instructions count: 320
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p118pd.sdk.C7431o0OOoO0o.OooO00o(java.lang.String, java.lang.String):boolean");
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static String[] m18999OooO00o(String str) {
        int indexOf = str.indexOf(61);
        String substring = str.substring(str.charAt(1) == '?' ? 2 : 1, indexOf);
        int i = indexOf + 1;
        char charAt = str.charAt(i);
        int i2 = i + 1;
        int length = str.length() - 2;
        StringBuffer stringBuffer = new StringBuffer(length - indexOf);
        while (i2 < length) {
            stringBuffer.append(str.charAt(i2));
            i2++;
            if (str.charAt(i2) == charAt) {
                i2++;
            }
        }
        return new String[]{substring, stringBuffer.toString()};
    }

    public static String OooO0O0(String str) {
        StringBuffer stringBuffer = new StringBuffer(str);
        for (int i = 0; i < stringBuffer.length(); i++) {
            if (OooO00o(stringBuffer.charAt(i))) {
                stringBuffer.setCharAt(i, ' ');
            }
        }
        return stringBuffer.toString();
    }

    public static boolean OooO0O0(char c) {
        return (c <= 255 && OooO0O0[c]) || OooO0OO(c) || (c >= 768 && c <= 879) || (c >= 8255 && c <= 8256);
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public static boolean m19000OooO0O0(String str) {
        if (str.length() > 0 && !OooO0OO(str.charAt(0))) {
            return false;
        }
        for (int i = 1; i < str.length(); i++) {
            if (!OooO0O0(str.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static boolean OooO0OO(char c) {
        return (c <= 255 && OooO00o[c]) || (c >= 256 && c <= 767) || ((c >= 880 && c <= 893) || ((c >= 895 && c <= 8191) || ((c >= 8204 && c <= 8205) || ((c >= 8304 && c <= 8591) || ((c >= 11264 && c <= 12271) || ((c >= 12289 && c <= 55295) || ((c >= 63744 && c <= 64975) || ((c >= 65008 && c <= 65533) || (c >= 0 && c <= 65535)))))))));
    }

    public static boolean OooO0OO(String str) {
        if (str.length() > 0 && (!OooO0OO(str.charAt(0)) || str.charAt(0) == ':')) {
            return false;
        }
        for (int i = 1; i < str.length(); i++) {
            if (!OooO0O0(str.charAt(i)) || str.charAt(i) == ':') {
                return false;
            }
        }
        return true;
    }
}

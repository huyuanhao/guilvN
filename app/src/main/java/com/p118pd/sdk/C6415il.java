package com.p118pd.sdk;

import com.xiaomi.mipush.sdk.Constants;

/* renamed from: com.pd.sdk.i丨l丨  reason: invalid class name and case insensitive filesystem */
public class C6415il {
    public static boolean OooO00o(String str) {
        return OooO0O0(str) || OooO0Oo(str);
    }

    public static boolean OooO00o(String str, int i) {
        try {
            int parseInt = Integer.parseInt(str);
            return parseInt >= 0 && parseInt <= i;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    public static boolean OooO0O0(String str) {
        int indexOf;
        if (str.length() == 0) {
            return false;
        }
        String str2 = str + C9058ooOoOoOO.OooOO0;
        int i = 0;
        int i2 = 0;
        while (i < str2.length() && (indexOf = str2.indexOf(46, i)) > i) {
            if (i2 == 4) {
                return false;
            }
            try {
                int parseInt = Integer.parseInt(str2.substring(i, indexOf));
                if (parseInt >= 0 && parseInt <= 255) {
                    i = indexOf + 1;
                    i2++;
                }
            } catch (NumberFormatException unused) {
            }
            return false;
        }
        return i2 == 4;
    }

    public static boolean OooO0OO(String str) {
        int indexOf = str.indexOf(C8932ooOOO0o.OooO0OO);
        String substring = str.substring(indexOf + 1);
        if (indexOf <= 0 || !OooO0O0(str.substring(0, indexOf))) {
            return false;
        }
        return OooO0O0(substring) || OooO00o(substring, 32);
    }

    public static boolean OooO0Oo(String str) {
        int indexOf;
        if (str.length() == 0) {
            return false;
        }
        String str2 = str + Constants.COLON_SEPARATOR;
        int i = 0;
        int i2 = 0;
        boolean z = false;
        while (i < str2.length() && (indexOf = str2.indexOf(58, i)) >= i) {
            if (i2 == 8) {
                return false;
            }
            if (i != indexOf) {
                String substring = str2.substring(i, indexOf);
                if (indexOf != str2.length() - 1 || substring.indexOf(46) <= 0) {
                    try {
                        int parseInt = Integer.parseInt(str2.substring(i, indexOf), 16);
                        if (parseInt >= 0 && parseInt <= 65535) {
                        }
                    } catch (NumberFormatException unused) {
                    }
                    return false;
                } else if (!OooO0O0(substring)) {
                    return false;
                } else {
                    i2++;
                }
            } else if (indexOf != 1 && indexOf != str2.length() - 1 && z) {
                return false;
            } else {
                z = true;
            }
            i = indexOf + 1;
            i2++;
        }
        return i2 == 8 || z;
    }

    public static boolean OooO0o(String str) {
        return OooO0OO(str) || OooO0o0(str);
    }

    public static boolean OooO0o0(String str) {
        int indexOf = str.indexOf(C8932ooOOO0o.OooO0OO);
        String substring = str.substring(indexOf + 1);
        if (indexOf <= 0 || !OooO0Oo(str.substring(0, indexOf))) {
            return false;
        }
        return OooO0Oo(substring) || OooO00o(substring, 128);
    }
}

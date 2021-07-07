package com.p118pd.sdk;

/* renamed from: com.pd.sdk.ooOoOOO0  reason: case insensitive filesystem */
public class C9047ooOoOOO0 {
    public static final String[] OooO00o = {"零", "一", "二", "三", "四", "五", "六", "七", "八", "九"};
    public static final String[] OooO0O0 = {"", "十", "百", "千", "万", "十", "百", "千", "亿", "十", "百", "千", "万", "十", "百", "千"};

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0062, code lost:
        if (r0.equals("0") != false) goto L_0x0066;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String OooO00o(java.lang.String r7) {
        /*
        // Method dump skipped, instructions count: 178
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p118pd.sdk.C9047ooOoOOO0.OooO00o(java.lang.String):java.lang.String");
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static int[] m20703OooO00o(String str) {
        int[] iArr = new int[str.length()];
        int i = 0;
        while (i < str.length()) {
            int i2 = i + 1;
            iArr[i] = Integer.parseInt(str.substring(i, i2));
            i = i2;
        }
        return iArr;
    }

    public static String OooO00o(int[] iArr, boolean z) {
        String str;
        StringBuffer stringBuffer = new StringBuffer("");
        int length = iArr.length;
        for (int i = 0; i < length; i++) {
            if (iArr[i] == 0) {
                int i2 = length - i;
                if (i2 == 13) {
                    str = OooO0O0[4];
                } else if (i2 == 9) {
                    str = OooO0O0[8];
                } else if (i2 == 5 && z) {
                    str = OooO0O0[4];
                } else if (i2 == 1) {
                    str = OooO0O0[0];
                } else {
                    str = "";
                }
                if (i2 > 1 && iArr[i + 1] != 0) {
                    str = str + OooO00o[0];
                }
            } else {
                str = "";
            }
            if (iArr[i] != 0) {
                str = OooO00o[iArr[i]] + OooO0O0[(length - i) - 1];
            }
            stringBuffer.append(str);
        }
        return stringBuffer.toString();
    }

    public static String OooO00o(int[] iArr) {
        StringBuffer stringBuffer = new StringBuffer("");
        int i = 0;
        while (i < iArr.length && i != 3) {
            stringBuffer.append(OooO00o[iArr[i]]);
            i++;
        }
        return stringBuffer.toString();
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static boolean m20702OooO00o(String str) {
        String str2;
        int length = str.length();
        if (length <= 4) {
            return false;
        }
        if (length > 8) {
            str2 = str.substring(length - 8, length - 4);
        } else {
            str2 = str.substring(0, length - 4);
        }
        if (Integer.parseInt(str2) > 0) {
            return true;
        }
        return false;
    }
}

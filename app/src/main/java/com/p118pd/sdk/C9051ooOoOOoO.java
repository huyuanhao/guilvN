package com.p118pd.sdk;

import java.util.Random;

/* renamed from: com.pd.sdk.ooOoOOoO  reason: case insensitive filesystem */
public class C9051ooOoOOoO {
    public final String OooO00o = " ";

    private String OooO00o() {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < 26; i++) {
            stringBuffer.append(String.valueOf((char) (i + 97)));
            stringBuffer.append(" ");
        }
        return stringBuffer.toString();
    }

    private String OooO0O0() {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < 10; i++) {
            stringBuffer.append(String.valueOf(i));
            stringBuffer.append(" ");
        }
        return stringBuffer.toString();
    }

    private String OooO0OO() {
        StringBuffer stringBuffer = new StringBuffer();
        int i = 0;
        while (i < 17) {
            int i2 = i + 1;
            stringBuffer.append("~@#$%^&*()_+|\\=-`".substring(i, i2));
            stringBuffer.append(" ");
            i = i2;
        }
        return stringBuffer.toString();
    }

    private String OooO0Oo() {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < 26; i++) {
            stringBuffer.append(String.valueOf((char) (i + 65)));
            stringBuffer.append(" ");
        }
        return stringBuffer.toString();
    }

    private String OooO00o(String str) {
        StringBuffer stringBuffer = new StringBuffer();
        if (str.length() > 0) {
            if (str.indexOf(105) != -1) {
                stringBuffer.append(OooO0O0());
            }
            if (str.indexOf(108) != -1) {
                stringBuffer.append(OooO00o());
            }
            if (str.indexOf(117) != -1) {
                stringBuffer.append(OooO0Oo());
            }
            if (str.indexOf(115) != -1) {
                stringBuffer.append(OooO0OO());
            }
        }
        return stringBuffer.toString();
    }

    public String OooO00o(int i, String str) {
        String[] split = OooO00o(str).split(" ");
        StringBuffer stringBuffer = new StringBuffer();
        if (i > 0) {
            for (int i2 = 0; i2 < i; i2++) {
                stringBuffer.append(split[new Random().nextInt(split.length)]);
            }
        }
        return stringBuffer.toString();
    }
}

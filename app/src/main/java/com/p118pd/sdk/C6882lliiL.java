package com.p118pd.sdk;

/* renamed from: com.pd.sdk.l丨liiL丨  reason: invalid class name and case insensitive filesystem */
public class C6882lliiL implements AbstractC6704lill1 {
    @Override // com.p118pd.sdk.AbstractC6704lill1
    public String OooO00o(String str) {
        String str2;
        int i;
        StringBuffer stringBuffer = new StringBuffer(str);
        int i2 = 0;
        while (i2 < stringBuffer.length()) {
            char charAt = stringBuffer.charAt(i2);
            if (charAt == '\n') {
                i = i2 + 1;
                str2 = "\\n";
            } else if (charAt == '\r') {
                i = i2 + 1;
                str2 = "\\r";
            } else if (charAt == '\"') {
                i = i2 + 1;
                str2 = "\\\"";
            } else if (charAt == '\'') {
                i = i2 + 1;
                str2 = "\\'";
            } else if (charAt == '-') {
                i = i2 + 1;
                str2 = "\\-";
            } else if (charAt == '/') {
                i = i2 + 1;
                str2 = "\\/";
            } else if (charAt == ';') {
                i = i2 + 1;
                str2 = "\\;";
            } else if (charAt == '=') {
                i = i2 + 1;
                str2 = "\\=";
            } else if (charAt != '\\') {
                i2++;
            } else {
                i = i2 + 1;
                str2 = "\\\\";
            }
            stringBuffer.replace(i2, i, str2);
            i2 = i;
            i2++;
        }
        return stringBuffer.toString();
    }

    @Override // com.p118pd.sdk.AbstractC6704lill1
    public String OooO0O0(String str) {
        return OooO00o(str);
    }
}

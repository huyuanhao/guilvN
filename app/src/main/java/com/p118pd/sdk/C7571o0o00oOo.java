package com.p118pd.sdk;

import com.xiaomi.mipush.sdk.Constants;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/* renamed from: com.pd.sdk.o0o00oOo  reason: case insensitive filesystem */
public final class C7571o0o00oOo {
    public String OooO00o;
    public String OooO0O0;
    public String OooO0OO;
    public String OooO0Oo;
    public String OooO0o;
    public String OooO0o0;
    public String OooO0oO;

    public C7571o0o00oOo(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.OooO00o = str;
        this.OooO0O0 = str2;
        this.OooO0OO = str3;
        this.OooO0Oo = str4;
        this.OooO0o0 = str5;
        this.OooO0o = str6;
        this.OooO0oO = str7;
    }

    public final String toString() {
        String str;
        StringBuilder sb;
        String str2;
        StringBuilder sb2;
        String str3;
        StringBuilder sb3;
        StringBuffer stringBuffer = new StringBuffer(new SimpleDateFormat("yyyyMMddHHmmssSSS").format(Calendar.getInstance().getTime()));
        stringBuffer.append(Constants.ACCEPT_TIME_SEPARATOR_SP + this.OooO00o);
        stringBuffer.append(Constants.ACCEPT_TIME_SEPARATOR_SP + this.OooO0O0);
        stringBuffer.append(Constants.ACCEPT_TIME_SEPARATOR_SP + this.OooO0OO);
        stringBuffer.append(Constants.ACCEPT_TIME_SEPARATOR_SP + this.OooO0Oo);
        if (C7559o0o00OOo.m19210OooO00o(this.OooO0o0) || this.OooO0o0.length() < 20) {
            sb = new StringBuilder(Constants.ACCEPT_TIME_SEPARATOR_SP);
            str = this.OooO0o0;
        } else {
            sb = new StringBuilder(Constants.ACCEPT_TIME_SEPARATOR_SP);
            str = this.OooO0o0.substring(0, 20);
        }
        sb.append(str);
        stringBuffer.append(sb.toString());
        if (C7559o0o00OOo.m19210OooO00o(this.OooO0o) || this.OooO0o.length() < 20) {
            sb2 = new StringBuilder(Constants.ACCEPT_TIME_SEPARATOR_SP);
            str2 = this.OooO0o;
        } else {
            sb2 = new StringBuilder(Constants.ACCEPT_TIME_SEPARATOR_SP);
            str2 = this.OooO0o.substring(0, 20);
        }
        sb2.append(str2);
        stringBuffer.append(sb2.toString());
        if (C7559o0o00OOo.m19210OooO00o(this.OooO0oO) || this.OooO0oO.length() < 20) {
            sb3 = new StringBuilder(Constants.ACCEPT_TIME_SEPARATOR_SP);
            str3 = this.OooO0oO;
        } else {
            sb3 = new StringBuilder(Constants.ACCEPT_TIME_SEPARATOR_SP);
            str3 = this.OooO0oO.substring(0, 20);
        }
        sb3.append(str3);
        stringBuffer.append(sb3.toString());
        return stringBuffer.toString();
    }
}

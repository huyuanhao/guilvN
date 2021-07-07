package com.p118pd.sdk;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.SimpleTimeZone;

/* renamed from: com.pd.sdk.LL丨il1iI  reason: invalid class name */
public class LLil1iI {
    public byte[] OooO00o;

    public LLil1iI(String str) {
        this.OooO00o = OooO00o(str);
    }

    public LLil1iI(Date date) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyMMdd'Z'");
        simpleDateFormat.setTimeZone(new SimpleTimeZone(0, "Z"));
        this.OooO00o = OooO00o(simpleDateFormat.format(date));
    }

    public LLil1iI(Date date, Locale locale) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyMMdd'Z'", locale);
        simpleDateFormat.setTimeZone(new SimpleTimeZone(0, "Z"));
        this.OooO00o = OooO00o(simpleDateFormat.format(date));
    }

    public LLil1iI(byte[] bArr) {
        this.OooO00o = bArr;
    }

    private byte[] OooO00o(String str) {
        char[] charArray = str.toCharArray();
        byte[] bArr = new byte[6];
        for (int i = 0; i != 6; i++) {
            bArr[i] = (byte) (charArray[i] - '0');
        }
        return bArr;
    }

    public Date OooO00o() throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd");
        return simpleDateFormat.parse("20" + toString());
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public byte[] m16269OooO00o() {
        return C9586iIILl.m21630OooO00o(this.OooO00o);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof LLil1iI)) {
            return false;
        }
        return C9586iIILl.m21627OooO00o(this.OooO00o, ((LLil1iI) obj).OooO00o);
    }

    public int hashCode() {
        return C9586iIILl.OooO00o(this.OooO00o);
    }

    public String toString() {
        int length = this.OooO00o.length;
        char[] cArr = new char[length];
        for (int i = 0; i != length; i++) {
            cArr[i] = (char) ((this.OooO00o[i] & 255) + 48);
        }
        return new String(cArr);
    }
}

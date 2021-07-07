package com.p118pd.sdk;

import java.io.UnsupportedEncodingException;

/* renamed from: com.pd.sdk.丨丨ILI  reason: invalid class name and case insensitive filesystem */
public class C9758ILI {
    public static final String OooO0Oo = "ISO-8859-1";
    public String OooO00o;
    public String OooO0O0;
    public String OooO0OO;

    public C9758ILI(String str, String str2, String str3) {
        this.OooO00o = str;
        this.OooO0O0 = str2;
        this.OooO0OO = str3;
    }

    public C9758ILI(byte[] bArr) {
        try {
            String str = new String(bArr, "ISO-8859-1");
            this.OooO00o = str.substring(0, 2);
            this.OooO0O0 = str.substring(2, str.length() - 5);
            this.OooO0OO = str.substring(str.length() - 5);
        } catch (UnsupportedEncodingException e) {
            throw new IllegalStateException(e.toString());
        }
    }

    public String OooO00o() {
        return this.OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public byte[] m21888OooO00o() {
        try {
            return (this.OooO00o + this.OooO0O0 + this.OooO0OO).getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException e) {
            throw new IllegalStateException(e.toString());
        }
    }

    public String OooO0O0() {
        return this.OooO0O0;
    }

    public String OooO0OO() {
        return this.OooO0OO;
    }
}

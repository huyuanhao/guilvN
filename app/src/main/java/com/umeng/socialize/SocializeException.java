package com.umeng.socialize;

public class SocializeException extends RuntimeException {

    /* renamed from: b */
    public static final long f10633b = 1;

    /* renamed from: a */
    public int f10634a = 5000;

    /* renamed from: c */
    public String f10635c = "";

    public SocializeException(int i, String str) {
        super(str);
        this.f10634a = i;
        this.f10635c = str;
    }

    public int getErrorCode() {
        return this.f10634a;
    }

    public String getMessage() {
        return this.f10635c;
    }

    public SocializeException(String str, Throwable th) {
        super(str, th);
        this.f10635c = str;
    }

    public SocializeException(String str) {
        super(str);
        this.f10635c = str;
    }
}

package com.megvii.meglive_sdk.p095a;

/* renamed from: com.megvii.meglive_sdk.a.d */
public final class C1510d extends Exception {

    /* renamed from: a */
    public String f2082a;

    /* renamed from: b */
    public String f2083b;

    public C1510d(String str, String str2, String str3) {
        super(str2);
        this.f2082a = str;
        this.f2083b = str3;
    }

    public C1510d(String str, String str2, Throwable th, String str3) {
        super(str2, th);
        this.f2082a = str;
        this.f2083b = str3;
    }
}

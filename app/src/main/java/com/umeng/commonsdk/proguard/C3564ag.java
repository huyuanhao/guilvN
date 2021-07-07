package com.umeng.commonsdk.proguard;

import java.io.Serializable;

/* renamed from: com.umeng.commonsdk.proguard.ag */
public class C3564ag implements Serializable {

    /* renamed from: a */
    public final boolean f9172a;

    /* renamed from: b */
    public final byte f9173b;

    /* renamed from: c */
    public final String f9174c;

    /* renamed from: d */
    public final boolean f9175d;

    public C3564ag(byte b, boolean z) {
        this.f9173b = b;
        this.f9172a = false;
        this.f9174c = null;
        this.f9175d = z;
    }

    /* renamed from: a */
    public boolean mo38901a() {
        return this.f9172a;
    }

    /* renamed from: b */
    public String mo38902b() {
        return this.f9174c;
    }

    /* renamed from: c */
    public boolean mo38903c() {
        return this.f9173b == 12;
    }

    /* renamed from: d */
    public boolean mo38904d() {
        byte b = this.f9173b;
        return b == 15 || b == 13 || b == 14;
    }

    /* renamed from: e */
    public boolean mo38905e() {
        return this.f9175d;
    }

    public C3564ag(byte b) {
        this(b, false);
    }

    public C3564ag(byte b, String str) {
        this.f9173b = b;
        this.f9172a = true;
        this.f9174c = str;
        this.f9175d = false;
    }
}

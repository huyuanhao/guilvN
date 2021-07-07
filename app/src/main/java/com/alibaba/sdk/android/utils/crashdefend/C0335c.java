package com.alibaba.sdk.android.utils.crashdefend;

/* renamed from: com.alibaba.sdk.android.utils.crashdefend.c */
public class C0335c implements Cloneable {

    /* renamed from: a */
    public int f754a;

    /* renamed from: a */
    public long f755a;

    /* renamed from: a */
    public SDKMessageCallback f756a = null;

    /* renamed from: a */
    public String f757a;

    /* renamed from: b */
    public int f758b;

    /* renamed from: b */
    public long f759b;

    /* renamed from: b */
    public String f760b;

    /* renamed from: c */
    public int f761c = 0;
    public int crashCount;

    /* renamed from: d */
    public volatile boolean f762d = false;

    @Override // java.lang.Object
    public Object clone() {
        try {
            return (C0335c) super.clone();
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }
}

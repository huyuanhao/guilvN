package com.umeng.commonsdk.proguard;

/* renamed from: com.umeng.commonsdk.proguard.an */
public class C3574an {

    /* renamed from: a */
    public final String f9229a;

    /* renamed from: b */
    public final byte f9230b;

    /* renamed from: c */
    public final short f9231c;

    public C3574an() {
        this("", (byte) 0, 0);
    }

    /* renamed from: a */
    public boolean mo38953a(C3574an anVar) {
        return this.f9230b == anVar.f9230b && this.f9231c == anVar.f9231c;
    }

    public String toString() {
        return "<TField name:'" + this.f9229a + "' type:" + ((int) this.f9230b) + " field-id:" + ((int) this.f9231c) + ">";
    }

    public C3574an(String str, byte b, short s) {
        this.f9229a = str;
        this.f9230b = b;
        this.f9231c = s;
    }
}

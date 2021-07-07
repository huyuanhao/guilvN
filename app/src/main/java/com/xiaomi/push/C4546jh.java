package com.xiaomi.push;

/* renamed from: com.xiaomi.push.jh */
public class C4546jh {

    /* renamed from: a */
    public final byte f13019a;

    /* renamed from: a */
    public final String f13020a;

    /* renamed from: a */
    public final short f13021a;

    public C4546jh() {
        this("", (byte) 0, 0);
    }

    public C4546jh(String str, byte b, short s) {
        this.f13020a = str;
        this.f13019a = b;
        this.f13021a = s;
    }

    public String toString() {
        return "<TField name:'" + this.f13020a + "' type:" + ((int) this.f13019a) + " field-id:" + ((int) this.f13021a) + ">";
    }
}

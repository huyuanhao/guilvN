package com.umeng.commonsdk.proguard;

/* renamed from: com.umeng.commonsdk.proguard.aq */
public final class C3577aq {

    /* renamed from: a */
    public final String f9237a;

    /* renamed from: b */
    public final byte f9238b;

    /* renamed from: c */
    public final int f9239c;

    public C3577aq() {
        this("", (byte) 0, 0);
    }

    /* renamed from: a */
    public boolean mo38955a(C3577aq aqVar) {
        return this.f9237a.equals(aqVar.f9237a) && this.f9238b == aqVar.f9238b && this.f9239c == aqVar.f9239c;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C3577aq) {
            return mo38955a((C3577aq) obj);
        }
        return false;
    }

    public String toString() {
        return "<TMessage name:'" + this.f9237a + "' type: " + ((int) this.f9238b) + " seqid:" + this.f9239c + ">";
    }

    public C3577aq(String str, byte b, int i) {
        this.f9237a = str;
        this.f9238b = b;
        this.f9239c = i;
    }
}

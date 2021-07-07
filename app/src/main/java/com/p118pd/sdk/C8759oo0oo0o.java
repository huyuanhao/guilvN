package com.p118pd.sdk;

/* renamed from: com.pd.sdk.oo0oo0o  reason: case insensitive filesystem */
public final class C8759oo0oo0o<A, B> {
    public final A OooO00o;
    public final B OooO0O0;

    public C8759oo0oo0o(A a, B b) {
        this.OooO00o = a;
        this.OooO0O0 = b;
    }

    public static <A, B> C8759oo0oo0o<A, B> OooO00o(A a, B b) {
        return new C8759oo0oo0o<>(a, b);
    }

    public B OooO0O0() {
        return this.OooO0O0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C8759oo0oo0o.class != obj.getClass()) {
            return false;
        }
        C8759oo0oo0o oo0oo0o = (C8759oo0oo0o) obj;
        A a = this.OooO00o;
        if (a == null ? oo0oo0o.OooO00o != null : !a.equals(oo0oo0o.OooO00o)) {
            return false;
        }
        B b = this.OooO0O0;
        B b2 = oo0oo0o.OooO0O0;
        if (b != null) {
            return b.equals(b2);
        }
        if (b2 == null) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        A a = this.OooO00o;
        int i = 0;
        int hashCode = (a != null ? a.hashCode() : 0) * 31;
        B b = this.OooO0O0;
        if (b != null) {
            i = b.hashCode();
        }
        return hashCode + i;
    }

    public A OooO00o() {
        return this.OooO00o;
    }
}

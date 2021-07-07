package com.p118pd.sdk;

/* renamed from: com.pd.sdk.iII丨liL  reason: invalid class name and case insensitive filesystem */
public class C6090iIIliL<T> {
    public final long OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final T f17504OooO00o;

    public C6090iIIliL(long j, T t) {
        this.f17504OooO00o = t;
        this.OooO00o = j;
    }

    public long OooO00o() {
        return this.OooO00o;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C6090iIIliL.class != obj.getClass()) {
            return false;
        }
        C6090iIIliL r8 = (C6090iIIliL) obj;
        if (this.OooO00o != r8.OooO00o) {
            return false;
        }
        T t = this.f17504OooO00o;
        if (t == null) {
            if (r8.f17504OooO00o != null) {
                return false;
            }
        } else if (!t.equals(r8.f17504OooO00o)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        long j = this.OooO00o;
        int i = (((int) (j ^ (j >>> 32))) + 31) * 31;
        T t = this.f17504OooO00o;
        return i + (t == null ? 0 : t.hashCode());
    }

    public String toString() {
        return "TimeInterval [intervalInMilliseconds=" + this.OooO00o + ", value=" + ((Object) this.f17504OooO00o) + "]";
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public T m16952OooO00o() {
        return this.f17504OooO00o;
    }
}

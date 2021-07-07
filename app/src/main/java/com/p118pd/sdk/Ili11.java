package com.p118pd.sdk;

/* renamed from: com.pd.sdk.Ili11 */
public final class Ili11<T> {
    public final long OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final T f15865OooO00o;

    public Ili11(long j, T t) {
        this.f15865OooO00o = t;
        this.OooO00o = j;
    }

    public long OooO00o() {
        return this.OooO00o;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof Ili11)) {
            return false;
        }
        Ili11 ili11 = (Ili11) obj;
        if (this.OooO00o == ili11.OooO00o) {
            T t = this.f15865OooO00o;
            T t2 = ili11.f15865OooO00o;
            if (t == t2) {
                return true;
            }
            if (t == null || !t.equals(t2)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        long j = this.OooO00o;
        int i = (((int) (j ^ (j >>> 32))) + 31) * 31;
        T t = this.f15865OooO00o;
        return i + (t == null ? 0 : t.hashCode());
    }

    public String toString() {
        return String.format("Timestamped(timestampMillis = %d, value = %s)", Long.valueOf(this.OooO00o), this.f15865OooO00o.toString());
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public T m15687OooO00o() {
        return this.f15865OooO00o;
    }
}

package com.p118pd.sdk;

import com.drew.lang.annotations.NotNull;
import com.drew.lang.annotations.Nullable;

/* renamed from: com.pd.sdk.oO0o0O  reason: case insensitive filesystem */
public class C7919oO0o0O {
    public final int OooO00o;
    @Nullable

    /* renamed from: OooO00o  reason: collision with other field name */
    public final C7920oO0o0O0 f20989OooO00o;
    @Nullable

    /* renamed from: OooO00o  reason: collision with other field name */
    public final String f20990OooO00o;
    public final int OooO0O0;
    public final int OooO0OO;
    public final int OooO0Oo;

    public C7919oO0o0O(int i, int i2, int i3, int i4, @Nullable String str, @Nullable C7920oO0o0O0 oo0o0o0) {
        this.OooO00o = i;
        this.OooO0O0 = i2;
        this.OooO0OO = i3;
        this.OooO0Oo = i4;
        this.f20990OooO00o = str;
        this.f20989OooO00o = oo0o0o0;
    }

    public int OooO00o() {
        return this.OooO0Oo;
    }

    public int OooO0O0() {
        return this.OooO0OO;
    }

    public int OooO0OO() {
        return this.OooO00o;
    }

    public int OooO0Oo() {
        return this.OooO0O0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C7919oO0o0O.class != obj.getClass()) {
            return false;
        }
        C7919oO0o0O oo0o0o = (C7919oO0o0O) obj;
        if (this.OooO0Oo != oo0o0o.OooO0Oo || this.OooO0OO != oo0o0o.OooO0OO || this.OooO00o != oo0o0o.OooO00o || this.OooO0O0 != oo0o0o.OooO0O0) {
            return false;
        }
        C7920oO0o0O0 oo0o0o0 = this.f20989OooO00o;
        if (oo0o0o0 == null ? oo0o0o.f20989OooO00o != null : !oo0o0o0.equals(oo0o0o.f20989OooO00o)) {
            return false;
        }
        String str = this.f20990OooO00o;
        String str2 = oo0o0o.f20990OooO00o;
        return str == null ? str2 == null : str.equals(str2);
    }

    public int hashCode() {
        int i = ((((((this.OooO00o * 31) + this.OooO0O0) * 31) + this.OooO0OO) * 31) + this.OooO0Oo) * 31;
        String str = this.f20990OooO00o;
        int i2 = 0;
        int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        C7920oO0o0O0 oo0o0o0 = this.f20989OooO00o;
        if (oo0o0o0 != null) {
            i2 = oo0o0o0.hashCode();
        }
        return hashCode + i2;
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("x: ");
        sb.append(this.OooO00o);
        sb.append(" y: ");
        sb.append(this.OooO0O0);
        sb.append(" width: ");
        sb.append(this.OooO0OO);
        sb.append(" height: ");
        sb.append(this.OooO0Oo);
        if (this.f20990OooO00o != null) {
            sb.append(" name: ");
            sb.append(this.f20990OooO00o);
        }
        if (this.f20989OooO00o != null) {
            sb.append(" age: ");
            sb.append(this.f20989OooO00o.m19629OooO00o());
        }
        return sb.toString();
    }

    @Nullable
    /* renamed from: OooO00o  reason: collision with other method in class */
    public String m19628OooO00o() {
        return this.f20990OooO00o;
    }

    @Nullable
    /* renamed from: OooO00o  reason: collision with other method in class */
    public C7920oO0o0O0 m19627OooO00o() {
        return this.f20989OooO00o;
    }
}

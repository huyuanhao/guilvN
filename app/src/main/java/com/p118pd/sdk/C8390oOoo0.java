package com.p118pd.sdk;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* renamed from: com.pd.sdk.oOoo0  reason: case insensitive filesystem */
public class C8390oOoo0 {
    public Class<?> OooO00o;
    public Class<?> OooO0O0;
    public Class<?> OooO0OO;

    public C8390oOoo0() {
    }

    public void OooO00o(@NonNull Class<?> cls, @NonNull Class<?> cls2) {
        OooO00o(cls, cls2, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C8390oOoo0.class != obj.getClass()) {
            return false;
        }
        C8390oOoo0 oooo0 = (C8390oOoo0) obj;
        return this.OooO00o.equals(oooo0.OooO00o) && this.OooO0O0.equals(oooo0.OooO0O0) && oO0O0O00.OooO0O0(this.OooO0OO, oooo0.OooO0OO);
    }

    public int hashCode() {
        int hashCode = ((this.OooO00o.hashCode() * 31) + this.OooO0O0.hashCode()) * 31;
        Class<?> cls = this.OooO0OO;
        return hashCode + (cls != null ? cls.hashCode() : 0);
    }

    public String toString() {
        return "MultiClassKey{first=" + this.OooO00o + ", second=" + this.OooO0O0 + '}';
    }

    public C8390oOoo0(@NonNull Class<?> cls, @NonNull Class<?> cls2) {
        OooO00o(cls, cls2);
    }

    public void OooO00o(@NonNull Class<?> cls, @NonNull Class<?> cls2, @Nullable Class<?> cls3) {
        this.OooO00o = cls;
        this.OooO0O0 = cls2;
        this.OooO0OO = cls3;
    }

    public C8390oOoo0(@NonNull Class<?> cls, @NonNull Class<?> cls2, @Nullable Class<?> cls3) {
        OooO00o(cls, cls2, cls3);
    }
}

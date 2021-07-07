package com.p118pd.sdk;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* renamed from: com.pd.sdk.o00OO0O0  reason: case insensitive filesystem */
public class C7085o00OO0O0<F, S> {
    @Nullable
    public final F OooO00o;
    @Nullable
    public final S OooO0O0;

    public C7085o00OO0O0(@Nullable F f, @Nullable S s) {
        this.OooO00o = f;
        this.OooO0O0 = s;
    }

    @NonNull
    public static <A, B> C7085o00OO0O0<A, B> OooO00o(@Nullable A a, @Nullable B b) {
        return new C7085o00OO0O0<>(a, b);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C7085o00OO0O0)) {
            return false;
        }
        C7085o00OO0O0 o00oo0o0 = (C7085o00OO0O0) obj;
        if (!C7080o00OO0.OooO00o(o00oo0o0.OooO00o, this.OooO00o) || !C7080o00OO0.OooO00o(o00oo0o0.OooO0O0, this.OooO0O0)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        F f = this.OooO00o;
        int i = 0;
        int hashCode = f == null ? 0 : f.hashCode();
        S s = this.OooO0O0;
        if (s != null) {
            i = s.hashCode();
        }
        return hashCode ^ i;
    }

    public String toString() {
        return "Pair{" + String.valueOf(this.OooO00o) + " " + String.valueOf(this.OooO0O0) + C7522o0Ooo0o.OooO0Oo;
    }
}

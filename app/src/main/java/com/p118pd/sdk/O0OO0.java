package com.p118pd.sdk;

import org.jetbrains.annotations.NotNull;

/* renamed from: com.pd.sdk.O0OO0 */
public abstract class O0OO0<T> {
    public int OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final T[] f16955OooO00o;
    public final int OooO0O0;

    public O0OO0(int i) {
        this.OooO0O0 = i;
        this.f16955OooO00o = (T[]) new Object[i];
    }

    public final int OooO00o() {
        return this.OooO00o;
    }

    public abstract int OooO00o(@NotNull T t);

    public final int OooO0O0() {
        int i = this.OooO0O0 - 1;
        int i2 = 0;
        if (i >= 0) {
            int i3 = 0;
            while (true) {
                T t = this.f16955OooO00o[i3];
                i2 += t != null ? OooO00o((Object) t) : 1;
                if (i3 == i) {
                    break;
                }
                i3++;
            }
        }
        return i2;
    }

    public final void OooO00o(int i) {
        this.OooO00o = i;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public final void m16517OooO00o(@NotNull T t) {
        o0O0OO00.OooO0o(t, "spreadArgument");
        T[] tArr = this.f16955OooO00o;
        int i = this.OooO00o;
        this.OooO00o = i + 1;
        tArr[i] = t;
    }

    @NotNull
    public final T OooO00o(@NotNull T t, @NotNull T t2) {
        int i;
        o0O0OO00.OooO0o(t, "values");
        o0O0OO00.OooO0o(t2, "result");
        int i2 = this.OooO0O0 - 1;
        int i3 = 0;
        if (i2 >= 0) {
            int i4 = 0;
            int i5 = 0;
            i = 0;
            while (true) {
                T t3 = this.f16955OooO00o[i4];
                if (t3 != null) {
                    if (i5 < i4) {
                        int i6 = i4 - i5;
                        System.arraycopy(t, i5, t2, i, i6);
                        i += i6;
                    }
                    int OooO00o2 = OooO00o((Object) t3);
                    System.arraycopy(t3, 0, t2, i, OooO00o2);
                    i += OooO00o2;
                    i5 = i4 + 1;
                }
                if (i4 == i2) {
                    break;
                }
                i4++;
            }
            i3 = i5;
        } else {
            i = 0;
        }
        int i7 = this.OooO0O0;
        if (i3 < i7) {
            System.arraycopy(t, i3, t2, i, i7 - i3);
        }
        return t2;
    }
}

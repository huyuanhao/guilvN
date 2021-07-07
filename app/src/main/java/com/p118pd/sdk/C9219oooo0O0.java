package com.p118pd.sdk;

import com.umeng.message.proguard.C3848l;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.pd.sdk.oooo0O0  reason: case insensitive filesystem */
public final class C9219oooo0O0<T> {
    public final int OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final T f22634OooO00o;

    public C9219oooo0O0(int i, T t) {
        this.OooO00o = i;
        this.f22634OooO00o = t;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.pd.sdk.oooo0O0 */
    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static /* synthetic */ C9219oooo0O0 OooO00o(C9219oooo0O0 oooo0o0, int i, Object obj, int i2, Object obj2) {
        if ((i2 & 1) != 0) {
            i = oooo0o0.OooO00o;
        }
        if ((i2 & 2) != 0) {
            obj = oooo0o0.f22634OooO00o;
        }
        return oooo0o0.OooO00o(i, obj);
    }

    public final int OooO00o() {
        return this.OooO00o;
    }

    @NotNull
    public final C9219oooo0O0<T> OooO00o(int i, T t) {
        return new C9219oooo0O0<>(i, t);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public final T m21083OooO00o() {
        return this.f22634OooO00o;
    }

    public final int OooO0O0() {
        return this.OooO00o;
    }

    public boolean equals(@Nullable Object obj) {
        if (this != obj) {
            if (obj instanceof C9219oooo0O0) {
                C9219oooo0O0 oooo0o0 = (C9219oooo0O0) obj;
                if (!(this.OooO00o == oooo0o0.OooO00o) || !o0O0OO00.OooO00o((Object) this.f22634OooO00o, (Object) oooo0o0.f22634OooO00o)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i = this.OooO00o * 31;
        T t = this.f22634OooO00o;
        return i + (t != null ? t.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "IndexedValue(index=" + this.OooO00o + ", value=" + ((Object) this.f22634OooO00o) + C3848l.f10402t;
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public final T m21084OooO0O0() {
        return this.f22634OooO00o;
    }
}

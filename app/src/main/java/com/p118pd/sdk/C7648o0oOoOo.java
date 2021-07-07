package com.p118pd.sdk;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.security.MessageDigest;

/* renamed from: com.pd.sdk.o0oOoOo  reason: case insensitive filesystem */
public final class C7648o0oOoOo implements AbstractC7644o0oOoOO {
    public final C6971o0000oO0<C7647o0oOoOOo<?>, Object> OooO00o = new oO0O000o();

    public void OooO00o(@NonNull C7648o0oOoOo o0ooooo) {
        this.OooO00o.OooO00o((C6987o000O0o<? extends C7647o0oOoOOo<?>, ? extends Object>) o0ooooo.OooO00o);
    }

    @Override // com.p118pd.sdk.AbstractC7644o0oOoOO
    public boolean equals(Object obj) {
        if (obj instanceof C7648o0oOoOo) {
            return this.OooO00o.equals(((C7648o0oOoOo) obj).OooO00o);
        }
        return false;
    }

    @Override // com.p118pd.sdk.AbstractC7644o0oOoOO
    public int hashCode() {
        return this.OooO00o.hashCode();
    }

    public String toString() {
        return "Options{values=" + this.OooO00o + '}';
    }

    @NonNull
    public <T> C7648o0oOoOo OooO00o(@NonNull C7647o0oOoOOo<T> o0oooooo, @NonNull T t) {
        this.OooO00o.put(o0oooooo, t);
        return this;
    }

    @Nullable
    public <T> T OooO00o(@NonNull C7647o0oOoOOo<T> o0oooooo) {
        return this.OooO00o.containsKey(o0oooooo) ? (T) this.OooO00o.get(o0oooooo) : o0oooooo.m19293OooO00o();
    }

    @Override // com.p118pd.sdk.AbstractC7644o0oOoOO
    public void OooO00o(@NonNull MessageDigest messageDigest) {
        for (int i = 0; i < this.OooO00o.size(); i++) {
            OooO00o(this.OooO00o.OooO00o(i), this.OooO00o.OooO0OO(i), messageDigest);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: java.lang.Object */
    /* JADX WARN: Multi-variable type inference failed */
    public static <T> void OooO00o(@NonNull C7647o0oOoOOo<T> o0oooooo, @NonNull Object obj, @NonNull MessageDigest messageDigest) {
        o0oooooo.OooO00o(obj, messageDigest);
    }
}

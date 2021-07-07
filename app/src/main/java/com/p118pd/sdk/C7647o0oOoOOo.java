package com.p118pd.sdk;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.security.MessageDigest;

/* renamed from: com.pd.sdk.o0oOoOOo  reason: case insensitive filesystem */
public final class C7647o0oOoOOo<T> {
    public static final OooO0O0<Object> OooO0O0 = new OooO00o();
    public final OooO0O0<T> OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final T f20534OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final String f20535OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public volatile byte[] f20536OooO00o;

    /* renamed from: com.pd.sdk.o0oOoOOo$OooO00o */
    public class OooO00o implements OooO0O0<Object> {
        @Override // com.p118pd.sdk.C7647o0oOoOOo.OooO0O0
        public void OooO00o(@NonNull byte[] bArr, @NonNull Object obj, @NonNull MessageDigest messageDigest) {
        }
    }

    /* renamed from: com.pd.sdk.o0oOoOOo$OooO0O0 */
    public interface OooO0O0<T> {
        void OooO00o(@NonNull byte[] bArr, @NonNull T t, @NonNull MessageDigest messageDigest);
    }

    public C7647o0oOoOOo(@NonNull String str, @Nullable T t, @NonNull OooO0O0<T> oooO0O0) {
        this.f20535OooO00o = C7842oO0O0.OooO00o(str);
        this.f20534OooO00o = t;
        this.OooO00o = (OooO0O0) C7842oO0O0.OooO00o(oooO0O0);
    }

    @NonNull
    public static <T> C7647o0oOoOOo<T> OooO00o(@NonNull String str) {
        return new C7647o0oOoOOo<>(str, null, OooO00o());
    }

    public boolean equals(Object obj) {
        if (obj instanceof C7647o0oOoOOo) {
            return this.f20535OooO00o.equals(((C7647o0oOoOOo) obj).f20535OooO00o);
        }
        return false;
    }

    public int hashCode() {
        return this.f20535OooO00o.hashCode();
    }

    public String toString() {
        return "Option{key='" + this.f20535OooO00o + '\'' + '}';
    }

    @NonNull
    public static <T> C7647o0oOoOOo<T> OooO00o(@NonNull String str, @NonNull T t) {
        return new C7647o0oOoOOo<>(str, t, OooO00o());
    }

    @NonNull
    public static <T> C7647o0oOoOOo<T> OooO00o(@NonNull String str, @NonNull OooO0O0<T> oooO0O0) {
        return new C7647o0oOoOOo<>(str, null, oooO0O0);
    }

    @NonNull
    public static <T> C7647o0oOoOOo<T> OooO00o(@NonNull String str, @Nullable T t, @NonNull OooO0O0<T> oooO0O0) {
        return new C7647o0oOoOOo<>(str, t, oooO0O0);
    }

    @Nullable
    /* renamed from: OooO00o  reason: collision with other method in class */
    public T m19293OooO00o() {
        return this.f20534OooO00o;
    }

    public void OooO00o(@NonNull T t, @NonNull MessageDigest messageDigest) {
        this.OooO00o.OooO00o(m19292OooO00o(), t, messageDigest);
    }

    @NonNull
    /* renamed from: OooO00o  reason: collision with other method in class */
    private byte[] m19292OooO00o() {
        if (this.f20536OooO00o == null) {
            this.f20536OooO00o = this.f20535OooO00o.getBytes(AbstractC7644o0oOoOO.f20533OooO00o);
        }
        return this.f20536OooO00o;
    }

    @NonNull
    public static <T> OooO0O0<T> OooO00o() {
        return (OooO0O0<T>) OooO0O0;
    }
}

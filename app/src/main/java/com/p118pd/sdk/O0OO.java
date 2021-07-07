package com.p118pd.sdk;

import java.util.Collection;
import kotlin.SinceKotlin;
import kotlin.jvm.KotlinReflectionNotSupportedError;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@SinceKotlin(version = "1.1")
/* renamed from: com.pd.sdk.O0OO */
public final class O0OO implements O0O00oo {
    @NotNull
    public final Class<?> OooO00o;
    public final String o0ooOOo;

    public O0OO(@NotNull Class<?> cls, @NotNull String str) {
        o0O0OO00.OooO0o(cls, "jClass");
        o0O0OO00.OooO0o(str, "moduleName");
        this.OooO00o = cls;
        this.o0ooOOo = str;
    }

    @Override // com.p118pd.sdk.OO0O0, com.p118pd.sdk.O0O00oo
    @NotNull
    public Class<?> OooO00o() {
        return this.OooO00o;
    }

    public boolean equals(@Nullable Object obj) {
        return (obj instanceof O0OO) && o0O0OO00.OooO00o(OooO00o(), ((O0OO) obj).OooO00o());
    }

    public int hashCode() {
        return OooO00o().hashCode();
    }

    @NotNull
    public String toString() {
        return OooO00o().toString() + O0OO00.f16956OooO00o;
    }

    @Override // com.p118pd.sdk.OO0O0, com.p118pd.sdk.O0O00oo
    @NotNull
    /* renamed from: OooO00o  reason: collision with other method in class */
    public Collection<KCallable<?>> m16516OooO00o() {
        throw new KotlinReflectionNotSupportedError();
    }
}

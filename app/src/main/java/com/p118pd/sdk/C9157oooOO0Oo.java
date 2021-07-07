package com.p118pd.sdk;

import kotlin.PublishedApi;
import kotlin.Result;
import kotlin.SinceKotlin;
import kotlin.internal.InlineOnly;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.pd.sdk.oooOO0Oo  reason: case insensitive filesystem */
public final class C9157oooOO0Oo {
    @SinceKotlin(version = "1.3")
    @PublishedApi
    @NotNull
    public static final Object OooO00o(@NotNull Throwable th) {
        o0O0OO00.OooO0o(th, "exception");
        return new Result.Failure(th);
    }

    @SinceKotlin(version = "1.3")
    @InlineOnly
    public static final <R, T> Object OooO0O0(@NotNull Object obj, O00O0OOO<? super T, ? extends R> o00o0ooo) {
        if (!Result.m22107isSuccessimpl(obj)) {
            return Result.m22101constructorimpl(obj);
        }
        Result.OooO00o oooO00o = Result.Companion;
        return Result.m22101constructorimpl(o00o0ooo.invoke(obj));
    }

    @SinceKotlin(version = "1.3")
    @InlineOnly
    public static final <R, T> Object OooO0OO(@NotNull Object obj, O00O0OOO<? super T, ? extends R> o00o0ooo) {
        if (!Result.m22107isSuccessimpl(obj)) {
            return Result.m22101constructorimpl(obj);
        }
        try {
            Result.OooO00o oooO00o = Result.Companion;
            return Result.m22101constructorimpl(o00o0ooo.invoke(obj));
        } catch (Throwable th) {
            Result.OooO00o oooO00o2 = Result.Companion;
            return Result.m22101constructorimpl(OooO00o(th));
        }
    }

    @SinceKotlin(version = "1.3")
    @InlineOnly
    public static final <T> Object OooO0Oo(@NotNull Object obj, O00O0OOO<? super Throwable, C9174oooOOooO> o00o0ooo) {
        Throwable r0 = Result.m22104exceptionOrNullimpl(obj);
        if (r0 != null) {
            o00o0ooo.invoke(r0);
        }
        return obj;
    }

    @SinceKotlin(version = "1.3")
    @InlineOnly
    public static final <R, T extends R> Object OooO0o(@NotNull Object obj, O00O0OOO<? super Throwable, ? extends R> o00o0ooo) {
        Throwable r0 = Result.m22104exceptionOrNullimpl(obj);
        if (r0 == null) {
            return obj;
        }
        Result.OooO00o oooO00o = Result.Companion;
        return Result.m22101constructorimpl(o00o0ooo.invoke(r0));
    }

    @SinceKotlin(version = "1.3")
    @InlineOnly
    public static final <T> Object OooO0o0(@NotNull Object obj, O00O0OOO<? super T, C9174oooOOooO> o00o0ooo) {
        if (Result.m22107isSuccessimpl(obj)) {
            o00o0ooo.invoke(obj);
        }
        return obj;
    }

    @SinceKotlin(version = "1.3")
    @InlineOnly
    public static final <R, T extends R> Object OooO0oO(@NotNull Object obj, O00O0OOO<? super Throwable, ? extends R> o00o0ooo) {
        Throwable r0 = Result.m22104exceptionOrNullimpl(obj);
        if (r0 == null) {
            return obj;
        }
        try {
            Result.OooO00o oooO00o = Result.Companion;
            return Result.m22101constructorimpl(o00o0ooo.invoke(r0));
        } catch (Throwable th) {
            Result.OooO00o oooO00o2 = Result.Companion;
            return Result.m22101constructorimpl(OooO00o(th));
        }
    }

    @SinceKotlin(version = "1.3")
    @InlineOnly
    public static final <T, R> Object OooO0oo(T t, O00O0OOO<? super T, ? extends R> o00o0ooo) {
        try {
            Result.OooO00o oooO00o = Result.Companion;
            return Result.m22101constructorimpl(o00o0ooo.invoke(t));
        } catch (Throwable th) {
            Result.OooO00o oooO00o2 = Result.Companion;
            return Result.m22101constructorimpl(OooO00o(th));
        }
    }

    @SinceKotlin(version = "1.3")
    @PublishedApi
    /* renamed from: OooO00o  reason: collision with other method in class */
    public static final void m20899OooO00o(@NotNull Object obj) {
        if (obj instanceof Result.Failure) {
            throw ((Result.Failure) obj).exception;
        }
    }

    @SinceKotlin(version = "1.3")
    @InlineOnly
    public static final <R> Object OooO00o(O00O0000<? extends R> o00o0000) {
        try {
            Result.OooO00o oooO00o = Result.Companion;
            return Result.m22101constructorimpl(o00o0000.invoke());
        } catch (Throwable th) {
            Result.OooO00o oooO00o2 = Result.Companion;
            return Result.m22101constructorimpl(OooO00o(th));
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: java.lang.Object */
    /* JADX WARN: Multi-variable type inference failed */
    @SinceKotlin(version = "1.3")
    @InlineOnly
    public static final <T> T OooO00o(@NotNull Object obj) {
        m20899OooO00o(obj);
        return obj;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: java.lang.Object */
    /* JADX WARN: Multi-variable type inference failed */
    @SinceKotlin(version = "1.3")
    @InlineOnly
    public static final <R, T extends R> R OooO00o(@NotNull Object obj, O00O0OOO<? super Throwable, ? extends R> o00o0ooo) {
        Throwable r0 = Result.m22104exceptionOrNullimpl(obj);
        return r0 == null ? obj : (R) o00o0ooo.invoke(r0);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: java.lang.Object */
    /* JADX WARN: Multi-variable type inference failed */
    @SinceKotlin(version = "1.3")
    @InlineOnly
    public static final <R, T extends R> R OooO00o(@NotNull Object obj, R r) {
        return Result.m22106isFailureimpl(obj) ? r : obj;
    }

    @SinceKotlin(version = "1.3")
    @InlineOnly
    public static final <R, T> R OooO00o(@NotNull Object obj, O00O0OOO<? super T, ? extends R> o00o0ooo, O00O0OOO<? super Throwable, ? extends R> o00o0ooo2) {
        Throwable r0 = Result.m22104exceptionOrNullimpl(obj);
        return r0 == null ? (R) o00o0ooo.invoke(obj) : (R) o00o0ooo2.invoke(r0);
    }
}

package com.p118pd.sdk;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Enumeration;
import java.util.List;
import kotlin.PublishedApi;
import kotlin.SinceKotlin;
import kotlin.TypeCastException;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.internal.InlineOnly;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.pd.sdk.oooOooOo  reason: case insensitive filesystem */
public class C9201oooOooOo {
    @NotNull
    public static final <T> List<T> OooO00o(T t) {
        List<T> singletonList = Collections.singletonList(t);
        o0O0OO00.OooO00o((Object) singletonList, "java.util.Collections.singletonList(element)");
        return singletonList;
    }

    @SinceKotlin(version = "1.3")
    @PublishedApi
    @InlineOnly
    public static final int OooO0O0(int i) {
        if (i < 0) {
            if (O000O000.OooO00o(1, 3, 0)) {
                CollectionsKt__CollectionsKt.m22701OooO0O0();
            } else {
                throw new ArithmeticException("Index overflow has happened.");
            }
        }
        return i;
    }

    @InlineOnly
    public static final <T> List<T> OooO00o(@NotNull Enumeration<T> enumeration) {
        ArrayList list = Collections.list(enumeration);
        o0O0OO00.OooO00o((Object) list, "java.util.Collections.list(this)");
        return list;
    }

    @InlineOnly
    public static final Object[] OooO00o(Collection<?> collection) {
        return C7275o0O00OOo.OooO00o(collection);
    }

    @InlineOnly
    public static final <T> T[] OooO00o(Collection<?> collection, T[] tArr) {
        if (tArr != null) {
            T[] tArr2 = (T[]) C7275o0O00OOo.OooO00o(collection, tArr);
            if (tArr2 != null) {
                return tArr2;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
    }

    @NotNull
    public static final <T> Object[] OooO00o(@NotNull T[] tArr, boolean z) {
        o0O0OO00.OooO0o(tArr, "receiver$0");
        if (z && o0O0OO00.OooO00o(tArr.getClass(), Object[].class)) {
            return tArr;
        }
        Object[] copyOf = Arrays.copyOf(tArr, tArr.length, Object[].class);
        o0O0OO00.OooO00o((Object) copyOf, "java.util.Arrays.copyOf(… Array<Any?>::class.java)");
        return copyOf;
    }

    @SinceKotlin(version = "1.3")
    @PublishedApi
    @InlineOnly
    public static final int OooO00o(int i) {
        if (i < 0) {
            if (O000O000.OooO00o(1, 3, 0)) {
                CollectionsKt__CollectionsKt.m22699OooO00o();
            } else {
                throw new ArithmeticException("Count overflow has happened.");
            }
        }
        return i;
    }
}

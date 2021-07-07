package com.p118pd.sdk;

import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.SinceKotlin;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.EmptySet;
import kotlin.internal.InlineOnly;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.pd.sdk.oooo0ooO  reason: case insensitive filesystem */
public class C9239oooo0ooO extends C9237oooo0oo {
    @NotNull
    /* renamed from: OooO00o  reason: collision with other method in class */
    public static final <T> Set<T> m21126OooO00o() {
        return EmptySet.INSTANCE;
    }

    @NotNull
    public static final <T> Set<T> OooO0O0(@NotNull T... tArr) {
        o0O0OO00.OooO0o(tArr, "elements");
        return tArr.length > 0 ? ArraysKt___ArraysKt.m22431OooO0O0((Object[]) tArr) : m21126OooO00o();
    }

    @InlineOnly
    public static final <T> Set<T> OooO0OO() {
        return m21126OooO00o();
    }

    @NotNull
    /* renamed from: OooO00o  reason: collision with other method in class */
    public static final <T> Set<T> m21127OooO00o(@NotNull T... tArr) {
        o0O0OO00.OooO0o(tArr, "elements");
        return (Set) ArraysKt___ArraysKt.OooO0OO((Object[]) tArr, (Collection) new LinkedHashSet(C9232oooo0o00.OooO00o(tArr.length)));
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    public static final <T> Set<T> OooO0O0() {
        return new LinkedHashSet();
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    public static final <T> HashSet<T> OooO00o() {
        return new HashSet<>();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: java.util.Set<? extends T> */
    /* JADX WARN: Multi-variable type inference failed */
    @InlineOnly
    public static final <T> Set<T> OooO0O0(@Nullable Set<? extends T> set) {
        return set != 0 ? set : m21126OooO00o();
    }

    @NotNull
    public static final <T> HashSet<T> OooO00o(@NotNull T... tArr) {
        o0O0OO00.OooO0o(tArr, "elements");
        return (HashSet) ArraysKt___ArraysKt.OooO0OO((Object[]) tArr, (Collection) new HashSet(C9232oooo0o00.OooO00o(tArr.length)));
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    /* renamed from: OooO00o  reason: collision with other method in class */
    public static final <T> LinkedHashSet<T> m21124OooO00o() {
        return new LinkedHashSet<>();
    }

    @NotNull
    /* renamed from: OooO00o  reason: collision with other method in class */
    public static final <T> LinkedHashSet<T> m21125OooO00o(@NotNull T... tArr) {
        o0O0OO00.OooO0o(tArr, "elements");
        return (LinkedHashSet) ArraysKt___ArraysKt.OooO0OO((Object[]) tArr, (Collection) new LinkedHashSet(C9232oooo0o00.OooO00o(tArr.length)));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.Set<? extends T> */
    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final <T> Set<T> OooO00o(@NotNull Set<? extends T> set) {
        o0O0OO00.OooO0o(set, "receiver$0");
        int size = set.size();
        if (size == 0) {
            return m21126OooO00o();
        }
        if (size != 1) {
            return set;
        }
        return C9237oooo0oo.OooO00o(set.iterator().next());
    }
}

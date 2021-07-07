package com.p118pd.sdk;

import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.JvmName;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.pd.sdk.oooo000o  reason: case insensitive filesystem */
public class C9211oooo000o extends C9210oooo000O {
    public static final int OooO0OO(@NotNull List<?> list, int i) {
        int OooO00o = CollectionsKt__CollectionsKt.OooO00o((List) list);
        if (i >= 0 && OooO00o >= i) {
            return CollectionsKt__CollectionsKt.OooO00o((List) list) - i;
        }
        throw new IndexOutOfBoundsException("Element index " + i + " must be in range [" + new IntRange(0, CollectionsKt__CollectionsKt.OooO00o((List) list)) + "].");
    }

    public static final int OooO0Oo(@NotNull List<?> list, int i) {
        int size = list.size();
        if (i >= 0 && size >= i) {
            return list.size() - i;
        }
        throw new IndexOutOfBoundsException("Position index " + i + " must be in range [" + new IntRange(0, list.size()) + "].");
    }

    @NotNull
    public static final <T> List<T> OooO0OO(@NotNull List<? extends T> list) {
        o0O0OO00.OooO0o(list, "receiver$0");
        return new C9236oooo0oOO(list);
    }

    @JvmName(name = "asReversedMutable")
    @NotNull
    public static final <T> List<T> OooO0Oo(@NotNull List<T> list) {
        o0O0OO00.OooO0o(list, "receiver$0");
        return new C9234oooo0oO(list);
    }
}

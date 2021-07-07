package com.p118pd.sdk;

import java.lang.reflect.Array;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collection;
import kotlin.PublishedApi;
import kotlin.SinceKotlin;
import kotlin.TypeCastException;
import kotlin.internal.InlineOnly;
import kotlin.jvm.JvmName;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.pd.sdk.oooOoOo  reason: case insensitive filesystem */
public class C9186oooOoOo {
    @InlineOnly
    public static final String OooO00o(@NotNull byte[] bArr, Charset charset) {
        return new String(bArr, charset);
    }

    public static final <T> T[] OooO00o(@NotNull Collection<? extends T> collection) {
        if (collection != null) {
            o0O0OO00.OooO00o(0, "T?");
            T[] tArr = (T[]) collection.toArray(new Object[0]);
            if (tArr != null) {
                return tArr;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
        }
        throw new TypeCastException("null cannot be cast to non-null type java.util.Collection<T>");
    }

    @NotNull
    public static final <T> T[] OooO00o(@NotNull T[] tArr, int i) {
        o0O0OO00.OooO0o(tArr, "reference");
        Object newInstance = Array.newInstance(tArr.getClass().getComponentType(), i);
        if (newInstance != null) {
            return (T[]) ((Object[]) newInstance);
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
    }

    @SinceKotlin(version = "1.3")
    public static final void OooO00o(int i, int i2) {
        if (i > i2) {
            throw new IndexOutOfBoundsException("toIndex (" + i + ") is greater than size (" + i2 + ").");
        }
    }

    @SinceKotlin(version = "1.3")
    @JvmName(name = "contentDeepHashCode")
    @PublishedApi
    public static final <T> int OooO00o(@NotNull T[] tArr) {
        o0O0OO00.OooO0o(tArr, "receiver$0");
        return Arrays.deepHashCode(tArr);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static final <T> T[] m20980OooO00o(@Nullable T[] tArr) {
        if (tArr != null) {
            return tArr;
        }
        o0O0OO00.OooO00o(0, "T?");
        return (T[]) new Object[0];
    }
}

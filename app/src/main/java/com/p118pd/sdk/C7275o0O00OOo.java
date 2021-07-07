package com.p118pd.sdk;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import kotlin.TypeCastException;
import kotlin.jvm.JvmName;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@JvmName(name = "CollectionToArray")
/* renamed from: com.pd.sdk.o0O00OOo  reason: case insensitive filesystem */
public final class C7275o0O00OOo {
    public static final int OooO00o = 2147483645;

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final Object[] f19928OooO00o = new Object[0];

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:30:0x006d */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object, java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.lang.Object[], java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object[] OooO00o(java.util.Collection<?> r2, com.p118pd.sdk.O00O0000<java.lang.Object[]> r3, com.p118pd.sdk.O00O0OOO<? super java.lang.Integer, java.lang.Object[]> r4, com.p118pd.sdk.O00Oo000<? super java.lang.Object[], ? super java.lang.Integer, java.lang.Object[]> r5) {
        /*
        // Method dump skipped, instructions count: 111
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p118pd.sdk.C7275o0O00OOo.OooO00o(java.util.Collection, com.pd.sdk.O00O0000, com.pd.sdk.O00O0OOO, com.pd.sdk.O00Oo000):java.lang.Object[]");
    }

    @JvmName(name = "toArray")
    @NotNull
    public static final Object[] OooO00o(@NotNull Collection<?> collection) {
        o0O0OO00.OooO0o(collection, "collection");
        int size = collection.size();
        if (size != 0) {
            Iterator<?> it = collection.iterator();
            if (it.hasNext()) {
                Object[] objArr = new Object[size];
                int i = 0;
                while (true) {
                    int i2 = i + 1;
                    objArr[i] = it.next();
                    if (i2 >= objArr.length) {
                        if (!it.hasNext()) {
                            return objArr;
                        }
                        int i3 = ((i2 * 3) + 1) >>> 1;
                        if (i3 <= i2) {
                            if (i2 < 2147483645) {
                                i3 = OooO00o;
                            } else {
                                throw new OutOfMemoryError();
                            }
                        }
                        objArr = Arrays.copyOf(objArr, i3);
                        o0O0OO00.OooO00o((Object) objArr, "Arrays.copyOf(result, newSize)");
                    } else if (!it.hasNext()) {
                        Object[] copyOf = Arrays.copyOf(objArr, i2);
                        o0O0OO00.OooO00o((Object) copyOf, "Arrays.copyOf(result, size)");
                        return copyOf;
                    }
                    i = i2;
                }
            }
        }
        return f19928OooO00o;
    }

    @JvmName(name = "toArray")
    @NotNull
    public static final Object[] OooO00o(@NotNull Collection<?> collection, @Nullable Object[] objArr) {
        Object[] objArr2;
        o0O0OO00.OooO0o(collection, "collection");
        if (objArr != null) {
            int size = collection.size();
            int i = 0;
            if (size != 0) {
                Iterator<?> it = collection.iterator();
                if (it.hasNext()) {
                    if (size <= objArr.length) {
                        objArr2 = objArr;
                    } else {
                        Object newInstance = Array.newInstance(objArr.getClass().getComponentType(), size);
                        if (newInstance != null) {
                            objArr2 = (Object[]) newInstance;
                        } else {
                            throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                        }
                    }
                    while (true) {
                        int i2 = i + 1;
                        objArr2[i] = it.next();
                        if (i2 >= objArr2.length) {
                            if (!it.hasNext()) {
                                return objArr2;
                            }
                            int i3 = ((i2 * 3) + 1) >>> 1;
                            if (i3 <= i2) {
                                if (i2 < 2147483645) {
                                    i3 = OooO00o;
                                } else {
                                    throw new OutOfMemoryError();
                                }
                            }
                            objArr2 = Arrays.copyOf(objArr2, i3);
                            o0O0OO00.OooO00o((Object) objArr2, "Arrays.copyOf(result, newSize)");
                        } else if (!it.hasNext()) {
                            if (objArr2 == objArr) {
                                objArr[i2] = null;
                                return objArr;
                            }
                            Object[] copyOf = Arrays.copyOf(objArr2, i2);
                            o0O0OO00.OooO00o((Object) copyOf, "Arrays.copyOf(result, size)");
                            return copyOf;
                        }
                        i = i2;
                    }
                } else if (objArr.length <= 0) {
                    return objArr;
                } else {
                    objArr[0] = null;
                    return objArr;
                }
            } else if (objArr.length <= 0) {
                return objArr;
            } else {
                objArr[0] = null;
                return objArr;
            }
        } else {
            throw null;
        }
    }
}

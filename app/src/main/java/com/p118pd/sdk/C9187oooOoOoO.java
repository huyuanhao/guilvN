package com.p118pd.sdk;

import anet.channel.strategy.dispatch.DispatchConstants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import kotlin.Pair;
import kotlin.PublishedApi;
import kotlin.SinceKotlin;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.internal.InlineOnly;
import kotlin.jvm.JvmName;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.pd.sdk.oooOoOoO  reason: case insensitive filesystem */
public class C9187oooOoOoO extends C9186oooOoOo {
    @NotNull
    public static final <T, R> Pair<List<T>, List<R>> OooO00o(@NotNull Pair<? extends T, ? extends R>[] pairArr) {
        o0O0OO00.OooO0o(pairArr, "receiver$0");
        ArrayList arrayList = new ArrayList(pairArr.length);
        ArrayList arrayList2 = new ArrayList(pairArr.length);
        for (Pair<? extends T, ? extends R> pair : pairArr) {
            arrayList.add(pair.getFirst());
            arrayList2.add(pair.getSecond());
        }
        return C9163oooOOO0O.OooO00o(arrayList, arrayList2);
    }

    @SinceKotlin(version = "1.3")
    @InlineOnly
    /* renamed from: OooO00o  reason: collision with other method in class */
    public static final boolean m20981OooO00o(@Nullable Object[] objArr) {
        if (objArr != null) {
            return objArr.length == 0;
        }
    }

    /* JADX WARN: Incorrect types in method signature: <C:[Ljava/lang/Object;:TR;R:Ljava/lang/Object;>(TC;Lcom/pd/sdk/O00O0000<+TR;>;)TR; */
    @SinceKotlin(version = "1.3")
    @InlineOnly
    public static final Object OooO00o(Object[] objArr, O00O0000 o00o0000) {
        return objArr.length == 0 ? o00o0000.invoke() : objArr;
    }

    @SinceKotlin(version = "1.3")
    @JvmName(name = "contentDeepEquals")
    @PublishedApi
    public static final <T> boolean OooO00o(@NotNull T[] tArr, @NotNull T[] tArr2) {
        o0O0OO00.OooO0o(tArr, "receiver$0");
        o0O0OO00.OooO0o(tArr2, DispatchConstants.OTHER);
        if (tArr == tArr2) {
            return true;
        }
        if (tArr.length != tArr2.length) {
            return false;
        }
        int length = tArr.length;
        for (int i = 0; i < length; i++) {
            T t = tArr[i];
            T t2 = tArr2[i];
            if (t != t2) {
                if (t == null || t2 == null) {
                    return false;
                }
                if (!(t instanceof Object[]) || !(t2 instanceof Object[])) {
                    if (!(t instanceof byte[]) || !(t2 instanceof byte[])) {
                        if (!(t instanceof short[]) || !(t2 instanceof short[])) {
                            if (!(t instanceof int[]) || !(t2 instanceof int[])) {
                                if (!(t instanceof long[]) || !(t2 instanceof long[])) {
                                    if (!(t instanceof float[]) || !(t2 instanceof float[])) {
                                        if (!(t instanceof double[]) || !(t2 instanceof double[])) {
                                            if (!(t instanceof char[]) || !(t2 instanceof char[])) {
                                                if (!(t instanceof boolean[]) || !(t2 instanceof boolean[])) {
                                                    if (!(t instanceof UByteArray) || !(t2 instanceof UByteArray)) {
                                                        if (!(t instanceof UShortArray) || !(t2 instanceof UShortArray)) {
                                                            if (!(t instanceof UIntArray) || !(t2 instanceof UIntArray)) {
                                                                if (!(t instanceof ULongArray) || !(t2 instanceof ULongArray)) {
                                                                    if (!o0O0OO00.OooO00o((Object) t, (Object) t2)) {
                                                                        return false;
                                                                    }
                                                                } else if (!C9244ooooO00o.OooO00o(t.OooO00o(), t2.OooO00o())) {
                                                                    return false;
                                                                }
                                                            } else if (!C9244ooooO00o.OooO00o(t.OooO00o(), t2.OooO00o())) {
                                                                return false;
                                                            }
                                                        } else if (!C9244ooooO00o.OooO00o(t.OooO00o(), t2.OooO00o())) {
                                                            return false;
                                                        }
                                                    } else if (!C9244ooooO00o.OooO00o(t.OooO00o(), t2.OooO00o())) {
                                                        return false;
                                                    }
                                                } else if (!Arrays.equals((boolean[]) t, (boolean[]) t2)) {
                                                    return false;
                                                }
                                            } else if (!Arrays.equals((char[]) t, (char[]) t2)) {
                                                return false;
                                            }
                                        } else if (!Arrays.equals((double[]) t, (double[]) t2)) {
                                            return false;
                                        }
                                    } else if (!Arrays.equals((float[]) t, (float[]) t2)) {
                                        return false;
                                    }
                                } else if (!Arrays.equals((long[]) t, (long[]) t2)) {
                                    return false;
                                }
                            } else if (!Arrays.equals((int[]) t, (int[]) t2)) {
                                return false;
                            }
                        } else if (!Arrays.equals((short[]) t, (short[]) t2)) {
                            return false;
                        }
                    } else if (!Arrays.equals((byte[]) t, (byte[]) t2)) {
                        return false;
                    }
                } else if (!OooO00o((Object[]) t, (Object[]) t2)) {
                    return false;
                }
            }
        }
        return true;
    }

    @SinceKotlin(version = "1.3")
    @JvmName(name = "contentDeepToString")
    @NotNull
    @PublishedApi
    public static final <T> String OooO00o(@NotNull T[] tArr) {
        o0O0OO00.OooO0o(tArr, "receiver$0");
        StringBuilder sb = new StringBuilder((oO00O000.OooO0O0(tArr.length, 429496729) * 5) + 2);
        OooO00o(tArr, sb, new ArrayList());
        String sb2 = sb.toString();
        o0O0OO00.OooO00o((Object) sb2, "StringBuilder(capacity).…builderAction).toString()");
        return sb2;
    }

    public static final <T> void OooO00o(@NotNull T[] tArr, StringBuilder sb, List<Object[]> list) {
        if (list.contains(tArr)) {
            sb.append("[...]");
            return;
        }
        list.add(tArr);
        sb.append('[');
        int length = tArr.length;
        for (int i = 0; i < length; i++) {
            if (i != 0) {
                sb.append(", ");
            }
            T t = tArr[i];
            if (t == null) {
                sb.append("null");
            } else if (t instanceof Object[]) {
                OooO00o((Object[]) t, sb, list);
            } else if (t instanceof byte[]) {
                String arrays = Arrays.toString((byte[]) t);
                o0O0OO00.OooO00o((Object) arrays, "java.util.Arrays.toString(this)");
                sb.append(arrays);
            } else if (t instanceof short[]) {
                String arrays2 = Arrays.toString((short[]) t);
                o0O0OO00.OooO00o((Object) arrays2, "java.util.Arrays.toString(this)");
                sb.append(arrays2);
            } else if (t instanceof int[]) {
                String arrays3 = Arrays.toString((int[]) t);
                o0O0OO00.OooO00o((Object) arrays3, "java.util.Arrays.toString(this)");
                sb.append(arrays3);
            } else if (t instanceof long[]) {
                String arrays4 = Arrays.toString((long[]) t);
                o0O0OO00.OooO00o((Object) arrays4, "java.util.Arrays.toString(this)");
                sb.append(arrays4);
            } else if (t instanceof float[]) {
                String arrays5 = Arrays.toString((float[]) t);
                o0O0OO00.OooO00o((Object) arrays5, "java.util.Arrays.toString(this)");
                sb.append(arrays5);
            } else if (t instanceof double[]) {
                String arrays6 = Arrays.toString((double[]) t);
                o0O0OO00.OooO00o((Object) arrays6, "java.util.Arrays.toString(this)");
                sb.append(arrays6);
            } else if (t instanceof char[]) {
                String arrays7 = Arrays.toString((char[]) t);
                o0O0OO00.OooO00o((Object) arrays7, "java.util.Arrays.toString(this)");
                sb.append(arrays7);
            } else if (t instanceof boolean[]) {
                String arrays8 = Arrays.toString((boolean[]) t);
                o0O0OO00.OooO00o((Object) arrays8, "java.util.Arrays.toString(this)");
                sb.append(arrays8);
            } else if (t instanceof UByteArray) {
                sb.append(C9244ooooO00o.m21132OooO00o(t.OooO00o()));
            } else if (t instanceof UShortArray) {
                sb.append(C9244ooooO00o.m21135OooO00o(t.OooO00o()));
            } else if (t instanceof UIntArray) {
                sb.append(C9244ooooO00o.m21133OooO00o(t.OooO00o()));
            } else if (t instanceof ULongArray) {
                sb.append(C9244ooooO00o.m21134OooO00o(t.OooO00o()));
            } else {
                sb.append(t.toString());
            }
        }
        sb.append(']');
        list.remove(CollectionsKt__CollectionsKt.OooO00o((List) list));
    }

    @NotNull
    public static final <T> List<T> OooO00o(@NotNull T[][] tArr) {
        o0O0OO00.OooO0o(tArr, "receiver$0");
        int i = 0;
        for (T[] tArr2 : tArr) {
            i += tArr2.length;
        }
        ArrayList arrayList = new ArrayList(i);
        for (T[] tArr3 : tArr) {
            C9210oooo000O.m21076OooO00o((Collection) arrayList, (Object[]) tArr3);
        }
        return arrayList;
    }
}

package com.p118pd.sdk;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.PublishedApi;
import kotlin.SinceKotlin;
import kotlin.TypeCastException;
import kotlin.internal.InlineOnly;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.pd.sdk.oooo0  reason: case insensitive filesystem */
public class C9206oooo0 {
    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: java.util.LinkedHashMap */
    /* JADX WARN: Multi-variable type inference failed */
    @SinceKotlin(version = "1.1")
    @NotNull
    public static final <T, K> Map<K, Integer> OooO00o(@NotNull AbstractC9214oooo00Oo<T, ? extends K> oooo00oo) {
        o0O0OO00.OooO0o(oooo00oo, "receiver$0");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<T> OooO00o = oooo00oo.OooO00o();
        while (OooO00o.hasNext()) {
            Object OooO00o2 = oooo00oo.OooO00o(OooO00o.next());
            Object obj = linkedHashMap.get(OooO00o2);
            if (obj == null && !linkedHashMap.containsKey(OooO00o2)) {
                obj = new Ref.IntRef();
            }
            Ref.IntRef intRef = (Ref.IntRef) obj;
            intRef.element++;
            linkedHashMap.put(OooO00o2, intRef);
        }
        for (T t : linkedHashMap.entrySet()) {
            if (t != null) {
                C7367o0OO00oO.m18888OooO00o((Object) t).setValue(Integer.valueOf(((Ref.IntRef) t.getValue()).element));
            } else {
                throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.MutableMap.MutableEntry<K, R>");
            }
        }
        return C7367o0OO00oO.m18890OooO00o((Object) linkedHashMap);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.Map$Entry */
    /* JADX WARN: Multi-variable type inference failed */
    @PublishedApi
    @InlineOnly
    public static final <K, V, R> Map<K, R> OooO00o(@NotNull Map<K, V> map, O00O0OOO<? super Map.Entry<? extends K, ? extends V>, ? extends R> o00o0ooo) {
        for (T t : map.entrySet()) {
            if (t != null) {
                C7367o0OO00oO.m18888OooO00o((Object) t).setValue(o00o0ooo.invoke(t));
            } else {
                throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.MutableMap.MutableEntry<K, R>");
            }
        }
        if (map != null) {
            return C7367o0OO00oO.m18890OooO00o((Object) map);
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.MutableMap<K, R>");
    }
}

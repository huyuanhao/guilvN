package com.p118pd.sdk;

import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.PublishedApi;
import kotlin.jvm.JvmName;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.pd.sdk.oooo0OoO  reason: case insensitive filesystem */
public class C9228oooo0OoO {
    @PublishedApi
    @JvmName(name = "getOrImplicitDefaultNullable")
    public static final <K, V> V OooO00o(@NotNull Map<K, ? extends V> map, K k) {
        o0O0OO00.OooO0o(map, "receiver$0");
        if (map instanceof AbstractC9225oooo0OOo) {
            return (V) ((AbstractC9225oooo0OOo) map).OooO00o(k);
        }
        V v = (V) map.get(k);
        if (v != null || map.containsKey(k)) {
            return v;
        }
        throw new NoSuchElementException("Key " + ((Object) k) + " is missing in the map.");
    }

    @JvmName(name = "withDefaultMutable")
    @NotNull
    public static final <K, V> Map<K, V> OooO0O0(@NotNull Map<K, V> map, @NotNull O00O0OOO<? super K, ? extends V> o00o0ooo) {
        o0O0OO00.OooO0o(map, "receiver$0");
        o0O0OO00.OooO0o(o00o0ooo, "defaultValue");
        if (map instanceof AbstractC9230oooo0o) {
            return OooO0O0(((AbstractC9230oooo0o) map).OooO00o(), o00o0ooo);
        }
        return new C9235oooo0oO0(map, o00o0ooo);
    }

    @NotNull
    public static final <K, V> Map<K, V> OooO00o(@NotNull Map<K, ? extends V> map, @NotNull O00O0OOO<? super K, ? extends V> o00o0ooo) {
        o0O0OO00.OooO0o(map, "receiver$0");
        o0O0OO00.OooO0o(o00o0ooo, "defaultValue");
        if (map instanceof AbstractC9225oooo0OOo) {
            return OooO00o((Map) ((AbstractC9225oooo0OOo) map).OooO00o(), (O00O0OOO) o00o0ooo);
        }
        return new C9227oooo0Oo0(map, o00o0ooo);
    }
}

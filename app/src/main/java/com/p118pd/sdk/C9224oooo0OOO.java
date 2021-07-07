package com.p118pd.sdk;

import java.util.Map;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.internal.InlineOnly;
import kotlin.internal.LowPriorityInOverloadResolution;
import kotlin.jvm.JvmName;
import org.jetbrains.annotations.NotNull;

@JvmName(name = "MapAccessorsKt")
/* renamed from: com.pd.sdk.oooo0OOO  reason: case insensitive filesystem */
public final class C9224oooo0OOO {
    @InlineOnly
    public static final <V, V1 extends V> V1 OooO00o(@NotNull Map<? super String, ? extends V> map, Object obj, KProperty<?> oo0o00o0) {
        o0O0OO00.OooO0o(map, "receiver$0");
        return (V1) C9228oooo0OoO.OooO00o(map, oo0o00o0.getName());
    }

    @InlineOnly
    @JvmName(name = "getVar")
    public static final <V, V1 extends V> V1 OooO0O0(@NotNull Map<? super String, ? extends V> map, Object obj, KProperty<?> oo0o00o0) {
        o0O0OO00.OooO0o(map, "receiver$0");
        return (V1) C9228oooo0OoO.OooO00o(map, oo0o00o0.getName());
    }

    @InlineOnly
    @JvmName(name = "getVarContravariant")
    @Deprecated(level = DeprecationLevel.ERROR, message = "Use getValue() with two type parameters instead")
    @LowPriorityInOverloadResolution
    public static final <V> V OooO0OO(@NotNull Map<? super String, ? super V> map, Object obj, KProperty<?> oo0o00o0) {
        return (V) C9228oooo0OoO.OooO00o(map, oo0o00o0.getName());
    }

    @InlineOnly
    public static final <V> void OooO00o(@NotNull Map<? super String, ? super V> map, Object obj, KProperty<?> oo0o00o0, V v) {
        o0O0OO00.OooO0o(map, "receiver$0");
        map.put(oo0o00o0.getName(), v);
    }
}

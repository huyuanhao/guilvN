package com.p118pd.sdk;

import java.util.Iterator;
import kotlin.internal.InlineOnly;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.pd.sdk.oooOoooo  reason: case insensitive filesystem */
public class C9204oooOoooo extends C9203oooOoooO {
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: java.util.Iterator<? extends T> */
    /* JADX WARN: Multi-variable type inference failed */
    @InlineOnly
    public static final <T> Iterator<T> OooO00o(@NotNull Iterator<? extends T> it) {
        o0O0OO00.OooO0o(it, "receiver$0");
        return it;
    }

    public static final <T> void OooO00o(@NotNull Iterator<? extends T> it, @NotNull O00O0OOO<? super T, C9174oooOOooO> o00o0ooo) {
        o0O0OO00.OooO0o(it, "receiver$0");
        o0O0OO00.OooO0o(o00o0ooo, "operation");
        while (it.hasNext()) {
            o00o0ooo.invoke((Object) it.next());
        }
    }

    @NotNull
    public static final <T> Iterator<C9219oooo0O0<T>> OooO0O0(@NotNull Iterator<? extends T> it) {
        o0O0OO00.OooO0o(it, "receiver$0");
        return new C9222oooo0O0o(it);
    }
}

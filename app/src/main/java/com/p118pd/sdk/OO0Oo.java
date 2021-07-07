package com.p118pd.sdk;

import java.util.Iterator;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.pd.sdk.OO0Oo */
public final class OO0Oo<T, K> implements AbstractC7873oO0OOo00<T> {
    public final O00O0OOO<T, K> OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final AbstractC7873oO0OOo00<T> f16972OooO00o;

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: com.pd.sdk.oO0OOo00<? extends T> */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: com.pd.sdk.O00O0OOO<? super T, ? extends K> */
    /* JADX WARN: Multi-variable type inference failed */
    public OO0Oo(@NotNull AbstractC7873oO0OOo00<? extends T> oo0ooo00, @NotNull O00O0OOO<? super T, ? extends K> o00o0ooo) {
        o0O0OO00.OooO0o(oo0ooo00, "source");
        o0O0OO00.OooO0o(o00o0ooo, "keySelector");
        this.f16972OooO00o = oo0ooo00;
        this.OooO00o = o00o0ooo;
    }

    @Override // com.p118pd.sdk.AbstractC7873oO0OOo00
    @NotNull
    public Iterator<T> iterator() {
        return new C7849oO0O0Ooo(this.f16972OooO00o.iterator(), this.OooO00o);
    }
}

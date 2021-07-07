package com.p118pd.sdk;

import java.util.HashSet;
import java.util.Iterator;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.pd.sdk.oO0O0Ooo  reason: case insensitive filesystem */
public final class C7849oO0O0Ooo<T, K> extends AbstractC9176oooOo<T> {
    public final O00O0OOO<T, K> OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final HashSet<K> f20904OooO00o = new HashSet<>();

    /* renamed from: OooO00o  reason: collision with other field name */
    public final Iterator<T> f20905OooO00o;

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.Iterator<? extends T> */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: com.pd.sdk.O00O0OOO<? super T, ? extends K> */
    /* JADX WARN: Multi-variable type inference failed */
    public C7849oO0O0Ooo(@NotNull Iterator<? extends T> it, @NotNull O00O0OOO<? super T, ? extends K> o00o0ooo) {
        o0O0OO00.OooO0o(it, "source");
        o0O0OO00.OooO0o(o00o0ooo, "keySelector");
        this.f20905OooO00o = it;
        this.OooO00o = o00o0ooo;
    }

    @Override // com.p118pd.sdk.AbstractC9176oooOo
    public void OooO0OO() {
        while (this.f20905OooO00o.hasNext()) {
            T next = this.f20905OooO00o.next();
            if (this.f20904OooO00o.add(this.OooO00o.invoke(next))) {
                OooO00o(next);
                return;
            }
        }
        OooO0Oo();
    }
}

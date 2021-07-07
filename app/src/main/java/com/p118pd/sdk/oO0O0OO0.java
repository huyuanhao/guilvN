package com.p118pd.sdk;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.pd.sdk.oO0O0OO0 */
public final class oO0O0OO0<T> implements AbstractC7873oO0OOo00<T> {
    public final AtomicReference<AbstractC7873oO0OOo00<T>> OooO00o;

    public oO0O0OO0(@NotNull AbstractC7873oO0OOo00<? extends T> oo0ooo00) {
        o0O0OO00.OooO0o(oo0ooo00, "sequence");
        this.OooO00o = new AtomicReference<>(oo0ooo00);
    }

    @Override // com.p118pd.sdk.AbstractC7873oO0OOo00
    @NotNull
    public Iterator<T> iterator() {
        AbstractC7873oO0OOo00<T> andSet = this.OooO00o.getAndSet(null);
        if (andSet != null) {
            return andSet.iterator();
        }
        throw new IllegalStateException("This sequence can be consumed only once.");
    }
}

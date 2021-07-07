package com.p118pd.sdk;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Result;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.pd.sdk.oO0OoO0o  reason: case insensitive filesystem */
public final class C7896oO0OoO0o<T> extends Oo0OoOO<T> implements Iterator<T>, AbstractC9282oooooO0<C9174oooOOooO>, O0OO0o {
    @Nullable
    public AbstractC9282oooooO0<? super C9174oooOOooO> OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public T f20966OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Iterator<? extends T> f20967OooO00o;
    public int o00oO0O;

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: com.pd.sdk.oooooO0<? super com.pd.sdk.oooOOooO>, com.pd.sdk.oooooO0<com.pd.sdk.oooOOooO> */
    @Nullable
    /* renamed from: OooO00o  reason: collision with other method in class */
    public final AbstractC9282oooooO0<C9174oooOOooO> m19577OooO00o() {
        return this.OooO00o;
    }

    @Override // com.p118pd.sdk.AbstractC9282oooooO0
    @NotNull
    public CoroutineContext getContext() {
        return EmptyCoroutineContext.INSTANCE;
    }

    public boolean hasNext() {
        while (true) {
            int i = this.o00oO0O;
            if (i != 0) {
                if (i == 1) {
                    Iterator<? extends T> it = this.f20967OooO00o;
                    if (it == null) {
                        o0O0OO00.OooO0o0();
                    }
                    if (it.hasNext()) {
                        this.o00oO0O = 2;
                        return true;
                    }
                    this.f20967OooO00o = null;
                } else if (i == 2 || i == 3) {
                    return true;
                } else {
                    if (i == 4) {
                        return false;
                    }
                    throw m19576OooO00o();
                }
            }
            this.o00oO0O = 5;
            AbstractC9282oooooO0<? super C9174oooOOooO> oooooo0 = this.OooO00o;
            if (oooooo0 == null) {
                o0O0OO00.OooO0o0();
            }
            this.OooO00o = null;
            C9174oooOOooO oooooooo = C9174oooOOooO.OooO00o;
            Result.OooO00o oooO00o = Result.Companion;
            oooooo0.resumeWith(Result.m22101constructorimpl(oooooooo));
        }
    }

    @Override // java.util.Iterator
    public T next() {
        int i = this.o00oO0O;
        if (i == 0 || i == 1) {
            return OooO00o();
        }
        if (i == 2) {
            this.o00oO0O = 1;
            Iterator<? extends T> it = this.f20967OooO00o;
            if (it == null) {
                o0O0OO00.OooO0o0();
            }
            return (T) it.next();
        } else if (i == 3) {
            this.o00oO0O = 0;
            T t = this.f20966OooO00o;
            this.f20966OooO00o = null;
            return t;
        } else {
            throw m19576OooO00o();
        }
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // com.p118pd.sdk.AbstractC9282oooooO0
    public void resumeWith(@NotNull Object obj) {
        C9157oooOO0Oo.m20899OooO00o(obj);
        this.o00oO0O = 4;
    }

    public final void OooO00o(@Nullable AbstractC9282oooooO0<? super C9174oooOOooO> oooooo0) {
        this.OooO00o = oooooo0;
    }

    private final T OooO00o() {
        if (hasNext()) {
            return next();
        }
        throw new NoSuchElementException();
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    private final Throwable m19576OooO00o() {
        int i = this.o00oO0O;
        if (i == 4) {
            return new NoSuchElementException();
        }
        if (i == 5) {
            return new IllegalStateException("Iterator has failed.");
        }
        return new IllegalStateException("Unexpected state of the iterator: " + this.o00oO0O);
    }

    @Override // com.p118pd.sdk.Oo0OoOO
    @Nullable
    public Object OooO00o(T t, @NotNull AbstractC9282oooooO0<? super C9174oooOOooO> oooooo0) {
        this.f20966OooO00o = t;
        this.o00oO0O = 3;
        OooO00o(oooooo0);
        Object OooO00o2 = O00000OO.OooO00o();
        if (OooO00o2 == O00000OO.OooO00o()) {
            O0000OO.OooO0O0(oooooo0);
        }
        return OooO00o2;
    }

    @Override // com.p118pd.sdk.Oo0OoOO
    @Nullable
    public Object OooO00o(@NotNull Iterator<? extends T> it, @NotNull AbstractC9282oooooO0<? super C9174oooOOooO> oooooo0) {
        if (!it.hasNext()) {
            return C9174oooOOooO.OooO00o;
        }
        this.f20967OooO00o = it;
        this.o00oO0O = 2;
        OooO00o(oooooo0);
        Object OooO00o2 = O00000OO.OooO00o();
        if (OooO00o2 == O00000OO.OooO00o()) {
            O0000OO.OooO0O0(oooooo0);
        }
        return OooO00o2;
    }
}

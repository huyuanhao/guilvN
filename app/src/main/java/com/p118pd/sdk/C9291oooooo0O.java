package com.p118pd.sdk;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.coroutines.experimental.CoroutineContext;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.pd.sdk.oooooo0O  reason: case insensitive filesystem */
public final class C9291oooooo0O<T> extends AbstractC9290oooooo0<T> implements Iterator<T>, AbstractC9285oooooOO<C9174oooOOooO>, O0OO0o {
    @Nullable
    public AbstractC9285oooooOO<? super C9174oooOOooO> OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public T f22711OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Iterator<? extends T> f22712OooO00o;
    public int o00oO0O;

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: com.pd.sdk.oooooOO<? super com.pd.sdk.oooOOooO>, com.pd.sdk.oooooOO<com.pd.sdk.oooOOooO> */
    @Nullable
    /* renamed from: OooO00o  reason: collision with other method in class */
    public final AbstractC9285oooooOO<C9174oooOOooO> m21222OooO00o() {
        return this.OooO00o;
    }

    @Override // com.p118pd.sdk.AbstractC9285oooooOO
    @NotNull
    public CoroutineContext getContext() {
        return C9289oooooOoo.OooO00o;
    }

    public boolean hasNext() {
        while (true) {
            int i = this.o00oO0O;
            if (i != 0) {
                if (i == 1) {
                    Iterator<? extends T> it = this.f22712OooO00o;
                    if (it == null) {
                        o0O0OO00.OooO0o0();
                    }
                    if (it.hasNext()) {
                        this.o00oO0O = 2;
                        return true;
                    }
                    this.f22712OooO00o = null;
                } else if (i == 2 || i == 3) {
                    return true;
                } else {
                    if (i == 4) {
                        return false;
                    }
                    throw m21221OooO00o();
                }
            }
            this.o00oO0O = 5;
            AbstractC9285oooooOO<? super C9174oooOOooO> ooooooo = this.OooO00o;
            if (ooooooo == null) {
                o0O0OO00.OooO0o0();
            }
            this.OooO00o = null;
            ooooooo.resume(C9174oooOOooO.OooO00o);
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
            Iterator<? extends T> it = this.f22712OooO00o;
            if (it == null) {
                o0O0OO00.OooO0o0();
            }
            return (T) it.next();
        } else if (i == 3) {
            this.o00oO0O = 0;
            T t = this.f22711OooO00o;
            this.f22711OooO00o = null;
            return t;
        } else {
            throw m21221OooO00o();
        }
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // com.p118pd.sdk.AbstractC9285oooooOO
    public void resumeWithException(@NotNull Throwable th) {
        o0O0OO00.OooO0o(th, "exception");
        throw th;
    }

    public final void OooO00o(@Nullable AbstractC9285oooooOO<? super C9174oooOOooO> ooooooo) {
        this.OooO00o = ooooooo;
    }

    private final T OooO00o() {
        if (hasNext()) {
            return next();
        }
        throw new NoSuchElementException();
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    private final Throwable m21221OooO00o() {
        int i = this.o00oO0O;
        if (i == 4) {
            return new NoSuchElementException();
        }
        if (i == 5) {
            return new IllegalStateException("Iterator has failed.");
        }
        return new IllegalStateException("Unexpected state of the iterator: " + this.o00oO0O);
    }

    @Override // com.p118pd.sdk.AbstractC9290oooooo0
    @Nullable
    public Object OooO00o(T t, @NotNull AbstractC9285oooooOO<? super C9174oooOOooO> ooooooo) {
        this.f22711OooO00o = t;
        this.o00oO0O = 3;
        OooO00o(C9297oooooooo.OooO00o(ooooooo));
        return C9295ooooooOo.OooO00o();
    }

    @Override // com.p118pd.sdk.AbstractC9290oooooo0
    @Nullable
    public Object OooO00o(@NotNull Iterator<? extends T> it, @NotNull AbstractC9285oooooOO<? super C9174oooOOooO> ooooooo) {
        if (!it.hasNext()) {
            return C9174oooOOooO.OooO00o;
        }
        this.f22712OooO00o = it;
        this.o00oO0O = 2;
        OooO00o(C9297oooooooo.OooO00o(ooooooo));
        return C9295ooooooOo.OooO00o();
    }

    /* renamed from: OooO00o */
    public void resume(@NotNull C9174oooOOooO oooooooo) {
        o0O0OO00.OooO0o(oooooooo, "value");
        this.o00oO0O = 4;
    }
}

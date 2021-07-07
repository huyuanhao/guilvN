package com.p118pd.sdk;

import kotlin.Result;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.pd.sdk.O0000OO0 */
public final class O0000OO0 implements AbstractC9282oooooO0<C9174oooOOooO> {
    @Nullable
    public Result<C9174oooOOooO> OooO00o;

    @Nullable
    public final Result<C9174oooOOooO> OooO00o() {
        return this.OooO00o;
    }

    @Override // com.p118pd.sdk.AbstractC9282oooooO0
    @NotNull
    public CoroutineContext getContext() {
        return EmptyCoroutineContext.INSTANCE;
    }

    @Override // com.p118pd.sdk.AbstractC9282oooooO0
    public void resumeWith(@NotNull Object obj) {
        synchronized (this) {
            this.OooO00o = Result.m22100boximpl(obj);
            notifyAll();
            C9174oooOOooO oooooooo = C9174oooOOooO.OooO00o;
        }
    }

    public final void OooO00o(@Nullable Result<C9174oooOOooO> result) {
        this.OooO00o = result;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public final void m16503OooO00o() {
        synchronized (this) {
            while (true) {
                Result<C9174oooOOooO> result = this.OooO00o;
                if (result == null) {
                    wait();
                } else {
                    C9157oooOO0Oo.m20899OooO00o(result.m22109unboximpl());
                }
            }
        }
    }
}

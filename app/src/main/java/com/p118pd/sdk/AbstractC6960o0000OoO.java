package com.p118pd.sdk;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: com.pd.sdk.o0000OoO  reason: case insensitive filesystem */
public abstract class AbstractC6960o0000OoO {
    public abstract void OooO00o(@NonNull Runnable runnable);

    public abstract boolean OooO00o();

    public void OooO0O0(@NonNull Runnable runnable) {
        if (OooO00o()) {
            runnable.run();
        } else {
            OooO0OO(runnable);
        }
    }

    public abstract void OooO0OO(@NonNull Runnable runnable);
}

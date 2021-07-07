package com.p118pd.sdk;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.annotation.IdRes;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

/* renamed from: com.pd.sdk.o00o0Ooo  reason: case insensitive filesystem */
public abstract class AbstractC7166o00o0Ooo {
    @Nullable
    public abstract View OooO00o(@IdRes int i);

    public Fragment OooO00o(Context context, String str, Bundle bundle) {
        return Fragment.instantiate(context, str, bundle);
    }

    public abstract boolean OooO00o();
}

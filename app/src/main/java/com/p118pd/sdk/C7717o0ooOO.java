package com.p118pd.sdk;

import android.annotation.SuppressLint;
import android.app.Application;
import androidx.annotation.NonNull;

/* renamed from: com.pd.sdk.o0ooOO  reason: case insensitive filesystem */
public class C7717o0ooOO extends AbstractC7216o00oo00O {
    @SuppressLint({"StaticFieldLeak"})
    public Application OooO00o;

    public C7717o0ooOO(@NonNull Application application) {
        this.OooO00o = application;
    }

    @Override // com.p118pd.sdk.AbstractC7216o00oo00O
    @NonNull
    public <T extends Application> T OooO00o() {
        return (T) this.OooO00o;
    }
}

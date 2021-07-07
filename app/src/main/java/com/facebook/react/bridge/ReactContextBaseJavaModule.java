package com.facebook.react.bridge;

import android.app.Activity;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;

public abstract class ReactContextBaseJavaModule extends BaseJavaModule {
    public final ReactApplicationContext mReactApplicationContext;

    public ReactContextBaseJavaModule(@Nonnull ReactApplicationContext reactApplicationContext) {
        this.mReactApplicationContext = reactApplicationContext;
    }

    @Nullable
    public final Activity getCurrentActivity() {
        return this.mReactApplicationContext.getCurrentActivity();
    }

    public final ReactApplicationContext getReactApplicationContext() {
        return this.mReactApplicationContext;
    }
}

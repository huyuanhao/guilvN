package com.facebook.react.bridge;

import com.facebook.proguard.annotations.DoNotStrip;
import javax.annotation.Nonnull;

@DoNotStrip
public interface NativeModule {

    public interface NativeMethod {
        String getType();

        void invoke(JSInstance jSInstance, ReadableArray readableArray);
    }

    boolean canOverrideExistingModule();

    @Nonnull
    String getName();

    void initialize();

    void onCatalystInstanceDestroy();
}

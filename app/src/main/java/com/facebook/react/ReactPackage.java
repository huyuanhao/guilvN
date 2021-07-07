package com.facebook.react;

import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.ViewManager;
import java.util.List;
import javax.annotation.Nonnull;

public interface ReactPackage {
    @Nonnull
    List<NativeModule> createNativeModules(@Nonnull ReactApplicationContext reactApplicationContext);

    @Nonnull
    List<ViewManager> createViewManagers(@Nonnull ReactApplicationContext reactApplicationContext);
}

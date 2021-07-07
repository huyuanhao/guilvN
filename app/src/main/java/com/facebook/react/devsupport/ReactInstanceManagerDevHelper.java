package com.facebook.react.devsupport;

import android.app.Activity;
import com.facebook.react.bridge.JavaJSExecutor;
import com.facebook.react.bridge.NativeDeltaClient;
import javax.annotation.Nullable;

public interface ReactInstanceManagerDevHelper {
    @Nullable
    Activity getCurrentActivity();

    void onJSBundleLoadedFromServer(@Nullable NativeDeltaClient nativeDeltaClient);

    void onReloadWithJSDebugger(JavaJSExecutor.Factory factory);

    void toggleElementInspector();
}

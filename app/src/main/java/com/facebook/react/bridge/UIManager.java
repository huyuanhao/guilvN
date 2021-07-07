package com.facebook.react.bridge;

import com.facebook.react.uimanager.common.MeasureSpecProvider;
import com.facebook.react.uimanager.common.SizeMonitoringFrameLayout;
import javax.annotation.Nullable;

public interface UIManager extends JSIModule, PerformanceCounter {
    <T extends SizeMonitoringFrameLayout & MeasureSpecProvider> int addRootView(T t, WritableMap writableMap, @Nullable String str);

    void clearJSResponder();

    void dispatchCommand(int i, int i2, @Nullable ReadableArray readableArray);

    void removeRootView(int i);

    void setJSResponder(int i, boolean z);

    void updateRootLayoutSpecs(int i, int i2, int i3);
}

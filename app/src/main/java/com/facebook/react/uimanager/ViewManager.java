package com.facebook.react.uimanager;

import android.view.View;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableNativeMap;
import com.facebook.react.touch.JSResponderHandler;
import com.facebook.react.touch.ReactInterceptingViewGroup;
import com.facebook.react.uimanager.ReactShadowNode;
import com.facebook.react.uimanager.annotations.ReactPropertyHolder;
import com.facebook.yoga.YogaMeasureMode;
import java.util.Map;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;

@ReactPropertyHolder
public abstract class ViewManager<T extends View, C extends ReactShadowNode> extends BaseJavaModule {
    public void addEventEmitters(@Nonnull ThemedReactContext themedReactContext, @Nonnull T t) {
    }

    public C createShadowNodeInstance() {
        throw new RuntimeException("ViewManager subclasses must implement createShadowNodeInstance()");
    }

    @Nonnull
    public final T createView(@Nonnull ThemedReactContext themedReactContext, JSResponderHandler jSResponderHandler) {
        T createViewInstance = createViewInstance(themedReactContext);
        addEventEmitters(themedReactContext, createViewInstance);
        if (createViewInstance instanceof ReactInterceptingViewGroup) {
            ((ReactInterceptingViewGroup) createViewInstance).setOnInterceptTouchEventListener(jSResponderHandler);
        }
        return createViewInstance;
    }

    @Nonnull
    public abstract T createViewInstance(@Nonnull ThemedReactContext themedReactContext);

    @Nullable
    public Map<String, Integer> getCommandsMap() {
        return null;
    }

    @Nullable
    public Map<String, Object> getExportedCustomBubblingEventTypeConstants() {
        return null;
    }

    @Nullable
    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        return null;
    }

    @Nullable
    public Map<String, Object> getExportedViewConstants() {
        return null;
    }

    @Override // com.facebook.react.bridge.NativeModule
    @Nonnull
    public abstract String getName();

    public Map<String, String> getNativeProps() {
        return ViewManagerPropertyUpdater.getNativeProps(getClass(), getShadowNodeClass());
    }

    public abstract Class<? extends C> getShadowNodeClass();

    public long measure(ReactContext reactContext, ReadableNativeMap readableNativeMap, ReadableNativeMap readableNativeMap2, float f, YogaMeasureMode yogaMeasureMode, float f2, YogaMeasureMode yogaMeasureMode2) {
        return 0;
    }

    public void onAfterUpdateTransaction(@Nonnull T t) {
    }

    public void onDropViewInstance(@Nonnull T t) {
    }

    public void receiveCommand(@Nonnull T t, int i, @Nullable ReadableArray readableArray) {
    }

    public abstract void updateExtraData(@Nonnull T t, Object obj);

    @Nullable
    public Object updateLocalData(@Nonnull T t, ReactStylesDiffMap reactStylesDiffMap, ReactStylesDiffMap reactStylesDiffMap2) {
        return null;
    }

    public final void updateProperties(@Nonnull T t, ReactStylesDiffMap reactStylesDiffMap) {
        ViewManagerPropertyUpdater.updateProps(this, t, reactStylesDiffMap);
        onAfterUpdateTransaction(t);
    }

    @Nonnull
    public C createShadowNodeInstance(@Nonnull ReactApplicationContext reactApplicationContext) {
        return createShadowNodeInstance();
    }
}

package com.swmansion.gesturehandler.react;

import com.facebook.react.common.MapBuilder;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.ViewGroupManager;
import com.p118pd.sdk.C9081ooOooO0o;
import com.p118pd.sdk.C9086ooOooOoo;
import com.p118pd.sdk.C9089ooOooo00;
import java.util.Map;
import javax.annotation.Nullable;

@ReactModule(name = RNGestureHandlerRootViewManager.REACT_CLASS)
public class RNGestureHandlerRootViewManager extends ViewGroupManager<C9086ooOooOoo> {
    public static final String REACT_CLASS = "GestureHandlerRootView";

    @Override // com.facebook.react.uimanager.ViewManager
    @Nullable
    public Map getExportedCustomDirectEventTypeConstants() {
        return MapBuilder.m947of(C9081ooOooO0o.f22434OooO00o, MapBuilder.m946of("registrationName", C9081ooOooO0o.f22434OooO00o), C9089ooOooo00.f22442OooO00o, MapBuilder.m946of("registrationName", C9089ooOooo00.f22442OooO00o));
    }

    @Override // com.facebook.react.bridge.NativeModule, com.facebook.react.uimanager.ViewManager
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public C9086ooOooOoo createViewInstance(ThemedReactContext themedReactContext) {
        return new C9086ooOooOoo(themedReactContext);
    }

    public void onDropViewInstance(C9086ooOooOoo oooooooo) {
        oooooooo.OooO00o();
    }
}

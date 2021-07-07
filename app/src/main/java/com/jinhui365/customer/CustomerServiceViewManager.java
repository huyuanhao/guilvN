package com.jinhui365.customer;

import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.ViewGroupManager;
import com.p118pd.sdk.C8621oo0O0ooO;
import javax.annotation.Nonnull;

public class CustomerServiceViewManager extends ViewGroupManager<C8621oo0O0ooO> {
    @Override // com.facebook.react.bridge.NativeModule, com.facebook.react.uimanager.ViewManager
    @Nonnull
    public String getName() {
        return "RNTCustomerServiceView";
    }

    @Override // com.facebook.react.uimanager.ViewManager
    @Nonnull
    public C8621oo0O0ooO createViewInstance(@Nonnull ThemedReactContext themedReactContext) {
        return new C8621oo0O0ooO(themedReactContext);
    }
}

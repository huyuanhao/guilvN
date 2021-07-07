package com.p118pd.sdk;

import com.facebook.react.ReactPackage;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.ViewManager;
import com.jinhui365.customer.CustomerServiceModule;
import com.jinhui365.customer.CustomerServiceViewManager;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.pd.sdk.oo0O0oOo  reason: case insensitive filesystem */
public class C8618oo0O0oOo implements ReactPackage {
    @Override // com.facebook.react.ReactPackage
    public List<NativeModule> createNativeModules(ReactApplicationContext reactApplicationContext) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new CustomerServiceModule(reactApplicationContext));
        return arrayList;
    }

    @Override // com.facebook.react.ReactPackage
    public List<ViewManager> createViewManagers(ReactApplicationContext reactApplicationContext) {
        return Arrays.asList(new CustomerServiceViewManager());
    }
}

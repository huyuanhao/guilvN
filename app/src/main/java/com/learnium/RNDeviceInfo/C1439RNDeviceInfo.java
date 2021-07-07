package com.learnium.RNDeviceInfo;

import com.facebook.react.ReactPackage;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.ViewManager;
import com.learnium.RNDeviceInfo.netInfo.NetInfoModule;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.learnium.RNDeviceInfo.RNDeviceInfo */
public class C1439RNDeviceInfo implements ReactPackage {
    @Override // com.facebook.react.ReactPackage
    public List<NativeModule> createNativeModules(ReactApplicationContext reactApplicationContext) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new RNDeviceModule(reactApplicationContext));
        arrayList.add(new NetInfoModule(reactApplicationContext));
        return arrayList;
    }

    @Override // com.facebook.react.ReactPackage
    public List<ViewManager> createViewManagers(ReactApplicationContext reactApplicationContext) {
        return Collections.emptyList();
    }
}

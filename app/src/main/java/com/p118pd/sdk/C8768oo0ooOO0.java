package com.p118pd.sdk;

import com.facebook.react.ReactPackage;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.ViewManager;
import com.netease.nim.p115rn.push.NIMPushModule;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: com.pd.sdk.oo0ooOO0  reason: case insensitive filesystem */
public class C8768oo0ooOO0 implements ReactPackage {
    @Override // com.facebook.react.ReactPackage
    public List<NativeModule> createNativeModules(ReactApplicationContext reactApplicationContext) {
        return Arrays.asList(new NIMPushModule(reactApplicationContext));
    }

    @Override // com.facebook.react.ReactPackage
    public List<ViewManager> createViewManagers(ReactApplicationContext reactApplicationContext) {
        return Collections.emptyList();
    }
}

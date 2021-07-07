package com.p118pd.sdk;

import androidx.annotation.StyleRes;
import com.facebook.react.ReactPackage;
import com.facebook.react.bridge.JavaScriptModule;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.ViewManager;
import com.imagepicker.C1401R;
import com.imagepicker.ImagePickerModule;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: com.pd.sdk.oo0O00o  reason: case insensitive filesystem */
public class C8595oo0O00o implements ReactPackage {
    public static final int OooO0O0 = C1401R.style.DefaultExplainingPermissionsTheme;
    @StyleRes
    public final int OooO00o;

    public C8595oo0O00o() {
        this.OooO00o = OooO0O0;
    }

    public List<Class<? extends JavaScriptModule>> OooO00o() {
        return Collections.emptyList();
    }

    @Override // com.facebook.react.ReactPackage
    public List<NativeModule> createNativeModules(ReactApplicationContext reactApplicationContext) {
        return Arrays.asList(new ImagePickerModule(reactApplicationContext, this.OooO00o));
    }

    @Override // com.facebook.react.ReactPackage
    public List<ViewManager> createViewManagers(ReactApplicationContext reactApplicationContext) {
        return Collections.emptyList();
    }

    public C8595oo0O00o(@StyleRes int i) {
        this.OooO00o = i;
    }
}

package com.reactnativecommunity.webview;

import com.facebook.react.ReactPackage;
import com.facebook.react.bridge.ReactApplicationContext;
import com.p118pd.sdk.C9201oooOooOo;
import com.p118pd.sdk.o0O0OO00;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(mo43193bv = {1, 0, 3}, mo43194d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\n"}, mo43195d2 = {"Lcom/reactnativecommunity/webview/RNCWebViewPackage;", "Lcom/facebook/react/ReactPackage;", "()V", "createNativeModules", "", "Lcom/reactnativecommunity/webview/RNCWebViewModule;", "reactContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "createViewManagers", "Lcom/reactnativecommunity/webview/RNCWebViewManager;", "react-native-webview_release"}, mo43196k = 1, mo43197mv = {1, 1, 13})
public final class RNCWebViewPackage implements ReactPackage {
    @Override // com.facebook.react.ReactPackage
    @NotNull
    public List<RNCWebViewModule> createNativeModules(@NotNull ReactApplicationContext reactApplicationContext) {
        o0O0OO00.OooO0o(reactApplicationContext, "reactContext");
        return C9201oooOooOo.OooO00o(new RNCWebViewModule(reactApplicationContext));
    }

    @Override // com.facebook.react.ReactPackage
    @NotNull
    public List<RNCWebViewManager> createViewManagers(@NotNull ReactApplicationContext reactApplicationContext) {
        o0O0OO00.OooO0o(reactApplicationContext, "reactContext");
        return C9201oooOooOo.OooO00o(new RNCWebViewManager());
    }
}

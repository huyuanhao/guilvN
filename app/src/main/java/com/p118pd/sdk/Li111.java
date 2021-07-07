package com.p118pd.sdk;

import com.facebook.react.ReactPackage;
import com.facebook.react.bridge.JavaScriptModule;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.ViewManager;
import com.lwansbrough.RCTCamera.RCTCameraModule;
import com.lwansbrough.RCTCamera.RCTCameraViewManager;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.reactnative.camera.CameraModule;
import org.reactnative.camera.CameraViewManager;
import org.reactnative.facedetector.FaceDetectorModule;

/* renamed from: com.pd.sdk.Li11丨1  reason: invalid class name */
public class Li111 implements ReactPackage {
    public List<Class<? extends JavaScriptModule>> OooO00o() {
        return Collections.emptyList();
    }

    @Override // com.facebook.react.ReactPackage
    public List<NativeModule> createNativeModules(ReactApplicationContext reactApplicationContext) {
        return Arrays.asList(new RCTCameraModule(reactApplicationContext), new CameraModule(reactApplicationContext), new FaceDetectorModule(reactApplicationContext));
    }

    @Override // com.facebook.react.ReactPackage
    public List<ViewManager> createViewManagers(ReactApplicationContext reactApplicationContext) {
        return Arrays.asList(new RCTCameraViewManager(), new CameraViewManager());
    }
}

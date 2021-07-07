package com.lwansbrough.RCTCamera;

import androidx.annotation.Nullable;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.common.MapBuilder;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.p118pd.sdk.C8747oo0oOoOo;
import java.util.ArrayList;
import java.util.Map;

public class RCTCameraViewManager extends ViewGroupManager<C8747oo0oOoOo> {
    public static final int COMMAND_START_PREVIEW = 2;
    public static final int COMMAND_STOP_PREVIEW = 1;
    public static final String REACT_CLASS = "RCTCamera";

    @Override // com.facebook.react.uimanager.ViewManager
    public Map<String, Integer> getCommandsMap() {
        return MapBuilder.m947of("stopPreview", 1, "startPreview", 2);
    }

    @Override // com.facebook.react.bridge.NativeModule, com.facebook.react.uimanager.ViewManager
    public String getName() {
        return REACT_CLASS;
    }

    @ReactProp(name = "aspect")
    public void setAspect(C8747oo0oOoOo oo0ooooo, int i) {
        oo0ooooo.setAspect(i);
    }

    @ReactProp(name = "barCodeTypes")
    public void setBarCodeTypes(C8747oo0oOoOo oo0ooooo, ReadableArray readableArray) {
        if (readableArray != null) {
            ArrayList arrayList = new ArrayList(readableArray.size());
            for (int i = 0; i < readableArray.size(); i++) {
                arrayList.add(readableArray.getString(i));
            }
            oo0ooooo.setBarCodeTypes(arrayList);
        }
    }

    @ReactProp(name = "barcodeScannerEnabled")
    public void setBarcodeScannerEnabled(C8747oo0oOoOo oo0ooooo, boolean z) {
        oo0ooooo.setBarcodeScannerEnabled(z);
    }

    @ReactProp(name = "captureAudio")
    public void setCaptureAudio(C8747oo0oOoOo oo0ooooo, boolean z) {
    }

    @ReactProp(name = "captureMode")
    public void setCaptureMode(C8747oo0oOoOo oo0ooooo, int i) {
        oo0ooooo.setCaptureMode(i);
    }

    @ReactProp(name = "captureQuality")
    public void setCaptureQuality(C8747oo0oOoOo oo0ooooo, String str) {
        oo0ooooo.setCaptureQuality(str);
    }

    @ReactProp(name = "captureTarget")
    public void setCaptureTarget(C8747oo0oOoOo oo0ooooo, int i) {
    }

    @ReactProp(name = "clearWindowBackground")
    public void setClearWindowBackground(C8747oo0oOoOo oo0ooooo, boolean z) {
        oo0ooooo.setClearWindowBackground(z);
    }

    @ReactProp(name = "flashMode")
    public void setFlashMode(C8747oo0oOoOo oo0ooooo, int i) {
        oo0ooooo.setFlashMode(i);
    }

    @ReactProp(name = "orientation")
    public void setOrientation(C8747oo0oOoOo oo0ooooo, int i) {
        oo0ooooo.setOrientation(i);
    }

    @ReactProp(name = "torchMode")
    public void setTorchMode(C8747oo0oOoOo oo0ooooo, int i) {
        oo0ooooo.setTorchMode(i);
    }

    @ReactProp(name = "type")
    public void setType(C8747oo0oOoOo oo0ooooo, int i) {
        oo0ooooo.setCameraType(i);
    }

    @ReactProp(name = "zoom")
    public void setZoom(C8747oo0oOoOo oo0ooooo, int i) {
        oo0ooooo.setZoom(i);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public C8747oo0oOoOo createViewInstance(ThemedReactContext themedReactContext) {
        return new C8747oo0oOoOo(themedReactContext);
    }

    public void receiveCommand(C8747oo0oOoOo oo0ooooo, int i, @Nullable ReadableArray readableArray) {
        if (oo0ooooo == null) {
            throw new AssertionError();
        } else if (i == 1) {
            oo0ooooo.OooO0O0();
        } else if (i == 2) {
            oo0ooooo.OooO00o();
        } else {
            throw new IllegalArgumentException(String.format("Unsupported command %d received by %s.", Integer.valueOf(i), RCTCameraViewManager.class.getSimpleName()));
        }
    }
}

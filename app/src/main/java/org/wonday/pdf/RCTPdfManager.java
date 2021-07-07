package org.wonday.pdf;

import android.content.Context;
import android.view.View;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.p118pd.sdk.C5348IiIL1l;
import com.swmansion.gesturehandler.react.RNGestureHandlerModule;

public class RCTPdfManager extends SimpleViewManager<C5348IiIL1l> {
    public static final String REACT_CLASS = "RCTPdf";
    public Context context;
    public C5348IiIL1l pdfView;

    public RCTPdfManager(ReactApplicationContext reactApplicationContext) {
        this.context = reactApplicationContext;
    }

    @Override // com.facebook.react.bridge.NativeModule, com.facebook.react.uimanager.ViewManager
    public String getName() {
        return REACT_CLASS;
    }

    public void onDropViewInstance(C5348IiIL1l iiIL1l) {
    }

    @ReactProp(name = "enableAnnotationRendering")
    public void setEnableAnnotationRendering(C5348IiIL1l iiIL1l, boolean z) {
        iiIL1l.setEnableAnnotationRendering(z);
    }

    @ReactProp(name = "enableAntialiasing")
    public void setEnableAntialiasing(C5348IiIL1l iiIL1l, boolean z) {
        iiIL1l.setEnableAntialiasing(z);
    }

    @ReactProp(name = "enablePaging")
    public void setEnablePaging(C5348IiIL1l iiIL1l, boolean z) {
        iiIL1l.setEnablePaging(z);
    }

    @ReactProp(name = "fitPolicy")
    public void setFitPolycy(C5348IiIL1l iiIL1l, int i) {
        iiIL1l.setFitPolicy(i);
    }

    @ReactProp(name = RNGestureHandlerModule.KEY_HIT_SLOP_HORIZONTAL)
    public void setHorizontal(C5348IiIL1l iiIL1l, boolean z) {
        iiIL1l.setHorizontal(z);
    }

    @ReactProp(name = "maxScale")
    public void setMaxScale(C5348IiIL1l iiIL1l, float f) {
        iiIL1l.setMaxScale(f);
    }

    @ReactProp(name = "minScale")
    public void setMinScale(C5348IiIL1l iiIL1l, float f) {
        iiIL1l.setMinScale(f);
    }

    @ReactProp(name = "page")
    public void setPage(C5348IiIL1l iiIL1l, int i) {
        iiIL1l.setPage(i);
    }

    @ReactProp(name = "password")
    public void setPassword(C5348IiIL1l iiIL1l, String str) {
        iiIL1l.setPassword(str);
    }

    @ReactProp(name = "path")
    public void setPath(C5348IiIL1l iiIL1l, String str) {
        iiIL1l.setPath(str);
    }

    @ReactProp(name = "scale")
    public void setScale(C5348IiIL1l iiIL1l, float f) {
        iiIL1l.setScale(f);
    }

    @ReactProp(name = "spacing")
    public void setSpacing(C5348IiIL1l iiIL1l, int i) {
        iiIL1l.setSpacing(i);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public C5348IiIL1l createViewInstance(ThemedReactContext themedReactContext) {
        C5348IiIL1l iiIL1l = new C5348IiIL1l(themedReactContext, null);
        this.pdfView = iiIL1l;
        return iiIL1l;
    }

    public void onAfterUpdateTransaction(C5348IiIL1l iiIL1l) {
        super.onAfterUpdateTransaction((View) iiIL1l);
        iiIL1l.OooO();
    }
}

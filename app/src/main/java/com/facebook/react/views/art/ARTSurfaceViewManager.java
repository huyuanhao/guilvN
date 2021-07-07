package com.facebook.react.views.art;

import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.yoga.YogaMeasureFunction;
import com.facebook.yoga.YogaMeasureMode;
import com.facebook.yoga.YogaNode;

@ReactModule(name = ARTSurfaceViewManager.REACT_CLASS)
public class ARTSurfaceViewManager extends BaseViewManager<ARTSurfaceView, ARTSurfaceViewShadowNode> {
    public static final YogaMeasureFunction MEASURE_FUNCTION = new YogaMeasureFunction() {
        /* class com.facebook.react.views.art.ARTSurfaceViewManager.C08631 */

        @Override // com.facebook.yoga.YogaMeasureFunction
        public long measure(YogaNode yogaNode, float f, YogaMeasureMode yogaMeasureMode, float f2, YogaMeasureMode yogaMeasureMode2) {
            throw new IllegalStateException("SurfaceView should have explicit width and height set");
        }
    };
    public static final String REACT_CLASS = "ARTSurfaceView";

    @Override // com.facebook.react.bridge.NativeModule, com.facebook.react.uimanager.ViewManager
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Class<ARTSurfaceViewShadowNode> getShadowNodeClass() {
        return ARTSurfaceViewShadowNode.class;
    }

    public void setBackgroundColor(ARTSurfaceView aRTSurfaceView, int i) {
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public ARTSurfaceViewShadowNode createShadowNodeInstance() {
        ARTSurfaceViewShadowNode aRTSurfaceViewShadowNode = new ARTSurfaceViewShadowNode();
        aRTSurfaceViewShadowNode.setMeasureFunction(MEASURE_FUNCTION);
        return aRTSurfaceViewShadowNode;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public ARTSurfaceView createViewInstance(ThemedReactContext themedReactContext) {
        return new ARTSurfaceView(themedReactContext);
    }

    public void updateExtraData(ARTSurfaceView aRTSurfaceView, Object obj) {
        aRTSurfaceView.setSurfaceTextureListener((ARTSurfaceViewShadowNode) obj);
    }
}

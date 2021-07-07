package com.github.wuxudong.rncharts.charts;

import com.facebook.imagepipeline.producers.ResizeAndRotateProducer;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.RadarEntry;
import com.p118pd.sdk.AbstractC8194oOOo0OoO;
import com.p118pd.sdk.AbstractC8385oOoOoo0O;
import com.p118pd.sdk.C8196oOOo0o;
import com.p118pd.sdk.C8366oOoOo0OO;
import com.p118pd.sdk.C8472oOooo0oo;
import com.p118pd.sdk.C8935ooOOO0oo;

public class RadarChartManager extends YAxisChartBase<C8196oOOo0o, RadarEntry> {
    @Override // com.github.wuxudong.rncharts.charts.ChartBaseManager
    public AbstractC8385oOoOoo0O getDataExtract() {
        return new C8935ooOOO0oo();
    }

    @Override // com.facebook.react.bridge.NativeModule, com.facebook.react.uimanager.ViewManager
    public String getName() {
        return "RNRadarChart";
    }

    @ReactProp(name = "drawWeb")
    public void setDrawWeb(C8196oOOo0o oooo0o, boolean z) {
        oooo0o.setDrawWeb(z);
    }

    @ReactProp(name = "minOffset")
    public void setMinOffset(C8196oOOo0o oooo0o, float f) {
        oooo0o.setMinOffset(f);
    }

    @ReactProp(name = ResizeAndRotateProducer.ROTATION_ANGLE_KEY)
    public void setRotationAngle(C8196oOOo0o oooo0o, float f) {
        oooo0o.setRotationAngle(f);
    }

    @ReactProp(name = "rotationEnabled")
    public void setRotationEnabled(C8196oOOo0o oooo0o, boolean z) {
        oooo0o.setRotationEnabled(z);
    }

    @ReactProp(name = "skipWebLineCount")
    public void setSkipWebLineCount(C8196oOOo0o oooo0o, int i) {
        oooo0o.setSkipWebLineCount(i);
    }

    @ReactProp(name = "webAlpha")
    public void setWebAlpha(C8196oOOo0o oooo0o, int i) {
        oooo0o.setWebAlpha(i);
    }

    @ReactProp(name = "webColor")
    public void setWebColor(C8196oOOo0o oooo0o, int i) {
        oooo0o.setWebColor(i);
    }

    @ReactProp(name = "webColorInner")
    public void setWebColorInner(C8196oOOo0o oooo0o, int i) {
        oooo0o.setWebColorInner(i);
    }

    @ReactProp(name = "webLineWidth")
    public void setWebLineWidth(C8196oOOo0o oooo0o, float f) {
        oooo0o.setWebLineWidth(f);
    }

    @ReactProp(name = "webLineWidthInner")
    public void setWebLineWidthInner(C8196oOOo0o oooo0o, float f) {
        oooo0o.setWebLineWidthInner(f);
    }

    @Override // com.github.wuxudong.rncharts.charts.YAxisChartBase
    public void setYAxis(AbstractC8194oOOo0OoO oooo0ooo, ReadableMap readableMap) {
        YAxis yAxis = ((C8196oOOo0o) oooo0ooo).getYAxis();
        setCommonAxisConfig(oooo0ooo, yAxis, readableMap);
        setYAxisConfig(yAxis, readableMap);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public C8196oOOo0o createViewInstance(ThemedReactContext themedReactContext) {
        C8196oOOo0o oooo0o = new C8196oOOo0o(themedReactContext);
        oooo0o.setOnChartValueSelectedListener(new C8366oOoOo0OO(oooo0o));
        oooo0o.setOnChartGestureListener(new C8472oOooo0oo(oooo0o));
        return oooo0o;
    }
}

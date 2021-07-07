package com.github.wuxudong.rncharts.charts;

import com.facebook.imagepipeline.producers.ResizeAndRotateProducer;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.github.mikephil.charting.data.PieEntry;
import com.p118pd.sdk.AbstractC8385oOoOoo0O;
import com.p118pd.sdk.C8198oOOo0o0O;
import com.p118pd.sdk.C8364oOoOo0O;
import com.p118pd.sdk.C8366oOoOo0OO;
import com.p118pd.sdk.C8368oOoOo0o0;
import com.p118pd.sdk.C8472oOooo0oo;
import com.qiyukf.unicorn.api.msg.attachment.FileAttachment;

public class PieChartManager extends ChartBaseManager<C8198oOOo0o0O, PieEntry> {
    @Override // com.github.wuxudong.rncharts.charts.ChartBaseManager
    public AbstractC8385oOoOoo0O getDataExtract() {
        return new C8364oOoOo0O();
    }

    @Override // com.facebook.react.bridge.NativeModule, com.facebook.react.uimanager.ViewManager
    public String getName() {
        return "RNPieChart";
    }

    @ReactProp(name = "centerText")
    public void setCenterText(C8198oOOo0o0O oooo0o0o, String str) {
        oooo0o0o.setCenterText(str);
    }

    @ReactProp(name = "centerTextRadiusPercent")
    public void setCenterTextRadiusPercent(C8198oOOo0o0O oooo0o0o, float f) {
        oooo0o0o.setCenterTextRadiusPercent(f);
    }

    @ReactProp(name = "drawEntryLabels")
    public void setDrawEntryLabels(C8198oOOo0o0O oooo0o0o, boolean z) {
        oooo0o0o.setDrawEntryLabels(z);
    }

    @ReactProp(name = "entryLabelColor")
    public void setEntryLabelColor(C8198oOOo0o0O oooo0o0o, Integer num) {
        oooo0o0o.setEntryLabelColor(num.intValue());
    }

    @ReactProp(name = "entryLabelTextSize")
    public void setEntryLabelTextSize(C8198oOOo0o0O oooo0o0o, float f) {
        oooo0o0o.setEntryLabelTextSize(f);
    }

    @ReactProp(name = "holeColor")
    public void setHoleColor(C8198oOOo0o0O oooo0o0o, Integer num) {
        oooo0o0o.setHoleColor(num.intValue());
    }

    @ReactProp(name = "holeRadius")
    public void setHoleRadius(C8198oOOo0o0O oooo0o0o, float f) {
        oooo0o0o.setHoleRadius(f);
    }

    @ReactProp(name = "maxAngle")
    public void setMaxAngle(C8198oOOo0o0O oooo0o0o, float f) {
        oooo0o0o.setMaxAngle(f);
    }

    @ReactProp(name = ResizeAndRotateProducer.ROTATION_ANGLE_KEY)
    public void setRotationAngle(C8198oOOo0o0O oooo0o0o, float f) {
        oooo0o0o.setRotationAngle(f);
    }

    @ReactProp(name = "rotationEnabled")
    public void setRotationEnabled(C8198oOOo0o0O oooo0o0o, boolean z) {
        oooo0o0o.setRotationEnabled(z);
    }

    @ReactProp(name = "styledCenterText")
    public void setStyledCenterText(C8198oOOo0o0O oooo0o0o, ReadableMap readableMap) {
        if (C8368oOoOo0o0.OooO00o(readableMap, ReadableType.String, "text")) {
            oooo0o0o.setCenterText(readableMap.getString("text"));
        } else {
            oooo0o0o.setCenterText("");
        }
        if (C8368oOoOo0o0.OooO00o(readableMap, ReadableType.Number, ViewProps.COLOR)) {
            oooo0o0o.setCenterTextColor(readableMap.getInt(ViewProps.COLOR));
        }
        if (C8368oOoOo0o0.OooO00o(readableMap, ReadableType.Number, FileAttachment.KEY_SIZE)) {
            oooo0o0o.setCenterTextSize((float) readableMap.getDouble(FileAttachment.KEY_SIZE));
        }
    }

    @ReactProp(name = "transparentCircleColor")
    public void setTransparentCircleColor(C8198oOOo0o0O oooo0o0o, Integer num) {
        oooo0o0o.setTransparentCircleColor(num.intValue());
    }

    @ReactProp(name = "transparentCircleRadius")
    public void setTransparentCircleRadius(C8198oOOo0o0O oooo0o0o, float f) {
        oooo0o0o.setTransparentCircleRadius(f);
    }

    @ReactProp(name = "usePercentValues")
    public void setUsePercentValues(C8198oOOo0o0O oooo0o0o, boolean z) {
        oooo0o0o.setUsePercentValues(z);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public C8198oOOo0o0O createViewInstance(ThemedReactContext themedReactContext) {
        C8198oOOo0o0O oooo0o0o = new C8198oOOo0o0O(themedReactContext);
        oooo0o0o.setOnChartValueSelectedListener(new C8366oOoOo0OO(oooo0o0o));
        oooo0o0o.setOnChartGestureListener(new C8472oOooo0oo(oooo0o0o));
        return oooo0o0o;
    }
}

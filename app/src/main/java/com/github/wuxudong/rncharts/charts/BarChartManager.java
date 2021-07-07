package com.github.wuxudong.rncharts.charts;

import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.github.mikephil.charting.data.BarEntry;
import com.p118pd.sdk.AbstractC8385oOoOoo0O;
import com.p118pd.sdk.C8190oOOo0OOO;
import com.p118pd.sdk.C8362oOoOo000;
import com.p118pd.sdk.C8366oOoOo0OO;
import com.p118pd.sdk.C8472oOooo0oo;

public class BarChartManager extends BarLineChartBaseManager<C8190oOOo0OOO, BarEntry> {
    @Override // com.github.wuxudong.rncharts.charts.ChartBaseManager
    public AbstractC8385oOoOoo0O getDataExtract() {
        return new C8362oOoOo000();
    }

    @Override // com.facebook.react.bridge.NativeModule, com.facebook.react.uimanager.ViewManager
    public String getName() {
        return "RNBarChart";
    }

    @ReactProp(name = "drawBarShadow")
    public void setDrawBarShadow(C8190oOOo0OOO oooo0ooo, boolean z) {
        oooo0ooo.setDrawBarShadow(z);
    }

    @ReactProp(name = "drawValueAboveBar")
    public void setDrawValueAboveBar(C8190oOOo0OOO oooo0ooo, boolean z) {
        oooo0ooo.setDrawValueAboveBar(z);
    }

    @ReactProp(name = "highlightFullBarEnabled")
    public void setHighlightFullBarEnabled(C8190oOOo0OOO oooo0ooo, boolean z) {
        oooo0ooo.setHighlightFullBarEnabled(z);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public C8190oOOo0OOO createViewInstance(ThemedReactContext themedReactContext) {
        C8190oOOo0OOO oooo0ooo = new C8190oOOo0OOO(themedReactContext);
        oooo0ooo.setOnChartValueSelectedListener(new C8366oOoOo0OO(oooo0ooo));
        oooo0ooo.setOnChartGestureListener(new C8472oOooo0oo(oooo0ooo));
        return oooo0ooo;
    }
}

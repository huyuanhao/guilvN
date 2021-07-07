package com.github.wuxudong.rncharts.charts;

import com.facebook.react.uimanager.ThemedReactContext;
import com.p118pd.sdk.C8190oOOo0OOO;
import com.p118pd.sdk.C8195oOOo0Ooo;
import com.p118pd.sdk.C8366oOoOo0OO;
import com.p118pd.sdk.C8472oOooo0oo;

public class HorizontalBarChartManager extends BarChartManager {
    @Override // com.github.wuxudong.rncharts.charts.BarChartManager, com.facebook.react.bridge.NativeModule, com.facebook.react.uimanager.ViewManager
    public String getName() {
        return "RNHorizontalBarChart";
    }

    @Override // com.github.wuxudong.rncharts.charts.BarChartManager, com.github.wuxudong.rncharts.charts.BarChartManager, com.facebook.react.uimanager.ViewManager
    public C8190oOOo0OOO createViewInstance(ThemedReactContext themedReactContext) {
        C8195oOOo0Ooo oooo0ooo = new C8195oOOo0Ooo(themedReactContext);
        oooo0ooo.setOnChartValueSelectedListener(new C8366oOoOo0OO(oooo0ooo));
        oooo0ooo.setOnChartGestureListener(new C8472oOooo0oo(oooo0ooo));
        return oooo0ooo;
    }
}

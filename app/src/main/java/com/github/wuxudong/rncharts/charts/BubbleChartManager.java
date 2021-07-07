package com.github.wuxudong.rncharts.charts;

import com.facebook.react.uimanager.ThemedReactContext;
import com.github.mikephil.charting.data.BubbleEntry;
import com.p118pd.sdk.AbstractC8385oOoOoo0O;
import com.p118pd.sdk.C8193oOOo0Oo0;
import com.p118pd.sdk.C8361oOoOo00;
import com.p118pd.sdk.C8366oOoOo0OO;
import com.p118pd.sdk.C8472oOooo0oo;

public class BubbleChartManager extends BarLineChartBaseManager<C8193oOOo0Oo0, BubbleEntry> {
    @Override // com.github.wuxudong.rncharts.charts.ChartBaseManager
    public AbstractC8385oOoOoo0O getDataExtract() {
        return new C8361oOoOo00();
    }

    @Override // com.facebook.react.bridge.NativeModule, com.facebook.react.uimanager.ViewManager
    public String getName() {
        return "RNBubbleChart";
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public C8193oOOo0Oo0 createViewInstance(ThemedReactContext themedReactContext) {
        C8193oOOo0Oo0 oooo0oo0 = new C8193oOOo0Oo0(themedReactContext);
        oooo0oo0.setOnChartValueSelectedListener(new C8366oOoOo0OO(oooo0oo0));
        oooo0oo0.setOnChartGestureListener(new C8472oOooo0oo(oooo0oo0));
        return oooo0oo0;
    }
}

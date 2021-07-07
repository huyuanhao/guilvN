package com.github.wuxudong.rncharts.charts;

import com.facebook.react.uimanager.ThemedReactContext;
import com.github.mikephil.charting.charts.ScatterChart;
import com.github.mikephil.charting.data.Entry;
import com.p118pd.sdk.AbstractC8385oOoOoo0O;
import com.p118pd.sdk.C8366oOoOo0OO;
import com.p118pd.sdk.C8468oOooo0Oo;
import com.p118pd.sdk.C8472oOooo0oo;

public class ScatterChartManager extends BarLineChartBaseManager<ScatterChart, Entry> {
    @Override // com.github.wuxudong.rncharts.charts.ChartBaseManager
    public AbstractC8385oOoOoo0O getDataExtract() {
        return new C8468oOooo0Oo();
    }

    @Override // com.facebook.react.bridge.NativeModule, com.facebook.react.uimanager.ViewManager
    public String getName() {
        return "RNScatterChart";
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public ScatterChart createViewInstance(ThemedReactContext themedReactContext) {
        ScatterChart scatterChart = new ScatterChart(themedReactContext);
        scatterChart.setOnChartValueSelectedListener(new C8366oOoOo0OO(scatterChart));
        scatterChart.setOnChartGestureListener(new C8472oOooo0oo(scatterChart));
        return scatterChart;
    }
}

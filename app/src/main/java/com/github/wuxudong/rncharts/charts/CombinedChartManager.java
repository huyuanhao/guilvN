package com.github.wuxudong.rncharts.charts;

import com.facebook.react.uimanager.ThemedReactContext;
import com.github.mikephil.charting.charts.CombinedChart;
import com.github.mikephil.charting.data.Entry;
import com.p118pd.sdk.AbstractC8385oOoOoo0O;
import com.p118pd.sdk.C8360oOoOo0;
import com.p118pd.sdk.C8366oOoOo0OO;
import com.p118pd.sdk.C8472oOooo0oo;

public class CombinedChartManager extends BarLineChartBaseManager<CombinedChart, Entry> {
    @Override // com.github.wuxudong.rncharts.charts.ChartBaseManager
    public AbstractC8385oOoOoo0O getDataExtract() {
        return new C8360oOoOo0();
    }

    @Override // com.facebook.react.bridge.NativeModule, com.facebook.react.uimanager.ViewManager
    public String getName() {
        return "RNCombinedChart";
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public CombinedChart createViewInstance(ThemedReactContext themedReactContext) {
        CombinedChart combinedChart = new CombinedChart(themedReactContext);
        combinedChart.setOnChartValueSelectedListener(new C8366oOoOo0OO(combinedChart));
        combinedChart.setOnChartGestureListener(new C8472oOooo0oo(combinedChart));
        return combinedChart;
    }
}

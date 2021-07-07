package com.github.wuxudong.rncharts.charts;

import com.facebook.react.uimanager.ThemedReactContext;
import com.github.mikephil.charting.data.Entry;
import com.p118pd.sdk.AbstractC8385oOoOoo0O;
import com.p118pd.sdk.C8197oOOo0o0;
import com.p118pd.sdk.C8365oOoOo0O0;
import com.p118pd.sdk.C8366oOoOo0OO;
import com.p118pd.sdk.C8472oOooo0oo;

public class LineChartManager extends BarLineChartBaseManager<C8197oOOo0o0, Entry> {
    @Override // com.github.wuxudong.rncharts.charts.ChartBaseManager
    public AbstractC8385oOoOoo0O getDataExtract() {
        return new C8365oOoOo0O0();
    }

    @Override // com.facebook.react.bridge.NativeModule, com.facebook.react.uimanager.ViewManager
    public String getName() {
        return "RNLineChart";
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public C8197oOOo0o0 createViewInstance(ThemedReactContext themedReactContext) {
        C8197oOOo0o0 oooo0o0 = new C8197oOOo0o0(themedReactContext);
        oooo0o0.setOnChartValueSelectedListener(new C8366oOoOo0OO(oooo0o0));
        oooo0o0.setOnChartGestureListener(new C8472oOooo0oo(oooo0o0));
        return oooo0o0;
    }
}

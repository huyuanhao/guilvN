package com.github.wuxudong.rncharts.charts;

import com.facebook.react.uimanager.ThemedReactContext;
import com.github.mikephil.charting.data.CandleEntry;
import com.p118pd.sdk.AbstractC8385oOoOoo0O;
import com.p118pd.sdk.C8192oOOo0Oo;
import com.p118pd.sdk.C8363oOoOo00O;
import com.p118pd.sdk.C8366oOoOo0OO;
import com.p118pd.sdk.C8472oOooo0oo;

public class CandleStickChartManager extends BarLineChartBaseManager<C8192oOOo0Oo, CandleEntry> {
    @Override // com.github.wuxudong.rncharts.charts.ChartBaseManager
    public AbstractC8385oOoOoo0O getDataExtract() {
        return new C8363oOoOo00O();
    }

    @Override // com.facebook.react.bridge.NativeModule, com.facebook.react.uimanager.ViewManager
    public String getName() {
        return "RNCandleStickChart";
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public C8192oOOo0Oo createViewInstance(ThemedReactContext themedReactContext) {
        C8192oOOo0Oo oooo0oo = new C8192oOOo0Oo(themedReactContext);
        oooo0oo.setOnChartValueSelectedListener(new C8366oOoOo0OO(oooo0oo));
        oooo0oo.setOnChartGestureListener(new C8472oOooo0oo(oooo0oo));
        return oooo0oo;
    }
}

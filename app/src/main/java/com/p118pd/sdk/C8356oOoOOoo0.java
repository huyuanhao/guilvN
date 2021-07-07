package com.p118pd.sdk;

import com.facebook.react.ReactPackage;
import com.facebook.react.bridge.JavaScriptModule;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.ViewManager;
import com.github.wuxudong.rncharts.charts.BarChartManager;
import com.github.wuxudong.rncharts.charts.BubbleChartManager;
import com.github.wuxudong.rncharts.charts.CandleStickChartManager;
import com.github.wuxudong.rncharts.charts.CombinedChartManager;
import com.github.wuxudong.rncharts.charts.HorizontalBarChartManager;
import com.github.wuxudong.rncharts.charts.LineChartManager;
import com.github.wuxudong.rncharts.charts.PieChartManager;
import com.github.wuxudong.rncharts.charts.RadarChartManager;
import com.github.wuxudong.rncharts.charts.ScatterChartManager;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: com.pd.sdk.oOoOOoo0  reason: case insensitive filesystem */
public class C8356oOoOOoo0 implements ReactPackage {
    public List<Class<? extends JavaScriptModule>> OooO00o() {
        return Collections.emptyList();
    }

    @Override // com.facebook.react.ReactPackage
    public List<NativeModule> createNativeModules(ReactApplicationContext reactApplicationContext) {
        return Arrays.asList(new NativeModule[0]);
    }

    @Override // com.facebook.react.ReactPackage
    public List<ViewManager> createViewManagers(ReactApplicationContext reactApplicationContext) {
        return Arrays.asList(new BarChartManager(), new HorizontalBarChartManager(), new BubbleChartManager(), new CandleStickChartManager(), new LineChartManager(), new PieChartManager(), new RadarChartManager(), new ScatterChartManager(), new CombinedChartManager());
    }
}

package com.github.wuxudong.rncharts.charts;

import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.Entry;
import com.p118pd.sdk.AbstractC8194oOOo0OoO;
import com.p118pd.sdk.C8368oOoOo0o0;

public abstract class YAxisChartBase<T extends AbstractC8194oOOo0OoO, U extends Entry> extends ChartBaseManager<T, U> {
    @ReactProp(name = "yAxis")
    public abstract void setYAxis(AbstractC8194oOOo0OoO oooo0ooo, ReadableMap readableMap);

    public void setYAxisConfig(YAxis yAxis, ReadableMap readableMap) {
        if (C8368oOoOo0o0.OooO00o(readableMap, ReadableType.Boolean, "inverted")) {
            yAxis.OooOO0(readableMap.getBoolean("inverted"));
        }
        if (C8368oOoOo0o0.OooO00o(readableMap, ReadableType.Number, "spaceTop")) {
            yAxis.OooOOOo((float) readableMap.getDouble("spaceTop"));
        }
        if (C8368oOoOo0o0.OooO00o(readableMap, ReadableType.Number, "spaceBottom")) {
            yAxis.OooOOOO((float) readableMap.getDouble("spaceBottom"));
        }
        if (C8368oOoOo0o0.OooO00o(readableMap, ReadableType.String, "position")) {
            yAxis.OooO00o(YAxis.YAxisLabelPosition.valueOf(readableMap.getString("position")));
        }
        if (C8368oOoOo0o0.OooO00o(readableMap, ReadableType.Map, "zeroLine")) {
            ReadableMap map = readableMap.getMap("zeroLine");
            if (C8368oOoOo0o0.OooO00o(map, ReadableType.Boolean, "enabled")) {
                yAxis.OooO(map.getBoolean("enabled"));
            }
            if (C8368oOoOo0o0.OooO00o(map, ReadableType.Number, "lineWidth")) {
                yAxis.OooOOo0((float) map.getDouble("lineWidth"));
            }
            if (C8368oOoOo0o0.OooO00o(map, ReadableType.Number, "lineColor")) {
                yAxis.OooO0o0(map.getInt("lineColor"));
            }
        }
    }
}

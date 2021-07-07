package com.github.wuxudong.rncharts.charts;

import android.content.res.ColorStateList;
import android.os.Build;
import android.view.View;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.modules.datepicker.DatePickerDialogModule;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.views.text.FontMetricsUtil;
import com.github.mikephil.charting.animation.Easing;
import com.github.mikephil.charting.components.Legend;
import com.github.mikephil.charting.components.LimitLine;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.data.Entry;
import com.p118pd.sdk.AbstractC8194oOOo0OoO;
import com.p118pd.sdk.AbstractC8201oOOo0oO0;
import com.p118pd.sdk.AbstractC8385oOoOoo0O;
import com.p118pd.sdk.C7485o0OoO0o0;
import com.p118pd.sdk.C8202oOOo0oOO;
import com.p118pd.sdk.C8204oOOo0oo0;
import com.p118pd.sdk.C8236oOOoo0;
import com.p118pd.sdk.C8240oOOoo00o;
import com.p118pd.sdk.C8242oOOoo0O0;
import com.p118pd.sdk.C8246oOOoo0oO;
import com.p118pd.sdk.C8355oOoOOoo;
import com.p118pd.sdk.C8357oOoOOooO;
import com.p118pd.sdk.C8359oOoOo;
import com.p118pd.sdk.C8368oOoOo0o0;
import com.p118pd.sdk.C8933ooOOO0o0;
import com.p118pd.sdk.ExecutorServiceC7746o0oooOO;
import com.swmansion.gesturehandler.react.RNGestureHandlerModule;
import java.util.ArrayList;
import java.util.Locale;

public abstract class ChartBaseManager<T extends AbstractC8194oOOo0OoO, U extends Entry> extends SimpleViewManager<T> {
    public static final int CENTER_VIEW_TO = 4;
    public static final int CENTER_VIEW_TO_ANIMATED = 6;
    public static final int FIT_SCREEN = 7;
    public static final int HIGHLIGHTS = 8;
    public static final int MOVE_VIEW_TO = 1;
    public static final int MOVE_VIEW_TO_ANIMATED = 3;
    public static final int MOVE_VIEW_TO_X = 2;

    public abstract AbstractC8385oOoOoo0O getDataExtract();

    @ReactProp(name = ExecutorServiceC7746o0oooOO.o0OO00O)
    public void setAnimation(AbstractC8194oOOo0OoO oooo0ooo, ReadableMap readableMap) {
        Easing.EasingOption easingOption = Easing.EasingOption.Linear;
        Integer num = null;
        Integer valueOf = C8368oOoOo0o0.OooO00o(readableMap, ReadableType.Number, "durationX") ? Integer.valueOf(readableMap.getInt("durationX")) : null;
        if (C8368oOoOo0o0.OooO00o(readableMap, ReadableType.Number, "durationY")) {
            num = Integer.valueOf(readableMap.getInt("durationY"));
        }
        Easing.EasingOption valueOf2 = C8368oOoOo0o0.OooO00o(readableMap, ReadableType.String, "easingX") ? Easing.EasingOption.valueOf(readableMap.getString("easingX")) : easingOption;
        if (C8368oOoOo0o0.OooO00o(readableMap, ReadableType.String, "easingY")) {
            easingOption = Easing.EasingOption.valueOf(readableMap.getString("easingY"));
        }
        if (valueOf != null && num != null) {
            oooo0ooo.OooO00o(valueOf.intValue(), num.intValue(), valueOf2, easingOption);
        } else if (valueOf != null) {
            oooo0ooo.OooO00o(valueOf.intValue(), valueOf2);
        } else if (num != null) {
            oooo0ooo.OooO0O0(num.intValue(), easingOption);
        }
    }

    @ReactProp(name = "chartBackgroundColor")
    public void setChartBackgroundColor(AbstractC8194oOOo0OoO oooo0ooo, Integer num) {
        oooo0ooo.setBackgroundColor(num.intValue());
    }

    @ReactProp(name = "chartDescription")
    public void setChartDescription(AbstractC8194oOOo0OoO oooo0ooo, ReadableMap readableMap) {
        C8202oOOo0oOO oooo0ooo2 = new C8202oOOo0oOO();
        if (C8368oOoOo0o0.OooO00o(readableMap, ReadableType.String, "text")) {
            oooo0ooo2.OooO00o(readableMap.getString("text"));
        }
        if (C8368oOoOo0o0.OooO00o(readableMap, ReadableType.Number, "textColor")) {
            oooo0ooo2.OooO00o(readableMap.getInt("textColor"));
        }
        if (C8368oOoOo0o0.OooO00o(readableMap, ReadableType.Number, "textSize")) {
            oooo0ooo2.OooO00o((float) readableMap.getDouble("textSize"));
        }
        if (C8368oOoOo0o0.OooO00o(readableMap, ReadableType.Number, "positionX") && C8368oOoOo0o0.OooO00o(readableMap, ReadableType.Number, "positionY")) {
            oooo0ooo2.OooO00o((float) readableMap.getDouble("positionX"), (float) readableMap.getDouble("positionY"));
        }
        oooo0ooo.setDescription(oooo0ooo2);
    }

    public void setCommonAxisConfig(AbstractC8194oOOo0OoO oooo0ooo, AbstractC8201oOOo0oO0 oooo0oo0, ReadableMap readableMap) {
        if (C8368oOoOo0o0.OooO00o(readableMap, ReadableType.Boolean, "enabled")) {
            oooo0oo0.OooO00o(readableMap.getBoolean("enabled"));
        }
        if (C8368oOoOo0o0.OooO00o(readableMap, ReadableType.Boolean, "drawLabels")) {
            oooo0oo0.OooO0o0(readableMap.getBoolean("drawLabels"));
        }
        if (C8368oOoOo0o0.OooO00o(readableMap, ReadableType.Boolean, "drawAxisLine")) {
            oooo0oo0.OooO0OO(readableMap.getBoolean("drawAxisLine"));
        }
        if (C8368oOoOo0o0.OooO00o(readableMap, ReadableType.Boolean, "drawGridLines")) {
            oooo0oo0.OooO0Oo(readableMap.getBoolean("drawGridLines"));
        }
        if (C8368oOoOo0o0.OooO00o(readableMap, ReadableType.Number, "textColor")) {
            oooo0oo0.OooO00o(readableMap.getInt("textColor"));
        }
        if (C8368oOoOo0o0.OooO00o(readableMap, ReadableType.Number, "textSize")) {
            oooo0oo0.OooO00o((float) readableMap.getDouble("textSize"));
        }
        if (C8368oOoOo0o0.OooO00o(readableMap, ReadableType.String, "fontFamily")) {
            oooo0oo0.OooO00o(C8359oOoOo.OooO00o(oooo0ooo, readableMap));
        }
        if (C8368oOoOo0o0.OooO00o(readableMap, ReadableType.Number, "gridColor")) {
            oooo0oo0.OooO0OO(readableMap.getInt("gridColor"));
        }
        if (C8368oOoOo0o0.OooO00o(readableMap, ReadableType.Number, "gridLineWidth")) {
            oooo0oo0.OooOO0((float) readableMap.getDouble("gridLineWidth"));
        }
        if (C8368oOoOo0o0.OooO00o(readableMap, ReadableType.Number, "axisLineColor")) {
            oooo0oo0.OooO0O0(readableMap.getInt("axisLineColor"));
        }
        if (C8368oOoOo0o0.OooO00o(readableMap, ReadableType.Number, "axisLineWidth")) {
            oooo0oo0.OooO0Oo((float) readableMap.getDouble("axisLineWidth"));
        }
        if (C8368oOoOo0o0.OooO00o(readableMap, ReadableType.Map, "gridDashedLine")) {
            ReadableMap map = readableMap.getMap("gridDashedLine");
            float f = 0.0f;
            float f2 = C8368oOoOo0o0.OooO00o(map, ReadableType.Number, "lineLength") ? (float) map.getDouble("lineLength") : 0.0f;
            float f3 = C8368oOoOo0o0.OooO00o(map, ReadableType.Number, "spaceLength") ? (float) map.getDouble("spaceLength") : 0.0f;
            if (C8368oOoOo0o0.OooO00o(map, ReadableType.Number, "phase")) {
                f = (float) map.getDouble("phase");
            }
            oooo0oo0.OooO0O0(f2, f3, f);
        }
        boolean z = false;
        if (C8368oOoOo0o0.OooO00o(readableMap, ReadableType.Array, "limitLines")) {
            ReadableArray array = readableMap.getArray("limitLines");
            for (int i = 0; i < array.size(); i++) {
                if (ReadableType.Map.equals(array.getType(i))) {
                    ReadableMap map2 = array.getMap(i);
                    if (C8368oOoOo0o0.OooO00o(map2, ReadableType.Number, "limit")) {
                        LimitLine limitLine = new LimitLine((float) map2.getDouble("limit"));
                        if (C8368oOoOo0o0.OooO00o(map2, ReadableType.String, "label")) {
                            limitLine.OooO00o(map2.getString("label"));
                        }
                        if (C8368oOoOo0o0.OooO00o(map2, ReadableType.Number, "lineColor")) {
                            limitLine.OooO0O0(map2.getInt("lineColor"));
                        }
                        if (C8368oOoOo0o0.OooO00o(map2, ReadableType.Number, "lineWidth")) {
                            limitLine.OooO0Oo((float) map2.getDouble("lineWidth"));
                        }
                        if (C8368oOoOo0o0.OooO00o(map2, ReadableType.Number, "valueTextColor")) {
                            limitLine.OooO00o(map2.getInt("valueTextColor"));
                        }
                        if (C8368oOoOo0o0.OooO00o(map2, ReadableType.Number, "valueFont")) {
                            limitLine.OooO00o((float) map2.getInt("valueFont"));
                        }
                        if (C8368oOoOo0o0.OooO00o(map2, ReadableType.String, "labelPosition")) {
                            limitLine.OooO00o(LimitLine.LimitLabelPosition.valueOf(map2.getString("labelPosition")));
                        }
                        if (C8368oOoOo0o0.OooO00o(map2, ReadableType.Number, "lineDashPhase") && C8368oOoOo0o0.OooO00o(map2, ReadableType.Array, "lineDashLengths") && map2.getArray("lineDashLengths").size() > 1) {
                            limitLine.OooO00o((float) map2.getArray("lineDashLengths").getInt(0), (float) map2.getArray("lineDashLengths").getInt(1), (float) map2.getDouble("lineDashPhase"));
                        }
                        oooo0oo0.OooO00o(limitLine);
                    }
                }
            }
        }
        if (C8368oOoOo0o0.OooO00o(readableMap, ReadableType.Boolean, "drawLimitLinesBehindData")) {
            oooo0oo0.OooO0o(readableMap.getBoolean("drawLimitLinesBehindData"));
        }
        if (C8368oOoOo0o0.OooO00o(readableMap, ReadableType.Number, "axisMaximum")) {
            oooo0oo0.OooO0o((float) readableMap.getDouble("axisMaximum"));
        }
        if (C8368oOoOo0o0.OooO00o(readableMap, ReadableType.Number, "axisMinimum")) {
            oooo0oo0.OooO0oo((float) readableMap.getDouble("axisMinimum"));
        }
        if (C8368oOoOo0o0.OooO00o(readableMap, ReadableType.Number, "granularity")) {
            oooo0oo0.OooO((float) readableMap.getDouble("granularity"));
        }
        if (C8368oOoOo0o0.OooO00o(readableMap, ReadableType.Boolean, "granularityEnabled")) {
            oooo0oo0.OooO0oO(readableMap.getBoolean("granularityEnabled"));
        }
        if (C8368oOoOo0o0.OooO00o(readableMap, ReadableType.Number, "labelCount")) {
            if (C8368oOoOo0o0.OooO00o(readableMap, ReadableType.Boolean, "labelCountForce")) {
                z = readableMap.getBoolean("labelCountForce");
            }
            oooo0oo0.OooO00o(readableMap.getInt("labelCount"), z);
        }
        if (C8368oOoOo0o0.OooO00o(readableMap, ReadableType.String, "valueFormatter")) {
            String string = readableMap.getString("valueFormatter");
            if ("largeValue".equals(string)) {
                oooo0oo0.OooO00o(new C8236oOOoo0());
            } else if ("percent".equals(string)) {
                oooo0oo0.OooO00o(new C8242oOOoo0O0());
            } else if (DatePickerDialogModule.ARG_DATE.equals(string)) {
                oooo0oo0.OooO00o(new C8357oOoOOooO(readableMap.getString("valueFormatterPattern")));
            } else {
                oooo0oo0.OooO00o(new C8355oOoOOoo(string));
            }
        } else if (C8368oOoOo0o0.OooO00o(readableMap, ReadableType.Array, "valueFormatter")) {
            oooo0oo0.OooO00o(new C8240oOOoo00o(C8368oOoOo0o0.m20050OooO00o(readableMap.getArray("valueFormatter"))));
        }
        if (C8368oOoOo0o0.OooO00o(readableMap, ReadableType.Boolean, "centerAxisLabels")) {
            oooo0oo0.OooO0O0(readableMap.getBoolean("centerAxisLabels"));
        }
    }

    @ReactProp(name = "data")
    public void setData(T t, ReadableMap readableMap) {
        t.setData(getDataExtract().OooO00o(t, readableMap));
    }

    @ReactProp(name = "dragDecelerationEnabled")
    public void setDragDecelerationEnabled(AbstractC8194oOOo0OoO oooo0ooo, boolean z) {
        oooo0ooo.setDragDecelerationEnabled(z);
    }

    @ReactProp(name = "dragDecelerationFrictionCoef")
    public void setDragDecelerationFrictionCoef(AbstractC8194oOOo0OoO oooo0ooo, float f) {
        oooo0ooo.setDragDecelerationFrictionCoef(f);
    }

    @ReactProp(name = "highlightPerTapEnabled")
    public void setHighlightPerTapEnabled(AbstractC8194oOOo0OoO oooo0ooo, boolean z) {
        oooo0ooo.setHighlightPerTapEnabled(z);
    }

    @ReactProp(name = "highlights")
    public void setHighlights(T t, ReadableArray readableArray) {
        C8246oOOoo0oO ooooo0oo;
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < readableArray.size(); i++) {
            if (ReadableType.Map.equals(readableArray.getType(i))) {
                ReadableMap map = readableArray.getMap(i);
                if (C8368oOoOo0o0.OooO00o(map, ReadableType.Number, FontMetricsUtil.X_HEIGHT_MEASUREMENT_TEXT)) {
                    int i2 = C8368oOoOo0o0.OooO00o(map, ReadableType.Number, "dataSetIndex") ? map.getInt("dataSetIndex") : 0;
                    float f = C8368oOoOo0o0.OooO00o(map, ReadableType.Number, "y") ? (float) map.getDouble("y") : 0.0f;
                    if (C8368oOoOo0o0.OooO00o(map, ReadableType.Number, "stackIndex")) {
                        ooooo0oo = new C8246oOOoo0oO((float) map.getDouble(FontMetricsUtil.X_HEIGHT_MEASUREMENT_TEXT), i2, map.getInt("stackIndex"));
                    } else {
                        ooooo0oo = new C8246oOOoo0oO((float) map.getDouble(FontMetricsUtil.X_HEIGHT_MEASUREMENT_TEXT), f, i2);
                    }
                    if (C8368oOoOo0o0.OooO00o(map, ReadableType.Number, "dataIndex")) {
                        ooooo0oo.OooO00o(map.getInt("dataIndex"));
                    }
                    arrayList.add(ooooo0oo);
                }
            }
        }
        t.OooO00o((C8246oOOoo0oO[]) arrayList.toArray(new C8246oOOoo0oO[arrayList.size()]));
    }

    @ReactProp(name = "legend")
    public void setLegend(T t, ReadableMap readableMap) {
        Legend legend = t.getLegend();
        if (C8368oOoOo0o0.OooO00o(readableMap, ReadableType.Boolean, "enabled")) {
            legend.OooO00o(readableMap.getBoolean("enabled"));
        }
        if (C8368oOoOo0o0.OooO00o(readableMap, ReadableType.Number, "textColor")) {
            legend.OooO00o(readableMap.getInt("textColor"));
        }
        if (C8368oOoOo0o0.OooO00o(readableMap, ReadableType.Number, "textSize")) {
            legend.OooO00o((float) readableMap.getDouble("textSize"));
        }
        if (C8368oOoOo0o0.OooO00o(readableMap, ReadableType.Boolean, "wordWrapEnabled")) {
            legend.OooO0OO(readableMap.getBoolean("wordWrapEnabled"));
        }
        if (C8368oOoOo0o0.OooO00o(readableMap, ReadableType.Number, "maxSizePercent")) {
            legend.OooO0oO((float) readableMap.getDouble("maxSizePercent"));
        }
        if (C8368oOoOo0o0.OooO00o(readableMap, ReadableType.String, "horizontalAlignment")) {
            legend.OooO00o(Legend.LegendHorizontalAlignment.valueOf(readableMap.getString("horizontalAlignment").toUpperCase(Locale.ENGLISH)));
        }
        if (C8368oOoOo0o0.OooO00o(readableMap, ReadableType.String, "verticalAlignment")) {
            legend.OooO00o(Legend.LegendVerticalAlignment.valueOf(readableMap.getString("verticalAlignment").toUpperCase(Locale.ENGLISH)));
        }
        if (C8368oOoOo0o0.OooO00o(readableMap, ReadableType.String, "orientation")) {
            legend.OooO00o(Legend.LegendOrientation.valueOf(readableMap.getString("orientation").toUpperCase(Locale.ENGLISH)));
        }
        if (C8368oOoOo0o0.OooO00o(readableMap, ReadableType.Boolean, "drawInside")) {
            legend.OooO0O0(readableMap.getBoolean("drawInside"));
        }
        if (C8368oOoOo0o0.OooO00o(readableMap, ReadableType.String, RNGestureHandlerModule.KEY_DIRECTION)) {
            legend.OooO00o(Legend.LegendDirection.valueOf(readableMap.getString(RNGestureHandlerModule.KEY_DIRECTION).toUpperCase(Locale.ENGLISH)));
        }
        if (C8368oOoOo0o0.OooO00o(readableMap, ReadableType.String, "fontFamily")) {
            legend.OooO00o(C8359oOoOo.OooO00o(t, readableMap));
        }
        if (C8368oOoOo0o0.OooO00o(readableMap, ReadableType.String, C7485o0OoO0o0.OooO0OO)) {
            legend.OooO00o(Legend.LegendForm.valueOf(readableMap.getString(C7485o0OoO0o0.OooO0OO).toUpperCase(Locale.ENGLISH)));
        }
        if (C8368oOoOo0o0.OooO00o(readableMap, ReadableType.Number, "formSize")) {
            legend.OooO0o0((float) readableMap.getDouble("formSize"));
        }
        if (C8368oOoOo0o0.OooO00o(readableMap, ReadableType.Number, "xEntrySpace")) {
            legend.OooO((float) readableMap.getDouble("xEntrySpace"));
        }
        if (C8368oOoOo0o0.OooO00o(readableMap, ReadableType.Number, "yEntrySpace")) {
            legend.OooOO0((float) readableMap.getDouble("yEntrySpace"));
        }
        if (C8368oOoOo0o0.OooO00o(readableMap, ReadableType.Number, "formToTextSpace")) {
            legend.OooO0o((float) readableMap.getDouble("formToTextSpace"));
        }
        if (C8368oOoOo0o0.OooO00o(readableMap, ReadableType.Map, "custom")) {
            ReadableMap map = readableMap.getMap("custom");
            if (C8368oOoOo0o0.OooO00o(map, ReadableType.Array, "colors") && C8368oOoOo0o0.OooO00o(map, ReadableType.Array, "labels")) {
                ReadableArray array = map.getArray("colors");
                ReadableArray array2 = map.getArray("labels");
                if (array.size() == array2.size()) {
                    String[] OooO00o = C8368oOoOo0o0.m20050OooO00o(array2);
                    int[] OooO00o2 = C8368oOoOo0o0.m20049OooO00o(array);
                    int length = OooO00o.length;
                    C8204oOOo0oo0[] oooo0oo0Arr = new C8204oOOo0oo0[length];
                    for (int i = 0; i < length; i++) {
                        oooo0oo0Arr[i] = new C8204oOOo0oo0();
                        oooo0oo0Arr[i].f21315OooO00o = OooO00o2[i];
                        oooo0oo0Arr[i].f21318OooO00o = OooO00o[i];
                    }
                    legend.OooO00o(oooo0oo0Arr);
                }
            }
        }
    }

    @ReactProp(name = "logEnabled")
    public void setLogEnabled(AbstractC8194oOOo0OoO oooo0ooo, boolean z) {
        oooo0ooo.setLogEnabled(z);
    }

    @ReactProp(name = "marker")
    public void setMarker(AbstractC8194oOOo0OoO oooo0ooo, ReadableMap readableMap) {
        if (!C8368oOoOo0o0.OooO00o(readableMap, ReadableType.Boolean, "enabled") || !readableMap.getBoolean("enabled")) {
            oooo0ooo.setMarker(null);
            return;
        }
        C8933ooOOO0o0 ooooo0o0 = new C8933ooOOO0o0(oooo0ooo.getContext());
        ooooo0o0.setChartView(oooo0ooo);
        if (Build.VERSION.SDK_INT >= 21 && C8368oOoOo0o0.OooO00o(readableMap, ReadableType.Number, "markerColor")) {
            ooooo0o0.getTvContent().setBackgroundTintList(ColorStateList.valueOf(readableMap.getInt("markerColor")));
        }
        if (C8368oOoOo0o0.OooO00o(readableMap, ReadableType.Number, "digits")) {
            ooooo0o0.setDigits(readableMap.getInt("digits"));
        }
        if (C8368oOoOo0o0.OooO00o(readableMap, ReadableType.Number, "textColor")) {
            ooooo0o0.getTvContent().setTextColor(readableMap.getInt("textColor"));
        }
        if (C8368oOoOo0o0.OooO00o(readableMap, ReadableType.Number, "textSize")) {
            ooooo0o0.getTvContent().setTextSize((float) readableMap.getInt("textSize"));
        }
        oooo0ooo.setMarker(ooooo0o0);
    }

    @ReactProp(name = "noDataText")
    public void setNoDataText(AbstractC8194oOOo0OoO oooo0ooo, String str) {
        oooo0ooo.setNoDataText(str);
    }

    @ReactProp(name = "touchEnabled")
    public void setTouchEnabled(AbstractC8194oOOo0OoO oooo0ooo, boolean z) {
        oooo0ooo.setTouchEnabled(z);
    }

    @ReactProp(name = "xAxis")
    public void setXAxis(AbstractC8194oOOo0OoO oooo0ooo, ReadableMap readableMap) {
        XAxis xAxis = oooo0ooo.getXAxis();
        setCommonAxisConfig(oooo0ooo, xAxis, readableMap);
        if (C8368oOoOo0o0.OooO00o(readableMap, ReadableType.Number, "labelRotationAngle")) {
            xAxis.OooOOO0((float) readableMap.getDouble("labelRotationAngle"));
        }
        if (C8368oOoOo0o0.OooO00o(readableMap, ReadableType.Boolean, "avoidFirstLastClipping")) {
            xAxis.OooO0oo(readableMap.getBoolean("avoidFirstLastClipping"));
        }
        if (C8368oOoOo0o0.OooO00o(readableMap, ReadableType.String, "position")) {
            xAxis.OooO00o(XAxis.XAxisPosition.valueOf(readableMap.getString("position")));
        }
        if (C8368oOoOo0o0.OooO00o(readableMap, ReadableType.Number, "yOffset")) {
            xAxis.OooO0OO((float) readableMap.getDouble("yOffset"));
        }
    }

    public void onAfterUpdateTransaction(T t) {
        super.onAfterUpdateTransaction((View) t);
        t.OooO();
        t.invalidate();
    }
}

package com.github.wuxudong.rncharts.charts;

import android.view.View;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.common.MapBuilder;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.views.text.FontMetricsUtil;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.Entry;
import com.p118pd.sdk.AbstractC8191oOOo0OOo;
import com.p118pd.sdk.AbstractC8194oOOo0OoO;
import com.p118pd.sdk.AbstractC8352oOoOOoO0;
import com.p118pd.sdk.C8368oOoOo0o0;
import java.util.Map;
import javax.annotation.Nullable;

public abstract class BarLineChartBaseManager<T extends AbstractC8191oOOo0OOo, U extends Entry> extends YAxisChartBase<T, U> {
    public ReadableMap savedVisibleRange = null;

    private void updateVisibleRange(AbstractC8191oOOo0OOo oooo0ooo, ReadableMap readableMap) {
        if (C8368oOoOo0o0.OooO00o(readableMap, ReadableType.Map, FontMetricsUtil.X_HEIGHT_MEASUREMENT_TEXT)) {
            ReadableMap map = readableMap.getMap(FontMetricsUtil.X_HEIGHT_MEASUREMENT_TEXT);
            if (C8368oOoOo0o0.OooO00o(map, ReadableType.Number, "min")) {
                oooo0ooo.setVisibleXRangeMinimum((float) map.getDouble("min"));
            }
            if (C8368oOoOo0o0.OooO00o(map, ReadableType.Number, "max")) {
                oooo0ooo.setVisibleXRangeMaximum((float) map.getDouble("max"));
            }
        }
        if (C8368oOoOo0o0.OooO00o(readableMap, ReadableType.Map, "y")) {
            ReadableMap map2 = readableMap.getMap("y");
            if (C8368oOoOo0o0.OooO00o(map2, ReadableType.Map, "left")) {
                ReadableMap map3 = map2.getMap("left");
                if (C8368oOoOo0o0.OooO00o(map3, ReadableType.Number, "min")) {
                    oooo0ooo.OooO0OO((float) map3.getDouble("min"), YAxis.AxisDependency.LEFT);
                }
                if (C8368oOoOo0o0.OooO00o(map3, ReadableType.Number, "max")) {
                    oooo0ooo.OooO0O0((float) map3.getDouble("max"), YAxis.AxisDependency.LEFT);
                }
            }
            if (C8368oOoOo0o0.OooO00o(map2, ReadableType.Map, "right")) {
                ReadableMap map4 = map2.getMap("right");
                if (C8368oOoOo0o0.OooO00o(map4, ReadableType.Number, "min")) {
                    oooo0ooo.OooO0OO((float) map4.getDouble("min"), YAxis.AxisDependency.RIGHT);
                }
                if (C8368oOoOo0o0.OooO00o(map4, ReadableType.Number, "max")) {
                    oooo0ooo.OooO0O0((float) map4.getDouble("max"), YAxis.AxisDependency.RIGHT);
                }
            }
        }
    }

    @Override // com.facebook.react.uimanager.ViewManager
    @Nullable
    public Map<String, Integer> getCommandsMap() {
        Map<String, Integer> commandsMap = super.getCommandsMap();
        Map<String, Integer> of = MapBuilder.m950of("moveViewTo", 1, "moveViewToX", 2, "moveViewToAnimated", 3, "fitScreen", 7, "highlights", 8);
        if (commandsMap != null) {
            of.putAll(commandsMap);
        }
        return of;
    }

    @ReactProp(name = "autoScaleMinMaxEnabled")
    public void setAutoScaleMinMaxEnabled(AbstractC8191oOOo0OOo oooo0ooo, boolean z) {
        oooo0ooo.setAutoScaleMinMaxEnabled(z);
    }

    @ReactProp(name = ViewProps.BORDER_COLOR)
    public void setBorderColor(AbstractC8191oOOo0OOo oooo0ooo, Integer num) {
        oooo0ooo.setBorderColor(num.intValue());
    }

    @ReactProp(name = ViewProps.BORDER_WIDTH)
    public void setBorderWidth(AbstractC8191oOOo0OOo oooo0ooo, float f) {
        oooo0ooo.setBorderWidth(f);
    }

    @ReactProp(name = "doubleTapToZoomEnabled")
    public void setDoubleTapToZoomEnabled(AbstractC8191oOOo0OOo oooo0ooo, boolean z) {
        oooo0ooo.setDoubleTapToZoomEnabled(z);
    }

    @ReactProp(name = "dragEnabled")
    public void setDragEnabled(AbstractC8191oOOo0OOo oooo0ooo, boolean z) {
        oooo0ooo.setDragEnabled(z);
    }

    @ReactProp(name = "drawBorders")
    public void setDrawBorders(AbstractC8191oOOo0OOo oooo0ooo, boolean z) {
        oooo0ooo.setDrawBorders(z);
    }

    @ReactProp(name = "drawGridBackground")
    public void setDrawGridBackground(AbstractC8191oOOo0OOo oooo0ooo, boolean z) {
        oooo0ooo.setDrawGridBackground(z);
    }

    @ReactProp(name = "extraOffsets")
    public void setExtraOffsets(AbstractC8191oOOo0OOo oooo0ooo, ReadableMap readableMap) {
        boolean OooO00o = C8368oOoOo0o0.OooO00o(readableMap, ReadableType.Number, "left");
        double d = AbstractC8352oOoOOoO0.OooO0O0;
        double d2 = OooO00o ? readableMap.getDouble("left") : 0.0d;
        double d3 = C8368oOoOo0o0.OooO00o(readableMap, ReadableType.Number, "top") ? readableMap.getDouble("top") : 0.0d;
        double d4 = C8368oOoOo0o0.OooO00o(readableMap, ReadableType.Number, "right") ? readableMap.getDouble("right") : 0.0d;
        if (C8368oOoOo0o0.OooO00o(readableMap, ReadableType.Number, "bottom")) {
            d = readableMap.getDouble("bottom");
        }
        oooo0ooo.OooO00o((float) d2, (float) d3, (float) d4, (float) d);
    }

    @ReactProp(name = "gridBackgroundColor")
    public void setGridBackgroundColor(AbstractC8191oOOo0OOo oooo0ooo, Integer num) {
        oooo0ooo.setGridBackgroundColor(num.intValue());
    }

    @ReactProp(name = "highlightPerDragEnabled")
    public void setHighlightPerDragEnabled(AbstractC8191oOOo0OOo oooo0ooo, boolean z) {
        oooo0ooo.setHighlightPerDragEnabled(z);
    }

    @ReactProp(name = "keepPositionOnRotation")
    public void setKeepPositionOnRotation(AbstractC8191oOOo0OOo oooo0ooo, boolean z) {
        oooo0ooo.setKeepPositionOnRotation(z);
    }

    @ReactProp(name = "maxVisibleValueCount")
    public void setMaxVisibleValueCount(AbstractC8191oOOo0OOo oooo0ooo, int i) {
        oooo0ooo.setMaxVisibleValueCount(i);
    }

    @ReactProp(name = "pinchZoom")
    public void setPinchZoom(AbstractC8191oOOo0OOo oooo0ooo, boolean z) {
        oooo0ooo.setPinchZoom(z);
    }

    @ReactProp(name = "scaleEnabled")
    public void setScaleEnabled(AbstractC8191oOOo0OOo oooo0ooo, boolean z) {
        oooo0ooo.setScaleEnabled(z);
    }

    @ReactProp(name = "scaleXEnabled")
    public void setScaleXEnabled(AbstractC8191oOOo0OOo oooo0ooo, boolean z) {
        oooo0ooo.setScaleXEnabled(z);
    }

    @ReactProp(name = "scaleYEnabled")
    public void setScaleYEnabled(AbstractC8191oOOo0OOo oooo0ooo, boolean z) {
        oooo0ooo.setScaleYEnabled(z);
    }

    @ReactProp(name = "viewPortOffsets")
    public void setViewPortOffsets(AbstractC8191oOOo0OOo oooo0ooo, ReadableMap readableMap) {
        boolean OooO00o = C8368oOoOo0o0.OooO00o(readableMap, ReadableType.Number, "left");
        double d = AbstractC8352oOoOOoO0.OooO0O0;
        double d2 = OooO00o ? readableMap.getDouble("left") : 0.0d;
        double d3 = C8368oOoOo0o0.OooO00o(readableMap, ReadableType.Number, "top") ? readableMap.getDouble("top") : 0.0d;
        double d4 = C8368oOoOo0o0.OooO00o(readableMap, ReadableType.Number, "right") ? readableMap.getDouble("right") : 0.0d;
        if (C8368oOoOo0o0.OooO00o(readableMap, ReadableType.Number, "bottom")) {
            d = readableMap.getDouble("bottom");
        }
        oooo0ooo.OooO0O0((float) d2, (float) d3, (float) d4, (float) d);
    }

    @ReactProp(name = "visibleRange")
    public void setVisibleXRangeMinimum(AbstractC8191oOOo0OOo oooo0ooo, ReadableMap readableMap) {
        this.savedVisibleRange = readableMap;
    }

    @Override // com.github.wuxudong.rncharts.charts.YAxisChartBase
    public void setYAxis(AbstractC8194oOOo0OoO oooo0ooo, ReadableMap readableMap) {
        AbstractC8191oOOo0OOo oooo0ooo2 = (AbstractC8191oOOo0OOo) oooo0ooo;
        if (C8368oOoOo0o0.OooO00o(readableMap, ReadableType.Map, "left")) {
            YAxis axisLeft = oooo0ooo2.getAxisLeft();
            setCommonAxisConfig(oooo0ooo, axisLeft, readableMap.getMap("left"));
            setYAxisConfig(axisLeft, readableMap.getMap("left"));
        }
        if (C8368oOoOo0o0.OooO00o(readableMap, ReadableType.Map, "right")) {
            YAxis axisRight = oooo0ooo2.getAxisRight();
            setCommonAxisConfig(oooo0ooo, axisRight, readableMap.getMap("right"));
            setYAxisConfig(axisRight, readableMap.getMap("right"));
        }
    }

    @ReactProp(name = "zoom")
    public void setZoom(AbstractC8191oOOo0OOo oooo0ooo, ReadableMap readableMap) {
        if (C8368oOoOo0o0.OooO00o(readableMap, ReadableType.Number, BaseViewManager.PROP_SCALE_X) && C8368oOoOo0o0.OooO00o(readableMap, ReadableType.Number, BaseViewManager.PROP_SCALE_Y) && C8368oOoOo0o0.OooO00o(readableMap, ReadableType.Number, "xValue") && C8368oOoOo0o0.OooO00o(readableMap, ReadableType.Number, "yValue")) {
            YAxis.AxisDependency axisDependency = YAxis.AxisDependency.LEFT;
            if (readableMap.hasKey("axisDependency") && readableMap.getString("axisDependency").equalsIgnoreCase("RIGHT")) {
                axisDependency = YAxis.AxisDependency.RIGHT;
            }
            oooo0ooo.OooO00o(((float) readableMap.getDouble(BaseViewManager.PROP_SCALE_X)) / oooo0ooo.getScaleX(), ((float) readableMap.getDouble(BaseViewManager.PROP_SCALE_Y)) / oooo0ooo.getScaleY(), (float) readableMap.getDouble("xValue"), (float) readableMap.getDouble("yValue"), axisDependency);
        }
    }

    public void receiveCommand(T t, int i, @Nullable ReadableArray readableArray) {
        switch (i) {
            case 1:
                t.m19833OooO0O0((float) readableArray.getDouble(0), (float) readableArray.getDouble(1), readableArray.getString(2).equalsIgnoreCase("right") ? YAxis.AxisDependency.RIGHT : YAxis.AxisDependency.LEFT);
                return;
            case 2:
                t.OooO00o((float) readableArray.getDouble(0));
                return;
            case 3:
                t.OooO0O0((float) readableArray.getDouble(0), (float) readableArray.getDouble(1), readableArray.getString(2).equalsIgnoreCase("right") ? YAxis.AxisDependency.RIGHT : YAxis.AxisDependency.LEFT, (long) readableArray.getInt(3));
                return;
            case 4:
                t.m19831OooO00o((float) readableArray.getDouble(0), (float) readableArray.getDouble(1), readableArray.getString(2).equalsIgnoreCase("right") ? YAxis.AxisDependency.RIGHT : YAxis.AxisDependency.LEFT);
                return;
            case 5:
            default:
                super.receiveCommand((View) t, i, readableArray);
                return;
            case 6:
                t.OooO00o((float) readableArray.getDouble(0), (float) readableArray.getDouble(1), readableArray.getString(2).equalsIgnoreCase("right") ? YAxis.AxisDependency.RIGHT : YAxis.AxisDependency.LEFT, (long) readableArray.getInt(3));
                return;
            case 7:
                t.OooOO0O();
                return;
            case 8:
                setHighlights(t, readableArray.getArray(0));
                return;
        }
    }

    public void onAfterUpdateTransaction(T t) {
        super.onAfterUpdateTransaction((AbstractC8194oOOo0OoO) t);
        ReadableMap readableMap = this.savedVisibleRange;
        if (readableMap != null) {
            updateVisibleRange(t, readableMap);
            this.savedVisibleRange = null;
        }
    }
}

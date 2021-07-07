package com.p118pd.sdk;

import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.views.text.FontMetricsUtil;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineDataSet;
import java.util.ArrayList;

/* renamed from: com.pd.sdk.oOoOo0O0  reason: case insensitive filesystem */
public class C8365oOoOo0O0 extends AbstractC8385oOoOoo0O<C8220oOOoOOo, Entry> {
    @Override // com.p118pd.sdk.AbstractC8385oOoOoo0O
    public C8220oOOoOOo OooO00o() {
        return new C8220oOOoOOo();
    }

    @Override // com.p118pd.sdk.AbstractC8385oOoOoo0O
    public AbstractC8265oOOoooO0<Entry> OooO00o(ArrayList<Entry> arrayList, String str) {
        return new LineDataSet(arrayList, str);
    }

    @Override // com.p118pd.sdk.AbstractC8385oOoOoo0O
    public void OooO00o(AbstractC8194oOOo0OoO oooo0ooo, AbstractC8265oOOoooO0<Entry> ooooooo0, ReadableMap readableMap) {
        LineDataSet lineDataSet = (LineDataSet) ooooooo0;
        C8367oOoOo0o.OooO00o(oooo0ooo, lineDataSet, readableMap);
        C8367oOoOo0o.OooO00o((AbstractC8212oOOoO0oo) lineDataSet, readableMap);
        C8367oOoOo0o.OooO00o((AbstractC8223oOOoOOoo) lineDataSet, readableMap);
        C8367oOoOo0o.OooO00o((AbstractC8222oOOoOOoO) lineDataSet, readableMap);
        if (C8368oOoOo0o0.OooO00o(readableMap, ReadableType.Number, "circleRadius")) {
            lineDataSet.OooO0oo((float) readableMap.getDouble("circleRadius"));
        }
        if (C8368oOoOo0o0.OooO00o(readableMap, ReadableType.Boolean, "drawCircles")) {
            lineDataSet.OooOO0O(readableMap.getBoolean("drawCircles"));
        }
        if (C8368oOoOo0o0.OooO00o(readableMap, ReadableType.String, "mode")) {
            lineDataSet.OooO00o(LineDataSet.Mode.valueOf(readableMap.getString("mode")));
        }
        if (C8368oOoOo0o0.OooO00o(readableMap, ReadableType.Number, "drawCubicIntensity")) {
            lineDataSet.OooOO0((float) readableMap.getDouble("drawCubicIntensity"));
        }
        if (C8368oOoOo0o0.OooO00o(readableMap, ReadableType.Number, "circleColor")) {
            lineDataSet.OooO0oO(readableMap.getInt("circleColor"));
        }
        if (C8368oOoOo0o0.OooO00o(readableMap, ReadableType.Array, "circleColors")) {
            lineDataSet.OooO0O0(C8368oOoOo0o0.m20049OooO00o(readableMap.getArray("circleColors")));
        }
        if (C8368oOoOo0o0.OooO00o(readableMap, ReadableType.Number, "circleHoleColor")) {
            lineDataSet.OooO0oo(readableMap.getInt("circleHoleColor"));
        }
        if (C8368oOoOo0o0.OooO00o(readableMap, ReadableType.Boolean, "drawCircleHole")) {
            lineDataSet.OooOO0(readableMap.getBoolean("drawCircleHole"));
        }
        if (C8368oOoOo0o0.OooO00o(readableMap, ReadableType.Map, "dashedLine")) {
            ReadableMap map = readableMap.getMap("dashedLine");
            float f = 0.0f;
            float f2 = C8368oOoOo0o0.OooO00o(map, ReadableType.Number, "lineLength") ? (float) map.getDouble("lineLength") : 0.0f;
            float f3 = C8368oOoOo0o0.OooO00o(map, ReadableType.Number, "spaceLength") ? (float) map.getDouble("spaceLength") : 0.0f;
            if (C8368oOoOo0o0.OooO00o(map, ReadableType.Number, "phase")) {
                f = (float) map.getDouble("phase");
            }
            lineDataSet.OooO0O0(f2, f3, f);
        }
    }

    @Override // com.p118pd.sdk.AbstractC8385oOoOoo0O
    public Entry OooO00o(ReadableArray readableArray, int i) {
        float f = (float) i;
        if (ReadableType.Map.equals(readableArray.getType(i))) {
            ReadableMap map = readableArray.getMap(i);
            if (map.hasKey(FontMetricsUtil.X_HEIGHT_MEASUREMENT_TEXT)) {
                f = (float) map.getDouble(FontMetricsUtil.X_HEIGHT_MEASUREMENT_TEXT);
            }
            return new Entry(f, (float) map.getDouble("y"), C8369oOoOo0oO.OooO00o(map));
        } else if (ReadableType.Number.equals(readableArray.getType(i))) {
            return new Entry(f, (float) readableArray.getDouble(i));
        } else {
            throw new IllegalArgumentException("Unexpected entry type: " + readableArray.getType(i));
        }
    }
}

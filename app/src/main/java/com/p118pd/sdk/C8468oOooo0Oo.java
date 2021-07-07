package com.p118pd.sdk;

import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.views.text.FontMetricsUtil;
import com.github.mikephil.charting.charts.ScatterChart;
import com.github.mikephil.charting.data.Entry;
import java.util.ArrayList;
import java.util.Locale;

/* renamed from: com.pd.sdk.oOooo0Oo  reason: case insensitive filesystem */
public class C8468oOooo0Oo extends AbstractC8385oOoOoo0O<C8224oOOoOo, Entry> {
    @Override // com.p118pd.sdk.AbstractC8385oOoOoo0O
    public C8224oOOoOo OooO00o() {
        return new C8224oOOoOo();
    }

    @Override // com.p118pd.sdk.AbstractC8385oOoOoo0O
    public AbstractC8265oOOoooO0<Entry> OooO00o(ArrayList<Entry> arrayList, String str) {
        return new C8229oOOoOoO0(arrayList, str);
    }

    @Override // com.p118pd.sdk.AbstractC8385oOoOoo0O
    public void OooO00o(AbstractC8194oOOo0OoO oooo0ooo, AbstractC8265oOOoooO0<Entry> ooooooo0, ReadableMap readableMap) {
        C8229oOOoOoO0 ooooooo02 = (C8229oOOoOoO0) ooooooo0;
        C8367oOoOo0o.OooO00o(oooo0ooo, ooooooo02, readableMap);
        C8367oOoOo0o.OooO00o((AbstractC8212oOOoO0oo) ooooooo02, readableMap);
        C8367oOoOo0o.OooO00o((AbstractC8223oOOoOOoo) ooooooo02, readableMap);
        if (C8368oOoOo0o0.OooO00o(readableMap, ReadableType.Number, "scatterShapeSize")) {
            ooooooo02.OooO0oO((float) readableMap.getDouble("scatterShapeSize"));
        }
        if (C8368oOoOo0o0.OooO00o(readableMap, ReadableType.String, "scatterShape")) {
            ooooooo02.m19930OooO00o(ScatterChart.ScatterShape.valueOf(readableMap.getString("scatterShape").toUpperCase(Locale.ENGLISH)));
        }
        if (C8368oOoOo0o0.OooO00o(readableMap, ReadableType.Number, "scatterShapeHoleColor")) {
            ooooooo02.OooO0o0(readableMap.getInt("scatterShapeHoleColor"));
        }
        if (C8368oOoOo0o0.OooO00o(readableMap, ReadableType.Number, "scatterShapeHoleRadius")) {
            ooooooo02.OooO0o((float) readableMap.getDouble("scatterShapeHoleRadius"));
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

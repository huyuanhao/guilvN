package com.p118pd.sdk;

import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.views.text.FontMetricsUtil;
import com.github.mikephil.charting.data.BarEntry;
import java.util.ArrayList;

/* renamed from: com.pd.sdk.oOoOo000  reason: case insensitive filesystem */
public class C8362oOoOo000 extends AbstractC8385oOoOoo0O<C8208oOOoO0Oo, BarEntry> {
    @Override // com.p118pd.sdk.AbstractC8385oOoOoo0O
    public C8208oOOoO0Oo OooO00o() {
        return new C8208oOOoO0Oo();
    }

    @Override // com.p118pd.sdk.AbstractC8385oOoOoo0O
    public AbstractC8265oOOoooO0<BarEntry> OooO00o(ArrayList<BarEntry> arrayList, String str) {
        return new C8209oOOoO0o(arrayList, str);
    }

    @Override // com.p118pd.sdk.AbstractC8385oOoOoo0O
    public BarEntry OooO00o(ReadableArray readableArray, int i) {
        BarEntry barEntry;
        BarEntry barEntry2;
        float f = (float) i;
        if (ReadableType.Map.equals(readableArray.getType(i))) {
            ReadableMap map = readableArray.getMap(i);
            if (map.hasKey(FontMetricsUtil.X_HEIGHT_MEASUREMENT_TEXT)) {
                f = (float) map.getDouble(FontMetricsUtil.X_HEIGHT_MEASUREMENT_TEXT);
            }
            if (ReadableType.Array.equals(map.getType("y"))) {
                barEntry2 = new BarEntry(f, C8368oOoOo0o0.OooO00o(map.getArray("y")));
            } else if (ReadableType.Number.equals(map.getType("y"))) {
                barEntry2 = new BarEntry(f, (float) map.getDouble("y"));
            } else {
                throw new IllegalArgumentException("Unexpected entry type: " + readableArray.getType(i));
            }
            barEntry2.OooO00o(C8369oOoOo0oO.OooO00o(map));
            return barEntry2;
        }
        if (ReadableType.Array.equals(readableArray.getType(i))) {
            barEntry = new BarEntry(f, C8368oOoOo0o0.OooO00o(readableArray.getArray(i)));
        } else if (ReadableType.Number.equals(readableArray.getType(i))) {
            barEntry = new BarEntry(f, (float) readableArray.getDouble(i));
        } else {
            throw new IllegalArgumentException("Unexpected entry type: " + readableArray.getType(i));
        }
        return barEntry;
    }

    @Override // com.p118pd.sdk.AbstractC8385oOoOoo0O
    public void OooO00o(AbstractC8194oOOo0OoO oooo0ooo, AbstractC8265oOOoooO0<BarEntry> ooooooo0, ReadableMap readableMap) {
        C8209oOOoO0o ooooo0o = (C8209oOOoO0o) ooooooo0;
        C8367oOoOo0o.OooO00o(oooo0ooo, ooooo0o, readableMap);
        C8367oOoOo0o.OooO00o(ooooo0o, readableMap);
        if (C8368oOoOo0o0.OooO00o(readableMap, ReadableType.Number, "barShadowColor")) {
            ooooo0o.OooO0o(readableMap.getInt("barShadowColor"));
        }
        if (C8368oOoOo0o0.OooO00o(readableMap, ReadableType.Number, "highlightAlpha")) {
            ooooo0o.OooO0oO(readableMap.getInt("highlightAlpha"));
        }
        if (C8368oOoOo0o0.OooO00o(readableMap, ReadableType.Array, "stackLabels")) {
            ooooo0o.OooO00o(C8368oOoOo0o0.m20050OooO00o(readableMap.getArray("stackLabels")));
        }
    }

    public void OooO00o(C8208oOOoO0Oo ooooo0oo, ReadableMap readableMap) {
        super.OooO00o((AbstractC8219oOOoOOOo) ooooo0oo, readableMap);
        if (C8368oOoOo0o0.OooO00o(readableMap, ReadableType.Number, "barWidth")) {
            ooooo0oo.OooO0O0((float) readableMap.getDouble("barWidth"));
        }
        if (C8368oOoOo0o0.OooO00o(readableMap, ReadableType.Map, "group")) {
            ReadableMap map = readableMap.getMap("group");
            if (C8368oOoOo0o0.OooO00o(map, ReadableType.Number, "fromX") && C8368oOoOo0o0.OooO00o(map, ReadableType.Number, "groupSpace") && C8368oOoOo0o0.OooO00o(map, ReadableType.Number, "barSpace")) {
                ooooo0oo.OooO00o((float) map.getDouble("fromX"), (float) map.getDouble("groupSpace"), (float) map.getDouble("barSpace"));
            }
        }
    }
}

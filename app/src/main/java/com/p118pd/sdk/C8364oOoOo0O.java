package com.p118pd.sdk;

import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import com.github.mikephil.charting.data.PieDataSet;
import com.github.mikephil.charting.data.PieEntry;
import java.util.ArrayList;
import java.util.Locale;

/* renamed from: com.pd.sdk.oOoOo0O  reason: case insensitive filesystem */
public class C8364oOoOo0O extends AbstractC8385oOoOoo0O<C8225oOOoOo00, PieEntry> {
    @Override // com.p118pd.sdk.AbstractC8385oOoOoo0O
    public C8225oOOoOo00 OooO00o() {
        return new C8225oOOoOo00();
    }

    @Override // com.p118pd.sdk.AbstractC8385oOoOoo0O
    public AbstractC8265oOOoooO0<PieEntry> OooO00o(ArrayList<PieEntry> arrayList, String str) {
        return new PieDataSet(arrayList, str);
    }

    @Override // com.p118pd.sdk.AbstractC8385oOoOoo0O
    public void OooO00o(AbstractC8194oOOo0OoO oooo0ooo, AbstractC8265oOOoooO0<PieEntry> ooooooo0, ReadableMap readableMap) {
        PieDataSet pieDataSet = (PieDataSet) ooooooo0;
        C8367oOoOo0o.OooO00o(oooo0ooo, pieDataSet, readableMap);
        if (C8368oOoOo0o0.OooO00o(readableMap, ReadableType.Number, "sliceSpace")) {
            pieDataSet.OooO0o((float) readableMap.getDouble("sliceSpace"));
        }
        if (C8368oOoOo0o0.OooO00o(readableMap, ReadableType.Number, "selectionShift")) {
            pieDataSet.OooO0o0((float) readableMap.getDouble("selectionShift"));
        }
        if (C8368oOoOo0o0.OooO00o(readableMap, ReadableType.String, "xValuePosition")) {
            pieDataSet.OooO00o(PieDataSet.ValuePosition.valueOf(readableMap.getString("xValuePosition").toUpperCase(Locale.ENGLISH)));
        }
        if (C8368oOoOo0o0.OooO00o(readableMap, ReadableType.String, "yValuePosition")) {
            pieDataSet.OooO0O0(PieDataSet.ValuePosition.valueOf(readableMap.getString("yValuePosition").toUpperCase(Locale.ENGLISH)));
        }
        if (C8368oOoOo0o0.OooO00o(readableMap, ReadableType.Number, "valueLinePart1Length")) {
            pieDataSet.OooO0oO((float) readableMap.getDouble("valueLinePart1Length"));
        }
        if (C8368oOoOo0o0.OooO00o(readableMap, ReadableType.Number, "valueLinePart2Length")) {
            pieDataSet.OooO((float) readableMap.getDouble("valueLinePart2Length"));
        }
        if (C8368oOoOo0o0.OooO00o(readableMap, ReadableType.Number, "valueLineColor")) {
            pieDataSet.OooO0Oo(readableMap.getInt("valueLineColor"));
        }
        if (C8368oOoOo0o0.OooO00o(readableMap, ReadableType.Number, "valueLineWidth")) {
            pieDataSet.OooOO0((float) readableMap.getDouble("valueLineWidth"));
        }
        if (C8368oOoOo0o0.OooO00o(readableMap, ReadableType.Number, "valueLinePart1OffsetPercentage")) {
            pieDataSet.OooO0oo((float) readableMap.getDouble("valueLinePart1OffsetPercentage"));
        }
        if (C8368oOoOo0o0.OooO00o(readableMap, ReadableType.Boolean, "valueLineVariableLength")) {
            pieDataSet.OooO0oo(readableMap.getBoolean("valueLineVariableLength"));
        }
    }

    @Override // com.p118pd.sdk.AbstractC8385oOoOoo0O
    public PieEntry OooO00o(ReadableArray readableArray, int i) {
        if (ReadableType.Map.equals(readableArray.getType(i))) {
            ReadableMap map = readableArray.getMap(i);
            float f = (float) map.getDouble("value");
            if (C8368oOoOo0o0.OooO00o(map, ReadableType.String, "label")) {
                return new PieEntry(f, map.getString("label"), C8369oOoOo0oO.OooO00o(map));
            }
            return new PieEntry(f, C8369oOoOo0oO.OooO00o(map));
        } else if (ReadableType.Number.equals(readableArray.getType(i))) {
            return new PieEntry((float) readableArray.getDouble(i));
        } else {
            throw new IllegalArgumentException("Unexpected entry type: " + readableArray.getType(i));
        }
    }
}

package com.p118pd.sdk;

import android.graphics.Paint;
import anet.channel.entity.ConnType;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.views.text.FontMetricsUtil;
import com.github.mikephil.charting.data.CandleEntry;
import java.util.ArrayList;
import java.util.Locale;

/* renamed from: com.pd.sdk.oOoOo00O  reason: case insensitive filesystem */
public class C8363oOoOo00O extends AbstractC8385oOoOoo0O<C8216oOOoOOO, CandleEntry> {
    @Override // com.p118pd.sdk.AbstractC8385oOoOoo0O
    public C8216oOOoOOO OooO00o() {
        return new C8216oOOoOOO();
    }

    @Override // com.p118pd.sdk.AbstractC8385oOoOoo0O
    public AbstractC8265oOOoooO0<CandleEntry> OooO00o(ArrayList<CandleEntry> arrayList, String str) {
        return new C8218oOOoOOOO(arrayList, str);
    }

    @Override // com.p118pd.sdk.AbstractC8385oOoOoo0O
    public void OooO00o(AbstractC8194oOOo0OoO oooo0ooo, AbstractC8265oOOoooO0<CandleEntry> ooooooo0, ReadableMap readableMap) {
        C8218oOOoOOOO oooooooo = (C8218oOOoOOOO) ooooooo0;
        C8367oOoOo0o.OooO00o(oooo0ooo, oooooooo, readableMap);
        C8367oOoOo0o.OooO00o((AbstractC8212oOOoO0oo) oooooooo, readableMap);
        C8367oOoOo0o.OooO00o((AbstractC8223oOOoOOoo) oooooooo, readableMap);
        if (C8368oOoOo0o0.OooO00o(readableMap, ReadableType.Number, "barSpace")) {
            oooooooo.OooO0o((float) readableMap.getDouble("barSpace"));
        }
        if (C8368oOoOo0o0.OooO00o(readableMap, ReadableType.Number, "shadowWidth")) {
            oooooooo.OooO0oO((float) readableMap.getDouble("shadowWidth"));
        }
        if (C8368oOoOo0o0.OooO00o(readableMap, ReadableType.Number, "shadowColor")) {
            oooooooo.OooO0oo(readableMap.getInt("shadowColor"));
        }
        if (C8368oOoOo0o0.OooO00o(readableMap, ReadableType.Boolean, "shadowColorSameAsCandle")) {
            oooooooo.OooOO0(readableMap.getBoolean("shadowColorSameAsCandle"));
        }
        if (C8368oOoOo0o0.OooO00o(readableMap, ReadableType.Number, "neutralColor")) {
            oooooooo.OooO0oO(readableMap.getInt("neutralColor"));
        }
        if (C8368oOoOo0o0.OooO00o(readableMap, ReadableType.Number, "decreasingColor")) {
            oooooooo.OooO0o0(readableMap.getInt("decreasingColor"));
        }
        if (C8368oOoOo0o0.OooO00o(readableMap, ReadableType.String, "decreasingPaintStyle")) {
            oooooooo.OooO00o(Paint.Style.valueOf(readableMap.getString("decreasingPaintStyle").toUpperCase(Locale.ENGLISH)));
        }
        if (C8368oOoOo0o0.OooO00o(readableMap, ReadableType.Number, "increasingColor")) {
            oooooooo.OooO0o(readableMap.getInt("increasingColor"));
        }
        if (C8368oOoOo0o0.OooO00o(readableMap, ReadableType.String, "increasingPaintStyle")) {
            oooooooo.OooO0O0(Paint.Style.valueOf(readableMap.getString("increasingPaintStyle").toUpperCase(Locale.ENGLISH)));
        }
    }

    @Override // com.p118pd.sdk.AbstractC8385oOoOoo0O
    public CandleEntry OooO00o(ReadableArray readableArray, int i) {
        if (ReadableType.Map.equals(readableArray.getType(i))) {
            ReadableMap map = readableArray.getMap(i);
            float f = (float) i;
            if (map.hasKey(FontMetricsUtil.X_HEIGHT_MEASUREMENT_TEXT)) {
                f = (float) map.getDouble(FontMetricsUtil.X_HEIGHT_MEASUREMENT_TEXT);
            }
            if (C8368oOoOo0o0.OooO00o(map, ReadableType.Number, "shadowH") && C8368oOoOo0o0.OooO00o(map, ReadableType.Number, "shadowL") && C8368oOoOo0o0.OooO00o(map, ReadableType.Number, ConnType.PK_OPEN) && C8368oOoOo0o0.OooO00o(map, ReadableType.Number, "close")) {
                return new CandleEntry(f, (float) map.getDouble("shadowH"), (float) map.getDouble("shadowL"), (float) map.getDouble(ConnType.PK_OPEN), (float) map.getDouble("close"), C8369oOoOo0oO.OooO00o(map));
            }
            throw new IllegalArgumentException("CandleStick data must contain: shadowH, shadowL, open and close values");
        }
        throw new IllegalArgumentException();
    }
}

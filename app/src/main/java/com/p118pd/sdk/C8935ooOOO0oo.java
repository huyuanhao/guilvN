package com.p118pd.sdk;

import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import com.github.mikephil.charting.data.RadarEntry;
import java.util.ArrayList;

/* renamed from: com.pd.sdk.ooOOO0oo  reason: case insensitive filesystem */
public class C8935ooOOO0oo extends AbstractC8385oOoOoo0O<C8226oOOoOo0O, RadarEntry> {
    @Override // com.p118pd.sdk.AbstractC8385oOoOoo0O
    public C8226oOOoOo0O OooO00o() {
        return new C8226oOOoOo0O();
    }

    @Override // com.p118pd.sdk.AbstractC8385oOoOoo0O
    public AbstractC8265oOOoooO0<RadarEntry> OooO00o(ArrayList<RadarEntry> arrayList, String str) {
        return new C8227oOOoOo0o(arrayList, str);
    }

    @Override // com.p118pd.sdk.AbstractC8385oOoOoo0O
    public void OooO00o(AbstractC8194oOOo0OoO oooo0ooo, AbstractC8265oOOoooO0<RadarEntry> ooooooo0, ReadableMap readableMap) {
        C8227oOOoOo0o oooooo0o = (C8227oOOoOo0o) ooooooo0;
        C8367oOoOo0o.OooO00o(oooo0ooo, oooooo0o, readableMap);
        C8367oOoOo0o.OooO00o((AbstractC8223oOOoOOoo) oooooo0o, readableMap);
        C8367oOoOo0o.OooO00o((AbstractC8222oOOoOOoO) oooooo0o, readableMap);
    }

    @Override // com.p118pd.sdk.AbstractC8385oOoOoo0O
    public RadarEntry OooO00o(ReadableArray readableArray, int i) {
        if (ReadableType.Map.equals(readableArray.getType(i))) {
            ReadableMap map = readableArray.getMap(i);
            return new RadarEntry((float) map.getDouble("value"), C8369oOoOo0oO.OooO00o(map));
        } else if (ReadableType.Number.equals(readableArray.getType(i))) {
            return new RadarEntry((float) readableArray.getDouble(i));
        } else {
            throw new IllegalArgumentException("Unexpected entry type: " + readableArray.getType(i));
        }
    }
}

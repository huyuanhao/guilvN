package com.p118pd.sdk;

import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import com.github.mikephil.charting.data.Entry;
import com.p118pd.sdk.AbstractC8219oOOoOOOo;
import java.util.ArrayList;

/* renamed from: com.pd.sdk.oOoOoo0O  reason: case insensitive filesystem */
public abstract class AbstractC8385oOoOoo0O<D extends AbstractC8219oOOoOOOo, U extends Entry> {
    public abstract U OooO00o(ReadableArray readableArray, int i);

    public abstract D OooO00o();

    public D OooO00o(AbstractC8194oOOo0OoO oooo0ooo, ReadableMap readableMap) {
        if (!C8368oOoOo0o0.OooO00o(readableMap, ReadableType.Array, "dataSets")) {
            return null;
        }
        D OooO00o = OooO00o();
        ReadableArray array = readableMap.getArray("dataSets");
        for (int i = 0; i < array.size(); i++) {
            ReadableMap map = array.getMap(i);
            ReadableArray array2 = map.getArray("values");
            AbstractC8265oOOoooO0<U> OooO00o2 = OooO00o(OooO00o(array2), map.getString("label"));
            if (C8368oOoOo0o0.OooO00o(map, ReadableType.Map, "config")) {
                OooO00o(oooo0ooo, OooO00o2, map.getMap("config"));
            }
            OooO00o.m19908OooO00o(OooO00o2);
        }
        if (C8368oOoOo0o0.OooO00o(readableMap, ReadableType.Map, "config")) {
            OooO00o(OooO00o, readableMap.getMap("config"));
        }
        return OooO00o;
    }

    public abstract AbstractC8265oOOoooO0<U> OooO00o(ArrayList<U> arrayList, String str);

    public abstract void OooO00o(AbstractC8194oOOo0OoO oooo0ooo, AbstractC8265oOOoooO0<U> ooooooo0, ReadableMap readableMap);

    public void OooO00o(D d, ReadableMap readableMap) {
    }

    public ArrayList<U> OooO00o(ReadableArray readableArray) {
        ArrayList<U> arrayList = new ArrayList<>(readableArray.size());
        for (int i = 0; i < readableArray.size(); i++) {
            if (!readableArray.isNull(i)) {
                arrayList.add(OooO00o(readableArray, i));
            }
        }
        return arrayList;
    }
}

package com.p118pd.sdk;

import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import com.github.mikephil.charting.data.Entry;
import java.util.ArrayList;

/* renamed from: com.pd.sdk.oOoOo0  reason: case insensitive filesystem */
public class C8360oOoOo0 extends AbstractC8385oOoOoo0O<C8221oOOoOOo0, Entry> {
    public C8362oOoOo000 OooO00o = new C8362oOoOo000();

    /* renamed from: OooO00o  reason: collision with other field name */
    public C8361oOoOo00 f21483OooO00o = new C8361oOoOo00();

    /* renamed from: OooO00o  reason: collision with other field name */
    public C8363oOoOo00O f21484OooO00o = new C8363oOoOo00O();

    /* renamed from: OooO00o  reason: collision with other field name */
    public C8365oOoOo0O0 f21485OooO00o = new C8365oOoOo0O0();

    /* renamed from: OooO00o  reason: collision with other field name */
    public C8468oOooo0Oo f21486OooO00o = new C8468oOooo0Oo();

    @Override // com.p118pd.sdk.AbstractC8385oOoOoo0O
    public C8221oOOoOOo0 OooO00o(AbstractC8194oOOo0OoO oooo0ooo, ReadableMap readableMap) {
        C8221oOOoOOo0 ooooooo0 = new C8221oOOoOOo0();
        if (C8368oOoOo0o0.OooO00o(readableMap, ReadableType.Map, "lineData")) {
            ooooooo0.OooO00o((C8220oOOoOOo) this.f21485OooO00o.OooO00o(oooo0ooo, readableMap.getMap("lineData")));
        }
        if (C8368oOoOo0o0.OooO00o(readableMap, ReadableType.Map, "barData")) {
            ooooooo0.OooO00o((C8208oOOoO0Oo) this.OooO00o.OooO00o(oooo0ooo, readableMap.getMap("barData")));
        }
        if (C8368oOoOo0o0.OooO00o(readableMap, ReadableType.Map, "scatterData")) {
            ooooooo0.OooO00o((C8224oOOoOo) this.f21486OooO00o.OooO00o(oooo0ooo, readableMap.getMap("scatterData")));
        }
        if (C8368oOoOo0o0.OooO00o(readableMap, ReadableType.Map, "candleData")) {
            ooooooo0.OooO00o((C8216oOOoOOO) this.f21484OooO00o.OooO00o(oooo0ooo, readableMap.getMap("candleData")));
        }
        if (C8368oOoOo0o0.OooO00o(readableMap, ReadableType.Map, "bubbleData")) {
            ooooooo0.OooO00o((C8213oOOoOO00) this.f21483OooO00o.OooO00o(oooo0ooo, readableMap.getMap("bubbleData")));
        }
        return ooooooo0;
    }

    @Override // com.p118pd.sdk.AbstractC8385oOoOoo0O
    public C8221oOOoOOo0 OooO00o() {
        throw new UnsupportedOperationException();
    }

    @Override // com.p118pd.sdk.AbstractC8385oOoOoo0O
    public AbstractC8265oOOoooO0<Entry> OooO00o(ArrayList<Entry> arrayList, String str) {
        throw new UnsupportedOperationException();
    }

    @Override // com.p118pd.sdk.AbstractC8385oOoOoo0O
    public void OooO00o(AbstractC8194oOOo0OoO oooo0ooo, AbstractC8265oOOoooO0<Entry> ooooooo0, ReadableMap readableMap) {
        throw new UnsupportedOperationException();
    }

    @Override // com.p118pd.sdk.AbstractC8385oOoOoo0O
    public Entry OooO00o(ReadableArray readableArray, int i) {
        throw new UnsupportedOperationException();
    }
}

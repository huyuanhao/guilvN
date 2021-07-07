package com.p118pd.sdk;

import com.github.mikephil.charting.data.BubbleEntry;
import com.github.mikephil.charting.data.DataSet;
import com.github.mikephil.charting.data.Entry;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.pd.sdk.oOOoOO0O  reason: case insensitive filesystem */
public class C8214oOOoOO0O extends AbstractC8212oOOoO0oo<BubbleEntry> implements AbstractC8263oOOooo0o {
    public float OooO = 2.5f;
    public boolean OooO0o0 = true;
    public float OooO0oo;

    public C8214oOOoOO0O(List<BubbleEntry> list, String str) {
        super(list, str);
    }

    @Override // com.p118pd.sdk.AbstractC8263oOOooo0o, com.p118pd.sdk.AbstractC8205oOOoO, com.p118pd.sdk.AbstractC8265oOOoooO0, com.p118pd.sdk.AbstractC8265oOOoooO0, com.github.mikephil.charting.data.DataSet
    public void OooO00o(float f) {
        this.OooO = AbstractC8352oOoOOoO0.OooO00o(f);
    }

    public void OooO0oO(boolean z) {
        this.OooO0o0 = z;
    }

    @Override // com.p118pd.sdk.AbstractC8263oOOooo0o
    public boolean OooO0oo() {
        return this.OooO0o0;
    }

    @Override // com.p118pd.sdk.AbstractC8263oOOooo0o
    public float OooOo0O() {
        return this.OooO0oo;
    }

    @Override // com.p118pd.sdk.AbstractC8263oOOooo0o
    public float OooOoo0() {
        return this.OooO;
    }

    /* renamed from: OooO00o */
    public void OooO0O0(BubbleEntry bubbleEntry) {
        super.OooO0O0((Entry) bubbleEntry);
        float OooO0OO = bubbleEntry.OooO0OO();
        if (OooO0OO > this.OooO0oo) {
            this.OooO0oo = OooO0OO;
        }
    }

    @Override // com.p118pd.sdk.AbstractC8261oOOooo0, com.p118pd.sdk.AbstractC8212oOOoO0oo, com.p118pd.sdk.AbstractC8205oOOoO, com.p118pd.sdk.AbstractC8205oOOoO, com.p118pd.sdk.AbstractC8205oOOoO, com.p118pd.sdk.AbstractC8205oOOoO, com.p118pd.sdk.AbstractC8205oOOoO, com.p118pd.sdk.AbstractC8205oOOoO, com.p118pd.sdk.AbstractC8205oOOoO, com.p118pd.sdk.AbstractC8205oOOoO, com.p118pd.sdk.AbstractC8265oOOoooO0, com.p118pd.sdk.AbstractC8265oOOoooO0, com.p118pd.sdk.AbstractC8265oOOoooO0, com.p118pd.sdk.AbstractC8265oOOoooO0, com.p118pd.sdk.AbstractC8265oOOoooO0, com.p118pd.sdk.AbstractC8265oOOoooO0, com.p118pd.sdk.AbstractC8265oOOoooO0, com.p118pd.sdk.AbstractC8265oOOoooO0, com.p118pd.sdk.AbstractC8265oOOoooO0, com.github.mikephil.charting.data.DataSet, com.github.mikephil.charting.data.DataSet
    public DataSet<BubbleEntry> OooO00o() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < ((DataSet) this).OooO0OO.size(); i++) {
            arrayList.add(((BubbleEntry) ((DataSet) this).OooO0OO.get(i)).OooO00o());
        }
        C8214oOOoOO0O oooooo0o = new C8214oOOoOO0O(arrayList, m19882OooO00o());
        ((AbstractC8205oOOoO) oooooo0o).f21326OooO00o = ((AbstractC8205oOOoO) this).f21326OooO00o;
        ((AbstractC8212oOOoO0oo) oooooo0o).OooO00o = ((AbstractC8212oOOoO0oo) this).OooO00o;
        return oooooo0o;
    }
}

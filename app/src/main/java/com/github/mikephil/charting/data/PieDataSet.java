package com.github.mikephil.charting.data;

import com.p118pd.sdk.AbstractC8205oOOoO;
import com.p118pd.sdk.AbstractC8269oOOoooo0;
import com.p118pd.sdk.AbstractC8352oOoOOoO0;
import java.util.ArrayList;
import java.util.List;

public class PieDataSet extends DataSet<PieEntry> implements AbstractC8269oOOoooo0 {
    public float OooO = 18.0f;
    public int OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public ValuePosition f14953OooO00o;
    public ValuePosition OooO0O0;
    public boolean OooO0o;
    public boolean OooO0o0;
    public float OooO0oo = 0.0f;
    public float OooOO0;
    public float OooOO0O;
    public float OooOO0o;
    public float OooOOO0;

    public enum ValuePosition {
        INSIDE_SLICE,
        OUTSIDE_SLICE
    }

    public PieDataSet(List<PieEntry> list, String str) {
        super(list, str);
        ValuePosition valuePosition = ValuePosition.INSIDE_SLICE;
        this.f14953OooO00o = valuePosition;
        this.OooO0O0 = valuePosition;
        this.OooO00o = -16777216;
        this.OooOO0 = 1.0f;
        this.OooOO0O = 75.0f;
        this.OooOO0o = 0.3f;
        this.OooOOO0 = 0.4f;
        this.OooO0o = true;
    }

    public void OooO(float f) {
        this.OooOOO0 = f;
    }

    @Override // com.p118pd.sdk.AbstractC8205oOOoO, com.p118pd.sdk.AbstractC8205oOOoO, com.p118pd.sdk.AbstractC8205oOOoO, com.p118pd.sdk.AbstractC8205oOOoO, com.p118pd.sdk.AbstractC8205oOOoO, com.p118pd.sdk.AbstractC8205oOOoO, com.p118pd.sdk.AbstractC8205oOOoO, com.p118pd.sdk.AbstractC8205oOOoO, com.p118pd.sdk.AbstractC8265oOOoooO0, com.p118pd.sdk.AbstractC8265oOOoooO0, com.p118pd.sdk.AbstractC8265oOOoooO0, com.p118pd.sdk.AbstractC8265oOOoooO0, com.p118pd.sdk.AbstractC8265oOOoooO0, com.p118pd.sdk.AbstractC8265oOOoooO0, com.p118pd.sdk.AbstractC8265oOOoooO0, com.p118pd.sdk.AbstractC8265oOOoooO0, com.p118pd.sdk.AbstractC8265oOOoooO0, com.p118pd.sdk.AbstractC8269oOOoooo0, com.p118pd.sdk.AbstractC8269oOOoooo0, com.github.mikephil.charting.data.DataSet, com.github.mikephil.charting.data.DataSet
    /* renamed from: OooO00o  reason: collision with other method in class */
    public DataSet<PieEntry> m15101OooO00o() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < ((DataSet) this).OooO0OO.size(); i++) {
            arrayList.add(((PieEntry) ((DataSet) this).OooO0OO.get(i)).OooO00o());
        }
        PieDataSet pieDataSet = new PieDataSet(arrayList, m19882OooO00o());
        ((AbstractC8205oOOoO) pieDataSet).f21326OooO00o = ((AbstractC8205oOOoO) this).f21326OooO00o;
        pieDataSet.OooO0oo = this.OooO0oo;
        pieDataSet.OooO = this.OooO;
        return pieDataSet;
    }

    @Override // com.p118pd.sdk.AbstractC8205oOOoO, com.p118pd.sdk.AbstractC8265oOOoooO0
    public void OooO0Oo(int i) {
        this.OooO00o = i;
    }

    public void OooO0o(float f) {
        if (f > 20.0f) {
            f = 20.0f;
        }
        if (f < 0.0f) {
            f = 0.0f;
        }
        this.OooO0oo = AbstractC8352oOoOOoO0.OooO00o(f);
    }

    public void OooO0o0(float f) {
        this.OooO = AbstractC8352oOoOOoO0.OooO00o(f);
    }

    public void OooO0oO(boolean z) {
        this.OooO0o0 = z;
    }

    public void OooO0oo(float f) {
        this.OooOO0O = f;
    }

    public void OooOO0(float f) {
        this.OooOO0 = f;
    }

    @Override // com.p118pd.sdk.AbstractC8269oOOoooo0
    public boolean OooOOoo() {
        return this.OooO0o0;
    }

    @Override // com.p118pd.sdk.AbstractC8269oOOoooo0
    public float OooOo0() {
        return this.OooOO0;
    }

    @Override // com.p118pd.sdk.AbstractC8205oOOoO, com.p118pd.sdk.AbstractC8265oOOoooO0, com.p118pd.sdk.AbstractC8269oOOoooo0
    public float OooOo00() {
        return this.OooOOO0;
    }

    @Override // com.p118pd.sdk.AbstractC8269oOOoooo0
    public float OooOo0o() {
        return this.OooOO0o;
    }

    @Override // com.p118pd.sdk.AbstractC8269oOOoooo0
    public float OooOoO0() {
        return this.OooOO0O;
    }

    @Override // com.p118pd.sdk.AbstractC8269oOOoooo0
    public float OooOoOO() {
        return this.OooO;
    }

    @Override // com.p118pd.sdk.AbstractC8205oOOoO, com.p118pd.sdk.AbstractC8205oOOoO, com.p118pd.sdk.AbstractC8205oOOoO, com.p118pd.sdk.AbstractC8265oOOoooO0, com.p118pd.sdk.AbstractC8269oOOoooo0, com.github.mikephil.charting.data.DataSet
    public ValuePosition OooO0O0() {
        return this.OooO0O0;
    }

    @Override // com.p118pd.sdk.AbstractC8205oOOoO, com.p118pd.sdk.AbstractC8265oOOoooO0, com.p118pd.sdk.AbstractC8265oOOoooO0, com.p118pd.sdk.AbstractC8269oOOoooo0, com.github.mikephil.charting.data.DataSet
    public int OooO0o0() {
        return this.OooO00o;
    }

    public void OooO0oO(float f) {
        this.OooOO0o = f;
    }

    public void OooO0oo(boolean z) {
        this.OooO0o = z;
    }

    @Override // com.p118pd.sdk.AbstractC8269oOOoooo0
    public boolean OooOO0() {
        return this.OooO0o;
    }

    public void OooO0O0(ValuePosition valuePosition) {
        this.OooO0O0 = valuePosition;
    }

    /* renamed from: OooO00o */
    public void OooO0O0(PieEntry pieEntry) {
        if (pieEntry != null) {
            OooO0Oo(pieEntry);
        }
    }

    /* Return type fixed from 'float' to match base method */
    @Override // com.p118pd.sdk.AbstractC8205oOOoO, com.p118pd.sdk.AbstractC8205oOOoO, com.p118pd.sdk.AbstractC8205oOOoO, com.p118pd.sdk.AbstractC8205oOOoO, com.p118pd.sdk.AbstractC8205oOOoO, com.p118pd.sdk.AbstractC8205oOOoO, com.p118pd.sdk.AbstractC8205oOOoO, com.p118pd.sdk.AbstractC8205oOOoO, com.p118pd.sdk.AbstractC8265oOOoooO0, com.p118pd.sdk.AbstractC8265oOOoooO0, com.p118pd.sdk.AbstractC8265oOOoooO0, com.p118pd.sdk.AbstractC8265oOOoooO0, com.p118pd.sdk.AbstractC8265oOOoooO0, com.p118pd.sdk.AbstractC8265oOOoooO0, com.p118pd.sdk.AbstractC8265oOOoooO0, com.p118pd.sdk.AbstractC8265oOOoooO0, com.p118pd.sdk.AbstractC8265oOOoooO0, com.p118pd.sdk.AbstractC8269oOOoooo0, com.p118pd.sdk.AbstractC8269oOOoooo0, com.github.mikephil.charting.data.DataSet, com.github.mikephil.charting.data.DataSet
    public DataSet<PieEntry> OooO00o() {
        return this.OooO0oo;
    }

    /* Return type fixed from 'com.github.mikephil.charting.data.PieDataSet$ValuePosition' to match base method */
    @Override // com.p118pd.sdk.AbstractC8205oOOoO, com.p118pd.sdk.AbstractC8205oOOoO, com.p118pd.sdk.AbstractC8205oOOoO, com.p118pd.sdk.AbstractC8205oOOoO, com.p118pd.sdk.AbstractC8205oOOoO, com.p118pd.sdk.AbstractC8205oOOoO, com.p118pd.sdk.AbstractC8205oOOoO, com.p118pd.sdk.AbstractC8205oOOoO, com.p118pd.sdk.AbstractC8265oOOoooO0, com.p118pd.sdk.AbstractC8265oOOoooO0, com.p118pd.sdk.AbstractC8265oOOoooO0, com.p118pd.sdk.AbstractC8265oOOoooO0, com.p118pd.sdk.AbstractC8265oOOoooO0, com.p118pd.sdk.AbstractC8265oOOoooO0, com.p118pd.sdk.AbstractC8265oOOoooO0, com.p118pd.sdk.AbstractC8265oOOoooO0, com.p118pd.sdk.AbstractC8265oOOoooO0, com.p118pd.sdk.AbstractC8269oOOoooo0, com.p118pd.sdk.AbstractC8269oOOoooo0, com.github.mikephil.charting.data.DataSet, com.github.mikephil.charting.data.DataSet
    /* renamed from: OooO00o  reason: collision with other method in class */
    public DataSet<PieEntry> m15102OooO00o() {
        return this.f14953OooO00o;
    }

    public void OooO00o(ValuePosition valuePosition) {
        this.f14953OooO00o = valuePosition;
    }
}

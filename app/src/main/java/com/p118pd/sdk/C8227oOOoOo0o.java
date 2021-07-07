package com.p118pd.sdk;

import com.github.mikephil.charting.data.DataSet;
import com.github.mikephil.charting.data.RadarEntry;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.pd.sdk.oOOoOo0o  reason: case insensitive filesystem */
public class C8227oOOoOo0o extends AbstractC8222oOOoOOoO<RadarEntry> implements AbstractC8268oOOoooo {
    public int OooO0Oo = -1;
    public int OooO0o = 76;
    public int OooO0o0 = C8342oOoOOOOO.OooO00o;
    public boolean OooO0oo = false;
    public float OooOO0 = 3.0f;
    public float OooOO0O = 4.0f;
    public float OooOO0o = 2.0f;

    public C8227oOOoOo0o(List<RadarEntry> list, String str) {
        super(list, str);
    }

    @Override // com.p118pd.sdk.AbstractC8268oOOoooo, com.p118pd.sdk.AbstractC8268oOOoooo, com.p118pd.sdk.AbstractC8265oOOoooO0, com.github.mikephil.charting.data.DataSet
    /* renamed from: OooO  reason: collision with other method in class */
    public boolean m19928OooO() {
        return this.OooO0oo;
    }

    @Override // com.p118pd.sdk.AbstractC8261oOOooo0, com.p118pd.sdk.AbstractC8212oOOoO0oo, com.p118pd.sdk.AbstractC8266oOOoooOO, com.p118pd.sdk.AbstractC8205oOOoO, com.p118pd.sdk.AbstractC8205oOOoO, com.p118pd.sdk.AbstractC8205oOOoO, com.p118pd.sdk.AbstractC8205oOOoO, com.p118pd.sdk.AbstractC8205oOOoO, com.p118pd.sdk.AbstractC8205oOOoO, com.p118pd.sdk.AbstractC8205oOOoO, com.p118pd.sdk.AbstractC8205oOOoO, com.p118pd.sdk.AbstractC8222oOOoOOoO, com.p118pd.sdk.AbstractC8265oOOoooO0, com.p118pd.sdk.AbstractC8265oOOoooO0, com.p118pd.sdk.AbstractC8265oOOoooO0, com.p118pd.sdk.AbstractC8265oOOoooO0, com.p118pd.sdk.AbstractC8265oOOoooO0, com.p118pd.sdk.AbstractC8265oOOoooO0, com.p118pd.sdk.AbstractC8265oOOoooO0, com.p118pd.sdk.AbstractC8265oOOoooO0, com.p118pd.sdk.AbstractC8265oOOoooO0, com.github.mikephil.charting.data.DataSet, com.github.mikephil.charting.data.DataSet
    public DataSet<RadarEntry> OooO00o() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < ((DataSet) this).OooO0OO.size(); i++) {
            arrayList.add(((RadarEntry) ((DataSet) this).OooO0OO.get(i)).OooO00o());
        }
        C8227oOOoOo0o oooooo0o = new C8227oOOoOo0o(arrayList, m19882OooO00o());
        ((AbstractC8205oOOoO) oooooo0o).f21326OooO00o = ((AbstractC8205oOOoO) this).f21326OooO00o;
        ((AbstractC8212oOOoO0oo) oooooo0o).OooO00o = ((AbstractC8212oOOoO0oo) this).OooO00o;
        return oooooo0o;
    }

    @Override // com.p118pd.sdk.AbstractC8268oOOoooo
    public void OooO0OO(boolean z) {
        this.OooO0oo = z;
    }

    public void OooO0oO(int i) {
        this.OooO0Oo = i;
    }

    public void OooO0oo(int i) {
        this.OooO0o = i;
    }

    @Override // com.p118pd.sdk.AbstractC8268oOOoooo, com.p118pd.sdk.AbstractC8266oOOoooOO, com.p118pd.sdk.AbstractC8222oOOoOOoO
    public float OooOO0() {
        return this.OooOO0O;
    }

    @Override // com.p118pd.sdk.AbstractC8268oOOoooo, com.p118pd.sdk.AbstractC8267oOOoooOo, com.p118pd.sdk.AbstractC8223oOOoOOoo
    public float OooOOOo() {
        return this.OooOO0;
    }

    @Override // com.p118pd.sdk.AbstractC8268oOOoooo
    public int OooOo0() {
        return this.OooO0o0;
    }

    @Override // com.p118pd.sdk.AbstractC8268oOOoooo, com.p118pd.sdk.AbstractC8205oOOoO, com.p118pd.sdk.AbstractC8265oOOoooO0
    public int OooOo00() {
        return this.OooO0o;
    }

    @Override // com.p118pd.sdk.AbstractC8268oOOoooo, com.p118pd.sdk.AbstractC8268oOOoooo, com.p118pd.sdk.AbstractC8265oOOoooO0, com.github.mikephil.charting.data.DataSet
    public int OooO() {
        return this.OooO0Oo;
    }

    @Override // com.p118pd.sdk.AbstractC8268oOOoooo, com.p118pd.sdk.AbstractC8267oOOoooOo, com.p118pd.sdk.AbstractC8205oOOoO, com.p118pd.sdk.AbstractC8205oOOoO, com.p118pd.sdk.AbstractC8223oOOoOOoo, com.p118pd.sdk.AbstractC8265oOOoooO0, com.github.mikephil.charting.data.DataSet
    public float OooO0OO() {
        return this.OooOO0o;
    }

    public void OooO0oO(float f) {
        this.OooOO0 = f;
    }

    public void OooO0oo(float f) {
        this.OooOO0O = f;
    }

    public void OooO(int i) {
        this.OooO0o0 = i;
    }

    public void OooO(float f) {
        this.OooOO0o = f;
    }
}

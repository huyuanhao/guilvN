package com.p118pd.sdk;

import android.graphics.Paint;
import com.github.mikephil.charting.data.CandleEntry;
import com.github.mikephil.charting.data.DataSet;
import com.github.mikephil.charting.data.Entry;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.pd.sdk.oOOoOOOO  reason: case insensitive filesystem */
public class C8218oOOoOOOO extends AbstractC8223oOOoOOoo<CandleEntry> implements AbstractC8260oOOooo {
    public float OooO = 3.0f;
    public Paint.Style OooO00o = Paint.Style.STROKE;
    public int OooO0O0 = C8342oOoOOOOO.OooO0O0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public Paint.Style f21338OooO0O0 = Paint.Style.FILL;
    public int OooO0OO = C8342oOoOOOOO.OooO0O0;
    public int OooO0Oo = C8342oOoOOOOO.OooO0O0;
    public int OooO0o0 = C8342oOoOOOOO.OooO0O0;
    public boolean OooO0oO = true;
    public boolean OooO0oo = false;
    public float OooOO0 = 0.1f;

    public C8218oOOoOOOO(List<CandleEntry> list, String str) {
        super(list, str);
    }

    @Override // com.p118pd.sdk.AbstractC8260oOOooo, com.p118pd.sdk.AbstractC8261oOOooo0, com.p118pd.sdk.AbstractC8212oOOoO0oo, com.p118pd.sdk.AbstractC8205oOOoO, com.p118pd.sdk.AbstractC8205oOOoO, com.p118pd.sdk.AbstractC8205oOOoO, com.p118pd.sdk.AbstractC8205oOOoO, com.p118pd.sdk.AbstractC8205oOOoO, com.p118pd.sdk.AbstractC8205oOOoO, com.p118pd.sdk.AbstractC8205oOOoO, com.p118pd.sdk.AbstractC8205oOOoO, com.p118pd.sdk.AbstractC8265oOOoooO0, com.p118pd.sdk.AbstractC8265oOOoooO0, com.p118pd.sdk.AbstractC8265oOOoooO0, com.p118pd.sdk.AbstractC8265oOOoooO0, com.p118pd.sdk.AbstractC8265oOOoooO0, com.p118pd.sdk.AbstractC8265oOOoooO0, com.p118pd.sdk.AbstractC8265oOOoooO0, com.p118pd.sdk.AbstractC8265oOOoooO0, com.p118pd.sdk.AbstractC8265oOOoooO0, com.github.mikephil.charting.data.DataSet, com.github.mikephil.charting.data.DataSet
    /* renamed from: OooO00o  reason: collision with other method in class */
    public DataSet<CandleEntry> m19900OooO00o() {
        ArrayList arrayList = new ArrayList();
        arrayList.clear();
        for (int i = 0; i < ((DataSet) this).OooO0OO.size(); i++) {
            arrayList.add(((CandleEntry) ((DataSet) this).OooO0OO.get(i)).OooO00o());
        }
        C8218oOOoOOOO oooooooo = new C8218oOOoOOOO(arrayList, m19882OooO00o());
        ((AbstractC8205oOOoO) oooooooo).f21326OooO00o = ((AbstractC8205oOOoO) this).f21326OooO00o;
        oooooooo.OooO = this.OooO;
        oooooooo.OooO0oO = this.OooO0oO;
        oooooooo.OooOO0 = this.OooOO0;
        ((AbstractC8212oOOoO0oo) oooooooo).OooO00o = ((AbstractC8212oOOoO0oo) this).OooO00o;
        oooooooo.OooO00o = this.OooO00o;
        oooooooo.f21338OooO0O0 = this.f21338OooO0O0;
        oooooooo.OooO0o0 = this.OooO0o0;
        return oooooooo;
    }

    @Override // com.p118pd.sdk.AbstractC8260oOOooo, com.p118pd.sdk.AbstractC8267oOOoooOo, com.p118pd.sdk.AbstractC8205oOOoO, com.p118pd.sdk.AbstractC8205oOOoO, com.p118pd.sdk.AbstractC8223oOOoOOoo, com.p118pd.sdk.AbstractC8265oOOoooO0, com.github.mikephil.charting.data.DataSet
    public int OooO0OO() {
        return this.OooO0O0;
    }

    public void OooO0o(float f) {
        if (f < 0.0f) {
            f = 0.0f;
        }
        if (f > 0.45f) {
            f = 0.45f;
        }
        this.OooOO0 = f;
    }

    public void OooO0o0(int i) {
        this.OooO0Oo = i;
    }

    public void OooO0oO(float f) {
        this.OooO = AbstractC8352oOoOOoO0.OooO00o(f);
    }

    @Override // com.p118pd.sdk.AbstractC8260oOOooo
    public float OooO0oo() {
        return this.OooO;
    }

    public void OooOO0(boolean z) {
        this.OooO0oo = z;
    }

    public void OooOO0O(boolean z) {
        this.OooO0oO = z;
    }

    @Override // com.p118pd.sdk.AbstractC8260oOOooo, com.p118pd.sdk.AbstractC8260oOOooo
    public float OooOO0o() {
        return this.OooOO0;
    }

    @Override // com.p118pd.sdk.AbstractC8260oOOooo, com.p118pd.sdk.AbstractC8205oOOoO, com.p118pd.sdk.AbstractC8265oOOoooO0
    public int OooOOO() {
        return this.OooO0Oo;
    }

    @Override // com.p118pd.sdk.AbstractC8260oOOooo, com.p118pd.sdk.AbstractC8260oOOooo
    /* renamed from: OooOOO0  reason: collision with other method in class */
    public boolean m19902OooOOO0() {
        return this.OooO0oO;
    }

    @Override // com.p118pd.sdk.AbstractC8260oOOooo
    public boolean OooOo0() {
        return this.OooO0oo;
    }

    /* renamed from: OooO0O0 */
    public void OooO0Oo(CandleEntry candleEntry) {
        if (candleEntry.OooO0o0() < ((DataSet) this).OooO0o0) {
            ((DataSet) this).OooO0o0 = candleEntry.OooO0o0();
        }
        if (candleEntry.OooO0o0() > ((DataSet) this).OooO0Oo) {
            ((DataSet) this).OooO0Oo = candleEntry.OooO0o0();
        }
        if (candleEntry.OooO0o() < ((DataSet) this).OooO0o0) {
            ((DataSet) this).OooO0o0 = candleEntry.OooO0o();
        }
        if (candleEntry.OooO0o() > ((DataSet) this).OooO0Oo) {
            ((DataSet) this).OooO0Oo = candleEntry.OooO0o();
        }
    }

    public void OooO0o(int i) {
        this.OooO0OO = i;
    }

    public void OooO0oO(int i) {
        this.OooO0O0 = i;
    }

    public void OooO0oo(int i) {
        this.OooO0o0 = i;
    }

    @Override // com.p118pd.sdk.AbstractC8260oOOooo, com.p118pd.sdk.AbstractC8260oOOooo
    /* renamed from: OooOO0o  reason: collision with other method in class */
    public int m19901OooOO0o() {
        return this.OooO0OO;
    }

    @Override // com.p118pd.sdk.AbstractC8260oOOooo, com.p118pd.sdk.AbstractC8260oOOooo
    public int OooOOO0() {
        return this.OooO0o0;
    }

    @Override // com.p118pd.sdk.AbstractC8260oOOooo, com.p118pd.sdk.AbstractC8205oOOoO, com.p118pd.sdk.AbstractC8205oOOoO, com.p118pd.sdk.AbstractC8205oOOoO, com.p118pd.sdk.AbstractC8265oOOoooO0, com.github.mikephil.charting.data.DataSet
    public Paint.Style OooO0O0() {
        return this.OooO00o;
    }

    public void OooO0O0(Paint.Style style) {
        this.OooO00o = style;
    }

    /* renamed from: OooO00o */
    public void OooO0O0(CandleEntry candleEntry) {
        if (candleEntry.OooO0o() < ((DataSet) this).OooO0o0) {
            ((DataSet) this).OooO0o0 = candleEntry.OooO0o();
        }
        if (candleEntry.OooO0o0() > ((DataSet) this).OooO0Oo) {
            ((DataSet) this).OooO0Oo = candleEntry.OooO0o0();
        }
        OooO0OO((Entry) candleEntry);
    }

    @Override // com.p118pd.sdk.AbstractC8260oOOooo, com.p118pd.sdk.AbstractC8261oOOooo0, com.p118pd.sdk.AbstractC8212oOOoO0oo, com.p118pd.sdk.AbstractC8205oOOoO, com.p118pd.sdk.AbstractC8205oOOoO, com.p118pd.sdk.AbstractC8205oOOoO, com.p118pd.sdk.AbstractC8205oOOoO, com.p118pd.sdk.AbstractC8205oOOoO, com.p118pd.sdk.AbstractC8205oOOoO, com.p118pd.sdk.AbstractC8205oOOoO, com.p118pd.sdk.AbstractC8205oOOoO, com.p118pd.sdk.AbstractC8265oOOoooO0, com.p118pd.sdk.AbstractC8265oOOoooO0, com.p118pd.sdk.AbstractC8265oOOoooO0, com.p118pd.sdk.AbstractC8265oOOoooO0, com.p118pd.sdk.AbstractC8265oOOoooO0, com.p118pd.sdk.AbstractC8265oOOoooO0, com.p118pd.sdk.AbstractC8265oOOoooO0, com.p118pd.sdk.AbstractC8265oOOoooO0, com.p118pd.sdk.AbstractC8265oOOoooO0, com.github.mikephil.charting.data.DataSet, com.github.mikephil.charting.data.DataSet
    public Paint.Style OooO00o() {
        return this.f21338OooO0O0;
    }

    public void OooO00o(Paint.Style style) {
        this.f21338OooO0O0 = style;
    }
}

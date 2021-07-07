package com.p118pd.sdk;

import android.content.Context;
import android.graphics.Color;
import android.graphics.DashPathEffect;
import android.graphics.Typeface;
import com.github.mikephil.charting.components.Legend;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.Entry;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.pd.sdk.oOOoO  reason: case insensitive filesystem */
public abstract class AbstractC8205oOOoO<T extends Entry> implements AbstractC8265oOOoooO0<T> {
    public float OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public DashPathEffect f21319OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Typeface f21320OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Legend.LegendForm f21321OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public YAxis.AxisDependency f21322OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public transient AbstractC8239oOOoo00O f21323OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C8349oOoOOo00 f21324OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public String f21325OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public List<Integer> f21326OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public boolean f21327OooO00o;
    public float OooO0O0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public List<Integer> f21328OooO0O0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public boolean f21329OooO0O0;
    public float OooO0OO;

    /* renamed from: OooO0OO  reason: collision with other field name */
    public boolean f21330OooO0OO;
    public boolean OooO0Oo;

    public AbstractC8205oOOoO() {
        this.f21326OooO00o = null;
        this.f21328OooO0O0 = null;
        this.f21325OooO00o = "DataSet";
        this.f21322OooO00o = YAxis.AxisDependency.LEFT;
        this.f21327OooO00o = true;
        this.f21321OooO00o = Legend.LegendForm.DEFAULT;
        this.OooO00o = Float.NaN;
        this.OooO0O0 = Float.NaN;
        this.f21319OooO00o = null;
        this.f21329OooO0O0 = true;
        this.f21330OooO0OO = true;
        this.f21324OooO00o = new C8349oOoOOo00();
        this.OooO0OO = 17.0f;
        this.OooO0Oo = true;
        this.f21326OooO00o = new ArrayList();
        this.f21328OooO0O0 = new ArrayList();
        this.f21326OooO00o.add(Integer.valueOf(Color.rgb(140, 234, 255)));
        this.f21328OooO0O0.add(-16777216);
    }

    @Override // com.p118pd.sdk.AbstractC8265oOOoooO0, com.p118pd.sdk.AbstractC8265oOOoooO0, com.p118pd.sdk.AbstractC8265oOOoooO0, com.p118pd.sdk.AbstractC8265oOOoooO0, com.p118pd.sdk.AbstractC8265oOOoooO0, com.p118pd.sdk.AbstractC8265oOOoooO0, com.p118pd.sdk.AbstractC8265oOOoooO0, com.p118pd.sdk.AbstractC8265oOOoooO0, com.p118pd.sdk.AbstractC8265oOOoooO0
    /* renamed from: OooO00o  reason: collision with other method in class */
    public List<Integer> m19883OooO00o() {
        return this.f21326OooO00o;
    }

    @Override // com.p118pd.sdk.AbstractC8265oOOoooO0
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public void m19886OooO0O0() {
        m19956OooO00o();
    }

    @Override // com.p118pd.sdk.AbstractC8265oOOoooO0
    /* renamed from: OooO0OO  reason: collision with other method in class */
    public void m19888OooO0OO(int i) {
        OooO0OO();
        this.f21326OooO00o.add(Integer.valueOf(i));
    }

    @Override // com.p118pd.sdk.AbstractC8265oOOoooO0
    public int OooO0Oo(int i) {
        List<Integer> list = this.f21328OooO0O0;
        return list.get(i % list.size()).intValue();
    }

    @Override // com.p118pd.sdk.AbstractC8265oOOoooO0
    public void OooO0o(boolean z) {
        this.OooO0Oo = z;
    }

    @Override // com.p118pd.sdk.AbstractC8265oOOoooO0
    public void OooO0o0(boolean z) {
        this.f21330OooO0OO = z;
    }

    @Override // com.p118pd.sdk.AbstractC8265oOOoooO0, com.p118pd.sdk.AbstractC8265oOOoooO0
    /* renamed from: OooO0oO  reason: collision with other method in class */
    public boolean m19890OooO0oO() {
        return this.f21323OooO00o == null;
    }

    @Override // com.p118pd.sdk.AbstractC8265oOOoooO0
    public float OooOOO() {
        return this.OooO0O0;
    }

    @Override // com.p118pd.sdk.AbstractC8265oOOoooO0, com.p118pd.sdk.AbstractC8265oOOoooO0
    /* renamed from: OooOOOO  reason: collision with other method in class */
    public int m19891OooOOOO() {
        return this.f21326OooO00o.get(0).intValue();
    }

    @Override // com.p118pd.sdk.AbstractC8265oOOoooO0, com.p118pd.sdk.AbstractC8265oOOoooO0
    public float OooOOo0() {
        return this.OooO0OO;
    }

    @Override // com.p118pd.sdk.AbstractC8265oOOoooO0
    public boolean OooOo00() {
        return this.f21330OooO0OO;
    }

    @Override // com.p118pd.sdk.AbstractC8265oOOoooO0
    public boolean isVisible() {
        return this.OooO0Oo;
    }

    @Override // com.p118pd.sdk.AbstractC8265oOOoooO0, com.p118pd.sdk.AbstractC8265oOOoooO0, com.p118pd.sdk.AbstractC8265oOOoooO0, com.p118pd.sdk.AbstractC8265oOOoooO0
    public int OooO00o(int i) {
        List<Integer> list = this.f21326OooO00o;
        return list.get(i % list.size()).intValue();
    }

    @Override // com.p118pd.sdk.AbstractC8265oOOoooO0
    public List<Integer> OooO0O0() {
        return this.f21328OooO0O0;
    }

    public void OooO0Oo(float f) {
        this.OooO00o = f;
    }

    @Override // com.p118pd.sdk.AbstractC8265oOOoooO0, com.p118pd.sdk.AbstractC8265oOOoooO0
    public boolean OooO0o0() {
        if (OooO0Oo() > 0) {
            return OooO0O0(m19951OooO00o(0));
        }
        return false;
    }

    @Override // com.p118pd.sdk.AbstractC8265oOOoooO0, com.p118pd.sdk.AbstractC8265oOOoooO0
    public int OooO0oO() {
        return this.f21328OooO0O0.get(0).intValue();
    }

    @Override // com.p118pd.sdk.AbstractC8265oOOoooO0, com.p118pd.sdk.AbstractC8265oOOoooO0
    public float OooOOOO() {
        return this.OooO00o;
    }

    @Override // com.p118pd.sdk.AbstractC8265oOOoooO0, com.p118pd.sdk.AbstractC8265oOOoooO0
    /* renamed from: OooOOo0  reason: collision with other method in class */
    public boolean m19892OooOOo0() {
        if (OooO0Oo() > 0) {
            return OooO0O0(m19951OooO00o(OooO0Oo() - 1));
        }
        return false;
    }

    public void OooO00o(int... iArr) {
        this.f21326OooO00o = C8342oOoOOOOO.OooO00o(iArr);
    }

    public void OooO0O0(List<Integer> list) {
        this.f21326OooO00o = list;
    }

    @Override // com.p118pd.sdk.AbstractC8265oOOoooO0
    public void OooO0OO() {
        if (this.f21326OooO00o == null) {
            this.f21326OooO00o = new ArrayList();
        }
        this.f21326OooO00o.clear();
    }

    public void OooO00o(int[] iArr, Context context) {
        if (this.f21326OooO00o == null) {
            this.f21326OooO00o = new ArrayList();
        }
        this.f21326OooO00o.clear();
        for (int i : iArr) {
            this.f21326OooO00o.add(Integer.valueOf(context.getResources().getColor(i)));
        }
    }

    public void OooO0O0(int i) {
        if (this.f21326OooO00o == null) {
            this.f21326OooO00o = new ArrayList();
        }
        this.f21326OooO00o.add(Integer.valueOf(i));
    }

    public void OooO0OO(float f) {
        this.OooO0O0 = f;
    }

    @Override // com.p118pd.sdk.AbstractC8265oOOoooO0
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public boolean m19887OooO0O0() {
        return this.f21327OooO00o;
    }

    @Override // com.p118pd.sdk.AbstractC8265oOOoooO0
    /* renamed from: OooO0OO  reason: collision with other method in class */
    public boolean m19889OooO0OO() {
        return this.f21329OooO0O0;
    }

    @Override // com.p118pd.sdk.AbstractC8265oOOoooO0
    public void OooO0O0(float f) {
        this.OooO0OO = AbstractC8352oOoOOoO0.OooO00o(f);
    }

    @Override // com.p118pd.sdk.AbstractC8265oOOoooO0
    public int OooO0OO(int i) {
        for (int i2 = 0; i2 < OooO0Oo(); i2++) {
            if (((float) i) == m19951OooO00o(i2).OooO0O0()) {
                return i2;
            }
        }
        return -1;
    }

    public void OooO00o(int i, int i2) {
        m19888OooO0OO(Color.argb(i2, Color.red(i), Color.green(i), Color.blue(i)));
    }

    @Override // com.p118pd.sdk.AbstractC8265oOOoooO0
    public void OooO0O0(boolean z) {
        this.f21329OooO0O0 = z;
    }

    public void OooO00o(int[] iArr, int i) {
        OooO0OO();
        for (int i2 : iArr) {
            OooO0O0(Color.argb(i, Color.red(i2), Color.green(i2), Color.blue(i2)));
        }
    }

    @Override // com.p118pd.sdk.AbstractC8265oOOoooO0
    public void OooO00o(String str) {
        this.f21325OooO00o = str;
    }

    @Override // com.p118pd.sdk.AbstractC8265oOOoooO0, com.p118pd.sdk.AbstractC8265oOOoooO0, com.p118pd.sdk.AbstractC8265oOOoooO0, com.p118pd.sdk.AbstractC8265oOOoooO0, com.p118pd.sdk.AbstractC8265oOOoooO0, com.p118pd.sdk.AbstractC8265oOOoooO0, com.p118pd.sdk.AbstractC8265oOOoooO0, com.p118pd.sdk.AbstractC8265oOOoooO0, com.p118pd.sdk.AbstractC8265oOOoooO0
    /* renamed from: OooO00o  reason: collision with other method in class */
    public String m19882OooO00o() {
        return this.f21325OooO00o;
    }

    @Override // com.p118pd.sdk.AbstractC8265oOOoooO0
    public void OooO00o(boolean z) {
        this.f21327OooO00o = z;
    }

    @Override // com.p118pd.sdk.AbstractC8265oOOoooO0
    public void OooO00o(AbstractC8239oOOoo00O ooooo00o) {
        if (ooooo00o != null) {
            this.f21323OooO00o = ooooo00o;
        }
    }

    @Override // com.p118pd.sdk.AbstractC8265oOOoooO0, com.p118pd.sdk.AbstractC8265oOOoooO0, com.p118pd.sdk.AbstractC8265oOOoooO0, com.p118pd.sdk.AbstractC8265oOOoooO0, com.p118pd.sdk.AbstractC8265oOOoooO0, com.p118pd.sdk.AbstractC8265oOOoooO0, com.p118pd.sdk.AbstractC8265oOOoooO0, com.p118pd.sdk.AbstractC8265oOOoooO0, com.p118pd.sdk.AbstractC8265oOOoooO0
    /* renamed from: OooO00o  reason: collision with other method in class */
    public AbstractC8239oOOoo00O m19880OooO00o() {
        if (m19890OooO0oO()) {
            return AbstractC8352oOoOOoO0.m20024OooO0O0();
        }
        return this.f21323OooO00o;
    }

    public AbstractC8205oOOoO(String str) {
        this();
        this.f21325OooO00o = str;
    }

    @Override // com.p118pd.sdk.AbstractC8265oOOoooO0, com.p118pd.sdk.AbstractC8265oOOoooO0, com.p118pd.sdk.AbstractC8265oOOoooO0, com.p118pd.sdk.AbstractC8265oOOoooO0
    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m19884OooO00o(int i) {
        this.f21328OooO0O0.clear();
        this.f21328OooO0O0.add(Integer.valueOf(i));
    }

    @Override // com.p118pd.sdk.AbstractC8265oOOoooO0
    public void OooO00o(List<Integer> list) {
        this.f21328OooO0O0 = list;
    }

    @Override // com.p118pd.sdk.AbstractC8265oOOoooO0
    public void OooO00o(Typeface typeface) {
        this.f21320OooO00o = typeface;
    }

    @Override // com.p118pd.sdk.AbstractC8265oOOoooO0, com.p118pd.sdk.AbstractC8265oOOoooO0, com.p118pd.sdk.AbstractC8265oOOoooO0, com.p118pd.sdk.AbstractC8265oOOoooO0, com.p118pd.sdk.AbstractC8265oOOoooO0, com.p118pd.sdk.AbstractC8265oOOoooO0, com.p118pd.sdk.AbstractC8265oOOoooO0, com.p118pd.sdk.AbstractC8265oOOoooO0, com.p118pd.sdk.AbstractC8265oOOoooO0
    /* renamed from: OooO00o  reason: collision with other method in class */
    public Typeface m19877OooO00o() {
        return this.f21320OooO00o;
    }

    public void OooO00o(Legend.LegendForm legendForm) {
        this.f21321OooO00o = legendForm;
    }

    @Override // com.p118pd.sdk.AbstractC8265oOOoooO0, com.p118pd.sdk.AbstractC8265oOOoooO0, com.p118pd.sdk.AbstractC8265oOOoooO0, com.p118pd.sdk.AbstractC8265oOOoooO0, com.p118pd.sdk.AbstractC8265oOOoooO0, com.p118pd.sdk.AbstractC8265oOOoooO0, com.p118pd.sdk.AbstractC8265oOOoooO0, com.p118pd.sdk.AbstractC8265oOOoooO0, com.p118pd.sdk.AbstractC8265oOOoooO0
    /* renamed from: OooO00o  reason: collision with other method in class */
    public Legend.LegendForm m19878OooO00o() {
        return this.f21321OooO00o;
    }

    public void OooO00o(DashPathEffect dashPathEffect) {
        this.f21319OooO00o = dashPathEffect;
    }

    @Override // com.p118pd.sdk.AbstractC8265oOOoooO0, com.p118pd.sdk.AbstractC8265oOOoooO0, com.p118pd.sdk.AbstractC8265oOOoooO0, com.p118pd.sdk.AbstractC8265oOOoooO0, com.p118pd.sdk.AbstractC8265oOOoooO0, com.p118pd.sdk.AbstractC8265oOOoooO0, com.p118pd.sdk.AbstractC8265oOOoooO0, com.p118pd.sdk.AbstractC8265oOOoooO0, com.p118pd.sdk.AbstractC8265oOOoooO0
    public DashPathEffect OooO00o() {
        return this.f21319OooO00o;
    }

    @Override // com.p118pd.sdk.AbstractC8265oOOoooO0
    public void OooO00o(C8349oOoOOo00 oooooo00) {
        C8349oOoOOo00 oooooo002 = this.f21324OooO00o;
        oooooo002.f21456OooO00o = oooooo00.f21456OooO00o;
        oooooo002.OooO0O0 = oooooo00.OooO0O0;
    }

    @Override // com.p118pd.sdk.AbstractC8265oOOoooO0, com.p118pd.sdk.AbstractC8265oOOoooO0, com.p118pd.sdk.AbstractC8265oOOoooO0, com.p118pd.sdk.AbstractC8265oOOoooO0, com.p118pd.sdk.AbstractC8265oOOoooO0, com.p118pd.sdk.AbstractC8265oOOoooO0, com.p118pd.sdk.AbstractC8265oOOoooO0, com.p118pd.sdk.AbstractC8265oOOoooO0, com.p118pd.sdk.AbstractC8265oOOoooO0
    /* renamed from: OooO00o  reason: collision with other method in class */
    public C8349oOoOOo00 m19881OooO00o() {
        return this.f21324OooO00o;
    }

    @Override // com.p118pd.sdk.AbstractC8265oOOoooO0, com.p118pd.sdk.AbstractC8265oOOoooO0, com.p118pd.sdk.AbstractC8265oOOoooO0, com.p118pd.sdk.AbstractC8265oOOoooO0, com.p118pd.sdk.AbstractC8265oOOoooO0, com.p118pd.sdk.AbstractC8265oOOoooO0, com.p118pd.sdk.AbstractC8265oOOoooO0, com.p118pd.sdk.AbstractC8265oOOoooO0, com.p118pd.sdk.AbstractC8265oOOoooO0
    /* renamed from: OooO00o  reason: collision with other method in class */
    public YAxis.AxisDependency m19879OooO00o() {
        return this.f21322OooO00o;
    }

    @Override // com.p118pd.sdk.AbstractC8265oOOoooO0
    public void OooO00o(YAxis.AxisDependency axisDependency) {
        this.f21322OooO00o = axisDependency;
    }

    @Override // com.p118pd.sdk.AbstractC8265oOOoooO0, com.p118pd.sdk.AbstractC8265oOOoooO0
    public boolean OooO00o(float f) {
        return OooO0O0(OooO00o(f, Float.NaN));
    }

    @Override // com.p118pd.sdk.AbstractC8265oOOoooO0, com.p118pd.sdk.AbstractC8265oOOoooO0, com.p118pd.sdk.AbstractC8265oOOoooO0, com.p118pd.sdk.AbstractC8265oOOoooO0
    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m19885OooO00o(int i) {
        return OooO0O0(m19951OooO00o(i));
    }

    @Override // com.p118pd.sdk.AbstractC8265oOOoooO0, com.p118pd.sdk.AbstractC8265oOOoooO0, com.p118pd.sdk.AbstractC8265oOOoooO0
    public boolean OooO00o(T t) {
        for (int i = 0; i < OooO0Oo(); i++) {
            if (m19951OooO00o(i).equals(t)) {
                return true;
            }
        }
        return false;
    }
}

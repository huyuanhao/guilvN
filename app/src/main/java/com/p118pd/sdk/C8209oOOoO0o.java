package com.p118pd.sdk;

import android.graphics.Color;
import com.facebook.imageutils.JfifUtil;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.data.DataSet;
import com.github.mikephil.charting.data.Entry;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.pd.sdk.oOOoO0o  reason: case insensitive filesystem */
public class C8209oOOoO0o extends AbstractC8212oOOoO0oo<BarEntry> implements AbstractC8262oOOooo00 {
    public String[] OooO00o = {"Stack"};
    public int OooO0O0 = 1;
    public int OooO0OO = Color.rgb((int) JfifUtil.MARKER_RST7, (int) JfifUtil.MARKER_RST7, (int) JfifUtil.MARKER_RST7);
    public int OooO0Oo = -16777216;
    public int OooO0o = 0;
    public int OooO0o0 = 120;
    public float OooO0oo = 0.0f;

    public C8209oOOoO0o(List<BarEntry> list, String str) {
        super(list, str);
        ((AbstractC8212oOOoO0oo) this).OooO00o = Color.rgb(0, 0, 0);
        OooO0o0(list);
        OooO0Oo(list);
    }

    private void OooO0Oo(List<BarEntry> list) {
        this.OooO0o = 0;
        for (int i = 0; i < list.size(); i++) {
            float[] OooO00o2 = list.get(i).m15084OooO00o();
            if (OooO00o2 == null) {
                this.OooO0o++;
            } else {
                this.OooO0o += OooO00o2.length;
            }
        }
    }

    private void OooO0o0(List<BarEntry> list) {
        for (int i = 0; i < list.size(); i++) {
            float[] OooO00o2 = list.get(i).m15084OooO00o();
            if (OooO00o2 != null && OooO00o2.length > this.OooO0O0) {
                this.OooO0O0 = OooO00o2.length;
            }
        }
    }

    @Override // com.p118pd.sdk.AbstractC8261oOOooo0, com.p118pd.sdk.AbstractC8212oOOoO0oo, com.p118pd.sdk.AbstractC8262oOOooo00, com.p118pd.sdk.AbstractC8205oOOoO, com.p118pd.sdk.AbstractC8205oOOoO, com.p118pd.sdk.AbstractC8205oOOoO, com.p118pd.sdk.AbstractC8205oOOoO, com.p118pd.sdk.AbstractC8205oOOoO, com.p118pd.sdk.AbstractC8205oOOoO, com.p118pd.sdk.AbstractC8205oOOoO, com.p118pd.sdk.AbstractC8205oOOoO, com.p118pd.sdk.AbstractC8265oOOoooO0, com.p118pd.sdk.AbstractC8265oOOoooO0, com.p118pd.sdk.AbstractC8265oOOoooO0, com.p118pd.sdk.AbstractC8265oOOoooO0, com.p118pd.sdk.AbstractC8265oOOoooO0, com.p118pd.sdk.AbstractC8265oOOoooO0, com.p118pd.sdk.AbstractC8265oOOoooO0, com.p118pd.sdk.AbstractC8265oOOoooO0, com.p118pd.sdk.AbstractC8265oOOoooO0, com.github.mikephil.charting.data.DataSet, com.github.mikephil.charting.data.DataSet
    public DataSet<BarEntry> OooO00o() {
        ArrayList arrayList = new ArrayList();
        arrayList.clear();
        for (int i = 0; i < ((DataSet) this).OooO0OO.size(); i++) {
            arrayList.add(((BarEntry) ((DataSet) this).OooO0OO.get(i)).OooO00o());
        }
        C8209oOOoO0o ooooo0o = new C8209oOOoO0o(arrayList, m19882OooO00o());
        ((AbstractC8205oOOoO) ooooo0o).f21326OooO00o = ((AbstractC8205oOOoO) this).f21326OooO00o;
        ooooo0o.OooO0O0 = this.OooO0O0;
        ooooo0o.OooO0OO = this.OooO0OO;
        ooooo0o.OooO00o = this.OooO00o;
        ((AbstractC8212oOOoO0oo) ooooo0o).OooO00o = ((AbstractC8212oOOoO0oo) this).OooO00o;
        ooooo0o.OooO0o0 = this.OooO0o0;
        return ooooo0o;
    }

    public void OooO0o(int i) {
        this.OooO0OO = i;
    }

    public void OooO0oO(int i) {
        this.OooO0o0 = i;
    }

    @Override // com.p118pd.sdk.AbstractC8262oOOooo00
    public int OooO0oo() {
        return this.OooO0Oo;
    }

    @Override // com.p118pd.sdk.AbstractC8262oOOooo00
    public float OooOOO0() {
        return this.OooO0oo;
    }

    @Override // com.p118pd.sdk.AbstractC8262oOOooo00
    public int OooOOOo() {
        return this.OooO0OO;
    }

    @Override // com.p118pd.sdk.AbstractC8262oOOooo00, com.p118pd.sdk.AbstractC8262oOOooo00
    public int OooOOo() {
        return this.OooO0O0;
    }

    @Override // com.p118pd.sdk.AbstractC8262oOOooo00
    public int OooOOoo() {
        return this.OooO0o0;
    }

    public int OooOo0O() {
        return this.OooO0o;
    }

    @Override // com.p118pd.sdk.AbstractC8262oOOooo00, com.p118pd.sdk.AbstractC8262oOOooo00
    /* renamed from: OooOOo  reason: collision with other method in class */
    public boolean m19897OooOOo() {
        return this.OooO0O0 > 1;
    }

    public void OooO0o0(float f) {
        this.OooO0oo = f;
    }

    public void OooO0o0(int i) {
        this.OooO0Oo = i;
    }

    /* renamed from: OooO00o */
    public void OooO0O0(BarEntry barEntry) {
        if (barEntry != null && !Float.isNaN(barEntry.OooO00o())) {
            if (barEntry.m15084OooO00o() == null) {
                if (barEntry.OooO00o() < super.OooO0o0) {
                    super.OooO0o0 = barEntry.OooO00o();
                }
                if (barEntry.OooO00o() > ((DataSet) this).OooO0Oo) {
                    ((DataSet) this).OooO0Oo = barEntry.OooO00o();
                }
            } else {
                if ((-barEntry.OooO0OO()) < super.OooO0o0) {
                    super.OooO0o0 = -barEntry.OooO0OO();
                }
                if (barEntry.OooO0Oo() > ((DataSet) this).OooO0Oo) {
                    ((DataSet) this).OooO0Oo = barEntry.OooO0Oo();
                }
            }
            OooO0OO((Entry) barEntry);
        }
    }

    public void OooO00o(String[] strArr) {
        this.OooO00o = strArr;
    }

    @Override // com.p118pd.sdk.AbstractC8261oOOooo0, com.p118pd.sdk.AbstractC8212oOOoO0oo, com.p118pd.sdk.AbstractC8262oOOooo00, com.p118pd.sdk.AbstractC8205oOOoO, com.p118pd.sdk.AbstractC8205oOOoO, com.p118pd.sdk.AbstractC8205oOOoO, com.p118pd.sdk.AbstractC8205oOOoO, com.p118pd.sdk.AbstractC8205oOOoO, com.p118pd.sdk.AbstractC8205oOOoO, com.p118pd.sdk.AbstractC8205oOOoO, com.p118pd.sdk.AbstractC8205oOOoO, com.p118pd.sdk.AbstractC8265oOOoooO0, com.p118pd.sdk.AbstractC8265oOOoooO0, com.p118pd.sdk.AbstractC8265oOOoooO0, com.p118pd.sdk.AbstractC8265oOOoooO0, com.p118pd.sdk.AbstractC8265oOOoooO0, com.p118pd.sdk.AbstractC8265oOOoooO0, com.p118pd.sdk.AbstractC8265oOOoooO0, com.p118pd.sdk.AbstractC8265oOOoooO0, com.p118pd.sdk.AbstractC8265oOOoooO0, com.github.mikephil.charting.data.DataSet, com.github.mikephil.charting.data.DataSet
    /* renamed from: OooO00o  reason: collision with other method in class */
    public String[] m19896OooO00o() {
        return this.OooO00o;
    }
}

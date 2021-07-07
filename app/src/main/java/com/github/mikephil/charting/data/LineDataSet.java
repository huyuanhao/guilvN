package com.github.mikephil.charting.data;

import android.content.Context;
import android.graphics.Color;
import android.graphics.DashPathEffect;
import com.p118pd.sdk.AbstractC8205oOOoO;
import com.p118pd.sdk.AbstractC8212oOOoO0oo;
import com.p118pd.sdk.AbstractC8222oOOoOOoO;
import com.p118pd.sdk.AbstractC8237oOOoo00;
import com.p118pd.sdk.AbstractC8264oOOoooO;
import com.p118pd.sdk.AbstractC8352oOoOOoO0;
import com.p118pd.sdk.C8232oOOoOoo;
import com.p118pd.sdk.C8342oOoOOOOO;
import java.util.ArrayList;
import java.util.List;

public class LineDataSet extends AbstractC8222oOOoOOoO<Entry> implements AbstractC8264oOOoooO {
    public boolean OooO = true;
    public Mode OooO00o = Mode.LINEAR;

    /* renamed from: OooO00o  reason: collision with other field name */
    public AbstractC8237oOOoo00 f14951OooO00o = new C8232oOOoOoo();
    public DashPathEffect OooO0OO = null;
    public int OooO0Oo = -1;

    /* renamed from: OooO0Oo  reason: collision with other field name */
    public List<Integer> f14952OooO0Oo = null;
    public boolean OooO0oo = true;
    public float OooOO0 = 8.0f;
    public float OooOO0O = 4.0f;
    public float OooOO0o = 0.2f;

    public enum Mode {
        LINEAR,
        STEPPED,
        CUBIC_BEZIER,
        HORIZONTAL_BEZIER
    }

    public LineDataSet(List<Entry> list, String str) {
        super(list, str);
        if (this.f14952OooO0Oo == null) {
            this.f14952OooO0Oo = new ArrayList();
        }
        this.f14952OooO0Oo.clear();
        this.f14952OooO0Oo.add(Integer.valueOf(Color.rgb(140, 234, 255)));
    }

    @Deprecated
    public void OooO(float f) {
        OooO0oo(f);
    }

    @Override // com.p118pd.sdk.AbstractC8261oOOooo0, com.p118pd.sdk.AbstractC8264oOOoooO, com.p118pd.sdk.AbstractC8264oOOoooO, com.p118pd.sdk.AbstractC8264oOOoooO, com.p118pd.sdk.AbstractC8212oOOoO0oo, com.p118pd.sdk.AbstractC8266oOOoooOO, com.p118pd.sdk.AbstractC8205oOOoO, com.p118pd.sdk.AbstractC8205oOOoO, com.p118pd.sdk.AbstractC8205oOOoO, com.p118pd.sdk.AbstractC8205oOOoO, com.p118pd.sdk.AbstractC8205oOOoO, com.p118pd.sdk.AbstractC8205oOOoO, com.p118pd.sdk.AbstractC8205oOOoO, com.p118pd.sdk.AbstractC8205oOOoO, com.p118pd.sdk.AbstractC8222oOOoOOoO, com.p118pd.sdk.AbstractC8265oOOoooO0, com.p118pd.sdk.AbstractC8265oOOoooO0, com.p118pd.sdk.AbstractC8265oOOoooO0, com.p118pd.sdk.AbstractC8265oOOoooO0, com.p118pd.sdk.AbstractC8265oOOoooO0, com.p118pd.sdk.AbstractC8265oOOoooO0, com.p118pd.sdk.AbstractC8265oOOoooO0, com.p118pd.sdk.AbstractC8265oOOoooO0, com.p118pd.sdk.AbstractC8265oOOoooO0, com.github.mikephil.charting.data.DataSet, com.github.mikephil.charting.data.DataSet
    public DataSet<Entry> OooO00o() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < ((DataSet) this).OooO0OO.size(); i++) {
            arrayList.add(((DataSet) this).OooO0OO.get(i).OooO00o());
        }
        LineDataSet lineDataSet = new LineDataSet(arrayList, m19882OooO00o());
        lineDataSet.OooO00o = this.OooO00o;
        ((AbstractC8205oOOoO) lineDataSet).f21326OooO00o = ((AbstractC8205oOOoO) this).f21326OooO00o;
        lineDataSet.OooOO0 = this.OooOO0;
        lineDataSet.OooOO0O = this.OooOO0O;
        lineDataSet.f14952OooO0Oo = this.f14952OooO0Oo;
        lineDataSet.OooO0OO = this.OooO0OO;
        lineDataSet.OooO0oo = this.OooO0oo;
        lineDataSet.OooO = this.OooO;
        ((AbstractC8212oOOoO0oo) lineDataSet).OooO00o = ((AbstractC8212oOOoO0oo) this).OooO00o;
        return lineDataSet;
    }

    public void OooO0O0(float f, float f2, float f3) {
        this.OooO0OO = new DashPathEffect(new float[]{f, f2}, f3);
    }

    @Override // com.p118pd.sdk.AbstractC8264oOOoooO, com.p118pd.sdk.AbstractC8264oOOoooO, com.p118pd.sdk.AbstractC8223oOOoOOoo, com.p118pd.sdk.AbstractC8265oOOoooO0, com.github.mikephil.charting.data.DataSet
    public float OooO0Oo() {
        return this.OooOO0O;
    }

    @Override // com.p118pd.sdk.AbstractC8264oOOoooO, com.p118pd.sdk.AbstractC8264oOOoooO, com.p118pd.sdk.AbstractC8266oOOoooOO, com.p118pd.sdk.AbstractC8222oOOoOOoO
    public float OooO0o() {
        return this.OooOO0o;
    }

    @Override // com.p118pd.sdk.AbstractC8205oOOoO, com.p118pd.sdk.AbstractC8265oOOoooO0, com.p118pd.sdk.AbstractC8265oOOoooO0, com.github.mikephil.charting.data.DataSet
    public void OooO0o0() {
        this.OooO0OO = null;
    }

    public void OooO0oO(float f) {
        if (f >= 0.5f) {
            this.OooOO0O = AbstractC8352oOoOOoO0.OooO00o(f);
        }
    }

    public void OooO0oo(float f) {
        if (f >= 1.0f) {
            this.OooOO0 = AbstractC8352oOoOOoO0.OooO00o(f);
        }
    }

    public void OooOO0(float f) {
        if (f > 1.0f) {
            f = 1.0f;
        }
        if (f < 0.05f) {
            f = 0.05f;
        }
        this.OooOO0o = f;
    }

    public void OooOO0O(boolean z) {
        this.OooO0oo = z;
    }

    @Override // com.p118pd.sdk.AbstractC8264oOOoooO
    @Deprecated
    public boolean OooOO0o() {
        return this.OooO00o == Mode.CUBIC_BEZIER;
    }

    @Override // com.p118pd.sdk.AbstractC8264oOOoooO, com.p118pd.sdk.AbstractC8205oOOoO, com.p118pd.sdk.AbstractC8265oOOoooO0
    public boolean OooOOO() {
        return this.OooO0OO != null;
    }

    @Override // com.p118pd.sdk.AbstractC8264oOOoooO, com.p118pd.sdk.AbstractC8205oOOoO, com.p118pd.sdk.AbstractC8205oOOoO, com.p118pd.sdk.AbstractC8265oOOoooO0, com.p118pd.sdk.AbstractC8265oOOoooO0
    @Deprecated
    public boolean OooOOOO() {
        return this.OooO00o == Mode.STEPPED;
    }

    @Override // com.p118pd.sdk.AbstractC8264oOOoooO
    public float OooOOoo() {
        return this.OooOO0;
    }

    @Deprecated
    public float OooOoo() {
        return OooOOoo();
    }

    @Override // com.p118pd.sdk.AbstractC8264oOOoooO, com.p118pd.sdk.AbstractC8264oOOoooO, com.p118pd.sdk.AbstractC8205oOOoO, com.p118pd.sdk.AbstractC8205oOOoO, com.p118pd.sdk.AbstractC8205oOOoO, com.p118pd.sdk.AbstractC8265oOOoooO0, com.github.mikephil.charting.data.DataSet
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public DashPathEffect m15096OooO0O0() {
        return this.OooO0OO;
    }

    @Override // com.p118pd.sdk.AbstractC8264oOOoooO, com.p118pd.sdk.AbstractC8264oOOoooO, com.p118pd.sdk.AbstractC8223oOOoOOoo, com.p118pd.sdk.AbstractC8265oOOoooO0, com.github.mikephil.charting.data.DataSet
    /* renamed from: OooO0Oo  reason: collision with other method in class */
    public boolean m15098OooO0Oo() {
        return this.OooO0oo;
    }

    @Override // com.p118pd.sdk.AbstractC8264oOOoooO, com.p118pd.sdk.AbstractC8264oOOoooO, com.p118pd.sdk.AbstractC8266oOOoooOO, com.p118pd.sdk.AbstractC8222oOOoOOoO
    /* renamed from: OooO0o  reason: collision with other method in class */
    public void m15100OooO0o() {
        if (this.f14952OooO0Oo == null) {
            this.f14952OooO0Oo = new ArrayList();
        }
        this.f14952OooO0Oo.clear();
    }

    public void OooO0oO(int i) {
        m15100OooO0o();
        this.f14952OooO0Oo.add(Integer.valueOf(i));
    }

    public void OooO0oo(int i) {
        this.OooO0Oo = i;
    }

    public void OooOO0(boolean z) {
        this.OooO = z;
    }

    @Override // com.p118pd.sdk.AbstractC8264oOOoooO, com.p118pd.sdk.AbstractC8205oOOoO
    public int OooO0O0(int i) {
        return this.f14952OooO0Oo.get(i).intValue();
    }

    @Override // com.p118pd.sdk.AbstractC8264oOOoooO, com.p118pd.sdk.AbstractC8264oOOoooO, com.p118pd.sdk.AbstractC8223oOOoOOoo, com.p118pd.sdk.AbstractC8265oOOoooO0, com.github.mikephil.charting.data.DataSet
    /* renamed from: OooO0Oo  reason: collision with other method in class */
    public List<Integer> m15097OooO0Oo() {
        return this.f14952OooO0Oo;
    }

    @Override // com.p118pd.sdk.AbstractC8264oOOoooO, com.p118pd.sdk.AbstractC8264oOOoooO, com.p118pd.sdk.AbstractC8205oOOoO, com.p118pd.sdk.AbstractC8205oOOoO, com.p118pd.sdk.AbstractC8205oOOoO, com.p118pd.sdk.AbstractC8265oOOoooO0, com.github.mikephil.charting.data.DataSet
    public int OooO0O0() {
        return this.f14952OooO0Oo.size();
    }

    public void OooO0Oo(List<Integer> list) {
        this.f14952OooO0Oo = list;
    }

    public void OooO0O0(int... iArr) {
        this.f14952OooO0Oo = C8342oOoOOOOO.OooO00o(iArr);
    }

    @Override // com.p118pd.sdk.AbstractC8264oOOoooO, com.p118pd.sdk.AbstractC8264oOOoooO, com.p118pd.sdk.AbstractC8266oOOoooOO, com.p118pd.sdk.AbstractC8222oOOoOOoO
    /* renamed from: OooO0o  reason: collision with other method in class */
    public int m15099OooO0o() {
        return this.OooO0Oo;
    }

    public void OooO0O0(int[] iArr, Context context) {
        List<Integer> list = this.f14952OooO0Oo;
        if (list == null) {
            list = new ArrayList<>();
        }
        list.clear();
        for (int i : iArr) {
            list.add(Integer.valueOf(context.getResources().getColor(i)));
        }
        this.f14952OooO0Oo = list;
    }

    @Override // com.p118pd.sdk.AbstractC8261oOOooo0, com.p118pd.sdk.AbstractC8264oOOoooO, com.p118pd.sdk.AbstractC8264oOOoooO, com.p118pd.sdk.AbstractC8264oOOoooO, com.p118pd.sdk.AbstractC8212oOOoO0oo, com.p118pd.sdk.AbstractC8266oOOoooOO, com.p118pd.sdk.AbstractC8205oOOoO, com.p118pd.sdk.AbstractC8205oOOoO, com.p118pd.sdk.AbstractC8205oOOoO, com.p118pd.sdk.AbstractC8205oOOoO, com.p118pd.sdk.AbstractC8205oOOoO, com.p118pd.sdk.AbstractC8205oOOoO, com.p118pd.sdk.AbstractC8205oOOoO, com.p118pd.sdk.AbstractC8205oOOoO, com.p118pd.sdk.AbstractC8222oOOoOOoO, com.p118pd.sdk.AbstractC8265oOOoooO0, com.p118pd.sdk.AbstractC8265oOOoooO0, com.p118pd.sdk.AbstractC8265oOOoooO0, com.p118pd.sdk.AbstractC8265oOOoooO0, com.p118pd.sdk.AbstractC8265oOOoooO0, com.p118pd.sdk.AbstractC8265oOOoooO0, com.p118pd.sdk.AbstractC8265oOOoooO0, com.p118pd.sdk.AbstractC8265oOOoooO0, com.p118pd.sdk.AbstractC8265oOOoooO0, com.github.mikephil.charting.data.DataSet, com.github.mikephil.charting.data.DataSet
    /* renamed from: OooO00o  reason: collision with other method in class */
    public Mode m15093OooO00o() {
        return this.OooO00o;
    }

    public void OooO00o(Mode mode) {
        this.OooO00o = mode;
    }

    @Override // com.p118pd.sdk.AbstractC8261oOOooo0, com.p118pd.sdk.AbstractC8264oOOoooO, com.p118pd.sdk.AbstractC8264oOOoooO, com.p118pd.sdk.AbstractC8264oOOoooO, com.p118pd.sdk.AbstractC8212oOOoO0oo, com.p118pd.sdk.AbstractC8266oOOoooOO, com.p118pd.sdk.AbstractC8205oOOoO, com.p118pd.sdk.AbstractC8205oOOoO, com.p118pd.sdk.AbstractC8205oOOoO, com.p118pd.sdk.AbstractC8205oOOoO, com.p118pd.sdk.AbstractC8205oOOoO, com.p118pd.sdk.AbstractC8205oOOoO, com.p118pd.sdk.AbstractC8205oOOoO, com.p118pd.sdk.AbstractC8205oOOoO, com.p118pd.sdk.AbstractC8222oOOoOOoO, com.p118pd.sdk.AbstractC8265oOOoooO0, com.p118pd.sdk.AbstractC8265oOOoooO0, com.p118pd.sdk.AbstractC8265oOOoooO0, com.p118pd.sdk.AbstractC8265oOOoooO0, com.p118pd.sdk.AbstractC8265oOOoooO0, com.p118pd.sdk.AbstractC8265oOOoooO0, com.p118pd.sdk.AbstractC8265oOOoooO0, com.p118pd.sdk.AbstractC8265oOOoooO0, com.p118pd.sdk.AbstractC8265oOOoooO0, com.github.mikephil.charting.data.DataSet, com.github.mikephil.charting.data.DataSet
    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m15095OooO00o() {
        return this.OooO;
    }

    public void OooO00o(AbstractC8237oOOoo00 ooooo00) {
        if (ooooo00 == null) {
            this.f14951OooO00o = new C8232oOOoOoo();
        } else {
            this.f14951OooO00o = ooooo00;
        }
    }

    @Override // com.p118pd.sdk.AbstractC8261oOOooo0, com.p118pd.sdk.AbstractC8264oOOoooO, com.p118pd.sdk.AbstractC8264oOOoooO, com.p118pd.sdk.AbstractC8264oOOoooO, com.p118pd.sdk.AbstractC8212oOOoO0oo, com.p118pd.sdk.AbstractC8266oOOoooOO, com.p118pd.sdk.AbstractC8205oOOoO, com.p118pd.sdk.AbstractC8205oOOoO, com.p118pd.sdk.AbstractC8205oOOoO, com.p118pd.sdk.AbstractC8205oOOoO, com.p118pd.sdk.AbstractC8205oOOoO, com.p118pd.sdk.AbstractC8205oOOoO, com.p118pd.sdk.AbstractC8205oOOoO, com.p118pd.sdk.AbstractC8205oOOoO, com.p118pd.sdk.AbstractC8222oOOoOOoO, com.p118pd.sdk.AbstractC8265oOOoooO0, com.p118pd.sdk.AbstractC8265oOOoooO0, com.p118pd.sdk.AbstractC8265oOOoooO0, com.p118pd.sdk.AbstractC8265oOOoooO0, com.p118pd.sdk.AbstractC8265oOOoooO0, com.p118pd.sdk.AbstractC8265oOOoooO0, com.p118pd.sdk.AbstractC8265oOOoooO0, com.p118pd.sdk.AbstractC8265oOOoooO0, com.p118pd.sdk.AbstractC8265oOOoooO0, com.github.mikephil.charting.data.DataSet, com.github.mikephil.charting.data.DataSet
    /* renamed from: OooO00o  reason: collision with other method in class */
    public AbstractC8237oOOoo00 m15094OooO00o() {
        return this.f14951OooO00o;
    }
}

package com.p118pd.sdk;

import com.github.mikephil.charting.charts.ScatterChart;
import com.github.mikephil.charting.data.DataSet;
import com.github.mikephil.charting.data.Entry;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.pd.sdk.oOOoOoO0  reason: case insensitive filesystem */
public class C8229oOOoOoO0 extends AbstractC8223oOOoOOoo<Entry> implements AbstractC8270oOOooooO {
    public float OooO = 15.0f;
    public AbstractC8339oOoOOO0o OooO00o = new C8335oOoOOO();
    public int OooO0O0 = C8342oOoOOOOO.OooO00o;
    public float OooOO0 = 0.0f;

    /* renamed from: com.pd.sdk.oOOoOoO0$OooO00o */
    public static /* synthetic */ class OooO00o {
        public static final /* synthetic */ int[] OooO00o;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|(3:13|14|16)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(16:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|16) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.github.mikephil.charting.charts.ScatterChart$ScatterShape[] r0 = com.github.mikephil.charting.charts.ScatterChart.ScatterShape.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.p118pd.sdk.C8229oOOoOoO0.OooO00o.OooO00o = r0
                com.github.mikephil.charting.charts.ScatterChart$ScatterShape r1 = com.github.mikephil.charting.charts.ScatterChart.ScatterShape.SQUARE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.p118pd.sdk.C8229oOOoOoO0.OooO00o.OooO00o     // Catch:{ NoSuchFieldError -> 0x001d }
                com.github.mikephil.charting.charts.ScatterChart$ScatterShape r1 = com.github.mikephil.charting.charts.ScatterChart.ScatterShape.CIRCLE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = com.p118pd.sdk.C8229oOOoOoO0.OooO00o.OooO00o     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.github.mikephil.charting.charts.ScatterChart$ScatterShape r1 = com.github.mikephil.charting.charts.ScatterChart.ScatterShape.TRIANGLE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = com.p118pd.sdk.C8229oOOoOoO0.OooO00o.OooO00o     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.github.mikephil.charting.charts.ScatterChart$ScatterShape r1 = com.github.mikephil.charting.charts.ScatterChart.ScatterShape.CROSS     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = com.p118pd.sdk.C8229oOOoOoO0.OooO00o.OooO00o     // Catch:{ NoSuchFieldError -> 0x003e }
                com.github.mikephil.charting.charts.ScatterChart$ScatterShape r1 = com.github.mikephil.charting.charts.ScatterChart.ScatterShape.X     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = com.p118pd.sdk.C8229oOOoOoO0.OooO00o.OooO00o     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.github.mikephil.charting.charts.ScatterChart$ScatterShape r1 = com.github.mikephil.charting.charts.ScatterChart.ScatterShape.CHEVRON_UP     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = com.p118pd.sdk.C8229oOOoOoO0.OooO00o.OooO00o     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.github.mikephil.charting.charts.ScatterChart$ScatterShape r1 = com.github.mikephil.charting.charts.ScatterChart.ScatterShape.CHEVRON_DOWN     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p118pd.sdk.C8229oOOoOoO0.OooO00o.<clinit>():void");
        }
    }

    public C8229oOOoOoO0(List<Entry> list, String str) {
        super(list, str);
    }

    @Override // com.p118pd.sdk.AbstractC8261oOOooo0, com.p118pd.sdk.AbstractC8212oOOoO0oo, com.p118pd.sdk.AbstractC8270oOOooooO, com.p118pd.sdk.AbstractC8205oOOoO, com.p118pd.sdk.AbstractC8205oOOoO, com.p118pd.sdk.AbstractC8205oOOoO, com.p118pd.sdk.AbstractC8205oOOoO, com.p118pd.sdk.AbstractC8205oOOoO, com.p118pd.sdk.AbstractC8205oOOoO, com.p118pd.sdk.AbstractC8205oOOoO, com.p118pd.sdk.AbstractC8205oOOoO, com.p118pd.sdk.AbstractC8265oOOoooO0, com.p118pd.sdk.AbstractC8265oOOoooO0, com.p118pd.sdk.AbstractC8265oOOoooO0, com.p118pd.sdk.AbstractC8265oOOoooO0, com.p118pd.sdk.AbstractC8265oOOoooO0, com.p118pd.sdk.AbstractC8265oOOoooO0, com.p118pd.sdk.AbstractC8265oOOoooO0, com.p118pd.sdk.AbstractC8265oOOoooO0, com.p118pd.sdk.AbstractC8265oOOoooO0, com.github.mikephil.charting.data.DataSet, com.github.mikephil.charting.data.DataSet
    public DataSet<Entry> OooO00o() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < ((DataSet) this).OooO0OO.size(); i++) {
            arrayList.add(((DataSet) this).OooO0OO.get(i).OooO00o());
        }
        C8229oOOoOoO0 ooooooo0 = new C8229oOOoOoO0(arrayList, m19882OooO00o());
        ((AbstractC8205oOOoO) ooooooo0).f21329OooO0O0 = ((AbstractC8205oOOoO) this).f21329OooO0O0;
        ((AbstractC8205oOOoO) ooooooo0).f21328OooO0O0 = ((AbstractC8205oOOoO) this).f21328OooO0O0;
        ((AbstractC8205oOOoO) ooooooo0).f21326OooO00o = ((AbstractC8205oOOoO) this).f21326OooO00o;
        ooooooo0.OooO = this.OooO;
        ooooooo0.OooO00o = this.OooO00o;
        ooooooo0.OooOO0 = this.OooOO0;
        ooooooo0.OooO0O0 = this.OooO0O0;
        ooooooo0.OooO0oo = this.OooO0oo;
        ((AbstractC8212oOOoO0oo) ooooooo0).OooO00o = ((AbstractC8212oOOoO0oo) this).OooO00o;
        ((AbstractC8223oOOoOOoo) ooooooo0).OooO0O0 = ((AbstractC8223oOOoOOoo) this).OooO0O0;
        return ooooooo0;
    }

    @Override // com.p118pd.sdk.AbstractC8270oOOooooO, com.p118pd.sdk.AbstractC8205oOOoO, com.p118pd.sdk.AbstractC8205oOOoO, com.p118pd.sdk.AbstractC8205oOOoO, com.p118pd.sdk.AbstractC8265oOOoooO0, com.github.mikephil.charting.data.DataSet
    public float OooO0O0() {
        return this.OooOO0;
    }

    public void OooO0o(float f) {
        this.OooOO0 = f;
    }

    public void OooO0o0(int i) {
        this.OooO0O0 = i;
    }

    public void OooO0oO(float f) {
        this.OooO = f;
    }

    @Override // com.p118pd.sdk.AbstractC8270oOOooooO
    public float OooOOo() {
        return this.OooO;
    }

    @Override // com.p118pd.sdk.AbstractC8270oOOooooO, com.p118pd.sdk.AbstractC8205oOOoO, com.p118pd.sdk.AbstractC8205oOOoO, com.p118pd.sdk.AbstractC8265oOOoooO0, com.p118pd.sdk.AbstractC8265oOOoooO0
    public int OooOOo0() {
        return this.OooO0O0;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m19930OooO00o(ScatterChart.ScatterShape scatterShape) {
        this.OooO00o = OooO00o(scatterShape);
    }

    public void OooO00o(AbstractC8339oOoOOO0o oooooo0o) {
        this.OooO00o = oooooo0o;
    }

    @Override // com.p118pd.sdk.AbstractC8261oOOooo0, com.p118pd.sdk.AbstractC8212oOOoO0oo, com.p118pd.sdk.AbstractC8270oOOooooO, com.p118pd.sdk.AbstractC8205oOOoO, com.p118pd.sdk.AbstractC8205oOOoO, com.p118pd.sdk.AbstractC8205oOOoO, com.p118pd.sdk.AbstractC8205oOOoO, com.p118pd.sdk.AbstractC8205oOOoO, com.p118pd.sdk.AbstractC8205oOOoO, com.p118pd.sdk.AbstractC8205oOOoO, com.p118pd.sdk.AbstractC8205oOOoO, com.p118pd.sdk.AbstractC8265oOOoooO0, com.p118pd.sdk.AbstractC8265oOOoooO0, com.p118pd.sdk.AbstractC8265oOOoooO0, com.p118pd.sdk.AbstractC8265oOOoooO0, com.p118pd.sdk.AbstractC8265oOOoooO0, com.p118pd.sdk.AbstractC8265oOOoooO0, com.p118pd.sdk.AbstractC8265oOOoooO0, com.p118pd.sdk.AbstractC8265oOOoooO0, com.p118pd.sdk.AbstractC8265oOOoooO0, com.github.mikephil.charting.data.DataSet, com.github.mikephil.charting.data.DataSet
    /* renamed from: OooO00o  reason: collision with other method in class */
    public AbstractC8339oOoOOO0o m19929OooO00o() {
        return this.OooO00o;
    }

    public static AbstractC8339oOoOOO0o OooO00o(ScatterChart.ScatterShape scatterShape) {
        switch (OooO00o.OooO00o[scatterShape.ordinal()]) {
            case 1:
                return new C8335oOoOOO();
            case 2:
                return new C8336oOoOOO0();
            case 3:
                return new C8341oOoOOOO0();
            case 4:
                return new C8338oOoOOO0O();
            case 5:
                return new C8340oOoOOOO();
            case 6:
                return new C8337oOoOOO00();
            case 7:
                return new C8334oOoOO0oo();
            default:
                return null;
        }
    }
}

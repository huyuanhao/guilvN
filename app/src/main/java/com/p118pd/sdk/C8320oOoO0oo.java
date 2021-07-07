package com.p118pd.sdk;

import android.graphics.Canvas;
import com.github.mikephil.charting.charts.CombinedChart;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.pd.sdk.oOoO0oo  reason: case insensitive filesystem */
public class C8320oOoO0oo extends AbstractC8321oOoO0ooO {
    public WeakReference<AbstractC8194oOOo0OoO> OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public List<AbstractC8321oOoO0ooO> f21417OooO00o = new ArrayList(5);
    public List<C8246oOOoo0oO> OooO0O0 = new ArrayList();

    /* renamed from: com.pd.sdk.oOoO0oo$OooO00o */
    public static /* synthetic */ class OooO00o {
        public static final /* synthetic */ int[] OooO00o;

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.github.mikephil.charting.charts.CombinedChart$DrawOrder[] r0 = com.github.mikephil.charting.charts.CombinedChart.DrawOrder.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.p118pd.sdk.C8320oOoO0oo.OooO00o.OooO00o = r0
                com.github.mikephil.charting.charts.CombinedChart$DrawOrder r1 = com.github.mikephil.charting.charts.CombinedChart.DrawOrder.BAR     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.p118pd.sdk.C8320oOoO0oo.OooO00o.OooO00o     // Catch:{ NoSuchFieldError -> 0x001d }
                com.github.mikephil.charting.charts.CombinedChart$DrawOrder r1 = com.github.mikephil.charting.charts.CombinedChart.DrawOrder.BUBBLE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = com.p118pd.sdk.C8320oOoO0oo.OooO00o.OooO00o     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.github.mikephil.charting.charts.CombinedChart$DrawOrder r1 = com.github.mikephil.charting.charts.CombinedChart.DrawOrder.LINE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = com.p118pd.sdk.C8320oOoO0oo.OooO00o.OooO00o     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.github.mikephil.charting.charts.CombinedChart$DrawOrder r1 = com.github.mikephil.charting.charts.CombinedChart.DrawOrder.CANDLE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = com.p118pd.sdk.C8320oOoO0oo.OooO00o.OooO00o     // Catch:{ NoSuchFieldError -> 0x003e }
                com.github.mikephil.charting.charts.CombinedChart$DrawOrder r1 = com.github.mikephil.charting.charts.CombinedChart.DrawOrder.SCATTER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p118pd.sdk.C8320oOoO0oo.OooO00o.<clinit>():void");
        }
    }

    public C8320oOoO0oo(CombinedChart combinedChart, C8185oOOo0O0 oooo0o0, C8353oOoOOoOO oooooooo) {
        super(oooo0o0, oooooooo);
        this.OooO00o = new WeakReference<>(combinedChart);
        OooO0O0();
    }

    @Override // com.p118pd.sdk.AbstractC8321oOoO0ooO, com.p118pd.sdk.AbstractC8321oOoO0ooO
    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m20004OooO00o() {
        for (AbstractC8321oOoO0ooO oooo0ooo : this.f21417OooO00o) {
            oooo0ooo.m20005OooO00o();
        }
    }

    @Override // com.p118pd.sdk.AbstractC8321oOoO0ooO
    public void OooO0O0() {
        this.f21417OooO00o.clear();
        CombinedChart combinedChart = (CombinedChart) this.OooO00o.get();
        if (combinedChart != null) {
            for (CombinedChart.DrawOrder drawOrder : combinedChart.getDrawOrder()) {
                int i = OooO00o.OooO00o[drawOrder.ordinal()];
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            if (i != 4) {
                                if (i == 5 && combinedChart.getScatterData() != null) {
                                    this.f21417OooO00o.add(new C8350oOoOOo0O(combinedChart, ((AbstractC8321oOoO0ooO) this).f21418OooO00o, ((AbstractC8328oOoOO0O) this).OooO00o));
                                }
                            } else if (combinedChart.getCandleData() != null) {
                                this.f21417OooO00o.add(new C8309oOo0O00o(combinedChart, ((AbstractC8321oOoO0ooO) this).f21418OooO00o, ((AbstractC8328oOoOO0O) this).OooO00o));
                            }
                        } else if (combinedChart.getLineData() != null) {
                            this.f21417OooO00o.add(new C8325oOoOO000(combinedChart, ((AbstractC8321oOoO0ooO) this).f21418OooO00o, ((AbstractC8328oOoOO0O) this).OooO00o));
                        }
                    } else if (combinedChart.getBubbleData() != null) {
                        this.f21417OooO00o.add(new C8315oOo0oO0o(combinedChart, ((AbstractC8321oOoO0ooO) this).f21418OooO00o, ((AbstractC8328oOoOO0O) this).OooO00o));
                    }
                } else if (combinedChart.getBarData() != null) {
                    this.f21417OooO00o.add(new C8306oOo0O00(combinedChart, ((AbstractC8321oOoO0ooO) this).f21418OooO00o, ((AbstractC8328oOoOO0O) this).OooO00o));
                }
            }
        }
    }

    @Override // com.p118pd.sdk.AbstractC8321oOoO0ooO
    public void OooO0OO(Canvas canvas) {
        for (AbstractC8321oOoO0ooO oooo0ooo : this.f21417OooO00o) {
            oooo0ooo.OooO0OO(canvas);
        }
    }

    @Override // com.p118pd.sdk.AbstractC8321oOoO0ooO
    public void OooO00o(Canvas canvas) {
        for (AbstractC8321oOoO0ooO oooo0ooo : this.f21417OooO00o) {
            oooo0ooo.OooO00o(canvas);
        }
    }

    @Override // com.p118pd.sdk.AbstractC8321oOoO0ooO
    public void OooO00o(Canvas canvas, C8246oOOoo0oO[] ooooo0ooArr) {
        int i;
        AbstractC8194oOOo0OoO oooo0ooo = this.OooO00o.get();
        if (oooo0ooo != null) {
            for (AbstractC8321oOoO0ooO oooo0ooo2 : this.f21417OooO00o) {
                Object obj = null;
                if (oooo0ooo2 instanceof C8306oOo0O00) {
                    obj = ((C8306oOo0O00) oooo0ooo2).f21405OooO00o.getBarData();
                } else if (oooo0ooo2 instanceof C8325oOoOO000) {
                    obj = ((C8325oOoOO000) oooo0ooo2).f21420OooO00o.getLineData();
                } else if (oooo0ooo2 instanceof C8309oOo0O00o) {
                    obj = ((C8309oOo0O00o) oooo0ooo2).OooO00o.getCandleData();
                } else if (oooo0ooo2 instanceof C8350oOoOOo0O) {
                    obj = ((C8350oOoOOo0O) oooo0ooo2).OooO00o.getScatterData();
                } else if (oooo0ooo2 instanceof C8315oOo0oO0o) {
                    obj = ((C8315oOo0oO0o) oooo0ooo2).OooO00o.getBubbleData();
                }
                if (obj == null) {
                    i = -1;
                } else {
                    i = ((C8221oOOoOOo0) oooo0ooo.getData()).OooO0O0().indexOf(obj);
                }
                this.OooO0O0.clear();
                for (C8246oOOoo0oO ooooo0oo : ooooo0ooArr) {
                    if (ooooo0oo.m19933OooO00o() == i || ooooo0oo.m19933OooO00o() == -1) {
                        this.OooO0O0.add(ooooo0oo);
                    }
                }
                List<C8246oOOoo0oO> list = this.OooO0O0;
                oooo0ooo2.OooO00o(canvas, (C8246oOOoo0oO[]) list.toArray(new C8246oOOoo0oO[list.size()]));
            }
        }
    }

    @Override // com.p118pd.sdk.AbstractC8321oOoO0ooO
    public void OooO0O0(Canvas canvas) {
        for (AbstractC8321oOoO0ooO oooo0ooo : this.f21417OooO00o) {
            oooo0ooo.OooO0O0(canvas);
        }
    }

    public AbstractC8321oOoO0ooO OooO00o(int i) {
        if (i >= this.f21417OooO00o.size() || i < 0) {
            return null;
        }
        return this.f21417OooO00o.get(i);
    }

    @Override // com.p118pd.sdk.AbstractC8321oOoO0ooO, com.p118pd.sdk.AbstractC8321oOoO0ooO
    public List<AbstractC8321oOoO0ooO> OooO00o() {
        return this.f21417OooO00o;
    }

    public void OooO00o(List<AbstractC8321oOoO0ooO> list) {
        this.f21417OooO00o = list;
    }
}

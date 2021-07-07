package com.p118pd.sdk;

import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Typeface;
import com.github.mikephil.charting.components.Legend;
import com.github.mikephil.charting.data.PieEntry;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.pd.sdk.oOoO  reason: case insensitive filesystem */
public class C8319oOoO extends AbstractC8328oOoOO0O {
    public Paint.FontMetrics OooO00o = new Paint.FontMetrics();

    /* renamed from: OooO00o  reason: collision with other field name */
    public Paint f21413OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Path f21414OooO00o = new Path();

    /* renamed from: OooO00o  reason: collision with other field name */
    public Legend f21415OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public List<C8204oOOo0oo0> f21416OooO00o = new ArrayList(16);
    public Paint OooO0O0;

    /* renamed from: com.pd.sdk.oOoO$OooO00o */
    public static /* synthetic */ class OooO00o {
        public static final /* synthetic */ int[] OooO00o;
        public static final /* synthetic */ int[] OooO0O0;
        public static final /* synthetic */ int[] OooO0OO;
        public static final /* synthetic */ int[] OooO0Oo;

        /* JADX WARNING: Can't wrap try/catch for region: R(32:0|(2:1|2)|3|(2:5|6)|7|9|10|11|12|13|14|15|16|17|19|20|(2:21|22)|23|25|26|27|28|29|30|31|33|34|35|36|37|38|40) */
        /* JADX WARNING: Can't wrap try/catch for region: R(34:0|1|2|3|(2:5|6)|7|9|10|11|12|13|14|15|16|17|19|20|21|22|23|25|26|27|28|29|30|31|33|34|35|36|37|38|40) */
        /* JADX WARNING: Can't wrap try/catch for region: R(35:0|1|2|3|5|6|7|9|10|11|12|13|14|15|16|17|19|20|21|22|23|25|26|27|28|29|30|31|33|34|35|36|37|38|40) */
        /* JADX WARNING: Code restructure failed: missing block: B:41:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0033 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x005a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0075 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x007f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x009a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:37:0x00a4 */
        static {
            /*
            // Method dump skipped, instructions count: 175
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p118pd.sdk.C8319oOoO.OooO00o.<clinit>():void");
        }
    }

    public C8319oOoO(C8353oOoOOoOO oooooooo, Legend legend) {
        super(oooooooo);
        this.f21415OooO00o = legend;
        Paint paint = new Paint(1);
        this.f21413OooO00o = paint;
        paint.setTextSize(AbstractC8352oOoOOoO0.OooO00o(9.0f));
        this.f21413OooO00o.setTextAlign(Paint.Align.LEFT);
        Paint paint2 = new Paint(1);
        this.OooO0O0 = paint2;
        paint2.setStyle(Paint.Style.FILL);
    }

    public Paint OooO00o() {
        return this.OooO0O0;
    }

    public Paint OooO0O0() {
        return this.f21413OooO00o;
    }

    public void OooO00o(AbstractC8219oOOoOOOo<?> oooooooo) {
        AbstractC8219oOOoOOOo<?> oooooooo2;
        String str;
        AbstractC8219oOOoOOOo<?> oooooooo3 = oooooooo;
        if (!this.f21415OooO00o.m15069OooO0OO()) {
            this.f21416OooO00o.clear();
            int i = 0;
            while (i < oooooooo.m19903OooO00o()) {
                AbstractC8265oOOoooO0 OooO00o2 = oooooooo3.OooO00o(i);
                List<Integer> OooO00o3 = OooO00o2.m19955OooO00o();
                int OooO0Oo = OooO00o2.OooO0Oo();
                if (OooO00o2 instanceof AbstractC8262oOOooo00) {
                    AbstractC8262oOOooo00 oooooo00 = (AbstractC8262oOOooo00) OooO00o2;
                    if (oooooo00.m19941OooOOo()) {
                        String[] OooO00o4 = oooooo00.OooO00o();
                        int i2 = 0;
                        while (i2 < OooO00o3.size() && i2 < oooooo00.OooOOo()) {
                            this.f21416OooO00o.add(new C8204oOOo0oo0(OooO00o4[i2 % OooO00o4.length], OooO00o2.m19948OooO00o(), OooO00o2.OooOOOO(), OooO00o2.OooOOO(), OooO00o2.OooO00o(), OooO00o3.get(i2).intValue()));
                            i2++;
                        }
                        if (oooooo00.m19954OooO00o() != null) {
                            this.f21416OooO00o.add(new C8204oOOo0oo0(OooO00o2.m19954OooO00o(), Legend.LegendForm.NONE, Float.NaN, Float.NaN, null, C8342oOoOOOOO.OooO00o));
                        }
                        oooooooo2 = oooooooo3;
                        i++;
                        oooooooo3 = oooooooo2;
                    }
                }
                if (OooO00o2 instanceof AbstractC8269oOOoooo0) {
                    AbstractC8269oOOoooo0 ooooooo0 = (AbstractC8269oOOoooo0) OooO00o2;
                    int i3 = 0;
                    while (i3 < OooO00o3.size() && i3 < OooO0Oo) {
                        this.f21416OooO00o.add(new C8204oOOo0oo0(((PieEntry) ooooooo0.m19951OooO00o(i3)).m15103OooO00o(), OooO00o2.m19948OooO00o(), OooO00o2.OooOOOO(), OooO00o2.OooOOO(), OooO00o2.OooO00o(), OooO00o3.get(i3).intValue()));
                        i3++;
                    }
                    if (ooooooo0.m19954OooO00o() != null) {
                        this.f21416OooO00o.add(new C8204oOOo0oo0(OooO00o2.m19954OooO00o(), Legend.LegendForm.NONE, Float.NaN, Float.NaN, null, C8342oOoOOOOO.OooO00o));
                    }
                } else {
                    if (OooO00o2 instanceof AbstractC8260oOOooo) {
                        AbstractC8260oOOooo oooooo = (AbstractC8260oOOooo) OooO00o2;
                        if (oooooo.OooOOO() != 1122867) {
                            int OooOOO = oooooo.OooOOO();
                            int OooOO0o = oooooo.m19939OooOO0o();
                            this.f21416OooO00o.add(new C8204oOOo0oo0(null, OooO00o2.m19948OooO00o(), OooO00o2.OooOOOO(), OooO00o2.OooOOO(), OooO00o2.OooO00o(), OooOOO));
                            this.f21416OooO00o.add(new C8204oOOo0oo0(OooO00o2.m19954OooO00o(), OooO00o2.m19948OooO00o(), OooO00o2.OooOOOO(), OooO00o2.OooOOO(), OooO00o2.OooO00o(), OooOO0o));
                        }
                    }
                    int i4 = 0;
                    while (i4 < OooO00o3.size() && i4 < OooO0Oo) {
                        if (i4 >= OooO00o3.size() - 1 || i4 >= OooO0Oo - 1) {
                            str = oooooooo.OooO00o(i).m19954OooO00o();
                        } else {
                            str = null;
                        }
                        this.f21416OooO00o.add(new C8204oOOo0oo0(str, OooO00o2.m19948OooO00o(), OooO00o2.OooOOOO(), OooO00o2.OooOOO(), OooO00o2.OooO00o(), OooO00o3.get(i4).intValue()));
                        i4++;
                    }
                }
                oooooooo2 = oooooooo;
                i++;
                oooooooo3 = oooooooo2;
            }
            if (this.f21415OooO00o.m15067OooO0O0() != null) {
                Collections.addAll(this.f21416OooO00o, this.f21415OooO00o.m15067OooO0O0());
            }
            this.f21415OooO00o.OooO0O0(this.f21416OooO00o);
        }
        Typeface OooO00o5 = this.f21415OooO00o.m19854OooO00o();
        if (OooO00o5 != null) {
            this.f21413OooO00o.setTypeface(OooO00o5);
        }
        this.f21413OooO00o.setTextSize(this.f21415OooO00o.OooO00o());
        this.f21413OooO00o.setColor(this.f21415OooO00o.m19853OooO00o());
        this.f21415OooO00o.OooO00o(this.f21413OooO00o, ((AbstractC8328oOoOO0O) this).OooO00o);
    }

    /* JADX WARNING: Removed duplicated region for block: B:106:0x0273  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x016e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void OooO00o(android.graphics.Canvas r35) {
        /*
        // Method dump skipped, instructions count: 984
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p118pd.sdk.C8319oOoO.OooO00o(android.graphics.Canvas):void");
    }

    public void OooO00o(Canvas canvas, float f, float f2, C8204oOOo0oo0 oooo0oo0, Legend legend) {
        int i = oooo0oo0.f21315OooO00o;
        if (i != 1122868 && i != 1122867 && i != 0) {
            int save = canvas.save();
            Legend.LegendForm legendForm = oooo0oo0.f21317OooO00o;
            if (legendForm == Legend.LegendForm.DEFAULT) {
                legendForm = legend.m15055OooO00o();
            }
            this.OooO0O0.setColor(oooo0oo0.f21315OooO00o);
            float OooO00o2 = AbstractC8352oOoOOoO0.OooO00o(Float.isNaN(oooo0oo0.OooO00o) ? legend.OooO0o0() : oooo0oo0.OooO00o);
            float f3 = OooO00o2 / 2.0f;
            int i2 = OooO00o.OooO0Oo[legendForm.ordinal()];
            if (i2 == 3 || i2 == 4) {
                this.OooO0O0.setStyle(Paint.Style.FILL);
                canvas.drawCircle(f + f3, f2, f3, this.OooO0O0);
            } else if (i2 == 5) {
                this.OooO0O0.setStyle(Paint.Style.FILL);
                canvas.drawRect(f, f2 - f3, f + OooO00o2, f2 + f3, this.OooO0O0);
            } else if (i2 == 6) {
                float OooO00o3 = AbstractC8352oOoOOoO0.OooO00o(Float.isNaN(oooo0oo0.OooO0O0) ? legend.OooO0Oo() : oooo0oo0.OooO0O0);
                DashPathEffect dashPathEffect = oooo0oo0.f21316OooO00o;
                if (dashPathEffect == null) {
                    dashPathEffect = legend.OooO00o();
                }
                this.OooO0O0.setStyle(Paint.Style.STROKE);
                this.OooO0O0.setStrokeWidth(OooO00o3);
                this.OooO0O0.setPathEffect(dashPathEffect);
                this.f21414OooO00o.reset();
                this.f21414OooO00o.moveTo(f, f2);
                this.f21414OooO00o.lineTo(f + OooO00o2, f2);
                canvas.drawPath(this.f21414OooO00o, this.OooO0O0);
            }
            canvas.restoreToCount(save);
        }
    }

    public void OooO00o(Canvas canvas, float f, float f2, String str) {
        canvas.drawText(str, f, f2, this.f21413OooO00o);
    }
}

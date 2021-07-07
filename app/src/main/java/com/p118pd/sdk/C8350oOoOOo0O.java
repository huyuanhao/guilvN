package com.p118pd.sdk;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.Log;
import com.github.mikephil.charting.data.Entry;
import com.p118pd.sdk.AbstractC8308oOo0O00O;
import java.util.List;

/* renamed from: com.pd.sdk.oOoOOo0O  reason: case insensitive filesystem */
public class C8350oOoOOo0O extends AbstractC8326oOoOO00O {
    public AbstractC8259oOOooOoo OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public float[] f21457OooO00o = new float[2];

    public C8350oOoOOo0O(AbstractC8259oOOooOoo oooooooo, C8185oOOo0O0 oooo0o0, C8353oOoOOoOO oooooooo2) {
        super(oooo0o0, oooooooo2);
        this.OooO00o = oooooooo;
    }

    @Override // com.p118pd.sdk.AbstractC8321oOoO0ooO, com.p118pd.sdk.AbstractC8321oOoO0ooO
    public void OooO00o() {
    }

    @Override // com.p118pd.sdk.AbstractC8321oOoO0ooO
    public void OooO00o(Canvas canvas) {
        for (AbstractC8270oOOooooO oooooooo : this.OooO00o.getScatterData().m19905OooO00o()) {
            if (oooooooo.isVisible()) {
                OooO00o(canvas, oooooooo);
            }
        }
    }

    @Override // com.p118pd.sdk.AbstractC8321oOoO0ooO
    public void OooO0O0(Canvas canvas) {
    }

    @Override // com.p118pd.sdk.AbstractC8321oOoO0ooO
    public void OooO0OO(Canvas canvas) {
        int i;
        C8349oOoOOo00 oooooo00;
        if (OooO00o(this.OooO00o)) {
            List OooO00o2 = this.OooO00o.getScatterData().m19905OooO00o();
            for (int i2 = 0; i2 < this.OooO00o.getScatterData().m19903OooO00o(); i2++) {
                AbstractC8270oOOooooO oooooooo = (AbstractC8270oOOooooO) OooO00o2.get(i2);
                if (OooO00o((AbstractC8265oOOoooO0) oooooooo)) {
                    OooO00o((AbstractC8265oOOoooO0) oooooooo);
                    ((AbstractC8308oOo0O00O) this).OooO00o.OooO00o(this.OooO00o, oooooooo);
                    C8351oOoOOo0o OooO00o3 = this.OooO00o.OooO00o(oooooooo.m19949OooO00o());
                    float OooO00o4 = ((AbstractC8321oOoO0ooO) this).f21418OooO00o.OooO00o();
                    float OooO0O0 = ((AbstractC8321oOoO0ooO) this).f21418OooO00o.OooO0O0();
                    AbstractC8308oOo0O00O.OooO00o oooO00o = ((AbstractC8308oOo0O00O) this).OooO00o;
                    float[] OooO00o5 = OooO00o3.OooO00o(oooooooo, OooO00o4, OooO0O0, oooO00o.OooO00o, oooO00o.OooO0O0);
                    float OooO00o6 = AbstractC8352oOoOOoO0.OooO00o(oooooooo.OooOOo());
                    C8349oOoOOo00 OooO00o7 = C8349oOoOOo00.OooO00o(oooooooo.m19953OooO00o());
                    OooO00o7.f21456OooO00o = AbstractC8352oOoOOoO0.OooO00o(OooO00o7.f21456OooO00o);
                    OooO00o7.OooO0O0 = AbstractC8352oOoOOoO0.OooO00o(OooO00o7.OooO0O0);
                    int i3 = 0;
                    while (i3 < OooO00o5.length && ((AbstractC8328oOoOO0O) this).OooO00o.m20040OooO0OO(OooO00o5[i3])) {
                        if (((AbstractC8328oOoOO0O) this).OooO00o.m20037OooO0O0(OooO00o5[i3])) {
                            int i4 = i3 + 1;
                            if (((AbstractC8328oOoOO0O) this).OooO00o.m20044OooO0o(OooO00o5[i4])) {
                                int i5 = i3 / 2;
                                Entry OooO00o8 = oooooooo.m19951OooO00o(((AbstractC8308oOo0O00O) this).OooO00o.OooO00o + i5);
                                if (oooooooo.OooO0OO()) {
                                    i = i3;
                                    oooooo00 = OooO00o7;
                                    OooO00o(canvas, oooooooo.m19952OooO00o(), OooO00o8.OooO00o(), OooO00o8, i2, OooO00o5[i3], OooO00o5[i4] - OooO00o6, oooooooo.OooO0Oo(i5 + ((AbstractC8308oOo0O00O) this).OooO00o.OooO00o));
                                } else {
                                    i = i3;
                                    oooooo00 = OooO00o7;
                                }
                                if (OooO00o8.m19898OooO00o() != null && oooooooo.OooOo00()) {
                                    Drawable OooO00o9 = OooO00o8.m19898OooO00o();
                                    AbstractC8352oOoOOoO0.OooO00o(canvas, OooO00o9, (int) (OooO00o5[i] + oooooo00.f21456OooO00o), (int) (OooO00o5[i4] + oooooo00.OooO0O0), OooO00o9.getIntrinsicWidth(), OooO00o9.getIntrinsicHeight());
                                }
                                i3 = i + 2;
                                OooO00o7 = oooooo00;
                            }
                        }
                        i = i3;
                        oooooo00 = OooO00o7;
                        i3 = i + 2;
                        OooO00o7 = oooooo00;
                    }
                    C8349oOoOOo00.m20016OooO00o(OooO00o7);
                }
            }
        }
    }

    public void OooO00o(Canvas canvas, AbstractC8270oOOooooO oooooooo) {
        C8353oOoOOoOO oooooooo2 = ((AbstractC8328oOoOO0O) this).OooO00o;
        C8351oOoOOo0o OooO00o2 = this.OooO00o.OooO00o(oooooooo.m19949OooO00o());
        float OooO0O0 = ((AbstractC8321oOoO0ooO) this).f21418OooO00o.OooO0O0();
        AbstractC8339oOoOOO0o OooO00o3 = oooooooo.OooO00o();
        if (OooO00o3 == null) {
            Log.i("MISSING", "There's no IShapeRenderer specified for ScatterDataSet");
            return;
        }
        int min = (int) Math.min(Math.ceil((double) (((float) oooooooo.OooO0Oo()) * ((AbstractC8321oOoO0ooO) this).f21418OooO00o.OooO00o())), (double) ((float) oooooooo.OooO0Oo()));
        for (int i = 0; i < min; i++) {
            Entry OooO00o4 = oooooooo.m19951OooO00o(i);
            this.f21457OooO00o[0] = OooO00o4.OooO0O0();
            this.f21457OooO00o[1] = OooO00o4.OooO00o() * OooO0O0;
            OooO00o2.OooO0O0(this.f21457OooO00o);
            if (oooooooo2.m20040OooO0OO(this.f21457OooO00o[0])) {
                if (oooooooo2.m20037OooO0O0(this.f21457OooO00o[0]) && oooooooo2.m20044OooO0o(this.f21457OooO00o[1])) {
                    ((AbstractC8321oOoO0ooO) this).OooO00o.setColor(oooooooo.OooO00o(i / 2));
                    C8353oOoOOoOO oooooooo3 = ((AbstractC8328oOoOO0O) this).OooO00o;
                    float[] fArr = this.f21457OooO00o;
                    OooO00o3.OooO00o(canvas, oooooooo, oooooooo3, fArr[0], fArr[1], ((AbstractC8321oOoO0ooO) this).OooO00o);
                }
            } else {
                return;
            }
        }
    }

    @Override // com.p118pd.sdk.AbstractC8321oOoO0ooO
    public void OooO00o(Canvas canvas, C8246oOOoo0oO[] ooooo0ooArr) {
        C8224oOOoOo scatterData = this.OooO00o.getScatterData();
        for (C8246oOOoo0oO ooooo0oo : ooooo0ooArr) {
            AbstractC8267oOOoooOo oooooooo = (AbstractC8270oOOooooO) scatterData.OooO00o(ooooo0oo.m19936OooO0O0());
            if (oooooooo != null && oooooooo.OooO0O0()) {
                Entry OooO00o2 = oooooooo.OooO00o(ooooo0oo.OooO0OO(), ooooo0oo.OooO0o0());
                if (OooO00o(OooO00o2, oooooooo)) {
                    C8346oOoOOOoo OooO00o3 = this.OooO00o.OooO00o(oooooooo.m19949OooO00o()).OooO00o(OooO00o2.OooO0O0(), OooO00o2.OooO00o() * ((AbstractC8321oOoO0ooO) this).f21418OooO00o.OooO0O0());
                    ooooo0oo.OooO00o((float) OooO00o3.f21451OooO00o, (float) OooO00o3.OooO0O0);
                    OooO00o(canvas, (float) OooO00o3.f21451OooO00o, (float) OooO00o3.OooO0O0, oooooooo);
                }
            }
        }
    }
}

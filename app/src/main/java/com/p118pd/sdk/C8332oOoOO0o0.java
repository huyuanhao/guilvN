package com.p118pd.sdk;

import android.graphics.Canvas;
import com.github.mikephil.charting.components.XAxis;

/* renamed from: com.pd.sdk.oOoOO0o0  reason: case insensitive filesystem */
public class C8332oOoOO0o0 extends C8329oOoOO0OO {
    public C8196oOOo0o OooO00o;

    public C8332oOoOO0o0(C8353oOoOOoOO oooooooo, XAxis xAxis, C8196oOOo0o oooo0o) {
        super(oooooooo, xAxis, null);
        this.OooO00o = oooo0o;
    }

    @Override // com.p118pd.sdk.C8329oOoOO0OO, com.p118pd.sdk.AbstractC8307oOo0O000
    public void OooO00o(Canvas canvas) {
        if (((C8329oOoOO0OO) this).f21438OooO00o.m19855OooO00o() && ((C8329oOoOO0OO) this).f21438OooO00o.m19873OooO0oo()) {
            float OooOO0O = ((C8329oOoOO0OO) this).f21438OooO00o.OooOO0O();
            C8349oOoOOo00 OooO00o2 = C8349oOoOOo00.OooO00o(0.5f, 0.25f);
            ((AbstractC8307oOo0O000) this).OooO0O0.setTypeface(((C8329oOoOO0OO) this).f21438OooO00o.m19854OooO00o());
            ((AbstractC8307oOo0O000) this).OooO0O0.setTextSize(((C8329oOoOO0OO) this).f21438OooO00o.OooO00o());
            ((AbstractC8307oOo0O000) this).OooO0O0.setColor(((C8329oOoOO0OO) this).f21438OooO00o.m19853OooO00o());
            float sliceAngle = this.OooO00o.getSliceAngle();
            float factor = this.OooO00o.getFactor();
            C8349oOoOOo00 centerOffsets = this.OooO00o.getCenterOffsets();
            C8349oOoOOo00 OooO00o3 = C8349oOoOOo00.OooO00o(0.0f, 0.0f);
            for (int i = 0; i < ((AbstractC8268oOOoooo) ((C8226oOOoOo0O) this.OooO00o.getData()).m19904OooO00o()).OooO0Oo(); i++) {
                float f = (float) i;
                String OooO00o4 = ((C8329oOoOO0OO) this).f21438OooO00o.m19857OooO00o().OooO00o(f, ((C8329oOoOO0OO) this).f21438OooO00o);
                AbstractC8352oOoOOoO0.OooO00o(centerOffsets, (this.OooO00o.getYRange() * factor) + (((float) ((C8329oOoOO0OO) this).f21438OooO00o.OooO) / 2.0f), ((f * sliceAngle) + this.OooO00o.getRotationAngle()) % 360.0f, OooO00o3);
                OooO00o(canvas, OooO00o4, OooO00o3.f21456OooO00o, OooO00o3.OooO0O0 - (((float) ((C8329oOoOO0OO) this).f21438OooO00o.OooOO0) / 2.0f), OooO00o2, OooOO0O);
            }
            C8349oOoOOo00.m20016OooO00o(centerOffsets);
            C8349oOoOOo00.m20016OooO00o(OooO00o3);
            C8349oOoOOo00.m20016OooO00o(OooO00o2);
        }
    }

    @Override // com.p118pd.sdk.C8329oOoOO0OO, com.p118pd.sdk.AbstractC8307oOo0O000
    public void OooO0Oo(Canvas canvas) {
    }
}

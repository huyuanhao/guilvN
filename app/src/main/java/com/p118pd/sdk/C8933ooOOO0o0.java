package com.p118pd.sdk;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.widget.TextView;
import com.github.mikephil.charting.data.CandleEntry;
import com.github.mikephil.charting.data.Entry;
import com.github.wuxudong.rncharts.C0910R;
import java.util.List;
import java.util.Map;

/* renamed from: com.pd.sdk.ooOOO0o0  reason: case insensitive filesystem */
public class C8933ooOOO0o0 extends C8207oOOoO0OO {
    public Drawable OooO00o = C7023o000o0o0.m18287OooO00o(getResources(), C0910R.C0912drawable.rectangle_marker_left, (Resources.Theme) null);

    /* renamed from: OooO00o  reason: collision with other field name */
    public TextView f22178OooO00o = ((TextView) findViewById(C0910R.C0913id.rectangle_tvContent));
    public Drawable OooO0O0 = C7023o000o0o0.m18287OooO00o(getResources(), C0910R.C0912drawable.rectangle_marker, (Resources.Theme) null);
    public Drawable OooO0OO = C7023o000o0o0.m18287OooO00o(getResources(), C0910R.C0912drawable.rectangle_marker_right, (Resources.Theme) null);
    public Drawable OooO0Oo = C7023o000o0o0.m18287OooO00o(getResources(), C0910R.C0912drawable.rectangle_marker_top_left, (Resources.Theme) null);
    public Drawable OooO0o = C7023o000o0o0.m18287OooO00o(getResources(), C0910R.C0912drawable.rectangle_marker_top_right, (Resources.Theme) null);
    public Drawable OooO0o0 = C7023o000o0o0.m18287OooO00o(getResources(), C0910R.C0912drawable.rectangle_marker_top, (Resources.Theme) null);
    public int o00oO0O = 0;

    public C8933ooOOO0o0(Context context) {
        super(context, C0910R.layout.rectangle_marker);
    }

    @Override // com.p118pd.sdk.C8207oOOoO0OO, com.p118pd.sdk.AbstractC8203oOOo0oOo
    public void OooO00o(Entry entry, C8246oOOoo0oO ooooo0oo) {
        String str;
        if (entry instanceof CandleEntry) {
            str = AbstractC8352oOoOOoO0.OooO00o(((CandleEntry) entry).OooO0Oo(), this.o00oO0O, false);
        } else {
            str = AbstractC8352oOoOOoO0.OooO00o(entry.OooO00o(), this.o00oO0O, false);
        }
        if ((entry.m19899OooO00o() instanceof Map) && ((Map) entry.m19899OooO00o()).containsKey("marker")) {
            Object obj = ((Map) entry.m19899OooO00o()).get("marker");
            str = (ooooo0oo.m19937OooO0OO() == -1 || !(obj instanceof List)) ? obj.toString() : ((List) obj).get(ooooo0oo.m19937OooO0OO()).toString();
        }
        if (TextUtils.isEmpty(str)) {
            this.f22178OooO00o.setVisibility(4);
        } else {
            this.f22178OooO00o.setText(str);
            this.f22178OooO00o.setVisibility(0);
        }
        super.OooO00o(entry, ooooo0oo);
    }

    @Override // com.p118pd.sdk.C8207oOOoO0OO, com.p118pd.sdk.AbstractC8203oOOo0oOo
    public C8349oOoOOo00 getOffset() {
        return new C8349oOoOOo00((float) (-(getWidth() / 2)), (float) (-getHeight()));
    }

    public TextView getTvContent() {
        return this.f22178OooO00o;
    }

    public void setDigits(int i) {
        this.o00oO0O = i;
    }

    @Override // com.p118pd.sdk.C8207oOOoO0OO, com.p118pd.sdk.C8207oOOoO0OO, com.p118pd.sdk.AbstractC8203oOOo0oOo
    public C8349oOoOOo00 OooO00o(float f, float f2) {
        C8349oOoOOo00 offset = getOffset();
        C8349oOoOOo00 oooooo00 = new C8349oOoOOo00();
        oooooo00.f21456OooO00o = offset.f21456OooO00o;
        oooooo00.OooO0O0 = offset.OooO0O0;
        AbstractC8194oOOo0OoO chartView = getChartView();
        float width = (float) getWidth();
        float f3 = oooooo00.f21456OooO00o;
        if (f + f3 < 0.0f) {
            oooooo00.f21456OooO00o = 0.0f;
            if (f2 + oooooo00.OooO0O0 < 0.0f) {
                oooooo00.OooO0O0 = 0.0f;
                this.f22178OooO00o.setBackground(this.OooO0Oo);
            } else {
                this.f22178OooO00o.setBackground(this.OooO00o);
            }
        } else if (chartView != null && f + width + f3 > ((float) chartView.getWidth())) {
            oooooo00.f21456OooO00o = -width;
            if (f2 + oooooo00.OooO0O0 < 0.0f) {
                oooooo00.OooO0O0 = 0.0f;
                this.f22178OooO00o.setBackground(this.OooO0o);
            } else {
                this.f22178OooO00o.setBackground(this.OooO0OO);
            }
        } else if (f2 + oooooo00.OooO0O0 < 0.0f) {
            oooooo00.OooO0O0 = 0.0f;
            this.f22178OooO00o.setBackground(this.OooO0o0);
        } else {
            this.f22178OooO00o.setBackground(this.OooO0O0);
        }
        return oooooo00;
    }
}

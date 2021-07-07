package com.p118pd.sdk;

import android.content.Context;
import android.graphics.Canvas;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.RelativeLayout;
import com.github.mikephil.charting.data.Entry;
import java.lang.ref.WeakReference;

/* renamed from: com.pd.sdk.oOOoO0OO  reason: case insensitive filesystem */
public class C8207oOOoO0OO extends RelativeLayout implements AbstractC8203oOOo0oOo {
    public C8349oOoOOo00 OooO00o = new C8349oOoOOo00();

    /* renamed from: OooO00o  reason: collision with other field name */
    public WeakReference<AbstractC8194oOOo0OoO> f21336OooO00o;
    public C8349oOoOOo00 OooO0O0 = new C8349oOoOOo00();

    public C8207oOOoO0OO(Context context, int i) {
        super(context);
        setupLayoutResource(i);
    }

    private void setupLayoutResource(int i) {
        View inflate = LayoutInflater.from(getContext()).inflate(i, this);
        inflate.setLayoutParams(new RelativeLayout.LayoutParams(-2, -2));
        inflate.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        inflate.layout(0, 0, inflate.getMeasuredWidth(), inflate.getMeasuredHeight());
    }

    @Override // com.p118pd.sdk.AbstractC8203oOOo0oOo
    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m19895OooO00o(float f, float f2) {
        C8349oOoOOo00 oooooo00 = this.OooO00o;
        oooooo00.f21456OooO00o = f;
        oooooo00.OooO0O0 = f2;
    }

    public AbstractC8194oOOo0OoO getChartView() {
        WeakReference<AbstractC8194oOOo0OoO> weakReference = this.f21336OooO00o;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    @Override // com.p118pd.sdk.AbstractC8203oOOo0oOo
    public C8349oOoOOo00 getOffset() {
        return this.OooO00o;
    }

    public void setChartView(AbstractC8194oOOo0OoO oooo0ooo) {
        this.f21336OooO00o = new WeakReference<>(oooo0ooo);
    }

    public void setOffset(C8349oOoOOo00 oooooo00) {
        this.OooO00o = oooooo00;
        if (oooooo00 == null) {
            this.OooO00o = new C8349oOoOOo00();
        }
    }

    @Override // com.p118pd.sdk.AbstractC8203oOOo0oOo
    public C8349oOoOOo00 OooO00o(float f, float f2) {
        C8349oOoOOo00 offset = getOffset();
        C8349oOoOOo00 oooooo00 = this.OooO0O0;
        oooooo00.f21456OooO00o = offset.f21456OooO00o;
        oooooo00.OooO0O0 = offset.OooO0O0;
        AbstractC8194oOOo0OoO chartView = getChartView();
        float width = (float) getWidth();
        float height = (float) getHeight();
        C8349oOoOOo00 oooooo002 = this.OooO0O0;
        float f3 = oooooo002.f21456OooO00o;
        if (f + f3 < 0.0f) {
            oooooo002.f21456OooO00o = -f;
        } else if (chartView != null && f + width + f3 > ((float) chartView.getWidth())) {
            this.OooO0O0.f21456OooO00o = (((float) chartView.getWidth()) - f) - width;
        }
        C8349oOoOOo00 oooooo003 = this.OooO0O0;
        float f4 = oooooo003.OooO0O0;
        if (f2 + f4 < 0.0f) {
            oooooo003.OooO0O0 = -f2;
        } else if (chartView != null && f2 + height + f4 > ((float) chartView.getHeight())) {
            this.OooO0O0.OooO0O0 = (((float) chartView.getHeight()) - f2) - height;
        }
        return this.OooO0O0;
    }

    @Override // com.p118pd.sdk.AbstractC8203oOOo0oOo
    public void OooO00o(Entry entry, C8246oOOoo0oO ooooo0oo) {
        measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        layout(0, 0, getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // com.p118pd.sdk.AbstractC8203oOOo0oOo
    public void OooO00o(Canvas canvas, float f, float f2) {
        C8349oOoOOo00 OooO00o2 = OooO00o(f, f2);
        int save = canvas.save();
        canvas.translate(f + OooO00o2.f21456OooO00o, f2 + OooO00o2.OooO0O0);
        draw(canvas);
        canvas.restoreToCount(save);
    }
}

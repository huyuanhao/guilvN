package com.p118pd.sdk;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.github.barteksc.pdfviewer.C0906R;
import com.github.barteksc.pdfviewer.PDFView;

/* renamed from: com.pd.sdk.oOOOoooO  reason: case insensitive filesystem */
public class C8169oOOOoooO extends RelativeLayout implements AbstractC8170oOOOoooo {
    public static final int o00oO0O = 65;
    public static final int o0ooOO0 = 40;
    public static final int o0ooOOo = 16;
    public Context OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Handler f21227OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public TextView f21228OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public PDFView f21229OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Runnable f21230OooO00o;
    public boolean OooO0O0;
    public float OooO0Oo;
    public float OooO0o0;

    /* renamed from: com.pd.sdk.oOOOoooO$OooO00o */
    public class OooO00o implements Runnable {
        public OooO00o() {
        }

        public void run() {
            C8169oOOOoooO.this.OooO0Oo();
        }
    }

    public C8169oOOOoooO(Context context) {
        this(context, false);
    }

    private void OooO0o0() {
        int i;
        float f;
        float f2;
        if (this.f21229OooO00o.OooOO0o()) {
            f2 = getY();
            f = (float) getHeight();
            i = this.f21229OooO00o.getHeight();
        } else {
            f2 = getX();
            f = (float) getWidth();
            i = this.f21229OooO00o.getWidth();
        }
        this.OooO0Oo = ((f2 + this.OooO0Oo) / ((float) i)) * f;
    }

    private void setPosition(float f) {
        int i;
        if (!Float.isInfinite(f) && !Float.isNaN(f)) {
            if (this.f21229OooO00o.OooOO0o()) {
                i = this.f21229OooO00o.getHeight();
            } else {
                i = this.f21229OooO00o.getWidth();
            }
            float f2 = (float) i;
            float f3 = f - this.OooO0Oo;
            if (f3 < 0.0f) {
                f3 = 0.0f;
            } else if (f3 > f2 - ((float) C8183oOOo00oo.OooO00o(this.OooO00o, 40))) {
                f3 = f2 - ((float) C8183oOOo00oo.OooO00o(this.OooO00o, 40));
            }
            if (this.f21229OooO00o.OooOO0o()) {
                setY(f3);
            } else {
                setX(f3);
            }
            OooO0o0();
            invalidate();
        }
    }

    @Override // com.p118pd.sdk.AbstractC8170oOOOoooo, com.p118pd.sdk.AbstractC8170oOOOoooo
    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m19821OooO00o() {
        return getVisibility() == 0;
    }

    @Override // com.p118pd.sdk.AbstractC8170oOOOoooo
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public void m19822OooO0O0() {
        this.f21229OooO00o.removeView(this);
    }

    @Override // com.p118pd.sdk.AbstractC8170oOOOoooo
    public void OooO0OO() {
        this.f21227OooO00o.postDelayed(this.f21230OooO00o, 1000);
    }

    @Override // com.p118pd.sdk.AbstractC8170oOOOoooo
    public void OooO0Oo() {
        setVisibility(4);
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x007d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r5) {
        /*
        // Method dump skipped, instructions count: 152
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p118pd.sdk.C8169oOOOoooO.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // com.p118pd.sdk.AbstractC8170oOOOoooo
    public void setPageNum(int i) {
        String valueOf = String.valueOf(i);
        if (!this.f21228OooO00o.getText().equals(valueOf)) {
            this.f21228OooO00o.setText(valueOf);
        }
    }

    @Override // com.p118pd.sdk.AbstractC8170oOOOoooo
    public void setScroll(float f) {
        if (!m19821OooO00o()) {
            OooO00o();
        } else {
            this.f21227OooO00o.removeCallbacks(this.f21230OooO00o);
        }
        setPosition(((float) (this.f21229OooO00o.OooOO0o() ? this.f21229OooO00o.getHeight() : this.f21229OooO00o.getWidth())) * f);
    }

    public void setTextColor(int i) {
        this.f21228OooO00o.setTextColor(i);
    }

    public void setTextSize(int i) {
        this.f21228OooO00o.setTextSize(1, (float) i);
    }

    @Override // com.p118pd.sdk.AbstractC8170oOOOoooo
    public void setupLayout(PDFView pDFView) {
        Drawable drawable;
        int i;
        int i2 = 65;
        int i3 = 40;
        if (!pDFView.OooOO0o()) {
            if (this.OooO0O0) {
                i = 10;
                drawable = C7009o000OoOo.m18256OooO00o(this.OooO00o, C0906R.C0908drawable.default_scroll_handle_top);
            } else {
                i = 12;
                drawable = C7009o000OoOo.m18256OooO00o(this.OooO00o, C0906R.C0908drawable.default_scroll_handle_bottom);
            }
            i2 = 40;
            i3 = 65;
        } else if (this.OooO0O0) {
            i = 9;
            drawable = C7009o000OoOo.m18256OooO00o(this.OooO00o, C0906R.C0908drawable.default_scroll_handle_left);
        } else {
            i = 11;
            drawable = C7009o000OoOo.m18256OooO00o(this.OooO00o, C0906R.C0908drawable.default_scroll_handle_right);
        }
        if (Build.VERSION.SDK_INT < 16) {
            setBackgroundDrawable(drawable);
        } else {
            setBackground(drawable);
        }
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(C8183oOOo00oo.OooO00o(this.OooO00o, i2), C8183oOOo00oo.OooO00o(this.OooO00o, i3));
        layoutParams.setMargins(0, 0, 0, 0);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams2.addRule(13, -1);
        addView(this.f21228OooO00o, layoutParams2);
        layoutParams.addRule(i);
        pDFView.addView(this, layoutParams);
        this.f21229OooO00o = pDFView;
    }

    public C8169oOOOoooO(Context context, boolean z) {
        super(context);
        this.OooO0Oo = 0.0f;
        this.f21227OooO00o = new Handler();
        this.f21230OooO00o = new OooO00o();
        this.OooO00o = context;
        this.OooO0O0 = z;
        this.f21228OooO00o = new TextView(context);
        setVisibility(4);
        setTextColor(-16777216);
        setTextSize(16);
    }

    @Override // com.p118pd.sdk.AbstractC8170oOOOoooo
    private boolean OooO0O0() {
        PDFView pDFView = this.f21229OooO00o;
        return pDFView != null && pDFView.getPageCount() > 0 && !this.f21229OooO00o.m15051OooO0o0();
    }

    @Override // com.p118pd.sdk.AbstractC8170oOOOoooo, com.p118pd.sdk.AbstractC8170oOOOoooo
    public void OooO00o() {
        setVisibility(0);
    }
}

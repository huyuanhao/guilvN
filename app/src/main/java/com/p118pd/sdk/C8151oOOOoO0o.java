package com.p118pd.sdk;

import android.graphics.RectF;
import com.github.barteksc.pdfviewer.PDFView;
import com.p118pd.sdk.C8179oOOo00Oo;
import com.shockwave.pdfium.util.SizeF;

/* renamed from: com.pd.sdk.oOOOoO0o  reason: case insensitive filesystem */
public class C8151oOOOoO0o {
    public float OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public int f21172OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final RectF f21173OooO00o = new RectF(0.0f, 0.0f, 1.0f, 1.0f);

    /* renamed from: OooO00o  reason: collision with other field name */
    public PDFView f21174OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final OooO0O0 f21175OooO00o = new OooO0O0();

    /* renamed from: OooO00o  reason: collision with other field name */
    public final OooO0OO f21176OooO00o = new OooO0OO();
    public float OooO0O0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public final int f21177OooO0O0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public final OooO0O0 f21178OooO0O0 = new OooO0O0();

    /* renamed from: OooO0O0  reason: collision with other field name */
    public final OooO0OO f21179OooO0O0 = new OooO0OO();
    public float OooO0OO;

    /* renamed from: OooO0OO  reason: collision with other field name */
    public final OooO0O0 f21180OooO0OO = new OooO0O0();
    public float OooO0Oo;
    public float OooO0o;
    public float OooO0o0;

    /* renamed from: com.pd.sdk.oOOOoO0o$OooO0O0 */
    public class OooO0O0 {
        public int OooO00o;
        public int OooO0O0;

        public OooO0O0() {
        }
    }

    /* renamed from: com.pd.sdk.oOOOoO0o$OooO0OO */
    public class OooO0OO {
        public int OooO00o;
        public int OooO0O0;
        public int OooO0OO;

        public OooO0OO() {
        }
    }

    public C8151oOOOoO0o(PDFView pDFView) {
        this.f21174OooO00o = pDFView;
        this.f21177OooO0O0 = C8183oOOo00oo.OooO00o(pDFView.getContext(), C8179oOOo00Oo.f21233OooO00o);
    }

    private void OooO00o(OooO0O0 oooO0O0, int i) {
        SizeF OooO00o2 = this.f21174OooO00o.f14897OooO00o.m19805OooO00o(i);
        float height = (C8179oOOo00Oo.OooO0O0 * (1.0f / OooO00o2.getHeight())) / this.f21174OooO00o.getZoom();
        float width = (C8179oOOo00Oo.OooO0O0 * (1.0f / OooO00o2.getWidth())) / this.f21174OooO00o.getZoom();
        oooO0O0.OooO00o = C8180oOOo00o.OooO00o(1.0f / height);
        oooO0O0.OooO0O0 = C8180oOOo00o.OooO00o(1.0f / width);
    }

    private void OooO0O0() {
        int i;
        int i2;
        int OooO00o2;
        float zoom = ((float) this.f21177OooO0O0) * this.f21174OooO00o.getZoom();
        float f = this.OooO00o;
        float f2 = (-f) + zoom;
        float width = ((-f) - ((float) this.f21174OooO00o.getWidth())) - zoom;
        float f3 = this.OooO0O0;
        OooO00o(this.f21176OooO00o, this.f21175OooO00o, f2, (-f3) + zoom, false);
        OooO00o(this.f21179OooO0O0, this.f21178OooO0O0, width, ((-f3) - ((float) this.f21174OooO00o.getHeight())) - zoom, true);
        int i3 = this.f21176OooO00o.OooO00o;
        while (true) {
            i = this.f21179OooO0O0.OooO00o;
            if (i3 > i) {
                break;
            }
            OooO00o(i3);
            i3++;
        }
        int i4 = this.f21176OooO00o.OooO00o;
        int i5 = (i - i4) + 1;
        int i6 = 0;
        while (i4 <= this.f21179OooO0O0.OooO00o && i6 < (i2 = C8179oOOo00Oo.OooO00o.OooO00o)) {
            OooO0OO oooO0OO = this.f21176OooO00o;
            if (i4 != oooO0OO.OooO00o || i5 <= 1) {
                OooO0OO oooO0OO2 = this.f21179OooO0O0;
                if (i4 == oooO0OO2.OooO00o && i5 > 1) {
                    OooO00o2 = OooO0O0(oooO0OO2, this.f21178OooO0O0, C8179oOOo00Oo.OooO00o.OooO00o - i6);
                } else if (i5 == 1) {
                    OooO00o2 = OooO00o(this.f21176OooO00o, this.f21179OooO0O0, this.f21175OooO00o, C8179oOOo00Oo.OooO00o.OooO00o - i6);
                } else {
                    OooO00o(this.f21180OooO0OO, i4);
                    OooO00o2 = OooO00o(i4, this.f21180OooO0OO, C8179oOOo00Oo.OooO00o.OooO00o - i6);
                }
            } else {
                OooO00o2 = OooO00o(oooO0OO, this.f21175OooO00o, i2 - i6);
            }
            i6 += OooO00o2;
            i4++;
        }
    }

    private OooO0OO OooO00o(OooO0OO oooO0OO, OooO0O0 oooO0O0, float f, float f2, boolean z) {
        float f3;
        float f4;
        float f5 = -C8180oOOo00o.OooO00o(f, 0.0f);
        float f6 = -C8180oOOo00o.OooO00o(f2, 0.0f);
        float f7 = this.f21174OooO00o.OooOO0o() ? f6 : f5;
        PDFView pDFView = this.f21174OooO00o;
        int OooO00o2 = pDFView.f14897OooO00o.OooO00o(f7, pDFView.getZoom());
        oooO0OO.OooO00o = OooO00o2;
        OooO00o(oooO0O0, OooO00o2);
        PDFView pDFView2 = this.f21174OooO00o;
        SizeF OooO00o3 = pDFView2.f14897OooO00o.m19806OooO00o(oooO0OO.OooO00o, pDFView2.getZoom());
        float height = OooO00o3.getHeight() / ((float) oooO0O0.OooO00o);
        float width = OooO00o3.getWidth() / ((float) oooO0O0.OooO0O0);
        PDFView pDFView3 = this.f21174OooO00o;
        float OooO0Oo2 = pDFView3.f14897OooO00o.OooO0Oo(oooO0OO.OooO00o, pDFView3.getZoom());
        if (this.f21174OooO00o.OooOO0o()) {
            PDFView pDFView4 = this.f21174OooO00o;
            f3 = Math.abs(f6 - pDFView4.f14897OooO00o.OooO0O0(oooO0OO.OooO00o, pDFView4.getZoom())) / height;
            f4 = C8180oOOo00o.OooO0O0(f5 - OooO0Oo2, 0.0f) / width;
        } else {
            PDFView pDFView5 = this.f21174OooO00o;
            f3 = C8180oOOo00o.OooO0O0(f6 - OooO0Oo2, 0.0f) / height;
            f4 = Math.abs(f5 - pDFView5.f14897OooO00o.OooO0O0(oooO0OO.OooO00o, pDFView5.getZoom())) / width;
        }
        if (z) {
            oooO0OO.OooO0O0 = C8180oOOo00o.OooO00o(f3);
            oooO0OO.OooO0OO = C8180oOOo00o.OooO00o(f4);
        } else {
            oooO0OO.OooO0O0 = C8180oOOo00o.OooO0O0(f3);
            oooO0OO.OooO0OO = C8180oOOo00o.OooO0O0(f4);
        }
        return oooO0OO;
    }

    private int OooO0O0(OooO0OO oooO0OO, OooO0O0 oooO0O0, int i) {
        OooO00o(oooO0O0);
        if (this.f21174OooO00o.OooOO0o()) {
            return OooO00o(oooO0OO.OooO00o, 0, oooO0OO.OooO0O0, 0, oooO0O0.OooO0O0 - 1, i);
        }
        return OooO00o(oooO0OO.OooO00o, 0, oooO0O0.OooO00o - 1, 0, oooO0OO.OooO0OO, i);
    }

    private void OooO00o(OooO0O0 oooO0O0) {
        float f = 1.0f / ((float) oooO0O0.OooO0O0);
        this.OooO0OO = f;
        float f2 = 1.0f / ((float) oooO0O0.OooO00o);
        this.OooO0Oo = f2;
        float f3 = C8179oOOo00Oo.OooO0O0;
        this.OooO0o0 = f3 / f;
        this.OooO0o = f3 / f2;
    }

    private int OooO00o(int i, OooO0O0 oooO0O0, int i2) {
        OooO00o(oooO0O0);
        return OooO00o(i, 0, oooO0O0.OooO00o - 1, 0, oooO0O0.OooO0O0 - 1, i2);
    }

    private int OooO00o(OooO0OO oooO0OO, OooO0OO oooO0OO2, OooO0O0 oooO0O0, int i) {
        OooO00o(oooO0O0);
        return OooO00o(oooO0OO.OooO00o, oooO0OO.OooO0O0, oooO0OO2.OooO0O0, oooO0OO.OooO0OO, oooO0OO2.OooO0OO, i);
    }

    private int OooO00o(OooO0OO oooO0OO, OooO0O0 oooO0O0, int i) {
        OooO00o(oooO0O0);
        if (this.f21174OooO00o.OooOO0o()) {
            return OooO00o(oooO0OO.OooO00o, oooO0OO.OooO0O0, oooO0O0.OooO00o - 1, 0, oooO0O0.OooO0O0 - 1, i);
        }
        return OooO00o(oooO0OO.OooO00o, 0, oooO0O0.OooO00o - 1, oooO0OO.OooO0OO, oooO0O0.OooO0O0 - 1, i);
    }

    private int OooO00o(int i, int i2, int i3, int i4, int i5, int i6) {
        int i7 = 0;
        while (i2 <= i3) {
            for (int i8 = i4; i8 <= i5; i8++) {
                if (OooO00o(i, i2, i8, this.OooO0OO, this.OooO0Oo)) {
                    i7++;
                }
                if (i7 >= i6) {
                    return i7;
                }
            }
            i2++;
        }
        return i7;
    }

    private boolean OooO00o(int i, int i2, int i3, float f, float f2) {
        float f3 = ((float) i3) * f;
        float f4 = ((float) i2) * f2;
        float f5 = this.OooO0o0;
        float f6 = this.OooO0o;
        float f7 = f3 + f > 1.0f ? 1.0f - f3 : f;
        float f8 = f4 + f2 > 1.0f ? 1.0f - f4 : f2;
        float f9 = f5 * f7;
        float f10 = f6 * f8;
        RectF rectF = new RectF(f3, f4, f7 + f3, f8 + f4);
        if (f9 <= 0.0f || f10 <= 0.0f) {
            return false;
        }
        if (!this.f21174OooO00o.f14893OooO00o.OooO00o(i, rectF, this.f21172OooO00o)) {
            PDFView pDFView = this.f21174OooO00o;
            pDFView.f14898OooO00o.OooO00o(i, f9, f10, rectF, false, this.f21172OooO00o, pDFView.m15053OooO0oo(), this.f21174OooO00o.m15050OooO0o());
        }
        this.f21172OooO00o++;
        return true;
    }

    private void OooO00o(int i) {
        SizeF OooO00o2 = this.f21174OooO00o.f14897OooO00o.m19805OooO00o(i);
        float width = OooO00o2.getWidth() * C8179oOOo00Oo.OooO00o;
        float height = OooO00o2.getHeight() * C8179oOOo00Oo.OooO00o;
        if (!this.f21174OooO00o.f14893OooO00o.OooO00o(i, this.f21173OooO00o)) {
            PDFView pDFView = this.f21174OooO00o;
            pDFView.f14898OooO00o.OooO00o(i, width, height, this.f21173OooO00o, true, 0, pDFView.m15053OooO0oo(), this.f21174OooO00o.m15050OooO0o());
        }
    }

    public void OooO00o() {
        this.f21172OooO00o = 1;
        this.OooO00o = -C8180oOOo00o.OooO00o(this.f21174OooO00o.getCurrentXOffset(), 0.0f);
        this.OooO0O0 = -C8180oOOo00o.OooO00o(this.f21174OooO00o.getCurrentYOffset(), 0.0f);
        OooO0O0();
    }
}

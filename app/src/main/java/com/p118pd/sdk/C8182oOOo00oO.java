package com.p118pd.sdk;

import com.github.barteksc.pdfviewer.util.FitPolicy;
import com.shockwave.pdfium.util.Size;
import com.shockwave.pdfium.util.SizeF;

/* renamed from: com.pd.sdk.oOOo00oO  reason: case insensitive filesystem */
public class C8182oOOo00oO {
    public float OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public FitPolicy f21236OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final Size f21237OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public SizeF f21238OooO00o;
    public float OooO0O0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public final Size f21239OooO0O0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public SizeF f21240OooO0O0;
    public final Size OooO0OO;

    /* renamed from: com.pd.sdk.oOOo00oO$OooO00o */
    public static /* synthetic */ class OooO00o {
        public static final /* synthetic */ int[] OooO00o;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.github.barteksc.pdfviewer.util.FitPolicy[] r0 = com.github.barteksc.pdfviewer.util.FitPolicy.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.p118pd.sdk.C8182oOOo00oO.OooO00o.OooO00o = r0
                com.github.barteksc.pdfviewer.util.FitPolicy r1 = com.github.barteksc.pdfviewer.util.FitPolicy.HEIGHT     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.p118pd.sdk.C8182oOOo00oO.OooO00o.OooO00o     // Catch:{ NoSuchFieldError -> 0x001d }
                com.github.barteksc.pdfviewer.util.FitPolicy r1 = com.github.barteksc.pdfviewer.util.FitPolicy.BOTH     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p118pd.sdk.C8182oOOo00oO.OooO00o.<clinit>():void");
        }
    }

    public C8182oOOo00oO(FitPolicy fitPolicy, Size size, Size size2, Size size3) {
        this.f21236OooO00o = fitPolicy;
        this.f21237OooO00o = size;
        this.f21239OooO0O0 = size2;
        this.OooO0OO = size3;
        OooO00o();
    }

    public SizeF OooO00o(Size size) {
        if (size.getWidth() <= 0 || size.getHeight() <= 0) {
            return new SizeF(0.0f, 0.0f);
        }
        int i = OooO00o.OooO00o[this.f21236OooO00o.ordinal()];
        if (i == 1) {
            return OooO00o(size, ((float) size.getHeight()) * this.OooO0O0);
        }
        if (i != 2) {
            return OooO0O0(size, ((float) size.getWidth()) * this.OooO00o);
        }
        return OooO00o(size, ((float) size.getWidth()) * this.OooO00o, ((float) size.getHeight()) * this.OooO0O0);
    }

    public SizeF OooO0O0() {
        return this.f21238OooO00o;
    }

    private SizeF OooO0O0(Size size, float f) {
        return new SizeF(f, (float) Math.floor((double) (f / (((float) size.getWidth()) / ((float) size.getHeight())))));
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public SizeF m19825OooO00o() {
        return this.f21240OooO0O0;
    }

    private void OooO00o() {
        int i = OooO00o.OooO00o[this.f21236OooO00o.ordinal()];
        if (i == 1) {
            SizeF OooO00o2 = OooO00o(this.f21239OooO0O0, (float) this.OooO0OO.getHeight());
            this.f21240OooO0O0 = OooO00o2;
            this.OooO0O0 = OooO00o2.getHeight() / ((float) this.f21239OooO0O0.getHeight());
            Size size = this.f21237OooO00o;
            this.f21238OooO00o = OooO00o(size, ((float) size.getHeight()) * this.OooO0O0);
        } else if (i != 2) {
            SizeF OooO0O02 = OooO0O0(this.f21237OooO00o, (float) this.OooO0OO.getWidth());
            this.f21238OooO00o = OooO0O02;
            this.OooO00o = OooO0O02.getWidth() / ((float) this.f21237OooO00o.getWidth());
            Size size2 = this.f21239OooO0O0;
            this.f21240OooO0O0 = OooO0O0(size2, ((float) size2.getWidth()) * this.OooO00o);
        } else {
            float width = OooO00o(this.f21237OooO00o, (float) this.OooO0OO.getWidth(), (float) this.OooO0OO.getHeight()).getWidth() / ((float) this.f21237OooO00o.getWidth());
            Size size3 = this.f21239OooO0O0;
            SizeF OooO00o3 = OooO00o(size3, ((float) size3.getWidth()) * width, (float) this.OooO0OO.getHeight());
            this.f21240OooO0O0 = OooO00o3;
            this.OooO0O0 = OooO00o3.getHeight() / ((float) this.f21239OooO0O0.getHeight());
            SizeF OooO00o4 = OooO00o(this.f21237OooO00o, (float) this.OooO0OO.getWidth(), ((float) this.f21237OooO00o.getHeight()) * this.OooO0O0);
            this.f21238OooO00o = OooO00o4;
            this.OooO00o = OooO00o4.getWidth() / ((float) this.f21237OooO00o.getWidth());
        }
    }

    private SizeF OooO00o(Size size, float f) {
        return new SizeF((float) Math.floor((double) (f / (((float) size.getHeight()) / ((float) size.getWidth())))), f);
    }

    private SizeF OooO00o(Size size, float f, float f2) {
        float width = ((float) size.getWidth()) / ((float) size.getHeight());
        float floor = (float) Math.floor((double) (f / width));
        if (floor > f2) {
            f = (float) Math.floor((double) (width * f2));
        } else {
            f2 = floor;
        }
        return new SizeF(f, f2);
    }
}

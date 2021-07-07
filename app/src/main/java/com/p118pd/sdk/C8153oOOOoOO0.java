package com.p118pd.sdk;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.SparseBooleanArray;
import com.github.barteksc.pdfviewer.exception.PageRenderingException;
import com.github.barteksc.pdfviewer.util.FitPolicy;
import com.shockwave.pdfium.PdfDocument;
import com.shockwave.pdfium.PdfiumCore;
import com.shockwave.pdfium.util.Size;
import com.shockwave.pdfium.util.SizeF;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.pd.sdk.oOOOoOO0  reason: case insensitive filesystem */
public class C8153oOOOoOO0 {
    public static final Object OooO00o = new Object();

    /* renamed from: OooO00o  reason: collision with other field name */
    public float f21197OooO00o = 0.0f;

    /* renamed from: OooO00o  reason: collision with other field name */
    public int f21198OooO00o = 0;

    /* renamed from: OooO00o  reason: collision with other field name */
    public SparseBooleanArray f21199OooO00o = new SparseBooleanArray();

    /* renamed from: OooO00o  reason: collision with other field name */
    public final FitPolicy f21200OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public PdfDocument f21201OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public PdfiumCore f21202OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Size f21203OooO00o = new Size(0, 0);

    /* renamed from: OooO00o  reason: collision with other field name */
    public SizeF f21204OooO00o = new SizeF(0.0f, 0.0f);

    /* renamed from: OooO00o  reason: collision with other field name */
    public List<Size> f21205OooO00o = new ArrayList();

    /* renamed from: OooO00o  reason: collision with other field name */
    public boolean f21206OooO00o = true;

    /* renamed from: OooO00o  reason: collision with other field name */
    public int[] f21207OooO00o;
    public int OooO0O0 = 0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public Size f21208OooO0O0 = new Size(0, 0);

    /* renamed from: OooO0O0  reason: collision with other field name */
    public SizeF f21209OooO0O0 = new SizeF(0.0f, 0.0f);

    /* renamed from: OooO0O0  reason: collision with other field name */
    public List<SizeF> f21210OooO0O0 = new ArrayList();

    /* renamed from: OooO0O0  reason: collision with other field name */
    public boolean f21211OooO0O0;
    public List<Float> OooO0OO = new ArrayList();
    public List<Float> OooO0Oo = new ArrayList();

    public C8153oOOOoOO0(PdfiumCore pdfiumCore, PdfDocument pdfDocument, FitPolicy fitPolicy, Size size, int[] iArr, boolean z, int i, boolean z2) {
        this.f21202OooO00o = pdfiumCore;
        this.f21201OooO00o = pdfDocument;
        this.f21200OooO00o = fitPolicy;
        this.f21207OooO00o = iArr;
        this.f21206OooO00o = z;
        this.OooO0O0 = i;
        this.f21211OooO0O0 = z2;
        OooO0OO(size);
    }

    private void OooO0OO(Size size) {
        int[] iArr = this.f21207OooO00o;
        if (iArr != null) {
            this.f21198OooO00o = iArr.length;
        } else {
            this.f21198OooO00o = this.f21202OooO00o.getPageCount(this.f21201OooO00o);
        }
        for (int i = 0; i < this.f21198OooO00o; i++) {
            Size pageSize = this.f21202OooO00o.getPageSize(this.f21201OooO00o, OooO0O0(i));
            if (pageSize.getWidth() > this.f21203OooO00o.getWidth()) {
                this.f21203OooO00o = pageSize;
            }
            if (pageSize.getHeight() > this.f21208OooO0O0.getHeight()) {
                this.f21208OooO0O0 = pageSize;
            }
            this.f21205OooO00o.add(pageSize);
        }
        OooO00o(size);
    }

    public void OooO00o(Size size) {
        this.f21210OooO0O0.clear();
        C8182oOOo00oO oooo00oo = new C8182oOOo00oO(this.f21200OooO00o, this.f21203OooO00o, this.f21208OooO0O0, size);
        this.f21209OooO0O0 = oooo00oo.OooO0O0();
        this.f21204OooO00o = oooo00oo.m19825OooO00o();
        for (Size size2 : this.f21205OooO00o) {
            this.f21210OooO0O0.add(oooo00oo.OooO00o(size2));
        }
        if (this.f21211OooO0O0) {
            OooO0O0(size);
        }
        OooO0O0();
        OooO0OO();
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public float m19811OooO0O0() {
        return m19804OooO00o().getWidth();
    }

    public float OooO0Oo(int i, float f) {
        float OooO00o2;
        float height;
        SizeF OooO00o3 = m19805OooO00o(i);
        if (this.f21206OooO00o) {
            OooO00o2 = m19811OooO0O0();
            height = OooO00o3.getWidth();
        } else {
            OooO00o2 = OooO00o();
            height = OooO00o3.getHeight();
        }
        return (f * (OooO00o2 - height)) / 2.0f;
    }

    private void OooO0O0(Size size) {
        float f;
        float f2;
        this.OooO0Oo.clear();
        for (int i = 0; i < m19802OooO00o(); i++) {
            SizeF sizeF = this.f21210OooO0O0.get(i);
            if (this.f21206OooO00o) {
                f = (float) size.getHeight();
                f2 = sizeF.getHeight();
            } else {
                f = (float) size.getWidth();
                f2 = sizeF.getWidth();
            }
            float max = Math.max(0.0f, f - f2);
            if (i < m19802OooO00o() - 1) {
                max += (float) this.OooO0O0;
            }
            this.OooO0Oo.add(Float.valueOf(max));
        }
    }

    private void OooO0O0() {
        float f;
        float f2 = 0.0f;
        for (int i = 0; i < m19802OooO00o(); i++) {
            SizeF sizeF = this.f21210OooO0O0.get(i);
            f2 += this.f21206OooO00o ? sizeF.getHeight() : sizeF.getWidth();
            if (this.f21211OooO0O0) {
                f = this.OooO0Oo.get(i).floatValue();
            } else if (i < m19802OooO00o() - 1) {
                f = (float) this.OooO0O0;
            }
            f2 += f;
        }
        this.f21197OooO00o = f2;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public int m19802OooO00o() {
        return this.f21198OooO00o;
    }

    private void OooO0OO() {
        float f;
        this.OooO0OO.clear();
        float f2 = 0.0f;
        for (int i = 0; i < m19802OooO00o(); i++) {
            SizeF sizeF = this.f21210OooO0O0.get(i);
            float height = this.f21206OooO00o ? sizeF.getHeight() : sizeF.getWidth();
            if (this.f21211OooO0O0) {
                f2 += this.OooO0Oo.get(i).floatValue() / 2.0f;
                if (i == 0) {
                    f2 -= ((float) this.OooO0O0) / 2.0f;
                } else if (i == m19802OooO00o() - 1) {
                    f2 += ((float) this.OooO0O0) / 2.0f;
                }
                this.OooO0OO.add(Float.valueOf(f2));
                f = this.OooO0Oo.get(i).floatValue() / 2.0f;
            } else {
                this.OooO0OO.add(Float.valueOf(f2));
                f = (float) this.OooO0O0;
            }
            f2 += height + f;
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public SizeF m19805OooO00o(int i) {
        if (OooO0O0(i) < 0) {
            return new SizeF(0.0f, 0.0f);
        }
        return this.f21210OooO0O0.get(i);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public SizeF m19806OooO00o(int i, float f) {
        SizeF OooO00o2 = m19805OooO00o(i);
        return new SizeF(OooO00o2.getWidth() * f, OooO00o2.getHeight() * f);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public SizeF m19804OooO00o() {
        return this.f21206OooO00o ? this.f21209OooO0O0 : this.f21204OooO00o;
    }

    public float OooO00o() {
        return m19804OooO00o().getHeight();
    }

    public float OooO00o(float f) {
        return this.f21197OooO00o * f;
    }

    public float OooO0O0(int i, float f) {
        if (OooO0O0(i) < 0) {
            return 0.0f;
        }
        return this.OooO0OO.get(i).floatValue() * f;
    }

    public float OooO00o(int i, float f) {
        SizeF OooO00o2 = m19805OooO00o(i);
        return (this.f21206OooO00o ? OooO00o2.getHeight() : OooO00o2.getWidth()) * f;
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public boolean m19812OooO0O0(int i) {
        return !this.f21199OooO00o.get(OooO0O0(i), false);
    }

    public int OooO00o(float f, float f2) {
        int i = 0;
        int i2 = 0;
        while (i < m19802OooO00o() && (this.OooO0OO.get(i).floatValue() * f2) - (OooO0OO(i, f2) / 2.0f) < f) {
            i2++;
            i++;
        }
        int i3 = i2 - 1;
        if (i3 >= 0) {
            return i3;
        }
        return 0;
    }

    public int OooO0O0(int i) {
        int i2;
        int[] iArr = this.f21207OooO00o;
        if (iArr == null) {
            i2 = i;
        } else if (i < 0 || i >= iArr.length) {
            return -1;
        } else {
            i2 = iArr[i];
        }
        if (i2 < 0 || i >= m19802OooO00o()) {
            return -1;
        }
        return i2;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m19810OooO00o(int i) throws PageRenderingException {
        int OooO0O02 = OooO0O0(i);
        if (OooO0O02 < 0) {
            return false;
        }
        synchronized (OooO00o) {
            if (this.f21199OooO00o.indexOfKey(OooO0O02) >= 0) {
                return false;
            }
            try {
                this.f21202OooO00o.openPage(this.f21201OooO00o, OooO0O02);
                this.f21199OooO00o.put(OooO0O02, true);
                return true;
            } catch (Exception e) {
                this.f21199OooO00o.put(OooO0O02, false);
                throw new PageRenderingException(i, e);
            }
        }
    }

    public float OooO0OO(int i, float f) {
        return (this.f21211OooO0O0 ? this.OooO0Oo.get(i).floatValue() : (float) this.OooO0O0) * f;
    }

    public void OooO00o(Bitmap bitmap, int i, Rect rect, boolean z) {
        this.f21202OooO00o.renderPageBitmap(this.f21201OooO00o, bitmap, OooO0O0(i), rect.left, rect.top, rect.width(), rect.height(), z);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public PdfDocument.Meta m19803OooO00o() {
        PdfDocument pdfDocument = this.f21201OooO00o;
        if (pdfDocument == null) {
            return null;
        }
        return this.f21202OooO00o.getDocumentMeta(pdfDocument);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public List<PdfDocument.Bookmark> m19807OooO00o() {
        PdfDocument pdfDocument = this.f21201OooO00o;
        if (pdfDocument == null) {
            return new ArrayList();
        }
        return this.f21202OooO00o.getTableOfContents(pdfDocument);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public List<PdfDocument.Link> m19808OooO00o(int i) {
        return this.f21202OooO00o.getPageLinks(this.f21201OooO00o, OooO0O0(i));
    }

    public RectF OooO00o(int i, int i2, int i3, int i4, int i5, RectF rectF) {
        return this.f21202OooO00o.mapRectToDevice(this.f21201OooO00o, OooO0O0(i), i2, i3, i4, i5, 0, rectF);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m19809OooO00o() {
        PdfDocument pdfDocument;
        PdfiumCore pdfiumCore = this.f21202OooO00o;
        if (!(pdfiumCore == null || (pdfDocument = this.f21201OooO00o) == null)) {
            pdfiumCore.closeDocument(pdfDocument);
        }
        this.f21201OooO00o = null;
        this.f21207OooO00o = null;
    }

    public int OooO00o(int i) {
        int OooO00o2;
        if (i <= 0) {
            return 0;
        }
        int[] iArr = this.f21207OooO00o;
        if (iArr != null) {
            if (i >= iArr.length) {
                OooO00o2 = iArr.length;
            }
            return i;
        }
        if (i >= m19802OooO00o()) {
            OooO00o2 = m19802OooO00o();
        }
        return i;
        return OooO00o2 - 1;
    }
}

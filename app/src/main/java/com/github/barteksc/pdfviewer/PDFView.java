package com.github.barteksc.pdfviewer;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Paint;
import android.graphics.PaintFlagsDrawFilter;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.HandlerThread;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import com.github.barteksc.pdfviewer.exception.PageRenderingException;
import com.github.barteksc.pdfviewer.util.FitPolicy;
import com.github.barteksc.pdfviewer.util.SnapEdge;
import com.p118pd.sdk.AbstractC8155oOOOoOOo;
import com.p118pd.sdk.AbstractC8156oOOOoOo;
import com.p118pd.sdk.AbstractC8158oOOOoOoO;
import com.p118pd.sdk.AbstractC8159oOOOoo;
import com.p118pd.sdk.AbstractC8160oOOOoo0;
import com.p118pd.sdk.AbstractC8162oOOOoo0O;
import com.p118pd.sdk.AbstractC8163oOOOoo0o;
import com.p118pd.sdk.AbstractC8164oOOOooO;
import com.p118pd.sdk.AbstractC8165oOOOooO0;
import com.p118pd.sdk.AbstractC8166oOOOooOO;
import com.p118pd.sdk.AbstractC8170oOOOoooo;
import com.p118pd.sdk.AbstractC8175oOOo000O;
import com.p118pd.sdk.AsyncTaskC8149oOOOoO00;
import com.p118pd.sdk.C8133oOOOo;
import com.p118pd.sdk.C8146oOOOo0oO;
import com.p118pd.sdk.C8151oOOOoO0o;
import com.p118pd.sdk.C8153oOOOoOO0;
import com.p118pd.sdk.C8154oOOOoOOO;
import com.p118pd.sdk.C8157oOOOoOo0;
import com.p118pd.sdk.C8168oOOOooo0;
import com.p118pd.sdk.C8172oOOo00;
import com.p118pd.sdk.C8173oOOo000;
import com.p118pd.sdk.C8174oOOo0000;
import com.p118pd.sdk.C8176oOOo000o;
import com.p118pd.sdk.C8178oOOo00O0;
import com.p118pd.sdk.C8179oOOo00Oo;
import com.p118pd.sdk.C8180oOOo00o;
import com.p118pd.sdk.C8183oOOo00oo;
import com.p118pd.sdk.GestureDetector$OnGestureListenerC8150oOOOoO0O;
import com.p118pd.sdk.HandlerC8152oOOOoOO;
import com.shockwave.pdfium.PdfDocument;
import com.shockwave.pdfium.PdfiumCore;
import com.shockwave.pdfium.util.Size;
import com.shockwave.pdfium.util.SizeF;
import java.io.File;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PDFView extends RelativeLayout {
    public static final float OooOO0 = 3.0f;
    public static final float OooOO0O = 1.75f;
    public static final float OooOO0o = 1.0f;
    public static final String o0ooOOo = PDFView.class.getSimpleName();
    public float OooO = 1.0f;

    /* renamed from: OooO  reason: collision with other field name */
    public boolean f14885OooO = false;
    public Paint OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public PaintFlagsDrawFilter f14886OooO00o = new PaintFlagsDrawFilter(0, 3);

    /* renamed from: OooO00o  reason: collision with other field name */
    public final HandlerThread f14887OooO00o = new HandlerThread("PDF renderer");

    /* renamed from: OooO00o  reason: collision with other field name */
    public OooO0O0 f14888OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public ScrollDir f14889OooO00o = ScrollDir.NONE;

    /* renamed from: OooO00o  reason: collision with other field name */
    public State f14890OooO00o = State.DEFAULT;

    /* renamed from: OooO00o  reason: collision with other field name */
    public FitPolicy f14891OooO00o = FitPolicy.WIDTH;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C8146oOOOo0oO f14892OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C8133oOOOo f14893OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public AsyncTaskC8149oOOOoO00 f14894OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public GestureDetector$OnGestureListenerC8150oOOOoO0O f14895OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C8151oOOOoO0o f14896OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C8153oOOOoOO0 f14897OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public HandlerC8152oOOOoOO f14898OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C8157oOOOoOo0 f14899OooO00o = new C8157oOOOoOo0();

    /* renamed from: OooO00o  reason: collision with other field name */
    public AbstractC8170oOOOoooo f14900OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public PdfiumCore f14901OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public List<Integer> f14902OooO00o = new ArrayList(10);
    public Paint OooO0O0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public boolean f14903OooO0O0 = true;
    public boolean OooO0OO = true;
    public float OooO0Oo = 1.0f;

    /* renamed from: OooO0Oo  reason: collision with other field name */
    public boolean f14904OooO0Oo = true;
    public float OooO0o = 3.0f;

    /* renamed from: OooO0o  reason: collision with other field name */
    public boolean f14905OooO0o = false;
    public float OooO0o0 = 1.75f;

    /* renamed from: OooO0o0  reason: collision with other field name */
    public boolean f14906OooO0o0 = true;
    public float OooO0oO = 0.0f;

    /* renamed from: OooO0oO  reason: collision with other field name */
    public boolean f14907OooO0oO = true;
    public float OooO0oo = 0.0f;

    /* renamed from: OooO0oo  reason: collision with other field name */
    public boolean f14908OooO0oo = false;

    /* renamed from: OooOO0  reason: collision with other field name */
    public boolean f14909OooOO0 = false;

    /* renamed from: OooOO0O  reason: collision with other field name */
    public boolean f14910OooOO0O = false;

    /* renamed from: OooOO0o  reason: collision with other field name */
    public boolean f14911OooOO0o = true;
    public boolean OooOOO = true;
    public boolean OooOOO0 = false;
    public boolean OooOOOO = false;
    public int o00oO0O;
    public int o0ooOO0 = 0;

    /* renamed from: o0ooOOo  reason: collision with other field name */
    public int f14912o0ooOOo = 0;

    public class OooO0O0 {
        public boolean OooO;
        public int OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public FitPolicy f14914OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public AbstractC8155oOOOoOOo f14915OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public AbstractC8156oOOOoOo f14916OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public AbstractC8158oOOOoOoO f14917OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public AbstractC8160oOOOoo0 f14918OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public AbstractC8162oOOOoo0O f14919OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public AbstractC8163oOOOoo0o f14920OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public AbstractC8159oOOOoo f14921OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public AbstractC8165oOOOooO0 f14922OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public AbstractC8164oOOOooO f14923OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public AbstractC8166oOOOooOO f14924OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public AbstractC8170oOOOoooo f14925OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final AbstractC8175oOOo000O f14926OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public String f14927OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public boolean f14928OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public int[] f14929OooO00o;
        public int OooO0O0;

        /* renamed from: OooO0O0  reason: collision with other field name */
        public AbstractC8156oOOOoOo f14930OooO0O0;

        /* renamed from: OooO0O0  reason: collision with other field name */
        public boolean f14931OooO0O0;
        public boolean OooO0OO;
        public boolean OooO0Oo;
        public boolean OooO0o;
        public boolean OooO0o0;
        public boolean OooO0oO;
        public boolean OooO0oo;

        public OooO0O0 OooO(boolean z) {
            this.OooO0OO = z;
            return this;
        }

        public OooO0O0 OooO00o(int... iArr) {
            this.f14929OooO00o = iArr;
            return this;
        }

        public OooO0O0 OooO0O0(boolean z) {
            this.OooO0Oo = z;
            return this;
        }

        public OooO0O0 OooO0OO(boolean z) {
            this.OooO0o0 = z;
            return this;
        }

        public OooO0O0 OooO0Oo(boolean z) {
            this.f14931OooO0O0 = z;
            return this;
        }

        public OooO0O0 OooO0o(boolean z) {
            this.OooO = z;
            return this;
        }

        public OooO0O0 OooO0o0(boolean z) {
            this.f14928OooO00o = z;
            return this;
        }

        public OooO0O0 OooO0oO(boolean z) {
            this.OooO0oO = z;
            return this;
        }

        public OooO0O0 OooO0oo(boolean z) {
            this.OooO0oo = z;
            return this;
        }

        public OooO0O0(AbstractC8175oOOo000O oooo000o) {
            this.f14929OooO00o = null;
            this.f14928OooO00o = true;
            this.f14931OooO0O0 = true;
            this.f14915OooO00o = new C8154oOOOoOOO(PDFView.this);
            this.OooO00o = 0;
            this.OooO0OO = false;
            this.OooO0Oo = false;
            this.f14927OooO00o = null;
            this.f14925OooO00o = null;
            this.OooO0o0 = true;
            this.OooO0O0 = 0;
            this.OooO0o = false;
            this.f14914OooO00o = FitPolicy.WIDTH;
            this.OooO0oO = false;
            this.OooO0oo = false;
            this.OooO = false;
            this.f14926OooO00o = oooo000o;
        }

        public OooO0O0 OooO00o(AbstractC8156oOOOoOo ooooooo) {
            this.f14916OooO00o = ooooooo;
            return this;
        }

        public OooO0O0 OooO0O0(AbstractC8156oOOOoOo ooooooo) {
            this.f14930OooO0O0 = ooooooo;
            return this;
        }

        public OooO0O0 OooO00o(AbstractC8160oOOOoo0 oooooo0) {
            this.f14918OooO00o = oooooo0;
            return this;
        }

        public OooO0O0 OooO0O0(int i) {
            this.OooO0O0 = i;
            return this;
        }

        public OooO0O0 OooO00o(AbstractC8165oOOOooO0 ooooooo0) {
            this.f14922OooO00o = ooooooo0;
            return this;
        }

        public OooO0O0 OooO00o(AbstractC8158oOOOoOoO oooooooo) {
            this.f14917OooO00o = oooooooo;
            return this;
        }

        public OooO0O0 OooO00o(AbstractC8159oOOOoo oooooo) {
            this.f14921OooO00o = oooooo;
            return this;
        }

        public OooO0O0 OooO00o(AbstractC8163oOOOoo0o oooooo0o) {
            this.f14920OooO00o = oooooo0o;
            return this;
        }

        public OooO0O0 OooO00o(AbstractC8164oOOOooO ooooooo) {
            this.f14923OooO00o = ooooooo;
            return this;
        }

        public OooO0O0 OooO00o(AbstractC8166oOOOooOO oooooooo) {
            this.f14924OooO00o = oooooooo;
            return this;
        }

        public OooO0O0 OooO00o(AbstractC8162oOOOoo0O oooooo0o) {
            this.f14919OooO00o = oooooo0o;
            return this;
        }

        public OooO0O0 OooO00o(AbstractC8155oOOOoOOo oooooooo) {
            this.f14915OooO00o = oooooooo;
            return this;
        }

        public OooO0O0 OooO00o(int i) {
            this.OooO00o = i;
            return this;
        }

        public OooO0O0 OooO00o(String str) {
            this.f14927OooO00o = str;
            return this;
        }

        public OooO0O0 OooO00o(AbstractC8170oOOOoooo oooooooo) {
            this.f14925OooO00o = oooooooo;
            return this;
        }

        public OooO0O0 OooO00o(boolean z) {
            this.OooO0o = z;
            return this;
        }

        public OooO0O0 OooO00o(FitPolicy fitPolicy) {
            this.f14914OooO00o = fitPolicy;
            return this;
        }

        public void OooO00o() {
            if (!PDFView.this.OooOOOO) {
                PDFView.this.f14888OooO00o = this;
                return;
            }
            PDFView.this.OooO0Oo();
            PDFView.this.f14899OooO00o.OooO00o(this.f14918OooO00o);
            PDFView.this.f14899OooO00o.OooO00o(this.f14917OooO00o);
            PDFView.this.f14899OooO00o.OooO00o(this.f14916OooO00o);
            PDFView.this.f14899OooO00o.OooO0O0(this.f14930OooO0O0);
            PDFView.this.f14899OooO00o.OooO00o(this.f14920OooO00o);
            PDFView.this.f14899OooO00o.OooO00o(this.f14922OooO00o);
            PDFView.this.f14899OooO00o.OooO00o(this.f14923OooO00o);
            PDFView.this.f14899OooO00o.OooO00o(this.f14924OooO00o);
            PDFView.this.f14899OooO00o.OooO00o(this.f14919OooO00o);
            PDFView.this.f14899OooO00o.OooO00o(this.f14921OooO00o);
            PDFView.this.f14899OooO00o.OooO00o(this.f14915OooO00o);
            PDFView.this.setSwipeEnabled(this.f14928OooO00o);
            PDFView.this.setNightMode(this.OooO);
            PDFView.this.OooO0OO(this.f14931OooO0O0);
            PDFView.this.setDefaultPage(this.OooO00o);
            PDFView.this.setSwipeVertical(!this.OooO0OO);
            PDFView.this.OooO00o(this.OooO0Oo);
            PDFView.this.setScrollHandle(this.f14925OooO00o);
            PDFView.this.OooO0O0(this.OooO0o0);
            PDFView.this.setSpacing(this.OooO0O0);
            PDFView.this.setAutoSpacing(this.OooO0o);
            PDFView.this.setPageFitPolicy(this.f14914OooO00o);
            PDFView.this.setPageSnap(this.OooO0oo);
            PDFView.this.setPageFling(this.OooO0oO);
            int[] iArr = this.f14929OooO00o;
            if (iArr != null) {
                PDFView.this.OooO00o((PDFView) this.f14926OooO00o, (AbstractC8175oOOo000O) this.f14927OooO00o, (String) iArr);
            } else {
                PDFView.this.OooO00o((PDFView) this.f14926OooO00o, (AbstractC8175oOOo000O) this.f14927OooO00o);
            }
        }
    }

    public enum ScrollDir {
        NONE,
        START,
        END
    }

    public enum State {
        DEFAULT,
        LOADED,
        SHOWN,
        ERROR
    }

    public PDFView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (!isInEditMode()) {
            this.f14893OooO00o = new C8133oOOOo();
            C8146oOOOo0oO ooooo0oo = new C8146oOOOo0oO(this);
            this.f14892OooO00o = ooooo0oo;
            this.f14895OooO00o = new GestureDetector$OnGestureListenerC8150oOOOoO0O(this, ooooo0oo);
            this.f14896OooO00o = new C8151oOOOoO0o(this);
            this.OooO00o = new Paint();
            Paint paint = new Paint();
            this.OooO0O0 = paint;
            paint.setStyle(Paint.Style.STROKE);
            this.f14901OooO00o = new PdfiumCore(context);
            setWillNotDraw(false);
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void setAutoSpacing(boolean z) {
        this.OooOOO0 = z;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void setDefaultPage(int i) {
        this.o0ooOO0 = i;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void setPageFitPolicy(FitPolicy fitPolicy) {
        this.f14891OooO00o = fitPolicy;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void setScrollHandle(AbstractC8170oOOOoooo oooooooo) {
        this.f14900OooO00o = oooooooo;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void setSpacing(int i) {
        this.f14912o0ooOOo = C8183oOOo00oo.OooO00o(getContext(), i);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void setSwipeVertical(boolean z) {
        this.OooO0OO = z;
    }

    public boolean OooO() {
        return this.f14906OooO0o0;
    }

    public void OooO0OO(int i) {
        OooO00o(i, false);
    }

    public void OooO0Oo(int i) {
        if (!this.f14903OooO0O0) {
            this.o00oO0O = this.f14897OooO00o.OooO00o(i);
            OooO0O0();
            if (this.f14900OooO00o != null && !m15051OooO0o0()) {
                this.f14900OooO00o.setPageNum(this.o00oO0O + 1);
            }
            this.f14899OooO00o.OooO00o(this.o00oO0O, this.f14897OooO00o.m19802OooO00o());
        }
    }

    public void OooO0o() {
        m15043OooO00o(this.OooO0Oo);
    }

    public void OooO0o0() {
        invalidate();
    }

    public void OooO0oO() {
        m15046OooO0O0(this.OooO0Oo);
    }

    public void OooO0oo() {
        this.f14892OooO00o.OooO0OO();
    }

    public boolean OooOO0() {
        return this.f14903OooO0O0;
    }

    public boolean OooOO0O() {
        return this.f14904OooO0Oo;
    }

    public boolean OooOO0o() {
        return this.OooO0OO;
    }

    public boolean OooOOO() {
        float f = -this.f14897OooO00o.OooO0O0(this.o00oO0O, this.OooO);
        float OooO00o2 = f - this.f14897OooO00o.OooO00o(this.o00oO0O, this.OooO);
        if (OooOO0o()) {
            float f2 = this.OooO0oo;
            if (f <= f2 || OooO00o2 >= f2 - ((float) getHeight())) {
                return false;
            }
            return true;
        }
        float f3 = this.OooO0oO;
        if (f <= f3 || OooO00o2 >= f3 - ((float) getWidth())) {
            return false;
        }
        return true;
    }

    public boolean OooOOO0() {
        return this.OooO != this.OooO0Oo;
    }

    public boolean canScrollHorizontally(int i) {
        if (this.f14897OooO00o == null) {
            return true;
        }
        if (this.OooO0OO) {
            if (i < 0 && this.OooO0oO < 0.0f) {
                return true;
            }
            if (i <= 0 || this.OooO0oO + OooO00o(this.f14897OooO00o.m19811OooO0O0()) <= ((float) getWidth())) {
                return false;
            }
            return true;
        } else if (i < 0 && this.OooO0oO < 0.0f) {
            return true;
        } else {
            if (i <= 0 || this.OooO0oO + this.f14897OooO00o.OooO00o(this.OooO) <= ((float) getWidth())) {
                return false;
            }
            return true;
        }
    }

    public boolean canScrollVertically(int i) {
        if (this.f14897OooO00o == null) {
            return true;
        }
        if (this.OooO0OO) {
            if (i < 0 && this.OooO0oo < 0.0f) {
                return true;
            }
            if (i <= 0 || this.OooO0oo + this.f14897OooO00o.OooO00o(this.OooO) <= ((float) getHeight())) {
                return false;
            }
            return true;
        } else if (i < 0 && this.OooO0oo < 0.0f) {
            return true;
        } else {
            if (i <= 0 || this.OooO0oo + OooO00o(this.f14897OooO00o.OooO00o()) <= ((float) getHeight())) {
                return false;
            }
            return true;
        }
    }

    public void computeScroll() {
        super.computeScroll();
        if (!isInEditMode()) {
            this.f14892OooO00o.OooO00o();
        }
    }

    public int getCurrentPage() {
        return this.o00oO0O;
    }

    public float getCurrentXOffset() {
        return this.OooO0oO;
    }

    public float getCurrentYOffset() {
        return this.OooO0oo;
    }

    public PdfDocument.Meta getDocumentMeta() {
        C8153oOOOoOO0 ooooooo0 = this.f14897OooO00o;
        if (ooooooo0 == null) {
            return null;
        }
        return ooooooo0.m19803OooO00o();
    }

    public float getMaxZoom() {
        return this.OooO0o;
    }

    public float getMidZoom() {
        return this.OooO0o0;
    }

    public float getMinZoom() {
        return this.OooO0Oo;
    }

    public int getPageCount() {
        C8153oOOOoOO0 ooooooo0 = this.f14897OooO00o;
        if (ooooooo0 == null) {
            return 0;
        }
        return ooooooo0.m19802OooO00o();
    }

    public FitPolicy getPageFitPolicy() {
        return this.f14891OooO00o;
    }

    public float getPositionOffset() {
        int i;
        float f;
        float f2;
        if (this.OooO0OO) {
            f2 = -this.OooO0oo;
            f = this.f14897OooO00o.OooO00o(this.OooO);
            i = getHeight();
        } else {
            f2 = -this.OooO0oO;
            f = this.f14897OooO00o.OooO00o(this.OooO);
            i = getWidth();
        }
        return C8180oOOo00o.OooO00o(f2 / (f - ((float) i)), 0.0f, 1.0f);
    }

    public AbstractC8170oOOOoooo getScrollHandle() {
        return this.f14900OooO00o;
    }

    public int getSpacingPx() {
        return this.f14912o0ooOOo;
    }

    public List<PdfDocument.Bookmark> getTableOfContents() {
        C8153oOOOoOO0 ooooooo0 = this.f14897OooO00o;
        if (ooooooo0 == null) {
            return Collections.emptyList();
        }
        return ooooooo0.m19807OooO00o();
    }

    public float getZoom() {
        return this.OooO;
    }

    public void onDetachedFromWindow() {
        OooO0Oo();
        super.onDetachedFromWindow();
    }

    public void onDraw(Canvas canvas) {
        if (!isInEditMode()) {
            if (this.f14911OooOO0o) {
                canvas.setDrawFilter(this.f14886OooO00o);
            }
            Drawable background = getBackground();
            if (background == null) {
                canvas.drawColor(this.f14905OooO0o ? -16777216 : -1);
            } else {
                background.draw(canvas);
            }
            if (!this.f14903OooO0O0 && this.f14890OooO00o == State.SHOWN) {
                float f = this.OooO0oO;
                float f2 = this.OooO0oo;
                canvas.translate(f, f2);
                for (C8168oOOOooo0 ooooooo0 : this.f14893OooO00o.OooO0O0()) {
                    OooO00o(canvas, ooooooo0);
                }
                for (C8168oOOOooo0 ooooooo02 : this.f14893OooO00o.OooO00o()) {
                    OooO00o(canvas, ooooooo02);
                    if (this.f14899OooO00o.OooO0O0() != null && !this.f14902OooO00o.contains(Integer.valueOf(ooooooo02.OooO0O0()))) {
                        this.f14902OooO00o.add(Integer.valueOf(ooooooo02.OooO0O0()));
                    }
                }
                for (Integer num : this.f14902OooO00o) {
                    OooO00o(canvas, num.intValue(), this.f14899OooO00o.OooO0O0());
                }
                this.f14902OooO00o.clear();
                OooO00o(canvas, this.o00oO0O, this.f14899OooO00o.OooO00o());
                canvas.translate(-f, -f2);
            }
        }
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        this.OooOOOO = true;
        OooO0O0 oooO0O0 = this.f14888OooO00o;
        if (oooO0O0 != null) {
            oooO0O0.OooO00o();
        }
        if (!isInEditMode() && this.f14890OooO00o == State.SHOWN) {
            this.f14892OooO00o.OooO0O0();
            this.f14897OooO00o.OooO00o(new Size(i, i2));
            if (this.OooO0OO) {
                OooO0O0(this.OooO0oO, -this.f14897OooO00o.OooO0O0(this.o00oO0O, this.OooO));
            } else {
                OooO0O0(-this.f14897OooO00o.OooO0O0(this.o00oO0O, this.OooO), this.OooO0oo);
            }
            OooO00o();
        }
    }

    public void setMaxZoom(float f) {
        this.OooO0o = f;
    }

    public void setMidZoom(float f) {
        this.OooO0o0 = f;
    }

    public void setMinZoom(float f) {
        this.OooO0Oo = f;
    }

    public void setNightMode(boolean z) {
        this.f14905OooO0o = z;
        if (z) {
            this.OooO00o.setColorFilter(new ColorMatrixColorFilter(new ColorMatrix(new float[]{-1.0f, 0.0f, 0.0f, 0.0f, 255.0f, 0.0f, -1.0f, 0.0f, 0.0f, 255.0f, 0.0f, 0.0f, -1.0f, 0.0f, 255.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f})));
            return;
        }
        this.OooO00o.setColorFilter(null);
    }

    public void setPageFling(boolean z) {
        this.OooOOO = z;
    }

    public void setPageSnap(boolean z) {
        this.f14907OooO0oO = z;
    }

    public void setPositionOffset(float f) {
        OooO00o(f, true);
    }

    public void setSwipeEnabled(boolean z) {
        this.f14904OooO0Oo = z;
    }

    public void OooO0OO(boolean z) {
        this.f14906OooO0o0 = z;
    }

    /* renamed from: OooO0o  reason: collision with other method in class */
    public boolean m15050OooO0o() {
        return this.f14909OooOO0;
    }

    /* renamed from: OooO0o0  reason: collision with other method in class */
    public boolean m15051OooO0o0() {
        float OooO00o2 = this.f14897OooO00o.OooO00o(1.0f);
        if (this.OooO0OO) {
            if (OooO00o2 < ((float) getHeight())) {
                return true;
            }
            return false;
        } else if (OooO00o2 < ((float) getWidth())) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: OooO0oO  reason: collision with other method in class */
    public boolean m15052OooO0oO() {
        return this.f14911OooOO0o;
    }

    /* renamed from: OooO0oo  reason: collision with other method in class */
    public boolean m15053OooO0oo() {
        return this.f14885OooO;
    }

    public void OooO0O0() {
        HandlerC8152oOOOoOO ooooooo;
        if (this.f14897OooO00o != null && (ooooooo = this.f14898OooO00o) != null) {
            ooooooo.removeMessages(1);
            this.f14893OooO00o.m19791OooO00o();
            this.f14896OooO00o.OooO00o();
            OooO0o0();
        }
    }

    public void OooO0OO() {
        C8153oOOOoOO0 ooooooo0;
        int OooO00o2;
        SnapEdge OooO00o3;
        if (this.f14907OooO0oO && (ooooooo0 = this.f14897OooO00o) != null && ooooooo0.m19802OooO00o() != 0 && (OooO00o3 = OooO00o((OooO00o2 = OooO00o(this.OooO0oO, this.OooO0oo)))) != SnapEdge.NONE) {
            float OooO00o4 = OooO00o(OooO00o2, OooO00o3);
            if (this.OooO0OO) {
                this.f14892OooO00o.OooO0O0(this.OooO0oo, -OooO00o4);
            } else {
                this.f14892OooO00o.OooO00o(this.OooO0oO, -OooO00o4);
            }
        }
    }

    public void OooO0o0(boolean z) {
        this.f14885OooO = z;
    }

    public void OooO0O0(float f, float f2) {
        OooO00o(f, f2, true);
    }

    public void OooO0Oo() {
        this.f14888OooO00o = null;
        this.f14892OooO00o.OooO0O0();
        this.f14895OooO00o.OooO00o();
        HandlerC8152oOOOoOO ooooooo = this.f14898OooO00o;
        if (ooooooo != null) {
            ooooooo.OooO0O0();
            this.f14898OooO00o.removeMessages(1);
        }
        AsyncTaskC8149oOOOoO00 oooooo00 = this.f14894OooO00o;
        if (oooooo00 != null) {
            oooooo00.cancel(true);
        }
        this.f14893OooO00o.m19792OooO0O0();
        AbstractC8170oOOOoooo oooooooo = this.f14900OooO00o;
        if (oooooooo != null && this.f14908OooO0oo) {
            oooooooo.OooO0O0();
        }
        C8153oOOOoOO0 ooooooo0 = this.f14897OooO00o;
        if (ooooooo0 != null) {
            ooooooo0.m19809OooO00o();
            this.f14897OooO00o = null;
        }
        this.f14898OooO00o = null;
        this.f14900OooO00o = null;
        this.f14908OooO0oo = false;
        this.OooO0oo = 0.0f;
        this.OooO0oO = 0.0f;
        this.OooO = 1.0f;
        this.f14903OooO0O0 = true;
        this.f14899OooO00o = new C8157oOOOoOo0();
        this.f14890OooO00o = State.DEFAULT;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void OooO00o(AbstractC8175oOOo000O oooo000o, String str) {
        OooO00o(oooo000o, str, (int[]) null);
    }

    public void OooO0O0(float f, PointF pointF) {
        float f2 = f / this.OooO;
        m15043OooO00o(f);
        float f3 = pointF.x;
        float f4 = pointF.y;
        OooO0O0((this.OooO0oO * f2) + (f3 - (f3 * f2)), (this.OooO0oo * f2) + (f4 - (f2 * f4)));
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void OooO00o(AbstractC8175oOOo000O oooo000o, String str, int[] iArr) {
        if (this.f14903OooO0O0) {
            this.f14903OooO0O0 = false;
            AsyncTaskC8149oOOOoO00 oooooo00 = new AsyncTaskC8149oOOOoO00(oooo000o, str, iArr, this, this.f14901OooO00o);
            this.f14894OooO00o = oooooo00;
            oooooo00.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
            return;
        }
        throw new IllegalStateException("Don't call load on a PDF View without recycling it first.");
    }

    /* renamed from: OooO0OO  reason: collision with other method in class */
    public boolean m15048OooO0OO() {
        return this.f14907OooO0oO;
    }

    public void OooO00o(int i, boolean z) {
        float f;
        C8153oOOOoOO0 ooooooo0 = this.f14897OooO00o;
        if (ooooooo0 != null) {
            int OooO00o2 = ooooooo0.OooO00o(i);
            if (OooO00o2 == 0) {
                f = 0.0f;
            } else {
                f = -this.f14897OooO00o.OooO0O0(OooO00o2, this.OooO);
            }
            if (this.OooO0OO) {
                if (z) {
                    this.f14892OooO00o.OooO0O0(this.OooO0oo, f);
                } else {
                    OooO0O0(this.OooO0oO, f);
                }
            } else if (z) {
                this.f14892OooO00o.OooO00o(this.OooO0oO, f);
            } else {
                OooO0O0(f, this.OooO0oo);
            }
            OooO0Oo(OooO00o2);
        }
    }

    public void OooO0O0(int i) {
        if (this.f14890OooO00o == State.SHOWN) {
            m15043OooO00o(((float) getWidth()) / this.f14897OooO00o.m19805OooO00o(i).getWidth());
            OooO0OO(i);
        }
    }

    public float OooO0O0(float f) {
        return f / this.OooO;
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public void m15046OooO0O0(float f) {
        this.f14892OooO00o.OooO00o((float) (getWidth() / 2), (float) (getHeight() / 2), this.OooO, f);
    }

    public void OooO0O0(boolean z) {
        this.f14911OooOO0o = z;
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public boolean m15047OooO0O0() {
        return this.OooOOO;
    }

    public void OooO00o(float f, boolean z) {
        if (this.OooO0OO) {
            OooO00o(this.OooO0oO, ((-this.f14897OooO00o.OooO00o(this.OooO)) + ((float) getHeight())) * f, z);
        } else {
            OooO00o(((-this.f14897OooO00o.OooO00o(this.OooO)) + ((float) getWidth())) * f, this.OooO0oo, z);
        }
        OooO00o();
    }

    public void OooO00o(PageRenderingException pageRenderingException) {
        if (!this.f14899OooO00o.OooO00o(pageRenderingException.getPage(), pageRenderingException.getCause())) {
            String str = "Cannot open page " + pageRenderingException.getPage();
            pageRenderingException.getCause();
        }
    }

    private void OooO00o(Canvas canvas, int i, AbstractC8156oOOOoOo ooooooo) {
        float f;
        if (ooooooo != null) {
            float f2 = 0.0f;
            if (this.OooO0OO) {
                f = this.f14897OooO00o.OooO0O0(i, this.OooO);
            } else {
                f2 = this.f14897OooO00o.OooO0O0(i, this.OooO);
                f = 0.0f;
            }
            canvas.translate(f2, f);
            SizeF OooO00o2 = this.f14897OooO00o.m19805OooO00o(i);
            ooooooo.OooO00o(canvas, OooO00o(OooO00o2.getWidth()), OooO00o(OooO00o2.getHeight()), i);
            canvas.translate(-f2, -f);
        }
    }

    public void OooO0Oo(boolean z) {
        this.f14910OooOO0O = z;
    }

    /* renamed from: OooO0Oo  reason: collision with other method in class */
    public boolean m15049OooO0Oo() {
        return this.f14910OooOO0O;
    }

    private void OooO00o(Canvas canvas, C8168oOOOooo0 ooooooo0) {
        float f;
        float f2;
        RectF OooO00o2 = ooooooo0.m19819OooO00o();
        Bitmap OooO00o3 = ooooooo0.m19818OooO00o();
        if (!OooO00o3.isRecycled()) {
            SizeF OooO00o4 = this.f14897OooO00o.m19805OooO00o(ooooooo0.OooO0O0());
            if (this.OooO0OO) {
                f2 = this.f14897OooO00o.OooO0O0(ooooooo0.OooO0O0(), this.OooO);
                f = OooO00o(this.f14897OooO00o.m19811OooO0O0() - OooO00o4.getWidth()) / 2.0f;
            } else {
                f = this.f14897OooO00o.OooO0O0(ooooooo0.OooO0O0(), this.OooO);
                f2 = OooO00o(this.f14897OooO00o.OooO00o() - OooO00o4.getHeight()) / 2.0f;
            }
            canvas.translate(f, f2);
            Rect rect = new Rect(0, 0, OooO00o3.getWidth(), OooO00o3.getHeight());
            float OooO00o5 = OooO00o(OooO00o2.left * OooO00o4.getWidth());
            float OooO00o6 = OooO00o(OooO00o2.top * OooO00o4.getHeight());
            RectF rectF = new RectF((float) ((int) OooO00o5), (float) ((int) OooO00o6), (float) ((int) (OooO00o5 + OooO00o(OooO00o2.width() * OooO00o4.getWidth()))), (float) ((int) (OooO00o6 + OooO00o(OooO00o2.height() * OooO00o4.getHeight()))));
            float f3 = this.OooO0oO + f;
            float f4 = this.OooO0oo + f2;
            if (rectF.left + f3 >= ((float) getWidth()) || f3 + rectF.right <= 0.0f || rectF.top + f4 >= ((float) getHeight()) || f4 + rectF.bottom <= 0.0f) {
                canvas.translate(-f, -f2);
                return;
            }
            canvas.drawBitmap(OooO00o3, rect, rectF, this.OooO00o);
            if (C8179oOOo00Oo.f21234OooO00o) {
                this.OooO0O0.setColor(ooooooo0.OooO0O0() % 2 == 0 ? -65536 : -16776961);
                canvas.drawRect(rectF, this.OooO0O0);
            }
            canvas.translate(-f, -f2);
        }
    }

    public void OooO00o(C8153oOOOoOO0 ooooooo0) {
        this.f14890OooO00o = State.LOADED;
        this.f14897OooO00o = ooooooo0;
        if (!this.f14887OooO00o.isAlive()) {
            this.f14887OooO00o.start();
        }
        HandlerC8152oOOOoOO ooooooo = new HandlerC8152oOOOoOO(this.f14887OooO00o.getLooper(), this);
        this.f14898OooO00o = ooooooo;
        ooooooo.OooO00o();
        AbstractC8170oOOOoooo oooooooo = this.f14900OooO00o;
        if (oooooooo != null) {
            oooooooo.setupLayout(this);
            this.f14908OooO0oo = true;
        }
        this.f14895OooO00o.OooO0O0();
        this.f14899OooO00o.OooO00o(ooooooo0.m19802OooO00o());
        OooO00o(this.o0ooOO0, false);
    }

    public void OooO00o(Throwable th) {
        this.f14890OooO00o = State.ERROR;
        AbstractC8158oOOOoOoO OooO00o2 = this.f14899OooO00o.m19813OooO00o();
        OooO0Oo();
        invalidate();
        if (OooO00o2 != null) {
            OooO00o2.onError(th);
        }
    }

    public void OooO00o(C8168oOOOooo0 ooooooo0) {
        if (this.f14890OooO00o == State.LOADED) {
            this.f14890OooO00o = State.SHOWN;
            this.f14899OooO00o.OooO0O0(this.f14897OooO00o.m19802OooO00o());
        }
        if (ooooooo0.m19820OooO00o()) {
            this.f14893OooO00o.OooO0O0(ooooooo0);
        } else {
            this.f14893OooO00o.OooO00o(ooooooo0);
        }
        OooO0o0();
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00cd  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00d5  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00f3  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00f8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void OooO00o(float r6, float r7, boolean r8) {
        /*
        // Method dump skipped, instructions count: 299
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.barteksc.pdfviewer.PDFView.OooO00o(float, float, boolean):void");
    }

    public void OooO00o() {
        int i;
        float f;
        if (this.f14897OooO00o.m19802OooO00o() != 0) {
            if (this.OooO0OO) {
                f = this.OooO0oo;
                i = getHeight();
            } else {
                f = this.OooO0oO;
                i = getWidth();
            }
            int OooO00o2 = this.f14897OooO00o.OooO00o(-(f - (((float) i) / 2.0f)), this.OooO);
            if (OooO00o2 < 0 || OooO00o2 > this.f14897OooO00o.m19802OooO00o() - 1 || OooO00o2 == getCurrentPage()) {
                OooO0O0();
            } else {
                OooO0Oo(OooO00o2);
            }
        }
    }

    public SnapEdge OooO00o(int i) {
        if (!this.f14907OooO0oO || i < 0) {
            return SnapEdge.NONE;
        }
        float f = this.OooO0OO ? this.OooO0oo : this.OooO0oO;
        float f2 = -this.f14897OooO00o.OooO0O0(i, this.OooO);
        int height = this.OooO0OO ? getHeight() : getWidth();
        float OooO00o2 = this.f14897OooO00o.OooO00o(i, this.OooO);
        float f3 = (float) height;
        if (f3 >= OooO00o2) {
            return SnapEdge.CENTER;
        }
        if (f >= f2) {
            return SnapEdge.START;
        }
        if (f2 - OooO00o2 > f - f3) {
            return SnapEdge.END;
        }
        return SnapEdge.NONE;
    }

    public float OooO00o(int i, SnapEdge snapEdge) {
        float f;
        float OooO0O02 = this.f14897OooO00o.OooO0O0(i, this.OooO);
        float height = (float) (this.OooO0OO ? getHeight() : getWidth());
        float OooO00o2 = this.f14897OooO00o.OooO00o(i, this.OooO);
        if (snapEdge == SnapEdge.CENTER) {
            f = OooO0O02 - (height / 2.0f);
            OooO00o2 /= 2.0f;
        } else if (snapEdge != SnapEdge.END) {
            return OooO0O02;
        } else {
            f = OooO0O02 - height;
        }
        return f + OooO00o2;
    }

    public int OooO00o(float f, float f2) {
        if (this.OooO0OO) {
            f = f2;
        }
        float height = (float) (this.OooO0OO ? getHeight() : getWidth());
        if (f > -1.0f) {
            return 0;
        }
        if (f < (-this.f14897OooO00o.OooO00o(this.OooO)) + height + 1.0f) {
            return this.f14897OooO00o.m19802OooO00o() - 1;
        }
        return this.f14897OooO00o.OooO00o(-(f - (height / 2.0f)), this.OooO);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m15044OooO00o(float f, float f2) {
        OooO0O0(this.OooO0oO + f, this.OooO0oo + f2);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m15043OooO00o(float f) {
        this.OooO = f;
    }

    public void OooO00o(float f, PointF pointF) {
        OooO0O0(this.OooO * f, pointF);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public SizeF m15041OooO00o(int i) {
        C8153oOOOoOO0 ooooooo0 = this.f14897OooO00o;
        if (ooooooo0 == null) {
            return new SizeF(0.0f, 0.0f);
        }
        return ooooooo0.m19805OooO00o(i);
    }

    public float OooO00o(float f) {
        return f * this.OooO;
    }

    public void OooO00o(float f, float f2, float f3) {
        this.f14892OooO00o.OooO00o(f, f2, this.OooO, f3);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public int m15040OooO00o(float f) {
        C8153oOOOoOO0 ooooooo0 = this.f14897OooO00o;
        return ooooooo0.OooO00o(ooooooo0.OooO00o(this.OooO) * f, this.OooO);
    }

    public void OooO00o(boolean z) {
        this.f14909OooOO0 = z;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m15045OooO00o() {
        return this.OooOOO0;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public List<PdfDocument.Link> m15042OooO00o(int i) {
        C8153oOOOoOO0 ooooooo0 = this.f14897OooO00o;
        if (ooooooo0 == null) {
            return Collections.emptyList();
        }
        return ooooooo0.m19808OooO00o(i);
    }

    public OooO0O0 OooO00o(String str) {
        return new OooO0O0(new C8174oOOo0000(str));
    }

    public OooO0O0 OooO00o(File file) {
        return new OooO0O0(new C8176oOOo000o(file));
    }

    public OooO0O0 OooO00o(Uri uri) {
        return new OooO0O0(new C8178oOOo00O0(uri));
    }

    public OooO0O0 OooO00o(byte[] bArr) {
        return new OooO0O0(new C8173oOOo000(bArr));
    }

    public OooO0O0 OooO00o(InputStream inputStream) {
        return new OooO0O0(new C8172oOOo00(inputStream));
    }

    public OooO0O0 OooO00o(AbstractC8175oOOo000O oooo000o) {
        return new OooO0O0(oooo000o);
    }
}

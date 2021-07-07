package com.p118pd.sdk;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.github.barteksc.pdfviewer.PDFView;
import com.github.barteksc.pdfviewer.exception.PageRenderingException;

/* renamed from: com.pd.sdk.oOOOoOO  reason: case insensitive filesystem */
public class HandlerC8152oOOOoOO extends Handler {
    public static final int OooO00o = 1;

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final String f21183OooO00o = HandlerC8152oOOOoOO.class.getName();

    /* renamed from: OooO00o  reason: collision with other field name */
    public Matrix f21184OooO00o = new Matrix();

    /* renamed from: OooO00o  reason: collision with other field name */
    public Rect f21185OooO00o = new Rect();

    /* renamed from: OooO00o  reason: collision with other field name */
    public RectF f21186OooO00o = new RectF();

    /* renamed from: OooO00o  reason: collision with other field name */
    public PDFView f21187OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public boolean f21188OooO00o = false;

    /* renamed from: com.pd.sdk.oOOOoOO$OooO00o */
    public class OooO00o implements Runnable {

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ C8168oOOOooo0 f21189OooO00o;

        public OooO00o(C8168oOOOooo0 ooooooo0) {
            this.f21189OooO00o = ooooooo0;
        }

        public void run() {
            HandlerC8152oOOOoOO.this.f21187OooO00o.OooO00o(this.f21189OooO00o);
        }
    }

    /* renamed from: com.pd.sdk.oOOOoOO$OooO0O0 */
    public class OooO0O0 implements Runnable {
        public final /* synthetic */ PageRenderingException OooO00o;

        public OooO0O0(PageRenderingException pageRenderingException) {
            this.OooO00o = pageRenderingException;
        }

        public void run() {
            HandlerC8152oOOOoOO.this.f21187OooO00o.OooO00o(this.OooO00o);
        }
    }

    /* renamed from: com.pd.sdk.oOOOoOO$OooO0OO */
    public class OooO0OO {
        public float OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public int f21191OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public RectF f21192OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public boolean f21194OooO00o;
        public float OooO0O0;

        /* renamed from: OooO0O0  reason: collision with other field name */
        public int f21195OooO0O0;

        /* renamed from: OooO0O0  reason: collision with other field name */
        public boolean f21196OooO0O0;
        public boolean OooO0OO;

        public OooO0OO(float f, float f2, RectF rectF, int i, boolean z, int i2, boolean z2, boolean z3) {
            this.f21191OooO00o = i;
            this.OooO00o = f;
            this.OooO0O0 = f2;
            this.f21192OooO00o = rectF;
            this.f21194OooO00o = z;
            this.f21195OooO0O0 = i2;
            this.f21196OooO0O0 = z2;
            this.OooO0OO = z3;
        }
    }

    public HandlerC8152oOOOoOO(Looper looper, PDFView pDFView) {
        super(looper);
        this.f21187OooO00o = pDFView;
    }

    public void OooO0O0() {
        this.f21188OooO00o = false;
    }

    public void handleMessage(Message message) {
        try {
            C8168oOOOooo0 OooO00o2 = OooO00o((OooO0OO) message.obj);
            if (OooO00o2 == null) {
                return;
            }
            if (this.f21188OooO00o) {
                this.f21187OooO00o.post(new OooO00o(OooO00o2));
            } else {
                OooO00o2.m19818OooO00o().recycle();
            }
        } catch (PageRenderingException e) {
            this.f21187OooO00o.post(new OooO0O0(e));
        }
    }

    public void OooO00o(int i, float f, float f2, RectF rectF, boolean z, int i2, boolean z2, boolean z3) {
        sendMessage(obtainMessage(1, new OooO0OO(f, f2, rectF, i, z, i2, z2, z3)));
    }

    private C8168oOOOooo0 OooO00o(OooO0OO oooO0OO) throws PageRenderingException {
        C8153oOOOoOO0 ooooooo0 = this.f21187OooO00o.f14897OooO00o;
        ooooooo0.m19810OooO00o(oooO0OO.f21191OooO00o);
        int round = Math.round(oooO0OO.OooO00o);
        int round2 = Math.round(oooO0OO.OooO0O0);
        if (!(round == 0 || round2 == 0 || ooooooo0.m19812OooO0O0(oooO0OO.f21191OooO00o))) {
            try {
                Bitmap createBitmap = Bitmap.createBitmap(round, round2, oooO0OO.f21196OooO0O0 ? Bitmap.Config.ARGB_8888 : Bitmap.Config.RGB_565);
                OooO00o(round, round2, oooO0OO.f21192OooO00o);
                ooooooo0.OooO00o(createBitmap, oooO0OO.f21191OooO00o, this.f21185OooO00o, oooO0OO.OooO0OO);
                return new C8168oOOOooo0(oooO0OO.f21191OooO00o, createBitmap, oooO0OO.f21192OooO00o, oooO0OO.f21194OooO00o, oooO0OO.f21195OooO0O0);
            } catch (IllegalArgumentException unused) {
            }
        }
        return null;
    }

    private void OooO00o(int i, int i2, RectF rectF) {
        this.f21184OooO00o.reset();
        float f = (float) i;
        float f2 = (float) i2;
        this.f21184OooO00o.postTranslate((-rectF.left) * f, (-rectF.top) * f2);
        this.f21184OooO00o.postScale(1.0f / rectF.width(), 1.0f / rectF.height());
        this.f21186OooO00o.set(0.0f, 0.0f, f, f2);
        this.f21184OooO00o.mapRect(this.f21186OooO00o);
        this.f21186OooO00o.round(this.f21185OooO00o);
    }

    public void OooO00o() {
        this.f21188OooO00o = true;
    }
}

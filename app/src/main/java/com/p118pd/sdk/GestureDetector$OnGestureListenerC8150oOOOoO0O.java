package com.p118pd.sdk;

import android.graphics.PointF;
import android.graphics.RectF;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import com.github.barteksc.pdfviewer.PDFView;
import com.p118pd.sdk.C8179oOOo00Oo;
import com.shockwave.pdfium.PdfDocument;
import com.shockwave.pdfium.util.SizeF;

/* renamed from: com.pd.sdk.oOOOoO0O  reason: case insensitive filesystem */
public class GestureDetector$OnGestureListenerC8150oOOOoO0O implements GestureDetector.OnGestureListener, GestureDetector.OnDoubleTapListener, ScaleGestureDetector.OnScaleGestureListener, View.OnTouchListener {
    public GestureDetector OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public ScaleGestureDetector f21169OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public PDFView f21170OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C8146oOOOo0oO f21171OooO00o;
    public boolean OooO0O0 = false;
    public boolean OooO0OO = false;
    public boolean OooO0Oo = false;

    public GestureDetector$OnGestureListenerC8150oOOOoO0O(PDFView pDFView, C8146oOOOo0oO ooooo0oo) {
        this.f21170OooO00o = pDFView;
        this.f21171OooO00o = ooooo0oo;
        this.OooO00o = new GestureDetector(pDFView.getContext(), this);
        this.f21169OooO00o = new ScaleGestureDetector(pDFView.getContext(), this);
        pDFView.setOnTouchListener(this);
    }

    private void OooO0OO() {
        AbstractC8170oOOOoooo scrollHandle = this.f21170OooO00o.getScrollHandle();
        if (scrollHandle != null && scrollHandle.m19823OooO00o()) {
            scrollHandle.OooO0OO();
        }
    }

    public void OooO00o() {
        this.OooO0Oo = false;
    }

    public void OooO0O0() {
        this.OooO0Oo = true;
    }

    public boolean onDoubleTap(MotionEvent motionEvent) {
        if (!this.f21170OooO00o.OooO()) {
            return false;
        }
        if (this.f21170OooO00o.getZoom() < this.f21170OooO00o.getMidZoom()) {
            this.f21170OooO00o.OooO00o(motionEvent.getX(), motionEvent.getY(), this.f21170OooO00o.getMidZoom());
            return true;
        } else if (this.f21170OooO00o.getZoom() < this.f21170OooO00o.getMaxZoom()) {
            this.f21170OooO00o.OooO00o(motionEvent.getX(), motionEvent.getY(), this.f21170OooO00o.getMaxZoom());
            return true;
        } else {
            this.f21170OooO00o.OooO0oO();
            return true;
        }
    }

    public boolean onDoubleTapEvent(MotionEvent motionEvent) {
        return false;
    }

    public boolean onDown(MotionEvent motionEvent) {
        this.f21171OooO00o.OooO0OO();
        return true;
    }

    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        float f3;
        float f4;
        int i;
        if (!this.f21170OooO00o.OooOO0O()) {
            return false;
        }
        if (this.f21170OooO00o.m15047OooO0O0()) {
            if (this.f21170OooO00o.OooOOO()) {
                OooO00o(f, f2);
            } else {
                OooO00o(motionEvent, motionEvent2, f, f2);
            }
            return true;
        }
        int currentXOffset = (int) this.f21170OooO00o.getCurrentXOffset();
        int currentYOffset = (int) this.f21170OooO00o.getCurrentYOffset();
        PDFView pDFView = this.f21170OooO00o;
        C8153oOOOoOO0 ooooooo0 = pDFView.f14897OooO00o;
        if (pDFView.OooOO0o()) {
            f4 = -(this.f21170OooO00o.OooO00o(ooooooo0.m19811OooO0O0()) - ((float) this.f21170OooO00o.getWidth()));
            f3 = ooooooo0.OooO00o(this.f21170OooO00o.getZoom());
            i = this.f21170OooO00o.getHeight();
        } else {
            f4 = -(ooooooo0.OooO00o(this.f21170OooO00o.getZoom()) - ((float) this.f21170OooO00o.getWidth()));
            f3 = this.f21170OooO00o.OooO00o(ooooooo0.OooO00o());
            i = this.f21170OooO00o.getHeight();
        }
        this.f21171OooO00o.OooO00o(currentXOffset, currentYOffset, (int) f, (int) f2, (int) f4, 0, (int) (-(f3 - ((float) i))), 0);
        return true;
    }

    public void onLongPress(MotionEvent motionEvent) {
        this.f21170OooO00o.f14899OooO00o.OooO00o(motionEvent);
    }

    public boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        float zoom;
        float scaleFactor = scaleGestureDetector.getScaleFactor();
        float zoom2 = this.f21170OooO00o.getZoom() * scaleFactor;
        float f = C8179oOOo00Oo.OooO0O0.OooO0O0;
        if (zoom2 < f) {
            zoom = this.f21170OooO00o.getZoom();
        } else {
            f = C8179oOOo00Oo.OooO0O0.OooO00o;
            if (zoom2 > f) {
                zoom = this.f21170OooO00o.getZoom();
            }
            this.f21170OooO00o.OooO00o(scaleFactor, new PointF(scaleGestureDetector.getFocusX(), scaleGestureDetector.getFocusY()));
            return true;
        }
        scaleFactor = f / zoom;
        this.f21170OooO00o.OooO00o(scaleFactor, new PointF(scaleGestureDetector.getFocusX(), scaleGestureDetector.getFocusY()));
        return true;
    }

    public boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        this.OooO0OO = true;
        return true;
    }

    public void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        this.f21170OooO00o.OooO0O0();
        OooO0OO();
        this.OooO0OO = false;
    }

    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        this.OooO0O0 = true;
        if (this.f21170OooO00o.OooOOO0() || this.f21170OooO00o.OooOO0O()) {
            this.f21170OooO00o.m15044OooO00o(-f, -f2);
        }
        if (!this.OooO0OO || this.f21170OooO00o.m15049OooO0Oo()) {
            this.f21170OooO00o.OooO00o();
        }
        return true;
    }

    public void onShowPress(MotionEvent motionEvent) {
    }

    public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        AbstractC8170oOOOoooo scrollHandle;
        boolean OooO00o2 = this.f21170OooO00o.f14899OooO00o.m19814OooO00o(motionEvent);
        boolean OooO0O02 = OooO0O0(motionEvent.getX(), motionEvent.getY());
        if (!OooO00o2 && !OooO0O02 && (scrollHandle = this.f21170OooO00o.getScrollHandle()) != null && !this.f21170OooO00o.m15051OooO0o0()) {
            if (!scrollHandle.m19823OooO00o()) {
                scrollHandle.OooO00o();
            } else {
                scrollHandle.OooO0Oo();
            }
        }
        this.f21170OooO00o.performClick();
        return true;
    }

    public boolean onSingleTapUp(MotionEvent motionEvent) {
        return false;
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        if (!this.OooO0Oo) {
            return false;
        }
        boolean z = this.OooO00o.onTouchEvent(motionEvent) || this.f21169OooO00o.onTouchEvent(motionEvent);
        if (motionEvent.getAction() == 1 && this.OooO0O0) {
            this.OooO0O0 = false;
            OooO00o(motionEvent);
        }
        return z;
    }

    private void OooO00o(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        float f3;
        float f4;
        if (m19801OooO00o(f, f2)) {
            int i = -1;
            if (!this.f21170OooO00o.OooOO0o() ? f <= 0.0f : f2 <= 0.0f) {
                i = 1;
            }
            if (this.f21170OooO00o.OooOO0o()) {
                f3 = motionEvent2.getY();
                f4 = motionEvent.getY();
            } else {
                f3 = motionEvent2.getX();
                f4 = motionEvent.getX();
            }
            float f5 = f3 - f4;
            int max = Math.max(0, Math.min(this.f21170OooO00o.getPageCount() - 1, this.f21170OooO00o.OooO00o(this.f21170OooO00o.getCurrentXOffset() - (this.f21170OooO00o.getZoom() * f5), this.f21170OooO00o.getCurrentYOffset() - (f5 * this.f21170OooO00o.getZoom())) + i));
            this.f21171OooO00o.OooO00o(-this.f21170OooO00o.OooO00o(max, this.f21170OooO00o.OooO00o(max)));
        }
    }

    private boolean OooO0O0(float f, float f2) {
        int i;
        int i2;
        PDFView pDFView = this.f21170OooO00o;
        C8153oOOOoOO0 ooooooo0 = pDFView.f14897OooO00o;
        float f3 = (-pDFView.getCurrentXOffset()) + f;
        float f4 = (-this.f21170OooO00o.getCurrentYOffset()) + f2;
        int OooO00o2 = ooooooo0.OooO00o(this.f21170OooO00o.OooOO0o() ? f4 : f3, this.f21170OooO00o.getZoom());
        SizeF OooO00o3 = ooooooo0.m19806OooO00o(OooO00o2, this.f21170OooO00o.getZoom());
        if (this.f21170OooO00o.OooOO0o()) {
            i2 = (int) ooooooo0.OooO0Oo(OooO00o2, this.f21170OooO00o.getZoom());
            i = (int) ooooooo0.OooO0O0(OooO00o2, this.f21170OooO00o.getZoom());
        } else {
            i = (int) ooooooo0.OooO0Oo(OooO00o2, this.f21170OooO00o.getZoom());
            i2 = (int) ooooooo0.OooO0O0(OooO00o2, this.f21170OooO00o.getZoom());
        }
        for (PdfDocument.Link link : ooooooo0.m19808OooO00o(OooO00o2)) {
            RectF OooO00o4 = ooooooo0.OooO00o(OooO00o2, i2, i, (int) OooO00o3.getWidth(), (int) OooO00o3.getHeight(), link.getBounds());
            OooO00o4.sort();
            if (OooO00o4.contains(f3, f4)) {
                this.f21170OooO00o.f14899OooO00o.OooO00o(new C8167oOOOooOo(f, f2, f3, f4, OooO00o4, link));
                return true;
            }
        }
        return false;
    }

    private void OooO00o(MotionEvent motionEvent) {
        this.f21170OooO00o.OooO0O0();
        OooO0OO();
        if (!this.f21171OooO00o.m19800OooO00o()) {
            this.f21170OooO00o.OooO0OO();
        }
    }

    private void OooO00o(float f, float f2) {
        float f3;
        float f4;
        int currentXOffset = (int) this.f21170OooO00o.getCurrentXOffset();
        int currentYOffset = (int) this.f21170OooO00o.getCurrentYOffset();
        PDFView pDFView = this.f21170OooO00o;
        C8153oOOOoOO0 ooooooo0 = pDFView.f14897OooO00o;
        float f5 = -ooooooo0.OooO0O0(pDFView.getCurrentPage(), this.f21170OooO00o.getZoom());
        float OooO00o2 = f5 - ooooooo0.OooO00o(this.f21170OooO00o.getCurrentPage(), this.f21170OooO00o.getZoom());
        float f6 = 0.0f;
        if (this.f21170OooO00o.OooOO0o()) {
            f4 = -(this.f21170OooO00o.OooO00o(ooooooo0.m19811OooO0O0()) - ((float) this.f21170OooO00o.getWidth()));
            f3 = OooO00o2 + ((float) this.f21170OooO00o.getHeight());
            f6 = f5;
            f5 = 0.0f;
        } else {
            float width = OooO00o2 + ((float) this.f21170OooO00o.getWidth());
            f3 = -(this.f21170OooO00o.OooO00o(ooooooo0.OooO00o()) - ((float) this.f21170OooO00o.getHeight()));
            f4 = width;
        }
        this.f21171OooO00o.OooO00o(currentXOffset, currentYOffset, (int) f, (int) f2, (int) f4, (int) f5, (int) f3, (int) f6);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    private boolean m19801OooO00o(float f, float f2) {
        float abs = Math.abs(f);
        float abs2 = Math.abs(f2);
        if (this.f21170OooO00o.OooOO0o()) {
            if (abs2 > abs) {
                return true;
            }
        } else if (abs > abs2) {
            return true;
        }
        return false;
    }
}

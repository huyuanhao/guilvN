package com.p118pd.sdk;

import android.graphics.RectF;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.widget.ImageView;

/* renamed from: com.pd.sdk.i丨丨L1i1  reason: invalid class name and case insensitive filesystem */
public class GestureDetector$OnDoubleTapListenerC6425iL1i1 implements GestureDetector.OnDoubleTapListener {
    public View$OnTouchListenerC9328I11l1li OooO00o;

    public GestureDetector$OnDoubleTapListenerC6425iL1i1(View$OnTouchListenerC9328I11l1li r1) {
        OooO00o(r1);
    }

    public void OooO00o(View$OnTouchListenerC9328I11l1li r1) {
        this.OooO00o = r1;
    }

    public boolean onDoubleTap(MotionEvent motionEvent) {
        View$OnTouchListenerC9328I11l1li r0 = this.OooO00o;
        if (r0 == null) {
            return false;
        }
        try {
            float scale = r0.getScale();
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            if (scale < this.OooO00o.getMediumScale()) {
                this.OooO00o.OooO00o(this.OooO00o.getMediumScale(), x, y, true);
            } else if (scale < this.OooO00o.getMediumScale() || scale >= this.OooO00o.getMaximumScale()) {
                this.OooO00o.OooO00o(this.OooO00o.getMinimumScale(), x, y, true);
            } else {
                this.OooO00o.OooO00o(this.OooO00o.getMaximumScale(), x, y, true);
            }
        } catch (ArrayIndexOutOfBoundsException unused) {
        }
        return true;
    }

    public boolean onDoubleTapEvent(MotionEvent motionEvent) {
        return false;
    }

    public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        RectF displayRect;
        View$OnTouchListenerC9328I11l1li r0 = this.OooO00o;
        if (r0 == null) {
            return false;
        }
        ImageView OooO00o2 = r0.m21376OooO00o();
        if (!(this.OooO00o.getOnPhotoTapListener() == null || (displayRect = this.OooO00o.getDisplayRect()) == null)) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            if (displayRect.contains(x, y)) {
                this.OooO00o.getOnPhotoTapListener().OooO00o(OooO00o2, (x - displayRect.left) / displayRect.width(), (y - displayRect.top) / displayRect.height());
                return true;
            }
        }
        if (this.OooO00o.getOnViewTapListener() != null) {
            this.OooO00o.getOnViewTapListener().OooO00o(OooO00o2, motionEvent.getX(), motionEvent.getY());
        }
        return false;
    }
}

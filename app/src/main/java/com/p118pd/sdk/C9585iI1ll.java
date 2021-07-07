package com.p118pd.sdk;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;

/* renamed from: com.pd.sdk.丨iI1ll  reason: invalid class name and case insensitive filesystem */
public class C9585iI1ll implements AbstractC9478LILL {
    public static final String OooO00o = "CupcakeGestureDetector";

    /* renamed from: OooO00o  reason: collision with other field name */
    public float f23158OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public VelocityTracker f23159OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public LlLI1l11 f23160OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public boolean f23161OooO00o;
    public float OooO0O0;
    public final float OooO0OO;
    public final float OooO0Oo;

    public C9585iI1ll(Context context) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.OooO0Oo = (float) viewConfiguration.getScaledMinimumFlingVelocity();
        this.OooO0OO = (float) viewConfiguration.getScaledTouchSlop();
    }

    @Override // com.p118pd.sdk.AbstractC9478LILL
    public void OooO00o(LlLI1l11 llLI1l11) {
        this.f23160OooO00o = llLI1l11;
    }

    @Override // com.p118pd.sdk.AbstractC9478LILL
    public boolean OooO00o() {
        return false;
    }

    public float OooO0O0(MotionEvent motionEvent) {
        return motionEvent.getY();
    }

    @Override // com.p118pd.sdk.AbstractC9478LILL
    public boolean onTouchEvent(MotionEvent motionEvent) {
        VelocityTracker velocityTracker;
        int action = motionEvent.getAction();
        boolean z = false;
        if (action == 0) {
            VelocityTracker obtain = VelocityTracker.obtain();
            this.f23159OooO00o = obtain;
            if (obtain != null) {
                obtain.addMovement(motionEvent);
            } else {
                C93141lL.OooO00o().OooO0OO(OooO00o, "Velocity tracker is null");
            }
            this.f23158OooO00o = OooO00o(motionEvent);
            this.OooO0O0 = OooO0O0(motionEvent);
            this.f23161OooO00o = false;
        } else if (action == 1) {
            if (this.f23161OooO00o && this.f23159OooO00o != null) {
                this.f23158OooO00o = OooO00o(motionEvent);
                this.OooO0O0 = OooO0O0(motionEvent);
                this.f23159OooO00o.addMovement(motionEvent);
                this.f23159OooO00o.computeCurrentVelocity(1000);
                float xVelocity = this.f23159OooO00o.getXVelocity();
                float yVelocity = this.f23159OooO00o.getYVelocity();
                if (Math.max(Math.abs(xVelocity), Math.abs(yVelocity)) >= this.OooO0Oo) {
                    this.f23160OooO00o.OooO00o(this.f23158OooO00o, this.OooO0O0, -xVelocity, -yVelocity);
                }
            }
            VelocityTracker velocityTracker2 = this.f23159OooO00o;
            if (velocityTracker2 != null) {
                velocityTracker2.recycle();
                this.f23159OooO00o = null;
            }
        } else if (action == 2) {
            float OooO00o2 = OooO00o(motionEvent);
            float OooO0O02 = OooO0O0(motionEvent);
            float f = OooO00o2 - this.f23158OooO00o;
            float f2 = OooO0O02 - this.OooO0O0;
            if (!this.f23161OooO00o) {
                if (Math.sqrt((double) ((f * f) + (f2 * f2))) >= ((double) this.OooO0OO)) {
                    z = true;
                }
                this.f23161OooO00o = z;
            }
            if (this.f23161OooO00o) {
                this.f23160OooO00o.OooO00o(f, f2);
                this.f23158OooO00o = OooO00o2;
                this.OooO0O0 = OooO0O02;
                VelocityTracker velocityTracker3 = this.f23159OooO00o;
                if (velocityTracker3 != null) {
                    velocityTracker3.addMovement(motionEvent);
                }
            }
        } else if (action == 3 && (velocityTracker = this.f23159OooO00o) != null) {
            velocityTracker.recycle();
            this.f23159OooO00o = null;
        }
        return true;
    }

    public float OooO00o(MotionEvent motionEvent) {
        return motionEvent.getX();
    }

    @Override // com.p118pd.sdk.AbstractC9478LILL
    public boolean OooO0O0() {
        return this.f23161OooO00o;
    }
}

package com.p118pd.sdk;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;

/* renamed from: com.pd.sdk.ooOoo0Oo  reason: case insensitive filesystem */
public class C9072ooOoo0Oo extends C9063ooOoOooo<C9072ooOoo0Oo> {
    public static int OooOoO = 10;
    public static int OooOoO0 = 1;
    public static float OooOoo = Float.MIN_VALUE;
    public static float OooOoo0 = Float.MAX_VALUE;
    public float OooO;
    public VelocityTracker OooO00o;
    public boolean OooO0o;
    public float OooO0oo;
    public float OooOO0;
    public float OooOO0O;
    public float OooOO0o;
    public float OooOOO;
    public float OooOOO0;
    public float OooOOOO;
    public float OooOOOo;
    public float OooOOo;
    public float OooOOo0;
    public float OooOOoo;
    public float OooOo;

    /* renamed from: OooOo  reason: collision with other field name */
    public int f22411OooOo = OooOoO;
    public float OooOo0;
    public float OooOo00;
    public float OooOo0O;
    public float OooOo0o;

    /* renamed from: OooOo0o  reason: collision with other field name */
    public int f22412OooOo0o = OooOoO0;

    /* renamed from: OooOoO  reason: collision with other field name */
    public float f22413OooOoO;

    /* renamed from: OooOoO0  reason: collision with other field name */
    public float f22414OooOoO0;
    public float OooOoOO;

    public C9072ooOoo0Oo(Context context) {
        float f = OooOoo;
        this.OooO0oo = f;
        float f2 = OooOoo0;
        this.OooO = f2;
        this.OooOO0 = f;
        this.OooOO0O = f;
        this.OooOO0o = f2;
        this.OooOOO0 = f2;
        this.OooOOO = f;
        this.OooOOOO = f;
        this.OooOOOo = f2;
        this.OooOOo0 = f2;
        this.OooOOo = f2;
        this.OooOOoo = f2;
        int scaledTouchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
        this.OooO0oo = (float) (scaledTouchSlop * scaledTouchSlop);
    }

    public C9072ooOoo0Oo OooO(float f) {
        this.OooO0oo = f * f;
        return this;
    }

    @Override // com.p118pd.sdk.C9063ooOoOooo
    public C9072ooOoo0Oo OooO00o(float f) {
        this.OooOO0 = f;
        return this;
    }

    public C9072ooOoo0Oo OooO0O0(float f) {
        this.OooO = f;
        return this;
    }

    public C9072ooOoo0Oo OooO0OO(float f) {
        this.OooOOO = f;
        return this;
    }

    public C9072ooOoo0Oo OooO0Oo(float f) {
        this.OooOOO0 = f;
        return this;
    }

    public C9072ooOoo0Oo OooO0o(float f) {
        this.OooOO0O = f;
        return this;
    }

    public C9072ooOoo0Oo OooO0o0(float f) {
        this.OooOO0o = f;
        return this;
    }

    public C9072ooOoo0Oo OooO0oO(float f) {
        this.OooOOOo = f;
        return this;
    }

    public C9072ooOoo0Oo OooO0oo(float f) {
        this.OooOOOO = f;
        return this;
    }

    public C9072ooOoo0Oo OooOO0(float f) {
        this.OooOOoo = f * f;
        return this;
    }

    public C9072ooOoo0Oo OooOO0O(float f) {
        this.OooOOo0 = f;
        return this;
    }

    public C9072ooOoo0Oo OooOO0o(float f) {
        this.OooOOo = f;
        return this;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0072, code lost:
        if (r0 >= r1) goto L_0x0074;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x008f, code lost:
        if (r0 >= r2) goto L_0x0091;
     */
    @Override // com.p118pd.sdk.C9063ooOoOooo, com.p118pd.sdk.C9063ooOoOooo
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean OooO0Oo() {
        /*
        // Method dump skipped, instructions count: 166
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p118pd.sdk.C9072ooOoo0Oo.OooO0Oo():boolean");
    }

    @Override // com.p118pd.sdk.C9063ooOoOooo, com.p118pd.sdk.C9063ooOoOooo
    private boolean OooO0o0() {
        float f = (this.OooOo - this.OooOo00) + this.OooOo0O;
        float f2 = this.OooOO0O;
        if (f2 != OooOoo && f < f2) {
            return true;
        }
        float f3 = this.OooOO0o;
        if (f3 != OooOoo0 && f > f3) {
            return true;
        }
        float f4 = (this.f22414OooOoO0 - this.OooOo0) + this.OooOo0o;
        float f5 = this.OooOOOO;
        if (f5 != OooOoo && f4 < f5) {
            return true;
        }
        float f6 = this.OooOOOo;
        if (f6 == OooOoo0 || f4 <= f6) {
            return false;
        }
        return true;
    }

    public float OooO() {
        return this.f22413OooOoO;
    }

    @Override // com.p118pd.sdk.C9063ooOoOooo
    public C9072ooOoo0Oo OooO00o(int i) {
        this.f22411OooOo = i;
        return this;
    }

    @Override // com.p118pd.sdk.C9063ooOoOooo
    public C9072ooOoo0Oo OooO0O0(int i) {
        this.f22412OooOo0o = i;
        return this;
    }

    @Override // com.p118pd.sdk.C9063ooOoOooo
    public void OooO0OO(MotionEvent motionEvent) {
        int OooO0O0 = m20737OooO0O0();
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 6 || actionMasked == 5) {
            this.OooOo0O += this.OooOo - this.OooOo00;
            this.OooOo0o += this.f22414OooOoO0 - this.OooOo0;
            this.OooOo = C9065ooOoo0.OooO00o(motionEvent, this.OooO0o);
            float OooO0O02 = C9065ooOoo0.OooO0O0(motionEvent, this.OooO0o);
            this.f22414OooOoO0 = OooO0O02;
            this.OooOo00 = this.OooOo;
            this.OooOo0 = OooO0O02;
        } else {
            this.OooOo = C9065ooOoo0.OooO00o(motionEvent, this.OooO0o);
            this.f22414OooOoO0 = C9065ooOoo0.OooO0O0(motionEvent, this.OooO0o);
        }
        if (OooO0O0 != 0 || motionEvent.getPointerCount() < this.f22412OooOo0o) {
            VelocityTracker velocityTracker = this.OooO00o;
            if (velocityTracker != null) {
                OooO00o(velocityTracker, motionEvent);
                this.OooO00o.computeCurrentVelocity(1000);
                this.f22413OooOoO = this.OooO00o.getXVelocity();
                this.OooOoOO = this.OooO00o.getYVelocity();
            }
        } else {
            this.OooOo00 = this.OooOo;
            this.OooOo0 = this.f22414OooOoO0;
            this.OooOo0O = 0.0f;
            this.OooOo0o = 0.0f;
            VelocityTracker obtain = VelocityTracker.obtain();
            this.OooO00o = obtain;
            OooO00o(obtain, motionEvent);
            m20738OooO0O0();
        }
        if (actionMasked == 1) {
            if (OooO0O0 == 4) {
                m20744OooO0Oo();
            } else {
                m20746OooO0o0();
            }
        } else if (actionMasked != 5 || motionEvent.getPointerCount() <= this.f22411OooOo) {
            if (actionMasked == 6 && OooO0O0 == 4 && motionEvent.getPointerCount() < this.f22412OooOo0o) {
                m20746OooO0o0();
            } else if (OooO0O0 != 2) {
            } else {
                if (OooO0o0()) {
                    m20746OooO0o0();
                } else if (OooO0Oo()) {
                    this.OooOo00 = this.OooOo;
                    this.OooOo0 = this.f22414OooOoO0;
                    m20733OooO00o();
                }
            }
        } else if (OooO0O0 == 4) {
            m20741OooO0OO();
        } else {
            m20746OooO0o0();
        }
    }

    @Override // com.p118pd.sdk.C9063ooOoOooo
    /* renamed from: OooO0oO  reason: collision with other method in class */
    public void m20749OooO0oO() {
        VelocityTracker velocityTracker = this.OooO00o;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.OooO00o = null;
        }
    }

    @Override // com.p118pd.sdk.C9063ooOoOooo
    public float OooO0oo() {
        return (this.f22414OooOoO0 - this.OooOo0) + this.OooOo0o;
    }

    public float OooOO0() {
        return this.OooOoOO;
    }

    @Override // com.p118pd.sdk.C9063ooOoOooo
    public C9072ooOoo0Oo OooO00o(boolean z) {
        this.OooO0o = z;
        return this;
    }

    public static void OooO00o(VelocityTracker velocityTracker, MotionEvent motionEvent) {
        float rawX = motionEvent.getRawX() - motionEvent.getX();
        float rawY = motionEvent.getRawY() - motionEvent.getY();
        motionEvent.offsetLocation(rawX, rawY);
        velocityTracker.addMovement(motionEvent);
        motionEvent.offsetLocation(-rawX, -rawY);
    }

    @Override // com.p118pd.sdk.C9063ooOoOooo
    public float OooO0oO() {
        return (this.OooOo - this.OooOo00) + this.OooOo0O;
    }
}

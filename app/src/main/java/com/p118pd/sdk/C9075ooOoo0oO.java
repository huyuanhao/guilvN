package com.p118pd.sdk;

import android.os.Handler;
import android.view.MotionEvent;

/* renamed from: com.pd.sdk.ooOoo0oO  reason: case insensitive filesystem */
public class C9075ooOoo0oO extends C9063ooOoOooo<C9075ooOoo0oO> {
    public static final long OooO0OO = 500;
    public static final long OooO0Oo = 500;
    public static float OooOOo0 = Float.MIN_VALUE;
    public static final int OooOoOO = 1;
    public static final int OooOoo0 = 1;
    public float OooO;
    public long OooO00o = 500;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Handler f22424OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final Runnable f22425OooO00o = new OooO00o();
    public long OooO0O0 = 500;
    public float OooO0oo;
    public float OooOO0;
    public float OooOO0O;
    public float OooOO0o;
    public float OooOOO;
    public float OooOOO0;
    public float OooOOOO;
    public float OooOOOo;
    public int OooOo = 1;
    public int OooOo0o = 1;
    public int OooOoO;
    public int OooOoO0 = 1;

    /* renamed from: com.pd.sdk.ooOoo0oO$OooO00o */
    public class OooO00o implements Runnable {
        public OooO00o() {
        }

        public void run() {
            C9075ooOoo0oO.this.m20746OooO0o0();
        }
    }

    public C9075ooOoo0oO() {
        float f = OooOOo0;
        this.OooO0oo = f;
        this.OooO = f;
        this.OooOO0 = f;
        OooO0O0(true);
    }

    private void OooO() {
        Handler handler = this.f22424OooO00o;
        if (handler == null) {
            this.f22424OooO00o = new Handler();
        } else {
            handler.removeCallbacksAndMessages(null);
        }
        int i = this.OooOoO + 1;
        this.OooOoO = i;
        if (i != this.OooOo0o || this.OooOoO0 < this.OooOo) {
            this.f22424OooO00o.postDelayed(this.f22425OooO00o, this.OooO0O0);
            return;
        }
        m20733OooO00o();
        m20744OooO0Oo();
    }

    @Override // com.p118pd.sdk.C9063ooOoOooo, com.p118pd.sdk.C9063ooOoOooo
    private boolean OooO0Oo() {
        float f = (this.OooOOOO - this.OooOO0O) + this.OooOOO0;
        if (this.OooO0oo != OooOOo0 && Math.abs(f) > this.OooO0oo) {
            return true;
        }
        float f2 = (this.OooOOOo - this.OooOO0o) + this.OooOOO;
        if (this.OooO != OooOOo0 && Math.abs(f2) > this.OooO) {
            return true;
        }
        float f3 = (f2 * f2) + (f * f);
        float f4 = this.OooOO0;
        if (f4 == OooOOo0 || f3 <= f4) {
            return false;
        }
        return true;
    }

    private void OooOO0() {
        Handler handler = this.f22424OooO00o;
        if (handler == null) {
            this.f22424OooO00o = new Handler();
        } else {
            handler.removeCallbacksAndMessages(null);
        }
        this.f22424OooO00o.postDelayed(this.f22425OooO00o, this.OooO00o);
    }

    public C9075ooOoo0oO OooO00o(long j) {
        this.OooO0O0 = j;
        return this;
    }

    @Override // com.p118pd.sdk.C9063ooOoOooo
    public C9075ooOoo0oO OooO0O0(int i) {
        this.OooOo0o = i;
        return this;
    }

    public C9075ooOoo0oO OooO0OO(float f) {
        this.OooO = f;
        return this;
    }

    @Override // com.p118pd.sdk.C9063ooOoOooo, com.p118pd.sdk.C9063ooOoOooo
    public void OooO0o() {
        Handler handler = this.f22424OooO00o;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    @Override // com.p118pd.sdk.C9063ooOoOooo
    public void OooO0oO() {
        this.OooOoO = 0;
        this.OooOoO0 = 0;
        Handler handler = this.f22424OooO00o;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    @Override // com.p118pd.sdk.C9063ooOoOooo
    public C9075ooOoo0oO OooO00o(float f) {
        this.OooOO0 = f * f;
        return this;
    }

    public C9075ooOoo0oO OooO0O0(long j) {
        this.OooO00o = j;
        return this;
    }

    @Override // com.p118pd.sdk.C9063ooOoOooo
    public void OooO0OO(MotionEvent motionEvent) {
        int OooO0O02 = m20737OooO0O0();
        int actionMasked = motionEvent.getActionMasked();
        if (OooO0O02 == 0) {
            this.OooOOO0 = 0.0f;
            this.OooOOO = 0.0f;
            this.OooOO0O = motionEvent.getRawX();
            this.OooOO0o = motionEvent.getRawY();
        }
        if (actionMasked == 6 || actionMasked == 5) {
            this.OooOOO0 += this.OooOOOO - this.OooOO0O;
            this.OooOOO += this.OooOOOo - this.OooOO0o;
            this.OooOOOO = C9065ooOoo0.OooO00o(motionEvent, true);
            float OooO0O03 = C9065ooOoo0.OooO0O0(motionEvent, true);
            this.OooOOOo = OooO0O03;
            this.OooOO0O = this.OooOOOO;
            this.OooOO0o = OooO0O03;
        } else {
            this.OooOOOO = C9065ooOoo0.OooO00o(motionEvent, true);
            this.OooOOOo = C9065ooOoo0.OooO0O0(motionEvent, true);
        }
        if (this.OooOoO0 < motionEvent.getPointerCount()) {
            this.OooOoO0 = motionEvent.getPointerCount();
        }
        if (OooO0Oo()) {
            m20746OooO0o0();
        } else if (OooO0O02 == 0) {
            if (actionMasked == 0) {
                m20738OooO0O0();
            }
            OooOO0();
        } else if (OooO0O02 != 2) {
        } else {
            if (actionMasked == 1) {
                OooO();
            } else if (actionMasked == 0) {
                OooOO0();
            }
        }
    }

    @Override // com.p118pd.sdk.C9063ooOoOooo
    public C9075ooOoo0oO OooO00o(int i) {
        this.OooOo = i;
        return this;
    }

    public C9075ooOoo0oO OooO0O0(float f) {
        this.OooO0oo = f;
        return this;
    }
}

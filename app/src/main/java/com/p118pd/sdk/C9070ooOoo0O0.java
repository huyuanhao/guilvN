package com.p118pd.sdk;

import android.content.Context;
import android.os.Handler;
import android.view.MotionEvent;

/* renamed from: com.pd.sdk.ooOoo0O0  reason: case insensitive filesystem */
public class C9070ooOoo0O0 extends C9063ooOoOooo<C9070ooOoo0O0> {
    public static final long OooO0O0 = 500;
    public static float OooOO0O = 10.0f;
    public float OooO;
    public long OooO00o = 500;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Handler f22410OooO00o;
    public float OooO0oo;
    public float OooOO0;

    /* renamed from: com.pd.sdk.ooOoo0O0$OooO00o */
    public class OooO00o implements Runnable {
        public OooO00o() {
        }

        public void run() {
            C9070ooOoo0O0.this.m20733OooO00o();
        }
    }

    public C9070ooOoo0O0(Context context) {
        OooO0O0(true);
        this.OooO0oo = OooOO0O * context.getResources().getDisplayMetrics().density;
    }

    public void OooO00o(long j) {
        this.OooO00o = j;
    }

    @Override // com.p118pd.sdk.C9063ooOoOooo
    public void OooO0O0(int i, int i2) {
        Handler handler = this.f22410OooO00o;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.f22410OooO00o = null;
        }
    }

    @Override // com.p118pd.sdk.C9063ooOoOooo
    public void OooO0OO(MotionEvent motionEvent) {
        if (m20737OooO0O0() == 0) {
            m20738OooO0O0();
            this.OooO = motionEvent.getRawX();
            this.OooOO0 = motionEvent.getRawY();
            Handler handler = new Handler();
            this.f22410OooO00o = handler;
            handler.postDelayed(new OooO00o(), this.OooO00o);
        }
        if (motionEvent.getActionMasked() == 1) {
            Handler handler2 = this.f22410OooO00o;
            if (handler2 != null) {
                handler2.removeCallbacksAndMessages(null);
                this.f22410OooO00o = null;
            }
            if (m20737OooO0O0() == 4) {
                m20744OooO0Oo();
            } else {
                m20746OooO0o0();
            }
        } else {
            float rawX = motionEvent.getRawX() - this.OooO;
            float rawY = motionEvent.getRawY() - this.OooOO0;
            if ((rawX * rawX) + (rawY * rawY) <= this.OooO0oo) {
                return;
            }
            if (m20737OooO0O0() == 4) {
                m20741OooO0OO();
            } else {
                m20746OooO0o0();
            }
        }
    }

    @Override // com.p118pd.sdk.C9063ooOoOooo
    public C9070ooOoo0O0 OooO00o(float f) {
        this.OooO0oo = f * f;
        return this;
    }
}

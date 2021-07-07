package com.p118pd.sdk;

import android.os.Handler;
import android.view.MotionEvent;

/* renamed from: com.pd.sdk.ooOoOooO  reason: case insensitive filesystem */
public class C9062ooOoOooO extends C9063ooOoOooo<C9062ooOoOooO> {
    public static final long OooO0OO = 800;
    public static final long OooO0Oo = 160;
    public static final int OooOoO = 1;
    public static final int OooOoOO = 1;
    public float OooO;
    public long OooO00o = 800;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Handler f22372OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final Runnable f22373OooO00o = new OooO00o();
    public long OooO0O0 = 160;
    public float OooO0oo;
    public int OooOo = 1;
    public int OooOo0o = 1;
    public int OooOoO0;

    /* renamed from: com.pd.sdk.ooOoOooO$OooO00o */
    public class OooO00o implements Runnable {
        public OooO00o() {
        }

        public void run() {
            C9062ooOoOooO.this.m20746OooO0o0();
        }
    }

    @Override // com.p118pd.sdk.C9063ooOoOooo
    private boolean OooO0O0(MotionEvent motionEvent) {
        if (this.OooOoO0 != this.OooOo) {
            return false;
        }
        if (((this.OooOo0o & 1) == 0 || motionEvent.getRawX() - this.OooO0oo <= ((float) this.OooO0O0)) && (((this.OooOo0o & 2) == 0 || this.OooO0oo - motionEvent.getRawX() <= ((float) this.OooO0O0)) && (((this.OooOo0o & 4) == 0 || this.OooO - motionEvent.getRawY() <= ((float) this.OooO0O0)) && ((this.OooOo0o & 8) == 0 || motionEvent.getRawY() - this.OooO <= ((float) this.OooO0O0))))) {
            return false;
        }
        this.f22372OooO00o.removeCallbacksAndMessages(null);
        m20733OooO00o();
        m20744OooO0Oo();
        return true;
    }

    private void OooO0Oo(MotionEvent motionEvent) {
        if (!OooO0O0(motionEvent)) {
            m20746OooO0o0();
        }
    }

    private void OooO0o0(MotionEvent motionEvent) {
        this.OooO0oo = motionEvent.getRawX();
        this.OooO = motionEvent.getRawY();
        m20738OooO0O0();
        this.OooOoO0 = 1;
        Handler handler = this.f22372OooO00o;
        if (handler == null) {
            this.f22372OooO00o = new Handler();
        } else {
            handler.removeCallbacksAndMessages(null);
        }
        this.f22372OooO00o.postDelayed(this.f22373OooO00o, this.OooO00o);
    }

    @Override // com.p118pd.sdk.C9063ooOoOooo
    public void OooO0OO(MotionEvent motionEvent) {
        int OooO0O02 = m20737OooO0O0();
        if (OooO0O02 == 0) {
            OooO0o0(motionEvent);
        }
        if (OooO0O02 == 2) {
            OooO0O0(motionEvent);
            if (motionEvent.getPointerCount() > this.OooOoO0) {
                this.OooOoO0 = motionEvent.getPointerCount();
            }
            if (motionEvent.getActionMasked() == 1) {
                OooO0Oo(motionEvent);
            }
        }
    }

    public void OooO0o(int i) {
        this.OooOo0o = i;
    }

    public void OooO0oO(int i) {
        this.OooOo = i;
    }

    @Override // com.p118pd.sdk.C9063ooOoOooo, com.p118pd.sdk.C9063ooOoOooo
    public void OooO0o() {
        Handler handler = this.f22372OooO00o;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    @Override // com.p118pd.sdk.C9063ooOoOooo
    public void OooO0oO() {
        Handler handler = this.f22372OooO00o;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }
}

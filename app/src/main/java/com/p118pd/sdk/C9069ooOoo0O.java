package com.p118pd.sdk;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: com.pd.sdk.ooOoo0O  reason: case insensitive filesystem */
public class C9069ooOoo0O extends C9063ooOoOooo<C9069ooOoo0O> {
    public boolean OooO0o;
    public boolean OooO0oO;

    public C9069ooOoo0O() {
        OooO0O0(true);
    }

    @Override // com.p118pd.sdk.C9063ooOoOooo
    public C9069ooOoo0O OooO00o(boolean z) {
        this.OooO0oO = z;
        return this;
    }

    @Override // com.p118pd.sdk.C9063ooOoOooo
    public C9069ooOoo0O OooO0O0(boolean z) {
        this.OooO0o = z;
        return this;
    }

    @Override // com.p118pd.sdk.C9063ooOoOooo
    public boolean OooO0OO(C9063ooOoOooo oooooooo) {
        if (oooooooo instanceof C9069ooOoo0O) {
            C9069ooOoo0O ooooo0o = (C9069ooOoo0O) oooooooo;
            if (ooooo0o.m20737OooO0O0() == 4 && ooooo0o.OooO0oO) {
                return false;
            }
        }
        boolean z = !this.OooO0oO;
        int OooO0O0 = m20737OooO0O0();
        int OooO0O02 = oooooooo.m20737OooO0O0();
        if ((OooO0O0 != 4 || OooO0O02 != 4 || !z) && OooO0O0 == 4 && z) {
            return true;
        }
        return false;
    }

    @Override // com.p118pd.sdk.C9063ooOoOooo
    public boolean OooO0Oo(C9063ooOoOooo oooooooo) {
        return super.OooO0Oo(oooooooo);
    }

    @Override // com.p118pd.sdk.C9063ooOoOooo, com.p118pd.sdk.C9063ooOoOooo
    public void OooO0o() {
        long uptimeMillis = SystemClock.uptimeMillis();
        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
        obtain.setAction(3);
        m20731OooO00o().onTouchEvent(obtain);
    }

    public static boolean OooO00o(View view, MotionEvent motionEvent) {
        return (view instanceof ViewGroup) && ((ViewGroup) view).onInterceptTouchEvent(motionEvent);
    }

    @Override // com.p118pd.sdk.C9063ooOoOooo
    public boolean OooO0O0(C9063ooOoOooo oooooooo) {
        return !this.OooO0oO;
    }

    @Override // com.p118pd.sdk.C9063ooOoOooo
    public void OooO0OO(MotionEvent motionEvent) {
        View OooO00o = m20731OooO00o();
        int OooO0O0 = m20737OooO0O0();
        if (motionEvent.getActionMasked() == 1) {
            OooO00o.onTouchEvent(motionEvent);
            if ((OooO0O0 == 0 || OooO0O0 == 2) && OooO00o.isPressed()) {
                m20733OooO00o();
            }
            m20744OooO0Oo();
        } else if (OooO0O0 == 0 || OooO0O0 == 2) {
            if (this.OooO0o) {
                OooO00o(OooO00o, motionEvent);
                OooO00o.onTouchEvent(motionEvent);
                m20733OooO00o();
            } else if (OooO00o(OooO00o, motionEvent)) {
                OooO00o.onTouchEvent(motionEvent);
                m20733OooO00o();
            } else if (OooO0O0 != 2) {
                m20738OooO0O0();
            }
        } else if (OooO0O0 == 4) {
            OooO00o.onTouchEvent(motionEvent);
        }
    }
}

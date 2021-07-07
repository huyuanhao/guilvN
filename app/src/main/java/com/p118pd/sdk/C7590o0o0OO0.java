package com.p118pd.sdk;

import com.beefe.picker.view.LoopView;
import java.util.TimerTask;

/* renamed from: com.pd.sdk.o0o0OO0  reason: case insensitive filesystem */
public final class C7590o0o0OO0 extends TimerTask {
    public final LoopView OooO00o;
    public float OooO0Oo = 2.14748365E9f;
    public final float OooO0o0;

    public C7590o0o0OO0(LoopView loopView, float f) {
        this.OooO00o = loopView;
        this.OooO0o0 = f;
    }

    public final void run() {
        if (this.OooO0Oo == 2.14748365E9f) {
            if (Math.abs(this.OooO0o0) <= 2000.0f) {
                this.OooO0Oo = this.OooO0o0;
            } else if (this.OooO0o0 > 0.0f) {
                this.OooO0Oo = 2000.0f;
            } else {
                this.OooO0Oo = -2000.0f;
            }
        }
        if (Math.abs(this.OooO0Oo) < 0.0f || Math.abs(this.OooO0Oo) > 20.0f) {
            LoopView loopView = this.OooO00o;
            int i = loopView.o0OOO0o - ((int) ((this.OooO0Oo * 10.0f) / 1000.0f));
            loopView.o0OOO0o = i;
            if (!loopView.f14788OooO0O0) {
                float f = loopView.OooO0o0 * ((float) loopView.o0ooOO0);
                int i2 = loopView.o0Oo0oo;
                if (i <= ((int) (((float) (-i2)) * f))) {
                    this.OooO0Oo = 40.0f;
                    loopView.o0OOO0o = (int) (((float) (-i2)) * f);
                } else {
                    LoopView loopView2 = this.OooO00o;
                    if (i >= ((int) (((float) ((loopView.f14785OooO00o.size() - 1) - loopView2.o0Oo0oo)) * f))) {
                        loopView2.o0OOO0o = (int) (((float) ((loopView2.f14785OooO00o.size() - 1) - this.OooO00o.o0Oo0oo)) * f);
                        this.OooO0Oo = -40.0f;
                    }
                }
            }
            float f2 = this.OooO0Oo;
            if (f2 < 0.0f) {
                this.OooO0Oo = f2 + 20.0f;
            } else {
                this.OooO0Oo = f2 - 20.0f;
            }
            this.OooO00o.f14782OooO00o.sendEmptyMessage(1000);
            return;
        }
        this.OooO00o.OooO00o();
        this.OooO00o.f14782OooO00o.sendEmptyMessage(2000);
    }
}

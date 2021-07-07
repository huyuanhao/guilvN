package com.p118pd.sdk;

import com.beefe.picker.view.LoopView;
import java.util.TimerTask;

/* renamed from: com.pd.sdk.o0o0OOOo  reason: case insensitive filesystem */
public final class C7596o0o0OOOo extends TimerTask {
    public final LoopView OooO00o;
    public int o00oO0O = Integer.MAX_VALUE;
    public int o0ooOO0 = 0;
    public int o0ooOOo;

    public C7596o0o0OOOo(LoopView loopView, int i) {
        this.OooO00o = loopView;
        this.o0ooOOo = i;
    }

    public final void run() {
        if (this.o00oO0O == Integer.MAX_VALUE) {
            this.o00oO0O = this.o0ooOOo;
        }
        int i = this.o00oO0O;
        int i2 = (int) (((float) i) * 0.1f);
        this.o0ooOO0 = i2;
        if (i2 == 0) {
            if (i < 0) {
                this.o0ooOO0 = -1;
            } else {
                this.o0ooOO0 = 1;
            }
        }
        if (Math.abs(this.o00oO0O) <= 0) {
            this.OooO00o.OooO00o();
            this.OooO00o.f14782OooO00o.sendEmptyMessage(3000);
            return;
        }
        LoopView loopView = this.OooO00o;
        loopView.o0OOO0o += this.o0ooOO0;
        loopView.f14782OooO00o.sendEmptyMessage(1000);
        this.o00oO0O -= this.o0ooOO0;
    }
}

package com.p118pd.sdk;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ProgressBar;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* renamed from: com.pd.sdk.o00OooOO  reason: case insensitive filesystem */
public class C7138o00OooOO extends ProgressBar {
    public static final int o00oO0O = 500;
    public static final int o0ooOO0 = 500;
    public long OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final Runnable f19502OooO00o;
    public final Runnable OooO0O0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public boolean f19503OooO0O0;
    public boolean OooO0OO;
    public boolean OooO0Oo;

    /* renamed from: com.pd.sdk.o00OooOO$OooO00o */
    public class OooO00o implements Runnable {
        public OooO00o() {
        }

        public void run() {
            C7138o00OooOO o00ooooo = C7138o00OooOO.this;
            o00ooooo.f19503OooO0O0 = false;
            o00ooooo.OooO00o = -1;
            o00ooooo.setVisibility(8);
        }
    }

    /* renamed from: com.pd.sdk.o00OooOO$OooO0O0 */
    public class OooO0O0 implements Runnable {
        public OooO0O0() {
        }

        public void run() {
            C7138o00OooOO o00ooooo = C7138o00OooOO.this;
            o00ooooo.OooO0OO = false;
            if (!o00ooooo.OooO0Oo) {
                o00ooooo.OooO00o = System.currentTimeMillis();
                C7138o00OooOO.this.setVisibility(0);
            }
        }
    }

    public C7138o00OooOO(@NonNull Context context) {
        this(context, null);
    }

    private void OooO0OO() {
        removeCallbacks(this.f19502OooO00o);
        removeCallbacks(this.OooO0O0);
    }

    public synchronized void OooO00o() {
        this.OooO0Oo = true;
        removeCallbacks(this.OooO0O0);
        this.OooO0OO = false;
        long currentTimeMillis = System.currentTimeMillis() - this.OooO00o;
        if (currentTimeMillis < 500) {
            if (this.OooO00o != -1) {
                if (!this.f19503OooO0O0) {
                    postDelayed(this.f19502OooO00o, 500 - currentTimeMillis);
                    this.f19503OooO0O0 = true;
                }
            }
        }
        setVisibility(8);
    }

    public synchronized void OooO0O0() {
        this.OooO00o = -1;
        this.OooO0Oo = false;
        removeCallbacks(this.f19502OooO00o);
        this.f19503OooO0O0 = false;
        if (!this.OooO0OO) {
            postDelayed(this.OooO0O0, 500);
            this.OooO0OO = true;
        }
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        OooO0OO();
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        OooO0OO();
    }

    public C7138o00OooOO(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.OooO00o = -1;
        this.f19503OooO0O0 = false;
        this.OooO0OO = false;
        this.OooO0Oo = false;
        this.f19502OooO00o = new OooO00o();
        this.OooO0O0 = new OooO0O0();
    }
}

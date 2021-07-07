package com.p118pd.sdk;

import android.content.res.Resources;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import androidx.annotation.NonNull;
import androidx.core.view.ViewCompat;

/* renamed from: com.pd.sdk.o00Ooo0o  reason: case insensitive filesystem */
public abstract class AbstractView$OnTouchListenerC7135o00Ooo0o implements View.OnTouchListener {
    public static final float OooO = 1.0f;
    public static final float OooO0Oo = 0.0f;
    public static final float OooO0o = 0.0f;
    public static final float OooO0o0 = Float.MAX_VALUE;
    public static final float OooO0oO = Float.MAX_VALUE;
    public static final float OooO0oo = 0.2f;
    public static final int o000000 = ViewConfiguration.getTapTimeout();
    public static final int o000000O = 500;
    public static final int o000000o = 500;
    public static final int o000OOo = 1575;
    public static final int o0O0O00 = 315;
    public static final int o0OO00O = 1;
    public static final int o0OOO0o = 2;
    public static final int o0Oo0oo = 0;
    public static final int o0ooOOo = 0;
    public static final int o0ooOoO = 1;
    public static final int oo0o0Oo = 1;
    public final View OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final Interpolator f19482OooO00o = new AccelerateInterpolator();

    /* renamed from: OooO00o  reason: collision with other field name */
    public final OooO00o f19483OooO00o = new OooO00o();

    /* renamed from: OooO00o  reason: collision with other field name */
    public Runnable f19484OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public float[] f19485OooO00o = {0.0f, 0.0f};
    public boolean OooO0O0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public float[] f19486OooO0O0 = {Float.MAX_VALUE, Float.MAX_VALUE};
    public boolean OooO0OO;

    /* renamed from: OooO0OO  reason: collision with other field name */
    public float[] f19487OooO0OO = {0.0f, 0.0f};

    /* renamed from: OooO0Oo  reason: collision with other field name */
    public boolean f19488OooO0Oo;

    /* renamed from: OooO0Oo  reason: collision with other field name */
    public float[] f19489OooO0Oo = {0.0f, 0.0f};

    /* renamed from: OooO0o  reason: collision with other field name */
    public boolean f19490OooO0o;

    /* renamed from: OooO0o0  reason: collision with other field name */
    public boolean f19491OooO0o0;

    /* renamed from: OooO0o0  reason: collision with other field name */
    public float[] f19492OooO0o0 = {Float.MAX_VALUE, Float.MAX_VALUE};

    /* renamed from: OooO0oO  reason: collision with other field name */
    public boolean f19493OooO0oO;
    public int o00oO0O;
    public int o0ooOO0;

    /* renamed from: com.pd.sdk.o00Ooo0o$OooO00o */
    public static class OooO00o {
        public float OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public int f19494OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public long f19495OooO00o = Long.MIN_VALUE;
        public float OooO0O0;

        /* renamed from: OooO0O0  reason: collision with other field name */
        public int f19496OooO0O0;

        /* renamed from: OooO0O0  reason: collision with other field name */
        public long f19497OooO0O0 = 0;
        public float OooO0OO;

        /* renamed from: OooO0OO  reason: collision with other field name */
        public int f19498OooO0OO = 0;

        /* renamed from: OooO0OO  reason: collision with other field name */
        public long f19499OooO0OO = -1;
        public int OooO0Oo = 0;
        public int OooO0o0;

        private float OooO00o(float f) {
            return (-4.0f * f * f) + (f * 4.0f);
        }

        public void OooO00o(int i) {
            this.f19496OooO0O0 = i;
        }

        public void OooO0O0(int i) {
            this.f19494OooO00o = i;
        }

        /* renamed from: OooO0OO  reason: collision with other method in class */
        public void m18505OooO0OO() {
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.f19495OooO00o = currentAnimationTimeMillis;
            this.f19499OooO0OO = -1;
            this.f19497OooO0O0 = currentAnimationTimeMillis;
            this.OooO0OO = 0.5f;
            this.f19498OooO0OO = 0;
            this.OooO0Oo = 0;
        }

        public int OooO0Oo() {
            float f = this.OooO0O0;
            return (int) (f / Math.abs(f));
        }

        /* renamed from: OooO00o  reason: collision with other method in class */
        public boolean m18503OooO00o() {
            return this.f19499OooO0OO > 0 && AnimationUtils.currentAnimationTimeMillis() > this.f19499OooO0OO + ((long) this.OooO0o0);
        }

        /* renamed from: OooO0O0  reason: collision with other method in class */
        public void m18504OooO0O0() {
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.OooO0o0 = AbstractView$OnTouchListenerC7135o00Ooo0o.OooO00o((int) (currentAnimationTimeMillis - this.f19495OooO00o), 0, this.f19496OooO0O0);
            this.OooO0OO = OooO00o(currentAnimationTimeMillis);
            this.f19499OooO0OO = currentAnimationTimeMillis;
        }

        private float OooO00o(long j) {
            if (j < this.f19495OooO00o) {
                return 0.0f;
            }
            long j2 = this.f19499OooO0OO;
            if (j2 < 0 || j < j2) {
                return AbstractView$OnTouchListenerC7135o00Ooo0o.OooO00o(((float) (j - this.f19495OooO00o)) / ((float) this.f19494OooO00o), 0.0f, 1.0f) * 0.5f;
            }
            long j3 = j - j2;
            float f = this.OooO0OO;
            return (1.0f - f) + (f * AbstractView$OnTouchListenerC7135o00Ooo0o.OooO00o(((float) j3) / ((float) this.OooO0o0), 0.0f, 1.0f));
        }

        public int OooO0O0() {
            return this.OooO0Oo;
        }

        public int OooO0OO() {
            float f = this.OooO00o;
            return (int) (f / Math.abs(f));
        }

        /* renamed from: OooO00o  reason: collision with other method in class */
        public void m18502OooO00o() {
            if (this.f19497OooO0O0 != 0) {
                long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                float OooO00o2 = OooO00o(OooO00o(currentAnimationTimeMillis));
                this.f19497OooO0O0 = currentAnimationTimeMillis;
                float f = ((float) (currentAnimationTimeMillis - this.f19497OooO0O0)) * OooO00o2;
                this.f19498OooO0OO = (int) (this.OooO00o * f);
                this.OooO0Oo = (int) (f * this.OooO0O0);
                return;
            }
            throw new RuntimeException("Cannot compute scroll delta before calling start()");
        }

        public void OooO00o(float f, float f2) {
            this.OooO00o = f;
            this.OooO0O0 = f2;
        }

        public int OooO00o() {
            return this.f19498OooO0OO;
        }
    }

    /* renamed from: com.pd.sdk.o00Ooo0o$OooO0O0 */
    public class OooO0O0 implements Runnable {
        public OooO0O0() {
        }

        public void run() {
            AbstractView$OnTouchListenerC7135o00Ooo0o o00ooo0o = AbstractView$OnTouchListenerC7135o00Ooo0o.this;
            if (o00ooo0o.f19491OooO0o0) {
                if (o00ooo0o.OooO0OO) {
                    o00ooo0o.OooO0OO = false;
                    o00ooo0o.f19483OooO00o.m18505OooO0OO();
                }
                OooO00o oooO00o = AbstractView$OnTouchListenerC7135o00Ooo0o.this.f19483OooO00o;
                if (oooO00o.m18503OooO00o() || !AbstractView$OnTouchListenerC7135o00Ooo0o.this.m18501OooO0OO()) {
                    AbstractView$OnTouchListenerC7135o00Ooo0o.this.f19491OooO0o0 = false;
                    return;
                }
                AbstractView$OnTouchListenerC7135o00Ooo0o o00ooo0o2 = AbstractView$OnTouchListenerC7135o00Ooo0o.this;
                if (o00ooo0o2.f19488OooO0Oo) {
                    o00ooo0o2.f19488OooO0Oo = false;
                    o00ooo0o2.OooO00o();
                }
                oooO00o.m18502OooO00o();
                AbstractView$OnTouchListenerC7135o00Ooo0o.this.OooO00o(oooO00o.OooO00o(), oooO00o.OooO0O0());
                ViewCompat.OooO00o(AbstractView$OnTouchListenerC7135o00Ooo0o.this.OooO00o, this);
            }
        }
    }

    public AbstractView$OnTouchListenerC7135o00Ooo0o(@NonNull View view) {
        this.OooO00o = view;
        float f = Resources.getSystem().getDisplayMetrics().density;
        float f2 = (float) ((int) ((1575.0f * f) + 0.5f));
        OooO0O0(f2, f2);
        float f3 = (float) ((int) ((f * 315.0f) + 0.5f));
        OooO0OO(f3, f3);
        OooO0O0(1);
        m18496OooO00o(Float.MAX_VALUE, Float.MAX_VALUE);
        OooO0Oo(0.2f, 0.2f);
        OooO0o0(1.0f, 1.0f);
        OooO00o(o000000);
        OooO0Oo(500);
        OooO0OO(500);
    }

    public static float OooO00o(float f, float f2, float f3) {
        return f > f3 ? f3 : f < f2 ? f2 : f;
    }

    public static int OooO00o(int i, int i2, int i3) {
        return i > i3 ? i3 : i < i2 ? i2 : i;
    }

    public AbstractView$OnTouchListenerC7135o00Ooo0o OooO00o(boolean z) {
        if (this.f19490OooO0o && !z) {
            OooO0O0();
        }
        this.f19490OooO0o = z;
        return this;
    }

    public abstract void OooO00o(int i, int i2);

    /* renamed from: OooO00o  reason: collision with other method in class */
    public abstract boolean m18498OooO00o(int i);

    public AbstractView$OnTouchListenerC7135o00Ooo0o OooO0O0(boolean z) {
        this.f19493OooO0oO = z;
        return this;
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public abstract boolean m18500OooO0O0(int i);

    @NonNull
    public AbstractView$OnTouchListenerC7135o00Ooo0o OooO0OO(float f, float f2) {
        float[] fArr = this.f19489OooO0Oo;
        fArr[0] = f / 1000.0f;
        fArr[1] = f2 / 1000.0f;
        return this;
    }

    @NonNull
    public AbstractView$OnTouchListenerC7135o00Ooo0o OooO0Oo(float f, float f2) {
        float[] fArr = this.f19485OooO00o;
        fArr[0] = f;
        fArr[1] = f2;
        return this;
    }

    @NonNull
    public AbstractView$OnTouchListenerC7135o00Ooo0o OooO0o0(float f, float f2) {
        float[] fArr = this.f19487OooO0OO;
        fArr[0] = f / 1000.0f;
        fArr[1] = f2 / 1000.0f;
        return this;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0013, code lost:
        if (r0 != 3) goto L_0x0058;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouch(android.view.View r6, android.view.MotionEvent r7) {
        /*
            r5 = this;
            boolean r0 = r5.f19490OooO0o
            r1 = 0
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            int r0 = r7.getActionMasked()
            r2 = 1
            if (r0 == 0) goto L_0x001a
            if (r0 == r2) goto L_0x0016
            r3 = 2
            if (r0 == r3) goto L_0x001e
            r6 = 3
            if (r0 == r6) goto L_0x0016
            goto L_0x0058
        L_0x0016:
            r5.OooO0O0()
            goto L_0x0058
        L_0x001a:
            r5.f19488OooO0Oo = r2
            r5.OooO0O0 = r1
        L_0x001e:
            float r0 = r7.getX()
            int r3 = r6.getWidth()
            float r3 = (float) r3
            android.view.View r4 = r5.OooO00o
            int r4 = r4.getWidth()
            float r4 = (float) r4
            float r0 = r5.OooO00o(r1, r0, r3, r4)
            float r7 = r7.getY()
            int r6 = r6.getHeight()
            float r6 = (float) r6
            android.view.View r3 = r5.OooO00o
            int r3 = r3.getHeight()
            float r3 = (float) r3
            float r6 = r5.OooO00o(r2, r7, r6, r3)
            com.pd.sdk.o00Ooo0o$OooO00o r7 = r5.f19483OooO00o
            r7.OooO00o(r0, r6)
            boolean r6 = r5.f19491OooO0o0
            if (r6 != 0) goto L_0x0058
            boolean r6 = r5.m18501OooO0OO()
            if (r6 == 0) goto L_0x0058
            r5.OooO0OO()
        L_0x0058:
            boolean r6 = r5.f19493OooO0oO
            if (r6 == 0) goto L_0x0061
            boolean r6 = r5.f19491OooO0o0
            if (r6 == 0) goto L_0x0061
            r1 = 1
        L_0x0061:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p118pd.sdk.AbstractView$OnTouchListenerC7135o00Ooo0o.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public boolean m18499OooO0O0() {
        return this.f19493OooO0oO;
    }

    @NonNull
    public AbstractView$OnTouchListenerC7135o00Ooo0o OooO0O0(float f, float f2) {
        float[] fArr = this.f19492OooO0o0;
        fArr[0] = f / 1000.0f;
        fArr[1] = f2 / 1000.0f;
        return this;
    }

    @NonNull
    public AbstractView$OnTouchListenerC7135o00Ooo0o OooO0OO(int i) {
        this.f19483OooO00o.OooO00o(i);
        return this;
    }

    @NonNull
    public AbstractView$OnTouchListenerC7135o00Ooo0o OooO0Oo(int i) {
        this.f19483OooO00o.OooO0O0(i);
        return this;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m18497OooO00o() {
        return this.f19490OooO0o;
    }

    /* renamed from: OooO0OO  reason: collision with other method in class */
    public boolean m18501OooO0OO() {
        OooO00o oooO00o = this.f19483OooO00o;
        int OooO0Oo2 = oooO00o.OooO0Oo();
        int OooO0OO2 = oooO00o.OooO0OO();
        return (OooO0Oo2 != 0 && m18500OooO0O0(OooO0Oo2)) || (OooO0OO2 != 0 && m18498OooO00o(OooO0OO2));
    }

    @NonNull
    /* renamed from: OooO00o  reason: collision with other method in class */
    public AbstractView$OnTouchListenerC7135o00Ooo0o m18496OooO00o(float f, float f2) {
        float[] fArr = this.f19486OooO0O0;
        fArr[0] = f;
        fArr[1] = f2;
        return this;
    }

    @NonNull
    public AbstractView$OnTouchListenerC7135o00Ooo0o OooO0O0(int i) {
        this.o00oO0O = i;
        return this;
    }

    private void OooO0O0() {
        if (this.OooO0OO) {
            this.f19491OooO0o0 = false;
        } else {
            this.f19483OooO00o.m18504OooO0O0();
        }
    }

    @NonNull
    public AbstractView$OnTouchListenerC7135o00Ooo0o OooO00o(int i) {
        this.o0ooOO0 = i;
        return this;
    }

    private float OooO00o(int i, float f, float f2, float f3) {
        float OooO00o2 = OooO00o(this.f19485OooO00o[i], f2, this.f19486OooO0O0[i], f);
        if (OooO00o2 == 0.0f) {
            return 0.0f;
        }
        float f4 = this.f19487OooO0OO[i];
        float f5 = this.f19489OooO0Oo[i];
        float f6 = this.f19492OooO0o0[i];
        float f7 = f4 * f3;
        if (OooO00o2 > 0.0f) {
            return OooO00o(OooO00o2 * f7, f5, f6);
        }
        return -OooO00o((-OooO00o2) * f7, f5, f6);
    }

    private void OooO0OO() {
        int i;
        if (this.f19484OooO00o == null) {
            this.f19484OooO00o = new OooO0O0();
        }
        this.f19491OooO0o0 = true;
        this.OooO0OO = true;
        if (this.OooO0O0 || (i = this.o0ooOO0) <= 0) {
            this.f19484OooO00o.run();
        } else {
            ViewCompat.OooO00o(this.OooO00o, this.f19484OooO00o, (long) i);
        }
        this.OooO0O0 = true;
    }

    private float OooO00o(float f, float f2, float f3, float f4) {
        float f5;
        float OooO00o2 = OooO00o(f * f2, 0.0f, f3);
        float OooO00o3 = OooO00o(f2 - f4, OooO00o2) - OooO00o(f4, OooO00o2);
        if (OooO00o3 < 0.0f) {
            f5 = -this.f19482OooO00o.getInterpolation(-OooO00o3);
        } else if (OooO00o3 <= 0.0f) {
            return 0.0f;
        } else {
            f5 = this.f19482OooO00o.getInterpolation(OooO00o3);
        }
        return OooO00o(f5, -1.0f, 1.0f);
    }

    private float OooO00o(float f, float f2) {
        if (f2 == 0.0f) {
            return 0.0f;
        }
        int i = this.o00oO0O;
        if (i == 0 || i == 1) {
            if (f < f2) {
                if (f >= 0.0f) {
                    return 1.0f - (f / f2);
                }
                return (!this.f19491OooO0o0 || this.o00oO0O != 1) ? 0.0f : 1.0f;
            }
        } else if (i == 2 && f < 0.0f) {
            return f / (-f2);
        }
    }

    public void OooO00o() {
        long uptimeMillis = SystemClock.uptimeMillis();
        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
        this.OooO00o.onTouchEvent(obtain);
        obtain.recycle();
    }
}

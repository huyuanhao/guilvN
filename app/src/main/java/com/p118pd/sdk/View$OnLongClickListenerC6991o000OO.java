package com.p118pd.sdk;

import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityManager;
import androidx.annotation.RestrictTo;
import androidx.core.view.ViewCompat;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: com.pd.sdk.o000OO  reason: case insensitive filesystem */
public class View$OnLongClickListenerC6991o000OO implements View.OnLongClickListener, View.OnHoverListener, View.OnAttachStateChangeListener {
    public static final long OooO00o = 2500;

    /* renamed from: OooO00o  reason: collision with other field name */
    public static View$OnLongClickListenerC6991o000OO f19196OooO00o = null;
    public static final long OooO0O0 = 15000;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public static View$OnLongClickListenerC6991o000OO f19197OooO0O0 = null;
    public static final long OooO0OO = 3000;
    public static final String o0ooOOo = "TooltipCompatHandler";

    /* renamed from: OooO00o  reason: collision with other field name */
    public final View f19198OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C6950o0000O f19199OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final CharSequence f19200OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final Runnable f19201OooO00o = new OooO00o();

    /* renamed from: OooO0O0  reason: collision with other field name */
    public final Runnable f19202OooO0O0 = new OooO0O0();

    /* renamed from: OooO0O0  reason: collision with other field name */
    public boolean f19203OooO0O0;
    public final int o00oO0O;
    public int o0ooOO0;

    /* renamed from: o0ooOOo  reason: collision with other field name */
    public int f19204o0ooOOo;

    /* renamed from: com.pd.sdk.o000OO$OooO00o */
    public class OooO00o implements Runnable {
        public OooO00o() {
        }

        public void run() {
            View$OnLongClickListenerC6991o000OO.this.OooO00o(false);
        }
    }

    /* renamed from: com.pd.sdk.o000OO$OooO0O0 */
    public class OooO0O0 implements Runnable {
        public OooO0O0() {
        }

        public void run() {
            View$OnLongClickListenerC6991o000OO.this.OooO00o();
        }
    }

    public View$OnLongClickListenerC6991o000OO(View view, CharSequence charSequence) {
        this.f19198OooO00o = view;
        this.f19200OooO00o = charSequence;
        this.o00oO0O = C7113o00Oo0o0.OooO00o(ViewConfiguration.get(view.getContext()));
        OooO0OO();
        this.f19198OooO00o.setOnLongClickListener(this);
        this.f19198OooO00o.setOnHoverListener(this);
    }

    public static void OooO00o(View view, CharSequence charSequence) {
        View$OnLongClickListenerC6991o000OO o000oo = f19196OooO00o;
        if (o000oo != null && o000oo.f19198OooO00o == view) {
            OooO00o((View$OnLongClickListenerC6991o000OO) null);
        }
        if (TextUtils.isEmpty(charSequence)) {
            View$OnLongClickListenerC6991o000OO o000oo2 = f19197OooO0O0;
            if (o000oo2 != null && o000oo2.f19198OooO00o == view) {
                o000oo2.OooO00o();
            }
            view.setOnLongClickListener(null);
            view.setLongClickable(false);
            view.setOnHoverListener(null);
            return;
        }
        new View$OnLongClickListenerC6991o000OO(view, charSequence);
    }

    private void OooO0O0() {
        this.f19198OooO00o.removeCallbacks(this.f19201OooO00o);
    }

    private void OooO0OO() {
        this.o0ooOO0 = Integer.MAX_VALUE;
        this.f19204o0ooOOo = Integer.MAX_VALUE;
    }

    private void OooO0Oo() {
        this.f19198OooO00o.postDelayed(this.f19201OooO00o, (long) ViewConfiguration.getLongPressTimeout());
    }

    public boolean onHover(View view, MotionEvent motionEvent) {
        if (this.f19199OooO00o != null && this.f19203OooO0O0) {
            return false;
        }
        AccessibilityManager accessibilityManager = (AccessibilityManager) this.f19198OooO00o.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action != 7) {
            if (action == 10) {
                OooO0OO();
                OooO00o();
            }
        } else if (this.f19198OooO00o.isEnabled() && this.f19199OooO00o == null && OooO00o(motionEvent)) {
            OooO00o(this);
        }
        return false;
    }

    public boolean onLongClick(View view) {
        this.o0ooOO0 = view.getWidth() / 2;
        this.f19204o0ooOOo = view.getHeight() / 2;
        OooO00o(true);
        return true;
    }

    public void onViewAttachedToWindow(View view) {
    }

    public void onViewDetachedFromWindow(View view) {
        OooO00o();
    }

    public void OooO00o(boolean z) {
        long j;
        int i;
        long j2;
        if (ViewCompat.m14604OooO0oo(this.f19198OooO00o)) {
            OooO00o((View$OnLongClickListenerC6991o000OO) null);
            View$OnLongClickListenerC6991o000OO o000oo = f19197OooO0O0;
            if (o000oo != null) {
                o000oo.OooO00o();
            }
            f19197OooO0O0 = this;
            this.f19203OooO0O0 = z;
            C6950o0000O o0000o = new C6950o0000O(this.f19198OooO00o.getContext());
            this.f19199OooO00o = o0000o;
            o0000o.OooO00o(this.f19198OooO00o, this.o0ooOO0, this.f19204o0ooOOo, this.f19203OooO0O0, this.f19200OooO00o);
            this.f19198OooO00o.addOnAttachStateChangeListener(this);
            if (this.f19203OooO0O0) {
                j = OooO00o;
            } else {
                if ((ViewCompat.OooOOo0(this.f19198OooO00o) & 1) == 1) {
                    j2 = 3000;
                    i = ViewConfiguration.getLongPressTimeout();
                } else {
                    j2 = 15000;
                    i = ViewConfiguration.getLongPressTimeout();
                }
                j = j2 - ((long) i);
            }
            this.f19198OooO00o.removeCallbacks(this.f19202OooO0O0);
            this.f19198OooO00o.postDelayed(this.f19202OooO0O0, j);
        }
    }

    public void OooO00o() {
        if (f19197OooO0O0 == this) {
            f19197OooO0O0 = null;
            C6950o0000O o0000o = this.f19199OooO00o;
            if (o0000o != null) {
                o0000o.OooO00o();
                this.f19199OooO00o = null;
                OooO0OO();
                this.f19198OooO00o.removeOnAttachStateChangeListener(this);
            }
        }
        if (f19196OooO00o == this) {
            OooO00o((View$OnLongClickListenerC6991o000OO) null);
        }
        this.f19198OooO00o.removeCallbacks(this.f19202OooO0O0);
    }

    public static void OooO00o(View$OnLongClickListenerC6991o000OO o000oo) {
        View$OnLongClickListenerC6991o000OO o000oo2 = f19196OooO00o;
        if (o000oo2 != null) {
            o000oo2.OooO0O0();
        }
        f19196OooO00o = o000oo;
        if (o000oo != null) {
            o000oo.OooO0Oo();
        }
    }

    private boolean OooO00o(MotionEvent motionEvent) {
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        if (Math.abs(x - this.o0ooOO0) <= this.o00oO0O && Math.abs(y - this.f19204o0ooOOo) <= this.o00oO0O) {
            return false;
        }
        this.o0ooOO0 = x;
        this.f19204o0ooOOo = y;
        return true;
    }
}

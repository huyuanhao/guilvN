package com.p118pd.sdk;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.animation.Interpolator;
import java.lang.ref.WeakReference;

/* renamed from: com.pd.sdk.o00Oo0oo  reason: case insensitive filesystem */
public final class C7115o00Oo0oo {
    public static final String OooO00o = "ViewAnimatorCompat";
    public static final int OooO0O0 = 2113929216;

    /* renamed from: OooO00o  reason: collision with other field name */
    public int f19443OooO00o = -1;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Runnable f19444OooO00o = null;

    /* renamed from: OooO00o  reason: collision with other field name */
    public WeakReference<View> f19445OooO00o;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public Runnable f19446OooO0O0 = null;

    /* renamed from: com.pd.sdk.o00Oo0oo$OooO00o */
    public class OooO00o extends AnimatorListenerAdapter {
        public final /* synthetic */ View OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ AbstractC7617o0oOO f19448OooO00o;

        public OooO00o(AbstractC7617o0oOO o0ooo, View view) {
            this.f19448OooO00o = o0ooo;
            this.OooO00o = view;
        }

        public void onAnimationCancel(Animator animator) {
            this.f19448OooO00o.OooO0O0(this.OooO00o);
        }

        public void onAnimationEnd(Animator animator) {
            this.f19448OooO00o.OooO0OO(this.OooO00o);
        }

        public void onAnimationStart(Animator animator) {
            this.f19448OooO00o.OooO00o(this.OooO00o);
        }
    }

    /* renamed from: com.pd.sdk.o00Oo0oo$OooO0O0 */
    public class OooO0O0 implements ValueAnimator.AnimatorUpdateListener {
        public final /* synthetic */ View OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ AbstractC7118o00OoO00 f19450OooO00o;

        public OooO0O0(AbstractC7118o00OoO00 o00ooo00, View view) {
            this.f19450OooO00o = o00ooo00;
            this.OooO00o = view;
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.f19450OooO00o.OooO00o(this.OooO00o);
        }
    }

    /* renamed from: com.pd.sdk.o00Oo0oo$OooO0OO */
    public static class OooO0OO implements AbstractC7617o0oOO {
        public C7115o00Oo0oo OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public boolean f19451OooO00o;

        public OooO0OO(C7115o00Oo0oo o00oo0oo) {
            this.OooO00o = o00oo0oo;
        }

        @Override // com.p118pd.sdk.AbstractC7617o0oOO
        public void OooO00o(View view) {
            this.f19451OooO00o = false;
            AbstractC7617o0oOO o0ooo = null;
            if (this.OooO00o.f19443OooO00o > -1) {
                view.setLayerType(2, null);
            }
            C7115o00Oo0oo o00oo0oo = this.OooO00o;
            Runnable runnable = o00oo0oo.f19444OooO00o;
            if (runnable != null) {
                o00oo0oo.f19444OooO00o = null;
                runnable.run();
            }
            Object tag = view.getTag(C7115o00Oo0oo.OooO0O0);
            if (tag instanceof AbstractC7617o0oOO) {
                o0ooo = (AbstractC7617o0oOO) tag;
            }
            if (o0ooo != null) {
                o0ooo.OooO00o(view);
            }
        }

        @Override // com.p118pd.sdk.AbstractC7617o0oOO
        public void OooO0O0(View view) {
            Object tag = view.getTag(C7115o00Oo0oo.OooO0O0);
            AbstractC7617o0oOO o0ooo = tag instanceof AbstractC7617o0oOO ? (AbstractC7617o0oOO) tag : null;
            if (o0ooo != null) {
                o0ooo.OooO0O0(view);
            }
        }

        @Override // com.p118pd.sdk.AbstractC7617o0oOO
        public void OooO0OO(View view) {
            int i = this.OooO00o.f19443OooO00o;
            AbstractC7617o0oOO o0ooo = null;
            if (i > -1) {
                view.setLayerType(i, null);
                this.OooO00o.f19443OooO00o = -1;
            }
            if (Build.VERSION.SDK_INT >= 16 || !this.f19451OooO00o) {
                C7115o00Oo0oo o00oo0oo = this.OooO00o;
                Runnable runnable = o00oo0oo.f19446OooO0O0;
                if (runnable != null) {
                    o00oo0oo.f19446OooO0O0 = null;
                    runnable.run();
                }
                Object tag = view.getTag(C7115o00Oo0oo.OooO0O0);
                if (tag instanceof AbstractC7617o0oOO) {
                    o0ooo = (AbstractC7617o0oOO) tag;
                }
                if (o0ooo != null) {
                    o0ooo.OooO0OO(view);
                }
                this.f19451OooO00o = true;
            }
        }
    }

    public C7115o00Oo0oo(View view) {
        this.f19445OooO00o = new WeakReference<>(view);
    }

    public C7115o00Oo0oo OooO(float f) {
        View view = this.f19445OooO00o.get();
        if (view != null) {
            view.animate().scaleX(f);
        }
        return this;
    }

    public C7115o00Oo0oo OooO00o(long j) {
        View view = this.f19445OooO00o.get();
        if (view != null) {
            view.animate().setDuration(j);
        }
        return this;
    }

    public C7115o00Oo0oo OooO0O0(float f) {
        View view = this.f19445OooO00o.get();
        if (view != null) {
            view.animate().alphaBy(f);
        }
        return this;
    }

    public C7115o00Oo0oo OooO0OO(float f) {
        View view = this.f19445OooO00o.get();
        if (view != null) {
            view.animate().rotation(f);
        }
        return this;
    }

    public C7115o00Oo0oo OooO0Oo(float f) {
        View view = this.f19445OooO00o.get();
        if (view != null) {
            view.animate().rotationBy(f);
        }
        return this;
    }

    public C7115o00Oo0oo OooO0o(float f) {
        View view = this.f19445OooO00o.get();
        if (view != null) {
            view.animate().rotationXBy(f);
        }
        return this;
    }

    public C7115o00Oo0oo OooO0o0(float f) {
        View view = this.f19445OooO00o.get();
        if (view != null) {
            view.animate().rotationX(f);
        }
        return this;
    }

    public C7115o00Oo0oo OooO0oO(float f) {
        View view = this.f19445OooO00o.get();
        if (view != null) {
            view.animate().rotationY(f);
        }
        return this;
    }

    public C7115o00Oo0oo OooO0oo(float f) {
        View view = this.f19445OooO00o.get();
        if (view != null) {
            view.animate().rotationYBy(f);
        }
        return this;
    }

    public C7115o00Oo0oo OooOO0(float f) {
        View view = this.f19445OooO00o.get();
        if (view != null) {
            view.animate().scaleXBy(f);
        }
        return this;
    }

    public C7115o00Oo0oo OooOO0O(float f) {
        View view = this.f19445OooO00o.get();
        if (view != null) {
            view.animate().scaleY(f);
        }
        return this;
    }

    public C7115o00Oo0oo OooOO0o(float f) {
        View view = this.f19445OooO00o.get();
        if (view != null) {
            view.animate().scaleYBy(f);
        }
        return this;
    }

    public C7115o00Oo0oo OooOOO(float f) {
        View view = this.f19445OooO00o.get();
        if (view != null) {
            view.animate().translationXBy(f);
        }
        return this;
    }

    public C7115o00Oo0oo OooOOO0(float f) {
        View view = this.f19445OooO00o.get();
        if (view != null) {
            view.animate().translationX(f);
        }
        return this;
    }

    public C7115o00Oo0oo OooOOOO(float f) {
        View view = this.f19445OooO00o.get();
        if (view != null) {
            view.animate().translationY(f);
        }
        return this;
    }

    public C7115o00Oo0oo OooOOOo(float f) {
        View view = this.f19445OooO00o.get();
        if (view != null) {
            view.animate().translationYBy(f);
        }
        return this;
    }

    public C7115o00Oo0oo OooOOo(float f) {
        View view = this.f19445OooO00o.get();
        if (view != null && Build.VERSION.SDK_INT >= 21) {
            view.animate().translationZBy(f);
        }
        return this;
    }

    public C7115o00Oo0oo OooOOo0(float f) {
        View view = this.f19445OooO00o.get();
        if (view != null && Build.VERSION.SDK_INT >= 21) {
            view.animate().translationZ(f);
        }
        return this;
    }

    public C7115o00Oo0oo OooOOoo(float f) {
        View view = this.f19445OooO00o.get();
        if (view != null) {
            view.animate().x(f);
        }
        return this;
    }

    public C7115o00Oo0oo OooOo(float f) {
        View view = this.f19445OooO00o.get();
        if (view != null && Build.VERSION.SDK_INT >= 21) {
            view.animate().zBy(f);
        }
        return this;
    }

    public C7115o00Oo0oo OooOo0(float f) {
        View view = this.f19445OooO00o.get();
        if (view != null) {
            view.animate().y(f);
        }
        return this;
    }

    public C7115o00Oo0oo OooOo00(float f) {
        View view = this.f19445OooO00o.get();
        if (view != null) {
            view.animate().xBy(f);
        }
        return this;
    }

    public C7115o00Oo0oo OooOo0O(float f) {
        View view = this.f19445OooO00o.get();
        if (view != null) {
            view.animate().yBy(f);
        }
        return this;
    }

    public C7115o00Oo0oo OooOo0o(float f) {
        View view = this.f19445OooO00o.get();
        if (view != null && Build.VERSION.SDK_INT >= 21) {
            view.animate().z(f);
        }
        return this;
    }

    public C7115o00Oo0oo OooO00o(float f) {
        View view = this.f19445OooO00o.get();
        if (view != null) {
            view.animate().alpha(f);
        }
        return this;
    }

    public C7115o00Oo0oo OooO0O0(long j) {
        View view = this.f19445OooO00o.get();
        if (view != null) {
            view.animate().setStartDelay(j);
        }
        return this;
    }

    public C7115o00Oo0oo OooO00o(Runnable runnable) {
        View view = this.f19445OooO00o.get();
        if (view != null) {
            if (Build.VERSION.SDK_INT >= 16) {
                view.animate().withEndAction(runnable);
            } else {
                OooO00o(view, new OooO0OO(this));
                this.f19446OooO0O0 = runnable;
            }
        }
        return this;
    }

    public long OooO0O0() {
        View view = this.f19445OooO00o.get();
        if (view != null) {
            return view.animate().getStartDelay();
        }
        return 0;
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public void m18389OooO0O0() {
        View view = this.f19445OooO00o.get();
        if (view != null) {
            view.animate().start();
        }
    }

    public C7115o00Oo0oo OooO0O0(Runnable runnable) {
        View view = this.f19445OooO00o.get();
        if (view != null) {
            if (Build.VERSION.SDK_INT >= 16) {
                view.animate().withStartAction(runnable);
            } else {
                OooO00o(view, new OooO0OO(this));
                this.f19444OooO00o = runnable;
            }
        }
        return this;
    }

    public long OooO00o() {
        View view = this.f19445OooO00o.get();
        if (view != null) {
            return view.animate().getDuration();
        }
        return 0;
    }

    public C7115o00Oo0oo OooO00o(Interpolator interpolator) {
        View view = this.f19445OooO00o.get();
        if (view != null) {
            view.animate().setInterpolator(interpolator);
        }
        return this;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public Interpolator m18386OooO00o() {
        View view = this.f19445OooO00o.get();
        if (view == null || Build.VERSION.SDK_INT < 18) {
            return null;
        }
        return (Interpolator) view.animate().getInterpolator();
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m18388OooO00o() {
        View view = this.f19445OooO00o.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C7115o00Oo0oo m18387OooO00o() {
        View view = this.f19445OooO00o.get();
        if (view != null) {
            if (Build.VERSION.SDK_INT >= 16) {
                view.animate().withLayer();
            } else {
                this.f19443OooO00o = view.getLayerType();
                OooO00o(view, new OooO0OO(this));
            }
        }
        return this;
    }

    public C7115o00Oo0oo OooO00o(AbstractC7617o0oOO o0ooo) {
        View view = this.f19445OooO00o.get();
        if (view != null) {
            if (Build.VERSION.SDK_INT >= 16) {
                OooO00o(view, o0ooo);
            } else {
                view.setTag(OooO0O0, o0ooo);
                OooO00o(view, new OooO0OO(this));
            }
        }
        return this;
    }

    private void OooO00o(View view, AbstractC7617o0oOO o0ooo) {
        if (o0ooo != null) {
            view.animate().setListener(new OooO00o(o0ooo, view));
        } else {
            view.animate().setListener(null);
        }
    }

    public C7115o00Oo0oo OooO00o(AbstractC7118o00OoO00 o00ooo00) {
        View view = this.f19445OooO00o.get();
        if (view != null && Build.VERSION.SDK_INT >= 19) {
            OooO0O0 oooO0O0 = null;
            if (o00ooo00 != null) {
                oooO0O0 = new OooO0O0(o00ooo00, view);
            }
            view.animate().setUpdateListener(oooO0O0);
        }
        return this;
    }
}

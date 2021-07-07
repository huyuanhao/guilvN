package com.p118pd.sdk;

import android.content.Context;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import androidx.annotation.CallSuper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Deprecated
/* renamed from: com.pd.sdk.oO0OO00O */
public abstract class oO0OO00O<T extends View, Z> extends AbstractC7826oO00oO00<Z> {
    @Nullable
    public static Integer OooO00o = null;
    public static boolean OooO0Oo = false;
    public static final String o0ooOOo = "ViewTarget";
    @Nullable

    /* renamed from: OooO00o  reason: collision with other field name */
    public View.OnAttachStateChangeListener f20915OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final T f20916OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final OooO0O0 f20917OooO00o;
    public boolean OooO0O0;
    public boolean OooO0OO;

    /* renamed from: com.pd.sdk.oO0OO00O$OooO00o */
    public class OooO00o implements View.OnAttachStateChangeListener {
        public OooO00o() {
        }

        public void onViewAttachedToWindow(View view) {
            oO0OO00O.this.m19548OooO0O0();
        }

        public void onViewDetachedFromWindow(View view) {
            oO0OO00O.this.m19547OooO00o();
        }
    }

    @VisibleForTesting
    /* renamed from: com.pd.sdk.oO0OO00O$OooO0O0 */
    public static final class OooO0O0 {
        public static final int OooO00o = 0;
        @Nullable
        @VisibleForTesting

        /* renamed from: OooO00o  reason: collision with other field name */
        public static Integer f20918OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final View f20919OooO00o;
        @Nullable

        /* renamed from: OooO00o  reason: collision with other field name */
        public OooO00o f20920OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final List<AbstractC8301oOo00oO0> f20921OooO00o = new ArrayList();

        /* renamed from: OooO00o  reason: collision with other field name */
        public boolean f20922OooO00o;

        /* renamed from: com.pd.sdk.oO0OO00O$OooO0O0$OooO00o */
        public static final class OooO00o implements ViewTreeObserver.OnPreDrawListener {
            public final WeakReference<OooO0O0> OooO00o;

            public OooO00o(@NonNull OooO0O0 oooO0O0) {
                this.OooO00o = new WeakReference<>(oooO0O0);
            }

            public boolean onPreDraw() {
                if (Log.isLoggable(oO0OO00O.o0ooOOo, 2)) {
                    String str = "OnGlobalLayoutListener called attachStateListener=" + this;
                }
                OooO0O0 oooO0O0 = this.OooO00o.get();
                if (oooO0O0 == null) {
                    return true;
                }
                oooO0O0.m19550OooO00o();
                return true;
            }
        }

        public OooO0O0(@NonNull View view) {
            this.f20919OooO00o = view;
        }

        public static int OooO00o(@NonNull Context context) {
            if (f20918OooO00o == null) {
                Display defaultDisplay = ((WindowManager) C7842oO0O0.OooO00o((WindowManager) context.getSystemService("window"))).getDefaultDisplay();
                Point point = new Point();
                defaultDisplay.getSize(point);
                f20918OooO00o = Integer.valueOf(Math.max(point.x, point.y));
            }
            return f20918OooO00o.intValue();
        }

        private boolean OooO00o(int i) {
            return i > 0 || i == Integer.MIN_VALUE;
        }

        public void OooO0O0(@NonNull AbstractC8301oOo00oO0 ooo00oo0) {
            this.f20921OooO00o.remove(ooo00oo0);
        }

        /* renamed from: OooO0O0  reason: collision with other method in class */
        public void m19551OooO0O0() {
            ViewTreeObserver viewTreeObserver = this.f20919OooO00o.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnPreDrawListener(this.f20920OooO00o);
            }
            this.f20920OooO00o = null;
            this.f20921OooO00o.clear();
        }

        private int OooO0O0() {
            int paddingLeft = this.f20919OooO00o.getPaddingLeft() + this.f20919OooO00o.getPaddingRight();
            ViewGroup.LayoutParams layoutParams = this.f20919OooO00o.getLayoutParams();
            return OooO00o(this.f20919OooO00o.getWidth(), layoutParams != null ? layoutParams.width : 0, paddingLeft);
        }

        private void OooO00o(int i, int i2) {
            Iterator it = new ArrayList(this.f20921OooO00o).iterator();
            while (it.hasNext()) {
                ((AbstractC8301oOo00oO0) it.next()).OooO00o(i, i2);
            }
        }

        /* renamed from: OooO00o  reason: collision with other method in class */
        public void m19550OooO00o() {
            if (!this.f20921OooO00o.isEmpty()) {
                int OooO0O0 = OooO0O0();
                int OooO00o2 = OooO00o();
                if (m19549OooO00o(OooO0O0, OooO00o2)) {
                    OooO00o(OooO0O0, OooO00o2);
                    m19551OooO0O0();
                }
            }
        }

        public void OooO00o(@NonNull AbstractC8301oOo00oO0 ooo00oo0) {
            int OooO0O0 = OooO0O0();
            int OooO00o2 = OooO00o();
            if (m19549OooO00o(OooO0O0, OooO00o2)) {
                ooo00oo0.OooO00o(OooO0O0, OooO00o2);
                return;
            }
            if (!this.f20921OooO00o.contains(ooo00oo0)) {
                this.f20921OooO00o.add(ooo00oo0);
            }
            if (this.f20920OooO00o == null) {
                ViewTreeObserver viewTreeObserver = this.f20919OooO00o.getViewTreeObserver();
                OooO00o oooO00o = new OooO00o(this);
                this.f20920OooO00o = oooO00o;
                viewTreeObserver.addOnPreDrawListener(oooO00o);
            }
        }

        /* renamed from: OooO00o  reason: collision with other method in class */
        private boolean m19549OooO00o(int i, int i2) {
            return OooO00o(i) && OooO00o(i2);
        }

        private int OooO00o() {
            int paddingTop = this.f20919OooO00o.getPaddingTop() + this.f20919OooO00o.getPaddingBottom();
            ViewGroup.LayoutParams layoutParams = this.f20919OooO00o.getLayoutParams();
            return OooO00o(this.f20919OooO00o.getHeight(), layoutParams != null ? layoutParams.height : 0, paddingTop);
        }

        private int OooO00o(int i, int i2, int i3) {
            int i4 = i2 - i3;
            if (i4 > 0) {
                return i4;
            }
            if (this.f20922OooO00o && this.f20919OooO00o.isLayoutRequested()) {
                return 0;
            }
            int i5 = i - i3;
            if (i5 > 0) {
                return i5;
            }
            if (this.f20919OooO00o.isLayoutRequested() || i2 != -2) {
                return 0;
            }
            if (Log.isLoggable(oO0OO00O.o0ooOOo, 4)) {
                Log.i(oO0OO00O.o0ooOOo, "Glide treats LayoutParams.WRAP_CONTENT as a request for an image the size of this device's screen dimensions. If you want to load the original image and are ok with the corresponding memory cost and OOMs (depending on the input size), use .override(Target.SIZE_ORIGINAL). Otherwise, use LayoutParams.MATCH_PARENT, set layout_width and layout_height to fixed dimension, or use .override() with fixed dimensions.");
            }
            return OooO00o(this.f20919OooO00o.getContext());
        }
    }

    public oO0OO00O(@NonNull T t) {
        this.f20916OooO00o = (T) ((View) C7842oO0O0.OooO00o(t));
        this.f20917OooO00o = new OooO0O0(t);
    }

    private void OooO0OO() {
        View.OnAttachStateChangeListener onAttachStateChangeListener = this.f20915OooO00o;
        if (onAttachStateChangeListener != null && !this.OooO0OO) {
            this.f20916OooO00o.addOnAttachStateChangeListener(onAttachStateChangeListener);
            this.OooO0OO = true;
        }
    }

    private void OooO0Oo() {
        View.OnAttachStateChangeListener onAttachStateChangeListener = this.f20915OooO00o;
        if (onAttachStateChangeListener != null && this.OooO0OO) {
            this.f20916OooO00o.removeOnAttachStateChangeListener(onAttachStateChangeListener);
            this.OooO0OO = false;
        }
    }

    @NonNull
    /* renamed from: OooO00o  reason: collision with other method in class */
    public final oO0OO00O<T, Z> m19546OooO00o() {
        if (this.f20915OooO00o != null) {
            return this;
        }
        this.f20915OooO00o = new OooO00o();
        OooO0OO();
        return this;
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public void m19548OooO0O0() {
        AbstractC7821oO00o0o request = getRequest();
        if (request != null && request.OooO0OO()) {
            request.begin();
        }
    }

    @Override // com.p118pd.sdk.AbstractC7833oO00oOo0, com.p118pd.sdk.AbstractC7826oO00oO00
    @Nullable
    public AbstractC7821oO00o0o getRequest() {
        Object OooO00o2 = OooO00o();
        if (OooO00o2 == null) {
            return null;
        }
        if (OooO00o2 instanceof AbstractC7821oO00o0o) {
            return (AbstractC7821oO00o0o) OooO00o2;
        }
        throw new IllegalArgumentException("You must not call setTag() on a view Glide is targeting");
    }

    @Override // com.p118pd.sdk.AbstractC7833oO00oOo0
    @CallSuper
    public void getSize(@NonNull AbstractC8301oOo00oO0 ooo00oo0) {
        this.f20917OooO00o.OooO00o(ooo00oo0);
    }

    @Override // com.p118pd.sdk.AbstractC7833oO00oOo0, com.p118pd.sdk.AbstractC7826oO00oO00
    @CallSuper
    public void onLoadCleared(@Nullable Drawable drawable) {
        super.onLoadCleared(drawable);
        this.f20917OooO00o.m19551OooO0O0();
        if (!this.OooO0O0) {
            OooO0Oo();
        }
    }

    @Override // com.p118pd.sdk.AbstractC7833oO00oOo0, com.p118pd.sdk.AbstractC7826oO00oO00
    @CallSuper
    public void onLoadStarted(@Nullable Drawable drawable) {
        super.onLoadStarted(drawable);
        OooO0OO();
    }

    @Override // com.p118pd.sdk.AbstractC7833oO00oOo0
    @CallSuper
    public void removeCallback(@NonNull AbstractC8301oOo00oO0 ooo00oo0) {
        this.f20917OooO00o.OooO0O0(ooo00oo0);
    }

    @Override // com.p118pd.sdk.AbstractC7833oO00oOo0, com.p118pd.sdk.AbstractC7826oO00oO00
    public void setRequest(@Nullable AbstractC7821oO00o0o oo00o0o) {
        OooO00o(oo00o0o);
    }

    public String toString() {
        return "Target for: " + this.f20916OooO00o;
    }

    @Deprecated
    public oO0OO00O(@NonNull T t, boolean z) {
        this(t);
        if (z) {
            OooO0O0();
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m19547OooO00o() {
        AbstractC7821oO00o0o request = getRequest();
        if (request != null) {
            this.OooO0O0 = true;
            request.clear();
            this.OooO0O0 = false;
        }
    }

    @NonNull
    public final oO0OO00O<T, Z> OooO0O0() {
        this.f20917OooO00o.f20922OooO00o = true;
        return this;
    }

    @NonNull
    /* renamed from: OooO00o  reason: collision with other method in class */
    public T m19545OooO00o() {
        return this.f20916OooO00o;
    }

    private void OooO00o(@Nullable Object obj) {
        Integer num = OooO00o;
        if (num == null) {
            OooO0Oo = true;
            this.f20916OooO00o.setTag(obj);
            return;
        }
        this.f20916OooO00o.setTag(num.intValue(), obj);
    }

    @Nullable
    private Object OooO00o() {
        Integer num = OooO00o;
        if (num == null) {
            return this.f20916OooO00o.getTag();
        }
        return this.f20916OooO00o.getTag(num.intValue());
    }

    public static void OooO00o(int i) {
        if (OooO00o != null || OooO0Oo) {
            throw new IllegalArgumentException("You cannot set the tag id more than once or change the tag id after the first request has been made");
        }
        OooO00o = Integer.valueOf(i);
    }
}

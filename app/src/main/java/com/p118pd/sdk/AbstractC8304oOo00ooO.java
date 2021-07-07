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
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.bumptech.glide.C0439R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import s.h.e.l.l.C;

/* renamed from: com.pd.sdk.oOo00ooO  reason: case insensitive filesystem */
public abstract class AbstractC8304oOo00ooO<T extends View, Z> implements AbstractC7833oO00oOo0<Z> {
    @IdRes
    public static final int o0ooOO0 = C0439R.C0442id.glide_custom_view_target_tag;
    public static final String o0ooOOo = "CustomViewTarget";
    @Nullable
    public View.OnAttachStateChangeListener OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final T f21393OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final OooO0O0 f21394OooO00o;
    public boolean OooO0O0;
    public boolean OooO0OO;
    @IdRes
    public int o00oO0O;

    /* renamed from: com.pd.sdk.oOo00ooO$OooO00o */
    public class OooO00o implements View.OnAttachStateChangeListener {
        public OooO00o() {
        }

        public void onViewAttachedToWindow(View view) {
            AbstractC8304oOo00ooO.this.m19999OooO0O0();
        }

        public void onViewDetachedFromWindow(View view) {
            AbstractC8304oOo00ooO.this.m19998OooO00o();
        }
    }

    @VisibleForTesting
    /* renamed from: com.pd.sdk.oOo00ooO$OooO0O0 */
    public static final class OooO0O0 {
        public static final int OooO00o = 0;
        @Nullable
        @VisibleForTesting

        /* renamed from: OooO00o  reason: collision with other field name */
        public static Integer f21395OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final View f21396OooO00o;
        @Nullable

        /* renamed from: OooO00o  reason: collision with other field name */
        public OooO00o f21397OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final List<AbstractC8301oOo00oO0> f21398OooO00o = new ArrayList();

        /* renamed from: OooO00o  reason: collision with other field name */
        public boolean f21399OooO00o;

        /* renamed from: com.pd.sdk.oOo00ooO$OooO0O0$OooO00o */
        public static final class OooO00o implements ViewTreeObserver.OnPreDrawListener {
            public final WeakReference<OooO0O0> OooO00o;

            public OooO00o(@NonNull OooO0O0 oooO0O0) {
                this.OooO00o = new WeakReference<>(oooO0O0);
            }

            public boolean onPreDraw() {
                if (Log.isLoggable(AbstractC8304oOo00ooO.o0ooOOo, 2)) {
                    String str = "OnGlobalLayoutListener called attachStateListener=" + this;
                }
                OooO0O0 oooO0O0 = this.OooO00o.get();
                if (oooO0O0 == null) {
                    return true;
                }
                oooO0O0.m20001OooO00o();
                return true;
            }
        }

        public OooO0O0(@NonNull View view) {
            this.f21396OooO00o = view;
        }

        public static int OooO00o(@NonNull Context context) {
            if (f21395OooO00o == null) {
                Display defaultDisplay = ((WindowManager) C7842oO0O0.OooO00o((WindowManager) context.getSystemService("window"))).getDefaultDisplay();
                Point point = new Point();
                defaultDisplay.getSize(point);
                f21395OooO00o = Integer.valueOf(Math.max(point.x, point.y));
            }
            return f21395OooO00o.intValue();
        }

        private boolean OooO00o(int i) {
            return i > 0 || i == Integer.MIN_VALUE;
        }

        public void OooO0O0(@NonNull AbstractC8301oOo00oO0 ooo00oo0) {
            this.f21398OooO00o.remove(ooo00oo0);
        }

        /* renamed from: OooO0O0  reason: collision with other method in class */
        public void m20002OooO0O0() {
            ViewTreeObserver viewTreeObserver = this.f21396OooO00o.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnPreDrawListener(this.f21397OooO00o);
            }
            this.f21397OooO00o = null;
            this.f21398OooO00o.clear();
        }

        private int OooO0O0() {
            int paddingLeft = this.f21396OooO00o.getPaddingLeft() + this.f21396OooO00o.getPaddingRight();
            ViewGroup.LayoutParams layoutParams = this.f21396OooO00o.getLayoutParams();
            return OooO00o(this.f21396OooO00o.getWidth(), layoutParams != null ? layoutParams.width : 0, paddingLeft);
        }

        private void OooO00o(int i, int i2) {
            Iterator it = new ArrayList(this.f21398OooO00o).iterator();
            while (it.hasNext()) {
                ((AbstractC8301oOo00oO0) it.next()).OooO00o(i, i2);
            }
        }

        /* renamed from: OooO00o  reason: collision with other method in class */
        public void m20001OooO00o() {
            if (!this.f21398OooO00o.isEmpty()) {
                int OooO0O0 = OooO0O0();
                int OooO00o2 = OooO00o();
                if (m20000OooO00o(OooO0O0, OooO00o2)) {
                    OooO00o(OooO0O0, OooO00o2);
                    m20002OooO0O0();
                }
            }
        }

        public void OooO00o(@NonNull AbstractC8301oOo00oO0 ooo00oo0) {
            int OooO0O0 = OooO0O0();
            int OooO00o2 = OooO00o();
            if (m20000OooO00o(OooO0O0, OooO00o2)) {
                ooo00oo0.OooO00o(OooO0O0, OooO00o2);
                return;
            }
            if (!this.f21398OooO00o.contains(ooo00oo0)) {
                this.f21398OooO00o.add(ooo00oo0);
            }
            if (this.f21397OooO00o == null) {
                ViewTreeObserver viewTreeObserver = this.f21396OooO00o.getViewTreeObserver();
                OooO00o oooO00o = new OooO00o(this);
                this.f21397OooO00o = oooO00o;
                viewTreeObserver.addOnPreDrawListener(oooO00o);
            }
        }

        /* renamed from: OooO00o  reason: collision with other method in class */
        private boolean m20000OooO00o(int i, int i2) {
            return OooO00o(i) && OooO00o(i2);
        }

        private int OooO00o() {
            int paddingTop = this.f21396OooO00o.getPaddingTop() + this.f21396OooO00o.getPaddingBottom();
            ViewGroup.LayoutParams layoutParams = this.f21396OooO00o.getLayoutParams();
            return OooO00o(this.f21396OooO00o.getHeight(), layoutParams != null ? layoutParams.height : 0, paddingTop);
        }

        private int OooO00o(int i, int i2, int i3) {
            int i4 = i2 - i3;
            if (i4 > 0) {
                return i4;
            }
            if (this.f21399OooO00o && this.f21396OooO00o.isLayoutRequested()) {
                return 0;
            }
            int i5 = i - i3;
            if (i5 > 0) {
                return i5;
            }
            if (this.f21396OooO00o.isLayoutRequested() || i2 != -2) {
                return 0;
            }
            if (Log.isLoggable(AbstractC8304oOo00ooO.o0ooOOo, 4)) {
                Log.i(AbstractC8304oOo00ooO.o0ooOOo, "Glide treats LayoutParams.WRAP_CONTENT as a request for an image the size of this device's screen dimensions. If you want to load the original image and are ok with the corresponding memory cost and OOMs (depending on the input size), use .override(Target.SIZE_ORIGINAL). Otherwise, use LayoutParams.MATCH_PARENT, set layout_width and layout_height to fixed dimension, or use .override() with fixed dimensions.");
            }
            return OooO00o(this.f21396OooO00o.getContext());
        }
    }

    static {
        C.i(31);
    }

    public AbstractC8304oOo00ooO(@NonNull T t) {
        this.f21393OooO00o = (T) ((View) C7842oO0O0.OooO00o(t));
        this.f21394OooO00o = new OooO0O0(t);
    }

    private native void OooO0OO();

    private native void OooO0Oo();

    @NonNull
    /* renamed from: OooO00o  reason: collision with other method in class */
    public final AbstractC8304oOo00ooO<T, Z> m19997OooO00o() {
        if (this.OooO00o != null) {
            return this;
        }
        this.OooO00o = new OooO00o();
        OooO0OO();
        return this;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public final native void m19998OooO00o();

    public abstract void OooO00o(@Nullable Drawable drawable);

    @NonNull
    public final AbstractC8304oOo00ooO<T, Z> OooO0O0() {
        this.f21394OooO00o.f21399OooO00o = true;
        return this;
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public final native void m19999OooO0O0();

    public void OooO0O0(@Nullable Drawable drawable) {
    }

    @Override // com.p118pd.sdk.AbstractC7833oO00oOo0
    @Nullable
    public final AbstractC7821oO00o0o getRequest() {
        Object OooO00o2 = OooO00o();
        if (OooO00o2 == null) {
            return null;
        }
        if (OooO00o2 instanceof AbstractC7821oO00o0o) {
            return (AbstractC7821oO00o0o) OooO00o2;
        }
        throw new IllegalArgumentException("You must not pass non-R.id ids to setTag(id)");
    }

    @Override // com.p118pd.sdk.AbstractC7833oO00oOo0
    public final void getSize(@NonNull AbstractC8301oOo00oO0 ooo00oo0) {
        this.f21394OooO00o.OooO00o(ooo00oo0);
    }

    @Override // com.p118pd.sdk.AbstractC7811oO00OooO
    public native void onDestroy();

    @Override // com.p118pd.sdk.AbstractC7833oO00oOo0
    public final void onLoadCleared(@Nullable Drawable drawable) {
        this.f21394OooO00o.m20002OooO0O0();
        OooO00o(drawable);
        if (!this.OooO0O0) {
            OooO0Oo();
        }
    }

    @Override // com.p118pd.sdk.AbstractC7833oO00oOo0
    public final void onLoadStarted(@Nullable Drawable drawable) {
        OooO0OO();
        OooO0O0(drawable);
    }

    @Override // com.p118pd.sdk.AbstractC7811oO00OooO
    public native void onStart();

    @Override // com.p118pd.sdk.AbstractC7811oO00OooO
    public native void onStop();

    @Override // com.p118pd.sdk.AbstractC7833oO00oOo0
    public final void removeCallback(@NonNull AbstractC8301oOo00oO0 ooo00oo0) {
        this.f21394OooO00o.OooO0O0(ooo00oo0);
    }

    @Override // com.p118pd.sdk.AbstractC7833oO00oOo0
    public final void setRequest(@Nullable AbstractC7821oO00o0o oo00o0o) {
        OooO00o(oo00o0o);
    }

    public native String toString();

    public final AbstractC8304oOo00ooO<T, Z> OooO00o(@IdRes int i) {
        if (this.o00oO0O == 0) {
            this.o00oO0O = i;
            return this;
        }
        throw new IllegalArgumentException("You cannot change the tag id once it has been set.");
    }

    @NonNull
    /* renamed from: OooO00o  reason: collision with other method in class */
    public final T m19996OooO00o() {
        return this.f21393OooO00o;
    }

    private void OooO00o(@Nullable Object obj) {
        T t = this.f21393OooO00o;
        int i = this.o00oO0O;
        if (i == 0) {
            i = o0ooOO0;
        }
        t.setTag(i, obj);
    }

    @Nullable
    private Object OooO00o() {
        T t = this.f21393OooO00o;
        int i = this.o00oO0O;
        if (i == 0) {
            i = o0ooOO0;
        }
        return t.getTag(i);
    }
}

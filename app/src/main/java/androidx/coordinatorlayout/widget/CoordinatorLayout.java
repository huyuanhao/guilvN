package androidx.coordinatorlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import androidx.annotation.AttrRes;
import androidx.annotation.ColorInt;
import androidx.annotation.DrawableRes;
import androidx.annotation.FloatRange;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.coordinatorlayout.C0041R;
import androidx.core.util.Pools;
import androidx.core.view.ViewCompat;
import androidx.customview.view.AbsSavedState;
import com.p118pd.sdk.AbstractC7102o00OOooO;
import com.p118pd.sdk.AbstractC7107o00Oo000;
import com.p118pd.sdk.AbstractC8352oOoOOoO0;
import com.p118pd.sdk.C6984o000O0O;
import com.p118pd.sdk.C7001o000Oo0;
import com.p118pd.sdk.C7009o000OoOo;
import com.p118pd.sdk.C7043o00O0000;
import com.p118pd.sdk.C7080o00OO0;
import com.p118pd.sdk.C7092o00OOO0;
import com.p118pd.sdk.C7119o00OoO0o;
import com.p118pd.sdk.C7129o00OoOoO;
import com.p118pd.sdk.C9058ooOoOoOO;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CoordinatorLayout extends ViewGroup implements AbstractC7102o00OOooO {
    public static final Pools.OooO00o<Rect> OooO00o = new Pools.OooO0O0(12);

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final ThreadLocal<Map<String, Constructor<OooO0OO>>> f13812OooO00o = new ThreadLocal<>();

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final Comparator<View> f13813OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final Class<?>[] f13814OooO00o = {Context.class, AttributeSet.class};
    public static final int o00oO0O = 0;
    public static final int o0OOO0o = 2;
    public static final int o0ooOO0 = 1;
    public static final int o0ooOOo = 0;

    /* renamed from: o0ooOOo  reason: collision with other field name */
    public static final String f13815o0ooOOo = "CoordinatorLayout";
    public static final int o0ooOoO = 1;

    /* renamed from: o0ooOoO  reason: collision with other field name */
    public static final String f13816o0ooOoO;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Paint f13817OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Drawable f13818OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public View f13819OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public ViewGroup.OnHierarchyChangeListener f13820OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public OooO0o f13821OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final C6984o000O0O<View> f13822OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public AbstractC7107o00Oo000 f13823OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C7119o00OoO0o f13824OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final C7129o00OoOoO f13825OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final List<View> f13826OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final int[] f13827OooO00o;
    public View OooO0O0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public final List<View> f13828OooO0O0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public boolean f13829OooO0O0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public int[] f13830OooO0O0;
    public final List<View> OooO0OO;

    /* renamed from: OooO0OO  reason: collision with other field name */
    public boolean f13831OooO0OO;
    public boolean OooO0Oo;
    public boolean OooO0o0;

    @Deprecated
    @Retention(RetentionPolicy.RUNTIME)
    public @interface DefaultBehavior {
        Class<? extends OooO0OO> value();
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public @interface DispatchChangeEvent {
    }

    public class OooO00o implements AbstractC7107o00Oo000 {
        public OooO00o() {
        }

        @Override // com.p118pd.sdk.AbstractC7107o00Oo000
        public C7119o00OoO0o OooO00o(View view, C7119o00OoO0o o00ooo0o) {
            return CoordinatorLayout.this.OooO00o(o00ooo0o);
        }
    }

    public interface OooO0O0 {
        @NonNull
        OooO0OO OooO00o();
    }

    public static abstract class OooO0OO<V extends View> {
        public OooO0OO() {
        }

        @FloatRange(from = AbstractC8352oOoOOoO0.OooO0O0, mo599to = 1.0d)
        public float OooO00o(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v) {
            return 0.0f;
        }

        @ColorInt
        /* renamed from: OooO00o  reason: collision with other method in class */
        public int m14455OooO00o(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v) {
            return -16777216;
        }

        @NonNull
        public C7119o00OoO0o OooO00o(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull C7119o00OoO0o o00ooo0o) {
            return o00ooo0o;
        }

        public void OooO00o() {
        }

        public void OooO00o(@NonNull C5022OooO0o0 oooO0o0) {
        }

        public void OooO00o(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull Parcelable parcelable) {
        }

        public void OooO00o(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull View view) {
        }

        @Deprecated
        public void OooO00o(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull View view, int i, int i2, int i3, int i4) {
        }

        @Deprecated
        public void OooO00o(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull View view, int i, int i2, @NonNull int[] iArr) {
        }

        @Deprecated
        public void OooO00o(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull View view, @NonNull View view2, int i) {
        }

        /* renamed from: OooO00o  reason: collision with other method in class */
        public boolean m14457OooO00o(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v) {
            return OooO00o(coordinatorLayout, v) > 0.0f;
        }

        public boolean OooO00o(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, int i) {
            return false;
        }

        public boolean OooO00o(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, int i, int i2, int i3, int i4) {
            return false;
        }

        public boolean OooO00o(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull Rect rect) {
            return false;
        }

        public boolean OooO00o(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull Rect rect, boolean z) {
            return false;
        }

        public boolean OooO00o(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull MotionEvent motionEvent) {
            return false;
        }

        /* renamed from: OooO00o  reason: collision with other method in class */
        public boolean m14458OooO00o(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull View view) {
            return false;
        }

        public boolean OooO00o(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull View view, float f, float f2) {
            return false;
        }

        public boolean OooO00o(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull View view, float f, float f2, boolean z) {
            return false;
        }

        @Deprecated
        /* renamed from: OooO00o  reason: collision with other method in class */
        public boolean m14459OooO00o(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull View view, @NonNull View view2, int i) {
            return false;
        }

        @Deprecated
        public void OooO0O0(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull View view) {
        }

        public boolean OooO0O0(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull MotionEvent motionEvent) {
            return false;
        }

        /* renamed from: OooO0O0  reason: collision with other method in class */
        public boolean m14461OooO0O0(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull View view) {
            return false;
        }

        public OooO0OO(Context context, AttributeSet attributeSet) {
        }

        public static void OooO00o(@NonNull View view, @Nullable Object obj) {
            ((C5022OooO0o0) view.getLayoutParams()).f13835OooO00o = obj;
        }

        @Nullable
        public static Object OooO00o(@NonNull View view) {
            return ((C5022OooO0o0) view.getLayoutParams()).f13835OooO00o;
        }

        /* renamed from: OooO00o  reason: collision with other method in class */
        public boolean m14460OooO00o(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull View view, @NonNull View view2, int i, int i2) {
            if (i2 == 0) {
                return m14459OooO00o(coordinatorLayout, (View) v, view, view2, i);
            }
            return false;
        }

        public void OooO00o(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull View view, @NonNull View view2, int i, int i2) {
            if (i2 == 0) {
                OooO00o(coordinatorLayout, (View) v, view, view2, i);
            }
        }

        public void OooO00o(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull View view, int i) {
            if (i == 0) {
                OooO0O0(coordinatorLayout, (View) v, view);
            }
        }

        public void OooO00o(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull View view, int i, int i2, int i3, int i4, int i5) {
            if (i5 == 0) {
                OooO00o(coordinatorLayout, v, view, i, i2, i3, i4);
            }
        }

        public void OooO00o(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull View view, int i, int i2, @NonNull int[] iArr, int i3) {
            if (i3 == 0) {
                OooO00o(coordinatorLayout, v, view, i, i2, iArr);
            }
        }

        @Nullable
        /* renamed from: OooO00o  reason: collision with other method in class */
        public Parcelable m14456OooO00o(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v) {
            return View.BaseSavedState.EMPTY_STATE;
        }
    }

    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$OooO0Oo  reason: case insensitive filesystem */
    public class ViewGroup$OnHierarchyChangeListenerC5021OooO0Oo implements ViewGroup.OnHierarchyChangeListener {
        public ViewGroup$OnHierarchyChangeListenerC5021OooO0Oo() {
        }

        public void onChildViewAdded(View view, View view2) {
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = CoordinatorLayout.this.f13820OooO00o;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewAdded(view, view2);
            }
        }

        public void onChildViewRemoved(View view, View view2) {
            CoordinatorLayout.this.m14451OooO00o(2);
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = CoordinatorLayout.this.f13820OooO00o;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewRemoved(view, view2);
            }
        }
    }

    public class OooO0o implements ViewTreeObserver.OnPreDrawListener {
        public OooO0o() {
        }

        public boolean onPreDraw() {
            CoordinatorLayout.this.m14451OooO00o(0);
            return true;
        }
    }

    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$OooO0o0  reason: case insensitive filesystem */
    public static class C5022OooO0o0 extends ViewGroup.MarginLayoutParams {
        public int OooO00o = 0;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final Rect f13832OooO00o = new Rect();

        /* renamed from: OooO00o  reason: collision with other field name */
        public View f13833OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public OooO0OO f13834OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public Object f13835OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public boolean f13836OooO00o = false;
        public int OooO0O0 = 0;

        /* renamed from: OooO0O0  reason: collision with other field name */
        public View f13837OooO0O0;

        /* renamed from: OooO0O0  reason: collision with other field name */
        public boolean f13838OooO0O0;
        public int OooO0OO = -1;

        /* renamed from: OooO0OO  reason: collision with other field name */
        public boolean f13839OooO0OO;
        public int OooO0Oo = -1;

        /* renamed from: OooO0Oo  reason: collision with other field name */
        public boolean f13840OooO0Oo;
        public int OooO0o = 0;
        public int OooO0o0 = 0;

        /* renamed from: OooO0o0  reason: collision with other field name */
        public boolean f13841OooO0o0;
        public int OooO0oO;
        public int OooO0oo;

        public C5022OooO0o0(int i, int i2) {
            super(i, i2);
        }

        @IdRes
        public int OooO00o() {
            return this.OooO0Oo;
        }

        public void OooO0O0(@IdRes int i) {
            m14465OooO00o();
            this.OooO0Oo = i;
        }

        public void OooO0OO() {
            this.f13838OooO0O0 = false;
        }

        @Nullable
        /* renamed from: OooO00o  reason: collision with other method in class */
        public OooO0OO m14464OooO00o() {
            return this.f13834OooO00o;
        }

        /* renamed from: OooO0OO  reason: collision with other method in class */
        public boolean m14470OooO0OO() {
            return this.f13841OooO0o0;
        }

        public void OooO00o(@Nullable OooO0OO oooO0OO) {
            OooO0OO oooO0OO2 = this.f13834OooO00o;
            if (oooO0OO2 != oooO0OO) {
                if (oooO0OO2 != null) {
                    oooO0OO2.OooO00o();
                }
                this.f13834OooO00o = oooO0OO;
                this.f13835OooO00o = null;
                this.f13836OooO00o = true;
                if (oooO0OO != null) {
                    oooO0OO.OooO00o(this);
                }
            }
        }

        /* renamed from: OooO0O0  reason: collision with other method in class */
        public boolean m14469OooO0O0() {
            if (this.f13834OooO00o == null) {
                this.f13838OooO0O0 = false;
            }
            return this.f13838OooO0O0;
        }

        public void OooO0O0() {
            this.f13841OooO0o0 = false;
        }

        public void OooO00o(Rect rect) {
            this.f13832OooO00o.set(rect);
        }

        public C5022OooO0o0(@NonNull Context context, @Nullable AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0041R.styleable.OooO0OO);
            this.OooO00o = obtainStyledAttributes.getInteger(C0041R.styleable.CoordinatorLayout_Layout_android_layout_gravity, 0);
            this.OooO0Oo = obtainStyledAttributes.getResourceId(C0041R.styleable.CoordinatorLayout_Layout_layout_anchor, -1);
            this.OooO0O0 = obtainStyledAttributes.getInteger(C0041R.styleable.CoordinatorLayout_Layout_layout_anchorGravity, 0);
            this.OooO0OO = obtainStyledAttributes.getInteger(C0041R.styleable.CoordinatorLayout_Layout_layout_keyline, -1);
            this.OooO0o0 = obtainStyledAttributes.getInt(C0041R.styleable.CoordinatorLayout_Layout_layout_insetEdge, 0);
            this.OooO0o = obtainStyledAttributes.getInt(C0041R.styleable.CoordinatorLayout_Layout_layout_dodgeInsetEdges, 0);
            boolean hasValue = obtainStyledAttributes.hasValue(C0041R.styleable.CoordinatorLayout_Layout_layout_behavior);
            this.f13836OooO00o = hasValue;
            if (hasValue) {
                this.f13834OooO00o = CoordinatorLayout.OooO00o(context, attributeSet, obtainStyledAttributes.getString(C0041R.styleable.CoordinatorLayout_Layout_layout_behavior));
            }
            obtainStyledAttributes.recycle();
            OooO0OO oooO0OO = this.f13834OooO00o;
            if (oooO0OO != null) {
                oooO0OO.OooO00o(this);
            }
        }

        /* renamed from: OooO00o  reason: collision with other method in class */
        public Rect m14463OooO00o() {
            return this.f13832OooO00o;
        }

        /* renamed from: OooO00o  reason: collision with other method in class */
        public boolean m14466OooO00o() {
            return this.f13833OooO00o == null && this.OooO0Oo != -1;
        }

        /* renamed from: OooO00o  reason: collision with other method in class */
        public boolean m14468OooO00o(CoordinatorLayout coordinatorLayout, View view) {
            boolean z = this.f13838OooO0O0;
            if (z) {
                return true;
            }
            OooO0OO oooO0OO = this.f13834OooO00o;
            boolean OooO00o2 = (oooO0OO != null ? oooO0OO.m14457OooO00o(coordinatorLayout, view) : false) | z;
            this.f13838OooO0O0 = OooO00o2;
            return OooO00o2;
        }

        public void OooO00o(int i) {
            OooO00o(i, false);
        }

        public void OooO00o(int i, boolean z) {
            if (i == 0) {
                this.f13839OooO0OO = z;
            } else if (i == 1) {
                this.f13840OooO0Oo = z;
            }
        }

        /* renamed from: OooO00o  reason: collision with other method in class */
        public boolean m14467OooO00o(int i) {
            if (i == 0) {
                return this.f13839OooO0OO;
            }
            if (i != 1) {
                return false;
            }
            return this.f13840OooO0Oo;
        }

        public void OooO00o(boolean z) {
            this.f13841OooO0o0 = z;
        }

        public boolean OooO00o(CoordinatorLayout coordinatorLayout, View view, View view2) {
            OooO0OO oooO0OO;
            return view2 == this.f13837OooO0O0 || OooO00o(view2, ViewCompat.m14593OooO0o(coordinatorLayout)) || ((oooO0OO = this.f13834OooO00o) != null && oooO0OO.m14458OooO00o(coordinatorLayout, view, view2));
        }

        /* renamed from: OooO00o  reason: collision with other method in class */
        public void m14465OooO00o() {
            this.f13837OooO0O0 = null;
            this.f13833OooO00o = null;
        }

        public View OooO00o(CoordinatorLayout coordinatorLayout, View view) {
            if (this.OooO0Oo == -1) {
                this.f13837OooO0O0 = null;
                this.f13833OooO00o = null;
                return null;
            }
            if (this.f13833OooO00o == null || !m14462OooO00o(view, coordinatorLayout)) {
                OooO00o(view, coordinatorLayout);
            }
            return this.f13833OooO00o;
        }

        private void OooO00o(View view, CoordinatorLayout coordinatorLayout) {
            View findViewById = coordinatorLayout.findViewById(this.OooO0Oo);
            this.f13833OooO00o = findViewById;
            if (findViewById != null) {
                if (findViewById != coordinatorLayout) {
                    ViewParent parent = findViewById.getParent();
                    while (parent != coordinatorLayout && parent != null) {
                        if (parent != view) {
                            if (parent instanceof View) {
                                findViewById = (View) parent;
                            }
                            parent = parent.getParent();
                        } else if (coordinatorLayout.isInEditMode()) {
                            this.f13837OooO0O0 = null;
                            this.f13833OooO00o = null;
                            return;
                        } else {
                            throw new IllegalStateException("Anchor must not be a descendant of the anchored view");
                        }
                    }
                    this.f13837OooO0O0 = findViewById;
                } else if (coordinatorLayout.isInEditMode()) {
                    this.f13837OooO0O0 = null;
                    this.f13833OooO00o = null;
                } else {
                    throw new IllegalStateException("View can not be anchored to the the parent CoordinatorLayout");
                }
            } else if (coordinatorLayout.isInEditMode()) {
                this.f13837OooO0O0 = null;
                this.f13833OooO00o = null;
            } else {
                throw new IllegalStateException("Could not find CoordinatorLayout descendant view with id " + coordinatorLayout.getResources().getResourceName(this.OooO0Oo) + " to anchor view " + view);
            }
        }

        public C5022OooO0o0(C5022OooO0o0 oooO0o0) {
            super((ViewGroup.MarginLayoutParams) oooO0o0);
        }

        public C5022OooO0o0(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        /* renamed from: OooO00o  reason: collision with other method in class */
        private boolean m14462OooO00o(View view, CoordinatorLayout coordinatorLayout) {
            if (this.f13833OooO00o.getId() != this.OooO0Oo) {
                return false;
            }
            View view2 = this.f13833OooO00o;
            for (ViewParent parent = view2.getParent(); parent != coordinatorLayout; parent = parent.getParent()) {
                if (parent == null || parent == view) {
                    this.f13837OooO0O0 = null;
                    this.f13833OooO00o = null;
                    return false;
                }
                if (parent instanceof View) {
                    view2 = (View) parent;
                }
            }
            this.f13837OooO0O0 = view2;
            return true;
        }

        public C5022OooO0o0(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        private boolean OooO00o(View view, int i) {
            int OooO00o2 = C7092o00OOO0.OooO00o(((C5022OooO0o0) view.getLayoutParams()).OooO0o0, i);
            return OooO00o2 != 0 && (C7092o00OOO0.OooO00o(this.OooO0o, i) & OooO00o2) == OooO00o2;
        }
    }

    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$OooO0oO  reason: case insensitive filesystem */
    public static class C5023OooO0oO implements Comparator<View> {
        /* renamed from: OooO00o */
        public int compare(View view, View view2) {
            float OooOOOO = ViewCompat.OooOOOO(view);
            float OooOOOO2 = ViewCompat.OooOOOO(view2);
            if (OooOOOO > OooOOOO2) {
                return -1;
            }
            return OooOOOO < OooOOOO2 ? 1 : 0;
        }
    }

    static {
        Package r0 = CoordinatorLayout.class.getPackage();
        f13816o0ooOoO = r0 != null ? r0.getName() : null;
        if (Build.VERSION.SDK_INT >= 21) {
            f13813OooO00o = new C5023OooO0oO();
        } else {
            f13813OooO00o = null;
        }
    }

    public CoordinatorLayout(@NonNull Context context) {
        this(context, null);
    }

    public static int OooO00o(int i, int i2, int i3) {
        return i < i2 ? i2 : i > i3 ? i3 : i;
    }

    @NonNull
    public static Rect OooO00o() {
        Rect acquire = OooO00o.acquire();
        return acquire == null ? new Rect() : acquire;
    }

    public static int OooO0O0(int i) {
        if (i == 0) {
            return 17;
        }
        return i;
    }

    private C7119o00OoO0o OooO0O0(C7119o00OoO0o o00ooo0o) {
        OooO0OO OooO00o2;
        if (o00ooo0o.m18399OooO0Oo()) {
            return o00ooo0o;
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (ViewCompat.m14578OooO00o(childAt) && (OooO00o2 = ((C5022OooO0o0) childAt.getLayoutParams()).m14464OooO00o()) != null) {
                o00ooo0o = OooO00o2.OooO00o(this, childAt, o00ooo0o);
                if (o00ooo0o.m18399OooO0Oo()) {
                    break;
                }
            }
        }
        return o00ooo0o;
    }

    public static int OooO0OO(int i) {
        if ((i & 7) == 0) {
            i |= 8388611;
        }
        return (i & 112) == 0 ? i | 48 : i;
    }

    public static int OooO0Oo(int i) {
        if (i == 0) {
            return 8388661;
        }
        return i;
    }

    private void OooO0Oo() {
        this.f13826OooO00o.clear();
        this.f13822OooO00o.m18196OooO00o();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            C5022OooO0o0 OooO00o2 = m14448OooO00o(childAt);
            OooO00o2.OooO00o(this, childAt);
            this.f13822OooO00o.m18197OooO00o(childAt);
            for (int i2 = 0; i2 < childCount; i2++) {
                if (i2 != i) {
                    View childAt2 = getChildAt(i2);
                    if (OooO00o2.OooO00o(this, childAt, childAt2)) {
                        if (!this.f13822OooO00o.m18198OooO00o(childAt2)) {
                            this.f13822OooO00o.m18197OooO00o(childAt2);
                        }
                        this.f13822OooO00o.OooO00o(childAt2, childAt);
                    }
                }
            }
        }
        this.f13826OooO00o.addAll(this.f13822OooO00o.m18195OooO00o());
        Collections.reverse(this.f13826OooO00o);
    }

    private void OooO0o(View view, int i) {
        C5022OooO0o0 oooO0o0 = (C5022OooO0o0) view.getLayoutParams();
        int i2 = oooO0o0.OooO0oo;
        if (i2 != i) {
            ViewCompat.OooO0Oo(view, i - i2);
            oooO0o0.OooO0oo = i;
        }
    }

    private void OooO0o0(View view, int i) {
        C5022OooO0o0 oooO0o0 = (C5022OooO0o0) view.getLayoutParams();
        int i2 = oooO0o0.OooO0oO;
        if (i2 != i) {
            ViewCompat.OooO0OO(view, i - i2);
            oooO0o0.OooO0oO = i;
        }
    }

    public void OooO0OO(@NonNull View view, int i) {
        C5022OooO0o0 oooO0o0 = (C5022OooO0o0) view.getLayoutParams();
        if (!oooO0o0.m14466OooO00o()) {
            View view2 = oooO0o0.f13833OooO00o;
            if (view2 != null) {
                OooO00o(view, view2, i);
                return;
            }
            int i2 = oooO0o0.OooO0OO;
            if (i2 >= 0) {
                OooO00o(view, i2, i);
            } else {
                OooO0Oo(view, i);
            }
        } else {
            throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
        }
    }

    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof C5022OooO0o0) && super.checkLayoutParams(layoutParams);
    }

    public boolean drawChild(Canvas canvas, View view, long j) {
        C5022OooO0o0 oooO0o0 = (C5022OooO0o0) view.getLayoutParams();
        OooO0OO oooO0OO = oooO0o0.f13834OooO00o;
        if (oooO0OO != null) {
            float OooO00o2 = oooO0OO.OooO00o(this, view);
            if (OooO00o2 > 0.0f) {
                if (this.f13817OooO00o == null) {
                    this.f13817OooO00o = new Paint();
                }
                this.f13817OooO00o.setColor(oooO0o0.f13834OooO00o.m14455OooO00o(this, view));
                this.f13817OooO00o.setAlpha(OooO00o(Math.round(OooO00o2 * 255.0f), 0, 255));
                int save = canvas.save();
                if (view.isOpaque()) {
                    canvas.clipRect((float) view.getLeft(), (float) view.getTop(), (float) view.getRight(), (float) view.getBottom(), Region.Op.DIFFERENCE);
                }
                canvas.drawRect((float) getPaddingLeft(), (float) getPaddingTop(), (float) (getWidth() - getPaddingRight()), (float) (getHeight() - getPaddingBottom()), this.f13817OooO00o);
                canvas.restoreToCount(save);
            }
        }
        return super.drawChild(canvas, view, j);
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f13818OooO00o;
        boolean z = false;
        if (drawable != null && drawable.isStateful()) {
            z = false | drawable.setState(drawableState);
        }
        if (z) {
            invalidate();
        }
    }

    @VisibleForTesting
    public final List<View> getDependencySortedChildren() {
        OooO0Oo();
        return Collections.unmodifiableList(this.f13826OooO00o);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final C7119o00OoO0o getLastWindowInsets() {
        return this.f13824OooO00o;
    }

    @Override // com.p118pd.sdk.AbstractC7103o00OOooo
    public int getNestedScrollAxes() {
        return this.f13825OooO00o.OooO00o();
    }

    @Nullable
    public Drawable getStatusBarBackground() {
        return this.f13818OooO00o;
    }

    public int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingTop() + getPaddingBottom());
    }

    public int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingLeft() + getPaddingRight());
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        OooO00o(false);
        if (this.OooO0Oo) {
            if (this.f13821OooO00o == null) {
                this.f13821OooO00o = new OooO0o();
            }
            getViewTreeObserver().addOnPreDrawListener(this.f13821OooO00o);
        }
        if (this.f13824OooO00o == null && ViewCompat.m14578OooO00o((View) this)) {
            ViewCompat.m14594OooO0o((View) this);
        }
        this.f13831OooO0OO = true;
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        OooO00o(false);
        if (this.OooO0Oo && this.f13821OooO00o != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.f13821OooO00o);
        }
        View view = this.OooO0O0;
        if (view != null) {
            onStopNestedScroll(view);
        }
        this.f13831OooO0OO = false;
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.OooO0o0 && this.f13818OooO00o != null) {
            C7119o00OoO0o o00ooo0o = this.f13824OooO00o;
            int OooO0oo = o00ooo0o != null ? o00ooo0o.OooO0oo() : 0;
            if (OooO0oo > 0) {
                this.f13818OooO00o.setBounds(0, 0, getWidth(), OooO0oo);
                this.f13818OooO00o.draw(canvas);
            }
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            OooO00o(true);
        }
        boolean OooO00o2 = OooO00o(motionEvent, 0);
        if (actionMasked == 1 || actionMasked == 3) {
            OooO00o(true);
        }
        return OooO00o2;
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        OooO0OO OooO00o2;
        int OooO0o2 = ViewCompat.m14593OooO0o((View) this);
        int size = this.f13826OooO00o.size();
        for (int i5 = 0; i5 < size; i5++) {
            View view = this.f13826OooO00o.get(i5);
            if (view.getVisibility() != 8 && ((OooO00o2 = ((C5022OooO0o0) view.getLayoutParams()).m14464OooO00o()) == null || !OooO00o2.OooO00o(this, view, OooO0o2))) {
                OooO0OO(view, OooO0o2);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:41:0x011a, code lost:
        if (r0.OooO00o(r30, r20, r11, r21, r23, 0) == false) goto L_0x012a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00c1  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00fb  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x011d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r31, int r32) {
        /*
        // Method dump skipped, instructions count: 391
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onMeasure(int, int):void");
    }

    @Override // com.p118pd.sdk.AbstractC7103o00OOooo
    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        OooO0OO OooO00o2;
        int childCount = getChildCount();
        boolean z2 = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                C5022OooO0o0 oooO0o0 = (C5022OooO0o0) childAt.getLayoutParams();
                if (oooO0o0.m14467OooO00o(0) && (OooO00o2 = oooO0o0.m14464OooO00o()) != null) {
                    z2 |= OooO00o2.OooO00o(this, childAt, view, f, f2, z);
                }
            }
        }
        if (z2) {
            m14451OooO00o(1);
        }
        return z2;
    }

    @Override // com.p118pd.sdk.AbstractC7103o00OOooo
    public boolean onNestedPreFling(View view, float f, float f2) {
        OooO0OO OooO00o2;
        int childCount = getChildCount();
        boolean z = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                C5022OooO0o0 oooO0o0 = (C5022OooO0o0) childAt.getLayoutParams();
                if (oooO0o0.m14467OooO00o(0) && (OooO00o2 = oooO0o0.m14464OooO00o()) != null) {
                    z |= OooO00o2.OooO00o(this, childAt, view, f, f2);
                }
            }
        }
        return z;
    }

    @Override // com.p118pd.sdk.AbstractC7103o00OOooo
    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        OooO00o(view, i, i2, iArr, 0);
    }

    @Override // com.p118pd.sdk.AbstractC7103o00OOooo
    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        OooO00o(view, i, i2, i3, i4, 0);
    }

    @Override // com.p118pd.sdk.AbstractC7103o00OOooo
    public void onNestedScrollAccepted(View view, View view2, int i) {
        OooO00o(view, view2, i, 0);
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.OooO00o());
        SparseArray<Parcelable> sparseArray = savedState.OooO00o;
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            OooO0OO OooO00o2 = m14448OooO00o(childAt).m14464OooO00o();
            if (!(id == -1 || OooO00o2 == null || (parcelable2 = sparseArray.get(id)) == null)) {
                OooO00o2.OooO00o(this, childAt, parcelable2);
            }
        }
    }

    public Parcelable onSaveInstanceState() {
        Parcelable OooO00o2;
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            OooO0OO OooO00o3 = ((C5022OooO0o0) childAt.getLayoutParams()).m14464OooO00o();
            if (!(id == -1 || OooO00o3 == null || (OooO00o2 = OooO00o3.m14456OooO00o(this, childAt)) == null)) {
                sparseArray.append(id, OooO00o2);
            }
        }
        savedState.OooO00o = sparseArray;
        return savedState;
    }

    @Override // com.p118pd.sdk.AbstractC7103o00OOooo
    public boolean onStartNestedScroll(View view, View view2, int i) {
        return m14454OooO00o(view, view2, i, 0);
    }

    @Override // com.p118pd.sdk.AbstractC7103o00OOooo
    public void onStopNestedScroll(View view) {
        OooO00o(view, 0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0012, code lost:
        if (r3 != false) goto L_0x0016;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x004c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            int r2 = r18.getActionMasked()
            android.view.View r3 = r0.f13819OooO00o
            r4 = 1
            r5 = 0
            if (r3 != 0) goto L_0x0015
            boolean r3 = r0.OooO00o(r1, r4)
            if (r3 == 0) goto L_0x002b
            goto L_0x0016
        L_0x0015:
            r3 = 0
        L_0x0016:
            android.view.View r6 = r0.f13819OooO00o
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$OooO0o0 r6 = (androidx.coordinatorlayout.widget.CoordinatorLayout.C5022OooO0o0) r6
            androidx.coordinatorlayout.widget.CoordinatorLayout$OooO0OO r6 = r6.m14464OooO00o()
            if (r6 == 0) goto L_0x002b
            android.view.View r7 = r0.f13819OooO00o
            boolean r6 = r6.OooO0O0(r0, r7, r1)
            goto L_0x002c
        L_0x002b:
            r6 = 0
        L_0x002c:
            android.view.View r7 = r0.f13819OooO00o
            r8 = 0
            if (r7 != 0) goto L_0x0037
            boolean r1 = super.onTouchEvent(r18)
            r6 = r6 | r1
            goto L_0x004a
        L_0x0037:
            if (r3 == 0) goto L_0x004a
            long r11 = android.os.SystemClock.uptimeMillis()
            r13 = 3
            r14 = 0
            r15 = 0
            r16 = 0
            r9 = r11
            android.view.MotionEvent r8 = android.view.MotionEvent.obtain(r9, r11, r13, r14, r15, r16)
            super.onTouchEvent(r8)
        L_0x004a:
            if (r8 == 0) goto L_0x004f
            r8.recycle()
        L_0x004f:
            if (r2 == r4) goto L_0x0054
            r1 = 3
            if (r2 != r1) goto L_0x0057
        L_0x0054:
            r0.OooO00o(r5)
        L_0x0057:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        OooO0OO OooO00o2 = ((C5022OooO0o0) view.getLayoutParams()).m14464OooO00o();
        if (OooO00o2 == null || !OooO00o2.OooO00o(this, view, rect, z)) {
            return super.requestChildRectangleOnScreen(view, rect, z);
        }
        return true;
    }

    public void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        if (z && !this.f13829OooO0O0) {
            OooO00o(false);
            this.f13829OooO0O0 = true;
        }
    }

    public void setFitsSystemWindows(boolean z) {
        super.setFitsSystemWindows(z);
        OooO0o0();
    }

    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.f13820OooO00o = onHierarchyChangeListener;
    }

    public void setStatusBarBackground(@Nullable Drawable drawable) {
        Drawable drawable2 = this.f13818OooO00o;
        if (drawable2 != drawable) {
            Drawable drawable3 = null;
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.f13818OooO00o = drawable3;
            if (drawable3 != null) {
                if (drawable3.isStateful()) {
                    this.f13818OooO00o.setState(getDrawableState());
                }
                C7043o00O0000.m18316OooO00o(this.f13818OooO00o, ViewCompat.m14593OooO0o((View) this));
                this.f13818OooO00o.setVisible(getVisibility() == 0, false);
                this.f13818OooO00o.setCallback(this);
            }
            ViewCompat.m14597OooO0o0((View) this);
        }
    }

    public void setStatusBarBackgroundColor(@ColorInt int i) {
        setStatusBarBackground(new ColorDrawable(i));
    }

    public void setStatusBarBackgroundResource(@DrawableRes int i) {
        setStatusBarBackground(i != 0 ? C7009o000OoOo.m18256OooO00o(getContext(), i) : null);
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        Drawable drawable = this.f13818OooO00o;
        if (drawable != null && drawable.isVisible() != z) {
            this.f13818OooO00o.setVisible(z, false);
        }
    }

    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f13818OooO00o;
    }

    public CoordinatorLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, C0041R.attr.coordinatorLayoutStyle);
    }

    public CoordinatorLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, @AttrRes int i) {
        super(context, attributeSet, i);
        TypedArray typedArray;
        this.f13826OooO00o = new ArrayList();
        this.f13822OooO00o = new C6984o000O0O<>();
        this.f13828OooO0O0 = new ArrayList();
        this.OooO0OO = new ArrayList();
        this.f13827OooO00o = new int[2];
        this.f13825OooO00o = new C7129o00OoOoO(this);
        if (i == 0) {
            typedArray = context.obtainStyledAttributes(attributeSet, C0041R.styleable.OooO0O0, 0, C0041R.style.Widget_Support_CoordinatorLayout);
        } else {
            typedArray = context.obtainStyledAttributes(attributeSet, C0041R.styleable.OooO0O0, i, 0);
        }
        int resourceId = typedArray.getResourceId(C0041R.styleable.CoordinatorLayout_keylines, 0);
        if (resourceId != 0) {
            Resources resources = context.getResources();
            this.f13830OooO0O0 = resources.getIntArray(resourceId);
            float f = resources.getDisplayMetrics().density;
            int length = this.f13830OooO0O0.length;
            for (int i2 = 0; i2 < length; i2++) {
                int[] iArr = this.f13830OooO0O0;
                iArr[i2] = (int) (((float) iArr[i2]) * f);
            }
        }
        this.f13818OooO00o = typedArray.getDrawable(C0041R.styleable.CoordinatorLayout_statusBarBackground);
        typedArray.recycle();
        OooO0o0();
        super.setOnHierarchyChangeListener(new ViewGroup$OnHierarchyChangeListenerC5021OooO0Oo());
    }

    public static void OooO00o(@NonNull Rect rect) {
        rect.setEmpty();
        OooO00o.release(rect);
    }

    private void OooO0o0() {
        if (Build.VERSION.SDK_INT >= 21) {
            if (ViewCompat.m14578OooO00o((View) this)) {
                if (this.f13823OooO00o == null) {
                    this.f13823OooO00o = new OooO00o();
                }
                ViewCompat.OooO00o(this, this.f13823OooO00o);
                setSystemUiVisibility(1280);
                return;
            }
            ViewCompat.OooO00o(this, (AbstractC7107o00Oo000) null);
        }
    }

    public final C7119o00OoO0o OooO00o(C7119o00OoO0o o00ooo0o) {
        if (C7080o00OO0.OooO00o(this.f13824OooO00o, o00ooo0o)) {
            return o00ooo0o;
        }
        this.f13824OooO00o = o00ooo0o;
        boolean z = true;
        boolean z2 = o00ooo0o != null && o00ooo0o.OooO0oo() > 0;
        this.OooO0o0 = z2;
        if (z2 || getBackground() != null) {
            z = false;
        }
        setWillNotDraw(z);
        C7119o00OoO0o OooO0O02 = OooO0O0(o00ooo0o);
        requestLayout();
        return OooO0O02;
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new OooO00o();
        public SparseArray<Parcelable> OooO00o;

        public static class OooO00o implements Parcelable.ClassLoaderCreator<SavedState> {
            /* renamed from: OooO00o */
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            /* renamed from: OooO00o */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            /* renamed from: OooO00o */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            int readInt = parcel.readInt();
            int[] iArr = new int[readInt];
            parcel.readIntArray(iArr);
            Parcelable[] readParcelableArray = parcel.readParcelableArray(classLoader);
            this.OooO00o = new SparseArray<>(readInt);
            for (int i = 0; i < readInt; i++) {
                this.OooO00o.append(iArr[i], readParcelableArray[i]);
            }
        }

        @Override // androidx.customview.view.AbsSavedState
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            SparseArray<Parcelable> sparseArray = this.OooO00o;
            int size = sparseArray != null ? sparseArray.size() : 0;
            parcel.writeInt(size);
            int[] iArr = new int[size];
            Parcelable[] parcelableArr = new Parcelable[size];
            for (int i2 = 0; i2 < size; i2++) {
                iArr[i2] = this.OooO00o.keyAt(i2);
                parcelableArr[i2] = this.OooO00o.valueAt(i2);
            }
            parcel.writeIntArray(iArr);
            parcel.writeParcelableArray(parcelableArr, i);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public void OooO0O0(View view, Rect rect) {
        rect.set(((C5022OooO0o0) view.getLayoutParams()).m14463OooO00o());
    }

    public void OooO0OO(View view, Rect rect) {
        ((C5022OooO0o0) view.getLayoutParams()).OooO00o(rect);
    }

    private void OooO00o(boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            OooO0OO OooO00o2 = ((C5022OooO0o0) childAt.getLayoutParams()).m14464OooO00o();
            if (OooO00o2 != null) {
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                if (z) {
                    OooO00o2.OooO00o(this, childAt, obtain);
                } else {
                    OooO00o2.OooO0O0(this, childAt, obtain);
                }
                obtain.recycle();
            }
        }
        for (int i2 = 0; i2 < childCount; i2++) {
            ((C5022OooO0o0) getChildAt(i2).getLayoutParams()).OooO0OO();
        }
        this.f13819OooO00o = null;
        this.f13829OooO0O0 = false;
    }

    @NonNull
    public List<View> OooO0O0(@NonNull View view) {
        List OooO00o2 = this.f13822OooO00o.OooO00o(view);
        this.OooO0OO.clear();
        if (OooO00o2 != null) {
            this.OooO0OO.addAll(OooO00o2);
        }
        return this.OooO0OO;
    }

    public void OooO0OO() {
        if (this.f13831OooO0OO && this.f13821OooO00o != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.f13821OooO00o);
        }
        this.OooO0Oo = false;
    }

    private void OooO0Oo(View view, int i) {
        C5022OooO0o0 oooO0o0 = (C5022OooO0o0) view.getLayoutParams();
        Rect OooO00o2 = OooO00o();
        OooO00o2.set(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) oooO0o0).leftMargin, getPaddingTop() + ((ViewGroup.MarginLayoutParams) oooO0o0).topMargin, (getWidth() - getPaddingRight()) - ((ViewGroup.MarginLayoutParams) oooO0o0).rightMargin, (getHeight() - getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) oooO0o0).bottomMargin);
        if (this.f13824OooO00o != null && ViewCompat.m14578OooO00o((View) this) && !ViewCompat.m14578OooO00o(view)) {
            OooO00o2.left += this.f13824OooO00o.OooO0o();
            OooO00o2.top += this.f13824OooO00o.OooO0oo();
            OooO00o2.right -= this.f13824OooO00o.OooO0oO();
            OooO00o2.bottom -= this.f13824OooO00o.OooO0o0();
        }
        Rect OooO00o3 = OooO00o();
        C7092o00OOO0.OooO00o(OooO0OO(oooO0o0.OooO00o), view.getMeasuredWidth(), view.getMeasuredHeight(), OooO00o2, OooO00o3, i);
        view.layout(OooO00o3.left, OooO00o3.top, OooO00o3.right, OooO00o3.bottom);
        OooO00o(OooO00o2);
        OooO00o(OooO00o3);
    }

    public void OooO0O0() {
        int childCount = getChildCount();
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= childCount) {
                break;
            } else if (OooO00o(getChildAt(i))) {
                z = true;
                break;
            } else {
                i++;
            }
        }
        if (z == this.OooO0Oo) {
            return;
        }
        if (z) {
            m14450OooO00o();
        } else {
            OooO0OO();
        }
    }

    public void OooO0O0(View view, int i) {
        OooO0OO OooO00o2;
        C5022OooO0o0 oooO0o0 = (C5022OooO0o0) view.getLayoutParams();
        if (oooO0o0.f13833OooO00o != null) {
            Rect OooO00o3 = OooO00o();
            Rect OooO00o4 = OooO00o();
            Rect OooO00o5 = OooO00o();
            OooO00o(oooO0o0.f13833OooO00o, OooO00o3);
            boolean z = false;
            OooO00o(view, false, OooO00o4);
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            OooO00o(view, i, OooO00o3, OooO00o5, oooO0o0, measuredWidth, measuredHeight);
            if (!(OooO00o5.left == OooO00o4.left && OooO00o5.top == OooO00o4.top)) {
                z = true;
            }
            OooO00o(oooO0o0, OooO00o5, measuredWidth, measuredHeight);
            int i2 = OooO00o5.left - OooO00o4.left;
            int i3 = OooO00o5.top - OooO00o4.top;
            if (i2 != 0) {
                ViewCompat.OooO0OO(view, i2);
            }
            if (i3 != 0) {
                ViewCompat.OooO0Oo(view, i3);
            }
            if (z && (OooO00o2 = oooO0o0.m14464OooO00o()) != null) {
                OooO00o2.m14461OooO0O0(this, view, oooO0o0.f13833OooO00o);
            }
            OooO00o(OooO00o3);
            OooO00o(OooO00o4);
            OooO00o(OooO00o5);
        }
    }

    private void OooO00o(List<View> list) {
        list.clear();
        boolean isChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        for (int i = childCount - 1; i >= 0; i--) {
            list.add(getChildAt(isChildrenDrawingOrderEnabled ? getChildDrawingOrder(childCount, i) : i));
        }
        Comparator<View> comparator = f13813OooO00o;
        if (comparator != null) {
            Collections.sort(list, comparator);
        }
    }

    private boolean OooO00o(MotionEvent motionEvent, int i) {
        int actionMasked = motionEvent.getActionMasked();
        List<View> list = this.f13828OooO0O0;
        OooO00o(list);
        int size = list.size();
        MotionEvent motionEvent2 = null;
        boolean z = false;
        boolean z2 = false;
        for (int i2 = 0; i2 < size; i2++) {
            View view = list.get(i2);
            C5022OooO0o0 oooO0o0 = (C5022OooO0o0) view.getLayoutParams();
            OooO0OO OooO00o2 = oooO0o0.m14464OooO00o();
            if (!(z || z2) || actionMasked == 0) {
                if (!z && OooO00o2 != null) {
                    if (i == 0) {
                        z = OooO00o2.OooO00o(this, view, motionEvent);
                    } else if (i == 1) {
                        z = OooO00o2.OooO0O0(this, view, motionEvent);
                    }
                    if (z) {
                        this.f13819OooO00o = view;
                    }
                }
                boolean OooO0O02 = oooO0o0.m14469OooO0O0();
                boolean OooO00o3 = oooO0o0.m14468OooO00o(this, view);
                z2 = OooO00o3 && !OooO0O02;
                if (OooO00o3 && !z2) {
                    break;
                }
            } else if (OooO00o2 != null) {
                if (motionEvent2 == null) {
                    long uptimeMillis = SystemClock.uptimeMillis();
                    motionEvent2 = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                }
                if (i == 0) {
                    OooO00o2.OooO00o(this, view, motionEvent2);
                } else if (i == 1) {
                    OooO00o2.OooO0O0(this, view, motionEvent2);
                }
            }
        }
        list.clear();
        return z;
    }

    private int OooO00o(int i) {
        int[] iArr = this.f13830OooO0O0;
        if (iArr == null) {
            String str = "No keylines defined for " + this + " - attempted index lookup " + i;
            return 0;
        } else if (i >= 0 && i < iArr.length) {
            return iArr[i];
        } else {
            String str2 = "Keyline index " + i + " out of range for " + this;
            return 0;
        }
    }

    public static OooO0OO OooO00o(Context context, AttributeSet attributeSet, String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.startsWith(C9058ooOoOoOO.OooOO0)) {
            str = context.getPackageName() + str;
        } else if (str.indexOf(46) < 0 && !TextUtils.isEmpty(f13816o0ooOoO)) {
            str = f13816o0ooOoO + '.' + str;
        }
        try {
            Map<String, Constructor<OooO0OO>> map = f13812OooO00o.get();
            if (map == null) {
                map = new HashMap<>();
                f13812OooO00o.set(map);
            }
            Constructor<OooO0OO> constructor = map.get(str);
            if (constructor == null) {
                constructor = context.getClassLoader().loadClass(str).getConstructor(f13814OooO00o);
                constructor.setAccessible(true);
                map.put(str, constructor);
            }
            return (OooO0OO) constructor.newInstance(context, attributeSet);
        } catch (Exception e) {
            throw new RuntimeException("Could not inflate Behavior subclass " + str, e);
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C5022OooO0o0 m14448OooO00o(View view) {
        C5022OooO0o0 oooO0o0 = (C5022OooO0o0) view.getLayoutParams();
        if (!oooO0o0.f13836OooO00o) {
            if (view instanceof OooO0O0) {
                oooO0o0.OooO00o(((OooO0O0) view).OooO00o());
                oooO0o0.f13836OooO00o = true;
            } else {
                DefaultBehavior defaultBehavior = null;
                for (Class<?> cls = view.getClass(); cls != null; cls = cls.getSuperclass()) {
                    defaultBehavior = (DefaultBehavior) cls.getAnnotation(DefaultBehavior.class);
                    if (defaultBehavior != null) {
                        break;
                    }
                }
                if (defaultBehavior != null) {
                    try {
                        oooO0o0.OooO00o((OooO0OO) defaultBehavior.value().getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
                    } catch (Exception unused) {
                        String str = "Default behavior class " + defaultBehavior.value().getName() + " could not be instantiated. Did you forget" + " a default constructor?";
                    }
                }
                oooO0o0.f13836OooO00o = true;
            }
        }
        return oooO0o0;
    }

    public void OooO00o(View view, Rect rect) {
        C7001o000Oo0.OooO00o(this, view, rect);
    }

    public void OooO00o(View view, int i, int i2, int i3, int i4) {
        measureChildWithMargins(view, i, i2, i3, i4);
    }

    public void OooO00o(View view, boolean z, Rect rect) {
        if (view.isLayoutRequested() || view.getVisibility() == 8) {
            rect.setEmpty();
        } else if (z) {
            OooO00o(view, rect);
        } else {
            rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
    }

    private void OooO00o(View view, int i, Rect rect, Rect rect2, C5022OooO0o0 oooO0o0, int i2, int i3) {
        int i4;
        int i5;
        int OooO00o2 = C7092o00OOO0.OooO00o(OooO0O0(oooO0o0.OooO00o), i);
        int OooO00o3 = C7092o00OOO0.OooO00o(OooO0OO(oooO0o0.OooO0O0), i);
        int i6 = OooO00o2 & 7;
        int i7 = OooO00o2 & 112;
        int i8 = OooO00o3 & 7;
        int i9 = OooO00o3 & 112;
        if (i8 == 1) {
            i4 = rect.left + (rect.width() / 2);
        } else if (i8 != 5) {
            i4 = rect.left;
        } else {
            i4 = rect.right;
        }
        if (i9 == 16) {
            i5 = rect.top + (rect.height() / 2);
        } else if (i9 != 80) {
            i5 = rect.top;
        } else {
            i5 = rect.bottom;
        }
        if (i6 == 1) {
            i4 -= i2 / 2;
        } else if (i6 != 5) {
            i4 -= i2;
        }
        if (i7 == 16) {
            i5 -= i3 / 2;
        } else if (i7 != 80) {
            i5 -= i3;
        }
        rect2.set(i4, i5, i2 + i4, i3 + i5);
    }

    private void OooO00o(C5022OooO0o0 oooO0o0, Rect rect, int i, int i2) {
        int width = getWidth();
        int height = getHeight();
        int max = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) oooO0o0).leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i) - ((ViewGroup.MarginLayoutParams) oooO0o0).rightMargin));
        int max2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) oooO0o0).topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i2) - ((ViewGroup.MarginLayoutParams) oooO0o0).bottomMargin));
        rect.set(max, max2, i + max, i2 + max2);
    }

    public void OooO00o(View view, int i, Rect rect, Rect rect2) {
        C5022OooO0o0 oooO0o0 = (C5022OooO0o0) view.getLayoutParams();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        OooO00o(view, i, rect, rect2, oooO0o0, measuredWidth, measuredHeight);
        OooO00o(oooO0o0, rect2, measuredWidth, measuredHeight);
    }

    private void OooO00o(View view, View view2, int i) {
        Rect OooO00o2 = OooO00o();
        Rect OooO00o3 = OooO00o();
        try {
            OooO00o(view2, OooO00o2);
            OooO00o(view, i, OooO00o2, OooO00o3);
            view.layout(OooO00o3.left, OooO00o3.top, OooO00o3.right, OooO00o3.bottom);
        } finally {
            OooO00o(OooO00o2);
            OooO00o(OooO00o3);
        }
    }

    private void OooO00o(View view, int i, int i2) {
        C5022OooO0o0 oooO0o0 = (C5022OooO0o0) view.getLayoutParams();
        int OooO00o2 = C7092o00OOO0.OooO00o(OooO0Oo(oooO0o0.OooO00o), i2);
        int i3 = OooO00o2 & 7;
        int i4 = OooO00o2 & 112;
        int width = getWidth();
        int height = getHeight();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        if (i2 == 1) {
            i = width - i;
        }
        int OooO00o3 = OooO00o(i) - measuredWidth;
        int i5 = 0;
        if (i3 == 1) {
            OooO00o3 += measuredWidth / 2;
        } else if (i3 == 5) {
            OooO00o3 += measuredWidth;
        }
        if (i4 == 16) {
            i5 = 0 + (measuredHeight / 2);
        } else if (i4 == 80) {
            i5 = measuredHeight + 0;
        }
        int max = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) oooO0o0).leftMargin, Math.min(OooO00o3, ((width - getPaddingRight()) - measuredWidth) - ((ViewGroup.MarginLayoutParams) oooO0o0).rightMargin));
        int max2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) oooO0o0).topMargin, Math.min(i5, ((height - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) oooO0o0).bottomMargin));
        view.layout(max, max2, measuredWidth + max, measuredHeight + max2);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public final void m14451OooO00o(int i) {
        boolean z;
        int OooO0o2 = ViewCompat.m14593OooO0o((View) this);
        int size = this.f13826OooO00o.size();
        Rect OooO00o2 = OooO00o();
        Rect OooO00o3 = OooO00o();
        Rect OooO00o4 = OooO00o();
        for (int i2 = 0; i2 < size; i2++) {
            View view = this.f13826OooO00o.get(i2);
            C5022OooO0o0 oooO0o0 = (C5022OooO0o0) view.getLayoutParams();
            if (i != 0 || view.getVisibility() != 8) {
                for (int i3 = 0; i3 < i2; i3++) {
                    if (oooO0o0.f13837OooO0O0 == this.f13826OooO00o.get(i3)) {
                        OooO0O0(view, OooO0o2);
                    }
                }
                OooO00o(view, true, OooO00o3);
                if (oooO0o0.OooO0o0 != 0 && !OooO00o3.isEmpty()) {
                    int OooO00o5 = C7092o00OOO0.OooO00o(oooO0o0.OooO0o0, OooO0o2);
                    int i4 = OooO00o5 & 112;
                    if (i4 == 48) {
                        OooO00o2.top = Math.max(OooO00o2.top, OooO00o3.bottom);
                    } else if (i4 == 80) {
                        OooO00o2.bottom = Math.max(OooO00o2.bottom, getHeight() - OooO00o3.top);
                    }
                    int i5 = OooO00o5 & 7;
                    if (i5 == 3) {
                        OooO00o2.left = Math.max(OooO00o2.left, OooO00o3.right);
                    } else if (i5 == 5) {
                        OooO00o2.right = Math.max(OooO00o2.right, getWidth() - OooO00o3.left);
                    }
                }
                if (oooO0o0.OooO0o != 0 && view.getVisibility() == 0) {
                    OooO00o(view, OooO00o2, OooO0o2);
                }
                if (i != 2) {
                    OooO0O0(view, OooO00o4);
                    if (!OooO00o4.equals(OooO00o3)) {
                        OooO0OO(view, OooO00o3);
                    }
                }
                for (int i6 = i2 + 1; i6 < size; i6++) {
                    View view2 = this.f13826OooO00o.get(i6);
                    C5022OooO0o0 oooO0o02 = (C5022OooO0o0) view2.getLayoutParams();
                    OooO0OO OooO00o6 = oooO0o02.m14464OooO00o();
                    if (OooO00o6 != null && OooO00o6.m14458OooO00o(this, view2, view)) {
                        if (i != 0 || !oooO0o02.m14470OooO0OO()) {
                            if (i != 2) {
                                z = OooO00o6.m14461OooO0O0(this, view2, view);
                            } else {
                                OooO00o6.OooO00o(this, view2, view);
                                z = true;
                            }
                            if (i == 1) {
                                oooO0o02.OooO00o(z);
                            }
                        } else {
                            oooO0o02.OooO0O0();
                        }
                    }
                }
            }
        }
        OooO00o(OooO00o2);
        OooO00o(OooO00o3);
        OooO00o(OooO00o4);
    }

    private void OooO00o(View view, Rect rect, int i) {
        boolean z;
        boolean z2;
        int width;
        int i2;
        int i3;
        int i4;
        int height;
        int i5;
        int i6;
        int i7;
        if (ViewCompat.m14612OooOOO(view) && view.getWidth() > 0 && view.getHeight() > 0) {
            C5022OooO0o0 oooO0o0 = (C5022OooO0o0) view.getLayoutParams();
            OooO0OO OooO00o2 = oooO0o0.m14464OooO00o();
            Rect OooO00o3 = OooO00o();
            Rect OooO00o4 = OooO00o();
            OooO00o4.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            if (OooO00o2 == null || !OooO00o2.OooO00o(this, view, OooO00o3)) {
                OooO00o3.set(OooO00o4);
            } else if (!OooO00o4.contains(OooO00o3)) {
                throw new IllegalArgumentException("Rect should be within the child's bounds. Rect:" + OooO00o3.toShortString() + " | Bounds:" + OooO00o4.toShortString());
            }
            OooO00o(OooO00o4);
            if (OooO00o3.isEmpty()) {
                OooO00o(OooO00o3);
                return;
            }
            int OooO00o5 = C7092o00OOO0.OooO00o(oooO0o0.OooO0o, i);
            boolean z3 = true;
            if ((OooO00o5 & 48) != 48 || (i6 = (OooO00o3.top - ((ViewGroup.MarginLayoutParams) oooO0o0).topMargin) - oooO0o0.OooO0oo) >= (i7 = rect.top)) {
                z = false;
            } else {
                OooO0o(view, i7 - i6);
                z = true;
            }
            if ((OooO00o5 & 80) == 80 && (height = ((getHeight() - OooO00o3.bottom) - ((ViewGroup.MarginLayoutParams) oooO0o0).bottomMargin) + oooO0o0.OooO0oo) < (i5 = rect.bottom)) {
                OooO0o(view, height - i5);
                z = true;
            }
            if (!z) {
                OooO0o(view, 0);
            }
            if ((OooO00o5 & 3) != 3 || (i3 = (OooO00o3.left - ((ViewGroup.MarginLayoutParams) oooO0o0).leftMargin) - oooO0o0.OooO0oO) >= (i4 = rect.left)) {
                z2 = false;
            } else {
                OooO0o0(view, i4 - i3);
                z2 = true;
            }
            if ((OooO00o5 & 5) != 5 || (width = ((getWidth() - OooO00o3.right) - ((ViewGroup.MarginLayoutParams) oooO0o0).rightMargin) + oooO0o0.OooO0oO) >= (i2 = rect.right)) {
                z3 = z2;
            } else {
                OooO0o0(view, width - i2);
            }
            if (!z3) {
                OooO0o0(view, 0);
            }
            OooO00o(OooO00o3);
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m14452OooO00o(@NonNull View view) {
        List OooO00o2 = this.f13822OooO00o.OooO00o(view);
        if (!(OooO00o2 == null || OooO00o2.isEmpty())) {
            for (int i = 0; i < OooO00o2.size(); i++) {
                View view2 = (View) OooO00o2.get(i);
                OooO0OO OooO00o3 = ((C5022OooO0o0) view2.getLayoutParams()).m14464OooO00o();
                if (OooO00o3 != null) {
                    OooO00o3.m14461OooO0O0(this, view2, view);
                }
            }
        }
    }

    @NonNull
    /* renamed from: OooO00o  reason: collision with other method in class */
    public List<View> m14449OooO00o(@NonNull View view) {
        List<View> OooO0O02 = this.f13822OooO00o.OooO0O0(view);
        this.OooO0OO.clear();
        if (OooO0O02 != null) {
            this.OooO0OO.addAll(OooO0O02);
        }
        return this.OooO0OO;
    }

    private boolean OooO00o(View view) {
        return this.f13822OooO00o.m18199OooO0O0(view);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m14450OooO00o() {
        if (this.f13831OooO0OO) {
            if (this.f13821OooO00o == null) {
                this.f13821OooO00o = new OooO0o();
            }
            getViewTreeObserver().addOnPreDrawListener(this.f13821OooO00o);
        }
        this.OooO0Oo = true;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m14453OooO00o(@NonNull View view, int i, int i2) {
        Rect OooO00o2 = OooO00o();
        OooO00o(view, OooO00o2);
        try {
            return OooO00o2.contains(i, i2);
        } finally {
            OooO00o(OooO00o2);
        }
    }

    public boolean OooO00o(@NonNull View view, @NonNull View view2) {
        boolean z = false;
        if (view.getVisibility() != 0 || view2.getVisibility() != 0) {
            return false;
        }
        Rect OooO00o2 = OooO00o();
        OooO00o(view, view.getParent() != this, OooO00o2);
        Rect OooO00o3 = OooO00o();
        OooO00o(view2, view2.getParent() != this, OooO00o3);
        try {
            if (OooO00o2.left <= OooO00o3.right && OooO00o2.top <= OooO00o3.bottom && OooO00o2.right >= OooO00o3.left && OooO00o2.bottom >= OooO00o3.top) {
                z = true;
            }
            return z;
        } finally {
            OooO00o(OooO00o2);
            OooO00o(OooO00o3);
        }
    }

    /* renamed from: OooO00o */
    public C5022OooO0o0 generateLayoutParams(AttributeSet attributeSet) {
        return new C5022OooO0o0(getContext(), attributeSet);
    }

    /* renamed from: OooO00o */
    public C5022OooO0o0 generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof C5022OooO0o0) {
            return new C5022OooO0o0((C5022OooO0o0) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new C5022OooO0o0((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new C5022OooO0o0(layoutParams);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C5022OooO0o0 generateDefaultLayoutParams() {
        return new C5022OooO0o0(-2, -2);
    }

    @Override // com.p118pd.sdk.AbstractC7102o00OOooO, com.p118pd.sdk.AbstractC7102o00OOooO
    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m14454OooO00o(View view, View view2, int i, int i2) {
        int childCount = getChildCount();
        boolean z = false;
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() != 8) {
                C5022OooO0o0 oooO0o0 = (C5022OooO0o0) childAt.getLayoutParams();
                OooO0OO OooO00o2 = oooO0o0.m14464OooO00o();
                if (OooO00o2 != null) {
                    boolean OooO00o3 = OooO00o2.m14460OooO00o(this, childAt, view, view2, i, i2);
                    z |= OooO00o3;
                    oooO0o0.OooO00o(i2, OooO00o3);
                } else {
                    oooO0o0.OooO00o(i2, false);
                }
            }
        }
        return z;
    }

    @Override // com.p118pd.sdk.AbstractC7102o00OOooO, com.p118pd.sdk.AbstractC7102o00OOooO
    public void OooO00o(View view, View view2, int i, int i2) {
        OooO0OO OooO00o2;
        this.f13825OooO00o.OooO00o(view, view2, i, i2);
        this.OooO0O0 = view2;
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            C5022OooO0o0 oooO0o0 = (C5022OooO0o0) childAt.getLayoutParams();
            if (oooO0o0.m14467OooO00o(i2) && (OooO00o2 = oooO0o0.m14464OooO00o()) != null) {
                OooO00o2.OooO00o(this, childAt, view, view2, i, i2);
            }
        }
    }

    @Override // com.p118pd.sdk.AbstractC7102o00OOooO
    public void OooO00o(View view, int i) {
        this.f13825OooO00o.OooO00o(view, i);
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            C5022OooO0o0 oooO0o0 = (C5022OooO0o0) childAt.getLayoutParams();
            if (oooO0o0.m14467OooO00o(i)) {
                OooO0OO OooO00o2 = oooO0o0.m14464OooO00o();
                if (OooO00o2 != null) {
                    OooO00o2.OooO00o(this, childAt, view, i);
                }
                oooO0o0.OooO00o(i);
                oooO0o0.OooO0O0();
            }
        }
        this.OooO0O0 = null;
    }

    @Override // com.p118pd.sdk.AbstractC7102o00OOooO
    public void OooO00o(View view, int i, int i2, int i3, int i4, int i5) {
        OooO0OO OooO00o2;
        int childCount = getChildCount();
        boolean z = false;
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() != 8) {
                C5022OooO0o0 oooO0o0 = (C5022OooO0o0) childAt.getLayoutParams();
                if (oooO0o0.m14467OooO00o(i5) && (OooO00o2 = oooO0o0.m14464OooO00o()) != null) {
                    OooO00o2.OooO00o(this, childAt, view, i, i2, i3, i4, i5);
                    z = true;
                }
            }
        }
        if (z) {
            m14451OooO00o(1);
        }
    }

    @Override // com.p118pd.sdk.AbstractC7102o00OOooO
    public void OooO00o(View view, int i, int i2, int[] iArr, int i3) {
        OooO0OO OooO00o2;
        int i4;
        int i5;
        int childCount = getChildCount();
        boolean z = false;
        int i6 = 0;
        int i7 = 0;
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            if (childAt.getVisibility() != 8) {
                C5022OooO0o0 oooO0o0 = (C5022OooO0o0) childAt.getLayoutParams();
                if (oooO0o0.m14467OooO00o(i3) && (OooO00o2 = oooO0o0.m14464OooO00o()) != null) {
                    int[] iArr2 = this.f13827OooO00o;
                    iArr2[1] = 0;
                    iArr2[0] = 0;
                    OooO00o2.OooO00o(this, childAt, view, i, i2, iArr2, i3);
                    int[] iArr3 = this.f13827OooO00o;
                    if (i > 0) {
                        i4 = Math.max(i6, iArr3[0]);
                    } else {
                        i4 = Math.min(i6, iArr3[0]);
                    }
                    i6 = i4;
                    int[] iArr4 = this.f13827OooO00o;
                    if (i2 > 0) {
                        i5 = Math.max(i7, iArr4[1]);
                    } else {
                        i5 = Math.min(i7, iArr4[1]);
                    }
                    i7 = i5;
                    z = true;
                }
            }
        }
        iArr[0] = i6;
        iArr[1] = i7;
        if (z) {
            m14451OooO00o(1);
        }
    }
}

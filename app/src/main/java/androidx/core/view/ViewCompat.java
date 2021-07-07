package androidx.core.view;

import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.ClipData;
import android.content.res.ColorStateList;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.Display;
import android.view.KeyEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeProvider;
import androidx.annotation.AbstractC0032Px;
import androidx.annotation.FloatRange;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.annotation.UiThread;
import androidx.core.C0045R;
import com.p118pd.sdk.AbstractC7098o00OOOo;
import com.p118pd.sdk.AbstractC7100o00OOOoO;
import com.p118pd.sdk.AbstractC7107o00Oo000;
import com.p118pd.sdk.AbstractC7109o00Oo0O;
import com.p118pd.sdk.C6971o0000oO0;
import com.p118pd.sdk.C7087o00OO0o;
import com.p118pd.sdk.C7106o00Oo00;
import com.p118pd.sdk.C7115o00Oo0oo;
import com.p118pd.sdk.C7119o00OoO0o;
import com.p118pd.sdk.C7120o00OoOO;
import com.p118pd.sdk.C7125o00OoOOO;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;

public class ViewCompat {
    public static final int OooO = 1;
    @Deprecated
    public static final int OooO00o = 0;

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final String f14043OooO00o = "ViewCompat";

    /* renamed from: OooO00o  reason: collision with other field name */
    public static ThreadLocal<Rect> f14044OooO00o = null;

    /* renamed from: OooO00o  reason: collision with other field name */
    public static Field f14045OooO00o = null;

    /* renamed from: OooO00o  reason: collision with other field name */
    public static Method f14046OooO00o = null;

    /* renamed from: OooO00o  reason: collision with other field name */
    public static WeakHashMap<View, String> f14047OooO00o = null;

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final AtomicInteger f14048OooO00o = new AtomicInteger(1);

    /* renamed from: OooO00o  reason: collision with other field name */
    public static boolean f14049OooO00o = false;
    @Deprecated
    public static final int OooO0O0 = 1;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public static Field f14050OooO0O0 = null;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public static Method f14051OooO0O0 = null;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public static WeakHashMap<View, C7115o00Oo0oo> f14052OooO0O0 = null;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public static boolean f14053OooO0O0 = false;
    @Deprecated
    public static final int OooO0OO = 2;

    /* renamed from: OooO0OO  reason: collision with other field name */
    public static Field f14054OooO0OO = null;

    /* renamed from: OooO0OO  reason: collision with other field name */
    public static Method f14055OooO0OO = null;

    /* renamed from: OooO0OO  reason: collision with other field name */
    public static boolean f14056OooO0OO = false;
    public static final int OooO0Oo = 0;

    /* renamed from: OooO0Oo  reason: collision with other field name */
    public static boolean f14057OooO0Oo = false;
    public static final int OooO0o = 2;
    public static final int OooO0o0 = 1;
    public static final int OooO0oO = 4;
    public static final int OooO0oo = 0;
    public static final int OooOO0 = 2;
    @Deprecated
    public static final int OooOO0O = 0;
    @Deprecated
    public static final int OooOO0o = 1;
    public static final int OooOOO = 0;
    @Deprecated
    public static final int OooOOO0 = 2;
    public static final int OooOOOO = 1;
    public static final int OooOOOo = 2;
    @Deprecated
    public static final int OooOOo = 16777215;
    public static final int OooOOo0 = 3;
    @Deprecated
    public static final int OooOOoo = -16777216;
    public static final int OooOo = 2;
    @Deprecated
    public static final int OooOo0 = 16777216;
    @Deprecated
    public static final int OooOo00 = 16;
    public static final int OooOo0O = 0;
    public static final int OooOo0o = 1;
    public static final int OooOoO = 1;
    public static final int OooOoO0 = 0;
    public static final int OooOoOO = 1;
    public static final int OooOoo = 4;
    public static final int OooOoo0 = 2;
    public static final int OooOooO = 8;
    public static final int OooOooo = 16;
    public static final int Oooo000 = 32;

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public @interface FocusDirection {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public @interface FocusRealDirection {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public @interface FocusRelativeDirection {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public @interface NestedScrollType {
    }

    public static class OooO00o implements View.OnApplyWindowInsetsListener {
        public final /* synthetic */ AbstractC7107o00Oo000 OooO00o;

        public OooO00o(AbstractC7107o00Oo000 o00oo000) {
            this.OooO00o = o00oo000;
        }

        public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
            return (WindowInsets) C7119o00OoO0o.OooO00o(this.OooO00o.OooO00o(view, C7119o00OoO0o.OooO00o(windowInsets)));
        }
    }

    public interface OooO0O0 {
        boolean onUnhandledKeyEvent(View view, KeyEvent keyEvent);
    }

    @RequiresApi(28)
    public static class OooO0OO implements View.OnUnhandledKeyEventListener {
        public OooO0O0 OooO00o;

        public OooO0OO(OooO0O0 oooO0O0) {
            this.OooO00o = oooO0O0;
        }

        public boolean onUnhandledKeyEvent(View view, KeyEvent keyEvent) {
            return this.OooO00o.onUnhandledKeyEvent(view, keyEvent);
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public @interface ScrollAxis {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public @interface ScrollIndicators {
    }

    public static void OooO(@NonNull View view, int i) {
        if (Build.VERSION.SDK_INT >= 17) {
            view.setLayoutDirection(i);
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static Rect m14568OooO00o() {
        if (f14044OooO00o == null) {
            f14044OooO00o = new ThreadLocal<>();
        }
        Rect rect = f14044OooO00o.get();
        if (rect == null) {
            rect = new Rect();
            f14044OooO00o.set(rect);
        }
        rect.setEmpty();
        return rect;
    }

    @Deprecated
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public static boolean m14584OooO0O0(View view, int i) {
        return view.canScrollVertically(i);
    }

    @SuppressLint({"InlinedApi"})
    /* renamed from: OooO0OO  reason: collision with other method in class */
    public static int m14585OooO0OO(@NonNull View view) {
        if (Build.VERSION.SDK_INT >= 26) {
            return view.getImportantForAutofill();
        }
        return 0;
    }

    public static void OooO0Oo(@NonNull View view, boolean z) {
        if (Build.VERSION.SDK_INT >= 16) {
            view.setHasTransientState(z);
        }
    }

    public static void OooO0o(@NonNull View view, int i) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 19) {
            view.setImportantForAccessibility(i);
        } else if (i2 >= 16) {
            if (i == 4) {
                i = 2;
            }
            view.setImportantForAccessibility(i);
        }
    }

    /* renamed from: OooO0o0  reason: collision with other method in class */
    public static void m14597OooO0o0(@NonNull View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            view.postInvalidateOnAnimation();
        } else {
            view.postInvalidate();
        }
    }

    public static void OooO0oO(@NonNull View view, int i) {
        if (Build.VERSION.SDK_INT >= 26) {
            view.setImportantForAutofill(i);
        }
    }

    public static void OooO0oo(@NonNull View view, @IdRes int i) {
        if (Build.VERSION.SDK_INT >= 17) {
            view.setLabelFor(i);
        }
    }

    /* renamed from: OooOO0  reason: collision with other method in class */
    public static boolean m14606OooOO0(@NonNull View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return view.isImportantForAccessibility();
        }
        return true;
    }

    @Deprecated
    public static void OooOO0O(View view, int i) {
        view.setOverScrollMode(i);
    }

    public static void OooOO0o(@NonNull View view, float f) {
        if (Build.VERSION.SDK_INT >= 21) {
            view.setTranslationZ(f);
        }
    }

    @AbstractC0032Px
    /* renamed from: OooOOO  reason: collision with other method in class */
    public static int m14611OooOOO(@NonNull View view) {
        if (Build.VERSION.SDK_INT >= 17) {
            return view.getPaddingEnd();
        }
        return view.getPaddingRight();
    }

    @Deprecated
    /* renamed from: OooOOO0  reason: collision with other method in class */
    public static int m14613OooOOO0(View view) {
        return view.getOverScrollMode();
    }

    @AbstractC0032Px
    /* renamed from: OooOOOO  reason: collision with other method in class */
    public static int m14615OooOOOO(@NonNull View view) {
        if (Build.VERSION.SDK_INT >= 17) {
            return view.getPaddingStart();
        }
        return view.getPaddingLeft();
    }

    /* renamed from: OooOOOo  reason: collision with other method in class */
    public static boolean m14617OooOOOo(@NonNull View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return view.isNestedScrollingEnabled();
        }
        if (view instanceof AbstractC7100o00OOOoO) {
            return ((AbstractC7100o00OOOoO) view).isNestedScrollingEnabled();
        }
        return false;
    }

    public static boolean OooOOo(@NonNull View view) {
        if (Build.VERSION.SDK_INT >= 17) {
            return view.isPaddingRelative();
        }
        return false;
    }

    @Deprecated
    /* renamed from: OooOOo0  reason: collision with other method in class */
    public static boolean m14618OooOOo0(View view) {
        return view.isOpaque();
    }

    public static boolean OooOOoo(@NonNull View view) {
        if (Build.VERSION.SDK_INT >= 26) {
            return view.restoreDefaultFocus();
        }
        return view.requestFocus();
    }

    @Deprecated
    public static void OooO0O0(View view, AccessibilityEvent accessibilityEvent) {
        view.onPopulateAccessibilityEvent(accessibilityEvent);
    }

    /* renamed from: OooOO0O  reason: collision with other method in class */
    public static boolean m14608OooOO0O(@NonNull View view) {
        if (Build.VERSION.SDK_INT >= 26) {
            return view.isImportantForAutofill();
        }
        return true;
    }

    @Deprecated
    public static void OooOOO0(View view, float f) {
        view.setX(f);
    }

    public static int OooOOo0(@NonNull View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return view.getWindowSystemUiVisibility();
        }
        return 0;
    }

    /* renamed from: androidx.core.view.ViewCompat$OooO0Oo  reason: case insensitive filesystem */
    public static class C5040OooO0Oo {
        public static final ArrayList<WeakReference<View>> OooO00o = new ArrayList<>();

        /* renamed from: OooO00o  reason: collision with other field name */
        public SparseArray<WeakReference<View>> f14058OooO00o = null;

        /* renamed from: OooO00o  reason: collision with other field name */
        public WeakReference<KeyEvent> f14059OooO00o = null;
        @Nullable

        /* renamed from: OooO00o  reason: collision with other field name */
        public WeakHashMap<View, Boolean> f14060OooO00o = null;

        private SparseArray<WeakReference<View>> OooO00o() {
            if (this.f14058OooO00o == null) {
                this.f14058OooO00o = new SparseArray<>();
            }
            return this.f14058OooO00o;
        }

        private boolean OooO0O0(@NonNull View view, @NonNull KeyEvent keyEvent) {
            ArrayList arrayList = (ArrayList) view.getTag(C0045R.C0048id.tag_unhandled_key_listeners);
            if (arrayList == null) {
                return false;
            }
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                if (((OooO0O0) arrayList.get(size)).onUnhandledKeyEvent(view, keyEvent)) {
                    return true;
                }
            }
            return false;
        }

        public static C5040OooO0Oo OooO00o(View view) {
            C5040OooO0Oo oooO0Oo = (C5040OooO0Oo) view.getTag(C0045R.C0048id.tag_unhandled_key_event_manager);
            if (oooO0Oo != null) {
                return oooO0Oo;
            }
            C5040OooO0Oo oooO0Oo2 = new C5040OooO0Oo();
            view.setTag(C0045R.C0048id.tag_unhandled_key_event_manager, oooO0Oo2);
            return oooO0Oo2;
        }

        public static void OooO0O0(View view) {
            synchronized (OooO00o) {
                for (int i = 0; i < OooO00o.size(); i++) {
                    if (OooO00o.get(i).get() == view) {
                        OooO00o.remove(i);
                        return;
                    }
                }
            }
        }

        /* renamed from: OooO00o  reason: collision with other method in class */
        public boolean m14621OooO00o(View view, KeyEvent keyEvent) {
            if (keyEvent.getAction() == 0) {
                m14619OooO00o();
            }
            View OooO00o2 = OooO00o(view, keyEvent);
            if (keyEvent.getAction() == 0) {
                int keyCode = keyEvent.getKeyCode();
                if (OooO00o2 != null && !KeyEvent.isModifierKey(keyCode)) {
                    OooO00o().put(keyCode, new WeakReference<>(OooO00o2));
                }
            }
            return OooO00o2 != null;
        }

        @Nullable
        private View OooO00o(View view, KeyEvent keyEvent) {
            WeakHashMap<View, Boolean> weakHashMap = this.f14060OooO00o;
            if (weakHashMap != null && weakHashMap.containsKey(view)) {
                if (view instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view;
                    for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                        View OooO00o2 = OooO00o(viewGroup.getChildAt(childCount), keyEvent);
                        if (OooO00o2 != null) {
                            return OooO00o2;
                        }
                    }
                }
                if (OooO0O0(view, keyEvent)) {
                    return view;
                }
            }
            return null;
        }

        public boolean OooO00o(KeyEvent keyEvent) {
            int indexOfKey;
            WeakReference<KeyEvent> weakReference = this.f14059OooO00o;
            if (weakReference != null && weakReference.get() == keyEvent) {
                return false;
            }
            this.f14059OooO00o = new WeakReference<>(keyEvent);
            WeakReference<View> weakReference2 = null;
            SparseArray<WeakReference<View>> OooO00o2 = OooO00o();
            if (keyEvent.getAction() == 1 && (indexOfKey = OooO00o2.indexOfKey(keyEvent.getKeyCode())) >= 0) {
                weakReference2 = OooO00o2.valueAt(indexOfKey);
                OooO00o2.removeAt(indexOfKey);
            }
            if (weakReference2 == null) {
                weakReference2 = OooO00o2.get(keyEvent.getKeyCode());
            }
            if (weakReference2 == null) {
                return false;
            }
            View view = weakReference2.get();
            if (view != null && ViewCompat.m14604OooO0oo(view)) {
                OooO0O0(view, keyEvent);
            }
            return true;
        }

        /* renamed from: OooO00o  reason: collision with other method in class */
        public static void m14620OooO00o(View view) {
            synchronized (OooO00o) {
                Iterator<WeakReference<View>> it = OooO00o.iterator();
                while (it.hasNext()) {
                    if (it.next().get() == view) {
                        return;
                    }
                }
                OooO00o.add(new WeakReference<>(view));
            }
        }

        /* renamed from: OooO00o  reason: collision with other method in class */
        private void m14619OooO00o() {
            WeakHashMap<View, Boolean> weakHashMap = this.f14060OooO00o;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            if (!OooO00o.isEmpty()) {
                synchronized (OooO00o) {
                    if (this.f14060OooO00o == null) {
                        this.f14060OooO00o = new WeakHashMap<>();
                    }
                    for (int size = OooO00o.size() - 1; size >= 0; size--) {
                        View view = OooO00o.get(size).get();
                        if (view == null) {
                            OooO00o.remove(size);
                        } else {
                            this.f14060OooO00o.put(view, Boolean.TRUE);
                            for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
                                this.f14060OooO00o.put((View) parent, Boolean.TRUE);
                            }
                        }
                    }
                }
            }
        }
    }

    @Deprecated
    /* renamed from: OooO  reason: collision with other method in class */
    public static int m14562OooO(View view) {
        return view.getMeasuredWidthAndState();
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public static boolean m14583OooO0O0(@NonNull View view) {
        if (f14057OooO0Oo) {
            return false;
        }
        if (f14054OooO0OO == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                f14054OooO0OO = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                f14057OooO0Oo = true;
                return false;
            }
        }
        try {
            if (f14054OooO0OO.get(view) != null) {
                return true;
            }
            return false;
        } catch (Throwable unused2) {
            f14057OooO0Oo = true;
            return false;
        }
    }

    /* renamed from: OooO0OO  reason: collision with other method in class */
    public static void m14586OooO0OO(@NonNull View view) {
        if (Build.VERSION.SDK_INT >= 24) {
            view.dispatchStartTemporaryDetach();
            return;
        }
        if (!f14056OooO0OO) {
            m14575OooO00o();
        }
        Method method = f14046OooO00o;
        if (method != null) {
            try {
                method.invoke(view, new Object[0]);
            } catch (Exception unused) {
            }
        } else {
            view.onStartTemporaryDetach();
        }
    }

    /* renamed from: OooO0Oo  reason: collision with other method in class */
    public static int m14589OooO0Oo(@NonNull View view) {
        if (Build.VERSION.SDK_INT >= 17) {
            return view.getLabelFor();
        }
        return 0;
    }

    /* renamed from: OooO0oO  reason: collision with other method in class */
    public static boolean m14601OooO0oO(@NonNull View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return view.hasTransientState();
        }
        return false;
    }

    @Deprecated
    /* renamed from: OooO0oo  reason: collision with other method in class */
    public static int m14602OooO0oo(View view) {
        return view.getMeasuredState();
    }

    @Deprecated
    public static float OooOO0(View view) {
        return view.getTranslationX();
    }

    public static float OooOO0o(@NonNull View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return view.getTranslationZ();
        }
        return 0.0f;
    }

    @Deprecated
    public static float OooOOO0(View view) {
        return view.getX();
    }

    @Deprecated
    public static void OooO(View view, float f) {
        view.setScaleY(f);
    }

    /* renamed from: OooO0o  reason: collision with other method in class */
    public static int m14593OooO0o(@NonNull View view) {
        if (Build.VERSION.SDK_INT >= 17) {
            return view.getLayoutDirection();
        }
        return 0;
    }

    @Deprecated
    /* renamed from: OooO0o0  reason: collision with other method in class */
    public static int m14596OooO0o0(View view) {
        return view.getLayerType();
    }

    @Deprecated
    public static void OooO0oo(View view, float f) {
        view.setScaleX(f);
    }

    /* renamed from: OooOO0  reason: collision with other method in class */
    public static int m14605OooOO0(@NonNull View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return view.getMinimumHeight();
        }
        if (!f14053OooO0O0) {
            try {
                Field declaredField = View.class.getDeclaredField("mMinHeight");
                f14050OooO0O0 = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            f14053OooO0O0 = true;
        }
        Field field = f14050OooO0O0;
        if (field == null) {
            return 0;
        }
        try {
            return ((Integer) field.get(view)).intValue();
        } catch (Exception unused2) {
            return 0;
        }
    }

    @Deprecated
    public static float OooOO0O(View view) {
        return view.getTranslationY();
    }

    @Deprecated
    public static void OooOOO(View view, float f) {
        view.setY(f);
    }

    public static void OooOOO0(@NonNull View view, int i) {
        if (view instanceof AbstractC7098o00OOOo) {
            ((AbstractC7098o00OOOo) view).OooO00o(i);
        } else if (i == 0) {
            m14600OooO0oO(view);
        }
    }

    /* renamed from: OooOOOO  reason: collision with other method in class */
    public static boolean m14616OooOOOO(@NonNull View view) {
        if (Build.VERSION.SDK_INT >= 19) {
            return view.isLayoutDirectionResolved();
        }
        return false;
    }

    @Deprecated
    public static float OooO(View view) {
        return view.getScaleY();
    }

    @Deprecated
    public static float OooO0Oo(View view) {
        return view.getPivotY();
    }

    public static void OooO0o0(@NonNull View view, int i) {
        if (Build.VERSION.SDK_INT >= 19) {
            view.setAccessibilityLiveRegion(i);
        }
    }

    @Deprecated
    /* renamed from: OooO0oO  reason: collision with other method in class */
    public static int m14599OooO0oO(View view) {
        return view.getMeasuredHeightAndState();
    }

    @Deprecated
    public static float OooO0oo(View view) {
        return view.getScaleX();
    }

    /* renamed from: OooOO0O  reason: collision with other method in class */
    public static int m14607OooOO0O(@NonNull View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return view.getMinimumWidth();
        }
        if (!f14049OooO00o) {
            try {
                Field declaredField = View.class.getDeclaredField("mMinWidth");
                f14045OooO00o = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            f14049OooO00o = true;
        }
        Field field = f14045OooO00o;
        if (field == null) {
            return 0;
        }
        try {
            return ((Integer) field.get(view)).intValue();
        } catch (Exception unused2) {
            return 0;
        }
    }

    /* renamed from: OooOO0o  reason: collision with other method in class */
    public static boolean m14610OooOO0o(@NonNull View view) {
        if (Build.VERSION.SDK_INT >= 18) {
            return view.isInLayout();
        }
        return false;
    }

    @Deprecated
    public static float OooOOO(View view) {
        return view.getY();
    }

    public static int OooOOOo(@NonNull View view) {
        if (Build.VERSION.SDK_INT >= 23) {
            return view.getScrollIndicators();
        }
        return 0;
    }

    /* renamed from: OooO  reason: collision with other method in class */
    public static boolean m14563OooO(@NonNull View view) {
        if (Build.VERSION.SDK_INT >= 26) {
            return view.isFocusedByDefault();
        }
        return false;
    }

    @Deprecated
    public static void OooO0Oo(View view, float f) {
        view.setPivotY(f);
    }

    @Deprecated
    public static void OooO0o(View view, float f) {
        view.setRotationX(f);
    }

    @Deprecated
    public static void OooO0oO(View view, float f) {
        view.setRotationY(f);
    }

    /* renamed from: OooO0oo  reason: collision with other method in class */
    public static void m14603OooO0oo(View view) {
        float translationY = view.getTranslationY();
        view.setTranslationY(1.0f + translationY);
        view.setTranslationY(translationY);
    }

    /* renamed from: OooOOO  reason: collision with other method in class */
    public static boolean m14612OooOOO(@NonNull View view) {
        if (Build.VERSION.SDK_INT >= 19) {
            return view.isLaidOut();
        }
        return view.getWidth() > 0 && view.getHeight() > 0;
    }

    public static float OooOOOO(@NonNull View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return view.getZ();
        }
        return 0.0f;
    }

    @Deprecated
    /* renamed from: OooO00o  reason: collision with other method in class */
    public static boolean m14579OooO00o(View view, int i) {
        return view.canScrollHorizontally(i);
    }

    @Deprecated
    /* renamed from: OooO0Oo  reason: collision with other method in class */
    public static void m14590OooO0Oo(View view) {
        view.jumpDrawablesToCurrentState();
    }

    @Deprecated
    public static float OooO0o(View view) {
        return view.getRotationX();
    }

    @Deprecated
    public static void OooO0o0(View view, float f) {
        view.setRotation(f);
    }

    @Deprecated
    public static float OooO0oO(View view) {
        return view.getRotationY();
    }

    public static void OooOO0o(@NonNull View view, int i) {
        if (Build.VERSION.SDK_INT >= 23) {
            view.setScrollIndicators(i);
        }
    }

    /* renamed from: OooOOO0  reason: collision with other method in class */
    public static boolean m14614OooOOO0(@NonNull View view) {
        if (Build.VERSION.SDK_INT >= 26) {
            return view.isKeyboardNavigationCluster();
        }
        return false;
    }

    @Deprecated
    public static void OooO00o(View view, AccessibilityEvent accessibilityEvent) {
        view.onInitializeAccessibilityEvent(accessibilityEvent);
    }

    /* renamed from: OooO0Oo  reason: collision with other method in class */
    public static boolean m14592OooO0Oo(@NonNull View view, int i) {
        if (Build.VERSION.SDK_INT >= 21) {
            return view.startNestedScroll(i);
        }
        if (view instanceof AbstractC7100o00OOOoO) {
            return ((AbstractC7100o00OOOoO) view).startNestedScroll(i);
        }
        return false;
    }

    /* renamed from: OooO0o  reason: collision with other method in class */
    public static void m14594OooO0o(@NonNull View view) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 20) {
            view.requestApplyInsets();
        } else if (i >= 16) {
            view.requestFitSystemWindows();
        }
    }

    @Deprecated
    public static float OooO0o0(View view) {
        return view.getRotation();
    }

    @Deprecated
    public static void OooO0oO(View view, boolean z) {
        view.setSaveFromParentEnabled(z);
    }

    public static void OooOOOO(@NonNull View view, float f) {
        if (Build.VERSION.SDK_INT >= 21) {
            view.setZ(f);
        }
    }

    public static void OooO00o(@NonNull View view, C7120o00OoOO o00oooo) {
        view.onInitializeAccessibilityNodeInfo(o00oooo.m18404OooO00o());
    }

    /* renamed from: OooO0o0  reason: collision with other method in class */
    public static boolean m14598OooO0o0(@NonNull View view) {
        if (Build.VERSION.SDK_INT >= 15) {
            return view.hasOnClickListeners();
        }
        return false;
    }

    /* renamed from: OooO0oO  reason: collision with other method in class */
    public static void m14600OooO0oO(@NonNull View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            view.stopNestedScroll();
        } else if (view instanceof AbstractC7100o00OOOoO) {
            ((AbstractC7100o00OOOoO) view).stopNestedScroll();
        }
    }

    /* renamed from: OooO0oo  reason: collision with other method in class */
    public static boolean m14604OooO0oo(@NonNull View view) {
        if (Build.VERSION.SDK_INT >= 19) {
            return view.isAttachedToWindow();
        }
        return view.getWindowToken() != null;
    }

    /* renamed from: OooOO0o  reason: collision with other method in class */
    public static int m14609OooOO0o(@NonNull View view) {
        if (Build.VERSION.SDK_INT >= 26) {
            return view.getNextClusterForwardId();
        }
        return -1;
    }

    public static void OooO00o(@NonNull View view, C7087o00OO0o o00oo0o) {
        view.setAccessibilityDelegate(o00oo0o == null ? null : o00oo0o.getBridge());
    }

    @Deprecated
    public static float OooO0OO(View view) {
        return view.getPivotX();
    }

    public static void OooO00o(@NonNull View view, @Nullable String... strArr) {
        if (Build.VERSION.SDK_INT >= 26) {
            view.setAutofillHints(strArr);
        }
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public static int m14581OooO0O0(@NonNull View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return view.getImportantForAccessibility();
        }
        return 0;
    }

    @Deprecated
    public static void OooO0OO(View view, float f) {
        view.setPivotX(f);
    }

    /* renamed from: OooO0o  reason: collision with other method in class */
    public static boolean m14595OooO0o(@NonNull View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return view.hasOverlappingRendering();
        }
        return true;
    }

    public static void OooO0o0(@NonNull View view, boolean z) {
        if (Build.VERSION.SDK_INT >= 26) {
            view.setKeyboardNavigationCluster(z);
        }
    }

    /* renamed from: OooO0OO  reason: collision with other method in class */
    public static boolean m14588OooO0OO(@NonNull View view, int i) {
        if (view instanceof AbstractC7098o00OOOo) {
            ((AbstractC7098o00OOOo) view).m18372OooO00o(i);
            return false;
        } else if (i == 0) {
            return m14591OooO0Oo(view);
        } else {
            return false;
        }
    }

    /* renamed from: OooO0Oo  reason: collision with other method in class */
    public static boolean m14591OooO0Oo(@NonNull View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return view.hasNestedScrollingParent();
        }
        if (view instanceof AbstractC7100o00OOOoO) {
            return ((AbstractC7100o00OOOoO) view).hasNestedScrollingParent();
        }
        return false;
    }

    @Deprecated
    public static void OooOO0(View view, float f) {
        view.setTranslationX(f);
    }

    public static void OooO00o(@NonNull View view, int i, int i2, int i3, int i4) {
        if (Build.VERSION.SDK_INT >= 16) {
            view.postInvalidateOnAnimation(i, i2, i3, i4);
        } else {
            view.postInvalidate(i, i2, i3, i4);
        }
    }

    public static void OooO0O0(@NonNull View view, @AbstractC0032Px int i, @AbstractC0032Px int i2, @AbstractC0032Px int i3, @AbstractC0032Px int i4) {
        if (Build.VERSION.SDK_INT >= 17) {
            view.setPaddingRelative(i, i2, i3, i4);
        } else {
            view.setPadding(i, i2, i3, i4);
        }
    }

    public static void OooO0o(@NonNull View view, boolean z) {
        if (Build.VERSION.SDK_INT >= 21) {
            view.setNestedScrollingEnabled(z);
        } else if (view instanceof AbstractC7100o00OOOoO) {
            ((AbstractC7100o00OOOoO) view).setNestedScrollingEnabled(z);
        }
    }

    public static void OooOO0(@NonNull View view, int i) {
        if (Build.VERSION.SDK_INT >= 26) {
            view.setNextClusterForwardId(i);
        }
    }

    @Deprecated
    public static void OooOO0O(View view, float f) {
        view.setTranslationY(f);
    }

    public static void OooO0OO(@NonNull View view, int i) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 23) {
            view.offsetLeftAndRight(i);
        } else if (i2 >= 21) {
            Rect OooO00o2 = m14568OooO00o();
            boolean z = false;
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                View view2 = (View) parent;
                OooO00o2.set(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
                z = !OooO00o2.intersects(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            }
            m14577OooO00o(view, i);
            if (z && OooO00o2.intersect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom())) {
                ((View) parent).invalidate(OooO00o2);
            }
        } else {
            m14577OooO00o(view, i);
        }
    }

    public static void OooO00o(@NonNull View view, Runnable runnable) {
        if (Build.VERSION.SDK_INT >= 16) {
            view.postOnAnimation(runnable);
        } else {
            view.postDelayed(runnable, ValueAnimator.getFrameDelay());
        }
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public static void m14582OooO0O0(@NonNull View view) {
        if (Build.VERSION.SDK_INT >= 24) {
            view.dispatchFinishTemporaryDetach();
            return;
        }
        if (!f14056OooO0OO) {
            m14575OooO00o();
        }
        Method method = f14051OooO0O0;
        if (method != null) {
            try {
                method.invoke(view, new Object[0]);
            } catch (Exception unused) {
            }
        } else {
            view.onFinishTemporaryDetach();
        }
    }

    public static void OooO0Oo(@NonNull View view, int i) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 23) {
            view.offsetTopAndBottom(i);
        } else if (i2 >= 21) {
            Rect OooO00o2 = m14568OooO00o();
            boolean z = false;
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                View view2 = (View) parent;
                OooO00o2.set(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
                z = !OooO00o2.intersects(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            }
            OooO0O0(view, i);
            if (z && OooO00o2.intersect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom())) {
                ((View) parent).invalidate(OooO00o2);
            }
        } else {
            OooO0O0(view, i);
        }
    }

    public static void OooO00o(@NonNull View view, Runnable runnable, long j) {
        if (Build.VERSION.SDK_INT >= 16) {
            view.postOnAnimationDelayed(runnable, j);
        } else {
            view.postDelayed(runnable, ValueAnimator.getFrameDelay() + j);
        }
    }

    public static boolean OooO00o(@NonNull View view, int i, Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 16) {
            return view.performAccessibilityAction(i, bundle);
        }
        return false;
    }

    public static void OooO0O0(@NonNull View view, float f) {
        if (Build.VERSION.SDK_INT >= 21) {
            view.setElevation(f);
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static C7125o00OoOOO m14573OooO00o(@NonNull View view) {
        AccessibilityNodeProvider accessibilityNodeProvider;
        if (Build.VERSION.SDK_INT < 16 || (accessibilityNodeProvider = view.getAccessibilityNodeProvider()) == null) {
            return null;
        }
        return new C7125o00OoOOO(accessibilityNodeProvider);
    }

    public static float OooO0O0(@NonNull View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return view.getElevation();
        }
        return 0.0f;
    }

    @Deprecated
    public static float OooO00o(View view) {
        return view.getAlpha();
    }

    @Deprecated
    public static void OooO0O0(View view, boolean z) {
        view.setFitsSystemWindows(z);
    }

    @Deprecated
    public static void OooO00o(View view, int i, Paint paint) {
        view.setLayerType(i, paint);
    }

    public static C7119o00OoO0o OooO0O0(@NonNull View view, C7119o00OoO0o o00ooo0o) {
        if (Build.VERSION.SDK_INT < 21) {
            return o00ooo0o;
        }
        WindowInsets windowInsets = (WindowInsets) C7119o00OoO0o.OooO00o(o00ooo0o);
        WindowInsets onApplyWindowInsets = view.onApplyWindowInsets(windowInsets);
        if (onApplyWindowInsets != windowInsets) {
            windowInsets = new WindowInsets(onApplyWindowInsets);
        }
        return C7119o00OoO0o.OooO00o(windowInsets);
    }

    public static void OooO00o(@NonNull View view, Paint paint) {
        if (Build.VERSION.SDK_INT >= 17) {
            view.setLayerPaint(paint);
            return;
        }
        view.setLayerType(view.getLayerType(), paint);
        view.invalidate();
    }

    public static void OooO0OO(@NonNull View view, boolean z) {
        if (Build.VERSION.SDK_INT >= 26) {
            view.setFocusedByDefault(z);
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static ViewParent m14571OooO00o(@NonNull View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return view.getParentForAccessibility();
        }
        return view.getParent();
    }

    public static void OooO0O0(View view, int i) {
        view.offsetTopAndBottom(i);
        if (view.getVisibility() == 0) {
            m14603OooO0oo(view);
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                m14603OooO0oo((View) parent);
            }
        }
    }

    /* renamed from: OooO0OO  reason: collision with other method in class */
    public static boolean m14587OooO0OO(@NonNull View view) {
        if (Build.VERSION.SDK_INT >= 26) {
            return view.hasExplicitFocusable();
        }
        return view.hasFocusable();
    }

    @NonNull
    public static <T extends View> T OooO00o(@NonNull View view, @IdRes int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            return (T) view.requireViewById(i);
        }
        T t = (T) view.findViewById(i);
        if (t != null) {
            return t;
        }
        throw new IllegalArgumentException("ID does not reference a View inside this View");
    }

    public static void OooO0O0(@NonNull View view, @NonNull OooO0O0 oooO0O0) {
        View.OnUnhandledKeyEventListener onUnhandledKeyEventListener;
        if (Build.VERSION.SDK_INT >= 28) {
            Map map = (Map) view.getTag(C0045R.C0048id.tag_unhandled_key_listeners);
            if (map != null && (onUnhandledKeyEventListener = (View.OnUnhandledKeyEventListener) map.get(oooO0O0)) != null) {
                view.removeOnUnhandledKeyEventListener(onUnhandledKeyEventListener);
                return;
            }
            return;
        }
        ArrayList arrayList = (ArrayList) view.getTag(C0045R.C0048id.tag_unhandled_key_listeners);
        if (arrayList != null) {
            arrayList.remove(oooO0O0);
            if (arrayList.size() == 0) {
                C5040OooO0Oo.OooO0O0(view);
            }
        }
    }

    @Deprecated
    public static int OooO00o(int i, int i2, int i3) {
        return View.resolveSizeAndState(i, i2, i3);
    }

    @Deprecated
    public static int OooO00o(int i, int i2) {
        return View.combineMeasuredStates(i, i2);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static int m14564OooO00o(@NonNull View view) {
        if (Build.VERSION.SDK_INT >= 19) {
            return view.getAccessibilityLiveRegion();
        }
        return 0;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static void m14575OooO00o() {
        try {
            f14046OooO00o = View.class.getDeclaredMethod("dispatchStartTemporaryDetach", new Class[0]);
            f14051OooO0O0 = View.class.getDeclaredMethod("dispatchFinishTemporaryDetach", new Class[0]);
        } catch (NoSuchMethodException unused) {
        }
        f14056OooO0OO = true;
    }

    @Nullable
    @Deprecated
    /* renamed from: OooO00o  reason: collision with other method in class */
    public static Matrix m14566OooO00o(View view) {
        return view.getMatrix();
    }

    @NonNull
    /* renamed from: OooO00o  reason: collision with other method in class */
    public static C7115o00Oo0oo m14572OooO00o(@NonNull View view) {
        if (f14052OooO0O0 == null) {
            f14052OooO0O0 = new WeakHashMap<>();
        }
        C7115o00Oo0oo o00oo0oo = f14052OooO0O0.get(view);
        if (o00oo0oo != null) {
            return o00oo0oo;
        }
        C7115o00Oo0oo o00oo0oo2 = new C7115o00Oo0oo(view);
        f14052OooO0O0.put(view, o00oo0oo2);
        return o00oo0oo2;
    }

    @UiThread
    public static boolean OooO0O0(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        return C5040OooO0Oo.OooO00o(view).OooO00o(keyEvent);
    }

    @Deprecated
    public static void OooO00o(View view, @FloatRange(from = 0.0d, mo599to = 1.0d) float f) {
        view.setAlpha(f);
    }

    public static void OooO00o(@NonNull View view, String str) {
        if (Build.VERSION.SDK_INT >= 21) {
            view.setTransitionName(str);
            return;
        }
        if (f14047OooO00o == null) {
            f14047OooO00o = new WeakHashMap<>();
        }
        f14047OooO00o.put(view, str);
    }

    @Nullable
    /* renamed from: OooO00o  reason: collision with other method in class */
    public static String m14574OooO00o(@NonNull View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return view.getTransitionName();
        }
        WeakHashMap<View, String> weakHashMap = f14047OooO00o;
        if (weakHashMap == null) {
            return null;
        }
        return weakHashMap.get(view);
    }

    @Deprecated
    public static void OooO00o(ViewGroup viewGroup, boolean z) {
        if (f14055OooO0OO == null) {
            try {
                f14055OooO0OO = ViewGroup.class.getDeclaredMethod("setChildrenDrawingOrderEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException unused) {
            }
            f14055OooO0OO.setAccessible(true);
        }
        try {
            f14055OooO0OO.invoke(viewGroup, Boolean.valueOf(z));
        } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException unused2) {
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static boolean m14578OooO00o(@NonNull View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return view.getFitsSystemWindows();
        }
        return false;
    }

    public static void OooO00o(@NonNull View view, AbstractC7107o00Oo000 o00oo000) {
        if (Build.VERSION.SDK_INT < 21) {
            return;
        }
        if (o00oo000 == null) {
            view.setOnApplyWindowInsetsListener(null);
        } else {
            view.setOnApplyWindowInsetsListener(new OooO00o(o00oo000));
        }
    }

    public static C7119o00OoO0o OooO00o(@NonNull View view, C7119o00OoO0o o00ooo0o) {
        if (Build.VERSION.SDK_INT < 21) {
            return o00ooo0o;
        }
        WindowInsets windowInsets = (WindowInsets) C7119o00OoO0o.OooO00o(o00ooo0o);
        WindowInsets dispatchApplyWindowInsets = view.dispatchApplyWindowInsets(windowInsets);
        if (dispatchApplyWindowInsets != windowInsets) {
            windowInsets = new WindowInsets(dispatchApplyWindowInsets);
        }
        return C7119o00OoO0o.OooO00o(windowInsets);
    }

    @Deprecated
    public static void OooO00o(View view, boolean z) {
        view.setActivated(z);
    }

    public static void OooO00o(@NonNull View view, @Nullable Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 16) {
            view.setBackground(drawable);
        } else {
            view.setBackgroundDrawable(drawable);
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static ColorStateList m14565OooO00o(@NonNull View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return view.getBackgroundTintList();
        }
        if (view instanceof AbstractC7109o00Oo0O) {
            return ((AbstractC7109o00Oo0O) view).getSupportBackgroundTintList();
        }
        return null;
    }

    public static void OooO00o(@NonNull View view, ColorStateList colorStateList) {
        if (Build.VERSION.SDK_INT >= 21) {
            view.setBackgroundTintList(colorStateList);
            if (Build.VERSION.SDK_INT == 21) {
                Drawable background = view.getBackground();
                boolean z = (view.getBackgroundTintList() == null && view.getBackgroundTintMode() == null) ? false : true;
                if (background != null && z) {
                    if (background.isStateful()) {
                        background.setState(view.getDrawableState());
                    }
                    view.setBackground(background);
                }
            }
        } else if (view instanceof AbstractC7109o00Oo0O) {
            ((AbstractC7109o00Oo0O) view).setSupportBackgroundTintList(colorStateList);
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static PorterDuff.Mode m14567OooO00o(@NonNull View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return view.getBackgroundTintMode();
        }
        if (view instanceof AbstractC7109o00Oo0O) {
            return ((AbstractC7109o00Oo0O) view).getSupportBackgroundTintMode();
        }
        return null;
    }

    public static void OooO00o(@NonNull View view, PorterDuff.Mode mode) {
        if (Build.VERSION.SDK_INT >= 21) {
            view.setBackgroundTintMode(mode);
            if (Build.VERSION.SDK_INT == 21) {
                Drawable background = view.getBackground();
                boolean z = (view.getBackgroundTintList() == null && view.getBackgroundTintMode() == null) ? false : true;
                if (background != null && z) {
                    if (background.isStateful()) {
                        background.setState(view.getDrawableState());
                    }
                    view.setBackground(background);
                }
            }
        } else if (view instanceof AbstractC7109o00Oo0O) {
            ((AbstractC7109o00Oo0O) view).setSupportBackgroundTintMode(mode);
        }
    }

    public static boolean OooO00o(@NonNull View view, int i, int i2, int i3, int i4, @Nullable int[] iArr) {
        if (Build.VERSION.SDK_INT >= 21) {
            return view.dispatchNestedScroll(i, i2, i3, i4, iArr);
        }
        if (view instanceof AbstractC7100o00OOOoO) {
            return ((AbstractC7100o00OOOoO) view).dispatchNestedScroll(i, i2, i3, i4, iArr);
        }
        return false;
    }

    public static boolean OooO00o(@NonNull View view, int i, int i2, @Nullable int[] iArr, @Nullable int[] iArr2) {
        if (Build.VERSION.SDK_INT >= 21) {
            return view.dispatchNestedPreScroll(i, i2, iArr, iArr2);
        }
        if (view instanceof AbstractC7100o00OOOoO) {
            return ((AbstractC7100o00OOOoO) view).dispatchNestedPreScroll(i, i2, iArr, iArr2);
        }
        return false;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static boolean m14580OooO00o(@NonNull View view, int i, int i2) {
        if (view instanceof AbstractC7098o00OOOo) {
            return ((AbstractC7098o00OOOo) view).OooO00o(i, i2);
        }
        if (i2 == 0) {
            return m14592OooO0Oo(view, i);
        }
        return false;
    }

    public static boolean OooO00o(@NonNull View view, int i, int i2, int i3, int i4, @Nullable int[] iArr, int i5) {
        if (view instanceof AbstractC7098o00OOOo) {
            return ((AbstractC7098o00OOOo) view).OooO00o(i, i2, i3, i4, iArr, i5);
        }
        if (i5 == 0) {
            return OooO00o(view, i, i2, i3, i4, iArr);
        }
        return false;
    }

    public static boolean OooO00o(@NonNull View view, int i, int i2, @Nullable int[] iArr, @Nullable int[] iArr2, int i3) {
        if (view instanceof AbstractC7098o00OOOo) {
            return ((AbstractC7098o00OOOo) view).OooO00o(i, i2, iArr, iArr2, i3);
        }
        if (i3 == 0) {
            return OooO00o(view, i, i2, iArr, iArr2);
        }
        return false;
    }

    public static boolean OooO00o(@NonNull View view, float f, float f2, boolean z) {
        if (Build.VERSION.SDK_INT >= 21) {
            return view.dispatchNestedFling(f, f2, z);
        }
        if (view instanceof AbstractC7100o00OOOoO) {
            return ((AbstractC7100o00OOOoO) view).dispatchNestedFling(f, f2, z);
        }
        return false;
    }

    public static boolean OooO00o(@NonNull View view, float f, float f2) {
        if (Build.VERSION.SDK_INT >= 21) {
            return view.dispatchNestedPreFling(f, f2);
        }
        if (view instanceof AbstractC7100o00OOOoO) {
            return ((AbstractC7100o00OOOoO) view).dispatchNestedPreFling(f, f2);
        }
        return false;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static void m14577OooO00o(View view, int i) {
        view.offsetLeftAndRight(i);
        if (view.getVisibility() == 0) {
            m14603OooO0oo(view);
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                m14603OooO0oo((View) parent);
            }
        }
    }

    public static void OooO00o(@NonNull View view, Rect rect) {
        if (Build.VERSION.SDK_INT >= 18) {
            view.setClipBounds(rect);
        }
    }

    @Nullable
    /* renamed from: OooO00o  reason: collision with other method in class */
    public static Rect m14569OooO00o(@NonNull View view) {
        if (Build.VERSION.SDK_INT >= 18) {
            return view.getClipBounds();
        }
        return null;
    }

    public static void OooO00o(@NonNull View view, int i, int i2) {
        if (Build.VERSION.SDK_INT >= 23) {
            view.setScrollIndicators(i, i2);
        }
    }

    public static void OooO00o(@NonNull View view, C7106o00Oo00 o00oo00) {
        if (Build.VERSION.SDK_INT >= 24) {
            view.setPointerIcon((PointerIcon) (o00oo00 != null ? o00oo00.OooO00o() : null));
        }
    }

    @Nullable
    /* renamed from: OooO00o  reason: collision with other method in class */
    public static Display m14570OooO00o(@NonNull View view) {
        if (Build.VERSION.SDK_INT >= 17) {
            return view.getDisplay();
        }
        if (m14604OooO0oo(view)) {
            return ((WindowManager) view.getContext().getSystemService("window")).getDefaultDisplay();
        }
        return null;
    }

    public static void OooO00o(@NonNull View view, @Nullable CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            view.setTooltipText(charSequence);
        }
    }

    public static boolean OooO00o(@NonNull View view, ClipData clipData, View.DragShadowBuilder dragShadowBuilder, Object obj, int i) {
        if (Build.VERSION.SDK_INT >= 24) {
            return view.startDragAndDrop(clipData, dragShadowBuilder, obj, i);
        }
        return view.startDrag(clipData, dragShadowBuilder, obj, i);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static void m14576OooO00o(@NonNull View view) {
        if (Build.VERSION.SDK_INT >= 24) {
            view.cancelDragAndDrop();
        }
    }

    public static void OooO00o(@NonNull View view, View.DragShadowBuilder dragShadowBuilder) {
        if (Build.VERSION.SDK_INT >= 24) {
            view.updateDragShadow(dragShadowBuilder);
        }
    }

    public static View OooO00o(@NonNull View view, View view2, int i) {
        if (Build.VERSION.SDK_INT >= 26) {
            return view.keyboardNavigationClusterSearch(view2, i);
        }
        return null;
    }

    public static void OooO00o(@NonNull View view, @NonNull Collection<View> collection, int i) {
        if (Build.VERSION.SDK_INT >= 26) {
            view.addKeyboardNavigationClusters(collection, i);
        }
    }

    public static int OooO00o() {
        int i;
        int i2;
        if (Build.VERSION.SDK_INT >= 17) {
            return View.generateViewId();
        }
        do {
            i = f14048OooO00o.get();
            i2 = i + 1;
            if (i2 > 16777215) {
                i2 = 1;
            }
        } while (!f14048OooO00o.compareAndSet(i, i2));
        return i;
    }

    public static void OooO00o(@NonNull View view, @NonNull OooO0O0 oooO0O0) {
        if (Build.VERSION.SDK_INT >= 28) {
            Map map = (Map) view.getTag(C0045R.C0048id.tag_unhandled_key_listeners);
            if (map == null) {
                map = new C6971o0000oO0();
                view.setTag(C0045R.C0048id.tag_unhandled_key_listeners, map);
            }
            OooO0OO oooO0OO = new OooO0OO(oooO0O0);
            map.put(oooO0O0, oooO0OO);
            view.addOnUnhandledKeyEventListener(oooO0OO);
            return;
        }
        ArrayList arrayList = (ArrayList) view.getTag(C0045R.C0048id.tag_unhandled_key_listeners);
        if (arrayList == null) {
            arrayList = new ArrayList();
            view.setTag(C0045R.C0048id.tag_unhandled_key_listeners, arrayList);
        }
        arrayList.add(oooO0O0);
        if (arrayList.size() == 1) {
            C5040OooO0Oo.m14620OooO00o(view);
        }
    }

    @UiThread
    public static boolean OooO00o(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        return C5040OooO0Oo.OooO00o(view).m14621OooO00o(view, keyEvent);
    }
}

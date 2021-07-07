package com.p118pd.sdk;

import android.graphics.Rect;
import android.os.Build;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.ViewCompat;
import androidx.fragment.app.Fragment;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/* renamed from: com.pd.sdk.o00o0oo0  reason: case insensitive filesystem */
public class C7182o00o0oo0 {
    public static final AbstractC7185o00o0ooo OooO00o = (Build.VERSION.SDK_INT >= 21 ? new C7180o00o0oo() : null);

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final int[] f19631OooO00o = {0, 3, 0, 1, 5, 4, 7, 6, 9, 8};
    public static final AbstractC7185o00o0ooo OooO0O0 = OooO00o();

    /* renamed from: com.pd.sdk.o00o0oo0$OooO00o */
    public static class OooO00o implements Runnable {
        public final /* synthetic */ ArrayList OooO00o;

        public OooO00o(ArrayList arrayList) {
            this.OooO00o = arrayList;
        }

        public void run() {
            C7182o00o0oo0.OooO00o(this.OooO00o, 4);
        }
    }

    /* renamed from: com.pd.sdk.o00o0oo0$OooO0O0 */
    public static class OooO0O0 implements Runnable {
        public final /* synthetic */ View OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ Fragment f19632OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ AbstractC7185o00o0ooo f19633OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ Object f19634OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ ArrayList f19635OooO00o;
        public final /* synthetic */ Object OooO0O0;

        /* renamed from: OooO0O0  reason: collision with other field name */
        public final /* synthetic */ ArrayList f19636OooO0O0;
        public final /* synthetic */ ArrayList OooO0OO;

        public OooO0O0(Object obj, AbstractC7185o00o0ooo o00o0ooo, View view, Fragment fragment, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, Object obj2) {
            this.f19634OooO00o = obj;
            this.f19633OooO00o = o00o0ooo;
            this.OooO00o = view;
            this.f19632OooO00o = fragment;
            this.f19635OooO00o = arrayList;
            this.f19636OooO0O0 = arrayList2;
            this.OooO0OO = arrayList3;
            this.OooO0O0 = obj2;
        }

        public void run() {
            Object obj = this.f19634OooO00o;
            if (obj != null) {
                this.f19633OooO00o.OooO0O0(obj, this.OooO00o);
                this.f19636OooO0O0.addAll(C7182o00o0oo0.OooO00o(this.f19633OooO00o, this.f19634OooO00o, this.f19632OooO00o, this.f19635OooO00o, this.OooO00o));
            }
            if (this.OooO0OO != null) {
                if (this.OooO0O0 != null) {
                    ArrayList<View> arrayList = new ArrayList<>();
                    arrayList.add(this.OooO00o);
                    this.f19633OooO00o.OooO00o(this.OooO0O0, this.OooO0OO, arrayList);
                }
                this.OooO0OO.clear();
                this.OooO0OO.add(this.OooO00o);
            }
        }
    }

    /* renamed from: com.pd.sdk.o00o0oo0$OooO0OO */
    public static class OooO0OO implements Runnable {
        public final /* synthetic */ Rect OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ View f19637OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ Fragment f19638OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ C6971o0000oO0 f19639OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ AbstractC7185o00o0ooo f19640OooO00o;
        public final /* synthetic */ Fragment OooO0O0;

        /* renamed from: OooO0O0  reason: collision with other field name */
        public final /* synthetic */ boolean f19641OooO0O0;

        public OooO0OO(Fragment fragment, Fragment fragment2, boolean z, C6971o0000oO0 o0000oo0, View view, AbstractC7185o00o0ooo o00o0ooo, Rect rect) {
            this.f19638OooO00o = fragment;
            this.OooO0O0 = fragment2;
            this.f19641OooO0O0 = z;
            this.f19639OooO00o = o0000oo0;
            this.f19637OooO00o = view;
            this.f19640OooO00o = o00o0ooo;
            this.OooO00o = rect;
        }

        public void run() {
            C7182o00o0oo0.OooO00o(this.f19638OooO00o, this.OooO0O0, this.f19641OooO0O0, (C6971o0000oO0<String, View>) this.f19639OooO00o, false);
            View view = this.f19637OooO00o;
            if (view != null) {
                this.f19640OooO00o.OooO00o(view, this.OooO00o);
            }
        }
    }

    /* renamed from: com.pd.sdk.o00o0oo0$OooO0Oo  reason: case insensitive filesystem */
    public static class RunnableC7183OooO0Oo implements Runnable {
        public final /* synthetic */ Rect OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ View f19642OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ Fragment f19643OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ C6971o0000oO0 f19644OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ C7184OooO0o0 f19645OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ AbstractC7185o00o0ooo f19646OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ Object f19647OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ ArrayList f19648OooO00o;
        public final /* synthetic */ Fragment OooO0O0;

        /* renamed from: OooO0O0  reason: collision with other field name */
        public final /* synthetic */ Object f19649OooO0O0;

        /* renamed from: OooO0O0  reason: collision with other field name */
        public final /* synthetic */ ArrayList f19650OooO0O0;

        /* renamed from: OooO0O0  reason: collision with other field name */
        public final /* synthetic */ boolean f19651OooO0O0;

        public RunnableC7183OooO0Oo(AbstractC7185o00o0ooo o00o0ooo, C6971o0000oO0 o0000oo0, Object obj, C7184OooO0o0 oooO0o0, ArrayList arrayList, View view, Fragment fragment, Fragment fragment2, boolean z, ArrayList arrayList2, Object obj2, Rect rect) {
            this.f19646OooO00o = o00o0ooo;
            this.f19644OooO00o = o0000oo0;
            this.f19647OooO00o = obj;
            this.f19645OooO00o = oooO0o0;
            this.f19648OooO00o = arrayList;
            this.f19642OooO00o = view;
            this.f19643OooO00o = fragment;
            this.OooO0O0 = fragment2;
            this.f19651OooO0O0 = z;
            this.f19650OooO0O0 = arrayList2;
            this.f19649OooO0O0 = obj2;
            this.OooO00o = rect;
        }

        public void run() {
            C6971o0000oO0<String, View> OooO00o2 = C7182o00o0oo0.OooO00o(this.f19646OooO00o, this.f19644OooO00o, this.f19647OooO00o, this.f19645OooO00o);
            if (OooO00o2 != null) {
                this.f19648OooO00o.addAll(OooO00o2.values());
                this.f19648OooO00o.add(this.f19642OooO00o);
            }
            C7182o00o0oo0.OooO00o(this.f19643OooO00o, this.OooO0O0, this.f19651OooO0O0, OooO00o2, false);
            Object obj = this.f19647OooO00o;
            if (obj != null) {
                this.f19646OooO00o.OooO0O0(obj, this.f19650OooO0O0, this.f19648OooO00o);
                View OooO00o3 = C7182o00o0oo0.OooO00o(OooO00o2, this.f19645OooO00o, this.f19649OooO0O0, this.f19651OooO0O0);
                if (OooO00o3 != null) {
                    this.f19646OooO00o.OooO00o(OooO00o3, this.OooO00o);
                }
            }
        }
    }

    /* renamed from: com.pd.sdk.o00o0oo0$OooO0o0  reason: case insensitive filesystem */
    public static class C7184OooO0o0 {
        public Fragment OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public C7163o00o0Oo f19652OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public boolean f19653OooO00o;
        public Fragment OooO0O0;

        /* renamed from: OooO0O0  reason: collision with other field name */
        public C7163o00o0Oo f19654OooO0O0;

        /* renamed from: OooO0O0  reason: collision with other field name */
        public boolean f19655OooO0O0;
    }

    public static AbstractC7185o00o0ooo OooO00o() {
        try {
            return (AbstractC7185o00o0ooo) Class.forName("androidx.transition.FragmentTransitionSupport").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }

    public static void OooO0O0(LayoutInflater$Factory2C7167o00o0o o00o0o, int i, C7184OooO0o0 oooO0o0, View view, C6971o0000oO0<String, String> o0000oo0) {
        Fragment fragment;
        Fragment fragment2;
        AbstractC7185o00o0ooo OooO00o2;
        Object obj;
        ViewGroup viewGroup = o00o0o.f19579OooO00o.OooO00o() ? (ViewGroup) o00o0o.f19579OooO00o.OooO00o(i) : null;
        if (viewGroup != null && (OooO00o2 = OooO00o((fragment2 = oooO0o0.OooO0O0), (fragment = oooO0o0.OooO00o))) != null) {
            boolean z = oooO0o0.f19653OooO00o;
            boolean z2 = oooO0o0.f19655OooO0O0;
            ArrayList<View> arrayList = new ArrayList<>();
            ArrayList<View> arrayList2 = new ArrayList<>();
            Object OooO00o3 = OooO00o(OooO00o2, fragment, z);
            Object OooO0O02 = OooO0O0(OooO00o2, fragment2, z2);
            Object OooO0O03 = OooO0O0(OooO00o2, viewGroup, view, o0000oo0, oooO0o0, arrayList2, arrayList, OooO00o3, OooO0O02);
            if (OooO00o3 == null && OooO0O03 == null) {
                obj = OooO0O02;
                if (obj == null) {
                    return;
                }
            } else {
                obj = OooO0O02;
            }
            ArrayList<View> OooO00o4 = OooO00o(OooO00o2, obj, fragment2, arrayList2, view);
            ArrayList<View> OooO00o5 = OooO00o(OooO00o2, OooO00o3, fragment, arrayList, view);
            OooO00o(OooO00o5, 4);
            Object OooO00o6 = OooO00o(OooO00o2, OooO00o3, obj, OooO0O03, fragment, z);
            if (OooO00o6 != null) {
                OooO00o(OooO00o2, obj, fragment2, OooO00o4);
                ArrayList<String> OooO00o7 = OooO00o2.OooO00o(arrayList);
                OooO00o2.OooO00o(OooO00o6, OooO00o3, OooO00o5, obj, OooO00o4, OooO0O03, arrayList);
                OooO00o2.OooO00o(viewGroup, OooO00o6);
                OooO00o2.OooO00o(viewGroup, arrayList2, arrayList, OooO00o7, o0000oo0);
                OooO00o(OooO00o5, 0);
                OooO00o2.OooO0O0(OooO0O03, arrayList2, arrayList);
            }
        }
    }

    public static void OooO00o(LayoutInflater$Factory2C7167o00o0o o00o0o, ArrayList<C7163o00o0Oo> arrayList, ArrayList<Boolean> arrayList2, int i, int i2, boolean z) {
        if (o00o0o.o0ooOOo >= 1) {
            SparseArray sparseArray = new SparseArray();
            for (int i3 = i; i3 < i2; i3++) {
                C7163o00o0Oo o00o0oo = arrayList.get(i3);
                if (arrayList2.get(i3).booleanValue()) {
                    OooO0O0(o00o0oo, sparseArray, z);
                } else {
                    OooO00o(o00o0oo, sparseArray, z);
                }
            }
            if (sparseArray.size() != 0) {
                View view = new View(o00o0o.f19580OooO00o.m18653OooO00o());
                int size = sparseArray.size();
                for (int i4 = 0; i4 < size; i4++) {
                    int keyAt = sparseArray.keyAt(i4);
                    C6971o0000oO0<String, String> OooO00o2 = OooO00o(keyAt, arrayList, arrayList2, i, i2);
                    C7184OooO0o0 oooO0o0 = (C7184OooO0o0) sparseArray.valueAt(i4);
                    if (z) {
                        OooO0O0(o00o0o, keyAt, oooO0o0, view, OooO00o2);
                    } else {
                        OooO00o(o00o0o, keyAt, oooO0o0, view, OooO00o2);
                    }
                }
            }
        }
    }

    public static C6971o0000oO0<String, String> OooO00o(int i, ArrayList<C7163o00o0Oo> arrayList, ArrayList<Boolean> arrayList2, int i2, int i3) {
        ArrayList<String> arrayList3;
        ArrayList<String> arrayList4;
        C6971o0000oO0<String, String> o0000oo0 = new C6971o0000oO0<>();
        for (int i4 = i3 - 1; i4 >= i2; i4--) {
            C7163o00o0Oo o00o0oo = arrayList.get(i4);
            if (o00o0oo.m18607OooO00o(i)) {
                boolean booleanValue = arrayList2.get(i4).booleanValue();
                ArrayList<String> arrayList5 = o00o0oo.f19565OooO0O0;
                if (arrayList5 != null) {
                    int size = arrayList5.size();
                    if (booleanValue) {
                        arrayList3 = o00o0oo.f19565OooO0O0;
                        arrayList4 = o00o0oo.OooO0OO;
                    } else {
                        ArrayList<String> arrayList6 = o00o0oo.f19565OooO0O0;
                        arrayList3 = o00o0oo.OooO0OO;
                        arrayList4 = arrayList6;
                    }
                    for (int i5 = 0; i5 < size; i5++) {
                        String str = arrayList4.get(i5);
                        String str2 = arrayList3.get(i5);
                        String remove = o0000oo0.remove(str2);
                        if (remove != null) {
                            o0000oo0.put(str, remove);
                        } else {
                            o0000oo0.put(str, str2);
                        }
                    }
                }
            }
        }
        return o0000oo0;
    }

    public static Object OooO0O0(AbstractC7185o00o0ooo o00o0ooo, Fragment fragment, boolean z) {
        Object obj;
        if (fragment == null) {
            return null;
        }
        if (z) {
            obj = fragment.getReturnTransition();
        } else {
            obj = fragment.getExitTransition();
        }
        return o00o0ooo.OooO00o(obj);
    }

    public static Object OooO0O0(AbstractC7185o00o0ooo o00o0ooo, ViewGroup viewGroup, View view, C6971o0000oO0<String, String> o0000oo0, C7184OooO0o0 oooO0o0, ArrayList<View> arrayList, ArrayList<View> arrayList2, Object obj, Object obj2) {
        Object obj3;
        Object obj4;
        Rect rect;
        View view2;
        Fragment fragment = oooO0o0.OooO00o;
        Fragment fragment2 = oooO0o0.OooO0O0;
        if (fragment != null) {
            fragment.getView().setVisibility(0);
        }
        if (fragment == null || fragment2 == null) {
            return null;
        }
        boolean z = oooO0o0.f19653OooO00o;
        if (o0000oo0.isEmpty()) {
            obj3 = null;
        } else {
            obj3 = OooO00o(o00o0ooo, fragment, fragment2, z);
        }
        C6971o0000oO0<String, View> OooO0O02 = OooO0O0(o00o0ooo, o0000oo0, obj3, oooO0o0);
        C6971o0000oO0<String, View> OooO00o2 = OooO00o(o00o0ooo, o0000oo0, obj3, oooO0o0);
        if (o0000oo0.isEmpty()) {
            if (OooO0O02 != null) {
                OooO0O02.clear();
            }
            if (OooO00o2 != null) {
                OooO00o2.clear();
            }
            obj4 = null;
        } else {
            OooO00o(arrayList, OooO0O02, o0000oo0.keySet());
            OooO00o(arrayList2, OooO00o2, o0000oo0.values());
            obj4 = obj3;
        }
        if (obj == null && obj2 == null && obj4 == null) {
            return null;
        }
        OooO00o(fragment, fragment2, z, OooO0O02, true);
        if (obj4 != null) {
            arrayList2.add(view);
            o00o0ooo.OooO0O0(obj4, view, arrayList);
            OooO00o(o00o0ooo, obj4, obj2, OooO0O02, oooO0o0.f19655OooO0O0, oooO0o0.f19654OooO0O0);
            Rect rect2 = new Rect();
            View OooO00o3 = OooO00o(OooO00o2, oooO0o0, obj, z);
            if (OooO00o3 != null) {
                o00o0ooo.OooO00o(obj, rect2);
            }
            rect = rect2;
            view2 = OooO00o3;
        } else {
            view2 = null;
            rect = null;
        }
        ViewTreeObserver$OnPreDrawListenerC7215o00oo000.OooO00o(viewGroup, new OooO0OO(fragment, fragment2, z, OooO00o2, view2, o00o0ooo, rect));
        return obj4;
    }

    public static void OooO00o(AbstractC7185o00o0ooo o00o0ooo, Object obj, Fragment fragment, ArrayList<View> arrayList) {
        if (fragment != null && obj != null && fragment.mAdded && fragment.mHidden && fragment.mHiddenChanged) {
            fragment.setHideReplaced(true);
            o00o0ooo.OooO00o(obj, fragment.getView(), arrayList);
            ViewTreeObserver$OnPreDrawListenerC7215o00oo000.OooO00o(fragment.mContainer, new OooO00o(arrayList));
        }
    }

    public static void OooO00o(LayoutInflater$Factory2C7167o00o0o o00o0o, int i, C7184OooO0o0 oooO0o0, View view, C6971o0000oO0<String, String> o0000oo0) {
        Fragment fragment;
        Fragment fragment2;
        AbstractC7185o00o0ooo OooO00o2;
        Object obj;
        ViewGroup viewGroup = o00o0o.f19579OooO00o.OooO00o() ? (ViewGroup) o00o0o.f19579OooO00o.OooO00o(i) : null;
        if (viewGroup != null && (OooO00o2 = OooO00o((fragment2 = oooO0o0.OooO0O0), (fragment = oooO0o0.OooO00o))) != null) {
            boolean z = oooO0o0.f19653OooO00o;
            boolean z2 = oooO0o0.f19655OooO0O0;
            Object OooO00o3 = OooO00o(OooO00o2, fragment, z);
            Object OooO0O02 = OooO0O0(OooO00o2, fragment2, z2);
            ArrayList arrayList = new ArrayList();
            ArrayList<View> arrayList2 = new ArrayList<>();
            Object OooO00o4 = OooO00o(OooO00o2, viewGroup, view, o0000oo0, oooO0o0, arrayList, arrayList2, OooO00o3, OooO0O02);
            if (OooO00o3 == null && OooO00o4 == null) {
                obj = OooO0O02;
                if (obj == null) {
                    return;
                }
            } else {
                obj = OooO0O02;
            }
            ArrayList<View> OooO00o5 = OooO00o(OooO00o2, obj, fragment2, arrayList, view);
            Object obj2 = (OooO00o5 == null || OooO00o5.isEmpty()) ? null : obj;
            OooO00o2.OooO00o(OooO00o3, view);
            Object OooO00o6 = OooO00o(OooO00o2, OooO00o3, obj2, OooO00o4, fragment, oooO0o0.f19653OooO00o);
            if (OooO00o6 != null) {
                ArrayList<View> arrayList3 = new ArrayList<>();
                OooO00o2.OooO00o(OooO00o6, OooO00o3, arrayList3, obj2, OooO00o5, OooO00o4, arrayList2);
                OooO00o(OooO00o2, viewGroup, fragment, view, arrayList2, OooO00o3, arrayList3, obj2, OooO00o5);
                OooO00o2.OooO00o((View) viewGroup, arrayList2, (Map<String, String>) o0000oo0);
                OooO00o2.OooO00o(viewGroup, OooO00o6);
                OooO00o2.OooO00o(viewGroup, arrayList2, (Map<String, String>) o0000oo0);
            }
        }
    }

    public static C6971o0000oO0<String, View> OooO0O0(AbstractC7185o00o0ooo o00o0ooo, C6971o0000oO0<String, String> o0000oo0, Object obj, C7184OooO0o0 oooO0o0) {
        AbstractC7004o000Oo0o o000oo0o;
        ArrayList<String> arrayList;
        if (o0000oo0.isEmpty() || obj == null) {
            o0000oo0.clear();
            return null;
        }
        Fragment fragment = oooO0o0.OooO0O0;
        C6971o0000oO0<String, View> o0000oo02 = new C6971o0000oO0<>();
        o00o0ooo.OooO00o((Map<String, View>) o0000oo02, fragment.getView());
        C7163o00o0Oo o00o0oo = oooO0o0.f19654OooO0O0;
        if (oooO0o0.f19655OooO0O0) {
            o000oo0o = fragment.getEnterTransitionCallback();
            arrayList = o00o0oo.OooO0OO;
        } else {
            o000oo0o = fragment.getExitTransitionCallback();
            arrayList = o00o0oo.f19565OooO0O0;
        }
        o0000oo02.OooO0OO(arrayList);
        if (o000oo0o != null) {
            o000oo0o.OooO00o(arrayList, o0000oo02);
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                String str = arrayList.get(size);
                View view = o0000oo02.get(str);
                if (view == null) {
                    o0000oo0.remove(str);
                } else if (!str.equals(ViewCompat.m14574OooO00o(view))) {
                    o0000oo0.put(ViewCompat.m14574OooO00o(view), o0000oo0.remove(str));
                }
            }
        } else {
            o0000oo0.OooO0OO(o0000oo02.keySet());
        }
        return o0000oo02;
    }

    public static void OooO00o(AbstractC7185o00o0ooo o00o0ooo, ViewGroup viewGroup, Fragment fragment, View view, ArrayList<View> arrayList, Object obj, ArrayList<View> arrayList2, Object obj2, ArrayList<View> arrayList3) {
        ViewTreeObserver$OnPreDrawListenerC7215o00oo000.OooO00o(viewGroup, new OooO0O0(obj, o00o0ooo, view, fragment, arrayList, arrayList2, arrayList3, obj2));
    }

    public static AbstractC7185o00o0ooo OooO00o(Fragment fragment, Fragment fragment2) {
        ArrayList arrayList = new ArrayList();
        if (fragment != null) {
            Object exitTransition = fragment.getExitTransition();
            if (exitTransition != null) {
                arrayList.add(exitTransition);
            }
            Object returnTransition = fragment.getReturnTransition();
            if (returnTransition != null) {
                arrayList.add(returnTransition);
            }
            Object sharedElementReturnTransition = fragment.getSharedElementReturnTransition();
            if (sharedElementReturnTransition != null) {
                arrayList.add(sharedElementReturnTransition);
            }
        }
        if (fragment2 != null) {
            Object enterTransition = fragment2.getEnterTransition();
            if (enterTransition != null) {
                arrayList.add(enterTransition);
            }
            Object reenterTransition = fragment2.getReenterTransition();
            if (reenterTransition != null) {
                arrayList.add(reenterTransition);
            }
            Object sharedElementEnterTransition = fragment2.getSharedElementEnterTransition();
            if (sharedElementEnterTransition != null) {
                arrayList.add(sharedElementEnterTransition);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        AbstractC7185o00o0ooo o00o0ooo = OooO00o;
        if (o00o0ooo != null && OooO00o(o00o0ooo, arrayList)) {
            return OooO00o;
        }
        AbstractC7185o00o0ooo o00o0ooo2 = OooO0O0;
        if (o00o0ooo2 != null && OooO00o(o00o0ooo2, arrayList)) {
            return OooO0O0;
        }
        if (OooO00o == null && OooO0O0 == null) {
            return null;
        }
        throw new IllegalArgumentException("Invalid Transition types");
    }

    public static void OooO0O0(C7163o00o0Oo o00o0oo, SparseArray<C7184OooO0o0> sparseArray, boolean z) {
        if (o00o0oo.OooO00o.f19579OooO00o.OooO00o()) {
            for (int size = o00o0oo.f19562OooO00o.size() - 1; size >= 0; size--) {
                OooO00o(o00o0oo, o00o0oo.f19562OooO00o.get(size), sparseArray, true, z);
            }
        }
    }

    public static boolean OooO00o(AbstractC7185o00o0ooo o00o0ooo, List<Object> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (!o00o0ooo.m18677OooO00o(list.get(i))) {
                return false;
            }
        }
        return true;
    }

    public static Object OooO00o(AbstractC7185o00o0ooo o00o0ooo, Fragment fragment, Fragment fragment2, boolean z) {
        Object obj;
        if (fragment == null || fragment2 == null) {
            return null;
        }
        if (z) {
            obj = fragment2.getSharedElementReturnTransition();
        } else {
            obj = fragment.getSharedElementEnterTransition();
        }
        return o00o0ooo.OooO0O0(o00o0ooo.OooO00o(obj));
    }

    public static Object OooO00o(AbstractC7185o00o0ooo o00o0ooo, Fragment fragment, boolean z) {
        Object obj;
        if (fragment == null) {
            return null;
        }
        if (z) {
            obj = fragment.getReenterTransition();
        } else {
            obj = fragment.getEnterTransition();
        }
        return o00o0ooo.OooO00o(obj);
    }

    public static void OooO00o(ArrayList<View> arrayList, C6971o0000oO0<String, View> o0000oo0, Collection<String> collection) {
        for (int size = o0000oo0.size() - 1; size >= 0; size--) {
            View OooO0OO2 = o0000oo0.OooO0OO(size);
            if (collection.contains(ViewCompat.m14574OooO00o(OooO0OO2))) {
                arrayList.add(OooO0OO2);
            }
        }
    }

    public static Object OooO00o(AbstractC7185o00o0ooo o00o0ooo, ViewGroup viewGroup, View view, C6971o0000oO0<String, String> o0000oo0, C7184OooO0o0 oooO0o0, ArrayList<View> arrayList, ArrayList<View> arrayList2, Object obj, Object obj2) {
        C6971o0000oO0<String, String> o0000oo02;
        Object obj3;
        Object obj4;
        Rect rect;
        Fragment fragment = oooO0o0.OooO00o;
        Fragment fragment2 = oooO0o0.OooO0O0;
        if (fragment == null || fragment2 == null) {
            return null;
        }
        boolean z = oooO0o0.f19653OooO00o;
        if (o0000oo0.isEmpty()) {
            o0000oo02 = o0000oo0;
            obj3 = null;
        } else {
            obj3 = OooO00o(o00o0ooo, fragment, fragment2, z);
            o0000oo02 = o0000oo0;
        }
        C6971o0000oO0<String, View> OooO0O02 = OooO0O0(o00o0ooo, o0000oo02, obj3, oooO0o0);
        if (o0000oo0.isEmpty()) {
            obj4 = null;
        } else {
            arrayList.addAll(OooO0O02.values());
            obj4 = obj3;
        }
        if (obj == null && obj2 == null && obj4 == null) {
            return null;
        }
        OooO00o(fragment, fragment2, z, OooO0O02, true);
        if (obj4 != null) {
            rect = new Rect();
            o00o0ooo.OooO0O0(obj4, view, arrayList);
            OooO00o(o00o0ooo, obj4, obj2, OooO0O02, oooO0o0.f19655OooO0O0, oooO0o0.f19654OooO0O0);
            if (obj != null) {
                o00o0ooo.OooO00o(obj, rect);
            }
        } else {
            rect = null;
        }
        ViewTreeObserver$OnPreDrawListenerC7215o00oo000.OooO00o(viewGroup, new RunnableC7183OooO0Oo(o00o0ooo, o0000oo0, obj4, oooO0o0, arrayList2, view, fragment, fragment2, z, arrayList, obj, rect));
        return obj4;
    }

    public static C6971o0000oO0<String, View> OooO00o(AbstractC7185o00o0ooo o00o0ooo, C6971o0000oO0<String, String> o0000oo0, Object obj, C7184OooO0o0 oooO0o0) {
        AbstractC7004o000Oo0o o000oo0o;
        ArrayList<String> arrayList;
        String OooO00o2;
        Fragment fragment = oooO0o0.OooO00o;
        View view = fragment.getView();
        if (o0000oo0.isEmpty() || obj == null || view == null) {
            o0000oo0.clear();
            return null;
        }
        C6971o0000oO0<String, View> o0000oo02 = new C6971o0000oO0<>();
        o00o0ooo.OooO00o((Map<String, View>) o0000oo02, view);
        C7163o00o0Oo o00o0oo = oooO0o0.f19652OooO00o;
        if (oooO0o0.f19653OooO00o) {
            o000oo0o = fragment.getExitTransitionCallback();
            arrayList = o00o0oo.f19565OooO0O0;
        } else {
            o000oo0o = fragment.getEnterTransitionCallback();
            arrayList = o00o0oo.OooO0OO;
        }
        if (arrayList != null) {
            o0000oo02.OooO0OO(arrayList);
            o0000oo02.OooO0OO(o0000oo0.values());
        }
        if (o000oo0o != null) {
            o000oo0o.OooO00o(arrayList, o0000oo02);
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                String str = arrayList.get(size);
                View view2 = o0000oo02.get(str);
                if (view2 == null) {
                    String OooO00o3 = OooO00o(o0000oo0, str);
                    if (OooO00o3 != null) {
                        o0000oo0.remove(OooO00o3);
                    }
                } else if (!str.equals(ViewCompat.m14574OooO00o(view2)) && (OooO00o2 = OooO00o(o0000oo0, str)) != null) {
                    o0000oo0.put(OooO00o2, ViewCompat.m14574OooO00o(view2));
                }
            }
        } else {
            OooO00o(o0000oo0, o0000oo02);
        }
        return o0000oo02;
    }

    public static String OooO00o(C6971o0000oO0<String, String> o0000oo0, String str) {
        int size = o0000oo0.size();
        for (int i = 0; i < size; i++) {
            if (str.equals(o0000oo0.OooO0OO(i))) {
                return o0000oo0.OooO00o(i);
            }
        }
        return null;
    }

    public static View OooO00o(C6971o0000oO0<String, View> o0000oo0, C7184OooO0o0 oooO0o0, Object obj, boolean z) {
        ArrayList<String> arrayList;
        String str;
        C7163o00o0Oo o00o0oo = oooO0o0.f19652OooO00o;
        if (obj == null || o0000oo0 == null || (arrayList = o00o0oo.f19565OooO0O0) == null || arrayList.isEmpty()) {
            return null;
        }
        if (z) {
            str = o00o0oo.f19565OooO0O0.get(0);
        } else {
            str = o00o0oo.OooO0OO.get(0);
        }
        return o0000oo0.get(str);
    }

    public static void OooO00o(AbstractC7185o00o0ooo o00o0ooo, Object obj, Object obj2, C6971o0000oO0<String, View> o0000oo0, boolean z, C7163o00o0Oo o00o0oo) {
        String str;
        ArrayList<String> arrayList = o00o0oo.f19565OooO0O0;
        if (arrayList != null && !arrayList.isEmpty()) {
            if (z) {
                str = o00o0oo.OooO0OO.get(0);
            } else {
                str = o00o0oo.f19565OooO0O0.get(0);
            }
            View view = o0000oo0.get(str);
            o00o0ooo.OooO0OO(obj, view);
            if (obj2 != null) {
                o00o0ooo.OooO0OO(obj2, view);
            }
        }
    }

    public static void OooO00o(C6971o0000oO0<String, String> o0000oo0, C6971o0000oO0<String, View> o0000oo02) {
        for (int size = o0000oo0.size() - 1; size >= 0; size--) {
            if (!o0000oo02.containsKey(o0000oo0.OooO0OO(size))) {
                o0000oo0.m18207OooO0O0(size);
            }
        }
    }

    public static void OooO00o(Fragment fragment, Fragment fragment2, boolean z, C6971o0000oO0<String, View> o0000oo0, boolean z2) {
        AbstractC7004o000Oo0o o000oo0o;
        int i;
        if (z) {
            o000oo0o = fragment2.getEnterTransitionCallback();
        } else {
            o000oo0o = fragment.getEnterTransitionCallback();
        }
        if (o000oo0o != null) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            if (o0000oo0 == null) {
                i = 0;
            } else {
                i = o0000oo0.size();
            }
            for (int i2 = 0; i2 < i; i2++) {
                arrayList2.add(o0000oo0.OooO00o(i2));
                arrayList.add(o0000oo0.OooO0OO(i2));
            }
            if (z2) {
                o000oo0o.OooO0O0(arrayList2, arrayList, null);
            } else {
                o000oo0o.OooO00o(arrayList2, arrayList, (List<View>) null);
            }
        }
    }

    public static ArrayList<View> OooO00o(AbstractC7185o00o0ooo o00o0ooo, Object obj, Fragment fragment, ArrayList<View> arrayList, View view) {
        if (obj == null) {
            return null;
        }
        ArrayList<View> arrayList2 = new ArrayList<>();
        View view2 = fragment.getView();
        if (view2 != null) {
            o00o0ooo.OooO00o(arrayList2, view2);
        }
        if (arrayList != null) {
            arrayList2.removeAll(arrayList);
        }
        if (arrayList2.isEmpty()) {
            return arrayList2;
        }
        arrayList2.add(view);
        o00o0ooo.OooO00o(obj, arrayList2);
        return arrayList2;
    }

    public static void OooO00o(ArrayList<View> arrayList, int i) {
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                arrayList.get(size).setVisibility(i);
            }
        }
    }

    public static Object OooO00o(AbstractC7185o00o0ooo o00o0ooo, Object obj, Object obj2, Object obj3, Fragment fragment, boolean z) {
        boolean z2;
        if (obj == null || obj2 == null || fragment == null) {
            z2 = true;
        } else {
            z2 = z ? fragment.getAllowReturnTransitionOverlap() : fragment.getAllowEnterTransitionOverlap();
        }
        if (z2) {
            return o00o0ooo.OooO0O0(obj2, obj, obj3);
        }
        return o00o0ooo.OooO00o(obj2, obj, obj3);
    }

    public static void OooO00o(C7163o00o0Oo o00o0oo, SparseArray<C7184OooO0o0> sparseArray, boolean z) {
        int size = o00o0oo.f19562OooO00o.size();
        for (int i = 0; i < size; i++) {
            OooO00o(o00o0oo, o00o0oo.f19562OooO00o.get(i), sparseArray, false, z);
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static boolean m18676OooO00o() {
        return (OooO00o == null && OooO0O0 == null) ? false : true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0041, code lost:
        if (r10.mAdded != false) goto L_0x0094;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0076, code lost:
        r1 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0092, code lost:
        if (r10.mHidden == false) goto L_0x0094;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0094, code lost:
        r1 = true;
     */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x00e7 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:96:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void OooO00o(com.p118pd.sdk.C7163o00o0Oo r16, com.p118pd.sdk.C7163o00o0Oo.OooO00o r17, android.util.SparseArray<com.p118pd.sdk.C7182o00o0oo0.C7184OooO0o0> r18, boolean r19, boolean r20) {
        /*
        // Method dump skipped, instructions count: 242
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p118pd.sdk.C7182o00o0oo0.OooO00o(com.pd.sdk.o00o0Oo, com.pd.sdk.o00o0Oo$OooO00o, android.util.SparseArray, boolean, boolean):void");
    }

    public static C7184OooO0o0 OooO00o(C7184OooO0o0 oooO0o0, SparseArray<C7184OooO0o0> sparseArray, int i) {
        if (oooO0o0 != null) {
            return oooO0o0;
        }
        C7184OooO0o0 oooO0o02 = new C7184OooO0o0();
        sparseArray.put(i, oooO0o02);
        return oooO0o02;
    }
}

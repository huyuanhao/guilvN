package com.p118pd.sdk;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.RestrictTo;
import androidx.core.view.ViewCompat;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: com.pd.sdk.o00o0ooo  reason: case insensitive filesystem */
public abstract class AbstractC7185o00o0ooo {

    /* renamed from: com.pd.sdk.o00o0ooo$OooO00o */
    public class OooO00o implements Runnable {

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ ArrayList f19656OooO00o;
        public final /* synthetic */ ArrayList OooO0O0;
        public final /* synthetic */ ArrayList OooO0OO;
        public final /* synthetic */ ArrayList OooO0Oo;
        public final /* synthetic */ int o00oO0O;

        public OooO00o(int i, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4) {
            this.o00oO0O = i;
            this.f19656OooO00o = arrayList;
            this.OooO0O0 = arrayList2;
            this.OooO0OO = arrayList3;
            this.OooO0Oo = arrayList4;
        }

        public void run() {
            for (int i = 0; i < this.o00oO0O; i++) {
                ViewCompat.OooO00o((View) this.f19656OooO00o.get(i), (String) this.OooO0O0.get(i));
                ViewCompat.OooO00o((View) this.OooO0OO.get(i), (String) this.OooO0Oo.get(i));
            }
        }
    }

    /* renamed from: com.pd.sdk.o00o0ooo$OooO0O0 */
    public class OooO0O0 implements Runnable {

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ ArrayList f19657OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ Map f19658OooO00o;

        public OooO0O0(ArrayList arrayList, Map map) {
            this.f19657OooO00o = arrayList;
            this.f19658OooO00o = map;
        }

        public void run() {
            int size = this.f19657OooO00o.size();
            for (int i = 0; i < size; i++) {
                View view = (View) this.f19657OooO00o.get(i);
                String OooO00o2 = ViewCompat.m14574OooO00o(view);
                if (OooO00o2 != null) {
                    ViewCompat.OooO00o(view, AbstractC7185o00o0ooo.OooO00o(this.f19658OooO00o, OooO00o2));
                }
            }
        }
    }

    /* renamed from: com.pd.sdk.o00o0ooo$OooO0OO */
    public class OooO0OO implements Runnable {

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ ArrayList f19659OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ Map f19660OooO00o;

        public OooO0OO(ArrayList arrayList, Map map) {
            this.f19659OooO00o = arrayList;
            this.f19660OooO00o = map;
        }

        public void run() {
            int size = this.f19659OooO00o.size();
            for (int i = 0; i < size; i++) {
                View view = (View) this.f19659OooO00o.get(i);
                ViewCompat.OooO00o(view, (String) this.f19660OooO00o.get(ViewCompat.m14574OooO00o(view)));
            }
        }
    }

    public abstract Object OooO00o(Object obj);

    public abstract Object OooO00o(Object obj, Object obj2, Object obj3);

    public void OooO00o(View view, Rect rect) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        rect.set(iArr[0], iArr[1], iArr[0] + view.getWidth(), iArr[1] + view.getHeight());
    }

    public abstract void OooO00o(ViewGroup viewGroup, Object obj);

    public abstract void OooO00o(Object obj, Rect rect);

    public abstract void OooO00o(Object obj, View view);

    public abstract void OooO00o(Object obj, View view, ArrayList<View> arrayList);

    public abstract void OooO00o(Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3);

    public abstract void OooO00o(Object obj, ArrayList<View> arrayList);

    public abstract void OooO00o(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2);

    /* renamed from: OooO00o  reason: collision with other method in class */
    public abstract boolean m18677OooO00o(Object obj);

    public abstract Object OooO0O0(Object obj);

    public abstract Object OooO0O0(Object obj, Object obj2, Object obj3);

    public abstract void OooO0O0(Object obj, View view);

    public abstract void OooO0O0(Object obj, View view, ArrayList<View> arrayList);

    public abstract void OooO0O0(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2);

    public abstract void OooO0OO(Object obj, View view);

    public ArrayList<String> OooO00o(ArrayList<View> arrayList) {
        ArrayList<String> arrayList2 = new ArrayList<>();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            View view = arrayList.get(i);
            arrayList2.add(ViewCompat.m14574OooO00o(view));
            ViewCompat.OooO00o(view, (String) null);
        }
        return arrayList2;
    }

    public void OooO00o(View view, ArrayList<View> arrayList, ArrayList<View> arrayList2, ArrayList<String> arrayList3, Map<String, String> map) {
        int size = arrayList2.size();
        ArrayList arrayList4 = new ArrayList();
        for (int i = 0; i < size; i++) {
            View view2 = arrayList.get(i);
            String OooO00o2 = ViewCompat.m14574OooO00o(view2);
            arrayList4.add(OooO00o2);
            if (OooO00o2 != null) {
                ViewCompat.OooO00o(view2, (String) null);
                String str = map.get(OooO00o2);
                int i2 = 0;
                while (true) {
                    if (i2 >= size) {
                        break;
                    } else if (str.equals(arrayList3.get(i2))) {
                        ViewCompat.OooO00o(arrayList2.get(i2), OooO00o2);
                        break;
                    } else {
                        i2++;
                    }
                }
            }
        }
        ViewTreeObserver$OnPreDrawListenerC7215o00oo000.OooO00o(view, new OooO00o(size, arrayList2, arrayList3, arrayList, arrayList4));
    }

    public void OooO00o(ArrayList<View> arrayList, View view) {
        if (view.getVisibility() != 0) {
            return;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (C7112o00Oo0o.m18381OooO00o(viewGroup)) {
                arrayList.add(viewGroup);
                return;
            }
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                OooO00o(arrayList, viewGroup.getChildAt(i));
            }
            return;
        }
        arrayList.add(view);
    }

    public void OooO00o(Map<String, View> map, View view) {
        if (view.getVisibility() == 0) {
            String OooO00o2 = ViewCompat.m14574OooO00o(view);
            if (OooO00o2 != null) {
                map.put(OooO00o2, view);
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    OooO00o(map, viewGroup.getChildAt(i));
                }
            }
        }
    }

    public void OooO00o(View view, ArrayList<View> arrayList, Map<String, String> map) {
        ViewTreeObserver$OnPreDrawListenerC7215o00oo000.OooO00o(view, new OooO0O0(arrayList, map));
    }

    public void OooO00o(ViewGroup viewGroup, ArrayList<View> arrayList, Map<String, String> map) {
        ViewTreeObserver$OnPreDrawListenerC7215o00oo000.OooO00o(viewGroup, new OooO0OO(arrayList, map));
    }

    public static void OooO00o(List<View> list, View view) {
        int size = list.size();
        if (!OooO00o(list, view, size)) {
            list.add(view);
            for (int i = size; i < list.size(); i++) {
                View view2 = list.get(i);
                if (view2 instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view2;
                    int childCount = viewGroup.getChildCount();
                    for (int i2 = 0; i2 < childCount; i2++) {
                        View childAt = viewGroup.getChildAt(i2);
                        if (!OooO00o(list, childAt, size)) {
                            list.add(childAt);
                        }
                    }
                }
            }
        }
    }

    public static boolean OooO00o(List<View> list, View view, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            if (list.get(i2) == view) {
                return true;
            }
        }
        return false;
    }

    public static boolean OooO00o(List list) {
        return list == null || list.isEmpty();
    }

    public static String OooO00o(Map<String, String> map, String str) {
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (str.equals(entry.getValue())) {
                return entry.getKey();
            }
        }
        return null;
    }
}

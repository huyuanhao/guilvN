package com.p118pd.sdk;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.annotation.NonNull;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.pd.sdk.o0O000Oo  reason: case insensitive filesystem */
public class C7257o0O000Oo extends AbstractC7284o0O00o0o {
    public static TimeInterpolator OooO00o;
    public static final boolean OooO0OO = false;
    public ArrayList<RecyclerView.AbstractC5079OooOoo0> OooO = new ArrayList<>();
    public ArrayList<RecyclerView.AbstractC5079OooOoo0> OooO0O0 = new ArrayList<>();

    /* renamed from: OooO0OO  reason: collision with other field name */
    public ArrayList<RecyclerView.AbstractC5079OooOoo0> f19842OooO0OO = new ArrayList<>();
    public ArrayList<OooOO0> OooO0Oo = new ArrayList<>();
    public ArrayList<ArrayList<RecyclerView.AbstractC5079OooOoo0>> OooO0o = new ArrayList<>();
    public ArrayList<OooO> OooO0o0 = new ArrayList<>();
    public ArrayList<ArrayList<OooOO0>> OooO0oO = new ArrayList<>();
    public ArrayList<ArrayList<OooO>> OooO0oo = new ArrayList<>();
    public ArrayList<RecyclerView.AbstractC5079OooOoo0> OooOO0 = new ArrayList<>();
    public ArrayList<RecyclerView.AbstractC5079OooOoo0> OooOO0O = new ArrayList<>();
    public ArrayList<RecyclerView.AbstractC5079OooOoo0> OooOO0o = new ArrayList<>();

    /* renamed from: com.pd.sdk.o0O000Oo$OooO00o */
    public class OooO00o implements Runnable {

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ ArrayList f19845OooO00o;

        public OooO00o(ArrayList arrayList) {
            this.f19845OooO00o = arrayList;
        }

        public void run() {
            Iterator it = this.f19845OooO00o.iterator();
            while (it.hasNext()) {
                OooOO0 oooOO0 = (OooOO0) it.next();
                C7257o0O000Oo.this.OooO00o(oooOO0.f19863OooO00o, oooOO0.OooO00o, oooOO0.OooO0O0, oooOO0.OooO0OO, oooOO0.OooO0Oo);
            }
            this.f19845OooO00o.clear();
            C7257o0O000Oo.this.OooO0oO.remove(this.f19845OooO00o);
        }
    }

    /* renamed from: com.pd.sdk.o0O000Oo$OooO0O0 */
    public class OooO0O0 implements Runnable {

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ ArrayList f19846OooO00o;

        public OooO0O0(ArrayList arrayList) {
            this.f19846OooO00o = arrayList;
        }

        public void run() {
            Iterator it = this.f19846OooO00o.iterator();
            while (it.hasNext()) {
                C7257o0O000Oo.this.OooO00o((OooO) it.next());
            }
            this.f19846OooO00o.clear();
            C7257o0O000Oo.this.OooO0oo.remove(this.f19846OooO00o);
        }
    }

    /* renamed from: com.pd.sdk.o0O000Oo$OooO0OO */
    public class OooO0OO implements Runnable {

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ ArrayList f19847OooO00o;

        public OooO0OO(ArrayList arrayList) {
            this.f19847OooO00o = arrayList;
        }

        public void run() {
            Iterator it = this.f19847OooO00o.iterator();
            while (it.hasNext()) {
                C7257o0O000Oo.this.OooOOo((RecyclerView.AbstractC5079OooOoo0) it.next());
            }
            this.f19847OooO00o.clear();
            C7257o0O000Oo.this.OooO0o.remove(this.f19847OooO00o);
        }
    }

    /* renamed from: com.pd.sdk.o0O000Oo$OooO0Oo  reason: case insensitive filesystem */
    public class C7258OooO0Oo extends AnimatorListenerAdapter {
        public final /* synthetic */ View OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ ViewPropertyAnimator f19848OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ RecyclerView.AbstractC5079OooOoo0 f19849OooO00o;

        public C7258OooO0Oo(RecyclerView.AbstractC5079OooOoo0 oooOoo0, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f19849OooO00o = oooOoo0;
            this.f19848OooO00o = viewPropertyAnimator;
            this.OooO00o = view;
        }

        public void onAnimationEnd(Animator animator) {
            this.f19848OooO00o.setListener(null);
            this.OooO00o.setAlpha(1.0f);
            C7257o0O000Oo.this.OooOO0(this.f19849OooO00o);
            C7257o0O000Oo.this.OooOO0O.remove(this.f19849OooO00o);
            C7257o0O000Oo.this.OooO0Oo();
        }

        public void onAnimationStart(Animator animator) {
            C7257o0O000Oo.this.OooOO0O(this.f19849OooO00o);
        }
    }

    /* renamed from: com.pd.sdk.o0O000Oo$OooO0o */
    public class OooO0o extends AnimatorListenerAdapter {
        public final /* synthetic */ View OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ ViewPropertyAnimator f19851OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ RecyclerView.AbstractC5079OooOoo0 f19852OooO00o;
        public final /* synthetic */ int o00oO0O;
        public final /* synthetic */ int o0ooOO0;

        public OooO0o(RecyclerView.AbstractC5079OooOoo0 oooOoo0, int i, View view, int i2, ViewPropertyAnimator viewPropertyAnimator) {
            this.f19852OooO00o = oooOoo0;
            this.o00oO0O = i;
            this.OooO00o = view;
            this.o0ooOO0 = i2;
            this.f19851OooO00o = viewPropertyAnimator;
        }

        public void onAnimationCancel(Animator animator) {
            if (this.o00oO0O != 0) {
                this.OooO00o.setTranslationX(0.0f);
            }
            if (this.o0ooOO0 != 0) {
                this.OooO00o.setTranslationY(0.0f);
            }
        }

        public void onAnimationEnd(Animator animator) {
            this.f19851OooO00o.setListener(null);
            C7257o0O000Oo.this.OooO0oo(this.f19852OooO00o);
            C7257o0O000Oo.this.OooOO0.remove(this.f19852OooO00o);
            C7257o0O000Oo.this.OooO0Oo();
        }

        public void onAnimationStart(Animator animator) {
            C7257o0O000Oo.this.OooO(this.f19852OooO00o);
        }
    }

    /* renamed from: com.pd.sdk.o0O000Oo$OooO0o0  reason: case insensitive filesystem */
    public class C7259OooO0o0 extends AnimatorListenerAdapter {
        public final /* synthetic */ View OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ ViewPropertyAnimator f19854OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ RecyclerView.AbstractC5079OooOoo0 f19855OooO00o;

        public C7259OooO0o0(RecyclerView.AbstractC5079OooOoo0 oooOoo0, View view, ViewPropertyAnimator viewPropertyAnimator) {
            this.f19855OooO00o = oooOoo0;
            this.OooO00o = view;
            this.f19854OooO00o = viewPropertyAnimator;
        }

        public void onAnimationCancel(Animator animator) {
            this.OooO00o.setAlpha(1.0f);
        }

        public void onAnimationEnd(Animator animator) {
            this.f19854OooO00o.setListener(null);
            C7257o0O000Oo.this.OooO0o(this.f19855OooO00o);
            C7257o0O000Oo.this.OooO.remove(this.f19855OooO00o);
            C7257o0O000Oo.this.OooO0Oo();
        }

        public void onAnimationStart(Animator animator) {
            C7257o0O000Oo.this.OooO0oO(this.f19855OooO00o);
        }
    }

    /* renamed from: com.pd.sdk.o0O000Oo$OooO0oO  reason: case insensitive filesystem */
    public class C7260OooO0oO extends AnimatorListenerAdapter {
        public final /* synthetic */ View OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ ViewPropertyAnimator f19857OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ OooO f19858OooO00o;

        public C7260OooO0oO(OooO oooO, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f19858OooO00o = oooO;
            this.f19857OooO00o = viewPropertyAnimator;
            this.OooO00o = view;
        }

        public void onAnimationEnd(Animator animator) {
            this.f19857OooO00o.setListener(null);
            this.OooO00o.setAlpha(1.0f);
            this.OooO00o.setTranslationX(0.0f);
            this.OooO00o.setTranslationY(0.0f);
            C7257o0O000Oo.this.OooO00o(this.f19858OooO00o.f19843OooO00o, true);
            C7257o0O000Oo.this.OooOO0o.remove(this.f19858OooO00o.f19843OooO00o);
            C7257o0O000Oo.this.OooO0Oo();
        }

        public void onAnimationStart(Animator animator) {
            C7257o0O000Oo.this.OooO0O0(this.f19858OooO00o.f19843OooO00o, true);
        }
    }

    /* renamed from: com.pd.sdk.o0O000Oo$OooO0oo  reason: case insensitive filesystem */
    public class C7261OooO0oo extends AnimatorListenerAdapter {
        public final /* synthetic */ View OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ ViewPropertyAnimator f19860OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ OooO f19861OooO00o;

        public C7261OooO0oo(OooO oooO, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f19861OooO00o = oooO;
            this.f19860OooO00o = viewPropertyAnimator;
            this.OooO00o = view;
        }

        public void onAnimationEnd(Animator animator) {
            this.f19860OooO00o.setListener(null);
            this.OooO00o.setAlpha(1.0f);
            this.OooO00o.setTranslationX(0.0f);
            this.OooO00o.setTranslationY(0.0f);
            C7257o0O000Oo.this.OooO00o(this.f19861OooO00o.f19844OooO0O0, false);
            C7257o0O000Oo.this.OooOO0o.remove(this.f19861OooO00o.f19844OooO0O0);
            C7257o0O000Oo.this.OooO0Oo();
        }

        public void onAnimationStart(Animator animator) {
            C7257o0O000Oo.this.OooO0O0(this.f19861OooO00o.f19844OooO0O0, false);
        }
    }

    /* renamed from: com.pd.sdk.o0O000Oo$OooOO0 */
    public static class OooOO0 {
        public int OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public RecyclerView.AbstractC5079OooOoo0 f19863OooO00o;
        public int OooO0O0;
        public int OooO0OO;
        public int OooO0Oo;

        public OooOO0(RecyclerView.AbstractC5079OooOoo0 oooOoo0, int i, int i2, int i3, int i4) {
            this.f19863OooO00o = oooOoo0;
            this.OooO00o = i;
            this.OooO0O0 = i2;
            this.OooO0OO = i3;
            this.OooO0Oo = i4;
        }
    }

    private void OooOOoo(RecyclerView.AbstractC5079OooOoo0 oooOoo0) {
        View view = oooOoo0.f14626OooO00o;
        ViewPropertyAnimator animate = view.animate();
        this.OooOO0O.add(oooOoo0);
        animate.setDuration(OooO0Oo()).alpha(0.0f).setListener(new C7258OooO0Oo(oooOoo0, animate, view)).start();
    }

    private void OooOo00(RecyclerView.AbstractC5079OooOoo0 oooOoo0) {
        if (OooO00o == null) {
            OooO00o = new ValueAnimator().getInterpolator();
        }
        oooOoo0.f14626OooO00o.animate().setInterpolator(OooO00o);
        OooO0OO(oooOoo0);
    }

    @Override // com.p118pd.sdk.AbstractC7284o0O00o0o
    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m18733OooO00o(RecyclerView.AbstractC5079OooOoo0 oooOoo0, int i, int i2, int i3, int i4) {
        View view = oooOoo0.f14626OooO00o;
        int translationX = i + ((int) view.getTranslationX());
        int translationY = i2 + ((int) oooOoo0.f14626OooO00o.getTranslationY());
        OooOo00(oooOoo0);
        int i5 = i3 - translationX;
        int i6 = i4 - translationY;
        if (i5 == 0 && i6 == 0) {
            OooO0oo(oooOoo0);
            return false;
        }
        if (i5 != 0) {
            view.setTranslationX((float) (-i5));
        }
        if (i6 != 0) {
            view.setTranslationY((float) (-i6));
        }
        this.OooO0Oo.add(new OooOO0(oooOoo0, translationX, translationY, i3, i4));
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemAnimator, com.p118pd.sdk.AbstractC7284o0O00o0o
    public boolean OooO0O0(RecyclerView.AbstractC5079OooOoo0 oooOoo0) {
        OooOo00(oooOoo0);
        oooOoo0.f14626OooO00o.setAlpha(0.0f);
        this.f19842OooO0OO.add(oooOoo0);
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemAnimator, androidx.recyclerview.widget.RecyclerView.ItemAnimator
    public void OooO0OO() {
        boolean z = !this.OooO0O0.isEmpty();
        boolean z2 = !this.OooO0Oo.isEmpty();
        boolean z3 = !this.OooO0o0.isEmpty();
        boolean z4 = !this.f19842OooO0OO.isEmpty();
        if (z || z2 || z4 || z3) {
            Iterator<RecyclerView.AbstractC5079OooOoo0> it = this.OooO0O0.iterator();
            while (it.hasNext()) {
                OooOOoo(it.next());
            }
            this.OooO0O0.clear();
            if (z2) {
                ArrayList<OooOO0> arrayList = new ArrayList<>();
                arrayList.addAll(this.OooO0Oo);
                this.OooO0oO.add(arrayList);
                this.OooO0Oo.clear();
                OooO00o oooO00o = new OooO00o(arrayList);
                if (z) {
                    ViewCompat.OooO00o(arrayList.get(0).f19863OooO00o.f14626OooO00o, oooO00o, OooO0Oo());
                } else {
                    oooO00o.run();
                }
            }
            if (z3) {
                ArrayList<OooO> arrayList2 = new ArrayList<>();
                arrayList2.addAll(this.OooO0o0);
                this.OooO0oo.add(arrayList2);
                this.OooO0o0.clear();
                OooO0O0 oooO0O0 = new OooO0O0(arrayList2);
                if (z) {
                    ViewCompat.OooO00o(arrayList2.get(0).f19843OooO00o.f14626OooO00o, oooO0O0, OooO0Oo());
                } else {
                    oooO0O0.run();
                }
            }
            if (z4) {
                ArrayList<RecyclerView.AbstractC5079OooOoo0> arrayList3 = new ArrayList<>();
                arrayList3.addAll(this.f19842OooO0OO);
                this.OooO0o.add(arrayList3);
                this.f19842OooO0OO.clear();
                OooO0OO oooO0OO = new OooO0OO(arrayList3);
                if (z || z2 || z3) {
                    long j = 0;
                    long OooO0Oo2 = z ? OooO0Oo() : 0;
                    long OooO0OO2 = z2 ? OooO0OO() : 0;
                    if (z3) {
                        j = OooO0O0();
                    }
                    ViewCompat.OooO00o(arrayList3.get(0).f14626OooO00o, oooO0OO, OooO0Oo2 + Math.max(OooO0OO2, j));
                    return;
                }
                oooO0OO.run();
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemAnimator
    public void OooO0Oo() {
        if (!OooO00o()) {
            m14748OooO00o();
        }
    }

    public void OooOOo(RecyclerView.AbstractC5079OooOoo0 oooOoo0) {
        View view = oooOoo0.f14626OooO00o;
        ViewPropertyAnimator animate = view.animate();
        this.OooO.add(oooOoo0);
        animate.alpha(1.0f).setDuration(OooO00o()).setListener(new C7259OooO0o0(oooOoo0, view, animate)).start();
    }

    /* renamed from: com.pd.sdk.o0O000Oo$OooO */
    public static class OooO {
        public int OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public RecyclerView.AbstractC5079OooOoo0 f19843OooO00o;
        public int OooO0O0;

        /* renamed from: OooO0O0  reason: collision with other field name */
        public RecyclerView.AbstractC5079OooOoo0 f19844OooO0O0;
        public int OooO0OO;
        public int OooO0Oo;

        public OooO(RecyclerView.AbstractC5079OooOoo0 oooOoo0, RecyclerView.AbstractC5079OooOoo0 oooOoo02) {
            this.f19843OooO00o = oooOoo0;
            this.f19844OooO0O0 = oooOoo02;
        }

        public String toString() {
            return "ChangeInfo{oldHolder=" + this.f19843OooO00o + ", newHolder=" + this.f19844OooO0O0 + ", fromX=" + this.OooO00o + ", fromY=" + this.OooO0O0 + ", toX=" + this.OooO0OO + ", toY=" + this.OooO0Oo + '}';
        }

        public OooO(RecyclerView.AbstractC5079OooOoo0 oooOoo0, RecyclerView.AbstractC5079OooOoo0 oooOoo02, int i, int i2, int i3, int i4) {
            this(oooOoo0, oooOoo02);
            this.OooO00o = i;
            this.OooO0O0 = i2;
            this.OooO0OO = i3;
            this.OooO0Oo = i4;
        }
    }

    private void OooO0O0(OooO oooO) {
        RecyclerView.AbstractC5079OooOoo0 oooOoo0 = oooO.f19843OooO00o;
        if (oooOoo0 != null) {
            OooO00o(oooO, oooOoo0);
        }
        RecyclerView.AbstractC5079OooOoo0 oooOoo02 = oooO.f19844OooO0O0;
        if (oooOoo02 != null) {
            OooO00o(oooO, oooOoo02);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemAnimator, androidx.recyclerview.widget.RecyclerView.ItemAnimator, com.p118pd.sdk.AbstractC7284o0O00o0o
    public void OooO0O0() {
        int size = this.OooO0Oo.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            OooOO0 oooOO0 = this.OooO0Oo.get(size);
            View view = oooOO0.f19863OooO00o.f14626OooO00o;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            OooO0oo(oooOO0.f19863OooO00o);
            this.OooO0Oo.remove(size);
        }
        for (int size2 = this.OooO0O0.size() - 1; size2 >= 0; size2--) {
            OooOO0(this.OooO0O0.get(size2));
            this.OooO0O0.remove(size2);
        }
        int size3 = this.f19842OooO0OO.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            RecyclerView.AbstractC5079OooOoo0 oooOoo0 = this.f19842OooO0OO.get(size3);
            oooOoo0.f14626OooO00o.setAlpha(1.0f);
            OooO0o(oooOoo0);
            this.f19842OooO0OO.remove(size3);
        }
        for (int size4 = this.OooO0o0.size() - 1; size4 >= 0; size4--) {
            OooO0O0(this.OooO0o0.get(size4));
        }
        this.OooO0o0.clear();
        if (OooO00o()) {
            for (int size5 = this.OooO0oO.size() - 1; size5 >= 0; size5--) {
                ArrayList<OooOO0> arrayList = this.OooO0oO.get(size5);
                for (int size6 = arrayList.size() - 1; size6 >= 0; size6--) {
                    OooOO0 oooOO02 = arrayList.get(size6);
                    View view2 = oooOO02.f19863OooO00o.f14626OooO00o;
                    view2.setTranslationY(0.0f);
                    view2.setTranslationX(0.0f);
                    OooO0oo(oooOO02.f19863OooO00o);
                    arrayList.remove(size6);
                    if (arrayList.isEmpty()) {
                        this.OooO0oO.remove(arrayList);
                    }
                }
            }
            for (int size7 = this.OooO0o.size() - 1; size7 >= 0; size7--) {
                ArrayList<RecyclerView.AbstractC5079OooOoo0> arrayList2 = this.OooO0o.get(size7);
                for (int size8 = arrayList2.size() - 1; size8 >= 0; size8--) {
                    RecyclerView.AbstractC5079OooOoo0 oooOoo02 = arrayList2.get(size8);
                    oooOoo02.f14626OooO00o.setAlpha(1.0f);
                    OooO0o(oooOoo02);
                    arrayList2.remove(size8);
                    if (arrayList2.isEmpty()) {
                        this.OooO0o.remove(arrayList2);
                    }
                }
            }
            for (int size9 = this.OooO0oo.size() - 1; size9 >= 0; size9--) {
                ArrayList<OooO> arrayList3 = this.OooO0oo.get(size9);
                for (int size10 = arrayList3.size() - 1; size10 >= 0; size10--) {
                    OooO0O0(arrayList3.get(size10));
                    if (arrayList3.isEmpty()) {
                        this.OooO0oo.remove(arrayList3);
                    }
                }
            }
            OooO00o(this.OooOO0O);
            OooO00o(this.OooOO0);
            OooO00o(this.OooO);
            OooO00o(this.OooOO0o);
            m14748OooO00o();
        }
    }

    @Override // com.p118pd.sdk.AbstractC7284o0O00o0o
    public void OooO00o(RecyclerView.AbstractC5079OooOoo0 oooOoo0, int i, int i2, int i3, int i4) {
        View view = oooOoo0.f14626OooO00o;
        int i5 = i3 - i;
        int i6 = i4 - i2;
        if (i5 != 0) {
            view.animate().translationX(0.0f);
        }
        if (i6 != 0) {
            view.animate().translationY(0.0f);
        }
        ViewPropertyAnimator animate = view.animate();
        this.OooOO0.add(oooOoo0);
        animate.setDuration(OooO0OO()).setListener(new OooO0o(oooOoo0, i5, view, i6, animate)).start();
    }

    @Override // com.p118pd.sdk.AbstractC7284o0O00o0o
    public boolean OooO00o(RecyclerView.AbstractC5079OooOoo0 oooOoo0, RecyclerView.AbstractC5079OooOoo0 oooOoo02, int i, int i2, int i3, int i4) {
        if (oooOoo0 == oooOoo02) {
            return m18733OooO00o(oooOoo0, i, i2, i3, i4);
        }
        float translationX = oooOoo0.f14626OooO00o.getTranslationX();
        float translationY = oooOoo0.f14626OooO00o.getTranslationY();
        float alpha = oooOoo0.f14626OooO00o.getAlpha();
        OooOo00(oooOoo0);
        int i5 = (int) (((float) (i3 - i)) - translationX);
        int i6 = (int) (((float) (i4 - i2)) - translationY);
        oooOoo0.f14626OooO00o.setTranslationX(translationX);
        oooOoo0.f14626OooO00o.setTranslationY(translationY);
        oooOoo0.f14626OooO00o.setAlpha(alpha);
        if (oooOoo02 != null) {
            OooOo00(oooOoo02);
            oooOoo02.f14626OooO00o.setTranslationX((float) (-i5));
            oooOoo02.f14626OooO00o.setTranslationY((float) (-i6));
            oooOoo02.f14626OooO00o.setAlpha(0.0f);
        }
        this.OooO0o0.add(new OooO(oooOoo0, oooOoo02, i, i2, i3, i4));
        return true;
    }

    public void OooO00o(OooO oooO) {
        View view;
        RecyclerView.AbstractC5079OooOoo0 oooOoo0 = oooO.f19843OooO00o;
        View view2 = null;
        if (oooOoo0 == null) {
            view = null;
        } else {
            view = oooOoo0.f14626OooO00o;
        }
        RecyclerView.AbstractC5079OooOoo0 oooOoo02 = oooO.f19844OooO0O0;
        if (oooOoo02 != null) {
            view2 = oooOoo02.f14626OooO00o;
        }
        if (view != null) {
            ViewPropertyAnimator duration = view.animate().setDuration(OooO0O0());
            this.OooOO0o.add(oooO.f19843OooO00o);
            duration.translationX((float) (oooO.OooO0OO - oooO.OooO00o));
            duration.translationY((float) (oooO.OooO0Oo - oooO.OooO0O0));
            duration.alpha(0.0f).setListener(new C7260OooO0oO(oooO, duration, view)).start();
        }
        if (view2 != null) {
            ViewPropertyAnimator animate = view2.animate();
            this.OooOO0o.add(oooO.f19844OooO0O0);
            animate.translationX(0.0f).translationY(0.0f).setDuration(OooO0O0()).alpha(1.0f).setListener(new C7261OooO0oo(oooO, animate, view2)).start();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemAnimator, com.p118pd.sdk.AbstractC7284o0O00o0o
    /* renamed from: OooO0OO  reason: collision with other method in class */
    public boolean m18734OooO0OO(RecyclerView.AbstractC5079OooOoo0 oooOoo0) {
        OooOo00(oooOoo0);
        this.OooO0O0.add(oooOoo0);
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemAnimator, com.p118pd.sdk.AbstractC7284o0O00o0o
    public void OooO0OO(RecyclerView.AbstractC5079OooOoo0 oooOoo0) {
        View view = oooOoo0.f14626OooO00o;
        view.animate().cancel();
        int size = this.OooO0Oo.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            } else if (this.OooO0Oo.get(size).f19863OooO00o == oooOoo0) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                OooO0oo(oooOoo0);
                this.OooO0Oo.remove(size);
            }
        }
        OooO00o(this.OooO0o0, oooOoo0);
        if (this.OooO0O0.remove(oooOoo0)) {
            view.setAlpha(1.0f);
            OooOO0(oooOoo0);
        }
        if (this.f19842OooO0OO.remove(oooOoo0)) {
            view.setAlpha(1.0f);
            OooO0o(oooOoo0);
        }
        for (int size2 = this.OooO0oo.size() - 1; size2 >= 0; size2--) {
            ArrayList<OooO> arrayList = this.OooO0oo.get(size2);
            OooO00o(arrayList, oooOoo0);
            if (arrayList.isEmpty()) {
                this.OooO0oo.remove(size2);
            }
        }
        for (int size3 = this.OooO0oO.size() - 1; size3 >= 0; size3--) {
            ArrayList<OooOO0> arrayList2 = this.OooO0oO.get(size3);
            int size4 = arrayList2.size() - 1;
            while (true) {
                if (size4 < 0) {
                    break;
                } else if (arrayList2.get(size4).f19863OooO00o == oooOoo0) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    OooO0oo(oooOoo0);
                    arrayList2.remove(size4);
                    if (arrayList2.isEmpty()) {
                        this.OooO0oO.remove(size3);
                    }
                } else {
                    size4--;
                }
            }
        }
        for (int size5 = this.OooO0o.size() - 1; size5 >= 0; size5--) {
            ArrayList<RecyclerView.AbstractC5079OooOoo0> arrayList3 = this.OooO0o.get(size5);
            if (arrayList3.remove(oooOoo0)) {
                view.setAlpha(1.0f);
                OooO0o(oooOoo0);
                if (arrayList3.isEmpty()) {
                    this.OooO0o.remove(size5);
                }
            }
        }
        this.OooOO0O.remove(oooOoo0);
        this.OooO.remove(oooOoo0);
        this.OooOO0o.remove(oooOoo0);
        this.OooOO0.remove(oooOoo0);
        OooO0Oo();
    }

    private void OooO00o(List<OooO> list, RecyclerView.AbstractC5079OooOoo0 oooOoo0) {
        for (int size = list.size() - 1; size >= 0; size--) {
            OooO oooO = list.get(size);
            if (OooO00o(oooO, oooOoo0) && oooO.f19843OooO00o == null && oooO.f19844OooO0O0 == null) {
                list.remove(oooO);
            }
        }
    }

    private boolean OooO00o(OooO oooO, RecyclerView.AbstractC5079OooOoo0 oooOoo0) {
        boolean z = false;
        if (oooO.f19844OooO0O0 == oooOoo0) {
            oooO.f19844OooO0O0 = null;
        } else if (oooO.f19843OooO00o != oooOoo0) {
            return false;
        } else {
            oooO.f19843OooO00o = null;
            z = true;
        }
        oooOoo0.f14626OooO00o.setAlpha(1.0f);
        oooOoo0.f14626OooO00o.setTranslationX(0.0f);
        oooOoo0.f14626OooO00o.setTranslationY(0.0f);
        OooO00o(oooOoo0, z);
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemAnimator, androidx.recyclerview.widget.RecyclerView.ItemAnimator, androidx.recyclerview.widget.RecyclerView.ItemAnimator, androidx.recyclerview.widget.RecyclerView.ItemAnimator
    public boolean OooO00o() {
        return !this.f19842OooO0OO.isEmpty() || !this.OooO0o0.isEmpty() || !this.OooO0Oo.isEmpty() || !this.OooO0O0.isEmpty() || !this.OooOO0.isEmpty() || !this.OooOO0O.isEmpty() || !this.OooO.isEmpty() || !this.OooOO0o.isEmpty() || !this.OooO0oO.isEmpty() || !this.OooO0o.isEmpty() || !this.OooO0oo.isEmpty();
    }

    public void OooO00o(List<RecyclerView.AbstractC5079OooOoo0> list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            list.get(size).f14626OooO00o.animate().cancel();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemAnimator
    public boolean OooO00o(@NonNull RecyclerView.AbstractC5079OooOoo0 oooOoo0, @NonNull List<Object> list) {
        return !list.isEmpty() || super.OooO00o(oooOoo0, list);
    }
}

package com.p118pd.sdk;

import android.graphics.Matrix;
import android.graphics.PointF;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.swmansion.gesturehandler.PointerEventsConfig;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import javax.annotation.Nullable;

/* renamed from: com.pd.sdk.ooOoo00  reason: case insensitive filesystem */
public class C9066ooOoo00 {
    public static final Matrix OooO00o = new Matrix();

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final PointF f22394OooO00o = new PointF();

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final Comparator<C9063ooOoOooo> f22395OooO00o = new OooO00o();

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final float[] f22396OooO00o = new float[2];
    public static final float OooO0O0 = 0.0f;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public static final float[] f22397OooO0O0 = new float[2];
    public static final int OooO0o0 = 20;

    /* renamed from: OooO00o  reason: collision with other field name */
    public float f22398OooO00o = 0.0f;

    /* renamed from: OooO00o  reason: collision with other field name */
    public int f22399OooO00o = 0;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final ViewGroup f22400OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final AbstractC9064ooOoo f22401OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final AbstractC9091ooOooo0o f22402OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public boolean f22403OooO00o = false;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final C9063ooOoOooo[] f22404OooO00o = new C9063ooOoOooo[20];

    /* renamed from: OooO0O0  reason: collision with other field name */
    public int f22405OooO0O0 = 0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public boolean f22406OooO0O0 = false;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public final C9063ooOoOooo[] f22407OooO0O0 = new C9063ooOoOooo[20];
    public int OooO0OO = 0;

    /* renamed from: OooO0OO  reason: collision with other field name */
    public final C9063ooOoOooo[] f22408OooO0OO = new C9063ooOoOooo[20];
    public int OooO0Oo = 0;

    /* renamed from: OooO0Oo  reason: collision with other field name */
    public final C9063ooOoOooo[] f22409OooO0Oo = new C9063ooOoOooo[20];

    /* renamed from: com.pd.sdk.ooOoo00$OooO00o */
    public static class OooO00o implements Comparator<C9063ooOoOooo> {
        /* renamed from: OooO00o */
        public int compare(C9063ooOoOooo oooooooo, C9063ooOoOooo oooooooo2) {
            if ((oooooooo.f22390OooO0Oo && oooooooo2.f22390OooO0Oo) || (oooooooo.f22393OooO0o0 && oooooooo2.f22393OooO0o0)) {
                return Integer.signum(oooooooo2.f22392OooO0o0 - oooooooo.f22392OooO0o0);
            }
            if (oooooooo.f22390OooO0Oo) {
                return -1;
            }
            if (oooooooo2.f22390OooO0Oo) {
                return 1;
            }
            if (oooooooo.f22393OooO0o0) {
                return -1;
            }
            if (oooooooo2.f22393OooO0o0) {
                return 1;
            }
            return 0;
        }
    }

    public C9066ooOoo00(ViewGroup viewGroup, AbstractC9091ooOooo0o oooooo0o, AbstractC9064ooOoo ooooo) {
        this.f22400OooO00o = viewGroup;
        this.f22402OooO00o = oooooo0o;
        this.f22401OooO00o = ooooo;
    }

    public static boolean OooO00o(int i) {
        return i == 3 || i == 1 || i == 5;
    }

    private void OooO0O0() {
        int i = 0;
        for (int i2 = 0; i2 < this.f22405OooO0O0; i2++) {
            C9063ooOoOooo[] ooooooooArr = this.f22407OooO0O0;
            if (ooooooooArr[i2].f22393OooO0o0) {
                ooooooooArr[i] = ooooooooArr[i2];
                i++;
            }
        }
        this.f22405OooO0O0 = i;
    }

    private void OooO0OO() {
        boolean z = false;
        for (int i = this.f22399OooO00o - 1; i >= 0; i--) {
            C9063ooOoOooo oooooooo = this.f22404OooO00o[i];
            if (OooO00o(oooooooo.m20737OooO0O0()) && !oooooooo.f22393OooO0o0) {
                this.f22404OooO00o[i] = null;
                oooooooo.OooO0oo();
                oooooooo.f22390OooO0Oo = false;
                oooooooo.f22393OooO0o0 = false;
                oooooooo.f22392OooO0o0 = Integer.MAX_VALUE;
                z = true;
            }
        }
        if (z) {
            int i2 = 0;
            for (int i3 = 0; i3 < this.f22399OooO00o; i3++) {
                C9063ooOoOooo[] ooooooooArr = this.f22404OooO00o;
                if (ooooooooArr[i3] != null) {
                    ooooooooArr[i2] = ooooooooArr[i3];
                    i2++;
                }
            }
            this.f22399OooO00o = i2;
        }
        this.f22406OooO0O0 = false;
    }

    private void OooO0Oo() {
        if (this.f22403OooO00o || this.OooO0OO != 0) {
            this.f22406OooO0O0 = true;
        } else {
            OooO0OO();
        }
    }

    public void OooO00o(float f) {
        this.f22398OooO00o = f;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m20748OooO00o(MotionEvent motionEvent) {
        this.f22403OooO00o = true;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0 || actionMasked == 5) {
            OooO0O0(motionEvent);
        } else if (actionMasked == 3) {
            OooO00o();
        }
        OooO00o(motionEvent);
        this.f22403OooO00o = false;
        if (this.f22406OooO0O0 && this.OooO0OO == 0) {
            OooO0OO();
        }
        return true;
    }

    private void OooO0O0(C9063ooOoOooo oooooooo) {
        int OooO0O02 = oooooooo.m20737OooO0O0();
        oooooooo.f22393OooO0o0 = false;
        oooooooo.f22390OooO0Oo = true;
        int i = this.OooO0Oo;
        this.OooO0Oo = i + 1;
        oooooooo.f22392OooO0o0 = i;
        int i2 = 0;
        for (int i3 = 0; i3 < this.f22399OooO00o; i3++) {
            C9063ooOoOooo oooooooo2 = this.f22404OooO00o[i3];
            if (OooO0O0(oooooooo2, oooooooo)) {
                this.f22409OooO0Oo[i2] = oooooooo2;
                i2++;
            }
        }
        for (int i4 = i2 - 1; i4 >= 0; i4--) {
            this.f22409OooO0Oo[i4].m20741OooO0OO();
        }
        for (int i5 = this.f22405OooO0O0 - 1; i5 >= 0; i5--) {
            C9063ooOoOooo oooooooo3 = this.f22407OooO0O0[i5];
            if (OooO0O0(oooooooo3, oooooooo)) {
                oooooooo3.m20741OooO0OO();
                oooooooo3.f22393OooO0o0 = false;
            }
        }
        OooO0O0();
        oooooooo.OooO00o(4, 2);
        if (OooO0O02 != 4) {
            oooooooo.OooO00o(5, 4);
            if (OooO0O02 != 5) {
                oooooooo.OooO00o(0, 5);
            }
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    private boolean m20747OooO00o(C9063ooOoOooo oooooooo) {
        for (int i = 0; i < this.f22399OooO00o; i++) {
            C9063ooOoOooo oooooooo2 = this.f22404OooO00o[i];
            if (!OooO00o(oooooooo2.m20737OooO0O0()) && OooO0OO(oooooooo, oooooooo2)) {
                return true;
            }
        }
        return false;
    }

    private void OooO0OO(C9063ooOoOooo oooooooo) {
        if (m20747OooO00o(oooooooo)) {
            OooO00o(oooooooo);
            return;
        }
        OooO0O0(oooooooo);
        oooooooo.f22393OooO0o0 = false;
    }

    public void OooO00o(C9063ooOoOooo oooooooo, int i, int i2) {
        this.OooO0OO++;
        if (OooO00o(i)) {
            for (int i3 = 0; i3 < this.f22405OooO0O0; i3++) {
                C9063ooOoOooo oooooooo2 = this.f22407OooO0O0[i3];
                if (OooO0OO(oooooooo2, oooooooo)) {
                    if (i == 5) {
                        oooooooo2.m20741OooO0OO();
                        oooooooo2.f22393OooO0o0 = false;
                    } else {
                        OooO0OO(oooooooo2);
                    }
                }
            }
            OooO0O0();
        }
        if (i == 4) {
            OooO0OO(oooooooo);
        } else if (i2 != 4 && i2 != 5) {
            oooooooo.OooO00o(i, i2);
        } else if (oooooooo.f22390OooO0Oo) {
            oooooooo.OooO00o(i, i2);
        }
        this.OooO0OO--;
        OooO0Oo();
    }

    private boolean OooO0OO(@Nullable View view) {
        if (view == null) {
            return false;
        }
        if (view == this.f22400OooO00o) {
            return true;
        }
        ViewParent parent = view.getParent();
        while (parent != null && parent != this.f22400OooO00o) {
            parent = parent.getParent();
        }
        if (parent == this.f22400OooO00o) {
            return true;
        }
        return false;
    }

    private void OooO0O0(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        int pointerId = motionEvent.getPointerId(actionIndex);
        f22397OooO0O0[0] = motionEvent.getX(actionIndex);
        f22397OooO0O0[1] = motionEvent.getY(actionIndex);
        OooO0O0(this.f22400OooO00o, f22397OooO0O0, pointerId);
        OooO00o(this.f22400OooO00o, f22397OooO0O0, pointerId);
    }

    public static boolean OooO0OO(C9063ooOoOooo oooooooo, C9063ooOoOooo oooooooo2) {
        return oooooooo != oooooooo2 && (oooooooo.OooO0o0(oooooooo2) || oooooooo2.OooO0Oo(oooooooo));
    }

    private boolean OooO0O0(View view, float[] fArr, int i) {
        PointerEventsConfig OooO00o2 = this.f22401OooO00o.OooO00o(view);
        if (OooO00o2 == PointerEventsConfig.NONE) {
            return false;
        }
        if (OooO00o2 == PointerEventsConfig.BOX_ONLY) {
            if (OooO00o(view, fArr, i) || OooO00o(view, fArr)) {
                return true;
            }
            return false;
        } else if (OooO00o2 == PointerEventsConfig.BOX_NONE) {
            if (view instanceof ViewGroup) {
                return OooO00o((ViewGroup) view, fArr, i);
            }
            return false;
        } else if (OooO00o2 == PointerEventsConfig.AUTO) {
            boolean OooO00o3 = view instanceof ViewGroup ? OooO00o((ViewGroup) view, fArr, i) : false;
            if (OooO00o(view, fArr, i) || OooO00o3 || OooO00o(view, fArr)) {
                return true;
            }
            return false;
        } else {
            throw new IllegalArgumentException("Unknown pointer event type: " + OooO00o2.toString());
        }
    }

    public void OooO00o(MotionEvent motionEvent) {
        int i = this.f22399OooO00o;
        System.arraycopy(this.f22404OooO00o, 0, this.f22408OooO0OO, 0, i);
        Arrays.sort(this.f22408OooO0OO, 0, i, f22395OooO00o);
        for (int i2 = 0; i2 < i; i2++) {
            OooO00o(this.f22408OooO0OO[i2], motionEvent);
        }
    }

    private void OooO00o() {
        for (int i = this.f22405OooO0O0 - 1; i >= 0; i--) {
            this.f22407OooO0O0[i].m20741OooO0OO();
        }
        int i2 = this.f22399OooO00o;
        for (int i3 = 0; i3 < i2; i3++) {
            this.f22408OooO0OO[i3] = this.f22404OooO00o[i3];
        }
        for (int i4 = i2 - 1; i4 >= 0; i4--) {
            this.f22408OooO0OO[i4].m20741OooO0OO();
        }
    }

    private void OooO00o(C9063ooOoOooo oooooooo, MotionEvent motionEvent) {
        if (!OooO0OO(oooooooo.m20731OooO00o())) {
            oooooooo.m20741OooO0OO();
        } else if (oooooooo.m20742OooO0OO()) {
            int actionMasked = motionEvent.getActionMasked();
            if (!oooooooo.f22393OooO0o0 || actionMasked != 2) {
                float[] fArr = f22397OooO0O0;
                OooO00o(oooooooo.m20731OooO00o(), motionEvent, fArr);
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                motionEvent.setLocation(fArr[0], fArr[1]);
                oooooooo.OooO0O0(motionEvent);
                if (oooooooo.f22390OooO0Oo) {
                    oooooooo.m20735OooO00o(motionEvent);
                }
                motionEvent.setLocation(x, y);
                if (actionMasked == 1 || actionMasked == 6) {
                    oooooooo.OooO0OO(motionEvent.getPointerId(motionEvent.getActionIndex()));
                }
            }
        }
    }

    private boolean OooO0O0(View view) {
        return !(view instanceof ViewGroup) || this.f22401OooO00o.OooO00o((ViewGroup) view);
    }

    public static boolean OooO0O0(C9063ooOoOooo oooooooo, C9063ooOoOooo oooooooo2) {
        if (!oooooooo.OooO00o(oooooooo2) || OooO00o(oooooooo, oooooooo2)) {
            return false;
        }
        if (oooooooo == oooooooo2) {
            return true;
        }
        if (oooooooo.f22393OooO0o0 || oooooooo.m20737OooO0O0() == 4) {
            return oooooooo.OooO0O0(oooooooo2);
        }
        return true;
    }

    private void OooO00o(View view, MotionEvent motionEvent, float[] fArr) {
        if (view == this.f22400OooO00o) {
            fArr[0] = motionEvent.getX();
            fArr[1] = motionEvent.getY();
        } else if (view == null || !(view.getParent() instanceof ViewGroup)) {
            throw new IllegalArgumentException("Parent is null? View is no longer in the tree");
        } else {
            ViewGroup viewGroup = (ViewGroup) view.getParent();
            OooO00o(viewGroup, motionEvent, fArr);
            PointF pointF = f22394OooO00o;
            OooO00o(fArr[0], fArr[1], viewGroup, view, pointF);
            fArr[0] = pointF.x;
            fArr[1] = pointF.y;
        }
    }

    private void OooO00o(C9063ooOoOooo oooooooo) {
        int i = 0;
        while (true) {
            int i2 = this.f22405OooO0O0;
            if (i >= i2) {
                C9063ooOoOooo[] ooooooooArr = this.f22407OooO0O0;
                if (i2 < ooooooooArr.length) {
                    this.f22405OooO0O0 = i2 + 1;
                    ooooooooArr[i2] = oooooooo;
                    oooooooo.f22393OooO0o0 = true;
                    int i3 = this.OooO0Oo;
                    this.OooO0Oo = i3 + 1;
                    oooooooo.f22392OooO0o0 = i3;
                    return;
                }
                throw new IllegalStateException("Too many recognizers");
            } else if (this.f22407OooO0O0[i] != oooooooo) {
                i++;
            } else {
                return;
            }
        }
    }

    private void OooO00o(C9063ooOoOooo oooooooo, View view) {
        int i = 0;
        while (true) {
            int i2 = this.f22399OooO00o;
            if (i >= i2) {
                C9063ooOoOooo[] ooooooooArr = this.f22404OooO00o;
                if (i2 < ooooooooArr.length) {
                    this.f22399OooO00o = i2 + 1;
                    ooooooooArr[i2] = oooooooo;
                    oooooooo.f22390OooO0Oo = false;
                    oooooooo.f22393OooO0o0 = false;
                    oooooooo.f22392OooO0o0 = Integer.MAX_VALUE;
                    oooooooo.OooO00o(view, this);
                    return;
                }
                throw new IllegalStateException("Too many recognizers");
            } else if (this.f22404OooO00o[i] != oooooooo) {
                i++;
            } else {
                return;
            }
        }
    }

    private boolean OooO00o(View view, float[] fArr, int i) {
        ArrayList<C9063ooOoOooo> OooO00o2 = this.f22402OooO00o.OooO00o(view);
        if (OooO00o2 == null) {
            return false;
        }
        int size = OooO00o2.size();
        boolean z = false;
        for (int i2 = 0; i2 < size; i2++) {
            C9063ooOoOooo oooooooo = OooO00o2.get(i2);
            if (oooooooo.m20736OooO00o() && oooooooo.OooO00o(view, fArr[0], fArr[1])) {
                OooO00o(oooooooo, view);
                oooooooo.OooO0O0(i);
                z = true;
            }
        }
        return z;
    }

    private boolean OooO00o(ViewGroup viewGroup, float[] fArr, int i) {
        boolean z;
        for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
            View OooO00o2 = this.f22401OooO00o.OooO00o(viewGroup, childCount);
            if (OooO00o(OooO00o2)) {
                PointF pointF = f22394OooO00o;
                OooO00o(fArr[0], fArr[1], viewGroup, OooO00o2, pointF);
                float f = fArr[0];
                float f2 = fArr[1];
                fArr[0] = pointF.x;
                fArr[1] = pointF.y;
                if (!OooO0O0(OooO00o2) || OooO00o(fArr[0], fArr[1], OooO00o2)) {
                    z = OooO0O0(OooO00o2, fArr, i);
                } else {
                    z = false;
                }
                fArr[0] = f;
                fArr[1] = f2;
                if (z) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean OooO00o(View view, float[] fArr) {
        if (!(!(view instanceof ViewGroup) || view.getBackground() != null) || !OooO00o(fArr[0], fArr[1], view)) {
            return false;
        }
        return true;
    }

    private boolean OooO00o(View view) {
        return view.getVisibility() == 0 && view.getAlpha() >= this.f22398OooO00o;
    }

    public static void OooO00o(float f, float f2, ViewGroup viewGroup, View view, PointF pointF) {
        float scrollX = (f + ((float) viewGroup.getScrollX())) - ((float) view.getLeft());
        float scrollY = (f2 + ((float) viewGroup.getScrollY())) - ((float) view.getTop());
        Matrix matrix = view.getMatrix();
        if (!matrix.isIdentity()) {
            float[] fArr = f22396OooO00o;
            fArr[0] = scrollX;
            fArr[1] = scrollY;
            Matrix matrix2 = OooO00o;
            matrix.invert(matrix2);
            matrix2.mapPoints(fArr);
            float f3 = fArr[0];
            scrollY = fArr[1];
            scrollX = f3;
        }
        pointF.set(scrollX, scrollY);
    }

    public static boolean OooO00o(float f, float f2, View view) {
        return f >= 0.0f && f <= ((float) view.getWidth()) && f2 >= 0.0f && f2 < ((float) view.getHeight());
    }

    public static boolean OooO00o(C9063ooOoOooo oooooooo, C9063ooOoOooo oooooooo2) {
        return oooooooo == oooooooo2 || oooooooo.OooO0OO(oooooooo2) || oooooooo2.OooO0OO(oooooooo);
    }
}

package com.p118pd.sdk;

import android.view.MotionEvent;
import android.view.View;
import com.p118pd.sdk.C9063ooOoOooo;
import java.util.Arrays;

/* renamed from: com.pd.sdk.ooOoOooo  reason: case insensitive filesystem */
public class C9063ooOoOooo<T extends C9063ooOoOooo> {
    public static final int OooO = 3;
    public static MotionEvent.PointerCoords[] OooO00o = null;

    /* renamed from: OooO00o  reason: collision with other field name */
    public static MotionEvent.PointerProperties[] f22374OooO00o = null;
    public static final int OooO0o = 0;
    public static final float OooO0oO = Float.NaN;

    /* renamed from: OooO0oO  reason: collision with other field name */
    public static final int f22375OooO0oO = 1;
    public static final int OooO0oo = 2;
    public static final int OooOO0 = 4;
    public static final int OooOO0O = 5;
    public static final int OooOO0o = 0;
    public static final int OooOOO = 2;
    public static final int OooOOO0 = 1;
    public static final int OooOOOO = 3;
    public static final int OooOOOo = 4;
    public static final int OooOOo = 1;
    public static final int OooOOo0 = 5;
    public static final int OooOOoo = 2;
    public static final int OooOo0 = 8;
    public static final int OooOo00 = 4;
    public static int OooOo0O = 11;

    /* renamed from: OooO00o  reason: collision with other field name */
    public float f22376OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public int f22377OooO00o = 0;

    /* renamed from: OooO00o  reason: collision with other field name */
    public View f22378OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public AbstractC9067ooOoo000 f22379OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C9066ooOoo00 f22380OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public AbstractC9071ooOoo0OO<T> f22381OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public boolean f22382OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public float[] f22383OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final int[] f22384OooO00o = new int[OooOo0O];
    public float OooO0O0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public int f22385OooO0O0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public boolean f22386OooO0O0 = true;
    public float OooO0OO;

    /* renamed from: OooO0OO  reason: collision with other field name */
    public int f22387OooO0OO = 0;

    /* renamed from: OooO0OO  reason: collision with other field name */
    public boolean f22388OooO0OO;
    public float OooO0Oo;

    /* renamed from: OooO0Oo  reason: collision with other field name */
    public int f22389OooO0Oo = 0;

    /* renamed from: OooO0Oo  reason: collision with other field name */
    public boolean f22390OooO0Oo;

    /* renamed from: OooO0o  reason: collision with other field name */
    public float f22391OooO0o;
    public float OooO0o0;

    /* renamed from: OooO0o0  reason: collision with other field name */
    public int f22392OooO0o0;

    /* renamed from: OooO0o0  reason: collision with other field name */
    public boolean f22393OooO0o0;

    public static String OooO00o(int i) {
        if (i == 0) {
            return "UNDETERMINED";
        }
        if (i == 1) {
            return "FAILED";
        }
        if (i == 2) {
            return "BEGIN";
        }
        if (i == 3) {
            return "CANCELLED";
        }
        if (i == 4) {
            return "ACTIVE";
        }
        if (i != 5) {
            return null;
        }
        return "END";
    }

    public static boolean OooO00o(float f) {
        return !Float.isNaN(f);
    }

    public static void OooO0Oo(int i) {
        if (f22374OooO00o == null) {
            int i2 = OooOo0O;
            f22374OooO00o = new MotionEvent.PointerProperties[i2];
            OooO00o = new MotionEvent.PointerCoords[i2];
        }
        while (i > 0) {
            MotionEvent.PointerProperties[] pointerPropertiesArr = f22374OooO00o;
            int i3 = i - 1;
            if (pointerPropertiesArr[i3] == null) {
                pointerPropertiesArr[i3] = new MotionEvent.PointerProperties();
                OooO00o[i3] = new MotionEvent.PointerCoords();
                i--;
            } else {
                return;
            }
        }
    }

    public T OooO0O0(boolean z) {
        this.f22388OooO0OO = z;
        return this;
    }

    public void OooO0O0(int i, int i2) {
    }

    /* renamed from: OooO0OO  reason: collision with other method in class */
    public int m20740OooO0OO() {
        return this.f22385OooO0O0;
    }

    public float OooO0o() {
        return this.OooO0O0;
    }

    /* renamed from: OooO0o  reason: collision with other method in class */
    public void m20745OooO0o() {
    }

    public float OooO0o0() {
        return this.f22376OooO00o;
    }

    public void OooO0oO() {
    }

    public final void OooO0oo() {
        this.f22378OooO00o = null;
        this.f22380OooO00o = null;
        Arrays.fill(this.f22384OooO00o, -1);
        this.f22377OooO00o = 0;
        OooO0oO();
    }

    public String toString() {
        View view = this.f22378OooO00o;
        String simpleName = view == null ? null : view.getClass().getSimpleName();
        return getClass().getSimpleName() + "@[" + this.f22385OooO0O0 + "]:" + simpleName;
    }

    private void OooO0o0(int i) {
        int i2 = this.f22387OooO0OO;
        if (i2 != i) {
            this.f22387OooO0OO = i;
            this.f22380OooO00o.OooO00o(this, i, i2);
            OooO0O0(i, i2);
        }
    }

    public void OooO00o(int i, int i2) {
        AbstractC9071ooOoo0OO<T> ooooo0oo = this.f22381OooO00o;
        if (ooooo0oo != null) {
            ooooo0oo.OooO00o(this, i, i2);
        }
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public boolean m20739OooO0O0() {
        return this.f22382OooO00o;
    }

    public void OooO0OO(int i) {
        int[] iArr = this.f22384OooO00o;
        if (iArr[i] != -1) {
            iArr[i] = -1;
            this.f22377OooO00o--;
        }
    }

    public void OooO0O0(int i) {
        int[] iArr = this.f22384OooO00o;
        if (iArr[i] == -1) {
            iArr[i] = OooO0Oo();
            this.f22377OooO00o++;
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m20735OooO00o(MotionEvent motionEvent) {
        AbstractC9071ooOoo0OO<T> ooooo0oo = this.f22381OooO00o;
        if (ooooo0oo != null) {
            ooooo0oo.OooO00o(this, motionEvent);
        }
    }

    /* renamed from: OooO0OO  reason: collision with other method in class */
    public boolean m20742OooO0OO() {
        int i;
        return (!this.f22386OooO0O0 || (i = this.f22387OooO0OO) == 1 || i == 3 || i == 5 || this.f22377OooO00o <= 0) ? false : true;
    }

    public boolean OooO00o(C9063ooOoOooo oooooooo) {
        int i = 0;
        while (true) {
            int[] iArr = this.f22384OooO00o;
            if (i >= iArr.length) {
                return false;
            }
            if (iArr[i] != -1 && oooooooo.f22384OooO00o[i] != -1) {
                return true;
            }
            i++;
        }
    }

    public final void OooO0O0(MotionEvent motionEvent) {
        int i;
        if (this.f22386OooO0O0 && (i = this.f22387OooO0OO) != 3 && i != 1 && i != 5 && this.f22377OooO00o >= 1) {
            MotionEvent OooO00o2 = OooO00o(motionEvent);
            this.f22376OooO00o = OooO00o2.getX();
            this.OooO0O0 = OooO00o2.getY();
            this.f22389OooO0Oo = OooO00o2.getPointerCount();
            boolean OooO00o3 = OooO00o(this.f22378OooO00o, this.f22376OooO00o, this.OooO0O0);
            this.f22382OooO00o = OooO00o3;
            if (!this.f22388OooO0OO || OooO00o3) {
                this.OooO0OO = C9065ooOoo0.OooO00o(OooO00o2, true);
                this.OooO0Oo = C9065ooOoo0.OooO0O0(OooO00o2, true);
                this.OooO0o0 = OooO00o2.getRawX() - OooO00o2.getX();
                this.f22391OooO0o = OooO00o2.getRawY() - OooO00o2.getY();
                OooO0OO(OooO00o2);
                if (OooO00o2 != motionEvent) {
                    OooO00o2.recycle();
                    return;
                }
                return;
            }
            int i2 = this.f22387OooO0OO;
            if (i2 == 4) {
                m20741OooO0OO();
            } else if (i2 == 2) {
                m20746OooO0o0();
            }
        }
    }

    public boolean OooO0OO(C9063ooOoOooo oooooooo) {
        if (oooooooo == this) {
            return true;
        }
        AbstractC9067ooOoo000 ooooo000 = this.f22379OooO00o;
        if (ooooo000 != null) {
            return ooooo000.OooO0Oo(this, oooooooo);
        }
        return false;
    }

    public boolean OooO0o0(C9063ooOoOooo oooooooo) {
        AbstractC9067ooOoo000 ooooo000;
        if (oooooooo == this || (ooooo000 = this.f22379OooO00o) == null) {
            return false;
        }
        return ooooo000.OooO00o(this, oooooooo);
    }

    private int OooO0Oo() {
        int i = 0;
        while (i < this.f22377OooO00o) {
            int i2 = 0;
            while (true) {
                int[] iArr = this.f22384OooO00o;
                if (i2 < iArr.length && iArr[i2] != i) {
                    i2++;
                }
            }
            if (i2 == this.f22384OooO00o.length) {
                return i;
            }
            i++;
        }
        return i;
    }

    public T OooO00o(boolean z) {
        if (this.f22378OooO00o != null) {
            m20741OooO0OO();
        }
        this.f22386OooO0O0 = z;
        return this;
    }

    /* renamed from: OooO0OO  reason: collision with other method in class */
    public final void m20741OooO0OO() {
        int i = this.f22387OooO0OO;
        if (i == 4 || i == 0 || i == 2) {
            m20745OooO0o();
            OooO0o0(3);
        }
    }

    /* renamed from: OooO0o0  reason: collision with other method in class */
    public final void m20746OooO0o0() {
        int i = this.f22387OooO0OO;
        if (i == 4 || i == 0 || i == 2) {
            OooO0o0(1);
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m20736OooO00o() {
        return this.f22386OooO0O0;
    }

    public void OooO0OO(MotionEvent motionEvent) {
        OooO0o0(1);
    }

    public boolean OooO0Oo(C9063ooOoOooo oooooooo) {
        AbstractC9067ooOoo000 ooooo000;
        if (oooooooo == this || (ooooo000 = this.f22379OooO00o) == null) {
            return false;
        }
        return ooooo000.OooO0O0(this, oooooooo);
    }

    public T OooO00o(float f, float f2, float f3, float f4, float f5, float f6) {
        if (this.f22383OooO00o == null) {
            this.f22383OooO00o = new float[6];
        }
        float[] fArr = this.f22383OooO00o;
        fArr[0] = f;
        fArr[1] = f2;
        fArr[2] = f3;
        fArr[3] = f4;
        fArr[4] = f5;
        fArr[5] = f6;
        if (OooO00o(f5) && OooO00o(f) && OooO00o(f3)) {
            throw new IllegalArgumentException("Cannot have all of left, right and width defined");
        } else if (OooO00o(f5) && !OooO00o(f) && !OooO00o(f3)) {
            throw new IllegalArgumentException("When width is set one of left or right pads need to be defined");
        } else if (OooO00o(f6) && OooO00o(f4) && OooO00o(f2)) {
            throw new IllegalArgumentException("Cannot have all of top, bottom and height defined");
        } else if (!OooO00o(f6) || OooO00o(f4) || OooO00o(f2)) {
            return this;
        } else {
            throw new IllegalArgumentException("When height is set one of top or bottom pads need to be defined");
        }
    }

    public float OooO0OO() {
        return this.OooO0OO - this.OooO0o0;
    }

    /* renamed from: OooO0Oo  reason: collision with other method in class */
    public final void m20744OooO0Oo() {
        int i = this.f22387OooO0OO;
        if (i == 2 || i == 4) {
            OooO0o0(5);
        }
    }

    /* renamed from: OooO0Oo  reason: collision with other method in class */
    public float m20743OooO0Oo() {
        return this.OooO0Oo - this.f22391OooO0o;
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public int m20737OooO0O0() {
        return this.f22387OooO0OO;
    }

    public boolean OooO0O0(C9063ooOoOooo oooooooo) {
        AbstractC9067ooOoo000 ooooo000;
        if (oooooooo == this || (ooooo000 = this.f22379OooO00o) == null) {
            return false;
        }
        return ooooo000.OooO0OO(this, oooooooo);
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public final void m20738OooO0O0() {
        if (this.f22387OooO0OO == 0) {
            OooO0o0(2);
        }
    }

    public float OooO0O0() {
        return this.OooO0Oo;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public T m20732OooO00o(float f) {
        return OooO00o(f, f, f, f, Float.NaN, Float.NaN);
    }

    public T OooO00o(AbstractC9067ooOoo000 ooooo000) {
        this.f22379OooO00o = ooooo000;
        return this;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m20734OooO00o(int i) {
        this.f22385OooO0O0 = i;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public View m20731OooO00o() {
        return this.f22378OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public int m20730OooO00o() {
        return this.f22389OooO0Oo;
    }

    public final void OooO00o(View view, C9066ooOoo00 ooooo00) {
        if (this.f22378OooO00o == null && this.f22380OooO00o == null) {
            Arrays.fill(this.f22384OooO00o, -1);
            this.f22377OooO00o = 0;
            this.f22387OooO0OO = 0;
            this.f22378OooO00o = view;
            this.f22380OooO00o = ooooo00;
            return;
        }
        throw new IllegalStateException("Already prepared or hasn't been reset");
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    private boolean m20729OooO00o(MotionEvent motionEvent) {
        if (motionEvent.getPointerCount() != this.f22377OooO00o) {
            return true;
        }
        int i = 0;
        while (true) {
            int[] iArr = this.f22384OooO00o;
            if (i >= iArr.length) {
                return false;
            }
            if (iArr[i] != -1 && iArr[i] != i) {
                return true;
            }
            i++;
        }
    }

    private MotionEvent OooO00o(MotionEvent motionEvent) {
        int i;
        if (!m20729OooO00o(motionEvent)) {
            return motionEvent;
        }
        int actionMasked = motionEvent.getActionMasked();
        int i2 = 2;
        int i3 = 5;
        if (actionMasked == 0 || actionMasked == 5) {
            int actionIndex = motionEvent.getActionIndex();
            if (this.f22384OooO00o[motionEvent.getPointerId(actionIndex)] != -1) {
                if (this.f22377OooO00o == 1) {
                    i3 = 0;
                }
                i2 = i3;
            }
            i = actionIndex;
            actionMasked = i2;
        } else {
            int i4 = 6;
            if (actionMasked == 1 || actionMasked == 6) {
                int actionIndex2 = motionEvent.getActionIndex();
                if (this.f22384OooO00o[motionEvent.getPointerId(actionIndex2)] != -1) {
                    if (this.f22377OooO00o == 1) {
                        i4 = 1;
                    }
                    i = actionIndex2;
                    actionMasked = i4;
                } else {
                    i = actionIndex2;
                    actionMasked = 2;
                }
            } else {
                i = -1;
            }
        }
        OooO0Oo(this.f22377OooO00o);
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        motionEvent.setLocation(motionEvent.getRawX(), motionEvent.getRawY());
        int pointerCount = motionEvent.getPointerCount();
        int i5 = actionMasked;
        int i6 = 0;
        for (int i7 = 0; i7 < pointerCount; i7++) {
            int pointerId = motionEvent.getPointerId(i7);
            if (this.f22384OooO00o[pointerId] != -1) {
                motionEvent.getPointerProperties(i7, f22374OooO00o[i6]);
                f22374OooO00o[i6].id = this.f22384OooO00o[pointerId];
                motionEvent.getPointerCoords(i7, OooO00o[i6]);
                if (i7 == i) {
                    i5 |= i6 << 8;
                }
                i6++;
            }
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent.getDownTime(), motionEvent.getEventTime(), i5, i6, f22374OooO00o, OooO00o, motionEvent.getMetaState(), motionEvent.getButtonState(), motionEvent.getXPrecision(), motionEvent.getYPrecision(), motionEvent.getDeviceId(), motionEvent.getEdgeFlags(), motionEvent.getSource(), motionEvent.getFlags());
        motionEvent.setLocation(x, y);
        obtain.setLocation(x, y);
        return obtain;
    }

    public boolean OooO00o(View view, float f, float f2) {
        float f3;
        float width = (float) view.getWidth();
        float height = (float) view.getHeight();
        float[] fArr = this.f22383OooO00o;
        float f4 = 0.0f;
        if (fArr != null) {
            float f5 = fArr[0];
            float f6 = fArr[1];
            float f7 = fArr[2];
            float f8 = fArr[3];
            float f9 = OooO00o(f5) ? 0.0f - f5 : 0.0f;
            if (OooO00o(f6)) {
                f4 = 0.0f - f8;
            }
            if (OooO00o(f7)) {
                width += f7;
            }
            if (OooO00o(f8)) {
                height += f8;
            }
            float[] fArr2 = this.f22383OooO00o;
            float f10 = fArr2[4];
            float f11 = fArr2[5];
            if (OooO00o(f10)) {
                if (!OooO00o(f5)) {
                    f9 = width - f10;
                } else if (!OooO00o(f7)) {
                    width = f10 + f9;
                }
            }
            if (OooO00o(f11)) {
                if (!OooO00o(f4)) {
                    f4 = height - f11;
                } else if (!OooO00o(height)) {
                    height = f4 + f11;
                }
            }
            f3 = f4;
            f4 = f9;
        } else {
            f3 = 0.0f;
        }
        if (f < f4 || f > width || f2 < f3 || f2 > height) {
            return false;
        }
        return true;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public final void m20733OooO00o() {
        int i = this.f22387OooO0OO;
        if (i == 0 || i == 2) {
            OooO0o0(4);
        }
    }

    public C9063ooOoOooo OooO00o(AbstractC9071ooOoo0OO<T> ooooo0oo) {
        this.f22381OooO00o = ooooo0oo;
        return this;
    }

    public float OooO00o() {
        return this.OooO0OO;
    }
}

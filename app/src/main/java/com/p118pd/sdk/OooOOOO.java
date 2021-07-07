package com.p118pd.sdk;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.SparseArray;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: com.pd.sdk.OooOOOO */
public class OooOOOO extends Drawable implements Drawable.Callback {
    public static final boolean OooO0Oo = false;
    public static final boolean OooO0o0 = true;
    public static final String o0ooOOo = "DrawableContainer";
    public long OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Rect f17092OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Drawable f17093OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public OooO0O0 f17094OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public OooO0OO f17095OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Runnable f17096OooO00o;
    public long OooO0O0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public Drawable f17097OooO0O0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public boolean f17098OooO0O0;
    public boolean OooO0OO;
    public int o00oO0O = 255;
    public int o0ooOO0 = -1;

    /* renamed from: o0ooOOo  reason: collision with other field name */
    public int f17099o0ooOOo = -1;

    /* renamed from: com.pd.sdk.OooOOOO$OooO00o */
    public class OooO00o implements Runnable {
        public OooO00o() {
        }

        public void run() {
            OooOOOO.this.OooO00o(true);
            OooOOOO.this.invalidateSelf();
        }
    }

    /* renamed from: com.pd.sdk.OooOOOO$OooO0O0 */
    public static class OooO0O0 implements Drawable.Callback {
        public Drawable.Callback OooO00o;

        public OooO0O0 OooO00o(Drawable.Callback callback) {
            this.OooO00o = callback;
            return this;
        }

        public void invalidateDrawable(@NonNull Drawable drawable) {
        }

        public void scheduleDrawable(@NonNull Drawable drawable, @NonNull Runnable runnable, long j) {
            Drawable.Callback callback = this.OooO00o;
            if (callback != null) {
                callback.scheduleDrawable(drawable, runnable, j);
            }
        }

        public void unscheduleDrawable(@NonNull Drawable drawable, @NonNull Runnable runnable) {
            Drawable.Callback callback = this.OooO00o;
            if (callback != null) {
                callback.unscheduleDrawable(drawable, runnable);
            }
        }

        public Drawable.Callback OooO00o() {
            Drawable.Callback callback = this.OooO00o;
            this.OooO00o = null;
            return callback;
        }
    }

    /* renamed from: com.pd.sdk.OooOOOO$OooO0OO */
    public static abstract class OooO0OO extends Drawable.ConstantState {
        public int OooO;

        /* renamed from: OooO  reason: collision with other field name */
        public boolean f17100OooO;
        public int OooO00o = 160;

        /* renamed from: OooO00o  reason: collision with other field name */
        public ColorStateList f17101OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public Resources f17102OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public ColorFilter f17103OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public PorterDuff.Mode f17104OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public Rect f17105OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public SparseArray<Drawable.ConstantState> f17106OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final OooOOOO f17107OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public boolean f17108OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public Drawable[] f17109OooO00o;
        public int OooO0O0;

        /* renamed from: OooO0O0  reason: collision with other field name */
        public boolean f17110OooO0O0;
        public int OooO0OO;

        /* renamed from: OooO0OO  reason: collision with other field name */
        public boolean f17111OooO0OO;
        public int OooO0Oo;

        /* renamed from: OooO0Oo  reason: collision with other field name */
        public boolean f17112OooO0Oo;
        public int OooO0o;

        /* renamed from: OooO0o  reason: collision with other field name */
        public boolean f17113OooO0o;
        public int OooO0o0;

        /* renamed from: OooO0o0  reason: collision with other field name */
        public boolean f17114OooO0o0;
        public int OooO0oO;

        /* renamed from: OooO0oO  reason: collision with other field name */
        public boolean f17115OooO0oO;
        public int OooO0oo;

        /* renamed from: OooO0oo  reason: collision with other field name */
        public boolean f17116OooO0oo;
        public int OooOO0;

        /* renamed from: OooOO0  reason: collision with other field name */
        public boolean f17117OooOO0;
        public int OooOO0O;

        /* renamed from: OooOO0O  reason: collision with other field name */
        public boolean f17118OooOO0O;
        public int OooOO0o;

        /* renamed from: OooOO0o  reason: collision with other field name */
        public boolean f17119OooOO0o;
        public boolean OooOOO;
        public boolean OooOOO0;
        public boolean OooOOOO;

        public OooO0OO(OooO0OO oooO0OO, OooOOOO oooOOOO, Resources resources) {
            Resources resources2;
            this.f17108OooO00o = false;
            this.f17111OooO0OO = false;
            this.f17117OooOO0 = true;
            this.OooOO0O = 0;
            this.OooOO0o = 0;
            this.f17107OooO00o = oooOOOO;
            if (resources != null) {
                resources2 = resources;
            } else {
                resources2 = oooO0OO != null ? oooO0OO.f17102OooO00o : null;
            }
            this.f17102OooO00o = resources2;
            int OooO00o2 = OooOOOO.OooO00o(resources, oooO0OO != null ? oooO0OO.OooO00o : 0);
            this.OooO00o = OooO00o2;
            if (oooO0OO != null) {
                this.OooO0O0 = oooO0OO.OooO0O0;
                this.OooO0OO = oooO0OO.OooO0OO;
                this.f17116OooO0oo = true;
                this.f17100OooO = true;
                this.f17108OooO00o = oooO0OO.f17108OooO00o;
                this.f17111OooO0OO = oooO0OO.f17111OooO0OO;
                this.f17117OooOO0 = oooO0OO.f17117OooOO0;
                this.f17118OooOO0O = oooO0OO.f17118OooOO0O;
                this.OooOO0 = oooO0OO.OooOO0;
                this.OooOO0O = oooO0OO.OooOO0O;
                this.OooOO0o = oooO0OO.OooOO0o;
                this.f17119OooOO0o = oooO0OO.f17119OooOO0o;
                this.f17103OooO00o = oooO0OO.f17103OooO00o;
                this.OooOOO0 = oooO0OO.OooOOO0;
                this.f17101OooO00o = oooO0OO.f17101OooO00o;
                this.f17104OooO00o = oooO0OO.f17104OooO00o;
                this.OooOOO = oooO0OO.OooOOO;
                this.OooOOOO = oooO0OO.OooOOOO;
                if (oooO0OO.OooO00o == OooO00o2) {
                    if (oooO0OO.f17110OooO0O0) {
                        this.f17105OooO00o = new Rect(oooO0OO.f17105OooO00o);
                        this.f17110OooO0O0 = true;
                    }
                    if (oooO0OO.f17112OooO0Oo) {
                        this.OooO0o0 = oooO0OO.OooO0o0;
                        this.OooO0o = oooO0OO.OooO0o;
                        this.OooO0oO = oooO0OO.OooO0oO;
                        this.OooO0oo = oooO0OO.OooO0oo;
                        this.f17112OooO0Oo = true;
                    }
                }
                if (oooO0OO.f17114OooO0o0) {
                    this.OooO = oooO0OO.OooO;
                    this.f17114OooO0o0 = true;
                }
                if (oooO0OO.f17113OooO0o) {
                    this.f17115OooO0oO = oooO0OO.f17115OooO0oO;
                    this.f17113OooO0o = true;
                }
                Drawable[] drawableArr = oooO0OO.f17109OooO00o;
                this.f17109OooO00o = new Drawable[drawableArr.length];
                this.OooO0Oo = oooO0OO.OooO0Oo;
                SparseArray<Drawable.ConstantState> sparseArray = oooO0OO.f17106OooO00o;
                if (sparseArray != null) {
                    this.f17106OooO00o = sparseArray.clone();
                } else {
                    this.f17106OooO00o = new SparseArray<>(this.OooO0Oo);
                }
                int i = this.OooO0Oo;
                for (int i2 = 0; i2 < i; i2++) {
                    if (drawableArr[i2] != null) {
                        Drawable.ConstantState constantState = drawableArr[i2].getConstantState();
                        if (constantState != null) {
                            this.f17106OooO00o.put(i2, constantState);
                        } else {
                            this.f17109OooO00o[i2] = drawableArr[i2];
                        }
                    }
                }
                return;
            }
            this.f17109OooO00o = new Drawable[10];
            this.OooO0Oo = 0;
        }

        private void OooO0o0() {
            SparseArray<Drawable.ConstantState> sparseArray = this.f17106OooO00o;
            if (sparseArray != null) {
                int size = sparseArray.size();
                for (int i = 0; i < size; i++) {
                    this.f17109OooO00o[this.f17106OooO00o.keyAt(i)] = OooO00o(this.f17106OooO00o.valueAt(i).newDrawable(this.f17102OooO00o));
                }
                this.f17106OooO00o = null;
            }
        }

        public final int OooO() {
            if (this.f17114OooO0o0) {
                return this.OooO;
            }
            OooO0o0();
            int i = this.OooO0Oo;
            Drawable[] drawableArr = this.f17109OooO00o;
            int opacity = i > 0 ? drawableArr[0].getOpacity() : -2;
            for (int i2 = 1; i2 < i; i2++) {
                opacity = Drawable.resolveOpacity(opacity, drawableArr[i2].getOpacity());
            }
            this.OooO = opacity;
            this.f17114OooO0o0 = true;
            return opacity;
        }

        /* renamed from: OooO00o  reason: collision with other method in class */
        public final int m16722OooO00o(Drawable drawable) {
            int i = this.OooO0Oo;
            if (i >= this.f17109OooO00o.length) {
                OooO00o(i, i + 10);
            }
            drawable.mutate();
            drawable.setVisible(false, true);
            drawable.setCallback(this.f17107OooO00o);
            this.f17109OooO00o[i] = drawable;
            this.OooO0Oo++;
            this.OooO0OO = drawable.getChangingConfigurations() | this.OooO0OO;
            m16730OooO0OO();
            this.f17105OooO00o = null;
            this.f17110OooO0O0 = false;
            this.f17112OooO0Oo = false;
            this.f17116OooO0oo = false;
            return i;
        }

        public final int OooO0O0() {
            return this.OooO0Oo;
        }

        /* renamed from: OooO0OO  reason: collision with other method in class */
        public void m16730OooO0OO() {
            this.f17114OooO0o0 = false;
            this.f17113OooO0o = false;
        }

        /* renamed from: OooO0Oo  reason: collision with other method in class */
        public void m16732OooO0Oo() {
            int i = this.OooO0Oo;
            Drawable[] drawableArr = this.f17109OooO00o;
            for (int i2 = 0; i2 < i; i2++) {
                if (drawableArr[i2] != null) {
                    drawableArr[i2].mutate();
                }
            }
            this.f17118OooOO0O = true;
        }

        public final int OooO0o() {
            if (!this.f17112OooO0Oo) {
                m16728OooO0O0();
            }
            return this.OooO0o0;
        }

        public final int OooO0oO() {
            return this.OooOO0O;
        }

        public final int OooO0oo() {
            return this.OooOO0o;
        }

        @RequiresApi(21)
        public boolean canApplyTheme() {
            int i = this.OooO0Oo;
            Drawable[] drawableArr = this.f17109OooO00o;
            for (int i2 = 0; i2 < i; i2++) {
                Drawable drawable = drawableArr[i2];
                if (drawable == null) {
                    Drawable.ConstantState constantState = this.f17106OooO00o.get(i2);
                    if (constantState != null && constantState.canApplyTheme()) {
                        return true;
                    }
                } else if (drawable.canApplyTheme()) {
                    return true;
                }
            }
            return false;
        }

        public int getChangingConfigurations() {
            return this.OooO0O0 | this.OooO0OO;
        }

        public final void OooO0O0(boolean z) {
            this.f17108OooO00o = z;
        }

        /* renamed from: OooO0O0  reason: collision with other method in class */
        public final boolean m16729OooO0O0() {
            return this.f17111OooO0OO;
        }

        public final int OooO0OO() {
            if (!this.f17112OooO0Oo) {
                m16728OooO0O0();
            }
            return this.OooO0o;
        }

        /* renamed from: OooO0O0  reason: collision with other method in class */
        public void m16728OooO0O0() {
            this.f17112OooO0Oo = true;
            OooO0o0();
            int i = this.OooO0Oo;
            Drawable[] drawableArr = this.f17109OooO00o;
            this.OooO0o = -1;
            this.OooO0o0 = -1;
            this.OooO0oo = 0;
            this.OooO0oO = 0;
            for (int i2 = 0; i2 < i; i2++) {
                Drawable drawable = drawableArr[i2];
                int intrinsicWidth = drawable.getIntrinsicWidth();
                if (intrinsicWidth > this.OooO0o0) {
                    this.OooO0o0 = intrinsicWidth;
                }
                int intrinsicHeight = drawable.getIntrinsicHeight();
                if (intrinsicHeight > this.OooO0o) {
                    this.OooO0o = intrinsicHeight;
                }
                int minimumWidth = drawable.getMinimumWidth();
                if (minimumWidth > this.OooO0oO) {
                    this.OooO0oO = minimumWidth;
                }
                int minimumHeight = drawable.getMinimumHeight();
                if (minimumHeight > this.OooO0oo) {
                    this.OooO0oo = minimumHeight;
                }
            }
        }

        /* renamed from: OooO0OO  reason: collision with other method in class */
        public final boolean m16731OooO0OO() {
            if (this.f17113OooO0o) {
                return this.f17115OooO0oO;
            }
            OooO0o0();
            int i = this.OooO0Oo;
            Drawable[] drawableArr = this.f17109OooO00o;
            boolean z = false;
            int i2 = 0;
            while (true) {
                if (i2 >= i) {
                    break;
                } else if (drawableArr[i2].isStateful()) {
                    z = true;
                    break;
                } else {
                    i2++;
                }
            }
            this.f17115OooO0oO = z;
            this.f17113OooO0o = true;
            return z;
        }

        public final int OooO0Oo() {
            if (!this.f17112OooO0Oo) {
                m16728OooO0O0();
            }
            return this.OooO0oo;
        }

        /* renamed from: OooO0o0  reason: collision with other method in class */
        public final int m16733OooO0o0() {
            if (!this.f17112OooO0Oo) {
                m16728OooO0O0();
            }
            return this.OooO0oO;
        }

        public final int OooO00o() {
            return this.f17109OooO00o.length;
        }

        private Drawable OooO00o(Drawable drawable) {
            if (Build.VERSION.SDK_INT >= 23) {
                drawable.setLayoutDirection(this.OooOO0);
            }
            Drawable mutate = drawable.mutate();
            mutate.setCallback(this.f17107OooO00o);
            return mutate;
        }

        public final void OooO0O0(int i) {
            this.OooOO0o = i;
        }

        public final Drawable OooO00o(int i) {
            int indexOfKey;
            Drawable drawable = this.f17109OooO00o[i];
            if (drawable != null) {
                return drawable;
            }
            SparseArray<Drawable.ConstantState> sparseArray = this.f17106OooO00o;
            if (sparseArray == null || (indexOfKey = sparseArray.indexOfKey(i)) < 0) {
                return null;
            }
            Drawable OooO00o2 = OooO00o(this.f17106OooO00o.valueAt(indexOfKey).newDrawable(this.f17102OooO00o));
            this.f17109OooO00o[i] = OooO00o2;
            this.f17106OooO00o.removeAt(indexOfKey);
            if (this.f17106OooO00o.size() == 0) {
                this.f17106OooO00o = null;
            }
            return OooO00o2;
        }

        /* renamed from: OooO00o  reason: collision with other method in class */
        public final boolean m16727OooO00o(int i, int i2) {
            int i3 = this.OooO0Oo;
            Drawable[] drawableArr = this.f17109OooO00o;
            boolean z = false;
            for (int i4 = 0; i4 < i3; i4++) {
                if (drawableArr[i4] != null) {
                    boolean layoutDirection = Build.VERSION.SDK_INT >= 23 ? drawableArr[i4].setLayoutDirection(i) : false;
                    if (i4 == i2) {
                        z = layoutDirection;
                    }
                }
            }
            this.OooOO0 = i;
            return z;
        }

        public final void OooO00o(Resources resources) {
            if (resources != null) {
                this.f17102OooO00o = resources;
                int OooO00o2 = OooOOOO.OooO00o(resources, this.OooO00o);
                int i = this.OooO00o;
                this.OooO00o = OooO00o2;
                if (i != OooO00o2) {
                    this.f17112OooO0Oo = false;
                    this.f17110OooO0O0 = false;
                }
            }
        }

        @RequiresApi(21)
        public final void OooO00o(Resources.Theme theme) {
            if (theme != null) {
                OooO0o0();
                int i = this.OooO0Oo;
                Drawable[] drawableArr = this.f17109OooO00o;
                for (int i2 = 0; i2 < i; i2++) {
                    if (drawableArr[i2] != null && drawableArr[i2].canApplyTheme()) {
                        drawableArr[i2].applyTheme(theme);
                        this.OooO0OO |= drawableArr[i2].getChangingConfigurations();
                    }
                }
                OooO00o(theme.getResources());
            }
        }

        /* renamed from: OooO00o  reason: collision with other method in class */
        public final void m16724OooO00o() {
            this.f17118OooOO0O = false;
        }

        /* renamed from: OooO00o  reason: collision with other method in class */
        public final Rect m16723OooO00o() {
            Rect rect = null;
            if (this.f17108OooO00o) {
                return null;
            }
            if (this.f17105OooO00o != null || this.f17110OooO0O0) {
                return this.f17105OooO00o;
            }
            OooO0o0();
            Rect rect2 = new Rect();
            int i = this.OooO0Oo;
            Drawable[] drawableArr = this.f17109OooO00o;
            for (int i2 = 0; i2 < i; i2++) {
                if (drawableArr[i2].getPadding(rect2)) {
                    if (rect == null) {
                        rect = new Rect(0, 0, 0, 0);
                    }
                    int i3 = rect2.left;
                    if (i3 > rect.left) {
                        rect.left = i3;
                    }
                    int i4 = rect2.top;
                    if (i4 > rect.top) {
                        rect.top = i4;
                    }
                    int i5 = rect2.right;
                    if (i5 > rect.right) {
                        rect.right = i5;
                    }
                    int i6 = rect2.bottom;
                    if (i6 > rect.bottom) {
                        rect.bottom = i6;
                    }
                }
            }
            this.f17110OooO0O0 = true;
            this.f17105OooO00o = rect;
            return rect;
        }

        public final void OooO00o(boolean z) {
            this.f17111OooO0OO = z;
        }

        /* renamed from: OooO00o  reason: collision with other method in class */
        public final void m16725OooO00o(int i) {
            this.OooOO0O = i;
        }

        public void OooO00o(int i, int i2) {
            Drawable[] drawableArr = new Drawable[i2];
            System.arraycopy(this.f17109OooO00o, 0, drawableArr, 0, i);
            this.f17109OooO00o = drawableArr;
        }

        /* renamed from: OooO00o  reason: collision with other method in class */
        public synchronized boolean m16726OooO00o() {
            if (this.f17116OooO0oo) {
                return this.f17100OooO;
            }
            OooO0o0();
            this.f17116OooO0oo = true;
            int i = this.OooO0Oo;
            Drawable[] drawableArr = this.f17109OooO00o;
            for (int i2 = 0; i2 < i; i2++) {
                if (drawableArr[i2].getConstantState() == null) {
                    this.f17100OooO = false;
                    return false;
                }
            }
            this.f17100OooO = true;
            return true;
        }
    }

    @SuppressLint({"WrongConstant"})
    @TargetApi(23)
    private boolean OooO00o() {
        return isAutoMirrored() && getLayoutDirection() == 1;
    }

    public void OooO0O0(int i) {
        this.f17095OooO00o.OooOO0O = i;
    }

    public void OooO0OO(int i) {
        this.f17095OooO00o.OooOO0o = i;
    }

    @RequiresApi(21)
    public void applyTheme(@NonNull Resources.Theme theme) {
        this.f17095OooO00o.OooO00o(theme);
    }

    @RequiresApi(21)
    public boolean canApplyTheme() {
        return this.f17095OooO00o.canApplyTheme();
    }

    public void draw(@NonNull Canvas canvas) {
        Drawable drawable = this.f17093OooO00o;
        if (drawable != null) {
            drawable.draw(canvas);
        }
        Drawable drawable2 = this.f17097OooO0O0;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
    }

    public int getAlpha() {
        return this.o00oO0O;
    }

    public int getChangingConfigurations() {
        return super.getChangingConfigurations() | this.f17095OooO00o.getChangingConfigurations();
    }

    public final Drawable.ConstantState getConstantState() {
        if (!this.f17095OooO00o.m16726OooO00o()) {
            return null;
        }
        this.f17095OooO00o.OooO0O0 = getChangingConfigurations();
        return this.f17095OooO00o;
    }

    @NonNull
    public Drawable getCurrent() {
        return this.f17093OooO00o;
    }

    public void getHotspotBounds(@NonNull Rect rect) {
        Rect rect2 = this.f17092OooO00o;
        if (rect2 != null) {
            rect.set(rect2);
        } else {
            super.getHotspotBounds(rect);
        }
    }

    public int getIntrinsicHeight() {
        if (this.f17095OooO00o.m16729OooO0O0()) {
            return this.f17095OooO00o.OooO0OO();
        }
        Drawable drawable = this.f17093OooO00o;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return -1;
    }

    public int getIntrinsicWidth() {
        if (this.f17095OooO00o.m16729OooO0O0()) {
            return this.f17095OooO00o.OooO0o();
        }
        Drawable drawable = this.f17093OooO00o;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return -1;
    }

    public int getMinimumHeight() {
        if (this.f17095OooO00o.m16729OooO0O0()) {
            return this.f17095OooO00o.OooO0Oo();
        }
        Drawable drawable = this.f17093OooO00o;
        if (drawable != null) {
            return drawable.getMinimumHeight();
        }
        return 0;
    }

    public int getMinimumWidth() {
        if (this.f17095OooO00o.m16729OooO0O0()) {
            return this.f17095OooO00o.m16733OooO0o0();
        }
        Drawable drawable = this.f17093OooO00o;
        if (drawable != null) {
            return drawable.getMinimumWidth();
        }
        return 0;
    }

    public int getOpacity() {
        Drawable drawable = this.f17093OooO00o;
        if (drawable == null || !drawable.isVisible()) {
            return -2;
        }
        return this.f17095OooO00o.OooO();
    }

    @RequiresApi(21)
    public void getOutline(@NonNull Outline outline) {
        Drawable drawable = this.f17093OooO00o;
        if (drawable != null) {
            drawable.getOutline(outline);
        }
    }

    public boolean getPadding(@NonNull Rect rect) {
        boolean z;
        Rect OooO00o2 = this.f17095OooO00o.m16723OooO00o();
        if (OooO00o2 != null) {
            rect.set(OooO00o2);
            z = (OooO00o2.right | ((OooO00o2.left | OooO00o2.top) | OooO00o2.bottom)) != 0;
        } else {
            Drawable drawable = this.f17093OooO00o;
            if (drawable != null) {
                z = drawable.getPadding(rect);
            } else {
                z = super.getPadding(rect);
            }
        }
        if (OooO00o()) {
            int i = rect.left;
            rect.left = rect.right;
            rect.right = i;
        }
        return z;
    }

    public void invalidateDrawable(@NonNull Drawable drawable) {
        OooO0OO oooO0OO = this.f17095OooO00o;
        if (oooO0OO != null) {
            oooO0OO.m16730OooO0OO();
        }
        if (drawable == this.f17093OooO00o && getCallback() != null) {
            getCallback().invalidateDrawable(this);
        }
    }

    public boolean isAutoMirrored() {
        return this.f17095OooO00o.f17119OooOO0o;
    }

    public boolean isStateful() {
        return this.f17095OooO00o.m16731OooO0OO();
    }

    public void jumpToCurrentState() {
        boolean z;
        Drawable drawable = this.f17097OooO0O0;
        boolean z2 = true;
        if (drawable != null) {
            drawable.jumpToCurrentState();
            this.f17097OooO0O0 = null;
            this.f17099o0ooOOo = -1;
            z = true;
        } else {
            z = false;
        }
        Drawable drawable2 = this.f17093OooO00o;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
            if (this.f17098OooO0O0) {
                this.f17093OooO00o.setAlpha(this.o00oO0O);
            }
        }
        if (this.OooO0O0 != 0) {
            this.OooO0O0 = 0;
            z = true;
        }
        if (this.OooO00o != 0) {
            this.OooO00o = 0;
        } else {
            z2 = z;
        }
        if (z2) {
            invalidateSelf();
        }
    }

    @NonNull
    public Drawable mutate() {
        if (!this.OooO0OO && super.mutate() == this) {
            OooO0OO OooO00o2 = m16719OooO00o();
            OooO00o2.m16732OooO0Oo();
            OooO00o(OooO00o2);
            this.OooO0OO = true;
        }
        return this;
    }

    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.f17097OooO0O0;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
        Drawable drawable2 = this.f17093OooO00o;
        if (drawable2 != null) {
            drawable2.setBounds(rect);
        }
    }

    public boolean onLayoutDirectionChanged(int i) {
        return this.f17095OooO00o.m16727OooO00o(i, m16718OooO00o());
    }

    public boolean onLevelChange(int i) {
        Drawable drawable = this.f17097OooO0O0;
        if (drawable != null) {
            return drawable.setLevel(i);
        }
        Drawable drawable2 = this.f17093OooO00o;
        if (drawable2 != null) {
            return drawable2.setLevel(i);
        }
        return false;
    }

    public boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f17097OooO0O0;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        Drawable drawable2 = this.f17093OooO00o;
        if (drawable2 != null) {
            return drawable2.setState(iArr);
        }
        return false;
    }

    public void scheduleDrawable(@NonNull Drawable drawable, @NonNull Runnable runnable, long j) {
        if (drawable == this.f17093OooO00o && getCallback() != null) {
            getCallback().scheduleDrawable(this, runnable, j);
        }
    }

    public void setAlpha(int i) {
        if (!this.f17098OooO0O0 || this.o00oO0O != i) {
            this.f17098OooO0O0 = true;
            this.o00oO0O = i;
            Drawable drawable = this.f17093OooO00o;
            if (drawable == null) {
                return;
            }
            if (this.OooO00o == 0) {
                drawable.setAlpha(i);
            } else {
                OooO00o(false);
            }
        }
    }

    public void setAutoMirrored(boolean z) {
        OooO0OO oooO0OO = this.f17095OooO00o;
        if (oooO0OO.f17119OooOO0o != z) {
            oooO0OO.f17119OooOO0o = z;
            Drawable drawable = this.f17093OooO00o;
            if (drawable != null) {
                C7043o00O0000.OooO00o(drawable, z);
            }
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        OooO0OO oooO0OO = this.f17095OooO00o;
        oooO0OO.OooOOO0 = true;
        if (oooO0OO.f17103OooO00o != colorFilter) {
            oooO0OO.f17103OooO00o = colorFilter;
            Drawable drawable = this.f17093OooO00o;
            if (drawable != null) {
                drawable.setColorFilter(colorFilter);
            }
        }
    }

    public void setDither(boolean z) {
        OooO0OO oooO0OO = this.f17095OooO00o;
        if (oooO0OO.f17117OooOO0 != z) {
            oooO0OO.f17117OooOO0 = z;
            Drawable drawable = this.f17093OooO00o;
            if (drawable != null) {
                drawable.setDither(z);
            }
        }
    }

    public void setHotspot(float f, float f2) {
        Drawable drawable = this.f17093OooO00o;
        if (drawable != null) {
            C7043o00O0000.OooO00o(drawable, f, f2);
        }
    }

    public void setHotspotBounds(int i, int i2, int i3, int i4) {
        Rect rect = this.f17092OooO00o;
        if (rect == null) {
            this.f17092OooO00o = new Rect(i, i2, i3, i4);
        } else {
            rect.set(i, i2, i3, i4);
        }
        Drawable drawable = this.f17093OooO00o;
        if (drawable != null) {
            C7043o00O0000.OooO00o(drawable, i, i2, i3, i4);
        }
    }

    public void setTintList(ColorStateList colorStateList) {
        OooO0OO oooO0OO = this.f17095OooO00o;
        oooO0OO.OooOOO = true;
        if (oooO0OO.f17101OooO00o != colorStateList) {
            oooO0OO.f17101OooO00o = colorStateList;
            C7043o00O0000.OooO00o(this.f17093OooO00o, colorStateList);
        }
    }

    public void setTintMode(@NonNull PorterDuff.Mode mode) {
        OooO0OO oooO0OO = this.f17095OooO00o;
        oooO0OO.OooOOOO = true;
        if (oooO0OO.f17104OooO00o != mode) {
            oooO0OO.f17104OooO00o = mode;
            C7043o00O0000.OooO00o(this.f17093OooO00o, mode);
        }
    }

    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        Drawable drawable = this.f17097OooO0O0;
        if (drawable != null) {
            drawable.setVisible(z, z2);
        }
        Drawable drawable2 = this.f17093OooO00o;
        if (drawable2 != null) {
            drawable2.setVisible(z, z2);
        }
        return visible;
    }

    public void unscheduleDrawable(@NonNull Drawable drawable, @NonNull Runnable runnable) {
        if (drawable == this.f17093OooO00o && getCallback() != null) {
            getCallback().unscheduleDrawable(this, runnable);
        }
    }

    public void OooO00o(int i) {
        m16721OooO00o(i);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public int m16718OooO00o() {
        return this.o0ooOO0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0079  */
    /* renamed from: OooO00o  reason: collision with other method in class */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean m16721OooO00o(int r9) {
        /*
        // Method dump skipped, instructions count: 131
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p118pd.sdk.OooOOOO.m16721OooO00o(int):boolean");
    }

    private void OooO00o(Drawable drawable) {
        if (this.f17094OooO00o == null) {
            this.f17094OooO00o = new OooO0O0();
        }
        drawable.setCallback(this.f17094OooO00o.OooO00o(drawable.getCallback()));
        try {
            if (this.f17095OooO00o.OooOO0O <= 0 && this.f17098OooO0O0) {
                drawable.setAlpha(this.o00oO0O);
            }
            if (this.f17095OooO00o.OooOOO0) {
                drawable.setColorFilter(this.f17095OooO00o.f17103OooO00o);
            } else {
                if (this.f17095OooO00o.OooOOO) {
                    C7043o00O0000.OooO00o(drawable, this.f17095OooO00o.f17101OooO00o);
                }
                if (this.f17095OooO00o.OooOOOO) {
                    C7043o00O0000.OooO00o(drawable, this.f17095OooO00o.f17104OooO00o);
                }
            }
            drawable.setVisible(isVisible(), true);
            drawable.setDither(this.f17095OooO00o.f17117OooOO0);
            drawable.setState(getState());
            drawable.setLevel(getLevel());
            drawable.setBounds(getBounds());
            if (Build.VERSION.SDK_INT >= 23) {
                drawable.setLayoutDirection(getLayoutDirection());
            }
            if (Build.VERSION.SDK_INT >= 19) {
                drawable.setAutoMirrored(this.f17095OooO00o.f17119OooOO0o);
            }
            Rect rect = this.f17092OooO00o;
            if (Build.VERSION.SDK_INT >= 21 && rect != null) {
                drawable.setHotspotBounds(rect.left, rect.top, rect.right, rect.bottom);
            }
        } finally {
            drawable.setCallback(this.f17094OooO00o.OooO00o());
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x006d A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:24:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void OooO00o(boolean r14) {
        /*
        // Method dump skipped, instructions count: 120
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p118pd.sdk.OooOOOO.OooO00o(boolean):void");
    }

    public final void OooO00o(Resources resources) {
        this.f17095OooO00o.OooO00o(resources);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public OooO0OO m16719OooO00o() {
        return this.f17095OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m16720OooO00o() {
        this.f17095OooO00o.m16724OooO00o();
        this.OooO0OO = false;
    }

    public void OooO00o(OooO0OO oooO0OO) {
        this.f17095OooO00o = oooO0OO;
        int i = this.o0ooOO0;
        if (i >= 0) {
            Drawable OooO00o2 = oooO0OO.OooO00o(i);
            this.f17093OooO00o = OooO00o2;
            if (OooO00o2 != null) {
                OooO00o(OooO00o2);
            }
        }
        this.f17099o0ooOOo = -1;
        this.f17097OooO0O0 = null;
    }

    public static int OooO00o(@Nullable Resources resources, int i) {
        if (resources != null) {
            i = resources.getDisplayMetrics().densityDpi;
        }
        if (i == 0) {
            return 160;
        }
        return i;
    }
}

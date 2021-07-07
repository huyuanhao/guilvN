package com.p118pd.sdk;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.os.Build;
import android.util.AttributeSet;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import com.facebook.react.uimanager.BaseViewManager;
import com.p118pd.sdk.C7032o000oo0o;
import com.xiaomi.mipush.sdk.Constants;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: com.pd.sdk.o0O0OOOo  reason: case insensitive filesystem */
public class C7303o0O0OOOo extends AbstractC7301o0O0OOO {
    public static final PorterDuff.Mode OooO00o = PorterDuff.Mode.SRC_IN;
    public static final boolean OooO0Oo = false;
    public static final int o00oO0O = 0;
    public static final int o0OO00O = 2048;

    /* renamed from: o0OO00O  reason: collision with other field name */
    public static final String f19984o0OO00O = "vector";
    public static final int o0OOO0o = 1;

    /* renamed from: o0OOO0o  reason: collision with other field name */
    public static final String f19985o0OOO0o = "group";
    public static final int o0Oo0oo = 2;

    /* renamed from: o0Oo0oo  reason: collision with other field name */
    public static final String f19986o0Oo0oo = "path";
    public static final int o0ooOO0 = 1;
    public static final int o0ooOOo = 2;

    /* renamed from: o0ooOOo  reason: collision with other field name */
    public static final String f19987o0ooOOo = "VectorDrawableCompat";
    public static final int o0ooOoO = 0;

    /* renamed from: o0ooOoO  reason: collision with other field name */
    public static final String f19988o0ooOoO = "clip-path";

    /* renamed from: OooO00o  reason: collision with other field name */
    public ColorFilter f19989OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final Matrix f19990OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public PorterDuffColorFilter f19991OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final Rect f19992OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Drawable.ConstantState f19993OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C7307OooO0oo f19994OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final float[] f19995OooO00o;
    public boolean OooO0O0;
    public boolean OooO0OO;

    /* renamed from: com.pd.sdk.o0O0OOOo$OooO0O0 */
    public static class OooO0O0 extends OooO0o {
        public OooO0O0() {
        }

        public void OooO00o(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            if (C7022o000o0o.OooO00o(xmlPullParser, "pathData")) {
                TypedArray OooO00o = C7022o000o0o.OooO00o(resources, theme, attributeSet, C7296o0O0O0oO.f19971OooO0Oo);
                OooO00o(OooO00o);
                OooO00o.recycle();
            }
        }

        @Override // com.p118pd.sdk.C7303o0O0OOOo.OooO0o
        public boolean OooO0OO() {
            return true;
        }

        public OooO0O0(OooO0O0 oooO0O0) {
            super(oooO0O0);
        }

        private void OooO00o(TypedArray typedArray) {
            String string = typedArray.getString(0);
            if (string != null) {
                ((OooO0o) this).f20009OooO00o = string;
            }
            String string2 = typedArray.getString(1);
            if (string2 != null) {
                ((OooO0o) this).f20010OooO00o = C7032o000oo0o.m18296OooO00o(string2);
            }
        }
    }

    /* renamed from: com.pd.sdk.o0O0OOOo$OooO0o0  reason: case insensitive filesystem */
    public static abstract class AbstractC7305OooO0o0 {
        public AbstractC7305OooO0o0() {
        }

        public boolean OooO00o() {
            return false;
        }

        public boolean OooO00o(int[] iArr) {
            return false;
        }
    }

    /* renamed from: com.pd.sdk.o0O0OOOo$OooO0oo  reason: case insensitive filesystem */
    public static class C7307OooO0oo extends Drawable.ConstantState {
        public int OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public ColorStateList f20024OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public Bitmap f20025OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public Paint f20026OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public PorterDuff.Mode f20027OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public C7306OooO0oO f20028OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public boolean f20029OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public int[] f20030OooO00o;
        public int OooO0O0;

        /* renamed from: OooO0O0  reason: collision with other field name */
        public ColorStateList f20031OooO0O0;

        /* renamed from: OooO0O0  reason: collision with other field name */
        public PorterDuff.Mode f20032OooO0O0;

        /* renamed from: OooO0O0  reason: collision with other field name */
        public boolean f20033OooO0O0;
        public boolean OooO0OO;

        public C7307OooO0oo(C7307OooO0oo oooO0oo) {
            this.f20024OooO00o = null;
            this.f20027OooO00o = C7303o0O0OOOo.OooO00o;
            if (oooO0oo != null) {
                this.OooO00o = oooO0oo.OooO00o;
                C7306OooO0oO oooO0oO = new C7306OooO0oO(oooO0oo.f20028OooO00o);
                this.f20028OooO00o = oooO0oO;
                if (oooO0oo.f20028OooO00o.f20022OooO0O0 != null) {
                    oooO0oO.f20022OooO0O0 = new Paint(oooO0oo.f20028OooO00o.f20022OooO0O0);
                }
                if (oooO0oo.f20028OooO00o.f20013OooO00o != null) {
                    this.f20028OooO00o.f20013OooO00o = new Paint(oooO0oo.f20028OooO00o.f20013OooO00o);
                }
                this.f20024OooO00o = oooO0oo.f20024OooO00o;
                this.f20027OooO00o = oooO0oo.f20027OooO00o;
                this.f20029OooO00o = oooO0oo.f20029OooO00o;
            }
        }

        public void OooO00o(Canvas canvas, ColorFilter colorFilter, Rect rect) {
            canvas.drawBitmap(this.f20025OooO00o, (Rect) null, rect, OooO00o(colorFilter));
        }

        public boolean OooO0O0() {
            return this.f20028OooO00o.getRootAlpha() < 255;
        }

        public boolean OooO0OO() {
            return this.f20028OooO00o.OooO00o();
        }

        public int getChangingConfigurations() {
            return this.OooO00o;
        }

        @NonNull
        public Drawable newDrawable() {
            return new C7303o0O0OOOo(this);
        }

        public void OooO0O0(int i, int i2) {
            this.f20025OooO00o.eraseColor(0);
            this.f20028OooO00o.OooO00o(new Canvas(this.f20025OooO00o), i, i2, (ColorFilter) null);
        }

        @NonNull
        public Drawable newDrawable(Resources resources) {
            return new C7303o0O0OOOo(this);
        }

        public Paint OooO00o(ColorFilter colorFilter) {
            if (!OooO0O0() && colorFilter == null) {
                return null;
            }
            if (this.f20026OooO00o == null) {
                Paint paint = new Paint();
                this.f20026OooO00o = paint;
                paint.setFilterBitmap(true);
            }
            this.f20026OooO00o.setAlpha(this.f20028OooO00o.getRootAlpha());
            this.f20026OooO00o.setColorFilter(colorFilter);
            return this.f20026OooO00o;
        }

        public void OooO00o(int i, int i2) {
            if (this.f20025OooO00o == null || !m18808OooO00o(i, i2)) {
                this.f20025OooO00o = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
                this.OooO0OO = true;
            }
        }

        public C7307OooO0oo() {
            this.f20024OooO00o = null;
            this.f20027OooO00o = C7303o0O0OOOo.OooO00o;
            this.f20028OooO00o = new C7306OooO0oO();
        }

        /* renamed from: OooO00o  reason: collision with other method in class */
        public boolean m18808OooO00o(int i, int i2) {
            return i == this.f20025OooO00o.getWidth() && i2 == this.f20025OooO00o.getHeight();
        }

        /* renamed from: OooO00o  reason: collision with other method in class */
        public boolean m18807OooO00o() {
            return !this.OooO0OO && this.f20031OooO0O0 == this.f20024OooO00o && this.f20032OooO0O0 == this.f20027OooO00o && this.f20033OooO0O0 == this.f20029OooO00o && this.OooO0O0 == this.f20028OooO00o.getRootAlpha();
        }

        public void OooO00o() {
            this.f20031OooO0O0 = this.f20024OooO00o;
            this.f20032OooO0O0 = this.f20027OooO00o;
            this.OooO0O0 = this.f20028OooO00o.getRootAlpha();
            this.f20033OooO0O0 = this.f20029OooO00o;
            this.OooO0OO = false;
        }

        public boolean OooO00o(int[] iArr) {
            boolean OooO00o2 = this.f20028OooO00o.OooO00o(iArr);
            this.OooO0OO |= OooO00o2;
            return OooO00o2;
        }
    }

    public C7303o0O0OOOo() {
        this.OooO0OO = true;
        this.f19995OooO00o = new float[9];
        this.f19990OooO00o = new Matrix();
        this.f19992OooO00o = new Rect();
        this.f19994OooO00o = new C7307OooO0oo();
    }

    public Object OooO00o(String str) {
        return this.f19994OooO00o.f20028OooO00o.f20016OooO00o.get(str);
    }

    @Override // com.p118pd.sdk.AbstractC7301o0O0OOO
    public /* bridge */ /* synthetic */ void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
    }

    public boolean canApplyTheme() {
        Drawable drawable = ((AbstractC7301o0O0OOO) this).OooO00o;
        if (drawable == null) {
            return false;
        }
        C7043o00O0000.m18315OooO00o(drawable);
        return false;
    }

    @Override // com.p118pd.sdk.AbstractC7301o0O0OOO
    public /* bridge */ /* synthetic */ void clearColorFilter() {
        super.clearColorFilter();
    }

    public void draw(Canvas canvas) {
        Drawable drawable = ((AbstractC7301o0O0OOO) this).OooO00o;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        copyBounds(this.f19992OooO00o);
        if (this.f19992OooO00o.width() > 0 && this.f19992OooO00o.height() > 0) {
            ColorFilter colorFilter = this.f19989OooO00o;
            if (colorFilter == null) {
                colorFilter = this.f19991OooO00o;
            }
            canvas.getMatrix(this.f19990OooO00o);
            this.f19990OooO00o.getValues(this.f19995OooO00o);
            float abs = Math.abs(this.f19995OooO00o[0]);
            float abs2 = Math.abs(this.f19995OooO00o[4]);
            float abs3 = Math.abs(this.f19995OooO00o[1]);
            float abs4 = Math.abs(this.f19995OooO00o[3]);
            if (!(abs3 == 0.0f && abs4 == 0.0f)) {
                abs = 1.0f;
                abs2 = 1.0f;
            }
            int min = Math.min(2048, (int) (((float) this.f19992OooO00o.width()) * abs));
            int min2 = Math.min(2048, (int) (((float) this.f19992OooO00o.height()) * abs2));
            if (min > 0 && min2 > 0) {
                int save = canvas.save();
                Rect rect = this.f19992OooO00o;
                canvas.translate((float) rect.left, (float) rect.top);
                if (OooO00o()) {
                    canvas.translate((float) this.f19992OooO00o.width(), 0.0f);
                    canvas.scale(-1.0f, 1.0f);
                }
                this.f19992OooO00o.offsetTo(0, 0);
                this.f19994OooO00o.OooO00o(min, min2);
                if (!this.OooO0OO) {
                    this.f19994OooO00o.OooO0O0(min, min2);
                } else if (!this.f19994OooO00o.m18807OooO00o()) {
                    this.f19994OooO00o.OooO0O0(min, min2);
                    this.f19994OooO00o.OooO00o();
                }
                this.f19994OooO00o.OooO00o(canvas, colorFilter, this.f19992OooO00o);
                canvas.restoreToCount(save);
            }
        }
    }

    public int getAlpha() {
        Drawable drawable = ((AbstractC7301o0O0OOO) this).OooO00o;
        if (drawable != null) {
            return C7043o00O0000.OooO00o(drawable);
        }
        return this.f19994OooO00o.f20028OooO00o.getRootAlpha();
    }

    public int getChangingConfigurations() {
        Drawable drawable = ((AbstractC7301o0O0OOO) this).OooO00o;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        return super.getChangingConfigurations() | this.f19994OooO00o.getChangingConfigurations();
    }

    @Override // com.p118pd.sdk.AbstractC7301o0O0OOO
    public /* bridge */ /* synthetic */ ColorFilter getColorFilter() {
        return super.getColorFilter();
    }

    public Drawable.ConstantState getConstantState() {
        if (((AbstractC7301o0O0OOO) this).OooO00o != null && Build.VERSION.SDK_INT >= 24) {
            return new OooO(((AbstractC7301o0O0OOO) this).OooO00o.getConstantState());
        }
        this.f19994OooO00o.OooO00o = getChangingConfigurations();
        return this.f19994OooO00o;
    }

    @Override // com.p118pd.sdk.AbstractC7301o0O0OOO
    public /* bridge */ /* synthetic */ Drawable getCurrent() {
        return super.getCurrent();
    }

    public int getIntrinsicHeight() {
        Drawable drawable = ((AbstractC7301o0O0OOO) this).OooO00o;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return (int) this.f19994OooO00o.f20028OooO00o.f20020OooO0O0;
    }

    public int getIntrinsicWidth() {
        Drawable drawable = ((AbstractC7301o0O0OOO) this).OooO00o;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return (int) this.f19994OooO00o.f20028OooO00o.OooO00o;
    }

    @Override // com.p118pd.sdk.AbstractC7301o0O0OOO
    public /* bridge */ /* synthetic */ int getMinimumHeight() {
        return super.getMinimumHeight();
    }

    @Override // com.p118pd.sdk.AbstractC7301o0O0OOO
    public /* bridge */ /* synthetic */ int getMinimumWidth() {
        return super.getMinimumWidth();
    }

    public int getOpacity() {
        Drawable drawable = ((AbstractC7301o0O0OOO) this).OooO00o;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    @Override // com.p118pd.sdk.AbstractC7301o0O0OOO
    public /* bridge */ /* synthetic */ boolean getPadding(Rect rect) {
        return super.getPadding(rect);
    }

    @Override // com.p118pd.sdk.AbstractC7301o0O0OOO
    public /* bridge */ /* synthetic */ int[] getState() {
        return super.getState();
    }

    @Override // com.p118pd.sdk.AbstractC7301o0O0OOO
    public /* bridge */ /* synthetic */ Region getTransparentRegion() {
        return super.getTransparentRegion();
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        Drawable drawable = ((AbstractC7301o0O0OOO) this).OooO00o;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }

    public void invalidateSelf() {
        Drawable drawable = ((AbstractC7301o0O0OOO) this).OooO00o;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    public boolean isAutoMirrored() {
        Drawable drawable = ((AbstractC7301o0O0OOO) this).OooO00o;
        if (drawable != null) {
            return C7043o00O0000.m18319OooO0O0(drawable);
        }
        return this.f19994OooO00o.f20029OooO00o;
    }

    public boolean isStateful() {
        C7307OooO0oo oooO0oo;
        ColorStateList colorStateList;
        Drawable drawable = ((AbstractC7301o0O0OOO) this).OooO00o;
        if (drawable != null) {
            return drawable.isStateful();
        }
        return super.isStateful() || ((oooO0oo = this.f19994OooO00o) != null && (oooO0oo.OooO0OO() || ((colorStateList = this.f19994OooO00o.f20024OooO00o) != null && colorStateList.isStateful())));
    }

    @Override // com.p118pd.sdk.AbstractC7301o0O0OOO
    public /* bridge */ /* synthetic */ void jumpToCurrentState() {
        super.jumpToCurrentState();
    }

    public Drawable mutate() {
        Drawable drawable = ((AbstractC7301o0O0OOO) this).OooO00o;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.OooO0O0 && super.mutate() == this) {
            this.f19994OooO00o = new C7307OooO0oo(this.f19994OooO00o);
            this.OooO0O0 = true;
        }
        return this;
    }

    @Override // com.p118pd.sdk.AbstractC7301o0O0OOO
    public void onBoundsChange(Rect rect) {
        Drawable drawable = ((AbstractC7301o0O0OOO) this).OooO00o;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    public boolean onStateChange(int[] iArr) {
        PorterDuff.Mode mode;
        Drawable drawable = ((AbstractC7301o0O0OOO) this).OooO00o;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        boolean z = false;
        C7307OooO0oo oooO0oo = this.f19994OooO00o;
        ColorStateList colorStateList = oooO0oo.f20024OooO00o;
        if (!(colorStateList == null || (mode = oooO0oo.f20027OooO00o) == null)) {
            this.f19991OooO00o = OooO00o(this.f19991OooO00o, colorStateList, mode);
            invalidateSelf();
            z = true;
        }
        if (!oooO0oo.OooO0OO() || !oooO0oo.OooO00o(iArr)) {
            return z;
        }
        invalidateSelf();
        return true;
    }

    public void scheduleSelf(Runnable runnable, long j) {
        Drawable drawable = ((AbstractC7301o0O0OOO) this).OooO00o;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j);
        } else {
            super.scheduleSelf(runnable, j);
        }
    }

    public void setAlpha(int i) {
        Drawable drawable = ((AbstractC7301o0O0OOO) this).OooO00o;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else if (this.f19994OooO00o.f20028OooO00o.getRootAlpha() != i) {
            this.f19994OooO00o.f20028OooO00o.setRootAlpha(i);
            invalidateSelf();
        }
    }

    public void setAutoMirrored(boolean z) {
        Drawable drawable = ((AbstractC7301o0O0OOO) this).OooO00o;
        if (drawable != null) {
            C7043o00O0000.OooO00o(drawable, z);
        } else {
            this.f19994OooO00o.f20029OooO00o = z;
        }
    }

    @Override // com.p118pd.sdk.AbstractC7301o0O0OOO
    public /* bridge */ /* synthetic */ void setChangingConfigurations(int i) {
        super.setChangingConfigurations(i);
    }

    @Override // com.p118pd.sdk.AbstractC7301o0O0OOO
    public /* bridge */ /* synthetic */ void setColorFilter(int i, PorterDuff.Mode mode) {
        super.setColorFilter(i, mode);
    }

    @Override // com.p118pd.sdk.AbstractC7301o0O0OOO
    public /* bridge */ /* synthetic */ void setFilterBitmap(boolean z) {
        super.setFilterBitmap(z);
    }

    @Override // com.p118pd.sdk.AbstractC7301o0O0OOO
    public /* bridge */ /* synthetic */ void setHotspot(float f, float f2) {
        super.setHotspot(f, f2);
    }

    @Override // com.p118pd.sdk.AbstractC7301o0O0OOO
    public /* bridge */ /* synthetic */ void setHotspotBounds(int i, int i2, int i3, int i4) {
        super.setHotspotBounds(i, i2, i3, i4);
    }

    @Override // com.p118pd.sdk.AbstractC7301o0O0OOO
    public /* bridge */ /* synthetic */ boolean setState(int[] iArr) {
        return super.setState(iArr);
    }

    @Override // com.p118pd.sdk.AbstractC7044o00O000o
    public void setTint(int i) {
        Drawable drawable = ((AbstractC7301o0O0OOO) this).OooO00o;
        if (drawable != null) {
            C7043o00O0000.OooO00o(drawable, i);
        } else {
            setTintList(ColorStateList.valueOf(i));
        }
    }

    @Override // com.p118pd.sdk.AbstractC7044o00O000o
    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable = ((AbstractC7301o0O0OOO) this).OooO00o;
        if (drawable != null) {
            C7043o00O0000.OooO00o(drawable, colorStateList);
            return;
        }
        C7307OooO0oo oooO0oo = this.f19994OooO00o;
        if (oooO0oo.f20024OooO00o != colorStateList) {
            oooO0oo.f20024OooO00o = colorStateList;
            this.f19991OooO00o = OooO00o(this.f19991OooO00o, colorStateList, oooO0oo.f20027OooO00o);
            invalidateSelf();
        }
    }

    @Override // com.p118pd.sdk.AbstractC7044o00O000o
    public void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = ((AbstractC7301o0O0OOO) this).OooO00o;
        if (drawable != null) {
            C7043o00O0000.OooO00o(drawable, mode);
            return;
        }
        C7307OooO0oo oooO0oo = this.f19994OooO00o;
        if (oooO0oo.f20027OooO00o != mode) {
            oooO0oo.f20027OooO00o = mode;
            this.f19991OooO00o = OooO00o(this.f19991OooO00o, oooO0oo.f20024OooO00o, mode);
            invalidateSelf();
        }
    }

    public boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = ((AbstractC7301o0O0OOO) this).OooO00o;
        if (drawable != null) {
            return drawable.setVisible(z, z2);
        }
        return super.setVisible(z, z2);
    }

    public void unscheduleSelf(Runnable runnable) {
        Drawable drawable = ((AbstractC7301o0O0OOO) this).OooO00o;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }

    @RequiresApi(24)
    /* renamed from: com.pd.sdk.o0O0OOOo$OooO */
    public static class OooO extends Drawable.ConstantState {
        public final Drawable.ConstantState OooO00o;

        public OooO(Drawable.ConstantState constantState) {
            this.OooO00o = constantState;
        }

        public boolean canApplyTheme() {
            return this.OooO00o.canApplyTheme();
        }

        public int getChangingConfigurations() {
            return this.OooO00o.getChangingConfigurations();
        }

        public Drawable newDrawable() {
            C7303o0O0OOOo o0o0oooo = new C7303o0O0OOOo();
            ((AbstractC7301o0O0OOO) o0o0oooo).OooO00o = (VectorDrawable) this.OooO00o.newDrawable();
            return o0o0oooo;
        }

        public Drawable newDrawable(Resources resources) {
            C7303o0O0OOOo o0o0oooo = new C7303o0O0OOOo();
            ((AbstractC7301o0O0OOO) o0o0oooo).OooO00o = (VectorDrawable) this.OooO00o.newDrawable(resources);
            return o0o0oooo;
        }

        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
            C7303o0O0OOOo o0o0oooo = new C7303o0O0OOOo();
            ((AbstractC7301o0O0OOO) o0o0oooo).OooO00o = (VectorDrawable) this.OooO00o.newDrawable(resources, theme);
            return o0o0oooo;
        }
    }

    /* renamed from: com.pd.sdk.o0O0OOOo$OooO0o */
    public static abstract class OooO0o extends AbstractC7305OooO0o0 {
        public int OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public String f20009OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public C7032o000oo0o.OooO0O0[] f20010OooO00o = null;

        public OooO0o() {
            super();
        }

        public void OooO00o(int i) {
            String str = "";
            for (int i2 = 0; i2 < i; i2++) {
                str = str + C9878I1.f23489OooO00o;
            }
            String str2 = str + "current path is :" + this.f20009OooO00o + " pathData is " + OooO00o(this.f20010OooO00o);
        }

        public void OooO00o(Resources.Theme theme) {
        }

        public boolean OooO0O0() {
            return false;
        }

        public boolean OooO0OO() {
            return false;
        }

        public C7032o000oo0o.OooO0O0[] getPathData() {
            return this.f20010OooO00o;
        }

        public String getPathName() {
            return this.f20009OooO00o;
        }

        public void setPathData(C7032o000oo0o.OooO0O0[] oooO0O0Arr) {
            if (!C7032o000oo0o.m18294OooO00o(this.f20010OooO00o, oooO0O0Arr)) {
                this.f20010OooO00o = C7032o000oo0o.OooO00o(oooO0O0Arr);
            } else {
                C7032o000oo0o.OooO00o(this.f20010OooO00o, oooO0O0Arr);
            }
        }

        public OooO0o(OooO0o oooO0o) {
            super();
            this.f20009OooO00o = oooO0o.f20009OooO00o;
            this.OooO00o = oooO0o.OooO00o;
            this.f20010OooO00o = C7032o000oo0o.OooO00o(oooO0o.f20010OooO00o);
        }

        public String OooO00o(C7032o000oo0o.OooO0O0[] oooO0O0Arr) {
            String str = " ";
            for (int i = 0; i < oooO0O0Arr.length; i++) {
                str = str + oooO0O0Arr[i].OooO00o + Constants.COLON_SEPARATOR;
                float[] fArr = oooO0O0Arr[i].f19298OooO00o;
                for (int i2 = 0; i2 < fArr.length; i2++) {
                    str = str + fArr[i2] + Constants.ACCEPT_TIME_SEPARATOR_SP;
                }
            }
            return str;
        }

        public void OooO00o(Path path) {
            path.reset();
            C7032o000oo0o.OooO0O0[] oooO0O0Arr = this.f20010OooO00o;
            if (oooO0O0Arr != null) {
                C7032o000oo0o.OooO0O0.OooO00o(oooO0O0Arr, path);
            }
        }
    }

    public PorterDuffColorFilter OooO00o(PorterDuffColorFilter porterDuffColorFilter, ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = ((AbstractC7301o0O0OOO) this).OooO00o;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
            return;
        }
        this.f19989OooO00o = colorFilter;
        invalidateSelf();
    }

    /* renamed from: com.pd.sdk.o0O0OOOo$OooO0OO */
    public static class OooO0OO extends OooO0o {
        public static final int OooO0OO = 0;
        public float OooO00o = 0.0f;

        /* renamed from: OooO00o  reason: collision with other field name */
        public Paint.Cap f19996OooO00o = Paint.Cap.BUTT;

        /* renamed from: OooO00o  reason: collision with other field name */
        public Paint.Join f19997OooO00o = Paint.Join.MITER;

        /* renamed from: OooO00o  reason: collision with other field name */
        public C7019o000o0O0 f19998OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public int[] f19999OooO00o;
        public float OooO0O0 = 1.0f;

        /* renamed from: OooO0O0  reason: collision with other field name */
        public int f20000OooO0O0 = 0;

        /* renamed from: OooO0O0  reason: collision with other field name */
        public C7019o000o0O0 f20001OooO0O0;

        /* renamed from: OooO0OO  reason: collision with other field name */
        public float f20002OooO0OO = 1.0f;
        public float OooO0Oo = 0.0f;
        public float OooO0o = 0.0f;
        public float OooO0o0 = 1.0f;
        public float OooO0oO = 4.0f;

        public OooO0OO() {
        }

        private Paint.Cap OooO00o(int i, Paint.Cap cap) {
            if (i == 0) {
                return Paint.Cap.BUTT;
            }
            if (i != 1) {
                return i != 2 ? cap : Paint.Cap.SQUARE;
            }
            return Paint.Cap.ROUND;
        }

        @Override // com.p118pd.sdk.C7303o0O0OOOo.OooO0o
        public boolean OooO0O0() {
            return this.f19999OooO00o != null;
        }

        public float getFillAlpha() {
            return this.f20002OooO0OO;
        }

        @ColorInt
        public int getFillColor() {
            return this.f20001OooO0O0.OooO00o();
        }

        public float getStrokeAlpha() {
            return this.OooO0O0;
        }

        @ColorInt
        public int getStrokeColor() {
            return this.f19998OooO00o.OooO00o();
        }

        public float getStrokeWidth() {
            return this.OooO00o;
        }

        public float getTrimPathEnd() {
            return this.OooO0o0;
        }

        public float getTrimPathOffset() {
            return this.OooO0o;
        }

        public float getTrimPathStart() {
            return this.OooO0Oo;
        }

        public void setFillAlpha(float f) {
            this.f20002OooO0OO = f;
        }

        public void setFillColor(int i) {
            this.f20001OooO0O0.m18279OooO00o(i);
        }

        public void setStrokeAlpha(float f) {
            this.OooO0O0 = f;
        }

        public void setStrokeColor(int i) {
            this.f19998OooO00o.m18279OooO00o(i);
        }

        public void setStrokeWidth(float f) {
            this.OooO00o = f;
        }

        public void setTrimPathEnd(float f) {
            this.OooO0o0 = f;
        }

        public void setTrimPathOffset(float f) {
            this.OooO0o = f;
        }

        public void setTrimPathStart(float f) {
            this.OooO0Oo = f;
        }

        private Paint.Join OooO00o(int i, Paint.Join join) {
            if (i == 0) {
                return Paint.Join.MITER;
            }
            if (i != 1) {
                return i != 2 ? join : Paint.Join.BEVEL;
            }
            return Paint.Join.ROUND;
        }

        public void OooO00o(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            TypedArray OooO00o2 = C7022o000o0o.OooO00o(resources, theme, attributeSet, C7296o0O0O0oO.f19970OooO0OO);
            OooO00o(OooO00o2, xmlPullParser, theme);
            OooO00o2.recycle();
        }

        private void OooO00o(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme) {
            this.f19999OooO00o = null;
            if (C7022o000o0o.OooO00o(xmlPullParser, "pathData")) {
                String string = typedArray.getString(0);
                if (string != null) {
                    ((OooO0o) this).f20009OooO00o = string;
                }
                String string2 = typedArray.getString(2);
                if (string2 != null) {
                    ((OooO0o) this).f20010OooO00o = C7032o000oo0o.m18296OooO00o(string2);
                }
                this.f20001OooO0O0 = C7022o000o0o.OooO00o(typedArray, xmlPullParser, theme, "fillColor", 1, 0);
                this.f20002OooO0OO = C7022o000o0o.OooO00o(typedArray, xmlPullParser, "fillAlpha", 12, this.f20002OooO0OO);
                this.f19996OooO00o = OooO00o(C7022o000o0o.OooO0O0(typedArray, xmlPullParser, "strokeLineCap", 8, -1), this.f19996OooO00o);
                this.f19997OooO00o = OooO00o(C7022o000o0o.OooO0O0(typedArray, xmlPullParser, "strokeLineJoin", 9, -1), this.f19997OooO00o);
                this.OooO0oO = C7022o000o0o.OooO00o(typedArray, xmlPullParser, "strokeMiterLimit", 10, this.OooO0oO);
                this.f19998OooO00o = C7022o000o0o.OooO00o(typedArray, xmlPullParser, theme, "strokeColor", 3, 0);
                this.OooO0O0 = C7022o000o0o.OooO00o(typedArray, xmlPullParser, "strokeAlpha", 11, this.OooO0O0);
                this.OooO00o = C7022o000o0o.OooO00o(typedArray, xmlPullParser, "strokeWidth", 4, this.OooO00o);
                this.OooO0o0 = C7022o000o0o.OooO00o(typedArray, xmlPullParser, "trimPathEnd", 6, this.OooO0o0);
                this.OooO0o = C7022o000o0o.OooO00o(typedArray, xmlPullParser, "trimPathOffset", 7, this.OooO0o);
                this.OooO0Oo = C7022o000o0o.OooO00o(typedArray, xmlPullParser, "trimPathStart", 5, this.OooO0Oo);
                this.f20000OooO0O0 = C7022o000o0o.OooO0O0(typedArray, xmlPullParser, "fillType", 13, this.f20000OooO0O0);
            }
        }

        public OooO0OO(OooO0OO oooO0OO) {
            super(oooO0OO);
            this.f19999OooO00o = oooO0OO.f19999OooO00o;
            this.f19998OooO00o = oooO0OO.f19998OooO00o;
            this.OooO00o = oooO0OO.OooO00o;
            this.OooO0O0 = oooO0OO.OooO0O0;
            this.f20001OooO0O0 = oooO0OO.f20001OooO0O0;
            this.f20000OooO0O0 = oooO0OO.f20000OooO0O0;
            this.f20002OooO0OO = oooO0OO.f20002OooO0OO;
            this.OooO0Oo = oooO0OO.OooO0Oo;
            this.OooO0o0 = oooO0OO.OooO0o0;
            this.OooO0o = oooO0OO.OooO0o;
            this.f19996OooO00o = oooO0OO.f19996OooO00o;
            this.f19997OooO00o = oooO0OO.f19997OooO00o;
            this.OooO0oO = oooO0OO.OooO0oO;
        }

        @Override // com.p118pd.sdk.C7303o0O0OOOo.AbstractC7305OooO0o0
        public boolean OooO00o() {
            return this.f20001OooO0O0.OooO0O0() || this.f19998OooO00o.OooO0O0();
        }

        @Override // com.p118pd.sdk.C7303o0O0OOOo.AbstractC7305OooO0o0
        public boolean OooO00o(int[] iArr) {
            return this.f19998OooO00o.OooO00o(iArr) | this.f20001OooO0O0.OooO00o(iArr);
        }

        @Override // com.p118pd.sdk.C7303o0O0OOOo.OooO0o
        public void OooO00o(Resources.Theme theme) {
            if (this.f19999OooO00o == null) {
            }
        }
    }

    /* renamed from: com.pd.sdk.o0O0OOOo$OooO0Oo  reason: case insensitive filesystem */
    public static class C7304OooO0Oo extends AbstractC7305OooO0o0 {
        public float OooO00o = 0.0f;

        /* renamed from: OooO00o  reason: collision with other field name */
        public int f20003OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final Matrix f20004OooO00o = new Matrix();

        /* renamed from: OooO00o  reason: collision with other field name */
        public String f20005OooO00o = null;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final ArrayList<AbstractC7305OooO0o0> f20006OooO00o = new ArrayList<>();

        /* renamed from: OooO00o  reason: collision with other field name */
        public int[] f20007OooO00o;
        public float OooO0O0 = 0.0f;

        /* renamed from: OooO0O0  reason: collision with other field name */
        public final Matrix f20008OooO0O0 = new Matrix();
        public float OooO0OO = 0.0f;
        public float OooO0Oo = 1.0f;
        public float OooO0o = 0.0f;
        public float OooO0o0 = 1.0f;
        public float OooO0oO = 0.0f;

        public C7304OooO0Oo(C7304OooO0Oo oooO0Oo, C6971o0000oO0<String, Object> o0000oo0) {
            super();
            OooO0o oooO0o;
            this.OooO00o = oooO0Oo.OooO00o;
            this.OooO0O0 = oooO0Oo.OooO0O0;
            this.OooO0OO = oooO0Oo.OooO0OO;
            this.OooO0Oo = oooO0Oo.OooO0Oo;
            this.OooO0o0 = oooO0Oo.OooO0o0;
            this.OooO0o = oooO0Oo.OooO0o;
            this.OooO0oO = oooO0Oo.OooO0oO;
            this.f20007OooO00o = oooO0Oo.f20007OooO00o;
            String str = oooO0Oo.f20005OooO00o;
            this.f20005OooO00o = str;
            this.f20003OooO00o = oooO0Oo.f20003OooO00o;
            if (str != null) {
                o0000oo0.put(str, this);
            }
            this.f20008OooO0O0.set(oooO0Oo.f20008OooO0O0);
            ArrayList<AbstractC7305OooO0o0> arrayList = oooO0Oo.f20006OooO00o;
            for (int i = 0; i < arrayList.size(); i++) {
                AbstractC7305OooO0o0 oooO0o0 = arrayList.get(i);
                if (oooO0o0 instanceof C7304OooO0Oo) {
                    this.f20006OooO00o.add(new C7304OooO0Oo((C7304OooO0Oo) oooO0o0, o0000oo0));
                } else {
                    if (oooO0o0 instanceof OooO0OO) {
                        oooO0o = new OooO0OO((OooO0OO) oooO0o0);
                    } else if (oooO0o0 instanceof OooO0O0) {
                        oooO0o = new OooO0O0((OooO0O0) oooO0o0);
                    } else {
                        throw new IllegalStateException("Unknown object in the tree!");
                    }
                    this.f20006OooO00o.add(oooO0o);
                    String str2 = oooO0o.f20009OooO00o;
                    if (str2 != null) {
                        o0000oo0.put(str2, oooO0o);
                    }
                }
            }
        }

        public void OooO00o(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            TypedArray OooO00o2 = C7022o000o0o.OooO00o(resources, theme, attributeSet, C7296o0O0O0oO.f19969OooO0O0);
            OooO00o(OooO00o2, xmlPullParser);
            OooO00o2.recycle();
        }

        public String getGroupName() {
            return this.f20005OooO00o;
        }

        public Matrix getLocalMatrix() {
            return this.f20008OooO0O0;
        }

        public float getPivotX() {
            return this.OooO0O0;
        }

        public float getPivotY() {
            return this.OooO0OO;
        }

        public float getRotation() {
            return this.OooO00o;
        }

        public float getScaleX() {
            return this.OooO0Oo;
        }

        public float getScaleY() {
            return this.OooO0o0;
        }

        public float getTranslateX() {
            return this.OooO0o;
        }

        public float getTranslateY() {
            return this.OooO0oO;
        }

        public void setPivotX(float f) {
            if (f != this.OooO0O0) {
                this.OooO0O0 = f;
                OooO00o();
            }
        }

        public void setPivotY(float f) {
            if (f != this.OooO0OO) {
                this.OooO0OO = f;
                OooO00o();
            }
        }

        public void setRotation(float f) {
            if (f != this.OooO00o) {
                this.OooO00o = f;
                OooO00o();
            }
        }

        public void setScaleX(float f) {
            if (f != this.OooO0Oo) {
                this.OooO0Oo = f;
                OooO00o();
            }
        }

        public void setScaleY(float f) {
            if (f != this.OooO0o0) {
                this.OooO0o0 = f;
                OooO00o();
            }
        }

        public void setTranslateX(float f) {
            if (f != this.OooO0o) {
                this.OooO0o = f;
                OooO00o();
            }
        }

        public void setTranslateY(float f) {
            if (f != this.OooO0oO) {
                this.OooO0oO = f;
                OooO00o();
            }
        }

        private void OooO00o(TypedArray typedArray, XmlPullParser xmlPullParser) {
            this.f20007OooO00o = null;
            this.OooO00o = C7022o000o0o.OooO00o(typedArray, xmlPullParser, BaseViewManager.PROP_ROTATION, 5, this.OooO00o);
            this.OooO0O0 = typedArray.getFloat(1, this.OooO0O0);
            this.OooO0OO = typedArray.getFloat(2, this.OooO0OO);
            this.OooO0Oo = C7022o000o0o.OooO00o(typedArray, xmlPullParser, BaseViewManager.PROP_SCALE_X, 3, this.OooO0Oo);
            this.OooO0o0 = C7022o000o0o.OooO00o(typedArray, xmlPullParser, BaseViewManager.PROP_SCALE_Y, 4, this.OooO0o0);
            this.OooO0o = C7022o000o0o.OooO00o(typedArray, xmlPullParser, BaseViewManager.PROP_TRANSLATE_X, 6, this.OooO0o);
            this.OooO0oO = C7022o000o0o.OooO00o(typedArray, xmlPullParser, BaseViewManager.PROP_TRANSLATE_Y, 7, this.OooO0oO);
            String string = typedArray.getString(0);
            if (string != null) {
                this.f20005OooO00o = string;
            }
            OooO00o();
        }

        @Override // com.p118pd.sdk.C7303o0O0OOOo.AbstractC7305OooO0o0
        private void OooO00o() {
            this.f20008OooO0O0.reset();
            this.f20008OooO0O0.postTranslate(-this.OooO0O0, -this.OooO0OO);
            this.f20008OooO0O0.postScale(this.OooO0Oo, this.OooO0o0);
            this.f20008OooO0O0.postRotate(this.OooO00o, 0.0f, 0.0f);
            this.f20008OooO0O0.postTranslate(this.OooO0o + this.OooO0O0, this.OooO0oO + this.OooO0OO);
        }

        @Override // com.p118pd.sdk.C7303o0O0OOOo.AbstractC7305OooO0o0
        /* renamed from: OooO00o  reason: collision with other method in class */
        public boolean m18806OooO00o() {
            for (int i = 0; i < this.f20006OooO00o.size(); i++) {
                if (this.f20006OooO00o.get(i).OooO00o()) {
                    return true;
                }
            }
            return false;
        }

        @Override // com.p118pd.sdk.C7303o0O0OOOo.AbstractC7305OooO0o0
        public boolean OooO00o(int[] iArr) {
            boolean z = false;
            for (int i = 0; i < this.f20006OooO00o.size(); i++) {
                z |= this.f20006OooO00o.get(i).OooO00o(iArr);
            }
            return z;
        }

        public C7304OooO0Oo() {
            super();
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: OooO00o  reason: collision with other method in class */
    public float m18805OooO00o() {
        C7306OooO0oO oooO0oO;
        C7307OooO0oo oooO0oo = this.f19994OooO00o;
        if (oooO0oo == null || (oooO0oO = oooO0oo.f20028OooO00o) == null) {
            return 1.0f;
        }
        float f = oooO0oO.OooO00o;
        if (f == 0.0f) {
            return 1.0f;
        }
        float f2 = oooO0oO.f20020OooO0O0;
        if (f2 == 0.0f) {
            return 1.0f;
        }
        float f3 = oooO0oO.OooO0Oo;
        if (f3 == 0.0f) {
            return 1.0f;
        }
        float f4 = oooO0oO.OooO0OO;
        if (f4 == 0.0f) {
            return 1.0f;
        }
        return Math.min(f4 / f, f3 / f2);
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        Drawable drawable = ((AbstractC7301o0O0OOO) this).OooO00o;
        if (drawable != null) {
            C7043o00O0000.OooO00o(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        C7307OooO0oo oooO0oo = this.f19994OooO00o;
        oooO0oo.f20028OooO00o = new C7306OooO0oO();
        TypedArray OooO00o2 = C7022o000o0o.OooO00o(resources, theme, attributeSet, C7296o0O0O0oO.f19968OooO00o);
        OooO00o(OooO00o2, xmlPullParser);
        OooO00o2.recycle();
        oooO0oo.OooO00o = getChangingConfigurations();
        oooO0oo.OooO0OO = true;
        m18804OooO00o(resources, xmlPullParser, attributeSet, theme);
        this.f19991OooO00o = OooO00o(this.f19991OooO00o, oooO0oo.f20024OooO00o, oooO0oo.f20027OooO00o);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0034 A[Catch:{ IOException | XmlPullParserException -> 0x0041 }] */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0039 A[Catch:{ IOException | XmlPullParserException -> 0x0041 }] */
    @androidx.annotation.Nullable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.p118pd.sdk.C7303o0O0OOOo OooO00o(@androidx.annotation.NonNull android.content.res.Resources r4, @androidx.annotation.DrawableRes int r5, @androidx.annotation.Nullable android.content.res.Resources.Theme r6) {
        /*
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 24
            if (r0 < r1) goto L_0x001f
            com.pd.sdk.o0O0OOOo r0 = new com.pd.sdk.o0O0OOOo
            r0.<init>()
            android.graphics.drawable.Drawable r4 = com.p118pd.sdk.C7023o000o0o0.m18287OooO00o(r4, r5, r6)
            r0.OooO00o = r4
            com.pd.sdk.o0O0OOOo$OooO r4 = new com.pd.sdk.o0O0OOOo$OooO
            android.graphics.drawable.Drawable r5 = r0.OooO00o
            android.graphics.drawable.Drawable$ConstantState r5 = r5.getConstantState()
            r4.<init>(r5)
            r0.f19993OooO00o = r4
            return r0
        L_0x001f:
            android.content.res.XmlResourceParser r5 = r4.getXml(r5)     // Catch:{ IOException | XmlPullParserException -> 0x0041 }
            android.util.AttributeSet r0 = android.util.Xml.asAttributeSet(r5)     // Catch:{ IOException | XmlPullParserException -> 0x0041 }
        L_0x0027:
            int r1 = r5.next()     // Catch:{ IOException | XmlPullParserException -> 0x0041 }
            r2 = 2
            if (r1 == r2) goto L_0x0032
            r3 = 1
            if (r1 == r3) goto L_0x0032
            goto L_0x0027
        L_0x0032:
            if (r1 != r2) goto L_0x0039
            com.pd.sdk.o0O0OOOo r4 = OooO00o(r4, r5, r0, r6)     // Catch:{ IOException | XmlPullParserException -> 0x0041 }
            return r4
        L_0x0039:
            org.xmlpull.v1.XmlPullParserException r4 = new org.xmlpull.v1.XmlPullParserException     // Catch:{ IOException | XmlPullParserException -> 0x0041 }
            java.lang.String r5 = "No start tag found"
            r4.<init>(r5)     // Catch:{ IOException | XmlPullParserException -> 0x0041 }
            throw r4     // Catch:{ IOException | XmlPullParserException -> 0x0041 }
        L_0x0041:
            r4 = 0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p118pd.sdk.C7303o0O0OOOo.OooO00o(android.content.res.Resources, int, android.content.res.Resources$Theme):com.pd.sdk.o0O0OOOo");
    }

    public C7303o0O0OOOo(@NonNull C7307OooO0oo oooO0oo) {
        this.OooO0OO = true;
        this.f19995OooO00o = new float[9];
        this.f19990OooO00o = new Matrix();
        this.f19992OooO00o = new Rect();
        this.f19994OooO00o = oooO0oo;
        this.f19991OooO00o = OooO00o(this.f19991OooO00o, oooO0oo.f20024OooO00o, oooO0oo.f20027OooO00o);
    }

    /* renamed from: com.pd.sdk.o0O0OOOo$OooO0oO  reason: case insensitive filesystem */
    public static class C7306OooO0oO {
        public static final Matrix OooO0O0 = new Matrix();
        public float OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public int f20011OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final Matrix f20012OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public Paint f20013OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final Path f20014OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public PathMeasure f20015OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final C6971o0000oO0<String, Object> f20016OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final C7304OooO0Oo f20017OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public Boolean f20018OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public String f20019OooO00o;

        /* renamed from: OooO0O0  reason: collision with other field name */
        public float f20020OooO0O0;

        /* renamed from: OooO0O0  reason: collision with other field name */
        public int f20021OooO0O0;

        /* renamed from: OooO0O0  reason: collision with other field name */
        public Paint f20022OooO0O0;

        /* renamed from: OooO0O0  reason: collision with other field name */
        public final Path f20023OooO0O0;
        public float OooO0OO;
        public float OooO0Oo;

        public C7306OooO0oO() {
            this.f20012OooO00o = new Matrix();
            this.OooO00o = 0.0f;
            this.f20020OooO0O0 = 0.0f;
            this.OooO0OO = 0.0f;
            this.OooO0Oo = 0.0f;
            this.f20021OooO0O0 = 255;
            this.f20019OooO00o = null;
            this.f20018OooO00o = null;
            this.f20016OooO00o = new C6971o0000oO0<>();
            this.f20017OooO00o = new C7304OooO0Oo();
            this.f20014OooO00o = new Path();
            this.f20023OooO0O0 = new Path();
        }

        public static float OooO00o(float f, float f2, float f3, float f4) {
            return (f * f4) - (f2 * f3);
        }

        private void OooO00o(C7304OooO0Oo oooO0Oo, Matrix matrix, Canvas canvas, int i, int i2, ColorFilter colorFilter) {
            oooO0Oo.f20004OooO00o.set(matrix);
            oooO0Oo.f20004OooO00o.preConcat(oooO0Oo.f20008OooO0O0);
            canvas.save();
            for (int i3 = 0; i3 < oooO0Oo.f20006OooO00o.size(); i3++) {
                AbstractC7305OooO0o0 oooO0o0 = oooO0Oo.f20006OooO00o.get(i3);
                if (oooO0o0 instanceof C7304OooO0Oo) {
                    OooO00o((C7304OooO0Oo) oooO0o0, oooO0Oo.f20004OooO00o, canvas, i, i2, colorFilter);
                } else if (oooO0o0 instanceof OooO0o) {
                    OooO00o(oooO0Oo, (OooO0o) oooO0o0, canvas, i, i2, colorFilter);
                }
            }
            canvas.restore();
        }

        public float getAlpha() {
            return ((float) getRootAlpha()) / 255.0f;
        }

        public int getRootAlpha() {
            return this.f20021OooO0O0;
        }

        public void setAlpha(float f) {
            setRootAlpha((int) (f * 255.0f));
        }

        public void setRootAlpha(int i) {
            this.f20021OooO0O0 = i;
        }

        public void OooO00o(Canvas canvas, int i, int i2, ColorFilter colorFilter) {
            OooO00o(this.f20017OooO00o, OooO0O0, canvas, i, i2, colorFilter);
        }

        public C7306OooO0oO(C7306OooO0oO oooO0oO) {
            this.f20012OooO00o = new Matrix();
            this.OooO00o = 0.0f;
            this.f20020OooO0O0 = 0.0f;
            this.OooO0OO = 0.0f;
            this.OooO0Oo = 0.0f;
            this.f20021OooO0O0 = 255;
            this.f20019OooO00o = null;
            this.f20018OooO00o = null;
            C6971o0000oO0<String, Object> o0000oo0 = new C6971o0000oO0<>();
            this.f20016OooO00o = o0000oo0;
            this.f20017OooO00o = new C7304OooO0Oo(oooO0oO.f20017OooO00o, o0000oo0);
            this.f20014OooO00o = new Path(oooO0oO.f20014OooO00o);
            this.f20023OooO0O0 = new Path(oooO0oO.f20023OooO0O0);
            this.OooO00o = oooO0oO.OooO00o;
            this.f20020OooO0O0 = oooO0oO.f20020OooO0O0;
            this.OooO0OO = oooO0oO.OooO0OO;
            this.OooO0Oo = oooO0oO.OooO0Oo;
            this.f20011OooO00o = oooO0oO.f20011OooO00o;
            this.f20021OooO0O0 = oooO0oO.f20021OooO0O0;
            this.f20019OooO00o = oooO0oO.f20019OooO00o;
            String str = oooO0oO.f20019OooO00o;
            if (str != null) {
                this.f20016OooO00o.put(str, this);
            }
            this.f20018OooO00o = oooO0oO.f20018OooO00o;
        }

        private void OooO00o(C7304OooO0Oo oooO0Oo, OooO0o oooO0o, Canvas canvas, int i, int i2, ColorFilter colorFilter) {
            float f = ((float) i) / this.OooO0OO;
            float f2 = ((float) i2) / this.OooO0Oo;
            float min = Math.min(f, f2);
            Matrix matrix = oooO0Oo.f20004OooO00o;
            this.f20012OooO00o.set(matrix);
            this.f20012OooO00o.postScale(f, f2);
            float OooO00o2 = OooO00o(matrix);
            if (OooO00o2 != 0.0f) {
                oooO0o.OooO00o(this.f20014OooO00o);
                Path path = this.f20014OooO00o;
                this.f20023OooO0O0.reset();
                if (oooO0o.OooO0OO()) {
                    this.f20023OooO0O0.addPath(path, this.f20012OooO00o);
                    canvas.clipPath(this.f20023OooO0O0);
                    return;
                }
                OooO0OO oooO0OO = (OooO0OO) oooO0o;
                if (!(oooO0OO.OooO0Oo == 0.0f && oooO0OO.OooO0o0 == 1.0f)) {
                    float f3 = oooO0OO.OooO0Oo;
                    float f4 = oooO0OO.OooO0o;
                    float f5 = (f3 + f4) % 1.0f;
                    float f6 = (oooO0OO.OooO0o0 + f4) % 1.0f;
                    if (this.f20015OooO00o == null) {
                        this.f20015OooO00o = new PathMeasure();
                    }
                    this.f20015OooO00o.setPath(this.f20014OooO00o, false);
                    float length = this.f20015OooO00o.getLength();
                    float f7 = f5 * length;
                    float f8 = f6 * length;
                    path.reset();
                    if (f7 > f8) {
                        this.f20015OooO00o.getSegment(f7, length, path, true);
                        this.f20015OooO00o.getSegment(0.0f, f8, path, true);
                    } else {
                        this.f20015OooO00o.getSegment(f7, f8, path, true);
                    }
                    path.rLineTo(0.0f, 0.0f);
                }
                this.f20023OooO0O0.addPath(path, this.f20012OooO00o);
                if (oooO0OO.f20001OooO0O0.OooO0OO()) {
                    C7019o000o0O0 o000o0o0 = oooO0OO.f20001OooO0O0;
                    if (this.f20022OooO0O0 == null) {
                        Paint paint = new Paint(1);
                        this.f20022OooO0O0 = paint;
                        paint.setStyle(Paint.Style.FILL);
                    }
                    Paint paint2 = this.f20022OooO0O0;
                    if (o000o0o0.m18280OooO00o()) {
                        Shader OooO00o3 = o000o0o0.m18278OooO00o();
                        OooO00o3.setLocalMatrix(this.f20012OooO00o);
                        paint2.setShader(OooO00o3);
                        paint2.setAlpha(Math.round(oooO0OO.f20002OooO0OO * 255.0f));
                    } else {
                        paint2.setColor(C7303o0O0OOOo.OooO00o(o000o0o0.OooO00o(), oooO0OO.f20002OooO0OO));
                    }
                    paint2.setColorFilter(colorFilter);
                    this.f20023OooO0O0.setFillType(oooO0OO.f20000OooO0O0 == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                    canvas.drawPath(this.f20023OooO0O0, paint2);
                }
                if (oooO0OO.f19998OooO00o.OooO0OO()) {
                    C7019o000o0O0 o000o0o02 = oooO0OO.f19998OooO00o;
                    if (this.f20013OooO00o == null) {
                        Paint paint3 = new Paint(1);
                        this.f20013OooO00o = paint3;
                        paint3.setStyle(Paint.Style.STROKE);
                    }
                    Paint paint4 = this.f20013OooO00o;
                    Paint.Join join = oooO0OO.f19997OooO00o;
                    if (join != null) {
                        paint4.setStrokeJoin(join);
                    }
                    Paint.Cap cap = oooO0OO.f19996OooO00o;
                    if (cap != null) {
                        paint4.setStrokeCap(cap);
                    }
                    paint4.setStrokeMiter(oooO0OO.OooO0oO);
                    if (o000o0o02.m18280OooO00o()) {
                        Shader OooO00o4 = o000o0o02.m18278OooO00o();
                        OooO00o4.setLocalMatrix(this.f20012OooO00o);
                        paint4.setShader(OooO00o4);
                        paint4.setAlpha(Math.round(oooO0OO.OooO0O0 * 255.0f));
                    } else {
                        paint4.setColor(C7303o0O0OOOo.OooO00o(o000o0o02.OooO00o(), oooO0OO.OooO0O0));
                    }
                    paint4.setColorFilter(colorFilter);
                    paint4.setStrokeWidth(oooO0OO.OooO00o * min * OooO00o2);
                    canvas.drawPath(this.f20023OooO0O0, paint4);
                }
            }
        }

        private float OooO00o(Matrix matrix) {
            float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
            matrix.mapVectors(fArr);
            float OooO00o2 = OooO00o(fArr[0], fArr[1], fArr[2], fArr[3]);
            float max = Math.max((float) Math.hypot((double) fArr[0], (double) fArr[1]), (float) Math.hypot((double) fArr[2], (double) fArr[3]));
            if (max > 0.0f) {
                return Math.abs(OooO00o2) / max;
            }
            return 0.0f;
        }

        public boolean OooO00o() {
            if (this.f20018OooO00o == null) {
                this.f20018OooO00o = Boolean.valueOf(this.f20017OooO00o.m18806OooO00o());
            }
            return this.f20018OooO00o.booleanValue();
        }

        public boolean OooO00o(int[] iArr) {
            return this.f20017OooO00o.OooO00o(iArr);
        }
    }

    public static C7303o0O0OOOo OooO00o(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        C7303o0O0OOOo o0o0oooo = new C7303o0O0OOOo();
        o0o0oooo.inflate(resources, xmlPullParser, attributeSet, theme);
        return o0o0oooo;
    }

    public static int OooO00o(int i, float f) {
        return (i & 16777215) | (((int) (((float) Color.alpha(i)) * f)) << 24);
    }

    public static PorterDuff.Mode OooO00o(int i, PorterDuff.Mode mode) {
        if (i == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }

    private void OooO00o(TypedArray typedArray, XmlPullParser xmlPullParser) throws XmlPullParserException {
        C7307OooO0oo oooO0oo = this.f19994OooO00o;
        C7306OooO0oO oooO0oO = oooO0oo.f20028OooO00o;
        oooO0oo.f20027OooO00o = OooO00o(C7022o000o0o.OooO0O0(typedArray, xmlPullParser, "tintMode", 6, -1), PorterDuff.Mode.SRC_IN);
        ColorStateList colorStateList = typedArray.getColorStateList(1);
        if (colorStateList != null) {
            oooO0oo.f20024OooO00o = colorStateList;
        }
        oooO0oo.f20029OooO00o = C7022o000o0o.OooO00o(typedArray, xmlPullParser, "autoMirrored", 5, oooO0oo.f20029OooO00o);
        oooO0oO.OooO0OO = C7022o000o0o.OooO00o(typedArray, xmlPullParser, "viewportWidth", 7, oooO0oO.OooO0OO);
        float OooO00o2 = C7022o000o0o.OooO00o(typedArray, xmlPullParser, "viewportHeight", 8, oooO0oO.OooO0Oo);
        oooO0oO.OooO0Oo = OooO00o2;
        if (oooO0oO.OooO0OO <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        } else if (OooO00o2 > 0.0f) {
            oooO0oO.OooO00o = typedArray.getDimension(3, oooO0oO.OooO00o);
            float dimension = typedArray.getDimension(2, oooO0oO.f20020OooO0O0);
            oooO0oO.f20020OooO0O0 = dimension;
            if (oooO0oO.OooO00o <= 0.0f) {
                throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires width > 0");
            } else if (dimension > 0.0f) {
                oooO0oO.setAlpha(C7022o000o0o.OooO00o(typedArray, xmlPullParser, "alpha", 4, oooO0oO.getAlpha()));
                String string = typedArray.getString(0);
                if (string != null) {
                    oooO0oO.f20019OooO00o = string;
                    oooO0oO.f20016OooO00o.put(string, oooO0oO);
                }
            } else {
                throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires height > 0");
            }
        } else {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    private void m18804OooO00o(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        C7307OooO0oo oooO0oo = this.f19994OooO00o;
        C7306OooO0oO oooO0oO = oooO0oo.f20028OooO00o;
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.push(oooO0oO.f20017OooO00o);
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        boolean z = true;
        while (eventType != 1 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                C7304OooO0Oo oooO0Oo = (C7304OooO0Oo) arrayDeque.peek();
                if ("path".equals(name)) {
                    OooO0OO oooO0OO = new OooO0OO();
                    oooO0OO.OooO00o(resources, attributeSet, theme, xmlPullParser);
                    oooO0Oo.f20006OooO00o.add(oooO0OO);
                    if (oooO0OO.getPathName() != null) {
                        oooO0oO.f20016OooO00o.put(oooO0OO.getPathName(), oooO0OO);
                    }
                    z = false;
                    oooO0oo.OooO00o = ((OooO0o) oooO0OO).OooO00o | oooO0oo.OooO00o;
                } else if (f19988o0ooOoO.equals(name)) {
                    OooO0O0 oooO0O0 = new OooO0O0();
                    oooO0O0.OooO00o(resources, attributeSet, theme, xmlPullParser);
                    oooO0Oo.f20006OooO00o.add(oooO0O0);
                    if (oooO0O0.getPathName() != null) {
                        oooO0oO.f20016OooO00o.put(oooO0O0.getPathName(), oooO0O0);
                    }
                    oooO0oo.OooO00o = ((OooO0o) oooO0O0).OooO00o | oooO0oo.OooO00o;
                } else if ("group".equals(name)) {
                    C7304OooO0Oo oooO0Oo2 = new C7304OooO0Oo();
                    oooO0Oo2.OooO00o(resources, attributeSet, theme, xmlPullParser);
                    oooO0Oo.f20006OooO00o.add(oooO0Oo2);
                    arrayDeque.push(oooO0Oo2);
                    if (oooO0Oo2.getGroupName() != null) {
                        oooO0oO.f20016OooO00o.put(oooO0Oo2.getGroupName(), oooO0Oo2);
                    }
                    oooO0oo.OooO00o = oooO0Oo2.f20003OooO00o | oooO0oo.OooO00o;
                }
            } else if (eventType == 3 && "group".equals(xmlPullParser.getName())) {
                arrayDeque.pop();
            }
            eventType = xmlPullParser.next();
        }
        if (z) {
            throw new XmlPullParserException("no path defined");
        }
    }

    private void OooO00o(C7304OooO0Oo oooO0Oo, int i) {
        String str = "";
        for (int i2 = 0; i2 < i; i2++) {
            str = str + C9878I1.f23489OooO00o;
        }
        String str2 = str + "current group is :" + oooO0Oo.getGroupName() + " rotation is " + oooO0Oo.OooO00o;
        String str3 = str + "matrix is :" + oooO0Oo.getLocalMatrix().toString();
        for (int i3 = 0; i3 < oooO0Oo.f20006OooO00o.size(); i3++) {
            AbstractC7305OooO0o0 oooO0o0 = oooO0Oo.f20006OooO00o.get(i3);
            if (oooO0o0 instanceof C7304OooO0Oo) {
                OooO00o((C7304OooO0Oo) oooO0o0, i + 1);
            } else {
                ((OooO0o) oooO0o0).OooO00o(i + 1);
            }
        }
    }

    public void OooO00o(boolean z) {
        this.OooO0OO = z;
    }

    private boolean OooO00o() {
        if (Build.VERSION.SDK_INT < 17 || !isAutoMirrored() || C7043o00O0000.OooO0O0((Drawable) this) != 1) {
            return false;
        }
        return true;
    }
}

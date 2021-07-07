package com.p118pd.sdk;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.os.Build;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.core.view.ViewCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import java.lang.reflect.Method;

@Deprecated
/* renamed from: com.pd.sdk.o00oO0O0  reason: case insensitive filesystem */
public class C7191o00oO0O0 implements DrawerLayout.AbstractC5041OooO0Oo {
    public static final float OooO00o = 0.33333334f;

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final String f19667OooO00o = "ActionBarDrawerToggle";

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final int[] f19668OooO00o = {16843531};
    public static final int OooO0Oo = 16908332;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final int f19669OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final Activity f19670OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Drawable f19671OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final DrawerLayout f19672OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final OooO00o f19673OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public OooO0OO f19674OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C7192OooO0Oo f19675OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public boolean f19676OooO00o;
    public final int OooO0O0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public Drawable f19677OooO0O0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public boolean f19678OooO0O0;
    public final int OooO0OO;

    @Deprecated
    /* renamed from: com.pd.sdk.o00oO0O0$OooO00o */
    public interface OooO00o {
        @Nullable
        Drawable OooO00o();

        void OooO00o(@StringRes int i);

        void OooO00o(Drawable drawable, @StringRes int i);
    }

    @Deprecated
    /* renamed from: com.pd.sdk.o00oO0O0$OooO0O0 */
    public interface OooO0O0 {
        @Nullable
        OooO00o OooO00o();
    }

    /* renamed from: com.pd.sdk.o00oO0O0$OooO0OO */
    public static class OooO0OO {
        public ImageView OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public Method f19679OooO00o;
        public Method OooO0O0;

        public OooO0OO(Activity activity) {
            try {
                this.f19679OooO00o = ActionBar.class.getDeclaredMethod("setHomeAsUpIndicator", Drawable.class);
                this.OooO0O0 = ActionBar.class.getDeclaredMethod("setHomeActionContentDescription", Integer.TYPE);
            } catch (NoSuchMethodException unused) {
                View findViewById = activity.findViewById(C7191o00oO0O0.OooO0Oo);
                if (findViewById != null) {
                    ViewGroup viewGroup = (ViewGroup) findViewById.getParent();
                    if (viewGroup.getChildCount() == 2) {
                        View childAt = viewGroup.getChildAt(0);
                        childAt = childAt.getId() == 16908332 ? viewGroup.getChildAt(1) : childAt;
                        if (childAt instanceof ImageView) {
                            this.OooO00o = (ImageView) childAt;
                        }
                    }
                }
            }
        }
    }

    /* renamed from: com.pd.sdk.o00oO0O0$OooO0Oo  reason: case insensitive filesystem */
    public class C7192OooO0Oo extends InsetDrawable implements Drawable.Callback {
        public final Rect OooO00o;
        public final boolean OooO0O0;
        public float OooO0Oo;
        public float OooO0o0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C7192OooO0Oo(Drawable drawable) {
            super(drawable, 0);
            boolean z = false;
            this.OooO0O0 = Build.VERSION.SDK_INT > 18 ? true : z;
            this.OooO00o = new Rect();
        }

        public float OooO00o() {
            return this.OooO0Oo;
        }

        public void OooO0O0(float f) {
            this.OooO0Oo = f;
            invalidateSelf();
        }

        public void draw(@NonNull Canvas canvas) {
            copyBounds(this.OooO00o);
            canvas.save();
            int i = 1;
            boolean z = ViewCompat.m14593OooO0o(C7191o00oO0O0.this.f19670OooO00o.getWindow().getDecorView()) == 1;
            if (z) {
                i = -1;
            }
            float width = (float) this.OooO00o.width();
            canvas.translate((-this.OooO0o0) * width * this.OooO0Oo * ((float) i), 0.0f);
            if (z && !this.OooO0O0) {
                canvas.translate(width, 0.0f);
                canvas.scale(-1.0f, 1.0f);
            }
            super.draw(canvas);
            canvas.restore();
        }

        public void OooO00o(float f) {
            this.OooO0o0 = f;
            invalidateSelf();
        }
    }

    public C7191o00oO0O0(Activity activity, DrawerLayout drawerLayout, @DrawableRes int i, @StringRes int i2, @StringRes int i3) {
        this(activity, drawerLayout, !OooO00o(activity), i, i2, i3);
    }

    public static boolean OooO00o(Context context) {
        return context.getApplicationInfo().targetSdkVersion >= 21 && Build.VERSION.SDK_INT >= 21;
    }

    private void OooO0O0(int i) {
        OooO00o oooO00o = this.f19673OooO00o;
        if (oooO00o != null) {
            oooO00o.OooO00o(i);
        } else if (Build.VERSION.SDK_INT >= 18) {
            ActionBar actionBar = this.f19670OooO00o.getActionBar();
            if (actionBar != null) {
                actionBar.setHomeActionContentDescription(i);
            }
        } else {
            if (this.f19674OooO00o == null) {
                this.f19674OooO00o = new OooO0OO(this.f19670OooO00o);
            }
            if (this.f19674OooO00o.f19679OooO00o != null) {
                try {
                    ActionBar actionBar2 = this.f19670OooO00o.getActionBar();
                    this.f19674OooO00o.OooO0O0.invoke(actionBar2, Integer.valueOf(i));
                    actionBar2.setSubtitle(actionBar2.getSubtitle());
                } catch (Exception unused) {
                }
            }
        }
    }

    @Override // androidx.drawerlayout.widget.DrawerLayout.AbstractC5041OooO0Oo
    public void onDrawerClosed(View view) {
        this.f19675OooO00o.OooO0O0(0.0f);
        if (this.f19676OooO00o) {
            OooO0O0(this.OooO0O0);
        }
    }

    @Override // androidx.drawerlayout.widget.DrawerLayout.AbstractC5041OooO0Oo
    public void onDrawerOpened(View view) {
        this.f19675OooO00o.OooO0O0(1.0f);
        if (this.f19676OooO00o) {
            OooO0O0(this.OooO0OO);
        }
    }

    @Override // androidx.drawerlayout.widget.DrawerLayout.AbstractC5041OooO0Oo
    public void onDrawerSlide(View view, float f) {
        float f2;
        float OooO00o2 = this.f19675OooO00o.OooO00o();
        if (f > 0.5f) {
            f2 = Math.max(OooO00o2, Math.max(0.0f, f - 0.5f) * 2.0f);
        } else {
            f2 = Math.min(OooO00o2, f * 2.0f);
        }
        this.f19675OooO00o.OooO0O0(f2);
    }

    @Override // androidx.drawerlayout.widget.DrawerLayout.AbstractC5041OooO0Oo
    public void onDrawerStateChanged(int i) {
    }

    public C7191o00oO0O0(Activity activity, DrawerLayout drawerLayout, boolean z, @DrawableRes int i, @StringRes int i2, @StringRes int i3) {
        this.f19676OooO00o = true;
        this.f19670OooO00o = activity;
        if (activity instanceof OooO0O0) {
            this.f19673OooO00o = ((OooO0O0) activity).OooO00o();
        } else {
            this.f19673OooO00o = null;
        }
        this.f19672OooO00o = drawerLayout;
        this.f19669OooO00o = i;
        this.OooO0O0 = i2;
        this.OooO0OO = i3;
        this.f19671OooO00o = OooO00o();
        this.f19677OooO0O0 = C7009o000OoOo.m18256OooO00o((Context) activity, i);
        C7192OooO0Oo oooO0Oo = new C7192OooO0Oo(this.f19677OooO0O0);
        this.f19675OooO00o = oooO0Oo;
        oooO0Oo.OooO00o(z ? 0.33333334f : 0.0f);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m18680OooO00o() {
        if (this.f19672OooO00o.isDrawerOpen(8388611)) {
            this.f19675OooO00o.OooO0O0(1.0f);
        } else {
            this.f19675OooO00o.OooO0O0(0.0f);
        }
        if (this.f19676OooO00o) {
            OooO00o(this.f19675OooO00o, this.f19672OooO00o.isDrawerOpen(8388611) ? this.OooO0OO : this.OooO0O0);
        }
    }

    public void OooO00o(Drawable drawable) {
        if (drawable == null) {
            this.f19671OooO00o = OooO00o();
            this.f19678OooO0O0 = false;
        } else {
            this.f19671OooO00o = drawable;
            this.f19678OooO0O0 = true;
        }
        if (!this.f19676OooO00o) {
            OooO00o(this.f19671OooO00o, 0);
        }
    }

    public void OooO00o(int i) {
        OooO00o(i != 0 ? C7009o000OoOo.m18256OooO00o((Context) this.f19670OooO00o, i) : null);
    }

    public void OooO00o(boolean z) {
        if (z != this.f19676OooO00o) {
            if (z) {
                OooO00o(this.f19675OooO00o, this.f19672OooO00o.isDrawerOpen(8388611) ? this.OooO0OO : this.OooO0O0);
            } else {
                OooO00o(this.f19671OooO00o, 0);
            }
            this.f19676OooO00o = z;
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m18681OooO00o() {
        return this.f19676OooO00o;
    }

    public void OooO00o(Configuration configuration) {
        if (!this.f19678OooO0O0) {
            this.f19671OooO00o = OooO00o();
        }
        this.f19677OooO0O0 = C7009o000OoOo.m18256OooO00o((Context) this.f19670OooO00o, this.f19669OooO00o);
        m18680OooO00o();
    }

    public boolean OooO00o(MenuItem menuItem) {
        if (menuItem == null || menuItem.getItemId() != 16908332 || !this.f19676OooO00o) {
            return false;
        }
        if (this.f19672OooO00o.isDrawerVisible(8388611)) {
            this.f19672OooO00o.closeDrawer(8388611);
            return true;
        }
        this.f19672OooO00o.openDrawer(8388611);
        return true;
    }

    private Drawable OooO00o() {
        Context context;
        OooO00o oooO00o = this.f19673OooO00o;
        if (oooO00o != null) {
            return oooO00o.OooO00o();
        }
        if (Build.VERSION.SDK_INT >= 18) {
            ActionBar actionBar = this.f19670OooO00o.getActionBar();
            if (actionBar != null) {
                context = actionBar.getThemedContext();
            } else {
                context = this.f19670OooO00o;
            }
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, f19668OooO00o, 16843470, 0);
            Drawable drawable = obtainStyledAttributes.getDrawable(0);
            obtainStyledAttributes.recycle();
            return drawable;
        }
        TypedArray obtainStyledAttributes2 = this.f19670OooO00o.obtainStyledAttributes(f19668OooO00o);
        Drawable drawable2 = obtainStyledAttributes2.getDrawable(0);
        obtainStyledAttributes2.recycle();
        return drawable2;
    }

    private void OooO00o(Drawable drawable, int i) {
        OooO00o oooO00o = this.f19673OooO00o;
        if (oooO00o != null) {
            oooO00o.OooO00o(drawable, i);
        } else if (Build.VERSION.SDK_INT >= 18) {
            ActionBar actionBar = this.f19670OooO00o.getActionBar();
            if (actionBar != null) {
                actionBar.setHomeAsUpIndicator(drawable);
                actionBar.setHomeActionContentDescription(i);
            }
        } else {
            if (this.f19674OooO00o == null) {
                this.f19674OooO00o = new OooO0OO(this.f19670OooO00o);
            }
            OooO0OO oooO0OO = this.f19674OooO00o;
            if (oooO0OO.f19679OooO00o != null) {
                try {
                    ActionBar actionBar2 = this.f19670OooO00o.getActionBar();
                    this.f19674OooO00o.f19679OooO00o.invoke(actionBar2, drawable);
                    this.f19674OooO00o.OooO0O0.invoke(actionBar2, Integer.valueOf(i));
                } catch (Exception unused) {
                }
            } else {
                ImageView imageView = oooO0OO.OooO00o;
                if (imageView != null) {
                    imageView.setImageDrawable(drawable);
                }
            }
        }
    }
}

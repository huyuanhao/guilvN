package com.p118pd.sdk;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.MenuItem;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.appcompat.graphics.drawable.DrawerArrowDrawable;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;
import com.p118pd.sdk.C5931OooO0O0;

/* renamed from: com.pd.sdk.OooO00o */
public class OooO00o implements DrawerLayout.AbstractC5041OooO0Oo {
    public final int OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Drawable f17012OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public View.OnClickListener f17013OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public DrawerArrowDrawable f17014OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final DrawerLayout f17015OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final OooO0O0 f17016OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public boolean f17017OooO00o;
    public final int OooO0O0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public boolean f17018OooO0O0;
    public boolean OooO0OO;
    public boolean OooO0Oo;

    /* renamed from: com.pd.sdk.OooO00o$OooO00o  reason: collision with other inner class name */
    public class View$OnClickListenerC4931OooO00o implements View.OnClickListener {
        public View$OnClickListenerC4931OooO00o() {
        }

        public void onClick(View view) {
            OooO00o oooO00o = OooO00o.this;
            if (oooO00o.f17018OooO0O0) {
                oooO00o.OooO0O0();
                return;
            }
            View.OnClickListener onClickListener = oooO00o.f17013OooO00o;
            if (onClickListener != null) {
                onClickListener.onClick(view);
            }
        }
    }

    /* renamed from: com.pd.sdk.OooO00o$OooO0O0 */
    public interface OooO0O0 {
        Context OooO00o();

        /* renamed from: OooO00o  reason: collision with other method in class */
        Drawable m16663OooO00o();

        void OooO00o(@StringRes int i);

        void OooO00o(Drawable drawable, @StringRes int i);

        /* renamed from: OooO00o  reason: collision with other method in class */
        boolean m16664OooO00o();
    }

    /* renamed from: com.pd.sdk.OooO00o$OooO0OO */
    public interface OooO0OO {
        @Nullable
        OooO0O0 getDrawerToggleDelegate();
    }

    public OooO00o(Activity activity, DrawerLayout drawerLayout, @StringRes int i, @StringRes int i2) {
        this(activity, null, drawerLayout, null, i, i2);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m16660OooO00o() {
        if (this.f17015OooO00o.isDrawerOpen(8388611)) {
            OooO00o(1.0f);
        } else {
            OooO00o(0.0f);
        }
        if (this.f17018OooO0O0) {
            OooO00o(this.f17014OooO00o, this.f17015OooO00o.isDrawerOpen(8388611) ? this.OooO0O0 : this.OooO00o);
        }
    }

    public void OooO0O0() {
        int drawerLockMode = this.f17015OooO00o.getDrawerLockMode(8388611);
        if (this.f17015OooO00o.isDrawerVisible(8388611) && drawerLockMode != 2) {
            this.f17015OooO00o.closeDrawer(8388611);
        } else if (drawerLockMode != 1) {
            this.f17015OooO00o.openDrawer(8388611);
        }
    }

    @Override // androidx.drawerlayout.widget.DrawerLayout.AbstractC5041OooO0Oo
    public void onDrawerClosed(View view) {
        OooO00o(0.0f);
        if (this.f17018OooO0O0) {
            OooO00o(this.OooO00o);
        }
    }

    @Override // androidx.drawerlayout.widget.DrawerLayout.AbstractC5041OooO0Oo
    public void onDrawerOpened(View view) {
        OooO00o(1.0f);
        if (this.f17018OooO0O0) {
            OooO00o(this.OooO0O0);
        }
    }

    @Override // androidx.drawerlayout.widget.DrawerLayout.AbstractC5041OooO0Oo
    public void onDrawerSlide(View view, float f) {
        if (this.f17017OooO00o) {
            OooO00o(Math.min(1.0f, Math.max(0.0f, f)));
        } else {
            OooO00o(0.0f);
        }
    }

    @Override // androidx.drawerlayout.widget.DrawerLayout.AbstractC5041OooO0Oo
    public void onDrawerStateChanged(int i) {
    }

    /* renamed from: com.pd.sdk.OooO00o$OooO0o0  reason: case insensitive filesystem */
    public static class C5930OooO0o0 implements OooO0O0 {
        public final Drawable OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final Toolbar f17020OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final CharSequence f17021OooO00o;

        public C5930OooO0o0(Toolbar toolbar) {
            this.f17020OooO00o = toolbar;
            this.OooO00o = toolbar.getNavigationIcon();
            this.f17021OooO00o = toolbar.getNavigationContentDescription();
        }

        @Override // com.p118pd.sdk.OooO00o.OooO0O0
        public void OooO00o(Drawable drawable, @StringRes int i) {
            this.f17020OooO00o.setNavigationIcon(drawable);
            OooO00o(i);
        }

        @Override // com.p118pd.sdk.OooO00o.OooO0O0, com.p118pd.sdk.OooO00o.OooO0O0, com.p118pd.sdk.OooO00o.OooO0O0
        /* renamed from: OooO00o  reason: collision with other method in class */
        public boolean m16668OooO00o() {
            return true;
        }

        @Override // com.p118pd.sdk.OooO00o.OooO0O0
        public void OooO00o(@StringRes int i) {
            if (i == 0) {
                this.f17020OooO00o.setNavigationContentDescription(this.f17021OooO00o);
            } else {
                this.f17020OooO00o.setNavigationContentDescription(i);
            }
        }

        @Override // com.p118pd.sdk.OooO00o.OooO0O0, com.p118pd.sdk.OooO00o.OooO0O0, com.p118pd.sdk.OooO00o.OooO0O0
        /* renamed from: OooO00o  reason: collision with other method in class */
        public Drawable m16667OooO00o() {
            return this.OooO00o;
        }

        @Override // com.p118pd.sdk.OooO00o.OooO0O0, com.p118pd.sdk.OooO00o.OooO0O0, com.p118pd.sdk.OooO00o.OooO0O0
        public Context OooO00o() {
            return this.f17020OooO00o.getContext();
        }
    }

    public OooO00o(Activity activity, DrawerLayout drawerLayout, Toolbar toolbar, @StringRes int i, @StringRes int i2) {
        this(activity, toolbar, drawerLayout, null, i, i2);
    }

    public OooO00o(Activity activity, Toolbar toolbar, DrawerLayout drawerLayout, DrawerArrowDrawable drawerArrowDrawable, @StringRes int i, @StringRes int i2) {
        this.f17017OooO00o = true;
        this.f17018OooO0O0 = true;
        this.OooO0Oo = false;
        if (toolbar != null) {
            this.f17016OooO00o = new C5930OooO0o0(toolbar);
            toolbar.setNavigationOnClickListener(new View$OnClickListenerC4931OooO00o());
        } else if (activity instanceof OooO0OO) {
            this.f17016OooO00o = ((OooO0OO) activity).getDrawerToggleDelegate();
        } else {
            this.f17016OooO00o = new C5929OooO0Oo(activity);
        }
        this.f17015OooO00o = drawerLayout;
        this.OooO00o = i;
        this.OooO0O0 = i2;
        if (drawerArrowDrawable == null) {
            this.f17014OooO00o = new DrawerArrowDrawable(this.f17016OooO00o.OooO00o());
        } else {
            this.f17014OooO00o = drawerArrowDrawable;
        }
        this.f17012OooO00o = OooO00o();
    }

    /* renamed from: com.pd.sdk.OooO00o$OooO0Oo  reason: case insensitive filesystem */
    public static class C5929OooO0Oo implements OooO0O0 {
        public final Activity OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public C5931OooO0O0.OooO00o f17019OooO00o;

        public C5929OooO0Oo(Activity activity) {
            this.OooO00o = activity;
        }

        @Override // com.p118pd.sdk.OooO00o.OooO0O0, com.p118pd.sdk.OooO00o.OooO0O0, com.p118pd.sdk.OooO00o.OooO0O0
        /* renamed from: OooO00o  reason: collision with other method in class */
        public Drawable m16665OooO00o() {
            if (Build.VERSION.SDK_INT < 18) {
                return C5931OooO0O0.OooO00o(this.OooO00o);
            }
            TypedArray obtainStyledAttributes = OooO00o().obtainStyledAttributes(null, new int[]{16843531}, 16843470, 0);
            Drawable drawable = obtainStyledAttributes.getDrawable(0);
            obtainStyledAttributes.recycle();
            return drawable;
        }

        @Override // com.p118pd.sdk.OooO00o.OooO0O0, com.p118pd.sdk.OooO00o.OooO0O0, com.p118pd.sdk.OooO00o.OooO0O0
        public Context OooO00o() {
            ActionBar actionBar = this.OooO00o.getActionBar();
            if (actionBar != null) {
                return actionBar.getThemedContext();
            }
            return this.OooO00o;
        }

        @Override // com.p118pd.sdk.OooO00o.OooO0O0, com.p118pd.sdk.OooO00o.OooO0O0, com.p118pd.sdk.OooO00o.OooO0O0
        /* renamed from: OooO00o  reason: collision with other method in class */
        public boolean m16666OooO00o() {
            ActionBar actionBar = this.OooO00o.getActionBar();
            return (actionBar == null || (actionBar.getDisplayOptions() & 4) == 0) ? false : true;
        }

        @Override // com.p118pd.sdk.OooO00o.OooO0O0
        public void OooO00o(Drawable drawable, int i) {
            ActionBar actionBar = this.OooO00o.getActionBar();
            if (actionBar == null) {
                return;
            }
            if (Build.VERSION.SDK_INT >= 18) {
                actionBar.setHomeAsUpIndicator(drawable);
                actionBar.setHomeActionContentDescription(i);
                return;
            }
            actionBar.setDisplayShowHomeEnabled(true);
            this.f17019OooO00o = C5931OooO0O0.OooO00o(this.f17019OooO00o, this.OooO00o, drawable, i);
            actionBar.setDisplayShowHomeEnabled(false);
        }

        @Override // com.p118pd.sdk.OooO00o.OooO0O0
        public void OooO00o(int i) {
            if (Build.VERSION.SDK_INT >= 18) {
                ActionBar actionBar = this.OooO00o.getActionBar();
                if (actionBar != null) {
                    actionBar.setHomeActionContentDescription(i);
                    return;
                }
                return;
            }
            this.f17019OooO00o = C5931OooO0O0.OooO00o(this.f17019OooO00o, this.OooO00o, i);
        }
    }

    public void OooO0O0(int i) {
        OooO00o(i != 0 ? this.f17015OooO00o.getResources().getDrawable(i) : null);
    }

    public void OooO0O0(boolean z) {
        this.f17017OooO00o = z;
        if (!z) {
            OooO00o(0.0f);
        }
    }

    public void OooO00o(Configuration configuration) {
        if (!this.OooO0OO) {
            this.f17012OooO00o = OooO00o();
        }
        m16660OooO00o();
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public boolean m16662OooO0O0() {
        return this.f17017OooO00o;
    }

    public boolean OooO00o(MenuItem menuItem) {
        if (menuItem == null || menuItem.getItemId() != 16908332 || !this.f17018OooO0O0) {
            return false;
        }
        OooO0O0();
        return true;
    }

    public void OooO00o(Drawable drawable) {
        if (drawable == null) {
            this.f17012OooO00o = OooO00o();
            this.OooO0OO = false;
        } else {
            this.f17012OooO00o = drawable;
            this.OooO0OO = true;
        }
        if (!this.f17018OooO0O0) {
            OooO00o(this.f17012OooO00o, 0);
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m16661OooO00o() {
        return this.f17018OooO0O0;
    }

    public void OooO00o(boolean z) {
        if (z != this.f17018OooO0O0) {
            if (z) {
                OooO00o(this.f17014OooO00o, this.f17015OooO00o.isDrawerOpen(8388611) ? this.OooO0O0 : this.OooO00o);
            } else {
                OooO00o(this.f17012OooO00o, 0);
            }
            this.f17018OooO0O0 = z;
        }
    }

    @NonNull
    /* renamed from: OooO00o  reason: collision with other method in class */
    public DrawerArrowDrawable m16659OooO00o() {
        return this.f17014OooO00o;
    }

    public void OooO00o(@NonNull DrawerArrowDrawable drawerArrowDrawable) {
        this.f17014OooO00o = drawerArrowDrawable;
        m16660OooO00o();
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public View.OnClickListener m16658OooO00o() {
        return this.f17013OooO00o;
    }

    public void OooO00o(View.OnClickListener onClickListener) {
        this.f17013OooO00o = onClickListener;
    }

    public void OooO00o(Drawable drawable, int i) {
        if (!this.OooO0Oo && !this.f17016OooO00o.m16664OooO00o()) {
            this.OooO0Oo = true;
        }
        this.f17016OooO00o.OooO00o(drawable, i);
    }

    public void OooO00o(int i) {
        this.f17016OooO00o.OooO00o(i);
    }

    public Drawable OooO00o() {
        return this.f17016OooO00o.m16663OooO00o();
    }

    private void OooO00o(float f) {
        if (f == 1.0f) {
            this.f17014OooO00o.OooO0O0(true);
        } else if (f == 0.0f) {
            this.f17014OooO00o.OooO0O0(false);
        }
        this.f17014OooO00o.OooO0o(f);
    }
}

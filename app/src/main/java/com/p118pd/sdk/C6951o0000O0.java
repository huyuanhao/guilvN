package com.p118pd.sdk;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import androidx.annotation.RestrictTo;
import androidx.appcompat.C0033R;
import androidx.appcompat.widget.ActionMenuPresenter;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.ViewCompat;
import com.p118pd.sdk.AbstractC5961Oooo;
import com.p118pd.sdk.C5965Oooo00o;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: com.pd.sdk.o0000O0  reason: case insensitive filesystem */
public class C6951o0000O0 implements AbstractC7472o0Oo0oo {
    public static final long OooO00o = 200;

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final String f19128OooO00o = "ToolbarWidgetWrapper";
    public static final int OooO0Oo = 3;

    /* renamed from: OooO00o  reason: collision with other field name */
    public int f19129OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Drawable f19130OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public View f19131OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Window.Callback f19132OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Spinner f19133OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public ActionMenuPresenter f19134OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Toolbar f19135OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public CharSequence f19136OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public boolean f19137OooO00o;
    public int OooO0O0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public Drawable f19138OooO0O0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public View f19139OooO0O0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public CharSequence f19140OooO0O0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public boolean f19141OooO0O0;
    public int OooO0OO;

    /* renamed from: OooO0OO  reason: collision with other field name */
    public Drawable f19142OooO0OO;

    /* renamed from: OooO0OO  reason: collision with other field name */
    public CharSequence f19143OooO0OO;

    /* renamed from: OooO0Oo  reason: collision with other field name */
    public Drawable f19144OooO0Oo;

    /* renamed from: com.pd.sdk.o0000O0$OooO00o */
    public class OooO00o implements View.OnClickListener {
        public final C5958OooOoo0 OooO00o = new C5958OooOoo0(C6951o0000O0.this.f19135OooO00o.getContext(), 0, C7191o00oO0O0.OooO0Oo, 0, 0, C6951o0000O0.this.f19136OooO00o);

        public OooO00o() {
        }

        public void onClick(View view) {
            C6951o0000O0 o0000o0 = C6951o0000O0.this;
            Window.Callback callback = o0000o0.f19132OooO00o;
            if (callback != null && o0000o0.f19141OooO0O0) {
                callback.onMenuItemSelected(0, this.OooO00o);
            }
        }
    }

    /* renamed from: com.pd.sdk.o0000O0$OooO0O0 */
    public class OooO0O0 extends C7104o00Oo {
        public final /* synthetic */ int OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public boolean f19147OooO00o = false;

        public OooO0O0(int i) {
            this.OooO00o = i;
        }

        @Override // com.p118pd.sdk.C7104o00Oo, com.p118pd.sdk.AbstractC7617o0oOO
        public void OooO00o(View view) {
            C6951o0000O0.this.f19135OooO00o.setVisibility(0);
        }

        @Override // com.p118pd.sdk.C7104o00Oo, com.p118pd.sdk.AbstractC7617o0oOO
        public void OooO0O0(View view) {
            this.f19147OooO00o = true;
        }

        @Override // com.p118pd.sdk.C7104o00Oo, com.p118pd.sdk.AbstractC7617o0oOO
        public void OooO0OO(View view) {
            if (!this.f19147OooO00o) {
                C6951o0000O0.this.f19135OooO00o.setVisibility(this.OooO00o);
            }
        }
    }

    public C6951o0000O0(Toolbar toolbar, boolean z) {
        this(toolbar, z, C0033R.string.abc_action_bar_up_description, C0033R.C0035drawable.abc_ic_ab_back_material);
    }

    private void OooO0OO(CharSequence charSequence) {
        this.f19136OooO00o = charSequence;
        if ((this.f19129OooO00o & 8) != 0) {
            this.f19135OooO00o.setTitle(charSequence);
        }
    }

    @Override // com.p118pd.sdk.AbstractC7472o0Oo0oo
    private int OooO0o() {
        if (this.f19135OooO00o.getNavigationIcon() == null) {
            return 11;
        }
        this.f19144OooO0Oo = this.f19135OooO00o.getNavigationIcon();
        return 15;
    }

    @Override // com.p118pd.sdk.AbstractC7472o0Oo0oo
    /* renamed from: OooO  reason: collision with other method in class */
    public boolean m18129OooO() {
        return this.f19135OooO00o.hasExpandedActionView();
    }

    @Override // com.p118pd.sdk.AbstractC7472o0Oo0oo, com.p118pd.sdk.AbstractC7472o0Oo0oo, com.p118pd.sdk.AbstractC7472o0Oo0oo, com.p118pd.sdk.AbstractC7472o0Oo0oo, com.p118pd.sdk.AbstractC7472o0Oo0oo, com.p118pd.sdk.AbstractC7472o0Oo0oo, com.p118pd.sdk.AbstractC7472o0Oo0oo
    /* renamed from: OooO00o  reason: collision with other method in class */
    public ViewGroup m18132OooO00o() {
        return this.f19135OooO00o;
    }

    @Override // com.p118pd.sdk.AbstractC7472o0Oo0oo
    public void OooO00o(boolean z) {
    }

    @Override // com.p118pd.sdk.AbstractC7472o0Oo0oo
    public void OooO0O0(int i) {
        if (i != this.OooO0OO) {
            this.OooO0OO = i;
            if (TextUtils.isEmpty(this.f19135OooO00o.getNavigationContentDescription())) {
                OooO0oo(this.OooO0OO);
            }
        }
    }

    @Override // com.p118pd.sdk.AbstractC7472o0Oo0oo, com.p118pd.sdk.AbstractC7472o0Oo0oo, com.p118pd.sdk.AbstractC7472o0Oo0oo
    /* renamed from: OooO0Oo  reason: collision with other method in class */
    public void m18140OooO0Oo() {
        Log.i(f19128OooO00o, "Progress display unsupported");
    }

    @Override // com.p118pd.sdk.AbstractC7472o0Oo0oo, com.p118pd.sdk.AbstractC7472o0Oo0oo, com.p118pd.sdk.AbstractC7472o0Oo0oo
    /* renamed from: OooO0o0  reason: collision with other method in class */
    public boolean m18144OooO0o0() {
        return this.f19135OooO00o.isOverflowMenuShowPending();
    }

    @Override // com.p118pd.sdk.AbstractC7472o0Oo0oo
    /* renamed from: OooO0oO  reason: collision with other method in class */
    public boolean m18145OooO0oO() {
        return this.f19135OooO00o.hideOverflowMenu();
    }

    @Override // com.p118pd.sdk.AbstractC7472o0Oo0oo
    /* renamed from: OooO0oo  reason: collision with other method in class */
    public boolean m18146OooO0oo() {
        return this.f19131OooO00o != null;
    }

    @Override // com.p118pd.sdk.AbstractC7472o0Oo0oo
    public boolean OooOO0() {
        return this.f19135OooO00o.isTitleTruncated();
    }

    @Override // com.p118pd.sdk.AbstractC7472o0Oo0oo
    public Context getContext() {
        return this.f19135OooO00o.getContext();
    }

    @Override // com.p118pd.sdk.AbstractC7472o0Oo0oo
    public int getHeight() {
        return this.f19135OooO00o.getHeight();
    }

    @Override // com.p118pd.sdk.AbstractC7472o0Oo0oo
    public CharSequence getTitle() {
        return this.f19135OooO00o.getTitle();
    }

    @Override // com.p118pd.sdk.AbstractC7472o0Oo0oo
    public void setIcon(int i) {
        setIcon(i != 0 ? C5945OooOOO0.m16716OooO00o(getContext(), i) : null);
    }

    @Override // com.p118pd.sdk.AbstractC7472o0Oo0oo
    public void setLogo(int i) {
        OooO0O0(i != 0 ? C5945OooOOO0.m16716OooO00o(getContext(), i) : null);
    }

    @Override // com.p118pd.sdk.AbstractC7472o0Oo0oo
    public void setTitle(CharSequence charSequence) {
        this.f19137OooO00o = true;
        OooO0OO(charSequence);
    }

    @Override // com.p118pd.sdk.AbstractC7472o0Oo0oo
    public void setWindowCallback(Window.Callback callback) {
        this.f19132OooO00o = callback;
    }

    @Override // com.p118pd.sdk.AbstractC7472o0Oo0oo
    public void setWindowTitle(CharSequence charSequence) {
        if (!this.f19137OooO00o) {
            OooO0OO(charSequence);
        }
    }

    public C6951o0000O0(Toolbar toolbar, boolean z, int i, int i2) {
        Drawable drawable;
        this.OooO0O0 = 0;
        this.OooO0OO = 0;
        this.f19135OooO00o = toolbar;
        this.f19136OooO00o = toolbar.getTitle();
        this.f19140OooO0O0 = toolbar.getSubtitle();
        this.f19137OooO00o = this.f19136OooO00o != null;
        this.f19142OooO0OO = toolbar.getNavigationIcon();
        C6970o0000oO OooO00o2 = C6970o0000oO.OooO00o(toolbar.getContext(), null, C0033R.styleable.OooO00o, C0033R.attr.actionBarStyle, 0);
        this.f19144OooO0Oo = OooO00o2.m18162OooO00o(C0033R.styleable.ActionBar_homeAsUpIndicator);
        if (z) {
            CharSequence OooO00o3 = OooO00o2.m18164OooO00o(C0033R.styleable.ActionBar_title);
            if (!TextUtils.isEmpty(OooO00o3)) {
                setTitle(OooO00o3);
            }
            CharSequence OooO00o4 = OooO00o2.m18164OooO00o(C0033R.styleable.ActionBar_subtitle);
            if (!TextUtils.isEmpty(OooO00o4)) {
                OooO00o(OooO00o4);
            }
            Drawable OooO00o5 = OooO00o2.m18162OooO00o(C0033R.styleable.ActionBar_logo);
            if (OooO00o5 != null) {
                OooO0O0(OooO00o5);
            }
            Drawable OooO00o6 = OooO00o2.m18162OooO00o(C0033R.styleable.ActionBar_icon);
            if (OooO00o6 != null) {
                setIcon(OooO00o6);
            }
            if (this.f19142OooO0OO == null && (drawable = this.f19144OooO0Oo) != null) {
                OooO0OO(drawable);
            }
            OooO0OO(OooO00o2.OooO0Oo(C0033R.styleable.ActionBar_displayOptions, 0));
            int OooO0oO = OooO00o2.OooO0oO(C0033R.styleable.ActionBar_customNavigationLayout, 0);
            if (OooO0oO != 0) {
                OooO00o(LayoutInflater.from(this.f19135OooO00o.getContext()).inflate(OooO0oO, (ViewGroup) this.f19135OooO00o, false));
                OooO0OO(this.f19129OooO00o | 16);
            }
            int OooO0o = OooO00o2.OooO0o(C0033R.styleable.ActionBar_height, 0);
            if (OooO0o > 0) {
                ViewGroup.LayoutParams layoutParams = this.f19135OooO00o.getLayoutParams();
                layoutParams.height = OooO0o;
                this.f19135OooO00o.setLayoutParams(layoutParams);
            }
            int OooO0O02 = OooO00o2.OooO0O0(C0033R.styleable.ActionBar_contentInsetStart, -1);
            int OooO0O03 = OooO00o2.OooO0O0(C0033R.styleable.ActionBar_contentInsetEnd, -1);
            if (OooO0O02 >= 0 || OooO0O03 >= 0) {
                this.f19135OooO00o.setContentInsetsRelative(Math.max(OooO0O02, 0), Math.max(OooO0O03, 0));
            }
            int OooO0oO2 = OooO00o2.OooO0oO(C0033R.styleable.ActionBar_titleTextStyle, 0);
            if (OooO0oO2 != 0) {
                Toolbar toolbar2 = this.f19135OooO00o;
                toolbar2.setTitleTextAppearance(toolbar2.getContext(), OooO0oO2);
            }
            int OooO0oO3 = OooO00o2.OooO0oO(C0033R.styleable.ActionBar_subtitleTextStyle, 0);
            if (OooO0oO3 != 0) {
                Toolbar toolbar3 = this.f19135OooO00o;
                toolbar3.setSubtitleTextAppearance(toolbar3.getContext(), OooO0oO3);
            }
            int OooO0oO4 = OooO00o2.OooO0oO(C0033R.styleable.ActionBar_popupTheme, 0);
            if (OooO0oO4 != 0) {
                this.f19135OooO00o.setPopupTheme(OooO0oO4);
            }
        } else {
            this.f19129OooO00o = OooO0o();
        }
        OooO00o2.m18167OooO00o();
        OooO0O0(i);
        this.f19143OooO0OO = this.f19135OooO00o.getNavigationContentDescription();
        this.f19135OooO00o.setNavigationOnClickListener(new OooO00o());
    }

    @Override // com.p118pd.sdk.AbstractC7472o0Oo0oo
    private void OooO() {
        Drawable drawable;
        int i = this.f19129OooO00o;
        if ((i & 2) == 0) {
            drawable = null;
        } else if ((i & 1) != 0) {
            drawable = this.f19138OooO0O0;
            if (drawable == null) {
                drawable = this.f19130OooO00o;
            }
        } else {
            drawable = this.f19130OooO00o;
        }
        this.f19135OooO00o.setLogo(drawable);
    }

    @Override // com.p118pd.sdk.AbstractC7472o0Oo0oo
    private void OooO0oO() {
        if ((this.f19129OooO00o & 4) == 0) {
            return;
        }
        if (TextUtils.isEmpty(this.f19143OooO0OO)) {
            this.f19135OooO00o.setNavigationContentDescription(this.OooO0OO);
        } else {
            this.f19135OooO00o.setNavigationContentDescription(this.f19143OooO0OO);
        }
    }

    @Override // com.p118pd.sdk.AbstractC7472o0Oo0oo
    private void OooO0oo() {
        if ((this.f19129OooO00o & 4) != 0) {
            Toolbar toolbar = this.f19135OooO00o;
            Drawable drawable = this.f19142OooO0OO;
            if (drawable == null) {
                drawable = this.f19144OooO0Oo;
            }
            toolbar.setNavigationIcon(drawable);
            return;
        }
        this.f19135OooO00o.setNavigationIcon((Drawable) null);
    }

    @Override // com.p118pd.sdk.AbstractC7472o0Oo0oo, com.p118pd.sdk.AbstractC7472o0Oo0oo, com.p118pd.sdk.AbstractC7472o0Oo0oo, com.p118pd.sdk.AbstractC7472o0Oo0oo, com.p118pd.sdk.AbstractC7472o0Oo0oo, com.p118pd.sdk.AbstractC7472o0Oo0oo, com.p118pd.sdk.AbstractC7472o0Oo0oo
    /* renamed from: OooO00o  reason: collision with other method in class */
    public CharSequence m18133OooO00o() {
        return this.f19135OooO00o.getSubtitle();
    }

    @Override // com.p118pd.sdk.AbstractC7472o0Oo0oo, com.p118pd.sdk.AbstractC7472o0Oo0oo, com.p118pd.sdk.AbstractC7472o0Oo0oo
    /* renamed from: OooO0Oo  reason: collision with other method in class */
    public boolean m18141OooO0Oo() {
        return this.f19135OooO00o.showOverflowMenu();
    }

    @Override // com.p118pd.sdk.AbstractC7472o0Oo0oo, com.p118pd.sdk.AbstractC7472o0Oo0oo, com.p118pd.sdk.AbstractC7472o0Oo0oo
    /* renamed from: OooO0o0  reason: collision with other method in class */
    public void m18143OooO0o0() {
        this.f19135OooO00o.dismissPopupMenus();
    }

    @Override // com.p118pd.sdk.AbstractC7472o0Oo0oo
    public void setIcon(Drawable drawable) {
        this.f19130OooO00o = drawable;
        OooO();
    }

    @Override // com.p118pd.sdk.AbstractC7472o0Oo0oo
    public void OooO00o(CharSequence charSequence) {
        this.f19140OooO0O0 = charSequence;
        if ((this.f19129OooO00o & 8) != 0) {
            this.f19135OooO00o.setSubtitle(charSequence);
        }
    }

    @Override // com.p118pd.sdk.AbstractC7472o0Oo0oo
    public void OooO0Oo(int i) {
        Toolbar toolbar;
        View view;
        Toolbar toolbar2;
        int i2 = this.OooO0O0;
        if (i != i2) {
            if (i2 == 1) {
                Spinner spinner = this.f19133OooO00o;
                if (spinner != null && spinner.getParent() == (toolbar = this.f19135OooO00o)) {
                    toolbar.removeView(this.f19133OooO00o);
                }
            } else if (i2 == 2 && (view = this.f19131OooO00o) != null && view.getParent() == (toolbar2 = this.f19135OooO00o)) {
                toolbar2.removeView(this.f19131OooO00o);
            }
            this.OooO0O0 = i;
            if (i == 0) {
                return;
            }
            if (i == 1) {
                m18128OooO0o();
                this.f19135OooO00o.addView(this.f19133OooO00o, 0);
            } else if (i == 2) {
                View view2 = this.f19131OooO00o;
                if (view2 != null) {
                    this.f19135OooO00o.addView(view2, 0);
                    Toolbar.C5020OooO0o0 oooO0o0 = (Toolbar.C5020OooO0o0) this.f19131OooO00o.getLayoutParams();
                    ((ViewGroup.MarginLayoutParams) oooO0o0).width = -2;
                    ((ViewGroup.MarginLayoutParams) oooO0o0).height = -2;
                    oooO0o0.OooO00o = 8388691;
                }
            } else {
                throw new IllegalArgumentException("Invalid navigation mode " + i);
            }
        }
    }

    @Override // com.p118pd.sdk.AbstractC7472o0Oo0oo
    /* renamed from: OooO0o  reason: collision with other method in class */
    public boolean m18142OooO0o() {
        return this.f19135OooO00o.isOverflowMenuShowing();
    }

    @Override // com.p118pd.sdk.AbstractC7472o0Oo0oo
    public void OooO0o0(int i) {
        Spinner spinner = this.f19133OooO00o;
        if (spinner != null) {
            spinner.setSelection(i);
            return;
        }
        throw new IllegalStateException("Can't set dropdown selected position without an adapter");
    }

    @Override // com.p118pd.sdk.AbstractC7472o0Oo0oo
    /* renamed from: OooO0o  reason: collision with other method in class */
    private void m18128OooO0o() {
        if (this.f19133OooO00o == null) {
            this.f19133OooO00o = new C7190o00oO0O(getContext(), null, C0033R.attr.actionDropDownStyle);
            this.f19133OooO00o.setLayoutParams(new Toolbar.C5020OooO0o0(-2, -2, 8388627));
        }
    }

    @Override // com.p118pd.sdk.AbstractC7472o0Oo0oo, com.p118pd.sdk.AbstractC7472o0Oo0oo, com.p118pd.sdk.AbstractC7472o0Oo0oo
    /* renamed from: OooO0OO  reason: collision with other method in class */
    public void m18138OooO0OO() {
        Log.i(f19128OooO00o, "Progress display unsupported");
    }

    @Override // com.p118pd.sdk.AbstractC7472o0Oo0oo, com.p118pd.sdk.AbstractC7472o0Oo0oo, com.p118pd.sdk.AbstractC7472o0Oo0oo
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public void m18136OooO0O0() {
        this.f19135OooO00o.collapseActionView();
    }

    @Override // com.p118pd.sdk.AbstractC7472o0Oo0oo, com.p118pd.sdk.AbstractC7472o0Oo0oo, com.p118pd.sdk.AbstractC7472o0Oo0oo
    /* renamed from: OooO0OO  reason: collision with other method in class */
    public boolean m18139OooO0OO() {
        return this.f19135OooO00o.canShowOverflowMenu();
    }

    @Override // com.p118pd.sdk.AbstractC7472o0Oo0oo
    public void OooO0oo(int i) {
        OooO0O0(i == 0 ? null : getContext().getString(i));
    }

    @Override // com.p118pd.sdk.AbstractC7472o0Oo0oo, com.p118pd.sdk.AbstractC7472o0Oo0oo, com.p118pd.sdk.AbstractC7472o0Oo0oo, com.p118pd.sdk.AbstractC7472o0Oo0oo, com.p118pd.sdk.AbstractC7472o0Oo0oo, com.p118pd.sdk.AbstractC7472o0Oo0oo, com.p118pd.sdk.AbstractC7472o0Oo0oo
    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m18135OooO00o() {
        return this.f19130OooO00o != null;
    }

    @Override // com.p118pd.sdk.AbstractC7472o0Oo0oo, com.p118pd.sdk.AbstractC7472o0Oo0oo, com.p118pd.sdk.AbstractC7472o0Oo0oo
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public boolean m18137OooO0O0() {
        return this.f19138OooO0O0 != null;
    }

    @Override // com.p118pd.sdk.AbstractC7472o0Oo0oo, com.p118pd.sdk.AbstractC7472o0Oo0oo, com.p118pd.sdk.AbstractC7472o0Oo0oo
    public int OooO0OO() {
        return this.f19129OooO00o;
    }

    @Override // com.p118pd.sdk.AbstractC7472o0Oo0oo, com.p118pd.sdk.AbstractC7472o0Oo0oo, com.p118pd.sdk.AbstractC7472o0Oo0oo
    public int OooO0o0() {
        Spinner spinner = this.f19133OooO00o;
        if (spinner != null) {
            return spinner.getSelectedItemPosition();
        }
        return 0;
    }

    @Override // com.p118pd.sdk.AbstractC7472o0Oo0oo
    public void OooO0oO(int i) {
        this.f19135OooO00o.setVisibility(i);
    }

    @Override // com.p118pd.sdk.AbstractC7472o0Oo0oo, com.p118pd.sdk.AbstractC7472o0Oo0oo, com.p118pd.sdk.AbstractC7472o0Oo0oo, com.p118pd.sdk.AbstractC7472o0Oo0oo, com.p118pd.sdk.AbstractC7472o0Oo0oo, com.p118pd.sdk.AbstractC7472o0Oo0oo, com.p118pd.sdk.AbstractC7472o0Oo0oo
    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m18134OooO00o() {
        this.f19141OooO0O0 = true;
    }

    @Override // com.p118pd.sdk.AbstractC7472o0Oo0oo
    public void OooO0O0(Drawable drawable) {
        this.f19138OooO0O0 = drawable;
        OooO();
    }

    @Override // com.p118pd.sdk.AbstractC7472o0Oo0oo
    public void OooO0OO(int i) {
        View view;
        int i2 = this.f19129OooO00o ^ i;
        this.f19129OooO00o = i;
        if (i2 != 0) {
            if ((i2 & 4) != 0) {
                if ((i & 4) != 0) {
                    OooO0oO();
                }
                OooO0oo();
            }
            if ((i2 & 3) != 0) {
                OooO();
            }
            if ((i2 & 8) != 0) {
                if ((i & 8) != 0) {
                    this.f19135OooO00o.setTitle(this.f19136OooO00o);
                    this.f19135OooO00o.setSubtitle(this.f19140OooO0O0);
                } else {
                    this.f19135OooO00o.setTitle((CharSequence) null);
                    this.f19135OooO00o.setSubtitle((CharSequence) null);
                }
            }
            if ((i2 & 16) != 0 && (view = this.f19139OooO0O0) != null) {
                if ((i & 16) != 0) {
                    this.f19135OooO00o.addView(view);
                } else {
                    this.f19135OooO00o.removeView(view);
                }
            }
        }
    }

    @Override // com.p118pd.sdk.AbstractC7472o0Oo0oo
    public void OooO00o(Menu menu, AbstractC5961Oooo.OooO00o oooO00o) {
        if (this.f19134OooO00o == null) {
            ActionMenuPresenter actionMenuPresenter = new ActionMenuPresenter(this.f19135OooO00o.getContext());
            this.f19134OooO00o = actionMenuPresenter;
            actionMenuPresenter.OooO00o(C0033R.C0036id.action_menu_presenter);
        }
        this.f19134OooO00o.OooO00o(oooO00o);
        this.f19135OooO00o.setMenu((C5965Oooo00o) menu, this.f19134OooO00o);
    }

    @Override // com.p118pd.sdk.AbstractC7472o0Oo0oo
    public void OooO0o(int i) {
        C7115o00Oo0oo OooO00o2 = OooO00o(i, 200);
        if (OooO00o2 != null) {
            OooO00o2.m18389OooO0O0();
        }
    }

    @Override // com.p118pd.sdk.AbstractC7472o0Oo0oo
    public void OooO0O0(boolean z) {
        this.f19135OooO00o.setCollapsible(z);
    }

    @Override // com.p118pd.sdk.AbstractC7472o0Oo0oo, com.p118pd.sdk.AbstractC7472o0Oo0oo, com.p118pd.sdk.AbstractC7472o0Oo0oo
    public int OooO0O0() {
        return this.OooO0O0;
    }

    @Override // com.p118pd.sdk.AbstractC7472o0Oo0oo
    public void OooO0O0(CharSequence charSequence) {
        this.f19143OooO0OO = charSequence;
        OooO0oO();
    }

    @Override // com.p118pd.sdk.AbstractC7472o0Oo0oo
    public void OooO00o(C6943o00000OO o00000oo) {
        Toolbar toolbar;
        View view = this.f19131OooO00o;
        if (view != null && view.getParent() == (toolbar = this.f19135OooO00o)) {
            toolbar.removeView(this.f19131OooO00o);
        }
        this.f19131OooO00o = o00000oo;
        if (o00000oo != null && this.OooO0O0 == 2) {
            this.f19135OooO00o.addView(o00000oo, 0);
            Toolbar.C5020OooO0o0 oooO0o0 = (Toolbar.C5020OooO0o0) this.f19131OooO00o.getLayoutParams();
            ((ViewGroup.MarginLayoutParams) oooO0o0).width = -2;
            ((ViewGroup.MarginLayoutParams) oooO0o0).height = -2;
            oooO0o0.OooO00o = 8388691;
            o00000oo.setAllowCollapse(true);
        }
    }

    @Override // com.p118pd.sdk.AbstractC7472o0Oo0oo
    public void OooO0O0(SparseArray<Parcelable> sparseArray) {
        this.f19135OooO00o.restoreHierarchyState(sparseArray);
    }

    @Override // com.p118pd.sdk.AbstractC7472o0Oo0oo, com.p118pd.sdk.AbstractC7472o0Oo0oo, com.p118pd.sdk.AbstractC7472o0Oo0oo
    public int OooO0Oo() {
        Spinner spinner = this.f19133OooO00o;
        if (spinner != null) {
            return spinner.getCount();
        }
        return 0;
    }

    @Override // com.p118pd.sdk.AbstractC7472o0Oo0oo
    public void OooO0OO(Drawable drawable) {
        this.f19142OooO0OO = drawable;
        OooO0oo();
    }

    @Override // com.p118pd.sdk.AbstractC7472o0Oo0oo
    public void OooO0Oo(Drawable drawable) {
        ViewCompat.OooO00o(this.f19135OooO00o, drawable);
    }

    @Override // com.p118pd.sdk.AbstractC7472o0Oo0oo
    public void OooO00o(SpinnerAdapter spinnerAdapter, AdapterView.OnItemSelectedListener onItemSelectedListener) {
        m18128OooO0o();
        this.f19133OooO00o.setAdapter(spinnerAdapter);
        this.f19133OooO00o.setOnItemSelectedListener(onItemSelectedListener);
    }

    @Override // com.p118pd.sdk.AbstractC7472o0Oo0oo
    public void OooO00o(View view) {
        View view2 = this.f19139OooO0O0;
        if (!(view2 == null || (this.f19129OooO00o & 16) == 0)) {
            this.f19135OooO00o.removeView(view2);
        }
        this.f19139OooO0O0 = view;
        if (view != null && (this.f19129OooO00o & 16) != 0) {
            this.f19135OooO00o.addView(view);
        }
    }

    @Override // com.p118pd.sdk.AbstractC7472o0Oo0oo, com.p118pd.sdk.AbstractC7472o0Oo0oo, com.p118pd.sdk.AbstractC7472o0Oo0oo, com.p118pd.sdk.AbstractC7472o0Oo0oo, com.p118pd.sdk.AbstractC7472o0Oo0oo, com.p118pd.sdk.AbstractC7472o0Oo0oo, com.p118pd.sdk.AbstractC7472o0Oo0oo
    /* renamed from: OooO00o  reason: collision with other method in class */
    public View m18131OooO00o() {
        return this.f19139OooO0O0;
    }

    @Override // com.p118pd.sdk.AbstractC7472o0Oo0oo
    public C7115o00Oo0oo OooO00o(int i, long j) {
        return ViewCompat.m14572OooO00o((View) this.f19135OooO00o).OooO00o(i == 0 ? 1.0f : 0.0f).OooO00o(j).OooO00o(new OooO0O0(i));
    }

    @Override // com.p118pd.sdk.AbstractC7472o0Oo0oo
    public void OooO00o(int i) {
        OooO0OO(i != 0 ? C5945OooOOO0.m16716OooO00o(getContext(), i) : null);
    }

    @Override // com.p118pd.sdk.AbstractC7472o0Oo0oo
    public void OooO00o(Drawable drawable) {
        if (this.f19144OooO0Oo != drawable) {
            this.f19144OooO0Oo = drawable;
            OooO0oo();
        }
    }

    @Override // com.p118pd.sdk.AbstractC7472o0Oo0oo
    public void OooO00o(SparseArray<Parcelable> sparseArray) {
        this.f19135OooO00o.saveHierarchyState(sparseArray);
    }

    @Override // com.p118pd.sdk.AbstractC7472o0Oo0oo, com.p118pd.sdk.AbstractC7472o0Oo0oo, com.p118pd.sdk.AbstractC7472o0Oo0oo, com.p118pd.sdk.AbstractC7472o0Oo0oo, com.p118pd.sdk.AbstractC7472o0Oo0oo, com.p118pd.sdk.AbstractC7472o0Oo0oo, com.p118pd.sdk.AbstractC7472o0Oo0oo
    public int OooO00o() {
        return this.f19135OooO00o.getVisibility();
    }

    @Override // com.p118pd.sdk.AbstractC7472o0Oo0oo
    public void OooO00o(AbstractC5961Oooo.OooO00o oooO00o, C5965Oooo00o.OooO00o oooO00o2) {
        this.f19135OooO00o.setMenuCallbacks(oooO00o, oooO00o2);
    }

    @Override // com.p118pd.sdk.AbstractC7472o0Oo0oo, com.p118pd.sdk.AbstractC7472o0Oo0oo, com.p118pd.sdk.AbstractC7472o0Oo0oo, com.p118pd.sdk.AbstractC7472o0Oo0oo, com.p118pd.sdk.AbstractC7472o0Oo0oo, com.p118pd.sdk.AbstractC7472o0Oo0oo, com.p118pd.sdk.AbstractC7472o0Oo0oo
    /* renamed from: OooO00o  reason: collision with other method in class */
    public Menu m18130OooO00o() {
        return this.f19135OooO00o.getMenu();
    }
}

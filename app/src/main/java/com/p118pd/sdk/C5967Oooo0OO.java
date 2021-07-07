package com.p118pd.sdk;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewDebug;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.appcompat.C0033R;
import com.p118pd.sdk.AbstractC5976OoooO00;
import com.p118pd.sdk.AbstractC7089o00OO0oO;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: com.pd.sdk.Oooo0OO  reason: case insensitive filesystem */
public final class C5967Oooo0OO implements AbstractMenuItemC7051o00O00oO {
    public static final String OooO00o = "MenuItemImpl";
    public static final int OooOo = 4;
    public static final int OooOo0 = 3;
    public static final int OooOo0O = 1;
    public static final int OooOo0o = 2;
    public static final int OooOoO = 16;
    public static final int OooOoO0 = 8;
    public static final int OooOoOO = 32;
    public static final int OooOoo0 = 0;

    /* renamed from: OooO00o  reason: collision with other field name */
    public char f17218OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Intent f17219OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public ColorStateList f17220OooO00o = null;

    /* renamed from: OooO00o  reason: collision with other field name */
    public PorterDuff.Mode f17221OooO00o = null;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Drawable f17222OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public ContextMenu.ContextMenuInfo f17223OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public MenuItem.OnActionExpandListener f17224OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public MenuItem.OnMenuItemClickListener f17225OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public View f17226OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C5965Oooo00o f17227OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public SubMenuC7026o000oOoO f17228OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public AbstractC7089o00OO0oO f17229OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public CharSequence f17230OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Runnable f17231OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public boolean f17232OooO00o = false;
    public char OooO0O0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public CharSequence f17233OooO0O0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public boolean f17234OooO0O0 = false;
    public CharSequence OooO0OO;

    /* renamed from: OooO0OO  reason: collision with other field name */
    public boolean f17235OooO0OO = false;
    public CharSequence OooO0Oo;

    /* renamed from: OooO0Oo  reason: collision with other field name */
    public boolean f17236OooO0Oo = false;
    public final int OooOO0o;
    public final int OooOOO;
    public final int OooOOO0;
    public final int OooOOOO;
    public int OooOOOo = 4096;
    public int OooOOo = 0;
    public int OooOOo0 = 4096;
    public int OooOOoo = 16;
    public int OooOo00 = 0;

    /* renamed from: com.pd.sdk.Oooo0OO$OooO00o */
    public class OooO00o implements AbstractC7089o00OO0oO.OooO0O0 {
        public OooO00o() {
        }

        @Override // com.p118pd.sdk.AbstractC7089o00OO0oO.OooO0O0
        public void onActionProviderVisibilityChanged(boolean z) {
            C5967Oooo0OO oooo0OO = C5967Oooo0OO.this;
            oooo0OO.f17227OooO00o.OooO0O0(oooo0OO);
        }
    }

    public C5967Oooo0OO(C5965Oooo00o oooo00o, int i, int i2, int i3, int i4, CharSequence charSequence, int i5) {
        this.f17227OooO00o = oooo00o;
        this.OooOO0o = i2;
        this.OooOOO0 = i;
        this.OooOOO = i3;
        this.OooOOOO = i4;
        this.f17230OooO00o = charSequence;
        this.OooOo00 = i5;
    }

    public boolean OooO() {
        return (this.OooOo00 & 4) == 4;
    }

    @Override // com.p118pd.sdk.AbstractMenuItemC7051o00O00oO
    /* renamed from: OooO00o  reason: collision with other method in class */
    public int m16791OooO00o() {
        return this.OooOOOO;
    }

    public boolean OooO0O0() {
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = this.f17225OooO00o;
        if (onMenuItemClickListener != null && onMenuItemClickListener.onMenuItemClick(this)) {
            return true;
        }
        C5965Oooo00o oooo00o = this.f17227OooO00o;
        if (oooo00o.OooO00o(oooo00o, this)) {
            return true;
        }
        Runnable runnable = this.f17231OooO00o;
        if (runnable != null) {
            runnable.run();
            return true;
        }
        if (this.f17219OooO00o != null) {
            try {
                this.f17227OooO00o.OooO00o().startActivity(this.f17219OooO00o);
                return true;
            } catch (ActivityNotFoundException unused) {
            }
        }
        AbstractC7089o00OO0oO o00oo0oo = this.f17229OooO00o;
        if (o00oo0oo == null || !o00oo0oo.OooO0OO()) {
            return false;
        }
        return true;
    }

    public void OooO0OO(boolean z) {
        this.OooOOoo = (z ? 4 : 0) | (this.OooOOoo & -5);
    }

    public boolean OooO0Oo() {
        return (this.OooOOoo & 4) != 0;
    }

    public boolean OooO0o() {
        return (this.OooOo00 & 2) == 2;
    }

    public boolean OooO0o0() {
        return (this.OooOo00 & 1) == 1;
    }

    public boolean OooO0oO() {
        return this.f17227OooO00o.m16781OooO00o();
    }

    public boolean OooO0oo() {
        return this.f17227OooO00o.m16790OooO0Oo() && OooO00o() != 0;
    }

    @Override // com.p118pd.sdk.AbstractMenuItemC7051o00O00oO
    public boolean collapseActionView() {
        if ((this.OooOo00 & 8) == 0) {
            return false;
        }
        if (this.f17226OooO00o == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f17224OooO00o;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.f17227OooO00o.m16782OooO00o(this);
        }
        return false;
    }

    @Override // com.p118pd.sdk.AbstractMenuItemC7051o00O00oO
    public boolean expandActionView() {
        if (!m16796OooO00o()) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f17224OooO00o;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
            return this.f17227OooO00o.m16786OooO0O0(this);
        }
        return false;
    }

    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override // com.p118pd.sdk.AbstractMenuItemC7051o00O00oO
    public View getActionView() {
        View view = this.f17226OooO00o;
        if (view != null) {
            return view;
        }
        AbstractC7089o00OO0oO o00oo0oo = this.f17229OooO00o;
        if (o00oo0oo == null) {
            return null;
        }
        View OooO00o2 = o00oo0oo.OooO00o(this);
        this.f17226OooO00o = OooO00o2;
        return OooO00o2;
    }

    @Override // com.p118pd.sdk.AbstractMenuItemC7051o00O00oO
    public int getAlphabeticModifiers() {
        return this.OooOOo0;
    }

    public char getAlphabeticShortcut() {
        return this.OooO0O0;
    }

    @Override // com.p118pd.sdk.AbstractMenuItemC7051o00O00oO
    public CharSequence getContentDescription() {
        return this.OooO0OO;
    }

    public int getGroupId() {
        return this.OooOOO0;
    }

    public Drawable getIcon() {
        Drawable drawable = this.f17222OooO00o;
        if (drawable != null) {
            return OooO00o(drawable);
        }
        if (this.OooOOo == 0) {
            return null;
        }
        Drawable OooO00o2 = C5945OooOOO0.m16716OooO00o(this.f17227OooO00o.OooO00o(), this.OooOOo);
        this.OooOOo = 0;
        this.f17222OooO00o = OooO00o2;
        return OooO00o(OooO00o2);
    }

    @Override // com.p118pd.sdk.AbstractMenuItemC7051o00O00oO
    public ColorStateList getIconTintList() {
        return this.f17220OooO00o;
    }

    @Override // com.p118pd.sdk.AbstractMenuItemC7051o00O00oO
    public PorterDuff.Mode getIconTintMode() {
        return this.f17221OooO00o;
    }

    public Intent getIntent() {
        return this.f17219OooO00o;
    }

    @ViewDebug.CapturedViewProperty
    public int getItemId() {
        return this.OooOO0o;
    }

    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.f17223OooO00o;
    }

    @Override // com.p118pd.sdk.AbstractMenuItemC7051o00O00oO
    public int getNumericModifiers() {
        return this.OooOOOo;
    }

    public char getNumericShortcut() {
        return this.f17218OooO00o;
    }

    public int getOrder() {
        return this.OooOOO;
    }

    public SubMenu getSubMenu() {
        return this.f17228OooO00o;
    }

    @ViewDebug.CapturedViewProperty
    public CharSequence getTitle() {
        return this.f17230OooO00o;
    }

    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f17233OooO0O0;
        if (charSequence == null) {
            charSequence = this.f17230OooO00o;
        }
        return (Build.VERSION.SDK_INT >= 18 || charSequence == null || (charSequence instanceof String)) ? charSequence : charSequence.toString();
    }

    @Override // com.p118pd.sdk.AbstractMenuItemC7051o00O00oO
    public CharSequence getTooltipText() {
        return this.OooO0Oo;
    }

    public boolean hasSubMenu() {
        return this.f17228OooO00o != null;
    }

    @Override // com.p118pd.sdk.AbstractMenuItemC7051o00O00oO
    public boolean isActionViewExpanded() {
        return this.f17236OooO0Oo;
    }

    public boolean isCheckable() {
        return (this.OooOOoo & 1) == 1;
    }

    public boolean isChecked() {
        return (this.OooOOoo & 2) == 2;
    }

    public boolean isEnabled() {
        return (this.OooOOoo & 16) != 0;
    }

    public boolean isVisible() {
        AbstractC7089o00OO0oO o00oo0oo = this.f17229OooO00o;
        if (o00oo0oo == null || !o00oo0oo.OooO0Oo()) {
            if ((this.OooOOoo & 8) == 0) {
                return true;
            }
            return false;
        } else if ((this.OooOOoo & 8) != 0 || !this.f17229OooO00o.m18368OooO0O0()) {
            return false;
        } else {
            return true;
        }
    }

    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    public MenuItem setAlphabeticShortcut(char c) {
        if (this.OooO0O0 == c) {
            return this;
        }
        this.OooO0O0 = Character.toLowerCase(c);
        this.f17227OooO00o.OooO0O0(false);
        return this;
    }

    public MenuItem setCheckable(boolean z) {
        int i = this.OooOOoo;
        int i2 = (z ? 1 : 0) | (i & -2);
        this.OooOOoo = i2;
        if (i != i2) {
            this.f17227OooO00o.OooO0O0(false);
        }
        return this;
    }

    public MenuItem setChecked(boolean z) {
        if ((this.OooOOoo & 4) != 0) {
            this.f17227OooO00o.OooO00o((MenuItem) this);
        } else {
            OooO0O0(z);
        }
        return this;
    }

    public MenuItem setEnabled(boolean z) {
        if (z) {
            this.OooOOoo |= 16;
        } else {
            this.OooOOoo &= -17;
        }
        this.f17227OooO00o.OooO0O0(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.OooOOo = 0;
        this.f17222OooO00o = drawable;
        this.f17235OooO0OO = true;
        this.f17227OooO00o.OooO0O0(false);
        return this;
    }

    @Override // com.p118pd.sdk.AbstractMenuItemC7051o00O00oO
    public MenuItem setIconTintList(@Nullable ColorStateList colorStateList) {
        this.f17220OooO00o = colorStateList;
        this.f17232OooO00o = true;
        this.f17235OooO0OO = true;
        this.f17227OooO00o.OooO0O0(false);
        return this;
    }

    @Override // com.p118pd.sdk.AbstractMenuItemC7051o00O00oO
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f17221OooO00o = mode;
        this.f17234OooO0O0 = true;
        this.f17235OooO0OO = true;
        this.f17227OooO00o.OooO0O0(false);
        return this;
    }

    public MenuItem setIntent(Intent intent) {
        this.f17219OooO00o = intent;
        return this;
    }

    public MenuItem setNumericShortcut(char c) {
        if (this.f17218OooO00o == c) {
            return this;
        }
        this.f17218OooO00o = c;
        this.f17227OooO00o.OooO0O0(false);
        return this;
    }

    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f17224OooO00o = onActionExpandListener;
        return this;
    }

    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f17225OooO00o = onMenuItemClickListener;
        return this;
    }

    public MenuItem setShortcut(char c, char c2) {
        this.f17218OooO00o = c;
        this.OooO0O0 = Character.toLowerCase(c2);
        this.f17227OooO00o.OooO0O0(false);
        return this;
    }

    @Override // com.p118pd.sdk.AbstractMenuItemC7051o00O00oO
    public void setShowAsAction(int i) {
        int i2 = i & 3;
        if (i2 == 0 || i2 == 1 || i2 == 2) {
            this.OooOo00 = i;
            this.f17227OooO00o.OooO00o(this);
            return;
        }
        throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.f17230OooO00o = charSequence;
        this.f17227OooO00o.OooO0O0(false);
        SubMenuC7026o000oOoO o000oooo = this.f17228OooO00o;
        if (o000oooo != null) {
            o000oooo.setHeaderTitle(charSequence);
        }
        return this;
    }

    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f17233OooO0O0 = charSequence;
        this.f17227OooO00o.OooO0O0(false);
        return this;
    }

    public MenuItem setVisible(boolean z) {
        if (m16797OooO00o(z)) {
            this.f17227OooO00o.OooO0O0(this);
        }
        return this;
    }

    public String toString() {
        CharSequence charSequence = this.f17230OooO00o;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    @Override // com.p118pd.sdk.AbstractMenuItemC7051o00O00oO
    /* renamed from: OooO00o  reason: collision with other method in class */
    public Runnable m16793OooO00o() {
        return this.f17231OooO00o;
    }

    public boolean OooO0OO() {
        return (this.OooOOoo & 32) == 32;
    }

    public void OooO0Oo(boolean z) {
        if (z) {
            this.OooOOoo |= 32;
        } else {
            this.OooOOoo &= -33;
        }
    }

    public MenuItem OooO00o(Runnable runnable) {
        this.f17231OooO00o = runnable;
        return this;
    }

    @Override // com.p118pd.sdk.AbstractMenuItemC7051o00O00oO
    public char OooO00o() {
        return this.f17227OooO00o.m16789OooO0OO() ? this.OooO0O0 : this.f17218OooO00o;
    }

    @Override // com.p118pd.sdk.AbstractMenuItemC7051o00O00oO
    public MenuItem setAlphabeticShortcut(char c, int i) {
        if (this.OooO0O0 == c && this.OooOOo0 == i) {
            return this;
        }
        this.OooO0O0 = Character.toLowerCase(c);
        this.OooOOo0 = KeyEvent.normalizeMetaState(i);
        this.f17227OooO00o.OooO0O0(false);
        return this;
    }

    @Override // com.p118pd.sdk.AbstractMenuItemC7051o00O00oO
    public MenuItem setNumericShortcut(char c, int i) {
        if (this.f17218OooO00o == c && this.OooOOOo == i) {
            return this;
        }
        this.f17218OooO00o = c;
        this.OooOOOo = KeyEvent.normalizeMetaState(i);
        this.f17227OooO00o.OooO0O0(false);
        return this;
    }

    @Override // com.p118pd.sdk.AbstractMenuItemC7051o00O00oO
    public MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.f17218OooO00o = c;
        this.OooOOOo = KeyEvent.normalizeMetaState(i);
        this.OooO0O0 = Character.toLowerCase(c2);
        this.OooOOo0 = KeyEvent.normalizeMetaState(i2);
        this.f17227OooO00o.OooO0O0(false);
        return this;
    }

    @Override // com.p118pd.sdk.AbstractMenuItemC7051o00O00oO
    /* renamed from: OooO00o  reason: collision with other method in class */
    public String m16794OooO00o() {
        char OooO00o2 = OooO00o();
        if (OooO00o2 == 0) {
            return "";
        }
        Resources resources = this.f17227OooO00o.OooO00o().getResources();
        StringBuilder sb = new StringBuilder();
        if (ViewConfiguration.get(this.f17227OooO00o.OooO00o()).hasPermanentMenuKey()) {
            sb.append(resources.getString(C0033R.string.abc_prepend_shortcut_label));
        }
        int i = this.f17227OooO00o.m16789OooO0OO() ? this.OooOOo0 : this.OooOOOo;
        OooO00o(sb, i, 65536, resources.getString(C0033R.string.abc_menu_meta_shortcut_label));
        OooO00o(sb, i, 4096, resources.getString(C0033R.string.abc_menu_ctrl_shortcut_label));
        OooO00o(sb, i, 2, resources.getString(C0033R.string.abc_menu_alt_shortcut_label));
        OooO00o(sb, i, 1, resources.getString(C0033R.string.abc_menu_shift_shortcut_label));
        OooO00o(sb, i, 4, resources.getString(C0033R.string.abc_menu_sym_shortcut_label));
        OooO00o(sb, i, 8, resources.getString(C0033R.string.abc_menu_function_shortcut_label));
        if (OooO00o2 == '\b') {
            sb.append(resources.getString(C0033R.string.abc_menu_delete_shortcut_label));
        } else if (OooO00o2 == '\n') {
            sb.append(resources.getString(C0033R.string.abc_menu_enter_shortcut_label));
        } else if (OooO00o2 != ' ') {
            sb.append(OooO00o2);
        } else {
            sb.append(resources.getString(C0033R.string.abc_menu_space_shortcut_label));
        }
        return sb.toString();
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i) {
        this.f17222OooO00o = null;
        this.OooOOo = i;
        this.f17235OooO0OO = true;
        this.f17227OooO00o.OooO0O0(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i) {
        return setTitle(this.f17227OooO00o.OooO00o().getString(i));
    }

    public void OooO0O0(boolean z) {
        int i = this.OooOOoo;
        int i2 = (z ? 2 : 0) | (i & -3);
        this.OooOOoo = i2;
        if (i != i2) {
            this.f17227OooO00o.OooO0O0(false);
        }
    }

    /* renamed from: OooO0O0 */
    public AbstractMenuItemC7051o00O00oO setShowAsActionFlags(int i) {
        setShowAsAction(i);
        return this;
    }

    @Override // com.p118pd.sdk.AbstractMenuItemC7051o00O00oO
    /* renamed from: OooO0O0 */
    public AbstractMenuItemC7051o00O00oO setContentDescription(CharSequence charSequence) {
        this.OooO0OO = charSequence;
        this.f17227OooO00o.OooO0O0(false);
        return this;
    }

    public static void OooO00o(StringBuilder sb, int i, int i2, String str) {
        if ((i & i2) == i2) {
            sb.append(str);
        }
    }

    public void OooO00o(SubMenuC7026o000oOoO o000oooo) {
        this.f17228OooO00o = o000oooo;
        o000oooo.setHeaderTitle(getTitle());
    }

    public CharSequence OooO00o(AbstractC5976OoooO00.OooO00o oooO00o) {
        if (oooO00o == null || !oooO00o.OooO00o()) {
            return getTitle();
        }
        return getTitleCondensed();
    }

    private Drawable OooO00o(Drawable drawable) {
        if (drawable != null && this.f17235OooO0OO && (this.f17232OooO00o || this.f17234OooO0O0)) {
            drawable = C7043o00O0000.m18317OooO0O0(drawable).mutate();
            if (this.f17232OooO00o) {
                C7043o00O0000.OooO00o(drawable, this.f17220OooO00o);
            }
            if (this.f17234OooO0O0) {
                C7043o00O0000.OooO00o(drawable, this.f17221OooO00o);
            }
            this.f17235OooO0OO = false;
        }
        return drawable;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m16797OooO00o(boolean z) {
        int i = this.OooOOoo;
        int i2 = (z ? 0 : 8) | (i & -9);
        this.OooOOoo = i2;
        if (i != i2) {
            return true;
        }
        return false;
    }

    public void OooO00o(ContextMenu.ContextMenuInfo contextMenuInfo) {
        this.f17223OooO00o = contextMenuInfo;
    }

    @Override // com.p118pd.sdk.AbstractMenuItemC7051o00O00oO
    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m16795OooO00o() {
        this.f17227OooO00o.OooO00o(this);
    }

    /* renamed from: OooO00o */
    public AbstractMenuItemC7051o00O00oO setActionView(View view) {
        int i;
        this.f17226OooO00o = view;
        this.f17229OooO00o = null;
        if (view != null && view.getId() == -1 && (i = this.OooOO0o) > 0) {
            view.setId(i);
        }
        this.f17227OooO00o.OooO00o(this);
        return this;
    }

    /* renamed from: OooO00o */
    public AbstractMenuItemC7051o00O00oO setActionView(int i) {
        Context OooO00o2 = this.f17227OooO00o.OooO00o();
        setActionView(LayoutInflater.from(OooO00o2).inflate(i, (ViewGroup) new LinearLayout(OooO00o2), false));
        return this;
    }

    @Override // com.p118pd.sdk.AbstractMenuItemC7051o00O00oO
    /* renamed from: OooO00o  reason: collision with other method in class */
    public AbstractC7089o00OO0oO m16792OooO00o() {
        return this.f17229OooO00o;
    }

    @Override // com.p118pd.sdk.AbstractMenuItemC7051o00O00oO
    public AbstractMenuItemC7051o00O00oO OooO00o(AbstractC7089o00OO0oO o00oo0oo) {
        AbstractC7089o00OO0oO o00oo0oo2 = this.f17229OooO00o;
        if (o00oo0oo2 != null) {
            o00oo0oo2.OooO0O0();
        }
        this.f17226OooO00o = null;
        this.f17229OooO00o = o00oo0oo;
        this.f17227OooO00o.OooO0O0(true);
        AbstractC7089o00OO0oO o00oo0oo3 = this.f17229OooO00o;
        if (o00oo0oo3 != null) {
            o00oo0oo3.OooO00o(new OooO00o());
        }
        return this;
    }

    @Override // com.p118pd.sdk.AbstractMenuItemC7051o00O00oO
    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m16796OooO00o() {
        AbstractC7089o00OO0oO o00oo0oo;
        if ((this.OooOo00 & 8) == 0) {
            return false;
        }
        if (this.f17226OooO00o == null && (o00oo0oo = this.f17229OooO00o) != null) {
            this.f17226OooO00o = o00oo0oo.OooO00o(this);
        }
        if (this.f17226OooO00o != null) {
            return true;
        }
        return false;
    }

    public void OooO00o(boolean z) {
        this.f17236OooO0Oo = z;
        this.f17227OooO00o.OooO0O0(false);
    }

    @Override // com.p118pd.sdk.AbstractMenuItemC7051o00O00oO
    /* renamed from: OooO00o */
    public AbstractMenuItemC7051o00O00oO setTooltipText(CharSequence charSequence) {
        this.OooO0Oo = charSequence;
        this.f17227OooO00o.OooO0O0(false);
        return this;
    }
}

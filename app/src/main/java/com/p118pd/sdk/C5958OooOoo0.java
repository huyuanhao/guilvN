package com.p118pd.sdk;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: com.pd.sdk.OooOoo0  reason: case insensitive filesystem */
public class C5958OooOoo0 implements AbstractMenuItemC7051o00O00oO {
    public static final int OooOo = 8;
    public static final int OooOo0 = 1;
    public static final int OooOo00 = 0;
    public static final int OooOo0O = 2;
    public static final int OooOo0o = 4;
    public static final int OooOoO0 = 16;
    public char OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Context f17176OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Intent f17177OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public ColorStateList f17178OooO00o = null;

    /* renamed from: OooO00o  reason: collision with other field name */
    public PorterDuff.Mode f17179OooO00o = null;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Drawable f17180OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public MenuItem.OnMenuItemClickListener f17181OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public CharSequence f17182OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public boolean f17183OooO00o = false;
    public char OooO0O0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public CharSequence f17184OooO0O0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public boolean f17185OooO0O0 = false;
    public CharSequence OooO0OO;
    public CharSequence OooO0Oo;
    public final int OooOO0o;
    public final int OooOOO;
    public final int OooOOO0;
    public final int OooOOOO;
    public int OooOOOo = 4096;
    public int OooOOo = 0;
    public int OooOOo0 = 4096;
    public int OooOOoo = 16;

    public C5958OooOoo0(Context context, int i, int i2, int i3, int i4, CharSequence charSequence) {
        this.f17176OooO00o = context;
        this.OooOO0o = i2;
        this.OooOOO0 = i;
        this.OooOOO = i3;
        this.OooOOOO = i4;
        this.f17182OooO00o = charSequence;
    }

    public C5958OooOoo0 OooO00o(boolean z) {
        this.OooOOoo = (z ? 4 : 0) | (this.OooOOoo & -5);
        return this;
    }

    @Override // com.p118pd.sdk.AbstractMenuItemC7051o00O00oO
    /* renamed from: OooO00o  reason: collision with other method in class */
    public AbstractC7089o00OO0oO m16762OooO00o() {
        return null;
    }

    /* renamed from: OooO0O0 */
    public AbstractMenuItemC7051o00O00oO setShowAsActionFlags(int i) {
        setShowAsAction(i);
        return this;
    }

    @Override // com.p118pd.sdk.AbstractMenuItemC7051o00O00oO
    public boolean collapseActionView() {
        return false;
    }

    @Override // com.p118pd.sdk.AbstractMenuItemC7051o00O00oO
    public boolean expandActionView() {
        return false;
    }

    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    @Override // com.p118pd.sdk.AbstractMenuItemC7051o00O00oO
    public View getActionView() {
        return null;
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
        return this.f17180OooO00o;
    }

    @Override // com.p118pd.sdk.AbstractMenuItemC7051o00O00oO
    public ColorStateList getIconTintList() {
        return this.f17178OooO00o;
    }

    @Override // com.p118pd.sdk.AbstractMenuItemC7051o00O00oO
    public PorterDuff.Mode getIconTintMode() {
        return this.f17179OooO00o;
    }

    public Intent getIntent() {
        return this.f17177OooO00o;
    }

    public int getItemId() {
        return this.OooOO0o;
    }

    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // com.p118pd.sdk.AbstractMenuItemC7051o00O00oO
    public int getNumericModifiers() {
        return this.OooOOOo;
    }

    public char getNumericShortcut() {
        return this.OooO00o;
    }

    public int getOrder() {
        return this.OooOOOO;
    }

    public SubMenu getSubMenu() {
        return null;
    }

    public CharSequence getTitle() {
        return this.f17182OooO00o;
    }

    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f17184OooO0O0;
        return charSequence != null ? charSequence : this.f17182OooO00o;
    }

    @Override // com.p118pd.sdk.AbstractMenuItemC7051o00O00oO
    public CharSequence getTooltipText() {
        return this.OooO0Oo;
    }

    public boolean hasSubMenu() {
        return false;
    }

    @Override // com.p118pd.sdk.AbstractMenuItemC7051o00O00oO
    public boolean isActionViewExpanded() {
        return false;
    }

    public boolean isCheckable() {
        return (this.OooOOoo & 1) != 0;
    }

    public boolean isChecked() {
        return (this.OooOOoo & 2) != 0;
    }

    public boolean isEnabled() {
        return (this.OooOOoo & 16) != 0;
    }

    public boolean isVisible() {
        return (this.OooOOoo & 8) == 0;
    }

    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    public MenuItem setAlphabeticShortcut(char c) {
        this.OooO0O0 = Character.toLowerCase(c);
        return this;
    }

    public MenuItem setCheckable(boolean z) {
        this.OooOOoo = (z ? 1 : 0) | (this.OooOOoo & -2);
        return this;
    }

    public MenuItem setChecked(boolean z) {
        this.OooOOoo = (z ? 2 : 0) | (this.OooOOoo & -3);
        return this;
    }

    public MenuItem setEnabled(boolean z) {
        this.OooOOoo = (z ? 16 : 0) | (this.OooOOoo & -17);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.f17180OooO00o = drawable;
        this.OooOOo = 0;
        OooO00o();
        return this;
    }

    @Override // com.p118pd.sdk.AbstractMenuItemC7051o00O00oO
    public MenuItem setIconTintList(@Nullable ColorStateList colorStateList) {
        this.f17178OooO00o = colorStateList;
        this.f17183OooO00o = true;
        OooO00o();
        return this;
    }

    @Override // com.p118pd.sdk.AbstractMenuItemC7051o00O00oO
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f17179OooO00o = mode;
        this.f17185OooO0O0 = true;
        OooO00o();
        return this;
    }

    public MenuItem setIntent(Intent intent) {
        this.f17177OooO00o = intent;
        return this;
    }

    public MenuItem setNumericShortcut(char c) {
        this.OooO00o = c;
        return this;
    }

    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f17181OooO00o = onMenuItemClickListener;
        return this;
    }

    public MenuItem setShortcut(char c, char c2) {
        this.OooO00o = c;
        this.OooO0O0 = Character.toLowerCase(c2);
        return this;
    }

    @Override // com.p118pd.sdk.AbstractMenuItemC7051o00O00oO
    public void setShowAsAction(int i) {
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.f17182OooO00o = charSequence;
        return this;
    }

    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f17184OooO0O0 = charSequence;
        return this;
    }

    public MenuItem setVisible(boolean z) {
        int i = 8;
        int i2 = this.OooOOoo & 8;
        if (z) {
            i = 0;
        }
        this.OooOOoo = i2 | i;
        return this;
    }

    @Override // com.p118pd.sdk.AbstractMenuItemC7051o00O00oO
    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m16763OooO00o() {
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = this.f17181OooO00o;
        if (onMenuItemClickListener != null && onMenuItemClickListener.onMenuItemClick(this)) {
            return true;
        }
        Intent intent = this.f17177OooO00o;
        if (intent == null) {
            return false;
        }
        this.f17176OooO00o.startActivity(intent);
        return true;
    }

    @Override // com.p118pd.sdk.AbstractMenuItemC7051o00O00oO
    /* renamed from: OooO0O0 */
    public AbstractMenuItemC7051o00O00oO setContentDescription(CharSequence charSequence) {
        this.OooO0OO = charSequence;
        return this;
    }

    @Override // com.p118pd.sdk.AbstractMenuItemC7051o00O00oO
    public MenuItem setAlphabeticShortcut(char c, int i) {
        this.OooO0O0 = Character.toLowerCase(c);
        this.OooOOo0 = KeyEvent.normalizeMetaState(i);
        return this;
    }

    @Override // com.p118pd.sdk.AbstractMenuItemC7051o00O00oO
    public MenuItem setNumericShortcut(char c, int i) {
        this.OooO00o = c;
        this.OooOOOo = KeyEvent.normalizeMetaState(i);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i) {
        this.f17182OooO00o = this.f17176OooO00o.getResources().getString(i);
        return this;
    }

    @Override // com.p118pd.sdk.AbstractMenuItemC7051o00O00oO
    public MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.OooO00o = c;
        this.OooOOOo = KeyEvent.normalizeMetaState(i);
        this.OooO0O0 = Character.toLowerCase(c2);
        this.OooOOo0 = KeyEvent.normalizeMetaState(i2);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i) {
        this.OooOOo = i;
        this.f17180OooO00o = C7009o000OoOo.m18256OooO00o(this.f17176OooO00o, i);
        OooO00o();
        return this;
    }

    /* renamed from: OooO00o */
    public AbstractMenuItemC7051o00O00oO setActionView(View view) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: OooO00o */
    public AbstractMenuItemC7051o00O00oO setActionView(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // com.p118pd.sdk.AbstractMenuItemC7051o00O00oO
    public AbstractMenuItemC7051o00O00oO OooO00o(AbstractC7089o00OO0oO o00oo0oo) {
        throw new UnsupportedOperationException();
    }

    @Override // com.p118pd.sdk.AbstractMenuItemC7051o00O00oO
    /* renamed from: OooO00o */
    public AbstractMenuItemC7051o00O00oO setTooltipText(CharSequence charSequence) {
        this.OooO0Oo = charSequence;
        return this;
    }

    @Override // com.p118pd.sdk.AbstractMenuItemC7051o00O00oO
    private void OooO00o() {
        if (this.f17180OooO00o == null) {
            return;
        }
        if (this.f17183OooO00o || this.f17185OooO0O0) {
            Drawable OooO0O02 = C7043o00O0000.m18317OooO0O0(this.f17180OooO00o);
            this.f17180OooO00o = OooO0O02;
            Drawable mutate = OooO0O02.mutate();
            this.f17180OooO00o = mutate;
            if (this.f17183OooO00o) {
                C7043o00O0000.OooO00o(mutate, this.f17178OooO00o);
            }
            if (this.f17185OooO0O0) {
                C7043o00O0000.OooO00o(this.f17180OooO00o, this.f17179OooO00o);
            }
        }
    }
}

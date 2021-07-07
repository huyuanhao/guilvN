package com.p118pd.sdk;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.CollapsibleActionView;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.RestrictTo;
import java.lang.reflect.Method;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: com.pd.sdk.Oooo0o0  reason: case insensitive filesystem */
public class MenuItemC5970Oooo0o0 extends AbstractC5959OooOooO<AbstractMenuItemC7051o00O00oO> implements MenuItem {
    public static final String OooO00o = "MenuItemWrapper";

    /* renamed from: OooO00o  reason: collision with other field name */
    public Method f17238OooO00o;

    /* renamed from: com.pd.sdk.Oooo0o0$OooO00o */
    public class OooO00o extends AbstractC7089o00OO0oO {
        public final ActionProvider OooO00o;

        public OooO00o(Context context, ActionProvider actionProvider) {
            super(context);
            this.OooO00o = actionProvider;
        }

        @Override // com.p118pd.sdk.AbstractC7089o00OO0oO, com.p118pd.sdk.AbstractC7089o00OO0oO, com.p118pd.sdk.AbstractC7089o00OO0oO, com.p118pd.sdk.AbstractC7089o00OO0oO
        public View OooO00o() {
            return this.OooO00o.onCreateActionView();
        }

        @Override // com.p118pd.sdk.AbstractC7089o00OO0oO
        public boolean OooO0OO() {
            return this.OooO00o.onPerformDefaultAction();
        }

        @Override // com.p118pd.sdk.AbstractC7089o00OO0oO, com.p118pd.sdk.AbstractC7089o00OO0oO, com.p118pd.sdk.AbstractC7089o00OO0oO, com.p118pd.sdk.AbstractC7089o00OO0oO
        /* renamed from: OooO00o  reason: collision with other method in class */
        public boolean m16798OooO00o() {
            return this.OooO00o.hasSubMenu();
        }

        @Override // com.p118pd.sdk.AbstractC7089o00OO0oO
        public void OooO00o(SubMenu subMenu) {
            this.OooO00o.onPrepareSubMenu(MenuItemC5970Oooo0o0.this.OooO00o(subMenu));
        }
    }

    /* renamed from: com.pd.sdk.Oooo0o0$OooO0O0 */
    public static class OooO0O0 extends FrameLayout implements AbstractC5950OooOo0 {
        public final CollapsibleActionView OooO00o;

        public OooO0O0(View view) {
            super(view.getContext());
            this.OooO00o = (CollapsibleActionView) view;
            addView(view);
        }

        @Override // com.p118pd.sdk.AbstractC5950OooOo0
        /* renamed from: OooO00o  reason: collision with other method in class */
        public void m16799OooO00o() {
            this.OooO00o.onActionViewCollapsed();
        }

        @Override // com.p118pd.sdk.AbstractC5950OooOo0
        public void OooO0O0() {
            this.OooO00o.onActionViewExpanded();
        }

        @Override // com.p118pd.sdk.AbstractC5950OooOo0
        public View OooO00o() {
            return (View) this.OooO00o;
        }
    }

    /* renamed from: com.pd.sdk.Oooo0o0$OooO0OO */
    public class OooO0OO extends C5960OooOooo<MenuItem.OnActionExpandListener> implements MenuItem.OnActionExpandListener {
        public OooO0OO(MenuItem.OnActionExpandListener onActionExpandListener) {
            super(onActionExpandListener);
        }

        public boolean onMenuItemActionCollapse(MenuItem menuItem) {
            return super.OooO00o.onMenuItemActionCollapse(MenuItemC5970Oooo0o0.this.OooO00o(menuItem));
        }

        public boolean onMenuItemActionExpand(MenuItem menuItem) {
            return super.OooO00o.onMenuItemActionExpand(MenuItemC5970Oooo0o0.this.OooO00o(menuItem));
        }
    }

    /* renamed from: com.pd.sdk.Oooo0o0$OooO0Oo  reason: case insensitive filesystem */
    public class MenuItem$OnMenuItemClickListenerC5971OooO0Oo extends C5960OooOooo<MenuItem.OnMenuItemClickListener> implements MenuItem.OnMenuItemClickListener {
        public MenuItem$OnMenuItemClickListenerC5971OooO0Oo(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
            super(onMenuItemClickListener);
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            return super.OooO00o.onMenuItemClick(MenuItemC5970Oooo0o0.this.OooO00o(menuItem));
        }
    }

    public MenuItemC5970Oooo0o0(Context context, AbstractMenuItemC7051o00O00oO o00o00oo) {
        super(context, o00o00oo);
    }

    public void OooO00o(boolean z) {
        try {
            if (this.f17238OooO00o == null) {
                this.f17238OooO00o = ((C5960OooOooo) this).OooO00o.getClass().getDeclaredMethod("setExclusiveCheckable", Boolean.TYPE);
            }
            this.f17238OooO00o.invoke(((C5960OooOooo) this).OooO00o, Boolean.valueOf(z));
        } catch (Exception unused) {
        }
    }

    public boolean collapseActionView() {
        return ((C5960OooOooo) this).OooO00o.collapseActionView();
    }

    public boolean expandActionView() {
        return ((C5960OooOooo) this).OooO00o.expandActionView();
    }

    public ActionProvider getActionProvider() {
        AbstractC7089o00OO0oO OooO00o2 = ((C5960OooOooo) this).OooO00o.OooO00o();
        if (OooO00o2 instanceof OooO00o) {
            return ((OooO00o) OooO00o2).OooO00o;
        }
        return null;
    }

    public View getActionView() {
        View actionView = ((C5960OooOooo) this).OooO00o.getActionView();
        return actionView instanceof OooO0O0 ? ((OooO0O0) actionView).OooO00o() : actionView;
    }

    public int getAlphabeticModifiers() {
        return ((C5960OooOooo) this).OooO00o.getAlphabeticModifiers();
    }

    public char getAlphabeticShortcut() {
        return ((C5960OooOooo) this).OooO00o.getAlphabeticShortcut();
    }

    public CharSequence getContentDescription() {
        return ((C5960OooOooo) this).OooO00o.getContentDescription();
    }

    public int getGroupId() {
        return ((C5960OooOooo) this).OooO00o.getGroupId();
    }

    public Drawable getIcon() {
        return ((C5960OooOooo) this).OooO00o.getIcon();
    }

    public ColorStateList getIconTintList() {
        return ((C5960OooOooo) this).OooO00o.getIconTintList();
    }

    public PorterDuff.Mode getIconTintMode() {
        return ((C5960OooOooo) this).OooO00o.getIconTintMode();
    }

    public Intent getIntent() {
        return ((C5960OooOooo) this).OooO00o.getIntent();
    }

    public int getItemId() {
        return ((C5960OooOooo) this).OooO00o.getItemId();
    }

    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return ((C5960OooOooo) this).OooO00o.getMenuInfo();
    }

    public int getNumericModifiers() {
        return ((C5960OooOooo) this).OooO00o.getNumericModifiers();
    }

    public char getNumericShortcut() {
        return ((C5960OooOooo) this).OooO00o.getNumericShortcut();
    }

    public int getOrder() {
        return ((C5960OooOooo) this).OooO00o.getOrder();
    }

    public SubMenu getSubMenu() {
        return OooO00o(((C5960OooOooo) this).OooO00o.getSubMenu());
    }

    public CharSequence getTitle() {
        return ((C5960OooOooo) this).OooO00o.getTitle();
    }

    public CharSequence getTitleCondensed() {
        return ((C5960OooOooo) this).OooO00o.getTitleCondensed();
    }

    public CharSequence getTooltipText() {
        return ((C5960OooOooo) this).OooO00o.getTooltipText();
    }

    public boolean hasSubMenu() {
        return ((C5960OooOooo) this).OooO00o.hasSubMenu();
    }

    public boolean isActionViewExpanded() {
        return ((C5960OooOooo) this).OooO00o.isActionViewExpanded();
    }

    public boolean isCheckable() {
        return ((C5960OooOooo) this).OooO00o.isCheckable();
    }

    public boolean isChecked() {
        return ((C5960OooOooo) this).OooO00o.isChecked();
    }

    public boolean isEnabled() {
        return ((C5960OooOooo) this).OooO00o.isEnabled();
    }

    public boolean isVisible() {
        return ((C5960OooOooo) this).OooO00o.isVisible();
    }

    public MenuItem setActionProvider(ActionProvider actionProvider) {
        ((C5960OooOooo) this).OooO00o.OooO00o(actionProvider != null ? OooO00o(actionProvider) : null);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionView(View view) {
        if (view instanceof CollapsibleActionView) {
            view = new OooO0O0(view);
        }
        ((C5960OooOooo) this).OooO00o.setActionView(view);
        return this;
    }

    public MenuItem setAlphabeticShortcut(char c) {
        ((C5960OooOooo) this).OooO00o.setAlphabeticShortcut(c);
        return this;
    }

    public MenuItem setCheckable(boolean z) {
        ((C5960OooOooo) this).OooO00o.setCheckable(z);
        return this;
    }

    public MenuItem setChecked(boolean z) {
        ((C5960OooOooo) this).OooO00o.setChecked(z);
        return this;
    }

    public MenuItem setContentDescription(CharSequence charSequence) {
        ((C5960OooOooo) this).OooO00o.OooO0O0(charSequence);
        return this;
    }

    public MenuItem setEnabled(boolean z) {
        ((C5960OooOooo) this).OooO00o.setEnabled(z);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        ((C5960OooOooo) this).OooO00o.setIcon(drawable);
        return this;
    }

    public MenuItem setIconTintList(ColorStateList colorStateList) {
        ((C5960OooOooo) this).OooO00o.setIconTintList(colorStateList);
        return this;
    }

    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        ((C5960OooOooo) this).OooO00o.setIconTintMode(mode);
        return this;
    }

    public MenuItem setIntent(Intent intent) {
        ((C5960OooOooo) this).OooO00o.setIntent(intent);
        return this;
    }

    public MenuItem setNumericShortcut(char c) {
        ((C5960OooOooo) this).OooO00o.setNumericShortcut(c);
        return this;
    }

    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        ((C5960OooOooo) this).OooO00o.setOnActionExpandListener(onActionExpandListener != null ? new OooO0OO(onActionExpandListener) : null);
        return this;
    }

    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        ((C5960OooOooo) this).OooO00o.setOnMenuItemClickListener(onMenuItemClickListener != null ? new MenuItem$OnMenuItemClickListenerC5971OooO0Oo(onMenuItemClickListener) : null);
        return this;
    }

    public MenuItem setShortcut(char c, char c2) {
        ((C5960OooOooo) this).OooO00o.setShortcut(c, c2);
        return this;
    }

    public void setShowAsAction(int i) {
        ((C5960OooOooo) this).OooO00o.setShowAsAction(i);
    }

    public MenuItem setShowAsActionFlags(int i) {
        ((C5960OooOooo) this).OooO00o.setShowAsActionFlags(i);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        ((C5960OooOooo) this).OooO00o.setTitle(charSequence);
        return this;
    }

    public MenuItem setTitleCondensed(CharSequence charSequence) {
        ((C5960OooOooo) this).OooO00o.setTitleCondensed(charSequence);
        return this;
    }

    public MenuItem setTooltipText(CharSequence charSequence) {
        ((C5960OooOooo) this).OooO00o.OooO00o(charSequence);
        return this;
    }

    public MenuItem setVisible(boolean z) {
        return ((C5960OooOooo) this).OooO00o.setVisible(z);
    }

    public MenuItem setAlphabeticShortcut(char c, int i) {
        ((C5960OooOooo) this).OooO00o.setAlphabeticShortcut(c, i);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i) {
        ((C5960OooOooo) this).OooO00o.setIcon(i);
        return this;
    }

    public MenuItem setNumericShortcut(char c, int i) {
        ((C5960OooOooo) this).OooO00o.setNumericShortcut(c, i);
        return this;
    }

    public MenuItem setShortcut(char c, char c2, int i, int i2) {
        ((C5960OooOooo) this).OooO00o.setShortcut(c, c2, i, i2);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i) {
        ((C5960OooOooo) this).OooO00o.setTitle(i);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionView(int i) {
        ((C5960OooOooo) this).OooO00o.setActionView(i);
        View actionView = ((C5960OooOooo) this).OooO00o.getActionView();
        if (actionView instanceof CollapsibleActionView) {
            ((C5960OooOooo) this).OooO00o.setActionView(new OooO0O0(actionView));
        }
        return this;
    }

    public OooO00o OooO00o(ActionProvider actionProvider) {
        return new OooO00o(((AbstractC5959OooOooO) this).OooO00o, actionProvider);
    }
}

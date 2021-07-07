package com.p118pd.sdk;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.view.MenuItem;
import android.view.View;
import androidx.annotation.RestrictTo;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: com.pd.sdk.o00O00oO  reason: case insensitive filesystem */
public interface AbstractMenuItemC7051o00O00oO extends MenuItem {
    public static final int OooO = 2;
    public static final int OooO0oO = 0;
    public static final int OooO0oo = 1;
    public static final int OooOO0 = 4;
    public static final int OooOO0O = 8;

    AbstractMenuItemC7051o00O00oO OooO00o(AbstractC7089o00OO0oO o00oo0oo);

    AbstractMenuItemC7051o00O00oO OooO00o(CharSequence charSequence);

    AbstractC7089o00OO0oO OooO00o();

    AbstractMenuItemC7051o00O00oO OooO0O0(CharSequence charSequence);

    boolean collapseActionView();

    boolean expandActionView();

    View getActionView();

    int getAlphabeticModifiers();

    CharSequence getContentDescription();

    ColorStateList getIconTintList();

    PorterDuff.Mode getIconTintMode();

    int getNumericModifiers();

    CharSequence getTooltipText();

    boolean isActionViewExpanded();

    @Override // android.view.MenuItem
    MenuItem setActionView(int i);

    @Override // android.view.MenuItem
    MenuItem setActionView(View view);

    MenuItem setAlphabeticShortcut(char c, int i);

    MenuItem setIconTintList(ColorStateList colorStateList);

    MenuItem setIconTintMode(PorterDuff.Mode mode);

    MenuItem setNumericShortcut(char c, int i);

    MenuItem setShortcut(char c, char c2, int i, int i2);

    void setShowAsAction(int i);

    MenuItem setShowAsActionFlags(int i);
}

package com.p118pd.sdk;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Build;
import android.view.MenuItem;
import android.view.View;

/* renamed from: com.pd.sdk.oOooo0o  reason: case insensitive filesystem */
public final class C8469oOooo0o {
    @Deprecated
    public static final int OooO00o = 0;

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final String f21589OooO00o = "MenuItemCompat";
    @Deprecated
    public static final int OooO0O0 = 1;
    @Deprecated
    public static final int OooO0OO = 2;
    @Deprecated
    public static final int OooO0Oo = 4;
    @Deprecated
    public static final int OooO0o0 = 8;

    /* renamed from: com.pd.sdk.oOooo0o$OooO00o */
    public static class OooO00o implements MenuItem.OnActionExpandListener {
        public final /* synthetic */ OooO0O0 OooO00o;

        public OooO00o(OooO0O0 oooO0O0) {
            this.OooO00o = oooO0O0;
        }

        public boolean onMenuItemActionCollapse(MenuItem menuItem) {
            return this.OooO00o.onMenuItemActionCollapse(menuItem);
        }

        public boolean onMenuItemActionExpand(MenuItem menuItem) {
            return this.OooO00o.onMenuItemActionExpand(menuItem);
        }
    }

    @Deprecated
    /* renamed from: com.pd.sdk.oOooo0o$OooO0O0 */
    public interface OooO0O0 {
        boolean onMenuItemActionCollapse(MenuItem menuItem);

        boolean onMenuItemActionExpand(MenuItem menuItem);
    }

    @Deprecated
    /* renamed from: OooO00o  reason: collision with other method in class */
    public static void m20127OooO00o(MenuItem menuItem, int i) {
        menuItem.setShowAsAction(i);
    }

    @Deprecated
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public static boolean m20130OooO0O0(MenuItem menuItem) {
        return menuItem.expandActionView();
    }

    @Deprecated
    public static boolean OooO0OO(MenuItem menuItem) {
        return menuItem.isActionViewExpanded();
    }

    @Deprecated
    public static MenuItem OooO00o(MenuItem menuItem, View view) {
        return menuItem.setActionView(view);
    }

    public static void OooO0O0(MenuItem menuItem, CharSequence charSequence) {
        if (menuItem instanceof AbstractMenuItemC7051o00O00oO) {
            ((AbstractMenuItemC7051o00O00oO) menuItem).OooO00o(charSequence);
        } else if (Build.VERSION.SDK_INT >= 26) {
            menuItem.setTooltipText(charSequence);
        }
    }

    @Deprecated
    public static MenuItem OooO00o(MenuItem menuItem, int i) {
        return menuItem.setActionView(i);
    }

    @Deprecated
    /* renamed from: OooO00o  reason: collision with other method in class */
    public static View m20124OooO00o(MenuItem menuItem) {
        return menuItem.getActionView();
    }

    public static MenuItem OooO00o(MenuItem menuItem, AbstractC7089o00OO0oO o00oo0oo) {
        return menuItem instanceof AbstractMenuItemC7051o00O00oO ? ((AbstractMenuItemC7051o00O00oO) menuItem).OooO00o(o00oo0oo) : menuItem;
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public static CharSequence m20129OooO0O0(MenuItem menuItem) {
        if (menuItem instanceof AbstractMenuItemC7051o00O00oO) {
            return ((AbstractMenuItemC7051o00O00oO) menuItem).getTooltipText();
        }
        if (Build.VERSION.SDK_INT >= 26) {
            return menuItem.getTooltipText();
        }
        return null;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static AbstractC7089o00OO0oO m20125OooO00o(MenuItem menuItem) {
        if (menuItem instanceof AbstractMenuItemC7051o00O00oO) {
            return ((AbstractMenuItemC7051o00O00oO) menuItem).OooO00o();
        }
        return null;
    }

    @Deprecated
    /* renamed from: OooO00o  reason: collision with other method in class */
    public static boolean m20128OooO00o(MenuItem menuItem) {
        return menuItem.collapseActionView();
    }

    @Deprecated
    public static MenuItem OooO00o(MenuItem menuItem, OooO0O0 oooO0O0) {
        return menuItem.setOnActionExpandListener(new OooO00o(oooO0O0));
    }

    public static void OooO0O0(MenuItem menuItem, char c, int i) {
        if (menuItem instanceof AbstractMenuItemC7051o00O00oO) {
            ((AbstractMenuItemC7051o00O00oO) menuItem).setNumericShortcut(c, i);
        } else if (Build.VERSION.SDK_INT >= 26) {
            menuItem.setNumericShortcut(c, i);
        }
    }

    public static void OooO00o(MenuItem menuItem, CharSequence charSequence) {
        if (menuItem instanceof AbstractMenuItemC7051o00O00oO) {
            ((AbstractMenuItemC7051o00O00oO) menuItem).OooO0O0(charSequence);
        } else if (Build.VERSION.SDK_INT >= 26) {
            menuItem.setContentDescription(charSequence);
        }
    }

    public static int OooO0O0(MenuItem menuItem) {
        if (menuItem instanceof AbstractMenuItemC7051o00O00oO) {
            return ((AbstractMenuItemC7051o00O00oO) menuItem).getNumericModifiers();
        }
        if (Build.VERSION.SDK_INT >= 26) {
            return menuItem.getNumericModifiers();
        }
        return 0;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static CharSequence m20126OooO00o(MenuItem menuItem) {
        if (menuItem instanceof AbstractMenuItemC7051o00O00oO) {
            return ((AbstractMenuItemC7051o00O00oO) menuItem).getContentDescription();
        }
        if (Build.VERSION.SDK_INT >= 26) {
            return menuItem.getContentDescription();
        }
        return null;
    }

    public static void OooO00o(MenuItem menuItem, char c, char c2, int i, int i2) {
        if (menuItem instanceof AbstractMenuItemC7051o00O00oO) {
            ((AbstractMenuItemC7051o00O00oO) menuItem).setShortcut(c, c2, i, i2);
        } else if (Build.VERSION.SDK_INT >= 26) {
            menuItem.setShortcut(c, c2, i, i2);
        }
    }

    public static void OooO00o(MenuItem menuItem, char c, int i) {
        if (menuItem instanceof AbstractMenuItemC7051o00O00oO) {
            ((AbstractMenuItemC7051o00O00oO) menuItem).setAlphabeticShortcut(c, i);
        } else if (Build.VERSION.SDK_INT >= 26) {
            menuItem.setAlphabeticShortcut(c, i);
        }
    }

    public static int OooO00o(MenuItem menuItem) {
        if (menuItem instanceof AbstractMenuItemC7051o00O00oO) {
            return ((AbstractMenuItemC7051o00O00oO) menuItem).getAlphabeticModifiers();
        }
        if (Build.VERSION.SDK_INT >= 26) {
            return menuItem.getAlphabeticModifiers();
        }
        return 0;
    }

    public static void OooO00o(MenuItem menuItem, ColorStateList colorStateList) {
        if (menuItem instanceof AbstractMenuItemC7051o00O00oO) {
            ((AbstractMenuItemC7051o00O00oO) menuItem).setIconTintList(colorStateList);
        } else if (Build.VERSION.SDK_INT >= 26) {
            menuItem.setIconTintList(colorStateList);
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static ColorStateList m20122OooO00o(MenuItem menuItem) {
        if (menuItem instanceof AbstractMenuItemC7051o00O00oO) {
            return ((AbstractMenuItemC7051o00O00oO) menuItem).getIconTintList();
        }
        if (Build.VERSION.SDK_INT >= 26) {
            return menuItem.getIconTintList();
        }
        return null;
    }

    public static void OooO00o(MenuItem menuItem, PorterDuff.Mode mode) {
        if (menuItem instanceof AbstractMenuItemC7051o00O00oO) {
            ((AbstractMenuItemC7051o00O00oO) menuItem).setIconTintMode(mode);
        } else if (Build.VERSION.SDK_INT >= 26) {
            menuItem.setIconTintMode(mode);
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static PorterDuff.Mode m20123OooO00o(MenuItem menuItem) {
        if (menuItem instanceof AbstractMenuItemC7051o00O00oO) {
            return ((AbstractMenuItemC7051o00O00oO) menuItem).getIconTintMode();
        }
        if (Build.VERSION.SDK_INT >= 26) {
            return menuItem.getIconTintMode();
        }
        return null;
    }
}

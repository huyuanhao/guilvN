package com.p118pd.sdk;

import android.annotation.SuppressLint;
import android.os.Build;
import android.view.Menu;
import android.view.MenuItem;

/* renamed from: com.pd.sdk.o00OOOOo  reason: case insensitive filesystem */
public final class C7097o00OOOOo {
    @Deprecated
    public static void OooO00o(MenuItem menuItem, int i) {
        menuItem.setShowAsAction(i);
    }

    @SuppressLint({"NewApi"})
    public static void OooO00o(Menu menu, boolean z) {
        if (menu instanceof AbstractMenuC7049o00O00o) {
            ((AbstractMenuC7049o00O00o) menu).setGroupDividerEnabled(z);
        } else if (Build.VERSION.SDK_INT >= 28) {
            menu.setGroupDividerEnabled(z);
        }
    }
}

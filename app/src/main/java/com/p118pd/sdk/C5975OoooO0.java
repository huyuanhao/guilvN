package com.p118pd.sdk;

import android.content.Context;
import android.os.Build;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import androidx.annotation.RestrictTo;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: com.pd.sdk.OoooO0  reason: case insensitive filesystem */
public final class C5975OoooO0 {
    public static Menu OooO00o(Context context, AbstractMenuC7049o00O00o o00o00o) {
        return new MenuC5977OoooO0O(context, o00o00o);
    }

    public static MenuItem OooO00o(Context context, AbstractMenuItemC7051o00O00oO o00o00oo) {
        if (Build.VERSION.SDK_INT >= 16) {
            return new C5969Oooo0o(context, o00o00oo);
        }
        return new MenuItemC5970Oooo0o0(context, o00o00oo);
    }

    public static SubMenu OooO00o(Context context, AbstractSubMenuC8557oo00o oo00o) {
        return new SubMenuC5979OoooOOO(context, oo00o);
    }
}

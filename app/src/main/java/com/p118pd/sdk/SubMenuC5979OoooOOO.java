package com.p118pd.sdk;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.annotation.RestrictTo;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: com.pd.sdk.OoooOOO  reason: case insensitive filesystem */
public class SubMenuC5979OoooOOO extends MenuC5977OoooO0O implements SubMenu {
    public SubMenuC5979OoooOOO(Context context, AbstractSubMenuC8557oo00o oo00o) {
        super(context, oo00o);
    }

    public void clearHeader() {
        OooO00o().clearHeader();
    }

    public MenuItem getItem() {
        return OooO00o(OooO00o().getItem());
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderIcon(int i) {
        OooO00o().setHeaderIcon(i);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(int i) {
        OooO00o().setHeaderTitle(i);
        return this;
    }

    public SubMenu setHeaderView(View view) {
        OooO00o().setHeaderView(view);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setIcon(int i) {
        OooO00o().setIcon(i);
        return this;
    }

    @Override // com.p118pd.sdk.AbstractC5959OooOooO, com.p118pd.sdk.C5960OooOooo
    public AbstractSubMenuC8557oo00o OooO00o() {
        return ((C5960OooOooo) this).OooO00o;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderIcon(Drawable drawable) {
        OooO00o().setHeaderIcon(drawable);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(CharSequence charSequence) {
        OooO00o().setHeaderTitle(charSequence);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setIcon(Drawable drawable) {
        OooO00o().setIcon(drawable);
        return this;
    }
}

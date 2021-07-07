package com.p118pd.sdk;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.annotation.RestrictTo;
import com.p118pd.sdk.C5965Oooo00o;
import com.xiaomi.mipush.sdk.Constants;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: com.pd.sdk.o000oOoO  reason: case insensitive filesystem */
public class SubMenuC7026o000oOoO extends C5965Oooo00o implements SubMenu {
    public C5965Oooo00o OooO00o;
    public C5967Oooo0OO OooO0O0;

    public SubMenuC7026o000oOoO(Context context, C5965Oooo00o oooo00o, C5967Oooo0OO oooo0OO) {
        super(context);
        this.OooO00o = oooo00o;
        this.OooO0O0 = oooo0OO;
    }

    @Override // com.p118pd.sdk.C5965Oooo00o, com.p118pd.sdk.C5965Oooo00o, com.p118pd.sdk.C5965Oooo00o, com.p118pd.sdk.C5965Oooo00o, com.p118pd.sdk.C5965Oooo00o, com.p118pd.sdk.C5965Oooo00o, com.p118pd.sdk.C5965Oooo00o, com.p118pd.sdk.C5965Oooo00o, com.p118pd.sdk.C5965Oooo00o, com.p118pd.sdk.C5965Oooo00o, com.p118pd.sdk.C5965Oooo00o
    public Menu OooO00o() {
        return this.OooO00o;
    }

    @Override // com.p118pd.sdk.C5965Oooo00o, com.p118pd.sdk.C5965Oooo00o
    public boolean OooO0O0(C5967Oooo0OO oooo0OO) {
        return this.OooO00o.m16786OooO0O0(oooo0OO);
    }

    @Override // com.p118pd.sdk.C5965Oooo00o, com.p118pd.sdk.C5965Oooo00o, com.p118pd.sdk.C5965Oooo00o
    public boolean OooO0OO() {
        return this.OooO00o.m16789OooO0OO();
    }

    @Override // com.p118pd.sdk.C5965Oooo00o, com.p118pd.sdk.C5965Oooo00o
    public boolean OooO0Oo() {
        return this.OooO00o.m16790OooO0Oo();
    }

    @Override // com.p118pd.sdk.C5965Oooo00o
    public void OooO0o0(boolean z) {
        this.OooO00o.OooO0o0(z);
    }

    public MenuItem getItem() {
        return this.OooO0O0;
    }

    @Override // com.p118pd.sdk.C5965Oooo00o, com.p118pd.sdk.AbstractMenuC7049o00O00o
    public void setGroupDividerEnabled(boolean z) {
        this.OooO00o.setGroupDividerEnabled(z);
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderIcon(Drawable drawable) {
        return (SubMenu) super.OooO00o(drawable);
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(CharSequence charSequence) {
        return (SubMenu) super.OooO00o(charSequence);
    }

    public SubMenu setHeaderView(View view) {
        return (SubMenu) super.OooO00o(view);
    }

    @Override // android.view.SubMenu
    public SubMenu setIcon(Drawable drawable) {
        this.OooO0O0.setIcon(drawable);
        return this;
    }

    @Override // com.p118pd.sdk.C5965Oooo00o
    public void setQwertyMode(boolean z) {
        this.OooO00o.setQwertyMode(z);
    }

    @Override // com.p118pd.sdk.C5965Oooo00o
    public void OooO00o(C5965Oooo00o.OooO00o oooO00o) {
        this.OooO00o.OooO00o(oooO00o);
    }

    @Override // com.p118pd.sdk.C5965Oooo00o, com.p118pd.sdk.C5965Oooo00o, com.p118pd.sdk.C5965Oooo00o
    public boolean OooO0O0() {
        return this.OooO00o.m16785OooO0O0();
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderIcon(int i) {
        return (SubMenu) super.m16783OooO0O0(i);
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(int i) {
        return (SubMenu) super.m16787OooO0OO(i);
    }

    @Override // android.view.SubMenu
    public SubMenu setIcon(int i) {
        this.OooO0O0.setIcon(i);
        return this;
    }

    @Override // com.p118pd.sdk.C5965Oooo00o, com.p118pd.sdk.C5965Oooo00o, com.p118pd.sdk.C5965Oooo00o, com.p118pd.sdk.C5965Oooo00o, com.p118pd.sdk.C5965Oooo00o, com.p118pd.sdk.C5965Oooo00o, com.p118pd.sdk.C5965Oooo00o, com.p118pd.sdk.C5965Oooo00o, com.p118pd.sdk.C5965Oooo00o, com.p118pd.sdk.C5965Oooo00o, com.p118pd.sdk.C5965Oooo00o
    /* renamed from: OooO00o  reason: collision with other method in class */
    public C5965Oooo00o m18288OooO00o() {
        return this.OooO00o.m16773OooO00o();
    }

    @Override // com.p118pd.sdk.C5965Oooo00o
    public boolean OooO00o(C5965Oooo00o oooo00o, MenuItem menuItem) {
        return super.OooO00o(oooo00o, menuItem) || this.OooO00o.OooO00o(oooo00o, menuItem);
    }

    @Override // com.p118pd.sdk.C5965Oooo00o, com.p118pd.sdk.C5965Oooo00o
    public boolean OooO00o(C5967Oooo0OO oooo0OO) {
        return this.OooO00o.m16782OooO00o(oooo0OO);
    }

    @Override // com.p118pd.sdk.C5965Oooo00o, com.p118pd.sdk.C5965Oooo00o, com.p118pd.sdk.C5965Oooo00o, com.p118pd.sdk.C5965Oooo00o, com.p118pd.sdk.C5965Oooo00o, com.p118pd.sdk.C5965Oooo00o, com.p118pd.sdk.C5965Oooo00o, com.p118pd.sdk.C5965Oooo00o, com.p118pd.sdk.C5965Oooo00o, com.p118pd.sdk.C5965Oooo00o, com.p118pd.sdk.C5965Oooo00o
    /* renamed from: OooO00o  reason: collision with other method in class */
    public String m18289OooO00o() {
        C5967Oooo0OO oooo0OO = this.OooO0O0;
        int itemId = oooo0OO != null ? oooo0OO.getItemId() : 0;
        if (itemId == 0) {
            return null;
        }
        return super.m16777OooO00o() + Constants.COLON_SEPARATOR + itemId;
    }
}

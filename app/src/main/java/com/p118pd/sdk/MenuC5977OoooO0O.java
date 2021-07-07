package com.p118pd.sdk;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;

/* renamed from: com.pd.sdk.OoooO0O  reason: case insensitive filesystem */
public class MenuC5977OoooO0O extends AbstractC5959OooOooO<AbstractMenuC7049o00O00o> implements Menu {
    public MenuC5977OoooO0O(Context context, AbstractMenuC7049o00O00o o00o00o) {
        super(context, o00o00o);
    }

    @Override // android.view.Menu
    public MenuItem add(CharSequence charSequence) {
        return OooO00o(((C5960OooOooo) this).OooO00o.add(charSequence));
    }

    public int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        MenuItem[] menuItemArr2 = menuItemArr != null ? new MenuItem[menuItemArr.length] : null;
        int addIntentOptions = ((C5960OooOooo) this).OooO00o.addIntentOptions(i, i2, i3, componentName, intentArr, intent, i4, menuItemArr2);
        if (menuItemArr2 != null) {
            int length = menuItemArr2.length;
            for (int i5 = 0; i5 < length; i5++) {
                menuItemArr[i5] = OooO00o(menuItemArr2[i5]);
            }
        }
        return addIntentOptions;
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(CharSequence charSequence) {
        return OooO00o(((C5960OooOooo) this).OooO00o.addSubMenu(charSequence));
    }

    public void clear() {
        OooO00o();
        ((C5960OooOooo) this).OooO00o.clear();
    }

    public void close() {
        ((C5960OooOooo) this).OooO00o.close();
    }

    public MenuItem findItem(int i) {
        return OooO00o(((C5960OooOooo) this).OooO00o.findItem(i));
    }

    public MenuItem getItem(int i) {
        return OooO00o(((C5960OooOooo) this).OooO00o.getItem(i));
    }

    public boolean hasVisibleItems() {
        return ((C5960OooOooo) this).OooO00o.hasVisibleItems();
    }

    public boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return ((C5960OooOooo) this).OooO00o.isShortcutKey(i, keyEvent);
    }

    public boolean performIdentifierAction(int i, int i2) {
        return ((C5960OooOooo) this).OooO00o.performIdentifierAction(i, i2);
    }

    public boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        return ((C5960OooOooo) this).OooO00o.performShortcut(i, keyEvent, i2);
    }

    public void removeGroup(int i) {
        OooO00o(i);
        ((C5960OooOooo) this).OooO00o.removeGroup(i);
    }

    public void removeItem(int i) {
        OooO0O0(i);
        ((C5960OooOooo) this).OooO00o.removeItem(i);
    }

    public void setGroupCheckable(int i, boolean z, boolean z2) {
        ((C5960OooOooo) this).OooO00o.setGroupCheckable(i, z, z2);
    }

    public void setGroupEnabled(int i, boolean z) {
        ((C5960OooOooo) this).OooO00o.setGroupEnabled(i, z);
    }

    public void setGroupVisible(int i, boolean z) {
        ((C5960OooOooo) this).OooO00o.setGroupVisible(i, z);
    }

    public void setQwertyMode(boolean z) {
        ((C5960OooOooo) this).OooO00o.setQwertyMode(z);
    }

    public int size() {
        return ((C5960OooOooo) this).OooO00o.size();
    }

    @Override // android.view.Menu
    public MenuItem add(int i) {
        return OooO00o(((C5960OooOooo) this).OooO00o.add(i));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i) {
        return OooO00o(((C5960OooOooo) this).OooO00o.addSubMenu(i));
    }

    @Override // android.view.Menu
    public MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return OooO00o(((C5960OooOooo) this).OooO00o.add(i, i2, i3, charSequence));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        return OooO00o(((C5960OooOooo) this).OooO00o.addSubMenu(i, i2, i3, charSequence));
    }

    @Override // android.view.Menu
    public MenuItem add(int i, int i2, int i3, int i4) {
        return OooO00o(((C5960OooOooo) this).OooO00o.add(i, i2, i3, i4));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return OooO00o(((C5960OooOooo) this).OooO00o.addSubMenu(i, i2, i3, i4));
    }
}

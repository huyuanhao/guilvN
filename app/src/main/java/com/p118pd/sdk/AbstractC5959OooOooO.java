package com.p118pd.sdk;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.pd.sdk.OooOooO  reason: case insensitive filesystem */
public abstract class AbstractC5959OooOooO<T> extends C5960OooOooo<T> {
    public final Context OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Map<AbstractMenuItemC7051o00O00oO, MenuItem> f17186OooO00o;
    public Map<AbstractSubMenuC8557oo00o, SubMenu> OooO0O0;

    public AbstractC5959OooOooO(Context context, T t) {
        super(t);
        this.OooO00o = context;
    }

    public final MenuItem OooO00o(MenuItem menuItem) {
        if (!(menuItem instanceof AbstractMenuItemC7051o00O00oO)) {
            return menuItem;
        }
        AbstractMenuItemC7051o00O00oO o00o00oo = (AbstractMenuItemC7051o00O00oO) menuItem;
        if (this.f17186OooO00o == null) {
            this.f17186OooO00o = new C6971o0000oO0();
        }
        MenuItem menuItem2 = this.f17186OooO00o.get(menuItem);
        if (menuItem2 != null) {
            return menuItem2;
        }
        MenuItem OooO00o2 = C5975OoooO0.OooO00o(this.OooO00o, o00o00oo);
        this.f17186OooO00o.put(o00o00oo, OooO00o2);
        return OooO00o2;
    }

    public final void OooO0O0(int i) {
        Map<AbstractMenuItemC7051o00O00oO, MenuItem> map = this.f17186OooO00o;
        if (map != null) {
            Iterator<AbstractMenuItemC7051o00O00oO> it = map.keySet().iterator();
            while (it.hasNext()) {
                if (i == it.next().getItemId()) {
                    it.remove();
                    return;
                }
            }
        }
    }

    public final SubMenu OooO00o(SubMenu subMenu) {
        if (!(subMenu instanceof AbstractSubMenuC8557oo00o)) {
            return subMenu;
        }
        AbstractSubMenuC8557oo00o oo00o = (AbstractSubMenuC8557oo00o) subMenu;
        if (this.OooO0O0 == null) {
            this.OooO0O0 = new C6971o0000oO0();
        }
        SubMenu subMenu2 = this.OooO0O0.get(oo00o);
        if (subMenu2 != null) {
            return subMenu2;
        }
        SubMenu OooO00o2 = C5975OoooO0.OooO00o(this.OooO00o, oo00o);
        this.OooO0O0.put(oo00o, OooO00o2);
        return OooO00o2;
    }

    @Override // com.p118pd.sdk.C5960OooOooo
    public final void OooO00o() {
        Map<AbstractMenuItemC7051o00O00oO, MenuItem> map = this.f17186OooO00o;
        if (map != null) {
            map.clear();
        }
        Map<AbstractSubMenuC8557oo00o, SubMenu> map2 = this.OooO0O0;
        if (map2 != null) {
            map2.clear();
        }
    }

    public final void OooO00o(int i) {
        Map<AbstractMenuItemC7051o00O00oO, MenuItem> map = this.f17186OooO00o;
        if (map != null) {
            Iterator<AbstractMenuItemC7051o00O00oO> it = map.keySet().iterator();
            while (it.hasNext()) {
                if (i == it.next().getGroupId()) {
                    it.remove();
                }
            }
        }
    }
}

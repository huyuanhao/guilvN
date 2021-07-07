package com.p118pd.sdk;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.annotation.RestrictTo;
import com.p118pd.sdk.AbstractC5951OooOo00;
import java.util.ArrayList;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: com.pd.sdk.OooOo */
public class OooOo extends ActionMode {
    public final Context OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final AbstractC5951OooOo00 f17120OooO00o;

    public OooOo(Context context, AbstractC5951OooOo00 oooOo00) {
        this.OooO00o = context;
        this.f17120OooO00o = oooOo00;
    }

    public void finish() {
        this.f17120OooO00o.m16745OooO00o();
    }

    public View getCustomView() {
        return this.f17120OooO00o.m16742OooO00o();
    }

    public Menu getMenu() {
        return C5975OoooO0.OooO00o(this.OooO00o, (AbstractMenuC7049o00O00o) this.f17120OooO00o.OooO00o());
    }

    public MenuInflater getMenuInflater() {
        return this.f17120OooO00o.m16741OooO00o();
    }

    public CharSequence getSubtitle() {
        return this.f17120OooO00o.m16743OooO00o();
    }

    public Object getTag() {
        return this.f17120OooO00o.m16744OooO00o();
    }

    public CharSequence getTitle() {
        return this.f17120OooO00o.OooO0O0();
    }

    public boolean getTitleOptionalHint() {
        return this.f17120OooO00o.m16746OooO00o();
    }

    public void invalidate() {
        this.f17120OooO00o.m16747OooO0O0();
    }

    public boolean isTitleOptional() {
        return this.f17120OooO00o.m16748OooO0O0();
    }

    public void setCustomView(View view) {
        this.f17120OooO00o.OooO00o(view);
    }

    @Override // android.view.ActionMode
    public void setSubtitle(CharSequence charSequence) {
        this.f17120OooO00o.OooO00o(charSequence);
    }

    public void setTag(Object obj) {
        this.f17120OooO00o.OooO00o(obj);
    }

    @Override // android.view.ActionMode
    public void setTitle(CharSequence charSequence) {
        this.f17120OooO00o.OooO0O0(charSequence);
    }

    public void setTitleOptionalHint(boolean z) {
        this.f17120OooO00o.OooO00o(z);
    }

    @Override // android.view.ActionMode
    public void setSubtitle(int i) {
        this.f17120OooO00o.OooO00o(i);
    }

    @Override // android.view.ActionMode
    public void setTitle(int i) {
        this.f17120OooO00o.OooO0O0(i);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: com.pd.sdk.OooOo$OooO00o */
    public static class OooO00o implements AbstractC5951OooOo00.OooO00o {
        public final Context OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final ActionMode.Callback f17121OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final C6987o000O0o<Menu, Menu> f17122OooO00o = new C6987o000O0o<>();

        /* renamed from: OooO00o  reason: collision with other field name */
        public final ArrayList<OooOo> f17123OooO00o = new ArrayList<>();

        public OooO00o(Context context, ActionMode.Callback callback) {
            this.OooO00o = context;
            this.f17121OooO00o = callback;
        }

        @Override // com.p118pd.sdk.AbstractC5951OooOo00.OooO00o
        public boolean OooO00o(AbstractC5951OooOo00 oooOo00, Menu menu) {
            return this.f17121OooO00o.onCreateActionMode(OooO00o(oooOo00), OooO00o(menu));
        }

        @Override // com.p118pd.sdk.AbstractC5951OooOo00.OooO00o
        public boolean OooO0O0(AbstractC5951OooOo00 oooOo00, Menu menu) {
            return this.f17121OooO00o.onPrepareActionMode(OooO00o(oooOo00), OooO00o(menu));
        }

        @Override // com.p118pd.sdk.AbstractC5951OooOo00.OooO00o
        public boolean OooO00o(AbstractC5951OooOo00 oooOo00, MenuItem menuItem) {
            return this.f17121OooO00o.onActionItemClicked(OooO00o(oooOo00), C5975OoooO0.OooO00o(this.OooO00o, (AbstractMenuItemC7051o00O00oO) menuItem));
        }

        @Override // com.p118pd.sdk.AbstractC5951OooOo00.OooO00o
        /* renamed from: OooO00o  reason: collision with other method in class */
        public void m16740OooO00o(AbstractC5951OooOo00 oooOo00) {
            this.f17121OooO00o.onDestroyActionMode(OooO00o(oooOo00));
        }

        private Menu OooO00o(Menu menu) {
            Menu menu2 = this.f17122OooO00o.get(menu);
            if (menu2 != null) {
                return menu2;
            }
            Menu OooO00o2 = C5975OoooO0.OooO00o(this.OooO00o, (AbstractMenuC7049o00O00o) menu);
            this.f17122OooO00o.put(menu, OooO00o2);
            return OooO00o2;
        }

        @Override // com.p118pd.sdk.AbstractC5951OooOo00.OooO00o
        public ActionMode OooO00o(AbstractC5951OooOo00 oooOo00) {
            int size = this.f17123OooO00o.size();
            for (int i = 0; i < size; i++) {
                OooOo oooOo = this.f17123OooO00o.get(i);
                if (oooOo != null && oooOo.f17120OooO00o == oooOo00) {
                    return oooOo;
                }
            }
            OooOo oooOo2 = new OooOo(this.OooO00o, oooOo00);
            this.f17123OooO00o.add(oooOo2);
            return oooOo2;
        }
    }
}

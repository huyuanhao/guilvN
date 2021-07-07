package com.p118pd.sdk;

import android.content.Context;
import android.view.ActionProvider;
import android.view.MenuItem;
import android.view.View;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import com.p118pd.sdk.AbstractC7089o00OO0oO;
import com.p118pd.sdk.MenuItemC5970Oooo0o0;

@RequiresApi(16)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: com.pd.sdk.Oooo0o  reason: case insensitive filesystem */
public class C5969Oooo0o extends MenuItemC5970Oooo0o0 {

    /* renamed from: com.pd.sdk.Oooo0o$OooO00o */
    public class OooO00o extends MenuItemC5970Oooo0o0.OooO00o implements ActionProvider.VisibilityListener {
        public AbstractC7089o00OO0oO.OooO0O0 OooO0O0;

        public OooO00o(Context context, ActionProvider actionProvider) {
            super(context, actionProvider);
        }

        @Override // com.p118pd.sdk.AbstractC7089o00OO0oO
        public View OooO00o(MenuItem menuItem) {
            return ((MenuItemC5970Oooo0o0.OooO00o) this).OooO00o.onCreateActionView(menuItem);
        }

        @Override // com.p118pd.sdk.AbstractC7089o00OO0oO, com.p118pd.sdk.AbstractC7089o00OO0oO
        public boolean OooO0O0() {
            return ((MenuItemC5970Oooo0o0.OooO00o) this).OooO00o.isVisible();
        }

        @Override // com.p118pd.sdk.AbstractC7089o00OO0oO
        public boolean OooO0Oo() {
            return ((MenuItemC5970Oooo0o0.OooO00o) this).OooO00o.overridesItemVisibility();
        }

        public void onActionProviderVisibilityChanged(boolean z) {
            AbstractC7089o00OO0oO.OooO0O0 oooO0O0 = this.OooO0O0;
            if (oooO0O0 != null) {
                oooO0O0.onActionProviderVisibilityChanged(z);
            }
        }

        @Override // com.p118pd.sdk.AbstractC7089o00OO0oO, com.p118pd.sdk.AbstractC7089o00OO0oO, com.p118pd.sdk.AbstractC7089o00OO0oO, com.p118pd.sdk.AbstractC7089o00OO0oO, com.p118pd.sdk.MenuItemC5970Oooo0o0.OooO00o, com.p118pd.sdk.MenuItemC5970Oooo0o0.OooO00o
        public void OooO00o() {
            ((MenuItemC5970Oooo0o0.OooO00o) this).OooO00o.refreshVisibility();
        }

        @Override // com.p118pd.sdk.AbstractC7089o00OO0oO
        public void OooO00o(AbstractC7089o00OO0oO.OooO0O0 oooO0O0) {
            this.OooO0O0 = oooO0O0;
            ((MenuItemC5970Oooo0o0.OooO00o) this).OooO00o.setVisibilityListener(oooO0O0 != null ? this : null);
        }
    }

    public C5969Oooo0o(Context context, AbstractMenuItemC7051o00O00oO o00o00oo) {
        super(context, o00o00oo);
    }

    @Override // com.p118pd.sdk.MenuItemC5970Oooo0o0
    public MenuItemC5970Oooo0o0.OooO00o OooO00o(ActionProvider actionProvider) {
        return new OooO00o(((AbstractC5959OooOooO) this).OooO00o, actionProvider);
    }
}

package com.p118pd.sdk;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.annotation.RestrictTo;

/* renamed from: com.pd.sdk.o00OO0oO  reason: case insensitive filesystem */
public abstract class AbstractC7089o00OO0oO {
    public static final String OooO00o = "ActionProvider(support)";

    /* renamed from: OooO00o  reason: collision with other field name */
    public final Context f19416OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public OooO00o f19417OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public OooO0O0 f19418OooO00o;

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: com.pd.sdk.o00OO0oO$OooO00o */
    public interface OooO00o {
        void OooO0O0(boolean z);
    }

    /* renamed from: com.pd.sdk.o00OO0oO$OooO0O0 */
    public interface OooO0O0 {
        void onActionProviderVisibilityChanged(boolean z);
    }

    public AbstractC7089o00OO0oO(Context context) {
        this.f19416OooO00o = context;
    }

    public Context OooO00o() {
        return this.f19416OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public abstract View m18365OooO00o();

    public void OooO00o(SubMenu subMenu) {
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m18367OooO00o() {
        return false;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void OooO0O0() {
        this.f19418OooO00o = null;
        this.f19417OooO00o = null;
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public boolean m18368OooO0O0() {
        return true;
    }

    public boolean OooO0OO() {
        return false;
    }

    public boolean OooO0Oo() {
        return false;
    }

    public View OooO00o(MenuItem menuItem) {
        return m18365OooO00o();
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m18366OooO00o() {
        if (this.f19418OooO00o != null && OooO0Oo()) {
            this.f19418OooO00o.onActionProviderVisibilityChanged(m18368OooO0O0());
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void OooO00o(boolean z) {
        OooO00o oooO00o = this.f19417OooO00o;
        if (oooO00o != null) {
            oooO00o.OooO0O0(z);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void OooO00o(OooO00o oooO00o) {
        this.f19417OooO00o = oooO00o;
    }

    public void OooO00o(OooO0O0 oooO0O0) {
        if (!(this.f19418OooO00o == null || oooO0O0 == null)) {
            String str = "setVisibilityListener: Setting a new ActionProvider.VisibilityListener when one is already set. Are you reusing this " + getClass().getSimpleName() + " instance while it is still in use somewhere else?";
        }
        this.f19418OooO00o = oooO0O0;
    }
}

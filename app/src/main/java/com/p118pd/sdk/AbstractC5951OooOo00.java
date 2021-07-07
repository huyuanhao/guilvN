package com.p118pd.sdk;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.annotation.RestrictTo;

/* renamed from: com.pd.sdk.OooOo00  reason: case insensitive filesystem */
public abstract class AbstractC5951OooOo00 {
    public Object OooO00o;
    public boolean OooO0O0;

    /* renamed from: com.pd.sdk.OooOo00$OooO00o */
    public interface OooO00o {
        void OooO00o(AbstractC5951OooOo00 oooOo00);

        boolean OooO00o(AbstractC5951OooOo00 oooOo00, Menu menu);

        boolean OooO00o(AbstractC5951OooOo00 oooOo00, MenuItem menuItem);

        boolean OooO0O0(AbstractC5951OooOo00 oooOo00, Menu menu);
    }

    public abstract Menu OooO00o();

    /* renamed from: OooO00o  reason: collision with other method in class */
    public abstract MenuInflater m16741OooO00o();

    /* renamed from: OooO00o  reason: collision with other method in class */
    public abstract View m16742OooO00o();

    /* renamed from: OooO00o  reason: collision with other method in class */
    public abstract CharSequence m16743OooO00o();

    /* renamed from: OooO00o  reason: collision with other method in class */
    public abstract void m16745OooO00o();

    public abstract void OooO00o(int i);

    public abstract void OooO00o(View view);

    public abstract void OooO00o(CharSequence charSequence);

    public void OooO00o(Object obj) {
        this.OooO00o = obj;
    }

    public abstract CharSequence OooO0O0();

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public abstract void m16747OooO0O0();

    public abstract void OooO0O0(int i);

    public abstract void OooO0O0(CharSequence charSequence);

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public boolean m16748OooO0O0() {
        return false;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public boolean OooO0OO() {
        return true;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public Object m16744OooO00o() {
        return this.OooO00o;
    }

    public void OooO00o(boolean z) {
        this.OooO0O0 = z;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m16746OooO00o() {
        return this.OooO0O0;
    }
}

package com.p118pd.sdk;

import android.content.Context;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.annotation.RestrictTo;
import androidx.appcompat.widget.ActionBarContextView;
import com.p118pd.sdk.AbstractC5951OooOo00;
import com.p118pd.sdk.C5965Oooo00o;
import java.lang.ref.WeakReference;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: com.pd.sdk.OooOo0o  reason: case insensitive filesystem */
public class C5953OooOo0o extends AbstractC5951OooOo00 implements C5965Oooo00o.OooO00o {
    public Context OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public ActionBarContextView f17128OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public AbstractC5951OooOo00.OooO00o f17129OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C5965Oooo00o f17130OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public WeakReference<View> f17131OooO00o;
    public boolean OooO0OO;
    public boolean OooO0Oo;

    public C5953OooOo0o(Context context, ActionBarContextView actionBarContextView, AbstractC5951OooOo00.OooO00o oooO00o, boolean z) {
        this.OooO00o = context;
        this.f17128OooO00o = actionBarContextView;
        this.f17129OooO00o = oooO00o;
        C5965Oooo00o OooO00o2 = new C5965Oooo00o(actionBarContextView.getContext()).m16774OooO00o(1);
        this.f17130OooO00o = OooO00o2;
        OooO00o2.OooO00o(this);
        this.OooO0Oo = z;
    }

    public void OooO00o(C5965Oooo00o oooo00o, boolean z) {
    }

    public void OooO00o(SubMenuC7026o000oOoO o000oooo) {
    }

    @Override // com.p118pd.sdk.AbstractC5951OooOo00
    public void OooO00o(CharSequence charSequence) {
        this.f17128OooO00o.setSubtitle(charSequence);
    }

    @Override // com.p118pd.sdk.AbstractC5951OooOo00
    public void OooO0O0(CharSequence charSequence) {
        this.f17128OooO00o.setTitle(charSequence);
    }

    @Override // com.p118pd.sdk.AbstractC5951OooOo00
    public boolean OooO0OO() {
        return this.OooO0Oo;
    }

    @Override // com.p118pd.sdk.AbstractC5951OooOo00
    public void OooO00o(int i) {
        OooO00o((CharSequence) this.OooO00o.getString(i));
    }

    @Override // com.p118pd.sdk.AbstractC5951OooOo00
    public void OooO0O0(int i) {
        OooO0O0(this.OooO00o.getString(i));
    }

    @Override // com.p118pd.sdk.AbstractC5951OooOo00
    public void OooO00o(boolean z) {
        super.OooO00o(z);
        this.f17128OooO00o.setTitleOptional(z);
    }

    @Override // com.p118pd.sdk.AbstractC5951OooOo00, com.p118pd.sdk.AbstractC5951OooOo00, com.p118pd.sdk.AbstractC5951OooOo00
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public boolean m16757OooO0O0() {
        return this.f17128OooO00o.OooO0oO();
    }

    @Override // com.p118pd.sdk.AbstractC5951OooOo00, com.p118pd.sdk.AbstractC5951OooOo00, com.p118pd.sdk.AbstractC5951OooOo00
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public void m16756OooO0O0() {
        this.f17129OooO00o.OooO0O0(this, this.f17130OooO00o);
    }

    @Override // com.p118pd.sdk.AbstractC5951OooOo00
    public void OooO00o(View view) {
        this.f17128OooO00o.setCustomView(view);
        this.f17131OooO00o = view != null ? new WeakReference<>(view) : null;
    }

    @Override // com.p118pd.sdk.AbstractC5951OooOo00, com.p118pd.sdk.AbstractC5951OooOo00, com.p118pd.sdk.AbstractC5951OooOo00
    public CharSequence OooO0O0() {
        return this.f17128OooO00o.getTitle();
    }

    @Override // com.p118pd.sdk.AbstractC5951OooOo00, com.p118pd.sdk.AbstractC5951OooOo00, com.p118pd.sdk.AbstractC5951OooOo00, com.p118pd.sdk.AbstractC5951OooOo00, com.p118pd.sdk.AbstractC5951OooOo00, com.p118pd.sdk.AbstractC5951OooOo00, com.p118pd.sdk.AbstractC5951OooOo00
    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m16754OooO00o() {
        if (!this.OooO0OO) {
            this.OooO0OO = true;
            this.f17128OooO00o.sendAccessibilityEvent(32);
            this.f17129OooO00o.OooO00o(this);
        }
    }

    @Override // com.p118pd.sdk.AbstractC5951OooOo00, com.p118pd.sdk.AbstractC5951OooOo00, com.p118pd.sdk.AbstractC5951OooOo00, com.p118pd.sdk.AbstractC5951OooOo00, com.p118pd.sdk.AbstractC5951OooOo00, com.p118pd.sdk.AbstractC5951OooOo00, com.p118pd.sdk.AbstractC5951OooOo00
    public Menu OooO00o() {
        return this.f17130OooO00o;
    }

    @Override // com.p118pd.sdk.AbstractC5951OooOo00, com.p118pd.sdk.AbstractC5951OooOo00, com.p118pd.sdk.AbstractC5951OooOo00, com.p118pd.sdk.AbstractC5951OooOo00, com.p118pd.sdk.AbstractC5951OooOo00, com.p118pd.sdk.AbstractC5951OooOo00, com.p118pd.sdk.AbstractC5951OooOo00
    /* renamed from: OooO00o  reason: collision with other method in class */
    public CharSequence m16753OooO00o() {
        return this.f17128OooO00o.getSubtitle();
    }

    @Override // com.p118pd.sdk.AbstractC5951OooOo00, com.p118pd.sdk.AbstractC5951OooOo00, com.p118pd.sdk.AbstractC5951OooOo00, com.p118pd.sdk.AbstractC5951OooOo00, com.p118pd.sdk.AbstractC5951OooOo00, com.p118pd.sdk.AbstractC5951OooOo00, com.p118pd.sdk.AbstractC5951OooOo00
    /* renamed from: OooO00o  reason: collision with other method in class */
    public View m16752OooO00o() {
        WeakReference<View> weakReference = this.f17131OooO00o;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    @Override // com.p118pd.sdk.AbstractC5951OooOo00, com.p118pd.sdk.AbstractC5951OooOo00, com.p118pd.sdk.AbstractC5951OooOo00, com.p118pd.sdk.AbstractC5951OooOo00, com.p118pd.sdk.AbstractC5951OooOo00, com.p118pd.sdk.AbstractC5951OooOo00, com.p118pd.sdk.AbstractC5951OooOo00
    /* renamed from: OooO00o  reason: collision with other method in class */
    public MenuInflater m16751OooO00o() {
        return new C5955OooOoO0(this.f17128OooO00o.getContext());
    }

    @Override // com.p118pd.sdk.C5965Oooo00o.OooO00o
    public boolean OooO00o(C5965Oooo00o oooo00o, MenuItem menuItem) {
        return this.f17129OooO00o.OooO00o(this, menuItem);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m16755OooO00o(SubMenuC7026o000oOoO o000oooo) {
        if (!o000oooo.hasVisibleItems()) {
            return true;
        }
        new C5973Oooo0oo(this.f17128OooO00o.getContext(), o000oooo).m16806OooO0O0();
        return true;
    }

    @Override // com.p118pd.sdk.C5965Oooo00o.OooO00o
    public void OooO00o(C5965Oooo00o oooo00o) {
        m16756OooO0O0();
        this.f17128OooO00o.OooO0o();
    }
}

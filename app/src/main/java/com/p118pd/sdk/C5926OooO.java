package com.p118pd.sdk;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.SpinnerAdapter;
import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.ViewCompat;
import com.p118pd.sdk.AbstractC5961Oooo;
import com.p118pd.sdk.C5965Oooo00o;
import java.util.ArrayList;

/* renamed from: com.pd.sdk.OooO  reason: case insensitive filesystem */
public class C5926OooO extends ActionBar {
    public Window.Callback OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final Toolbar.OooO0o f17005OooO00o = new OooO0O0();

    /* renamed from: OooO00o  reason: collision with other field name */
    public AbstractC7472o0Oo0oo f17006OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final Runnable f17007OooO00o = new OooO00o();

    /* renamed from: OooO00o  reason: collision with other field name */
    public ArrayList<ActionBar.OooO0O0> f17008OooO00o = new ArrayList<>();

    /* renamed from: OooO00o  reason: collision with other field name */
    public boolean f17009OooO00o;
    public boolean OooO0O0;
    public boolean OooO0OO;

    /* renamed from: com.pd.sdk.OooO$OooO00o */
    public class OooO00o implements Runnable {
        public OooO00o() {
        }

        public void run() {
            C5926OooO.this.OooO();
        }
    }

    /* renamed from: com.pd.sdk.OooO$OooO0O0 */
    public class OooO0O0 implements Toolbar.OooO0o {
        public OooO0O0() {
        }

        @Override // androidx.appcompat.widget.Toolbar.OooO0o
        public boolean onMenuItemClick(MenuItem menuItem) {
            return C5926OooO.this.OooO00o.onMenuItemSelected(0, menuItem);
        }
    }

    /* renamed from: com.pd.sdk.OooO$OooO0Oo  reason: case insensitive filesystem */
    public final class C5927OooO0Oo implements C5965Oooo00o.OooO00o {
        public C5927OooO0Oo() {
        }

        @Override // com.p118pd.sdk.C5965Oooo00o.OooO00o
        public void OooO00o(C5965Oooo00o oooo00o) {
            C5926OooO oooO = C5926OooO.this;
            if (oooO.OooO00o == null) {
                return;
            }
            if (oooO.f17006OooO00o.OooO0o()) {
                C5926OooO.this.OooO00o.onPanelClosed(108, oooo00o);
            } else if (C5926OooO.this.OooO00o.onPreparePanel(0, null, oooo00o)) {
                C5926OooO.this.OooO00o.onMenuOpened(108, oooo00o);
            }
        }

        @Override // com.p118pd.sdk.C5965Oooo00o.OooO00o
        public boolean OooO00o(C5965Oooo00o oooo00o, MenuItem menuItem) {
            return false;
        }
    }

    /* renamed from: com.pd.sdk.OooO$OooO0o0  reason: case insensitive filesystem */
    public class C5928OooO0o0 extends Window$CallbackC5956OooOoOO {
        public C5928OooO0o0(Window.Callback callback) {
            super(callback);
        }

        @Override // com.p118pd.sdk.Window$CallbackC5956OooOoOO
        public View onCreatePanelView(int i) {
            if (i == 0) {
                return new View(C5926OooO.this.f17006OooO00o.getContext());
            }
            return super.onCreatePanelView(i);
        }

        @Override // com.p118pd.sdk.Window$CallbackC5956OooOoOO
        public boolean onPreparePanel(int i, View view, Menu menu) {
            boolean onPreparePanel = super.onPreparePanel(i, view, menu);
            if (onPreparePanel) {
                C5926OooO oooO = C5926OooO.this;
                if (!oooO.f17009OooO00o) {
                    oooO.f17006OooO00o.m19096OooO00o();
                    C5926OooO.this.f17009OooO00o = true;
                }
            }
            return onPreparePanel;
        }
    }

    public C5926OooO(Toolbar toolbar, CharSequence charSequence, Window.Callback callback) {
        this.f17006OooO00o = new C6951o0000O0(toolbar, false);
        C5928OooO0o0 oooO0o0 = new C5928OooO0o0(callback);
        this.OooO00o = oooO0o0;
        this.f17006OooO00o.setWindowCallback(oooO0o0);
        toolbar.setOnMenuItemClickListener(this.f17005OooO00o);
        this.f17006OooO00o.setWindowTitle(charSequence);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void OooO(int i) {
        this.f17006OooO00o.setLogo(i);
    }

    @Override // androidx.appcompat.app.ActionBar, androidx.appcompat.app.ActionBar, androidx.appcompat.app.ActionBar, androidx.appcompat.app.ActionBar, androidx.appcompat.app.ActionBar, androidx.appcompat.app.ActionBar, androidx.appcompat.app.ActionBar
    /* renamed from: OooO00o  reason: collision with other method in class */
    public Window.Callback m16644OooO00o() {
        return this.OooO00o;
    }

    @Override // androidx.appcompat.app.ActionBar
    public void OooO0O0(Drawable drawable) {
        this.f17006OooO00o.OooO0OO(drawable);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void OooO0OO(int i) {
        OooO00o(LayoutInflater.from(this.f17006OooO00o.getContext()).inflate(i, this.f17006OooO00o.m19094OooO00o(), false));
    }

    @Override // androidx.appcompat.app.ActionBar
    public void OooO0OO(boolean z) {
    }

    @Override // androidx.appcompat.app.ActionBar, androidx.appcompat.app.ActionBar
    public int OooO0Oo() {
        return 0;
    }

    @Override // androidx.appcompat.app.ActionBar
    public void OooO0Oo(Drawable drawable) {
        this.f17006OooO00o.OooO0O0(drawable);
    }

    @Override // androidx.appcompat.app.ActionBar, androidx.appcompat.app.ActionBar, androidx.appcompat.app.ActionBar
    public int OooO0o() {
        return -1;
    }

    @Override // androidx.appcompat.app.ActionBar
    public void OooO0o(Drawable drawable) {
    }

    @Override // androidx.appcompat.app.ActionBar, androidx.appcompat.app.ActionBar, androidx.appcompat.app.ActionBar
    /* renamed from: OooO0o  reason: collision with other method in class */
    public boolean m16652OooO0o() {
        return super.m14333OooO0o();
    }

    @Override // androidx.appcompat.app.ActionBar, androidx.appcompat.app.ActionBar, androidx.appcompat.app.ActionBar
    public int OooO0o0() {
        return 0;
    }

    @Override // androidx.appcompat.app.ActionBar
    public void OooO0o0(Drawable drawable) {
    }

    @Override // androidx.appcompat.app.ActionBar
    public void OooO0o0(boolean z) {
        OooO00o(z ? 16 : 0, 16);
    }

    @Override // androidx.appcompat.app.ActionBar, androidx.appcompat.app.ActionBar, androidx.appcompat.app.ActionBar
    public int OooO0oO() {
        return 0;
    }

    @Override // androidx.appcompat.app.ActionBar
    public void OooO0oO(int i) {
        this.f17006OooO00o.OooO00o(i);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void OooO0oo(int i) {
        this.f17006OooO00o.setIcon(i);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void OooOO0(int i) {
        if (i != 2) {
            this.f17006OooO00o.OooO0Oo(i);
            return;
        }
        throw new IllegalArgumentException("Tabs not supported in this configuration");
    }

    @Override // androidx.appcompat.app.ActionBar
    public void OooOO0(boolean z) {
    }

    @Override // androidx.appcompat.app.ActionBar
    public void OooOO0O(int i) {
        if (this.f17006OooO00o.OooO0O0() == 1) {
            this.f17006OooO00o.OooO0o0(i);
            return;
        }
        throw new IllegalStateException("setSelectedNavigationIndex not valid for current navigation mode");
    }

    @Override // androidx.appcompat.app.ActionBar
    public void OooOO0O(boolean z) {
    }

    @Override // androidx.appcompat.app.ActionBar
    public void OooOO0o(int i) {
        AbstractC7472o0Oo0oo o0oo0oo = this.f17006OooO00o;
        o0oo0oo.OooO00o(i != 0 ? o0oo0oo.getContext().getText(i) : null);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void OooOOO0(int i) {
        AbstractC7472o0Oo0oo o0oo0oo = this.f17006OooO00o;
        o0oo0oo.setTitle(i != 0 ? o0oo0oo.getContext().getText(i) : null);
    }

    /* renamed from: com.pd.sdk.OooO$OooO0OO */
    public final class OooO0OO implements AbstractC5961Oooo.OooO00o {
        public boolean OooO0O0;

        public OooO0OO() {
        }

        @Override // com.p118pd.sdk.AbstractC5961Oooo.OooO00o
        public boolean OooO00o(C5965Oooo00o oooo00o) {
            Window.Callback callback = C5926OooO.this.OooO00o;
            if (callback == null) {
                return false;
            }
            callback.onMenuOpened(108, oooo00o);
            return true;
        }

        @Override // com.p118pd.sdk.AbstractC5961Oooo.OooO00o
        public void OooO00o(C5965Oooo00o oooo00o, boolean z) {
            if (!this.OooO0O0) {
                this.OooO0O0 = true;
                C5926OooO.this.f17006OooO00o.m19104OooO0o0();
                Window.Callback callback = C5926OooO.this.OooO00o;
                if (callback != null) {
                    callback.onPanelClosed(108, oooo00o);
                }
                this.OooO0O0 = false;
            }
        }
    }

    public void OooO() {
        Menu OooO00o2 = OooO00o();
        C5965Oooo00o oooo00o = OooO00o2 instanceof C5965Oooo00o ? (C5965Oooo00o) OooO00o2 : null;
        if (oooo00o != null) {
            oooo00o.OooO0o0();
        }
        try {
            OooO00o2.clear();
            if (!this.OooO00o.onCreatePanelMenu(0, OooO00o2) || !this.OooO00o.onPreparePanel(0, null, OooO00o2)) {
                OooO00o2.clear();
            }
        } finally {
            if (oooo00o != null) {
                oooo00o.OooO0Oo();
            }
        }
    }

    @Override // androidx.appcompat.app.ActionBar
    public void OooO00o(View view) {
        OooO00o(view, new ActionBar.OooO00o(-2, -2));
    }

    @Override // androidx.appcompat.app.ActionBar
    public void OooO0O0(CharSequence charSequence) {
        this.f17006OooO00o.OooO00o(charSequence);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void OooO0Oo(CharSequence charSequence) {
        this.f17006OooO00o.setWindowTitle(charSequence);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void OooO0o(int i) {
        this.f17006OooO00o.OooO0oo(i);
    }

    @Override // androidx.appcompat.app.ActionBar, androidx.appcompat.app.ActionBar, androidx.appcompat.app.ActionBar
    /* renamed from: OooO0o0  reason: collision with other method in class */
    public void m16653OooO0o0() {
        this.f17006OooO00o.OooO0oO(8);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void OooO0oO(boolean z) {
        OooO00o(z ? 8 : 0, 8);
    }

    @Override // androidx.appcompat.app.ActionBar, androidx.appcompat.app.ActionBar
    /* renamed from: OooO0oo  reason: collision with other method in class */
    public boolean m16657OooO0oo() {
        ViewGroup OooO00o2 = this.f17006OooO00o.m19094OooO00o();
        if (OooO00o2 == null || OooO00o2.hasFocus()) {
            return false;
        }
        OooO00o2.requestFocus();
        return true;
    }

    @Override // androidx.appcompat.app.ActionBar
    public void OooO00o(View view, ActionBar.OooO00o oooO00o) {
        if (view != null) {
            view.setLayoutParams(oooO00o);
        }
        this.f17006OooO00o.OooO00o(view);
    }

    @Override // androidx.appcompat.app.ActionBar, androidx.appcompat.app.ActionBar, androidx.appcompat.app.ActionBar, androidx.appcompat.app.ActionBar
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public CharSequence m16649OooO0O0() {
        return this.f17006OooO00o.getTitle();
    }

    @Override // androidx.appcompat.app.ActionBar
    public void OooO0OO(Drawable drawable) {
        this.f17006OooO00o.setIcon(drawable);
    }

    @Override // androidx.appcompat.app.ActionBar
    @SuppressLint({"WrongConstant"})
    public void OooO0Oo(int i) {
        OooO00o(i, -1);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void OooO0o(boolean z) {
        OooO00o(z ? 2 : 0, 2);
    }

    @Override // androidx.appcompat.app.ActionBar, androidx.appcompat.app.ActionBar, androidx.appcompat.app.ActionBar
    /* renamed from: OooO0o0  reason: collision with other method in class */
    public boolean m16654OooO0o0() {
        return this.f17006OooO00o.OooO00o() == 0;
    }

    @Override // androidx.appcompat.app.ActionBar, androidx.appcompat.app.ActionBar, androidx.appcompat.app.ActionBar
    /* renamed from: OooO0oO  reason: collision with other method in class */
    public void m16655OooO0oO() {
        throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
    }

    @Override // androidx.appcompat.app.ActionBar, androidx.appcompat.app.ActionBar, androidx.appcompat.app.ActionBar, androidx.appcompat.app.ActionBar
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public ActionBar.AbstractC4991OooO0Oo m16648OooO0O0() {
        throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
    }

    @Override // androidx.appcompat.app.ActionBar
    public void OooO0OO(CharSequence charSequence) {
        this.f17006OooO00o.setTitle(charSequence);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void OooO0Oo(boolean z) {
        OooO00o(z ? 4 : 0, 4);
    }

    @Override // androidx.appcompat.app.ActionBar, androidx.appcompat.app.ActionBar, androidx.appcompat.app.ActionBar
    /* renamed from: OooO0o  reason: collision with other method in class */
    public void m16651OooO0o() {
        this.f17006OooO00o.m19094OooO00o().removeCallbacks(this.f17007OooO00o);
    }

    @Override // androidx.appcompat.app.ActionBar, androidx.appcompat.app.ActionBar, androidx.appcompat.app.ActionBar
    /* renamed from: OooO0oO  reason: collision with other method in class */
    public boolean m16656OooO0oO() {
        return this.f17006OooO00o.m19103OooO0Oo();
    }

    @Override // androidx.appcompat.app.ActionBar
    public void OooO00o(float f) {
        ViewCompat.OooO0O0(this.f17006OooO00o.m19094OooO00o(), f);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void OooO0O0(ActionBar.AbstractC4991OooO0Oo oooO0Oo) {
        throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
    }

    @Override // androidx.appcompat.app.ActionBar
    public void OooO0OO(ActionBar.AbstractC4991OooO0Oo oooO0Oo) {
        throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
    }

    @Override // androidx.appcompat.app.ActionBar
    public void OooO0oo(boolean z) {
        OooO00o(z ? 1 : 0, 1);
    }

    @Override // androidx.appcompat.app.ActionBar, androidx.appcompat.app.ActionBar, androidx.appcompat.app.ActionBar, androidx.appcompat.app.ActionBar, androidx.appcompat.app.ActionBar, androidx.appcompat.app.ActionBar, androidx.appcompat.app.ActionBar
    /* renamed from: OooO00o  reason: collision with other method in class */
    public float m16640OooO00o() {
        return ViewCompat.OooO0O0((View) this.f17006OooO00o.m19094OooO00o());
    }

    @Override // androidx.appcompat.app.ActionBar
    public void OooO0O0(int i) {
        throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
    }

    @Override // androidx.appcompat.app.ActionBar, androidx.appcompat.app.ActionBar
    public boolean OooO0OO() {
        this.f17006OooO00o.m19094OooO00o().removeCallbacks(this.f17007OooO00o);
        ViewCompat.OooO00o(this.f17006OooO00o.m19094OooO00o(), this.f17007OooO00o);
        return true;
    }

    @Override // androidx.appcompat.app.ActionBar, androidx.appcompat.app.ActionBar
    public void OooO0oo() {
        this.f17006OooO00o.OooO0oO(0);
    }

    @Override // androidx.appcompat.app.ActionBar, androidx.appcompat.app.ActionBar, androidx.appcompat.app.ActionBar, androidx.appcompat.app.ActionBar, androidx.appcompat.app.ActionBar, androidx.appcompat.app.ActionBar, androidx.appcompat.app.ActionBar
    /* renamed from: OooO00o  reason: collision with other method in class */
    public Context m16642OooO00o() {
        return this.f17006OooO00o.getContext();
    }

    @Override // androidx.appcompat.app.ActionBar, androidx.appcompat.app.ActionBar, androidx.appcompat.app.ActionBar, androidx.appcompat.app.ActionBar
    public int OooO0O0() {
        return this.f17006OooO00o.getHeight();
    }

    @Override // androidx.appcompat.app.ActionBar
    public void OooO00o(CharSequence charSequence) {
        this.f17006OooO00o.OooO0O0(charSequence);
    }

    @Override // androidx.appcompat.app.ActionBar, androidx.appcompat.app.ActionBar, androidx.appcompat.app.ActionBar, androidx.appcompat.app.ActionBar
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public boolean m16650OooO0O0() {
        if (!this.f17006OooO00o.OooO()) {
            return false;
        }
        this.f17006OooO00o.m19098OooO0O0();
        return true;
    }

    @Override // androidx.appcompat.app.ActionBar
    public void OooO00o(Configuration configuration) {
        super.OooO00o(configuration);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void OooO00o(SpinnerAdapter spinnerAdapter, ActionBar.OooO0OO oooO0OO) {
        this.f17006OooO00o.OooO00o(spinnerAdapter, new C5935OooO0oO(oooO0OO));
    }

    @Override // androidx.appcompat.app.ActionBar
    public void OooO0O0(ActionBar.OooO0O0 oooO0O0) {
        this.f17008OooO00o.remove(oooO0O0);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void OooO00o(int i, int i2) {
        this.f17006OooO00o.OooO0OO((i & i2) | ((i2 ^ -1) & this.f17006OooO00o.OooO0OO()));
    }

    @Override // androidx.appcompat.app.ActionBar
    public void OooO0O0(boolean z) {
        if (z != this.OooO0OO) {
            this.OooO0OO = z;
            int size = this.f17008OooO00o.size();
            for (int i = 0; i < size; i++) {
                this.f17008OooO00o.get(i).OooO00o(z);
            }
        }
    }

    @Override // androidx.appcompat.app.ActionBar
    public void OooO00o(@Nullable Drawable drawable) {
        this.f17006OooO00o.OooO0Oo(drawable);
    }

    @Override // androidx.appcompat.app.ActionBar, androidx.appcompat.app.ActionBar, androidx.appcompat.app.ActionBar, androidx.appcompat.app.ActionBar, androidx.appcompat.app.ActionBar, androidx.appcompat.app.ActionBar, androidx.appcompat.app.ActionBar
    /* renamed from: OooO00o  reason: collision with other method in class */
    public View m16643OooO00o() {
        return this.f17006OooO00o.m19093OooO00o();
    }

    @Override // androidx.appcompat.app.ActionBar, androidx.appcompat.app.ActionBar, androidx.appcompat.app.ActionBar, androidx.appcompat.app.ActionBar, androidx.appcompat.app.ActionBar, androidx.appcompat.app.ActionBar, androidx.appcompat.app.ActionBar
    /* renamed from: OooO00o  reason: collision with other method in class */
    public CharSequence m16646OooO00o() {
        return this.f17006OooO00o.m19095OooO00o();
    }

    @Override // androidx.appcompat.app.ActionBar, androidx.appcompat.app.ActionBar, androidx.appcompat.app.ActionBar, androidx.appcompat.app.ActionBar, androidx.appcompat.app.ActionBar, androidx.appcompat.app.ActionBar, androidx.appcompat.app.ActionBar
    /* renamed from: OooO00o  reason: collision with other method in class */
    public int m16641OooO00o() {
        return this.f17006OooO00o.OooO0OO();
    }

    @Override // androidx.appcompat.app.ActionBar
    public void OooO00o(ActionBar.AbstractC4991OooO0Oo oooO0Oo) {
        throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
    }

    @Override // androidx.appcompat.app.ActionBar
    public void OooO00o(ActionBar.AbstractC4991OooO0Oo oooO0Oo, boolean z) {
        throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
    }

    @Override // androidx.appcompat.app.ActionBar
    public void OooO00o(ActionBar.AbstractC4991OooO0Oo oooO0Oo, int i) {
        throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
    }

    @Override // androidx.appcompat.app.ActionBar
    public void OooO00o(ActionBar.AbstractC4991OooO0Oo oooO0Oo, int i, boolean z) {
        throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
    }

    @Override // androidx.appcompat.app.ActionBar, androidx.appcompat.app.ActionBar, androidx.appcompat.app.ActionBar, androidx.appcompat.app.ActionBar, androidx.appcompat.app.ActionBar, androidx.appcompat.app.ActionBar, androidx.appcompat.app.ActionBar
    /* renamed from: OooO00o  reason: collision with other method in class */
    public ActionBar.AbstractC4991OooO0Oo m16645OooO00o() {
        throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
    }

    @Override // androidx.appcompat.app.ActionBar
    public ActionBar.AbstractC4991OooO0Oo OooO00o(int i) {
        throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
    }

    @Override // androidx.appcompat.app.ActionBar, androidx.appcompat.app.ActionBar, androidx.appcompat.app.ActionBar, androidx.appcompat.app.ActionBar, androidx.appcompat.app.ActionBar, androidx.appcompat.app.ActionBar, androidx.appcompat.app.ActionBar
    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m16647OooO00o() {
        return this.f17006OooO00o.OooO0oO();
    }

    @Override // androidx.appcompat.app.ActionBar
    public boolean OooO00o(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1) {
            m16656OooO0oO();
        }
        return true;
    }

    @Override // androidx.appcompat.app.ActionBar
    public boolean OooO00o(int i, KeyEvent keyEvent) {
        Menu OooO00o2 = OooO00o();
        if (OooO00o2 == null) {
            return false;
        }
        boolean z = true;
        if (KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() == 1) {
            z = false;
        }
        OooO00o2.setQwertyMode(z);
        return OooO00o2.performShortcut(i, keyEvent, 0);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void OooO00o(ActionBar.OooO0O0 oooO0O0) {
        this.f17008OooO00o.add(oooO0O0);
    }

    @Override // androidx.appcompat.app.ActionBar, androidx.appcompat.app.ActionBar, androidx.appcompat.app.ActionBar, androidx.appcompat.app.ActionBar, androidx.appcompat.app.ActionBar, androidx.appcompat.app.ActionBar, androidx.appcompat.app.ActionBar
    private Menu OooO00o() {
        if (!this.OooO0O0) {
            this.f17006OooO00o.OooO00o(new OooO0OO(), new C5927OooO0Oo());
            this.OooO0O0 = true;
        }
        return this.f17006OooO00o.m19092OooO00o();
    }
}

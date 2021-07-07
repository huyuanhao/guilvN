package com.p118pd.sdk;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.view.LayoutInflater;
import androidx.annotation.StyleRes;
import androidx.appcompat.C0033R;

/* renamed from: com.pd.sdk.OooOo0O  reason: case insensitive filesystem */
public class C5952OooOo0O extends ContextWrapper {
    public int OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Configuration f17124OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Resources.Theme f17125OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Resources f17126OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public LayoutInflater f17127OooO00o;

    public C5952OooOo0O() {
        super(null);
    }

    public void OooO00o(Configuration configuration) {
        if (this.f17126OooO00o != null) {
            throw new IllegalStateException("getResources() or getAssets() has already been called");
        } else if (this.f17124OooO00o == null) {
            this.f17124OooO00o = new Configuration(configuration);
        } else {
            throw new IllegalStateException("Override configuration has already been set");
        }
    }

    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    public AssetManager getAssets() {
        return getResources().getAssets();
    }

    public Resources getResources() {
        return OooO00o();
    }

    @Override // android.content.Context, android.content.ContextWrapper
    public Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        if (this.f17127OooO00o == null) {
            this.f17127OooO00o = LayoutInflater.from(getBaseContext()).cloneInContext(this);
        }
        return this.f17127OooO00o;
    }

    public Resources.Theme getTheme() {
        Resources.Theme theme = this.f17125OooO00o;
        if (theme != null) {
            return theme;
        }
        if (this.OooO00o == 0) {
            this.OooO00o = C0033R.style.Theme_AppCompat_Light;
        }
        m16749OooO00o();
        return this.f17125OooO00o;
    }

    public void setTheme(int i) {
        if (this.OooO00o != i) {
            this.OooO00o = i;
            m16749OooO00o();
        }
    }

    public C5952OooOo0O(Context context, @StyleRes int i) {
        super(context);
        this.OooO00o = i;
    }

    public C5952OooOo0O(Context context, Resources.Theme theme) {
        super(context);
        this.f17125OooO00o = theme;
    }

    private Resources OooO00o() {
        if (this.f17126OooO00o == null) {
            Configuration configuration = this.f17124OooO00o;
            if (configuration == null) {
                this.f17126OooO00o = super.getResources();
            } else if (Build.VERSION.SDK_INT >= 17) {
                this.f17126OooO00o = createConfigurationContext(configuration).getResources();
            }
        }
        return this.f17126OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public int m16750OooO00o() {
        return this.OooO00o;
    }

    public void OooO00o(Resources.Theme theme, int i, boolean z) {
        theme.applyStyle(i, true);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    private void m16749OooO00o() {
        boolean z = this.f17125OooO00o == null;
        if (z) {
            this.f17125OooO00o = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f17125OooO00o.setTo(theme);
            }
        }
        OooO00o(this.f17125OooO00o, this.OooO00o, z);
    }
}

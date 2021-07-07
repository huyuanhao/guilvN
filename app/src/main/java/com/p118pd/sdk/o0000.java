package com.p118pd.sdk;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: com.pd.sdk.o0000 */
public class o0000 extends ContextWrapper {
    public static final Object OooO00o = new Object();

    /* renamed from: OooO00o  reason: collision with other field name */
    public static ArrayList<WeakReference<o0000>> f19063OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final Resources.Theme f19064OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final Resources f19065OooO00o;

    public o0000(@NonNull Context context) {
        super(context);
        if (C6955o0000OO0.OooO0O0()) {
            C6955o0000OO0 o0000oo0 = new C6955o0000OO0(this, context.getResources());
            this.f19065OooO00o = o0000oo0;
            Resources.Theme newTheme = o0000oo0.newTheme();
            this.f19064OooO00o = newTheme;
            newTheme.setTo(context.getTheme());
            return;
        }
        this.f19065OooO00o = new C6974o0000oo(this, context.getResources());
        this.f19064OooO00o = null;
    }

    public static Context OooO00o(@NonNull Context context) {
        if (!m18090OooO00o(context)) {
            return context;
        }
        synchronized (OooO00o) {
            if (f19063OooO00o == null) {
                f19063OooO00o = new ArrayList<>();
            } else {
                for (int size = f19063OooO00o.size() - 1; size >= 0; size--) {
                    WeakReference<o0000> weakReference = f19063OooO00o.get(size);
                    if (weakReference == null || weakReference.get() == null) {
                        f19063OooO00o.remove(size);
                    }
                }
                for (int size2 = f19063OooO00o.size() - 1; size2 >= 0; size2--) {
                    WeakReference<o0000> weakReference2 = f19063OooO00o.get(size2);
                    o0000 o0000 = weakReference2 != null ? weakReference2.get() : null;
                    if (o0000 != null && o0000.getBaseContext() == context) {
                        return o0000;
                    }
                }
            }
            o0000 o00002 = new o0000(context);
            f19063OooO00o.add(new WeakReference<>(o00002));
            return o00002;
        }
    }

    public AssetManager getAssets() {
        return this.f19065OooO00o.getAssets();
    }

    public Resources getResources() {
        return this.f19065OooO00o;
    }

    public Resources.Theme getTheme() {
        Resources.Theme theme = this.f19064OooO00o;
        return theme == null ? super.getTheme() : theme;
    }

    public void setTheme(int i) {
        Resources.Theme theme = this.f19064OooO00o;
        if (theme == null) {
            super.setTheme(i);
        } else {
            theme.applyStyle(i, true);
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static boolean m18090OooO00o(@NonNull Context context) {
        if ((context instanceof o0000) || (context.getResources() instanceof C6974o0000oo) || (context.getResources() instanceof C6955o0000OO0)) {
            return false;
        }
        if (Build.VERSION.SDK_INT < 21 || C6955o0000OO0.OooO0O0()) {
            return true;
        }
        return false;
    }
}

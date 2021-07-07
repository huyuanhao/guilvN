package com.p118pd.sdk;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import androidx.annotation.NonNull;
import java.lang.reflect.Field;

/* renamed from: com.pd.sdk.o00OOO  reason: case insensitive filesystem */
public final class C7091o00OOO {
    public static final String OooO00o = "LayoutInflaterCompatHC";

    /* renamed from: OooO00o  reason: collision with other field name */
    public static Field f19419OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public static boolean f19420OooO00o;

    /* renamed from: com.pd.sdk.o00OOO$OooO00o */
    public static class OooO00o implements LayoutInflater.Factory2 {
        public final AbstractC7096o00OOOO0 OooO00o;

        public OooO00o(AbstractC7096o00OOOO0 o00oooo0) {
            this.OooO00o = o00oooo0;
        }

        public View onCreateView(String str, Context context, AttributeSet attributeSet) {
            return this.OooO00o.onCreateView(null, str, context, attributeSet);
        }

        public String toString() {
            return OooO00o.class.getName() + "{" + this.OooO00o + C7522o0Ooo0o.OooO0Oo;
        }

        public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
            return this.OooO00o.onCreateView(view, str, context, attributeSet);
        }
    }

    public static void OooO00o(LayoutInflater layoutInflater, LayoutInflater.Factory2 factory2) {
        if (!f19420OooO00o) {
            try {
                Field declaredField = LayoutInflater.class.getDeclaredField("mFactory2");
                f19419OooO00o = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
                String str = "forceSetFactory2 Could not find field 'mFactory2' on class " + LayoutInflater.class.getName() + "; inflation may have unexpected results.";
            }
            f19420OooO00o = true;
        }
        Field field = f19419OooO00o;
        if (field != null) {
            try {
                field.set(layoutInflater, factory2);
            } catch (IllegalAccessException unused2) {
                String str2 = "forceSetFactory2 could not set the Factory2 on LayoutInflater " + layoutInflater + "; inflation may have unexpected results.";
            }
        }
    }

    public static void OooO0O0(@NonNull LayoutInflater layoutInflater, @NonNull LayoutInflater.Factory2 factory2) {
        layoutInflater.setFactory2(factory2);
        if (Build.VERSION.SDK_INT < 21) {
            LayoutInflater.Factory factory = layoutInflater.getFactory();
            if (factory instanceof LayoutInflater.Factory2) {
                OooO00o(layoutInflater, (LayoutInflater.Factory2) factory);
            } else {
                OooO00o(layoutInflater, factory2);
            }
        }
    }

    @Deprecated
    public static void OooO00o(@NonNull LayoutInflater layoutInflater, @NonNull AbstractC7096o00OOOO0 o00oooo0) {
        OooO00o oooO00o = null;
        if (Build.VERSION.SDK_INT >= 21) {
            if (o00oooo0 != null) {
                oooO00o = new OooO00o(o00oooo0);
            }
            layoutInflater.setFactory2(oooO00o);
            return;
        }
        if (o00oooo0 != null) {
            oooO00o = new OooO00o(o00oooo0);
        }
        layoutInflater.setFactory2(oooO00o);
        LayoutInflater.Factory factory = layoutInflater.getFactory();
        if (factory instanceof LayoutInflater.Factory2) {
            OooO00o(layoutInflater, (LayoutInflater.Factory2) factory);
        } else {
            OooO00o(layoutInflater, oooO00o);
        }
    }

    @Deprecated
    public static AbstractC7096o00OOOO0 OooO00o(LayoutInflater layoutInflater) {
        LayoutInflater.Factory factory = layoutInflater.getFactory();
        if (factory instanceof OooO00o) {
            return ((OooO00o) factory).OooO00o;
        }
        return null;
    }
}

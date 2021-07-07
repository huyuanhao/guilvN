package com.p118pd.sdk;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

@Deprecated
/* renamed from: com.pd.sdk.oO00o0  reason: case insensitive filesystem */
public final class C7813oO00o0 {
    public static final String OooO00o = "ManifestParser";
    public static final String OooO0O0 = "GlideModule";

    /* renamed from: OooO00o  reason: collision with other field name */
    public final Context f20860OooO00o;

    public C7813oO00o0(Context context) {
        this.f20860OooO00o = context;
    }

    public List<AbstractC7816oO00o00o> OooO00o() {
        Log.isLoggable(OooO00o, 3);
        ArrayList arrayList = new ArrayList();
        try {
            ApplicationInfo applicationInfo = this.f20860OooO00o.getPackageManager().getApplicationInfo(this.f20860OooO00o.getPackageName(), 128);
            if (applicationInfo.metaData == null) {
                Log.isLoggable(OooO00o, 3);
                return arrayList;
            }
            if (Log.isLoggable(OooO00o, 2)) {
                String str = "Got app info metadata: " + applicationInfo.metaData;
            }
            for (String str2 : applicationInfo.metaData.keySet()) {
                if (OooO0O0.equals(applicationInfo.metaData.get(str2))) {
                    arrayList.add(OooO00o(str2));
                    if (Log.isLoggable(OooO00o, 3)) {
                        String str3 = "Loaded Glide module: " + str2;
                    }
                }
            }
            Log.isLoggable(OooO00o, 3);
            return arrayList;
        } catch (PackageManager.NameNotFoundException e) {
            throw new RuntimeException("Unable to find metadata to parse GlideModules", e);
        }
    }

    public static AbstractC7816oO00o00o OooO00o(String str) {
        try {
            Class<?> cls = Class.forName(str);
            Object obj = null;
            try {
                obj = cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            } catch (InstantiationException e) {
                OooO00o(cls, e);
            } catch (IllegalAccessException e2) {
                OooO00o(cls, e2);
            } catch (NoSuchMethodException e3) {
                OooO00o(cls, e3);
            } catch (InvocationTargetException e4) {
                OooO00o(cls, e4);
            }
            if (obj instanceof AbstractC7816oO00o00o) {
                return (AbstractC7816oO00o00o) obj;
            }
            throw new RuntimeException("Expected instanceof GlideModule, but found: " + obj);
        } catch (ClassNotFoundException e5) {
            throw new IllegalArgumentException("Unable to find GlideModule implementation", e5);
        }
    }

    public static void OooO00o(Class<?> cls, Exception exc) {
        throw new RuntimeException("Unable to instantiate GlideModule implementation for " + cls, exc);
    }
}

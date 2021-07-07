package com.p118pd.sdk;

import android.app.Activity;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.ContentProvider;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.ComponentInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ServiceInfo;

/* renamed from: com.pd.sdk.ooO0oO0o  reason: case insensitive filesystem */
public class C8872ooO0oO0o {

    /* renamed from: com.pd.sdk.ooO0oO0o$OooO0O0 */
    public static class OooO0O0 {
        public String OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public boolean f22081OooO00o;
        public String OooO0O0;

        /* renamed from: OooO0O0  reason: collision with other field name */
        public boolean f22082OooO0O0;
        public String OooO0OO;

        /* renamed from: OooO0OO  reason: collision with other field name */
        public boolean f22083OooO0OO;

        public String OooO0O0() {
            return this.OooO00o;
        }

        public String OooO0OO() {
            return this.OooO0O0;
        }

        public OooO0O0() {
            this.f22081OooO00o = false;
        }

        /* renamed from: OooO0O0  reason: collision with other method in class */
        public boolean m20518OooO0O0() {
            return this.f22082OooO0O0;
        }

        /* renamed from: OooO0OO  reason: collision with other method in class */
        public boolean m20519OooO0OO() {
            return this.f22083OooO0OO;
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        private void OooO00o(ComponentInfo componentInfo) {
            if (componentInfo == null) {
                this.f22081OooO00o = false;
                return;
            }
            this.f22081OooO00o = true;
            this.f22082OooO0O0 = componentInfo.enabled;
            this.f22083OooO0OO = componentInfo.exported;
            this.OooO0O0 = componentInfo.processName;
            if (componentInfo instanceof ServiceInfo) {
                this.OooO00o = ((ServiceInfo) componentInfo).permission;
            } else if (componentInfo instanceof ActivityInfo) {
                this.OooO00o = ((ActivityInfo) componentInfo).permission;
            } else if (componentInfo instanceof ProviderInfo) {
                this.OooO0OO = ((ProviderInfo) componentInfo).authority;
            }
        }

        public String OooO00o() {
            return this.OooO0OO;
        }

        /* renamed from: OooO00o  reason: collision with other method in class */
        public boolean m20517OooO00o() {
            return this.f22081OooO00o;
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static boolean m20516OooO00o(Context context, Class cls) {
        return OooO00o(context, cls).f22081OooO00o;
    }

    public static OooO0O0 OooO00o(Context context, Class cls) {
        ComponentInfo componentInfo = null;
        OooO0O0 oooO0O0 = new OooO0O0();
        if (cls == null) {
            return oooO0O0;
        }
        PackageManager packageManager = context.getPackageManager();
        ComponentName componentName = new ComponentName(context.getPackageName(), cls.getName());
        try {
            if (Service.class.isAssignableFrom(cls)) {
                componentInfo = packageManager.getServiceInfo(componentName, 1152);
            } else if (BroadcastReceiver.class.isAssignableFrom(cls)) {
                componentInfo = packageManager.getReceiverInfo(componentName, 1152);
            } else if (Activity.class.isAssignableFrom(cls)) {
                componentInfo = packageManager.getActivityInfo(componentName, 1152);
            } else if (ContentProvider.class.isAssignableFrom(cls)) {
                componentInfo = packageManager.getProviderInfo(componentName, 1152);
            }
            oooO0O0.OooO00o((OooO0O0) componentInfo);
        } catch (PackageManager.NameNotFoundException unused) {
            oooO0O0.f22081OooO00o = false;
        }
        return oooO0O0;
    }
}

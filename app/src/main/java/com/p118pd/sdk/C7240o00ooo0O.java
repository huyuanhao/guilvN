package com.p118pd.sdk;

import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.PackageManager;
import android.provider.Settings;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.p118pd.sdk.C7236o00ooOoo;
import com.xiaomi.mipush.sdk.Constants;

/* renamed from: com.pd.sdk.o00ooo0O  reason: case insensitive filesystem */
public class C7240o00ooo0O implements C7236o00ooOoo.OooO00o {
    public static final String OooO00o = "MediaSessionManager";

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final boolean f19769OooO00o = C7236o00ooOoo.f19766OooO00o;
    public static final String OooO0O0 = "android.permission.STATUS_BAR_SERVICE";
    public static final String OooO0OO = "android.permission.MEDIA_CONTENT_CONTROL";
    public static final String OooO0Oo = "enabled_notification_listeners";

    /* renamed from: OooO00o  reason: collision with other field name */
    public ContentResolver f19770OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Context f19771OooO00o;

    /* renamed from: com.pd.sdk.o00ooo0O$OooO00o */
    public static class OooO00o implements C7236o00ooOoo.OooO0OO {
        public int OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public String f19772OooO00o;
        public int OooO0O0;

        public OooO00o(String str, int i, int i2) {
            this.f19772OooO00o = str;
            this.OooO00o = i;
            this.OooO0O0 = i2;
        }

        @Override // com.p118pd.sdk.C7236o00ooOoo.OooO0OO
        public int OooO00o() {
            return this.OooO0O0;
        }

        @Override // com.p118pd.sdk.C7236o00ooOoo.OooO0OO
        public int OooO0O0() {
            return this.OooO00o;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OooO00o)) {
                return false;
            }
            OooO00o oooO00o = (OooO00o) obj;
            if (TextUtils.equals(this.f19772OooO00o, oooO00o.f19772OooO00o) && this.OooO00o == oooO00o.OooO00o && this.OooO0O0 == oooO00o.OooO0O0) {
                return true;
            }
            return false;
        }

        @Override // com.p118pd.sdk.C7236o00ooOoo.OooO0OO
        public String getPackageName() {
            return this.f19772OooO00o;
        }

        public int hashCode() {
            return C7080o00OO0.OooO00o(this.f19772OooO00o, Integer.valueOf(this.OooO00o), Integer.valueOf(this.OooO0O0));
        }
    }

    public C7240o00ooo0O(Context context) {
        this.f19771OooO00o = context;
        this.f19770OooO00o = context.getContentResolver();
    }

    @Override // com.p118pd.sdk.C7236o00ooOoo.OooO00o
    public boolean OooO00o(@NonNull C7236o00ooOoo.OooO0OO oooO0OO) {
        try {
            if (this.f19771OooO00o.getPackageManager().getApplicationInfo(oooO0OO.getPackageName(), 0).uid != oooO0OO.OooO00o()) {
                if (f19769OooO00o) {
                    String str = "Package name " + oooO0OO.getPackageName() + " doesn't match with the uid " + oooO0OO.OooO00o();
                }
                return false;
            } else if (OooO00o(oooO0OO, OooO0O0) || OooO00o(oooO0OO, OooO0OO) || oooO0OO.OooO00o() == 1000 || OooO0O0(oooO0OO)) {
                return true;
            } else {
                return false;
            }
        } catch (PackageManager.NameNotFoundException unused) {
            if (f19769OooO00o) {
                String str2 = "Package " + oooO0OO.getPackageName() + " doesn't exist";
            }
            return false;
        }
    }

    public boolean OooO0O0(@NonNull C7236o00ooOoo.OooO0OO oooO0OO) {
        String[] split;
        String string = Settings.Secure.getString(this.f19770OooO00o, "enabled_notification_listeners");
        if (string != null) {
            for (String str : string.split(Constants.COLON_SEPARATOR)) {
                ComponentName unflattenFromString = ComponentName.unflattenFromString(str);
                if (unflattenFromString != null && unflattenFromString.getPackageName().equals(oooO0OO.getPackageName())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.p118pd.sdk.C7236o00ooOoo.OooO00o
    public Context getContext() {
        return this.f19771OooO00o;
    }

    private boolean OooO00o(C7236o00ooOoo.OooO0OO oooO0OO, String str) {
        if (oooO0OO.OooO0O0() < 0) {
            if (this.f19771OooO00o.getPackageManager().checkPermission(str, oooO0OO.getPackageName()) == 0) {
                return true;
            }
            return false;
        } else if (this.f19771OooO00o.checkPermission(str, oooO0OO.OooO0O0(), oooO0OO.OooO00o()) == 0) {
            return true;
        } else {
            return false;
        }
    }
}

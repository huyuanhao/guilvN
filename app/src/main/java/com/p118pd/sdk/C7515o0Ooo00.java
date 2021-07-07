package com.p118pd.sdk;

import android.content.Context;
import com.p254ta.utdid2.device.UTDevice;
import java.io.File;

/* renamed from: com.pd.sdk.o0Ooo00  reason: case insensitive filesystem */
public class C7515o0Ooo00 {
    public static C7515o0Ooo00 OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Context f20360OooO00o;

    public static C7515o0Ooo00 OooO00o() {
        if (OooO00o == null) {
            OooO00o = new C7515o0Ooo00();
        }
        return OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public Context m19156OooO00o() {
        return this.f20360OooO00o;
    }

    public void OooO00o(Context context, C7476o0OoO o0ooo) {
        this.f20360OooO00o = context.getApplicationContext();
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C7476o0OoO m19157OooO00o() {
        return C7476o0OoO.OooO00o();
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static boolean m19155OooO00o() {
        String[] strArr = {"/system/app/Superuser.apk", "/sbin/su", "/system/bin/su", "/system/xbin/su", "/data/local/xbin/su", "/data/local/bin/su", "/system/sd/xbin/su", "/system/bin/failsafe/su", "/data/local/su", "/su/bin/su"};
        for (int i = 0; i < 10; i++) {
            if (new File(strArr[i]).exists()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public String m19158OooO00o() {
        try {
            return UTDevice.getUtdid(this.f20360OooO00o);
        } catch (Throwable th) {
            C7620o0oOOOoo.m19257OooO00o(th);
            C7477o0OoO0.OooO00o(C7482o0OoO0OO.OooOOOO, C7482o0OoO0OO.OooOo0, th);
            return "";
        }
    }
}

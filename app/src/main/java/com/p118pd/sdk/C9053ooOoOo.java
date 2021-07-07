package com.p118pd.sdk;

import com.xiaomi.mipush.sdk.Constants;
import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: com.pd.sdk.ooOoOo  reason: case insensitive filesystem */
public final class C9053ooOoOo {
    public static final String OooO00o = "su";

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final String[] f22357OooO00o = {"com.noshufou.android.su", "com.noshufou.android.su.elite", "eu.chainfire.supersu", "com.koushikdutta.superuser", "com.thirdparty.superuser", "com.yellowes.su", "com.topjohnwu.magisk", "com.kingroot.kinguser", "com.kingo.root", "com.smedialink.oneclickroot", "com.zhiqupk.root.global", "com.alephzain.framaroot"};
    public static final String OooO0O0 = "busybox";

    /* renamed from: OooO0O0  reason: collision with other field name */
    public static final String[] f22358OooO0O0 = {"com.koushikdutta.rommanager", "com.koushikdutta.rommanager.license", "com.dimonvideo.luckypatcher", "com.chelpus.lackypatch", "com.ramdroid.appquarantine", "com.ramdroid.appquarantinepro", "com.android.vending.billing.InAppBillingService.COIN", "com.chelpus.luckypatcher"};
    public static final String[] OooO0OO = {"com.devadvance.rootcloak", "com.devadvance.rootcloakplus", "de.robv.android.xposed.installer", "com.saurik.substrate", "com.zachspong.temprootremovejb", "com.amphoras.hidemyroot", "com.amphoras.hidemyrootadfree", "com.formyhm.hiderootPremium", "com.formyhm.hideroot"};
    public static final String[] OooO0Oo = {"/data/local/", "/data/local/bin/", "/data/local/xbin/", "/sbin/", "/su/bin/", "/system/bin/", "/system/bin/.ext/", "/system/bin/failsafe/", "/system/sd/xbin/", "/system/usr/we-need-root/", "/system/xbin/", "/cache/", "/data/", "/dev/"};
    public static final String[] OooO0o0 = {"/system", "/system/bin", "/system/sbin", "/system/xbin", "/vendor/bin", "/sbin", "/etc"};

    public C9053ooOoOo() throws InstantiationException {
        throw new InstantiationException("This class is not for instantiation");
    }

    public static String[] OooO00o() {
        ArrayList arrayList = new ArrayList(Arrays.asList(OooO0Oo));
        String str = System.getenv("PATH");
        if (str == null || "".equals(str)) {
            return (String[]) arrayList.toArray(new String[0]);
        }
        String[] split = str.split(Constants.COLON_SEPARATOR);
        int length = split.length;
        for (int i = 0; i < length; i++) {
            String str2 = split[i];
            if (!str2.endsWith(C8932ooOOO0o.OooO0OO)) {
                str2 = str2 + '/';
            }
            if (!arrayList.contains(str2)) {
                arrayList.add(str2);
            }
        }
        return (String[]) arrayList.toArray(new String[0]);
    }
}

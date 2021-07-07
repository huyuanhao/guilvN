package com.gzlex.hui.guoziwei.travel;

import android.content.Context;
import androidx.exifinterface.media.ExifInterface;
import com.ijiami.residconfusion.ConfusionUtils;
import com.jinhui365.template.TemplateApplication;
import com.p118pd.sdk.AbstractC8712oo0o0Ooo;
import com.p118pd.sdk.AbstractC8723oo0o0oo0;
import com.p118pd.sdk.C8027oOO00oo;
import com.p118pd.sdk.C8625oo0OO00;
import com.p118pd.sdk.C8654oo0Oo00;
import com.p118pd.sdk.C8706oo0o0OO0;
import com.p118pd.sdk.C8891ooOO000o;
import com.p118pd.sdk.C8892ooOO00O;
import com.p118pd.sdk.C9684lIl;
import com.p118pd.sdk.O0O00O;
import com.p118pd.sdk.o0OOOOO;
import com.tencent.bugly.beta.Beta;
import com.umeng.commonsdk.proguard.C3571am;
import com.umeng.commonsdk.proguard.C3587az;
import java.util.HashMap;
import java.util.Map;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;
import s.h.e.l.l.C;

public class MyApplication extends TemplateApplication {
    public String o000000 = o0OOOOO.OooO00o(new byte[]{19, 84, 36, 77, C8027oOO00oo.OooO00o, 91, 9, C8027oOO00oo.OooO0O0, 12, 66, 84, C8027oOO00oo.OooO0O0, 15, 90, 11}, "f5e853");
    public String o000000O = o0OOOOO.OooO00o(new byte[]{91, 75, 113, 81, 81, 86, C8027oOO00oo.OooO0O0, 84, C8027oOO00oo.OooO00o}, "285477");
    public String o000OOo = o0OOOOO.OooO00o(new byte[]{77, 18, 80, 53}, "8a5f64");
    public String o0O0O00 = o0OOOOO.OooO00o(new byte[]{C8027oOO00oo.OooO00o, 67, 4, 38, 8, 81, 70, 73, 17, 23}, "40acf2");
    public String o0OO00O = o0OOOOO.OooO00o(new byte[]{8}, "c2bcb7");
    public String o0OOO0o = o0OOOOO.OooO00o(new byte[]{12, 92, 93, O0O00O.OooO0O0, C8027oOO00oo.OooO0O0, 67, 17, 117, 89, 94, 86, 89, 21}, "a65737");
    public String o0Oo0oo = o0OOOOO.OooO00o(new byte[]{87, 3, 67, 7, 51, 51, 121}, "5b0bfa");
    public String o0ooOoO = o0OOOOO.OooO00o(new byte[]{91, 21, 16, 22, PublicSuffixDatabase.EXCEPTION_MARKER, C3587az.f9268l, 90, 4, 10, 18}, "3adfbb");
    public String oo0o0Oo = o0OOOOO.OooO00o(new byte[]{67}, "05077e");

    static {
        C.i(16);
        System.loadLibrary(o0OOOOO.OooO00o(new byte[]{88, 88, 88, 89, 66, 10, C3571am.f9204j, 84, 88, 82, 69, 26, 66, 69}, "21617c"));
    }

    private void proxyLoadDEso(Context context) {
        try {
            Class<?> cls = Class.forName("com.ijm.dataencryption.DETool");
            cls.getDeclaredMethod("loadDEso", Context.class).invoke(cls, context);
        } catch (Exception unused) {
        }
    }

    @Override // com.jinhui365.template.TemplateApplication
    public void OooO() {
        HashMap hashMap = new HashMap();
        hashMap.put(o0OOOOO.OooO00o(new byte[]{92, C8027oOO00oo.OooO0O0, 48, C3587az.f9268l, 86, 17}, "54ba9e"), true);
        C8706oo0o0OO0.OooO00o().OooO00o(hashMap);
        super.OooO();
    }

    @Override // com.jinhui365.template.TemplateApplication
    public native C8625oo0OO00 OooO00o(C8625oo0OO00 oo0oo00);

    @Override // com.jinhui365.template.TemplateApplication
    public native C8654oo0Oo00 OooO00o(C8654oo0Oo00 oo0oo00);

    @Override // com.jinhui365.template.TemplateApplication, com.jinhui365.template.TemplateApplication, com.jinhui365.template.TemplateApplication, com.jinhui365.template.TemplateApplication
    public native AbstractC8712oo0o0Ooo OooO00o();

    @Override // com.jinhui365.template.TemplateApplication, com.jinhui365.template.TemplateApplication, com.jinhui365.template.TemplateApplication, com.jinhui365.template.TemplateApplication
    /* renamed from: OooO00o  reason: collision with other method in class */
    public native AbstractC8723oo0o0oo0 m15105OooO00o();

    @Override // com.jinhui365.template.TemplateApplication, com.jinhui365.template.TemplateApplication, com.jinhui365.template.TemplateApplication, com.jinhui365.template.TemplateApplication
    /* renamed from: OooO00o  reason: collision with other method in class */
    public native void m15107OooO00o();

    @Override // com.jinhui365.template.TemplateApplication, com.jinhui365.template.TemplateApplication
    public Map<String, Object> OooO0O0() {
        return new HashMap();
    }

    @Override // com.jinhui365.template.TemplateApplication
    public native void OooOO0O();

    /* access modifiers changed from: protected */
    public native void attachBaseContext(Context context);

    @Override // com.jinhui365.template.TemplateApplication
    public void onCreate() {
        C8892ooOO00O.OooO00o(this);
        super.onCreate();
        ConfusionUtils.check(this);
    }

    @Override // com.jinhui365.template.TemplateApplication, com.jinhui365.template.TemplateApplication
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public void m15108OooO0O0() {
        super.m15117OooO0O0();
        Beta.upgradeDialogLayoutId = C1084R.layout.dialog_update_bugly;
        Beta.tipsDialogLayoutId = C1084R.layout.dialog_update_bugly_tip;
        Beta.strUpgradeDialogInstallBtn = o0OOOOO.OooO00o(new byte[]{-127, -101, -67, -122, -70, -118, -125, -98, -65, -117, -108, C9684lIl.OooO0O0}, "f06c79");
        Beta.strUpgradeDialogUpgradeBtn = o0OOOOO.OooO00o(new byte[]{-45, -104, -78, -121, -18, -46, -47, -66, -66, -123, -39, ExifInterface.OooO}, "439bca");
        Beta.strUpgradeDialogCancelBtn = o0OOOOO.OooO00o(new byte[]{-121, -2, -70, -45, -36, -72, -124, -23, -65, -48, -34, -110}, "ad87d5");
    }

    @Override // com.jinhui365.template.TemplateApplication, com.jinhui365.template.TemplateApplication, com.jinhui365.template.TemplateApplication, com.jinhui365.template.TemplateApplication
    /* renamed from: OooO00o  reason: collision with other method in class */
    public Map<String, Object> m15106OooO00o() {
        HashMap hashMap = new HashMap();
        if (o0OOOOO.OooO00o(new byte[]{20, 17, C3587az.f9268l, 92, 69, 85, 16, 10, C3587az.f9268l, 86}, "dca806").equals(C8706oo0o0OO0.OooO00o().OooO00o((Context) this))) {
            HashMap hashMap2 = new HashMap();
            hashMap2.put(this.o0Oo0oo, C8891ooOO000o.OooO00o().OooO0Oo());
            hashMap2.put(this.o0OO00O, C8891ooOO000o.OooO00o().OooO0O0());
            hashMap2.put(this.oo0o0Oo, C8891ooOO000o.OooO00o().OooO0OO());
            hashMap2.put(this.o0O0O00, Boolean.valueOf(C8891ooOO000o.OooO00o().m20535OooO00o()));
            hashMap2.put(this.o000OOo, C8891ooOO000o.OooO00o().m20534OooO00o());
            hashMap.put(this.o0ooOoO, hashMap2);
        }
        return hashMap;
    }
}

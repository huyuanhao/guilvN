package com.p118pd.sdk;

import android.text.TextUtils;
import com.alipay.sdk.app.PayResultActivity;
import com.p118pd.sdk.C7486o0OoO0oO;
import java.util.Collections;
import java.util.List;

/* renamed from: com.pd.sdk.o0OooOoo  reason: case insensitive filesystem */
public class C7528o0OooOoo {
    public static final C7486o0OoO0oO.OooO00o OooO00o = new C7486o0OoO0oO.OooO00o(C7531o0Oooo0o.f20382OooO0O0, 73, C7722o0ooOOO0.OooO0oo);

    /* renamed from: OooO00o  reason: collision with other field name */
    public static String f20378OooO00o = "";

    /* renamed from: OooO00o  reason: collision with other field name */
    public static List<C7486o0OoO0oO.OooO00o> f20379OooO00o = Collections.singletonList(OooO00o);
    public static final C7486o0OoO0oO.OooO00o OooO0O0 = new C7486o0OoO0oO.OooO00o(PayResultActivity.o0ooOoO, 40, "e6b1bdcb890370f2f2419fe06d0fdf7628ad0083d52da1ecfe991164711bbf9297e75353de96f1740695d07610567b1240549af9cbd87d06919ac31c859ad37ab6907c311b4756e1e208775989a4f691bff4bbbc58174d2a96b1d0d970a05114d7ee57dfc33b1bafaf6e0d820e838427018b6435f903df04ba7fd34d73f843df9434b164e0220baabb10c8978c3f4c6b7da79d8220a968356d15090dea07df9606f665cbec14d218dd3d691cce2866a58840971b6a57b76af88b1a65fdffd2c080281a6ab20be5879e0330eb7ff70871ce684e7174ada5dc3159c461375a0796b17ce7beca83cf34f65976d237aee993db48d34a4e344f4d8b7e99119168bdd7");

    public static void OooO00o(String str) {
        f20378OooO00o = str;
        if (((str.hashCode() == 3331 && str.equals("hk")) ? (char) 0 : 65535) != 0) {
            f20379OooO00o = Collections.singletonList(OooO00o);
        } else {
            f20379OooO00o = Collections.singletonList(OooO0O0);
        }
    }

    public static String OooO00o() {
        return f20378OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static boolean m19191OooO00o() {
        return TextUtils.isEmpty(f20378OooO00o) || TextUtils.equals("cn", f20378OooO00o);
    }
}

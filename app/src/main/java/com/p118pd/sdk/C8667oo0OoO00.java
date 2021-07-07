package com.p118pd.sdk;

import android.app.Activity;
import android.app.KeyguardManager;
import android.content.Context;
import android.os.Build;
import com.p118pd.sdk.C7047o00O00Oo;

/* renamed from: com.pd.sdk.oo0OoO00  reason: case insensitive filesystem */
public class C8667oo0OoO00 extends C7047o00O00Oo.OooO0O0 {
    public Activity OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final C7047o00O00Oo f21822OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C7056o00O0O0o f21823OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public AbstractC8666oo0OoO0 f21824OooO00o;

    public C8667oo0OoO00(Activity activity, AbstractC8666oo0OoO0 oo0ooo0) {
        this.OooO00o = activity;
        this.f21824OooO00o = oo0ooo0;
        this.f21822OooO00o = C7047o00O00Oo.m18322OooO00o((Context) activity);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static String m20292OooO00o(Activity activity) {
        if (Build.VERSION.SDK_INT < 23) {
            return "NOT_SUPPORTED";
        }
        KeyguardManager OooO00o2 = OooO00o(activity);
        C7047o00O00Oo OooO00o3 = C7047o00O00Oo.m18322OooO00o((Context) activity);
        if (OooO00o3 == null || !OooO00o3.OooO0O0()) {
            return "NOT_PRESENT";
        }
        if (OooO00o2 == null || !OooO00o2.isKeyguardSecure()) {
            return "NOT_AVAILABLE";
        }
        return !OooO00o3.OooO00o() ? "NOT_ENROLLED" : "IS_SUPPORTED";
    }

    private void OooO0OO() {
        C7056o00O0O0o o00o0o0o = this.f21823OooO00o;
        if (o00o0o0o != null) {
            o00o0o0o.m18326OooO00o();
            this.f21823OooO00o = null;
        }
    }

    public void OooO0O0() {
        OooO0OO();
    }

    public static KeyguardManager OooO00o(Activity activity) {
        return (KeyguardManager) activity.getSystemService("keyguard");
    }

    public void OooO00o(C7047o00O00Oo.C7048OooO0Oo oooO0Oo) {
        C7056o00O0O0o o00o0o0o = new C7056o00O0O0o();
        this.f21823OooO00o = o00o0o0o;
        this.f21822OooO00o.OooO00o(oooO0Oo, 0, o00o0o0o, this, null);
    }

    @Override // com.p118pd.sdk.C7047o00O00Oo.OooO0O0
    public void OooO00o(int i, CharSequence charSequence) {
        String str = "" + i;
        switch (i) {
            case 1:
                str = C8652oo0Oo.OooO0oO;
                break;
            case 2:
                str = C8652oo0Oo.OooO0oo;
                break;
            case 3:
                str = C8652oo0Oo.OooO;
                break;
            case 4:
                str = C8652oo0Oo.OooOO0;
                break;
            case 5:
                str = C8652oo0Oo.OooOO0O;
                break;
            case 7:
                str = C8652oo0Oo.OooOO0o;
                break;
            case 8:
                str = C8652oo0Oo.OooOOO0;
                break;
            case 9:
                str = C8652oo0Oo.OooOOO;
                break;
            case 10:
                str = C8652oo0Oo.OooOOOO;
                break;
            case 11:
                str = C8652oo0Oo.OooOOOo;
                break;
            case 12:
                str = C8652oo0Oo.OooOOo0;
                break;
        }
        AbstractC8666oo0OoO0 oo0ooo0 = this.f21824OooO00o;
        if (oo0ooo0 != null) {
            oo0ooo0.OooO0O0(str, charSequence.toString());
        }
    }

    @Override // com.p118pd.sdk.C7047o00O00Oo.OooO0O0
    public void OooO00o() {
        AbstractC8666oo0OoO0 oo0ooo0 = this.f21824OooO00o;
        if (oo0ooo0 != null) {
            oo0ooo0.OooO00o(C8652oo0Oo.OooO0o, "指纹不匹配");
        }
    }

    @Override // com.p118pd.sdk.C7047o00O00Oo.OooO0O0
    public void OooO00o(C7047o00O00Oo.OooO0OO oooO0OO) {
        AbstractC8666oo0OoO0 oo0ooo0 = this.f21824OooO00o;
        if (oo0ooo0 != null) {
            oo0ooo0.OooO00o(oooO0OO);
        }
        OooO0OO();
    }
}

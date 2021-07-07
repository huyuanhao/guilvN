package com.qiyukf.unicorn.p228g;

import android.content.Context;
import android.content.SharedPreferences;
import com.qiyukf.basesdk.p138c.C1847c;
import com.qiyukf.nimlib.C2180b;
import com.qiyukf.unicorn.api.SavePowerConfig;

/* renamed from: com.qiyukf.unicorn.g.d */
public final class C2657d {

    /* renamed from: a */
    public SharedPreferences f5478a;

    public C2657d(Context context, String str) {
        this.f5478a = context.getSharedPreferences("qiyu_save_" + str, 0);
    }

    /* renamed from: a */
    public static C2657d m6078a() {
        return new C2657d(C2180b.m4471a(), C2180b.m4482g());
    }

    /* renamed from: a */
    public final void mo36294a(int i) {
        C1847c.m3500a(this.f5478a, "saver_mode", i);
    }

    /* renamed from: a */
    public final void mo36295a(long j) {
        C1847c.m3501a(this.f5478a, "last_session_time", j);
    }

    /* renamed from: a */
    public final void mo36296a(SavePowerConfig savePowerConfig) {
        int i;
        SharedPreferences.Editor editor;
        SharedPreferences.Editor editor2;
        if (savePowerConfig == null) {
            editor2 = this.f5478a.edit().putLong("saver_delay", -1).putLong("check_interval", -1);
        } else {
            editor = this.f5478a.edit().putLong("saver_delay", savePowerConfig.activeDelay).putLong("check_interval", savePowerConfig.checkInterval);
            if (savePowerConfig.customPush) {
                i = 1;
                C1847c.m3499a(editor.putInt("smp_cp", i));
            }
            editor2 = editor;
        }
        editor = editor2;
        i = 0;
        C1847c.m3499a(editor.putInt("smp_cp", i));
    }

    /* renamed from: a */
    public final void mo36297a(boolean z) {
        C1847c.m3503a(this.f5478a, "YSF_PUSH_TOGGLE", z);
    }

    /* renamed from: b */
    public final void mo36298b() {
        C1847c.m3499a(this.f5478a.edit().clear());
    }

    /* renamed from: b */
    public final void mo36299b(long j) {
        C1847c.m3501a(this.f5478a, "last_check_time", j);
    }

    /* renamed from: c */
    public final long mo36300c() {
        if (!this.f5478a.contains("last_session_time")) {
            mo36295a(System.currentTimeMillis());
        }
        return this.f5478a.getLong("last_session_time", System.currentTimeMillis());
    }

    /* renamed from: c */
    public final void mo36301c(long j) {
        C1847c.m3501a(this.f5478a, "k_latest_msg", j);
    }

    /* renamed from: d */
    public final long mo36302d() {
        return this.f5478a.getLong("last_check_time", System.currentTimeMillis());
    }

    /* renamed from: d */
    public final void mo36303d(long j) {
        C1847c.m3501a(this.f5478a, "ysf_visitor", j);
    }

    /* renamed from: e */
    public final int mo36304e() {
        return this.f5478a.getInt("saver_mode", 0);
    }

    /* renamed from: e */
    public final void mo36305e(long j) {
        C1847c.m3501a(this.f5478a, "ysf_pkg", j);
    }

    /* renamed from: f */
    public final SavePowerConfig mo36306f() {
        long j = this.f5478a.getLong("saver_delay", -1);
        long j2 = this.f5478a.getLong("check_interval", -1);
        int i = this.f5478a.getInt("smp_cp", 0);
        if (j < 0 || j2 < 0) {
            return null;
        }
        return new SavePowerConfig(i == 1, j, j2);
    }

    /* renamed from: g */
    public final boolean mo36307g() {
        return this.f5478a.getLong("saver_delay", -1) > 0 && this.f5478a.getLong("check_interval", -1) > 0;
    }

    /* renamed from: h */
    public final long mo36308h() {
        return this.f5478a.getLong("k_latest_msg", 0);
    }

    /* renamed from: i */
    public final boolean mo36309i() {
        return this.f5478a.getBoolean("YSF_PUSH_TOGGLE", false);
    }

    /* renamed from: j */
    public final long mo36310j() {
        return this.f5478a.getLong("ysf_visitor", 0);
    }

    /* renamed from: k */
    public final long mo36311k() {
        return this.f5478a.getLong("ysf_pkg", 0);
    }
}

package com.xiaomi.push;

import android.content.Context;
import android.text.TextUtils;
import com.xiaomi.channel.commonutils.logger.AbstractC4163b;
import com.xiaomi.push.service.C4605ah;
import com.xiaomi.push.service.XMPushService;
import java.io.File;
import org.android.agoo.xiaomi.MiPushRegistar;

/* renamed from: com.xiaomi.push.hj */
public class C4488hj implements XMPushService.AbstractC4585l {

    /* renamed from: a */
    public static boolean f12167a;

    /* renamed from: a */
    public int f12168a;

    /* renamed from: a */
    public Context f12169a;

    /* renamed from: b */
    public boolean f12170b;

    public C4488hj(Context context) {
        this.f12169a = context;
    }

    /* renamed from: a */
    private String m12903a(String str) {
        return MiPushRegistar.PACKAGE_XIAOMI.equals(str) ? "1000271" : this.f12169a.getSharedPreferences("pref_registered_pkg_names", 0).getString(str, null);
    }

    /* renamed from: a */
    private void m12904a(Context context) {
        this.f12170b = C4605ah.m13919a(context).mo42661a(EnumC4499ht.TinyDataUploadSwitch.mo42043a(), true);
        int a = C4605ah.m13919a(context).mo42656a(EnumC4499ht.TinyDataUploadFrequency.mo42043a(), 7200);
        this.f12168a = a;
        this.f12168a = Math.max(60, a);
    }

    /* renamed from: a */
    public static void m12905a(boolean z) {
        f12167a = z;
    }

    @Override // com.xiaomi.push.service.XMPushService.AbstractC4585l
    /* renamed from: a */
    private boolean mo41998a() {
        return Math.abs((System.currentTimeMillis() / 1000) - this.f12169a.getSharedPreferences("mipush_extra", 4).getLong("last_tiny_data_upload_timestamp", -1)) > ((long) this.f12168a);
    }

    /* renamed from: a */
    private boolean m12907a(AbstractC4493hn hnVar) {
        return C4274az.m11735b(this.f12169a) && hnVar != null && !TextUtils.isEmpty(m12903a(this.f12169a.getPackageName())) && new File(this.f12169a.getFilesDir(), "tiny_data.data").exists() && !f12167a;
    }

    @Override // com.xiaomi.push.service.XMPushService.AbstractC4585l
    /* renamed from: a */
    public void m12908a() {
        m12904a(this.f12169a);
        if (this.f12170b && mo41998a()) {
            AbstractC4163b.m11301a("TinyData TinyDataCacheProcessor.pingFollowUpAction ts:" + System.currentTimeMillis());
            AbstractC4493hn a = C4492hm.m12919a(this.f12169a).mo42000a();
            if (!m12907a(a)) {
                AbstractC4163b.m11301a("TinyData TinyDataCacheProcessor.pingFollowUpAction !canUpload(uploader) ts:" + System.currentTimeMillis());
                return;
            }
            f12167a = true;
            C4489hk.m12910a(this.f12169a, a);
        }
    }
}

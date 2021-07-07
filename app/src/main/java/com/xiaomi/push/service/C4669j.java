package com.xiaomi.push.service;

import android.text.TextUtils;
import com.xiaomi.channel.commonutils.logger.AbstractC4163b;
import com.xiaomi.push.C4498hs;
import com.xiaomi.push.C4508ib;
import com.xiaomi.push.C4517ik;
import com.xiaomi.push.C4520in;
import com.xiaomi.push.C4531iy;
import com.xiaomi.push.EnumC4494ho;
import com.xiaomi.push.service.XMPushService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.xiaomi.push.service.j */
public class C4669j extends XMPushService.AbstractC4582i {

    /* renamed from: a */
    public final /* synthetic */ C4668i f13348a;

    /* renamed from: a */
    public final /* synthetic */ String f13349a;

    /* renamed from: a */
    public final /* synthetic */ List f13350a;

    /* renamed from: b */
    public final /* synthetic */ String f13351b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C4669j(C4668i iVar, int i, String str, List list, String str2) {
        super(i);
        this.f13348a = iVar;
        this.f13349a = str;
        this.f13350a = list;
        this.f13351b = str2;
    }

    @Override // com.xiaomi.push.service.XMPushService.AbstractC4582i, com.xiaomi.push.service.XMPushService.AbstractC4582i
    /* renamed from: a */
    public String mo41924a() {
        return "Send tiny data.";
    }

    @Override // com.xiaomi.push.service.XMPushService.AbstractC4582i, com.xiaomi.push.service.XMPushService.AbstractC4582i
    /* renamed from: a */
    public void m14135a() {
        String str = this.f13348a.m14132a(this.f13349a);
        ArrayList<C4520in> a = C4641bf.m14055a(this.f13350a, this.f13349a, str, 32768);
        AbstractC4163b.m11301a("TinyData LongConnUploader.upload pack notifications " + a.toString() + "  ts:" + System.currentTimeMillis());
        if (a != null) {
            Iterator<C4520in> it = a.iterator();
            while (it.hasNext()) {
                C4520in next = it.next();
                next.mo42313a("uploadWay", "longXMPushService");
                C4517ik a2 = C4684w.m14206a(this.f13349a, str, next, EnumC4494ho.Notification);
                if (!TextUtils.isEmpty(this.f13351b) && !TextUtils.equals(this.f13349a, this.f13351b)) {
                    if (a2.m13270a() == null) {
                        C4508ib ibVar = new C4508ib();
                        ibVar.mo42116a("-1");
                        a2.mo42275a(ibVar);
                    }
                    a2.m13270a().mo42123b("ext_traffic_source_pkg", this.f13351b);
                }
                this.f13348a.f13347a.mo42629a(this.f13349a, C4531iy.m13590a(a2), true);
            }
            Iterator it2 = this.f13350a.iterator();
            while (it2.hasNext()) {
                AbstractC4163b.m11301a("TinyData LongConnUploader.upload uploaded by com.xiaomi.push.service.TinyDataUploader.  item" + ((C4498hs) it2.next()).mo42029d() + "  ts:" + System.currentTimeMillis());
            }
            return;
        }
        AbstractC4163b.m11306d("TinyData LongConnUploader.upload Get a null XmPushActionNotification list when TinyDataHelper.pack() in XMPushService.");
    }
}

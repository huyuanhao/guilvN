package com.xiaomi.push.service;

import android.content.Context;
import com.xiaomi.channel.commonutils.logger.AbstractC4163b;
import com.xiaomi.mipush.sdk.ErrorCode;
import com.xiaomi.push.C4449gf;
import com.xiaomi.push.service.C4611am;
import com.xiaomi.push.service.XMPushService;
import java.io.IOException;
import java.util.Collection;
import org.json.JSONException;

/* renamed from: com.xiaomi.push.service.n */
public class C4674n extends XMPushService.AbstractC4582i {

    /* renamed from: a */
    public XMPushService f13366a;

    /* renamed from: a */
    public String f13367a;

    /* renamed from: a */
    public byte[] f13368a;

    /* renamed from: b */
    public String f13369b;

    /* renamed from: c */
    public String f13370c;

    public C4674n(XMPushService xMPushService, String str, String str2, String str3, byte[] bArr) {
        super(9);
        this.f13366a = xMPushService;
        this.f13367a = str;
        this.f13368a = bArr;
        this.f13369b = str2;
        this.f13370c = str3;
    }

    @Override // com.xiaomi.push.service.XMPushService.AbstractC4582i, com.xiaomi.push.service.XMPushService.AbstractC4582i
    /* renamed from: a */
    public String mo41924a() {
        return "register app";
    }

    @Override // com.xiaomi.push.service.XMPushService.AbstractC4582i, com.xiaomi.push.service.XMPushService.AbstractC4582i
    /* renamed from: a */
    public void m14161a() {
        C4611am.C4613b bVar;
        C4670k a = C4671l.m14141a((Context) this.f13366a);
        if (a == null) {
            try {
                a = C4671l.m14142a(this.f13366a, this.f13367a, this.f13369b, this.f13370c);
            } catch (IOException | JSONException e) {
                AbstractC4163b.m11303a(e);
            }
        }
        if (a == null) {
            AbstractC4163b.m11306d("no account for mipush");
            C4675o.m14162a(this.f13366a, ErrorCode.ERROR_AUTHERICATION_ERROR, "no account.");
            return;
        }
        Collection<C4611am.C4613b> a2 = C4611am.mo42670a().m13950a("5");
        if (a2.isEmpty()) {
            bVar = a.mo42740a(this.f13366a);
            C4684w.m14211a(this.f13366a, bVar);
            C4611am.mo42670a().mo42676a(bVar);
        } else {
            bVar = a2.iterator().next();
        }
        if (this.f13366a.m13817c()) {
            try {
                if (bVar.f13182a == C4611am.EnumC4617c.binded) {
                    C4684w.m14213a(this.f13366a, this.f13367a, this.f13368a);
                } else if (bVar.f13182a == C4611am.EnumC4617c.unbind) {
                    XMPushService xMPushService = this.f13366a;
                    XMPushService xMPushService2 = this.f13366a;
                    xMPushService2.getClass();
                    xMPushService.mo42624a(new XMPushService.C4574a(bVar));
                }
            } catch (C4449gf e2) {
                AbstractC4163b.m11303a(e2);
                this.f13366a.mo42622a(10, e2);
            }
        } else {
            this.f13366a.mo42630a(true);
        }
    }
}

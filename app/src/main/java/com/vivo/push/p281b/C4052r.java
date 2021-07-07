package com.vivo.push.p281b;

import android.text.TextUtils;
import com.vivo.push.AbstractC4160y;
import com.vivo.push.C4026a;
import com.vivo.push.model.InsideNotificationItem;
import com.vivo.push.util.C4147q;

/* renamed from: com.vivo.push.b.r */
public final class C4052r extends AbstractC4160y {

    /* renamed from: a */
    public String f10936a;

    /* renamed from: b */
    public long f10937b;

    /* renamed from: c */
    public InsideNotificationItem f10938c;

    public C4052r(String str, long j, InsideNotificationItem insideNotificationItem) {
        super(5);
        this.f10936a = str;
        this.f10937b = j;
        this.f10938c = insideNotificationItem;
    }

    @Override // com.vivo.push.AbstractC4160y
    /* renamed from: c */
    public final void mo40898c(C4026a aVar) {
        aVar.mo40880a("package_name", this.f10936a);
        aVar.mo40878a("notify_id", this.f10937b);
        aVar.mo40880a("notification_v1", C4147q.m11220b(this.f10938c));
    }

    /* renamed from: d */
    public final String mo40926d() {
        return this.f10936a;
    }

    /* renamed from: e */
    public final long mo40927e() {
        return this.f10937b;
    }

    /* renamed from: f */
    public final InsideNotificationItem mo40928f() {
        return this.f10938c;
    }

    @Override // com.vivo.push.AbstractC4160y
    public final String toString() {
        return "OnNotificationClickCommand";
    }

    @Override // com.vivo.push.AbstractC4160y
    /* renamed from: d */
    public final void mo40899d(C4026a aVar) {
        this.f10936a = aVar.mo40876a("package_name");
        this.f10937b = aVar.mo40884b("notify_id", -1L);
        String a = aVar.mo40876a("notification_v1");
        if (!TextUtils.isEmpty(a)) {
            this.f10938c = C4147q.m11218a(a);
        }
        InsideNotificationItem insideNotificationItem = this.f10938c;
        if (insideNotificationItem != null) {
            insideNotificationItem.setMsgId(this.f10937b);
        }
    }

    public C4052r() {
        super(5);
    }
}

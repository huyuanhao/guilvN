package com.vivo.push.p281b;

import android.text.TextUtils;
import com.vivo.push.C4026a;
import com.vivo.push.model.InsideNotificationItem;
import com.vivo.push.util.C4147q;

/* renamed from: com.vivo.push.b.s */
public final class C4053s extends AbstractC4058x {

    /* renamed from: a */
    public InsideNotificationItem f10939a;

    /* renamed from: b */
    public String f10940b;

    public C4053s() {
        super(4);
    }

    @Override // com.vivo.push.p281b.C4055u, com.vivo.push.p281b.AbstractC4058x, com.vivo.push.AbstractC4160y
    /* renamed from: c */
    public final void mo40898c(C4026a aVar) {
        super.mo40898c(aVar);
        String b = C4147q.m11220b(this.f10939a);
        this.f10940b = b;
        aVar.mo40880a("notification_v1", b);
    }

    /* renamed from: d */
    public final InsideNotificationItem mo40929d() {
        return this.f10939a;
    }

    /* renamed from: e */
    public final String mo40930e() {
        if (!TextUtils.isEmpty(this.f10940b)) {
            return this.f10940b;
        }
        InsideNotificationItem insideNotificationItem = this.f10939a;
        if (insideNotificationItem == null) {
            return null;
        }
        return C4147q.m11220b(insideNotificationItem);
    }

    @Override // com.vivo.push.p281b.C4055u, com.vivo.push.AbstractC4160y
    public final String toString() {
        return "OnNotifyArrivedCommand";
    }

    @Override // com.vivo.push.p281b.C4055u, com.vivo.push.p281b.AbstractC4058x, com.vivo.push.AbstractC4160y
    /* renamed from: d */
    public final void mo40899d(C4026a aVar) {
        super.mo40899d(aVar);
        String a = aVar.mo40876a("notification_v1");
        this.f10940b = a;
        if (!TextUtils.isEmpty(a)) {
            InsideNotificationItem a2 = C4147q.m11218a(this.f10940b);
            this.f10939a = a2;
            if (a2 != null) {
                a2.setMsgId(mo40937f());
            }
        }
    }
}

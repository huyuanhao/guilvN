package com.vivo.push.p282c;

import android.app.NotificationManager;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.umeng.message.entity.UMessage;
import com.vivo.push.AbstractC4160y;
import com.vivo.push.C4121p;
import com.vivo.push.C4158w;
import com.vivo.push.cache.ClientConfigManagerImpl;
import com.vivo.push.model.InsideNotificationItem;
import com.vivo.push.p281b.C4032aa;
import com.vivo.push.p281b.C4044j;
import com.vivo.push.p281b.C4053s;
import com.vivo.push.util.C4134d;
import com.vivo.push.util.C4146p;
import com.vivo.push.util.C4149s;
import com.vivo.push.util.C4156z;
import java.util.HashMap;

/* renamed from: com.vivo.push.c.r */
public final class C4090r extends AbstractC4064ab {
    public C4090r(AbstractC4160y yVar) {
        super(yVar);
    }

    @Override // com.vivo.push.AbstractRunnableC4157v
    /* renamed from: a */
    public final void mo40942a(AbstractC4160y yVar) {
        NotificationManager notificationManager;
        boolean isEnablePush = ClientConfigManagerImpl.getInstance(this.f11150a).isEnablePush();
        C4053s sVar = (C4053s) yVar;
        Context context = this.f11150a;
        if (!C4149s.m11229c(context, context.getPackageName())) {
            C4032aa aaVar = new C4032aa(2101);
            HashMap<String, String> hashMap = new HashMap<>();
            hashMap.put("messageID", String.valueOf(sVar.mo40937f()));
            Context context2 = this.f11150a;
            String b = C4156z.m11266b(context2, context2.getPackageName());
            if (!TextUtils.isEmpty(b)) {
                hashMap.put("remoteAppId", b);
            }
            aaVar.mo40901a(hashMap);
            C4121p.m11080a().mo41096a(aaVar);
            return;
        }
        C4121p.m11080a().mo41096a(new C4044j(String.valueOf(sVar.mo40937f())));
        C4146p.m11216d("OnNotificationArrivedTask", "PushMessageReceiver " + this.f11150a.getPackageName() + " isEnablePush :" + isEnablePush);
        if (!isEnablePush) {
            C4032aa aaVar2 = new C4032aa(1020);
            HashMap<String, String> hashMap2 = new HashMap<>();
            hashMap2.put("messageID", String.valueOf(sVar.mo40937f()));
            Context context3 = this.f11150a;
            String b2 = C4156z.m11266b(context3, context3.getPackageName());
            if (!TextUtils.isEmpty(b2)) {
                hashMap2.put("remoteAppId", b2);
            }
            aaVar2.mo40901a(hashMap2);
            C4121p.m11080a().mo41096a(aaVar2);
        } else if (C4121p.m11080a().mo41122g() && !mo40945a(C4156z.m11270d(this.f11150a), sVar.mo40930e(), sVar.mo40938i())) {
            C4032aa aaVar3 = new C4032aa(1021);
            HashMap<String, String> hashMap3 = new HashMap<>();
            hashMap3.put("messageID", String.valueOf(sVar.mo40937f()));
            Context context4 = this.f11150a;
            String b3 = C4156z.m11266b(context4, context4.getPackageName());
            if (!TextUtils.isEmpty(b3)) {
                hashMap3.put("remoteAppId", b3);
            }
            aaVar3.mo40901a(hashMap3);
            C4121p.m11080a().mo41096a(aaVar3);
        } else if (Build.VERSION.SDK_INT < 24 || (notificationManager = (NotificationManager) this.f11150a.getSystemService(UMessage.DISPLAY_TYPE_NOTIFICATION)) == null || notificationManager.areNotificationsEnabled()) {
            InsideNotificationItem d = sVar.mo40929d();
            if (d != null) {
                int targetType = d.getTargetType();
                String tragetContent = d.getTragetContent();
                C4146p.m11216d("OnNotificationArrivedTask", "tragetType is " + targetType + " ; target is " + tragetContent);
                C4158w.m11280b(new RunnableC4091s(this, d, sVar));
                return;
            }
            C4146p.m11204a("OnNotificationArrivedTask", "notify is null");
            Context context5 = this.f11150a;
            C4146p.m11215c(context5, "通知内容为空，" + sVar.mo40937f());
            C4134d.m11165a(this.f11150a, sVar.mo40937f(), 1027);
        } else {
            C4146p.m11211b("OnNotificationArrivedTask", "pkg name : " + this.f11150a.getPackageName() + " notify switch is false");
            C4146p.m11213b(this.f11150a, "通知开关关闭，导致通知无法展示，请到设置页打开应用通知开关");
            C4032aa aaVar4 = new C4032aa(2104);
            HashMap<String, String> hashMap4 = new HashMap<>();
            hashMap4.put("messageID", String.valueOf(sVar.mo40937f()));
            Context context6 = this.f11150a;
            String b4 = C4156z.m11266b(context6, context6.getPackageName());
            if (!TextUtils.isEmpty(b4)) {
                hashMap4.put("remoteAppId", b4);
            }
            aaVar4.mo40901a(hashMap4);
            C4121p.m11080a().mo41096a(aaVar4);
        }
    }
}

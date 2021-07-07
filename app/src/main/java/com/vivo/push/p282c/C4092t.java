package com.vivo.push.p282c;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.umeng.socialize.net.dplus.CommonNetImpl;
import com.vivo.push.AbstractC4160y;
import com.vivo.push.C4121p;
import com.vivo.push.C4158w;
import com.vivo.push.model.InsideNotificationItem;
import com.vivo.push.model.UPSNotificationMessage;
import com.vivo.push.p281b.C4032aa;
import com.vivo.push.p281b.C4052r;
import com.vivo.push.util.C4146p;
import com.vivo.push.util.C4147q;
import com.vivo.push.util.C4156z;
import com.vivo.push.util.NotifyAdapterUtil;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.vivo.push.c.t */
public final class C4092t extends AbstractC4064ab {
    public C4092t(AbstractC4160y yVar) {
        super(yVar);
    }

    /* renamed from: b */
    public static Intent m11045b(Intent intent, Map<String, String> map) {
        if (!(map == null || map.entrySet() == null)) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                if (!(entry == null || entry.getKey() == null)) {
                    intent.putExtra(entry.getKey(), entry.getValue());
                }
            }
        }
        return intent;
    }

    @Override // com.vivo.push.AbstractRunnableC4157v
    /* renamed from: a */
    public final void mo40942a(AbstractC4160y yVar) {
        C4052r rVar = (C4052r) yVar;
        InsideNotificationItem f = rVar.mo40928f();
        if (f == null) {
            C4146p.m11216d("OnNotificationClickTask", "current notification item is null");
            return;
        }
        UPSNotificationMessage a = C4147q.m11219a(f);
        boolean equals = this.f11150a.getPackageName().equals(rVar.mo40926d());
        if (equals) {
            NotifyAdapterUtil.cancelNotify(this.f11150a);
        }
        if (equals) {
            C4032aa aaVar = new C4032aa(1030);
            HashMap<String, String> hashMap = new HashMap<>();
            hashMap.put("type", "2");
            hashMap.put("messageID", String.valueOf(rVar.mo40927e()));
            hashMap.put("platform", this.f11150a.getPackageName());
            Context context = this.f11150a;
            String b = C4156z.m11266b(context, context.getPackageName());
            if (!TextUtils.isEmpty(b)) {
                hashMap.put("remoteAppId", b);
            }
            aaVar.mo40901a(hashMap);
            C4121p.m11080a().mo41096a(aaVar);
            C4146p.m11216d("OnNotificationClickTask", "notification is clicked by skip type[" + a.getSkipType() + "]");
            int skipType = a.getSkipType();
            boolean z = true;
            if (skipType == 1) {
                new Thread(new RunnableC4097y(this, this.f11150a, a.getParams())).start();
                C4158w.m11280b(new RunnableC4093u(this, a));
            } else if (skipType == 2) {
                String skipContent = a.getSkipContent();
                if (!skipContent.startsWith("http://") && !skipContent.startsWith("https://")) {
                    z = false;
                }
                if (z) {
                    Uri parse = Uri.parse(skipContent);
                    Intent intent = new Intent("android.intent.action.VIEW", parse);
                    intent.setFlags(CommonNetImpl.FLAG_AUTH);
                    m11045b(intent, a.getParams());
                    try {
                        this.f11150a.startActivity(intent);
                    } catch (Exception unused) {
                        C4146p.m11204a("OnNotificationClickTask", "startActivity error : " + parse);
                    }
                } else {
                    C4146p.m11204a("OnNotificationClickTask", "url not legal");
                }
                C4158w.m11280b(new RunnableC4094v(this, a));
            } else if (skipType == 3) {
                C4158w.m11280b(new RunnableC4095w(this, a));
            } else if (skipType != 4) {
                C4146p.m11204a("OnNotificationClickTask", "illegitmacy skip type error : " + a.getSkipType());
            } else {
                String skipContent2 = a.getSkipContent();
                try {
                    Intent parseUri = Intent.parseUri(skipContent2, 1);
                    String str = parseUri.getPackage();
                    if (TextUtils.isEmpty(str) || this.f11150a.getPackageName().equals(str)) {
                        String packageName = parseUri.getComponent() == null ? null : parseUri.getComponent().getPackageName();
                        if (TextUtils.isEmpty(packageName) || this.f11150a.getPackageName().equals(packageName)) {
                            parseUri.setPackage(this.f11150a.getPackageName());
                            parseUri.addFlags(CommonNetImpl.FLAG_AUTH);
                            m11045b(parseUri, a.getParams());
                            this.f11150a.startActivity(parseUri);
                            C4158w.m11280b(new RunnableC4096x(this, a));
                            return;
                        }
                        C4146p.m11204a("OnNotificationClickTask", "open activity component error : local pkgName is " + this.f11150a.getPackageName() + "; but remote pkgName is " + parseUri.getPackage());
                        return;
                    }
                    C4146p.m11204a("OnNotificationClickTask", "open activity error : local pkgName is " + this.f11150a.getPackageName() + "; but remote pkgName is " + parseUri.getPackage());
                } catch (Exception e) {
                    C4146p.m11205a("OnNotificationClickTask", "open activity error : " + skipContent2, e);
                }
            }
        } else {
            C4146p.m11204a("OnNotificationClickTask", "notify is " + a + " ; isMatch is " + equals);
        }
    }
}

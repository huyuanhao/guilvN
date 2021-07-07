package com.huawei.hms.support.api.push.p041a.p044c;

import android.content.Context;
import android.content.Intent;
import com.huawei.hms.support.api.push.p041a.p043b.C1174a;
import com.huawei.hms.support.api.push.p041a.p045d.C1184a;
import com.huawei.hms.support.log.C1202a;

/* renamed from: com.huawei.hms.support.api.push.a.c.h */
public class C1183h extends Thread {

    /* renamed from: a */
    public Context f1292a;

    /* renamed from: b */
    public C1174a f1293b;

    /* renamed from: c */
    public String f1294c;

    public C1183h(Context context, C1174a aVar, String str) {
        this.f1292a = context;
        this.f1293b = aVar;
        this.f1294c = str;
    }

    /* renamed from: b */
    public static Intent m1232b(Context context, C1174a aVar) {
        if (aVar == null) {
            return null;
        }
        Intent b = C1184a.m1245b(context, aVar.mo15680s());
        if (aVar.mo15668g() != null) {
            try {
                Intent parseUri = Intent.parseUri(aVar.mo15668g(), 0);
                C1202a.m1316a("PushSelfShowLog", "Intent.parseUri(msg.intentUri, 0)，" + parseUri.toURI());
                return C1184a.m1238a(context, aVar.mo15680s(), parseUri).booleanValue() ? parseUri : b;
            } catch (RuntimeException unused) {
                C1202a.m1319c("PushSelfShowLog", "intentUri error");
                return b;
            } catch (Exception unused2) {
                C1202a.m1319c("PushSelfShowLog", "intentUri error");
                return b;
            }
        } else {
            if (aVar.mo15681t() != null) {
                Intent intent = new Intent(aVar.mo15681t());
                if (C1184a.m1238a(context, aVar.mo15680s(), intent).booleanValue()) {
                    b = intent;
                }
            }
            b.setPackage(aVar.mo15680s());
            return b;
        }
    }

    /* renamed from: a */
    public boolean mo15686a(Context context) {
        if ("cosa".equals(this.f1293b.mo15672k())) {
            return mo15688b(context);
        }
        if ("email".equals(this.f1293b.mo15672k())) {
            return mo15689c(context);
        }
        return true;
    }

    /* renamed from: c */
    public boolean mo15689c(Context context) {
        return C1184a.m1243a(context);
    }

    public void run() {
        C1202a.m1318b("PushSelfShowLog", "enter run()");
        try {
            if (mo15686a(this.f1292a) && !mo15687a(this.f1292a, this.f1293b)) {
                C1179d.m1226a(this.f1292a, this.f1293b, this.f1294c);
            }
        } catch (Exception e) {
            C1202a.m1320d("PushSelfShowLog", e.toString());
        }
    }

    /* renamed from: a */
    public boolean mo15687a(Context context, C1174a aVar) {
        boolean z = false;
        if (!"cosa".equals(aVar.mo15672k())) {
            return false;
        }
        Intent b = m1232b(context, aVar);
        if (b == null) {
            C1202a.m1316a("PushSelfShowLog", "launchCosaApp,intent == null");
            z = true;
        }
        if (C1184a.m1244a(context, b)) {
            return z;
        }
        C1202a.m1318b("PushSelfShowLog", "no permission to start activity");
        return true;
    }

    /* renamed from: b */
    public boolean mo15688b(Context context) {
        return C1184a.m1250c(context, this.f1293b.mo15680s());
    }
}

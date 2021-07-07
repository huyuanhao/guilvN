package com.xiaomi.push.service;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.Message;
import android.os.RemoteException;
import android.text.TextUtils;
import com.xiaomi.channel.commonutils.logger.AbstractC4163b;
import com.xiaomi.push.AbstractC4456gl;
import com.xiaomi.push.C4428fn;
import com.xiaomi.push.C4453gj;
import com.xiaomi.push.C4455gk;
import com.xiaomi.push.C4458gn;
import com.xiaomi.push.C4563l;
import com.xiaomi.push.service.C4611am;
import java.util.Collection;
import java.util.Iterator;
import org.android.agoo.xiaomi.MiPushRegistar;

/* renamed from: com.xiaomi.push.service.d */
public class C4658d {

    /* renamed from: a */
    public C4676p f13323a = new C4676p();

    /* renamed from: a */
    public static String m14080a(C4611am.C4613b bVar) {
        StringBuilder sb;
        String str;
        if (!"9".equals(bVar.f13194g)) {
            sb = new StringBuilder();
            sb.append(bVar.f13184a);
            str = ".permission.MIPUSH_RECEIVE";
        } else {
            sb = new StringBuilder();
            sb.append(bVar.f13184a);
            str = ".permission.MIMC_RECEIVE";
        }
        sb.append(str);
        return sb.toString();
    }

    /* renamed from: a */
    public static void m14081a(Context context, Intent intent, C4611am.C4613b bVar) {
        if (MiPushRegistar.PACKAGE_XIAOMI.equals(context.getPackageName())) {
            context.sendBroadcast(intent);
        } else {
            context.sendBroadcast(intent, m14080a(bVar));
        }
    }

    /* renamed from: a */
    public C4611am.C4613b mo42713a(C4428fn fnVar) {
        Collection<C4611am.C4613b> a = C4611am.mo42670a().m13950a(Integer.toString(fnVar.mo41864a()));
        if (a.isEmpty()) {
            return null;
        }
        Iterator<C4611am.C4613b> it = a.iterator();
        if (a.size() == 1) {
            return it.next();
        }
        String g = fnVar.mo41878g();
        while (it.hasNext()) {
            C4611am.C4613b next = it.next();
            if (TextUtils.equals(g, next.f13188b)) {
                return next;
            }
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0034  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.xiaomi.push.service.C4611am.C4613b mo42714a(com.xiaomi.push.AbstractC4456gl r6) {
        /*
            r5 = this;
            com.xiaomi.push.service.am r0 = com.xiaomi.push.service.C4611am.mo42670a()
            java.lang.String r1 = r6.mo41967k()
            java.util.Collection r0 = r0.m13950a(r1)
            boolean r1 = r0.isEmpty()
            r2 = 0
            if (r1 == 0) goto L_0x0014
            return r2
        L_0x0014:
            java.util.Iterator r1 = r0.iterator()
            int r0 = r0.size()
            r3 = 1
            if (r0 != r3) goto L_0x0026
            java.lang.Object r6 = r1.next()
            com.xiaomi.push.service.am$b r6 = (com.xiaomi.push.service.C4611am.C4613b) r6
            return r6
        L_0x0026:
            java.lang.String r0 = r6.mo41971m()
            java.lang.String r6 = r6.mo41969l()
        L_0x002e:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x004b
            java.lang.Object r3 = r1.next()
            com.xiaomi.push.service.am$b r3 = (com.xiaomi.push.service.C4611am.C4613b) r3
            java.lang.String r4 = r3.f13188b
            boolean r4 = android.text.TextUtils.equals(r0, r4)
            if (r4 != 0) goto L_0x004a
            java.lang.String r4 = r3.f13188b
            boolean r4 = android.text.TextUtils.equals(r6, r4)
            if (r4 == 0) goto L_0x002e
        L_0x004a:
            return r3
        L_0x004b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.service.C4658d.mo42714a(com.xiaomi.push.gl):com.xiaomi.push.service.am$b");
    }

    @SuppressLint({"WrongConstant"})
    /* renamed from: a */
    public void mo42715a(Context context) {
        Intent intent = new Intent();
        intent.setAction("com.xiaomi.push.service_started");
        if (C4563l.m13730c()) {
            intent.addFlags(16777216);
        }
        context.sendBroadcast(intent);
    }

    /* renamed from: a */
    public void mo42716a(Context context, C4611am.C4613b bVar, int i) {
        if (!"5".equalsIgnoreCase(bVar.f13194g)) {
            Intent intent = new Intent();
            intent.setAction("com.xiaomi.push.channel_closed");
            intent.setPackage(bVar.f13184a);
            intent.putExtra(AbstractC4621aq.f13239r, bVar.f13194g);
            intent.putExtra("ext_reason", i);
            intent.putExtra(AbstractC4621aq.f13237p, bVar.f13188b);
            intent.putExtra(AbstractC4621aq.f13214C, bVar.f13196i);
            if (bVar.f13178a == null || !"9".equals(bVar.f13194g)) {
                m14081a(context, intent, bVar);
                return;
            }
            try {
                bVar.f13178a.send(Message.obtain(null, 17, intent));
            } catch (RemoteException unused) {
                bVar.f13178a = null;
                StringBuilder sb = new StringBuilder();
                sb.append("peer may died: ");
                String str = bVar.f13188b;
                sb.append(str.substring(str.lastIndexOf(64)));
                AbstractC4163b.m11301a(sb.toString());
            }
        }
    }

    /* renamed from: a */
    public void mo42717a(Context context, C4611am.C4613b bVar, String str, String str2) {
        if ("5".equalsIgnoreCase(bVar.f13194g)) {
            AbstractC4163b.m11306d("mipush kicked by server");
            return;
        }
        Intent intent = new Intent();
        intent.setAction("com.xiaomi.push.kicked");
        intent.setPackage(bVar.f13184a);
        intent.putExtra("ext_kick_type", str);
        intent.putExtra("ext_kick_reason", str2);
        intent.putExtra("ext_chid", bVar.f13194g);
        intent.putExtra(AbstractC4621aq.f13237p, bVar.f13188b);
        intent.putExtra(AbstractC4621aq.f13214C, bVar.f13196i);
        m14081a(context, intent, bVar);
    }

    /* renamed from: a */
    public void mo42718a(Context context, C4611am.C4613b bVar, boolean z, int i, String str) {
        if ("5".equalsIgnoreCase(bVar.f13194g)) {
            this.f13323a.mo42748a(context, bVar, z, i, str);
            return;
        }
        Intent intent = new Intent();
        intent.setAction("com.xiaomi.push.channel_opened");
        intent.setPackage(bVar.f13184a);
        intent.putExtra("ext_succeeded", z);
        if (!z) {
            intent.putExtra("ext_reason", i);
        }
        if (!TextUtils.isEmpty(str)) {
            intent.putExtra("ext_reason_msg", str);
        }
        intent.putExtra("ext_chid", bVar.f13194g);
        intent.putExtra(AbstractC4621aq.f13237p, bVar.f13188b);
        intent.putExtra(AbstractC4621aq.f13214C, bVar.f13196i);
        m14081a(context, intent, bVar);
    }

    /* renamed from: a */
    public void mo42719a(XMPushService xMPushService, String str, C4428fn fnVar) {
        C4611am.C4613b a = mo42713a(fnVar);
        if (a == null) {
            AbstractC4163b.m11306d("error while notify channel closed! channel " + str + " not registered");
        } else if ("5".equalsIgnoreCase(str)) {
            this.f13323a.mo42749a(xMPushService, fnVar, a);
        } else {
            String str2 = a.f13184a;
            Intent intent = new Intent();
            intent.setAction("com.xiaomi.push.new_msg");
            intent.setPackage(str2);
            intent.putExtra("ext_chid", str);
            intent.putExtra("ext_raw_packet", fnVar.m12609a(a.f13195h));
            intent.putExtra(AbstractC4621aq.f13214C, a.f13196i);
            intent.putExtra(AbstractC4621aq.f13243v, a.f13195h);
            if (a.f13178a != null) {
                try {
                    a.f13178a.send(Message.obtain(null, 17, intent));
                    return;
                } catch (RemoteException unused) {
                    a.f13178a = null;
                    StringBuilder sb = new StringBuilder();
                    sb.append("peer may died: ");
                    String str3 = a.f13188b;
                    sb.append(str3.substring(str3.lastIndexOf(64)));
                    AbstractC4163b.m11301a(sb.toString());
                }
            }
            if (!MiPushRegistar.PACKAGE_XIAOMI.equals(str2)) {
                m14081a(xMPushService, intent, a);
            }
        }
    }

    /* renamed from: a */
    public void mo42720a(XMPushService xMPushService, String str, AbstractC4456gl glVar) {
        String str2;
        String str3;
        C4611am.C4613b a = mo42714a(glVar);
        if (a == null) {
            str3 = "error while notify channel closed! channel " + str + " not registered";
        } else if ("5".equalsIgnoreCase(str)) {
            this.f13323a.mo42750a(xMPushService, glVar, a);
            return;
        } else {
            String str4 = a.f13184a;
            if (glVar instanceof C4455gk) {
                str2 = "com.xiaomi.push.new_msg";
            } else if (glVar instanceof C4453gj) {
                str2 = "com.xiaomi.push.new_iq";
            } else if (glVar instanceof C4458gn) {
                str2 = "com.xiaomi.push.new_pres";
            } else {
                str3 = "unknown packet type, drop it";
            }
            Intent intent = new Intent();
            intent.setAction(str2);
            intent.setPackage(str4);
            intent.putExtra("ext_chid", str);
            intent.putExtra("ext_packet", glVar.mo41938a());
            intent.putExtra(AbstractC4621aq.f13214C, a.f13196i);
            intent.putExtra(AbstractC4621aq.f13243v, a.f13195h);
            m14081a(xMPushService, intent, a);
            return;
        }
        AbstractC4163b.m11306d(str3);
    }
}

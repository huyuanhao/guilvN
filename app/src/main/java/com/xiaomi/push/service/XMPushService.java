package com.xiaomi.push.service;

import android.annotation.TargetApi;
import android.app.Notification;
import android.app.PendingIntent;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.database.ContentObserver;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Messenger;
import android.os.Parcelable;
import android.os.PowerManager;
import android.os.Process;
import android.os.SystemClock;
import android.provider.Settings;
import android.text.TextUtils;
import com.p118pd.sdk.C8932ooOOO0o;
import com.xiaomi.channel.commonutils.logger.AbstractC4163b;
import com.xiaomi.clientreport.data.Config;
import com.xiaomi.mipush.sdk.Constants;
import com.xiaomi.mipush.sdk.ErrorCode;
import com.xiaomi.push.AbstractC4435fu;
import com.xiaomi.push.AbstractC4439fx;
import com.xiaomi.push.AbstractC4441fz;
import com.xiaomi.push.AbstractC4456gl;
import com.xiaomi.push.C4244ab;
import com.xiaomi.push.C4251ai;
import com.xiaomi.push.C4261ao;
import com.xiaomi.push.C4274az;
import com.xiaomi.push.C4284be;
import com.xiaomi.push.C4291bl;
import com.xiaomi.push.C4342db;
import com.xiaomi.push.C4354dk;
import com.xiaomi.push.C4404es;
import com.xiaomi.push.C4415fc;
import com.xiaomi.push.C4417fd;
import com.xiaomi.push.C4418fe;
import com.xiaomi.push.C4428fn;
import com.xiaomi.push.C4433fs;
import com.xiaomi.push.C4437fv;
import com.xiaomi.push.C4444ga;
import com.xiaomi.push.C4449gf;
import com.xiaomi.push.C4453gj;
import com.xiaomi.push.C4455gk;
import com.xiaomi.push.C4458gn;
import com.xiaomi.push.C4473gz;
import com.xiaomi.push.C4483hg;
import com.xiaomi.push.C4486hi;
import com.xiaomi.push.C4488hj;
import com.xiaomi.push.C4492hm;
import com.xiaomi.push.C4498hs;
import com.xiaomi.push.C4517ik;
import com.xiaomi.push.C4520in;
import com.xiaomi.push.C4521io;
import com.xiaomi.push.C4531iy;
import com.xiaomi.push.C4542je;
import com.xiaomi.push.C4563l;
import com.xiaomi.push.C4688t;
import com.xiaomi.push.EnumC4494ho;
import com.xiaomi.push.EnumC4499ht;
import com.xiaomi.push.EnumC4566o;
import com.xiaomi.push.service.C4611am;
import com.xiaomi.push.service.C4661g;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.android.agoo.xiaomi.MiPushRegistar;
import s.h.e.l.l.C;

public class XMPushService extends Service implements AbstractC4439fx {

    /* renamed from: a */
    public static int f13075a = 1;

    /* renamed from: d */
    public static final int f13076d = Process.myPid();

    /* renamed from: a */
    public long f13077a = 0;

    /* renamed from: a */
    public ContentObserver f13078a;

    /* renamed from: a */
    public Messenger f13079a = null;

    /* renamed from: a */
    public C4433fs f13080a;

    /* renamed from: a */
    public AbstractC4435fu f13081a;

    /* renamed from: a */
    public C4437fv f13082a;

    /* renamed from: a */
    public AbstractC4441fz f13083a = new C4644bi(this);

    /* renamed from: a */
    public C4578e f13084a;

    /* renamed from: a */
    public C4589p f13085a;

    /* renamed from: a */
    public C4610al f13086a = null;

    /* renamed from: a */
    public C4629aw f13087a;

    /* renamed from: a */
    public C4658d f13088a;

    /* renamed from: a */
    public C4661g f13089a = null;

    /* renamed from: a */
    public Class f13090a = XMJobService.class;

    /* renamed from: a */
    public String f13091a;

    /* renamed from: a */
    public ArrayList<AbstractC4585l> f13092a = new ArrayList<>();

    /* renamed from: a */
    public Collection<AbstractC4601af> f13093a = Collections.synchronizedCollection(new ArrayList());

    /* renamed from: b */
    public int f13094b = 0;

    /* renamed from: b */
    public ContentObserver f13095b;

    /* renamed from: c */
    public int f13096c = 0;

    /* renamed from: com.xiaomi.push.service.XMPushService$a */
    public class C4574a extends AbstractC4582i {

        /* renamed from: a */
        public C4611am.C4613b f13098a = null;

        public C4574a(C4611am.C4613b bVar) {
            super(9);
            this.f13098a = bVar;
        }

        @Override // com.xiaomi.push.service.XMPushService.AbstractC4582i, com.xiaomi.push.service.XMPushService.AbstractC4582i
        /* renamed from: a */
        public String mo41924a() {
            return "bind the client. " + this.f13098a.f13194g;
        }

        @Override // com.xiaomi.push.service.XMPushService.AbstractC4582i, com.xiaomi.push.service.XMPushService.AbstractC4582i
        /* renamed from: a */
        public void m13820a() {
            String str;
            try {
                if (!XMPushService.this.m13817c()) {
                    AbstractC4163b.m11306d("trying bind while the connection is not created, quit!");
                    return;
                }
                C4611am.C4613b a = C4611am.mo42670a().mo42671a(this.f13098a.f13194g, this.f13098a.f13188b);
                if (a == null) {
                    str = "ignore bind because the channel " + this.f13098a.f13194g + " is removed ";
                } else if (a.f13182a == C4611am.EnumC4617c.unbind) {
                    a.mo42683a(C4611am.EnumC4617c.binding, 0, 0, (String) null, (String) null);
                    XMPushService.this.f13081a.mo41890a(a);
                    C4486hi.m12897a(XMPushService.this, a);
                    return;
                } else {
                    str = "trying duplicate bind, ingore! " + a.f13182a;
                }
                AbstractC4163b.m11301a(str);
            } catch (Exception e) {
                AbstractC4163b.m11303a(e);
                XMPushService.this.mo42622a(10, e);
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: com.xiaomi.push.service.XMPushService$b */
    public static class C4575b extends AbstractC4582i {

        /* renamed from: a */
        public final C4611am.C4613b f13099a;

        public C4575b(C4611am.C4613b bVar) {
            super(12);
            this.f13099a = bVar;
        }

        @Override // com.xiaomi.push.service.XMPushService.AbstractC4582i, com.xiaomi.push.service.XMPushService.AbstractC4582i
        /* renamed from: a */
        public String mo41924a() {
            return "bind time out. chid=" + this.f13099a.f13194g;
        }

        @Override // com.xiaomi.push.service.XMPushService.AbstractC4582i, com.xiaomi.push.service.XMPushService.AbstractC4582i
        /* renamed from: a */
        public void m13822a() {
            this.f13099a.mo42683a(C4611am.EnumC4617c.unbind, 1, 21, (String) null, (String) null);
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C4575b)) {
                return false;
            }
            return TextUtils.equals(((C4575b) obj).f13099a.f13194g, this.f13099a.f13194g);
        }

        public int hashCode() {
            return this.f13099a.f13194g.hashCode();
        }
    }

    /* renamed from: com.xiaomi.push.service.XMPushService$c */
    public class C4576c extends AbstractC4582i {

        /* renamed from: a */
        public C4428fn f13100a = null;

        public C4576c(C4428fn fnVar) {
            super(8);
            this.f13100a = fnVar;
        }

        @Override // com.xiaomi.push.service.XMPushService.AbstractC4582i, com.xiaomi.push.service.XMPushService.AbstractC4582i
        /* renamed from: a */
        public String mo41924a() {
            return "receive a message.";
        }

        @Override // com.xiaomi.push.service.XMPushService.AbstractC4582i, com.xiaomi.push.service.XMPushService.AbstractC4582i
        /* renamed from: a */
        public void m13824a() {
            XMPushService.this.f13086a.mo42667a(this.f13100a);
        }
    }

    /* renamed from: com.xiaomi.push.service.XMPushService$d */
    public class C4577d extends AbstractC4582i {
        public C4577d() {
            super(1);
        }

        @Override // com.xiaomi.push.service.XMPushService.AbstractC4582i, com.xiaomi.push.service.XMPushService.AbstractC4582i
        /* renamed from: a */
        public String mo41924a() {
            return "do reconnect..";
        }

        @Override // com.xiaomi.push.service.XMPushService.AbstractC4582i, com.xiaomi.push.service.XMPushService.AbstractC4582i
        /* renamed from: a */
        public void m13826a() {
            if (XMPushService.this.m13810a()) {
                XMPushService.this.m13781f();
            } else {
                AbstractC4163b.m11301a("should not connect. quit the job.");
            }
        }
    }

    /* renamed from: com.xiaomi.push.service.XMPushService$e */
    public class C4578e extends BroadcastReceiver {
        public C4578e() {
        }

        public void onReceive(Context context, Intent intent) {
            XMPushService.this.onStart(intent, XMPushService.f13075a);
        }
    }

    /* renamed from: com.xiaomi.push.service.XMPushService$f */
    public class C4579f extends AbstractC4582i {

        /* renamed from: a */
        public Exception f13105a;

        /* renamed from: b */
        public int f13106b;

        public C4579f(int i, Exception exc) {
            super(2);
            this.f13106b = i;
            this.f13105a = exc;
        }

        @Override // com.xiaomi.push.service.XMPushService.AbstractC4582i, com.xiaomi.push.service.XMPushService.AbstractC4582i
        /* renamed from: a */
        public String mo41924a() {
            return "disconnect the connection.";
        }

        @Override // com.xiaomi.push.service.XMPushService.AbstractC4582i, com.xiaomi.push.service.XMPushService.AbstractC4582i
        /* renamed from: a */
        public void m13828a() {
            XMPushService.this.mo42622a(this.f13106b, this.f13105a);
        }
    }

    /* renamed from: com.xiaomi.push.service.XMPushService$g */
    public class C4580g extends AbstractC4582i {
        public C4580g() {
            super(65535);
        }

        @Override // com.xiaomi.push.service.XMPushService.AbstractC4582i, com.xiaomi.push.service.XMPushService.AbstractC4582i
        /* renamed from: a */
        public String mo41924a() {
            return "Init Job";
        }

        @Override // com.xiaomi.push.service.XMPushService.AbstractC4582i, com.xiaomi.push.service.XMPushService.AbstractC4582i
        /* renamed from: a */
        public void m13830a() {
            XMPushService.this.mo42635c();
        }
    }

    /* renamed from: com.xiaomi.push.service.XMPushService$h */
    public class C4581h extends AbstractC4582i {

        /* renamed from: a */
        public Intent f13108a = null;

        public C4581h(Intent intent) {
            super(15);
            this.f13108a = intent;
        }

        @Override // com.xiaomi.push.service.XMPushService.AbstractC4582i, com.xiaomi.push.service.XMPushService.AbstractC4582i
        /* renamed from: a */
        public String mo41924a() {
            return "Handle intent action = " + this.f13108a.getAction();
        }

        @Override // com.xiaomi.push.service.XMPushService.AbstractC4582i, com.xiaomi.push.service.XMPushService.AbstractC4582i
        /* renamed from: a */
        public void m13832a() {
            XMPushService.this.m13773c((XMPushService) this.f13108a);
        }
    }

    /* renamed from: com.xiaomi.push.service.XMPushService$i */
    public static abstract class AbstractC4582i extends C4661g.AbstractRunnableC4663b {
        public AbstractC4582i(int i) {
            super(i);
        }

        /* renamed from: a */
        public abstract String mo41924a();

        /* renamed from: a */
        public abstract void m13834a();

        public void run() {
            int i = this.f13330a;
            if (!(i == 4 || i == 8)) {
                AbstractC4163b.m11301a("JOB: " + mo41924a());
            }
            m13834a();
        }
    }

    /* renamed from: com.xiaomi.push.service.XMPushService$j */
    public class C4583j extends AbstractC4582i {
        public C4583j() {
            super(5);
        }

        @Override // com.xiaomi.push.service.XMPushService.AbstractC4582i, com.xiaomi.push.service.XMPushService.AbstractC4582i
        /* renamed from: a */
        public String mo41924a() {
            return "ask the job queue to quit";
        }

        @Override // com.xiaomi.push.service.XMPushService.AbstractC4582i, com.xiaomi.push.service.XMPushService.AbstractC4582i
        /* renamed from: a */
        public void m13836a() {
            XMPushService.this.f13089a.m14100a();
        }
    }

    /* renamed from: com.xiaomi.push.service.XMPushService$k */
    public class C4584k extends AbstractC4582i {

        /* renamed from: a */
        public AbstractC4456gl f13111a = null;

        public C4584k(AbstractC4456gl glVar) {
            super(8);
            this.f13111a = glVar;
        }

        @Override // com.xiaomi.push.service.XMPushService.AbstractC4582i, com.xiaomi.push.service.XMPushService.AbstractC4582i
        /* renamed from: a */
        public String mo41924a() {
            return "receive a message.";
        }

        @Override // com.xiaomi.push.service.XMPushService.AbstractC4582i, com.xiaomi.push.service.XMPushService.AbstractC4582i
        /* renamed from: a */
        public void m13838a() {
            XMPushService.this.f13086a.mo42668a(this.f13111a);
        }
    }

    /* renamed from: com.xiaomi.push.service.XMPushService$l */
    public interface AbstractC4585l {
        /* renamed from: a */
        void mo41998a();
    }

    /* renamed from: com.xiaomi.push.service.XMPushService$m */
    public class C4586m extends AbstractC4582i {

        /* renamed from: a */
        public boolean f13114a;

        public C4586m(boolean z) {
            super(4);
            this.f13114a = z;
        }

        @Override // com.xiaomi.push.service.XMPushService.AbstractC4582i, com.xiaomi.push.service.XMPushService.AbstractC4582i
        /* renamed from: a */
        public String mo41924a() {
            return "send ping..";
        }

        @Override // com.xiaomi.push.service.XMPushService.AbstractC4582i, com.xiaomi.push.service.XMPushService.AbstractC4582i
        /* renamed from: a */
        public void m13841a() {
            if (XMPushService.this.m13817c()) {
                try {
                    if (!this.f13114a) {
                        C4486hi.m12892a();
                    }
                    XMPushService.this.f13081a.mo41906b(this.f13114a);
                } catch (C4449gf e) {
                    AbstractC4163b.m11303a(e);
                    XMPushService.this.mo42622a(10, e);
                }
            }
        }
    }

    /* renamed from: com.xiaomi.push.service.XMPushService$n */
    public class C4587n extends AbstractC4582i {

        /* renamed from: a */
        public C4611am.C4613b f13116a = null;

        public C4587n(C4611am.C4613b bVar) {
            super(4);
            this.f13116a = bVar;
        }

        @Override // com.xiaomi.push.service.XMPushService.AbstractC4582i, com.xiaomi.push.service.XMPushService.AbstractC4582i
        /* renamed from: a */
        public String mo41924a() {
            return "rebind the client. " + this.f13116a.f13194g;
        }

        @Override // com.xiaomi.push.service.XMPushService.AbstractC4582i, com.xiaomi.push.service.XMPushService.AbstractC4582i
        /* renamed from: a */
        public void m13843a() {
            try {
                this.f13116a.mo42683a(C4611am.EnumC4617c.unbind, 1, 16, (String) null, (String) null);
                XMPushService.this.f13081a.mo41891a(this.f13116a.f13194g, this.f13116a.f13188b);
                this.f13116a.mo42683a(C4611am.EnumC4617c.binding, 1, 16, (String) null, (String) null);
                XMPushService.this.f13081a.mo41890a(this.f13116a);
            } catch (C4449gf e) {
                AbstractC4163b.m11303a(e);
                XMPushService.this.mo42622a(10, e);
            }
        }
    }

    /* renamed from: com.xiaomi.push.service.XMPushService$o */
    public class C4588o extends AbstractC4582i {
        public C4588o() {
            super(3);
        }

        @Override // com.xiaomi.push.service.XMPushService.AbstractC4582i, com.xiaomi.push.service.XMPushService.AbstractC4582i
        /* renamed from: a */
        public String mo41924a() {
            return "reset the connection.";
        }

        @Override // com.xiaomi.push.service.XMPushService.AbstractC4582i, com.xiaomi.push.service.XMPushService.AbstractC4582i
        /* renamed from: a */
        public void m13845a() {
            XMPushService.this.mo42622a(11, (Exception) null);
            if (XMPushService.this.m13810a()) {
                XMPushService.this.m13781f();
            }
        }
    }

    /* renamed from: com.xiaomi.push.service.XMPushService$p */
    public class C4589p extends BroadcastReceiver {
        public C4589p() {
        }

        public void onReceive(Context context, Intent intent) {
            XMPushService.this.onStart(intent, 1);
        }
    }

    /* renamed from: com.xiaomi.push.service.XMPushService$q */
    public class C4590q extends AbstractC4582i {

        /* renamed from: a */
        public C4611am.C4613b f13120a = null;

        /* renamed from: a */
        public String f13121a;

        /* renamed from: b */
        public int f13122b;

        /* renamed from: b */
        public String f13123b;

        public C4590q(C4611am.C4613b bVar, int i, String str, String str2) {
            super(9);
            this.f13120a = bVar;
            this.f13122b = i;
            this.f13121a = str;
            this.f13123b = str2;
        }

        @Override // com.xiaomi.push.service.XMPushService.AbstractC4582i, com.xiaomi.push.service.XMPushService.AbstractC4582i
        /* renamed from: a */
        public String mo41924a() {
            return "unbind the channel. " + this.f13120a.f13194g;
        }

        @Override // com.xiaomi.push.service.XMPushService.AbstractC4582i, com.xiaomi.push.service.XMPushService.AbstractC4582i
        /* renamed from: a */
        public void m13847a() {
            if (!(this.f13120a.f13182a == C4611am.EnumC4617c.unbind || XMPushService.this.f13081a == null)) {
                try {
                    XMPushService.this.f13081a.mo41891a(this.f13120a.f13194g, this.f13120a.f13188b);
                } catch (C4449gf e) {
                    AbstractC4163b.m11303a(e);
                    XMPushService.this.mo42622a(10, e);
                }
            }
            this.f13120a.mo42683a(C4611am.EnumC4617c.unbind, this.f13122b, 0, this.f13123b, this.f13121a);
        }
    }

    static {
        C.i(16777286);
        C4342db.m12034a("cn.app.chat.xiaomi.net", "cn.app.chat.xiaomi.net");
    }

    @TargetApi(11)
    /* renamed from: a */
    public static Notification m13748a(Context context) {
        Intent intent = new Intent(context, XMPushService.class);
        if (Build.VERSION.SDK_INT >= 11) {
            Notification.Builder builder = new Notification.Builder(context);
            builder.setSmallIcon(context.getApplicationInfo().icon);
            builder.setContentTitle("Push Service");
            builder.setContentText("Push Service");
            builder.setContentIntent(PendingIntent.getActivity(context, 0, intent, 0));
            return builder.getNotification();
        }
        Notification notification = new Notification();
        PendingIntent service = PendingIntent.getService(context, 0, intent, 0);
        try {
            notification.getClass().getMethod("setLatestEventInfo", Context.class, CharSequence.class, CharSequence.class, PendingIntent.class).invoke(notification, context, "Push Service", "Push Service", service);
        } catch (Exception e) {
            AbstractC4163b.m11303a(e);
        }
        return notification;
    }

    /* renamed from: a */
    private AbstractC4456gl m13752a(AbstractC4456gl glVar, String str, String str2) {
        StringBuilder sb;
        String str3;
        C4611am a = C4611am.mo42670a();
        List<String> a2 = a.m13951a(str);
        if (a2.isEmpty()) {
            sb = new StringBuilder();
            str3 = "open channel should be called first before sending a packet, pkg=";
        } else {
            glVar.mo41976o(str);
            str = glVar.mo41967k();
            if (TextUtils.isEmpty(str)) {
                str = a2.get(0);
                glVar.mo41970l(str);
            }
            C4611am.C4613b a3 = a.mo42671a(str, glVar.mo41971m());
            if (!m13817c()) {
                sb = new StringBuilder();
                str3 = "drop a packet as the channel is not connected, chid=";
            } else if (a3 == null || a3.f13182a != C4611am.EnumC4617c.binded) {
                sb = new StringBuilder();
                str3 = "drop a packet as the channel is not opened, chid=";
            } else if (TextUtils.equals(str2, a3.f13196i)) {
                return glVar;
            } else {
                sb = new StringBuilder();
                sb.append("invalid session. ");
                sb.append(str2);
                AbstractC4163b.m11301a(sb.toString());
                return null;
            }
        }
        sb.append(str3);
        sb.append(str);
        AbstractC4163b.m11301a(sb.toString());
        return null;
    }

    /* renamed from: a */
    private C4611am.C4613b m13754a(String str, Intent intent) {
        C4611am.C4613b a = C4611am.mo42670a().mo42671a(str, intent.getStringExtra(AbstractC4621aq.f13237p));
        if (a == null) {
            a = new C4611am.C4613b(this);
        }
        a.f13194g = intent.getStringExtra(AbstractC4621aq.f13239r);
        a.f13188b = intent.getStringExtra(AbstractC4621aq.f13237p);
        a.f13190c = intent.getStringExtra(AbstractC4621aq.f13241t);
        a.f13184a = intent.getStringExtra(AbstractC4621aq.f13247z);
        a.f13192e = intent.getStringExtra(AbstractC4621aq.f13245x);
        a.f13193f = intent.getStringExtra(AbstractC4621aq.f13246y);
        a.f13186a = intent.getBooleanExtra(AbstractC4621aq.f13244w, false);
        a.f13195h = intent.getStringExtra(AbstractC4621aq.f13243v);
        a.f13196i = intent.getStringExtra(AbstractC4621aq.f13214C);
        a.f13191d = intent.getStringExtra(AbstractC4621aq.f13242u);
        a.f13183a = this.f13088a;
        a.mo42681a((Messenger) intent.getParcelableExtra(AbstractC4621aq.f13218G));
        a.f13176a = getApplicationContext();
        C4611am.mo42670a().mo42676a(a);
        return a;
    }

    /* renamed from: a */
    private String m13756a() {
        String str;
        C4261ao.m11670a();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        Object obj = new Object();
        String str2 = null;
        if (MiPushRegistar.PACKAGE_XIAOMI.equals(getPackageName())) {
            C4626at a = C4626at.m13995a(this);
            str = null;
            while (true) {
                if (!TextUtils.isEmpty(str) && a.mo42688a() != 0) {
                    break;
                }
                if (TextUtils.isEmpty(str)) {
                    str = C4563l.m13724a("ro.miui.region");
                    if (TextUtils.isEmpty(str)) {
                        str = C4563l.m13724a("ro.product.locale.region");
                    }
                }
                try {
                    synchronized (obj) {
                        obj.wait(100);
                    }
                } catch (InterruptedException unused) {
                }
            }
        } else {
            str = C4563l.m13728b();
        }
        if (!TextUtils.isEmpty(str)) {
            C4591a.m13848a(getApplicationContext()).mo42650b(str);
            str2 = C4563l.m13722a(str).name();
        }
        AbstractC4163b.m11301a("wait region :" + str2 + " cost = " + (SystemClock.elapsedRealtime() - elapsedRealtime));
        return str2;
    }

    /* renamed from: a */
    private void m13758a(BroadcastReceiver broadcastReceiver) {
        if (broadcastReceiver != null) {
            try {
                unregisterReceiver(broadcastReceiver);
            } catch (IllegalArgumentException e) {
                AbstractC4163b.m11303a(e);
            }
        }
    }

    /* renamed from: a */
    private void m13759a(Intent intent) {
        String stringExtra = intent.getStringExtra(AbstractC4621aq.f13247z);
        String stringExtra2 = intent.getStringExtra(AbstractC4621aq.f13214C);
        Bundle bundleExtra = intent.getBundleExtra("ext_packet");
        C4611am a = C4611am.mo42670a();
        C4428fn fnVar = null;
        if (bundleExtra != null) {
            C4455gk gkVar = (C4455gk) m13752a(new C4455gk(bundleExtra), stringExtra, stringExtra2);
            if (gkVar != null) {
                fnVar = C4428fn.m12594a(gkVar, a.mo42671a(gkVar.mo41967k(), gkVar.mo41971m()).f13195h);
            } else {
                return;
            }
        } else {
            byte[] byteArrayExtra = intent.getByteArrayExtra("ext_raw_packet");
            if (byteArrayExtra != null) {
                long longExtra = intent.getLongExtra(AbstractC4621aq.f13237p, 0);
                String stringExtra3 = intent.getStringExtra(AbstractC4621aq.f13238q);
                String stringExtra4 = intent.getStringExtra("ext_chid");
                C4611am.C4613b a2 = a.mo42671a(stringExtra4, Long.toString(longExtra));
                if (a2 != null) {
                    C4428fn fnVar2 = new C4428fn();
                    try {
                        fnVar2.mo41866a(Integer.parseInt(stringExtra4));
                    } catch (NumberFormatException unused) {
                    }
                    fnVar2.mo41869a("SECMSG", (String) null);
                    fnVar2.mo41867a(longExtra, "xiaomi.com", stringExtra3);
                    fnVar2.mo41868a(intent.getStringExtra("ext_pkt_id"));
                    fnVar2.mo41871a(byteArrayExtra, a2.f13195h);
                    fnVar = fnVar2;
                }
            }
        }
        if (fnVar != null) {
            m13774c(new C4630ax(this, fnVar));
        }
    }

    /* renamed from: a */
    private void m13760a(Intent intent, int i) {
        byte[] byteArrayExtra = intent.getByteArrayExtra("mipush_payload");
        boolean booleanExtra = intent.getBooleanExtra("com.xiaomi.mipush.MESSAGE_CACHE", true);
        C4520in inVar = new C4520in();
        try {
            C4531iy.m13589a(inVar, byteArrayExtra);
            C4251ai.m11641a(getApplicationContext()).mo41477a((C4251ai.AbstractRunnableC4252a) new C4633b(inVar, new WeakReference(this), booleanExtra), i);
        } catch (C4542je unused) {
            AbstractC4163b.m11306d("aw_ping : send help app ping  error");
        }
    }

    /* renamed from: a */
    private void m13763a(String str, int i) {
        Collection<C4611am.C4613b> a = C4611am.mo42670a().m13950a(str);
        if (a != null) {
            for (C4611am.C4613b bVar : a) {
                if (bVar != null) {
                    mo42624a(new C4590q(bVar, i, null, null));
                }
            }
        }
        C4611am.mo42670a().m13957a(str);
    }

    /* renamed from: a */
    private boolean m13764a(Context context) {
        Intent registerReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (registerReceiver == null) {
            return false;
        }
        int intExtra = registerReceiver.getIntExtra("status", -1);
        return intExtra == 2 || intExtra == 5;
    }

    /* renamed from: a */
    private boolean m13766a(String str, Intent intent) {
        C4611am.C4613b a = C4611am.mo42670a().mo42671a(str, intent.getStringExtra(AbstractC4621aq.f13237p));
        boolean z = false;
        if (a == null || str == null) {
            return false;
        }
        String stringExtra = intent.getStringExtra(AbstractC4621aq.f13214C);
        String stringExtra2 = intent.getStringExtra(AbstractC4621aq.f13243v);
        if (!TextUtils.isEmpty(a.f13196i) && !TextUtils.equals(stringExtra, a.f13196i)) {
            AbstractC4163b.m11301a("session changed. old session=" + a.f13196i + ", new session=" + stringExtra + " chid = " + str);
            z = true;
        }
        if (stringExtra2.equals(a.f13195h)) {
            return z;
        }
        AbstractC4163b.m11301a("security changed. chid = " + str + " sechash = " + C4284be.m11797a(stringExtra2));
        return true;
    }

    /* renamed from: a */
    private int[] m13767a() {
        String[] split;
        String a = C4605ah.m13919a(getApplicationContext()).mo42657a(EnumC4499ht.FallDownTimeRange.mo42043a(), "");
        if (!TextUtils.isEmpty(a) && (split = a.split(Constants.ACCEPT_TIME_SEPARATOR_SP)) != null && split.length >= 2) {
            int[] iArr = new int[2];
            try {
                iArr[0] = Integer.valueOf(split[0]).intValue();
                iArr[1] = Integer.valueOf(split[1]).intValue();
                if (iArr[0] < 0 || iArr[0] > 23 || iArr[1] < 0 || iArr[1] > 23 || iArr[0] == iArr[1]) {
                    return null;
                }
                return iArr;
            } catch (NumberFormatException e) {
                AbstractC4163b.m11306d("parse falldown time range failure: " + e);
            }
        }
        return null;
    }

    /* renamed from: b */
    private void m13768b(Intent intent) {
        String stringExtra = intent.getStringExtra(AbstractC4621aq.f13247z);
        String stringExtra2 = intent.getStringExtra(AbstractC4621aq.f13214C);
        Parcelable[] parcelableArrayExtra = intent.getParcelableArrayExtra("ext_packets");
        int length = parcelableArrayExtra.length;
        C4455gk[] gkVarArr = new C4455gk[length];
        intent.getBooleanExtra("ext_encrypt", true);
        for (int i = 0; i < parcelableArrayExtra.length; i++) {
            gkVarArr[i] = new C4455gk((Bundle) parcelableArrayExtra[i]);
            gkVarArr[i] = (C4455gk) m13752a(gkVarArr[i], stringExtra, stringExtra2);
            if (gkVarArr[i] == null) {
                return;
            }
        }
        C4611am a = C4611am.mo42670a();
        C4428fn[] fnVarArr = new C4428fn[length];
        for (int i2 = 0; i2 < length; i2++) {
            C4455gk gkVar = gkVarArr[i2];
            fnVarArr[i2] = C4428fn.m12594a(gkVar, a.mo42671a(gkVar.mo41967k(), gkVar.mo41971m()).f13195h);
        }
        m13774c(new C4657c(this, fnVarArr));
    }

    /* renamed from: b */
    private void m13770b(boolean z) {
        this.f13077a = System.currentTimeMillis();
        if (m13817c()) {
            if (this.f13081a.m12674d() || this.f13081a.mo41909e() || C4274az.m11737d(this)) {
                m13774c(new C4586m(z));
                return;
            }
            m13774c(new C4579f(17, null));
        }
        mo42630a(true);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: c */
    private void mo42635c() {
        String str;
        C4591a a = C4591a.m13848a(getApplicationContext());
        String a2 = a.mo42647a();
        AbstractC4163b.m11301a("region of cache is " + a2);
        if (TextUtils.isEmpty(a2)) {
            a2 = m13756a();
        }
        if (!TextUtils.isEmpty(a2)) {
            this.f13091a = a2;
            a.mo42648a(a2);
            if (EnumC4566o.Global.name().equals(this.f13091a)) {
                str = "app.chat.global.xiaomi.net";
            } else if (EnumC4566o.Europe.name().equals(this.f13091a)) {
                str = "fr.app.chat.global.xiaomi.net";
            } else if (EnumC4566o.Russia.name().equals(this.f13091a)) {
                str = "ru.app.chat.global.xiaomi.net";
            } else if (EnumC4566o.India.name().equals(this.f13091a)) {
                str = "idmb.app.chat.global.xiaomi.net";
            }
            C4437fv.m12679a(str);
        } else {
            this.f13091a = EnumC4566o.China.name();
        }
        if (EnumC4566o.China.name().equals(this.f13091a)) {
            C4437fv.m12679a("cn.app.chat.xiaomi.net");
        }
        if (m13786h()) {
            C4654bs bsVar = new C4654bs(this, 11);
            mo42624a(bsVar);
            C4671l.m14147a(new C4655bt(this, bsVar));
        }
        try {
            if (C4688t.m14223a()) {
                this.f13088a.mo42715a(this);
            }
        } catch (Exception e) {
            AbstractC4163b.m11303a(e);
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: c */
    private void m13773c(Intent intent) {
        String str;
        String str2;
        C4658d dVar;
        boolean z;
        int i;
        AbstractC4582i nVar;
        String str3;
        String str4;
        String str5;
        AbstractC4582i axVar;
        C4611am a = C4611am.mo42670a();
        boolean z2 = true;
        boolean z3 = false;
        int i2 = 0;
        if (AbstractC4621aq.f13225d.equalsIgnoreCase(intent.getAction()) || AbstractC4621aq.f13231j.equalsIgnoreCase(intent.getAction())) {
            String stringExtra = intent.getStringExtra(AbstractC4621aq.f13239r);
            if (TextUtils.isEmpty(intent.getStringExtra(AbstractC4621aq.f13243v))) {
                str = "security is empty. ignore.";
            } else if (stringExtra != null) {
                boolean a2 = m13766a(stringExtra, intent);
                C4611am.C4613b a3 = m13754a(stringExtra, intent);
                if (!C4274az.m11735b(this)) {
                    dVar = this.f13088a;
                    z = false;
                    i = 2;
                } else {
                    if (m13817c()) {
                        C4611am.EnumC4617c cVar = a3.f13182a;
                        if (cVar == C4611am.EnumC4617c.unbind) {
                            nVar = new C4574a(a3);
                        } else if (a2) {
                            nVar = new C4587n(a3);
                        } else if (cVar == C4611am.EnumC4617c.binding) {
                            str = String.format("the client is binding. %1$s %2$s.", a3.f13194g, C4611am.C4613b.m13963a(a3.f13188b));
                        } else if (cVar == C4611am.EnumC4617c.binded) {
                            dVar = this.f13088a;
                            z = true;
                            i = 0;
                        } else {
                            return;
                        }
                    }
                    mo42630a(true);
                    return;
                }
                dVar.mo42718a(this, a3, z, i, null);
                return;
            } else {
                str2 = "channel id is empty, do nothing!";
                AbstractC4163b.m11306d(str2);
                return;
            }
            AbstractC4163b.m11301a(str);
            return;
        } else if (AbstractC4621aq.f13230i.equalsIgnoreCase(intent.getAction())) {
            String stringExtra2 = intent.getStringExtra(AbstractC4621aq.f13247z);
            String stringExtra3 = intent.getStringExtra(AbstractC4621aq.f13239r);
            String stringExtra4 = intent.getStringExtra(AbstractC4621aq.f13237p);
            AbstractC4163b.m11301a("Service called close channel chid = " + stringExtra3 + " res = " + C4611am.C4613b.m13963a(stringExtra4));
            if (TextUtils.isEmpty(stringExtra3)) {
                for (String str6 : a.m13951a(stringExtra2)) {
                    m13763a(str6, 2);
                }
                return;
            } else if (TextUtils.isEmpty(stringExtra4)) {
                m13763a(stringExtra3, 2);
                return;
            } else {
                mo42628a(stringExtra3, stringExtra4, 2, null, null);
                return;
            }
        } else if (AbstractC4621aq.f13226e.equalsIgnoreCase(intent.getAction())) {
            m13759a(intent);
            return;
        } else if (AbstractC4621aq.f13228g.equalsIgnoreCase(intent.getAction())) {
            m13768b(intent);
            return;
        } else {
            if (AbstractC4621aq.f13227f.equalsIgnoreCase(intent.getAction())) {
                AbstractC4456gl a4 = m13752a(new C4453gj(intent.getBundleExtra("ext_packet")), intent.getStringExtra(AbstractC4621aq.f13247z), intent.getStringExtra(AbstractC4621aq.f13214C));
                if (a4 != null) {
                    axVar = new C4630ax(this, C4428fn.m12594a(a4, a.mo42671a(a4.mo41967k(), a4.mo41971m()).f13195h));
                } else {
                    return;
                }
            } else if (AbstractC4621aq.f13229h.equalsIgnoreCase(intent.getAction())) {
                AbstractC4456gl a5 = m13752a(new C4458gn(intent.getBundleExtra("ext_packet")), intent.getStringExtra(AbstractC4621aq.f13247z), intent.getStringExtra(AbstractC4621aq.f13214C));
                if (a5 != null) {
                    axVar = new C4630ax(this, C4428fn.m12594a(a5, a.mo42671a(a5.mo41967k(), a5.mo41971m()).f13195h));
                } else {
                    return;
                }
            } else if (AbstractC4621aq.f13232k.equals(intent.getAction())) {
                String stringExtra5 = intent.getStringExtra(AbstractC4621aq.f13239r);
                String stringExtra6 = intent.getStringExtra(AbstractC4621aq.f13237p);
                if (stringExtra5 != null) {
                    AbstractC4163b.m11301a("request reset connection from chid = " + stringExtra5);
                    C4611am.C4613b a6 = C4611am.mo42670a().mo42671a(stringExtra5, stringExtra6);
                    if (a6 != null && a6.f13195h.equals(intent.getStringExtra(AbstractC4621aq.f13243v)) && a6.f13182a == C4611am.EnumC4617c.binded) {
                        AbstractC4435fu a7 = m13792a();
                        if (a7 == null || !a7.mo41901a(System.currentTimeMillis() - 15000)) {
                            nVar = new C4588o();
                        } else {
                            return;
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            } else {
                C4611am.C4613b bVar = null;
                if (AbstractC4621aq.f13233l.equals(intent.getAction())) {
                    String stringExtra7 = intent.getStringExtra(AbstractC4621aq.f13247z);
                    List<String> a8 = a.m13951a(stringExtra7);
                    if (a8.isEmpty()) {
                        str5 = "open channel should be called first before update info, pkg=" + stringExtra7;
                    } else {
                        String stringExtra8 = intent.getStringExtra(AbstractC4621aq.f13239r);
                        String stringExtra9 = intent.getStringExtra(AbstractC4621aq.f13237p);
                        if (TextUtils.isEmpty(stringExtra8)) {
                            stringExtra8 = a8.get(0);
                        }
                        if (TextUtils.isEmpty(stringExtra9)) {
                            Collection<C4611am.C4613b> a9 = a.m13950a(stringExtra8);
                            if (a9 != null && !a9.isEmpty()) {
                                bVar = a9.iterator().next();
                            }
                        } else {
                            bVar = a.mo42671a(stringExtra8, stringExtra9);
                        }
                        if (bVar != null) {
                            if (intent.hasExtra(AbstractC4621aq.f13245x)) {
                                bVar.f13192e = intent.getStringExtra(AbstractC4621aq.f13245x);
                            }
                            if (intent.hasExtra(AbstractC4621aq.f13246y)) {
                                bVar.f13193f = intent.getStringExtra(AbstractC4621aq.f13246y);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                } else {
                    if ("android.intent.action.SCREEN_ON".equals(intent.getAction()) || "android.intent.action.SCREEN_OFF".equals(intent.getAction())) {
                        if ("android.intent.action.SCREEN_ON".equals(intent.getAction())) {
                            if (!m13789j()) {
                                AbstractC4163b.m11301a("exit falldown mode, activate alarm.");
                                m13779e();
                                if (m13817c() || m13818d()) {
                                    return;
                                }
                                mo42630a(true);
                                return;
                            }
                            return;
                        } else if ("android.intent.action.SCREEN_OFF".equals(intent.getAction()) && m13789j() && C4418fe.m12535a()) {
                            str3 = "enter falldown mode, stop alarm.";
                        } else {
                            return;
                        }
                    } else if ("com.xiaomi.mipush.REGISTER_APP".equals(intent.getAction())) {
                        if (!C4626at.m13995a(getApplicationContext()).m13998a() || C4626at.m13995a(getApplicationContext()).mo42688a() != 0) {
                            byte[] byteArrayExtra = intent.getByteArrayExtra("mipush_payload");
                            String stringExtra10 = intent.getStringExtra("mipush_app_package");
                            boolean booleanExtra = intent.getBooleanExtra("mipush_env_chanage", false);
                            int intExtra = intent.getIntExtra("mipush_env_type", 1);
                            C4673m.m14150a(this).mo42745d(stringExtra10);
                            if (!booleanExtra || MiPushRegistar.PACKAGE_XIAOMI.equals(getPackageName())) {
                                mo42631a(byteArrayExtra, stringExtra10);
                                return;
                            }
                            nVar = new C4656bu(this, 14, intExtra, byteArrayExtra, stringExtra10);
                        } else {
                            str5 = "register without being provisioned. " + intent.getStringExtra("mipush_app_package");
                        }
                    } else if ("com.xiaomi.mipush.SEND_MESSAGE".equals(intent.getAction()) || "com.xiaomi.mipush.UNREGISTER_APP".equals(intent.getAction())) {
                        String stringExtra11 = intent.getStringExtra("mipush_app_package");
                        byte[] byteArrayExtra2 = intent.getByteArrayExtra("mipush_payload");
                        boolean booleanExtra2 = intent.getBooleanExtra("com.xiaomi.mipush.MESSAGE_CACHE", true);
                        if ("com.xiaomi.mipush.UNREGISTER_APP".equals(intent.getAction())) {
                            C4673m.m14150a(this).mo42742a(stringExtra11);
                        }
                        mo42629a(stringExtra11, byteArrayExtra2, booleanExtra2);
                        return;
                    } else if (AbstractC4627au.f13253a.equals(intent.getAction())) {
                        String stringExtra12 = intent.getStringExtra("uninstall_pkg_name");
                        if (stringExtra12 != null && !TextUtils.isEmpty(stringExtra12.trim())) {
                            try {
                                getPackageManager().getPackageInfo(stringExtra12, 0);
                                z2 = false;
                            } catch (PackageManager.NameNotFoundException unused) {
                            }
                            if (!"com.xiaomi.channel".equals(stringExtra12) || C4611am.mo42670a().m13950a("1").isEmpty() || !z2) {
                                SharedPreferences sharedPreferences = getSharedPreferences("pref_registered_pkg_names", 0);
                                String string = sharedPreferences.getString(stringExtra12, null);
                                if (!TextUtils.isEmpty(string) && z2) {
                                    SharedPreferences.Editor edit = sharedPreferences.edit();
                                    edit.remove(stringExtra12);
                                    edit.commit();
                                    if (C4592aa.m13896b((Context) this, stringExtra12)) {
                                        C4592aa.m13894b((Context) this, stringExtra12);
                                    }
                                    C4592aa.m13879a((Context) this, stringExtra12);
                                    if (m13817c() && string != null) {
                                        try {
                                            C4684w.m14210a(this, C4684w.m14205a(stringExtra12, string));
                                            AbstractC4163b.m11301a("uninstall " + stringExtra12 + " msg sent");
                                            return;
                                        } catch (C4449gf e) {
                                            AbstractC4163b.m11306d("Fail to send Message: " + e.getMessage());
                                            mo42622a(10, e);
                                            return;
                                        }
                                    } else {
                                        return;
                                    }
                                } else {
                                    return;
                                }
                            } else {
                                m13763a("1", 0);
                                str5 = "close the miliao channel as the app is uninstalled.";
                            }
                        } else {
                            return;
                        }
                    } else if ("com.xiaomi.mipush.CLEAR_NOTIFICATION".equals(intent.getAction())) {
                        String stringExtra13 = intent.getStringExtra(AbstractC4621aq.f13247z);
                        int intExtra2 = intent.getIntExtra(AbstractC4621aq.f13212A, -2);
                        if (TextUtils.isEmpty(stringExtra13)) {
                            return;
                        }
                        if (intExtra2 >= -1) {
                            C4592aa.m13880a(this, stringExtra13, intExtra2);
                            return;
                        } else {
                            C4592aa.m13882a(this, stringExtra13, intent.getStringExtra(AbstractC4621aq.f13216E), intent.getStringExtra(AbstractC4621aq.f13217F));
                            return;
                        }
                    } else if ("com.xiaomi.mipush.SET_NOTIFICATION_TYPE".equals(intent.getAction())) {
                        String stringExtra14 = intent.getStringExtra(AbstractC4621aq.f13247z);
                        String stringExtra15 = intent.getStringExtra(AbstractC4621aq.f13215D);
                        if (intent.hasExtra(AbstractC4621aq.f13213B)) {
                            int intExtra3 = intent.getIntExtra(AbstractC4621aq.f13213B, 0);
                            str4 = C4284be.m11798b(stringExtra14 + intExtra3);
                            i2 = intExtra3;
                            z2 = false;
                        } else {
                            str4 = C4284be.m11798b(stringExtra14);
                        }
                        if (TextUtils.isEmpty(stringExtra14) || !TextUtils.equals(stringExtra15, str4)) {
                            str2 = "invalid notification for " + stringExtra14;
                            AbstractC4163b.m11306d(str2);
                            return;
                        } else if (z2) {
                            C4592aa.m13894b((Context) this, stringExtra14);
                            return;
                        } else {
                            C4592aa.m13895b(this, stringExtra14, i2);
                            return;
                        }
                    } else if ("com.xiaomi.mipush.DISABLE_PUSH".equals(intent.getAction())) {
                        String stringExtra16 = intent.getStringExtra("mipush_app_package");
                        if (!TextUtils.isEmpty(stringExtra16)) {
                            C4673m.m14150a(this).mo42743b(stringExtra16);
                        }
                        if (!MiPushRegistar.PACKAGE_XIAOMI.equals(getPackageName())) {
                            mo42622a(19, (Exception) null);
                            m13779e();
                            stopSelf();
                            return;
                        }
                        return;
                    } else if ("com.xiaomi.mipush.DISABLE_PUSH_MESSAGE".equals(intent.getAction()) || "com.xiaomi.mipush.ENABLE_PUSH_MESSAGE".equals(intent.getAction())) {
                        String stringExtra17 = intent.getStringExtra("mipush_app_package");
                        byte[] byteArrayExtra3 = intent.getByteArrayExtra("mipush_payload");
                        String stringExtra18 = intent.getStringExtra("mipush_app_id");
                        String stringExtra19 = intent.getStringExtra("mipush_app_token");
                        if ("com.xiaomi.mipush.DISABLE_PUSH_MESSAGE".equals(intent.getAction())) {
                            C4673m.m14150a(this).mo42744c(stringExtra17);
                        }
                        if ("com.xiaomi.mipush.ENABLE_PUSH_MESSAGE".equals(intent.getAction())) {
                            C4673m.m14150a(this).mo42746e(stringExtra17);
                            C4673m.m14150a(this).mo42747f(stringExtra17);
                        }
                        if (byteArrayExtra3 == null) {
                            C4675o.m14163a(this, stringExtra17, byteArrayExtra3, ErrorCode.ERROR_INVALID_PAYLOAD, "null payload");
                            return;
                        }
                        C4675o.m14167b(stringExtra17, byteArrayExtra3);
                        mo42624a(new C4674n(this, stringExtra17, stringExtra18, stringExtra19, byteArrayExtra3));
                        if ("com.xiaomi.mipush.ENABLE_PUSH_MESSAGE".equals(intent.getAction()) && this.f13084a == null) {
                            this.f13084a = new C4578e();
                            registerReceiver(this.f13084a, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                            return;
                        }
                        return;
                    } else if ("com.xiaomi.mipush.SEND_TINYDATA".equals(intent.getAction())) {
                        String stringExtra20 = intent.getStringExtra("mipush_app_package");
                        byte[] byteArrayExtra4 = intent.getByteArrayExtra("mipush_payload");
                        C4498hs hsVar = new C4498hs();
                        try {
                            C4531iy.m13589a(hsVar, byteArrayExtra4);
                            C4492hm.m12919a(this).mo42002a(hsVar, stringExtra20);
                            return;
                        } catch (C4542je e2) {
                            AbstractC4163b.m11303a(e2);
                            return;
                        }
                    } else {
                        if ("com.xiaomi.push.timer".equalsIgnoreCase(intent.getAction())) {
                            AbstractC4163b.m11301a("Service called on timer");
                            if (!m13789j()) {
                                C4418fe.m12534a(false);
                                if (!m13780e()) {
                                    return;
                                }
                            } else if (C4418fe.m12535a()) {
                                str3 = "enter falldown mode, stop alarm";
                            } else {
                                return;
                            }
                        } else if ("com.xiaomi.push.check_alive".equalsIgnoreCase(intent.getAction())) {
                            AbstractC4163b.m11301a("Service called on check alive.");
                            if (!m13780e()) {
                                return;
                            }
                        } else if ("com.xiaomi.mipush.thirdparty".equals(intent.getAction())) {
                            AbstractC4163b.m11301a("on thirdpart push :" + intent.getStringExtra("com.xiaomi.mipush.thirdparty_DESC"));
                            C4418fe.m12533a(this, intent.getIntExtra("com.xiaomi.mipush.thirdparty_LEVEL", 0));
                            return;
                        } else if ("android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
                            mo42636d();
                            return;
                        } else if ("action_cr_config".equals(intent.getAction())) {
                            boolean booleanExtra3 = intent.getBooleanExtra("action_cr_event_switch", false);
                            long longExtra = intent.getLongExtra("action_cr_event_frequency", 86400);
                            boolean booleanExtra4 = intent.getBooleanExtra("action_cr_perf_switch", false);
                            long longExtra2 = intent.getLongExtra("action_cr_perf_frequency", 86400);
                            boolean booleanExtra5 = intent.getBooleanExtra("action_cr_event_en", true);
                            long longExtra3 = intent.getLongExtra("action_cr_max_file_size", 1048576);
                            Config build = Config.getBuilder().setEventUploadSwitchOpen(booleanExtra3).setEventUploadFrequency(longExtra).setPerfUploadSwitchOpen(booleanExtra4).setPerfUploadFrequency(longExtra2).setAESKey(C4291bl.m11819a(getApplicationContext())).setEventEncrypted(booleanExtra5).setMaxFileLength(longExtra3).build(getApplicationContext());
                            if (!MiPushRegistar.PACKAGE_XIAOMI.equals(getPackageName()) && longExtra > 0 && longExtra2 > 0 && longExtra3 > 0) {
                                C4415fc.m12513a(getApplicationContext(), build);
                                return;
                            }
                            return;
                        } else if ("action_help_ping".equals(intent.getAction())) {
                            boolean booleanExtra6 = intent.getBooleanExtra("extra_help_ping_switch", false);
                            int intExtra4 = intent.getIntExtra("extra_help_ping_frequency", 0);
                            if (intExtra4 >= 0 && intExtra4 < 30) {
                                AbstractC4163b.m11305c("aw_ping: frquency need > 30s.");
                                intExtra4 = 30;
                            }
                            if (intExtra4 >= 0) {
                                z3 = booleanExtra6;
                            }
                            AbstractC4163b.m11301a("aw_ping: receive a aw_ping message. switch: " + z3 + " frequency: " + intExtra4);
                            if (z3 && intExtra4 > 0 && !MiPushRegistar.PACKAGE_XIAOMI.equals(getPackageName())) {
                                m13760a(intent, intExtra4);
                                return;
                            }
                            return;
                        } else if ("action_aw_app_logic".equals(intent.getAction())) {
                            m13778d(intent);
                            return;
                        } else {
                            return;
                        }
                        m13770b(false);
                        return;
                    }
                    AbstractC4163b.m11301a(str3);
                    C4418fe.m12531a();
                    return;
                }
                AbstractC4163b.m11301a(str5);
                return;
            }
            m13774c(axVar);
            return;
        }
        m13774c(nVar);
    }

    /* renamed from: c */
    private void m13774c(AbstractC4582i iVar) {
        this.f13089a.mo42726a(iVar);
    }

    /* renamed from: c */
    private void m13776c(boolean z) {
        try {
            if (!C4688t.m14223a()) {
                return;
            }
            if (z) {
                sendBroadcast(new Intent("miui.intent.action.NETWORK_CONNECTED"));
                for (AbstractC4601af afVar : (AbstractC4601af[]) this.f13093a.toArray(new AbstractC4601af[0])) {
                    afVar.mo42655a();
                }
                return;
            }
            sendBroadcast(new Intent("miui.intent.action.NETWORK_BLOCKED"));
        } catch (Exception e) {
            AbstractC4163b.m11303a(e);
        }
    }

    /* renamed from: d */
    private void mo42636d() {
        NetworkInfo networkInfo;
        try {
            networkInfo = ((ConnectivityManager) getSystemService("connectivity")).getActiveNetworkInfo();
        } catch (Exception e) {
            AbstractC4163b.m11303a(e);
            networkInfo = null;
        }
        if (networkInfo != null) {
            StringBuilder sb = new StringBuilder();
            sb.append("network changed,");
            sb.append("[" + "type: " + networkInfo.getTypeName() + "[" + networkInfo.getSubtypeName() + "], state: " + networkInfo.getState() + C8932ooOOO0o.OooO0OO + networkInfo.getDetailedState());
            AbstractC4163b.m11301a(sb.toString());
            NetworkInfo.State state = networkInfo.getState();
            if (state == NetworkInfo.State.SUSPENDED || state == NetworkInfo.State.UNKNOWN) {
                return;
            }
        } else {
            AbstractC4163b.m11301a("network changed, no active network");
        }
        if (C4483hg.mo41992a() != null) {
            C4483hg.mo41992a().m12874a();
        }
        C4473gz.m12846a((Context) this);
        this.f13080a.mo41908d();
        if (C4274az.m11735b(this)) {
            if (m13817c() && m13780e()) {
                m13770b(false);
            }
            if (!m13817c() && !m13818d()) {
                this.f13089a.mo42724a(1);
                mo42624a(new C4577d());
            }
            C4354dk.m12090a(this).mo41665a();
        } else {
            mo42624a(new C4579f(2, null));
        }
        m13779e();
    }

    /* renamed from: d */
    private void m13778d(Intent intent) {
        int i;
        try {
            C4404es.m12465a(getApplicationContext()).mo41802a(new C4625as());
            String stringExtra = intent.getStringExtra("mipush_app_package");
            byte[] byteArrayExtra = intent.getByteArrayExtra("mipush_payload");
            if (byteArrayExtra != null) {
                C4520in inVar = new C4520in();
                C4531iy.m13589a(inVar, byteArrayExtra);
                String b = inVar.mo42315b();
                Map<String, String> a = inVar.m13318a();
                if (a != null) {
                    String str = a.get("extra_help_aw_info");
                    String str2 = a.get("extra_aw_app_online_cmd");
                    if (!TextUtils.isEmpty(str2)) {
                        try {
                            i = Integer.parseInt(str2);
                        } catch (NumberFormatException unused) {
                            i = 0;
                        }
                        if (!TextUtils.isEmpty(stringExtra) && !TextUtils.isEmpty(b) && !TextUtils.isEmpty(str)) {
                            C4404es.m12465a(getApplicationContext()).mo41800a(this, str, i, stringExtra, b);
                        }
                    }
                }
            }
        } catch (C4542je e) {
            AbstractC4163b.m11306d("aw_logic: translate fail. " + e.getMessage());
        }
    }

    /* renamed from: e */
    private void m13779e() {
        if (!m13810a()) {
            C4418fe.m12531a();
        } else if (!C4418fe.m12535a()) {
            C4418fe.m12534a(true);
        }
    }

    /* renamed from: e */
    private boolean m13780e() {
        if (System.currentTimeMillis() - this.f13077a < 30000) {
            return false;
        }
        return C4274az.m11736c(this);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: f */
    private void m13781f() {
        String str;
        AbstractC4435fu fuVar = this.f13081a;
        if (fuVar == null || !fuVar.m12670b()) {
            AbstractC4435fu fuVar2 = this.f13081a;
            if (fuVar2 == null || !fuVar2.m12672c()) {
                this.f13082a.mo41915b(C4274az.m11726a((Context) this));
                m13783g();
                if (this.f13081a == null) {
                    C4611am.mo42670a().mo42673a(this);
                    m13776c(false);
                    return;
                }
                return;
            }
            str = "try to connect while is connected.";
        } else {
            str = "try to connect while connecting.";
        }
        AbstractC4163b.m11306d(str);
    }

    /* renamed from: f */
    private boolean m13782f() {
        return MiPushRegistar.PACKAGE_XIAOMI.equals(getPackageName()) && Settings.Secure.getInt(getContentResolver(), "EXTREME_POWER_MODE_ENABLE", 0) == 1;
    }

    /* renamed from: g */
    private void m13783g() {
        try {
            this.f13080a.mo41899a(this.f13083a, new C4647bl(this));
            this.f13080a.mo41909e();
            this.f13081a = this.f13080a;
        } catch (C4449gf e) {
            AbstractC4163b.m11302a("fail to create Slim connection", e);
            this.f13080a.mo41903b(3, e);
        }
    }

    /* renamed from: g */
    private boolean m13784g() {
        return MiPushRegistar.PACKAGE_XIAOMI.equals(getPackageName()) && Settings.System.getInt(getContentResolver(), "power_supersave_mode_open", 0) == 1;
    }

    /* renamed from: h */
    private void m13785h() {
        if (Build.VERSION.SDK_INT < 18) {
            startForeground(f13076d, new Notification());
        } else {
            bindService(new Intent(this, this.f13090a), new ServiceConnectionC4648bm(this), 1);
        }
    }

    /* renamed from: h */
    private boolean m13786h() {
        return MiPushRegistar.PACKAGE_XIAOMI.equals(getPackageName()) || !C4673m.m14150a(this).m14154b(getPackageName());
    }

    /* renamed from: i */
    private void m13787i() {
        synchronized (this.f13092a) {
            this.f13092a.clear();
        }
    }

    /* renamed from: i */
    private boolean m13788i() {
        return ((PowerManager) getSystemService("power")).isScreenOn();
    }

    /* renamed from: j */
    private boolean m13789j() {
        return getApplicationContext().getPackageName().equals(MiPushRegistar.PACKAGE_XIAOMI) && m13790k() && !m13788i() && !m13764a(getApplicationContext());
    }

    /* renamed from: k */
    private boolean m13790k() {
        int intValue = Integer.valueOf(String.format("%tH", new Date())).intValue();
        int i = this.f13094b;
        int i2 = this.f13096c;
        if (i <= i2) {
            return i < i2 && intValue >= i && intValue < i2;
        }
        if (intValue >= i || intValue < i2) {
            return true;
        }
    }

    /* renamed from: l */
    private boolean m13791l() {
        if (TextUtils.equals(getPackageName(), MiPushRegistar.PACKAGE_XIAOMI)) {
            return false;
        }
        return C4605ah.m13919a(this).mo42661a(EnumC4499ht.ForegroundServiceSwitch.mo42043a(), false);
    }

    /* renamed from: a */
    public AbstractC4435fu m13792a() {
        return this.f13081a;
    }

    /* renamed from: a */
    public C4658d m13793a() {
        return new C4658d();
    }

    /* renamed from: a */
    public void m13794a() {
        if (System.currentTimeMillis() - this.f13077a >= ((long) C4444ga.m12707a()) && C4274az.m11736c(this)) {
            m13770b(true);
        }
    }

    /* renamed from: a */
    public void mo42621a(int i) {
        this.f13089a.mo42724a(i);
    }

    /* renamed from: a */
    public void mo42622a(int i, Exception exc) {
        StringBuilder sb = new StringBuilder();
        sb.append("disconnect ");
        sb.append(hashCode());
        sb.append(", ");
        AbstractC4435fu fuVar = this.f13081a;
        sb.append(fuVar == null ? null : Integer.valueOf(fuVar.hashCode()));
        AbstractC4163b.m11301a(sb.toString());
        AbstractC4435fu fuVar2 = this.f13081a;
        if (fuVar2 != null) {
            fuVar2.mo41903b(i, exc);
            this.f13081a = null;
        }
        mo42621a(7);
        mo42621a(4);
        C4611am.mo42670a().mo42674a(this, i);
    }

    /* renamed from: a */
    public void mo42623a(C4428fn fnVar) {
        AbstractC4435fu fuVar = this.f13081a;
        if (fuVar != null) {
            fuVar.mo41894b(fnVar);
            return;
        }
        throw new C4449gf("try send msg while connection is null.");
    }

    @Override // com.xiaomi.push.AbstractC4439fx
    /* renamed from: a */
    public void mo41529a(AbstractC4435fu fuVar) {
        C4483hg.mo41992a().mo41529a(fuVar);
        m13776c(true);
        this.f13087a.m14010a();
        if (!C4418fe.m12535a() && !m13789j()) {
            AbstractC4163b.m11301a("reconnection successful, reactivate alarm.");
            C4418fe.m12534a(true);
        }
        Iterator<C4611am.C4613b> it = C4611am.mo42670a().m13949a().iterator();
        while (it.hasNext()) {
            mo42624a(new C4574a(it.next()));
        }
    }

    @Override // com.xiaomi.push.AbstractC4439fx
    /* renamed from: a */
    public void mo41530a(AbstractC4435fu fuVar, int i, Exception exc) {
        C4483hg.mo41992a().mo41530a(fuVar, i, exc);
        if (!m13789j()) {
            mo42630a(false);
        }
    }

    @Override // com.xiaomi.push.AbstractC4439fx
    /* renamed from: a */
    public void mo41531a(AbstractC4435fu fuVar, Exception exc) {
        C4483hg.mo41992a().mo41531a(fuVar, exc);
        m13776c(false);
        if (!m13789j()) {
            mo42630a(false);
        }
    }

    /* renamed from: a */
    public void mo42624a(AbstractC4582i iVar) {
        mo42625a(iVar, 0);
    }

    /* renamed from: a */
    public void mo42625a(AbstractC4582i iVar, long j) {
        try {
            this.f13089a.mo42727a(iVar, j);
        } catch (IllegalStateException e) {
            AbstractC4163b.m11301a("can't execute job err = " + e.getMessage());
        }
    }

    /* renamed from: a */
    public void mo42626a(AbstractC4585l lVar) {
        synchronized (this.f13092a) {
            this.f13092a.add(lVar);
        }
    }

    /* renamed from: a */
    public void mo42627a(C4611am.C4613b bVar) {
        if (bVar != null) {
            long a = bVar.mo42679a();
            AbstractC4163b.m11301a("schedule rebind job in " + (a / 1000));
            mo42625a(new C4574a(bVar), a);
        }
    }

    /* renamed from: a */
    public void mo42628a(String str, String str2, int i, String str3, String str4) {
        C4611am.C4613b a = C4611am.mo42670a().mo42671a(str, str2);
        if (a != null) {
            mo42624a(new C4590q(a, i, str4, str3));
        }
        C4611am.mo42670a().m13958a(str, str2);
    }

    /* renamed from: a */
    public void mo42629a(String str, byte[] bArr, boolean z) {
        Collection<C4611am.C4613b> a = C4611am.mo42670a().m13950a("5");
        if (a.isEmpty()) {
            if (!z) {
                return;
            }
        } else if (a.iterator().next().f13182a == C4611am.EnumC4617c.binded) {
            mo42624a(new C4645bj(this, 4, str, bArr));
            return;
        } else if (!z) {
            return;
        }
        C4675o.m14167b(str, bArr);
    }

    /* renamed from: a */
    public void mo42630a(boolean z) {
        this.f13087a.mo42691a(z);
    }

    /* renamed from: a */
    public void mo42631a(byte[] bArr, String str) {
        if (bArr == null) {
            C4675o.m14163a(this, str, bArr, ErrorCode.ERROR_INVALID_PAYLOAD, "null payload");
            AbstractC4163b.m11301a("register request without payload");
            return;
        }
        C4517ik ikVar = new C4517ik();
        try {
            C4531iy.m13589a(ikVar, bArr);
            if (ikVar.f12687a == EnumC4494ho.Registration) {
                C4521io ioVar = new C4521io();
                try {
                    C4531iy.m13589a(ioVar, ikVar.m13283a());
                    C4675o.m14165a(ikVar.mo42282b(), bArr);
                    mo42624a(new C4674n(this, ikVar.mo42282b(), ioVar.mo42347b(), ioVar.mo42351c(), bArr));
                    C4417fd.m12519a(getApplicationContext()).mo41813a(ikVar.mo42282b(), "E100003", ioVar.mo42343a(), 6002, "send a register message to server");
                } catch (C4542je e) {
                    AbstractC4163b.m11303a(e);
                    C4675o.m14163a(this, str, bArr, ErrorCode.ERROR_INVALID_PAYLOAD, " data action error.");
                }
            } else {
                C4675o.m14163a(this, str, bArr, ErrorCode.ERROR_INVALID_PAYLOAD, " registration action required.");
                AbstractC4163b.m11301a("register request with invalid payload");
            }
        } catch (C4542je e2) {
            AbstractC4163b.m11303a(e2);
            C4675o.m14163a(this, str, bArr, ErrorCode.ERROR_INVALID_PAYLOAD, " data container error.");
        }
    }

    /* renamed from: a */
    public void mo42632a(C4428fn[] fnVarArr) {
        AbstractC4435fu fuVar = this.f13081a;
        if (fuVar != null) {
            fuVar.mo41893a(fnVarArr);
            return;
        }
        throw new C4449gf("try send msg while connection is null.");
    }

    /* renamed from: a */
    public boolean m13810a() {
        return C4274az.m11735b(this) && C4611am.mo42670a().m13947a() > 0 && !m13816b() && m13786h() && !m13784g() && !m13782f();
    }

    /* renamed from: a */
    public boolean m13811a(int i) {
        return this.f13089a.m14106a(i);
    }

    /* renamed from: b */
    public C4658d mo42633b() {
        return this.f13088a;
    }

    /* renamed from: b */
    public void m13813b() {
        Iterator it = new ArrayList(this.f13092a).iterator();
        while (it.hasNext()) {
            ((AbstractC4585l) it.next()).mo41998a();
        }
    }

    @Override // com.xiaomi.push.AbstractC4439fx
    /* renamed from: b */
    public void mo41532b(AbstractC4435fu fuVar) {
        AbstractC4163b.m11305c("begin to connect...");
        C4483hg.mo41992a().mo41532b(fuVar);
    }

    /* renamed from: b */
    public void mo42634b(AbstractC4582i iVar) {
        this.f13089a.mo42725a(iVar.f13330a, iVar);
    }

    /* renamed from: b */
    public boolean m13816b() {
        try {
            Class<?> a = C4688t.m14219a(this, "miui.os.Build");
            return a.getField("IS_CM_CUSTOMIZATION_TEST").getBoolean(null) || a.getField("IS_CU_CUSTOMIZATION_TEST").getBoolean(null) || a.getField("IS_CT_CUSTOMIZATION_TEST").getBoolean(null);
        } catch (Throwable unused) {
            return false;
        }
    }

    /* renamed from: c */
    public boolean m13817c() {
        AbstractC4435fu fuVar = this.f13081a;
        return fuVar != null && fuVar.m12672c();
    }

    /* renamed from: d */
    public boolean m13818d() {
        AbstractC4435fu fuVar = this.f13081a;
        return fuVar != null && fuVar.m12670b();
    }

    public native IBinder onBind(Intent intent);

    public void onCreate() {
        super.onCreate();
        C4688t.m14222a((Context) this);
        C4670k a = C4671l.m14141a((Context) this);
        if (a != null) {
            C4244ab.m11627a(a.f13352a);
        }
        this.f13079a = new Messenger(new HandlerC4649bn(this));
        C4622ar.m13986a(this);
        C4650bo boVar = new C4650bo(this, null, 5222, "xiaomi.com", null);
        this.f13082a = boVar;
        boVar.mo41913a(true);
        this.f13080a = new C4433fs(this, this.f13082a);
        this.f13088a = m13793a();
        C4418fe.m12532a(this);
        this.f13080a.mo41898a(this);
        this.f13086a = new C4610al(this);
        this.f13087a = new C4629aw(this);
        new C4659e().mo42721a();
        C4483hg.m12882a().mo41995a(this);
        this.f13089a = new C4661g("Connection Controller Thread");
        C4611am a2 = C4611am.mo42670a();
        a2.mo42677b();
        a2.mo42675a(new C4651bp(this));
        if (m13791l()) {
            m13785h();
        }
        C4492hm.m12919a(this).mo42001a(new C4668i(this), "UPLOADER_PUSH_CHANNEL");
        mo42626a(new C4488hj(this));
        mo42624a(new C4580g());
        this.f13093a.add(C4638bd.m14046a(this));
        if (m13786h()) {
            this.f13084a = new C4578e();
            registerReceiver(this.f13084a, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        }
        if (MiPushRegistar.PACKAGE_XIAOMI.equals(getPackageName())) {
            Uri uriFor = Settings.Secure.getUriFor("EXTREME_POWER_MODE_ENABLE");
            if (uriFor != null) {
                this.f13078a = new C4652bq(this, new Handler(Looper.getMainLooper()));
                try {
                    getContentResolver().registerContentObserver(uriFor, false, this.f13078a);
                } catch (Throwable th) {
                    AbstractC4163b.m11301a("register observer err:" + th.getMessage());
                }
            }
            Uri uriFor2 = Settings.System.getUriFor("power_supersave_mode_open");
            if (uriFor2 != null) {
                this.f13095b = new C4653br(this, new Handler(Looper.getMainLooper()));
                try {
                    getContentResolver().registerContentObserver(uriFor2, false, this.f13095b);
                } catch (Throwable th2) {
                    AbstractC4163b.m11306d("register super-power-mode observer err:" + th2.getMessage());
                }
            }
            int[] a3 = m13767a();
            if (a3 != null) {
                this.f13085a = new C4589p();
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.intent.action.SCREEN_ON");
                intentFilter.addAction("android.intent.action.SCREEN_OFF");
                registerReceiver(this.f13085a, intentFilter);
                this.f13094b = a3[0];
                this.f13096c = a3[1];
                AbstractC4163b.m11301a("falldown initialized: " + this.f13094b + Constants.ACCEPT_TIME_SEPARATOR_SP + this.f13096c);
            }
        }
        AbstractC4163b.m11301a("XMPushService created pid = " + f13076d);
    }

    public void onDestroy() {
        C4578e eVar = this.f13084a;
        if (eVar != null) {
            m13758a(eVar);
            this.f13084a = null;
        }
        C4589p pVar = this.f13085a;
        if (pVar != null) {
            m13758a(pVar);
            this.f13085a = null;
        }
        if (MiPushRegistar.PACKAGE_XIAOMI.equals(getPackageName()) && this.f13078a != null) {
            try {
                getContentResolver().unregisterContentObserver(this.f13078a);
            } catch (Throwable th) {
                AbstractC4163b.m11301a("unregister observer err:" + th.getMessage());
            }
        }
        if (MiPushRegistar.PACKAGE_XIAOMI.equals(getPackageName()) && this.f13095b != null) {
            try {
                getContentResolver().unregisterContentObserver(this.f13095b);
            } catch (Throwable th2) {
                AbstractC4163b.m11306d("unregister super-power-mode err:" + th2.getMessage());
            }
        }
        this.f13093a.clear();
        this.f13089a.m14107b();
        mo42624a(new C4646bk(this, 2));
        mo42624a(new C4583j());
        C4611am.mo42670a().mo42677b();
        C4611am.mo42670a().mo42674a(this, 15);
        C4611am.mo42670a().m13952a();
        this.f13080a.mo41904b(this);
        C4635bb.mo42697a().m14037a();
        C4418fe.m12531a();
        m13787i();
        super.onDestroy();
        AbstractC4163b.m11301a("Service destroyed");
    }

    public void onStart(Intent intent, int i) {
        C4581h hVar;
        long currentTimeMillis = System.currentTimeMillis();
        if (intent == null) {
            AbstractC4163b.m11306d("onStart() with intent NULL");
        } else {
            AbstractC4163b.m11305c(String.format("onStart() with intent.Action = %s, chid = %s, pkg = %s|%s, from-bridge = %s", intent.getAction(), intent.getStringExtra(AbstractC4621aq.f13239r), intent.getStringExtra(AbstractC4621aq.f13247z), intent.getStringExtra("mipush_app_package"), intent.getStringExtra("ext_is_xmpushservice_bridge")));
        }
        if (!(intent == null || intent.getAction() == null)) {
            if ("com.xiaomi.push.timer".equalsIgnoreCase(intent.getAction()) || "com.xiaomi.push.check_alive".equalsIgnoreCase(intent.getAction())) {
                if (this.f13089a.m14105a()) {
                    AbstractC4163b.m11306d("ERROR, the job controller is blocked.");
                    C4611am.mo42670a().mo42674a(this, 14);
                    stopSelf();
                } else {
                    hVar = new C4581h(intent);
                }
            } else if (!"com.xiaomi.push.network_status_changed".equalsIgnoreCase(intent.getAction())) {
                hVar = new C4581h(intent);
            }
            mo42624a(hVar);
        }
        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
        if (currentTimeMillis2 > 50) {
            AbstractC4163b.m11305c("[Prefs] spend " + currentTimeMillis2 + " ms, too more times.");
        }
    }

    public native int onStartCommand(Intent intent, int i, int i2);
}

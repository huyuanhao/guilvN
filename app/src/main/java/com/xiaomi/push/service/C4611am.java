package com.xiaomi.push.service;

import android.content.Context;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.text.TextUtils;
import com.p118pd.sdk.C8932ooOOO0o;
import com.xiaomi.channel.commonutils.logger.AbstractC4163b;
import com.xiaomi.push.service.XMPushService;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import org.android.agoo.xiaomi.MiPushRegistar;

/* renamed from: com.xiaomi.push.service.am */
public class C4611am {

    /* renamed from: a */
    public static C4611am f13172a;

    /* renamed from: a */
    public List<AbstractC4612a> f13173a = new ArrayList();

    /* renamed from: a */
    public ConcurrentHashMap<String, HashMap<String, C4613b>> f13174a = new ConcurrentHashMap<>();

    /* renamed from: com.xiaomi.push.service.am$a */
    public interface AbstractC4612a {
        /* renamed from: a */
        void mo42678a();
    }

    /* renamed from: com.xiaomi.push.service.am$b */
    public static class C4613b {

        /* renamed from: a */
        public int f13175a = 0;

        /* renamed from: a */
        public Context f13176a;

        /* renamed from: a */
        public IBinder.DeathRecipient f13177a = null;

        /* renamed from: a */
        public Messenger f13178a;

        /* renamed from: a */
        public XMPushService.C4575b f13179a = new XMPushService.C4575b(this);

        /* renamed from: a */
        public XMPushService f13180a;

        /* renamed from: a */
        public final C4615b f13181a = new C4615b();

        /* renamed from: a */
        public EnumC4617c f13182a = EnumC4617c.unbind;

        /* renamed from: a */
        public C4658d f13183a;

        /* renamed from: a */
        public String f13184a;

        /* renamed from: a */
        public List<AbstractC4614a> f13185a = new ArrayList();

        /* renamed from: a */
        public boolean f13186a;

        /* renamed from: b */
        public EnumC4617c f13187b = null;

        /* renamed from: b */
        public String f13188b;

        /* renamed from: b */
        public boolean f13189b = false;

        /* renamed from: c */
        public String f13190c;

        /* renamed from: d */
        public String f13191d;

        /* renamed from: e */
        public String f13192e;

        /* renamed from: f */
        public String f13193f;

        /* renamed from: g */
        public String f13194g;

        /* renamed from: h */
        public String f13195h;

        /* renamed from: i */
        public String f13196i;

        /* renamed from: com.xiaomi.push.service.am$b$a */
        public interface AbstractC4614a {
            /* renamed from: a */
            void mo41990a(EnumC4617c cVar, EnumC4617c cVar2, int i);
        }

        /* renamed from: com.xiaomi.push.service.am$b$b */
        public class C4615b extends XMPushService.AbstractC4582i {

            /* renamed from: a */
            public String f13198a;

            /* renamed from: b */
            public int f13199b;

            /* renamed from: b */
            public String f13200b;

            /* renamed from: c */
            public int f13201c;

            public C4615b() {
                super(0);
            }

            /* renamed from: a */
            public XMPushService.AbstractC4582i mo42685a(int i, int i2, String str, String str2) {
                this.f13199b = i;
                this.f13201c = i2;
                this.f13200b = str2;
                this.f13198a = str;
                return this;
            }

            @Override // com.xiaomi.push.service.XMPushService.AbstractC4582i, com.xiaomi.push.service.XMPushService.AbstractC4582i
            /* renamed from: a */
            public String mo41924a() {
                return "notify job";
            }

            @Override // com.xiaomi.push.service.XMPushService.AbstractC4582i, com.xiaomi.push.service.XMPushService.AbstractC4582i
            /* renamed from: a */
            public void m13979a() {
                if (C4613b.this.m13966a(this.f13199b, this.f13201c, this.f13200b)) {
                    C4613b.this.m13964a((C4613b) this.f13199b, this.f13201c, (int) this.f13198a, this.f13200b);
                    return;
                }
                AbstractC4163b.m11304b(" ignore notify client :" + C4613b.this.f13194g);
            }
        }

        /* renamed from: com.xiaomi.push.service.am$b$c */
        public class C4616c implements IBinder.DeathRecipient {

            /* renamed from: a */
            public final Messenger f13202a;

            /* renamed from: a */
            public final C4613b f13203a;

            public C4616c(C4613b bVar, Messenger messenger) {
                this.f13203a = bVar;
                this.f13202a = messenger;
            }

            public void binderDied() {
                AbstractC4163b.m11304b("peer died, chid = " + this.f13203a.f13194g);
                C4613b.this.f13180a.mo42625a(new C4619ao(this, 0), 0);
                if ("9".equals(this.f13203a.f13194g) && MiPushRegistar.PACKAGE_XIAOMI.equals(C4613b.this.f13180a.getPackageName())) {
                    C4613b.this.f13180a.mo42625a(new C4620ap(this, 0), 60000);
                }
            }
        }

        public C4613b() {
        }

        public C4613b(XMPushService xMPushService) {
            this.f13180a = xMPushService;
            mo42682a(new C4618an(this));
        }

        /* renamed from: a */
        public static String m13963a(String str) {
            int lastIndexOf;
            return (!TextUtils.isEmpty(str) && (lastIndexOf = str.lastIndexOf(C8932ooOOO0o.OooO0OO)) != -1) ? str.substring(lastIndexOf + 1) : "";
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        /* renamed from: a */
        private void m13964a(int i, int i2, String str, String str2) {
            EnumC4617c cVar = this.f13182a;
            this.f13187b = cVar;
            if (i == 2) {
                this.f13183a.mo42716a(this.f13176a, this, i2);
            } else if (i == 3) {
                this.f13183a.mo42717a(this.f13176a, this, str2, str);
            } else if (i == 1) {
                boolean z = cVar == EnumC4617c.binded;
                if (!z && "wait".equals(str2)) {
                    this.f13175a++;
                } else if (z) {
                    this.f13175a = 0;
                    if (this.f13178a != null) {
                        try {
                            this.f13178a.send(Message.obtain(null, 16, this.f13180a.f13079a));
                        } catch (RemoteException unused) {
                        }
                    }
                }
                this.f13183a.mo42718a(this.f13180a, this, z, i2, str);
            }
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        /* renamed from: a */
        private boolean m13966a(int i, int i2, String str) {
            boolean z;
            StringBuilder sb;
            String str2;
            EnumC4617c cVar = this.f13187b;
            if (cVar == null || !(z = this.f13189b)) {
                return true;
            }
            if (cVar == this.f13182a) {
                sb = new StringBuilder();
                str2 = " status recovered, don't notify client:";
            } else if (this.f13178a == null || !z) {
                sb = new StringBuilder();
                str2 = "peer died, ignore notify ";
            } else {
                AbstractC4163b.m11304b("Peer alive notify status to client:" + this.f13194g);
                return true;
            }
            sb.append(str2);
            sb.append(this.f13194g);
            AbstractC4163b.m11304b(sb.toString());
            return false;
        }

        /* renamed from: b */
        private boolean m13968b(int i, int i2, String str) {
            if (i == 1) {
                return this.f13182a != EnumC4617c.binded && this.f13180a.m13817c() && i2 != 21 && (i2 != 7 || !"wait".equals(str));
            }
            if (i == 2) {
                return this.f13180a.m13817c();
            }
            if (i != 3) {
                return false;
            }
            return !"wait".equals(str);
        }

        /* renamed from: a */
        public long mo42679a() {
            return (((long) ((Math.random() * 20.0d) - 10.0d)) + ((long) ((this.f13175a + 1) * 15))) * 1000;
        }

        /* renamed from: a */
        public String mo42680a(int i) {
            return i != 1 ? i != 2 ? i != 3 ? "unknown" : "KICK" : "CLOSE" : "OPEN";
        }

        /* renamed from: a */
        public void m13971a() {
            try {
                Messenger messenger = this.f13178a;
                if (!(messenger == null || this.f13177a == null)) {
                    messenger.getBinder().unlinkToDeath(this.f13177a, 0);
                }
            } catch (Exception unused) {
            }
            this.f13187b = null;
        }

        /* renamed from: a */
        public void mo42681a(Messenger messenger) {
            m13971a();
            if (messenger != null) {
                try {
                    this.f13178a = messenger;
                    this.f13189b = true;
                    this.f13177a = new C4616c(this, messenger);
                    messenger.getBinder().linkToDeath(this.f13177a, 0);
                } catch (Exception e) {
                    AbstractC4163b.m11304b("peer linkToDeath err: " + e.getMessage());
                    this.f13178a = null;
                    this.f13189b = false;
                }
            } else {
                AbstractC4163b.m11304b("peer linked with old sdk chid = " + this.f13194g);
            }
        }

        /* renamed from: a */
        public void mo42682a(AbstractC4614a aVar) {
            synchronized (this.f13185a) {
                this.f13185a.add(aVar);
            }
        }

        /* renamed from: a */
        public void mo42683a(EnumC4617c cVar, int i, int i2, String str, String str2) {
            boolean z;
            synchronized (this.f13185a) {
                for (AbstractC4614a aVar : this.f13185a) {
                    aVar.mo41990a(this.f13182a, cVar, i2);
                }
            }
            EnumC4617c cVar2 = this.f13182a;
            int i3 = 0;
            if (cVar2 != cVar) {
                AbstractC4163b.m11301a(String.format("update the client %7$s status. %1$s->%2$s %3$s %4$s %5$s %6$s", cVar2, cVar, mo42680a(i), AbstractC4621aq.m13985a(i2), str, str2, this.f13194g));
                this.f13182a = cVar;
            }
            if (this.f13183a == null) {
                AbstractC4163b.m11306d("status changed while the client dispatcher is missing");
            } else if (cVar != EnumC4617c.binding) {
                if (this.f13187b != null && (z = this.f13189b)) {
                    i3 = (this.f13178a == null || !z) ? 10100 : 1000;
                }
                this.f13180a.mo42634b(this.f13181a);
                if (m13968b(i, i2, str2)) {
                    m13964a(i, i2, str, str2);
                } else {
                    this.f13180a.mo42625a(this.f13181a.mo42685a(i, i2, str, str2), (long) i3);
                }
            }
        }

        /* renamed from: b */
        public void mo42684b(AbstractC4614a aVar) {
            synchronized (this.f13185a) {
                this.f13185a.remove(aVar);
            }
        }
    }

    /* renamed from: com.xiaomi.push.service.am$c */
    public enum EnumC4617c {
        unbind,
        binding,
        binded
    }

    /* renamed from: a */
    public static synchronized C4611am mo42670a() {
        C4611am amVar;
        synchronized (C4611am.class) {
            if (f13172a == null) {
                f13172a = new C4611am();
            }
            amVar = f13172a;
        }
        return amVar;
    }

    /* renamed from: a */
    private String mo42672a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        int indexOf = str.indexOf("@");
        return indexOf > 0 ? str.substring(0, indexOf) : str;
    }

    /* renamed from: a */
    public synchronized int m13947a() {
        return this.f13174a.size();
    }

    /* renamed from: a */
    public synchronized C4613b mo42671a(String str, String str2) {
        HashMap<String, C4613b> hashMap = this.f13174a.get(str);
        if (hashMap == null) {
            return null;
        }
        return hashMap.get(mo42672a(str2));
    }

    /* renamed from: a */
    public synchronized ArrayList<C4613b> m13949a() {
        ArrayList<C4613b> arrayList;
        arrayList = new ArrayList<>();
        for (HashMap<String, C4613b> hashMap : this.f13174a.values()) {
            arrayList.addAll(hashMap.values());
        }
        return arrayList;
    }

    /* renamed from: a */
    public synchronized Collection<C4613b> m13950a(String str) {
        if (!this.f13174a.containsKey(str)) {
            return new ArrayList();
        }
        return ((HashMap) this.f13174a.get(str).clone()).values();
    }

    /* renamed from: a */
    public synchronized List<String> m13951a(String str) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (HashMap<String, C4613b> hashMap : this.f13174a.values()) {
            for (C4613b bVar : hashMap.values()) {
                if (str.equals(bVar.f13184a)) {
                    arrayList.add(bVar.f13194g);
                }
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public synchronized void m13952a() {
        Iterator<C4613b> it = m13949a().iterator();
        while (it.hasNext()) {
            it.next().m13971a();
        }
        this.f13174a.clear();
    }

    /* renamed from: a */
    public synchronized void mo42673a(Context context) {
        for (HashMap<String, C4613b> hashMap : this.f13174a.values()) {
            for (C4613b bVar : hashMap.values()) {
                bVar.mo42683a(EnumC4617c.unbind, 1, 3, (String) null, (String) null);
            }
        }
    }

    /* renamed from: a */
    public synchronized void mo42674a(Context context, int i) {
        for (HashMap<String, C4613b> hashMap : this.f13174a.values()) {
            for (C4613b bVar : hashMap.values()) {
                bVar.mo42683a(EnumC4617c.unbind, 2, i, (String) null, (String) null);
            }
        }
    }

    /* renamed from: a */
    public synchronized void mo42675a(AbstractC4612a aVar) {
        this.f13173a.add(aVar);
    }

    /* renamed from: a */
    public synchronized void mo42676a(C4613b bVar) {
        HashMap<String, C4613b> hashMap = this.f13174a.get(bVar.f13194g);
        if (hashMap == null) {
            hashMap = new HashMap<>();
            this.f13174a.put(bVar.f13194g, hashMap);
        }
        hashMap.put(mo42672a(bVar.f13188b), bVar);
        for (AbstractC4612a aVar : this.f13173a) {
            aVar.mo42678a();
        }
    }

    /* renamed from: a */
    public synchronized void m13957a(String str) {
        HashMap<String, C4613b> hashMap = this.f13174a.get(str);
        if (hashMap != null) {
            for (C4613b bVar : hashMap.values()) {
                bVar.m13971a();
            }
            hashMap.clear();
            this.f13174a.remove(str);
        }
        for (AbstractC4612a aVar : this.f13173a) {
            aVar.mo42678a();
        }
    }

    /* renamed from: a */
    public synchronized void m13958a(String str, String str2) {
        HashMap<String, C4613b> hashMap = this.f13174a.get(str);
        if (hashMap != null) {
            C4613b bVar = hashMap.get(mo42672a(str2));
            if (bVar != null) {
                bVar.m13971a();
            }
            hashMap.remove(mo42672a(str2));
            if (hashMap.isEmpty()) {
                this.f13174a.remove(str);
            }
        }
        for (AbstractC4612a aVar : this.f13173a) {
            aVar.mo42678a();
        }
    }

    /* renamed from: b */
    public synchronized void mo42677b() {
        this.f13173a.clear();
    }
}

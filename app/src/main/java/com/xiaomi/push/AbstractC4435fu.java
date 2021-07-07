package com.xiaomi.push;

import android.util.Pair;
import com.xiaomi.channel.commonutils.logger.AbstractC4163b;
import com.xiaomi.push.service.AbstractC4621aq;
import com.xiaomi.push.service.C4611am;
import com.xiaomi.push.service.XMPushService;
import java.io.Reader;
import java.io.Writer;
import java.util.Collection;
import java.util.LinkedList;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.xiaomi.push.fu */
public abstract class AbstractC4435fu {

    /* renamed from: a */
    public static final AtomicInteger f11956a = new AtomicInteger(0);

    /* renamed from: a */
    public static boolean f11957a;

    /* renamed from: a */
    public int f11958a = 0;

    /* renamed from: a */
    public long f11959a = -1;

    /* renamed from: a */
    public C4437fv f11960a;

    /* renamed from: a */
    public AbstractC4450gg f11961a = null;

    /* renamed from: a */
    public XMPushService f11962a;

    /* renamed from: a */
    public String f11963a = "";

    /* renamed from: a */
    public final Collection<AbstractC4439fx> f11964a = new CopyOnWriteArrayList();

    /* renamed from: a */
    public LinkedList<Pair<Integer, Long>> f11965a = new LinkedList<>();

    /* renamed from: a */
    public final Map<AbstractC4441fz, C4436a> f11966a = new ConcurrentHashMap();

    /* renamed from: b */
    public final int f11967b = f11956a.getAndIncrement();

    /* renamed from: b */
    public volatile long f11968b = 0;

    /* renamed from: b */
    public String f11969b = "";

    /* renamed from: b */
    public final Map<AbstractC4441fz, C4436a> f11970b = new ConcurrentHashMap();

    /* renamed from: c */
    public int f11971c = 2;

    /* renamed from: c */
    public volatile long f11972c = 0;

    /* renamed from: d */
    public long f11973d = 0;

    /* renamed from: e */
    public long f11974e = 0;

    /* renamed from: com.xiaomi.push.fu$a */
    public static class C4436a {

        /* renamed from: a */
        public AbstractC4441fz f11975a;

        /* renamed from: a */
        public AbstractC4451gh f11976a;

        public C4436a(AbstractC4441fz fzVar, AbstractC4451gh ghVar) {
            this.f11975a = fzVar;
            this.f11976a = ghVar;
        }

        /* renamed from: a */
        public void mo41910a(C4428fn fnVar) {
            this.f11975a.mo41527a(fnVar);
        }

        /* renamed from: a */
        public void mo41911a(AbstractC4456gl glVar) {
            AbstractC4451gh ghVar = this.f11976a;
            if (ghVar == null || ghVar.mo41528a(glVar)) {
                this.f11975a.mo41528a(glVar);
            }
        }
    }

    static {
        f11957a = false;
        try {
            f11957a = Boolean.getBoolean("smack.debugEnabled");
        } catch (Exception unused) {
        }
        C4444ga.m12709a();
    }

    public AbstractC4435fu(XMPushService xMPushService, C4437fv fvVar) {
        this.f11960a = fvVar;
        this.f11962a = xMPushService;
        m12664b();
    }

    /* renamed from: a */
    private String m12646a(int i) {
        return i == 1 ? "connected" : i == 0 ? "connecting" : i == 2 ? "disconnected" : "unknown";
    }

    /* renamed from: a */
    private void m12647a(int i) {
        synchronized (this.f11965a) {
            if (i == 1) {
                this.f11965a.clear();
            } else {
                this.f11965a.add(new Pair<>(Integer.valueOf(i), Long.valueOf(System.currentTimeMillis())));
                if (this.f11965a.size() > 6) {
                    this.f11965a.remove(0);
                }
            }
        }
    }

    /* renamed from: a */
    public int mo41886a() {
        return this.f11958a;
    }

    /* renamed from: a */
    public long m12649a() {
        return this.f11972c;
    }

    /* renamed from: a */
    public C4437fv m12650a() {
        return this.f11960a;
    }

    /* renamed from: a */
    public String m12651a() {
        return this.f11960a.mo41916c();
    }

    /* renamed from: a */
    public void mo41897a(int i, int i2, Exception exc) {
        int i3 = this.f11971c;
        if (i != i3) {
            AbstractC4163b.m11301a(String.format("update the connection status. %1$s -> %2$s : %3$s ", m12646a(i3), m12646a(i), AbstractC4621aq.m13985a(i2)));
        }
        if (C4274az.m11735b(this.f11962a)) {
            m12647a(i);
        }
        if (i == 1) {
            this.f11962a.mo42621a(10);
            if (this.f11971c != 0) {
                AbstractC4163b.m11301a("try set connected while not connecting.");
            }
            this.f11971c = i;
            for (AbstractC4439fx fxVar : this.f11964a) {
                fxVar.mo41529a(this);
            }
        } else if (i == 0) {
            if (this.f11971c != 2) {
                AbstractC4163b.m11301a("try set connecting while not disconnected.");
            }
            this.f11971c = i;
            for (AbstractC4439fx fxVar2 : this.f11964a) {
                fxVar2.mo41532b(this);
            }
        } else if (i == 2) {
            this.f11962a.mo42621a(10);
            int i4 = this.f11971c;
            if (i4 == 0) {
                for (AbstractC4439fx fxVar3 : this.f11964a) {
                    fxVar3.mo41531a(this, exc == null ? new CancellationException("disconnect while connecting") : exc);
                }
            } else if (i4 == 1) {
                for (AbstractC4439fx fxVar4 : this.f11964a) {
                    fxVar4.mo41530a(this, i2, exc);
                }
            }
            this.f11971c = i;
        }
    }

    /* renamed from: a */
    public void mo41898a(AbstractC4439fx fxVar) {
        if (fxVar != null && !this.f11964a.contains(fxVar)) {
            this.f11964a.add(fxVar);
        }
    }

    /* renamed from: a */
    public void mo41899a(AbstractC4441fz fzVar, AbstractC4451gh ghVar) {
        if (fzVar != null) {
            this.f11966a.put(fzVar, new C4436a(fzVar, ghVar));
            return;
        }
        throw new NullPointerException("Packet listener is null.");
    }

    /* renamed from: a */
    public abstract void mo41889a(AbstractC4456gl glVar);

    /* renamed from: a */
    public abstract void mo41890a(C4611am.C4613b bVar);

    /* renamed from: a */
    public synchronized void mo41900a(String str) {
        if (this.f11971c == 0) {
            AbstractC4163b.m11301a("setChallenge hash = " + C4284be.m11797a(str).substring(0, 8));
            this.f11963a = str;
            mo41897a(1, 0, null);
        } else {
            AbstractC4163b.m11301a("ignore setChallenge because connection was disconnected");
        }
    }

    /* renamed from: a */
    public abstract void mo41891a(String str, String str2);

    /* renamed from: a */
    public abstract void mo41893a(C4428fn[] fnVarArr);

    /* renamed from: a */
    public boolean m12660a() {
        return false;
    }

    /* renamed from: a */
    public synchronized boolean mo41901a(long j) {
        return this.f11974e >= j;
    }

    /* renamed from: b */
    public int mo41902b() {
        return this.f11971c;
    }

    /* renamed from: b */
    public String m12663b() {
        return this.f11960a.mo41914b();
    }

    /* renamed from: b */
    public void m12664b() {
        String str;
        if (this.f11960a.m12683a() && this.f11961a == null) {
            Class<?> cls = null;
            try {
                str = System.getProperty("smack.debuggerClass");
            } catch (Throwable unused) {
                str = null;
            }
            if (str != null) {
                try {
                    cls = Class.forName(str);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            if (cls == null) {
                this.f11961a = new C4295bp(this);
                return;
            }
            try {
                this.f11961a = (AbstractC4450gg) cls.getConstructor(AbstractC4435fu.class, Writer.class, Reader.class).newInstance(this);
            } catch (Exception e2) {
                throw new IllegalArgumentException("Can't initialize the configured debugger!", e2);
            }
        }
    }

    /* renamed from: b */
    public abstract void mo41903b(int i, Exception exc);

    /* renamed from: b */
    public abstract void mo41894b(C4428fn fnVar);

    /* renamed from: b */
    public void mo41904b(AbstractC4439fx fxVar) {
        this.f11964a.remove(fxVar);
    }

    /* renamed from: b */
    public void mo41905b(AbstractC4441fz fzVar, AbstractC4451gh ghVar) {
        if (fzVar != null) {
            this.f11970b.put(fzVar, new C4436a(fzVar, ghVar));
            return;
        }
        throw new NullPointerException("Packet listener is null.");
    }

    /* renamed from: b */
    public abstract void mo41906b(boolean z);

    /* renamed from: b */
    public boolean m12670b() {
        return this.f11971c == 0;
    }

    /* renamed from: c */
    public synchronized void mo41907c() {
        this.f11974e = System.currentTimeMillis();
    }

    /* renamed from: c */
    public boolean m12672c() {
        return this.f11971c == 1;
    }

    /* renamed from: d */
    public void mo41908d() {
        synchronized (this.f11965a) {
            this.f11965a.clear();
        }
    }

    /* renamed from: d */
    public synchronized boolean m12674d() {
        return System.currentTimeMillis() - this.f11974e < ((long) C4444ga.m12707a());
    }

    /* renamed from: e */
    public synchronized boolean mo41909e() {
        boolean z;
        z = true;
        if (System.currentTimeMillis() - this.f11973d >= ((long) (C4444ga.m12707a() << 1))) {
            z = false;
        }
        return z;
    }
}

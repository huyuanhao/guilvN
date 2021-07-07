package anet.channel;

import anet.channel.entity.C0133c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: anet.channel.d */
public class C0121d {

    /* renamed from: a */
    public final Map<SessionRequest, List<Session>> f125a = new HashMap();

    /* renamed from: b */
    public final ReentrantReadWriteLock f126b;

    /* renamed from: c */
    public final ReentrantReadWriteLock.ReadLock f127c;

    /* renamed from: d */
    public final ReentrantReadWriteLock.WriteLock f128d;

    public C0121d() {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.f126b = reentrantReadWriteLock;
        this.f127c = reentrantReadWriteLock.readLock();
        this.f128d = this.f126b.writeLock();
    }

    /* renamed from: a */
    public void mo3448a(SessionRequest sessionRequest, Session session) {
        if (sessionRequest != null && sessionRequest.mo3387a() != null && session != null) {
            this.f128d.lock();
            try {
                List<Session> list = this.f125a.get(sessionRequest);
                if (list == null) {
                    list = new ArrayList<>();
                    this.f125a.put(sessionRequest, list);
                }
                if (list.indexOf(session) == -1) {
                    list.add(session);
                    Collections.sort(list);
                    this.f128d.unlock();
                }
            } finally {
                this.f128d.unlock();
            }
        }
    }

    /* renamed from: b */
    public void mo3449b(SessionRequest sessionRequest, Session session) {
        this.f128d.lock();
        try {
            List<Session> list = this.f125a.get(sessionRequest);
            if (list != null) {
                list.remove(session);
                if (list.size() == 0) {
                    this.f125a.remove(sessionRequest);
                }
                this.f128d.unlock();
            }
        } finally {
            this.f128d.unlock();
        }
    }

    /* renamed from: c */
    public boolean mo3450c(SessionRequest sessionRequest, Session session) {
        this.f127c.lock();
        try {
            List<Session> list = this.f125a.get(sessionRequest);
            boolean z = false;
            if (!(list == null || list.indexOf(session) == -1)) {
                z = true;
            }
            return z;
        } finally {
            this.f127c.unlock();
        }
    }

    /* renamed from: a */
    public List<Session> mo3447a(SessionRequest sessionRequest) {
        this.f127c.lock();
        try {
            List<Session> list = this.f125a.get(sessionRequest);
            if (list != null) {
                return new ArrayList(list);
            }
            List<Session> list2 = Collections.EMPTY_LIST;
            this.f127c.unlock();
            return list2;
        } finally {
            this.f127c.unlock();
        }
    }

    /* renamed from: a */
    public Session mo3445a(SessionRequest sessionRequest, int i) {
        this.f127c.lock();
        try {
            List<Session> list = this.f125a.get(sessionRequest);
            Session session = null;
            if (list != null) {
                if (!list.isEmpty()) {
                    Iterator<Session> it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        Session next = it.next();
                        if (next != null && next.isAvailable()) {
                            if (i == C0133c.f157c || next.f47j.getType() == i) {
                                session = next;
                            }
                        }
                    }
                    this.f127c.unlock();
                    return session;
                }
            }
            return null;
        } finally {
            this.f127c.unlock();
        }
    }

    /* renamed from: a */
    public List<SessionRequest> mo3446a() {
        List<SessionRequest> list = Collections.EMPTY_LIST;
        this.f127c.lock();
        try {
            if (this.f125a.isEmpty()) {
                return list;
            }
            ArrayList arrayList = new ArrayList(this.f125a.keySet());
            this.f127c.unlock();
            return arrayList;
        } finally {
            this.f127c.unlock();
        }
    }
}

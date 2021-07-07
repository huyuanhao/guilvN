package com.p118pd.sdk;

import anet.channel.util.ALog;
import anetwork.channel.cache.Cache;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: com.pd.sdk.o0O0oOo  reason: case insensitive filesystem */
public class C7344o0O0oOo {
    public static List<OooO00o> OooO00o = new ArrayList();

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final ReentrantReadWriteLock.ReadLock f20064OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final ReentrantReadWriteLock.WriteLock f20065OooO00o = f20066OooO00o.writeLock();

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final ReentrantReadWriteLock f20066OooO00o;

    /* renamed from: com.pd.sdk.o0O0oOo$OooO00o */
    public static class OooO00o implements Comparable<OooO00o> {
        public final Cache OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final AbstractC7346o0O0oOoO f20067OooO00o;
        public final int o00oO0O;

        public OooO00o(Cache cache, AbstractC7346o0O0oOoO o0o0oooo, int i) {
            this.OooO00o = cache;
            this.f20067OooO00o = o0o0oooo;
            this.o00oO0O = i;
        }

        /* renamed from: OooO00o */
        public int compareTo(OooO00o oooO00o) {
            return this.o00oO0O - oooO00o.o00oO0O;
        }
    }

    static {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        f20066OooO00o = reentrantReadWriteLock;
        f20064OooO00o = reentrantReadWriteLock.readLock();
    }

    public static void OooO00o(Cache cache, AbstractC7346o0O0oOoO o0o0oooo, int i) {
        if (cache == null) {
            throw new IllegalArgumentException("cache is null");
        } else if (o0o0oooo != null) {
            try {
                f20065OooO00o.lock();
                OooO00o.add(new OooO00o(cache, o0o0oooo, i));
                Collections.sort(OooO00o);
            } finally {
                f20065OooO00o.unlock();
            }
        } else {
            throw new IllegalArgumentException("prediction is null");
        }
    }

    public static void OooO00o(Cache cache) {
        try {
            f20065OooO00o.lock();
            ListIterator<OooO00o> listIterator = OooO00o.listIterator();
            while (true) {
                if (listIterator.hasNext()) {
                    if (listIterator.next().OooO00o == cache) {
                        listIterator.remove();
                        break;
                    }
                } else {
                    break;
                }
            }
        } finally {
            f20065OooO00o.unlock();
        }
    }

    public static Cache OooO00o(String str, Map<String, String> map) {
        Cache cache;
        try {
            f20064OooO00o.lock();
            Iterator<OooO00o> it = OooO00o.iterator();
            while (true) {
                if (!it.hasNext()) {
                    cache = null;
                    break;
                }
                OooO00o next = it.next();
                if (next.f20067OooO00o.handleCache(str, map)) {
                    cache = next.OooO00o;
                    break;
                }
            }
            return cache;
        } finally {
            f20064OooO00o.unlock();
        }
    }

    public static void OooO00o() {
        ALog.m292w("anet.CacheManager", "clearAllCache", null, new Object[0]);
        for (OooO00o oooO00o : OooO00o) {
            try {
                oooO00o.OooO00o.clear();
            } catch (Exception unused) {
            }
        }
    }
}

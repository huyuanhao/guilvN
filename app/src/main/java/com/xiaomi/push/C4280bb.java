package com.xiaomi.push;

import java.util.LinkedList;

/* renamed from: com.xiaomi.push.bb */
public class C4280bb {

    /* renamed from: a */
    public LinkedList<C4281a> f11418a = new LinkedList<>();

    /* renamed from: com.xiaomi.push.bb$a */
    public static class C4281a {

        /* renamed from: a */
        public static final C4280bb f11419a = new C4280bb();

        /* renamed from: a */
        public int f11420a;

        /* renamed from: a */
        public Object f11421a;

        /* renamed from: a */
        public String f11422a;

        public C4281a(int i, Object obj) {
            this.f11420a = i;
            this.f11421a = obj;
        }
    }

    /* renamed from: a */
    public static C4280bb mo41514a() {
        return C4281a.f11419a;
    }

    /* renamed from: a */
    private void m11782a() {
        if (this.f11418a.size() > 100) {
            this.f11418a.removeFirst();
        }
    }

    /* renamed from: a */
    public synchronized int m11783a() {
        return this.f11418a.size();
    }

    /* renamed from: a */
    public synchronized LinkedList<C4281a> m11784a() {
        LinkedList<C4281a> linkedList;
        linkedList = this.f11418a;
        this.f11418a = new LinkedList<>();
        return linkedList;
    }

    /* renamed from: a */
    public synchronized void mo41515a(Object obj) {
        this.f11418a.add(new C4281a(0, obj));
        m11782a();
    }
}

package com.xiaomi.push;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.xiaomi.push.el */
public final class C4385el {

    /* renamed from: com.xiaomi.push.el$a */
    public static final class C4386a extends AbstractC4373e {

        /* renamed from: a */
        public int f11659a = 0;

        /* renamed from: a */
        public List<String> f11660a = Collections.emptyList();

        /* renamed from: a */
        public boolean f11661a;

        /* renamed from: b */
        public int f11662b = 0;

        /* renamed from: b */
        public boolean f11663b;

        /* renamed from: c */
        public int f11664c = -1;

        /* renamed from: c */
        public boolean f11665c = false;

        /* renamed from: d */
        public boolean f11666d;

        /* renamed from: e */
        public boolean f11667e;

        /* renamed from: f */
        public boolean f11668f = false;

        /* renamed from: a */
        public static C4386a m12198a(byte[] bArr) {
            return (C4386a) new C4386a().mo41681a(bArr);
        }

        /* renamed from: b */
        public static C4386a m12199b(C4277b bVar) {
            return new C4386a().mo41680a(bVar);
        }

        @Override // com.xiaomi.push.AbstractC4373e, com.xiaomi.push.AbstractC4373e
        /* renamed from: a */
        public int mo41679a() {
            if (this.f11664c < 0) {
                mo41685b();
            }
            return this.f11664c;
        }

        /* renamed from: a */
        public C4386a mo41690a(int i) {
            this.f11661a = true;
            this.f11659a = i;
            return this;
        }

        @Override // com.xiaomi.push.AbstractC4373e
        /* renamed from: a */
        public C4386a mo41680a(C4277b bVar) {
            while (true) {
                int a = bVar.m11747a();
                if (a == 0) {
                    return this;
                }
                if (a == 8) {
                    mo41690a(bVar.mo41510c());
                } else if (a == 16) {
                    mo41692a(bVar.m11755a());
                } else if (a == 24) {
                    mo41693b(bVar.m11758b());
                } else if (a == 32) {
                    mo41694b(bVar.m11755a());
                } else if (a == 42) {
                    mo41691a(bVar.m11751a());
                } else if (!mo41684a(bVar, a)) {
                    return this;
                }
            }
        }

        /* renamed from: a */
        public C4386a mo41691a(String str) {
            if (str != null) {
                if (this.f11660a.isEmpty()) {
                    this.f11660a = new ArrayList();
                }
                this.f11660a.add(str);
                return this;
            }
            throw null;
        }

        /* renamed from: a */
        public C4386a mo41692a(boolean z) {
            this.f11663b = true;
            this.f11665c = z;
            return this;
        }

        @Override // com.xiaomi.push.AbstractC4373e, com.xiaomi.push.AbstractC4373e
        /* renamed from: a */
        public List<String> m12206a() {
            return this.f11660a;
        }

        @Override // com.xiaomi.push.AbstractC4373e
        /* renamed from: a */
        public void mo41683a(C4307c cVar) {
            if (m12208a()) {
                cVar.m11910b(1, mo41695c());
            }
            if (m12214c()) {
                cVar.m11900a(2, m12212b());
            }
            if (m12216d()) {
                cVar.m11895a(3, mo41696d());
            }
            if (mo41698f()) {
                cVar.m11900a(4, m12218e());
            }
            for (String str : m12206a()) {
                cVar.m11899a(5, str);
            }
        }

        @Override // com.xiaomi.push.AbstractC4373e, com.xiaomi.push.AbstractC4373e
        /* renamed from: a */
        public boolean m12208a() {
            return this.f11661a;
        }

        @Override // com.xiaomi.push.AbstractC4373e
        /* renamed from: b */
        public int mo41685b() {
            int i = 0;
            int b = m12208a() ? C4307c.mo41565b(1, mo41695c()) + 0 : 0;
            if (m12214c()) {
                b += C4307c.mo41555a(2, m12212b());
            }
            if (m12216d()) {
                b += C4307c.mo41550a(3, mo41696d());
            }
            if (mo41698f()) {
                b += C4307c.mo41555a(4, m12218e());
            }
            for (String str : m12206a()) {
                i += C4307c.mo41559a(str);
            }
            int size = b + i + (m12206a().size() * 1);
            this.f11664c = size;
            return size;
        }

        /* renamed from: b */
        public C4386a mo41693b(int i) {
            this.f11666d = true;
            this.f11662b = i;
            return this;
        }

        /* renamed from: b */
        public C4386a mo41694b(boolean z) {
            this.f11667e = true;
            this.f11668f = z;
            return this;
        }

        @Override // com.xiaomi.push.AbstractC4373e
        /* renamed from: b */
        public boolean m12212b() {
            return this.f11665c;
        }

        /* renamed from: c */
        public int mo41695c() {
            return this.f11659a;
        }

        /* renamed from: c */
        public boolean m12214c() {
            return this.f11663b;
        }

        /* renamed from: d */
        public int mo41696d() {
            return this.f11662b;
        }

        /* renamed from: d */
        public boolean m12216d() {
            return this.f11666d;
        }

        /* renamed from: e */
        public int mo41697e() {
            return this.f11660a.size();
        }

        /* renamed from: e */
        public boolean m12218e() {
            return this.f11668f;
        }

        /* renamed from: f */
        public boolean mo41698f() {
            return this.f11667e;
        }
    }
}

package com.xiaomi.push;

/* renamed from: com.xiaomi.push.em */
public final class C4387em {

    /* renamed from: com.xiaomi.push.em$a */
    public static final class C4388a extends AbstractC4373e {

        /* renamed from: a */
        public int f11669a = 0;

        /* renamed from: a */
        public long f11670a = 0;

        /* renamed from: a */
        public String f11671a = "";

        /* renamed from: a */
        public boolean f11672a;

        /* renamed from: b */
        public int f11673b = 1;

        /* renamed from: b */
        public String f11674b = "";

        /* renamed from: b */
        public boolean f11675b;

        /* renamed from: c */
        public int f11676c = 0;

        /* renamed from: c */
        public String f11677c = "";

        /* renamed from: c */
        public boolean f11678c;

        /* renamed from: d */
        public int f11679d = 0;

        /* renamed from: d */
        public String f11680d = "";

        /* renamed from: d */
        public boolean f11681d;

        /* renamed from: e */
        public int f11682e = -1;

        /* renamed from: e */
        public String f11683e = "";

        /* renamed from: e */
        public boolean f11684e;

        /* renamed from: f */
        public String f11685f = "";

        /* renamed from: f */
        public boolean f11686f;

        /* renamed from: g */
        public boolean f11687g;

        /* renamed from: h */
        public boolean f11688h;

        /* renamed from: i */
        public boolean f11689i;

        /* renamed from: j */
        public boolean f11690j;

        /* renamed from: k */
        public boolean f11691k;

        @Override // com.xiaomi.push.AbstractC4373e, com.xiaomi.push.AbstractC4373e
        /* renamed from: a */
        public int mo41679a() {
            if (this.f11682e < 0) {
                mo41685b();
            }
            return this.f11682e;
        }

        @Override // com.xiaomi.push.AbstractC4373e, com.xiaomi.push.AbstractC4373e
        /* renamed from: a */
        public long m12221a() {
            return this.f11670a;
        }

        @Override // com.xiaomi.push.AbstractC4373e, com.xiaomi.push.AbstractC4373e
        /* renamed from: a */
        public C4388a m12223a() {
            this.f11686f = false;
            this.f11680d = "";
            return this;
        }

        /* renamed from: a */
        public C4388a mo41699a(int i) {
            this.f11672a = true;
            this.f11669a = i;
            return this;
        }

        /* renamed from: a */
        public C4388a mo41700a(long j) {
            this.f11675b = true;
            this.f11670a = j;
            return this;
        }

        @Override // com.xiaomi.push.AbstractC4373e
        /* renamed from: a */
        public C4388a mo41680a(C4277b bVar) {
            while (true) {
                int a = bVar.m11747a();
                switch (a) {
                    case 0:
                        return this;
                    case 8:
                        mo41699a(bVar.m11758b());
                        break;
                    case 16:
                        mo41700a(bVar.m11759b());
                        break;
                    case 26:
                        mo41701a(bVar.m11751a());
                        break;
                    case 34:
                        mo41703b(bVar.m11751a());
                        break;
                    case 42:
                        mo41706c(bVar.m11751a());
                        break;
                    case 50:
                        mo41709d(bVar.m11751a());
                        break;
                    case 58:
                        mo41711e(bVar.m11751a());
                        break;
                    case 64:
                        mo41702b(bVar.m11758b());
                        break;
                    case 72:
                        mo41705c(bVar.m11758b());
                        break;
                    case 80:
                        mo41708d(bVar.m11758b());
                        break;
                    case 90:
                        mo41713f(bVar.m11751a());
                        break;
                    default:
                        if (mo41684a(bVar, a)) {
                            break;
                        } else {
                            return this;
                        }
                }
            }
        }

        /* renamed from: a */
        public C4388a mo41701a(String str) {
            this.f11678c = true;
            this.f11671a = str;
            return this;
        }

        @Override // com.xiaomi.push.AbstractC4373e, com.xiaomi.push.AbstractC4373e
        /* renamed from: a */
        public String m12228a() {
            return this.f11671a;
        }

        @Override // com.xiaomi.push.AbstractC4373e
        /* renamed from: a */
        public void mo41683a(C4307c cVar) {
            if (m12230a()) {
                cVar.m11895a(1, mo41704c());
            }
            if (m12235b()) {
                cVar.m11911b(2, m12221a());
            }
            if (m12240c()) {
                cVar.m11899a(3, m12228a());
            }
            if (m12245d()) {
                cVar.m11899a(4, m12234b());
            }
            if (m12249e()) {
                cVar.m11899a(5, m12239c());
            }
            if (m12253f()) {
                cVar.m11899a(6, m12244d());
            }
            if (mo41714g()) {
                cVar.m11899a(7, m12248e());
            }
            if (mo41715h()) {
                cVar.m11895a(8, mo41707d());
            }
            if (mo41716i()) {
                cVar.m11895a(9, mo41710e());
            }
            if (mo41717j()) {
                cVar.m11895a(10, mo41712f());
            }
            if (mo41718k()) {
                cVar.m11899a(11, m12252f());
            }
        }

        @Override // com.xiaomi.push.AbstractC4373e, com.xiaomi.push.AbstractC4373e
        /* renamed from: a */
        public boolean m12230a() {
            return this.f11672a;
        }

        @Override // com.xiaomi.push.AbstractC4373e
        /* renamed from: b */
        public int mo41685b() {
            int i = 0;
            if (m12230a()) {
                i = 0 + C4307c.mo41550a(1, mo41704c());
            }
            if (m12235b()) {
                i += C4307c.mo41566b(2, m12221a());
            }
            if (m12240c()) {
                i += C4307c.mo41554a(3, m12228a());
            }
            if (m12245d()) {
                i += C4307c.mo41554a(4, m12234b());
            }
            if (m12249e()) {
                i += C4307c.mo41554a(5, m12239c());
            }
            if (m12253f()) {
                i += C4307c.mo41554a(6, m12244d());
            }
            if (mo41714g()) {
                i += C4307c.mo41554a(7, m12248e());
            }
            if (mo41715h()) {
                i += C4307c.mo41550a(8, mo41707d());
            }
            if (mo41716i()) {
                i += C4307c.mo41550a(9, mo41710e());
            }
            if (mo41717j()) {
                i += C4307c.mo41550a(10, mo41712f());
            }
            if (mo41718k()) {
                i += C4307c.mo41554a(11, m12252f());
            }
            this.f11682e = i;
            return i;
        }

        /* renamed from: b */
        public C4388a mo41702b(int i) {
            this.f11688h = true;
            this.f11673b = i;
            return this;
        }

        /* renamed from: b */
        public C4388a mo41703b(String str) {
            this.f11681d = true;
            this.f11674b = str;
            return this;
        }

        @Override // com.xiaomi.push.AbstractC4373e
        /* renamed from: b */
        public String m12234b() {
            return this.f11674b;
        }

        @Override // com.xiaomi.push.AbstractC4373e
        /* renamed from: b */
        public boolean m12235b() {
            return this.f11675b;
        }

        /* renamed from: c */
        public int mo41704c() {
            return this.f11669a;
        }

        /* renamed from: c */
        public C4388a mo41705c(int i) {
            this.f11689i = true;
            this.f11676c = i;
            return this;
        }

        /* renamed from: c */
        public C4388a mo41706c(String str) {
            this.f11684e = true;
            this.f11677c = str;
            return this;
        }

        /* renamed from: c */
        public String m12239c() {
            return this.f11677c;
        }

        /* renamed from: c */
        public boolean m12240c() {
            return this.f11678c;
        }

        /* renamed from: d */
        public int mo41707d() {
            return this.f11673b;
        }

        /* renamed from: d */
        public C4388a mo41708d(int i) {
            this.f11690j = true;
            this.f11679d = i;
            return this;
        }

        /* renamed from: d */
        public C4388a mo41709d(String str) {
            this.f11686f = true;
            this.f11680d = str;
            return this;
        }

        /* renamed from: d */
        public String m12244d() {
            return this.f11680d;
        }

        /* renamed from: d */
        public boolean m12245d() {
            return this.f11681d;
        }

        /* renamed from: e */
        public int mo41710e() {
            return this.f11676c;
        }

        /* renamed from: e */
        public C4388a mo41711e(String str) {
            this.f11687g = true;
            this.f11683e = str;
            return this;
        }

        /* renamed from: e */
        public String m12248e() {
            return this.f11683e;
        }

        /* renamed from: e */
        public boolean m12249e() {
            return this.f11684e;
        }

        /* renamed from: f */
        public int mo41712f() {
            return this.f11679d;
        }

        /* renamed from: f */
        public C4388a mo41713f(String str) {
            this.f11691k = true;
            this.f11685f = str;
            return this;
        }

        /* renamed from: f */
        public String m12252f() {
            return this.f11685f;
        }

        /* renamed from: f */
        public boolean m12253f() {
            return this.f11686f;
        }

        /* renamed from: g */
        public boolean mo41714g() {
            return this.f11687g;
        }

        /* renamed from: h */
        public boolean mo41715h() {
            return this.f11688h;
        }

        /* renamed from: i */
        public boolean mo41716i() {
            return this.f11689i;
        }

        /* renamed from: j */
        public boolean mo41717j() {
            return this.f11690j;
        }

        /* renamed from: k */
        public boolean mo41718k() {
            return this.f11691k;
        }
    }

    /* renamed from: com.xiaomi.push.em$b */
    public static final class C4389b extends AbstractC4373e {

        /* renamed from: a */
        public int f11692a = 0;

        /* renamed from: a */
        public boolean f11693a;

        /* renamed from: b */
        public int f11694b = 0;

        /* renamed from: b */
        public boolean f11695b = false;

        /* renamed from: c */
        public int f11696c = 0;

        /* renamed from: c */
        public boolean f11697c;

        /* renamed from: d */
        public int f11698d = -1;

        /* renamed from: d */
        public boolean f11699d;

        /* renamed from: e */
        public boolean f11700e;

        /* renamed from: a */
        public static C4389b m12259a(byte[] bArr) {
            return (C4389b) new C4389b().mo41681a(bArr);
        }

        @Override // com.xiaomi.push.AbstractC4373e, com.xiaomi.push.AbstractC4373e
        /* renamed from: a */
        public int mo41679a() {
            if (this.f11698d < 0) {
                mo41685b();
            }
            return this.f11698d;
        }

        /* renamed from: a */
        public C4389b mo41719a(int i) {
            this.f11697c = true;
            this.f11692a = i;
            return this;
        }

        @Override // com.xiaomi.push.AbstractC4373e
        /* renamed from: a */
        public C4389b mo41680a(C4277b bVar) {
            while (true) {
                int a = bVar.m11747a();
                if (a == 0) {
                    return this;
                }
                if (a == 8) {
                    mo41720a(bVar.m11755a());
                } else if (a == 24) {
                    mo41719a(bVar.m11758b());
                } else if (a == 32) {
                    mo41721b(bVar.m11758b());
                } else if (a == 40) {
                    mo41723c(bVar.m11758b());
                } else if (!mo41684a(bVar, a)) {
                    return this;
                }
            }
        }

        /* renamed from: a */
        public C4389b mo41720a(boolean z) {
            this.f11693a = true;
            this.f11695b = z;
            return this;
        }

        @Override // com.xiaomi.push.AbstractC4373e
        /* renamed from: a */
        public void mo41683a(C4307c cVar) {
            if (m12269b()) {
                cVar.m11900a(1, m12266a());
            }
            if (m12272c()) {
                cVar.m11895a(3, mo41722c());
            }
            if (m12274d()) {
                cVar.m11895a(4, mo41724d());
            }
            if (m12276e()) {
                cVar.m11895a(5, mo41725e());
            }
        }

        @Override // com.xiaomi.push.AbstractC4373e, com.xiaomi.push.AbstractC4373e
        /* renamed from: a */
        public boolean m12266a() {
            return this.f11695b;
        }

        @Override // com.xiaomi.push.AbstractC4373e
        /* renamed from: b */
        public int mo41685b() {
            int i = 0;
            if (m12269b()) {
                i = 0 + C4307c.mo41555a(1, m12266a());
            }
            if (m12272c()) {
                i += C4307c.mo41550a(3, mo41722c());
            }
            if (m12274d()) {
                i += C4307c.mo41550a(4, mo41724d());
            }
            if (m12276e()) {
                i += C4307c.mo41550a(5, mo41725e());
            }
            this.f11698d = i;
            return i;
        }

        /* renamed from: b */
        public C4389b mo41721b(int i) {
            this.f11699d = true;
            this.f11694b = i;
            return this;
        }

        @Override // com.xiaomi.push.AbstractC4373e
        /* renamed from: b */
        public boolean m12269b() {
            return this.f11693a;
        }

        /* renamed from: c */
        public int mo41722c() {
            return this.f11692a;
        }

        /* renamed from: c */
        public C4389b mo41723c(int i) {
            this.f11700e = true;
            this.f11696c = i;
            return this;
        }

        /* renamed from: c */
        public boolean m12272c() {
            return this.f11697c;
        }

        /* renamed from: d */
        public int mo41724d() {
            return this.f11694b;
        }

        /* renamed from: d */
        public boolean m12274d() {
            return this.f11699d;
        }

        /* renamed from: e */
        public int mo41725e() {
            return this.f11696c;
        }

        /* renamed from: e */
        public boolean m12276e() {
            return this.f11700e;
        }
    }

    /* renamed from: com.xiaomi.push.em$c */
    public static final class C4390c extends AbstractC4373e {

        /* renamed from: a */
        public int f11701a = -1;

        /* renamed from: a */
        public String f11702a = "";

        /* renamed from: a */
        public boolean f11703a;

        /* renamed from: b */
        public String f11704b = "";

        /* renamed from: b */
        public boolean f11705b;

        /* renamed from: c */
        public String f11706c = "";

        /* renamed from: c */
        public boolean f11707c;

        /* renamed from: d */
        public String f11708d = "";

        /* renamed from: d */
        public boolean f11709d;

        /* renamed from: e */
        public String f11710e = "";

        /* renamed from: e */
        public boolean f11711e;

        /* renamed from: f */
        public String f11712f = "";

        /* renamed from: f */
        public boolean f11713f;

        @Override // com.xiaomi.push.AbstractC4373e, com.xiaomi.push.AbstractC4373e
        /* renamed from: a */
        public int mo41679a() {
            if (this.f11701a < 0) {
                mo41685b();
            }
            return this.f11701a;
        }

        @Override // com.xiaomi.push.AbstractC4373e
        /* renamed from: a */
        public C4390c mo41680a(C4277b bVar) {
            while (true) {
                int a = bVar.m11747a();
                if (a == 0) {
                    return this;
                }
                if (a == 10) {
                    mo41726a(bVar.m11751a());
                } else if (a == 18) {
                    mo41727b(bVar.m11751a());
                } else if (a == 26) {
                    mo41728c(bVar.m11751a());
                } else if (a == 34) {
                    mo41730d(bVar.m11751a());
                } else if (a == 42) {
                    mo41732e(bVar.m11751a());
                } else if (a == 50) {
                    mo41734f(bVar.m11751a());
                } else if (!mo41684a(bVar, a)) {
                    return this;
                }
            }
        }

        /* renamed from: a */
        public C4390c mo41726a(String str) {
            this.f11703a = true;
            this.f11702a = str;
            return this;
        }

        @Override // com.xiaomi.push.AbstractC4373e, com.xiaomi.push.AbstractC4373e
        /* renamed from: a */
        public String m12281a() {
            return this.f11702a;
        }

        @Override // com.xiaomi.push.AbstractC4373e
        /* renamed from: a */
        public void mo41683a(C4307c cVar) {
            if (m12283a()) {
                cVar.m11899a(1, m12281a());
            }
            if (m12287b()) {
                cVar.m11899a(2, m12286b());
            }
            if (m12290c()) {
                cVar.m11899a(3, mo41729c());
            }
            if (m12293d()) {
                cVar.m11899a(4, mo41731d());
            }
            if (m12296e()) {
                cVar.m11899a(5, mo41733e());
            }
            if (m12299f()) {
                cVar.m11899a(6, mo41735f());
            }
        }

        @Override // com.xiaomi.push.AbstractC4373e, com.xiaomi.push.AbstractC4373e
        /* renamed from: a */
        public boolean m12283a() {
            return this.f11703a;
        }

        @Override // com.xiaomi.push.AbstractC4373e
        /* renamed from: b */
        public int mo41685b() {
            int i = 0;
            if (m12283a()) {
                i = 0 + C4307c.mo41554a(1, m12281a());
            }
            if (m12287b()) {
                i += C4307c.mo41554a(2, m12286b());
            }
            if (m12290c()) {
                i += C4307c.mo41554a(3, mo41729c());
            }
            if (m12293d()) {
                i += C4307c.mo41554a(4, mo41731d());
            }
            if (m12296e()) {
                i += C4307c.mo41554a(5, mo41733e());
            }
            if (m12299f()) {
                i += C4307c.mo41554a(6, mo41735f());
            }
            this.f11701a = i;
            return i;
        }

        /* renamed from: b */
        public C4390c mo41727b(String str) {
            this.f11705b = true;
            this.f11704b = str;
            return this;
        }

        @Override // com.xiaomi.push.AbstractC4373e
        /* renamed from: b */
        public String m12286b() {
            return this.f11704b;
        }

        @Override // com.xiaomi.push.AbstractC4373e
        /* renamed from: b */
        public boolean m12287b() {
            return this.f11705b;
        }

        /* renamed from: c */
        public C4390c mo41728c(String str) {
            this.f11707c = true;
            this.f11706c = str;
            return this;
        }

        /* renamed from: c */
        public String mo41729c() {
            return this.f11706c;
        }

        /* renamed from: c */
        public boolean m12290c() {
            return this.f11707c;
        }

        /* renamed from: d */
        public C4390c mo41730d(String str) {
            this.f11709d = true;
            this.f11708d = str;
            return this;
        }

        /* renamed from: d */
        public String mo41731d() {
            return this.f11708d;
        }

        /* renamed from: d */
        public boolean m12293d() {
            return this.f11709d;
        }

        /* renamed from: e */
        public C4390c mo41732e(String str) {
            this.f11711e = true;
            this.f11710e = str;
            return this;
        }

        /* renamed from: e */
        public String mo41733e() {
            return this.f11710e;
        }

        /* renamed from: e */
        public boolean m12296e() {
            return this.f11711e;
        }

        /* renamed from: f */
        public C4390c mo41734f(String str) {
            this.f11713f = true;
            this.f11712f = str;
            return this;
        }

        /* renamed from: f */
        public String mo41735f() {
            return this.f11712f;
        }

        /* renamed from: f */
        public boolean m12299f() {
            return this.f11713f;
        }
    }

    /* renamed from: com.xiaomi.push.em$d */
    public static final class C4391d extends AbstractC4373e {

        /* renamed from: a */
        public int f11714a = -1;

        /* renamed from: a */
        public String f11715a = "";

        /* renamed from: a */
        public boolean f11716a;

        /* renamed from: b */
        public String f11717b = "";

        /* renamed from: b */
        public boolean f11718b = false;

        /* renamed from: c */
        public String f11719c = "";

        /* renamed from: c */
        public boolean f11720c;

        /* renamed from: d */
        public boolean f11721d;

        /* renamed from: e */
        public boolean f11722e;

        /* renamed from: a */
        public static C4391d m12300a(byte[] bArr) {
            return (C4391d) new C4391d().mo41681a(bArr);
        }

        @Override // com.xiaomi.push.AbstractC4373e, com.xiaomi.push.AbstractC4373e
        /* renamed from: a */
        public int mo41679a() {
            if (this.f11714a < 0) {
                mo41685b();
            }
            return this.f11714a;
        }

        @Override // com.xiaomi.push.AbstractC4373e
        /* renamed from: a */
        public C4391d mo41680a(C4277b bVar) {
            while (true) {
                int a = bVar.m11747a();
                if (a == 0) {
                    return this;
                }
                if (a == 8) {
                    mo41737a(bVar.m11755a());
                } else if (a == 18) {
                    mo41736a(bVar.m11751a());
                } else if (a == 26) {
                    mo41738b(bVar.m11751a());
                } else if (a == 34) {
                    mo41739c(bVar.m11751a());
                } else if (!mo41684a(bVar, a)) {
                    return this;
                }
            }
        }

        /* renamed from: a */
        public C4391d mo41736a(String str) {
            this.f11720c = true;
            this.f11715a = str;
            return this;
        }

        /* renamed from: a */
        public C4391d mo41737a(boolean z) {
            this.f11716a = true;
            this.f11718b = z;
            return this;
        }

        @Override // com.xiaomi.push.AbstractC4373e, com.xiaomi.push.AbstractC4373e
        /* renamed from: a */
        public String m12306a() {
            return this.f11715a;
        }

        @Override // com.xiaomi.push.AbstractC4373e
        /* renamed from: a */
        public void mo41683a(C4307c cVar) {
            if (m12312b()) {
                cVar.m11900a(1, m12308a());
            }
            if (m12315c()) {
                cVar.m11899a(2, m12306a());
            }
            if (mo41741d()) {
                cVar.m11899a(3, m12311b());
            }
            if (mo41742e()) {
                cVar.m11899a(4, mo41740c());
            }
        }

        @Override // com.xiaomi.push.AbstractC4373e, com.xiaomi.push.AbstractC4373e
        /* renamed from: a */
        public boolean m12308a() {
            return this.f11718b;
        }

        @Override // com.xiaomi.push.AbstractC4373e
        /* renamed from: b */
        public int mo41685b() {
            int i = 0;
            if (m12312b()) {
                i = 0 + C4307c.mo41555a(1, m12308a());
            }
            if (m12315c()) {
                i += C4307c.mo41554a(2, m12306a());
            }
            if (mo41741d()) {
                i += C4307c.mo41554a(3, m12311b());
            }
            if (mo41742e()) {
                i += C4307c.mo41554a(4, mo41740c());
            }
            this.f11714a = i;
            return i;
        }

        /* renamed from: b */
        public C4391d mo41738b(String str) {
            this.f11721d = true;
            this.f11717b = str;
            return this;
        }

        @Override // com.xiaomi.push.AbstractC4373e
        /* renamed from: b */
        public String m12311b() {
            return this.f11717b;
        }

        @Override // com.xiaomi.push.AbstractC4373e
        /* renamed from: b */
        public boolean m12312b() {
            return this.f11716a;
        }

        /* renamed from: c */
        public C4391d mo41739c(String str) {
            this.f11722e = true;
            this.f11719c = str;
            return this;
        }

        /* renamed from: c */
        public String mo41740c() {
            return this.f11719c;
        }

        /* renamed from: c */
        public boolean m12315c() {
            return this.f11720c;
        }

        /* renamed from: d */
        public boolean mo41741d() {
            return this.f11721d;
        }

        /* renamed from: e */
        public boolean mo41742e() {
            return this.f11722e;
        }
    }

    /* renamed from: com.xiaomi.push.em$e */
    public static final class C4392e extends AbstractC4373e {

        /* renamed from: a */
        public int f11723a = 0;

        /* renamed from: a */
        public C4389b f11724a = null;

        /* renamed from: a */
        public String f11725a = "";

        /* renamed from: a */
        public boolean f11726a;

        /* renamed from: b */
        public int f11727b = 0;

        /* renamed from: b */
        public String f11728b = "";

        /* renamed from: b */
        public boolean f11729b;

        /* renamed from: c */
        public int f11730c = 0;

        /* renamed from: c */
        public String f11731c = "";

        /* renamed from: c */
        public boolean f11732c;

        /* renamed from: d */
        public int f11733d = -1;

        /* renamed from: d */
        public String f11734d = "";

        /* renamed from: d */
        public boolean f11735d;

        /* renamed from: e */
        public String f11736e = "";

        /* renamed from: e */
        public boolean f11737e;

        /* renamed from: f */
        public String f11738f = "";

        /* renamed from: f */
        public boolean f11739f;

        /* renamed from: g */
        public boolean f11740g;

        /* renamed from: h */
        public boolean f11741h;

        /* renamed from: i */
        public boolean f11742i;

        /* renamed from: j */
        public boolean f11743j;

        @Override // com.xiaomi.push.AbstractC4373e, com.xiaomi.push.AbstractC4373e
        /* renamed from: a */
        public int mo41679a() {
            if (this.f11733d < 0) {
                mo41685b();
            }
            return this.f11733d;
        }

        @Override // com.xiaomi.push.AbstractC4373e, com.xiaomi.push.AbstractC4373e
        /* renamed from: a */
        public C4389b m12320a() {
            return this.f11724a;
        }

        /* renamed from: a */
        public C4392e mo41743a(int i) {
            this.f11726a = true;
            this.f11723a = i;
            return this;
        }

        @Override // com.xiaomi.push.AbstractC4373e
        /* renamed from: a */
        public C4392e mo41680a(C4277b bVar) {
            while (true) {
                int a = bVar.m11747a();
                switch (a) {
                    case 0:
                        return this;
                    case 8:
                        mo41743a(bVar.mo41510c());
                        break;
                    case 18:
                        mo41745a(bVar.m11751a());
                        break;
                    case 26:
                        mo41747b(bVar.m11751a());
                        break;
                    case 34:
                        mo41750c(bVar.m11751a());
                        break;
                    case 40:
                        mo41746b(bVar.m11758b());
                        break;
                    case 50:
                        mo41752d(bVar.m11751a());
                        break;
                    case 58:
                        mo41754e(bVar.m11751a());
                        break;
                    case 66:
                        mo41755f(bVar.m11751a());
                        break;
                    case 74:
                        C4389b bVar2 = new C4389b();
                        bVar.mo41507a(bVar2);
                        mo41744a(bVar2);
                        break;
                    case 80:
                        mo41749c(bVar.m11758b());
                        break;
                    default:
                        if (mo41684a(bVar, a)) {
                            break;
                        } else {
                            return this;
                        }
                }
            }
        }

        /* renamed from: a */
        public C4392e mo41744a(C4389b bVar) {
            if (bVar != null) {
                this.f11742i = true;
                this.f11724a = bVar;
                return this;
            }
            throw null;
        }

        /* renamed from: a */
        public C4392e mo41745a(String str) {
            this.f11729b = true;
            this.f11725a = str;
            return this;
        }

        @Override // com.xiaomi.push.AbstractC4373e, com.xiaomi.push.AbstractC4373e
        /* renamed from: a */
        public String m12325a() {
            return this.f11725a;
        }

        @Override // com.xiaomi.push.AbstractC4373e
        /* renamed from: a */
        public void mo41683a(C4307c cVar) {
            if (m12327a()) {
                cVar.m11910b(1, mo41748c());
            }
            if (m12332b()) {
                cVar.m11899a(2, m12325a());
            }
            if (m12337c()) {
                cVar.m11899a(3, m12331b());
            }
            if (m12341d()) {
                cVar.m11899a(4, m12336c());
            }
            if (m12345e()) {
                cVar.m11895a(5, mo41751d());
            }
            if (m12348f()) {
                cVar.m11899a(6, m12340d());
            }
            if (mo41757g()) {
                cVar.m11899a(7, m12344e());
            }
            if (mo41758h()) {
                cVar.m11899a(8, mo41756f());
            }
            if (mo41759i()) {
                cVar.m11898a(9, (AbstractC4373e) m12320a());
            }
            if (mo41760j()) {
                cVar.m11895a(10, mo41753e());
            }
        }

        @Override // com.xiaomi.push.AbstractC4373e, com.xiaomi.push.AbstractC4373e
        /* renamed from: a */
        public boolean m12327a() {
            return this.f11726a;
        }

        @Override // com.xiaomi.push.AbstractC4373e
        /* renamed from: b */
        public int mo41685b() {
            int i = 0;
            if (m12327a()) {
                i = 0 + C4307c.mo41565b(1, mo41748c());
            }
            if (m12332b()) {
                i += C4307c.mo41554a(2, m12325a());
            }
            if (m12337c()) {
                i += C4307c.mo41554a(3, m12331b());
            }
            if (m12341d()) {
                i += C4307c.mo41554a(4, m12336c());
            }
            if (m12345e()) {
                i += C4307c.mo41550a(5, mo41751d());
            }
            if (m12348f()) {
                i += C4307c.mo41554a(6, m12340d());
            }
            if (mo41757g()) {
                i += C4307c.mo41554a(7, m12344e());
            }
            if (mo41758h()) {
                i += C4307c.mo41554a(8, mo41756f());
            }
            if (mo41759i()) {
                i += C4307c.mo41553a(9, (AbstractC4373e) m12320a());
            }
            if (mo41760j()) {
                i += C4307c.mo41550a(10, mo41753e());
            }
            this.f11733d = i;
            return i;
        }

        /* renamed from: b */
        public C4392e mo41746b(int i) {
            this.f11737e = true;
            this.f11727b = i;
            return this;
        }

        /* renamed from: b */
        public C4392e mo41747b(String str) {
            this.f11732c = true;
            this.f11728b = str;
            return this;
        }

        @Override // com.xiaomi.push.AbstractC4373e
        /* renamed from: b */
        public String m12331b() {
            return this.f11728b;
        }

        @Override // com.xiaomi.push.AbstractC4373e
        /* renamed from: b */
        public boolean m12332b() {
            return this.f11729b;
        }

        /* renamed from: c */
        public int mo41748c() {
            return this.f11723a;
        }

        /* renamed from: c */
        public C4392e mo41749c(int i) {
            this.f11743j = true;
            this.f11730c = i;
            return this;
        }

        /* renamed from: c */
        public C4392e mo41750c(String str) {
            this.f11735d = true;
            this.f11731c = str;
            return this;
        }

        /* renamed from: c */
        public String m12336c() {
            return this.f11731c;
        }

        /* renamed from: c */
        public boolean m12337c() {
            return this.f11732c;
        }

        /* renamed from: d */
        public int mo41751d() {
            return this.f11727b;
        }

        /* renamed from: d */
        public C4392e mo41752d(String str) {
            this.f11739f = true;
            this.f11734d = str;
            return this;
        }

        /* renamed from: d */
        public String m12340d() {
            return this.f11734d;
        }

        /* renamed from: d */
        public boolean m12341d() {
            return this.f11735d;
        }

        /* renamed from: e */
        public int mo41753e() {
            return this.f11730c;
        }

        /* renamed from: e */
        public C4392e mo41754e(String str) {
            this.f11740g = true;
            this.f11736e = str;
            return this;
        }

        /* renamed from: e */
        public String m12344e() {
            return this.f11736e;
        }

        /* renamed from: e */
        public boolean m12345e() {
            return this.f11737e;
        }

        /* renamed from: f */
        public C4392e mo41755f(String str) {
            this.f11741h = true;
            this.f11738f = str;
            return this;
        }

        /* renamed from: f */
        public String mo41756f() {
            return this.f11738f;
        }

        /* renamed from: f */
        public boolean m12348f() {
            return this.f11739f;
        }

        /* renamed from: g */
        public boolean mo41757g() {
            return this.f11740g;
        }

        /* renamed from: h */
        public boolean mo41758h() {
            return this.f11741h;
        }

        /* renamed from: i */
        public boolean mo41759i() {
            return this.f11742i;
        }

        /* renamed from: j */
        public boolean mo41760j() {
            return this.f11743j;
        }
    }

    /* renamed from: com.xiaomi.push.em$f */
    public static final class C4393f extends AbstractC4373e {

        /* renamed from: a */
        public int f11744a = -1;

        /* renamed from: a */
        public C4389b f11745a = null;

        /* renamed from: a */
        public String f11746a = "";

        /* renamed from: a */
        public boolean f11747a;

        /* renamed from: b */
        public String f11748b = "";

        /* renamed from: b */
        public boolean f11749b;

        /* renamed from: c */
        public boolean f11750c;

        /* renamed from: a */
        public static C4393f m12353a(byte[] bArr) {
            return (C4393f) new C4393f().mo41681a(bArr);
        }

        @Override // com.xiaomi.push.AbstractC4373e, com.xiaomi.push.AbstractC4373e
        /* renamed from: a */
        public int mo41679a() {
            if (this.f11744a < 0) {
                mo41685b();
            }
            return this.f11744a;
        }

        @Override // com.xiaomi.push.AbstractC4373e, com.xiaomi.push.AbstractC4373e
        /* renamed from: a */
        public C4389b m12356a() {
            return this.f11745a;
        }

        @Override // com.xiaomi.push.AbstractC4373e
        /* renamed from: a */
        public C4393f mo41680a(C4277b bVar) {
            while (true) {
                int a = bVar.m11747a();
                if (a == 0) {
                    return this;
                }
                if (a == 10) {
                    mo41762a(bVar.m11751a());
                } else if (a == 18) {
                    mo41763b(bVar.m11751a());
                } else if (a == 26) {
                    C4389b bVar2 = new C4389b();
                    bVar.mo41507a(bVar2);
                    mo41761a(bVar2);
                } else if (!mo41684a(bVar, a)) {
                    return this;
                }
            }
        }

        /* renamed from: a */
        public C4393f mo41761a(C4389b bVar) {
            if (bVar != null) {
                this.f11750c = true;
                this.f11745a = bVar;
                return this;
            }
            throw null;
        }

        /* renamed from: a */
        public C4393f mo41762a(String str) {
            this.f11747a = true;
            this.f11746a = str;
            return this;
        }

        @Override // com.xiaomi.push.AbstractC4373e, com.xiaomi.push.AbstractC4373e
        /* renamed from: a */
        public String m12360a() {
            return this.f11746a;
        }

        @Override // com.xiaomi.push.AbstractC4373e
        /* renamed from: a */
        public void mo41683a(C4307c cVar) {
            if (m12362a()) {
                cVar.m11899a(1, m12360a());
            }
            if (m12366b()) {
                cVar.m11899a(2, m12365b());
            }
            if (mo41764c()) {
                cVar.m11898a(3, (AbstractC4373e) m12356a());
            }
        }

        @Override // com.xiaomi.push.AbstractC4373e, com.xiaomi.push.AbstractC4373e
        /* renamed from: a */
        public boolean m12362a() {
            return this.f11747a;
        }

        @Override // com.xiaomi.push.AbstractC4373e
        /* renamed from: b */
        public int mo41685b() {
            int i = 0;
            if (m12362a()) {
                i = 0 + C4307c.mo41554a(1, m12360a());
            }
            if (m12366b()) {
                i += C4307c.mo41554a(2, m12365b());
            }
            if (mo41764c()) {
                i += C4307c.mo41553a(3, (AbstractC4373e) m12356a());
            }
            this.f11744a = i;
            return i;
        }

        /* renamed from: b */
        public C4393f mo41763b(String str) {
            this.f11749b = true;
            this.f11748b = str;
            return this;
        }

        @Override // com.xiaomi.push.AbstractC4373e
        /* renamed from: b */
        public String m12365b() {
            return this.f11748b;
        }

        @Override // com.xiaomi.push.AbstractC4373e
        /* renamed from: b */
        public boolean m12366b() {
            return this.f11749b;
        }

        /* renamed from: c */
        public boolean mo41764c() {
            return this.f11750c;
        }
    }

    /* renamed from: com.xiaomi.push.em$g */
    public static final class C4394g extends AbstractC4373e {

        /* renamed from: a */
        public int f11751a = -1;

        /* renamed from: a */
        public String f11752a = "";

        /* renamed from: a */
        public boolean f11753a;

        /* renamed from: b */
        public String f11754b = "";

        /* renamed from: b */
        public boolean f11755b;

        /* renamed from: c */
        public String f11756c = "";

        /* renamed from: c */
        public boolean f11757c;

        /* renamed from: a */
        public static C4394g m12368a(byte[] bArr) {
            return (C4394g) new C4394g().mo41681a(bArr);
        }

        @Override // com.xiaomi.push.AbstractC4373e, com.xiaomi.push.AbstractC4373e
        /* renamed from: a */
        public int mo41679a() {
            if (this.f11751a < 0) {
                mo41685b();
            }
            return this.f11751a;
        }

        @Override // com.xiaomi.push.AbstractC4373e
        /* renamed from: a */
        public C4394g mo41680a(C4277b bVar) {
            while (true) {
                int a = bVar.m11747a();
                if (a == 0) {
                    return this;
                }
                if (a == 10) {
                    mo41765a(bVar.m11751a());
                } else if (a == 18) {
                    mo41766b(bVar.m11751a());
                } else if (a == 26) {
                    mo41767c(bVar.m11751a());
                } else if (!mo41684a(bVar, a)) {
                    return this;
                }
            }
        }

        /* renamed from: a */
        public C4394g mo41765a(String str) {
            this.f11753a = true;
            this.f11752a = str;
            return this;
        }

        @Override // com.xiaomi.push.AbstractC4373e, com.xiaomi.push.AbstractC4373e
        /* renamed from: a */
        public String m12373a() {
            return this.f11752a;
        }

        @Override // com.xiaomi.push.AbstractC4373e
        /* renamed from: a */
        public void mo41683a(C4307c cVar) {
            if (m12375a()) {
                cVar.m11899a(1, m12373a());
            }
            if (m12379b()) {
                cVar.m11899a(2, m12378b());
            }
            if (m12382c()) {
                cVar.m11899a(3, mo41768c());
            }
        }

        @Override // com.xiaomi.push.AbstractC4373e, com.xiaomi.push.AbstractC4373e
        /* renamed from: a */
        public boolean m12375a() {
            return this.f11753a;
        }

        @Override // com.xiaomi.push.AbstractC4373e
        /* renamed from: b */
        public int mo41685b() {
            int i = 0;
            if (m12375a()) {
                i = 0 + C4307c.mo41554a(1, m12373a());
            }
            if (m12379b()) {
                i += C4307c.mo41554a(2, m12378b());
            }
            if (m12382c()) {
                i += C4307c.mo41554a(3, mo41768c());
            }
            this.f11751a = i;
            return i;
        }

        /* renamed from: b */
        public C4394g mo41766b(String str) {
            this.f11755b = true;
            this.f11754b = str;
            return this;
        }

        @Override // com.xiaomi.push.AbstractC4373e
        /* renamed from: b */
        public String m12378b() {
            return this.f11754b;
        }

        @Override // com.xiaomi.push.AbstractC4373e
        /* renamed from: b */
        public boolean m12379b() {
            return this.f11755b;
        }

        /* renamed from: c */
        public C4394g mo41767c(String str) {
            this.f11757c = true;
            this.f11756c = str;
            return this;
        }

        /* renamed from: c */
        public String mo41768c() {
            return this.f11756c;
        }

        /* renamed from: c */
        public boolean m12382c() {
            return this.f11757c;
        }
    }

    /* renamed from: com.xiaomi.push.em$h */
    public static final class C4395h extends AbstractC4373e {

        /* renamed from: a */
        public int f11758a = 0;

        /* renamed from: a */
        public String f11759a = "";

        /* renamed from: a */
        public boolean f11760a;

        /* renamed from: b */
        public int f11761b = -1;

        /* renamed from: b */
        public boolean f11762b;

        /* renamed from: a */
        public static C4395h m12383a(byte[] bArr) {
            return (C4395h) new C4395h().mo41681a(bArr);
        }

        @Override // com.xiaomi.push.AbstractC4373e, com.xiaomi.push.AbstractC4373e
        /* renamed from: a */
        public int mo41679a() {
            if (this.f11761b < 0) {
                mo41685b();
            }
            return this.f11761b;
        }

        /* renamed from: a */
        public C4395h mo41769a(int i) {
            this.f11760a = true;
            this.f11758a = i;
            return this;
        }

        @Override // com.xiaomi.push.AbstractC4373e
        /* renamed from: a */
        public C4395h mo41680a(C4277b bVar) {
            while (true) {
                int a = bVar.m11747a();
                if (a == 0) {
                    return this;
                }
                if (a == 8) {
                    mo41769a(bVar.m11758b());
                } else if (a == 18) {
                    mo41770a(bVar.m11751a());
                } else if (!mo41684a(bVar, a)) {
                    return this;
                }
            }
        }

        /* renamed from: a */
        public C4395h mo41770a(String str) {
            this.f11762b = true;
            this.f11759a = str;
            return this;
        }

        @Override // com.xiaomi.push.AbstractC4373e, com.xiaomi.push.AbstractC4373e
        /* renamed from: a */
        public String m12389a() {
            return this.f11759a;
        }

        @Override // com.xiaomi.push.AbstractC4373e
        /* renamed from: a */
        public void mo41683a(C4307c cVar) {
            if (m12391a()) {
                cVar.m11895a(1, mo41771c());
            }
            if (m12393b()) {
                cVar.m11899a(2, m12389a());
            }
        }

        @Override // com.xiaomi.push.AbstractC4373e, com.xiaomi.push.AbstractC4373e
        /* renamed from: a */
        public boolean m12391a() {
            return this.f11760a;
        }

        @Override // com.xiaomi.push.AbstractC4373e
        /* renamed from: b */
        public int mo41685b() {
            int i = 0;
            if (m12391a()) {
                i = 0 + C4307c.mo41550a(1, mo41771c());
            }
            if (m12393b()) {
                i += C4307c.mo41554a(2, m12389a());
            }
            this.f11761b = i;
            return i;
        }

        @Override // com.xiaomi.push.AbstractC4373e
        /* renamed from: b */
        public boolean m12393b() {
            return this.f11762b;
        }

        /* renamed from: c */
        public int mo41771c() {
            return this.f11758a;
        }
    }

    /* renamed from: com.xiaomi.push.em$i */
    public static final class C4396i extends AbstractC4373e {

        /* renamed from: a */
        public int f11763a = -1;

        /* renamed from: a */
        public C4242a f11764a = C4242a.f11337a;

        /* renamed from: a */
        public boolean f11765a;

        /* renamed from: a */
        public static C4396i m12395a(byte[] bArr) {
            return (C4396i) new C4396i().mo41681a(bArr);
        }

        @Override // com.xiaomi.push.AbstractC4373e, com.xiaomi.push.AbstractC4373e
        /* renamed from: a */
        public int mo41679a() {
            if (this.f11763a < 0) {
                mo41685b();
            }
            return this.f11763a;
        }

        @Override // com.xiaomi.push.AbstractC4373e, com.xiaomi.push.AbstractC4373e
        /* renamed from: a */
        public C4242a m12397a() {
            return this.f11764a;
        }

        /* renamed from: a */
        public C4396i mo41772a(C4242a aVar) {
            this.f11765a = true;
            this.f11764a = aVar;
            return this;
        }

        @Override // com.xiaomi.push.AbstractC4373e
        /* renamed from: a */
        public C4396i mo41680a(C4277b bVar) {
            while (true) {
                int a = bVar.m11747a();
                if (a == 0) {
                    return this;
                }
                if (a == 10) {
                    mo41772a(bVar.m11750a());
                } else if (!mo41684a(bVar, a)) {
                    return this;
                }
            }
        }

        @Override // com.xiaomi.push.AbstractC4373e
        /* renamed from: a */
        public void mo41683a(C4307c cVar) {
            if (m12402a()) {
                cVar.m11897a(1, m12397a());
            }
        }

        @Override // com.xiaomi.push.AbstractC4373e, com.xiaomi.push.AbstractC4373e
        /* renamed from: a */
        public boolean m12402a() {
            return this.f11765a;
        }

        @Override // com.xiaomi.push.AbstractC4373e
        /* renamed from: b */
        public int mo41685b() {
            int i = 0;
            if (m12402a()) {
                i = 0 + C4307c.mo41552a(1, m12397a());
            }
            this.f11763a = i;
            return i;
        }
    }

    /* renamed from: com.xiaomi.push.em$j */
    public static final class C4397j extends AbstractC4373e {

        /* renamed from: a */
        public int f11766a = -1;

        /* renamed from: a */
        public C4242a f11767a = C4242a.f11337a;

        /* renamed from: a */
        public C4389b f11768a = null;

        /* renamed from: a */
        public boolean f11769a;

        /* renamed from: b */
        public boolean f11770b;

        /* renamed from: a */
        public static C4397j m12404a(byte[] bArr) {
            return (C4397j) new C4397j().mo41681a(bArr);
        }

        @Override // com.xiaomi.push.AbstractC4373e, com.xiaomi.push.AbstractC4373e
        /* renamed from: a */
        public int mo41679a() {
            if (this.f11766a < 0) {
                mo41685b();
            }
            return this.f11766a;
        }

        @Override // com.xiaomi.push.AbstractC4373e, com.xiaomi.push.AbstractC4373e
        /* renamed from: a */
        public C4242a m12406a() {
            return this.f11767a;
        }

        @Override // com.xiaomi.push.AbstractC4373e, com.xiaomi.push.AbstractC4373e
        /* renamed from: a */
        public C4389b m12408a() {
            return this.f11768a;
        }

        /* renamed from: a */
        public C4397j mo41773a(C4242a aVar) {
            this.f11769a = true;
            this.f11767a = aVar;
            return this;
        }

        @Override // com.xiaomi.push.AbstractC4373e
        /* renamed from: a */
        public C4397j mo41680a(C4277b bVar) {
            while (true) {
                int a = bVar.m11747a();
                if (a == 0) {
                    return this;
                }
                if (a == 10) {
                    mo41773a(bVar.m11750a());
                } else if (a == 18) {
                    C4389b bVar2 = new C4389b();
                    bVar.mo41507a(bVar2);
                    mo41774a(bVar2);
                } else if (!mo41684a(bVar, a)) {
                    return this;
                }
            }
        }

        /* renamed from: a */
        public C4397j mo41774a(C4389b bVar) {
            if (bVar != null) {
                this.f11770b = true;
                this.f11768a = bVar;
                return this;
            }
            throw null;
        }

        @Override // com.xiaomi.push.AbstractC4373e
        /* renamed from: a */
        public void mo41683a(C4307c cVar) {
            if (m12413a()) {
                cVar.m11897a(1, m12406a());
            }
            if (m12415b()) {
                cVar.m11898a(2, (AbstractC4373e) m12408a());
            }
        }

        @Override // com.xiaomi.push.AbstractC4373e, com.xiaomi.push.AbstractC4373e
        /* renamed from: a */
        public boolean m12413a() {
            return this.f11769a;
        }

        @Override // com.xiaomi.push.AbstractC4373e
        /* renamed from: b */
        public int mo41685b() {
            int i = 0;
            if (m12413a()) {
                i = 0 + C4307c.mo41552a(1, m12406a());
            }
            if (m12415b()) {
                i += C4307c.mo41553a(2, (AbstractC4373e) m12408a());
            }
            this.f11766a = i;
            return i;
        }

        @Override // com.xiaomi.push.AbstractC4373e
        /* renamed from: b */
        public boolean m12415b() {
            return this.f11770b;
        }
    }

    /* renamed from: com.xiaomi.push.em$k */
    public static final class C4398k extends AbstractC4373e {

        /* renamed from: a */
        public int f11771a = 0;

        /* renamed from: a */
        public long f11772a = 0;

        /* renamed from: a */
        public String f11773a = "";

        /* renamed from: a */
        public boolean f11774a;

        /* renamed from: b */
        public int f11775b = -1;

        /* renamed from: b */
        public long f11776b = 0;

        /* renamed from: b */
        public String f11777b = "";

        /* renamed from: b */
        public boolean f11778b;

        /* renamed from: c */
        public boolean f11779c;

        /* renamed from: d */
        public boolean f11780d;

        /* renamed from: e */
        public boolean f11781e;

        /* renamed from: f */
        public boolean f11782f = false;

        /* renamed from: g */
        public boolean f11783g;

        /* renamed from: a */
        public static C4398k m12416a(byte[] bArr) {
            return (C4398k) new C4398k().mo41681a(bArr);
        }

        @Override // com.xiaomi.push.AbstractC4373e, com.xiaomi.push.AbstractC4373e
        /* renamed from: a */
        public int mo41679a() {
            if (this.f11775b < 0) {
                mo41685b();
            }
            return this.f11775b;
        }

        @Override // com.xiaomi.push.AbstractC4373e, com.xiaomi.push.AbstractC4373e
        /* renamed from: a */
        public long m12418a() {
            return this.f11772a;
        }

        /* renamed from: a */
        public C4398k mo41775a(int i) {
            this.f11783g = true;
            this.f11771a = i;
            return this;
        }

        /* renamed from: a */
        public C4398k mo41776a(long j) {
            this.f11779c = true;
            this.f11772a = j;
            return this;
        }

        @Override // com.xiaomi.push.AbstractC4373e
        /* renamed from: a */
        public C4398k mo41680a(C4277b bVar) {
            while (true) {
                int a = bVar.m11747a();
                if (a == 0) {
                    return this;
                }
                if (a == 10) {
                    mo41777a(bVar.m11751a());
                } else if (a == 18) {
                    mo41780b(bVar.m11751a());
                } else if (a == 24) {
                    mo41776a(bVar.m11749a());
                } else if (a == 32) {
                    mo41779b(bVar.m11749a());
                } else if (a == 40) {
                    mo41778a(bVar.m11755a());
                } else if (a == 48) {
                    mo41775a(bVar.m11758b());
                } else if (!mo41684a(bVar, a)) {
                    return this;
                }
            }
        }

        /* renamed from: a */
        public C4398k mo41777a(String str) {
            this.f11774a = true;
            this.f11773a = str;
            return this;
        }

        /* renamed from: a */
        public C4398k mo41778a(boolean z) {
            this.f11781e = true;
            this.f11782f = z;
            return this;
        }

        @Override // com.xiaomi.push.AbstractC4373e, com.xiaomi.push.AbstractC4373e
        /* renamed from: a */
        public String m12425a() {
            return this.f11773a;
        }

        @Override // com.xiaomi.push.AbstractC4373e
        /* renamed from: a */
        public void mo41683a(C4307c cVar) {
            if (m12427a()) {
                cVar.m11899a(1, m12425a());
            }
            if (m12433b()) {
                cVar.m11899a(2, m12432b());
            }
            if (m12435c()) {
                cVar.m11896a(3, m12418a());
            }
            if (mo41782d()) {
                cVar.m11896a(4, m12429b());
            }
            if (mo41784f()) {
                cVar.m11900a(5, mo41783e());
            }
            if (mo41785g()) {
                cVar.m11895a(6, mo41781c());
            }
        }

        @Override // com.xiaomi.push.AbstractC4373e, com.xiaomi.push.AbstractC4373e
        /* renamed from: a */
        public boolean m12427a() {
            return this.f11774a;
        }

        @Override // com.xiaomi.push.AbstractC4373e
        /* renamed from: b */
        public int mo41685b() {
            int i = 0;
            if (m12427a()) {
                i = 0 + C4307c.mo41554a(1, m12425a());
            }
            if (m12433b()) {
                i += C4307c.mo41554a(2, m12432b());
            }
            if (m12435c()) {
                i += C4307c.mo41551a(3, m12418a());
            }
            if (mo41782d()) {
                i += C4307c.mo41551a(4, m12429b());
            }
            if (mo41784f()) {
                i += C4307c.mo41555a(5, mo41783e());
            }
            if (mo41785g()) {
                i += C4307c.mo41550a(6, mo41781c());
            }
            this.f11775b = i;
            return i;
        }

        @Override // com.xiaomi.push.AbstractC4373e
        /* renamed from: b */
        public long m12429b() {
            return this.f11776b;
        }

        /* renamed from: b */
        public C4398k mo41779b(long j) {
            this.f11780d = true;
            this.f11776b = j;
            return this;
        }

        /* renamed from: b */
        public C4398k mo41780b(String str) {
            this.f11778b = true;
            this.f11777b = str;
            return this;
        }

        @Override // com.xiaomi.push.AbstractC4373e
        /* renamed from: b */
        public String m12432b() {
            return this.f11777b;
        }

        @Override // com.xiaomi.push.AbstractC4373e
        /* renamed from: b */
        public boolean m12433b() {
            return this.f11778b;
        }

        /* renamed from: c */
        public int mo41781c() {
            return this.f11771a;
        }

        /* renamed from: c */
        public boolean m12435c() {
            return this.f11779c;
        }

        /* renamed from: d */
        public boolean mo41782d() {
            return this.f11780d;
        }

        /* renamed from: e */
        public boolean mo41783e() {
            return this.f11782f;
        }

        /* renamed from: f */
        public boolean mo41784f() {
            return this.f11781e;
        }

        /* renamed from: g */
        public boolean mo41785g() {
            return this.f11783g;
        }
    }
}

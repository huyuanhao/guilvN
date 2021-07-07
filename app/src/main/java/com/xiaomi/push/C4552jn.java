package com.xiaomi.push;

/* renamed from: com.xiaomi.push.jn */
public class C4552jn {

    /* renamed from: a */
    public static int f13029a = Integer.MAX_VALUE;

    /* renamed from: a */
    public static void m13693a(AbstractC4549jk jkVar, byte b) {
        m13694a(jkVar, b, f13029a);
    }

    /* renamed from: a */
    public static void m13694a(AbstractC4549jk jkVar, byte b, int i) {
        if (i > 0) {
            int i2 = 0;
            switch (b) {
                case 2:
                    jkVar.m13681a();
                    return;
                case 3:
                    jkVar.mo42569a();
                    return;
                case 4:
                    jkVar.m13658a();
                    return;
                case 5:
                case 7:
                case 9:
                default:
                    return;
                case 6:
                    jkVar.m13668a();
                    return;
                case 8:
                    jkVar.m13659a();
                    return;
                case 10:
                    jkVar.m13660a();
                    return;
                case 11:
                    jkVar.m13667a();
                    return;
                case 12:
                    jkVar.m13665a();
                    while (true) {
                        byte b2 = jkVar.m13661a().f13019a;
                        if (b2 == 0) {
                            jkVar.mo42587f();
                            return;
                        } else {
                            m13694a(jkVar, b2, i - 1);
                            jkVar.mo42588g();
                        }
                    }
                case 13:
                    C4548jj a = jkVar.m13663a();
                    while (i2 < a.f13025a) {
                        int i3 = i - 1;
                        m13694a(jkVar, a.f13024a, i3);
                        m13694a(jkVar, a.f13026b, i3);
                        i2++;
                    }
                    jkVar.mo42589h();
                    return;
                case 14:
                    C4553jo a2 = jkVar.m13664a();
                    while (i2 < a2.f13031a) {
                        m13694a(jkVar, a2.f13030a, i - 1);
                        i2++;
                    }
                    jkVar.mo42591j();
                    return;
                case 15:
                    C4547ji a3 = jkVar.m13662a();
                    while (i2 < a3.f13023a) {
                        m13694a(jkVar, a3.f13022a, i - 1);
                        i2++;
                    }
                    jkVar.mo42590i();
                    return;
            }
        } else {
            throw new C4542je("Maximum skip depth exceeded");
        }
    }
}

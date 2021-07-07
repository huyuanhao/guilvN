package com.umeng.commonsdk.proguard;

import com.p118pd.sdk.O0O00O;
import com.umeng.commonsdk.proguard.C3571am;

/* renamed from: com.umeng.commonsdk.proguard.av */
public class C3582av {

    /* renamed from: a */
    public static int f9253a = Integer.MAX_VALUE;

    /* renamed from: a */
    public static void m9430a(int i) {
        f9253a = i;
    }

    /* renamed from: a */
    public static void m9431a(AbstractC3579as asVar, byte b) throws C3636z {
        m9432a(asVar, b, f9253a);
    }

    /* renamed from: a */
    public static void m9432a(AbstractC3579as asVar, byte b, int i) throws C3636z {
        if (i > 0) {
            int i2 = 0;
            switch (b) {
                case 2:
                    asVar.mo38943t();
                    return;
                case 3:
                    asVar.mo38944u();
                    return;
                case 4:
                    asVar.mo38948y();
                    return;
                case 5:
                case 7:
                case 9:
                default:
                    return;
                case 6:
                    asVar.mo38945v();
                    return;
                case 8:
                    asVar.mo38946w();
                    return;
                case 10:
                    asVar.mo38947x();
                    return;
                case 11:
                    asVar.mo38906A();
                    return;
                case 12:
                    asVar.mo38933j();
                    while (true) {
                        byte b2 = asVar.mo38935l().f9230b;
                        if (b2 == 0) {
                            asVar.mo38934k();
                            return;
                        } else {
                            m9432a(asVar, b2, i - 1);
                            asVar.mo38936m();
                        }
                    }
                case 13:
                    C3576ap n = asVar.mo38937n();
                    while (i2 < n.f9236c) {
                        int i3 = i - 1;
                        m9432a(asVar, n.f9234a, i3);
                        m9432a(asVar, n.f9235b, i3);
                        i2++;
                    }
                    asVar.mo38938o();
                    return;
                case 14:
                    C3583aw r = asVar.mo38941r();
                    while (i2 < r.f9255b) {
                        m9432a(asVar, r.f9254a, i - 1);
                        i2++;
                    }
                    asVar.mo38942s();
                    return;
                case 15:
                    C3575ao p = asVar.mo38939p();
                    while (i2 < p.f9233b) {
                        m9432a(asVar, p.f9232a, i - 1);
                        i2++;
                    }
                    asVar.mo38940q();
                    return;
            }
        } else {
            throw new C3636z("Maximum skip depth exceeded");
        }
    }

    /* renamed from: a */
    public static AbstractC3581au m9429a(byte[] bArr, AbstractC3581au auVar) {
        if (bArr[0] > 16) {
            return new C3571am.C3572a();
        }
        return (bArr.length <= 1 || (bArr[1] & O0O00O.OooO00o) == 0) ? auVar : new C3571am.C3572a();
    }
}

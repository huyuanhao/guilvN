package com.tencent.bugly.beta.upgrade;

import com.tencent.bugly.beta.Beta;
import com.tencent.bugly.beta.global.C3226e;
import com.tencent.bugly.beta.global.RunnableC3225d;
import com.tencent.bugly.beta.utils.C3254e;
import com.tencent.bugly.proguard.AbstractC3313aj;
import com.tencent.bugly.proguard.C3301aa;
import com.tencent.bugly.proguard.C3311ah;
import com.tencent.bugly.proguard.C3321an;
import com.tencent.bugly.proguard.C3341be;
import com.tencent.bugly.proguard.C3343bg;
import com.tencent.bugly.proguard.C3360p;
import com.tencent.bugly.proguard.C3361q;
import com.tencent.bugly.proguard.C3371x;
import com.tencent.bugly.proguard.C3372y;

/* renamed from: com.tencent.bugly.beta.upgrade.a */
public class C3245a implements AbstractC3313aj {

    /* renamed from: a */
    public final int f7483a;

    /* renamed from: b */
    public final int f7484b;

    /* renamed from: c */
    public final Object[] f7485c;

    /* renamed from: d */
    public boolean f7486d = false;

    public C3245a(int i, int i2, Object... objArr) {
        this.f7483a = i;
        this.f7484b = i2;
        this.f7485c = objArr;
    }

    @Override // com.tencent.bugly.proguard.AbstractC3313aj
    /* renamed from: a */
    public void mo38038a(int i) {
    }

    @Override // com.tencent.bugly.proguard.AbstractC3313aj
    /* renamed from: a */
    public synchronized void mo38039a(int i, C3341be beVar, long j, long j2, boolean z, String str) {
        C3343bg bgVar;
        C3372y yVar;
        C3301aa aaVar;
        C3301aa aaVar2;
        try {
            if (!this.f7486d && i == this.f7484b) {
                Object[] objArr = new Object[4];
                objArr[0] = z ? "succ" : "err";
                objArr[1] = Integer.valueOf(i);
                objArr[2] = Long.valueOf(j);
                objArr[3] = Long.valueOf(j2);
                C3321an.m8349a("upload %s:[%d] [sended %d] [recevied %d]", objArr);
                int i2 = this.f7483a;
                if (i2 == 1) {
                    boolean booleanValue = ((Boolean) this.f7485c[0]).booleanValue();
                    boolean booleanValue2 = ((Boolean) this.f7485c[1]).booleanValue();
                    if (this.f7484b == 804) {
                        C3372y yVar2 = null;
                        if (!z || beVar == null || (aaVar = (C3301aa) C3311ah.m8285a(beVar.f8152c, C3301aa.class)) == null) {
                            yVar = null;
                            bgVar = null;
                        } else {
                            bgVar = aaVar.f7940a;
                            yVar = aaVar.f7941b;
                        }
                        C3247c.f7488a.mo38043a(bgVar);
                        BetaGrayStrategy betaGrayStrategy = (BetaGrayStrategy) this.f7485c[2];
                        if (yVar != null) {
                            yVar2 = yVar;
                        } else if (betaGrayStrategy != null) {
                            yVar2 = betaGrayStrategy.f7476a;
                        }
                        int i3 = -1;
                        if (yVar2 != null) {
                            int i4 = yVar2.f8306p;
                            if (i4 == 1) {
                                C3247c cVar = C3247c.f7488a;
                                if (z) {
                                    i3 = 0;
                                }
                                cVar.mo38045a(booleanValue, booleanValue2, i3, yVar, str);
                                C3226e.f7357E.f7388ae = 1;
                            } else if (i4 != 2) {
                                if (i4 != 3) {
                                    C3321an.m8349a("unexpected updatetype", new Object[0]);
                                } else {
                                    C3226e.f7357E.f7388ae = 3;
                                    C3361q qVar = C3361q.f8239a;
                                    if (z) {
                                        i3 = 0;
                                    }
                                    qVar.mo38507a(i3, yVar, false);
                                    if (C3247c.f7488a.f7493f != null) {
                                        C3254e.m7893a(new RunnableC3225d(18, C3247c.f7488a.f7493f, 1, Boolean.valueOf(booleanValue)));
                                    } else if (booleanValue && !booleanValue2) {
                                        C3254e.m7893a(new RunnableC3225d(5, Beta.strToastYourAreTheLatestVersion));
                                    }
                                }
                            }
                        } else {
                            C3247c cVar2 = C3247c.f7488a;
                            if (z) {
                                i3 = 0;
                            }
                            cVar2.mo38045a(booleanValue, booleanValue2, i3, null, str);
                        }
                    } else {
                        return;
                    }
                } else if (i2 == 2) {
                    C3371x xVar = (C3371x) this.f7485c[0];
                    if (this.f7484b == 803) {
                        if (z) {
                            if (!(beVar == null || (aaVar2 = (C3301aa) C3311ah.m8285a(beVar.f8152c, C3301aa.class)) == null)) {
                                C3247c.f7488a.mo38043a(aaVar2.f7940a);
                            }
                            C3360p.f8238a.mo38501b();
                        }
                    } else {
                        return;
                    }
                }
                this.f7486d = true;
            }
        } catch (Exception e) {
            if (!C3321an.m8353b(e)) {
                e.printStackTrace();
            }
        }
    }
}

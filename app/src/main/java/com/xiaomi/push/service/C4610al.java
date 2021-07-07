package com.xiaomi.push.service;

import android.text.TextUtils;
import anet.channel.strategy.dispatch.DispatchConstants;
import com.p118pd.sdk.C7522o0Ooo0o;
import com.xiaomi.channel.commonutils.logger.AbstractC4163b;
import com.xiaomi.mipush.sdk.MiPushCommandMessage;
import com.xiaomi.push.AbstractC4456gl;
import com.xiaomi.push.C4337cx;
import com.xiaomi.push.C4342db;
import com.xiaomi.push.C4354dk;
import com.xiaomi.push.C4387em;
import com.xiaomi.push.C4428fn;
import com.xiaomi.push.C4437fv;
import com.xiaomi.push.C4452gi;
import com.xiaomi.push.C4453gj;
import com.xiaomi.push.C4455gk;
import com.xiaomi.push.C4473gz;
import com.xiaomi.push.C4486hi;
import com.xiaomi.push.EnumC4424fj;
import com.xiaomi.push.service.C4611am;
import java.util.Date;
import org.android.agoo.xiaomi.MiPushRegistar;

/* renamed from: com.xiaomi.push.service.al */
public class C4610al {

    /* renamed from: a */
    public XMPushService f13171a;

    public C4610al(XMPushService xMPushService) {
        this.f13171a = xMPushService;
    }

    /* renamed from: a */
    private void m13939a(C4452gi giVar) {
        String c = giVar.mo41935c();
        if (!TextUtils.isEmpty(c)) {
            String[] split = c.split(C7522o0Ooo0o.OooO0O0);
            C4337cx a = C4342db.mo41642a().mo41640a(C4437fv.mo41912a(), false);
            if (a != null && split.length > 0) {
                a.mo41623a(split);
                this.f13171a.mo42622a(20, (Exception) null);
                this.f13171a.mo42630a(true);
            }
        }
    }

    /* renamed from: b */
    private void m13940b(AbstractC4456gl glVar) {
        C4611am.C4613b a;
        String l = glVar.mo41969l();
        String k = glVar.mo41967k();
        if (!TextUtils.isEmpty(l) && !TextUtils.isEmpty(k) && (a = C4611am.mo42670a().mo42671a(k, l)) != null) {
            C4473gz.m12848a(this.f13171a, a.f13184a, (long) C4473gz.m12840a(glVar.m12784a()), true, true, System.currentTimeMillis());
        }
    }

    /* renamed from: c */
    private void m13941c(C4428fn fnVar) {
        C4611am.C4613b a;
        String g = fnVar.mo41878g();
        String num = Integer.toString(fnVar.mo41864a());
        if (!TextUtils.isEmpty(g) && !TextUtils.isEmpty(num) && (a = C4611am.mo42670a().mo42671a(num, g)) != null) {
            C4473gz.m12848a(this.f13171a, a.f13184a, (long) fnVar.mo41874c(), true, true, System.currentTimeMillis());
        }
    }

    /* renamed from: a */
    public void mo42667a(C4428fn fnVar) {
        if (5 != fnVar.mo41864a()) {
            m13941c(fnVar);
        }
        try {
            mo42669b(fnVar);
        } catch (Exception e) {
            AbstractC4163b.m11302a("handle Blob chid = " + fnVar.mo41864a() + " cmd = " + fnVar.m12598a() + " packetid = " + fnVar.mo41876e() + " failure ", e);
        }
    }

    /* renamed from: a */
    public void mo42668a(AbstractC4456gl glVar) {
        if (!"5".equals(glVar.mo41967k())) {
            m13940b(glVar);
        }
        String k = glVar.mo41967k();
        if (TextUtils.isEmpty(k)) {
            k = "1";
            glVar.mo41970l(k);
        }
        if (k.equals("0")) {
            AbstractC4163b.m11301a("Received wrong packet with chid = 0 : " + glVar.m12784a());
        }
        if (glVar instanceof C4453gj) {
            C4452gi a = glVar.mo41943a("kick");
            if (a != null) {
                String l = glVar.mo41969l();
                String a2 = a.mo41933a("type");
                String a3 = a.mo41933a(MiPushCommandMessage.KEY_REASON);
                AbstractC4163b.m11301a("kicked by server, chid=" + k + " res=" + C4611am.C4613b.m13963a(l) + " type=" + a2 + " reason=" + a3);
                if ("wait".equals(a2)) {
                    C4611am.C4613b a4 = C4611am.mo42670a().mo42671a(k, l);
                    if (a4 != null) {
                        this.f13171a.mo42627a(a4);
                        a4.mo42683a(C4611am.EnumC4617c.unbind, 3, 0, a3, a2);
                        return;
                    }
                    return;
                }
                this.f13171a.mo42628a(k, l, 3, a3, a2);
                C4611am.mo42670a().m13958a(k, l);
                return;
            }
        } else if (glVar instanceof C4455gk) {
            C4455gk gkVar = (C4455gk) glVar;
            if ("redir".equals(gkVar.mo41941b())) {
                C4452gi a5 = gkVar.mo41943a(DispatchConstants.HOSTS);
                if (a5 != null) {
                    m13939a(a5);
                    return;
                }
                return;
            }
        }
        this.f13171a.mo42633b().mo42720a(this.f13171a, k, glVar);
    }

    /* renamed from: b */
    public void mo42669b(C4428fn fnVar) {
        StringBuilder sb;
        String a;
        String str;
        int i;
        int i2;
        C4611am.EnumC4617c cVar;
        String a2 = fnVar.m12598a();
        if (fnVar.mo41864a() != 0) {
            String num = Integer.toString(fnVar.mo41864a());
            if ("SECMSG".equals(fnVar.m12598a())) {
                if (!fnVar.m12607a()) {
                    this.f13171a.mo42633b().mo42719a(this.f13171a, num, fnVar);
                    return;
                }
                sb = new StringBuilder();
                sb.append("Recv SECMSG errCode = ");
                sb.append(fnVar.mo41872b());
                sb.append(" errStr = ");
                a = fnVar.m12614c();
            } else if ("BIND".equals(a2)) {
                C4387em.C4391d a3 = C4387em.C4391d.m12300a(fnVar.m12608a());
                String g = fnVar.mo41878g();
                C4611am.C4613b a4 = C4611am.mo42670a().mo42671a(num, g);
                if (a4 != null) {
                    if (a3.m12308a()) {
                        AbstractC4163b.m11301a("SMACK: channel bind succeeded, chid=" + fnVar.mo41864a());
                        a4.mo42683a(C4611am.EnumC4617c.binded, 1, 0, (String) null, (String) null);
                        return;
                    }
                    String a5 = a3.m12306a();
                    if ("auth".equals(a5)) {
                        if ("invalid-sig".equals(a3.m12311b())) {
                            AbstractC4163b.m11301a("SMACK: bind error invalid-sig token = " + a4.f13190c + " sec = " + a4.f13195h);
                            C4486hi.m12895a(0, EnumC4424fj.BIND_INVALID_SIG.mo41822a(), 1, null, 0);
                        }
                        cVar = C4611am.EnumC4617c.unbind;
                        i2 = 1;
                        i = 5;
                    } else if ("cancel".equals(a5)) {
                        cVar = C4611am.EnumC4617c.unbind;
                        i2 = 1;
                        i = 7;
                    } else {
                        if ("wait".equals(a5)) {
                            this.f13171a.mo42627a(a4);
                            a4.mo42683a(C4611am.EnumC4617c.unbind, 1, 7, a3.m12311b(), a5);
                        }
                        str = "SMACK: channel bind failed, chid=" + num + " reason=" + a3.m12311b();
                        AbstractC4163b.m11301a(str);
                    }
                    a4.mo42683a(cVar, i2, i, a3.m12311b(), a5);
                    C4611am.mo42670a().m13958a(num, g);
                    str = "SMACK: channel bind failed, chid=" + num + " reason=" + a3.m12311b();
                    AbstractC4163b.m11301a(str);
                }
                return;
            } else if ("KICK".equals(a2)) {
                C4387em.C4394g a6 = C4387em.C4394g.m12368a(fnVar.m12608a());
                String g2 = fnVar.mo41878g();
                String a7 = a6.m12373a();
                String b = a6.m12378b();
                AbstractC4163b.m11301a("kicked by server, chid=" + num + " res= " + C4611am.C4613b.m13963a(g2) + " type=" + a7 + " reason=" + b);
                if ("wait".equals(a7)) {
                    C4611am.C4613b a8 = C4611am.mo42670a().mo42671a(num, g2);
                    if (a8 != null) {
                        this.f13171a.mo42627a(a8);
                        a8.mo42683a(C4611am.EnumC4617c.unbind, 3, 0, b, a7);
                        return;
                    }
                    return;
                }
                this.f13171a.mo42628a(num, g2, 3, b, a7);
                C4611am.mo42670a().m13958a(num, g2);
                return;
            } else {
                return;
            }
        } else if ("PING".equals(a2)) {
            byte[] a9 = fnVar.m12608a();
            if (a9 != null && a9.length > 0) {
                C4387em.C4397j a10 = C4387em.C4397j.m12404a(a9);
                if (a10.m12415b()) {
                    C4635bb.mo42697a().mo42698a(a10.m12408a());
                }
            }
            if (!MiPushRegistar.PACKAGE_XIAOMI.equals(this.f13171a.getPackageName())) {
                this.f13171a.m13794a();
            }
            if ("1".equals(fnVar.mo41876e())) {
                AbstractC4163b.m11301a("received a server ping");
            } else {
                C4486hi.m12901b();
            }
            this.f13171a.m13813b();
            return;
        } else if ("SYNC".equals(a2)) {
            if ("CONF".equals(fnVar.m12611b())) {
                C4635bb.mo42697a().mo42698a(C4387em.C4389b.m12259a(fnVar.m12608a()));
                return;
            } else if (TextUtils.equals("U", fnVar.m12611b())) {
                C4387em.C4398k a11 = C4387em.C4398k.m12416a(fnVar.m12608a());
                C4354dk.m12090a(this.f13171a).mo41666a(a11.m12425a(), a11.m12432b(), new Date(a11.m12418a()), new Date(a11.m12429b()), a11.mo41781c() * 1024, a11.mo41783e());
                C4428fn fnVar2 = new C4428fn();
                fnVar2.mo41866a(0);
                fnVar2.mo41869a(fnVar.m12598a(), "UCA");
                fnVar2.mo41868a(fnVar.mo41876e());
                XMPushService xMPushService = this.f13171a;
                xMPushService.mo42624a(new C4630ax(xMPushService, fnVar2));
                return;
            } else if (TextUtils.equals("P", fnVar.m12611b())) {
                C4387em.C4396i a12 = C4387em.C4396i.m12395a(fnVar.m12608a());
                C4428fn fnVar3 = new C4428fn();
                fnVar3.mo41866a(0);
                fnVar3.mo41869a(fnVar.m12598a(), "PCA");
                fnVar3.mo41868a(fnVar.mo41876e());
                C4387em.C4396i iVar = new C4387em.C4396i();
                if (a12.m12402a()) {
                    iVar.mo41772a(a12.m12397a());
                }
                fnVar3.mo41871a(iVar.m12147a(), (String) null);
                XMPushService xMPushService2 = this.f13171a;
                xMPushService2.mo42624a(new C4630ax(xMPushService2, fnVar3));
                sb = new StringBuilder();
                sb.append("ACK msgP: id = ");
                a = fnVar.mo41876e();
            } else {
                return;
            }
        } else if ("NOTIFY".equals(fnVar.m12598a())) {
            C4387em.C4395h a13 = C4387em.C4395h.m12383a(fnVar.m12608a());
            sb = new StringBuilder();
            sb.append("notify by server err = ");
            sb.append(a13.mo41771c());
            sb.append(" desc = ");
            a = a13.m12389a();
        } else {
            return;
        }
        sb.append(a);
        str = sb.toString();
        AbstractC4163b.m11301a(str);
    }
}

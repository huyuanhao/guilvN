package com.xiaomi.push;

import android.text.TextUtils;
import com.umeng.message.proguard.C3848l;
import com.xiaomi.channel.commonutils.logger.AbstractC4163b;
import com.xiaomi.push.AbstractC4435fu;
import com.xiaomi.push.C4387em;
import com.xiaomi.push.service.C4611am;
import com.xiaomi.push.service.C4628av;
import com.xiaomi.push.service.C4635bb;
import com.xiaomi.push.service.XMPushService;

/* renamed from: com.xiaomi.push.fs */
public class C4433fs extends AbstractC4445gb {

    /* renamed from: a */
    public C4429fo f11951a;

    /* renamed from: a */
    public C4430fp f11952a;

    /* renamed from: a */
    public Thread f11953a;

    /* renamed from: a */
    public byte[] f11954a;

    public C4433fs(XMPushService xMPushService, C4437fv fvVar) {
        super(xMPushService, fvVar);
    }

    @Override // com.xiaomi.push.AbstractC4445gb
    /* renamed from: a */
    private C4428fn mo41892a(boolean z) {
        C4432fr frVar = new C4432fr();
        if (z) {
            frVar.mo41868a("1");
        }
        byte[] a = C4486hi.m12900a();
        if (a != null) {
            C4387em.C4397j jVar = new C4387em.C4397j();
            jVar.mo41773a(C4242a.m11617a(a));
            frVar.mo41871a(jVar.m12147a(), (String) null);
        }
        return frVar;
    }

    /* renamed from: h */
    private void m12633h() {
        try {
            this.f11951a = new C4429fo(((AbstractC4445gb) this).f11998a.getInputStream(), this);
            this.f11952a = new C4430fp(((AbstractC4445gb) this).f11998a.getOutputStream(), this);
            C4434ft ftVar = new C4434ft(this, "Blob Reader (" + ((AbstractC4435fu) this).f11967b + C3848l.f10402t);
            this.f11953a = ftVar;
            ftVar.start();
        } catch (Exception e) {
            throw new C4449gf("Error to init reader and writer", e);
        }
    }

    @Override // com.xiaomi.push.AbstractC4445gb, com.xiaomi.push.AbstractC4445gb, com.xiaomi.push.AbstractC4445gb, com.xiaomi.push.AbstractC4435fu, com.xiaomi.push.AbstractC4435fu, com.xiaomi.push.AbstractC4435fu, com.xiaomi.push.AbstractC4435fu, com.xiaomi.push.AbstractC4435fu
    /* renamed from: a */
    public synchronized void mo41886a() {
        m12633h();
        this.f11952a.mo41883a();
    }

    @Override // com.xiaomi.push.AbstractC4445gb
    /* renamed from: a */
    public synchronized void mo41887a(int i, Exception exc) {
        if (this.f11951a != null) {
            this.f11951a.mo41881b();
            this.f11951a = null;
        }
        if (this.f11952a != null) {
            try {
                this.f11952a.mo41884b();
            } catch (Exception e) {
                AbstractC4163b.m11303a(e);
            }
            this.f11952a = null;
        }
        this.f11954a = null;
        super.mo41887a(i, exc);
    }

    /* renamed from: a */
    public void mo41888a(C4428fn fnVar) {
        if (fnVar != null) {
            if (fnVar.m12607a()) {
                AbstractC4163b.m11301a("[Slim] RCV blob chid=" + fnVar.mo41864a() + "; id=" + fnVar.mo41876e() + "; errCode=" + fnVar.mo41872b() + "; err=" + fnVar.m12614c());
            }
            if (fnVar.mo41864a() == 0) {
                if ("PING".equals(fnVar.m12598a())) {
                    AbstractC4163b.m11301a("[Slim] RCV ping id=" + fnVar.mo41876e());
                    mo41923g();
                } else if ("CLOSE".equals(fnVar.m12598a())) {
                    mo41921c(13, null);
                }
            }
            for (AbstractC4435fu.C4436a aVar : ((AbstractC4435fu) this).f11966a.values()) {
                aVar.mo41910a(fnVar);
            }
        }
    }

    @Override // com.xiaomi.push.AbstractC4435fu
    @Deprecated
    /* renamed from: a */
    public void mo41889a(AbstractC4456gl glVar) {
        mo41894b(C4428fn.m12594a(glVar, (String) null));
    }

    @Override // com.xiaomi.push.AbstractC4435fu
    /* renamed from: a */
    public synchronized void mo41890a(C4611am.C4613b bVar) {
        C4427fm.m12592a(bVar, mo41907c(), this);
    }

    @Override // com.xiaomi.push.AbstractC4435fu
    /* renamed from: a */
    public synchronized void mo41891a(String str, String str2) {
        C4427fm.m12593a(str, str2, this);
    }

    @Override // com.xiaomi.push.AbstractC4445gb
    /* renamed from: a */
    public void m12640a(boolean z) {
        if (this.f11952a != null) {
            C4428fn a = mo41892a(z);
            AbstractC4163b.m11301a("[Slim] SND ping id=" + a.mo41876e());
            mo41894b(a);
            mo41922f();
            return;
        }
        throw new C4449gf("The BlobWriter is null.");
    }

    @Override // com.xiaomi.push.AbstractC4445gb, com.xiaomi.push.AbstractC4435fu
    /* renamed from: a */
    public void mo41893a(C4428fn[] fnVarArr) {
        for (C4428fn fnVar : fnVarArr) {
            mo41894b(fnVar);
        }
    }

    @Override // com.xiaomi.push.AbstractC4445gb, com.xiaomi.push.AbstractC4445gb, com.xiaomi.push.AbstractC4445gb, com.xiaomi.push.AbstractC4435fu, com.xiaomi.push.AbstractC4435fu, com.xiaomi.push.AbstractC4435fu, com.xiaomi.push.AbstractC4435fu, com.xiaomi.push.AbstractC4435fu
    /* renamed from: a */
    public boolean m12642a() {
        return true;
    }

    @Override // com.xiaomi.push.AbstractC4445gb, com.xiaomi.push.AbstractC4445gb, com.xiaomi.push.AbstractC4445gb, com.xiaomi.push.AbstractC4435fu, com.xiaomi.push.AbstractC4435fu, com.xiaomi.push.AbstractC4435fu, com.xiaomi.push.AbstractC4435fu, com.xiaomi.push.AbstractC4435fu
    /* renamed from: a */
    public synchronized byte[] m12643a() {
        if (this.f11954a == null && !TextUtils.isEmpty(((AbstractC4435fu) this).f11963a)) {
            String a = C4635bb.m14028a();
            this.f11954a = C4628av.m14006a(((AbstractC4435fu) this).f11963a.getBytes(), (((AbstractC4435fu) this).f11963a.substring(((AbstractC4435fu) this).f11963a.length() / 2) + a.substring(a.length() / 2)).getBytes());
        }
        return this.f11954a;
    }

    @Override // com.xiaomi.push.AbstractC4435fu
    /* renamed from: b */
    public void mo41894b(C4428fn fnVar) {
        C4430fp fpVar = this.f11952a;
        if (fpVar != null) {
            try {
                int a = fpVar.mo41882a(fnVar);
                ((AbstractC4435fu) this).f11973d = System.currentTimeMillis();
                String f = fnVar.mo41877f();
                if (!TextUtils.isEmpty(f)) {
                    C4473gz.m12848a(((AbstractC4435fu) this).f11962a, f, (long) a, false, true, System.currentTimeMillis());
                }
                for (AbstractC4435fu.C4436a aVar : ((AbstractC4435fu) this).f11970b.values()) {
                    aVar.mo41910a(fnVar);
                }
            } catch (Exception e) {
                throw new C4449gf(e);
            }
        } else {
            throw new C4449gf("the writer is null.");
        }
    }

    /* renamed from: b */
    public void mo41895b(AbstractC4456gl glVar) {
        if (glVar != null) {
            for (AbstractC4435fu.C4436a aVar : ((AbstractC4435fu) this).f11966a.values()) {
                aVar.mo41911a(glVar);
            }
        }
    }
}

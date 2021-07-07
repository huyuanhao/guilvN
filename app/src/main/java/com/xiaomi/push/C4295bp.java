package com.xiaomi.push;

import com.xiaomi.channel.commonutils.logger.AbstractC4163b;
import com.xiaomi.mipush.sdk.Constants;
import java.text.SimpleDateFormat;
import java.util.Date;

/* renamed from: com.xiaomi.push.bp */
public class C4295bp implements AbstractC4450gg {

    /* renamed from: a */
    public static boolean f11437a;

    /* renamed from: a */
    public C4296a f11438a = null;

    /* renamed from: a */
    public AbstractC4435fu f11439a = null;

    /* renamed from: a */
    public AbstractC4439fx f11440a = null;

    /* renamed from: a */
    public final String f11441a = "[Slim] ";

    /* renamed from: a */
    public SimpleDateFormat f11442a = new SimpleDateFormat("hh:mm:ss aaa");

    /* renamed from: b */
    public C4296a f11443b = null;

    /* renamed from: com.xiaomi.push.bp$a */
    public class C4296a implements AbstractC4441fz, AbstractC4451gh {

        /* renamed from: a */
        public String f11445a;

        public C4296a(boolean z) {
            this.f11445a = z ? " RCV " : " Sent ";
        }

        @Override // com.xiaomi.push.AbstractC4441fz
        /* renamed from: a */
        public void mo41527a(C4428fn fnVar) {
            String str;
            StringBuilder sb;
            if (C4295bp.f11437a) {
                sb = new StringBuilder();
                sb.append("[Slim] ");
                sb.append(C4295bp.this.f11442a.format(new Date()));
                sb.append(this.f11445a);
                str = fnVar.toString();
            } else {
                sb = new StringBuilder();
                sb.append("[Slim] ");
                sb.append(C4295bp.this.f11442a.format(new Date()));
                sb.append(this.f11445a);
                sb.append(" Blob [");
                sb.append(fnVar.m12598a());
                sb.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
                sb.append(fnVar.mo41864a());
                sb.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
                sb.append(fnVar.mo41876e());
                str = "]";
            }
            sb.append(str);
            AbstractC4163b.m11305c(sb.toString());
        }

        @Override // com.xiaomi.push.AbstractC4451gh, com.xiaomi.push.AbstractC4441fz
        /* renamed from: a */
        public void mo41528a(AbstractC4456gl glVar) {
            String str;
            StringBuilder sb;
            if (C4295bp.f11437a) {
                sb = new StringBuilder();
                sb.append("[Slim] ");
                sb.append(C4295bp.this.f11442a.format(new Date()));
                sb.append(this.f11445a);
                sb.append(" PKT ");
                str = glVar.m12784a();
            } else {
                sb = new StringBuilder();
                sb.append("[Slim] ");
                sb.append(C4295bp.this.f11442a.format(new Date()));
                sb.append(this.f11445a);
                sb.append(" PKT [");
                sb.append(glVar.mo41967k());
                sb.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
                sb.append(glVar.mo41966j());
                str = "]";
            }
            sb.append(str);
            AbstractC4163b.m11305c(sb.toString());
        }

        @Override // com.xiaomi.push.AbstractC4451gh, com.xiaomi.push.AbstractC4441fz
        /* renamed from: a */
        public boolean m11837a(AbstractC4456gl glVar) {
            return true;
        }
    }

    static {
        boolean z = true;
        if (C4688t.m14217a() != 1) {
            z = false;
        }
        f11437a = z;
    }

    public C4295bp(AbstractC4435fu fuVar) {
        this.f11439a = fuVar;
        m11834a();
    }

    /* renamed from: a */
    private void m11834a() {
        this.f11438a = new C4296a(true);
        this.f11443b = new C4296a(false);
        AbstractC4435fu fuVar = this.f11439a;
        C4296a aVar = this.f11438a;
        fuVar.mo41899a(aVar, aVar);
        AbstractC4435fu fuVar2 = this.f11439a;
        C4296a aVar2 = this.f11443b;
        fuVar2.mo41905b(aVar2, aVar2);
        this.f11440a = new C4297bq(this);
    }
}

package com.xiaomi.push;

import android.os.SystemClock;
import com.tencent.bugly.beta.tinker.TinkerUncaughtExceptionHandler;
import com.xiaomi.channel.commonutils.logger.AbstractC4163b;
import com.xiaomi.mipush.sdk.Constants;
import com.xiaomi.push.service.XMPushService;
import java.io.IOException;
import java.net.Socket;

/* renamed from: com.xiaomi.push.gb */
public abstract class AbstractC4445gb extends AbstractC4435fu {

    /* renamed from: a */
    public Exception f11997a = null;

    /* renamed from: a */
    public Socket f11998a;

    /* renamed from: b */
    public XMPushService f11999b;

    /* renamed from: c */
    public int f12000c;

    /* renamed from: c */
    public String f12001c = null;

    /* renamed from: d */
    public String f12002d;

    /* renamed from: e */
    public volatile long f12003e = 0;

    /* renamed from: f */
    public volatile long f12004f = 0;

    /* renamed from: g */
    public volatile long f12005g = 0;

    public AbstractC4445gb(XMPushService xMPushService, C4437fv fvVar) {
        super(xMPushService, fvVar);
        this.f11999b = xMPushService;
    }

    /* renamed from: a */
    private void m12713a(C4437fv fvVar) {
        m12714a(fvVar.mo41916c(), fvVar.m12681a());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00d6, code lost:
        r24.f12005g = android.os.SystemClock.elapsedRealtime();
        com.xiaomi.channel.commonutils.logger.AbstractC4163b.m11301a("connected to " + r8 + " in " + ((com.xiaomi.push.AbstractC4435fu) r24).f11959a);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00fa, code lost:
        r18 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x011c, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x011d, code lost:
        r22 = r8;
        r9 = r12;
        r8 = r13;
        r20 = r14;
        r18 = r10;
        r14 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0128, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0129, code lost:
        r22 = r8;
        r9 = r12;
        r8 = r13;
        r20 = r14;
        r23 = r15;
        r18 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0275, code lost:
        if (android.text.TextUtils.equals(r5, com.xiaomi.push.C4274az.m11726a((android.content.Context) r24.f11999b)) == false) goto L_0x027c;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0128 A[ExcHandler: all (th java.lang.Throwable), Splitter:B:10:0x0077] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0141  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x019b  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x01b3  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x021d  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0285 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0286  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m12714a(java.lang.String r25, int r26) {
        /*
        // Method dump skipped, instructions count: 658
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.AbstractC4445gb.m12714a(java.lang.String, int):void");
    }

    @Override // com.xiaomi.push.AbstractC4435fu
    /* renamed from: a */
    public C4337cx mo41900a(String str) {
        C4337cx a = C4342db.mo41642a().mo41640a(str, false);
        if (!a.mo41628b()) {
            C4471gx.m12837a(new RunnableC4448ge(this, str));
        }
        return a;
    }

    @Override // com.xiaomi.push.AbstractC4435fu, com.xiaomi.push.AbstractC4435fu, com.xiaomi.push.AbstractC4435fu, com.xiaomi.push.AbstractC4435fu, com.xiaomi.push.AbstractC4435fu
    /* renamed from: a */
    public String mo41886a() {
        return this.f12002d;
    }

    @Override // com.xiaomi.push.AbstractC4435fu, com.xiaomi.push.AbstractC4435fu, com.xiaomi.push.AbstractC4435fu, com.xiaomi.push.AbstractC4435fu, com.xiaomi.push.AbstractC4435fu
    /* renamed from: a */
    public Socket m12717a() {
        return new Socket();
    }

    @Override // com.xiaomi.push.AbstractC4435fu, com.xiaomi.push.AbstractC4435fu, com.xiaomi.push.AbstractC4435fu, com.xiaomi.push.AbstractC4435fu, com.xiaomi.push.AbstractC4435fu
    /* renamed from: a */
    public synchronized void m12718a() {
    }

    /* renamed from: a */
    public synchronized void mo41887a(int i, Exception exc) {
        if (mo41902b() != 2) {
            mo41897a(2, i, exc);
            ((AbstractC4435fu) this).f11963a = "";
            try {
                this.f11998a.close();
            } catch (Throwable unused) {
            }
            this.f12003e = 0;
            this.f12004f = 0;
        }
    }

    /* renamed from: a */
    public void mo41919a(Exception exc) {
        if (SystemClock.elapsedRealtime() - this.f12005g < Constants.ASSEMBLE_PUSH_NETWORK_INTERVAL) {
            if (C4274az.m11735b(this.f11999b)) {
                int i = this.f12000c + 1;
                this.f12000c = i;
                if (i >= 2) {
                    String a = mo41886a();
                    AbstractC4163b.m11301a("max short conn time reached, sink down current host:" + a);
                    mo41920a(a, 0, exc);
                } else {
                    return;
                }
            } else {
                return;
            }
        }
        this.f12000c = 0;
    }

    /* renamed from: a */
    public void mo41920a(String str, long j, Exception exc) {
        C4337cx a = C4342db.mo41642a().mo41640a(C4437fv.mo41912a(), false);
        if (a != null) {
            a.mo41627b(str, j, 0, exc);
            C4342db.mo41642a().m12050c();
        }
    }

    /* renamed from: a */
    public abstract void mo41892a(boolean z);

    @Override // com.xiaomi.push.AbstractC4435fu
    /* renamed from: a */
    public void mo41893a(C4428fn[] fnVarArr) {
        throw new C4449gf("Don't support send Blob");
    }

    @Override // com.xiaomi.push.AbstractC4435fu
    /* renamed from: b */
    public void mo41903b(int i, Exception exc) {
        mo41887a(i, exc);
        if ((exc != null || i == 18) && this.f12005g != 0) {
            mo41919a(exc);
        }
    }

    @Override // com.xiaomi.push.AbstractC4435fu
    /* renamed from: b */
    public void mo41906b(boolean z) {
        long currentTimeMillis = System.currentTimeMillis();
        mo41892a(z);
        if (!z) {
            this.f11999b.mo42625a(new C4446gc(this, 13, currentTimeMillis), TinkerUncaughtExceptionHandler.QUICK_CRASH_ELAPSE);
        }
    }

    @Override // com.xiaomi.push.AbstractC4435fu, com.xiaomi.push.AbstractC4435fu
    /* renamed from: c */
    public String mo41907c() {
        return ((AbstractC4435fu) this).f11963a;
    }

    /* renamed from: c */
    public void mo41921c(int i, Exception exc) {
        this.f11999b.mo42624a(new C4447gd(this, 2, i, exc));
    }

    @Override // com.xiaomi.push.AbstractC4435fu
    /* renamed from: e */
    public synchronized void mo41909e() {
        try {
            if (!m12672c()) {
                if (!m12670b()) {
                    mo41897a(0, 0, (Exception) null);
                    m12713a(((AbstractC4435fu) this).f11960a);
                    return;
                }
            }
            AbstractC4163b.m11301a("WARNING: current xmpp has connected");
        } catch (IOException e) {
            throw new C4449gf(e);
        }
    }

    /* renamed from: f */
    public void mo41922f() {
        this.f12003e = SystemClock.elapsedRealtime();
    }

    /* renamed from: g */
    public void mo41923g() {
        this.f12004f = SystemClock.elapsedRealtime();
    }
}

package com.xiaomi.push;

import android.content.Context;
import android.net.TrafficStats;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import com.xiaomi.channel.commonutils.logger.AbstractC4163b;
import com.xiaomi.push.service.XMPushService;

/* renamed from: com.xiaomi.push.hf */
public class C4482hf implements AbstractC4439fx {

    /* renamed from: a */
    public int f12146a;

    /* renamed from: a */
    public long f12147a = 0;

    /* renamed from: a */
    public AbstractC4435fu f12148a;

    /* renamed from: a */
    public XMPushService f12149a;

    /* renamed from: a */
    public Exception f12150a;

    /* renamed from: a */
    public String f12151a;

    /* renamed from: b */
    public long f12152b = 0;

    /* renamed from: c */
    public long f12153c = 0;

    /* renamed from: d */
    public long f12154d = 0;

    /* renamed from: e */
    public long f12155e = 0;

    /* renamed from: f */
    public long f12156f = 0;

    public C4482hf(XMPushService xMPushService) {
        this.f12149a = xMPushService;
        this.f12151a = "";
        m12871b();
        int myUid = Process.myUid();
        this.f12156f = TrafficStats.getUidRxBytes(myUid);
        this.f12155e = TrafficStats.getUidTxBytes(myUid);
    }

    /* renamed from: b */
    private void m12871b() {
        this.f12152b = 0;
        this.f12154d = 0;
        this.f12147a = 0;
        this.f12153c = 0;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (C4274az.m11735b(this.f12149a)) {
            this.f12147a = elapsedRealtime;
        }
        if (this.f12149a.m13817c()) {
            this.f12153c = elapsedRealtime;
        }
    }

    /* renamed from: c */
    private synchronized void m12872c() {
        AbstractC4163b.m11305c("stat connpt = " + this.f12151a + " netDuration = " + this.f12152b + " ChannelDuration = " + this.f12154d + " channelConnectedTime = " + this.f12153c);
        C4425fk fkVar = new C4425fk();
        fkVar.f11909a = 0;
        fkVar.mo41825a(EnumC4424fj.CHANNEL_ONLINE_RATE.mo41822a());
        fkVar.mo41826a(this.f12151a);
        fkVar.mo41840d((int) (System.currentTimeMillis() / 1000));
        fkVar.mo41830b((int) (this.f12152b / 1000));
        fkVar.mo41835c((int) (this.f12154d / 1000));
        C4483hg.m12882a().mo41994a(fkVar);
        m12871b();
    }

    /* renamed from: a */
    public Exception mo41991a() {
        return this.f12150a;
    }

    /* renamed from: a */
    public synchronized void m12874a() {
        if (this.f12149a != null) {
            String a = C4274az.m11726a((Context) this.f12149a);
            boolean b = C4274az.m11735b(this.f12149a);
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (this.f12147a > 0) {
                this.f12152b += elapsedRealtime - this.f12147a;
                this.f12147a = 0;
            }
            if (this.f12153c != 0) {
                this.f12154d += elapsedRealtime - this.f12153c;
                this.f12153c = 0;
            }
            if (b) {
                if ((!TextUtils.equals(this.f12151a, a) && this.f12152b > 30000) || this.f12152b > 5400000) {
                    m12872c();
                }
                this.f12151a = a;
                if (this.f12147a == 0) {
                    this.f12147a = elapsedRealtime;
                }
                if (this.f12149a.m13817c()) {
                    this.f12153c = elapsedRealtime;
                }
            }
        }
    }

    @Override // com.xiaomi.push.AbstractC4439fx
    /* renamed from: a */
    public void mo41529a(AbstractC4435fu fuVar) {
        m12874a();
        this.f12153c = SystemClock.elapsedRealtime();
        C4486hi.m12896a(0, EnumC4424fj.CONN_SUCCESS.mo41822a(), fuVar.m12651a(), fuVar.mo41886a());
    }

    @Override // com.xiaomi.push.AbstractC4439fx
    /* renamed from: a */
    public void mo41530a(AbstractC4435fu fuVar, int i, Exception exc) {
        if (this.f12146a == 0 && this.f12150a == null) {
            this.f12146a = i;
            this.f12150a = exc;
            C4486hi.m12902b(fuVar.m12651a(), exc);
        }
        if (i == 22 && this.f12153c != 0) {
            long a = fuVar.m12649a() - this.f12153c;
            if (a < 0) {
                a = 0;
            }
            this.f12154d += a + ((long) (C4444ga.m12712b() / 2));
            this.f12153c = 0;
        }
        m12874a();
        int myUid = Process.myUid();
        long uidRxBytes = TrafficStats.getUidRxBytes(myUid);
        long uidTxBytes = TrafficStats.getUidTxBytes(myUid);
        AbstractC4163b.m11305c("Stats rx=" + (uidRxBytes - this.f12156f) + ", tx=" + (uidTxBytes - this.f12155e));
        this.f12156f = uidRxBytes;
        this.f12155e = uidTxBytes;
    }

    @Override // com.xiaomi.push.AbstractC4439fx
    /* renamed from: a */
    public void mo41531a(AbstractC4435fu fuVar, Exception exc) {
        C4486hi.m12895a(0, EnumC4424fj.CHANNEL_CON_FAIL.mo41822a(), 1, fuVar.m12651a(), C4274az.m11735b(this.f12149a) ? 1 : 0);
        m12874a();
    }

    @Override // com.xiaomi.push.AbstractC4439fx
    /* renamed from: b */
    public void mo41532b(AbstractC4435fu fuVar) {
        this.f12146a = 0;
        this.f12150a = null;
        this.f12148a = fuVar;
        this.f12151a = C4274az.m11726a((Context) this.f12149a);
        C4486hi.m12894a(0, EnumC4424fj.CONN_SUCCESS.mo41822a());
    }
}

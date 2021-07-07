package anet.channel.p008d;

import anet.channel.RequestCb;
import anet.channel.appmonitor.AppMonitor;
import anet.channel.entity.ConnType;
import anet.channel.request.Request;
import anet.channel.session.C0163b;
import anet.channel.statist.HorseRaceStat;
import anet.channel.strategy.C0198l;
import anet.channel.strategy.ConnProtocol;
import anet.channel.strategy.IConnStrategy;
import anet.channel.strategy.StrategyCenter;
import anet.channel.util.ALog;
import anet.channel.util.AppLifecycle;
import anet.channel.util.C0230j;
import anet.channel.util.ErrorConstant;
import anet.channel.util.HttpConstant;
import anet.channel.util.HttpUrl;
import java.io.IOException;
import java.net.Socket;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: anet.channel.d.a */
public class C0122a {

    /* renamed from: a */
    public static final TreeMap<String, C0198l.C0201c> f129a = new TreeMap<>();

    /* renamed from: b */
    public static final AtomicInteger f130b = new AtomicInteger(1);

    /* renamed from: c */
    public static final ReentrantLock f131c;

    /* renamed from: d */
    public static final Condition f132d;

    /* renamed from: e */
    public static final Condition f133e = f131c.newCondition();

    /* renamed from: f */
    public static volatile Thread f134f = null;

    /* renamed from: g */
    public static final Runnable f135g = new RunnableC0123b();

    static {
        ReentrantLock reentrantLock = new ReentrantLock();
        f131c = reentrantLock;
        f132d = reentrantLock.newCondition();
    }

    /* renamed from: b */
    public static void m66b(C0198l.C0201c cVar) {
        C0198l.C0203e[] eVarArr = cVar.f434b;
        if (eVarArr != null && eVarArr.length != 0) {
            String str = cVar.f433a;
            int i = 0;
            while (true) {
                C0198l.C0203e[] eVarArr2 = cVar.f434b;
                if (i < eVarArr2.length) {
                    C0198l.C0203e eVar = eVarArr2[i];
                    String str2 = eVar.f444b.f415b;
                    if (str2.equalsIgnoreCase("http") || str2.equalsIgnoreCase("https")) {
                        m64a(str, eVar);
                    } else if (str2.equalsIgnoreCase(ConnType.HTTP2) || str2.equalsIgnoreCase(ConnType.SPDY) || str2.equalsIgnoreCase(ConnType.QUIC)) {
                        m67b(str, eVar);
                    } else if (str2.equalsIgnoreCase("tcp")) {
                        m69c(str, eVar);
                    }
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: c */
    public static void m69c(String str, C0198l.C0203e eVar) {
        String str2 = "HR" + f130b.getAndIncrement();
        ALog.m290i("awcn.NetworkDetector", "startTcpTask", str2, "ip", eVar.f443a, "port", Integer.valueOf(eVar.f444b.f414a));
        HorseRaceStat horseRaceStat = new HorseRaceStat(str, eVar);
        long currentTimeMillis = System.currentTimeMillis();
        try {
            Socket socket = new Socket(eVar.f443a, eVar.f444b.f414a);
            socket.setSoTimeout(eVar.f444b.f416c == 0 ? 10000 : eVar.f444b.f416c);
            ALog.m290i("awcn.NetworkDetector", "socket connect success", str2, new Object[0]);
            horseRaceStat.connRet = 1;
            horseRaceStat.connTime = System.currentTimeMillis() - currentTimeMillis;
            socket.close();
        } catch (IOException unused) {
            horseRaceStat.connTime = System.currentTimeMillis() - currentTimeMillis;
            horseRaceStat.connErrorCode = ErrorConstant.ERROR_IO_EXCEPTION;
        }
        AppMonitor.getInstance().commitStat(horseRaceStat);
    }

    /* renamed from: a */
    public static void m62a() {
        ALog.m290i("awcn.NetworkDetector", "registerListener", null, new Object[0]);
        StrategyCenter.getInstance().registerListener(new C0124c());
        AppLifecycle.registerLifecycleListener(new C0125d());
    }

    /* renamed from: a */
    public static void m64a(String str, C0198l.C0203e eVar) {
        HttpUrl parse = HttpUrl.parse(eVar.f444b.f415b + HttpConstant.SCHEME_SPLIT + str + eVar.f445c);
        if (parse != null) {
            int i = 0;
            ALog.m290i("awcn.NetworkDetector", "startShortLinkTask", null, "url", parse);
            Request.Builder sslSocketFactory = new Request.Builder().setUrl(parse).addHeader("Connection", "close").setConnectTimeout(eVar.f444b.f416c).setReadTimeout(eVar.f444b.f417d).setRedirectEnable(false).setSslSocketFactory(new C0230j(str));
            Request build = sslSocketFactory.setSeq("HR" + f130b.getAndIncrement()).build();
            build.setDnsOptimize(eVar.f443a, eVar.f444b.f414a);
            long currentTimeMillis = System.currentTimeMillis();
            C0163b.C0164a a = C0163b.m173a(build, (RequestCb) null);
            HorseRaceStat horseRaceStat = new HorseRaceStat(str, eVar);
            horseRaceStat.connTime = System.currentTimeMillis() - currentTimeMillis;
            int i2 = a.f281a;
            if (i2 <= 0) {
                horseRaceStat.connErrorCode = i2;
            } else {
                horseRaceStat.connRet = 1;
                if (a.f281a == 200) {
                    i = 1;
                }
                horseRaceStat.reqRet = i;
                horseRaceStat.reqErrorCode = a.f281a;
                horseRaceStat.reqTime = horseRaceStat.connTime;
            }
            AppMonitor.getInstance().commitStat(horseRaceStat);
        }
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x00cc */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m67b(java.lang.String r13, anet.channel.strategy.C0198l.C0203e r14) {
        /*
        // Method dump skipped, instructions count: 211
        */
        throw new UnsupportedOperationException("Method not decompiled: anet.channel.p008d.C0122a.m67b(java.lang.String, anet.channel.strategy.l$e):void");
    }

    /* renamed from: a */
    public static IConnStrategy m60a(ConnProtocol connProtocol, C0198l.C0203e eVar) {
        return new C0128g(eVar, connProtocol);
    }
}

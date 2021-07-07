package anet.channel.strategy.dispatch;

import android.util.Base64InputStream;
import anet.channel.GlobalAppRuntimeInfo;
import anet.channel.appmonitor.AppMonitor;
import anet.channel.flow.FlowStat;
import anet.channel.flow.NetworkAnalysis;
import anet.channel.statist.AmdcStatistic;
import anet.channel.status.NetworkStatusHelper;
import anet.channel.strategy.ConnEvent;
import anet.channel.strategy.IConnStrategy;
import anet.channel.strategy.StrategyCenter;
import anet.channel.strategy.utils.C0209c;
import anet.channel.util.ALog;
import anet.channel.util.C0223c;
import anet.channel.util.HttpConstant;
import com.taobao.accs.common.Constants;
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Random;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.zip.GZIPInputStream;
import javax.net.ssl.HostnameVerifier;

/* renamed from: anet.channel.strategy.dispatch.c */
public class C0188c {

    /* renamed from: a */
    public static AtomicInteger f395a = new AtomicInteger(0);

    /* renamed from: b */
    public static HostnameVerifier f396b = new C0189d();

    /* renamed from: c */
    public static Random f397c = new Random();

    /* renamed from: a */
    public static List<IConnStrategy> m252a(String str) {
        List<IConnStrategy> list = Collections.EMPTY_LIST;
        if (!NetworkStatusHelper.isProxy()) {
            list = StrategyCenter.getInstance().getConnStrategyListByHost(DispatchConstants.getAmdcServerDomain());
            ListIterator<IConnStrategy> listIterator = list.listIterator();
            while (listIterator.hasNext()) {
                if (!listIterator.next().getProtocol().protocol.equalsIgnoreCase(str)) {
                    listIterator.remove();
                }
            }
        }
        return list;
    }

    /* renamed from: a */
    public static void m255a(Map map) {
        IConnStrategy iConnStrategy;
        String str;
        String str2;
        if (map != null) {
            String schemeByHost = StrategyCenter.getInstance().getSchemeByHost(DispatchConstants.getAmdcServerDomain(), "http");
            List<IConnStrategy> a = m252a(schemeByHost);
            for (int i = 0; i < 3; i++) {
                HashMap hashMap = new HashMap(map);
                if (i != 2) {
                    iConnStrategy = !a.isEmpty() ? a.remove(0) : null;
                    if (iConnStrategy != null) {
                        str = m251a(schemeByHost, iConnStrategy.getIp(), iConnStrategy.getPort(), hashMap, i);
                    } else {
                        str = m251a(schemeByHost, (String) null, 0, hashMap, i);
                    }
                } else {
                    String[] amdcServerFixIp = DispatchConstants.getAmdcServerFixIp();
                    if (amdcServerFixIp == null || amdcServerFixIp.length <= 0) {
                        str2 = m251a(schemeByHost, (String) null, 0, hashMap, i);
                    } else {
                        str2 = m251a(schemeByHost, amdcServerFixIp[f397c.nextInt(amdcServerFixIp.length)], 0, hashMap, i);
                    }
                    iConnStrategy = null;
                    str = str2;
                }
                int a2 = m249a(str, hashMap, i);
                if (iConnStrategy != null) {
                    ConnEvent connEvent = new ConnEvent();
                    connEvent.isSuccess = a2 == 0;
                    StrategyCenter.getInstance().notifyConnEvent(DispatchConstants.getAmdcServerDomain(), iConnStrategy, connEvent);
                }
                if (a2 == 0 || a2 == 2) {
                    return;
                }
            }
        }
    }

    /* renamed from: a */
    public static String m251a(String str, String str2, int i, Map<String, String> map, int i2) {
        StringBuilder sb = new StringBuilder(64);
        if (i2 == 2 && "https".equalsIgnoreCase(str) && f397c.nextBoolean()) {
            str = "http";
        }
        sb.append(str);
        sb.append(HttpConstant.SCHEME_SPLIT);
        if (str2 != null) {
            if (C0223c.m314a() && C0209c.m281a(str2)) {
                try {
                    str2 = C0223c.m312a(str2);
                } catch (Exception unused) {
                }
            }
            if (C0209c.m282b(str2)) {
                sb.append('[');
                sb.append(str2);
                sb.append(']');
            } else {
                sb.append(str2);
            }
            if (i == 0) {
                i = "https".equalsIgnoreCase(str) ? Constants.PORT : 80;
            }
            sb.append(com.xiaomi.mipush.sdk.Constants.COLON_SEPARATOR);
            sb.append(i);
        } else {
            sb.append(DispatchConstants.getAmdcServerDomain());
        }
        sb.append(DispatchConstants.serverPath);
        TreeMap treeMap = new TreeMap();
        treeMap.put("appkey", map.remove("appkey"));
        treeMap.put(DispatchConstants.VERSION, map.remove(DispatchConstants.VERSION));
        treeMap.put("deviceId", map.remove("deviceId"));
        treeMap.put("platform", map.remove("platform"));
        sb.append('?');
        sb.append(C0209c.m280a(treeMap, "utf-8"));
        return sb.toString();
    }

    /* JADX WARNING: Removed duplicated region for block: B:118:0x027b A[Catch:{ all -> 0x029b }] */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x028e A[SYNTHETIC, Splitter:B:121:0x028e] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int m249a(java.lang.String r18, java.util.Map r19, int r20) {
        /*
        // Method dump skipped, instructions count: 685
        */
        throw new UnsupportedOperationException("Method not decompiled: anet.channel.strategy.dispatch.C0188c.m249a(java.lang.String, java.util.Map, int):int");
    }

    /* renamed from: a */
    public static String m250a(InputStream inputStream, boolean z) {
        Throwable th;
        IOException e;
        FilterInputStream bufferedInputStream = new BufferedInputStream(inputStream);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(1024);
        if (z) {
            try {
                bufferedInputStream = new GZIPInputStream(bufferedInputStream);
            } catch (IOException e2) {
                e = e2;
                try {
                    ALog.m288e("awcn.DispatchCore", "", null, e, new Object[0]);
                    try {
                        bufferedInputStream.close();
                    } catch (IOException unused) {
                    }
                    return null;
                } catch (Throwable th2) {
                    th = th2;
                    try {
                        bufferedInputStream.close();
                    } catch (IOException unused2) {
                    }
                    throw th;
                }
            }
        }
        FilterInputStream base64InputStream = new Base64InputStream(bufferedInputStream, 0);
        try {
            byte[] bArr = new byte[1024];
            while (true) {
                int read = base64InputStream.read(bArr);
                if (read == -1) {
                    break;
                }
                byteArrayOutputStream.write(bArr, 0, read);
            }
            String str = new String(byteArrayOutputStream.toByteArray(), "utf-8");
            try {
                base64InputStream.close();
            } catch (IOException unused3) {
            }
            return str;
        } catch (IOException e3) {
            e = e3;
            bufferedInputStream = base64InputStream;
            ALog.m288e("awcn.DispatchCore", "", null, e, new Object[0]);
            bufferedInputStream.close();
            return null;
        } catch (Throwable th3) {
            th = th3;
            bufferedInputStream = base64InputStream;
            bufferedInputStream.close();
            throw th;
        }
    }

    /* renamed from: a */
    public static void m254a(String str, String str2, URL url, int i, int i2) {
        if ((i2 != 1 || i == 2) && GlobalAppRuntimeInfo.isTargetProcess()) {
            try {
                AmdcStatistic amdcStatistic = new AmdcStatistic();
                amdcStatistic.errorCode = str;
                amdcStatistic.errorMsg = str2;
                if (url != null) {
                    amdcStatistic.host = url.getHost();
                    amdcStatistic.url = url.toString();
                }
                amdcStatistic.retryTimes = i;
                AppMonitor.getInstance().commitStat(amdcStatistic);
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: a */
    public static void m253a(String str, long j, long j2) {
        try {
            FlowStat flowStat = new FlowStat();
            flowStat.refer = "amdc";
            flowStat.protocoltype = "http";
            flowStat.req_identifier = str;
            flowStat.upstream = j;
            flowStat.downstream = j2;
            NetworkAnalysis.getInstance().commitFlow(flowStat);
        } catch (Exception e) {
            ALog.m288e("awcn.DispatchCore", "commit flow info failed!", null, e, new Object[0]);
        }
    }
}

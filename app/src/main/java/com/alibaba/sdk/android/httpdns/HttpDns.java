package com.alibaba.sdk.android.httpdns;

import android.content.Context;
import android.text.TextUtils;
import com.alibaba.sdk.android.httpdns.net64.C0308a;
import com.alibaba.sdk.android.httpdns.p013a.C0255a;
import com.alibaba.sdk.android.httpdns.p014b.C0260b;
import com.alibaba.sdk.android.httpdns.p016d.C0276b;
import com.alibaba.sdk.android.httpdns.p016d.C0291c;
import com.alibaba.sdk.android.httpdns.p017e.C0293a;
import com.alibaba.sdk.android.httpdns.probe.IPProbeItem;
import com.alibaba.sdk.android.utils.AMSConfigUtils;
import com.alibaba.sdk.android.utils.AMSDevReporter;
import com.alibaba.sdk.android.utils.crashdefend.SDKMessageCallback;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class HttpDns implements HttpDnsService {
    public static DegradationFilter degradationFilter = null;
    public static C0271d hostManager = C0271d.mo3973a();
    public static boolean inited = false;
    public static HttpDns instance = null;
    public static String sAccountId = null;
    public static Context sContext = null;
    public static String sSecretKey = null;
    public boolean isExpiredIPEnabled = false;

    public HttpDns(Context context, String str) {
        C0296f.m530c(str);
        C0255a.m419a().mo3954a(context, str);
        C0255a.m419a().mo3955a(C0276b.m497a(context));
    }

    public static String getAccountId() {
        if (!TextUtils.isEmpty(sAccountId)) {
            return sAccountId;
        }
        String accountId = AMSConfigUtils.getAccountId(sContext);
        sAccountId = accountId;
        return accountId;
    }

    private String getIpByHost(String str) {
        if (!C0258b.m431a()) {
            C0299i.m536f("HttpDns service turned off");
            return null;
        }
        String[] ipsByHost = getIpsByHost(str);
        if (ipsByHost != null && ipsByHost.length > 0) {
            return ipsByHost[0];
        }
        return null;
    }

    private String[] getIpsByHost(String str) {
        if (!C0258b.m431a()) {
            C0299i.m536f("HttpDns service turned off");
        } else if (!C0301k.m539b(str)) {
            return C0296f.f647d;
        } else {
            if (C0301k.m540c(str)) {
                return new String[]{str};
            }
            DegradationFilter degradationFilter2 = degradationFilter;
            if (degradationFilter2 != null && degradationFilter2.shouldDegradeHttpDNS(str)) {
                return C0296f.f647d;
            }
            if (C0325t.m597e()) {
                return getIpsByHostAsync(str);
            }
            C0292e a = hostManager.m487a(str);
            if (a != null && a.m522b() && this.isExpiredIPEnabled) {
                if (!hostManager.m492a(str)) {
                    C0299i.m534d("refresh host async: " + str);
                    C0266c.m467a().submit(new CallableC0304m(str, EnumC0312o.QUERY_HOST));
                }
                return a.m520a();
            } else if (a != null && !a.m522b()) {
                return a.m520a();
            } else {
                C0299i.m534d("refresh host sync: " + str);
                try {
                    return (String[]) C0266c.m467a().submit(new CallableC0304m(str, EnumC0312o.QUERY_HOST)).get();
                } catch (Exception e) {
                    C0299i.m532a(e);
                }
            }
        }
        return C0296f.f647d;
    }

    public static String getSecretKey() {
        if (!TextUtils.isEmpty(sSecretKey)) {
            return sSecretKey;
        }
        String httpdnsSecretKey = AMSConfigUtils.getHttpdnsSecretKey(sContext);
        sSecretKey = httpdnsSecretKey;
        return httpdnsSecretKey;
    }

    public static synchronized HttpDnsService getService(Context context) {
        HttpDns httpDns;
        synchronized (HttpDns.class) {
            if (instance == null && context != null) {
                Context applicationContext = context.getApplicationContext();
                sContext = applicationContext;
                C0258b.m429a(applicationContext);
                C0276b.m497a(sContext).mo3988a(new SDKMessageCallback() {
                    /* class com.alibaba.sdk.android.httpdns.HttpDns.C02533 */

                    @Override // com.alibaba.sdk.android.utils.crashdefend.SDKMessageCallback
                    public void crashDefendMessage(int i, int i2) {
                        boolean unused = HttpDns.inited = true;
                        if (i > i2) {
                            C0258b.m432b(true);
                            return;
                        }
                        C0299i.m536f("crash limit exceeds, httpdns disabled");
                        C0258b.m432b(false);
                    }
                });
                if (!inited) {
                    C0299i.m536f("sdk crash defend not returned");
                }
                if (C0258b.m431a()) {
                    initHttpDns(sContext, getAccountId(), getSecretKey());
                } else {
                    instance = new HttpDns(sContext, getAccountId());
                }
            }
            httpDns = instance;
        }
        return httpDns;
    }

    public static synchronized HttpDnsService getService(Context context, String str) {
        HttpDns httpDns;
        synchronized (HttpDns.class) {
            if (instance == null && context != null) {
                sContext = context.getApplicationContext();
                setAccountId(str);
                C0258b.m429a(sContext);
                C0276b.m497a(sContext).mo3988a(new SDKMessageCallback() {
                    /* class com.alibaba.sdk.android.httpdns.HttpDns.C02511 */

                    @Override // com.alibaba.sdk.android.utils.crashdefend.SDKMessageCallback
                    public void crashDefendMessage(int i, int i2) {
                        boolean unused = HttpDns.inited = true;
                        if (i > i2) {
                            C0258b.m432b(true);
                            return;
                        }
                        C0299i.m536f("crash limit exceeds, httpdns disabled");
                        C0258b.m432b(false);
                    }
                });
                if (!inited) {
                    C0299i.m536f("sdk crash defend not returned");
                }
                if (C0258b.m431a()) {
                    initHttpDns(sContext, getAccountId(), getSecretKey());
                } else {
                    instance = new HttpDns(sContext, getAccountId());
                }
            }
            httpDns = instance;
        }
        return httpDns;
    }

    public static synchronized HttpDnsService getService(Context context, String str, String str2) {
        HttpDns httpDns;
        synchronized (HttpDns.class) {
            if (instance == null && context != null) {
                sContext = context.getApplicationContext();
                setAccountId(str);
                setSecretKey(str2);
                C0258b.m429a(sContext);
                C0276b.m497a(sContext).mo3988a(new SDKMessageCallback() {
                    /* class com.alibaba.sdk.android.httpdns.HttpDns.C02522 */

                    @Override // com.alibaba.sdk.android.utils.crashdefend.SDKMessageCallback
                    public void crashDefendMessage(int i, int i2) {
                        boolean unused = HttpDns.inited = true;
                        if (i > i2) {
                            C0258b.m432b(true);
                            return;
                        }
                        C0299i.m536f("crash limit exceeds, httpdns disabled");
                        C0258b.m432b(false);
                    }
                });
                if (!inited) {
                    C0299i.m536f("sdk crash defend not returned");
                }
                if (C0258b.m431a()) {
                    initHttpDns(sContext, getAccountId(), getSecretKey());
                } else {
                    instance = new HttpDns(sContext, getAccountId());
                }
            }
            httpDns = instance;
        }
        return httpDns;
    }

    public static void initHttpDns(Context context, String str, String str2) {
        if (instance == null) {
            HashMap hashMap = new HashMap();
            hashMap.put(AMSDevReporter.AMSSdkExtInfoKeyEnum.AMS_EXTINFO_KEY_VERSION.toString(), "1.2.5");
            AMSDevReporter.asyncReport(context, AMSDevReporter.AMSSdkTypeEnum.AMS_HTTPDNS, hashMap);
            C0302l.setContext(context);
            CallableC0304m.setContext(context);
            C0260b.m437a(context);
            C0260b.m442b(context);
            C0325t.m589a(context);
            C0313p.m554a().mo4036a(context);
            if (!TextUtils.isEmpty(str2)) {
                C0254a.setSecretKey(str2);
            }
            reportActive(context, str);
            instance = new HttpDns(context, str);
        }
    }

    public static void reportActive(Context context, String str) {
        if (context == null || TextUtils.isEmpty(str)) {
            C0299i.m536f("report active failed due to missing context or accountid");
            return;
        }
        C0276b.m497a(context).setAccountId(str);
        C0276b.m497a(context).mo3996i();
    }

    public static void reportHttpDnsSuccess(String str, int i) {
        C0276b a = C0276b.m496a();
        if (a != null) {
            a.mo3982a(str, i, C0291c.m517b(), C0260b.m441a() ? 1 : 0);
        }
    }

    public static void reportUserGetIP(String str, int i) {
        C0276b a = C0276b.m496a();
        if (a != null) {
            a.mo3989b(str, i, C0291c.m517b(), C0260b.m441a() ? 1 : 0);
        }
    }

    public static void setAccountId(String str) {
        sAccountId = str;
    }

    public static void setSecretKey(String str) {
        sSecretKey = str;
    }

    public static synchronized void switchDnsService(boolean z) {
        synchronized (HttpDns.class) {
            C0258b.m430a(z);
            if (!C0258b.m431a()) {
                C0299i.m536f("httpdns service disabled");
            }
        }
    }

    @Override // com.alibaba.sdk.android.httpdns.net64.Net64Service
    public void enableIPv6(boolean z) {
        C0308a.mo4034a().enableIPv6(z);
        try {
            C0276b a = C0276b.m496a();
            if (a != null) {
                a.mo3994e(z ? 1 : 0);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // com.alibaba.sdk.android.httpdns.net64.Net64Service
    public String getIPv6ByHostAsync(String str) {
        try {
            if (!C0258b.m431a()) {
                C0299i.m536f("HttpDns service turned off");
                return null;
            }
            if (C0308a.mo4034a().m551a()) {
                getIpsByHostAsync(str);
                C0292e a = hostManager.m487a(str);
                if (a != null) {
                    String iPv6ByHostAsync = C0308a.mo4034a().getIPv6ByHostAsync(str);
                    if (this.isExpiredIPEnabled) {
                        C0299i.m534d("ipv6 is expired enable, hostName: " + str + " ipv6: " + iPv6ByHostAsync);
                        return iPv6ByHostAsync;
                    } else if (!a.m522b()) {
                        C0299i.m534d("ipv6 is not expired, hostName: " + str + " ipv6: " + iPv6ByHostAsync);
                        return iPv6ByHostAsync;
                    } else if (a.mo4015c()) {
                        C0299i.m534d("ipv6 is from cache, hostName: " + str + " ipv6: " + iPv6ByHostAsync);
                        return iPv6ByHostAsync;
                    } else {
                        C0299i.m534d("ipv6 is expired.");
                        return null;
                    }
                }
            }
            return null;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // com.alibaba.sdk.android.httpdns.HttpDnsService
    public String getIpByHostAsync(String str) {
        try {
            if (!C0258b.m431a()) {
                C0299i.m536f("HttpDns service turned off");
                return null;
            }
            String[] ipsByHostAsync = getIpsByHostAsync(str);
            if (ipsByHostAsync != null && ipsByHostAsync.length > 0) {
                return ipsByHostAsync[0];
            }
            return null;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x003d, code lost:
        if (r3 != false) goto L_0x0041;
     */
    @Override // com.alibaba.sdk.android.httpdns.HttpDnsService
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String[] getIpsByHostAsync(java.lang.String r7) {
        /*
        // Method dump skipped, instructions count: 252
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.sdk.android.httpdns.HttpDns.getIpsByHostAsync(java.lang.String):java.lang.String[]");
    }

    @Override // com.alibaba.sdk.android.httpdns.HttpDnsService
    public String getSessionId() {
        return C0293a.m524a().getSessionId();
    }

    @Override // com.alibaba.sdk.android.httpdns.HttpDnsService
    public void setAuthCurrentTime(long j) {
        if (!C0258b.m431a()) {
            C0299i.m536f("HttpDns service turned off");
        } else {
            C0254a.setAuthCurrentTime(j);
        }
    }

    @Override // com.alibaba.sdk.android.httpdns.HttpDnsService
    public void setCachedIPEnabled(boolean z) {
        try {
            if (!C0258b.m431a()) {
                C0299i.m536f("HttpDns service turned off");
                return;
            }
            C0299i.m536f("Httpdns DB cache enable.");
            C0260b.m440a(z);
            C0271d.mo3973a().m489a();
            C0276b a = C0276b.m496a();
            if (a != null) {
                a.mo3992c(z ? 1 : 0);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // com.alibaba.sdk.android.httpdns.HttpDnsService
    public void setDegradationFilter(DegradationFilter degradationFilter2) {
        if (!C0258b.m431a()) {
            C0299i.m536f("HttpDns service turned off");
        } else {
            degradationFilter = degradationFilter2;
        }
    }

    @Override // com.alibaba.sdk.android.httpdns.HttpDnsService
    public void setExpiredIPEnabled(boolean z) {
        if (!C0258b.m431a()) {
            C0299i.m536f("HttpDns service turned off");
            return;
        }
        this.isExpiredIPEnabled = z;
        C0276b a = C0276b.m496a();
        if (a != null) {
            a.mo3993d(z ? 1 : 0);
        }
    }

    @Override // com.alibaba.sdk.android.httpdns.HttpDnsService
    public void setHTTPSRequestEnabled(boolean z) {
        if (!C0258b.m431a()) {
            C0299i.m536f("HttpDns service turned off");
        } else {
            C0296f.setHTTPSRequestEnabled(z);
        }
    }

    @Override // com.alibaba.sdk.android.httpdns.HttpDnsService
    public void setIPProbeList(List<IPProbeItem> list) {
        if (!C0258b.m431a()) {
            C0299i.m536f("HttpDns service turned off");
        } else {
            C0296f.m528a(list);
        }
    }

    @Override // com.alibaba.sdk.android.httpdns.HttpDnsService
    public void setLogEnabled(boolean z) {
        C0299i.setLogEnabled(z);
    }

    @Override // com.alibaba.sdk.android.httpdns.HttpDnsService
    public void setLogger(ILogger iLogger) {
        C0299i.setLogger(iLogger);
    }

    @Override // com.alibaba.sdk.android.httpdns.HttpDnsService
    public void setPreResolveAfterNetworkChanged(boolean z) {
        if (!C0258b.m431a()) {
            C0299i.m536f("HttpDns service turned off");
        } else {
            C0302l.f657d = z;
        }
    }

    @Override // com.alibaba.sdk.android.httpdns.HttpDnsService
    public void setPreResolveHosts(ArrayList<String> arrayList) {
        if (!C0258b.m431a()) {
            C0299i.m536f("HttpDns service turned off");
            return;
        }
        for (int i = 0; i < arrayList.size(); i++) {
            String str = arrayList.get(i);
            if (C0301k.m539b(str) && !hostManager.m492a(str)) {
                C0266c.m467a().submit(new CallableC0304m(str, EnumC0312o.QUERY_HOST));
            }
        }
    }

    @Override // com.alibaba.sdk.android.httpdns.HttpDnsService
    public void setTimeoutInterval(int i) {
        if (!C0258b.m431a()) {
            C0299i.m536f("HttpDns service turned off");
        } else {
            C0296f.setTimeoutInterval(i);
        }
    }
}

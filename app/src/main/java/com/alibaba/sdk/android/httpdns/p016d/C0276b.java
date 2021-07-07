package com.alibaba.sdk.android.httpdns.p016d;

import android.app.Application;
import android.content.Context;
import android.text.TextUtils;
import com.alibaba.sdk.android.utils.AlicloudTracker;
import com.alibaba.sdk.android.utils.AlicloudTrackerManager;
import com.alibaba.sdk.android.utils.crashdefend.SDKMessageCallback;
import com.facebook.react.devsupport.WebsocketJavaScriptExecutor;
import java.util.HashMap;

/* renamed from: com.alibaba.sdk.android.httpdns.d.b */
public class C0276b {

    /* renamed from: b */
    public static volatile C0276b f604b;

    /* renamed from: a */
    public AlicloudTracker f605a = null;

    /* renamed from: a */
    public AlicloudTrackerManager f606a = null;

    /* renamed from: b */
    public C0274a f607b = new C0274a();

    /* renamed from: l */
    public boolean f608l = true;

    public C0276b(Context context) {
        if (context != null && (context.getApplicationContext() instanceof Application)) {
            AlicloudTrackerManager instance = AlicloudTrackerManager.getInstance((Application) context.getApplicationContext());
            this.f606a = instance;
            if (instance != null) {
                this.f605a = instance.getTracker("httpdns", "1.2.5");
            }
        }
    }

    /* renamed from: a */
    public static C0276b m496a() {
        return f604b;
    }

    /* renamed from: a */
    public static C0276b m497a(Context context) {
        if (f604b == null) {
            synchronized (C0276b.class) {
                if (f604b == null) {
                    f604b = new C0276b(context);
                }
            }
        }
        return f604b;
    }

    /* renamed from: a */
    public void mo3982a(String str, int i, int i2, int i3) {
        if (!this.f608l || this.f605a == null || TextUtils.isEmpty(str)) {
            return;
        }
        if (i != 0 && i != 1) {
            return;
        }
        if (i2 != 0 && i2 != 1) {
            return;
        }
        if (i3 == 0 || i3 == 1) {
            final HashMap hashMap = new HashMap();
            hashMap.put("host", str);
            hashMap.put("success", String.valueOf(i));
            hashMap.put("ipv6", String.valueOf(i2));
            hashMap.put("cacheOpen", String.valueOf(i3));
            this.f607b.mo3980b().submit(new Runnable() {
                /* class com.alibaba.sdk.android.httpdns.p016d.C0276b.RunnableC02865 */

                public void run() {
                    try {
                        C0276b.this.f605a.sendCustomHit("perf_getip", hashMap);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            });
        }
    }

    /* renamed from: a */
    public void mo3983a(String str, long j, int i) {
        if (!this.f608l || this.f605a == null || TextUtils.isEmpty(str) || j <= 0) {
            return;
        }
        if (i == 0 || i == 1) {
            if (j > 30000) {
                j = 30000;
            }
            final HashMap hashMap = new HashMap();
            hashMap.put("scAddr", str);
            hashMap.put("cost", String.valueOf(j));
            hashMap.put("ipv6", String.valueOf(i));
            this.f607b.mo3980b().submit(new Runnable() {
                /* class com.alibaba.sdk.android.httpdns.p016d.C0276b.RunnableC02843 */

                public void run() {
                    try {
                        C0276b.this.f605a.sendCustomHit("perf_sc", hashMap);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            });
        }
    }

    /* renamed from: a */
    public void mo3984a(String str, String str2, String str3) {
        if (this.f608l && this.f605a != null && !TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            final HashMap hashMap = new HashMap();
            hashMap.put("host", str);
            hashMap.put("scAddr", str2);
            hashMap.put("srvAddr", str3);
            this.f607b.mo3980b().submit(new Runnable() {
                /* class com.alibaba.sdk.android.httpdns.p016d.C0276b.RunnableC02898 */

                public void run() {
                    try {
                        C0276b.this.f605a.sendCustomHit("biz_sniffer", hashMap);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            });
        }
    }

    /* renamed from: a */
    public void mo3985a(String str, String str2, String str3, int i) {
        if (!this.f608l || this.f605a == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
            return;
        }
        if (i == 0 || i == 1) {
            final HashMap hashMap = new HashMap();
            hashMap.put("scAddr", str);
            hashMap.put("errCode", str2);
            hashMap.put("errMsg", str3);
            hashMap.put("ipv6", String.valueOf(i));
            this.f607b.mo3980b().submit(new Runnable() {
                /* class com.alibaba.sdk.android.httpdns.p016d.C0276b.RunnableC028113 */

                public void run() {
                    try {
                        C0276b.this.f605a.sendCustomHit("err_sc", hashMap);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            });
        }
    }

    /* renamed from: a */
    public void mo3986a(String str, String str2, String str3, int i, int i2) {
        try {
            if (!this.f608l || this.f605a == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
                return;
            }
            if (i != 0 && i != 1) {
                return;
            }
            if (i2 == 0 || i2 == 1) {
                final HashMap hashMap = new HashMap();
                hashMap.put("srvAddr", str);
                hashMap.put("errCode", str2);
                hashMap.put("errMsg", str3);
                hashMap.put("ipv6", String.valueOf(i));
                hashMap.put("ipv6_srv", String.valueOf(i2));
                this.f607b.mo3980b().submit(new Runnable() {
                    /* class com.alibaba.sdk.android.httpdns.p016d.C0276b.RunnableC028214 */

                    public void run() {
                        try {
                            C0276b.this.f605a.sendCustomHit("err_srv", hashMap);
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                });
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public void mo3987a(String str, String str2, String str3, long j, long j2, int i) {
        if (this.f608l && this.f605a != null && !TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3) && i > 0) {
            if (j > WebsocketJavaScriptExecutor.CONNECT_TIMEOUT_MS) {
                j = 5000;
            }
            if (j2 > WebsocketJavaScriptExecutor.CONNECT_TIMEOUT_MS) {
                j2 = 5000;
            }
            final HashMap hashMap = new HashMap();
            hashMap.put("host", str);
            hashMap.put("defaultIp", str2);
            hashMap.put("selectedIp", str3);
            hashMap.put("defaultIpCost", String.valueOf(j));
            hashMap.put("selectedIpCost", String.valueOf(j2));
            hashMap.put("ipCount", String.valueOf(i));
            this.f607b.mo3980b().submit(new Runnable() {
                /* class com.alibaba.sdk.android.httpdns.p016d.C0276b.RunnableC02887 */

                public void run() {
                    try {
                        C0276b.this.f605a.sendCustomHit("perf_ipselection", hashMap);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            });
        }
    }

    /* renamed from: a */
    public boolean mo3988a(SDKMessageCallback sDKMessageCallback) {
        try {
            if (this.f606a != null) {
                return this.f606a.registerCrashDefend("httpdns", "1.2.5", 2, 7, sDKMessageCallback);
            }
            return false;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: b */
    public void mo3989b(String str, int i, int i2, int i3) {
        if (!this.f608l || this.f605a == null || TextUtils.isEmpty(str)) {
            return;
        }
        if (i != 0 && i != 1) {
            return;
        }
        if (i2 != 0 && i2 != 1) {
            return;
        }
        if (i3 == 0 || i3 == 1) {
            final HashMap hashMap = new HashMap();
            hashMap.put("host", str);
            hashMap.put("success", String.valueOf(i));
            hashMap.put("ipv6", String.valueOf(i2));
            hashMap.put("cacheOpen", String.valueOf(i3));
            this.f607b.mo3980b().submit(new Runnable() {
                /* class com.alibaba.sdk.android.httpdns.p016d.C0276b.RunnableC02876 */

                public void run() {
                    try {
                        C0276b.this.f605a.sendCustomHit("perf_user_getip", hashMap);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            });
        }
    }

    /* renamed from: b */
    public void mo3990b(String str, long j, int i) {
        if (!this.f608l || this.f605a == null || TextUtils.isEmpty(str) || j <= 0) {
            return;
        }
        if (i == 0 || i == 1) {
            if (j > 30000) {
                j = 30000;
            }
            final HashMap hashMap = new HashMap();
            hashMap.put("srvAddr", str);
            hashMap.put("cost", String.valueOf(j));
            hashMap.put("ipv6", String.valueOf(i));
            this.f607b.mo3980b().submit(new Runnable() {
                /* class com.alibaba.sdk.android.httpdns.p016d.C0276b.RunnableC02854 */

                public void run() {
                    try {
                        C0276b.this.f605a.sendCustomHit("perf_srv", hashMap);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            });
        }
    }

    /* renamed from: b */
    public void mo3991b(String str, String str2, String str3) {
        if (this.f608l && this.f605a != null && !TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            final HashMap hashMap = new HashMap();
            hashMap.put("host", str);
            hashMap.put("scAddr", str2);
            hashMap.put("srvAddr", str3);
            this.f607b.mo3980b().submit(new Runnable() {
                /* class com.alibaba.sdk.android.httpdns.p016d.C0276b.RunnableC02909 */

                public void run() {
                    try {
                        C0276b.this.f605a.sendCustomHit("biz_local_disable", hashMap);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            });
        }
    }

    /* renamed from: c */
    public void mo3992c(int i) {
        if (!this.f608l || this.f605a == null) {
            return;
        }
        if (i == 0 || i == 1) {
            final HashMap hashMap = new HashMap();
            hashMap.put("enable", String.valueOf(i));
            this.f607b.mo3980b().submit(new Runnable() {
                /* class com.alibaba.sdk.android.httpdns.p016d.C0276b.RunnableC027810 */

                public void run() {
                    try {
                        C0276b.this.f605a.sendCustomHit("biz_cache", hashMap);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            });
        }
    }

    /* renamed from: d */
    public void mo3993d(int i) {
        if (!this.f608l || this.f605a == null) {
            return;
        }
        if (i == 0 || i == 1) {
            final HashMap hashMap = new HashMap();
            hashMap.put("enable", String.valueOf(i));
            this.f607b.mo3980b().submit(new Runnable() {
                /* class com.alibaba.sdk.android.httpdns.p016d.C0276b.RunnableC027911 */

                public void run() {
                    try {
                        C0276b.this.f605a.sendCustomHit("biz_expired_ip", hashMap);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            });
        }
    }

    /* renamed from: e */
    public void mo3994e(int i) {
        try {
            if (!this.f608l || this.f605a == null) {
                return;
            }
            if (i == 0 || i == 1) {
                final HashMap hashMap = new HashMap();
                hashMap.put("enable", String.valueOf(i));
                this.f607b.mo3980b().submit(new Runnable() {
                    /* class com.alibaba.sdk.android.httpdns.p016d.C0276b.RunnableC028012 */

                    public void run() {
                        try {
                            C0276b.this.f605a.sendCustomHit("biz_ipv6_enable", hashMap);
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                });
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: e */
    public void mo3995e(boolean z) {
        synchronized (C0276b.class) {
            this.f608l = z;
        }
    }

    /* renamed from: i */
    public void mo3996i() {
        if (this.f608l && this.f605a != null) {
            this.f607b.mo3980b().submit(new Runnable() {
                /* class com.alibaba.sdk.android.httpdns.p016d.C0276b.RunnableC02771 */

                public void run() {
                    try {
                        C0276b.this.f605a.sendCustomHit("biz_active", null);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            });
        }
    }

    /* renamed from: k */
    public void mo3997k(String str) {
        if (this.f608l && this.f605a != null && !TextUtils.isEmpty(str)) {
            final HashMap hashMap = new HashMap();
            hashMap.put("exception", str);
            this.f607b.mo3980b().submit(new Runnable() {
                /* class com.alibaba.sdk.android.httpdns.p016d.C0276b.RunnableC02832 */

                public void run() {
                    try {
                        C0276b.this.f605a.sendCustomHit("err_uncaught_exception", hashMap);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            });
        }
    }

    public void setAccountId(String str) {
        AlicloudTracker alicloudTracker = this.f605a;
        if (alicloudTracker != null) {
            alicloudTracker.setGlobalProperty("accountId", str);
        }
    }
}

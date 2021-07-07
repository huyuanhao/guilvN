package com.taobao.accs.client;

import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.net.ConnectivityManager;
import android.text.TextUtils;
import androidx.annotation.Keep;
import com.p118pd.sdk.C5982OoooOoO;
import com.taobao.accs.AbstractC3123f;
import com.taobao.accs.C3083a;
import com.taobao.accs.IAgooAppReceiver;
import com.taobao.accs.IAppReceiver;
import com.taobao.accs.ILoginInfo;
import com.taobao.accs.base.AccsAbstractDataListener;
import com.taobao.accs.base.AccsDataListener;
import com.taobao.accs.common.ThreadPoolExecutorFactory;
import com.taobao.accs.utl.ALog;
import com.taobao.accs.utl.C3190t;
import com.taobao.accs.utl.UtilityImpl;
import com.taobao.aranger.ARanger;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.android.agoo.common.AgooConstants;

public class GlobalClientInfo {
    public static final String AGOO_SERVICE_ID = "agooSend";

    /* renamed from: a */
    public static Context f6858a;

    /* renamed from: b */
    public static IAgooAppReceiver f6859b;

    /* renamed from: c */
    public static String f6860c;

    /* renamed from: d */
    public static boolean f6861d;

    /* renamed from: e */
    public static volatile GlobalClientInfo f6862e;

    /* renamed from: k */
    public static Map<String, String> f6863k = new ConcurrentHashMap();

    /* renamed from: l */
    public static Map<String, Map<String, String>> f6864l = new ConcurrentHashMap();

    /* renamed from: f */
    public ConcurrentHashMap<String, ILoginInfo> f6865f;

    /* renamed from: g */
    public ConcurrentHashMap<String, IAppReceiver> f6866g;

    /* renamed from: h */
    public ActivityManager f6867h;

    /* renamed from: i */
    public ConnectivityManager f6868i;

    /* renamed from: j */
    public PackageInfo f6869j;

    /* renamed from: m */
    public Map<String, AccsDataListener> f6870m = new ConcurrentHashMap();

    static {
        f6863k.put("agooSend", "org.android.agoo.accs.AgooService");
        f6863k.put(AgooConstants.AGOO_SERVICE_AGOOACK, "org.android.agoo.accs.AgooService");
        f6863k.put("agooTokenReport", "org.android.agoo.accs.AgooService");
    }

    public GlobalClientInfo(Context context) {
        Context context2 = getContext();
        f6858a = context2;
        if (context2 == null && context != null) {
            f6858a = context.getApplicationContext();
        }
        ThreadPoolExecutorFactory.execute(new RunnableC3105c(this));
    }

    /* renamed from: a */
    private void m7294a(String str, Map<String, String> map) {
        if (map != null) {
            if (f6864l.get(str) == null) {
                f6864l.put(str, new ConcurrentHashMap());
            }
            f6864l.get(str).putAll(map);
        }
    }

    public static Context getContext() {
        return f6858a;
    }

    @Keep
    public static GlobalClientInfo getInstance(Context context) {
        if (f6862e == null) {
            synchronized (GlobalClientInfo.class) {
                if (f6862e == null) {
                    f6862e = new GlobalClientInfo(context);
                }
            }
        }
        return f6862e;
    }

    public void clearLoginInfoImpl() {
        this.f6865f = null;
    }

    public ActivityManager getActivityManager() {
        if (this.f6867h == null) {
            this.f6867h = (ActivityManager) f6858a.getSystemService(C5982OoooOoO.OooO0o0);
        }
        return this.f6867h;
    }

    public Map<String, String> getAllService(String str) {
        if (f6864l.get(str) == null || f6864l.get(str).isEmpty()) {
            return null;
        }
        return f6864l.get(str);
    }

    public Map<String, IAppReceiver> getAppReceiver() {
        return this.f6866g;
    }

    public ConnectivityManager getConnectivityManager() {
        if (this.f6868i == null) {
            this.f6868i = (ConnectivityManager) f6858a.getSystemService("connectivity");
        }
        return this.f6868i;
    }

    public Map<String, AccsDataListener> getListener() {
        return this.f6870m;
    }

    public String getNick(String str) {
        ILoginInfo iLoginInfo;
        ConcurrentHashMap<String, ILoginInfo> concurrentHashMap = this.f6865f;
        if (concurrentHashMap == null || (iLoginInfo = concurrentHashMap.get(str)) == null) {
            return null;
        }
        return iLoginInfo.getNick();
    }

    public PackageInfo getPackageInfo() {
        try {
            if (this.f6869j == null) {
                this.f6869j = f6858a.getPackageManager().getPackageInfo(f6858a.getPackageName(), 0);
            }
        } catch (Throwable th) {
            ALog.m7598e("GlobalClientInfo", "getPackageInfo", th, new Object[0]);
        }
        return this.f6869j;
    }

    public String getService(String str) {
        return f6863k.get(str);
    }

    public String getSid(String str) {
        ILoginInfo iLoginInfo;
        ConcurrentHashMap<String, ILoginInfo> concurrentHashMap = this.f6865f;
        if (concurrentHashMap == null || (iLoginInfo = concurrentHashMap.get(str)) == null) {
            return null;
        }
        return iLoginInfo.getSid();
    }

    public String getUserId(String str) {
        ILoginInfo iLoginInfo;
        ConcurrentHashMap<String, ILoginInfo> concurrentHashMap = this.f6865f;
        if (concurrentHashMap == null || (iLoginInfo = concurrentHashMap.get(str)) == null) {
            return null;
        }
        return iLoginInfo.getUserId();
    }

    public void registerListener(String str, AccsAbstractDataListener accsAbstractDataListener) {
        registerListener(str, (AccsDataListener) accsAbstractDataListener);
    }

    @Keep
    public void registerRemoteListener(String str, AccsDataListener accsDataListener) {
        this.f6870m.put(str, accsDataListener);
    }

    @Keep
    public void registerRemoteService(String str, String str2) {
        f6863k.put(str, str2);
    }

    public void registerService(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            f6863k.put(str, str2);
            if (C3190t.m7707g() && UtilityImpl.isMainProcess(f6858a)) {
                try {
                    ARanger.getInstance(C3083a.class.getName(), AbstractC3123f.class, new Object[]{f6858a});
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public void setAppReceiver(String str, IAppReceiver iAppReceiver) {
        if ((!C3190t.m7707g() || UtilityImpl.isMainProcess(f6858a)) && iAppReceiver != null) {
            if (iAppReceiver instanceof IAgooAppReceiver) {
                f6859b = (IAgooAppReceiver) iAppReceiver;
            } else {
                if (this.f6866g == null) {
                    this.f6866g = new ConcurrentHashMap<>(2);
                }
                this.f6866g.put(str, iAppReceiver);
                m7294a(str, iAppReceiver.getAllServices());
            }
            if (C3190t.m7707g()) {
                try {
                    ARanger.getInstance(C3083a.class.getName(), AbstractC3123f.class, new Object[]{f6858a});
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public void setLoginInfoImpl(String str, ILoginInfo iLoginInfo) {
        if (this.f6865f == null) {
            this.f6865f = new ConcurrentHashMap<>(1);
        }
        if (iLoginInfo != null) {
            this.f6865f.put(str, iLoginInfo);
        }
    }

    @Keep
    public void setRemoteAgooAppReceiver(IAgooAppReceiver iAgooAppReceiver) {
        f6859b = iAgooAppReceiver;
    }

    @Keep
    public void setRemoteAppReceiver(String str, IAppReceiver iAppReceiver) {
        if (this.f6866g == null) {
            this.f6866g = new ConcurrentHashMap<>(2);
        }
        this.f6866g.put(str, iAppReceiver);
        m7294a(str, iAppReceiver.getAllServices());
    }

    public void unRegisterService(String str) {
        if (!TextUtils.isEmpty(str)) {
            f6863k.remove(str);
            if (C3190t.m7707g() && UtilityImpl.isMainProcess(f6858a)) {
                try {
                    ARanger.getInstance(C3083a.class.getName(), AbstractC3123f.class, new Object[]{f6858a});
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public void unregisterListener(String str) {
        if (!C3190t.m7707g() || UtilityImpl.isMainProcess(f6858a)) {
            this.f6870m.remove(str);
            if (C3190t.m7707g()) {
                try {
                    ARanger.getInstance(C3083a.class.getName(), AbstractC3123f.class, new Object[]{f6858a});
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }

    @Keep
    public void unregisterRemoteListener(String str) {
        this.f6870m.remove(str);
    }

    @Keep
    public void unregisterRemoteService(String str) {
        f6863k.remove(str);
    }

    public AccsDataListener getListener(String str) {
        return this.f6870m.get(str);
    }

    public String getService(String str, String str2) {
        if (f6864l.get(str) != null) {
            return f6864l.get(str).get(str2);
        }
        return null;
    }

    public void registerListener(String str, AccsDataListener accsDataListener) {
        if ((!C3190t.m7707g() || UtilityImpl.isMainProcess(f6858a)) && !TextUtils.isEmpty(str) && accsDataListener != null) {
            this.f6870m.put(str, accsDataListener);
            if (C3190t.m7707g()) {
                try {
                    ARanger.getInstance(C3083a.class.getName(), AbstractC3123f.class, new Object[]{f6858a});
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

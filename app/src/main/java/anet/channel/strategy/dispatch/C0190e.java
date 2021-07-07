package anet.channel.strategy.dispatch;

import android.os.Build;
import android.text.TextUtils;
import anet.channel.GlobalAppRuntimeInfo;
import anet.channel.status.NetworkStatusHelper;
import anet.channel.strategy.utils.C0209c;
import anet.channel.util.ALog;
import anet.channel.util.C0223c;
import com.taobao.accs.antibrush.C3087b;
import java.util.Map;
import java.util.Set;

/* renamed from: anet.channel.strategy.dispatch.e */
public class C0190e {
    public static final String TAG = "amdc.DispatchParamBuilder";

    /* renamed from: a */
    public static Map m258a(Map<String, Object> map) {
        IAmdcSign b = C0185a.m244b();
        if (b == null || TextUtils.isEmpty(b.getAppkey())) {
            ALog.m289e(TAG, "amdc sign is null or appkey is empty", null, new Object[0]);
            return null;
        }
        NetworkStatusHelper.NetworkStatus status = NetworkStatusHelper.getStatus();
        if (!NetworkStatusHelper.isConnected()) {
            ALog.m289e(TAG, "no network, don't send amdc request", null, new Object[0]);
            return null;
        }
        map.put("appkey", b.getAppkey());
        map.put(DispatchConstants.VERSION, DispatchConstants.VER_CODE);
        map.put("platform", "android");
        map.put(DispatchConstants.PLATFORM_VERSION, Build.VERSION.RELEASE);
        if (!TextUtils.isEmpty(GlobalAppRuntimeInfo.getUserId())) {
            map.put("sid", GlobalAppRuntimeInfo.getUserId());
        }
        if (!TextUtils.isEmpty(GlobalAppRuntimeInfo.getUtdid())) {
            map.put("deviceId", GlobalAppRuntimeInfo.getUtdid());
        }
        map.put(DispatchConstants.NET_TYPE, status.toString());
        if (status.isWifi()) {
            map.put("bssid", NetworkStatusHelper.getWifiBSSID());
        }
        map.put("carrier", NetworkStatusHelper.getCarrier());
        map.put(DispatchConstants.MNC, NetworkStatusHelper.getSimOp());
        map.put("lat", String.valueOf(C0185a.f381a));
        map.put("lng", String.valueOf(C0185a.f382b));
        map.putAll(C0185a.m245c());
        map.put("channel", C0185a.f383c);
        map.put(DispatchConstants.APP_NAME, C0185a.f384d);
        map.put("appVersion", C0185a.f385e);
        map.put(DispatchConstants.STACK_TYPE, Integer.toString(m256a()));
        map.put(DispatchConstants.DOMAIN, m259b(map));
        map.put(DispatchConstants.SIGNTYPE, b.useSecurityGuard() ? C3087b.KEY_SEC : "noSec");
        map.put("t", String.valueOf(System.currentTimeMillis()));
        String a = m257a(b, map);
        if (TextUtils.isEmpty(a)) {
            return null;
        }
        map.put("sign", a);
        return map;
    }

    /* renamed from: b */
    public static String m259b(Map map) {
        StringBuilder sb = new StringBuilder();
        for (String str : (Set) map.remove(DispatchConstants.HOSTS)) {
            sb.append(str);
            sb.append(' ');
        }
        if (sb.length() > 0) {
            sb.deleteCharAt(sb.length() - 1);
        }
        return sb.toString();
    }

    /* renamed from: a */
    public static int m256a() {
        int c = C0223c.m318c();
        if (c != 2) {
            return c != 3 ? 4 : 1;
        }
        return 2;
    }

    /* renamed from: a */
    public static String m257a(IAmdcSign iAmdcSign, Map<String, String> map) {
        StringBuilder sb = new StringBuilder(128);
        sb.append(C0209c.m284d(map.get("appkey")));
        sb.append("&");
        sb.append(C0209c.m284d(map.get(DispatchConstants.DOMAIN)));
        sb.append("&");
        sb.append(C0209c.m284d(map.get(DispatchConstants.APP_NAME)));
        sb.append("&");
        sb.append(C0209c.m284d(map.get("appVersion")));
        sb.append("&");
        sb.append(C0209c.m284d(map.get("bssid")));
        sb.append("&");
        sb.append(C0209c.m284d(map.get("channel")));
        sb.append("&");
        sb.append(C0209c.m284d(map.get("deviceId")));
        sb.append("&");
        sb.append(C0209c.m284d(map.get("lat")));
        sb.append("&");
        sb.append(C0209c.m284d(map.get("lng")));
        sb.append("&");
        sb.append(C0209c.m284d(map.get(DispatchConstants.MACHINE)));
        sb.append("&");
        sb.append(C0209c.m284d(map.get(DispatchConstants.NET_TYPE)));
        sb.append("&");
        sb.append(C0209c.m284d(map.get(DispatchConstants.OTHER)));
        sb.append("&");
        sb.append(C0209c.m284d(map.get("platform")));
        sb.append("&");
        sb.append(C0209c.m284d(map.get(DispatchConstants.PLATFORM_VERSION)));
        sb.append("&");
        sb.append(C0209c.m284d(map.get(DispatchConstants.PRE_IP)));
        sb.append("&");
        sb.append(C0209c.m284d(map.get("sid")));
        sb.append("&");
        sb.append(C0209c.m284d(map.get("t")));
        sb.append("&");
        sb.append(C0209c.m284d(map.get(DispatchConstants.VERSION)));
        sb.append("&");
        sb.append(C0209c.m284d(map.get(DispatchConstants.SIGNTYPE)));
        try {
            return iAmdcSign.sign(sb.toString());
        } catch (Exception e) {
            ALog.m288e(TAG, "get sign failed", null, e, new Object[0]);
            return null;
        }
    }
}

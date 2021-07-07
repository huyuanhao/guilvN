package anet.channel.status;

import android.content.Context;
import android.net.NetworkInfo;
import android.os.Build;
import android.util.Pair;
import anet.channel.thread.ThreadPoolExecutorFactory;
import anet.channel.util.ALog;
import anet.channel.util.C0227g;
import com.p118pd.sdk.C9040ooOoOO;
import java.util.concurrent.CopyOnWriteArraySet;

public class NetworkStatusHelper {
    public static final String TAG = "awcn.NetworkStatusHelper";
    public static CopyOnWriteArraySet<INetworkStatusChangeListener> listeners = new CopyOnWriteArraySet<>();

    public interface INetworkStatusChangeListener {
        void onNetworkStatusChanged(NetworkStatus networkStatus);
    }

    public enum NetworkStatus {
        NONE,
        NO,
        G2,
        G3,
        G4,
        WIFI;

        public String getType() {
            if (this == G2) {
                return "2G";
            }
            if (this == G3) {
                return "3G";
            }
            if (this == G4) {
                return "4G";
            }
            return toString();
        }

        public boolean isMobile() {
            return this == G2 || this == G3 || this == G4;
        }

        public boolean isWifi() {
            return this == WIFI;
        }
    }

    public static void addStatusChangeListener(INetworkStatusChangeListener iNetworkStatusChangeListener) {
        listeners.add(iNetworkStatusChangeListener);
    }

    public static String getApn() {
        return C0174b.f312e;
    }

    public static String getCarrier() {
        return C0174b.f315h;
    }

    public static String getDnsServerAddress() {
        if (!C0174b.f319l.isEmpty()) {
            return C0174b.f319l.get(0).getHostAddress();
        }
        return C0174b.m191f();
    }

    public static String getNetworkSubType() {
        return C0174b.f311d;
    }

    public static String getProxyType() {
        NetworkStatus networkStatus = C0174b.f310c;
        if (networkStatus == NetworkStatus.WIFI && getWifiProxy() != null) {
            return "proxy";
        }
        if (!networkStatus.isMobile() || !C0174b.f312e.contains(C9040ooOoOO.OooO0Oo)) {
            return (!networkStatus.isMobile() || C0227g.m326a() == null) ? "" : "auth";
        }
        return C9040ooOoOO.OooO0Oo;
    }

    public static String getSimOp() {
        return C0174b.f316i;
    }

    public static NetworkStatus getStatus() {
        return C0174b.f310c;
    }

    public static String getWifiBSSID() {
        return C0174b.f314g;
    }

    public static Pair<String, Integer> getWifiProxy() {
        if (C0174b.f310c != NetworkStatus.WIFI) {
            return null;
        }
        return C0174b.f317j;
    }

    public static String getWifiSSID() {
        return C0174b.f313f;
    }

    public static boolean isConnected() {
        if (Build.VERSION.SDK_INT >= 24) {
            if (C0174b.f309b) {
                return true;
            }
        } else if (C0174b.f310c != NetworkStatus.NO) {
            return true;
        }
        try {
            NetworkInfo e = C0174b.m190e();
            if (e == null || !e.isConnected()) {
                return false;
            }
            return true;
        } catch (Exception unused) {
            return true;
        }
    }

    public static boolean isProxy() {
        NetworkStatus networkStatus = C0174b.f310c;
        String str = C0174b.f312e;
        if (networkStatus == NetworkStatus.WIFI && getWifiProxy() != null) {
            return true;
        }
        if (networkStatus.isMobile()) {
            return str.contains(C9040ooOoOO.OooO0Oo) || C0227g.m326a() != null;
        }
        return false;
    }

    public static boolean isRoaming() {
        return C0174b.f318k;
    }

    public static void notifyStatusChanged(NetworkStatus networkStatus) {
        ThreadPoolExecutorFactory.submitScheduledTask(new RunnableC0173a(networkStatus));
    }

    public static void printNetworkDetail() {
        try {
            NetworkStatus status = getStatus();
            StringBuilder sb = new StringBuilder(128);
            sb.append("\nNetwork detail*******************************\n");
            sb.append("Status: ");
            sb.append(status.getType());
            sb.append('\n');
            sb.append("Subtype: ");
            sb.append(getNetworkSubType());
            sb.append('\n');
            if (status != NetworkStatus.NO) {
                if (status.isMobile()) {
                    sb.append("Apn: ");
                    sb.append(getApn());
                    sb.append('\n');
                    sb.append("Carrier: ");
                    sb.append(getCarrier());
                    sb.append('\n');
                } else {
                    sb.append("BSSID: ");
                    sb.append(getWifiBSSID());
                    sb.append('\n');
                    sb.append("SSID: ");
                    sb.append(getWifiSSID());
                    sb.append('\n');
                }
            }
            if (isProxy()) {
                sb.append("Proxy: ");
                sb.append(getProxyType());
                sb.append('\n');
                Pair<String, Integer> wifiProxy = getWifiProxy();
                if (wifiProxy != null) {
                    sb.append("ProxyHost: ");
                    sb.append((String) wifiProxy.first);
                    sb.append('\n');
                    sb.append("ProxyPort: ");
                    sb.append(wifiProxy.second);
                    sb.append('\n');
                }
            }
            sb.append("*********************************************");
            ALog.m290i(TAG, sb.toString(), null, new Object[0]);
        } catch (Exception unused) {
        }
    }

    public static void removeStatusChangeListener(INetworkStatusChangeListener iNetworkStatusChangeListener) {
        listeners.remove(iNetworkStatusChangeListener);
    }

    public static synchronized void startListener(Context context) {
        synchronized (NetworkStatusHelper.class) {
            if (context != null) {
                C0174b.f308a = context;
                C0174b.m185a();
                C0174b.m188c();
            } else {
                throw new NullPointerException("context is null");
            }
        }
    }

    public void stopListener(Context context) {
        C0174b.m187b();
    }
}

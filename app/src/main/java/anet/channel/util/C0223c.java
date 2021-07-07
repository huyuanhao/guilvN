package anet.channel.util;

import android.text.TextUtils;
import androidx.exifinterface.media.ExifInterface;
import anet.channel.GlobalAppRuntimeInfo;
import anet.channel.appmonitor.AppMonitor;
import anet.channel.statist.NetTypeStat;
import anet.channel.status.NetworkStatusHelper;
import anet.channel.thread.ThreadPoolExecutorFactory;
import com.google.android.cameraview.AutoFocusManager;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.InterfaceAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.security.InvalidParameterException;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;

/* renamed from: anet.channel.util.c */
public class C0223c {
    public static final int IPV4_ONLY = 1;
    public static final int IPV6_ONLY = 2;
    public static final int IP_DUAL_STACK = 3;
    public static final int IP_STACK_UNKNOWN = 0;

    /* renamed from: a */
    public static final byte[][] f474a = {new byte[]{ExifInterface.OooO0Oo, 0, 0, -86}, new byte[]{ExifInterface.OooO0Oo, 0, 0, -85}};

    /* renamed from: b */
    public static volatile String f475b;

    /* renamed from: c */
    public static C0226f f476c;

    /* renamed from: d */
    public static ConcurrentHashMap<String, C0226f> f477d = new ConcurrentHashMap<>();

    /* renamed from: e */
    public static ConcurrentHashMap<String, Integer> f478e = new ConcurrentHashMap<>();

    static {
        f475b = null;
        f476c = null;
        try {
            f476c = new C0226f((Inet6Address) InetAddress.getAllByName("64:ff9b::")[0], 96);
            f475b = m316b(NetworkStatusHelper.getStatus());
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public static boolean m314a() {
        return false;
    }

    /* renamed from: b */
    public static String m316b(NetworkStatusHelper.NetworkStatus networkStatus) {
        if (networkStatus.isWifi()) {
            String wifiBSSID = NetworkStatusHelper.getWifiBSSID();
            if (TextUtils.isEmpty(wifiBSSID)) {
                wifiBSSID = "";
            }
            return "WIFI$" + wifiBSSID;
        } else if (!networkStatus.isMobile()) {
            return "UnknownNetwork";
        } else {
            return networkStatus.getType() + "$" + NetworkStatusHelper.getApn();
        }
    }

    /* renamed from: c */
    public static int m318c() {
        Integer num = f478e.get(f475b);
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    /* renamed from: d */
    public static C0226f m319d() {
        C0226f fVar = f477d.get(f475b);
        return fVar == null ? f476c : fVar;
    }

    /* renamed from: e */
    public static void m320e() {
        f475b = m316b(NetworkStatusHelper.getStatus());
        if (f478e.putIfAbsent(f475b, 0) == null) {
            int i = m324i();
            f478e.put(f475b, Integer.valueOf(i));
            NetTypeStat netTypeStat = new NetTypeStat();
            netTypeStat.ipStackType = i;
            String str = f475b;
            if (i == 2 || i == 3) {
                ThreadPoolExecutorFactory.submitScheduledTask(new RunnableC0224d(str, netTypeStat), AutoFocusManager.AUTO_FOCUS_INTERVAL_MS, TimeUnit.MILLISECONDS);
            } else if (GlobalAppRuntimeInfo.isTargetProcess()) {
                AppMonitor.getInstance().commitStat(netTypeStat);
            }
        }
    }

    /* renamed from: h */
    public static int m323h() throws SocketException {
        String str;
        int i;
        TreeMap treeMap = new TreeMap();
        Iterator it = Collections.list(NetworkInterface.getNetworkInterfaces()).iterator();
        while (true) {
            str = null;
            i = 0;
            if (!it.hasNext()) {
                break;
            }
            NetworkInterface networkInterface = (NetworkInterface) it.next();
            if (!networkInterface.getInterfaceAddresses().isEmpty()) {
                String displayName = networkInterface.getDisplayName();
                ALog.m290i("awcn.Inet64Util", "find NetworkInterface:" + displayName, null, new Object[0]);
                int i2 = 0;
                for (InterfaceAddress interfaceAddress : networkInterface.getInterfaceAddresses()) {
                    InetAddress address = interfaceAddress.getAddress();
                    if (address instanceof Inet6Address) {
                        Inet6Address inet6Address = (Inet6Address) address;
                        if (!m315a(inet6Address)) {
                            ALog.m289e("awcn.Inet64Util", "Found IPv6 address:" + inet6Address.toString(), null, new Object[0]);
                            i2 |= 2;
                        }
                    } else if (address instanceof Inet4Address) {
                        Inet4Address inet4Address = (Inet4Address) address;
                        if (!m315a((InetAddress) inet4Address) && !inet4Address.getHostAddress().startsWith("192.168.43.")) {
                            ALog.m289e("awcn.Inet64Util", "Found IPv4 address:" + inet4Address.toString(), null, new Object[0]);
                            i2 |= 1;
                        }
                    }
                }
                if (i2 != 0) {
                    treeMap.put(displayName.toLowerCase(), Integer.valueOf(i2));
                }
            }
        }
        if (treeMap.isEmpty()) {
            return 0;
        }
        if (treeMap.size() == 1) {
            return ((Integer) treeMap.firstEntry().getValue()).intValue();
        }
        if (NetworkStatusHelper.getStatus().isWifi()) {
            str = "wlan";
        } else if (NetworkStatusHelper.getStatus().isMobile()) {
            str = "rmnet";
        }
        if (str != null) {
            Iterator it2 = treeMap.entrySet().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it2.next();
                if (((String) entry.getKey()).startsWith(str)) {
                    i = ((Integer) entry.getValue()).intValue();
                    break;
                }
            }
        }
        return (i != 2 || !treeMap.containsKey("v4-wlan0")) ? i : i | ((Integer) treeMap.remove("v4-wlan0")).intValue();
    }

    /* renamed from: i */
    public static int m324i() {
        int i;
        try {
            i = m323h();
        } catch (Exception unused) {
            i = 0;
        }
        ALog.m289e("awcn.Inet64Util", "startIpStackDetect", null, "ip stack", Integer.valueOf(i));
        return i;
    }

    /* renamed from: j */
    public static C0226f m325j() throws UnknownHostException {
        InetAddress inetAddress;
        boolean z;
        try {
            inetAddress = InetAddress.getByName("ipv4only.arpa");
        } catch (Exception unused) {
            inetAddress = null;
        }
        if (inetAddress instanceof Inet6Address) {
            ALog.m290i("awcn.Inet64Util", "Resolved AAAA: " + inetAddress.toString(), null, new Object[0]);
            byte[] address = inetAddress.getAddress();
            if (address.length != 16) {
                return null;
            }
            int i = 12;
            while (true) {
                z = true;
                if (i < 0) {
                    z = false;
                    break;
                }
                byte b = address[i];
                byte[][] bArr = f474a;
                if ((b & bArr[0][0]) != 0 && address[i + 1] == 0 && address[i + 2] == 0) {
                    int i2 = i + 3;
                    if (address[i2] == bArr[0][3] || address[i2] == bArr[1][3]) {
                        break;
                    }
                }
                i--;
            }
            if (z) {
                address[i + 3] = 0;
                address[i + 2] = 0;
                address[i + 1] = 0;
                address[i] = 0;
                return new C0226f(Inet6Address.getByAddress("ipv4only.arpa", address, 0), i * 8);
            }
        } else if (inetAddress instanceof Inet4Address) {
            ALog.m290i("awcn.Inet64Util", "Resolved A: " + inetAddress.toString(), null, new Object[0]);
        }
        return null;
    }

    /* renamed from: a */
    public static String m313a(Inet4Address inet4Address) throws Exception {
        if (inet4Address != null) {
            C0226f d = m319d();
            if (d != null) {
                byte[] address = inet4Address.getAddress();
                byte[] address2 = d.f483b.getAddress();
                int i = d.f482a / 8;
                int i2 = 0;
                int i3 = 0;
                while (true) {
                    int i4 = i2 + i;
                    if (i4 <= 15 && i3 < 4) {
                        if (i4 != 8) {
                            address2[i4] = (byte) (address[i3] | address2[i4]);
                            i3++;
                        }
                        i2++;
                    }
                }
                return InetAddress.getByAddress(address2).getHostAddress();
            }
            throw new Exception("cannot get nat64 prefix");
        }
        throw new InvalidParameterException("address in null");
    }

    /* renamed from: b */
    public static boolean m317b() {
        Integer num = f478e.get(f475b);
        if (num == null || num.intValue() != 1) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static String m312a(String str) throws Exception {
        return m313a((Inet4Address) Inet4Address.getByName(str));
    }

    /* renamed from: a */
    public static boolean m315a(InetAddress inetAddress) {
        return inetAddress.isLoopbackAddress() || inetAddress.isLinkLocalAddress() || inetAddress.isAnyLocalAddress();
    }
}

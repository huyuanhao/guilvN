package com.qiyukf.nimlib.p196i.p197a;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.DhcpInfo;
import android.net.NetworkInfo;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import com.p118pd.sdk.C7520o0Ooo0O0;
import com.p118pd.sdk.C9058ooOoOoOO;
import com.qiyukf.basesdk.p119a.C1709a;
import com.umeng.message.MsgConstant;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* renamed from: com.qiyukf.nimlib.i.a.a */
public final class C2331a {

    /* renamed from: com.qiyukf.nimlib.i.a.a$a */
    public static class C2333a extends C2334b {

        /* renamed from: a */
        public String f4674a;

        /* renamed from: b */
        public String f4675b;

        /* renamed from: c */
        public String f4676c;

        /* renamed from: d */
        public String f4677d;

        public C2333a(String str, String str2) {
            super(str, str2);
        }

        @Override // com.qiyukf.nimlib.p196i.p197a.C2331a.C2334b
        public final String toString() {
            return "NIMConnectedWifiInfo{bssid='" + this.f4678e + '\'' + ",ssid='" + this.f4679f + '\'' + ",frequency=" + this.f4680g + ",speed=" + this.f4681h + ",rssi=" + this.f4682i + ",ip='" + this.f4683j + '\'' + ",dns1='" + this.f4674a + '\'' + ",dns2='" + this.f4675b + '\'' + ",gateway='" + this.f4676c + '\'' + ",netmask='" + this.f4677d + '\'' + '}';
        }
    }

    /* renamed from: com.qiyukf.nimlib.i.a.a$b */
    public static class C2334b {

        /* renamed from: e */
        public String f4678e;

        /* renamed from: f */
        public String f4679f;

        /* renamed from: g */
        public int f4680g;

        /* renamed from: h */
        public int f4681h;

        /* renamed from: i */
        public int f4682i;

        /* renamed from: j */
        public String f4683j;

        public C2334b(String str, String str2) {
            this.f4678e = str;
            this.f4679f = str2;
        }

        public String toString() {
            return "NIMWifiInfo{bssid='" + this.f4678e + '\'' + ",ssid='" + this.f4679f + '\'' + ",frequency=" + this.f4680g + ",speed=" + this.f4681h + ",rssi=" + this.f4682i + ",ip='" + this.f4683j + '\'' + '}';
        }
    }

    /* renamed from: a */
    public static C2333a m5065a(Context context) {
        NetworkInfo.DetailedState detailedStateOf;
        WifiManager c = m5068c(context);
        if (c == null) {
            return null;
        }
        C1709a.m3014b("stat", "begin to get connected wifi info...");
        if (!m5069d(context)) {
            C1709a.m3014b("stat", "unable to get connected wifi info, as permission is not granted");
            return null;
        }
        try {
            if (c.isWifiEnabled()) {
                WifiInfo connectionInfo = c.getConnectionInfo();
                if (connectionInfo == null || (((detailedStateOf = WifiInfo.getDetailedStateOf(connectionInfo.getSupplicantState())) != NetworkInfo.DetailedState.CONNECTED && detailedStateOf != NetworkInfo.DetailedState.OBTAINING_IPADDR) || C7520o0Ooo0O0.OooO0Oo.equals(connectionInfo.getBSSID()))) {
                    return null;
                }
                C2333a aVar = new C2333a(connectionInfo.getBSSID(), connectionInfo.getSSID());
                if (Build.VERSION.SDK_INT >= 21) {
                    aVar.f4680g = connectionInfo.getFrequency();
                }
                aVar.f4681h = connectionInfo.getLinkSpeed();
                aVar.f4682i = connectionInfo.getRssi();
                int ipAddress = connectionInfo.getIpAddress();
                aVar.f4683j = (ipAddress & 255) + C9058ooOoOoOO.OooOO0 + ((ipAddress >> 8) & 255) + C9058ooOoOoOO.OooOO0 + ((ipAddress >> 16) & 255) + C9058ooOoOoOO.OooOO0 + (ipAddress >>> 24);
                DhcpInfo dhcpInfo = c.getDhcpInfo();
                aVar.f4674a = m5066a(dhcpInfo.dns1);
                aVar.f4675b = m5066a(dhcpInfo.dns2);
                aVar.f4676c = m5066a(dhcpInfo.gateway);
                aVar.f4677d = m5066a(dhcpInfo.netmask);
                StringBuilder sb = new StringBuilder("find connected wifi: ");
                sb.append(aVar.toString());
                C1709a.m3014b("stat", sb.toString());
                return aVar;
            }
            C1709a.m3014b("stat", "wifi is disable");
        } catch (Throwable th) {
            th.printStackTrace();
            C1709a.m3014b("stat", "get connected wifi info failed, e=" + th.getMessage());
        }
        return null;
    }

    /* renamed from: a */
    public static String m5066a(int i) {
        int i2;
        byte[] bArr = new byte[4];
        int i3 = 0;
        while (true) {
            if (i3 >= 4) {
                break;
            }
            bArr[i3] = (byte) (i >>> ((3 - i3) << 3));
            i3++;
        }
        String str = "";
        for (i2 = 3; i2 >= 0; i2--) {
            str = str + (bArr[i2] & 255);
            if (i2 > 0) {
                str = str + C9058ooOoOoOO.OooOO0;
            }
        }
        return str;
    }

    /* renamed from: b */
    public static List<C2334b> m5067b(Context context) {
        WifiManager c = m5068c(context);
        if (c == null) {
            return null;
        }
        C1709a.m3014b("stat", "begin to scan wifi list...");
        if (!m5069d(context)) {
            C1709a.m3014b("stat", "unable to scan wifi list, as permission is not granted");
            return null;
        }
        try {
            if (c.isWifiEnabled()) {
                List<ScanResult> scanResults = c.getScanResults();
                if (scanResults != null) {
                    if (!scanResults.isEmpty()) {
                        Collections.sort(scanResults, new Comparator<ScanResult>() {
                            /* class com.qiyukf.nimlib.p196i.p197a.C2331a.C23321 */

                            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
                            @Override // java.util.Comparator
                            public final /* bridge */ /* synthetic */ int compare(ScanResult scanResult, ScanResult scanResult2) {
                                return scanResult2.level - scanResult.level;
                            }
                        });
                        ArrayList arrayList = new ArrayList(scanResults.size());
                        for (ScanResult scanResult : scanResults) {
                            if (!C7520o0Ooo0O0.OooO0Oo.equals(scanResult.BSSID)) {
                                C2334b bVar = new C2334b(scanResult.BSSID, scanResult.SSID);
                                bVar.f4680g = scanResult.frequency;
                                bVar.f4682i = scanResult.level;
                                arrayList.add(bVar);
                                C1709a.m3014b("stat", "find wifi: " + bVar.toString());
                            }
                        }
                        return arrayList;
                    }
                }
                C1709a.m3014b("stat", "find empty wifi node");
                return null;
            }
            C1709a.m3014b("stat", "wifi is disable");
            return null;
        } catch (Throwable th) {
            th.printStackTrace();
            C1709a.m3014b("stat", "scan wifi list failed, e=" + th.getMessage());
        }
    }

    /* renamed from: c */
    public static WifiManager m5068c(Context context) {
        try {
            return (WifiManager) context.getApplicationContext().getSystemService("wifi");
        } catch (Throwable th) {
            C1709a.m3014b("stat", "get system service WifiManager failed, e=" + th.getMessage());
            return null;
        }
    }

    /* renamed from: d */
    public static boolean m5069d(Context context) {
        if (context == null) {
            return false;
        }
        PackageManager packageManager = context.getApplicationContext().getPackageManager();
        String packageName = context.getApplicationContext().getPackageName();
        boolean z = packageManager.checkPermission(MsgConstant.PERMISSION_ACCESS_WIFI_STATE, packageName) == 0;
        boolean z2 = packageManager.checkPermission("android.permission.ACCESS_NETWORK_STATE", packageName) == 0;
        C1709a.m3014b("stat", "check permission ACCESS_WIFI_STATE " + z + ", check ACCESS_NETWORK_STATE " + z2);
        return z && z2;
    }
}

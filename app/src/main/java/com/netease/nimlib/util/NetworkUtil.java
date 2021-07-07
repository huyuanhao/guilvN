package com.netease.nimlib.util;

import android.content.Context;
import android.database.Cursor;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Proxy;
import android.net.Uri;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.telephony.TelephonyManager;
import com.facebook.react.modules.netinfo.NetInfoModule;
import com.p118pd.sdk.AbstractC8796ooO0000o;
import com.xiaomi.mipush.sdk.Constants;

public class NetworkUtil {
    public static final byte OooO = 10;

    /* renamed from: OooO  reason: collision with other field name */
    public static final int f15246OooO = 3;

    /* renamed from: OooO  reason: collision with other field name */
    public static final String f15247OooO = "3gwap";
    public static final byte OooO00o = 0;

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final int f15248OooO00o = 0;

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final Uri f15249OooO00o = Uri.parse("content://telephony/carriers/preferapn");

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final String f15250OooO00o = "NetworkUtil";
    public static final byte OooO0O0 = 1;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public static final int f15251OooO0O0 = 1;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public static final String f15252OooO0O0 = "wifi";
    public static final byte OooO0OO = 2;

    /* renamed from: OooO0OO  reason: collision with other field name */
    public static final int f15253OooO0OO = 2;

    /* renamed from: OooO0OO  reason: collision with other field name */
    public static final String f15254OooO0OO = "ctnet";
    public static final byte OooO0Oo = 3;

    /* renamed from: OooO0Oo  reason: collision with other field name */
    public static final int f15255OooO0Oo = 3;

    /* renamed from: OooO0Oo  reason: collision with other field name */
    public static final String f15256OooO0Oo = "ctwap";
    public static final byte OooO0o = 5;

    /* renamed from: OooO0o  reason: collision with other field name */
    public static final int f15257OooO0o = 0;

    /* renamed from: OooO0o  reason: collision with other field name */
    public static final String f15258OooO0o = "cmwap";
    public static final byte OooO0o0 = 4;

    /* renamed from: OooO0o0  reason: collision with other field name */
    public static final int f15259OooO0o0 = 10;

    /* renamed from: OooO0o0  reason: collision with other field name */
    public static final String f15260OooO0o0 = "cmnet";
    public static final byte OooO0oO = 6;

    /* renamed from: OooO0oO  reason: collision with other field name */
    public static final int f15261OooO0oO = 1;

    /* renamed from: OooO0oO  reason: collision with other field name */
    public static final String f15262OooO0oO = "uniwap";
    public static final byte OooO0oo = 7;

    /* renamed from: OooO0oo  reason: collision with other field name */
    public static final int f15263OooO0oo = 2;

    /* renamed from: OooO0oo  reason: collision with other field name */
    public static final String f15264OooO0oo = "uninet";
    public static final byte OooOO0 = 11;

    /* renamed from: OooOO0  reason: collision with other field name */
    public static final int f15265OooOO0 = -1;

    /* renamed from: OooOO0  reason: collision with other field name */
    public static final String f15266OooOO0 = "3gnet";
    public static final byte OooOO0O = 12;
    public static byte OooOO0o = 0;

    public enum NetworkSpeedMode {
        LOW,
        NORMAL,
        HIGH,
        UNKNOWN
    }

    public interface OooO00o {
        public static final int OooO00o = 0;
        public static final int OooO0O0 = 1;
        public static final int OooO0OO = 2;
        public static final int OooO0Oo = 3;
        public static final int OooO0o = 5;
        public static final int OooO0o0 = 4;
    }

    /* renamed from: OooO  reason: collision with other method in class */
    public static boolean m15191OooO(Context context) {
        NetworkInfo OooO00o2 = m15193OooO00o(context);
        return OooO00o2 != null && OooO00o2.isAvailable();
    }

    public static byte OooO00o(byte b) {
        if (b == 0) {
            return 0;
        }
        if (b == 1) {
            return 1;
        }
        if (b == 2 || b == 3) {
            return 10;
        }
        if (b == 4 || b == 6) {
            return 12;
        }
        return (b == 5 || b == 7) ? (byte) 11 : 0;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static int m15192OooO00o(Context context) {
        NetworkInfo OooO00o2 = m15193OooO00o(context);
        if (OooO00o2 == null) {
            return -1;
        }
        return OooO00o2.getType();
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static boolean m15198OooO00o(byte b) {
        return b == 4 || b == 6;
    }

    public static String OooO0O0(int i) {
        switch (i) {
            case 1:
                return "GPRS";
            case 2:
                return "EDGE";
            case 3:
                return "UMTS";
            case 4:
                return "CDMA";
            case 5:
                return "CDMA - EvDo rev. 0";
            case 6:
                return "CDMA - EvDo rev. A";
            case 7:
                return "CDMA - 1xRTT";
            case 8:
                return "HSDPA";
            case 9:
                return "HSUPA";
            case 10:
                return "HSPA";
            case 11:
                return "iDEN";
            case 12:
                return "CDMA - EvDo rev. B";
            case 13:
                return "LTE";
            case 14:
                return "CDMA - eHRPD";
            case 15:
                return "HSPA+";
            default:
                return NetInfoModule.CONNECTION_TYPE_UNKNOWN_DEPRECATED;
        }
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public static String m15201OooO0O0(Context context) {
        Cursor query = context.getContentResolver().query(f15249OooO00o, null, null, null, null);
        String str = "nomatch";
        if (query != null) {
            if (query.moveToFirst()) {
                String string = query.getString(query.getColumnIndex("user"));
                if (string != null && string.startsWith(f15254OooO0OO)) {
                    str = f15254OooO0OO;
                } else if (string != null && string.startsWith(f15256OooO0Oo)) {
                    str = f15256OooO0Oo;
                } else if (string != null && string.startsWith(f15258OooO0o)) {
                    str = f15258OooO0o;
                } else if (string != null && string.startsWith(f15260OooO0o0)) {
                    str = f15260OooO0o0;
                } else if (string != null && string.startsWith(f15262OooO0oO)) {
                    str = f15262OooO0oO;
                } else if (string != null && string.startsWith(f15264OooO0oo)) {
                    str = f15264OooO0oo;
                } else if (string != null && string.startsWith(f15247OooO)) {
                    str = f15247OooO;
                } else if (string != null && string.startsWith(f15266OooOO0)) {
                    str = f15266OooOO0;
                }
            }
            query.close();
        }
        return str;
    }

    public static boolean OooO0O0(byte b) {
        return b == 3 || b == 2;
    }

    public static boolean OooO0OO(byte b) {
        return b == 5 || b == 7;
    }

    /* renamed from: OooO0OO  reason: collision with other method in class */
    public static boolean m15204OooO0OO(Context context) {
        int OooO0O02 = m15200OooO0O0(context);
        return OooO0O02 == 2 || OooO0O02 == 3;
    }

    /* renamed from: OooO0Oo  reason: collision with other method in class */
    public static boolean m15205OooO0Oo(Context context) {
        return m15198OooO00o(OooO00o(context));
    }

    /* renamed from: OooO0o  reason: collision with other method in class */
    public static boolean m15206OooO0o(Context context) {
        return OooO0O0(OooO00o(context));
    }

    /* renamed from: OooO0o0  reason: collision with other method in class */
    public static boolean m15207OooO0o0(Context context) {
        return m15201OooO0O0(context).equals(f15258OooO0o);
    }

    public static String OooO0oO(Context context) {
        NetworkInfo activeNetworkInfo;
        String lowerCase;
        String defaultHost = Proxy.getDefaultHost();
        int defaultPort = Proxy.getDefaultPort();
        String valueOf = String.valueOf(defaultPort);
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        if (connectivityManager == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null || (((lowerCase = activeNetworkInfo.getTypeName().toLowerCase()) != null && lowerCase.equals("wifi")) || defaultHost == null || defaultPort <= 0 || defaultPort >= 65535)) {
            return null;
        }
        return defaultHost + Constants.COLON_SEPARATOR + valueOf;
    }

    public static String OooO0oo(Context context) {
        if (OooOO0o(context)) {
            return null;
        }
        String defaultHost = Proxy.getDefaultHost();
        AbstractC8796ooO0000o.OooO0O0(f15250OooO00o, "proxyHost:" + defaultHost);
        return defaultHost;
    }

    /* renamed from: OooOO0  reason: collision with other method in class */
    public static boolean m15210OooOO0(Context context) {
        NetworkInfo OooO00o2 = m15193OooO00o(context);
        return OooO00o2 != null && OooO00o2.isConnected();
    }

    public static boolean OooOO0O(Context context) {
        return m15201OooO0O0(context).equals(f15262OooO0oO);
    }

    public static boolean OooOO0o(Context context) {
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo == null || activeNetworkInfo.getType() != 1) {
                return false;
            }
            return true;
        } catch (Exception unused) {
        }
    }

    public static boolean OooOOO0(Context context) {
        if (OooOO0o(context)) {
            return true;
        }
        return m15204OooO0OO(context);
    }

    public static boolean OooO0OO(String str) {
        if (str == null) {
            return false;
        }
        if (str.equals(f15262OooO0oO) || str.equals(f15264OooO0oo) || str.equals(f15247OooO) || str.equals(f15266OooOO0)) {
            return true;
        }
        return false;
    }

    public static String OooO0o0(Context context) {
        NetworkInfo activeNetworkInfo;
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        if (connectivityManager == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null) {
            return "";
        }
        if (activeNetworkInfo.getType() == 1) {
            return activeNetworkInfo.getTypeName();
        }
        StringBuilder sb = new StringBuilder();
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
        sb.append(activeNetworkInfo.getTypeName());
        sb.append(" [");
        if (telephonyManager != null) {
            sb.append(telephonyManager.getNetworkOperatorName());
            sb.append("#");
        }
        sb.append(activeNetworkInfo.getSubtypeName());
        sb.append("]");
        return sb.toString();
    }

    public static String OooO(Context context) {
        NetworkInfo activeNetworkInfo;
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        if (connectivityManager == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null) {
            return NetInfoModule.CONNECTION_TYPE_UNKNOWN_DEPRECATED;
        }
        String OooO00o2 = OooO00o(activeNetworkInfo.getType());
        if (activeNetworkInfo.getType() != 0) {
            return OooO00o2;
        }
        return OooO00o2 + "#" + OooO0O0(activeNetworkInfo.getSubtype());
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x007f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static byte OooO00o(android.content.Context r17) {
        /*
        // Method dump skipped, instructions count: 213
        */
        throw new UnsupportedOperationException("Method not decompiled: com.netease.nimlib.util.NetworkUtil.OooO00o(android.content.Context):byte");
    }

    public static String OooO0Oo(Context context) {
        int OooO0O02 = m15200OooO0O0(context);
        if (OooO0O02 == 1) {
            return "2g";
        }
        if (OooO0O02 == 2) {
            return "3g";
        }
        if (OooO0O02 == 3) {
            return "4g";
        }
        return OooO0O02 == 10 ? "wifi" : "unknown";
    }

    public static String OooO0o(Context context) {
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
        if (telephonyManager != null) {
            return telephonyManager.getNetworkOperator();
        }
        return null;
    }

    public static String OooOO0(Context context) {
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
        if (telephonyManager != null) {
            return telephonyManager.getSimOperator();
        }
        return null;
    }

    /* renamed from: OooO0OO  reason: collision with other method in class */
    public static String m15203OooO0OO(Context context) {
        WifiInfo connectionInfo = ((WifiManager) context.getSystemService("wifi")).getConnectionInfo();
        return connectionInfo != null ? connectionInfo.getBSSID() : "";
    }

    /* renamed from: OooO0oo  reason: collision with other method in class */
    public static boolean m15209OooO0oo(Context context) {
        return OooO0OO(OooO00o(context));
    }

    public static int OooO0OO(Context context) {
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo != null) {
                if (activeNetworkInfo.getType() == 1) {
                    return 1;
                }
                if (activeNetworkInfo.getType() == 0) {
                    switch (activeNetworkInfo.getSubtype()) {
                        case 3:
                        case 5:
                        case 6:
                        case 8:
                        case 9:
                        case 10:
                        case 12:
                        case 14:
                        case 15:
                            return 4;
                        case 4:
                        case 7:
                        case 11:
                        default:
                            return 3;
                        case 13:
                            return 5;
                    }
                }
            }
        } catch (Exception unused) {
        }
        return 0;
    }

    /* renamed from: OooO0oO  reason: collision with other method in class */
    public static boolean m15208OooO0oO(Context context) {
        return m15201OooO0O0(context).equals(f15256OooO0Oo);
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public static boolean m15202OooO0O0(Context context) {
        return !OooOOO0(context);
    }

    public static boolean OooO0O0(String str) {
        if (str == null) {
            return false;
        }
        return str.equals(f15256OooO0Oo) || str.equals(f15254OooO0OO);
    }

    public static byte OooO0O0(Context context) {
        if (OooOO0o(context)) {
            return 1;
        }
        if (m15206OooO0o(context)) {
            return 10;
        }
        if (m15205OooO0Oo(context)) {
            return 12;
        }
        return m15209OooO0oo(context) ? (byte) 11 : 0;
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public static int m15200OooO0O0(Context context) {
        NetworkInfo activeNetworkInfo;
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        if (!(connectivityManager == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null)) {
            if (activeNetworkInfo.getType() == 0) {
                switch (activeNetworkInfo.getSubtype()) {
                    case 1:
                    case 2:
                    case 4:
                    case 7:
                    case 11:
                    case 16:
                        return 1;
                    case 3:
                    case 5:
                    case 6:
                    case 8:
                    case 9:
                    case 10:
                    case 12:
                    case 14:
                    case 15:
                    case 17:
                        return 2;
                    case 13:
                        return 3;
                    default:
                        return 0;
                }
            } else if (activeNetworkInfo.getType() == 1) {
                return 10;
            }
        }
        return 0;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static NetworkInfo m15193OooO00o(Context context) {
        try {
            return ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static boolean m15199OooO00o(Context context) {
        NetworkInfo activeNetworkInfo;
        TelephonyManager telephonyManager;
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        if (connectivityManager == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null || (telephonyManager = (TelephonyManager) context.getSystemService("phone")) == null) {
            return false;
        }
        if ((telephonyManager.getDataState() == 2 || telephonyManager.getDataState() == 0) && activeNetworkInfo.isAvailable()) {
            return true;
        }
        return false;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static String m15195OooO00o() {
        if (OooOO0o == 1) {
            return null;
        }
        String defaultHost = Proxy.getDefaultHost();
        AbstractC8796ooO0000o.OooO0O0(f15250OooO00o, "proxyHost:" + defaultHost);
        return defaultHost;
    }

    public static int OooO00o() {
        return Proxy.getDefaultPort();
    }

    public static boolean OooO00o(String str) {
        if (str == null) {
            return false;
        }
        return str.equals(f15258OooO0o) || str.equals(f15260OooO0o0);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static boolean m15197OooO00o() {
        return !Build.MODEL.equals("SCH-N719") && !Build.MODEL.equals("SCH-I939D");
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static String m15196OooO00o(Context context) {
        WifiInfo connectionInfo = ((WifiManager) context.getSystemService("wifi")).getConnectionInfo();
        return connectionInfo != null ? connectionInfo.getMacAddress() : "";
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static NetworkSpeedMode m15194OooO00o(Context context) {
        NetworkInfo activeNetworkInfo;
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        if (!(connectivityManager == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null || activeNetworkInfo.getType() != 0)) {
            switch (activeNetworkInfo.getSubtype()) {
                case 0:
                    return NetworkSpeedMode.NORMAL;
                case 1:
                    return NetworkSpeedMode.LOW;
                case 2:
                    return NetworkSpeedMode.LOW;
                case 3:
                    return NetworkSpeedMode.NORMAL;
                case 4:
                    return NetworkSpeedMode.LOW;
                case 5:
                    return NetworkSpeedMode.NORMAL;
                case 6:
                    return NetworkSpeedMode.NORMAL;
                case 7:
                    return NetworkSpeedMode.LOW;
                case 8:
                    return NetworkSpeedMode.HIGH;
                case 9:
                    return NetworkSpeedMode.HIGH;
                case 10:
                    return NetworkSpeedMode.NORMAL;
                case 11:
                    return NetworkSpeedMode.LOW;
                case 12:
                    return NetworkSpeedMode.NORMAL;
                case 13:
                    return NetworkSpeedMode.HIGH;
                case 14:
                    return NetworkSpeedMode.NORMAL;
                case 15:
                    return NetworkSpeedMode.HIGH;
            }
        }
        return NetworkSpeedMode.UNKNOWN;
    }

    public static String OooO00o(int i) {
        switch (i) {
            case 0:
                return "MOBILE";
            case 1:
                return "WIFI";
            case 2:
                return "MOBILE_MMS";
            case 3:
                return "MOBILE_SUPL";
            case 4:
                return "MOBILE_DUN";
            case 5:
                return "MOBILE_HIPRI";
            case 6:
                return "WIMAX";
            case 7:
                return "BLUETOOTH";
            case 8:
                return "DUMMY";
            case 9:
                return "ETHERNET";
            case 10:
                return "MOBILE_FOTA";
            case 11:
                return "MOBILE_IMS";
            case 12:
                return "MOBILE_CBS";
            case 13:
                return "WIFI_P2P";
            default:
                return Integer.toString(i);
        }
    }
}

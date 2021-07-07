package com.netease.nis.captcha;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.net.ConnectivityManager;
import android.net.DhcpInfo;
import android.net.NetworkInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.LocaleList;
import android.util.DisplayMetrics;
import com.netease.nis.captcha.CaptchaConfiguration;
import com.p118pd.sdk.C9058ooOoOoOO;
import com.umeng.socialize.net.utils.SocializeProtocolConstants;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.util.Enumeration;
import java.util.Locale;

/* renamed from: com.netease.nis.captcha.d */
public class C1664d {

    /* renamed from: a */
    public static boolean f3054a;

    /* renamed from: com.netease.nis.captcha.d$OooO00o */
    public static /* synthetic */ class OooO00o {
        public static final /* synthetic */ int[] OooO00o;

        /* JADX WARNING: Can't wrap try/catch for region: R(42:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|36|37|38|39|40|(3:41|42|44)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(44:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|36|37|38|39|40|41|42|44) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x006c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0078 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0084 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0090 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x009c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x00a8 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x00b4 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x00c0 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x00cc */
        /* JADX WARNING: Missing exception handler attribute for start block: B:37:0x00d8 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:39:0x00e4 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:41:0x00f0 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
            // Method dump skipped, instructions count: 253
            */
            throw new UnsupportedOperationException("Method not decompiled: com.netease.nis.captcha.C1664d.OooO00o.<clinit>():void");
        }
    }

    /* renamed from: a */
    public static String m2927a(int i) {
        return (i & 255) + C9058ooOoOoOO.OooOO0 + ((i >> 8) & 255) + C9058ooOoOoOO.OooOO0 + ((i >> 16) & 255) + C9058ooOoOoOO.OooOO0 + ((i >> 24) & 255);
    }

    /* renamed from: a */
    public static String m2928a(CaptchaConfiguration.LangType langType) {
        switch (OooO00o.OooO00o[langType.ordinal()]) {
            case 1:
                return "zh-TW";
            case 2:
                return SocializeProtocolConstants.PROTOCOL_KEY_EN;
            case 3:
                return "ja";
            case 4:
                return "ko";
            case 5:
                return "th";
            case 6:
                return "vi";
            case 7:
                return SocializeProtocolConstants.PROTOCOL_KEY_FR;
            case 8:
                return "ru";
            case 9:
                return "ar";
            case 10:
                return SocializeProtocolConstants.PROTOCOL_KEY_DE;
            case 11:
                return "it";
            case 12:
                return "he";
            case 13:
                return "hi";
            case 14:
                return "id";
            case 15:
                return "my";
            case 16:
                return "lo";
            case 17:
                return "ms";
            case 18:
                return "pl";
            case 19:
                return "pt";
            case 20:
                return "es";
            case 21:
                return "tr";
            default:
                return "";
        }
    }

    /* renamed from: a */
    public static void m2929a(Context context, CaptchaConfiguration.LangType langType) {
        Locale locale;
        switch (OooO00o.OooO00o[langType.ordinal()]) {
            case 1:
                locale = Locale.TAIWAN;
                break;
            case 2:
                locale = Locale.US;
                break;
            case 3:
                locale = Locale.JAPAN;
                break;
            case 4:
                locale = Locale.KOREA;
                break;
            case 5:
                locale = new Locale("th", "TH");
                break;
            case 6:
                locale = new Locale("vi", "VN");
                break;
            case 7:
                locale = Locale.FRANCE;
                break;
            case 8:
                locale = new Locale("ru", "RU");
                break;
            case 9:
                locale = new Locale("ar", "SA");
                break;
            case 10:
                locale = new Locale(SocializeProtocolConstants.PROTOCOL_KEY_DE, "DE");
                break;
            case 11:
                locale = new Locale("it", "IT");
                break;
            case 12:
                locale = new Locale("iw", "IL");
                break;
            case 13:
                locale = new Locale("hi", "IN");
                break;
            case 14:
                locale = new Locale("in", "ID");
                break;
            case 15:
                locale = new Locale("my", "MM");
                break;
            case 16:
                locale = new Locale("lo", "LA");
                break;
            case 17:
                locale = new Locale("ms", "MY");
                break;
            case 18:
                locale = new Locale("pl", "PL");
                break;
            case 19:
                locale = new Locale("pt", "PT");
                break;
            case 20:
                locale = new Locale("es", "ES");
                break;
            case 21:
                locale = new Locale("tr", "TR");
                break;
            default:
                locale = Locale.SIMPLIFIED_CHINESE;
                break;
        }
        m2930a(context, locale);
    }

    /* renamed from: a */
    public static void m2930a(Context context, Locale locale) {
        Resources resources = context.getResources();
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        Configuration configuration = resources.getConfiguration();
        int i = Build.VERSION.SDK_INT;
        if (i >= 24) {
            LocaleList localeList = new LocaleList(locale);
            LocaleList.setDefault(localeList);
            configuration.setLocales(localeList);
            context.createConfigurationContext(configuration);
        } else if (i >= 19) {
            configuration.setLocale(locale);
        } else {
            configuration.locale = locale;
        }
        resources.updateConfiguration(configuration, displayMetrics);
    }

    /* renamed from: a */
    public static void m2931a(String str, Object... objArr) {
        if (f3054a) {
            String.format(str, objArr);
        }
    }

    /* renamed from: a */
    public static void m2932a(boolean z) {
        f3054a = z;
    }

    /* renamed from: a */
    public static boolean m2933a() {
        return f3054a;
    }

    /* renamed from: a */
    public static boolean m2934a(Context context) {
        NetworkInfo activeNetworkInfo;
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        return connectivityManager != null && (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) != null && activeNetworkInfo.isConnected() && activeNetworkInfo.getState() == NetworkInfo.State.CONNECTED;
    }

    /* renamed from: b */
    public static String m2935b(Context context) {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
            return null;
        }
        if (activeNetworkInfo.getType() == 0) {
            try {
                Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
                while (networkInterfaces.hasMoreElements()) {
                    Enumeration<InetAddress> inetAddresses = networkInterfaces.nextElement().getInetAddresses();
                    while (true) {
                        if (inetAddresses.hasMoreElements()) {
                            InetAddress nextElement = inetAddresses.nextElement();
                            if (!nextElement.isLoopbackAddress() && (nextElement instanceof Inet4Address)) {
                                return nextElement.getHostAddress();
                            }
                        }
                    }
                }
                return null;
            } catch (Exception e) {
                e.printStackTrace();
                return null;
            }
        } else if (activeNetworkInfo.getType() == 1) {
            return m2927a(((WifiManager) context.getApplicationContext().getSystemService("wifi")).getConnectionInfo().getIpAddress());
        } else {
            return null;
        }
    }

    /* renamed from: b */
    public static void m2936b(String str, Object... objArr) {
        if (f3054a) {
            String.format(str, objArr);
        }
    }

    /* renamed from: c */
    public static String m2937c(Context context) {
        WifiManager wifiManager = (WifiManager) context.getApplicationContext().getSystemService("wifi");
        if (wifiManager == null) {
            return null;
        }
        DhcpInfo dhcpInfo = wifiManager.getDhcpInfo();
        String a = m2927a(dhcpInfo.dns1);
        String a2 = m2927a(dhcpInfo.dns2);
        StringBuilder sb = new StringBuilder();
        sb.append("dns1:" + a);
        sb.append(" dns2:" + a2);
        return sb.toString();
    }
}

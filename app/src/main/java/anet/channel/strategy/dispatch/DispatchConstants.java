package anet.channel.strategy.dispatch;

import android.text.TextUtils;
import anet.channel.GlobalAppRuntimeInfo;
import anet.channel.strategy.utils.C0209c;

public class DispatchConstants {
    public static String[] AMDC_SERVER_DOMAIN = {"amdc.m.taobao.com", "amdc.wapa.taobao.com", "amdc.taobao.net"};
    public static String[][] AMDC_SERVER_FIX_IP = {new String[]{C0209c.m279a(203119206064L), C0209c.m279a(203119211219L)}, new String[]{C0209c.m279a(106011052006L)}, null};
    public static final String ANDROID = "android";
    public static final String APPKEY = "appkey";
    public static final String APP_NAME = "appName";
    public static final String APP_VERSION = "appVersion";
    public static final String BSSID = "bssid";
    public static final String CARRIER = "carrier";
    public static final String CHANNEL = "channel";
    public static final String CONFIG_VERSION = "cv";
    public static final String DEVICEID = "deviceId";
    public static final String DOMAIN = "domain";
    public static final String HOSTS = "hosts";
    public static final String LATITUDE = "lat";
    public static final String LONGTITUDE = "lng";
    public static final String MACHINE = "machine";
    public static final String MNC = "mnc";
    public static final String NET_TYPE = "netType";
    public static final String OTHER = "other";
    public static final String PLATFORM = "platform";
    public static final String PLATFORM_VERSION = "platformVersion";
    public static final String PRE_IP = "preIp";
    public static final String SID = "sid";
    public static final String SIGN = "sign";
    public static final String SIGNTYPE = "signType";
    public static final String SIGN_SPLIT_SYMBOL = "&";
    public static final String STACK_TYPE = "stackType";
    public static final String TIMESTAMP = "t";
    public static final String VERSION = "v";
    public static final String VER_CODE = "5.0";
    public static String[] initHostArray = new String[0];
    public static final String serverPath = "/amdc/mobileDispatch";

    public static String getAmdcServerDomain() {
        return AMDC_SERVER_DOMAIN[GlobalAppRuntimeInfo.getEnv().getEnvMode()];
    }

    public static String[] getAmdcServerFixIp() {
        return AMDC_SERVER_FIX_IP[GlobalAppRuntimeInfo.getEnv().getEnvMode()];
    }

    public static boolean isAmdcServerDomain(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.equalsIgnoreCase(getAmdcServerDomain());
    }

    public static void setAmdcServerDomain(String[] strArr) {
        if (strArr == null || strArr.length < 2) {
            throw new IllegalArgumentException("domains is null or length < 2");
        }
        for (int i = 0; i < strArr.length; i++) {
            if (TextUtils.isEmpty(strArr[i])) {
                throw new IllegalArgumentException("domains[" + i + "] is null or empty");
            }
        }
        AMDC_SERVER_DOMAIN = strArr;
    }

    public static void setAmdcServerFixIp(String[][] strArr) {
        if (strArr == null || strArr.length < 2) {
            throw new IllegalArgumentException("ips is null or length < 2");
        }
        AMDC_SERVER_FIX_IP = strArr;
    }
}

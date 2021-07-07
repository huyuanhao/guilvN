package com.learnium.RNDeviceInfo.netInfo;

import android.content.Context;
import com.p118pd.sdk.AbstractC8974ooOOoO;
import com.rxhui.android_log_sdk.LogApplicationType;
import com.rxhui.android_log_sdk.LogCategory;
import com.rxhui.android_log_sdk.LogCollectorManager;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.Enumeration;
import java.util.HashMap;
import s.h.e.l.l.C;

public class NetInfoManager implements AbstractC8974ooOOoO {
    public static final String TAG = "NetInfoManager";
    public static NetInfoManager instance;
    public String area = "";
    public String carrier = "";
    public String country = "";
    public String ipAddress = "";
    public String ipType = "";

    static {
        C.i(16777257);
    }

    public static NetInfoManager getInstance() {
        if (instance == null) {
            synchronized (NetInfoManager.class) {
                if (instance == null) {
                    instance = new NetInfoManager();
                }
            }
        }
        return instance;
    }

    public native String getArea();

    public native String getCarrier(Context context);

    public native String getCountry();

    public native String getIpAddress();

    public native void getIpAddressAsync(AbstractC8974ooOOoO oooooo);

    public native String getIpType(Context context);

    public String getLocalIPAddress() {
        try {
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            while (networkInterfaces.hasMoreElements()) {
                Enumeration<InetAddress> inetAddresses = networkInterfaces.nextElement().getInetAddresses();
                while (true) {
                    if (inetAddresses.hasMoreElements()) {
                        InetAddress nextElement = inetAddresses.nextElement();
                        if (!nextElement.isLoopbackAddress() && (nextElement instanceof Inet4Address)) {
                            return nextElement.getHostAddress().toString();
                        }
                    }
                }
            }
            return "";
        } catch (SocketException e) {
            e.printStackTrace();
            return "";
        }
    }

    @Override // com.p118pd.sdk.AbstractC8974ooOOoO
    public native void onFailure(String str);

    @Override // com.p118pd.sdk.AbstractC8974ooOOoO
    public native void onStart();

    @Override // com.p118pd.sdk.AbstractC8974ooOOoO
    public native void onSuccess(String str);

    public native void registerObserver(Context context, NetStateChangeObserver netStateChangeObserver);

    public native void setArea(String str);

    public native void setCountry(String str);

    public native void setIpAddress(String str);

    public native void setIpType(String str);

    public void unRegisterObserver(Context context, NetStateChangeObserver netStateChangeObserver) {
        try {
            NetStateChangeReceiver.unRegisterObserver(netStateChangeObserver);
            NetStateChangeReceiver.unRegisterReceiver(context);
        } catch (Exception e) {
            e.printStackTrace();
            HashMap hashMap = new HashMap();
            hashMap.put("desc", "网络监听移除异常");
            hashMap.put("exception", e.getLocalizedMessage() + "");
            LogCollectorManager.sharedInstance().recordWarn(LogCategory.APPLICATION, LogApplicationType.EXCEPTION.getValue(), hashMap);
        }
    }
}

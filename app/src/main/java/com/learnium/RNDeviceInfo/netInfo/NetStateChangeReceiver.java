package com.learnium.RNDeviceInfo.netInfo;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.rxhui.android_log_sdk.LogApplicationType;
import com.rxhui.android_log_sdk.LogCategory;
import com.rxhui.android_log_sdk.LogCollectorManager;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class NetStateChangeReceiver extends BroadcastReceiver {
    public List<NetStateChangeObserver> mObservers = new ArrayList();
    public NetworkType mType = null;

    public static class InstanceHolder {
        public static final NetStateChangeReceiver INSTANCE = new NetStateChangeReceiver();
    }

    private void notifyObservers(NetworkType networkType) {
        if (this.mType != networkType) {
            HashMap hashMap = new HashMap();
            NetworkType networkType2 = this.mType;
            if (networkType2 == null) {
                networkType2 = NetworkType.NETWORK_UNKNOWN;
            }
            hashMap.put("oldNetType", networkType2.toString());
            hashMap.put("newNetType", networkType.toString());
            hashMap.put("desc", "网络变化状态监听");
            LogCollectorManager.sharedInstance().recordInfo(LogCategory.APPLICATION, LogApplicationType.NETWORK_CHANGE.getValue(), hashMap);
            this.mType = networkType;
            if (networkType == NetworkType.NETWORK_NO) {
                for (NetStateChangeObserver netStateChangeObserver : this.mObservers) {
                    netStateChangeObserver.onNetDisconnected();
                }
                return;
            }
            for (NetStateChangeObserver netStateChangeObserver2 : this.mObservers) {
                netStateChangeObserver2.onNetConnected(networkType);
            }
        }
    }

    public static void registerObserver(NetStateChangeObserver netStateChangeObserver) {
        if (netStateChangeObserver != null && !InstanceHolder.INSTANCE.mObservers.contains(netStateChangeObserver)) {
            InstanceHolder.INSTANCE.mObservers.add(netStateChangeObserver);
        }
    }

    public static void registerReceiver(Context context) {
        context.registerReceiver(InstanceHolder.INSTANCE, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
    }

    public static void unRegisterObserver(NetStateChangeObserver netStateChangeObserver) {
        if (netStateChangeObserver != null && InstanceHolder.INSTANCE.mObservers != null) {
            InstanceHolder.INSTANCE.mObservers.remove(netStateChangeObserver);
        }
    }

    public static void unRegisterReceiver(Context context) {
        context.unregisterReceiver(InstanceHolder.INSTANCE);
    }

    public void onReceive(Context context, Intent intent) {
        if ("android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
            notifyObservers(NetworkUtil.getNetworkType(context));
        }
    }
}

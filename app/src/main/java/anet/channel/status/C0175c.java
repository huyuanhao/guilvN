package anet.channel.status;

import android.net.ConnectivityManager;
import android.net.LinkProperties;
import android.net.Network;
import anet.channel.util.ALog;
import java.util.ArrayList;

/* renamed from: anet.channel.status.c */
public final class C0175c extends ConnectivityManager.NetworkCallback {
    public void onAvailable(Network network) {
        super.onAvailable(network);
        ALog.m290i("awcn.NetworkStatusMonitor", "network onAvailable", null, new Object[0]);
        C0174b.f309b = true;
    }

    public void onLinkPropertiesChanged(Network network, LinkProperties linkProperties) {
        super.onLinkPropertiesChanged(network, linkProperties);
        C0174b.f319l = new ArrayList(linkProperties.getDnsServers());
    }

    public void onLost(Network network) {
        super.onLost(network);
        ALog.m290i("awcn.NetworkStatusMonitor", "network onLost", null, new Object[0]);
        C0174b.f309b = false;
    }
}

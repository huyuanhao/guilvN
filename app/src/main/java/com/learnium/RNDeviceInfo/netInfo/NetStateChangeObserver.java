package com.learnium.RNDeviceInfo.netInfo;

public interface NetStateChangeObserver {
    void onNetConnected(NetworkType networkType);

    void onNetDisconnected();
}

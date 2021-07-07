package com.p118pd.sdk;

import anet.channel.bytes.ByteArray;
import anetwork.channel.aidl.DefaultFinishEvent;
import java.util.List;
import java.util.Map;

/* renamed from: com.pd.sdk.o0OO0O0  reason: case insensitive filesystem */
public interface AbstractC7369o0OO0O0 {
    void OooO00o(int i, int i2, ByteArray byteArray);

    void OooO00o(DefaultFinishEvent defaultFinishEvent);

    void onResponseCode(int i, Map<String, List<String>> map);
}

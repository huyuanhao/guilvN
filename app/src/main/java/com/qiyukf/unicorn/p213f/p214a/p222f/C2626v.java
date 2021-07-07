package com.qiyukf.unicorn.p213f.p214a.p222f;

import android.annotation.TargetApi;
import com.qiyukf.unicorn.p213f.p214a.AbstractC2597e;
import com.qiyukf.unicorn.p213f.p214a.p218b.AbstractC2548a;
import com.qiyukf.unicorn.p213f.p214a.p218b.AbstractC2549b;
import com.taobao.accs.common.Constants;
import java.net.NetworkInterface;
import java.util.Collections;

@AbstractC2549b(mo35941a = 208)
/* renamed from: com.qiyukf.unicorn.f.a.f.v */
public final class C2626v extends AbstractC2597e {
    @AbstractC2548a(mo35940a = "appKey")

    /* renamed from: a */
    public String f5385a;
    @AbstractC2548a(mo35940a = "deviceId")

    /* renamed from: b */
    public String f5386b;
    @AbstractC2548a(mo35940a = "source")

    /* renamed from: c */
    public int f5387c;
    @AbstractC2548a(mo35940a = "imei")

    /* renamed from: d */
    public String f5388d;
    @AbstractC2548a(mo35940a = "mac")

    /* renamed from: e */
    public String f5389e;
    @AbstractC2548a(mo35940a = "androidId")

    /* renamed from: f */
    public String f5390f;
    @AbstractC2548a(mo35940a = "brand")

    /* renamed from: g */
    public String f5391g;
    @AbstractC2548a(mo35940a = Constants.KEY_MODEL)

    /* renamed from: h */
    public String f5392h;
    @AbstractC2548a(mo35940a = "os")

    /* renamed from: i */
    public String f5393i;
    @AbstractC2548a(mo35940a = "timestamp")

    /* renamed from: j */
    public long f5394j;

    public C2626v() {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0039, code lost:
        if (android.text.TextUtils.isEmpty(r0) == false) goto L_0x003e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C2626v(android.content.Context r3) {
        /*
        // Method dump skipped, instructions count: 103
        */
        throw new UnsupportedOperationException("Method not decompiled: com.qiyukf.unicorn.p213f.p214a.p222f.C2626v.<init>(android.content.Context):void");
    }

    @TargetApi(9)
    /* renamed from: a */
    public static String m5973a() {
        try {
            for (NetworkInterface networkInterface : Collections.list(NetworkInterface.getNetworkInterfaces())) {
                if (networkInterface.getName().equalsIgnoreCase("wlan0")) {
                    byte[] hardwareAddress = networkInterface.getHardwareAddress();
                    if (hardwareAddress == null) {
                        return "";
                    }
                    StringBuilder sb = new StringBuilder();
                    int length = hardwareAddress.length;
                    for (int i = 0; i < length; i++) {
                        sb.append(String.format("%02X:", Byte.valueOf(hardwareAddress[i])));
                    }
                    if (sb.length() > 0) {
                        sb.deleteCharAt(sb.length() - 1);
                    }
                    return sb.toString();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "";
    }
}

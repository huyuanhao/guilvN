package com.qiyukf.unicorn.api.event;

import com.qiyukf.basesdk.p119a.C1709a;
import com.qiyukf.unicorn.C2452d;

public class UnicornEventRegistered {
    public static void registerTypeForEvent(int i, UnicornEventBase unicornEventBase) {
        try {
            if (C2452d.m5366b() && C2452d.m5373e().sdkEvents != null) {
                C2452d.m5373e().sdkEvents.eventMap.append(i, unicornEventBase);
            }
        } catch (IllegalStateException e) {
            C1709a.m3011a("regist event is not init", e.toString());
        }
    }
}

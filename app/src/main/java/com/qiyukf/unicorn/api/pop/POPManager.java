package com.qiyukf.unicorn.api.pop;

import com.qiyukf.nimlib.sdk.NIMClient;
import com.qiyukf.nimlib.sdk.msg.MsgService;
import com.qiyukf.nimlib.sdk.msg.constant.SessionTypeEnum;
import com.qiyukf.unicorn.C2438c;
import com.qiyukf.unicorn.C2452d;
import com.qiyukf.unicorn.api.msg.UnicornMessage;
import com.qiyukf.unicorn.p232k.C2713k;
import java.util.ArrayList;
import java.util.List;

public class POPManager {
    public static void addOnSessionListChangedListener(final OnSessionListChangedListener onSessionListChangedListener, final boolean z) {
        C2713k.m6273a(new Runnable() {
            /* class com.qiyukf.unicorn.api.pop.POPManager.RunnableC24292 */

            public final void run() {
                C2438c h = C2452d.m5376h();
                if (h != null) {
                    h.mo35656a(onSessionListChangedListener, z);
                }
            }
        });
    }

    public static void clearUnreadCount(final String str) {
        C2713k.m6273a(new Runnable() {
            /* class com.qiyukf.unicorn.api.pop.POPManager.RunnableC24303 */

            public final void run() {
                if (C2452d.m5376h() != null) {
                    ((MsgService) NIMClient.getService(MsgService.class)).clearUnreadCount(str, SessionTypeEnum.Ysf);
                }
            }
        });
    }

    public static void deleteSession(final String str, final boolean z) {
        C2713k.m6273a(new Runnable() {
            /* class com.qiyukf.unicorn.api.pop.POPManager.RunnableC24281 */

            public final void run() {
                C2438c h = C2452d.m5376h();
                if (h != null) {
                    h.mo35659a(str, z);
                }
            }
        });
    }

    public static List<Session> getSessionList() {
        C2438c h = C2452d.m5376h();
        return h == null ? new ArrayList() : h.mo35664e();
    }

    public static ShopInfo getShopInfo(String str) {
        if (C2452d.m5376h() == null) {
            return null;
        }
        return C2452d.m5375g().mo36346b().getUserInfo(str);
    }

    public static UnicornMessage queryLastMessage(String str) {
        if (C2452d.m5376h() != null) {
            return ((MsgService) NIMClient.getService(MsgService.class)).queryLastMessage(str, SessionTypeEnum.Ysf);
        }
        return null;
    }
}

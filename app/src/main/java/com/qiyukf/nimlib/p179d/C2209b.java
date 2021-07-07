package com.qiyukf.nimlib.p179d;

import com.qiyukf.nimlib.p195h.C2313a;
import com.qiyukf.nimlib.p195h.C2326h;
import com.qiyukf.nimlib.sdk.msg.MsgServiceObserve;
import com.qiyukf.nimlib.sdk.msg.SystemMessageObserver;
import com.qiyukf.nimlib.sdk.msg.model.AttachmentProgress;
import com.qiyukf.nimlib.sdk.msg.model.CustomNotification;
import com.qiyukf.nimlib.sdk.msg.model.IMMessage;
import com.qiyukf.nimlib.sdk.msg.model.RecentContact;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.qiyukf.nimlib.d.b */
public final class C2209b {
    /* renamed from: a */
    public static void m4596a(int i) {
        C2206a.m4590a(SystemMessageObserver.class.getSimpleName() + "/observeUnreadCountChange", Integer.valueOf(i));
    }

    /* renamed from: a */
    public static void m4597a(CustomNotification customNotification) {
        C2206a.m4590a(MsgServiceObserve.class.getSimpleName() + "/observeCustomNotification", customNotification);
    }

    /* renamed from: a */
    public static void m4598a(IMMessage iMMessage) {
        C2206a.m4590a(MsgServiceObserve.class.getSimpleName() + "/observeMsgStatus", iMMessage);
    }

    /* renamed from: a */
    public static void m4599a(RecentContact recentContact) {
        if (recentContact != null) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(recentContact);
            C2206a.m4590a(MsgServiceObserve.class.getSimpleName() + "/observeRecentContact", arrayList);
        }
    }

    /* renamed from: a */
    public static void m4600a(String str, long j, long j2) {
        AttachmentProgress attachmentProgress = new AttachmentProgress(str, j, j2);
        C2206a.m4590a(MsgServiceObserve.class.getSimpleName() + "/observeAttachmentProgress", attachmentProgress);
    }

    /* renamed from: a */
    public static void m4601a(List<C2313a> list) {
        C2206a.m4590a(MsgServiceObserve.class.getSimpleName() + "/observeReceiveMessage", list);
    }

    /* renamed from: b */
    public static void m4602b(RecentContact recentContact) {
        C2206a.m4590a(MsgServiceObserve.class.getSimpleName() + "/observeRecentContactDeleted", recentContact);
    }

    /* renamed from: b */
    public static void m4603b(List<C2326h> list) {
        C2206a.m4590a(MsgServiceObserve.class.getSimpleName() + "/observeRecentContact", list);
    }
}

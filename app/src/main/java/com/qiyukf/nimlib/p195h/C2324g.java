package com.qiyukf.nimlib.p195h;

import android.content.Context;
import android.text.TextUtils;
import com.qiyukf.basesdk.p119a.C1709a;
import com.qiyukf.nimlib.C2180b;
import com.qiyukf.nimlib.sdk.msg.constant.MsgDirectionEnum;
import com.qiyukf.nimlib.sdk.msg.constant.SessionTypeEnum;
import com.qiyukf.nimlib.sdk.msg.model.IMMessage;
import com.qiyukf.unicorn.C2364R;
import com.qiyukf.unicorn.api.msg.MsgStatusEnum;
import com.qiyukf.unicorn.api.msg.MsgTypeEnum;
import com.qiyukf.unicorn.api.msg.attachment.MsgAttachment;
import com.qiyukf.unicorn.api.msg.attachment.ProductAttachment;

/* renamed from: com.qiyukf.nimlib.h.g */
public final class C2324g {

    /* renamed from: com.qiyukf.nimlib.h.g$1 */
    public static /* synthetic */ class C23251 {

        /* renamed from: a */
        public static final /* synthetic */ int[] f4653a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.qiyukf.nimlib.sdk.msg.constant.SessionTypeEnum[] r0 = com.qiyukf.nimlib.sdk.msg.constant.SessionTypeEnum.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.qiyukf.nimlib.p195h.C2324g.C23251.f4653a = r0
                com.qiyukf.nimlib.sdk.msg.constant.SessionTypeEnum r1 = com.qiyukf.nimlib.sdk.msg.constant.SessionTypeEnum.Team     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.qiyukf.nimlib.p195h.C2324g.C23251.f4653a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.qiyukf.nimlib.sdk.msg.constant.SessionTypeEnum r1 = com.qiyukf.nimlib.sdk.msg.constant.SessionTypeEnum.P2P     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = com.qiyukf.nimlib.p195h.C2324g.C23251.f4653a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.qiyukf.nimlib.sdk.msg.constant.SessionTypeEnum r1 = com.qiyukf.nimlib.sdk.msg.constant.SessionTypeEnum.Ysf     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.qiyukf.nimlib.p195h.C2324g.C23251.<clinit>():void");
        }
    }

    /* renamed from: a */
    public static int m5036a(SessionTypeEnum sessionTypeEnum) {
        int i = C23251.f4653a[sessionTypeEnum.ordinal()];
        if (i == 1) {
            return 101;
        }
        if (i == 2) {
            return 100;
        }
        if (i == 3) {
            return 102;
        }
        C1709a.m3011a("SYSMSG", "unknown session type to system msg type");
        return 100;
    }

    /* renamed from: a */
    public static C2326h m5037a(C2313a aVar) {
        return m5039a(aVar, aVar.getStatus(), 0);
    }

    /* renamed from: a */
    public static C2326h m5038a(C2313a aVar, int i) {
        return m5039a(aVar, aVar.getStatus(), i);
    }

    /* renamed from: a */
    public static C2326h m5039a(C2313a aVar, MsgStatusEnum msgStatusEnum, int i) {
        String sessionId = aVar.getSessionId();
        if (TextUtils.isEmpty(sessionId)) {
            return null;
        }
        C2326h hVar = new C2326h();
        hVar.mo35056a(aVar.getSessionId());
        hVar.mo35059b(aVar.getFromAccount());
        hVar.mo35060c(aVar.getUuid());
        hVar.mo35061d(m5042a((IMMessage) aVar));
        hVar.mo35053a(aVar.getSessionType());
        hVar.mo35052a(aVar.getTime());
        hVar.setMsgStatus(aVar.getStatus());
        hVar.mo35058b(aVar.mo35011b());
        boolean z = false;
        hVar.mo35062e(aVar.mo35005a(false));
        hVar.setMsgStatus(msgStatusEnum);
        C2326h a = C2323f.m5021a(sessionId, aVar.getSessionType());
        if (a != null) {
            if (aVar.getDirect() == MsgDirectionEnum.In) {
                z = true;
            }
            if (z) {
                hVar.mo35051a(i + a.getUnreadCount());
            }
            hVar.setTag(a.getTag());
        } else {
            hVar.mo35051a(i);
        }
        C2323f.m5030a(hVar);
        return hVar;
    }

    /* renamed from: a */
    public static C2326h m5040a(String str, SessionTypeEnum sessionTypeEnum) {
        C2326h hVar = new C2326h();
        hVar.mo35056a(str);
        hVar.mo35060c("");
        hVar.mo35061d("");
        hVar.mo35053a(sessionTypeEnum);
        hVar.mo35052a(0L);
        hVar.setMsgStatus(MsgStatusEnum.success);
        hVar.mo35062e("");
        hVar.mo35051a(0);
        C2323f.m5030a(hVar);
        return hVar;
    }

    /* renamed from: a */
    public static MsgTypeEnum m5041a(int i) {
        MsgTypeEnum[] values = MsgTypeEnum.values();
        for (MsgTypeEnum msgTypeEnum : values) {
            if (msgTypeEnum.getValue() == i) {
                return msgTypeEnum;
            }
        }
        return MsgTypeEnum.undef;
    }

    /* renamed from: a */
    public static String m5042a(IMMessage iMMessage) {
        int i;
        if (iMMessage.getMsgType() == MsgTypeEnum.text || iMMessage.getMsgType() == MsgTypeEnum.notification || iMMessage.getMsgType() == MsgTypeEnum.tips) {
            return iMMessage.getContent();
        }
        Context a = C2180b.m4471a();
        MsgAttachment attachment = iMMessage.getAttachment();
        if (attachment == null || a == null) {
            return iMMessage.getContent();
        }
        String content = attachment.getContent(a);
        if (TextUtils.isEmpty(content)) {
            i = C2364R.string.ysf_msg_notify_custom_default;
        } else if (!(attachment instanceof ProductAttachment)) {
            return content;
        } else {
            i = C2364R.string.ysf_msg_notify_custom_send;
        }
        return a.getString(i);
    }

    /* renamed from: a */
    public static String m5043a(String str, int i) {
        return i + "_" + str;
    }

    /* renamed from: b */
    public static C2326h m5044b(C2313a aVar) {
        return m5039a(aVar, MsgStatusEnum.fail, 0);
    }
}

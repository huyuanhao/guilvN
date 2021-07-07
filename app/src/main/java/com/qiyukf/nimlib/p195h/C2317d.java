package com.qiyukf.nimlib.p195h;

import android.text.TextUtils;
import com.qiyukf.basesdk.p119a.C1709a;
import com.qiyukf.basesdk.p120b.p121a.p123b.AbstractC1743c;
import com.qiyukf.basesdk.p120b.p121a.p123b.C1735a;
import com.qiyukf.basesdk.p138c.p142c.C1852c;
import com.qiyukf.nimlib.C2180b;
import com.qiyukf.nimlib.p155a.C2130c;
import com.qiyukf.nimlib.p155a.p162c.p166d.C2143d;
import com.qiyukf.nimlib.p155a.p162c.p166d.C2144e;
import com.qiyukf.nimlib.p155a.p162c.p167e.C2146b;
import com.qiyukf.nimlib.p155a.p175f.C2175a;
import com.qiyukf.nimlib.p179d.C2206a;
import com.qiyukf.nimlib.p179d.C2209b;
import com.qiyukf.nimlib.p179d.C2218i;
import com.qiyukf.nimlib.p183g.C2306e;
import com.qiyukf.nimlib.p183g.p191c.p193b.C2293b;
import com.qiyukf.nimlib.p195h.C2324g;
import com.qiyukf.nimlib.sdk.NIMClient;
import com.qiyukf.nimlib.sdk.msg.MsgService;
import com.qiyukf.nimlib.sdk.msg.constant.AttachStatusEnum;
import com.qiyukf.nimlib.sdk.msg.constant.MsgDirectionEnum;
import com.qiyukf.nimlib.sdk.msg.constant.SessionTypeEnum;
import com.qiyukf.nimlib.sdk.msg.model.IMMessage;
import com.qiyukf.unicorn.api.RequestCallback;
import com.qiyukf.unicorn.api.msg.MsgStatusEnum;
import com.qiyukf.unicorn.api.msg.MsgTypeEnum;
import com.qiyukf.unicorn.api.msg.attachment.AudioAttachment;
import com.qiyukf.unicorn.api.msg.attachment.FileAttachment;

/* renamed from: com.qiyukf.nimlib.h.d */
public final class C2317d {
    /* renamed from: a */
    public static C1735a.RunnableC1738c m4997a(final FileAttachment fileAttachment, final C2218i iVar) {
        m5002a(fileAttachment);
        return C1735a.m3113a().mo33910a(fileAttachment.getPath(), fileAttachment.getMd5(), iVar, new AbstractC1743c<C2218i>() {
            /* class com.qiyukf.nimlib.p195h.C2317d.C23181 */

            /* access modifiers changed from: private */
            /* renamed from: b */
            public void mo33926a(int i) {
                iVar.mo34825a(i);
                C2206a.m4593c(iVar);
            }

            @Override // com.qiyukf.basesdk.p120b.p121a.p123b.AbstractC1743c
            /* renamed from: a */
            public final /* synthetic */ void mo33925a() {
                mo33926a(400);
            }

            @Override // com.qiyukf.basesdk.p120b.p121a.p123b.AbstractC1743c
            /* renamed from: a */
            public final /* synthetic */ void mo33927a(long j, long j2) {
                C2209b.m4600a(fileAttachment.getPath(), j, j2);
            }

            @Override // com.qiyukf.basesdk.p120b.p121a.p123b.AbstractC1743c
            /* renamed from: a */
            public final /* synthetic */ void mo33928a(String str) {
                fileAttachment.setUrl(str);
                iVar.mo34830b(fileAttachment);
                C2206a.m4593c(iVar);
            }
        });
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x00b7  */
    /* JADX WARNING: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m4999a(final com.qiyukf.nimlib.p195h.C2313a r7, final boolean r8, final com.qiyukf.nimlib.p179d.C2218i r9, boolean r10) {
        /*
        // Method dump skipped, instructions count: 202
        */
        throw new UnsupportedOperationException("Method not decompiled: com.qiyukf.nimlib.p195h.C2317d.m4999a(com.qiyukf.nimlib.h.a, boolean, com.qiyukf.nimlib.d.i, boolean):void");
    }

    /* renamed from: a */
    public static /* synthetic */ void m5000a(IMMessage iMMessage) {
        iMMessage.setStatus(MsgStatusEnum.fail);
        iMMessage.setAttachStatus(AttachStatusEnum.fail);
        C2209b.m4598a(iMMessage);
        C2314b.m4972a().mo35041b(iMMessage.getUuid());
    }

    /* renamed from: a */
    public static void m5002a(FileAttachment fileAttachment) {
        if (TextUtils.isEmpty(fileAttachment.getMd5())) {
            fileAttachment.setMd5(C1852c.m3513b(fileAttachment.getPath()));
        }
    }

    /* renamed from: b */
    public static void m5003b(C2313a aVar, boolean z, C2218i iVar) {
        C2144e eVar;
        int i;
        if (aVar.getSessionType() == SessionTypeEnum.P2P) {
            eVar = new C2144e();
        } else if (aVar.getSessionType() == SessionTypeEnum.Ysf) {
            eVar = new C2146b();
        } else {
            throw new IllegalArgumentException("support Ysf message only");
        }
        C2293b bVar = new C2293b();
        int i2 = C2324g.C23251.f4653a[aVar.getSessionType().ordinal()];
        if (i2 != 1) {
            if (!(i2 == 2 || i2 == 3)) {
                C1709a.m3011a("SYSMSG", "unknown session type to system msg type");
            }
            i = 0;
        } else {
            i = 1;
        }
        bVar.mo34954a(0, i);
        bVar.mo34955a(1, aVar.getSessionId());
        bVar.mo34955a(9, aVar.getContent());
        bVar.mo34954a(8, aVar.getMsgType().getValue());
        bVar.mo34955a(11, aVar.getUuid());
        String a = aVar.mo35005a(true);
        if (!TextUtils.isEmpty(a)) {
            bVar.mo34955a(10, a);
        }
        if (z) {
            bVar.mo34954a(13, 1);
        }
        if (aVar.getSessionId().equals(C2180b.m4477b())) {
            bVar.mo34955a(5, C2306e.m4923a());
        }
        if (aVar.mo35016d() != null) {
            if (!aVar.mo35016d().enableHistory) {
                bVar.mo34954a(100, 0);
            }
            if (!aVar.mo35016d().enableRoaming) {
                bVar.mo34954a(101, 0);
            }
            if (!aVar.mo35016d().enableSelfSync) {
                bVar.mo34954a(102, 0);
            }
        }
        eVar.mo34668a(iVar);
        eVar.mo34686a(bVar);
        C2130c.m4323a().mo34663a(new C2143d(eVar, C2175a.f4336b));
    }

    /* renamed from: b */
    public static void m5004b(final AudioAttachment audioAttachment, final C2313a aVar, final C2218i iVar) {
        ((MsgService) NIMClient.getService(MsgService.class)).transVoiceToText(audioAttachment.getUrl(), audioAttachment.getPath(), audioAttachment.getDuration()).setCallback(new RequestCallback() {
            /* class com.qiyukf.nimlib.p195h.C2317d.C23203 */

            @Override // com.qiyukf.unicorn.api.RequestCallback
            public final void onException(Throwable th) {
                C2317d.m5000a(aVar);
            }

            @Override // com.qiyukf.unicorn.api.RequestCallback
            public final void onFailed(int i) {
                C2317d.m5000a(aVar);
            }

            @Override // com.qiyukf.unicorn.api.RequestCallback
            public final void onSuccess(Object obj) {
                audioAttachment.setText(obj.toString());
                aVar.setAttachment(audioAttachment);
                ((MsgService) NIMClient.getService(MsgService.class)).updateMessage(aVar, true);
                C2313a aVar = new C2313a();
                aVar.mo35010a(aVar.getUuid());
                aVar.mo35013b(aVar.getSessionId());
                aVar.setFromAccount(C2180b.m4477b());
                aVar.setDirect(MsgDirectionEnum.Out);
                aVar.setStatus(MsgStatusEnum.sending);
                aVar.mo35008a(aVar.getSessionType());
                aVar.setTime(aVar.getTime());
                aVar.mo35007a(aVar.mo35004a());
                aVar.mo35006a(MsgTypeEnum.text.getValue());
                aVar.setContent(obj.toString());
                C2317d.m5003b(aVar, false, iVar);
            }
        });
    }
}

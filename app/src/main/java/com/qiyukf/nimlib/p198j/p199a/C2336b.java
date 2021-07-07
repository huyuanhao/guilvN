package com.qiyukf.nimlib.p198j.p199a;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.qiyukf.nimlib.sdk.AbortableFuture;
import com.qiyukf.nimlib.sdk.NIMClient;
import com.qiyukf.nimlib.sdk.Observer;
import com.qiyukf.nimlib.sdk.msg.MsgService;
import com.qiyukf.nimlib.sdk.msg.MsgServiceObserve;
import com.qiyukf.nimlib.sdk.msg.constant.AttachStatusEnum;
import com.qiyukf.nimlib.sdk.msg.model.AttachmentProgress;
import com.qiyukf.nimlib.sdk.msg.model.IMMessage;
import com.qiyukf.unicorn.api.msg.attachment.FileAttachment;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.qiyukf.nimlib.j.a.b */
public final class C2336b {

    /* renamed from: a */
    public static C2336b f4684a;

    /* renamed from: b */
    public Map<String, AbortableFuture<Void>> f4685b = new HashMap();

    /* renamed from: c */
    public Map<String, AttachmentProgress> f4686c = new HashMap();

    /* renamed from: d */
    public AbstractC2339a f4687d;

    /* renamed from: e */
    public Observer<IMMessage> f4688e = new Observer<IMMessage>() {
        /* class com.qiyukf.nimlib.p198j.p199a.C2336b.C23371 */

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.qiyukf.nimlib.sdk.Observer
        public final /* synthetic */ void onEvent(IMMessage iMMessage) {
            IMMessage iMMessage2 = iMMessage;
            if (C2336b.this.f4685b.containsKey(iMMessage2.getUuid()) && C2336b.this.f4687d != null) {
                if (iMMessage2.getAttachStatus() == AttachStatusEnum.transferred && C2336b.m5077d(iMMessage2)) {
                    C2336b.this.f4687d.onSuccess(iMMessage2);
                    C2336b.m5074a(C2336b.this, iMMessage2);
                } else if (iMMessage2.getAttachStatus() == AttachStatusEnum.fail) {
                    C2336b.this.f4687d.onFail(iMMessage2);
                    C2336b.m5074a(C2336b.this, iMMessage2);
                }
            }
        }
    };

    /* renamed from: f */
    public Observer<AttachmentProgress> f4689f = new Observer<AttachmentProgress>() {
        /* class com.qiyukf.nimlib.p198j.p199a.C2336b.C23382 */

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.qiyukf.nimlib.sdk.Observer
        public final /* synthetic */ void onEvent(AttachmentProgress attachmentProgress) {
            AttachmentProgress attachmentProgress2 = attachmentProgress;
            if (C2336b.this.f4685b.containsKey(attachmentProgress2.getUuid())) {
                C2336b.this.f4686c.put(attachmentProgress2.getUuid(), attachmentProgress2);
                if (C2336b.this.f4687d != null) {
                    C2336b.this.f4687d.onProgress(attachmentProgress2);
                }
            }
        }
    };

    /* renamed from: com.qiyukf.nimlib.j.a.b$a */
    public interface AbstractC2339a {
        void onFail(IMMessage iMMessage);

        void onProgress(AttachmentProgress attachmentProgress);

        void onSuccess(IMMessage iMMessage);
    }

    public C2336b() {
        ((MsgServiceObserve) NIMClient.getService(MsgServiceObserve.class)).observeMsgStatus(this.f4688e, true);
        ((MsgServiceObserve) NIMClient.getService(MsgServiceObserve.class)).observeAttachmentProgress(this.f4689f, true);
    }

    /* renamed from: a */
    public static C2336b m5072a() {
        if (f4684a == null) {
            f4684a = new C2336b();
        }
        return f4684a;
    }

    /* renamed from: a */
    public static /* synthetic */ void m5074a(C2336b bVar, IMMessage iMMessage) {
        bVar.f4685b.remove(iMMessage.getUuid());
        bVar.f4686c.remove(iMMessage.getUuid());
    }

    /* renamed from: d */
    public static boolean m5077d(@NonNull IMMessage iMMessage) {
        String path = ((FileAttachment) iMMessage.getAttachment()).getPath();
        if (!TextUtils.isEmpty(path)) {
            return new File(path).exists();
        }
        return false;
    }

    /* renamed from: e */
    public static boolean m5078e(@NonNull IMMessage iMMessage) {
        long expire = ((FileAttachment) iMMessage.getAttachment()).getExpire();
        if (expire <= 0) {
            expire = iMMessage.getTime() + 604800000;
        }
        return System.currentTimeMillis() > expire;
    }

    /* renamed from: a */
    public final AttachmentProgress mo35082a(IMMessage iMMessage) {
        return this.f4686c.get(iMMessage.getUuid());
    }

    /* renamed from: a */
    public final void mo35083a(AbstractC2339a aVar) {
        this.f4687d = aVar;
    }

    /* renamed from: b */
    public final void mo35084b(IMMessage iMMessage) {
        this.f4685b.put(iMMessage.getUuid(), ((MsgService) NIMClient.getService(MsgService.class)).downloadAttachment(iMMessage, false));
    }

    /* renamed from: c */
    public final void mo35085c(IMMessage iMMessage) {
        AbortableFuture<Void> remove = this.f4685b.remove(iMMessage.getUuid());
        this.f4686c.remove(iMMessage.getUuid());
        if (remove != null) {
            remove.abort();
        }
    }
}

package com.qiyukf.nim.uikit.session.p152b;

import android.content.Context;
import com.qiyukf.basesdk.p138c.p143d.C1865f;
import com.qiyukf.nim.uikit.C1877b;
import com.qiyukf.nim.uikit.common.media.p146a.AbstractC1886a;
import com.qiyukf.nim.uikit.common.media.p146a.AbstractC1891b;
import com.qiyukf.nim.uikit.common.p145a.C1881d;
import com.qiyukf.nimlib.p198j.p201c.C2349d;
import com.qiyukf.nimlib.sdk.NIMClient;
import com.qiyukf.nimlib.sdk.msg.MsgService;
import com.qiyukf.nimlib.sdk.msg.constant.AttachStatusEnum;
import com.qiyukf.nimlib.sdk.msg.constant.MsgDirectionEnum;
import com.qiyukf.nimlib.sdk.msg.model.IMMessage;
import com.qiyukf.unicorn.C2364R;
import com.qiyukf.unicorn.api.msg.MsgStatusEnum;
import com.qiyukf.unicorn.api.msg.MsgTypeEnum;
import com.qiyukf.unicorn.api.msg.attachment.AudioAttachment;
import java.util.List;

/* renamed from: com.qiyukf.nim.uikit.session.b.b */
public class C1965b extends AbstractC1886a<IMMessage> {

    /* renamed from: j */
    public static C1965b f3836j;

    /* renamed from: k */
    public boolean f3837k = false;

    /* renamed from: l */
    public C1881d f3838l = null;

    /* renamed from: m */
    public IMMessage f3839m = null;

    public C1965b(Context context) {
        super(context);
    }

    /* renamed from: a */
    private void m3872a(IMMessage iMMessage, int i, boolean z, long j) {
        if (!C2349d.m5127a()) {
            C1865f.m3559b(C2364R.string.ysf_audio_record_sdcard_not_exist_error);
        } else if (mo34190a(new C1964a(iMMessage), i, z, j) && m3874a(iMMessage)) {
            iMMessage.setStatus(MsgStatusEnum.read);
            ((MsgService) NIMClient.getService(MsgService.class)).updateIMMessageStatus(iMMessage, false);
        }
    }

    /* renamed from: a */
    public static /* synthetic */ boolean m3873a(C1965b bVar, C1881d dVar, IMMessage iMMessage) {
        List a = dVar.mo34141a();
        int i = 0;
        while (true) {
            if (i >= a.size()) {
                i = 0;
                break;
            } else if (((IMMessage) a.get(i)).equals(iMMessage)) {
                break;
            } else {
                i++;
            }
        }
        while (true) {
            if (i >= a.size()) {
                i = -1;
                break;
            } else if (m3874a((IMMessage) a.get(i))) {
                break;
            } else {
                i++;
            }
        }
        if (i != -1) {
            IMMessage iMMessage2 = (IMMessage) a.get(i);
            AudioAttachment audioAttachment = (AudioAttachment) iMMessage2.getAttachment();
            if (!(f3836j == null || audioAttachment == null)) {
                if (iMMessage2.getAttachStatus() == AttachStatusEnum.transferred) {
                    MsgStatusEnum status = iMMessage2.getStatus();
                    MsgStatusEnum msgStatusEnum = MsgStatusEnum.read;
                    if (status != msgStatusEnum) {
                        iMMessage2.setStatus(msgStatusEnum);
                        ((MsgService) NIMClient.getService(MsgService.class)).updateIMMessageStatus(iMMessage2, false);
                    }
                    f3836j.m3872a(iMMessage2, bVar.mo34191b(), false, 0L);
                    bVar.f3839m = iMMessage2;
                    dVar.notifyDataSetChanged();
                    return true;
                }
            }
            return false;
        }
        bVar.mo34393a(false, (C1881d) null, (IMMessage) null);
        return false;
    }

    /* renamed from: a */
    public static boolean m3874a(IMMessage iMMessage) {
        return iMMessage.getMsgType() == MsgTypeEnum.audio && iMMessage.getDirect() == MsgDirectionEnum.In && iMMessage.getAttachStatus() == AttachStatusEnum.transferred && iMMessage.getStatus() != MsgStatusEnum.read;
    }

    /* renamed from: i */
    public static C1965b m3881i() {
        if (f3836j == null) {
            synchronized (C1965b.class) {
                if (f3836j == null) {
                    f3836j = new C1965b(C1877b.m3578a());
                }
            }
        }
        return f3836j;
    }

    @Override // com.qiyukf.nim.uikit.common.media.p146a.AbstractC1886a
    /* renamed from: a */
    public final void mo34189a(AbstractC1891b bVar) {
        this.f3480d.setOnPlayListener(new AbstractC1886a<IMMessage>.C1890b(this.f3480d, bVar) {
            /* class com.qiyukf.nim.uikit.session.p152b.C1965b.C19661 */

            @Override // com.qiyukf.nimlib.sdk.media.player.OnPlayListener, com.qiyukf.nim.uikit.common.media.p146a.AbstractC1886a.C1890b
            public final void onCompletion() {
                if (mo34204a()) {
                    C1965b.this.mo34194c();
                    boolean z = false;
                    if (!(!C1965b.this.f3837k || C1965b.this.f3838l == null || C1965b.this.f3839m == null)) {
                        C1965b bVar = C1965b.this;
                        z = C1965b.m3873a(bVar, bVar.f3838l, C1965b.this.f3839m);
                    }
                    if (!z) {
                        C1965b bVar2 = C1965b.this;
                        bVar2.mo34193b((C1965b) bVar2.f3481e);
                        C1965b.this.mo34187a();
                    }
                }
            }

            /*  JADX ERROR: IndexOutOfBoundsException in pass: MethodInvokeVisitor
                java.lang.IndexOutOfBoundsException: Index: 1, Size: 1
                	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
                	at java.util.ArrayList.get(ArrayList.java:435)
                	at jadx.core.dex.visitors.MethodInvokeVisitor.replaceUnknownTypes(MethodInvokeVisitor.java:299)
                	at jadx.core.dex.visitors.MethodInvokeVisitor.searchCastTypes(MethodInvokeVisitor.java:258)
                	at jadx.core.dex.visitors.MethodInvokeVisitor.processOverloaded(MethodInvokeVisitor.java:127)
                	at jadx.core.dex.visitors.MethodInvokeVisitor.processInvoke(MethodInvokeVisitor.java:102)
                	at jadx.core.dex.visitors.MethodInvokeVisitor.processInsn(MethodInvokeVisitor.java:73)
                	at jadx.core.dex.visitors.MethodInvokeVisitor.visit(MethodInvokeVisitor.java:66)
                */
            @Override // com.qiyukf.nimlib.sdk.media.player.OnPlayListener, com.qiyukf.nim.uikit.common.media.p146a.AbstractC1886a.C1890b
            public final void onError(java.lang.String r2) {
                /*
                    r1 = this;
                    boolean r0 = r1.mo34204a()
                    if (r0 != 0) goto L_0x0007
                    return
                L_0x0007:
                    super.onError(r2)
                    com.qiyukf.nim.uikit.session.b.b r2 = com.qiyukf.nim.uikit.session.p152b.C1965b.this
                    com.qiyukf.nim.uikit.session.p152b.C1965b.m3870a(r2)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.qiyukf.nim.uikit.session.p152b.C1965b.C19661.onError(java.lang.String):void");
            }

            /*  JADX ERROR: IndexOutOfBoundsException in pass: MethodInvokeVisitor
                java.lang.IndexOutOfBoundsException: Index: 1, Size: 1
                	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
                	at java.util.ArrayList.get(ArrayList.java:435)
                	at jadx.core.dex.visitors.MethodInvokeVisitor.replaceUnknownTypes(MethodInvokeVisitor.java:299)
                	at jadx.core.dex.visitors.MethodInvokeVisitor.searchCastTypes(MethodInvokeVisitor.java:258)
                	at jadx.core.dex.visitors.MethodInvokeVisitor.processOverloaded(MethodInvokeVisitor.java:127)
                	at jadx.core.dex.visitors.MethodInvokeVisitor.processInvoke(MethodInvokeVisitor.java:102)
                	at jadx.core.dex.visitors.MethodInvokeVisitor.processInsn(MethodInvokeVisitor.java:73)
                	at jadx.core.dex.visitors.MethodInvokeVisitor.visit(MethodInvokeVisitor.java:66)
                */
            @Override // com.qiyukf.nimlib.sdk.media.player.OnPlayListener, com.qiyukf.nim.uikit.common.media.p146a.AbstractC1886a.C1890b
            public final void onInterrupt() {
                /*
                    r1 = this;
                    boolean r0 = r1.mo34204a()
                    if (r0 != 0) goto L_0x0007
                    return
                L_0x0007:
                    super.onInterrupt()
                    com.qiyukf.nim.uikit.session.b.b r0 = com.qiyukf.nim.uikit.session.p152b.C1965b.this
                    com.qiyukf.nim.uikit.session.p152b.C1965b.m3870a(r0)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.qiyukf.nim.uikit.session.p152b.C1965b.C19661.onInterrupt():void");
            }
        });
    }

    /* renamed from: a */
    public final void mo34392a(IMMessage iMMessage, int i) {
        m3872a(iMMessage, i, true, 500L);
    }

    /* renamed from: a */
    public final void mo34393a(boolean z, C1881d dVar, IMMessage iMMessage) {
        this.f3837k = z;
        this.f3838l = dVar;
        this.f3839m = iMMessage;
    }

    @Override // com.qiyukf.nim.uikit.common.media.p146a.AbstractC1886a
    /* renamed from: e */
    public final void mo34196e() {
        super.mo34196e();
        mo34393a(false, (C1881d) null, (IMMessage) null);
    }

    /* renamed from: j */
    public final IMMessage mo34394j() {
        if (!mo34195d() || !C1964a.class.isInstance(this.f3481e)) {
            return null;
        }
        return ((C1964a) this.f3481e).mo34391c();
    }
}

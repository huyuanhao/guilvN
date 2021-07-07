package com.qiyukf.nimlib.p195h;

import android.text.TextUtils;
import com.qiyukf.basesdk.p138c.C1810b;
import com.qiyukf.nimlib.sdk.msg.constant.AttachStatusEnum;
import com.qiyukf.nimlib.sdk.msg.constant.MsgDirectionEnum;
import com.qiyukf.nimlib.sdk.msg.constant.SessionTypeEnum;
import com.qiyukf.nimlib.sdk.msg.model.CustomMessageConfig;
import com.qiyukf.nimlib.sdk.msg.model.IMMessage;
import com.qiyukf.unicorn.api.msg.MsgStatusEnum;
import com.qiyukf.unicorn.api.msg.MsgTypeEnum;
import com.qiyukf.unicorn.api.msg.attachment.MsgAttachment;
import org.json.JSONObject;

/* renamed from: com.qiyukf.nimlib.h.a */
public final class C2313a implements IMMessage {
    public static final long serialVersionUID = -1949246189525361810L;

    /* renamed from: a */
    public long f4617a = -1;

    /* renamed from: b */
    public String f4618b;

    /* renamed from: c */
    public SessionTypeEnum f4619c;

    /* renamed from: d */
    public int f4620d;

    /* renamed from: e */
    public MsgStatusEnum f4621e;

    /* renamed from: f */
    public MsgDirectionEnum f4622f;

    /* renamed from: g */
    public String f4623g;

    /* renamed from: h */
    public String f4624h;

    /* renamed from: i */
    public long f4625i;

    /* renamed from: j */
    public MsgAttachment f4626j;

    /* renamed from: k */
    public String f4627k;

    /* renamed from: l */
    public transient JSONObject f4628l;

    /* renamed from: m */
    public AttachStatusEnum f4629m;

    /* renamed from: n */
    public String f4630n;

    /* renamed from: o */
    public long f4631o;

    /* renamed from: p */
    public String f4632p;

    /* renamed from: q */
    public CustomMessageConfig f4633q;

    /* renamed from: a */
    public final long mo35004a() {
        return this.f4617a;
    }

    /* renamed from: a */
    public final String mo35005a(boolean z) {
        MsgAttachment msgAttachment = this.f4626j;
        return msgAttachment != null ? msgAttachment.toJson(z) : this.f4632p;
    }

    /* renamed from: a */
    public final void mo35006a(int i) {
        this.f4620d = i;
    }

    /* renamed from: a */
    public final void mo35007a(long j) {
        this.f4617a = j;
    }

    /* renamed from: a */
    public final void mo35008a(SessionTypeEnum sessionTypeEnum) {
        this.f4619c = sessionTypeEnum;
    }

    /* renamed from: a */
    public final void mo35009a(CustomMessageConfig customMessageConfig) {
        this.f4633q = customMessageConfig;
    }

    /* renamed from: a */
    public final void mo35010a(String str) {
        this.f4630n = str;
    }

    /* renamed from: b */
    public final int mo35011b() {
        return this.f4620d;
    }

    /* renamed from: b */
    public final void mo35012b(long j) {
        this.f4631o = j;
    }

    /* renamed from: b */
    public final void mo35013b(String str) {
        this.f4618b = str;
    }

    /* renamed from: c */
    public final long mo35014c() {
        return this.f4631o;
    }

    /* renamed from: c */
    public final void mo35015c(String str) {
        this.f4632p = str;
        if (!TextUtils.isEmpty(str)) {
            this.f4626j = C2314b.m4972a().mo35042c().mo35047a(this.f4620d, str);
        }
    }

    /* renamed from: d */
    public final CustomMessageConfig mo35016d() {
        return this.f4633q;
    }

    @Override // com.qiyukf.nimlib.sdk.msg.model.IMMessage
    public final AttachStatusEnum getAttachStatus() {
        AttachStatusEnum attachStatusEnum = this.f4629m;
        return attachStatusEnum == null ? AttachStatusEnum.def : attachStatusEnum;
    }

    @Override // com.qiyukf.unicorn.api.msg.UnicornMessage
    public final MsgAttachment getAttachment() {
        return this.f4626j;
    }

    @Override // com.qiyukf.unicorn.api.msg.UnicornMessage
    public final String getContent() {
        return this.f4624h;
    }

    @Override // com.qiyukf.nimlib.sdk.msg.model.IMMessage
    public final MsgDirectionEnum getDirect() {
        return this.f4622f;
    }

    @Override // com.qiyukf.nimlib.sdk.msg.model.IMMessage
    public final String getExt() {
        return this.f4627k;
    }

    @Override // com.qiyukf.unicorn.api.msg.UnicornMessage
    public final JSONObject getExtension() {
        if (!TextUtils.isEmpty(this.f4627k) && this.f4628l == null) {
            this.f4628l = C1810b.m3420a(this.f4627k);
        }
        return this.f4628l;
    }

    @Override // com.qiyukf.nimlib.sdk.msg.model.IMMessage
    public final String getFromAccount() {
        return this.f4623g;
    }

    @Override // com.qiyukf.unicorn.api.msg.UnicornMessage
    public final MsgTypeEnum getMsgType() {
        return C2324g.m5041a(this.f4620d);
    }

    @Override // com.qiyukf.unicorn.api.msg.UnicornMessage
    public final String getSessionId() {
        return this.f4618b;
    }

    @Override // com.qiyukf.nimlib.sdk.msg.model.IMMessage
    public final SessionTypeEnum getSessionType() {
        return this.f4619c;
    }

    @Override // com.qiyukf.nimlib.sdk.msg.model.IMMessage
    public final MsgStatusEnum getStatus() {
        return this.f4621e;
    }

    @Override // com.qiyukf.unicorn.api.msg.UnicornMessage
    public final long getTime() {
        return this.f4625i;
    }

    @Override // com.qiyukf.nimlib.sdk.msg.model.IMMessage
    public final String getUuid() {
        return this.f4630n;
    }

    @Override // com.qiyukf.nimlib.sdk.msg.model.IMMessage
    public final boolean isTheSame(IMMessage iMMessage) {
        if (iMMessage == null) {
            return false;
        }
        long j = ((C2313a) iMMessage).f4617a;
        long j2 = this.f4617a;
        return (j2 <= 0 || j <= 0) ? TextUtils.equals(this.f4630n, iMMessage.getUuid()) : j2 == j;
    }

    @Override // com.qiyukf.nimlib.sdk.msg.model.IMMessage
    public final void setAttachStatus(AttachStatusEnum attachStatusEnum) {
        this.f4629m = attachStatusEnum;
    }

    @Override // com.qiyukf.nimlib.sdk.msg.model.IMMessage
    public final void setAttachment(MsgAttachment msgAttachment) {
        this.f4626j = msgAttachment;
    }

    @Override // com.qiyukf.nimlib.sdk.msg.model.IMMessage
    public final void setContent(String str) {
        this.f4624h = str;
    }

    @Override // com.qiyukf.nimlib.sdk.msg.model.IMMessage
    public final void setDirect(MsgDirectionEnum msgDirectionEnum) {
        this.f4622f = msgDirectionEnum;
    }

    @Override // com.qiyukf.nimlib.sdk.msg.model.IMMessage
    public final void setExt(String str) {
        this.f4628l = null;
        this.f4627k = str;
    }

    @Override // com.qiyukf.nimlib.sdk.msg.model.IMMessage
    public final void setFromAccount(String str) {
        this.f4623g = str;
    }

    @Override // com.qiyukf.nimlib.sdk.msg.model.IMMessage
    public final void setStatus(MsgStatusEnum msgStatusEnum) {
        this.f4621e = msgStatusEnum;
    }

    @Override // com.qiyukf.nimlib.sdk.msg.model.IMMessage
    public final void setTime(long j) {
        this.f4625i = j;
    }
}

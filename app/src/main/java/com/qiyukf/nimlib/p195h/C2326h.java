package com.qiyukf.nimlib.p195h;

import android.text.TextUtils;
import com.qiyukf.nimlib.sdk.msg.constant.SessionTypeEnum;
import com.qiyukf.nimlib.sdk.msg.model.RecentContact;
import com.qiyukf.unicorn.api.msg.MsgStatusEnum;
import com.qiyukf.unicorn.api.msg.MsgTypeEnum;
import com.qiyukf.unicorn.api.msg.SessionStatusEnum;
import com.qiyukf.unicorn.api.msg.attachment.MsgAttachment;

/* renamed from: com.qiyukf.nimlib.h.h */
public final class C2326h implements RecentContact {

    /* renamed from: a */
    public String f4654a;

    /* renamed from: b */
    public String f4655b;

    /* renamed from: c */
    public String f4656c;

    /* renamed from: d */
    public int f4657d;

    /* renamed from: e */
    public MsgStatusEnum f4658e;

    /* renamed from: f */
    public SessionTypeEnum f4659f;

    /* renamed from: g */
    public String f4660g;

    /* renamed from: h */
    public long f4661h;

    /* renamed from: i */
    public long f4662i;

    /* renamed from: j */
    public String f4663j;

    /* renamed from: k */
    public int f4664k;

    /* renamed from: l */
    public MsgAttachment f4665l;

    /* renamed from: m */
    public SessionStatusEnum f4666m;

    /* renamed from: a */
    public final String mo35050a() {
        return this.f4663j;
    }

    /* renamed from: a */
    public final void mo35051a(int i) {
        this.f4657d = i;
    }

    /* renamed from: a */
    public final void mo35052a(long j) {
        this.f4661h = j;
    }

    /* renamed from: a */
    public final void mo35053a(SessionTypeEnum sessionTypeEnum) {
        this.f4659f = sessionTypeEnum;
    }

    /* renamed from: a */
    public final void mo35054a(SessionStatusEnum sessionStatusEnum) {
        this.f4666m = sessionStatusEnum;
    }

    /* renamed from: a */
    public final void mo35055a(MsgAttachment msgAttachment) {
        this.f4665l = msgAttachment;
        if (msgAttachment != null) {
            this.f4663j = msgAttachment.toJson(false);
        }
    }

    /* renamed from: a */
    public final void mo35056a(String str) {
        this.f4654a = str;
    }

    /* renamed from: b */
    public final int mo35057b() {
        return this.f4664k;
    }

    /* renamed from: b */
    public final void mo35058b(int i) {
        this.f4664k = i;
    }

    /* renamed from: b */
    public final void mo35059b(String str) {
        this.f4655b = str;
    }

    /* renamed from: c */
    public final void mo35060c(String str) {
        this.f4656c = str;
    }

    /* renamed from: d */
    public final void mo35061d(String str) {
        this.f4660g = str;
    }

    /* renamed from: e */
    public final void mo35062e(String str) {
        this.f4663j = str;
        if (!TextUtils.isEmpty(str)) {
            this.f4665l = C2314b.m4972a().mo35042c().mo35047a(this.f4664k, str);
        }
    }

    @Override // com.qiyukf.nimlib.sdk.msg.model.RecentContact
    public final MsgAttachment getAttachment() {
        return this.f4665l;
    }

    @Override // com.qiyukf.unicorn.api.pop.Session, com.qiyukf.nimlib.sdk.msg.model.RecentContact
    public final String getContactId() {
        return this.f4654a;
    }

    @Override // com.qiyukf.unicorn.api.pop.Session, com.qiyukf.nimlib.sdk.msg.model.RecentContact
    public final String getContent() {
        return this.f4660g;
    }

    @Override // com.qiyukf.nimlib.sdk.msg.model.RecentContact
    public final String getFromAccount() {
        return this.f4655b;
    }

    @Override // com.qiyukf.unicorn.api.pop.Session, com.qiyukf.nimlib.sdk.msg.model.RecentContact
    public final MsgStatusEnum getMsgStatus() {
        return this.f4658e;
    }

    @Override // com.qiyukf.nimlib.sdk.msg.model.RecentContact
    public final MsgTypeEnum getMsgType() {
        return C2324g.m5041a(this.f4664k);
    }

    @Override // com.qiyukf.nimlib.sdk.msg.model.RecentContact
    public final String getRecentMessageId() {
        return this.f4656c;
    }

    @Override // com.qiyukf.unicorn.api.pop.Session
    public final SessionStatusEnum getSessionStatus() {
        return this.f4666m;
    }

    @Override // com.qiyukf.nimlib.sdk.msg.model.RecentContact
    public final SessionTypeEnum getSessionType() {
        return this.f4659f;
    }

    @Override // com.qiyukf.nimlib.sdk.msg.model.RecentContact
    public final long getTag() {
        return this.f4662i;
    }

    @Override // com.qiyukf.unicorn.api.pop.Session, com.qiyukf.nimlib.sdk.msg.model.RecentContact
    public final long getTime() {
        return this.f4661h;
    }

    @Override // com.qiyukf.unicorn.api.pop.Session, com.qiyukf.nimlib.sdk.msg.model.RecentContact
    public final int getUnreadCount() {
        return this.f4657d;
    }

    @Override // com.qiyukf.nimlib.sdk.msg.model.RecentContact
    public final void setMsgStatus(MsgStatusEnum msgStatusEnum) {
        this.f4658e = msgStatusEnum;
    }

    @Override // com.qiyukf.nimlib.sdk.msg.model.RecentContact
    public final void setTag(long j) {
        this.f4662i = j;
    }
}

package com.qiyukf.nimlib.sdk.msg.model;

import com.qiyukf.nimlib.sdk.msg.constant.SessionTypeEnum;
import com.qiyukf.unicorn.api.msg.MsgStatusEnum;
import com.qiyukf.unicorn.api.msg.MsgTypeEnum;
import com.qiyukf.unicorn.api.msg.attachment.MsgAttachment;
import com.qiyukf.unicorn.api.pop.Session;

public interface RecentContact extends Session {
    MsgAttachment getAttachment();

    @Override // com.qiyukf.unicorn.api.pop.Session
    String getContactId();

    @Override // com.qiyukf.unicorn.api.pop.Session
    String getContent();

    String getFromAccount();

    @Override // com.qiyukf.unicorn.api.pop.Session
    MsgStatusEnum getMsgStatus();

    MsgTypeEnum getMsgType();

    String getRecentMessageId();

    SessionTypeEnum getSessionType();

    long getTag();

    @Override // com.qiyukf.unicorn.api.pop.Session
    long getTime();

    @Override // com.qiyukf.unicorn.api.pop.Session
    int getUnreadCount();

    void setMsgStatus(MsgStatusEnum msgStatusEnum);

    void setTag(long j);
}

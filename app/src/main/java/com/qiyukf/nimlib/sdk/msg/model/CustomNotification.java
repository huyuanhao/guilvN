package com.qiyukf.nimlib.sdk.msg.model;

import com.qiyukf.nimlib.sdk.msg.constant.SessionTypeEnum;
import com.qiyukf.unicorn.p213f.p214a.AbstractC2597e;
import com.qiyukf.unicorn.p213f.p214a.C2604f;
import java.io.Serializable;

public class CustomNotification implements Serializable {
    public String apnsText;
    public AbstractC2597e attachment;
    public String fromAccount;
    public boolean sendToOnlineUserOnly = true;
    public String sessionId;
    public SessionTypeEnum sessionType;
    public long time;

    public String getApnsText() {
        return this.apnsText;
    }

    public AbstractC2597e getAttachment() {
        return this.attachment;
    }

    public String getFromAccount() {
        return this.fromAccount;
    }

    public String getSessionId() {
        return this.sessionId;
    }

    public SessionTypeEnum getSessionType() {
        return this.sessionType;
    }

    public long getTime() {
        return this.time;
    }

    public boolean isSendToOnlineUserOnly() {
        return this.sendToOnlineUserOnly;
    }

    public void setApnsText(String str) {
        this.apnsText = str;
    }

    public void setAttachStr(String str) {
        this.attachment = (AbstractC2597e) C2604f.m5892a().parse(str);
    }

    public void setAttachment(AbstractC2597e eVar) {
        this.attachment = eVar;
    }

    public void setFromAccount(String str) {
        this.fromAccount = str;
    }

    public void setSendToOnlineUserOnly(boolean z) {
        this.sendToOnlineUserOnly = z;
    }

    public void setSessionId(String str) {
        this.sessionId = str;
    }

    public void setSessionType(SessionTypeEnum sessionTypeEnum) {
        this.sessionType = sessionTypeEnum;
    }

    public void setTime(long j) {
        this.time = j;
    }
}

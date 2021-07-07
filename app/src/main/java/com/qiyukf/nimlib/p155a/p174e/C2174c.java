package com.qiyukf.nimlib.p155a.p174e;

import android.database.Cursor;
import com.qiyukf.nimlib.p155a.C2147d;
import com.qiyukf.nimlib.p177c.C2204c;
import com.qiyukf.nimlib.p179d.AbstractC2217h;
import com.qiyukf.nimlib.p179d.C2206a;
import com.qiyukf.nimlib.p179d.C2209b;
import com.qiyukf.nimlib.p179d.C2218i;
import com.qiyukf.nimlib.sdk.InvocationFuture;
import com.qiyukf.nimlib.sdk.msg.SystemMessageService;
import com.qiyukf.nimlib.sdk.msg.constant.SystemMessageStatus;
import com.qiyukf.nimlib.sdk.msg.model.SystemMessage;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.qiyukf.nimlib.a.e.c */
public class C2174c extends AbstractC2217h implements SystemMessageService {
    @Override // com.qiyukf.nimlib.sdk.msg.SystemMessageService
    public void clearSystemMessages() {
        C2204c.m4563a().mo34815d().mo34776a("DELETE FROM system_msg");
    }

    @Override // com.qiyukf.nimlib.sdk.msg.SystemMessageService
    public void deleteSystemMessage(long j) {
        C2204c.m4563a().mo34815d().mo34776a("DELETE FROM system_msg WHERE messageid='" + j + "'");
    }

    @Override // com.qiyukf.nimlib.sdk.msg.SystemMessageService
    public InvocationFuture<Integer> querySystemMessageUnreadCount() {
        int a = C2147d.m4397a();
        C2218i b = AbstractC2217h.m4611b();
        b.mo34830b(Integer.valueOf(a));
        C2206a.m4593c(b);
        return null;
    }

    @Override // com.qiyukf.nimlib.sdk.msg.SystemMessageService
    public int querySystemMessageUnreadCountBlock() {
        return C2147d.m4397a();
    }

    @Override // com.qiyukf.nimlib.sdk.msg.SystemMessageService
    public InvocationFuture<List<SystemMessage>> querySystemMessages(int i, int i2) {
        Cursor b = C2204c.m4563a().mo34815d().mo34778b("SELECT messageid, id, fromid, type, time, status, content, attach FROM system_msg ORDER BY time desc LIMIT " + i2 + " OFFSET " + i);
        ArrayList arrayList = new ArrayList();
        if (b != null) {
            while (b.moveToNext()) {
                SystemMessage systemMessage = new SystemMessage();
                systemMessage.setMessageId(b.getLong(0));
                systemMessage.setTargetId(b.getString(1));
                systemMessage.setFromAccount(b.getString(2));
                systemMessage.setType(b.getInt(3));
                systemMessage.setTime(b.getLong(4));
                systemMessage.setStatus(SystemMessageStatus.statusOfValue(b.getInt(5)));
                systemMessage.setContent(b.getString(6));
                systemMessage.setAttach(b.getString(7));
                arrayList.add(systemMessage);
            }
            if (!b.isClosed()) {
                b.close();
            }
        }
        C2218i b2 = AbstractC2217h.m4611b();
        b2.mo34830b(arrayList);
        C2206a.m4593c(b2);
        return null;
    }

    @Override // com.qiyukf.nimlib.sdk.msg.SystemMessageService
    public void resetSystemMessageUnreadCount() {
        C2147d.m4398a(0);
        C2209b.m4596a(0);
    }

    @Override // com.qiyukf.nimlib.sdk.msg.SystemMessageService
    public void setSystemMessageStatus(long j, SystemMessageStatus systemMessageStatus) {
        C2204c.m4563a().mo34815d().mo34776a("UPDATE system_msg SET status='" + systemMessageStatus.getValue() + "' WHERE messageid='" + j + "'");
    }
}

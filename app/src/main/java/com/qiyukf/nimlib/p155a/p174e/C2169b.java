package com.qiyukf.nimlib.p155a.p174e;

import android.content.ContentValues;
import android.content.Context;
import android.text.TextUtils;
import com.p118pd.sdk.C7383o0OOO0O;
import com.p118pd.sdk.C8932ooOOO0o;
import com.qiyukf.basesdk.p119a.C1709a;
import com.qiyukf.basesdk.p120b.p121a.p122a.C1730d;
import com.qiyukf.basesdk.p120b.p121a.p122a.C1732f;
import com.qiyukf.basesdk.p120b.p121a.p123b.AbstractC1743c;
import com.qiyukf.basesdk.p120b.p121a.p123b.C1735a;
import com.qiyukf.basesdk.p138c.p142c.C1852c;
import com.qiyukf.nimlib.C2106a;
import com.qiyukf.nimlib.C2180b;
import com.qiyukf.nimlib.C2205d;
import com.qiyukf.nimlib.p155a.C2130c;
import com.qiyukf.nimlib.p155a.p162c.p163a.C2135c;
import com.qiyukf.nimlib.p155a.p162c.p166d.C2140a;
import com.qiyukf.nimlib.p155a.p162c.p166d.C2141b;
import com.qiyukf.nimlib.p155a.p162c.p166d.C2142c;
import com.qiyukf.nimlib.p155a.p162c.p167e.C2145a;
import com.qiyukf.nimlib.p155a.p168d.AbstractC2148a;
import com.qiyukf.nimlib.p155a.p175f.C2175a;
import com.qiyukf.nimlib.p155a.p175f.C2176b;
import com.qiyukf.nimlib.p177c.C2192a;
import com.qiyukf.nimlib.p177c.C2204c;
import com.qiyukf.nimlib.p177c.p178a.C2194b;
import com.qiyukf.nimlib.p179d.AbstractC2215f;
import com.qiyukf.nimlib.p179d.AbstractC2217h;
import com.qiyukf.nimlib.p179d.C2206a;
import com.qiyukf.nimlib.p179d.C2209b;
import com.qiyukf.nimlib.p179d.C2218i;
import com.qiyukf.nimlib.p182f.C2243a;
import com.qiyukf.nimlib.p182f.EnumC2246c;
import com.qiyukf.nimlib.p183g.p191c.p193b.C2293b;
import com.qiyukf.nimlib.p195h.C2313a;
import com.qiyukf.nimlib.p195h.C2314b;
import com.qiyukf.nimlib.p195h.C2315c;
import com.qiyukf.nimlib.p195h.C2317d;
import com.qiyukf.nimlib.p195h.C2323f;
import com.qiyukf.nimlib.p195h.C2324g;
import com.qiyukf.nimlib.p195h.C2326h;
import com.qiyukf.nimlib.sdk.AbortableFuture;
import com.qiyukf.nimlib.sdk.InvocationFuture;
import com.qiyukf.nimlib.sdk.NIMClient;
import com.qiyukf.nimlib.sdk.msg.MsgService;
import com.qiyukf.nimlib.sdk.msg.attachment.MsgAttachmentParser;
import com.qiyukf.nimlib.sdk.msg.constant.AttachStatusEnum;
import com.qiyukf.nimlib.sdk.msg.constant.SessionTypeEnum;
import com.qiyukf.nimlib.sdk.msg.model.CustomNotification;
import com.qiyukf.nimlib.sdk.msg.model.IMMessage;
import com.qiyukf.nimlib.sdk.msg.model.QueryDirectionEnum;
import com.qiyukf.nimlib.sdk.msg.model.RecentContact;
import com.qiyukf.unicorn.api.msg.MsgStatusEnum;
import com.qiyukf.unicorn.api.msg.MsgTypeEnum;
import com.qiyukf.unicorn.api.msg.attachment.FileAttachment;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.qiyukf.nimlib.a.e.b */
public class C2169b extends AbstractC2217h implements MsgService {
    /* renamed from: a */
    public static InvocationFuture<List<IMMessage>> m4431a(List<C2313a> list) {
        C2218i b = AbstractC2217h.m4611b();
        for (C2313a aVar : list) {
            if (aVar.getStatus() == MsgStatusEnum.fail) {
                if (C2314b.m4972a().mo35043c(aVar.getUuid())) {
                    aVar.setStatus(MsgStatusEnum.sending);
                }
            } else if (C2314b.m4972a().mo35046f(aVar.getUuid())) {
                aVar.setAttachStatus(AttachStatusEnum.transferring);
            }
        }
        b.mo34830b(list);
        C2206a.m4593c(b);
        return null;
    }

    /* renamed from: a */
    public static void m4432a(C2326h hVar) {
        if (hVar.getMsgStatus() == MsgStatusEnum.fail && C2314b.m4972a().mo35043c(hVar.getRecentMessageId())) {
            hVar.setMsgStatus(MsgStatusEnum.sending);
        }
    }

    /* renamed from: a */
    private void m4433a(CustomNotification customNotification, final C2218i iVar, C2175a aVar) {
        if (TextUtils.isEmpty(customNotification.getSessionId()) || customNotification.getSessionType() == null) {
            throw new IllegalArgumentException("illegal receiver");
        }
        String json = customNotification.getAttachment().toJson(true);
        C1709a.m3014b(C7383o0OOO0O.OooOOO0, "send custom notification: sessionId: " + customNotification.getSessionId() + ", content: " + json);
        C2293b bVar = new C2293b();
        bVar.mo34955a(2, customNotification.getSessionId());
        bVar.mo34954a(1, C2324g.m5036a(customNotification.getSessionType()));
        bVar.mo34955a(5, json);
        if (!customNotification.isSendToOnlineUserOnly()) {
            bVar.mo34954a(7, 1);
        }
        if (!TextUtils.isEmpty(customNotification.getApnsText())) {
            bVar.mo34955a(8, customNotification.getApnsText());
        }
        C2140a aVar2 = customNotification.getSessionType() == SessionTypeEnum.Ysf ? new C2145a() : new C2140a();
        aVar2.mo34682a(bVar);
        C2130c.m4323a().mo34663a(new C2176b(aVar2, aVar) {
            /* class com.qiyukf.nimlib.p155a.p174e.C2169b.C21734 */

            @Override // com.qiyukf.nimlib.p155a.p175f.C2176b, com.qiyukf.nimlib.p155a.p175f.AbstractC2177c
            /* renamed from: a */
            public final void mo34684a(AbstractC2148a aVar) {
                iVar.mo34825a(aVar.mo34693e());
                C2206a.m4593c(iVar);
            }
        });
    }

    /* renamed from: a */
    public static void m4435a(String str, SessionTypeEnum sessionTypeEnum) {
        C2204c.m4563a().mo34815d().mo34776a("DELETE FROM lstmsg where uid = '" + C2194b.m4539a(str) + "' and sessiontype='" + sessionTypeEnum.getValue() + "'");
        C2141b bVar = new C2141b();
        bVar.mo34683a(str, sessionTypeEnum);
        C2130c.m4323a().mo34662a(bVar, C2175a.f4336b);
    }

    /* renamed from: b */
    public static void m4436b(String str, long j, int i, C2218i iVar) {
        C2135c cVar = new C2135c();
        C2293b bVar = new C2293b();
        bVar.mo34955a(0, "AAC");
        bVar.mo34955a(1, String.valueOf(i));
        bVar.mo34955a(2, str);
        bVar.f4586a.put(3, String.valueOf(j));
        cVar.mo34676a(bVar);
        cVar.mo34668a(iVar);
        C2130c.m4323a().mo34661a(cVar);
    }

    /* renamed from: b */
    public static void m4437b(List<RecentContact> list) {
        Iterator<RecentContact> it = list.iterator();
        while (it.hasNext()) {
            m4432a((C2326h) it.next());
        }
    }

    @Override // com.qiyukf.nimlib.sdk.msg.MsgService
    public void clearChattingHistory(String str, SessionTypeEnum sessionTypeEnum) {
        int value = sessionTypeEnum.getValue();
        C2204c.m4563a().mo34815d().mo34776a("DELETE FROM msghistory where (id='" + C2194b.m4539a(str) + "' and sessiontype='" + value + "')");
        if (C2323f.m5021a(str, sessionTypeEnum) != null) {
            C2209b.m4599a(C2324g.m5040a(str, sessionTypeEnum));
        }
    }

    @Override // com.qiyukf.nimlib.sdk.msg.MsgService
    public void clearMsgDatabase(boolean z) {
        if (z) {
            List<RecentContact> a = C2323f.m5026a();
            if (a.size() != 0) {
                C2141b bVar = new C2141b();
                for (RecentContact recentContact : a) {
                    bVar.mo34683a(recentContact.getContactId(), recentContact.getSessionType());
                }
                C2130c.m4323a().mo34662a(bVar, C2175a.f4336b);
            }
        }
        C2204c.m4563a().mo34815d().mo34776a("DELETE FROM msghistory");
        if (z) {
            C2204c.m4563a().mo34815d().mo34776a("DELETE FROM lstmsg");
        }
        if (z) {
            C2209b.m4602b((RecentContact) null);
        }
    }

    @Override // com.qiyukf.nimlib.sdk.msg.MsgService
    public void clearUnreadCount(String str, SessionTypeEnum sessionTypeEnum) {
        if (!TextUtils.isEmpty(str)) {
            C2326h a = C2323f.m5021a(str, sessionTypeEnum);
            if (a != null && a.getUnreadCount() > 0) {
                int value = sessionTypeEnum.getValue();
                C2204c.m4563a().mo34815d().mo34776a("update lstmsg set unreadnum = 0 where uid='" + C2194b.m4539a(str) + "' and sessiontype='" + value + "'");
                a.mo35051a(0);
                m4432a(a);
                C2209b.m4599a(a);
            }
            C2243a.m4689a(EnumC2246c.MESSAGE);
        }
    }

    @Override // com.qiyukf.nimlib.sdk.msg.MsgService
    public void deleteChattingHistory(IMMessage iMMessage) {
        C2326h hVar;
        C2204c.m4563a().mo34815d().mo34776a("DELETE FROM msghistory where uuid = '" + ((C2313a) iMMessage).getUuid() + "'");
        String sessionId = iMMessage.getSessionId();
        SessionTypeEnum sessionType = iMMessage.getSessionType();
        C2326h a = C2323f.m5021a(sessionId, sessionType);
        if (a != null && TextUtils.equals(a.getRecentMessageId(), iMMessage.getUuid())) {
            C2313a a2 = C2323f.m5019a(sessionId, sessionType.getValue());
            if (a2 == null) {
                hVar = C2324g.m5040a(sessionId, sessionType);
            } else {
                hVar = C2324g.m5037a(a2);
                m4432a(hVar);
            }
            C2209b.m4599a(hVar);
        }
    }

    @Override // com.qiyukf.nimlib.sdk.msg.MsgService
    public void deleteRecentContact(RecentContact recentContact) {
        m4435a(recentContact.getContactId(), recentContact.getSessionType());
    }

    @Override // com.qiyukf.nimlib.sdk.msg.MsgService
    public void deleteRecentContact2(String str, SessionTypeEnum sessionTypeEnum) {
        m4435a(str, sessionTypeEnum);
        C2326h hVar = new C2326h();
        hVar.mo35056a(str);
        hVar.mo35053a(sessionTypeEnum);
        C2209b.m4602b(hVar);
    }

    @Override // com.qiyukf.nimlib.sdk.msg.MsgService
    public AbortableFuture downloadAttachment(IMMessage iMMessage, boolean z) {
        C1730d a = C2315c.m4981a((C2313a) iMMessage, z, AbstractC2217h.m4611b());
        if (a == null) {
            return null;
        }
        return new AbstractC2215f<C1730d>(a) {
            /* class com.qiyukf.nimlib.p155a.p174e.C2169b.C21712 */

            @Override // com.qiyukf.nimlib.sdk.AbortableFuture
            public final boolean abort() {
                C1732f.m3104a().mo33908b((C1730d) this.f4413c);
                return false;
            }
        };
    }

    @Override // com.qiyukf.nimlib.sdk.msg.MsgService
    public void migrateMessages(String str, String str2, boolean z) {
        if (!TextUtils.equals(str, str2)) {
            Context a = C2180b.m4471a();
            C2192a aVar = new C2192a(a, C2180b.m4482g() + C8932ooOOO0o.OooO0OO + str2);
            StringBuilder sb = new StringBuilder("ATTACH DATABASE '");
            sb.append(C2106a.f4240a + C8932ooOOO0o.OooO0OO + str + "/msg.db");
            sb.append("' AS src");
            aVar.mo34776a(sb.toString());
            aVar.mo34776a("INSERT INTO msghistory(uuid,serverid,time,content,msgtype,sessiontype,fromid,id,direct,status,status2,attach) SELECT uuid,serverid,time,content,msgtype,sessiontype,fromid,id,direct,status,status2,attach FROM src.msghistory");
            aVar.mo34776a("INSERT OR IGNORE INTO lstmsg(uid,fromuid,messageId,msgstatus,unreadnum,content,time,sessiontype,tag,msgtype,attach) SELECT uid,fromuid,messageId,msgstatus,unreadnum,content,time,sessiontype,tag,msgtype,attach FROM src.lstmsg");
            aVar.mo34776a("DETACH DATABASE src");
            if (z) {
                aVar.mo34776a("UPDATE msghistory SET fromid='" + C2194b.m4539a(str2) + "' WHERE fromid='" + C2194b.m4539a(str) + "'");
                aVar.mo34776a("UPDATE lstmsg SET fromuid='" + C2194b.m4539a(str2) + "' WHERE fromuid='" + C2194b.m4539a(str) + "'");
            }
            aVar.mo34780c();
            C2209b.m4603b((List<C2326h>) ((MsgService) NIMClient.getService(MsgService.class)).queryRecentContactsBlock());
        }
    }

    @Override // com.qiyukf.nimlib.sdk.msg.MsgService
    public InvocationFuture<List<IMMessage>> pullMessageHistory(IMMessage iMMessage, int i, boolean z) {
        return pullMessageHistoryEx(iMMessage, 0, i, QueryDirectionEnum.QUERY_OLD, z);
    }

    @Override // com.qiyukf.nimlib.sdk.msg.MsgService
    public InvocationFuture<List<IMMessage>> pullMessageHistoryEx(IMMessage iMMessage, long j, int i, QueryDirectionEnum queryDirectionEnum, boolean z) {
        if (iMMessage != null && (iMMessage instanceof C2313a)) {
            C2313a aVar = (C2313a) iMMessage;
            boolean z2 = queryDirectionEnum != QueryDirectionEnum.QUERY_OLD;
            C2142c cVar = new C2142c(aVar.getSessionId(), aVar.getSessionType(), z2 ? iMMessage.getTime() : j, z2 ? j : iMMessage.getTime(), aVar.mo35014c(), i, z2, z);
            cVar.mo34668a(AbstractC2217h.m4611b());
            C2130c.m4323a().mo34661a(cVar);
        }
        return null;
    }

    @Override // com.qiyukf.nimlib.sdk.msg.MsgService
    public IMMessage queryLastMessage(String str, SessionTypeEnum sessionTypeEnum) {
        return C2323f.m5019a(str, sessionTypeEnum.getValue());
    }

    @Override // com.qiyukf.nimlib.sdk.msg.MsgService
    public InvocationFuture queryMessageList(String str, SessionTypeEnum sessionTypeEnum, long j, int i) {
        return m4431a(C2323f.m5025a(str, sessionTypeEnum.getValue(), j, i));
    }

    @Override // com.qiyukf.nimlib.sdk.msg.MsgService
    public InvocationFuture<List<IMMessage>> queryMessageListEx(IMMessage iMMessage, QueryDirectionEnum queryDirectionEnum, int i, boolean z) {
        return m4431a(C2323f.m5024a((C2313a) iMMessage, queryDirectionEnum, i, z));
    }

    @Override // com.qiyukf.nimlib.sdk.msg.MsgService
    public InvocationFuture queryRecentContacts() {
        C2218i b = AbstractC2217h.m4611b();
        List<RecentContact> a = C2323f.m5026a();
        m4437b(a);
        b.mo34830b(a);
        C2206a.m4593c(b);
        return null;
    }

    @Override // com.qiyukf.nimlib.sdk.msg.MsgService
    public List<RecentContact> queryRecentContactsBlock() {
        List<RecentContact> a = C2323f.m5026a();
        m4437b(a);
        return a;
    }

    @Override // com.qiyukf.nimlib.sdk.msg.MsgService
    public void registerCustomAttachmentParser(MsgTypeEnum msgTypeEnum, MsgAttachmentParser msgAttachmentParser) {
        C2314b.m4972a().mo35042c().mo35048a(msgTypeEnum.getValue(), msgAttachmentParser);
    }

    @Override // com.qiyukf.nimlib.sdk.msg.MsgService
    public InvocationFuture<Void> saveMessageToLocal(IMMessage iMMessage, boolean z) {
        C2313a aVar = (C2313a) iMMessage;
        C2323f.m5028a(aVar);
        C2209b.m4599a(C2324g.m5037a(aVar));
        AbstractC2217h.m4611b().mo34825a(200);
        C2206a.m4593c(AbstractC2217h.m4611b());
        if (!z) {
            return null;
        }
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(aVar);
        C2209b.m4601a(arrayList);
        return null;
    }

    @Override // com.qiyukf.nimlib.sdk.msg.MsgService
    public InvocationFuture<List<IMMessage>> searchMessageHistory(String str, List<String> list, IMMessage iMMessage, int i) {
        return m4431a(C2323f.m5027a(str, list, iMMessage, i));
    }

    @Override // com.qiyukf.nimlib.sdk.msg.MsgService
    public InvocationFuture<Void> sendCustomNotification(CustomNotification customNotification) {
        m4433a(customNotification, AbstractC2217h.m4611b(), C2175a.f4335a);
        return null;
    }

    @Override // com.qiyukf.nimlib.sdk.msg.MsgService
    public AbortableFuture<FileAttachment> sendFile(FileAttachment fileAttachment) {
        final C1735a.RunnableC1738c a = C2317d.m4997a(fileAttachment, AbstractC2217h.m4611b());
        return new AbstractC2215f<FileAttachment>() {
            /* class com.qiyukf.nimlib.p155a.p174e.C2169b.C21701 */

            @Override // com.qiyukf.nimlib.sdk.AbortableFuture
            public final boolean abort() {
                C1735a.m3113a().mo33911a(a);
                return false;
            }
        };
    }

    @Override // com.qiyukf.nimlib.sdk.msg.MsgService
    public InvocationFuture<Void> sendImportantNotification(CustomNotification customNotification) {
        m4433a(customNotification, AbstractC2217h.m4611b(), new C2175a(5, 30));
        return null;
    }

    @Override // com.qiyukf.nimlib.sdk.msg.MsgService
    public InvocationFuture<Void> sendMessage(IMMessage iMMessage, boolean z, boolean z2) {
        C2317d.m4999a((C2313a) iMMessage, z, AbstractC2217h.m4611b(), z2);
        return null;
    }

    @Override // com.qiyukf.nimlib.sdk.msg.MsgService
    public void setChattingAccount(String str, SessionTypeEnum sessionTypeEnum) {
        if ("all".equals(str)) {
            C2205d.m4571a(str);
            EnumC2246c[] cVarArr = EnumC2246c.f4478c;
            if (cVarArr != null) {
                for (EnumC2246c cVar : cVarArr) {
                    C2243a.m4689a(cVar);
                }
                return;
            }
            return;
        }
        if (str == null) {
            str = "";
        }
        C2205d.m4571a(C2324g.m5043a(str, sessionTypeEnum.getValue()));
        clearUnreadCount(str, sessionTypeEnum);
    }

    @Override // com.qiyukf.nimlib.sdk.msg.MsgService
    public AbortableFuture<String> transVoiceToText(String str, String str2, final long j) {
        if (str2 == null || !new File(str2).exists()) {
            throw new IllegalArgumentException("Invalid audio path.");
        }
        final C2218i b = AbstractC2217h.m4611b();
        if (TextUtils.isEmpty(str)) {
            C1735a.m3113a().mo33910a(str2, C1852c.m3513b(str2), b, new AbstractC1743c() {
                /* class com.qiyukf.nimlib.p155a.p174e.C2169b.C21723 */

                /* renamed from: b */
                public final /* synthetic */ int f4330b = 16000;

                @Override // com.qiyukf.basesdk.p120b.p121a.p123b.AbstractC1743c
                /* renamed from: a */
                public final void mo33925a() {
                    mo33926a(400);
                }

                @Override // com.qiyukf.basesdk.p120b.p121a.p123b.AbstractC1743c
                /* renamed from: a */
                public final void mo33926a(int i) {
                    b.mo34825a(i);
                    b.mo34826a((Object) null);
                    C2206a.m4593c(b);
                }

                @Override // com.qiyukf.basesdk.p120b.p121a.p123b.AbstractC1743c
                /* renamed from: a */
                public final void mo33927a(long j, long j2) {
                }

                @Override // com.qiyukf.basesdk.p120b.p121a.p123b.AbstractC1743c
                /* renamed from: a */
                public final void mo33928a(String str) {
                    C2169b.m4436b(str, j, this.f4330b, b);
                }
            });
            return null;
        }
        m4436b(str, j, 16000, b);
        return null;
    }

    @Override // com.qiyukf.nimlib.sdk.msg.MsgService
    public void updateIMMessageStatus(IMMessage iMMessage, boolean z) {
        C2326h a;
        C2313a aVar = (C2313a) iMMessage;
        ContentValues contentValues = new ContentValues(3);
        if (aVar.getStatus() != null) {
            contentValues.put("status", Integer.valueOf(aVar.getStatus().getValue()));
        }
        if (aVar.getAttachStatus() != null) {
            contentValues.put("status2", Integer.valueOf(aVar.getAttachStatus().getValue()));
        }
        if (aVar.getAttachment() != null) {
            contentValues.put("attach", aVar.getAttachment().toJson(false));
        }
        if (contentValues.size() > 0) {
            C2204c.m4563a().mo34815d().mo34774a("msghistory", contentValues, "uuid=?", new String[]{aVar.getUuid()});
        }
        if (z) {
            C2209b.m4598a(iMMessage);
        }
        if (iMMessage.getAttachment() != null && (a = C2323f.m5021a(iMMessage.getSessionId(), iMMessage.getSessionType())) != null && a.getRecentMessageId().equals(iMMessage.getUuid())) {
            a.mo35055a(iMMessage.getAttachment());
            if (a.getMsgType() == MsgTypeEnum.custom || a.getMsgType() == MsgTypeEnum.appCustom) {
                a.mo35061d(a.getAttachment().getContent(C2180b.m4471a()));
            }
            ContentValues contentValues2 = new ContentValues(2);
            contentValues2.put("content", a.getContent());
            contentValues2.put("attach", a.getAttachment().toJson(false));
            C2204c.m4563a().mo34815d().mo34774a("lstmsg", contentValues2, "messageId=?", new String[]{a.getRecentMessageId()});
            C2209b.m4599a(a);
        }
    }

    @Override // com.qiyukf.nimlib.sdk.msg.MsgService
    public void updateMessage(IMMessage iMMessage, boolean z) {
        C2323f.m5033b((C2313a) iMMessage);
        if (z) {
            C2209b.m4598a(iMMessage);
        }
    }

    @Override // com.qiyukf.nimlib.sdk.msg.MsgService
    public InvocationFuture<Void> updateRecent(RecentContact recentContact) {
        C2204c.m4563a().mo34815d().mo34776a("UPDATE lstmsg set tag='" + recentContact.getTag() + "' where messageId='" + recentContact.getRecentMessageId() + "'");
        return null;
    }
}

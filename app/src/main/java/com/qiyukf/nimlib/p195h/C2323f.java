package com.qiyukf.nimlib.p195h;

import android.content.ContentValues;
import android.database.Cursor;
import android.text.TextUtils;
import com.qiyukf.nimlib.p177c.C2192a;
import com.qiyukf.nimlib.p177c.C2204c;
import com.qiyukf.nimlib.p177c.p178a.C2194b;
import com.qiyukf.nimlib.sdk.msg.constant.AttachStatusEnum;
import com.qiyukf.nimlib.sdk.msg.constant.MsgDirectionEnum;
import com.qiyukf.nimlib.sdk.msg.constant.SessionTypeEnum;
import com.qiyukf.nimlib.sdk.msg.model.IMMessage;
import com.qiyukf.nimlib.sdk.msg.model.RecentContact;
import com.qiyukf.unicorn.api.msg.MsgStatusEnum;
import com.qiyukf.unicorn.api.msg.MsgTypeEnum;
import com.umeng.commonsdk.statistics.idtracking.C3692t;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.qiyukf.nimlib.h.f */
public final class C2323f {
    /* renamed from: a */
    public static C2313a m5018a(String str) {
        ArrayList<C2313a> a = m5022a(C2204c.m4563a().mo34815d(), "SELECT messageid,uuid,serverid,time,content,msgtype,sessiontype,fromid,id,direct,status,status2,attach,ext FROM msghistory where uuid='" + str + "'");
        if (a.size() == 1) {
            return a.get(0);
        }
        return null;
    }

    /* renamed from: a */
    public static C2313a m5019a(String str, int i) {
        ArrayList<C2313a> a = m5025a(str, i, 0, 1);
        if (!a.isEmpty()) {
            return a.get(0);
        }
        return null;
    }

    /* renamed from: a */
    public static C2326h m5020a(Cursor cursor) {
        C2326h hVar = new C2326h();
        try {
            hVar.mo35056a(cursor.getString(0));
            hVar.mo35059b(cursor.getString(1));
            hVar.mo35060c(cursor.getString(2));
            hVar.setMsgStatus(MsgStatusEnum.statusOfValue(cursor.getInt(3)));
            hVar.mo35051a(cursor.getInt(4));
            hVar.mo35061d(cursor.getString(5));
            hVar.mo35052a(cursor.getLong(6));
            hVar.mo35053a(SessionTypeEnum.typeOfValue(cursor.getInt(7)));
            hVar.setTag(cursor.getLong(8));
            hVar.mo35058b(cursor.getInt(9));
            hVar.mo35062e(cursor.getString(10));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return hVar;
    }

    /* renamed from: a */
    public static C2326h m5021a(String str, SessionTypeEnum sessionTypeEnum) {
        Cursor b = C2204c.m4563a().mo34815d().mo34778b(String.format("select uid,fromuid,messageId,msgstatus,unreadnum,content,time,sessiontype,tag,msgtype,attach from lstmsg where uid='%s' and sessiontype='%d'", C2194b.m4539a(str), Integer.valueOf(sessionTypeEnum.getValue())));
        C2326h a = (b == null || !b.moveToNext()) ? null : m5020a(b);
        if (b != null && !b.isClosed()) {
            b.close();
        }
        return a;
    }

    /* renamed from: a */
    public static ArrayList<C2313a> m5022a(C2192a aVar, String str) {
        Cursor b = aVar.mo34778b(str);
        if (b == null) {
            return new ArrayList<>();
        }
        ArrayList<C2313a> arrayList = new ArrayList<>(b.getCount());
        while (b.moveToNext()) {
            C2313a aVar2 = new C2313a();
            aVar2.mo35007a(b.getLong(0));
            aVar2.mo35010a(b.getString(1));
            aVar2.mo35012b(b.getLong(2));
            aVar2.setTime(b.getLong(3));
            aVar2.setContent(b.getString(4));
            aVar2.mo35006a(b.getInt(5));
            aVar2.mo35008a(SessionTypeEnum.typeOfValue(b.getInt(6)));
            aVar2.setFromAccount(b.getString(7));
            aVar2.mo35013b(b.getString(8));
            aVar2.setDirect(MsgDirectionEnum.directionOfValue(b.getInt(9)));
            aVar2.setStatus(MsgStatusEnum.statusOfValue(b.getInt(10)));
            aVar2.setAttachStatus(AttachStatusEnum.statusOfValue(b.getInt(11)));
            aVar2.mo35015c(b.getString(12));
            aVar2.setExt(b.getString(13));
            arrayList.add(aVar2);
        }
        if (!b.isClosed()) {
            b.close();
        }
        return arrayList;
    }

    /* renamed from: a */
    public static ArrayList<C2313a> m5023a(C2313a aVar, long j, long j2) {
        String sessionId = aVar.getSessionId();
        int value = aVar.getSessionType().getValue();
        boolean z = aVar.mo35004a() > 0;
        StringBuilder sb = new StringBuilder();
        sb.append("SELECT messageid,uuid,serverid,time,content,msgtype,sessiontype,fromid,id,direct,status,status2,attach,ext FROM msghistory where id='");
        sb.append(C2194b.m4539a(sessionId));
        sb.append("' and sessiontype='");
        sb.append(value);
        sb.append("'");
        sb.append(" and time>=");
        sb.append(j);
        sb.append(" and time<=");
        sb.append(j2);
        sb.append(" ORDER BY time ASC");
        ArrayList<C2313a> a = m5022a(C2204c.m4563a().mo34815d(), sb.toString());
        if (!z) {
            return a;
        }
        Iterator<C2313a> it = a.iterator();
        int i = 0;
        while (it.hasNext()) {
            i++;
            if (it.next().mo35004a() == aVar.mo35004a()) {
                break;
            }
        }
        for (int i2 = 0; i2 <= i - 1; i2++) {
            a.remove(i2);
        }
        if (i <= 1) {
            return a;
        }
        sb.delete(sb.lastIndexOf(" "), sb.length());
        sb.append(" offset ");
        sb.append(i);
        return m5022a(C2204c.m4563a().mo34815d(), sb.toString());
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00de  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.ArrayList<com.qiyukf.nimlib.p195h.C2313a> m5024a(com.qiyukf.nimlib.p195h.C2313a r11, com.qiyukf.nimlib.sdk.msg.model.QueryDirectionEnum r12, int r13, boolean r14) {
        /*
        // Method dump skipped, instructions count: 226
        */
        throw new UnsupportedOperationException("Method not decompiled: com.qiyukf.nimlib.p195h.C2323f.m5024a(com.qiyukf.nimlib.h.a, com.qiyukf.nimlib.sdk.msg.model.QueryDirectionEnum, int, boolean):java.util.ArrayList");
    }

    /* renamed from: a */
    public static ArrayList<C2313a> m5025a(String str, int i, long j, int i2) {
        return m5022a(C2204c.m4563a().mo34815d(), "SELECT messageid,uuid,serverid,time,content,msgtype,sessiontype,fromid,id,direct,status,status2,attach,ext FROM msghistory where id='" + C2194b.m4539a(str) + "' and sessiontype='" + i + "'" + " ORDER BY time desc limit " + i2 + " offset " + j);
    }

    /* renamed from: a */
    public static List<RecentContact> m5026a() {
        Cursor b = C2204c.m4563a().mo34815d().mo34778b("select uid,fromuid,messageId,msgstatus,unreadnum,content,time,sessiontype,tag,msgtype,attach from lstmsg order by time desc limit 100");
        ArrayList arrayList = new ArrayList();
        if (b != null) {
            while (b.moveToNext()) {
                arrayList.add(m5020a(b));
            }
            if (!b.isClosed()) {
                b.close();
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public static List<C2313a> m5027a(String str, List<String> list, IMMessage iMMessage, int i) {
        String sessionId = iMMessage.getSessionId();
        int value = iMMessage.getSessionType().getValue();
        StringBuilder sb = new StringBuilder();
        sb.append("SELECT messageid,uuid,serverid,time,content,msgtype,sessiontype,fromid,id,direct,status,status2,attach,ext FROM msghistory where id='");
        sb.append(C2194b.m4539a(sessionId));
        sb.append("' and sessiontype='");
        sb.append(value);
        sb.append("'");
        if (iMMessage.getTime() > 0) {
            sb.append(" and time<'");
            sb.append(iMMessage.getTime());
            sb.append("'");
        }
        sb.append(" and msgtype='");
        sb.append(MsgTypeEnum.text.getValue());
        sb.append("' and (");
        if (list != null && list.size() > 0) {
            sb.append("fromid in (");
            for (String str2 : list) {
                sb.append("'");
                sb.append(C2194b.m4539a(str2));
                sb.append("',");
            }
            sb.replace(sb.length() - 1, sb.length(), ") or");
        }
        sb.append(" content like ");
        sb.append(TextUtils.isEmpty(str) ? "" : "'%" + str.replace("'", "''").replace("\\", "\\\\").replace("%", "\\%").replace("_", "\\_") + "%' ESCAPE '\\'");
        sb.append(") ORDER BY time desc limit ");
        sb.append(i);
        return m5022a(C2204c.m4563a().mo34815d(), sb.toString());
    }

    /* renamed from: a */
    public static void m5028a(C2313a aVar) {
        m5029a(aVar, (MsgStatusEnum) null);
    }

    /* renamed from: a */
    public static void m5029a(C2313a aVar, MsgStatusEnum msgStatusEnum) {
        ContentValues c = m5035c(aVar);
        if (msgStatusEnum != null) {
            c.put("status", Integer.valueOf(msgStatusEnum.getValue()));
        }
        if (C2204c.m4563a().mo34813b()) {
            aVar.mo35007a(C2204c.m4563a().mo34815d().mo34775a("msghistory", c));
        }
    }

    /* renamed from: a */
    public static void m5030a(C2326h hVar) {
        C2204c.m4563a().mo34815d().mo34776a("insert or replace into lstmsg(uid,fromuid,messageId,msgstatus,unreadnum,content,time,sessiontype,tag,msgtype,attach) values ('" + C2194b.m4539a(hVar.getContactId()) + "','" + C2194b.m4539a(hVar.getFromAccount()) + "','" + hVar.getRecentMessageId() + "','" + hVar.getMsgStatus().getValue() + "','" + hVar.getUnreadCount() + "','" + C2194b.m4539a(hVar.getContent()) + "','" + hVar.getTime() + "','" + hVar.getSessionType().getValue() + "','" + hVar.getTag() + "','" + hVar.mo35057b() + "','" + C2194b.m4539a(hVar.mo35050a()) + "')");
    }

    /* renamed from: a */
    public static void m5031a(List<C2313a> list) {
        C2204c.m4563a().mo34815d().mo34781d().beginTransaction();
        try {
            for (C2313a aVar : list) {
                m5029a(aVar, (MsgStatusEnum) null);
            }
            C2204c.m4563a().mo34815d().mo34781d().setTransactionSuccessful();
        } finally {
            C2204c.m4563a().mo34815d().mo34781d().endTransaction();
        }
    }

    /* renamed from: b */
    public static long m5032b(String str) {
        Cursor b = C2204c.m4563a().mo34815d().mo34778b("SELECT messageid FROM msghistory where uuid='" + str + "'");
        long j = 0;
        if (b != null) {
            if (b.moveToNext()) {
                j = b.getLong(0);
            }
            if (!b.isClosed()) {
                b.close();
            }
        }
        return j;
    }

    /* renamed from: b */
    public static void m5033b(C2313a aVar) {
        m5034b(aVar, null);
    }

    /* renamed from: b */
    public static void m5034b(C2313a aVar, MsgStatusEnum msgStatusEnum) {
        ContentValues c = m5035c(aVar);
        c.put("messageid", Long.valueOf(aVar.mo35004a()));
        if (msgStatusEnum != null) {
            c.put("status", Integer.valueOf(msgStatusEnum.getValue()));
        }
        C2204c.m4563a().mo34815d().mo34777b("msghistory", c);
    }

    /* renamed from: c */
    public static ContentValues m5035c(C2313a aVar) {
        ContentValues contentValues = new ContentValues(16);
        contentValues.put(C3692t.f9678a, aVar.getUuid());
        contentValues.put("serverid", Long.valueOf(aVar.mo35014c()));
        contentValues.put("time", Long.valueOf(aVar.getTime()));
        contentValues.put("content", aVar.getContent());
        contentValues.put("msgtype", Integer.valueOf(aVar.mo35011b()));
        contentValues.put("sessiontype", Integer.valueOf(aVar.getSessionType().getValue()));
        contentValues.put("fromid", aVar.getFromAccount());
        contentValues.put("id", aVar.getSessionId());
        contentValues.put("direct", Integer.valueOf(aVar.getDirect().getValue()));
        contentValues.put("status", Integer.valueOf(aVar.getStatus().getValue()));
        contentValues.put("status2", Integer.valueOf(aVar.getAttachStatus().getValue()));
        contentValues.put("attach", aVar.mo35005a(false));
        contentValues.put("ext", aVar.getExt());
        return contentValues;
    }
}

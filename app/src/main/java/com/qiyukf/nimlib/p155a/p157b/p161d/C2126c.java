package com.qiyukf.nimlib.p155a.p157b.p161d;

import android.text.TextUtils;
import com.qiyukf.nimlib.p155a.C2130c;
import com.qiyukf.nimlib.p155a.p157b.AbstractC2129g;
import com.qiyukf.nimlib.p155a.p162c.AbstractC2131a;
import com.qiyukf.nimlib.p155a.p168d.AbstractC2148a;
import com.qiyukf.nimlib.p155a.p168d.p172d.C2163c;
import com.qiyukf.nimlib.p177c.C2204c;
import com.qiyukf.nimlib.p179d.C2206a;
import com.qiyukf.nimlib.p179d.C2209b;
import com.qiyukf.nimlib.p179d.C2218i;
import com.qiyukf.nimlib.p183g.p191c.p193b.C2293b;
import com.qiyukf.nimlib.p195h.C2313a;
import com.qiyukf.nimlib.p195h.C2314b;
import com.qiyukf.unicorn.C2452d;
import com.qiyukf.unicorn.api.msg.MsgStatusEnum;
import com.qiyukf.unicorn.api.msg.MsgTypeEnum;
import com.qiyukf.unicorn.p232k.C2715m;
import java.util.Locale;

/* renamed from: com.qiyukf.nimlib.a.b.d.c */
public final class C2126c extends AbstractC2129g {
    @Override // com.qiyukf.nimlib.p155a.p157b.AbstractC2111a
    /* renamed from: a */
    public final void mo34639a(AbstractC2148a aVar) {
        long j;
        StringBuilder sb;
        C2293b f = ((C2163c) aVar).mo34706f();
        if (aVar.mo34690b()) {
            j = f.mo34957c(7);
            f.mo34957c(12);
        } else {
            j = 0;
        }
        C2313a aVar2 = null;
        AbstractC2131a a = C2130c.m4323a().mo34653a(aVar);
        if (!(a == null || a.mo34672e() == null || !(a.mo34672e() instanceof C2218i))) {
            C2218i iVar = (C2218i) a.mo34672e();
            iVar.mo34825a(aVar.mo34693e());
            C2206a.m4593c(iVar);
            aVar2 = (C2313a) iVar.mo34832b()[0];
        }
        MsgStatusEnum msgStatusEnum = aVar.mo34690b() ? MsgStatusEnum.success : MsgStatusEnum.fail;
        if (aVar2 != null && C2452d.m5375g().mo36364n(aVar2.getSessionId()) != null && "1".equals(C2452d.m5375g().mo36364n(aVar2.getSessionId()).mo35685a()) && aVar2.getSessionId() != null && C2452d.m5375g().mo36355f(aVar2.getSessionId()) == 0 && ((aVar2.getMsgType() == MsgTypeEnum.text || aVar2.getMsgType() == MsgTypeEnum.image || aVar2.getMsgType() == MsgTypeEnum.file || aVar2.getMsgType() == MsgTypeEnum.video || aVar2.getMsgType() == MsgTypeEnum.custom || aVar2.getMsgType() == MsgTypeEnum.audio) && TextUtils.isEmpty(C2715m.m6277a(aVar2)))) {
            msgStatusEnum = aVar.mo34690b() ? MsgStatusEnum.unread : MsgStatusEnum.fail;
        }
        int value = msgStatusEnum.getValue();
        if (aVar2 != null) {
            if (msgStatusEnum != MsgStatusEnum.fail) {
                long a2 = aVar2.mo35004a();
                if (j > 0) {
                    sb = new StringBuilder("UPDATE msghistory set status='");
                    sb.append(value);
                    sb.append("', time='");
                    sb.append(j);
                    sb.append("', time='");
                    sb.append(j);
                } else {
                    sb = new StringBuilder("UPDATE msghistory set status='");
                    sb.append(value);
                }
                sb.append("' where messageid='");
                sb.append(a2);
                sb.append("'");
                C2204c.m4563a().mo34815d().mo34776a(sb.toString());
                String uuid = aVar2.getUuid();
                int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
                Locale locale = Locale.getDefault();
                C2204c.m4563a().mo34815d().mo34776a(i <= 0 ? String.format(locale, "UPDATE lstmsg set msgstatus='%d' where messageId='%s'", Integer.valueOf(value), uuid) : String.format(locale, "UPDATE lstmsg set msgstatus='%d',time='%d' where messageId='%s'", Integer.valueOf(value), Long.valueOf(j), uuid));
            }
            aVar2.setStatus(msgStatusEnum);
            C2209b.m4598a(aVar2);
            C2314b.m4972a().mo35041b(aVar2.getUuid());
        }
    }
}

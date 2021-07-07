package com.qiyukf.nimlib.p195h;

import android.text.TextUtils;
import com.qiyukf.basesdk.p120b.p121a.p122a.AbstractC1731e;
import com.qiyukf.basesdk.p120b.p121a.p122a.C1730d;
import com.qiyukf.basesdk.p120b.p121a.p122a.C1732f;
import com.qiyukf.basesdk.p120b.p121a.p130c.C1761b;
import com.qiyukf.basesdk.p138c.p142c.C1853d;
import com.qiyukf.nimlib.C2180b;
import com.qiyukf.nimlib.C2205d;
import com.qiyukf.nimlib.p177c.C2204c;
import com.qiyukf.nimlib.p179d.C2206a;
import com.qiyukf.nimlib.p179d.C2209b;
import com.qiyukf.nimlib.p179d.C2218i;
import com.qiyukf.nimlib.p182f.C2244b;
import com.qiyukf.nimlib.p183g.p191c.p193b.C2293b;
import com.qiyukf.nimlib.sdk.msg.constant.AttachStatusEnum;
import com.qiyukf.nimlib.sdk.msg.constant.MsgDirectionEnum;
import com.qiyukf.nimlib.sdk.msg.constant.SessionTypeEnum;
import com.qiyukf.unicorn.api.msg.MsgStatusEnum;
import com.qiyukf.unicorn.api.msg.MsgTypeEnum;
import com.qiyukf.unicorn.api.msg.attachment.FileAttachment;
import com.qiyukf.unicorn.api.msg.attachment.ImageAttachment;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.qiyukf.nimlib.h.c */
public final class C2315c {
    /* renamed from: a */
    public static C1730d m4981a(final C2313a aVar, boolean z, final C2218i iVar) {
        final FileAttachment fileAttachment = (FileAttachment) aVar.getAttachment();
        if (TextUtils.isEmpty(fileAttachment.getUrl())) {
            m4989b(iVar, 414);
            return null;
        }
        String pathForSave = fileAttachment.getPathForSave();
        String a = C1761b.m3245a(fileAttachment.getUrl());
        if (z) {
            if (aVar.getMsgType() == MsgTypeEnum.image) {
                pathForSave = fileAttachment.getThumbPathForSave();
                ImageAttachment imageAttachment = (ImageAttachment) fileAttachment;
                a = C1761b.m3246a(a, imageAttachment.getWidth(), imageAttachment.getHeight());
            } else if (aVar.getMsgType() == MsgTypeEnum.video) {
                pathForSave = fileAttachment.getThumbPathForSave();
                a = C1761b.m3247b(a);
            }
        }
        if (new File(pathForSave).exists()) {
            AttachStatusEnum attachStatus = aVar.getAttachStatus();
            AttachStatusEnum attachStatusEnum = AttachStatusEnum.transferred;
            if (attachStatus == attachStatusEnum) {
                m4989b(iVar, 414);
            } else {
                m4990b(aVar, attachStatusEnum);
                m4989b(iVar, 200);
            }
            return null;
        }
        m4990b(aVar, AttachStatusEnum.transferring);
        C1730d dVar = new C1730d(a, pathForSave, new AbstractC1731e() {
            /* class com.qiyukf.nimlib.p195h.C2315c.C23161 */

            /* renamed from: d */
            public long f4641d = fileAttachment.getSize();

            @Override // com.qiyukf.basesdk.p120b.p121a.p122a.AbstractC1731e
            /* renamed from: a */
            public final void mo33899a() {
                C2315c.m4990b(aVar, AttachStatusEnum.transferred);
                C2315c.m4989b(iVar, 200);
            }

            @Override // com.qiyukf.basesdk.p120b.p121a.p122a.AbstractC1731e
            /* renamed from: a */
            public final void mo33900a(long j) {
                C2209b.m4600a(aVar.getUuid(), j, this.f4641d);
            }

            @Override // com.qiyukf.basesdk.p120b.p121a.p122a.AbstractC1731e
            /* renamed from: b */
            public final void mo33901b() {
                C2315c.m4990b(aVar, AttachStatusEnum.fail);
                C2315c.m4989b(iVar, 500);
            }

            @Override // com.qiyukf.basesdk.p120b.p121a.p122a.AbstractC1731e
            /* renamed from: b */
            public final void mo33902b(long j) {
                this.f4641d = j;
            }

            @Override // com.qiyukf.basesdk.p120b.p121a.p122a.AbstractC1731e
            /* renamed from: c */
            public final void mo33903c() {
                C2315c.m4990b(aVar, AttachStatusEnum.fail);
            }
        });
        C1732f.m3104a().mo33905a(dVar);
        return dVar;
    }

    /* renamed from: a */
    public static C2313a m4982a(C2293b bVar, boolean z) {
        String a = bVar.mo34953a(11);
        boolean z2 = true;
        if (bVar.mo34956b(13) == 1 && !TextUtils.isEmpty(a) && C2323f.m5032b(a) != 0) {
            a = null;
        } else if (TextUtils.isEmpty(a)) {
            a = C1853d.m3518b();
        }
        if (TextUtils.isEmpty(a)) {
            return null;
        }
        String a2 = bVar.mo34953a(2);
        int b = bVar.mo34956b(0);
        String a3 = m4984a(bVar);
        int b2 = bVar.mo34956b(8);
        C2313a aVar = new C2313a();
        aVar.mo35010a(bVar.mo34953a(11));
        aVar.mo35012b(bVar.mo34957c(12));
        aVar.setFromAccount(a2);
        aVar.mo35013b(a3);
        aVar.setTime(bVar.mo34957c(7));
        aVar.mo35008a(SessionTypeEnum.typeOfValue(b));
        aVar.mo35006a(b2);
        aVar.setContent(bVar.mo34953a(9));
        aVar.mo35015c(bVar.mo34953a(10));
        aVar.setExt(bVar.mo34953a(15));
        aVar.setStatus(MsgStatusEnum.success);
        aVar.setAttachStatus(AttachStatusEnum.def);
        int b3 = bVar.mo34956b(4);
        boolean equals = C2180b.m4477b().equals(aVar.getFromAccount());
        if (C2180b.m4477b().equals(aVar.getFromAccount()) && C2180b.m4477b().equals(aVar.getSessionId())) {
            if (!(b3 == 1 || b3 == 2 || b3 == 8)) {
                z2 = false;
            }
            equals = z2;
        }
        aVar.setDirect(equals ? MsgDirectionEnum.Out : MsgDirectionEnum.In);
        if (z) {
            C2323f.m5028a(aVar);
        }
        return aVar;
    }

    /* renamed from: a */
    public static C2326h m4983a(ArrayList<C2313a> arrayList, String str) {
        C2313a aVar = arrayList.get(arrayList.size() - 1);
        boolean equals = C2324g.m5043a(aVar.getSessionId(), aVar.getSessionType().getValue()).equals(C2205d.m4581d());
        m4988a(arrayList);
        Iterator<C2313a> it = arrayList.iterator();
        int i = 0;
        while (it.hasNext()) {
            C2313a next = it.next();
            if (!equals && m4991b(next)) {
                i++;
            }
        }
        C2209b.m4601a(arrayList);
        if (i > 0) {
            C2313a aVar2 = null;
            int size = arrayList.size() - 1;
            while (true) {
                if (size < 0) {
                    break;
                } else if (m4991b(arrayList.get(size))) {
                    aVar2 = arrayList.get(size);
                    break;
                } else {
                    size--;
                }
            }
            if (aVar2 != null) {
                C2244b.m4694a(aVar2, str, i);
            }
        }
        return C2324g.m5038a(aVar, i);
    }

    /* renamed from: a */
    public static String m4984a(C2293b bVar) {
        int b = bVar.mo34956b(0);
        String a = bVar.mo34953a(2);
        String a2 = bVar.mo34953a(1);
        return ((b == 0 || b == 2) && !a.equals(C2180b.m4477b())) ? a : a2;
    }

    /* renamed from: a */
    public static void m4986a(C2313a aVar) {
        C2323f.m5028a(aVar);
        ArrayList arrayList = new ArrayList();
        arrayList.add(aVar);
        C2209b.m4599a(m4983a(arrayList, ""));
    }

    /* renamed from: a */
    public static void m4988a(ArrayList<C2313a> arrayList) {
        Iterator<C2313a> it = arrayList.iterator();
        while (it.hasNext()) {
            C2313a next = it.next();
            if (C2180b.m4479d().preloadAttach && next.getMsgType() != MsgTypeEnum.custom && next.getAttachment() != null && next.getAttachment().getClass().getSuperclass().equals(FileAttachment.class)) {
                m4981a(next, true, null);
            }
        }
    }

    /* renamed from: b */
    public static void m4989b(C2218i iVar, int i) {
        if (iVar != null) {
            iVar.mo34825a(i);
            C2206a.m4593c(iVar);
        }
    }

    /* renamed from: b */
    public static void m4990b(C2313a aVar, AttachStatusEnum attachStatusEnum) {
        aVar.setAttachStatus(attachStatusEnum);
        if (attachStatusEnum == AttachStatusEnum.transferring) {
            C2314b.m4972a().mo35044d(aVar.getUuid());
        } else {
            C2314b.m4972a().mo35045e(aVar.getUuid());
            long a = aVar.mo35004a();
            int value = attachStatusEnum.getValue();
            C2204c.m4563a().mo34815d().mo34776a("UPDATE msghistory set status2='" + value + "' where messageid='" + a + "'");
        }
        C2209b.m4598a(aVar);
    }

    /* renamed from: b */
    public static boolean m4991b(C2313a aVar) {
        if (aVar.getDirect() == MsgDirectionEnum.Out) {
            return false;
        }
        return aVar.getAttachment() != null ? aVar.getAttachment().countToUnread() : aVar.getMsgType() != MsgTypeEnum.notification;
    }
}

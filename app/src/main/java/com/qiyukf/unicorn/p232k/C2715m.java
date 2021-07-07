package com.qiyukf.unicorn.p232k;

import com.qiyukf.basesdk.p138c.C1810b;
import com.qiyukf.nimlib.sdk.msg.constant.MsgDirectionEnum;
import com.qiyukf.nimlib.sdk.msg.model.IMMessage;
import com.qiyukf.unicorn.api.msg.MsgTypeEnum;
import com.qiyukf.unicorn.p213f.p214a.p220d.C2581p;

/* renamed from: com.qiyukf.unicorn.k.m */
public final class C2715m {
    /* renamed from: a */
    public static String m6277a(IMMessage iMMessage) {
        if (iMMessage.getDirect() != MsgDirectionEnum.Out) {
            return null;
        }
        if ((iMMessage.getMsgType() == MsgTypeEnum.text || iMMessage.getMsgType() == MsgTypeEnum.image || (iMMessage.getAttachment() instanceof C2581p)) && C1810b.m3427b(iMMessage.getExtension(), "auditResult") == 1) {
            return "消息包含违禁信息，发送失败";
        }
        return null;
    }
}

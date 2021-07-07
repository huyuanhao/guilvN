package com.qiyukf.nim.uikit.session.module;

import com.qiyukf.nimlib.sdk.msg.model.IMMessage;

/* renamed from: com.qiyukf.nim.uikit.session.module.b */
public interface AbstractC2048b {
    boolean isAllowSendMessage(boolean z);

    boolean isLongClickEnabled();

    void saveMessageToLocal(IMMessage iMMessage, boolean z, boolean z2);

    boolean sendMessage(IMMessage iMMessage, boolean z);

    void shouldCollapseInputPanel();
}

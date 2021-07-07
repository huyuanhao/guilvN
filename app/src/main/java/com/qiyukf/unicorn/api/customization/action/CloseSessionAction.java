package com.qiyukf.unicorn.api.customization.action;

import com.qiyukf.basesdk.p138c.p143d.C1865f;
import com.qiyukf.unicorn.api.event.EventService;

public class CloseSessionAction extends BaseAction {
    public int actionFontColor = 0;

    public CloseSessionAction(int i, int i2) {
        super(i, i2);
    }

    public CloseSessionAction(int i, String str) {
        super(i, str);
    }

    public CloseSessionAction(String str, String str2) {
        super(str, str2);
    }

    @Override // com.qiyukf.unicorn.api.customization.action.BaseAction
    public int getActionFontColor() {
        int i = this.actionFontColor;
        return i == 0 ? super.getActionFontColor() : i;
    }

    @Override // com.qiyukf.unicorn.api.customization.action.BaseAction
    public void onClick() {
        if (!EventService.closeSession(getAccount(), "您已退出会话")) {
            C1865f.m3557a("您已退出咨询");
        }
    }

    public void setActionFontColor(int i) {
        this.actionFontColor = i;
    }
}

package com.qiyukf.unicorn.api.customization.action;

import com.qiyukf.basesdk.p138c.p143d.C1865f;
import com.qiyukf.nimlib.sdk.RequestCallbackWrapper;
import com.qiyukf.unicorn.api.event.EventService;

public class EvaluationAction extends BaseAction {
    public int actionFontColor = 0;

    public EvaluationAction(int i, int i2) {
        super(i, i2);
    }

    public EvaluationAction(int i, String str) {
        super(i, str);
    }

    public EvaluationAction(String str, String str2) {
        super(str, str2);
    }

    @Override // com.qiyukf.unicorn.api.customization.action.BaseAction
    public int getActionFontColor() {
        int i = this.actionFontColor;
        return i == 0 ? super.getActionFontColor() : i;
    }

    @Override // com.qiyukf.unicorn.api.customization.action.BaseAction
    public void onClick() {
        EventService.openEvaluation(getActivity(), getAccount(), new RequestCallbackWrapper() {
            /* class com.qiyukf.unicorn.api.customization.action.EvaluationAction.C24121 */

            @Override // com.qiyukf.nimlib.sdk.RequestCallbackWrapper
            public void onResult(int i, Object obj, Throwable th) {
                C1865f.m3557a("评价成功");
            }
        });
    }

    public void setActionFontColor(int i) {
        this.actionFontColor = i;
    }
}

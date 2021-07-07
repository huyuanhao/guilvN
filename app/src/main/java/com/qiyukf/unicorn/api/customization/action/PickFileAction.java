package com.qiyukf.unicorn.api.customization.action;

import android.content.Intent;
import com.qiyukf.unicorn.api.helper.UnicornPickFileHelper;

public class PickFileAction extends BaseAction {
    public int actionFontColor = 0;

    public PickFileAction(int i, int i2) {
        super(i, i2);
    }

    public PickFileAction(int i, String str) {
        super(i, str);
    }

    public PickFileAction(String str, String str2) {
        super(str, str2);
    }

    @Override // com.qiyukf.unicorn.api.customization.action.BaseAction
    public int getActionFontColor() {
        int i = this.actionFontColor;
        return i == 0 ? super.getActionFontColor() : i;
    }

    @Override // com.qiyukf.unicorn.api.customization.action.BaseAction
    public void onActivityResult(int i, int i2, Intent intent) {
        if (i == 13 && i2 == -1) {
            UnicornPickFileHelper.onPickFileResult(getActivity(), intent);
        }
    }

    @Override // com.qiyukf.unicorn.api.customization.action.BaseAction
    public void onClick() {
        UnicornPickFileHelper.goPickFileActivity(getFragment(), makeRequestCode(13));
    }

    public void setActionFontColor(int i) {
        this.actionFontColor = i;
    }
}

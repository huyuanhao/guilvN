package com.qiyukf.unicorn.api.customization.action;

import android.content.Intent;
import com.qiyukf.unicorn.api.helper.UnicornWorkSheetHelper;

public class WorkSheetAction extends BaseAction {
    public int actionFontColor = 0;
    public UnicornWorkSheetHelper helper;
    public long templateId;

    public WorkSheetAction(int i, int i2) {
        super(i, i2);
    }

    public WorkSheetAction(int i, String str) {
        super(i, str);
    }

    public WorkSheetAction(String str, String str2) {
        super(str, str2);
    }

    private UnicornWorkSheetHelper getHelper() {
        if (this.helper == null) {
            this.helper = new UnicornWorkSheetHelper(getFragment());
        }
        return this.helper;
    }

    @Override // com.qiyukf.unicorn.api.customization.action.BaseAction
    public int getActionFontColor() {
        int i = this.actionFontColor;
        return i == 0 ? super.getActionFontColor() : i;
    }

    @Override // com.qiyukf.unicorn.api.customization.action.BaseAction
    public void onActivityResult(int i, int i2, Intent intent) {
        this.helper.onResultWorkSheet(makeRequestCode(i), intent);
    }

    @Override // com.qiyukf.unicorn.api.customization.action.BaseAction
    public void onClick() {
        if (this.templateId != 0) {
            getHelper().openWorkSheetDialog(this.templateId, getAccount(), makeRequestCode(20), makeRequestCode(19), null);
        }
    }

    public void setActionFontColor(int i) {
        this.actionFontColor = i;
    }

    public void setTemplateId(long j) {
        this.templateId = j;
    }
}

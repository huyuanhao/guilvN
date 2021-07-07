package com.qiyukf.unicorn.api.customization.action;

import com.qiyukf.nim.uikit.session.p151a.AbstractC1937a;
import com.qiyukf.unicorn.C2364R;
import com.qiyukf.unicorn.api.msg.MessageService;
import java.io.File;

public class ImageAction extends AbstractC1937a {
    public int actionFontColor = 0;

    public ImageAction() {
        super(C2364R.C2366drawable.ysf_message_plus_photo_selector, C2364R.string.ysf_input_panel_photo, true);
    }

    public ImageAction(int i, int i2) {
        super(i, i2, true);
    }

    public ImageAction(int i, String str) {
        super(i, str, true);
    }

    public ImageAction(String str, String str2) {
        super(str, str2, true);
    }

    @Override // com.qiyukf.unicorn.api.customization.action.BaseAction
    public int getActionFontColor() {
        int i = this.actionFontColor;
        return i == 0 ? super.getActionFontColor() : i;
    }

    @Override // com.qiyukf.nim.uikit.session.p151a.AbstractC1937a
    public void onPicked(File file) {
        MessageService.sendMessage(buidlImageMessage(file));
    }

    public void setActionFontColor(int i) {
        this.actionFontColor = i;
    }
}

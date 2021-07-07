package com.qiyukf.unicorn.api.customization.action;

import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.qiyukf.unicorn.C2452d;
import com.qiyukf.unicorn.api.OnMessageItemClickListener;

public class LinkClickAction extends BaseAction {
    public int actionFontColor = 0;
    public String url;

    public LinkClickAction(int i, int i2) {
        super(i, i2);
    }

    public LinkClickAction(int i, String str) {
        super(i, str);
    }

    public LinkClickAction(String str, String str2) {
        super(str, str2);
    }

    @Override // com.qiyukf.unicorn.api.customization.action.BaseAction
    public int getActionFontColor() {
        int i = this.actionFontColor;
        return i == 0 ? super.getActionFontColor() : i;
    }

    @Override // com.qiyukf.unicorn.api.customization.action.BaseAction
    public void onClick() {
        if (!TextUtils.isEmpty(this.url)) {
            OnMessageItemClickListener onMessageItemClickListener = C2452d.m5373e().onMessageItemClickListener;
            if (onMessageItemClickListener != null) {
                onMessageItemClickListener.onURLClicked(getActivity(), this.url);
                return;
            }
            getActivity().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(this.url)));
        }
    }

    public void setActionFontColor(int i) {
        this.actionFontColor = i;
    }

    public void setUrl(String str) {
        this.url = str;
    }
}

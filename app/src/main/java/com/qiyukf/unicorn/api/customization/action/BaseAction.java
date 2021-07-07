package com.qiyukf.unicorn.api.customization.action;

import android.app.Activity;
import android.content.Intent;
import androidx.fragment.app.Fragment;
import com.qiyukf.nim.uikit.session.module.C2023a;
import com.qiyukf.nimlib.sdk.msg.model.IMMessage;
import com.qiyukf.unicorn.api.msg.UnicornMessageBuilder;
import java.io.File;
import java.io.Serializable;

public abstract class BaseAction implements Serializable {
    public transient C2023a container;
    public int iconResId;
    public String imageUrl;
    public transient int index;
    public String title;
    public int titleId;

    public BaseAction(int i, int i2) {
        this.iconResId = i;
        this.titleId = i2;
    }

    public BaseAction(int i, String str) {
        this.title = str;
        this.iconResId = i;
    }

    public BaseAction(String str, String str2) {
        this.title = str2;
        this.imageUrl = str;
    }

    public final IMMessage buidlImageMessage(File file) {
        return UnicornMessageBuilder.buildImageMessage(getAccount(), file, file.getName());
    }

    public final IMMessage buildTextMessage(String str) {
        return UnicornMessageBuilder.buildTextMessage(getAccount(), str);
    }

    public final String getAccount() {
        return this.container.f3993c;
    }

    public int getActionFontColor() {
        return 6710886;
    }

    public final Activity getActivity() {
        return this.container.f3991a;
    }

    public final Fragment getFragment() {
        return this.container.f3992b;
    }

    public int getIconResId() {
        return this.iconResId;
    }

    public String getImageUrl() {
        return this.imageUrl;
    }

    public String getTitle() {
        return this.title;
    }

    public int getTitleId() {
        return this.titleId;
    }

    public final int makeRequestCode(int i) {
        if ((i & -256) == 0) {
            return ((this.index + 1) << 8) + (i & 255);
        }
        throw new IllegalArgumentException("Can only use lower 8 bits for requestCode");
    }

    public void onActivityResult(int i, int i2, Intent intent) {
    }

    public abstract void onClick();

    public void setContainer(C2023a aVar) {
        this.container = aVar;
    }

    public void setIndex(int i) {
        this.index = i;
    }
}

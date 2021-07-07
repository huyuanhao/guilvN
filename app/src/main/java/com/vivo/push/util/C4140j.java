package com.vivo.push.util;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;

/* renamed from: com.vivo.push.util.j */
public final class C4140j implements BaseNotifyLayoutAdapter {

    /* renamed from: a */
    public Resources f11102a;

    /* renamed from: b */
    public String f11103b;

    @Override // com.vivo.push.util.BaseNotifyLayoutAdapter
    public final int getNotificationLayout() {
        return this.f11102a.getIdentifier("push_notify", "layout", this.f11103b);
    }

    @Override // com.vivo.push.util.BaseNotifyLayoutAdapter
    public final int getSuitIconId() {
        Resources resources;
        String str;
        String str2;
        if (C4141k.f11110g) {
            resources = this.f11102a;
            str = this.f11103b;
            str2 = "notify_icon_rom30";
        } else if (C4141k.f11109f) {
            resources = this.f11102a;
            str = this.f11103b;
            str2 = "notify_icon_rom20";
        } else {
            resources = this.f11102a;
            str = this.f11103b;
            str2 = "notify_icon";
        }
        return resources.getIdentifier(str2, "id", str);
    }

    @Override // com.vivo.push.util.BaseNotifyLayoutAdapter
    public final int getTitleColor() {
        int i;
        try {
            i = ((Integer) C4156z.m11257a("com.android.internal.R$color", "vivo_notification_title_text_color")).intValue();
        } catch (Exception e) {
            e.printStackTrace();
            i = 0;
        }
        if (i > 0) {
            return this.f11102a.getColor(i);
        }
        if (C4141k.f11110g) {
            return -1;
        }
        if (!C4141k.f11109f) {
            return -16777216;
        }
        if (C4141k.f11110g) {
            return Color.parseColor("#ff999999");
        }
        return -1;
    }

    @Override // com.vivo.push.util.BaseNotifyLayoutAdapter
    public final void init(Context context) {
        this.f11103b = context.getPackageName();
        this.f11102a = context.getResources();
    }
}

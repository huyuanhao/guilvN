package com.huawei.hms.support.api.entity.core;

import android.content.Intent;
import com.huawei.hms.core.aidl.p038a.AbstractC1143a;

public class JosGetNoticeResp extends JosBaseResp {
    @AbstractC1143a
    public Intent noticeIntent;

    public static <T> T get(T t) {
        return t;
    }

    public Intent getNoticeIntent() {
        return (Intent) get(this.noticeIntent);
    }

    public void setNoticeIntent(Intent intent) {
        this.noticeIntent = intent;
    }
}

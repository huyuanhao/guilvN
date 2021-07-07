package com.tencent.bugly.beta.tinker;

import android.app.Application;
import android.content.Intent;
import com.tencent.tinker.entry.ApplicationLike;
import com.tencent.tinker.entry.DefaultApplicationLike;

public class TinkerApplicationLike extends DefaultApplicationLike {
    public static final String TAG = "Tinker.TinkerApplicationLike";
    public static ApplicationLike tinkerPatchApplicationLike;

    public TinkerApplicationLike(Application application, int i, boolean z, long j, long j2, Intent intent) {
        super(application, i, z, j, j2, intent);
        setTinkerPatchApplicationLike(this);
    }

    public static ApplicationLike getTinkerPatchApplicationLike() {
        return tinkerPatchApplicationLike;
    }

    public static void setTinkerPatchApplicationLike(ApplicationLike applicationLike) {
        tinkerPatchApplicationLike = applicationLike;
    }
}

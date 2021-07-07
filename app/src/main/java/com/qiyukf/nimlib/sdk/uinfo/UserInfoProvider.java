package com.qiyukf.nimlib.sdk.uinfo;

import android.graphics.Bitmap;
import java.io.Serializable;

public interface UserInfoProvider extends Serializable {

    public interface UserInfo extends Serializable {
        String getAccount();

        String getAvatar();

        String getName();
    }

    int getDefaultIconResId();

    Bitmap getTeamIcon(String str);

    UserInfo getUserInfo(String str);
}

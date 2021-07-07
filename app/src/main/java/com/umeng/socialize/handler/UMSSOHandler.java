package com.umeng.socialize.handler;

import android.app.Activity;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;
import com.p118pd.sdk.C7031o000oo0O;
import com.umeng.message.proguard.C3848l;
import com.umeng.socialize.PlatformConfig;
import com.umeng.socialize.ShareContent;
import com.umeng.socialize.UMAuthListener;
import com.umeng.socialize.UMShareConfig;
import com.umeng.socialize.UMShareListener;
import com.umeng.socialize.bean.SHARE_MEDIA;
import com.umeng.socialize.bean.StringName;
import com.umeng.socialize.utils.ContextUtil;
import com.umeng.socialize.utils.SLog;
import com.umeng.socialize.utils.UmengText;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.Map;

public abstract class UMSSOHandler {
    public static final String ACCESSTOKEN = "accessToken";
    public static final String ACCESS_SECRET = "access_secret";
    public static final String ACCESS_TOKEN = "access_token";
    public static final String CITY = "city";
    public static final String COUNTRY = "country";
    public static final String EMAIL = "email";
    public static final String EXPIRATION = "expiration";
    public static final String EXPIRES_IN = "expires_in";
    public static final String FIRST_NAME = "first_name";
    public static final String GENDER = "gender";
    public static final String ICON = "iconurl";

    /* renamed from: ID */
    public static final String f10739ID = "id";
    public static final String JSON = "json";
    public static final String LAST_NAME = "last_name";
    public static final String MIDDLE_NAME = "middle_name";
    public static final String NAME = "name";
    public static final String OPENID = "openid";
    @Deprecated
    public static final String PROFILE_IMAGE_URL = "profile_image_url";
    public static final String PROVINCE = "province";
    public static final String REFRESHTOKEN = "refreshToken";
    public static final String REFRESH_TOKEN = "refresh_token";
    public static final String REGION = "region";
    @Deprecated
    public static final String SCREEN_NAME = "screen_name";
    public static final String UID = "uid";
    public static final String UNIONID = "unionid";
    public static final String USID = "usid";
    public static final UMShareConfig mDefaultShareConfig = new UMShareConfig();
    public String VERSION = "";
    public boolean isInit = false;
    public PlatformConfig.Platform mConfig = null;
    public Context mContext = null;
    public UMShareConfig mShareConfig;
    public int mThumbLimit = 32768;
    public WeakReference<Activity> mWeakAct;

    public void authorize(UMAuthListener uMAuthListener) {
    }

    public void deleteAuth(UMAuthListener uMAuthListener) {
    }

    public UMAuthListener getAuthListener(UMAuthListener uMAuthListener) {
        return uMAuthListener != null ? uMAuthListener : new UMAuthListener() {
            /* class com.umeng.socialize.handler.UMSSOHandler.C39352 */

            @Override // com.umeng.socialize.UMAuthListener
            public void onCancel(SHARE_MEDIA share_media, int i) {
                SLog.m10856E(UmengText.CHECK.LISTENRNULL);
            }

            @Override // com.umeng.socialize.UMAuthListener
            public void onComplete(SHARE_MEDIA share_media, int i, Map<String, String> map) {
                SLog.m10856E(UmengText.CHECK.LISTENRNULL);
            }

            @Override // com.umeng.socialize.UMAuthListener
            public void onError(SHARE_MEDIA share_media, int i, Throwable th) {
                SLog.m10856E(UmengText.CHECK.LISTENRNULL);
            }

            @Override // com.umeng.socialize.UMAuthListener
            public void onStart(SHARE_MEDIA share_media) {
            }
        };
    }

    public PlatformConfig.Platform getConfig() {
        return this.mConfig;
    }

    public Context getContext() {
        return this.mContext;
    }

    public String getGender(Object obj) {
        String str = StringName.male;
        String str2 = StringName.female;
        if (obj == null) {
            return "";
        }
        if (obj instanceof String) {
            if (obj.equals(C7031o000oo0O.OooO0O0) || obj.equals("1") || obj.equals("男")) {
                return str;
            }
            return (obj.equals("f") || obj.equals("0") || obj.equals("女")) ? str2 : obj.toString();
        } else if (!(obj instanceof Integer)) {
            return obj.toString();
        } else {
            Integer num = (Integer) obj;
            if (num.intValue() == 1) {
                return str;
            }
            if (num.intValue() == 0) {
                return str2;
            }
            return obj.toString();
        }
    }

    public Uri getImageContentUri(File file) {
        String absolutePath = file.getAbsolutePath();
        Context applicationContext = this.mContext.getApplicationContext();
        Cursor query = applicationContext.getContentResolver().query(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, new String[]{C3848l.f10389g}, "_data=? ", new String[]{absolutePath}, null);
        if (query != null && query.moveToFirst()) {
            int i = query.getInt(query.getColumnIndex(C3848l.f10389g));
            Uri parse = Uri.parse("content://media/external/images/media");
            return Uri.withAppendedPath(parse, "" + i);
        } else if (!file.exists()) {
            return null;
        } else {
            ContentValues contentValues = new ContentValues();
            contentValues.put("_data", absolutePath);
            return applicationContext.getContentResolver().insert(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, contentValues);
        }
    }

    public void getPlatformInfo(UMAuthListener uMAuthListener) {
    }

    public int getRequestCode() {
        return 0;
    }

    public String getSDKVersion() {
        return "";
    }

    public final UMShareConfig getShareConfig() {
        UMShareConfig uMShareConfig = this.mShareConfig;
        return uMShareConfig == null ? mDefaultShareConfig : uMShareConfig;
    }

    public UMShareListener getShareListener(UMShareListener uMShareListener) {
        return uMShareListener != null ? uMShareListener : new UMShareListener() {
            /* class com.umeng.socialize.handler.UMSSOHandler.C39341 */

            @Override // com.umeng.socialize.UMShareListener
            public void onCancel(SHARE_MEDIA share_media) {
                SLog.m10856E(UmengText.CHECK.LISTENRNULL);
            }

            @Override // com.umeng.socialize.UMShareListener
            public void onError(SHARE_MEDIA share_media, Throwable th) {
                SLog.m10856E(UmengText.CHECK.LISTENRNULL);
            }

            @Override // com.umeng.socialize.UMShareListener
            public void onResult(SHARE_MEDIA share_media) {
                SLog.m10856E(UmengText.CHECK.LISTENRNULL);
            }

            @Override // com.umeng.socialize.UMShareListener
            public void onStart(SHARE_MEDIA share_media) {
            }
        };
    }

    public abstract String getVersion();

    public boolean isAuthorize() {
        SLog.m10856E(UmengText.CHECK.NO_SUPPORT_AUTH);
        return true;
    }

    public boolean isHasAuthListener() {
        return true;
    }

    public boolean isInstall() {
        SLog.m10856E(UmengText.CHECK.NO_SUPPORT_INSTALL);
        return true;
    }

    public boolean isSupport() {
        SLog.m10856E(UmengText.CHECK.NO_SUPPORT_SDKL);
        return true;
    }

    public boolean isSupportAuth() {
        return false;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
    }

    public void onCreate(Context context, PlatformConfig.Platform platform) {
        SLog.m10856E("xxxxxx UMSSOHandler 7.0.2");
        this.mContext = ContextUtil.getContext();
        this.mConfig = platform;
        if (context instanceof Activity) {
            this.mWeakAct = new WeakReference<>((Activity) context);
        }
        if (!this.isInit) {
            SLog.mutlI(UmengText.INTER.PINFO, UmengText.INTER.getVersion(platform.getName().getName()) + getVersion(), UmengText.INTER.HANDLERID + toString());
            this.isInit = true;
        }
    }

    public void onResume() {
    }

    public void release() {
    }

    public void setAuthListener(UMAuthListener uMAuthListener) {
    }

    public final void setShareConfig(UMShareConfig uMShareConfig) {
        this.mShareConfig = uMShareConfig;
    }

    public abstract boolean share(ShareContent shareContent, UMShareListener uMShareListener);
}

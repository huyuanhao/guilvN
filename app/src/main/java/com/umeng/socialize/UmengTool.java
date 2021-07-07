package com.umeng.socialize;

import android.annotation.TargetApi;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import com.tencent.p269mm.opensdk.channel.MMessageActV2;
import com.umeng.commonsdk.utils.UMUtils;
import com.umeng.socialize.PlatformConfig;
import com.umeng.socialize.bean.SHARE_MEDIA;
import com.umeng.socialize.utils.ContextUtil;
import com.umeng.socialize.utils.SLog;
import com.umeng.socialize.utils.UmengText;
import com.xiaomi.mipush.sdk.Constants;

public class UmengTool {
    public static void checkAlipay(Context context) {
        String packageName = context.getPackageName();
        String str = packageName + ".apshare.ShareEntryActivity";
        if (!UMUtils.checkPath(packageName + ".apshare.ShareEntryActivity")) {
            SLog.m10856E(UmengText.CHECK.ALIPAYERROR);
        } else {
            SLog.m10856E(UmengText.CHECK.ALIPAYSUCCESS);
        }
    }

    @TargetApi(9)
    public static String checkFBByself(Context context) {
        if (!UMUtils.checkAndroidManifest(context, "com.umeng.facebook.FacebookActivity")) {
            return UmengText.FACEBOOK.NOFACEBOOKACTIVITY;
        }
        if (!UMUtils.checkMetaData(context, "com.facebook.sdk.ApplicationId")) {
            return UmengText.FACEBOOK.NOMETA;
        }
        if (!UMUtils.checkResource(context, "facebook_app_id", "string")) {
            return UmengText.FACEBOOK.ERRORMETA;
        }
        return UmengText.CHECK.checkSuccess(UMUtils.getAppHashKey(context), ContextUtil.getPackageName());
    }

    public static void checkFacebook(Context context) {
        showDialog(context, checkFBByself(context));
    }

    public static String checkKakao(Context context) {
        String packageName = context.getPackageName();
        context.getPackageManager();
        if (TextUtils.isEmpty(packageName)) {
            return "包名为空";
        }
        try {
            context.getPackageManager().getPackageInfo(context.getPackageName(), 64);
            return "kakao 配置正确，请检查kakao后台签名:" + UMUtils.getAppHashKey(context);
        } catch (PackageManager.NameNotFoundException unused) {
            return "签名获取失败";
        }
    }

    public static String checkLinkin(Context context) {
        String packageName = context.getPackageName();
        context.getPackageManager();
        if (TextUtils.isEmpty(packageName)) {
            return "包名为空";
        }
        try {
            context.getPackageManager().getPackageInfo(context.getPackageName(), 64);
            return "领英 配置正确，请检查领英后台签名:" + UMUtils.getAppHashKey(context);
        } catch (PackageManager.NameNotFoundException unused) {
            return "签名获取失败";
        }
    }

    public static void checkQQ(Context context) {
        showDialog(context, checkQQByself(context));
    }

    public static String checkQQByself(Context context) {
        if (!UMUtils.checkAndroidManifest(context, "com.tencent.tauth.AuthActivity")) {
            return UmengText.C4007QQ.getError("com.tencent.tauth.AuthActivity");
        }
        if (!UMUtils.checkAndroidManifest(context, "com.tencent.connect.common.AssistActivity")) {
            return UmengText.C4007QQ.getError("com.tencent.connect.common.AssistActivity");
        }
        if (!UMUtils.checkPermission(context, "android.permission.WRITE_EXTERNAL_STORAGE")) {
            return UmengText.C4007QQ.ADDPERMISSION;
        }
        return !UMUtils.checkIntentFilterData(context, ((PlatformConfig.APPIDPlatform) PlatformConfig.getPlatform(SHARE_MEDIA.QQ)).appId) ? UmengText.C4007QQ.ERRORDATA : "qq配置正确";
    }

    public static void checkSina(Context context) {
        showDialog(context, checkSinaBySelf(context));
    }

    public static String checkSinaBySelf(Context context) {
        String packageName = context.getPackageName();
        String appMD5Signature = UMUtils.getAppMD5Signature(context);
        if (!UMUtils.checkAndroidManifest(context, "com.umeng.socialize.media.WBShareCallBackActivity")) {
            return UmengText.SINA.SINA_CALLBACKACTIVITY;
        }
        if (!UMUtils.checkAndroidManifest(context, "com.sina.weibo.sdk.web.WeiboSdkWebActivity")) {
            return UmengText.SINA.SINA_WEBACTIVITY;
        }
        if (!UMUtils.checkAndroidManifest(context, "com.sina.weibo.sdk.share.WbShareTransActivity")) {
            return UmengText.SINA.SINA_TRANSACTIVITY;
        }
        return UmengText.CHECK.checkSuccess(appMD5Signature.toLowerCase(), packageName);
    }

    public static void checkVK(Context context) {
        showDialog(context, checkVKByself(context));
    }

    public static String checkVKByself(Context context) {
        context.getPackageName();
        String appSHA1Key = UMUtils.getAppSHA1Key(context);
        return "你使用的签名：" + appSHA1Key.replace(Constants.COLON_SEPARATOR, "");
    }

    public static void checkWx(Context context) {
        showDialog(context, checkWxBySelf(context));
    }

    public static String checkWxBySelf(Context context) {
        String packageName = context.getPackageName();
        String str = packageName + MMessageActV2.DEFAULT_ENTRY_CLASS_NAME;
        if (!UMUtils.checkPath(str)) {
            return UmengText.C4008WX.WX_ERRORACTIVITY;
        }
        String appMD5Signature = UMUtils.getAppMD5Signature(context);
        if (UMUtils.checkAndroidManifest(context, str)) {
            return UmengText.CHECK.checkSuccess(appMD5Signature.toLowerCase(), packageName);
        }
        return UmengText.C4008WX.WX_ERRORMANIFEST;
    }

    public static void getSignature(Context context) {
        showDialog(context, "包名：" + ContextUtil.getPackageName() + "\n签名:" + UMUtils.getAppMD5Signature(context) + "\nfacebook keyhash:" + UMUtils.getAppHashKey(context));
    }

    public static String getStrRedicrectUrl() {
        return ((PlatformConfig.APPIDPlatform) PlatformConfig.configs.get(SHARE_MEDIA.SINA)).redirectUrl;
    }

    public static void showDialog(Context context, String str) {
        new AlertDialog.Builder(context).setTitle("友盟Debug模式自检").setMessage(str).setPositiveButton("关闭", (DialogInterface.OnClickListener) null).show();
    }
}

package com.umeng.socialize;

import com.umeng.commonsdk.UMConfigure;

public class Config {
    public static String Descriptor = "com.umeng.share";
    public static String EntityKey = "-1";
    public static String EntityName = "share";
    @Deprecated
    public static int KaKaoLoginType = 0;
    @Deprecated
    public static int LinkedInProfileScope = 0;
    @Deprecated
    public static int LinkedInShareCode = 0;
    public static final int MINIPTOGRAM_TYPE_RELEASE = 0;
    public static String MORE_TITLE = "分享";
    @Deprecated
    public static boolean OpenEditor = true;
    @Deprecated
    public static String QQAPPNAME = "";
    @Deprecated
    public static int QQWITHQZONE = 2;
    public static String SessionId = null;

    /* renamed from: a */
    public static int f10614a = 0;
    @Deprecated
    public static String appName;
    public static int connectionTimeOut = 30000;
    public static boolean isFacebookRead = false;
    public static boolean isJumptoAppStore = false;
    @Deprecated
    public static boolean isNeedAuth = false;
    public static Boolean isUmengQQ = true;
    public static Boolean isUmengSina = true;
    public static Boolean isUmengWx = true;
    public static final boolean mEncrypt = false;
    public static int readSocketTimeOut = 30000;
    public static String shareType = UMConfigure.WRAPER_TYPE_NATIVE;

    public static int getMINITYPE() {
        return f10614a;
    }

    public static void setMiniPreView() {
        f10614a = 2;
    }

    public static void setMiniTest() {
        f10614a = 1;
    }
}

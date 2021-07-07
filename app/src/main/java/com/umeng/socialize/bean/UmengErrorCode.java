package com.umeng.socialize.bean;

import com.netease.nis.captcha.Captcha;

public enum UmengErrorCode {
    UnKnowCode(2000),
    AuthorizeFailed(2002),
    ShareFailed(Captcha.WEB_VIEW_HTTP_ERROR),
    RequestForUserProfileFailed(Captcha.WEB_VIEW_HTTPS_ERROR),
    ShareDataNil(Captcha.WEB_VIEW_HTTPS_ERROR),
    ShareDataTypeIllegal(Captcha.WEB_VIEW_HTTPS_ERROR),
    NotInstall(2008);
    

    /* renamed from: a */
    public final int f10717a;

    /* access modifiers changed from: public */
    UmengErrorCode(int i) {
        this.f10717a = i;
    }

    /* renamed from: a */
    private String m10793a() {
        return "错误码：" + this.f10717a + " 错误信息：";
    }

    public String getMessage() {
        if (this == UnKnowCode) {
            return m10793a() + "未知错误----";
        } else if (this == AuthorizeFailed) {
            return m10793a() + "授权失败----";
        } else if (this == ShareFailed) {
            return m10793a() + "分享失败----";
        } else if (this == RequestForUserProfileFailed) {
            return m10793a() + "获取用户资料失败----";
        } else if (this == ShareDataNil) {
            return m10793a() + "分享内容为空";
        } else if (this == ShareDataTypeIllegal) {
            return m10793a() + "分享内容不合法----";
        } else if (this != NotInstall) {
            return "unkonw";
        } else {
            return m10793a() + "没有安装应用";
        }
    }
}

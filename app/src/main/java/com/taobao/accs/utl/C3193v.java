package com.taobao.accs.utl;

import com.ut.mini.IUTApplication;
import com.ut.mini.core.sign.IUTRequestAuthentication;
import com.ut.mini.core.sign.UTSecuritySDKRequestAuthentication;
import com.ut.mini.crashhandler.IUTCrashCaughtListner;

/* renamed from: com.taobao.accs.utl.v */
public class C3193v implements IUTApplication {

    /* renamed from: a */
    public final /* synthetic */ String f7257a;

    /* renamed from: b */
    public final /* synthetic */ String f7258b;

    /* renamed from: c */
    public final /* synthetic */ UTMini f7259c;

    public C3193v(UTMini uTMini, String str, String str2) {
        this.f7259c = uTMini;
        this.f7257a = str;
        this.f7258b = str2;
    }

    public String getUTAppVersion() {
        return null;
    }

    public String getUTChannel() {
        return this.f7257a;
    }

    public IUTCrashCaughtListner getUTCrashCraughtListener() {
        return null;
    }

    public IUTRequestAuthentication getUTRequestAuthInstance() {
        return new UTSecuritySDKRequestAuthentication(this.f7258b);
    }

    public boolean isAliyunOsSystem() {
        return false;
    }

    public boolean isUTCrashHandlerDisable() {
        return false;
    }

    public boolean isUTLogEnable() {
        return false;
    }
}

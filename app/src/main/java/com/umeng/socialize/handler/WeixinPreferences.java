package com.umeng.socialize.handler;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

public class WeixinPreferences {
    public static final String KEY_ACCESS_TOKEN = "access_token";
    public static final String KEY_EXPIRES_IN = "expires_in";
    public static final String KEY_OPENID = "openid";
    public static final String KEY_REFRESH_TOKEN = "refresh_token";
    public static final String KEY_REFRESH_TOKEN_TTL = "rt_expires_in";
    public static final String KEY_UID = "unionid";
    public String mAccessToken;
    public long mAccessTokenTTL;
    public String mOpenid;
    public String mRefreshToken;
    public long mRefreshTokenTTL;
    public String mUID;
    public SharedPreferences sharedPreferences = null;

    public WeixinPreferences(Context context, String str) {
        SharedPreferences sharedPreferences2 = context.getSharedPreferences(str + "full", 0);
        this.sharedPreferences = sharedPreferences2;
        this.mUID = sharedPreferences2.getString("unionid", null);
        this.mOpenid = this.sharedPreferences.getString("openid", null);
        this.mAccessToken = this.sharedPreferences.getString("access_token", null);
        this.mAccessTokenTTL = this.sharedPreferences.getLong("expires_in", 0);
        this.mRefreshToken = this.sharedPreferences.getString("refresh_token", null);
        this.mRefreshTokenTTL = this.sharedPreferences.getLong(KEY_REFRESH_TOKEN_TTL, 0);
    }

    public void commit() {
        this.sharedPreferences.edit().putString("unionid", this.mUID).putString("openid", this.mOpenid).putString("access_token", this.mAccessToken).putString("refresh_token", this.mRefreshToken).putLong(KEY_REFRESH_TOKEN_TTL, this.mRefreshTokenTTL).putLong("expires_in", this.mAccessTokenTTL).commit();
    }

    public void delete() {
        this.sharedPreferences.edit().clear().commit();
        this.mAccessToken = "";
        this.mRefreshToken = "";
    }

    public String getAccessToken() {
        return this.mAccessToken;
    }

    public String getRefreshToken() {
        return this.mRefreshToken;
    }

    public String getUID() {
        return this.mUID;
    }

    public long getmAccessTokenTTL() {
        return this.mAccessTokenTTL;
    }

    public String getmOpenid() {
        return this.mOpenid;
    }

    public Map<String, String> getmap() {
        HashMap hashMap = new HashMap();
        hashMap.put("access_token", this.mAccessToken);
        hashMap.put("unionid", this.mUID);
        hashMap.put("openid", this.mOpenid);
        hashMap.put("refresh_token", this.mRefreshToken);
        hashMap.put("expires_in", String.valueOf(this.mAccessTokenTTL));
        return hashMap;
    }

    public boolean isAccessTokenAvailable() {
        return !TextUtils.isEmpty(this.mAccessToken) && !(((this.mAccessTokenTTL - System.currentTimeMillis()) > 0 ? 1 : ((this.mAccessTokenTTL - System.currentTimeMillis()) == 0 ? 0 : -1)) <= 0);
    }

    public boolean isAuth() {
        return !TextUtils.isEmpty(getAccessToken());
    }

    public boolean isAuthValid() {
        return !TextUtils.isEmpty(this.mRefreshToken) && !(((this.mRefreshTokenTTL - System.currentTimeMillis()) > 0 ? 1 : ((this.mRefreshTokenTTL - System.currentTimeMillis()) == 0 ? 0 : -1)) <= 0);
    }

    public WeixinPreferences setBundle(Bundle bundle) {
        if (TextUtils.isEmpty(bundle.getString("unionid"))) {
            this.mUID = bundle.getString("unionid");
        }
        if (TextUtils.isEmpty(bundle.getString("openid"))) {
            this.mOpenid = bundle.getString("openid");
        }
        this.mAccessToken = bundle.getString("access_token");
        this.mRefreshToken = bundle.getString("refresh_token");
        String string = bundle.getString("expires_in");
        if (!TextUtils.isEmpty(string)) {
            this.mAccessTokenTTL = (Long.valueOf(string).longValue() * 1000) + System.currentTimeMillis();
        }
        long j = bundle.getLong(UMWXHandler.REFRESH_TOKEN_EXPIRES_KEY);
        if (j != 0) {
            this.mRefreshTokenTTL = (j * 1000) + System.currentTimeMillis();
        }
        commit();
        return this;
    }
}

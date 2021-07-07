package com.vivo.push.cache;

import android.content.Context;
import android.text.TextUtils;
import com.vivo.push.model.C4117a;
import com.vivo.push.util.C4146p;
import com.xiaomi.mipush.sdk.Constants;
import java.util.HashSet;
import java.util.Set;

public class ClientConfigManagerImpl implements AbstractC4103e {
    public static final Object SLOCK = new Object();
    public static final String TAG = "ClientConfigManager";
    public static volatile ClientConfigManagerImpl sClientConfigManagerImpl;
    public C4099a mAppConfigSettings = new C4099a(this.mContext);
    public Context mContext;
    public C4104f mPushConfigSettings = new C4104f(this.mContext);

    public ClientConfigManagerImpl(Context context) {
        this.mContext = context.getApplicationContext();
    }

    public static ClientConfigManagerImpl getInstance(Context context) {
        if (sClientConfigManagerImpl == null) {
            synchronized (SLOCK) {
                if (sClientConfigManagerImpl == null) {
                    sClientConfigManagerImpl = new ClientConfigManagerImpl(context);
                }
            }
        }
        return sClientConfigManagerImpl;
    }

    private void prepareAppConfig() {
        C4099a aVar = this.mAppConfigSettings;
        if (aVar == null) {
            this.mAppConfigSettings = new C4099a(this.mContext);
        } else {
            aVar.mo41002c();
        }
    }

    private C4104f preparePushConfigSettings() {
        C4104f fVar = this.mPushConfigSettings;
        if (fVar == null) {
            this.mPushConfigSettings = new C4104f(this.mContext);
        } else {
            fVar.mo41002c();
        }
        return this.mPushConfigSettings;
    }

    public void clearPush() {
        this.mAppConfigSettings.mo41003d();
    }

    public Set<String> getBlackEventList() {
        return null;
    }

    public int getNotifyStyle() {
        try {
            String c = preparePushConfigSettings().mo41004c("DPL");
            if (!TextUtils.isEmpty(c)) {
                try {
                    return Integer.parseInt(c);
                } catch (NumberFormatException e) {
                    e.printStackTrace();
                }
            }
        } catch (NumberFormatException e2) {
            e2.printStackTrace();
        }
        return 0;
    }

    public String getSuitTag() {
        return preparePushConfigSettings().mo41004c("CSPT");
    }

    public String getValueByKey(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        this.mPushConfigSettings.mo41002c();
        return this.mPushConfigSettings.mo41004c(str);
    }

    public Set<Long> getWhiteLogList() {
        HashSet hashSet = new HashSet();
        String valueByKey = getValueByKey("WLL");
        if (!TextUtils.isEmpty(valueByKey)) {
            for (String str : valueByKey.split(Constants.ACCEPT_TIME_SEPARATOR_SP)) {
                try {
                    hashSet.add(Long.valueOf(Long.parseLong(str)));
                } catch (Exception unused) {
                }
            }
        }
        C4146p.m11216d(TAG, " initWhiteLogList " + hashSet);
        return hashSet;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0021 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x001f A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean isCancleBroadcastReceiver() {
        /*
            r3 = this;
            com.vivo.push.cache.f r0 = r3.preparePushConfigSettings()
            java.lang.String r1 = "PSM"
            java.lang.String r0 = r0.mo41004c(r1)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            r2 = 0
            if (r1 != 0) goto L_0x001a
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ NumberFormatException -> 0x0016 }
            goto L_0x001b
        L_0x0016:
            r0 = move-exception
            r0.printStackTrace()
        L_0x001a:
            r0 = 0
        L_0x001b:
            r0 = r0 & 4
            if (r0 == 0) goto L_0x0021
            r0 = 1
            return r0
        L_0x0021:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vivo.push.cache.ClientConfigManagerImpl.isCancleBroadcastReceiver():boolean");
    }

    public boolean isDebug() {
        this.mAppConfigSettings.mo41002c();
        return C4099a.m11051a(this.mAppConfigSettings.mo40987b());
    }

    public boolean isEnablePush() {
        prepareAppConfig();
        C4117a c = this.mAppConfigSettings.mo40989c(this.mContext.getPackageName());
        if (c != null) {
            return "1".equals(c.mo41077b());
        }
        return true;
    }

    @Override // com.vivo.push.cache.AbstractC4103e
    public boolean isInBlackList(long j) {
        String c = preparePushConfigSettings().mo41004c("BL");
        if (!TextUtils.isEmpty(c)) {
            String[] split = c.split(Constants.ACCEPT_TIME_SEPARATOR_SP);
            for (String str : split) {
                try {
                    if (!TextUtils.isEmpty(str) && Long.parseLong(str) == j) {
                        return true;
                    }
                } catch (NumberFormatException e) {
                    e.printStackTrace();
                }
            }
        }
        return false;
    }

    public boolean isDebug(int i) {
        return C4099a.m11051a(i);
    }
}

package com.vivo.push.cache.impl;

import android.content.Context;
import android.text.TextUtils;
import com.vivo.push.cache.AbstractC4101c;
import com.vivo.push.model.SubscribeAppInfo;
import com.vivo.push.util.C4146p;
import com.xiaomi.mipush.sdk.Constants;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* renamed from: com.vivo.push.cache.impl.a */
public abstract class AbstractC4105a extends AbstractC4101c<SubscribeAppInfo> {
    public static final String SPILTE_TAG = "@#";
    public static final String TAG = "SubscribeAppInfoManager";

    public AbstractC4105a(Context context) {
        super(context);
    }

    public SubscribeAppInfo getConfigByName(String str) {
        synchronized (AbstractC4101c.sAppLock) {
            for (T t : this.mAppDatas) {
                if (!TextUtils.isEmpty(t.getName()) && t.getName().equals(str)) {
                    return t;
                }
            }
            return null;
        }
    }

    @Override // com.vivo.push.cache.AbstractC4101c
    public void loadData() {
        super.loadData();
        synchronized (AbstractC4101c.sAppLock) {
            boolean z = false;
            Iterator<T> it = this.mAppDatas.iterator();
            while (it.hasNext()) {
                T next = it.next();
                if (next.getTargetStatus() == 2 && next.getActualStatus() == 2) {
                    it.remove();
                    z = true;
                }
            }
            if (z) {
                updateDataToSP(this.mAppDatas);
            }
        }
    }

    @Override // com.vivo.push.cache.AbstractC4101c
    public Set<SubscribeAppInfo> parseAppStr(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        HashSet hashSet = new HashSet();
        if (!TextUtils.isEmpty(str)) {
            for (String str2 : str.trim().split(SPILTE_TAG)) {
                String[] split = str2.trim().trim().split(Constants.ACCEPT_TIME_SEPARATOR_SP);
                if (split.length >= 3) {
                    try {
                        hashSet.add(new SubscribeAppInfo(split[0], Integer.parseInt(split[1]), Integer.parseInt(split[2])));
                    } catch (Exception e) {
                        C4146p.m11216d(TAG, "str2Clients E: " + e);
                    }
                }
            }
        }
        return hashSet;
    }

    @Override // com.vivo.push.cache.AbstractC4101c
    public String toAppStr(Set<SubscribeAppInfo> set) {
        if (set == null || set.size() == 0) {
            return "";
        }
        StringBuffer stringBuffer = new StringBuffer();
        for (SubscribeAppInfo subscribeAppInfo : set) {
            stringBuffer.append(subscribeAppInfo.getName());
            stringBuffer.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
            stringBuffer.append(subscribeAppInfo.getTargetStatus());
            stringBuffer.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
            stringBuffer.append(subscribeAppInfo.getActualStatus());
            stringBuffer.append(SPILTE_TAG);
        }
        return stringBuffer.substring(0, stringBuffer.length() - 2);
    }

    public void updateSubscribeApp(SubscribeAppInfo subscribeAppInfo) {
        synchronized (AbstractC4101c.sAppLock) {
            boolean z = false;
            if (!TextUtils.isEmpty(subscribeAppInfo.getName())) {
                Iterator<T> it = this.mAppDatas.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    T next = it.next();
                    if (next.getName().equals(subscribeAppInfo.getName())) {
                        next.setTargetStatus(subscribeAppInfo.getTargetStatus());
                        next.setActualStatus(subscribeAppInfo.getActualStatus());
                        z = true;
                        break;
                    }
                }
            }
            if (z) {
                updateDataToSP(this.mAppDatas);
            }
        }
    }
}

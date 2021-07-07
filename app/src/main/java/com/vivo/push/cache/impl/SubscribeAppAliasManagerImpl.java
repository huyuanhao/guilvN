package com.vivo.push.cache.impl;

import android.content.Context;
import android.text.TextUtils;
import com.vivo.push.PushClientConstants;
import com.vivo.push.cache.AbstractC4101c;
import com.vivo.push.cache.ISubscribeAppAliasManager;
import com.vivo.push.model.SubscribeAppInfo;
import java.util.Iterator;

public class SubscribeAppAliasManagerImpl extends AbstractC4105a implements ISubscribeAppAliasManager {
    public SubscribeAppAliasManagerImpl(Context context) {
        super(context);
    }

    @Override // com.vivo.push.cache.ISubscribeAppAliasManager
    public boolean delAlias(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        int size = this.mAppDatas.size();
        SubscribeAppInfo subscribeAppInfo = getSubscribeAppInfo();
        if (size == 1 && subscribeAppInfo != null && str.equals(subscribeAppInfo.getName()) && subscribeAppInfo.getTargetStatus() == 2) {
            return false;
        }
        clearData();
        addData(new SubscribeAppInfo(str, 2, 1));
        return true;
    }

    @Override // com.vivo.push.cache.ISubscribeAppAliasManager
    public void delAliasSuccess(String str) {
        synchronized (AbstractC4101c.sAppLock) {
            boolean z = false;
            if (!TextUtils.isEmpty(str)) {
                Iterator<T> it = this.mAppDatas.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    T next = it.next();
                    if (next.getName().equals(str) && next.getActualStatus() != 2) {
                        next.setActualStatus(2);
                        z = true;
                        break;
                    }
                }
            }
            if (z) {
                SubscribeAppInfo subscribeAppInfo = getSubscribeAppInfo();
                if (subscribeAppInfo != null) {
                    if (subscribeAppInfo.getActualStatus() == subscribeAppInfo.getTargetStatus()) {
                        clearData();
                    } else {
                        updateDataToSP(this.mAppDatas);
                    }
                }
            }
        }
    }

    @Override // com.vivo.push.cache.AbstractC4101c
    public String generateStrByType() {
        return PushClientConstants.PUSH_APP_ALIAS;
    }

    @Override // com.vivo.push.cache.ISubscribeAppAliasManager
    public SubscribeAppInfo getRetrySubscribeAppInfo() {
        SubscribeAppInfo subscribeAppInfo = getSubscribeAppInfo();
        if (subscribeAppInfo == null || subscribeAppInfo.getTargetStatus() == subscribeAppInfo.getActualStatus()) {
            return null;
        }
        return subscribeAppInfo;
    }

    @Override // com.vivo.push.cache.ISubscribeAppAliasManager
    public SubscribeAppInfo getSubscribeAppInfo() {
        synchronized (AbstractC4101c.sAppLock) {
            Iterator<T> it = this.mAppDatas.iterator();
            if (!it.hasNext()) {
                return null;
            }
            return it.next();
        }
    }

    @Override // com.vivo.push.cache.ISubscribeAppAliasManager
    public boolean setAlias(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        int size = this.mAppDatas.size();
        SubscribeAppInfo subscribeAppInfo = getSubscribeAppInfo();
        if (size == 1 && subscribeAppInfo != null && str.equals(subscribeAppInfo.getName()) && subscribeAppInfo.getTargetStatus() == 1) {
            return false;
        }
        clearData();
        addData(new SubscribeAppInfo(str, 1, 2));
        return true;
    }

    @Override // com.vivo.push.cache.ISubscribeAppAliasManager
    public void setAliasSuccess(String str) {
        synchronized (AbstractC4101c.sAppLock) {
            boolean z = false;
            if (!TextUtils.isEmpty(str)) {
                Iterator<T> it = this.mAppDatas.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    T next = it.next();
                    if (next.getName().equals(str) && next.getActualStatus() != 1) {
                        next.setActualStatus(1);
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

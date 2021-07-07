package com.vivo.push.cache;

import com.vivo.push.model.SubscribeAppInfo;

public interface ISubscribeAppAliasManager {
    boolean delAlias(String str);

    void delAliasSuccess(String str);

    SubscribeAppInfo getRetrySubscribeAppInfo();

    SubscribeAppInfo getSubscribeAppInfo();

    boolean setAlias(String str);

    void setAliasSuccess(String str);
}

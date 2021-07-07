package com.p118pd.sdk;

import java.util.List;

/* renamed from: com.pd.sdk.oOoo000O  reason: case insensitive filesystem */
public interface AbstractC8394oOoo000O {
    void onGetAliases(int i, List<C8407oOoo0OO0> list);

    void onGetNotificationStatus(int i, int i2);

    void onGetPushStatus(int i, int i2);

    void onGetTags(int i, List<C8407oOoo0OO0> list);

    void onGetUserAccounts(int i, List<C8407oOoo0OO0> list);

    void onRegister(int i, String str);

    void onSetAliases(int i, List<C8407oOoo0OO0> list);

    void onSetPushTime(int i, String str);

    void onSetTags(int i, List<C8407oOoo0OO0> list);

    void onSetUserAccounts(int i, List<C8407oOoo0OO0> list);

    void onUnRegister(int i);

    void onUnsetAliases(int i, List<C8407oOoo0OO0> list);

    void onUnsetTags(int i, List<C8407oOoo0OO0> list);

    void onUnsetUserAccounts(int i, List<C8407oOoo0OO0> list);
}

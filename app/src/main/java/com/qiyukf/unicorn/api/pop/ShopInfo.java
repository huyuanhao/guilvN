package com.qiyukf.unicorn.api.pop;

import com.qiyukf.nimlib.sdk.uinfo.UserInfoProvider;

public interface ShopInfo extends UserInfoProvider.UserInfo {
    @Override // com.qiyukf.nimlib.sdk.uinfo.UserInfoProvider.UserInfo
    String getAccount();

    @Override // com.qiyukf.nimlib.sdk.uinfo.UserInfoProvider.UserInfo
    String getAvatar();

    @Override // com.qiyukf.nimlib.sdk.uinfo.UserInfoProvider.UserInfo
    String getName();
}

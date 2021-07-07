package com.google.android.gms.auth.account;

import android.accounts.Account;
import com.google.android.gms.auth.account.WorkAccountApi;
import com.google.android.gms.common.internal.PendingResultUtil;

public final class zzg implements PendingResultUtil.ResultConverter<WorkAccountApi.AddAccountResult, Account> {
    public zzg(WorkAccountClient workAccountClient) {
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.google.android.gms.common.api.Result] */
    @Override // com.google.android.gms.common.internal.PendingResultUtil.ResultConverter
    public final /* synthetic */ Account convert(WorkAccountApi.AddAccountResult addAccountResult) {
        return addAccountResult.getAccount();
    }
}

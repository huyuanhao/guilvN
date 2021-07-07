package com.google.android.gms.internal.clearcut;

import android.content.Context;
import androidx.annotation.NonNull;
import com.google.android.gms.clearcut.ClearcutLogger;
import com.google.android.gms.clearcut.zzb;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.ApiExceptionMapper;
import com.google.android.gms.common.util.VisibleForTesting;

public final class zze extends GoogleApi<Api.ApiOptions.NoOptions> implements zzb {
    @VisibleForTesting
    public zze(@NonNull Context context) {
        super(context, ClearcutLogger.API, (Api.ApiOptions) null, new ApiExceptionMapper());
    }

    public static zzb zzb(@NonNull Context context) {
        return new zze(context);
    }

    @Override // com.google.android.gms.clearcut.zzb
    public final PendingResult<Status> zzb(com.google.android.gms.clearcut.zze zze) {
        return doBestEffortWrite(new zzh(zze, asGoogleApiClient()));
    }
}

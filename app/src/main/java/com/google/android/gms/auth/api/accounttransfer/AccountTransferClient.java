package com.google.android.gms.auth.api.accounttransfer;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.ApiExceptionMapper;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.auth.zzab;
import com.google.android.gms.internal.auth.zzad;
import com.google.android.gms.internal.auth.zzaf;
import com.google.android.gms.internal.auth.zzah;
import com.google.android.gms.internal.auth.zzs;
import com.google.android.gms.internal.auth.zzu;
import com.google.android.gms.internal.auth.zzv;
import com.google.android.gms.internal.auth.zzy;
import com.google.android.gms.internal.auth.zzz;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

public class AccountTransferClient extends GoogleApi<zzn> {
    public static final Api.ClientKey<zzu> zzaj = new Api.ClientKey<>();
    public static final Api.AbstractClientBuilder<zzu, zzn> zzak;
    public static final Api<zzn> zzal;

    public static class zza<T> extends zzs {
        public zzb<T> zzav;

        public zza(zzb<T> zzb) {
            this.zzav = zzb;
        }

        @Override // com.google.android.gms.internal.auth.zzs, com.google.android.gms.internal.auth.zzx
        public final void onFailure(Status status) {
            this.zzav.zza(status);
        }
    }

    public static abstract class zzb<T> extends TaskApiCall<zzu, T> {
        public TaskCompletionSource<T> zzaw;

        public zzb() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.google.android.gms.common.api.Api$AnyClient, com.google.android.gms.tasks.TaskCompletionSource] */
        @Override // com.google.android.gms.common.api.internal.TaskApiCall
        public /* synthetic */ void doExecute(zzu zzu, TaskCompletionSource taskCompletionSource) throws RemoteException {
            this.zzaw = taskCompletionSource;
            zza((zzz) zzu.getService());
        }

        public final void setResult(T t) {
            this.zzaw.setResult(t);
        }

        public final void zza(Status status) {
            AccountTransferClient.zza(this.zzaw, status);
        }

        public abstract void zza(zzz zzz) throws RemoteException;

        public /* synthetic */ zzb(zzc zzc) {
            this();
        }
    }

    static {
        zzc zzc2 = new zzc();
        zzak = zzc2;
        zzal = new Api<>("AccountTransfer.ACCOUNT_TRANSFER_API", zzc2, zzaj);
    }

    public AccountTransferClient(@NonNull Context context) {
        super(context, zzal, (Api.ApiOptions) null, new GoogleApi.Settings.Builder().setMapper(new ApiExceptionMapper()).build());
    }

    public static void zza(TaskCompletionSource taskCompletionSource, Status status) {
        taskCompletionSource.setException(new AccountTransferException(status));
    }

    public Task<DeviceMetaData> getDeviceMetaData(String str) {
        Preconditions.checkNotNull(str);
        return doRead(new zzg(this, new zzv(str)));
    }

    public Task<Void> notifyCompletion(String str, int i) {
        Preconditions.checkNotNull(str);
        return doWrite(new zzj(this, new zzab(str, i)));
    }

    public Task<byte[]> retrieveData(String str) {
        Preconditions.checkNotNull(str);
        return doRead(new zze(this, new zzad(str)));
    }

    public Task<Void> sendData(String str, byte[] bArr) {
        Preconditions.checkNotNull(str);
        Preconditions.checkNotNull(bArr);
        return doWrite(new zzd(this, new zzaf(str, bArr)));
    }

    public Task<Void> showUserChallenge(String str, PendingIntent pendingIntent) {
        Preconditions.checkNotNull(str);
        Preconditions.checkNotNull(pendingIntent);
        return doWrite(new zzi(this, new zzah(str, pendingIntent)));
    }

    public static abstract class zzc extends zzb<Void> {
        public zzy zzax;

        public zzc() {
            super(null);
            this.zzax = new zzk(this);
        }

        public /* synthetic */ zzc(zzc zzc) {
            this();
        }
    }

    public AccountTransferClient(@NonNull Activity activity) {
        super(activity, (Api) zzal, (Api.ApiOptions) null, new GoogleApi.Settings.Builder().setMapper(new ApiExceptionMapper()).build());
    }
}

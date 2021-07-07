package com.google.firebase.iid;

import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.p118pd.sdk.C7522o0Ooo0o;

public abstract class zzak<T> {
    public final int what;
    public final int zzcf;
    public final TaskCompletionSource<T> zzcg = new TaskCompletionSource<>();
    public final Bundle zzch;

    public zzak(int i, int i2, Bundle bundle) {
        this.zzcf = i;
        this.what = i2;
        this.zzch = bundle;
    }

    public final void finish(T t) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String valueOf = String.valueOf(this);
            String valueOf2 = String.valueOf(t);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 16 + String.valueOf(valueOf2).length());
            sb.append("Finishing ");
            sb.append(valueOf);
            sb.append(" with ");
            sb.append(valueOf2);
            sb.toString();
        }
        this.zzcg.setResult(t);
    }

    public String toString() {
        int i = this.what;
        int i2 = this.zzcf;
        boolean zzab = zzab();
        StringBuilder sb = new StringBuilder(55);
        sb.append("Request { what=");
        sb.append(i);
        sb.append(" id=");
        sb.append(i2);
        sb.append(" oneWay=");
        sb.append(zzab);
        sb.append(C7522o0Ooo0o.OooO0Oo);
        return sb.toString();
    }

    public final void zza(zzal zzal) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String valueOf = String.valueOf(this);
            String valueOf2 = String.valueOf(zzal);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 14 + String.valueOf(valueOf2).length());
            sb.append("Failing ");
            sb.append(valueOf);
            sb.append(" with ");
            sb.append(valueOf2);
            sb.toString();
        }
        this.zzcg.setException(zzal);
    }

    public abstract boolean zzab();

    public abstract void zzb(Bundle bundle);
}

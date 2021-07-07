package com.google.firebase.iid;

import android.content.Intent;
import android.util.Log;
import androidx.annotation.WorkerThread;

@Deprecated
public class FirebaseInstanceIdService extends zzb {
    @WorkerThread
    @Deprecated
    public void onTokenRefresh() {
    }

    @Override // com.google.firebase.iid.zzb
    public final Intent zzb(Intent intent) {
        return zzav.zzai().zzda.poll();
    }

    @Override // com.google.firebase.iid.zzb
    public final void zzd(Intent intent) {
        if ("com.google.firebase.iid.TOKEN_REFRESH".equals(intent.getAction())) {
            onTokenRefresh();
            return;
        }
        String stringExtra = intent.getStringExtra("CMD");
        if (stringExtra != null) {
            if (Log.isLoggable("FirebaseInstanceId", 3)) {
                String valueOf = String.valueOf(intent.getExtras());
                StringBuilder sb = new StringBuilder(String.valueOf(stringExtra).length() + 21 + String.valueOf(valueOf).length());
                sb.append("Received command: ");
                sb.append(stringExtra);
                sb.append(" - ");
                sb.append(valueOf);
                sb.toString();
            }
            if ("RST".equals(stringExtra) || "RST_FULL".equals(stringExtra)) {
                FirebaseInstanceId.getInstance().zzm();
            } else if ("SYNC".equals(stringExtra)) {
                FirebaseInstanceId.getInstance().zzq();
            }
        }
    }
}

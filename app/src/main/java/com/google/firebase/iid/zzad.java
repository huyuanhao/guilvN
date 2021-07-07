package com.google.firebase.iid;

import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.Looper;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseArray;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.stats.ConnectionTracker;
import com.google.android.gms.internal.firebase_messaging.zza;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.TimeUnit;
import javax.annotation.concurrent.GuardedBy;

public final class zzad implements ServiceConnection {
    @GuardedBy("this")
    public int state;
    public final Messenger zzbx;
    public zzai zzby;
    @GuardedBy("this")
    public final Queue<zzak<?>> zzbz;
    @GuardedBy("this")
    public final SparseArray<zzak<?>> zzca;
    public final /* synthetic */ zzab zzcb;

    public zzad(zzab zzab) {
        this.zzcb = zzab;
        this.state = 0;
        this.zzbx = new Messenger(new zza(Looper.getMainLooper(), new zzae(this)));
        this.zzbz = new ArrayDeque();
        this.zzca = new SparseArray<>();
    }

    private final void zzy() {
        zzab.zzb(this.zzcb).execute(new zzag(this));
    }

    public final synchronized void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        Log.isLoggable("MessengerIpcClient", 2);
        if (iBinder == null) {
            zza(0, "Null service connection");
            return;
        }
        try {
            this.zzby = new zzai(iBinder);
            this.state = 2;
            zzy();
        } catch (RemoteException e) {
            zza(0, e.getMessage());
        }
    }

    public final synchronized void onServiceDisconnected(ComponentName componentName) {
        Log.isLoggable("MessengerIpcClient", 2);
        zza(2, "Service disconnected");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0046, code lost:
        r5 = r5.getData();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0051, code lost:
        if (r5.getBoolean("unsupported", false) == false) goto L_0x005f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0053, code lost:
        r1.zza(new com.google.firebase.iid.zzal(4, "Not supported by GmsCore"));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x005f, code lost:
        r1.zzb(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0062, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean zza(android.os.Message r5) {
        /*
        // Method dump skipped, instructions count: 102
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.iid.zzad.zza(android.os.Message):boolean");
    }

    public final synchronized void zzaa() {
        if (this.state == 1) {
            zza(1, "Timed out while binding");
        }
    }

    public final synchronized boolean zzb(zzak zzak) {
        int i = this.state;
        if (i == 0) {
            this.zzbz.add(zzak);
            Preconditions.checkState(this.state == 0);
            Log.isLoggable("MessengerIpcClient", 2);
            this.state = 1;
            Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
            intent.setPackage("com.google.android.gms");
            if (!ConnectionTracker.getInstance().bindService(zzab.zza(this.zzcb), intent, this, 1)) {
                zza(0, "Unable to bind to service");
            } else {
                zzab.zzb(this.zzcb).schedule(new zzaf(this), 30, TimeUnit.SECONDS);
            }
            return true;
        } else if (i == 1) {
            this.zzbz.add(zzak);
            return true;
        } else if (i != 2) {
            if (i != 3) {
                if (i != 4) {
                    int i2 = this.state;
                    StringBuilder sb = new StringBuilder(26);
                    sb.append("Unknown state: ");
                    sb.append(i2);
                    throw new IllegalStateException(sb.toString());
                }
            }
            return false;
        } else {
            this.zzbz.add(zzak);
            zzy();
            return true;
        }
    }

    public final synchronized void zzz() {
        if (this.state == 2 && this.zzbz.isEmpty() && this.zzca.size() == 0) {
            Log.isLoggable("MessengerIpcClient", 2);
            this.state = 3;
            ConnectionTracker.getInstance().unbindService(zzab.zza(this.zzcb), this);
        }
    }

    public final synchronized void zza(int i, String str) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String valueOf = String.valueOf(str);
            if (valueOf.length() != 0) {
                "Disconnected: ".concat(valueOf);
            } else {
                new String("Disconnected: ");
            }
        }
        int i2 = this.state;
        if (i2 == 0) {
            throw new IllegalStateException();
        } else if (i2 == 1 || i2 == 2) {
            Log.isLoggable("MessengerIpcClient", 2);
            this.state = 4;
            ConnectionTracker.getInstance().unbindService(zzab.zza(this.zzcb), this);
            zzal zzal = new zzal(i, str);
            for (zzak<?> zzak : this.zzbz) {
                zzak.zza(zzal);
            }
            this.zzbz.clear();
            for (int i3 = 0; i3 < this.zzca.size(); i3++) {
                this.zzca.valueAt(i3).zza(zzal);
            }
            this.zzca.clear();
        } else if (i2 == 3) {
            this.state = 4;
        } else if (i2 != 4) {
            int i4 = this.state;
            StringBuilder sb = new StringBuilder(26);
            sb.append("Unknown state: ");
            sb.append(i4);
            throw new IllegalStateException(sb.toString());
        }
    }

    public final synchronized void zza(int i) {
        zzak<?> zzak = this.zzca.get(i);
        if (zzak != null) {
            StringBuilder sb = new StringBuilder(31);
            sb.append("Timing out request: ");
            sb.append(i);
            sb.toString();
            this.zzca.remove(i);
            zzak.zza(new zzal(3, "Timed out waiting for response"));
            zzz();
        }
    }
}

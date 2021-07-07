package com.google.firebase.iid;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Build;
import android.os.Looper;
import android.util.Log;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.common.util.concurrent.NamedThreadFactory;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.DataCollectionDefaultChange;
import com.google.firebase.FirebaseApp;
import com.google.firebase.events.EventHandler;
import com.google.firebase.events.Subscriber;
import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import javax.annotation.concurrent.GuardedBy;
import org.android.agoo.common.AgooConstants;

public class FirebaseInstanceId {
    public static final long zzai = TimeUnit.HOURS.toSeconds(8);
    public static zzaw zzaj;
    @VisibleForTesting
    @GuardedBy("FirebaseInstanceId.class")
    public static ScheduledThreadPoolExecutor zzak;
    public final Executor zzal;
    public final FirebaseApp zzam;
    public final zzan zzan;
    public MessagingChannel zzao;
    public final zzaq zzap;
    public final zzba zzaq;
    @GuardedBy("this")
    public boolean zzar;
    public final zza zzas;

    public class zza {
        public final boolean zzaz = zzu();
        public final Subscriber zzba;
        @Nullable
        @GuardedBy("this")
        public EventHandler<DataCollectionDefaultChange> zzbb;
        @Nullable
        @GuardedBy("this")
        public Boolean zzbc;

        public zza(Subscriber subscriber) {
            this.zzba = subscriber;
            Boolean zzt = zzt();
            this.zzbc = zzt;
            if (zzt == null && this.zzaz) {
                zzq zzq = new zzq(this);
                this.zzbb = zzq;
                subscriber.subscribe(DataCollectionDefaultChange.class, zzq);
            }
        }

        @Nullable
        private final Boolean zzt() {
            ApplicationInfo applicationInfo;
            Context applicationContext = FirebaseInstanceId.this.zzam.getApplicationContext();
            SharedPreferences sharedPreferences = applicationContext.getSharedPreferences("com.google.firebase.messaging", 0);
            if (sharedPreferences.contains("auto_init")) {
                return Boolean.valueOf(sharedPreferences.getBoolean("auto_init", false));
            }
            try {
                PackageManager packageManager = applicationContext.getPackageManager();
                if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(applicationContext.getPackageName(), 128)) == null || applicationInfo.metaData == null || !applicationInfo.metaData.containsKey("firebase_messaging_auto_init_enabled")) {
                    return null;
                }
                return Boolean.valueOf(applicationInfo.metaData.getBoolean("firebase_messaging_auto_init_enabled"));
            } catch (PackageManager.NameNotFoundException unused) {
                return null;
            }
        }

        private final boolean zzu() {
            try {
                Class.forName("com.google.firebase.messaging.FirebaseMessaging");
                return true;
            } catch (ClassNotFoundException unused) {
                Context applicationContext = FirebaseInstanceId.this.zzam.getApplicationContext();
                Intent intent = new Intent("com.google.firebase.MESSAGING_EVENT");
                intent.setPackage(applicationContext.getPackageName());
                ResolveInfo resolveService = applicationContext.getPackageManager().resolveService(intent, 0);
                if (resolveService == null || resolveService.serviceInfo == null) {
                    return false;
                }
                return true;
            }
        }

        public final synchronized boolean isEnabled() {
            if (this.zzbc == null) {
                return this.zzaz && FirebaseInstanceId.this.zzam.isDataCollectionDefaultEnabled();
            }
            return this.zzbc.booleanValue();
        }

        public final synchronized void setEnabled(boolean z) {
            if (this.zzbb != null) {
                this.zzba.unsubscribe(DataCollectionDefaultChange.class, this.zzbb);
                this.zzbb = null;
            }
            SharedPreferences.Editor edit = FirebaseInstanceId.this.zzam.getApplicationContext().getSharedPreferences("com.google.firebase.messaging", 0).edit();
            edit.putBoolean("auto_init", z);
            edit.apply();
            if (z) {
                FirebaseInstanceId.this.zzg();
            }
            this.zzbc = Boolean.valueOf(z);
        }
    }

    public FirebaseInstanceId(FirebaseApp firebaseApp, Subscriber subscriber) {
        this(firebaseApp, new zzan(firebaseApp.getApplicationContext()), zzi.zzf(), zzi.zzf(), subscriber);
    }

    public static FirebaseInstanceId getInstance() {
        return getInstance(FirebaseApp.getInstance());
    }

    private final synchronized void startSync() {
        if (!this.zzar) {
            zza(0);
        }
    }

    @Nullable
    @VisibleForTesting
    public static zzax zzb(String str, String str2) {
        return zzaj.zzb("", str, str2);
    }

    public static String zzd(String str) {
        return (str.isEmpty() || str.equalsIgnoreCase("fcm") || str.equalsIgnoreCase(AgooConstants.MESSAGE_SYSTEM_SOURCE_GCM)) ? "*" : str;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final void zzg() {
        zzax zzj = zzj();
        if (!zzo() || zzj == null || zzj.zzj(this.zzan.zzad()) || this.zzaq.zzaq()) {
            startSync();
        }
    }

    public static String zzi() {
        return zzan.zza(zzaj.zzg("").getKeyPair());
    }

    public static boolean zzl() {
        if (!Log.isLoggable("FirebaseInstanceId", 3)) {
            return Build.VERSION.SDK_INT == 23 && Log.isLoggable("FirebaseInstanceId", 3);
        }
        return true;
    }

    @WorkerThread
    public void deleteInstanceId() throws IOException {
        if (Looper.getMainLooper() != Looper.myLooper()) {
            zza(this.zzao.deleteInstanceId(zzi()));
            zzm();
            return;
        }
        throw new IOException("MAIN_THREAD");
    }

    @WorkerThread
    public void deleteToken(String str, String str2) throws IOException {
        if (Looper.getMainLooper() != Looper.myLooper()) {
            String zzd = zzd(str2);
            zza(this.zzao.deleteToken(zzi(), zzax.zza(zzb(str, zzd)), str, zzd));
            zzaj.zzc("", str, zzd);
            return;
        }
        throw new IOException("MAIN_THREAD");
    }

    public long getCreationTime() {
        return zzaj.zzg("").getCreationTime();
    }

    @WorkerThread
    public String getId() {
        zzg();
        return zzi();
    }

    @NonNull
    public Task<InstanceIdResult> getInstanceId() {
        return zza(zzan.zza(this.zzam), "*");
    }

    @Nullable
    @Deprecated
    public String getToken() {
        zzax zzj = zzj();
        if (zzj == null || zzj.zzj(this.zzan.zzad())) {
            startSync();
        }
        if (zzj != null) {
            return zzj.zzbq;
        }
        return null;
    }

    public final synchronized void zza(boolean z) {
        this.zzar = z;
    }

    public final void zzc(String str) throws IOException {
        zzax zzj = zzj();
        if (zzj == null || zzj.zzj(this.zzan.zzad())) {
            throw new IOException("token not available");
        }
        zza(this.zzao.unsubscribeFromTopic(zzi(), zzj.zzbq, str));
    }

    public final FirebaseApp zzh() {
        return this.zzam;
    }

    @Nullable
    public final zzax zzj() {
        return zzb(zzan.zza(this.zzam), "*");
    }

    public final String zzk() throws IOException {
        return getToken(zzan.zza(this.zzam), "*");
    }

    public final synchronized void zzm() {
        zzaj.zzal();
        if (this.zzas.isEnabled()) {
            startSync();
        }
    }

    public final boolean zzn() {
        return this.zzao.isAvailable();
    }

    public final boolean zzo() {
        return this.zzao.isChannelBuilt();
    }

    public final void zzp() throws IOException {
        zza(this.zzao.buildChannel(zzi(), zzax.zza(zzj())));
    }

    public final void zzq() {
        zzaj.zzh("");
        startSync();
    }

    @VisibleForTesting
    public final boolean zzr() {
        return this.zzas.isEnabled();
    }

    @Keep
    public static synchronized FirebaseInstanceId getInstance(@NonNull FirebaseApp firebaseApp) {
        FirebaseInstanceId firebaseInstanceId;
        synchronized (FirebaseInstanceId.class) {
            firebaseInstanceId = (FirebaseInstanceId) firebaseApp.get(FirebaseInstanceId.class);
        }
        return firebaseInstanceId;
    }

    public final void zzb(String str) throws IOException {
        zzax zzj = zzj();
        if (zzj == null || zzj.zzj(this.zzan.zzad())) {
            throw new IOException("token not available");
        }
        zza(this.zzao.subscribeToTopic(zzi(), zzj.zzbq, str));
    }

    public final synchronized void zza(long j) {
        zza(new zzay(this, this.zzan, this.zzaq, Math.min(Math.max(30L, j << 1), zzai)), j);
        this.zzar = true;
    }

    @WorkerThread
    public String getToken(String str, String str2) throws IOException {
        if (Looper.getMainLooper() != Looper.myLooper()) {
            return ((InstanceIdResult) zza(zza(str, str2))).getToken();
        }
        throw new IOException("MAIN_THREAD");
    }

    public FirebaseInstanceId(FirebaseApp firebaseApp, zzan zzan2, Executor executor, Executor executor2, Subscriber subscriber) {
        this.zzar = false;
        if (zzan.zza(firebaseApp) != null) {
            synchronized (FirebaseInstanceId.class) {
                if (zzaj == null) {
                    zzaj = new zzaw(firebaseApp.getApplicationContext());
                }
            }
            this.zzam = firebaseApp;
            this.zzan = zzan2;
            if (this.zzao == null) {
                MessagingChannel messagingChannel = (MessagingChannel) firebaseApp.get(MessagingChannel.class);
                if (messagingChannel == null || !messagingChannel.isAvailable()) {
                    this.zzao = new zzr(firebaseApp, zzan2, executor);
                } else {
                    this.zzao = messagingChannel;
                }
            }
            this.zzao = this.zzao;
            this.zzal = executor2;
            this.zzaq = new zzba(zzaj);
            this.zzas = new zza(subscriber);
            this.zzap = new zzaq(executor);
            if (this.zzas.isEnabled()) {
                zzg();
                return;
            }
            return;
        }
        throw new IllegalStateException("FirebaseInstanceId failed to initialize, FirebaseApp is missing project ID");
    }

    public static void zza(Runnable runnable, long j) {
        synchronized (FirebaseInstanceId.class) {
            if (zzak == null) {
                zzak = new ScheduledThreadPoolExecutor(1, new NamedThreadFactory("FirebaseInstanceId"));
            }
            zzak.schedule(runnable, j, TimeUnit.SECONDS);
        }
    }

    @VisibleForTesting
    public final void zzb(boolean z) {
        this.zzas.setEnabled(z);
    }

    private final Task<InstanceIdResult> zza(String str, String str2) {
        String zzd = zzd(str2);
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.zzal.execute(new zzn(this, str, str2, taskCompletionSource, zzd));
        return taskCompletionSource.getTask();
    }

    private final <T> T zza(Task<T> task) throws IOException {
        try {
            return (T) Tasks.await(task, 30000, TimeUnit.MILLISECONDS);
        } catch (ExecutionException e) {
            Throwable cause = e.getCause();
            if (cause instanceof IOException) {
                if ("INSTANCE_ID_RESET".equals(cause.getMessage())) {
                    zzm();
                }
                throw ((IOException) cause);
            } else if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            } else {
                throw new IOException(e);
            }
        } catch (InterruptedException | TimeoutException unused) {
            throw new IOException("SERVICE_NOT_AVAILABLE");
        }
    }

    public final synchronized Task<Void> zza(String str) {
        Task<Void> zza2;
        zza2 = this.zzaq.zza(str);
        startSync();
        return zza2;
    }

    public final /* synthetic */ void zza(String str, String str2, TaskCompletionSource taskCompletionSource, String str3) {
        String zzi = zzi();
        zzax zzb = zzb(str, str2);
        if (zzb == null || zzb.zzj(this.zzan.zzad())) {
            this.zzap.zza(str, str3, new zzo(this, zzi, zzax.zza(zzb), str, str3)).addOnCompleteListener(this.zzal, new zzp(this, str, str3, taskCompletionSource, zzi));
            return;
        }
        taskCompletionSource.setResult(new zzx(zzi, zzb.zzbq));
    }

    public final /* synthetic */ void zza(String str, String str2, TaskCompletionSource taskCompletionSource, String str3, Task task) {
        if (task.isSuccessful()) {
            String str4 = (String) task.getResult();
            zzaj.zza("", str, str2, str4, this.zzan.zzad());
            taskCompletionSource.setResult(new zzx(str3, str4));
            return;
        }
        taskCompletionSource.setException(task.getException());
    }

    public final /* synthetic */ Task zza(String str, String str2, String str3, String str4) {
        return this.zzao.getToken(str, str2, str3, str4);
    }
}

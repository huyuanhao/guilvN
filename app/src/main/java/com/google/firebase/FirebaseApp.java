package com.google.firebase;

import android.annotation.TargetApi;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.UiThread;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.internal.BackgroundDetector;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Base64Utils;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.util.ProcessUtils;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.annotations.PublicApi;
import com.google.firebase.auth.GetTokenResult;
import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.zzf;
import com.google.firebase.events.Event;
import com.google.firebase.events.Publisher;
import com.google.firebase.internal.InternalTokenProvider;
import com.google.firebase.internal.InternalTokenResult;
import com.p118pd.sdk.C6971o0000oO0;
import com.p118pd.sdk.C7009o000OoOo;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import javax.annotation.concurrent.GuardedBy;

@PublicApi
public class FirebaseApp {
    @GuardedBy("LOCK")
    public static final Map<String, FirebaseApp> zza = new C6971o0000oO0();
    public static final List<String> zzb = Arrays.asList("com.google.firebase.auth.FirebaseAuth", "com.google.firebase.iid.FirebaseInstanceId");
    public static final List<String> zzc = Collections.singletonList("com.google.firebase.crash.FirebaseCrash");
    public static final List<String> zzd = Arrays.asList("com.google.android.gms.measurement.AppMeasurement");
    public static final List<String> zze = Arrays.asList(new String[0]);
    public static final Set<String> zzf = Collections.emptySet();
    public static final Object zzg = new Object();
    public static final Executor zzh = new zzb((byte) 0);
    public final Context zzi;
    public final String zzj;
    public final FirebaseOptions zzk;
    public final zzf zzl;
    public final SharedPreferences zzm;
    public final Publisher zzn;
    public final AtomicBoolean zzo = new AtomicBoolean(false);
    public final AtomicBoolean zzp = new AtomicBoolean();
    public final AtomicBoolean zzq;
    public final List<IdTokenListener> zzr = new CopyOnWriteArrayList();
    public final List<BackgroundStateChangeListener> zzs = new CopyOnWriteArrayList();
    public final List<FirebaseAppLifecycleListener> zzt = new CopyOnWriteArrayList();
    public InternalTokenProvider zzu;
    public IdTokenListenersCountChangedListener zzv;

    @KeepForSdk
    public interface BackgroundStateChangeListener {
        @KeepForSdk
        void onBackgroundStateChanged(boolean z);
    }

    @Deprecated
    @KeepForSdk
    public interface IdTokenListener {
        @KeepForSdk
        void onIdTokenChanged(@NonNull InternalTokenResult internalTokenResult);
    }

    @Deprecated
    @KeepForSdk
    public interface IdTokenListenersCountChangedListener {
        @KeepForSdk
        void onListenerCountChanged(int i);
    }

    @TargetApi(14)
    public static class zza implements BackgroundDetector.BackgroundStateChangeListener {
        public static AtomicReference<zza> zza = new AtomicReference<>();

        public static /* synthetic */ void zza(Context context) {
            if (PlatformVersion.isAtLeastIceCreamSandwich() && (context.getApplicationContext() instanceof Application)) {
                Application application = (Application) context.getApplicationContext();
                if (zza.get() == null) {
                    zza zza2 = new zza();
                    if (zza.compareAndSet(null, zza2)) {
                        BackgroundDetector.initialize(application);
                        BackgroundDetector.getInstance().addListener(zza2);
                    }
                }
            }
        }

        @Override // com.google.android.gms.common.api.internal.BackgroundDetector.BackgroundStateChangeListener
        public final void onBackgroundStateChanged(boolean z) {
            synchronized (FirebaseApp.zzg) {
                Iterator it = new ArrayList(FirebaseApp.zza.values()).iterator();
                while (it.hasNext()) {
                    FirebaseApp firebaseApp = (FirebaseApp) it.next();
                    if (firebaseApp.zzo.get()) {
                        firebaseApp.zza((FirebaseApp) z);
                    }
                }
            }
        }
    }

    public static class zzb implements Executor {
        public static final Handler zza = new Handler(Looper.getMainLooper());

        public zzb() {
        }

        public final void execute(@NonNull Runnable runnable) {
            zza.post(runnable);
        }

        public /* synthetic */ zzb(byte b) {
            this();
        }
    }

    @TargetApi(24)
    public static class zzc extends BroadcastReceiver {
        public static AtomicReference<zzc> zza = new AtomicReference<>();
        public final Context zzb;

        public zzc(Context context) {
            this.zzb = context;
        }

        public static /* synthetic */ void zza(Context context) {
            if (zza.get() == null) {
                zzc zzc = new zzc(context);
                if (zza.compareAndSet(null, zzc)) {
                    context.registerReceiver(zzc, new IntentFilter("android.intent.action.USER_UNLOCKED"));
                }
            }
        }

        public final void onReceive(Context context, Intent intent) {
            synchronized (FirebaseApp.zzg) {
                for (FirebaseApp firebaseApp : FirebaseApp.zza.values()) {
                    firebaseApp.zze();
                }
            }
            this.zzb.unregisterReceiver(this);
        }
    }

    public FirebaseApp(Context context, String str, FirebaseOptions firebaseOptions) {
        this.zzi = (Context) Preconditions.checkNotNull(context);
        this.zzj = Preconditions.checkNotEmpty(str);
        this.zzk = (FirebaseOptions) Preconditions.checkNotNull(firebaseOptions);
        this.zzv = new com.google.firebase.internal.zza();
        this.zzm = context.getSharedPreferences("com.google.firebase.common.prefs", 0);
        this.zzq = new AtomicBoolean(zzb());
        List<ComponentRegistrar> zza2 = Component.C09701.zza(context).zza();
        zzf zzf2 = new zzf(zzh, zza2, Component.m988of(context, Context.class, new Class[0]), Component.m988of(this, FirebaseApp.class, new Class[0]), Component.m988of(firebaseOptions, FirebaseOptions.class, new Class[0]));
        this.zzl = zzf2;
        this.zzn = (Publisher) zzf2.get(Publisher.class);
    }

    @PublicApi
    public static List<FirebaseApp> getApps(Context context) {
        ArrayList arrayList;
        synchronized (zzg) {
            arrayList = new ArrayList(zza.values());
        }
        return arrayList;
    }

    @Nullable
    @PublicApi
    public static FirebaseApp getInstance() {
        FirebaseApp firebaseApp;
        synchronized (zzg) {
            firebaseApp = zza.get("[DEFAULT]");
            if (firebaseApp == null) {
                throw new IllegalStateException("Default FirebaseApp is not initialized in this process " + ProcessUtils.getMyProcessName() + ". Make sure to call FirebaseApp.initializeApp(Context) first.");
            }
        }
        return firebaseApp;
    }

    @Nullable
    @PublicApi
    public static FirebaseApp initializeApp(Context context) {
        synchronized (zzg) {
            if (zza.containsKey("[DEFAULT]")) {
                return getInstance();
            }
            FirebaseOptions fromResource = FirebaseOptions.fromResource(context);
            if (fromResource == null) {
                return null;
            }
            return initializeApp(context, fromResource);
        }
    }

    private void zzc() {
        Preconditions.checkState(!this.zzp.get(), "FirebaseApp was deleted");
    }

    public static List<String> zzd() {
        ArrayList arrayList = new ArrayList();
        synchronized (zzg) {
            for (FirebaseApp firebaseApp : zza.values()) {
                arrayList.add(firebaseApp.getName());
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void zze() {
        boolean OooO00o = C7009o000OoOo.m18259OooO00o(this.zzi);
        if (OooO00o) {
            zzc.zza(this.zzi);
        } else {
            this.zzl.zza(isDefaultApp());
        }
        zza(FirebaseApp.class, this, zzb, OooO00o);
        if (isDefaultApp()) {
            zza(FirebaseApp.class, this, zzc, OooO00o);
            zza(Context.class, this.zzi, zzd, OooO00o);
        }
    }

    @KeepForSdk
    public void addBackgroundStateChangeListener(BackgroundStateChangeListener backgroundStateChangeListener) {
        zzc();
        if (this.zzo.get() && BackgroundDetector.getInstance().isInBackground()) {
            backgroundStateChangeListener.onBackgroundStateChanged(true);
        }
        this.zzs.add(backgroundStateChangeListener);
    }

    @KeepForSdk
    @Deprecated
    public void addIdTokenListener(@NonNull IdTokenListener idTokenListener) {
        zzc();
        Preconditions.checkNotNull(idTokenListener);
        this.zzr.add(idTokenListener);
        this.zzv.onListenerCountChanged(this.zzr.size());
    }

    @KeepForSdk
    public void addLifecycleEventListener(@NonNull FirebaseAppLifecycleListener firebaseAppLifecycleListener) {
        zzc();
        Preconditions.checkNotNull(firebaseAppLifecycleListener);
        this.zzt.add(firebaseAppLifecycleListener);
    }

    @PublicApi
    public void delete() {
        if (this.zzp.compareAndSet(false, true)) {
            synchronized (zzg) {
                zza.remove(this.zzj);
            }
            Iterator<FirebaseAppLifecycleListener> it = this.zzt.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof FirebaseApp)) {
            return false;
        }
        return this.zzj.equals(((FirebaseApp) obj).getName());
    }

    @KeepForSdk
    public <T> T get(Class<T> cls) {
        zzc();
        return (T) this.zzl.get(cls);
    }

    @NonNull
    @PublicApi
    public Context getApplicationContext() {
        zzc();
        return this.zzi;
    }

    @KeepForSdk
    @Deprecated
    public List<IdTokenListener> getListeners() {
        zzc();
        return this.zzr;
    }

    @NonNull
    @PublicApi
    public String getName() {
        zzc();
        return this.zzj;
    }

    @NonNull
    @PublicApi
    public FirebaseOptions getOptions() {
        zzc();
        return this.zzk;
    }

    @KeepForSdk
    public String getPersistenceKey() {
        return Base64Utils.encodeUrlSafeNoPadding(getName().getBytes(Charset.defaultCharset())) + "+" + Base64Utils.encodeUrlSafeNoPadding(getOptions().getApplicationId().getBytes(Charset.defaultCharset()));
    }

    @KeepForSdk
    @Deprecated
    public Task<GetTokenResult> getToken(boolean z) {
        zzc();
        InternalTokenProvider internalTokenProvider = this.zzu;
        if (internalTokenProvider == null) {
            return Tasks.forException(new FirebaseApiNotAvailableException("firebase-auth is not linked, please fall back to unauthenticated mode."));
        }
        return internalTokenProvider.getAccessToken(z);
    }

    @Deprecated
    @Nullable
    @KeepForSdk
    public String getUid() throws FirebaseApiNotAvailableException {
        zzc();
        InternalTokenProvider internalTokenProvider = this.zzu;
        if (internalTokenProvider != null) {
            return internalTokenProvider.getUid();
        }
        throw new FirebaseApiNotAvailableException("firebase-auth is not linked, please fall back to unauthenticated mode.");
    }

    public int hashCode() {
        return this.zzj.hashCode();
    }

    @KeepForSdk
    public boolean isDataCollectionDefaultEnabled() {
        zzc();
        return this.zzq.get();
    }

    @KeepForSdk
    @VisibleForTesting
    public boolean isDefaultApp() {
        return "[DEFAULT]".equals(getName());
    }

    @KeepForSdk
    @UiThread
    @Deprecated
    public void notifyIdTokenListeners(@NonNull InternalTokenResult internalTokenResult) {
        int i = 0;
        for (IdTokenListener idTokenListener : this.zzr) {
            idTokenListener.onIdTokenChanged(internalTokenResult);
            i++;
        }
        String.format("Notified %d auth state listeners.", Integer.valueOf(i));
    }

    @KeepForSdk
    public void removeBackgroundStateChangeListener(BackgroundStateChangeListener backgroundStateChangeListener) {
        zzc();
        this.zzs.remove(backgroundStateChangeListener);
    }

    @KeepForSdk
    @Deprecated
    public void removeIdTokenListener(@NonNull IdTokenListener idTokenListener) {
        zzc();
        Preconditions.checkNotNull(idTokenListener);
        this.zzr.remove(idTokenListener);
        this.zzv.onListenerCountChanged(this.zzr.size());
    }

    @KeepForSdk
    public void removeLifecycleEventListener(@NonNull FirebaseAppLifecycleListener firebaseAppLifecycleListener) {
        zzc();
        Preconditions.checkNotNull(firebaseAppLifecycleListener);
        this.zzt.remove(firebaseAppLifecycleListener);
    }

    @PublicApi
    public void setAutomaticResourceManagementEnabled(boolean z) {
        zzc();
        if (this.zzo.compareAndSet(!z, z)) {
            boolean isInBackground = BackgroundDetector.getInstance().isInBackground();
            if (z && isInBackground) {
                zza(true);
            } else if (!z && isInBackground) {
                zza(false);
            }
        }
    }

    @KeepForSdk
    public void setDataCollectionDefaultEnabled(boolean z) {
        zzc();
        if (this.zzq.compareAndSet(!z, z)) {
            this.zzm.edit().putBoolean("firebase_data_collection_default_enabled", z).commit();
            this.zzn.publish(new Event<>(DataCollectionDefaultChange.class, new DataCollectionDefaultChange(z)));
        }
    }

    @KeepForSdk
    @Deprecated
    public void setIdTokenListenersCountChangedListener(@NonNull IdTokenListenersCountChangedListener idTokenListenersCountChangedListener) {
        IdTokenListenersCountChangedListener idTokenListenersCountChangedListener2 = (IdTokenListenersCountChangedListener) Preconditions.checkNotNull(idTokenListenersCountChangedListener);
        this.zzv = idTokenListenersCountChangedListener2;
        idTokenListenersCountChangedListener2.onListenerCountChanged(this.zzr.size());
    }

    @KeepForSdk
    @Deprecated
    public void setTokenProvider(@NonNull InternalTokenProvider internalTokenProvider) {
        this.zzu = (InternalTokenProvider) Preconditions.checkNotNull(internalTokenProvider);
    }

    public String toString() {
        return Objects.toStringHelper(this).add("name", this.zzj).add("options", this.zzk).toString();
    }

    private boolean zzb() {
        ApplicationInfo applicationInfo;
        if (this.zzm.contains("firebase_data_collection_default_enabled")) {
            return this.zzm.getBoolean("firebase_data_collection_default_enabled", true);
        }
        try {
            PackageManager packageManager = this.zzi.getPackageManager();
            if (!(packageManager == null || (applicationInfo = packageManager.getApplicationInfo(this.zzi.getPackageName(), 128)) == null || applicationInfo.metaData == null || !applicationInfo.metaData.containsKey("firebase_data_collection_default_enabled"))) {
                return applicationInfo.metaData.getBoolean("firebase_data_collection_default_enabled");
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return true;
    }

    @KeepForSdk
    public static String getPersistenceKey(String str, FirebaseOptions firebaseOptions) {
        return Base64Utils.encodeUrlSafeNoPadding(str.getBytes(Charset.defaultCharset())) + "+" + Base64Utils.encodeUrlSafeNoPadding(firebaseOptions.getApplicationId().getBytes(Charset.defaultCharset()));
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void zza(boolean z) {
        for (BackgroundStateChangeListener backgroundStateChangeListener : this.zzs) {
            backgroundStateChangeListener.onBackgroundStateChanged(z);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: java.lang.Class<?> */
    /* JADX WARN: Multi-variable type inference failed */
    public static <T> void zza(Class<T> cls, T t, Iterable<String> iterable, boolean z) {
        for (String str : iterable) {
            if (z) {
                try {
                    if (!zze.contains(str)) {
                    }
                } catch (ClassNotFoundException unused) {
                    if (!zzf.contains(str)) {
                        String str2 = str + " is not linked. Skipping initialization.";
                    } else {
                        throw new IllegalStateException(str + " is missing, but is required. Check if it has been removed by Proguard.");
                    }
                } catch (NoSuchMethodException unused2) {
                    throw new IllegalStateException(str + "#getInstance has been removed by Proguard. Add keep rule to prevent it.");
                } catch (InvocationTargetException unused3) {
                    continue;
                } catch (IllegalAccessException unused4) {
                    String str3 = "Failed to initialize " + str;
                }
            }
            Method method = Class.forName(str).getMethod("getInstance", cls);
            int modifiers = method.getModifiers();
            if (Modifier.isPublic(modifiers) && Modifier.isStatic(modifiers)) {
                method.invoke(null, t);
            }
        }
    }

    @PublicApi
    public static FirebaseApp getInstance(@NonNull String str) {
        FirebaseApp firebaseApp;
        String str2;
        synchronized (zzg) {
            firebaseApp = zza.get(str.trim());
            if (firebaseApp == null) {
                List<String> zzd2 = zzd();
                if (zzd2.isEmpty()) {
                    str2 = "";
                } else {
                    str2 = "Available app names: " + TextUtils.join(", ", zzd2);
                }
                throw new IllegalStateException(String.format("FirebaseApp with name %s doesn't exist. %s", str, str2));
            }
        }
        return firebaseApp;
    }

    @PublicApi
    public static FirebaseApp initializeApp(Context context, FirebaseOptions firebaseOptions) {
        return initializeApp(context, firebaseOptions, "[DEFAULT]");
    }

    @PublicApi
    public static FirebaseApp initializeApp(Context context, FirebaseOptions firebaseOptions, String str) {
        FirebaseApp firebaseApp;
        zza.zza(context);
        String trim = str.trim();
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        synchronized (zzg) {
            boolean z = !zza.containsKey(trim);
            Preconditions.checkState(z, "FirebaseApp name " + trim + " already exists!");
            Preconditions.checkNotNull(context, "Application context cannot be null.");
            firebaseApp = new FirebaseApp(context, trim, firebaseOptions);
            zza.put(trim, firebaseApp);
        }
        firebaseApp.zze();
        return firebaseApp;
    }
}

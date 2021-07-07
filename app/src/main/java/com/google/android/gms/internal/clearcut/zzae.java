package com.google.android.gms.internal.clearcut;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Binder;
import android.os.Build;
import android.os.UserManager;
import androidx.core.content.PermissionChecker;
import javax.annotation.Nullable;

public abstract class zzae<T> {
    public static final Object zzdn = new Object();
    public static boolean zzdo;
    public static volatile Boolean zzdp;
    public static volatile Boolean zzdq;
    @SuppressLint({"StaticFieldLeak"})
    public static Context zzh;
    public final zzao zzdr;
    public final String zzds;
    public final String zzdt;
    public final T zzdu;
    public T zzdv;
    public volatile zzab zzdw;
    public volatile SharedPreferences zzdx;

    public zzae(zzao zzao, String str, T t) {
        this.zzdv = null;
        this.zzdw = null;
        this.zzdx = null;
        if (zzao.zza(zzao) == null && zzao.zzb(zzao) == null) {
            throw new IllegalArgumentException("Must pass a valid SharedPreferences file name or ContentProvider URI");
        } else if (zzao.zza(zzao) == null || zzao.zzb(zzao) == null) {
            this.zzdr = zzao;
            String valueOf = String.valueOf(zzao.zzc(zzao));
            String valueOf2 = String.valueOf(str);
            this.zzdt = valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
            String valueOf3 = String.valueOf(zzao.zzd(zzao));
            String valueOf4 = String.valueOf(str);
            this.zzds = valueOf4.length() != 0 ? valueOf3.concat(valueOf4) : new String(valueOf3);
            this.zzdu = t;
        } else {
            throw new IllegalArgumentException("Must pass one of SharedPreferences file name or ContentProvider URI");
        }
    }

    public /* synthetic */ zzae(zzao zzao, String str, Object obj, zzai zzai) {
        this(zzao, str, obj);
    }

    public static void maybeInit(Context context) {
        if (zzh == null) {
            synchronized (zzdn) {
                if (Build.VERSION.SDK_INT < 24 || !context.isDeviceProtectedStorage()) {
                    Context applicationContext = context.getApplicationContext();
                    if (applicationContext != null) {
                        context = applicationContext;
                    }
                }
                if (zzh != context) {
                    zzdp = null;
                }
                zzh = context;
            }
            zzdo = false;
        }
    }

    public static <T> zzae<T> zza(zzao zzao, String str, T t, zzan<T> zzan) {
        return new zzal(zzao, str, t, zzan);
    }

    public static zzae<String> zza(zzao zzao, String str, String str2) {
        return new zzak(zzao, str, str2);
    }

    public static zzae<Boolean> zza(zzao zzao, String str, boolean z) {
        return new zzaj(zzao, str, Boolean.valueOf(z));
    }

    public static <V> V zza(zzam<V> zzam) {
        long clearCallingIdentity;
        try {
            return zzam.zzp();
        } catch (SecurityException unused) {
            clearCallingIdentity = Binder.clearCallingIdentity();
            V zzp = zzam.zzp();
            Binder.restoreCallingIdentity(clearCallingIdentity);
            return zzp;
        } catch (Throwable th) {
            Binder.restoreCallingIdentity(clearCallingIdentity);
            throw th;
        }
    }

    public static boolean zza(String str, boolean z) {
        if (zzn()) {
            return ((Boolean) zza(new zzah(str, false))).booleanValue();
        }
        return false;
    }

    @Nullable
    @TargetApi(24)
    private final T zzl() {
        boolean z;
        if (zza("gms:phenotype:phenotype_flag:debug_bypass_phenotype", false)) {
            String valueOf = String.valueOf(this.zzds);
            if (valueOf.length() != 0) {
                "Bypass reading Phenotype values for flag: ".concat(valueOf);
            } else {
                new String("Bypass reading Phenotype values for flag: ");
            }
        } else if (zzao.zzb(this.zzdr) != null) {
            if (this.zzdw == null) {
                this.zzdw = zzab.zza(zzh.getContentResolver(), zzao.zzb(this.zzdr));
            }
            String str = (String) zza(new zzaf(this, this.zzdw));
            if (str != null) {
                return zzb(str);
            }
        } else if (zzao.zza(this.zzdr) != null) {
            if (Build.VERSION.SDK_INT < 24 || zzh.isDeviceProtectedStorage()) {
                z = true;
            } else {
                if (zzdq == null || !zzdq.booleanValue()) {
                    zzdq = Boolean.valueOf(((UserManager) zzh.getSystemService(UserManager.class)).isUserUnlocked());
                }
                z = zzdq.booleanValue();
            }
            if (!z) {
                return null;
            }
            if (this.zzdx == null) {
                this.zzdx = zzh.getSharedPreferences(zzao.zza(this.zzdr), 0);
            }
            SharedPreferences sharedPreferences = this.zzdx;
            if (sharedPreferences.contains(this.zzds)) {
                return zza(sharedPreferences);
            }
        }
        return null;
    }

    @Nullable
    private final T zzm() {
        String str;
        if (zzao.zzf(this.zzdr) || !zzn() || (str = (String) zza(new zzag(this))) == null) {
            return null;
        }
        return zzb(str);
    }

    public static boolean zzn() {
        if (zzdp == null) {
            Context context = zzh;
            boolean z = false;
            if (context == null) {
                return false;
            }
            if (PermissionChecker.OooO00o(context, "com.google.android.providers.gsf.permission.READ_GSERVICES") == 0) {
                z = true;
            }
            zzdp = Boolean.valueOf(z);
        }
        return zzdp.booleanValue();
    }

    public final T get() {
        if (zzh != null) {
            if (zzao.zze(this.zzdr)) {
                T zzm = zzm();
                if (zzm != null) {
                    return zzm;
                }
                T zzl = zzl();
                if (zzl != null) {
                    return zzl;
                }
            } else {
                T zzl2 = zzl();
                if (zzl2 != null) {
                    return zzl2;
                }
                T zzm2 = zzm();
                if (zzm2 != null) {
                    return zzm2;
                }
            }
            return this.zzdu;
        }
        throw new IllegalStateException("Must call PhenotypeFlag.init() first");
    }

    public abstract T zza(SharedPreferences sharedPreferences);

    public abstract T zzb(String str);

    public final /* synthetic */ String zzo() {
        return zzy.zza(zzh.getContentResolver(), this.zzdt, (String) null);
    }
}

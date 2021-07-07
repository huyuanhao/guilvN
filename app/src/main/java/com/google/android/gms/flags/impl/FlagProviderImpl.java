package com.google.android.gms.flags.impl;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import com.google.android.gms.common.util.DynamiteApi;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.flags.zzd;

@DynamiteApi
public class FlagProviderImpl extends zzd {
    public boolean zzu = false;
    public SharedPreferences zzv;

    @Override // com.google.android.gms.flags.zzc
    public boolean getBooleanFlagValue(String str, boolean z, int i) {
        if (!this.zzu) {
            return z;
        }
        return zzb.zza(this.zzv, str, Boolean.valueOf(z)).booleanValue();
    }

    @Override // com.google.android.gms.flags.zzc
    public int getIntFlagValue(String str, int i, int i2) {
        if (!this.zzu) {
            return i;
        }
        return zzd.zza(this.zzv, str, Integer.valueOf(i)).intValue();
    }

    @Override // com.google.android.gms.flags.zzc
    public long getLongFlagValue(String str, long j, int i) {
        if (!this.zzu) {
            return j;
        }
        return zzf.zza(this.zzv, str, Long.valueOf(j)).longValue();
    }

    @Override // com.google.android.gms.flags.zzc
    public String getStringFlagValue(String str, String str2, int i) {
        if (!this.zzu) {
            return str2;
        }
        return zzh.zza(this.zzv, str, str2);
    }

    @Override // com.google.android.gms.flags.zzc
    public void init(IObjectWrapper iObjectWrapper) {
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        if (!this.zzu) {
            try {
                this.zzv = zzj.zza(context.createPackageContext("com.google.android.gms", 0));
                this.zzu = true;
            } catch (PackageManager.NameNotFoundException unused) {
            } catch (Exception e) {
                String valueOf = String.valueOf(e.getMessage());
                if (valueOf.length() != 0) {
                    "Could not retrieve sdk flags, continuing with defaults: ".concat(valueOf);
                } else {
                    new String("Could not retrieve sdk flags, continuing with defaults: ");
                }
            }
        }
    }
}

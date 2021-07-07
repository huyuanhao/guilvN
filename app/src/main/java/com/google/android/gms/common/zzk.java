package com.google.android.gms.common;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzj;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import javax.annotation.Nullable;

@SafeParcelable.Class(creator = "GoogleCertificatesQueryCreator")
public final class zzk extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzk> CREATOR = new zzl();
    @SafeParcelable.Field(getter = "getAllowTestKeys", mo10865id = 3)
    public final boolean zzaa;
    @SafeParcelable.Field(getter = "getForbidTestKeys", mo10865id = 4)
    public final boolean zzab;
    @SafeParcelable.Field(getter = "getCallingPackage", mo10865id = 1)
    public final String zzy;
    @Nullable
    @SafeParcelable.Field(getter = "getCallingCertificateBinder", mo10865id = 2, type = "android.os.IBinder")
    public final zze zzz;

    @SafeParcelable.Constructor
    public zzk(@SafeParcelable.Param(mo10868id = 1) String str, @SafeParcelable.Param(mo10868id = 2) @Nullable IBinder iBinder, @SafeParcelable.Param(mo10868id = 3) boolean z, @SafeParcelable.Param(mo10868id = 4) boolean z2) {
        this.zzy = str;
        this.zzz = zza(iBinder);
        this.zzaa = z;
        this.zzab = z2;
    }

    @Nullable
    public static zze zza(@Nullable IBinder iBinder) {
        byte[] bArr;
        if (iBinder == null) {
            return null;
        }
        try {
            IObjectWrapper zzb = zzj.zzb(iBinder).zzb();
            if (zzb == null) {
                bArr = null;
            } else {
                bArr = (byte[]) ObjectWrapper.unwrap(zzb);
            }
            if (bArr != null) {
                return new zzf(bArr);
            }
            return null;
        } catch (RemoteException unused) {
            return null;
        }
    }

    public final void writeToParcel(Parcel parcel, int i) {
        IBinder iBinder;
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.zzy, false);
        zze zze = this.zzz;
        if (zze == null) {
            iBinder = null;
        } else {
            iBinder = zze.asBinder();
        }
        SafeParcelWriter.writeIBinder(parcel, 2, iBinder, false);
        SafeParcelWriter.writeBoolean(parcel, 3, this.zzaa);
        SafeParcelWriter.writeBoolean(parcel, 4, this.zzab);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public zzk(String str, @Nullable zze zze, boolean z, boolean z2) {
        this.zzy = str;
        this.zzz = zze;
        this.zzaa = z;
        this.zzab = z2;
    }
}

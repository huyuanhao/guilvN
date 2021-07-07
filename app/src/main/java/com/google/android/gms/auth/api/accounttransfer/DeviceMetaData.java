package com.google.android.gms.auth.api.accounttransfer;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "DeviceMetaDataCreator")
public class DeviceMetaData extends AbstractSafeParcelable {
    public static final Parcelable.Creator<DeviceMetaData> CREATOR = new zzv();
    @SafeParcelable.Field(getter = "isLockScreenSolved", mo10865id = 2)
    public boolean zzbs;
    @SafeParcelable.Field(getter = "getMinAgeOfLockScreen", mo10865id = 3)
    public long zzbt;
    @SafeParcelable.Field(getter = "isChallengeAllowed", mo10865id = 4)
    public final boolean zzbu;
    @SafeParcelable.VersionField(mo10871id = 1)
    public final int zzv;

    @SafeParcelable.Constructor
    public DeviceMetaData(@SafeParcelable.Param(mo10868id = 1) int i, @SafeParcelable.Param(mo10868id = 2) boolean z, @SafeParcelable.Param(mo10868id = 3) long j, @SafeParcelable.Param(mo10868id = 4) boolean z2) {
        this.zzv = i;
        this.zzbs = z;
        this.zzbt = j;
        this.zzbu = z2;
    }

    public long getMinAgeOfLockScreen() {
        return this.zzbt;
    }

    public boolean isChallengeAllowed() {
        return this.zzbu;
    }

    public boolean isLockScreenSolved() {
        return this.zzbs;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.zzv);
        SafeParcelWriter.writeBoolean(parcel, 2, isLockScreenSolved());
        SafeParcelWriter.writeLong(parcel, 3, getMinAgeOfLockScreen());
        SafeParcelWriter.writeBoolean(parcel, 4, isChallengeAllowed());
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}

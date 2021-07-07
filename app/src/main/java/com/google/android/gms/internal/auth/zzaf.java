package com.google.android.gms.internal.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "SendDataRequestCreator")
public final class zzaf extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzaf> CREATOR = new zzag();
    @SafeParcelable.Field(mo10865id = 2)
    public final String accountType;
    @SafeParcelable.Field(mo10865id = 3)
    public final byte[] zzbp;
    @SafeParcelable.VersionField(mo10871id = 1)
    public final int zzv;

    public zzaf(String str, byte[] bArr) {
        this(1, str, bArr);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.zzv);
        SafeParcelWriter.writeString(parcel, 2, this.accountType, false);
        SafeParcelWriter.writeByteArray(parcel, 3, this.zzbp, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @SafeParcelable.Constructor
    public zzaf(@SafeParcelable.Param(mo10868id = 1) int i, @SafeParcelable.Param(mo10868id = 2) String str, @SafeParcelable.Param(mo10868id = 3) byte[] bArr) {
        this.zzv = 1;
        this.accountType = (String) Preconditions.checkNotNull(str);
        this.zzbp = (byte[]) Preconditions.checkNotNull(bArr);
    }
}

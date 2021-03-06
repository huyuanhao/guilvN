package com.google.android.gms.clearcut;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "CollectForDebugParcelableCreator")
public final class zzc extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzc> CREATOR = new zzd();
    @SafeParcelable.Field(defaultValue = "false", mo10865id = 1)
    public final boolean zzad;
    @SafeParcelable.Field(mo10865id = 3)
    public final long zzae;
    @SafeParcelable.Field(mo10865id = 2)
    public final long zzaf;

    @SafeParcelable.Constructor
    public zzc(@SafeParcelable.Param(mo10868id = 1) boolean z, @SafeParcelable.Param(mo10868id = 3) long j, @SafeParcelable.Param(mo10868id = 2) long j2) {
        this.zzad = z;
        this.zzae = j;
        this.zzaf = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzc) {
            zzc zzc = (zzc) obj;
            return this.zzad == zzc.zzad && this.zzae == zzc.zzae && this.zzaf == zzc.zzaf;
        }
    }

    public final int hashCode() {
        return Objects.hashCode(Boolean.valueOf(this.zzad), Long.valueOf(this.zzae), Long.valueOf(this.zzaf));
    }

    public final String toString() {
        return "CollectForDebugParcelable[skipPersistentStorage: " + this.zzad + ",collectForDebugStartTimeMillis: " + this.zzae + ",collectForDebugExpiryTimeMillis: " + this.zzaf + "]";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeBoolean(parcel, 1, this.zzad);
        SafeParcelWriter.writeLong(parcel, 2, this.zzaf);
        SafeParcelWriter.writeLong(parcel, 3, this.zzae);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}

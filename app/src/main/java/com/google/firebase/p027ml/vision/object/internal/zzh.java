package com.google.firebase.p027ml.vision.object.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "ObjectParcelCreator")
/* renamed from: com.google.firebase.ml.vision.object.internal.zzh */
public final class zzh extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzh> CREATOR = new zzi();
    @SafeParcelable.Field(mo10865id = 5)
    public final int category;
    @SafeParcelable.Field(mo10865id = 3)
    public final Float confidence;
    @SafeParcelable.Field(mo10865id = 4)
    public final String zzavo;
    @SafeParcelable.Field(mo10865id = 1)
    public final int[] zzazj;
    @SafeParcelable.Field(mo10865id = 2)
    public final Integer zzazk;

    @SafeParcelable.Constructor
    public zzh(@SafeParcelable.Param(mo10868id = 1) int[] iArr, @SafeParcelable.Param(mo10868id = 2) Integer num, @SafeParcelable.Param(mo10868id = 3) Float f, @SafeParcelable.Param(mo10868id = 4) String str, @SafeParcelable.Param(mo10868id = 5) int i) {
        this.zzazj = iArr;
        this.zzazk = num;
        this.confidence = f;
        this.zzavo = str;
        this.category = i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeIntArray(parcel, 1, this.zzazj, false);
        SafeParcelWriter.writeIntegerObject(parcel, 2, this.zzazk, false);
        SafeParcelWriter.writeFloatObject(parcel, 3, this.confidence, false);
        SafeParcelWriter.writeString(parcel, 4, this.zzavo, false);
        SafeParcelWriter.writeInt(parcel, 5, this.category);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}

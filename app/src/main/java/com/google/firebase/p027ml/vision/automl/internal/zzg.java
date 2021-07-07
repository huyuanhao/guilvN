package com.google.firebase.p027ml.vision.automl.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "ImageMetadataParcelCreator")
/* renamed from: com.google.firebase.ml.vision.automl.internal.zzg */
public final class zzg extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzg> CREATOR = new zzh();
    @SafeParcelable.Field(mo10865id = 2)
    public final int height;
    @SafeParcelable.Field(mo10865id = 3)

    /* renamed from: id */
    public final int f1009id;
    @SafeParcelable.Field(mo10865id = 5)
    public final int rotation;
    @SafeParcelable.Field(mo10865id = 1)
    public final int width;
    @SafeParcelable.Field(mo10865id = 4)
    public final long zzauo;

    @SafeParcelable.Constructor
    public zzg(@SafeParcelable.Param(mo10868id = 1) int i, @SafeParcelable.Param(mo10868id = 2) int i2, @SafeParcelable.Param(mo10868id = 3) int i3, @SafeParcelable.Param(mo10868id = 4) long j, @SafeParcelable.Param(mo10868id = 5) int i4) {
        this.width = i;
        this.height = i2;
        this.f1009id = i3;
        this.zzauo = j;
        this.rotation = i4;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.width);
        SafeParcelWriter.writeInt(parcel, 2, this.height);
        SafeParcelWriter.writeInt(parcel, 3, this.f1009id);
        SafeParcelWriter.writeLong(parcel, 4, this.zzauo);
        SafeParcelWriter.writeInt(parcel, 5, this.rotation);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}

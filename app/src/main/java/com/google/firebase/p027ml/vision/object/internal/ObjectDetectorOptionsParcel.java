package com.google.firebase.p027ml.vision.object.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "ObjectDetectorOptionsParcelCreator")
/* renamed from: com.google.firebase.ml.vision.object.internal.ObjectDetectorOptionsParcel */
public class ObjectDetectorOptionsParcel extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ObjectDetectorOptionsParcel> CREATOR = new zzg();
    @SafeParcelable.Field(mo10865id = 1)
    public final int zzaze;
    @SafeParcelable.Field(mo10865id = 2)
    public final boolean zzazf;
    @SafeParcelable.Field(mo10865id = 3)
    public final boolean zzazg;

    @SafeParcelable.Constructor
    public ObjectDetectorOptionsParcel(@SafeParcelable.Param(mo10868id = 1) int i, @SafeParcelable.Param(mo10868id = 2) boolean z, @SafeParcelable.Param(mo10868id = 3) boolean z2) {
        this.zzaze = i;
        this.zzazf = z;
        this.zzazg = z2;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.zzaze);
        SafeParcelWriter.writeBoolean(parcel, 2, this.zzazf);
        SafeParcelWriter.writeBoolean(parcel, 3, this.zzazg);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}

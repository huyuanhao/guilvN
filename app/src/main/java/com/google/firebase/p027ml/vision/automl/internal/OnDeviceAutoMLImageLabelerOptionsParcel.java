package com.google.firebase.p027ml.vision.automl.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "OnDeviceAutoMLImageLabelerOptionsParcelCreator")
/* renamed from: com.google.firebase.ml.vision.automl.internal.OnDeviceAutoMLImageLabelerOptionsParcel */
public class OnDeviceAutoMLImageLabelerOptionsParcel extends AbstractSafeParcelable {
    public static final Parcelable.Creator<OnDeviceAutoMLImageLabelerOptionsParcel> CREATOR = new zzi();
    @SafeParcelable.Field(mo10865id = 2)
    public final String zzasr;
    @SafeParcelable.Field(mo10865id = 3)
    public final String zzass;
    @SafeParcelable.Field(mo10865id = 1)
    public final float zzavp;

    @SafeParcelable.Constructor
    public OnDeviceAutoMLImageLabelerOptionsParcel(@SafeParcelable.Param(mo10868id = 1) float f, @SafeParcelable.Param(mo10868id = 2) String str, @SafeParcelable.Param(mo10868id = 3) String str2) {
        this.zzavp = f;
        this.zzasr = str;
        this.zzass = str2;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeFloat(parcel, 1, this.zzavp);
        SafeParcelWriter.writeString(parcel, 2, this.zzasr, false);
        SafeParcelWriter.writeString(parcel, 3, this.zzass, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}

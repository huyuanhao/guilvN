package com.google.android.gms.vision.face.internal.client;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "FaceSettingsParcelCreator")
@SafeParcelable.Reserved({1})
public final class zze extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zze> CREATOR = new zzf();
    @SafeParcelable.Field(mo10865id = 3)
    public int landmarkType;
    @SafeParcelable.Field(mo10865id = 2)
    public int mode;
    @SafeParcelable.Field(defaultValue = "-1", mo10865id = 7)
    public float proportionalMinFaceSize;
    @SafeParcelable.Field(mo10865id = 6)
    public boolean trackingEnabled;
    @SafeParcelable.Field(mo10865id = 5)
    public boolean zzcm;
    @SafeParcelable.Field(mo10865id = 4)
    public int zzcn;

    public zze() {
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 2, this.mode);
        SafeParcelWriter.writeInt(parcel, 3, this.landmarkType);
        SafeParcelWriter.writeInt(parcel, 4, this.zzcn);
        SafeParcelWriter.writeBoolean(parcel, 5, this.zzcm);
        SafeParcelWriter.writeBoolean(parcel, 6, this.trackingEnabled);
        SafeParcelWriter.writeFloat(parcel, 7, this.proportionalMinFaceSize);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @SafeParcelable.Constructor
    public zze(@SafeParcelable.Param(mo10868id = 2) int i, @SafeParcelable.Param(mo10868id = 3) int i2, @SafeParcelable.Param(mo10868id = 4) int i3, @SafeParcelable.Param(mo10868id = 5) boolean z, @SafeParcelable.Param(mo10868id = 6) boolean z2, @SafeParcelable.Param(mo10868id = 7) float f) {
        this.mode = i;
        this.landmarkType = i2;
        this.zzcn = i3;
        this.zzcm = z;
        this.trackingEnabled = z2;
        this.proportionalMinFaceSize = f;
    }
}

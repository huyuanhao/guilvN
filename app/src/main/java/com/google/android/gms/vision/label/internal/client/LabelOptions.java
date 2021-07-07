package com.google.android.gms.vision.label.internal.client;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "LabelOptionsCreator")
@SafeParcelable.Reserved({1})
@ShowFirstParty
@KeepForSdk
public class LabelOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator<LabelOptions> CREATOR = new zzh();
    @SafeParcelable.Field(mo10865id = 2)
    @Deprecated
    public final int zzej;

    @SafeParcelable.Constructor
    public LabelOptions(@SafeParcelable.Param(mo10868id = 2) int i) {
        this.zzej = i;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 2, this.zzej);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}

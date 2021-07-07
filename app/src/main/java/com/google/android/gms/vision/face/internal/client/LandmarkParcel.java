package com.google.android.gms.vision.face.internal.client;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.common.proguard.UsedByNative;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@UsedByNative("wrapper.cc")
@SafeParcelable.Class(creator = "LandmarkParcelCreator")
public final class LandmarkParcel extends AbstractSafeParcelable {
    public static final Parcelable.Creator<LandmarkParcel> CREATOR = new zzm();
    @SafeParcelable.Field(mo10865id = 4)
    public final int type;
    @SafeParcelable.VersionField(mo10871id = 1)
    public final int versionCode;
    @SafeParcelable.Field(mo10865id = 2)

    /* renamed from: x */
    public final float f1006x;
    @SafeParcelable.Field(mo10865id = 3)

    /* renamed from: y */
    public final float f1007y;

    @SafeParcelable.Constructor
    @UsedByNative("wrapper.cc")
    public LandmarkParcel(@SafeParcelable.Param(mo10868id = 1) int i, @SafeParcelable.Param(mo10868id = 2) float f, @SafeParcelable.Param(mo10868id = 3) float f2, @SafeParcelable.Param(mo10868id = 4) int i2) {
        this.versionCode = i;
        this.f1006x = f;
        this.f1007y = f2;
        this.type = i2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.versionCode);
        SafeParcelWriter.writeFloat(parcel, 2, this.f1006x);
        SafeParcelWriter.writeFloat(parcel, 3, this.f1007y);
        SafeParcelWriter.writeInt(parcel, 4, this.type);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}

package com.google.android.gms.vision.face.internal.client;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.common.proguard.UsedByNative;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@UsedByNative("wrapper.cc")
@SafeParcelable.Class(creator = "FaceParcelCreator")
public class FaceParcel extends AbstractSafeParcelable {
    public static final Parcelable.Creator<FaceParcel> CREATOR = new zzd();
    @SafeParcelable.Field(mo10865id = 3)
    public final float centerX;
    @SafeParcelable.Field(mo10865id = 4)
    public final float centerY;
    @SafeParcelable.Field(mo10865id = 6)
    public final float height;
    @SafeParcelable.Field(mo10865id = 2)

    /* renamed from: id */
    public final int f1005id;
    @SafeParcelable.VersionField(mo10871id = 1)
    public final int versionCode;
    @SafeParcelable.Field(mo10865id = 5)
    public final float width;
    @SafeParcelable.Field(mo10865id = 10)
    public final float zzcg;
    @SafeParcelable.Field(mo10865id = 11)
    public final float zzch;
    @SafeParcelable.Field(mo10865id = 12)
    public final float zzci;
    @SafeParcelable.Field(mo10865id = 7)
    public final float zzdb;
    @SafeParcelable.Field(mo10865id = 8)
    public final float zzdc;
    @SafeParcelable.Field(mo10865id = 14)
    public final float zzdd;
    @SafeParcelable.Field(mo10865id = 9)
    public final LandmarkParcel[] zzde;
    @SafeParcelable.Field(mo10865id = 13)
    public final zza[] zzdf;

    @SafeParcelable.Constructor
    public FaceParcel(@SafeParcelable.Param(mo10868id = 1) int i, @SafeParcelable.Param(mo10868id = 2) int i2, @SafeParcelable.Param(mo10868id = 3) float f, @SafeParcelable.Param(mo10868id = 4) float f2, @SafeParcelable.Param(mo10868id = 5) float f3, @SafeParcelable.Param(mo10868id = 6) float f4, @SafeParcelable.Param(mo10868id = 7) float f5, @SafeParcelable.Param(mo10868id = 8) float f6, @SafeParcelable.Param(mo10868id = 14) float f7, @SafeParcelable.Param(mo10868id = 9) LandmarkParcel[] landmarkParcelArr, @SafeParcelable.Param(mo10868id = 10) float f8, @SafeParcelable.Param(mo10868id = 11) float f9, @SafeParcelable.Param(mo10868id = 12) float f10, @SafeParcelable.Param(mo10868id = 13) zza[] zzaArr) {
        this.versionCode = i;
        this.f1005id = i2;
        this.centerX = f;
        this.centerY = f2;
        this.width = f3;
        this.height = f4;
        this.zzdb = f5;
        this.zzdc = f6;
        this.zzdd = f7;
        this.zzde = landmarkParcelArr;
        this.zzcg = f8;
        this.zzch = f9;
        this.zzci = f10;
        this.zzdf = zzaArr;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.versionCode);
        SafeParcelWriter.writeInt(parcel, 2, this.f1005id);
        SafeParcelWriter.writeFloat(parcel, 3, this.centerX);
        SafeParcelWriter.writeFloat(parcel, 4, this.centerY);
        SafeParcelWriter.writeFloat(parcel, 5, this.width);
        SafeParcelWriter.writeFloat(parcel, 6, this.height);
        SafeParcelWriter.writeFloat(parcel, 7, this.zzdb);
        SafeParcelWriter.writeFloat(parcel, 8, this.zzdc);
        SafeParcelWriter.writeTypedArray(parcel, 9, this.zzde, i, false);
        SafeParcelWriter.writeFloat(parcel, 10, this.zzcg);
        SafeParcelWriter.writeFloat(parcel, 11, this.zzch);
        SafeParcelWriter.writeFloat(parcel, 12, this.zzci);
        SafeParcelWriter.writeTypedArray(parcel, 13, this.zzdf, i, false);
        SafeParcelWriter.writeFloat(parcel, 14, this.zzdd);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @UsedByNative("wrapper.cc")
    public FaceParcel(@SafeParcelable.Param(mo10868id = 1) int i, @SafeParcelable.Param(mo10868id = 2) int i2, @SafeParcelable.Param(mo10868id = 3) float f, @SafeParcelable.Param(mo10868id = 4) float f2, @SafeParcelable.Param(mo10868id = 5) float f3, @SafeParcelable.Param(mo10868id = 6) float f4, @SafeParcelable.Param(mo10868id = 7) float f5, @SafeParcelable.Param(mo10868id = 8) float f6, @SafeParcelable.Param(mo10868id = 9) LandmarkParcel[] landmarkParcelArr, @SafeParcelable.Param(mo10868id = 10) float f7, @SafeParcelable.Param(mo10868id = 11) float f8, @SafeParcelable.Param(mo10868id = 12) float f9) {
        this(i, i2, f, f2, f3, f4, f5, f6, 0.0f, landmarkParcelArr, f7, f8, f9, new zza[0]);
    }
}

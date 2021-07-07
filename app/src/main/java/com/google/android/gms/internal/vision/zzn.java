package com.google.android.gms.internal.vision;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.vision.Frame;

@SafeParcelable.Class(creator = "FrameMetadataParcelCreator")
@SafeParcelable.Reserved({1})
public final class zzn extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzn> CREATOR = new zzo();
    @SafeParcelable.Field(mo10865id = 3)
    public int height;
    @SafeParcelable.Field(mo10865id = 4)

    /* renamed from: id */
    public int f1002id;
    @SafeParcelable.Field(mo10865id = 6)
    public int rotation;
    @SafeParcelable.Field(mo10865id = 2)
    public int width;
    @SafeParcelable.Field(mo10865id = 5)
    public long zzat;

    public zzn() {
    }

    public static zzn zzc(Frame frame) {
        zzn zzn = new zzn();
        zzn.width = frame.getMetadata().getWidth();
        zzn.height = frame.getMetadata().getHeight();
        zzn.rotation = frame.getMetadata().getRotation();
        zzn.f1002id = frame.getMetadata().getId();
        zzn.zzat = frame.getMetadata().getTimestampMillis();
        return zzn;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 2, this.width);
        SafeParcelWriter.writeInt(parcel, 3, this.height);
        SafeParcelWriter.writeInt(parcel, 4, this.f1002id);
        SafeParcelWriter.writeLong(parcel, 5, this.zzat);
        SafeParcelWriter.writeInt(parcel, 6, this.rotation);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @SafeParcelable.Constructor
    public zzn(@SafeParcelable.Param(mo10868id = 2) int i, @SafeParcelable.Param(mo10868id = 3) int i2, @SafeParcelable.Param(mo10868id = 4) int i3, @SafeParcelable.Param(mo10868id = 5) long j, @SafeParcelable.Param(mo10868id = 6) int i4) {
        this.width = i;
        this.height = i2;
        this.f1002id = i3;
        this.zzat = j;
        this.rotation = i4;
    }
}

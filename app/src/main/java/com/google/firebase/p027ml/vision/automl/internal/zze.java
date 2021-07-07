package com.google.firebase.p027ml.vision.automl.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "ImageLabelParcelCreator")
/* renamed from: com.google.firebase.ml.vision.automl.internal.zze */
public final class zze extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zze> CREATOR = new zzf();
    @SafeParcelable.Field(mo10865id = 2)
    public final String text;
    @SafeParcelable.Field(mo10865id = 3)
    public final float zzatw;
    @SafeParcelable.Field(mo10865id = 1)
    public final String zzavo;

    @SafeParcelable.Constructor
    public zze(@SafeParcelable.Param(mo10868id = 1) String str, @SafeParcelable.Param(mo10868id = 2) String str2, @SafeParcelable.Param(mo10868id = 3) float f) {
        this.zzavo = str;
        this.text = str2;
        this.zzatw = f;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zze)) {
            return false;
        }
        zze zze = (zze) obj;
        return Objects.equal(this.zzavo, zze.zzavo) && Objects.equal(this.text, zze.text) && Float.compare(this.zzatw, zze.zzatw) == 0;
    }

    public final int hashCode() {
        return Objects.hashCode(this.zzavo, this.text, Float.valueOf(this.zzatw));
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.zzavo, false);
        SafeParcelWriter.writeString(parcel, 2, this.text, false);
        SafeParcelWriter.writeFloat(parcel, 3, this.zzatw);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}

package com.google.android.gms.internal.vision;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "WordBoxParcelCreator")
@SafeParcelable.Reserved({1})
public final class zzan extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzan> CREATOR = new zzao();
    @SafeParcelable.Field(mo10865id = 6)
    public final float zzdo;
    @SafeParcelable.Field(mo10865id = 7)
    public final String zzex;
    @SafeParcelable.Field(mo10865id = 3)
    public final zzy zzfd;
    @SafeParcelable.Field(mo10865id = 4)
    public final zzy zzfe;
    @SafeParcelable.Field(mo10865id = 5)
    public final String zzfg;
    @SafeParcelable.Field(mo10865id = 2)
    public final zzai[] zzfm;
    @SafeParcelable.Field(mo10865id = 8)
    public final boolean zzfn;

    @SafeParcelable.Constructor
    public zzan(@SafeParcelable.Param(mo10868id = 2) zzai[] zzaiArr, @SafeParcelable.Param(mo10868id = 3) zzy zzy, @SafeParcelable.Param(mo10868id = 4) zzy zzy2, @SafeParcelable.Param(mo10868id = 5) String str, @SafeParcelable.Param(mo10868id = 6) float f, @SafeParcelable.Param(mo10868id = 7) String str2, @SafeParcelable.Param(mo10868id = 8) boolean z) {
        this.zzfm = zzaiArr;
        this.zzfd = zzy;
        this.zzfe = zzy2;
        this.zzfg = str;
        this.zzdo = f;
        this.zzex = str2;
        this.zzfn = z;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeTypedArray(parcel, 2, this.zzfm, i, false);
        SafeParcelWriter.writeParcelable(parcel, 3, this.zzfd, i, false);
        SafeParcelWriter.writeParcelable(parcel, 4, this.zzfe, i, false);
        SafeParcelWriter.writeString(parcel, 5, this.zzfg, false);
        SafeParcelWriter.writeFloat(parcel, 6, this.zzdo);
        SafeParcelWriter.writeString(parcel, 7, this.zzex, false);
        SafeParcelWriter.writeBoolean(parcel, 8, this.zzfn);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}

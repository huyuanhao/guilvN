package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.server.response.FastJsonResponse;

@ShowFirstParty
@SafeParcelable.Class(creator = "FieldMapPairCreator")
public final class zam extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zam> CREATOR = new zaj();
    @SafeParcelable.VersionField(mo10871id = 1)
    public final int versionCode;
    @SafeParcelable.Field(mo10865id = 2)
    public final String zaqy;
    @SafeParcelable.Field(mo10865id = 3)
    public final FastJsonResponse.Field<?, ?> zaqz;

    @SafeParcelable.Constructor
    public zam(@SafeParcelable.Param(mo10868id = 1) int i, @SafeParcelable.Param(mo10868id = 2) String str, @SafeParcelable.Param(mo10868id = 3) FastJsonResponse.Field<?, ?> field) {
        this.versionCode = i;
        this.zaqy = str;
        this.zaqz = field;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.versionCode);
        SafeParcelWriter.writeString(parcel, 2, this.zaqy, false);
        SafeParcelWriter.writeParcelable(parcel, 3, this.zaqz, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public zam(String str, FastJsonResponse.Field<?, ?> field) {
        this.versionCode = 1;
        this.zaqy = str;
        this.zaqz = field;
    }
}

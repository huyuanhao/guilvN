package com.google.android.gms.common.server;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@KeepForSdk
@SafeParcelable.Class(creator = "FavaDiagnosticsEntityCreator")
public class FavaDiagnosticsEntity extends AbstractSafeParcelable implements ReflectedParcelable {
    @KeepForSdk
    public static final Parcelable.Creator<FavaDiagnosticsEntity> CREATOR = new zaa();
    @SafeParcelable.VersionField(mo10871id = 1)
    public final int zale;
    @SafeParcelable.Field(mo10865id = 2)
    public final String zapi;
    @SafeParcelable.Field(mo10865id = 3)
    public final int zapj;

    @SafeParcelable.Constructor
    public FavaDiagnosticsEntity(@SafeParcelable.Param(mo10868id = 1) int i, @SafeParcelable.Param(mo10868id = 2) String str, @SafeParcelable.Param(mo10868id = 3) int i2) {
        this.zale = i;
        this.zapi = str;
        this.zapj = i2;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.zale);
        SafeParcelWriter.writeString(parcel, 2, this.zapi, false);
        SafeParcelWriter.writeInt(parcel, 3, this.zapj);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @KeepForSdk
    public FavaDiagnosticsEntity(String str, int i) {
        this.zale = 1;
        this.zapi = str;
        this.zapj = i;
    }
}

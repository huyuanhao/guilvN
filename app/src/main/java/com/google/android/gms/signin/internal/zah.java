package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ResolveAccountRequest;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "SignInRequestCreator")
public final class zah extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zah> CREATOR = new zai();
    @SafeParcelable.VersionField(mo10871id = 1)
    public final int zale;
    @SafeParcelable.Field(getter = "getResolveAccountRequest", mo10865id = 2)
    public final ResolveAccountRequest zasa;

    @SafeParcelable.Constructor
    public zah(@SafeParcelable.Param(mo10868id = 1) int i, @SafeParcelable.Param(mo10868id = 2) ResolveAccountRequest resolveAccountRequest) {
        this.zale = i;
        this.zasa = resolveAccountRequest;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.zale);
        SafeParcelWriter.writeParcelable(parcel, 2, this.zasa, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public zah(ResolveAccountRequest resolveAccountRequest) {
        this(1, resolveAccountRequest);
    }
}

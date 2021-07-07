package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.ResolveAccountResponse;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "SignInResponseCreator")
public final class zaj extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zaj> CREATOR = new zak();
    @SafeParcelable.Field(getter = "getConnectionResult", mo10865id = 2)
    public final ConnectionResult zadh;
    @SafeParcelable.VersionField(mo10871id = 1)
    public final int zale;
    @SafeParcelable.Field(getter = "getResolveAccountResponse", mo10865id = 3)
    public final ResolveAccountResponse zasb;

    @SafeParcelable.Constructor
    public zaj(@SafeParcelable.Param(mo10868id = 1) int i, @SafeParcelable.Param(mo10868id = 2) ConnectionResult connectionResult, @SafeParcelable.Param(mo10868id = 3) ResolveAccountResponse resolveAccountResponse) {
        this.zale = i;
        this.zadh = connectionResult;
        this.zasb = resolveAccountResponse;
    }

    public final ConnectionResult getConnectionResult() {
        return this.zadh;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.zale);
        SafeParcelWriter.writeParcelable(parcel, 2, this.zadh, i, false);
        SafeParcelWriter.writeParcelable(parcel, 3, this.zasb, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final ResolveAccountResponse zacw() {
        return this.zasb;
    }

    public zaj(int i) {
        this(new ConnectionResult(8, null), null);
    }

    public zaj(ConnectionResult connectionResult, ResolveAccountResponse resolveAccountResponse) {
        this(1, connectionResult, null);
    }
}

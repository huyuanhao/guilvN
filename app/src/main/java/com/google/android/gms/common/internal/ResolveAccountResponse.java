package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.IAccountAccessor;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "ResolveAccountResponseCreator")
public class ResolveAccountResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ResolveAccountResponse> CREATOR = new zan();
    @SafeParcelable.Field(getter = "getConnectionResult", mo10865id = 3)
    public ConnectionResult zadh;
    @SafeParcelable.Field(getter = "getSaveDefaultAccount", mo10865id = 4)
    public boolean zagf;
    @SafeParcelable.VersionField(mo10871id = 1)
    public final int zale;
    @SafeParcelable.Field(mo10865id = 2)
    public IBinder zanw;
    @SafeParcelable.Field(getter = "isFromCrossClientAuth", mo10865id = 5)
    public boolean zapb;

    @SafeParcelable.Constructor
    public ResolveAccountResponse(@SafeParcelable.Param(mo10868id = 1) int i, @SafeParcelable.Param(mo10868id = 2) IBinder iBinder, @SafeParcelable.Param(mo10868id = 3) ConnectionResult connectionResult, @SafeParcelable.Param(mo10868id = 4) boolean z, @SafeParcelable.Param(mo10868id = 5) boolean z2) {
        this.zale = i;
        this.zanw = iBinder;
        this.zadh = connectionResult;
        this.zagf = z;
        this.zapb = z2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResolveAccountResponse)) {
            return false;
        }
        ResolveAccountResponse resolveAccountResponse = (ResolveAccountResponse) obj;
        return this.zadh.equals(resolveAccountResponse.zadh) && getAccountAccessor().equals(resolveAccountResponse.getAccountAccessor());
    }

    public IAccountAccessor getAccountAccessor() {
        return IAccountAccessor.Stub.asInterface(this.zanw);
    }

    public ConnectionResult getConnectionResult() {
        return this.zadh;
    }

    public boolean getSaveDefaultAccount() {
        return this.zagf;
    }

    public boolean isFromCrossClientAuth() {
        return this.zapb;
    }

    public ResolveAccountResponse setAccountAccessor(IAccountAccessor iAccountAccessor) {
        this.zanw = iAccountAccessor == null ? null : iAccountAccessor.asBinder();
        return this;
    }

    public ResolveAccountResponse setIsFromCrossClientAuth(boolean z) {
        this.zapb = z;
        return this;
    }

    public ResolveAccountResponse setSaveDefaultAccount(boolean z) {
        this.zagf = z;
        return this;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.zale);
        SafeParcelWriter.writeIBinder(parcel, 2, this.zanw, false);
        SafeParcelWriter.writeParcelable(parcel, 3, getConnectionResult(), i, false);
        SafeParcelWriter.writeBoolean(parcel, 4, getSaveDefaultAccount());
        SafeParcelWriter.writeBoolean(parcel, 5, isFromCrossClientAuth());
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public ResolveAccountResponse(ConnectionResult connectionResult) {
        this(1, null, connectionResult, false, false);
    }

    public ResolveAccountResponse(int i) {
        this(new ConnectionResult(i, null));
    }
}

package com.google.android.gms.signin.internal;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "AuthAccountResultCreator")
public final class zaa extends AbstractSafeParcelable implements Result {
    public static final Parcelable.Creator<zaa> CREATOR = new zab();
    @SafeParcelable.VersionField(mo10871id = 1)
    public final int zale;
    @SafeParcelable.Field(getter = "getConnectionResultCode", mo10865id = 2)
    public int zarw;
    @SafeParcelable.Field(getter = "getRawAuthResolutionIntent", mo10865id = 3)
    public Intent zarx;

    @SafeParcelable.Constructor
    public zaa(@SafeParcelable.Param(mo10868id = 1) int i, @SafeParcelable.Param(mo10868id = 2) int i2, @SafeParcelable.Param(mo10868id = 3) Intent intent) {
        this.zale = i;
        this.zarw = i2;
        this.zarx = intent;
    }

    @Override // com.google.android.gms.common.api.Result
    public final Status getStatus() {
        if (this.zarw == 0) {
            return Status.RESULT_SUCCESS;
        }
        return Status.RESULT_CANCELED;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.zale);
        SafeParcelWriter.writeInt(parcel, 2, this.zarw);
        SafeParcelWriter.writeParcelable(parcel, 3, this.zarx, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public zaa() {
        this(0, null);
    }

    public zaa(int i, Intent intent) {
        this(2, 0, null);
    }
}

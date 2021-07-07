package com.google.android.gms.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

@SafeParcelable.Class(creator = "AccountChangeEventsResponseCreator")
public class AccountChangeEventsResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator<AccountChangeEventsResponse> CREATOR = new zzc();
    @SafeParcelable.VersionField(mo10871id = 1)
    public final int zze;
    @SafeParcelable.Field(mo10865id = 2)
    public final List<AccountChangeEvent> zzl;

    @SafeParcelable.Constructor
    public AccountChangeEventsResponse(@SafeParcelable.Param(mo10868id = 1) int i, @SafeParcelable.Param(mo10868id = 2) List<AccountChangeEvent> list) {
        this.zze = i;
        this.zzl = (List) Preconditions.checkNotNull(list);
    }

    public List<AccountChangeEvent> getEvents() {
        return this.zzl;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.zze);
        SafeParcelWriter.writeTypedList(parcel, 2, this.zzl, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public AccountChangeEventsResponse(List<AccountChangeEvent> list) {
        this.zze = 1;
        this.zzl = (List) Preconditions.checkNotNull(list);
    }
}

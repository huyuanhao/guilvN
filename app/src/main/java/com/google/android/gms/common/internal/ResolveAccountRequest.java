package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "ResolveAccountRequestCreator")
public class ResolveAccountRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ResolveAccountRequest> CREATOR = new zam();
    @SafeParcelable.VersionField(mo10871id = 1)
    public final int zale;
    @SafeParcelable.Field(getter = "getSessionId", mo10865id = 3)
    public final int zaoz;
    @SafeParcelable.Field(getter = "getSignInAccountHint", mo10865id = 4)
    public final GoogleSignInAccount zapa;
    @SafeParcelable.Field(getter = "getAccount", mo10865id = 2)
    public final Account zax;

    @SafeParcelable.Constructor
    public ResolveAccountRequest(@SafeParcelable.Param(mo10868id = 1) int i, @SafeParcelable.Param(mo10868id = 2) Account account, @SafeParcelable.Param(mo10868id = 3) int i2, @SafeParcelable.Param(mo10868id = 4) GoogleSignInAccount googleSignInAccount) {
        this.zale = i;
        this.zax = account;
        this.zaoz = i2;
        this.zapa = googleSignInAccount;
    }

    public Account getAccount() {
        return this.zax;
    }

    public int getSessionId() {
        return this.zaoz;
    }

    @Nullable
    public GoogleSignInAccount getSignInAccountHint() {
        return this.zapa;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.zale);
        SafeParcelWriter.writeParcelable(parcel, 2, getAccount(), i, false);
        SafeParcelWriter.writeInt(parcel, 3, getSessionId());
        SafeParcelWriter.writeParcelable(parcel, 4, getSignInAccountHint(), i, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public ResolveAccountRequest(Account account, int i, GoogleSignInAccount googleSignInAccount) {
        this(2, account, i, googleSignInAccount);
    }
}

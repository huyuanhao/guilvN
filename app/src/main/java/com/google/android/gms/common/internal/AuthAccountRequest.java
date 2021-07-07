package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.IAccountAccessor;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import javax.annotation.Nullable;

@SafeParcelable.Class(creator = "AuthAccountRequestCreator")
public class AuthAccountRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<AuthAccountRequest> CREATOR = new zaa();
    @SafeParcelable.VersionField(mo10871id = 1)
    public final int zale;
    @SafeParcelable.Field(mo10865id = 2)
    @Deprecated
    public final IBinder zanw;
    @SafeParcelable.Field(mo10865id = 3)
    public final Scope[] zanx;
    @SafeParcelable.Field(mo10865id = 4)
    public Integer zany;
    @SafeParcelable.Field(mo10865id = 5)
    public Integer zanz;
    @SafeParcelable.Field(mo10865id = 6, type = "android.accounts.Account")
    public Account zax;

    @SafeParcelable.Constructor
    public AuthAccountRequest(@SafeParcelable.Param(mo10868id = 1) int i, @SafeParcelable.Param(mo10868id = 2) IBinder iBinder, @SafeParcelable.Param(mo10868id = 3) Scope[] scopeArr, @SafeParcelable.Param(mo10868id = 4) Integer num, @SafeParcelable.Param(mo10868id = 5) Integer num2, @SafeParcelable.Param(mo10868id = 6) Account account) {
        this.zale = i;
        this.zanw = iBinder;
        this.zanx = scopeArr;
        this.zany = num;
        this.zanz = num2;
        this.zax = account;
    }

    public Account getAccount() {
        Account account = this.zax;
        if (account != null) {
            return account;
        }
        IBinder iBinder = this.zanw;
        if (iBinder != null) {
            return AccountAccessor.getAccountBinderSafe(IAccountAccessor.Stub.asInterface(iBinder));
        }
        return null;
    }

    @Nullable
    public Integer getOauthPolicy() {
        return this.zany;
    }

    @Nullable
    public Integer getPolicyAction() {
        return this.zanz;
    }

    public Set<Scope> getScopes() {
        return new HashSet(Arrays.asList(this.zanx));
    }

    public AuthAccountRequest setOauthPolicy(@Nullable Integer num) {
        this.zany = num;
        return this;
    }

    public AuthAccountRequest setPolicyAction(@Nullable Integer num) {
        this.zanz = num;
        return this;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.zale);
        SafeParcelWriter.writeIBinder(parcel, 2, this.zanw, false);
        SafeParcelWriter.writeTypedArray(parcel, 3, this.zanx, i, false);
        SafeParcelWriter.writeIntegerObject(parcel, 4, this.zany, false);
        SafeParcelWriter.writeIntegerObject(parcel, 5, this.zanz, false);
        SafeParcelWriter.writeParcelable(parcel, 6, this.zax, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @Deprecated
    public AuthAccountRequest(IAccountAccessor iAccountAccessor, Set<Scope> set) {
        this(3, iAccountAccessor.asBinder(), (Scope[]) set.toArray(new Scope[set.size()]), null, null, null);
    }

    public AuthAccountRequest(Account account, Set<Scope> set) {
        this(3, null, (Scope[]) set.toArray(new Scope[set.size()]), null, null, (Account) Preconditions.checkNotNull(account));
    }
}

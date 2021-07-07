package com.google.android.gms.auth;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

@SafeParcelable.Class(creator = "TokenDataCreator")
public class TokenData extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<TokenData> CREATOR = new zzk();
    @SafeParcelable.Field(getter = "getGrantedScopes", mo10865id = 6)
    public final List<String> zzaa;
    @SafeParcelable.Field(getter = "getScopeData", mo10865id = 7)
    public final String zzab;
    @SafeParcelable.VersionField(mo10871id = 1)
    public final int zzv;
    @SafeParcelable.Field(getter = "getToken", mo10865id = 2)
    public final String zzw;
    @SafeParcelable.Field(getter = "getExpirationTimeSecs", mo10865id = 3)
    public final Long zzx;
    @SafeParcelable.Field(getter = "isCached", mo10865id = 4)
    public final boolean zzy;
    @SafeParcelable.Field(getter = "isSnowballed", mo10865id = 5)
    public final boolean zzz;

    @SafeParcelable.Constructor
    public TokenData(@SafeParcelable.Param(mo10868id = 1) int i, @SafeParcelable.Param(mo10868id = 2) String str, @SafeParcelable.Param(mo10868id = 3) Long l, @SafeParcelable.Param(mo10868id = 4) boolean z, @SafeParcelable.Param(mo10868id = 5) boolean z2, @SafeParcelable.Param(mo10868id = 6) List<String> list, @SafeParcelable.Param(mo10868id = 7) String str2) {
        this.zzv = i;
        this.zzw = Preconditions.checkNotEmpty(str);
        this.zzx = l;
        this.zzy = z;
        this.zzz = z2;
        this.zzaa = list;
        this.zzab = str2;
    }

    @Nullable
    public static TokenData zza(Bundle bundle, String str) {
        bundle.setClassLoader(TokenData.class.getClassLoader());
        Bundle bundle2 = bundle.getBundle(str);
        if (bundle2 == null) {
            return null;
        }
        bundle2.setClassLoader(TokenData.class.getClassLoader());
        return (TokenData) bundle2.getParcelable("TokenData");
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof TokenData)) {
            return false;
        }
        TokenData tokenData = (TokenData) obj;
        if (!TextUtils.equals(this.zzw, tokenData.zzw) || !Objects.equal(this.zzx, tokenData.zzx) || this.zzy != tokenData.zzy || this.zzz != tokenData.zzz || !Objects.equal(this.zzaa, tokenData.zzaa) || !Objects.equal(this.zzab, tokenData.zzab)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return Objects.hashCode(this.zzw, this.zzx, Boolean.valueOf(this.zzy), Boolean.valueOf(this.zzz), this.zzaa, this.zzab);
    }

    public void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.zzv);
        SafeParcelWriter.writeString(parcel, 2, this.zzw, false);
        SafeParcelWriter.writeLongObject(parcel, 3, this.zzx, false);
        SafeParcelWriter.writeBoolean(parcel, 4, this.zzy);
        SafeParcelWriter.writeBoolean(parcel, 5, this.zzz);
        SafeParcelWriter.writeStringList(parcel, 6, this.zzaa, false);
        SafeParcelWriter.writeString(parcel, 7, this.zzab, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final String zzb() {
        return this.zzw;
    }
}

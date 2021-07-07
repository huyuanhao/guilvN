package com.google.android.gms.internal.clearcut;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.clearcut.zzge;
import com.huawei.updatesdk.sdk.service.p076c.p077a.AbstractC1299b;

@SafeParcelable.Class(creator = "PlayLoggerContextCreator")
@SafeParcelable.Reserved({1})
public final class zzr extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzr> CREATOR = new zzs();
    @SafeParcelable.Field(mo10865id = 2)
    public final String packageName;
    @SafeParcelable.Field(defaultValue = "true", mo10865id = 7)
    public final boolean zzay;
    @SafeParcelable.Field(mo10865id = 10)
    public final int zzaz;
    @SafeParcelable.Field(mo10865id = 3)
    public final int zzi;
    @SafeParcelable.Field(mo10865id = 8)
    public final String zzj;
    @SafeParcelable.Field(mo10865id = 4)
    public final int zzk;
    @SafeParcelable.Field(mo10865id = 5)
    public final String zzl;
    @SafeParcelable.Field(mo10865id = 6)
    public final String zzm;
    @SafeParcelable.Field(mo10865id = 9)
    public final boolean zzn;

    public zzr(String str, int i, int i2, String str2, String str3, String str4, boolean z, zzge.zzv.zzb zzb) {
        this.packageName = (String) Preconditions.checkNotNull(str);
        this.zzi = i;
        this.zzk = i2;
        this.zzj = str2;
        this.zzl = str3;
        this.zzm = str4;
        this.zzay = !z;
        this.zzn = z;
        this.zzaz = zzb.zzc();
    }

    @SafeParcelable.Constructor
    public zzr(@SafeParcelable.Param(mo10868id = 2) String str, @SafeParcelable.Param(mo10868id = 3) int i, @SafeParcelable.Param(mo10868id = 4) int i2, @SafeParcelable.Param(mo10868id = 5) String str2, @SafeParcelable.Param(mo10868id = 6) String str3, @SafeParcelable.Param(mo10868id = 7) boolean z, @SafeParcelable.Param(mo10868id = 8) String str4, @SafeParcelable.Param(mo10868id = 9) boolean z2, @SafeParcelable.Param(mo10868id = 10) int i3) {
        this.packageName = str;
        this.zzi = i;
        this.zzk = i2;
        this.zzl = str2;
        this.zzm = str3;
        this.zzay = z;
        this.zzj = str4;
        this.zzn = z2;
        this.zzaz = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzr) {
            zzr zzr = (zzr) obj;
            return Objects.equal(this.packageName, zzr.packageName) && this.zzi == zzr.zzi && this.zzk == zzr.zzk && Objects.equal(this.zzj, zzr.zzj) && Objects.equal(this.zzl, zzr.zzl) && Objects.equal(this.zzm, zzr.zzm) && this.zzay == zzr.zzay && this.zzn == zzr.zzn && this.zzaz == zzr.zzaz;
        }
    }

    public final int hashCode() {
        return Objects.hashCode(this.packageName, Integer.valueOf(this.zzi), Integer.valueOf(this.zzk), this.zzj, this.zzl, this.zzm, Boolean.valueOf(this.zzay), Boolean.valueOf(this.zzn), Integer.valueOf(this.zzaz));
    }

    public final String toString() {
        return "PlayLoggerContext[" + "package=" + this.packageName + AbstractC1299b.COMMA + "packageVersionCode=" + this.zzi + AbstractC1299b.COMMA + "logSource=" + this.zzk + AbstractC1299b.COMMA + "logSourceName=" + this.zzj + AbstractC1299b.COMMA + "uploadAccount=" + this.zzl + AbstractC1299b.COMMA + "loggingId=" + this.zzm + AbstractC1299b.COMMA + "logAndroidId=" + this.zzay + AbstractC1299b.COMMA + "isAnonymous=" + this.zzn + AbstractC1299b.COMMA + "qosTier=" + this.zzaz + "]";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, this.packageName, false);
        SafeParcelWriter.writeInt(parcel, 3, this.zzi);
        SafeParcelWriter.writeInt(parcel, 4, this.zzk);
        SafeParcelWriter.writeString(parcel, 5, this.zzl, false);
        SafeParcelWriter.writeString(parcel, 6, this.zzm, false);
        SafeParcelWriter.writeBoolean(parcel, 7, this.zzay);
        SafeParcelWriter.writeString(parcel, 8, this.zzj, false);
        SafeParcelWriter.writeBoolean(parcel, 9, this.zzn);
        SafeParcelWriter.writeInt(parcel, 10, this.zzaz);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}

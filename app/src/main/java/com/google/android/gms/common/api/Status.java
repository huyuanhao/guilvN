package com.google.android.gms.common.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.VisibleForTesting;
import com.umeng.commonsdk.proguard.C3617o;

@KeepForSdk
@SafeParcelable.Class(creator = "StatusCreator")
public final class Status extends AbstractSafeParcelable implements Result, ReflectedParcelable {
    public static final Parcelable.Creator<Status> CREATOR = new zzb();
    @KeepForSdk
    public static final Status RESULT_CANCELED = new Status(16);
    @KeepForSdk
    public static final Status RESULT_DEAD_CLIENT = new Status(18);
    @KeepForSdk
    public static final Status RESULT_INTERNAL_ERROR = new Status(8);
    @KeepForSdk
    public static final Status RESULT_INTERRUPTED = new Status(14);
    @VisibleForTesting
    @KeepForSdk
    public static final Status RESULT_SUCCESS = new Status(0);
    @KeepForSdk
    public static final Status RESULT_TIMEOUT = new Status(15);
    public static final Status zzar = new Status(17);
    @SafeParcelable.VersionField(mo10871id = 1000)
    public final int zzg;
    @SafeParcelable.Field(getter = "getStatusCode", mo10865id = 1)
    public final int zzh;
    @Nullable
    @SafeParcelable.Field(getter = "getPendingIntent", mo10865id = 3)
    public final PendingIntent zzi;
    @Nullable
    @SafeParcelable.Field(getter = "getStatusMessage", mo10865id = 2)
    public final String zzj;

    @SafeParcelable.Constructor
    @KeepForSdk
    public Status(@SafeParcelable.Param(mo10868id = 1000) int i, @SafeParcelable.Param(mo10868id = 1) int i2, @Nullable @SafeParcelable.Param(mo10868id = 2) String str, @Nullable @SafeParcelable.Param(mo10868id = 3) PendingIntent pendingIntent) {
        this.zzg = i;
        this.zzh = i2;
        this.zzj = str;
        this.zzi = pendingIntent;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Status)) {
            return false;
        }
        Status status = (Status) obj;
        if (this.zzg != status.zzg || this.zzh != status.zzh || !Objects.equal(this.zzj, status.zzj) || !Objects.equal(this.zzi, status.zzi)) {
            return false;
        }
        return true;
    }

    public final PendingIntent getResolution() {
        return this.zzi;
    }

    @Override // com.google.android.gms.common.api.Result
    @KeepForSdk
    public final Status getStatus() {
        return this;
    }

    public final int getStatusCode() {
        return this.zzh;
    }

    @Nullable
    public final String getStatusMessage() {
        return this.zzj;
    }

    @VisibleForTesting
    public final boolean hasResolution() {
        return this.zzi != null;
    }

    public final int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.zzg), Integer.valueOf(this.zzh), this.zzj, this.zzi);
    }

    public final boolean isCanceled() {
        return this.zzh == 16;
    }

    public final boolean isInterrupted() {
        return this.zzh == 14;
    }

    public final boolean isSuccess() {
        return this.zzh <= 0;
    }

    public final void startResolutionForResult(Activity activity, int i) throws IntentSender.SendIntentException {
        if (hasResolution()) {
            activity.startIntentSenderForResult(this.zzi.getIntentSender(), i, null, 0, 0, 0);
        }
    }

    public final String toString() {
        return Objects.toStringHelper(this).add("statusCode", zzg()).add(C3617o.f9396y, this.zzi).toString();
    }

    @KeepForSdk
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, getStatusCode());
        SafeParcelWriter.writeString(parcel, 2, getStatusMessage(), false);
        SafeParcelWriter.writeParcelable(parcel, 3, this.zzi, i, false);
        SafeParcelWriter.writeInt(parcel, 1000, this.zzg);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final String zzg() {
        String str = this.zzj;
        if (str != null) {
            return str;
        }
        return CommonStatusCodes.getStatusCodeString(this.zzh);
    }

    @KeepForSdk
    public Status(int i) {
        this(i, null);
    }

    @KeepForSdk
    public Status(int i, @Nullable String str) {
        this(1, i, str, null);
    }

    @KeepForSdk
    public Status(int i, @Nullable String str, @Nullable PendingIntent pendingIntent) {
        this(1, i, str, pendingIntent);
    }
}

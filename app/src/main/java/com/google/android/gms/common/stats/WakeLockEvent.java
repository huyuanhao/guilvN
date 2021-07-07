package com.google.android.gms.common.stats;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.xiaomi.mipush.sdk.Constants;
import java.util.List;

@SafeParcelable.Class(creator = "WakeLockEventCreator")
public final class WakeLockEvent extends StatsEvent {
    public static final Parcelable.Creator<WakeLockEvent> CREATOR = new zza();
    public long durationMillis;
    @SafeParcelable.VersionField(mo10871id = 1)
    public final int versionCode;
    @SafeParcelable.Field(getter = "getTimeMillis", mo10865id = 2)
    public final long zzfo;
    @SafeParcelable.Field(getter = "getEventType", mo10865id = 11)
    public int zzfp;
    @SafeParcelable.Field(getter = "getWakeLockName", mo10865id = 4)
    public final String zzfq;
    @SafeParcelable.Field(getter = "getSecondaryWakeLockName", mo10865id = 10)
    public final String zzfr;
    @SafeParcelable.Field(getter = "getCodePackage", mo10865id = 17)
    public final String zzfs;
    @SafeParcelable.Field(getter = "getWakeLockType", mo10865id = 5)
    public final int zzft;
    @SafeParcelable.Field(getter = "getCallingPackages", mo10865id = 6)
    public final List<String> zzfu;
    @SafeParcelable.Field(getter = "getEventKey", mo10865id = 12)
    public final String zzfv;
    @SafeParcelable.Field(getter = "getElapsedRealtime", mo10865id = 8)
    public final long zzfw;
    @SafeParcelable.Field(getter = "getDeviceState", mo10865id = 14)
    public int zzfx;
    @SafeParcelable.Field(getter = "getHostPackage", mo10865id = 13)
    public final String zzfy;
    @SafeParcelable.Field(getter = "getBeginPowerPercentage", mo10865id = 15)
    public final float zzfz;
    @SafeParcelable.Field(getter = "getTimeout", mo10865id = 16)
    public final long zzga;

    @SafeParcelable.Constructor
    public WakeLockEvent(@SafeParcelable.Param(mo10868id = 1) int i, @SafeParcelable.Param(mo10868id = 2) long j, @SafeParcelable.Param(mo10868id = 11) int i2, @SafeParcelable.Param(mo10868id = 4) String str, @SafeParcelable.Param(mo10868id = 5) int i3, @SafeParcelable.Param(mo10868id = 6) List<String> list, @SafeParcelable.Param(mo10868id = 12) String str2, @SafeParcelable.Param(mo10868id = 8) long j2, @SafeParcelable.Param(mo10868id = 14) int i4, @SafeParcelable.Param(mo10868id = 10) String str3, @SafeParcelable.Param(mo10868id = 13) String str4, @SafeParcelable.Param(mo10868id = 15) float f, @SafeParcelable.Param(mo10868id = 16) long j3, @SafeParcelable.Param(mo10868id = 17) String str5) {
        this.versionCode = i;
        this.zzfo = j;
        this.zzfp = i2;
        this.zzfq = str;
        this.zzfr = str3;
        this.zzfs = str5;
        this.zzft = i3;
        this.durationMillis = -1;
        this.zzfu = list;
        this.zzfv = str2;
        this.zzfw = j2;
        this.zzfx = i4;
        this.zzfy = str4;
        this.zzfz = f;
        this.zzga = j3;
    }

    @Override // com.google.android.gms.common.stats.StatsEvent
    public final int getEventType() {
        return this.zzfp;
    }

    @Override // com.google.android.gms.common.stats.StatsEvent
    public final long getTimeMillis() {
        return this.zzfo;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.versionCode);
        SafeParcelWriter.writeLong(parcel, 2, getTimeMillis());
        SafeParcelWriter.writeString(parcel, 4, this.zzfq, false);
        SafeParcelWriter.writeInt(parcel, 5, this.zzft);
        SafeParcelWriter.writeStringList(parcel, 6, this.zzfu, false);
        SafeParcelWriter.writeLong(parcel, 8, this.zzfw);
        SafeParcelWriter.writeString(parcel, 10, this.zzfr, false);
        SafeParcelWriter.writeInt(parcel, 11, getEventType());
        SafeParcelWriter.writeString(parcel, 12, this.zzfv, false);
        SafeParcelWriter.writeString(parcel, 13, this.zzfy, false);
        SafeParcelWriter.writeInt(parcel, 14, this.zzfx);
        SafeParcelWriter.writeFloat(parcel, 15, this.zzfz);
        SafeParcelWriter.writeLong(parcel, 16, this.zzga);
        SafeParcelWriter.writeString(parcel, 17, this.zzfs, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @Override // com.google.android.gms.common.stats.StatsEvent
    public final long zzv() {
        return this.durationMillis;
    }

    @Override // com.google.android.gms.common.stats.StatsEvent
    public final String zzw() {
        String str;
        String str2 = this.zzfq;
        int i = this.zzft;
        List<String> list = this.zzfu;
        String str3 = "";
        if (list == null) {
            str = str3;
        } else {
            str = TextUtils.join(Constants.ACCEPT_TIME_SEPARATOR_SP, list);
        }
        int i2 = this.zzfx;
        String str4 = this.zzfr;
        if (str4 == null) {
            str4 = str3;
        }
        String str5 = this.zzfy;
        if (str5 == null) {
            str5 = str3;
        }
        float f = this.zzfz;
        String str6 = this.zzfs;
        if (str6 != null) {
            str3 = str6;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 45 + String.valueOf(str).length() + String.valueOf(str4).length() + String.valueOf(str5).length() + String.valueOf(str3).length());
        sb.append("\t");
        sb.append(str2);
        sb.append("\t");
        sb.append(i);
        sb.append("\t");
        sb.append(str);
        sb.append("\t");
        sb.append(i2);
        sb.append("\t");
        sb.append(str4);
        sb.append("\t");
        sb.append(str5);
        sb.append("\t");
        sb.append(f);
        sb.append("\t");
        sb.append(str3);
        return sb.toString();
    }

    public WakeLockEvent(long j, int i, String str, int i2, List<String> list, String str2, long j2, int i3, String str3, String str4, float f, long j3, String str5) {
        this(2, j, i, str, i2, list, str2, j2, i3, str3, str4, f, j3, str5);
    }
}

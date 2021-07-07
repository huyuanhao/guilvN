package com.google.android.gms.phenotype;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.umeng.message.proguard.C3848l;
import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

@SafeParcelable.Class(creator = "ConfigurationCreator")
@SafeParcelable.Reserved({1})
@KeepForSdk
public class Configuration extends AbstractSafeParcelable implements Comparable<Configuration> {
    @KeepForSdk
    public static final Parcelable.Creator<Configuration> CREATOR = new zzc();
    @SafeParcelable.Field(mo10865id = 2)
    public final int zzc;
    @SafeParcelable.Field(mo10865id = 3)
    public final zzi[] zzd;
    @SafeParcelable.Field(mo10865id = 4)
    public final String[] zze;
    public final Map<String, zzi> zzf = new TreeMap();

    @SafeParcelable.Constructor
    public Configuration(@SafeParcelable.Param(mo10868id = 2) int i, @SafeParcelable.Param(mo10868id = 3) zzi[] zziArr, @SafeParcelable.Param(mo10868id = 4) String[] strArr) {
        this.zzc = i;
        this.zzd = zziArr;
        for (zzi zzi : zziArr) {
            this.zzf.put(zzi.name, zzi);
        }
        this.zze = strArr;
        if (strArr != null) {
            Arrays.sort(strArr);
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // java.lang.Comparable
    public /* synthetic */ int compareTo(Configuration configuration) {
        return this.zzc - configuration.zzc;
    }

    public boolean equals(Object obj) {
        if (obj instanceof Configuration) {
            Configuration configuration = (Configuration) obj;
            return this.zzc == configuration.zzc && zzn.equals(this.zzf, configuration.zzf) && Arrays.equals(this.zze, configuration.zze);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Configuration(");
        sb.append(this.zzc);
        sb.append(", ");
        sb.append(C3848l.f10401s);
        for (zzi zzi : this.zzf.values()) {
            sb.append(zzi);
            sb.append(", ");
        }
        sb.append(C3848l.f10402t);
        sb.append(", ");
        sb.append(C3848l.f10401s);
        String[] strArr = this.zze;
        if (strArr != null) {
            for (String str : strArr) {
                sb.append(str);
                sb.append(", ");
            }
        } else {
            sb.append("null");
        }
        sb.append(C3848l.f10402t);
        sb.append(C3848l.f10402t);
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 2, this.zzc);
        SafeParcelWriter.writeTypedArray(parcel, 3, this.zzd, i, false);
        SafeParcelWriter.writeStringArray(parcel, 4, this.zze, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}

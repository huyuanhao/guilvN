package com.google.android.gms.phenotype;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.p118pd.sdk.C8932ooOOO0o;
import com.umeng.message.proguard.C3848l;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@SafeParcelable.Class(creator = "ExperimentTokensCreator")
@SafeParcelable.Reserved({1})
@KeepForSdk
public class ExperimentTokens extends AbstractSafeParcelable {
    @KeepForSdk
    public static final Parcelable.Creator<ExperimentTokens> CREATOR = new zzh();
    public static final zza zzaa = new zzg();
    public static final byte[][] zzn;
    public static final ExperimentTokens zzo;
    public static final zza zzx = new zzd();
    public static final zza zzy = new zze();
    public static final zza zzz = new zzf();
    @SafeParcelable.Field(mo10865id = 2)
    public final String zzp;
    @SafeParcelable.Field(mo10865id = 3)
    public final byte[] zzq;
    @SafeParcelable.Field(mo10865id = 4)
    public final byte[][] zzr;
    @SafeParcelable.Field(mo10865id = 5)
    public final byte[][] zzs;
    @SafeParcelable.Field(mo10865id = 6)
    public final byte[][] zzt;
    @SafeParcelable.Field(mo10865id = 7)
    public final byte[][] zzu;
    @SafeParcelable.Field(mo10865id = 8)
    public final int[] zzv;
    @SafeParcelable.Field(mo10865id = 9)
    public final byte[][] zzw;

    public interface zza {
    }

    static {
        byte[][] bArr = new byte[0][];
        zzn = bArr;
        zzo = new ExperimentTokens("", null, bArr, bArr, bArr, bArr, null, null);
    }

    @SafeParcelable.Constructor
    public ExperimentTokens(@SafeParcelable.Param(mo10868id = 2) String str, @SafeParcelable.Param(mo10868id = 3) byte[] bArr, @SafeParcelable.Param(mo10868id = 4) byte[][] bArr2, @SafeParcelable.Param(mo10868id = 5) byte[][] bArr3, @SafeParcelable.Param(mo10868id = 6) byte[][] bArr4, @SafeParcelable.Param(mo10868id = 7) byte[][] bArr5, @SafeParcelable.Param(mo10868id = 8) int[] iArr, @SafeParcelable.Param(mo10868id = 9) byte[][] bArr6) {
        this.zzp = str;
        this.zzq = bArr;
        this.zzr = bArr2;
        this.zzs = bArr3;
        this.zzt = bArr4;
        this.zzu = bArr5;
        this.zzv = iArr;
        this.zzw = bArr6;
    }

    public static List<Integer> zza(int[] iArr) {
        if (iArr == null) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList(iArr.length);
        for (int i : iArr) {
            arrayList.add(Integer.valueOf(i));
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    public static List<String> zza(byte[][] bArr) {
        if (bArr == null) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList(bArr.length);
        for (byte[] bArr2 : bArr) {
            arrayList.add(Base64.encodeToString(bArr2, 3));
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    public static void zza(StringBuilder sb, String str, byte[][] bArr) {
        String str2;
        sb.append(str);
        sb.append(C8932ooOOO0o.OooO0Oo);
        if (bArr == null) {
            str2 = "null";
        } else {
            sb.append(C3848l.f10401s);
            int length = bArr.length;
            boolean z = true;
            int i = 0;
            while (i < length) {
                byte[] bArr2 = bArr[i];
                if (!z) {
                    sb.append(", ");
                }
                sb.append("'");
                sb.append(Base64.encodeToString(bArr2, 3));
                sb.append("'");
                i++;
                z = false;
            }
            str2 = C3848l.f10402t;
        }
        sb.append(str2);
    }

    public boolean equals(Object obj) {
        if (obj instanceof ExperimentTokens) {
            ExperimentTokens experimentTokens = (ExperimentTokens) obj;
            return zzn.equals(this.zzp, experimentTokens.zzp) && Arrays.equals(this.zzq, experimentTokens.zzq) && zzn.equals(zza(this.zzr), zza(experimentTokens.zzr)) && zzn.equals(zza(this.zzs), zza(experimentTokens.zzs)) && zzn.equals(zza(this.zzt), zza(experimentTokens.zzt)) && zzn.equals(zza(this.zzu), zza(experimentTokens.zzu)) && zzn.equals(zza(this.zzv), zza(experimentTokens.zzv)) && zzn.equals(zza(this.zzw), zza(experimentTokens.zzw));
        }
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder("ExperimentTokens");
        sb.append(C3848l.f10401s);
        String str2 = this.zzp;
        if (str2 == null) {
            str = "null";
        } else {
            StringBuilder sb2 = new StringBuilder(String.valueOf(str2).length() + 2);
            sb2.append("'");
            sb2.append(str2);
            sb2.append("'");
            str = sb2.toString();
        }
        sb.append(str);
        sb.append(", ");
        byte[] bArr = this.zzq;
        sb.append("direct");
        sb.append(C8932ooOOO0o.OooO0Oo);
        if (bArr == null) {
            sb.append("null");
        } else {
            sb.append("'");
            sb.append(Base64.encodeToString(bArr, 3));
            sb.append("'");
        }
        sb.append(", ");
        zza(sb, "GAIA", this.zzr);
        sb.append(", ");
        zza(sb, "PSEUDO", this.zzs);
        sb.append(", ");
        zza(sb, "ALWAYS", this.zzt);
        sb.append(", ");
        zza(sb, "OTHER", this.zzu);
        sb.append(", ");
        int[] iArr = this.zzv;
        sb.append("weak");
        sb.append(C8932ooOOO0o.OooO0Oo);
        if (iArr == null) {
            sb.append("null");
        } else {
            sb.append(C3848l.f10401s);
            int length = iArr.length;
            boolean z = true;
            int i = 0;
            while (i < length) {
                int i2 = iArr[i];
                if (!z) {
                    sb.append(", ");
                }
                sb.append(i2);
                i++;
                z = false;
            }
            sb.append(C3848l.f10402t);
        }
        sb.append(", ");
        zza(sb, "directs", this.zzw);
        sb.append(C3848l.f10402t);
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, this.zzp, false);
        SafeParcelWriter.writeByteArray(parcel, 3, this.zzq, false);
        SafeParcelWriter.writeByteArrayArray(parcel, 4, this.zzr, false);
        SafeParcelWriter.writeByteArrayArray(parcel, 5, this.zzs, false);
        SafeParcelWriter.writeByteArrayArray(parcel, 6, this.zzt, false);
        SafeParcelWriter.writeByteArrayArray(parcel, 7, this.zzu, false);
        SafeParcelWriter.writeIntArray(parcel, 8, this.zzv, false);
        SafeParcelWriter.writeByteArrayArray(parcel, 9, this.zzw, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}

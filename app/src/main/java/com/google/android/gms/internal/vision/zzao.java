package com.google.android.gms.internal.vision;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

public final class zzao implements Parcelable.Creator<zzan> {
    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzan createFromParcel(Parcel parcel) {
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        zzai[] zzaiArr = null;
        zzy zzy = null;
        zzy zzy2 = null;
        String str = null;
        String str2 = null;
        float f = 0.0f;
        boolean z = false;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = SafeParcelReader.readHeader(parcel);
            switch (SafeParcelReader.getFieldId(readHeader)) {
                case 2:
                    zzaiArr = (zzai[]) SafeParcelReader.createTypedArray(parcel, readHeader, zzai.CREATOR);
                    break;
                case 3:
                    zzy = (zzy) SafeParcelReader.createParcelable(parcel, readHeader, zzy.CREATOR);
                    break;
                case 4:
                    zzy2 = (zzy) SafeParcelReader.createParcelable(parcel, readHeader, zzy.CREATOR);
                    break;
                case 5:
                    str = SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 6:
                    f = SafeParcelReader.readFloat(parcel, readHeader);
                    break;
                case 7:
                    str2 = SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 8:
                    z = SafeParcelReader.readBoolean(parcel, readHeader);
                    break;
                default:
                    SafeParcelReader.skipUnknownField(parcel, readHeader);
                    break;
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
        return new zzan(zzaiArr, zzy, zzy2, str, f, str2, z);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzan[] newArray(int i) {
        return new zzan[i];
    }
}

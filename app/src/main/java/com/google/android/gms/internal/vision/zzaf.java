package com.google.android.gms.internal.vision;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

public final class zzaf implements Parcelable.Creator<zzae> {
    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzae createFromParcel(Parcel parcel) {
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        zzan[] zzanArr = null;
        zzy zzy = null;
        zzy zzy2 = null;
        zzy zzy3 = null;
        String str = null;
        String str2 = null;
        float f = 0.0f;
        int i = 0;
        boolean z = false;
        int i2 = 0;
        int i3 = 0;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = SafeParcelReader.readHeader(parcel);
            switch (SafeParcelReader.getFieldId(readHeader)) {
                case 2:
                    zzanArr = (zzan[]) SafeParcelReader.createTypedArray(parcel, readHeader, zzan.CREATOR);
                    break;
                case 3:
                    zzy = (zzy) SafeParcelReader.createParcelable(parcel, readHeader, zzy.CREATOR);
                    break;
                case 4:
                    zzy2 = (zzy) SafeParcelReader.createParcelable(parcel, readHeader, zzy.CREATOR);
                    break;
                case 5:
                    zzy3 = (zzy) SafeParcelReader.createParcelable(parcel, readHeader, zzy.CREATOR);
                    break;
                case 6:
                    str = SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 7:
                    f = SafeParcelReader.readFloat(parcel, readHeader);
                    break;
                case 8:
                    str2 = SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 9:
                    i = SafeParcelReader.readInt(parcel, readHeader);
                    break;
                case 10:
                    z = SafeParcelReader.readBoolean(parcel, readHeader);
                    break;
                case 11:
                    i2 = SafeParcelReader.readInt(parcel, readHeader);
                    break;
                case 12:
                    i3 = SafeParcelReader.readInt(parcel, readHeader);
                    break;
                default:
                    SafeParcelReader.skipUnknownField(parcel, readHeader);
                    break;
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
        return new zzae(zzanArr, zzy, zzy2, zzy3, str, f, str2, i, z, i2, i3);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzae[] newArray(int i) {
        return new zzae[i];
    }
}

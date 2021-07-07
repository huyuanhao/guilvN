package com.google.android.gms.vision.barcode;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.vision.barcode.Barcode;

public final class zze implements Parcelable.Creator<Barcode.CalendarEvent> {
    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Barcode.CalendarEvent createFromParcel(Parcel parcel) {
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        Barcode.CalendarDateTime calendarDateTime = null;
        Barcode.CalendarDateTime calendarDateTime2 = null;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = SafeParcelReader.readHeader(parcel);
            switch (SafeParcelReader.getFieldId(readHeader)) {
                case 2:
                    str = SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 3:
                    str2 = SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 4:
                    str3 = SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 5:
                    str4 = SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 6:
                    str5 = SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 7:
                    calendarDateTime = (Barcode.CalendarDateTime) SafeParcelReader.createParcelable(parcel, readHeader, Barcode.CalendarDateTime.CREATOR);
                    break;
                case 8:
                    calendarDateTime2 = (Barcode.CalendarDateTime) SafeParcelReader.createParcelable(parcel, readHeader, Barcode.CalendarDateTime.CREATOR);
                    break;
                default:
                    SafeParcelReader.skipUnknownField(parcel, readHeader);
                    break;
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
        return new Barcode.CalendarEvent(str, str2, str3, str4, str5, calendarDateTime, calendarDateTime2);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Barcode.CalendarEvent[] newArray(int i) {
        return new Barcode.CalendarEvent[i];
    }
}

package com.google.android.p026a;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.google.android.a.c */
public final class C0916c {
    static {
        C0916c.class.getClassLoader();
    }

    /* renamed from: a */
    public static <T extends Parcelable> T m955a(Parcel parcel, Parcelable.Creator<T> creator) {
        if (parcel.readInt() != 0) {
            return creator.createFromParcel(parcel);
        }
        return null;
    }

    /* renamed from: a */
    public static void m956a(Parcel parcel, Parcelable parcelable) {
        parcel.writeInt(1);
        parcelable.writeToParcel(parcel, 0);
    }
}

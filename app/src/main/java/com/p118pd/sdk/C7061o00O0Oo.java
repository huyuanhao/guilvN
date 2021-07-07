package com.p118pd.sdk;

import android.os.Parcel;

/* renamed from: com.pd.sdk.o00O0Oo  reason: case insensitive filesystem */
public final class C7061o00O0Oo {
    public static boolean OooO00o(Parcel parcel) {
        return parcel.readInt() != 0;
    }

    public static void OooO00o(Parcel parcel, boolean z) {
        parcel.writeInt(z ? 1 : 0);
    }
}

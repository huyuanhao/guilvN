package com.p118pd.sdk;

import android.os.Parcel;
import android.os.Parcelable;
import anetwork.channel.aidl.ParcelableHeader;

/* renamed from: com.pd.sdk.o0O0oOo0  reason: case insensitive filesystem */
public final class C7345o0O0oOo0 implements Parcelable.Creator<ParcelableHeader> {
    /* renamed from: OooO00o */
    public ParcelableHeader createFromParcel(Parcel parcel) {
        return ParcelableHeader.OooO00o(parcel);
    }

    /* renamed from: OooO00o */
    public ParcelableHeader[] newArray(int i) {
        return new ParcelableHeader[i];
    }
}

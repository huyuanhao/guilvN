package com.huawei.hms.support.api.client;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.huawei.hms.support.api.client.a */
public final class C1162a implements Parcelable.Creator {
    /* renamed from: a */
    public Status createFromParcel(Parcel parcel) {
        return new Status(parcel.readInt(), parcel.readString(), PendingIntent.readPendingIntentOrNullFromParcel(parcel));
    }

    /* renamed from: a */
    public Status[] newArray(int i) {
        return new Status[i];
    }
}

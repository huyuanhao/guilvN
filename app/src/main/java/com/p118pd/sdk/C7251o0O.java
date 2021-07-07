package com.p118pd.sdk;

import android.os.Parcel;
import android.os.Parcelable;
import anetwork.channel.entity.BodyHandlerEntry;
import com.p118pd.sdk.AbstractC7325o0O0o0;

/* renamed from: com.pd.sdk.o0O  reason: case insensitive filesystem */
public final class C7251o0O implements Parcelable.Creator<BodyHandlerEntry> {
    /* renamed from: OooO00o */
    public BodyHandlerEntry createFromParcel(Parcel parcel) {
        BodyHandlerEntry bodyHandlerEntry = new BodyHandlerEntry((C7251o0O) null);
        bodyHandlerEntry.OooO00o = AbstractC7325o0O0o0.OooO00o.OooO00o(parcel.readStrongBinder());
        return bodyHandlerEntry;
    }

    /* renamed from: OooO00o */
    public BodyHandlerEntry[] newArray(int i) {
        return new BodyHandlerEntry[i];
    }
}

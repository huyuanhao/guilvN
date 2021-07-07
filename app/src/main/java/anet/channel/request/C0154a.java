package anet.channel.request;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: anet.channel.request.a */
public final class C0154a implements Parcelable.Creator<ByteArrayEntry> {
    /* renamed from: a */
    public ByteArrayEntry createFromParcel(Parcel parcel) {
        ByteArrayEntry byteArrayEntry = new ByteArrayEntry((C0154a) null);
        ByteArrayEntry.access$102(byteArrayEntry, new byte[parcel.readInt()]);
        parcel.readByteArray(ByteArrayEntry.access$100(byteArrayEntry));
        ByteArrayEntry.access$202(byteArrayEntry, parcel.readInt());
        ByteArrayEntry.access$302(byteArrayEntry, parcel.readInt());
        return byteArrayEntry;
    }

    /* renamed from: a */
    public ByteArrayEntry[] newArray(int i) {
        return new ByteArrayEntry[i];
    }
}

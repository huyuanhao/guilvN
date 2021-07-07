package anetwork.channel.aidl;

import android.os.Parcel;
import android.os.Parcelable;
import anet.channel.util.ALog;
import com.p118pd.sdk.C7345o0O0oOo0;
import java.util.List;
import java.util.Map;

public class ParcelableHeader implements Parcelable {
    public static Parcelable.Creator<ParcelableHeader> OooO00o = new C7345o0O0oOo0();

    /* renamed from: OooO00o  reason: collision with other field name */
    public Map<String, List<String>> f14719OooO00o;
    public int o00oO0O;

    public ParcelableHeader(int i, Map<String, List<String>> map) {
        this.f14719OooO00o = map;
        this.o00oO0O = i;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public Map<String, List<String>> m14971OooO00o() {
        return this.f14719OooO00o;
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "ParcelableResponseHeader [responseCode=" + this.o00oO0O + ", header=" + this.f14719OooO00o + "]";
    }

    public void writeToParcel(Parcel parcel, int i) {
        if (this.f14719OooO00o != null) {
            parcel.writeInt(1);
            parcel.writeMap(this.f14719OooO00o);
        } else {
            parcel.writeInt(0);
        }
        parcel.writeInt(this.o00oO0O);
    }

    public int OooO00o() {
        return this.o00oO0O;
    }

    public static ParcelableHeader OooO00o(Parcel parcel) {
        ParcelableHeader parcelableHeader = new ParcelableHeader();
        try {
            if (parcel.readInt() == 1) {
                parcelableHeader.f14719OooO00o = parcel.readHashMap(ParcelableHeader.class.getClassLoader());
            }
            parcelableHeader.o00oO0O = parcel.readInt();
        } catch (Throwable th) {
            ALog.m288e("anet.ParcelableHeader", "[readFromParcel]", null, th, new Object[0]);
        }
        return parcelableHeader;
    }

    public ParcelableHeader() {
    }
}

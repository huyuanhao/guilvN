package anetwork.channel.aidl;

import android.os.Parcel;
import android.os.Parcelable;
import anet.channel.request.BodyEntry;
import anet.channel.util.ALog;
import com.p118pd.sdk.AbstractC7320o0O0Ooo;
import com.p118pd.sdk.AbstractC7322o0O0OooO;
import com.p118pd.sdk.AbstractC7323o0O0Oooo;
import com.p118pd.sdk.C8737oo0oOOo;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ParcelableRequest implements Parcelable {
    public static final Parcelable.Creator<ParcelableRequest> CREATOR = new C8737oo0oOOo();
    public BodyEntry OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public AbstractC7322o0O0OooO f14720OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Map<String, String> f14721OooO00o = null;
    public Map<String, String> OooO0O0 = null;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public boolean f14722OooO0O0;
    public Map<String, String> OooO0OO;
    public int o00oO0O;
    public String o0OO00O;
    public String o0OOO0o;
    public String o0Oo0oo;
    public int o0ooOO0;
    public int o0ooOOo;

    /* renamed from: o0ooOOo  reason: collision with other field name */
    public String f14723o0ooOOo;
    public String o0ooOoO;

    public ParcelableRequest(AbstractC7322o0O0OooO o0o0oooo) {
        this.f14720OooO00o = o0o0oooo;
        if (o0o0oooo != null) {
            this.f14723o0ooOOo = o0o0oooo.m18827OooO00o();
            this.o00oO0O = o0o0oooo.OooO0O0();
            this.o0ooOoO = o0o0oooo.m18835OooO0O0();
            this.f14722OooO0O0 = o0o0oooo.m18833OooO00o();
            this.o0OOO0o = o0o0oooo.getMethod();
            List<AbstractC7323o0O0Oooo> OooO0O02 = o0o0oooo.m18836OooO0O0();
            if (OooO0O02 != null) {
                this.f14721OooO00o = new HashMap();
                for (AbstractC7323o0O0Oooo o0o0oooo2 : OooO0O02) {
                    this.f14721OooO00o.put(o0o0oooo2.getName(), o0o0oooo2.getValue());
                }
            }
            List<AbstractC7320o0O0Ooo> OooO00o2 = o0o0oooo.m18830OooO00o();
            if (OooO00o2 != null) {
                this.OooO0O0 = new HashMap();
                for (AbstractC7320o0O0Ooo o0o0ooo : OooO00o2) {
                    this.OooO0O0.put(o0o0ooo.OooO00o(), o0o0ooo.getValue());
                }
            }
            this.OooO00o = o0o0oooo.m18825OooO00o();
            this.o0ooOO0 = o0o0oooo.OooO00o();
            this.o0ooOOo = o0o0oooo.getReadTimeout();
            this.o0Oo0oo = o0o0oooo.OooO0OO();
            this.o0OO00O = o0o0oooo.OooO0Oo();
            this.OooO0OO = o0o0oooo.m18831OooO00o();
        }
    }

    public static ParcelableRequest OooO00o(Parcel parcel) {
        ParcelableRequest parcelableRequest = new ParcelableRequest();
        try {
            parcelableRequest.o00oO0O = parcel.readInt();
            parcelableRequest.f14723o0ooOOo = parcel.readString();
            parcelableRequest.o0ooOoO = parcel.readString();
            boolean z = true;
            if (parcel.readInt() != 1) {
                z = false;
            }
            parcelableRequest.f14722OooO0O0 = z;
            parcelableRequest.o0OOO0o = parcel.readString();
            if (parcel.readInt() != 0) {
                parcelableRequest.f14721OooO00o = parcel.readHashMap(ParcelableRequest.class.getClassLoader());
            }
            if (parcel.readInt() != 0) {
                parcelableRequest.OooO0O0 = parcel.readHashMap(ParcelableRequest.class.getClassLoader());
            }
            parcelableRequest.OooO00o = (BodyEntry) parcel.readParcelable(ParcelableRequest.class.getClassLoader());
            parcelableRequest.o0ooOO0 = parcel.readInt();
            parcelableRequest.o0ooOOo = parcel.readInt();
            parcelableRequest.o0Oo0oo = parcel.readString();
            parcelableRequest.o0OO00O = parcel.readString();
            if (parcel.readInt() != 0) {
                parcelableRequest.OooO0OO = parcel.readHashMap(ParcelableRequest.class.getClassLoader());
            }
        } catch (Throwable th) {
            ALog.m291w("anet.ParcelableRequest", "[readFromParcel]", null, th, new Object[0]);
        }
        return parcelableRequest;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        AbstractC7322o0O0OooO o0o0oooo = this.f14720OooO00o;
        if (o0o0oooo != null) {
            try {
                parcel.writeInt(o0o0oooo.OooO0O0());
                parcel.writeString(this.f14723o0ooOOo);
                parcel.writeString(this.f14720OooO00o.m18835OooO0O0());
                int i2 = 1;
                parcel.writeInt(this.f14720OooO00o.m18833OooO00o() ? 1 : 0);
                parcel.writeString(this.f14720OooO00o.getMethod());
                parcel.writeInt(this.f14721OooO00o == null ? 0 : 1);
                if (this.f14721OooO00o != null) {
                    parcel.writeMap(this.f14721OooO00o);
                }
                parcel.writeInt(this.OooO0O0 == null ? 0 : 1);
                if (this.OooO0O0 != null) {
                    parcel.writeMap(this.OooO0O0);
                }
                parcel.writeParcelable(this.OooO00o, 0);
                parcel.writeInt(this.f14720OooO00o.OooO00o());
                parcel.writeInt(this.f14720OooO00o.getReadTimeout());
                parcel.writeString(this.f14720OooO00o.OooO0OO());
                parcel.writeString(this.f14720OooO00o.OooO0Oo());
                Map<String, String> OooO00o2 = this.f14720OooO00o.m18831OooO00o();
                if (OooO00o2 == null) {
                    i2 = 0;
                }
                parcel.writeInt(i2);
                if (OooO00o2 != null) {
                    parcel.writeMap(OooO00o2);
                }
            } catch (Throwable th) {
                ALog.m291w("anet.ParcelableRequest", "[writeToParcel]", null, th, new Object[0]);
            }
        }
    }

    public String OooO00o(String str) {
        Map<String, String> map = this.OooO0OO;
        if (map == null) {
            return null;
        }
        return map.get(str);
    }

    public ParcelableRequest() {
    }
}

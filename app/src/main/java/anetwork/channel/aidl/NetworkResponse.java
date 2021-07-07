package anetwork.channel.aidl;

import android.os.Parcel;
import android.os.Parcelable;
import anet.channel.util.ALog;
import anet.channel.util.ErrorConstant;
import anetwork.channel.statist.StatisticData;
import com.p118pd.sdk.AbstractC7327o0O0o000;
import com.p118pd.sdk.C7343o0O0oOOO;
import java.util.List;
import java.util.Map;

public class NetworkResponse implements Parcelable, AbstractC7327o0O0o000 {
    public static final Parcelable.Creator<NetworkResponse> CREATOR = new C7343o0O0oOOO();
    public StatisticData OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Throwable f14714OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Map<String, List<String>> f14715OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public byte[] f14716OooO00o;
    public int o00oO0O;
    public String o0ooOOo;

    public NetworkResponse() {
    }

    public void OooO00o(int i) {
        this.o00oO0O = i;
        this.o0ooOOo = ErrorConstant.getErrMsg(i);
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("NetworkResponse [");
        sb.append("statusCode=");
        sb.append(this.o00oO0O);
        sb.append(", desc=");
        sb.append(this.o0ooOOo);
        sb.append(", connHeadFields=");
        sb.append(this.f14715OooO00o);
        sb.append(", bytedata=");
        sb.append(this.f14716OooO00o != null ? new String(this.f14716OooO00o) : "");
        sb.append(", error=");
        sb.append(this.f14714OooO00o);
        sb.append(", statisticData=");
        sb.append(this.OooO00o);
        sb.append("]");
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.o00oO0O);
        parcel.writeString(this.o0ooOOo);
        byte[] bArr = this.f14716OooO00o;
        int length = bArr != null ? bArr.length : 0;
        parcel.writeInt(length);
        if (length > 0) {
            parcel.writeByteArray(this.f14716OooO00o);
        }
        parcel.writeMap(this.f14715OooO00o);
        StatisticData statisticData = this.OooO00o;
        if (statisticData != null) {
            parcel.writeSerializable(statisticData);
        }
    }

    public NetworkResponse(int i) {
        this.o00oO0O = i;
        this.o0ooOOo = ErrorConstant.getErrMsg(i);
    }

    @Override // com.p118pd.sdk.AbstractC7327o0O0o000, com.p118pd.sdk.AbstractC7327o0O0o000, com.p118pd.sdk.AbstractC7327o0O0o000, com.p118pd.sdk.AbstractC7327o0O0o000, com.p118pd.sdk.AbstractC7327o0O0o000, com.p118pd.sdk.AbstractC7327o0O0o000
    /* renamed from: OooO00o  reason: collision with other method in class */
    public byte[] m14970OooO00o() {
        return this.f14716OooO00o;
    }

    public void OooO00o(byte[] bArr) {
        this.f14716OooO00o = bArr;
    }

    public void OooO00o(Map<String, List<String>> map) {
        this.f14715OooO00o = map;
    }

    @Override // com.p118pd.sdk.AbstractC7327o0O0o000, com.p118pd.sdk.AbstractC7327o0O0o000, com.p118pd.sdk.AbstractC7327o0O0o000, com.p118pd.sdk.AbstractC7327o0O0o000, com.p118pd.sdk.AbstractC7327o0O0o000, com.p118pd.sdk.AbstractC7327o0O0o000
    /* renamed from: OooO00o  reason: collision with other method in class */
    public Map<String, List<String>> m14969OooO00o() {
        return this.f14715OooO00o;
    }

    public void OooO00o(String str) {
        this.o0ooOOo = str;
    }

    @Override // com.p118pd.sdk.AbstractC7327o0O0o000, com.p118pd.sdk.AbstractC7327o0O0o000, com.p118pd.sdk.AbstractC7327o0O0o000, com.p118pd.sdk.AbstractC7327o0O0o000, com.p118pd.sdk.AbstractC7327o0O0o000, com.p118pd.sdk.AbstractC7327o0O0o000
    /* renamed from: OooO00o  reason: collision with other method in class */
    public String m14967OooO00o() {
        return this.o0ooOOo;
    }

    @Override // com.p118pd.sdk.AbstractC7327o0O0o000, com.p118pd.sdk.AbstractC7327o0O0o000, com.p118pd.sdk.AbstractC7327o0O0o000, com.p118pd.sdk.AbstractC7327o0O0o000, com.p118pd.sdk.AbstractC7327o0O0o000, com.p118pd.sdk.AbstractC7327o0O0o000
    public int OooO00o() {
        return this.o00oO0O;
    }

    @Override // com.p118pd.sdk.AbstractC7327o0O0o000, com.p118pd.sdk.AbstractC7327o0O0o000, com.p118pd.sdk.AbstractC7327o0O0o000, com.p118pd.sdk.AbstractC7327o0O0o000, com.p118pd.sdk.AbstractC7327o0O0o000, com.p118pd.sdk.AbstractC7327o0O0o000
    /* renamed from: OooO00o  reason: collision with other method in class */
    public Throwable m14968OooO00o() {
        return this.f14714OooO00o;
    }

    public void OooO00o(Throwable th) {
        this.f14714OooO00o = th;
    }

    public static NetworkResponse OooO00o(Parcel parcel) {
        NetworkResponse networkResponse = new NetworkResponse();
        try {
            networkResponse.o00oO0O = parcel.readInt();
            networkResponse.o0ooOOo = parcel.readString();
            int readInt = parcel.readInt();
            if (readInt > 0) {
                byte[] bArr = new byte[readInt];
                networkResponse.f14716OooO00o = bArr;
                parcel.readByteArray(bArr);
            }
            networkResponse.f14715OooO00o = parcel.readHashMap(NetworkResponse.class.getClassLoader());
            try {
                networkResponse.OooO00o = (StatisticData) parcel.readSerializable();
            } catch (Throwable unused) {
                ALog.m290i("anet.NetworkResponse", "[readFromParcel] source.readSerializable() error", null, new Object[0]);
            }
        } catch (Exception e) {
            ALog.m291w("anet.NetworkResponse", "[readFromParcel]", null, e, new Object[0]);
        }
        return networkResponse;
    }

    public void OooO00o(StatisticData statisticData) {
        this.OooO00o = statisticData;
    }

    @Override // com.p118pd.sdk.AbstractC7327o0O0o000, com.p118pd.sdk.AbstractC7327o0O0o000, com.p118pd.sdk.AbstractC7327o0O0o000, com.p118pd.sdk.AbstractC7327o0O0o000, com.p118pd.sdk.AbstractC7327o0O0o000, com.p118pd.sdk.AbstractC7327o0O0o000
    /* renamed from: OooO00o  reason: collision with other method in class */
    public StatisticData m14966OooO00o() {
        return this.OooO00o;
    }
}

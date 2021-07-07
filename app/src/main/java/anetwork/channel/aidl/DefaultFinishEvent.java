package anetwork.channel.aidl;

import android.os.Parcel;
import android.os.Parcelable;
import anet.channel.statist.RequestStatistic;
import anet.channel.util.ErrorConstant;
import anetwork.channel.statist.StatisticData;
import com.p118pd.sdk.C7319o0O0OoOo;
import com.p118pd.sdk.C7333o0O0o0o;

public class DefaultFinishEvent implements Parcelable, C7319o0O0OoOo.OooO00o {
    public static final Parcelable.Creator<DefaultFinishEvent> CREATOR = new C7333o0O0o0o();
    public final RequestStatistic OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public StatisticData f14711OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Object f14712OooO00o;
    public int o00oO0O;
    public String o0ooOOo;

    public DefaultFinishEvent(int i) {
        this(i, null, null);
    }

    @Override // com.p118pd.sdk.C7319o0O0OoOo.OooO00o, com.p118pd.sdk.C7319o0O0OoOo.OooO00o, com.p118pd.sdk.C7319o0O0OoOo.OooO00o
    /* renamed from: OooO00o  reason: collision with other method in class */
    public Object m14961OooO00o() {
        return this.f14712OooO00o;
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "DefaultFinishEvent [" + "code=" + this.o00oO0O + ", desc=" + this.o0ooOOo + ", context=" + this.f14712OooO00o + ", statisticData=" + this.f14711OooO00o + "]";
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.o00oO0O);
        parcel.writeString(this.o0ooOOo);
        StatisticData statisticData = this.f14711OooO00o;
        if (statisticData != null) {
            parcel.writeSerializable(statisticData);
        }
    }

    public DefaultFinishEvent(int i, String str, RequestStatistic requestStatistic) {
        this.f14711OooO00o = new StatisticData();
        this.o00oO0O = i;
        this.o0ooOOo = str == null ? ErrorConstant.getErrMsg(i) : str;
        this.OooO00o = requestStatistic;
    }

    public void OooO00o(Object obj) {
        this.f14712OooO00o = obj;
    }

    @Override // com.p118pd.sdk.C7319o0O0OoOo.OooO00o, com.p118pd.sdk.C7319o0O0OoOo.OooO00o, com.p118pd.sdk.C7319o0O0OoOo.OooO00o
    public int OooO00o() {
        return this.o00oO0O;
    }

    @Override // com.p118pd.sdk.C7319o0O0OoOo.OooO00o, com.p118pd.sdk.C7319o0O0OoOo.OooO00o, com.p118pd.sdk.C7319o0O0OoOo.OooO00o
    /* renamed from: OooO00o  reason: collision with other method in class */
    public String m14962OooO00o() {
        return this.o0ooOOo;
    }

    @Override // com.p118pd.sdk.C7319o0O0OoOo.OooO00o, com.p118pd.sdk.C7319o0O0OoOo.OooO00o, com.p118pd.sdk.C7319o0O0OoOo.OooO00o
    /* renamed from: OooO00o  reason: collision with other method in class */
    public StatisticData m14960OooO00o() {
        return this.f14711OooO00o;
    }

    public static DefaultFinishEvent OooO00o(Parcel parcel) {
        DefaultFinishEvent defaultFinishEvent = new DefaultFinishEvent(0);
        try {
            defaultFinishEvent.o00oO0O = parcel.readInt();
            defaultFinishEvent.o0ooOOo = parcel.readString();
            defaultFinishEvent.f14711OooO00o = (StatisticData) parcel.readSerializable();
        } catch (Throwable unused) {
        }
        return defaultFinishEvent;
    }
}

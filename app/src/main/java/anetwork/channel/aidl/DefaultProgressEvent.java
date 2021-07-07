package anetwork.channel.aidl;

import android.os.Parcel;
import android.os.Parcelable;
import com.p118pd.sdk.C7319o0O0OoOo;
import com.p118pd.sdk.C7350o0O0oo00;

public class DefaultProgressEvent implements Parcelable, C7319o0O0OoOo.OooO0O0 {
    public static final Parcelable.Creator<DefaultProgressEvent> CREATOR = new C7350o0O0oo00();
    public Object OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public byte[] f14713OooO00o;
    public int o00oO0O;
    public int o0ooOO0;
    public int o0ooOOo;

    public DefaultProgressEvent() {
    }

    @Override // com.p118pd.sdk.C7319o0O0OoOo.OooO0O0, com.p118pd.sdk.C7319o0O0OoOo.OooO0O0, com.p118pd.sdk.C7319o0O0OoOo.OooO0O0
    public int OooO00o() {
        return this.o0ooOO0;
    }

    @Override // com.p118pd.sdk.C7319o0O0OoOo.OooO0O0, com.p118pd.sdk.C7319o0O0OoOo.OooO0O0, com.p118pd.sdk.C7319o0O0OoOo.OooO0O0
    /* renamed from: OooO00o  reason: collision with other method in class */
    public String m14964OooO00o() {
        return "";
    }

    @Override // com.p118pd.sdk.C7319o0O0OoOo.OooO0O0
    public int OooO0O0() {
        return this.o00oO0O;
    }

    @Override // com.p118pd.sdk.C7319o0O0OoOo.OooO0O0
    public int OooO0OO() {
        return this.o0ooOOo;
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "DefaultProgressEvent [index=" + this.o00oO0O + ", size=" + this.o0ooOO0 + ", total=" + this.o0ooOOo + "]";
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.o00oO0O);
        parcel.writeInt(this.o0ooOO0);
        parcel.writeInt(this.o0ooOOo);
        byte[] bArr = this.f14713OooO00o;
        parcel.writeInt(bArr != null ? bArr.length : 0);
        parcel.writeByteArray(this.f14713OooO00o);
    }

    public DefaultProgressEvent(int i, int i2, int i3, byte[] bArr) {
        this.o00oO0O = i;
        this.o0ooOO0 = i2;
        this.o0ooOOo = i3;
        this.f14713OooO00o = bArr;
    }

    @Override // com.p118pd.sdk.C7319o0O0OoOo.OooO0O0, com.p118pd.sdk.C7319o0O0OoOo.OooO0O0, com.p118pd.sdk.C7319o0O0OoOo.OooO0O0
    /* renamed from: OooO00o  reason: collision with other method in class */
    public Object m14963OooO00o() {
        return this.OooO00o;
    }

    public void OooO00o(Object obj) {
        this.OooO00o = obj;
    }

    @Override // com.p118pd.sdk.C7319o0O0OoOo.OooO0O0, com.p118pd.sdk.C7319o0O0OoOo.OooO0O0, com.p118pd.sdk.C7319o0O0OoOo.OooO0O0
    /* renamed from: OooO00o  reason: collision with other method in class */
    public byte[] m14965OooO00o() {
        return this.f14713OooO00o;
    }

    public static DefaultProgressEvent OooO00o(Parcel parcel) {
        DefaultProgressEvent defaultProgressEvent = new DefaultProgressEvent();
        try {
            defaultProgressEvent.o00oO0O = parcel.readInt();
            defaultProgressEvent.o0ooOO0 = parcel.readInt();
            defaultProgressEvent.o0ooOOo = parcel.readInt();
            int readInt = parcel.readInt();
            if (readInt > 0) {
                byte[] bArr = new byte[readInt];
                parcel.readByteArray(bArr);
                defaultProgressEvent.f14713OooO00o = bArr;
            }
        } catch (Exception unused) {
        }
        return defaultProgressEvent;
    }
}

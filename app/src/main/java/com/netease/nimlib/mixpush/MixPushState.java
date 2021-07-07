package com.netease.nimlib.mixpush;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;

public class MixPushState implements Serializable, Parcelable {
    public static final Parcelable.Creator<MixPushState> CREATOR = new OooO00o();
    public byte hasPushed;
    public String lastDeviceId;
    public int pushType;

    public static class OooO00o implements Parcelable.Creator<MixPushState> {
        /* renamed from: OooO00o */
        public MixPushState createFromParcel(Parcel parcel) {
            return new MixPushState(parcel);
        }

        /* renamed from: OooO00o */
        public MixPushState[] newArray(int i) {
            return new MixPushState[i];
        }
    }

    public MixPushState(int i, boolean z, String str) {
        this.pushType = i;
        this.hasPushed = z ? (byte) 1 : 0;
        this.lastDeviceId = str;
    }

    public int describeContents() {
        return 0;
    }

    public String getLastDeviceId() {
        return this.lastDeviceId;
    }

    public int getPushType() {
        return this.pushType;
    }

    public boolean hasPushed() {
        return this.hasPushed == 1;
    }

    public String toString() {
        return "MixPushState{pushType=" + this.pushType + ", hasPushed=" + ((int) this.hasPushed) + ", lastDeviceId='" + this.lastDeviceId + '\'' + '}';
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.pushType);
        parcel.writeByte(this.hasPushed);
        parcel.writeString(this.lastDeviceId);
    }

    public MixPushState(Parcel parcel) {
        this.pushType = parcel.readInt();
        this.hasPushed = parcel.readByte();
        this.lastDeviceId = parcel.readString();
    }
}

package com.tencent.bugly.beta.upgrade;

import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.bugly.proguard.AbstractC3357m;
import com.tencent.bugly.proguard.C3311ah;
import com.tencent.bugly.proguard.C3372y;

public class BetaGrayStrategy implements Parcelable, Parcelable.Creator<BetaGrayStrategy> {
    public static final Parcelable.Creator<BetaGrayStrategy> CREATOR = new BetaGrayStrategy();

    /* renamed from: a */
    public C3372y f7476a;

    /* renamed from: b */
    public int f7477b = 0;

    /* renamed from: c */
    public long f7478c = -1;

    /* renamed from: d */
    public boolean f7479d = false;

    /* renamed from: e */
    public long f7480e = -1;

    public BetaGrayStrategy(Parcel parcel) {
        boolean z = false;
        this.f7476a = (C3372y) C3311ah.m8285a(parcel.createByteArray(), C3372y.class);
        this.f7477b = parcel.readInt();
        this.f7478c = parcel.readLong();
        this.f7479d = 1 == parcel.readByte() ? true : z;
        this.f7480e = parcel.readLong();
    }

    /* renamed from: a */
    public BetaGrayStrategy createFromParcel(Parcel parcel) {
        return new BetaGrayStrategy(parcel);
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeByteArray(C3311ah.m8286a((AbstractC3357m) this.f7476a));
        parcel.writeInt(this.f7477b);
        parcel.writeLong(this.f7478c);
        parcel.writeByte(this.f7479d ? (byte) 1 : 0);
        parcel.writeLong(this.f7480e);
    }

    /* renamed from: a */
    public BetaGrayStrategy[] newArray(int i) {
        return new BetaGrayStrategy[i];
    }

    public BetaGrayStrategy() {
    }
}

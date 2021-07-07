package com.tencent.bugly.crashreport.common.info;

import android.os.Parcel;
import android.os.Parcelable;

public class PlugInBean implements Parcelable {
    public static final Parcelable.Creator<PlugInBean> CREATOR = new Parcelable.Creator<PlugInBean>() {
        /* class com.tencent.bugly.crashreport.common.info.PlugInBean.C32681 */

        /* renamed from: a */
        public PlugInBean createFromParcel(Parcel parcel) {
            return new PlugInBean(parcel);
        }

        /* renamed from: a */
        public PlugInBean[] newArray(int i) {
            return new PlugInBean[i];
        }
    };

    /* renamed from: a */
    public final String f7616a;

    /* renamed from: b */
    public final String f7617b;

    /* renamed from: c */
    public final String f7618c;

    public PlugInBean(String str, String str2, String str3) {
        this.f7616a = str;
        this.f7617b = str2;
        this.f7618c = str3;
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "plid:" + this.f7616a + " plV:" + this.f7617b + " plUUID:" + this.f7618c;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f7616a);
        parcel.writeString(this.f7617b);
        parcel.writeString(this.f7618c);
    }

    public PlugInBean(Parcel parcel) {
        this.f7616a = parcel.readString();
        this.f7617b = parcel.readString();
        this.f7618c = parcel.readString();
    }
}

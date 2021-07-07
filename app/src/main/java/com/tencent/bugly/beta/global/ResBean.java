package com.tencent.bugly.beta.global;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ResBean implements Parcelable, Parcelable.Creator<ResBean> {
    public static final Parcelable.Creator<ResBean> CREATOR = new ResBean();

    /* renamed from: a */
    public static ResBean f7346a;

    /* renamed from: b */
    public static final String[] f7347b = {"IMG_title", "VAL_style"};

    /* renamed from: c */
    public final String f7348c = "#273238";

    /* renamed from: d */
    public final String f7349d = "#757575";

    /* renamed from: e */
    public Map<String, String> f7350e = new ConcurrentHashMap();

    public ResBean() {
    }

    /* renamed from: a */
    public String mo37904a(String str) {
        return this.f7350e.get(str);
    }

    /* renamed from: a */
    public ResBean[] newArray(int i) {
        return new ResBean[0];
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        for (String str : f7347b) {
            parcel.writeString(this.f7350e.get(str));
        }
    }

    /* renamed from: a */
    public void mo37905a(String str, Object obj) {
        if (obj instanceof String) {
            this.f7350e.put(str, (String) obj);
        }
    }

    /* renamed from: a */
    public ResBean createFromParcel(Parcel parcel) {
        return new ResBean(parcel);
    }

    public ResBean(Parcel parcel) {
        try {
            for (String str : f7347b) {
                this.f7350e.put(str, parcel.readString());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

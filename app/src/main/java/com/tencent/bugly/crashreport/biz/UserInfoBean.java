package com.tencent.bugly.crashreport.biz;

import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.bugly.proguard.C3325ap;
import java.util.Map;

public class UserInfoBean implements Parcelable {
    public static final Parcelable.Creator<UserInfoBean> CREATOR = new Parcelable.Creator<UserInfoBean>() {
        /* class com.tencent.bugly.crashreport.biz.UserInfoBean.C32581 */

        /* renamed from: a */
        public UserInfoBean createFromParcel(Parcel parcel) {
            return new UserInfoBean(parcel);
        }

        /* renamed from: a */
        public UserInfoBean[] newArray(int i) {
            return new UserInfoBean[i];
        }
    };

    /* renamed from: a */
    public long f7566a;

    /* renamed from: b */
    public int f7567b;

    /* renamed from: c */
    public String f7568c;

    /* renamed from: d */
    public String f7569d;

    /* renamed from: e */
    public long f7570e;

    /* renamed from: f */
    public long f7571f;

    /* renamed from: g */
    public long f7572g;

    /* renamed from: h */
    public long f7573h;

    /* renamed from: i */
    public long f7574i;

    /* renamed from: j */
    public String f7575j;

    /* renamed from: k */
    public long f7576k;

    /* renamed from: l */
    public boolean f7577l;

    /* renamed from: m */
    public String f7578m;

    /* renamed from: n */
    public String f7579n;

    /* renamed from: o */
    public int f7580o;

    /* renamed from: p */
    public int f7581p;

    /* renamed from: q */
    public int f7582q;

    /* renamed from: r */
    public Map<String, String> f7583r;

    /* renamed from: s */
    public Map<String, String> f7584s;

    public UserInfoBean() {
        this.f7576k = 0;
        this.f7577l = false;
        this.f7578m = "unknown";
        this.f7581p = -1;
        this.f7582q = -1;
        this.f7583r = null;
        this.f7584s = null;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f7567b);
        parcel.writeString(this.f7568c);
        parcel.writeString(this.f7569d);
        parcel.writeLong(this.f7570e);
        parcel.writeLong(this.f7571f);
        parcel.writeLong(this.f7572g);
        parcel.writeLong(this.f7573h);
        parcel.writeLong(this.f7574i);
        parcel.writeString(this.f7575j);
        parcel.writeLong(this.f7576k);
        parcel.writeByte(this.f7577l ? (byte) 1 : 0);
        parcel.writeString(this.f7578m);
        parcel.writeInt(this.f7581p);
        parcel.writeInt(this.f7582q);
        C3325ap.m8418b(parcel, this.f7583r);
        C3325ap.m8418b(parcel, this.f7584s);
        parcel.writeString(this.f7579n);
        parcel.writeInt(this.f7580o);
    }

    public UserInfoBean(Parcel parcel) {
        this.f7576k = 0;
        boolean z = false;
        this.f7577l = false;
        this.f7578m = "unknown";
        this.f7581p = -1;
        this.f7582q = -1;
        this.f7583r = null;
        this.f7584s = null;
        this.f7567b = parcel.readInt();
        this.f7568c = parcel.readString();
        this.f7569d = parcel.readString();
        this.f7570e = parcel.readLong();
        this.f7571f = parcel.readLong();
        this.f7572g = parcel.readLong();
        this.f7573h = parcel.readLong();
        this.f7574i = parcel.readLong();
        this.f7575j = parcel.readString();
        this.f7576k = parcel.readLong();
        this.f7577l = parcel.readByte() == 1 ? true : z;
        this.f7578m = parcel.readString();
        this.f7581p = parcel.readInt();
        this.f7582q = parcel.readInt();
        this.f7583r = C3325ap.m8416b(parcel);
        this.f7584s = C3325ap.m8416b(parcel);
        this.f7579n = parcel.readString();
        this.f7580o = parcel.readInt();
    }
}

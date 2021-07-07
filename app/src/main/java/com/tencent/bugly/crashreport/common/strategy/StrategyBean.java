package com.tencent.bugly.crashreport.common.strategy;

import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.bugly.proguard.C3325ap;
import com.xiaomi.mipush.sdk.Constants;
import java.util.Map;

public class StrategyBean implements Parcelable {
    public static final Parcelable.Creator<StrategyBean> CREATOR = new Parcelable.Creator<StrategyBean>() {
        /* class com.tencent.bugly.crashreport.common.strategy.StrategyBean.C32711 */

        /* renamed from: a */
        public StrategyBean createFromParcel(Parcel parcel) {
            return new StrategyBean(parcel);
        }

        /* renamed from: a */
        public StrategyBean[] newArray(int i) {
            return new StrategyBean[i];
        }
    };

    /* renamed from: a */
    public static String f7708a = "http://rqd.uu.qq.com/rqd/sync";

    /* renamed from: b */
    public static String f7709b = "http://android.bugly.qq.com/rqd/async";

    /* renamed from: c */
    public static String f7710c = "http://android.bugly.qq.com/rqd/async";

    /* renamed from: d */
    public static String f7711d;

    /* renamed from: e */
    public long f7712e;

    /* renamed from: f */
    public long f7713f;

    /* renamed from: g */
    public boolean f7714g;

    /* renamed from: h */
    public boolean f7715h;

    /* renamed from: i */
    public boolean f7716i;

    /* renamed from: j */
    public boolean f7717j;

    /* renamed from: k */
    public boolean f7718k;

    /* renamed from: l */
    public boolean f7719l;

    /* renamed from: m */
    public boolean f7720m;

    /* renamed from: n */
    public boolean f7721n;

    /* renamed from: o */
    public boolean f7722o;

    /* renamed from: p */
    public long f7723p;

    /* renamed from: q */
    public long f7724q;

    /* renamed from: r */
    public String f7725r;

    /* renamed from: s */
    public String f7726s;

    /* renamed from: t */
    public String f7727t;

    /* renamed from: u */
    public String f7728u;

    /* renamed from: v */
    public Map<String, String> f7729v;

    /* renamed from: w */
    public int f7730w;

    /* renamed from: x */
    public long f7731x;

    /* renamed from: y */
    public long f7732y;

    public StrategyBean() {
        this.f7712e = -1;
        this.f7713f = -1;
        this.f7714g = true;
        this.f7715h = true;
        this.f7716i = true;
        this.f7717j = true;
        this.f7718k = false;
        this.f7719l = true;
        this.f7720m = true;
        this.f7721n = true;
        this.f7722o = true;
        this.f7724q = 30000;
        this.f7725r = f7709b;
        this.f7726s = f7710c;
        this.f7727t = f7708a;
        this.f7730w = 10;
        this.f7731x = Constants.ASSEMBLE_PUSH_NETWORK_INTERVAL;
        this.f7732y = -1;
        this.f7713f = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        sb.append("S(");
        sb.append("@L@L");
        sb.append("@)");
        f7711d = sb.toString();
        sb.setLength(0);
        sb.append("*^");
        sb.append("@K#K");
        sb.append("@!");
        this.f7728u = sb.toString();
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f7713f);
        parcel.writeByte(this.f7714g ? (byte) 1 : 0);
        parcel.writeByte(this.f7715h ? (byte) 1 : 0);
        parcel.writeByte(this.f7716i ? (byte) 1 : 0);
        parcel.writeString(this.f7725r);
        parcel.writeString(this.f7726s);
        parcel.writeString(this.f7728u);
        C3325ap.m8418b(parcel, this.f7729v);
        parcel.writeByte(this.f7717j ? (byte) 1 : 0);
        parcel.writeByte(this.f7718k ? (byte) 1 : 0);
        parcel.writeByte(this.f7721n ? (byte) 1 : 0);
        parcel.writeByte(this.f7722o ? (byte) 1 : 0);
        parcel.writeLong(this.f7724q);
        parcel.writeByte(this.f7719l ? (byte) 1 : 0);
        parcel.writeByte(this.f7720m ? (byte) 1 : 0);
        parcel.writeLong(this.f7723p);
        parcel.writeInt(this.f7730w);
        parcel.writeLong(this.f7731x);
        parcel.writeLong(this.f7732y);
    }

    public StrategyBean(Parcel parcel) {
        this.f7712e = -1;
        this.f7713f = -1;
        boolean z = true;
        this.f7714g = true;
        this.f7715h = true;
        this.f7716i = true;
        this.f7717j = true;
        this.f7718k = false;
        this.f7719l = true;
        this.f7720m = true;
        this.f7721n = true;
        this.f7722o = true;
        this.f7724q = 30000;
        this.f7725r = f7709b;
        this.f7726s = f7710c;
        this.f7727t = f7708a;
        this.f7730w = 10;
        this.f7731x = Constants.ASSEMBLE_PUSH_NETWORK_INTERVAL;
        this.f7732y = -1;
        try {
            f7711d = "S(" + "@L@L" + "@)";
            this.f7713f = parcel.readLong();
            this.f7714g = parcel.readByte() == 1;
            this.f7715h = parcel.readByte() == 1;
            this.f7716i = parcel.readByte() == 1;
            this.f7725r = parcel.readString();
            this.f7726s = parcel.readString();
            this.f7728u = parcel.readString();
            this.f7729v = C3325ap.m8416b(parcel);
            this.f7717j = parcel.readByte() == 1;
            this.f7718k = parcel.readByte() == 1;
            this.f7721n = parcel.readByte() == 1;
            this.f7722o = parcel.readByte() == 1;
            this.f7724q = parcel.readLong();
            this.f7719l = parcel.readByte() == 1;
            if (parcel.readByte() != 1) {
                z = false;
            }
            this.f7720m = z;
            this.f7723p = parcel.readLong();
            this.f7730w = parcel.readInt();
            this.f7731x = parcel.readLong();
            this.f7732y = parcel.readLong();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

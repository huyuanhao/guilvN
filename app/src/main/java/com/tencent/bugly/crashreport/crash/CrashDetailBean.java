package com.tencent.bugly.crashreport.crash;

import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.bugly.crashreport.common.info.PlugInBean;
import com.tencent.bugly.proguard.C3325ap;
import java.util.Map;
import java.util.UUID;

public class CrashDetailBean implements Parcelable, Comparable<CrashDetailBean> {
    public static final Parcelable.Creator<CrashDetailBean> CREATOR = new Parcelable.Creator<CrashDetailBean>() {
        /* class com.tencent.bugly.crashreport.crash.CrashDetailBean.C32751 */

        /* renamed from: a */
        public CrashDetailBean createFromParcel(Parcel parcel) {
            return new CrashDetailBean(parcel);
        }

        /* renamed from: a */
        public CrashDetailBean[] newArray(int i) {
            return new CrashDetailBean[i];
        }
    };

    /* renamed from: A */
    public String f7750A;

    /* renamed from: B */
    public String f7751B;

    /* renamed from: C */
    public long f7752C;

    /* renamed from: D */
    public long f7753D;

    /* renamed from: E */
    public long f7754E;

    /* renamed from: F */
    public long f7755F;

    /* renamed from: G */
    public long f7756G;

    /* renamed from: H */
    public long f7757H;

    /* renamed from: I */
    public String f7758I;

    /* renamed from: J */
    public String f7759J;

    /* renamed from: K */
    public String f7760K;

    /* renamed from: L */
    public String f7761L;

    /* renamed from: M */
    public String f7762M;

    /* renamed from: N */
    public long f7763N;

    /* renamed from: O */
    public boolean f7764O;

    /* renamed from: P */
    public Map<String, String> f7765P;

    /* renamed from: Q */
    public int f7766Q;

    /* renamed from: R */
    public int f7767R;

    /* renamed from: S */
    public Map<String, String> f7768S;

    /* renamed from: T */
    public Map<String, String> f7769T;

    /* renamed from: U */
    public byte[] f7770U;

    /* renamed from: V */
    public String f7771V;

    /* renamed from: W */
    public String f7772W;

    /* renamed from: a */
    public long f7773a;

    /* renamed from: b */
    public int f7774b;

    /* renamed from: c */
    public String f7775c;

    /* renamed from: d */
    public boolean f7776d;

    /* renamed from: e */
    public String f7777e;

    /* renamed from: f */
    public String f7778f;

    /* renamed from: g */
    public String f7779g;

    /* renamed from: h */
    public Map<String, PlugInBean> f7780h;

    /* renamed from: i */
    public Map<String, PlugInBean> f7781i;

    /* renamed from: j */
    public boolean f7782j;

    /* renamed from: k */
    public boolean f7783k;

    /* renamed from: l */
    public int f7784l;

    /* renamed from: m */
    public String f7785m;

    /* renamed from: n */
    public String f7786n;

    /* renamed from: o */
    public String f7787o;

    /* renamed from: p */
    public String f7788p;

    /* renamed from: q */
    public String f7789q;

    /* renamed from: r */
    public long f7790r;

    /* renamed from: s */
    public String f7791s;

    /* renamed from: t */
    public int f7792t;

    /* renamed from: u */
    public String f7793u;

    /* renamed from: v */
    public String f7794v;

    /* renamed from: w */
    public String f7795w;

    /* renamed from: x */
    public String f7796x;

    /* renamed from: y */
    public byte[] f7797y;

    /* renamed from: z */
    public Map<String, String> f7798z;

    public CrashDetailBean() {
        this.f7773a = -1;
        this.f7774b = 0;
        this.f7775c = UUID.randomUUID().toString();
        this.f7776d = false;
        this.f7777e = "";
        this.f7778f = "";
        this.f7779g = "";
        this.f7780h = null;
        this.f7781i = null;
        this.f7782j = false;
        this.f7783k = false;
        this.f7784l = 0;
        this.f7785m = "";
        this.f7786n = "";
        this.f7787o = "";
        this.f7788p = "";
        this.f7789q = "";
        this.f7790r = -1;
        this.f7791s = null;
        this.f7792t = 0;
        this.f7793u = "";
        this.f7794v = "";
        this.f7795w = null;
        this.f7796x = null;
        this.f7797y = null;
        this.f7798z = null;
        this.f7750A = "";
        this.f7751B = "";
        this.f7752C = -1;
        this.f7753D = -1;
        this.f7754E = -1;
        this.f7755F = -1;
        this.f7756G = -1;
        this.f7757H = -1;
        this.f7758I = "";
        this.f7759J = "";
        this.f7760K = "";
        this.f7761L = "";
        this.f7762M = "";
        this.f7763N = -1;
        this.f7764O = false;
        this.f7765P = null;
        this.f7766Q = -1;
        this.f7767R = -1;
        this.f7768S = null;
        this.f7769T = null;
        this.f7770U = null;
        this.f7771V = null;
        this.f7772W = null;
    }

    /* renamed from: a */
    public int compareTo(CrashDetailBean crashDetailBean) {
        if (crashDetailBean == null) {
            return 1;
        }
        long j = this.f7790r - crashDetailBean.f7790r;
        if (j > 0) {
            return 1;
        }
        return j < 0 ? -1 : 0;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f7774b);
        parcel.writeString(this.f7775c);
        parcel.writeByte(this.f7776d ? (byte) 1 : 0);
        parcel.writeString(this.f7777e);
        parcel.writeString(this.f7778f);
        parcel.writeString(this.f7779g);
        parcel.writeByte(this.f7782j ? (byte) 1 : 0);
        parcel.writeByte(this.f7783k ? (byte) 1 : 0);
        parcel.writeInt(this.f7784l);
        parcel.writeString(this.f7785m);
        parcel.writeString(this.f7786n);
        parcel.writeString(this.f7787o);
        parcel.writeString(this.f7788p);
        parcel.writeString(this.f7789q);
        parcel.writeLong(this.f7790r);
        parcel.writeString(this.f7791s);
        parcel.writeInt(this.f7792t);
        parcel.writeString(this.f7793u);
        parcel.writeString(this.f7794v);
        parcel.writeString(this.f7795w);
        C3325ap.m8418b(parcel, this.f7798z);
        parcel.writeString(this.f7750A);
        parcel.writeString(this.f7751B);
        parcel.writeLong(this.f7752C);
        parcel.writeLong(this.f7753D);
        parcel.writeLong(this.f7754E);
        parcel.writeLong(this.f7755F);
        parcel.writeLong(this.f7756G);
        parcel.writeLong(this.f7757H);
        parcel.writeString(this.f7758I);
        parcel.writeString(this.f7759J);
        parcel.writeString(this.f7760K);
        parcel.writeString(this.f7761L);
        parcel.writeString(this.f7762M);
        parcel.writeLong(this.f7763N);
        parcel.writeByte(this.f7764O ? (byte) 1 : 0);
        C3325ap.m8418b(parcel, this.f7765P);
        C3325ap.m8399a(parcel, this.f7780h);
        C3325ap.m8399a(parcel, this.f7781i);
        parcel.writeInt(this.f7766Q);
        parcel.writeInt(this.f7767R);
        C3325ap.m8418b(parcel, this.f7768S);
        C3325ap.m8418b(parcel, this.f7769T);
        parcel.writeByteArray(this.f7770U);
        parcel.writeByteArray(this.f7797y);
        parcel.writeString(this.f7771V);
        parcel.writeString(this.f7772W);
        parcel.writeString(this.f7796x);
    }

    public CrashDetailBean(Parcel parcel) {
        this.f7773a = -1;
        boolean z = false;
        this.f7774b = 0;
        this.f7775c = UUID.randomUUID().toString();
        this.f7776d = false;
        this.f7777e = "";
        this.f7778f = "";
        this.f7779g = "";
        this.f7780h = null;
        this.f7781i = null;
        this.f7782j = false;
        this.f7783k = false;
        this.f7784l = 0;
        this.f7785m = "";
        this.f7786n = "";
        this.f7787o = "";
        this.f7788p = "";
        this.f7789q = "";
        this.f7790r = -1;
        this.f7791s = null;
        this.f7792t = 0;
        this.f7793u = "";
        this.f7794v = "";
        this.f7795w = null;
        this.f7796x = null;
        this.f7797y = null;
        this.f7798z = null;
        this.f7750A = "";
        this.f7751B = "";
        this.f7752C = -1;
        this.f7753D = -1;
        this.f7754E = -1;
        this.f7755F = -1;
        this.f7756G = -1;
        this.f7757H = -1;
        this.f7758I = "";
        this.f7759J = "";
        this.f7760K = "";
        this.f7761L = "";
        this.f7762M = "";
        this.f7763N = -1;
        this.f7764O = false;
        this.f7765P = null;
        this.f7766Q = -1;
        this.f7767R = -1;
        this.f7768S = null;
        this.f7769T = null;
        this.f7770U = null;
        this.f7771V = null;
        this.f7772W = null;
        this.f7774b = parcel.readInt();
        this.f7775c = parcel.readString();
        this.f7776d = parcel.readByte() == 1;
        this.f7777e = parcel.readString();
        this.f7778f = parcel.readString();
        this.f7779g = parcel.readString();
        this.f7782j = parcel.readByte() == 1;
        this.f7783k = parcel.readByte() == 1;
        this.f7784l = parcel.readInt();
        this.f7785m = parcel.readString();
        this.f7786n = parcel.readString();
        this.f7787o = parcel.readString();
        this.f7788p = parcel.readString();
        this.f7789q = parcel.readString();
        this.f7790r = parcel.readLong();
        this.f7791s = parcel.readString();
        this.f7792t = parcel.readInt();
        this.f7793u = parcel.readString();
        this.f7794v = parcel.readString();
        this.f7795w = parcel.readString();
        this.f7798z = C3325ap.m8416b(parcel);
        this.f7750A = parcel.readString();
        this.f7751B = parcel.readString();
        this.f7752C = parcel.readLong();
        this.f7753D = parcel.readLong();
        this.f7754E = parcel.readLong();
        this.f7755F = parcel.readLong();
        this.f7756G = parcel.readLong();
        this.f7757H = parcel.readLong();
        this.f7758I = parcel.readString();
        this.f7759J = parcel.readString();
        this.f7760K = parcel.readString();
        this.f7761L = parcel.readString();
        this.f7762M = parcel.readString();
        this.f7763N = parcel.readLong();
        this.f7764O = parcel.readByte() == 1 ? true : z;
        this.f7765P = C3325ap.m8416b(parcel);
        this.f7780h = C3325ap.m8397a(parcel);
        this.f7781i = C3325ap.m8397a(parcel);
        this.f7766Q = parcel.readInt();
        this.f7767R = parcel.readInt();
        this.f7768S = C3325ap.m8416b(parcel);
        this.f7769T = C3325ap.m8416b(parcel);
        this.f7770U = parcel.createByteArray();
        this.f7797y = parcel.createByteArray();
        this.f7771V = parcel.readString();
        this.f7772W = parcel.readString();
        this.f7796x = parcel.readString();
    }
}

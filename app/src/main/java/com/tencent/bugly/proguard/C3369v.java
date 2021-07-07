package com.tencent.bugly.proguard;

import com.p118pd.sdk.C8379oOoOoOo;
import com.qiyukf.unicorn.api.msg.attachment.FileAttachment;
import com.tencent.p269mm.opensdk.constants.ConstantsAPI;

/* renamed from: com.tencent.bugly.proguard.v */
public final class C3369v extends AbstractC3357m implements Cloneable {

    /* renamed from: l */
    public static final /* synthetic */ boolean f8260l = (!C3369v.class.desiredAssertionStatus());

    /* renamed from: a */
    public String f8261a = "";

    /* renamed from: b */
    public byte f8262b = 0;

    /* renamed from: c */
    public int f8263c = 0;

    /* renamed from: d */
    public String f8264d = "";

    /* renamed from: e */
    public int f8265e = 0;

    /* renamed from: f */
    public String f8266f = "";

    /* renamed from: g */
    public long f8267g = 0;

    /* renamed from: h */
    public String f8268h = "";

    /* renamed from: i */
    public String f8269i = "";

    /* renamed from: j */
    public String f8270j = "";

    /* renamed from: k */
    public String f8271k = "";

    public C3369v() {
    }

    @Override // com.tencent.bugly.proguard.AbstractC3357m
    /* renamed from: a */
    public void mo38327a(C3356l lVar) {
        lVar.mo38481a(this.f8261a, 0);
        lVar.mo38493b(this.f8262b, 1);
        lVar.mo38477a(this.f8263c, 2);
        String str = this.f8264d;
        if (str != null) {
            lVar.mo38481a(str, 3);
        }
        lVar.mo38477a(this.f8265e, 4);
        String str2 = this.f8266f;
        if (str2 != null) {
            lVar.mo38481a(str2, 5);
        }
        lVar.mo38478a(this.f8267g, 6);
        String str3 = this.f8268h;
        if (str3 != null) {
            lVar.mo38481a(str3, 7);
        }
        String str4 = this.f8269i;
        if (str4 != null) {
            lVar.mo38481a(str4, 8);
        }
        String str5 = this.f8270j;
        if (str5 != null) {
            lVar.mo38481a(str5, 9);
        }
        String str6 = this.f8271k;
        if (str6 != null) {
            lVar.mo38481a(str6, 10);
        }
    }

    @Override // java.lang.Object
    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException unused) {
            if (f8260l) {
                return null;
            }
            throw new AssertionError();
        }
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        C3369v vVar = (C3369v) obj;
        if (!C3358n.m8592a(this.f8261a, vVar.f8261a) || !C3358n.m8589a(this.f8262b, vVar.f8262b) || !C3358n.m8590a(this.f8263c, vVar.f8263c) || !C3358n.m8592a(this.f8264d, vVar.f8264d) || !C3358n.m8590a(this.f8265e, vVar.f8265e) || !C3358n.m8592a(this.f8266f, vVar.f8266f) || !C3358n.m8591a(this.f8267g, vVar.f8267g) || !C3358n.m8592a(this.f8268h, vVar.f8268h) || !C3358n.m8592a(this.f8269i, vVar.f8269i) || !C3358n.m8592a(this.f8270j, vVar.f8270j) || !C3358n.m8592a(this.f8271k, vVar.f8271k)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        try {
            throw new Exception("Need define key first!");
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    public C3369v(String str, byte b, int i, String str2, int i2, String str3, long j, String str4, String str5, String str6, String str7) {
        this.f8261a = str;
        this.f8262b = b;
        this.f8263c = i;
        this.f8264d = str2;
        this.f8265e = i2;
        this.f8266f = str3;
        this.f8267g = j;
        this.f8268h = str4;
        this.f8269i = str5;
        this.f8270j = str6;
        this.f8271k = str7;
    }

    @Override // com.tencent.bugly.proguard.AbstractC3357m
    /* renamed from: a */
    public void mo38326a(C3354k kVar) {
        this.f8261a = kVar.mo38454a(0, true);
        this.f8262b = kVar.mo38446a(this.f8262b, 1, true);
        this.f8263c = kVar.mo38449a(this.f8263c, 2, true);
        this.f8264d = kVar.mo38454a(3, false);
        this.f8265e = kVar.mo38449a(this.f8265e, 4, false);
        this.f8266f = kVar.mo38454a(5, false);
        this.f8267g = kVar.mo38451a(this.f8267g, 6, false);
        this.f8268h = kVar.mo38454a(7, false);
        this.f8269i = kVar.mo38454a(8, false);
        this.f8270j = kVar.mo38454a(9, false);
        this.f8271k = kVar.mo38454a(10, false);
    }

    @Override // com.tencent.bugly.proguard.AbstractC3357m
    /* renamed from: a */
    public void mo38328a(StringBuilder sb, int i) {
        C3352i iVar = new C3352i(sb, i);
        iVar.mo38434a(this.f8261a, "appId");
        iVar.mo38426a(this.f8262b, ConstantsAPI.Token.WX_TOKEN_PLATFORMID_KEY);
        iVar.mo38430a(this.f8263c, C8379oOoOoOo.OooOooO);
        iVar.mo38434a(this.f8264d, C8379oOoOoOo.OooOoo);
        iVar.mo38430a(this.f8265e, "buildNo");
        iVar.mo38434a(this.f8266f, "iconUrl");
        iVar.mo38431a(this.f8267g, "apkId");
        iVar.mo38434a(this.f8268h, "channelId");
        iVar.mo38434a(this.f8269i, FileAttachment.KEY_MD5);
        iVar.mo38434a(this.f8270j, "sdkVer");
        iVar.mo38434a(this.f8271k, "bundleId");
    }
}

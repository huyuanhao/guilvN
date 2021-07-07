package com.tencent.bugly.proguard;

import com.umeng.analytics.pro.C3416b;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.tencent.bugly.proguard.g */
public final class C3350g extends AbstractC3357m {

    /* renamed from: k */
    public static byte[] f8205k = null;

    /* renamed from: l */
    public static Map<String, String> f8206l = null;

    /* renamed from: m */
    public static final /* synthetic */ boolean f8207m = (!C3350g.class.desiredAssertionStatus());

    /* renamed from: a */
    public short f8208a = 0;

    /* renamed from: b */
    public byte f8209b = 0;

    /* renamed from: c */
    public int f8210c = 0;

    /* renamed from: d */
    public int f8211d = 0;

    /* renamed from: e */
    public String f8212e = null;

    /* renamed from: f */
    public String f8213f = null;

    /* renamed from: g */
    public byte[] f8214g;

    /* renamed from: h */
    public int f8215h = 0;

    /* renamed from: i */
    public Map<String, String> f8216i;

    /* renamed from: j */
    public Map<String, String> f8217j;

    @Override // com.tencent.bugly.proguard.AbstractC3357m
    /* renamed from: a */
    public void mo38327a(C3356l lVar) {
        lVar.mo38484a(this.f8208a, 1);
        lVar.mo38493b(this.f8209b, 2);
        lVar.mo38477a(this.f8210c, 3);
        lVar.mo38477a(this.f8211d, 4);
        lVar.mo38481a(this.f8212e, 5);
        lVar.mo38481a(this.f8213f, 6);
        lVar.mo38486a(this.f8214g, 7);
        lVar.mo38477a(this.f8215h, 8);
        lVar.mo38483a((Map) this.f8216i, 9);
        lVar.mo38483a((Map) this.f8217j, 10);
    }

    @Override // java.lang.Object
    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException unused) {
            if (f8207m) {
                return null;
            }
            throw new AssertionError();
        }
    }

    public boolean equals(Object obj) {
        C3350g gVar = (C3350g) obj;
        return C3358n.m8590a(1, gVar.f8208a) && C3358n.m8590a(1, gVar.f8209b) && C3358n.m8590a(1, gVar.f8210c) && C3358n.m8590a(1, gVar.f8211d) && C3358n.m8592a(1, gVar.f8212e) && C3358n.m8592a(1, gVar.f8213f) && C3358n.m8592a(1, gVar.f8214g) && C3358n.m8590a(1, gVar.f8215h) && C3358n.m8592a(1, gVar.f8216i) && C3358n.m8592a(1, gVar.f8217j);
    }

    @Override // com.tencent.bugly.proguard.AbstractC3357m
    /* renamed from: a */
    public void mo38326a(C3354k kVar) {
        try {
            this.f8208a = kVar.mo38457a(this.f8208a, 1, true);
            this.f8209b = kVar.mo38446a(this.f8209b, 2, true);
            this.f8210c = kVar.mo38449a(this.f8210c, 3, true);
            this.f8211d = kVar.mo38449a(this.f8211d, 4, true);
            this.f8212e = kVar.mo38454a(5, true);
            this.f8213f = kVar.mo38454a(6, true);
            if (f8205k == null) {
                f8205k = new byte[]{0};
            }
            this.f8214g = kVar.mo38463a(f8205k, 7, true);
            this.f8215h = kVar.mo38449a(this.f8215h, 8, true);
            if (f8206l == null) {
                HashMap hashMap = new HashMap();
                f8206l = hashMap;
                hashMap.put("", "");
            }
            this.f8216i = (Map) kVar.mo38453a((Object) f8206l, 9, true);
            if (f8206l == null) {
                HashMap hashMap2 = new HashMap();
                f8206l = hashMap2;
                hashMap2.put("", "");
            }
            this.f8217j = (Map) kVar.mo38453a((Object) f8206l, 10, true);
        } catch (Exception e) {
            e.printStackTrace();
            PrintStream printStream = System.out;
            printStream.println("RequestPacket decode error " + C3349f.m8504a(this.f8214g));
            throw new RuntimeException(e);
        }
    }

    @Override // com.tencent.bugly.proguard.AbstractC3357m
    /* renamed from: a */
    public void mo38328a(StringBuilder sb, int i) {
        C3352i iVar = new C3352i(sb, i);
        iVar.mo38437a(this.f8208a, "iVersion");
        iVar.mo38426a(this.f8209b, "cPacketType");
        iVar.mo38430a(this.f8210c, "iMessageType");
        iVar.mo38430a(this.f8211d, "iRequestId");
        iVar.mo38434a(this.f8212e, "sServantName");
        iVar.mo38434a(this.f8213f, "sFuncName");
        iVar.mo38439a(this.f8214g, "sBuffer");
        iVar.mo38430a(this.f8215h, "iTimeout");
        iVar.mo38436a((Map) this.f8216i, C3416b.f8433Q);
        iVar.mo38436a((Map) this.f8217j, "status");
    }
}

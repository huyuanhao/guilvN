package com.tencent.bugly.proguard;

import com.p118pd.sdk.C9058ooOoOoOO;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.tencent.bugly.proguard.e */
public class C3348e extends C3347d {

    /* renamed from: h */
    public static HashMap<String, byte[]> f8199h;

    /* renamed from: i */
    public static HashMap<String, HashMap<String, byte[]>> f8200i;

    /* renamed from: g */
    public C3350g f8201g;

    /* renamed from: j */
    public int f8202j = 0;

    public C3348e() {
        C3350g gVar = new C3350g();
        this.f8201g = gVar;
        gVar.f8208a = 2;
    }

    @Override // com.tencent.bugly.proguard.C3346c, com.tencent.bugly.proguard.C3347d
    /* renamed from: a */
    public <T> void mo38414a(String str, T t) {
        if (!str.startsWith(C9058ooOoOoOO.OooOO0)) {
            super.mo38414a(str, t);
            return;
        }
        throw new IllegalArgumentException("put name can not startwith . , now is " + str);
    }

    @Override // com.tencent.bugly.proguard.C3347d
    /* renamed from: b */
    public void mo38418b() {
        super.mo38418b();
        this.f8201g.f8208a = 3;
    }

    /* renamed from: c */
    public void mo38423c(String str) {
        this.f8201g.f8213f = str;
    }

    /* renamed from: b */
    public void mo38422b(String str) {
        this.f8201g.f8212e = str;
    }

    @Override // com.tencent.bugly.proguard.C3346c, com.tencent.bugly.proguard.C3347d
    /* renamed from: a */
    public byte[] mo38416a() {
        C3350g gVar = this.f8201g;
        if (gVar.f8208a != 2) {
            if (gVar.f8212e == null) {
                gVar.f8212e = "";
            }
            C3350g gVar2 = this.f8201g;
            if (gVar2.f8213f == null) {
                gVar2.f8213f = "";
            }
        } else if (gVar.f8212e.equals("")) {
            throw new IllegalArgumentException("servantName can not is null");
        } else if (this.f8201g.f8213f.equals("")) {
            throw new IllegalArgumentException("funcName can not is null");
        }
        C3356l lVar = new C3356l(0);
        lVar.mo38471a(this.f8193c);
        if (this.f8201g.f8208a == 2) {
            lVar.mo38483a((Map) this.f8191a, 0);
        } else {
            lVar.mo38483a((Map) ((C3347d) this).f8196e, 0);
        }
        this.f8201g.f8214g = C3358n.m8594a(lVar.mo38472a());
        C3356l lVar2 = new C3356l(0);
        lVar2.mo38471a(this.f8193c);
        mo38421a(lVar2);
        byte[] a = C3358n.m8594a(lVar2.mo38472a());
        int length = a.length + 4;
        ByteBuffer allocate = ByteBuffer.allocate(length);
        allocate.putInt(length).put(a).flip();
        return allocate.array();
    }

    @Override // com.tencent.bugly.proguard.C3346c, com.tencent.bugly.proguard.C3347d
    /* renamed from: a */
    public void mo38415a(byte[] bArr) {
        if (bArr.length >= 4) {
            try {
                C3354k kVar = new C3354k(bArr, 4);
                kVar.mo38450a(this.f8193c);
                mo38420a(kVar);
                if (this.f8201g.f8208a == 3) {
                    C3354k kVar2 = new C3354k(this.f8201g.f8214g);
                    kVar2.mo38450a(this.f8193c);
                    if (f8199h == null) {
                        HashMap<String, byte[]> hashMap = new HashMap<>();
                        f8199h = hashMap;
                        hashMap.put("", new byte[0]);
                    }
                    ((C3347d) this).f8196e = kVar2.mo38455a((Map) f8199h, 0, false);
                    return;
                }
                C3354k kVar3 = new C3354k(this.f8201g.f8214g);
                kVar3.mo38450a(this.f8193c);
                if (f8200i == null) {
                    f8200i = new HashMap<>();
                    HashMap<String, byte[]> hashMap2 = new HashMap<>();
                    hashMap2.put("", new byte[0]);
                    f8200i.put("", hashMap2);
                }
                this.f8191a = kVar3.mo38455a((Map) f8200i, 0, false);
                this.f8192b = new HashMap<>();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        } else {
            throw new IllegalArgumentException("decode package must include size head");
        }
    }

    /* renamed from: a */
    public void mo38419a(int i) {
        this.f8201g.f8211d = i;
    }

    /* renamed from: a */
    public void mo38421a(C3356l lVar) {
        this.f8201g.mo38327a(lVar);
    }

    /* renamed from: a */
    public void mo38420a(C3354k kVar) {
        this.f8201g.mo38326a(kVar);
    }
}

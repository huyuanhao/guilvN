package com.tencent.bugly.proguard;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: com.tencent.bugly.proguard.d */
public class C3347d extends C3346c {

    /* renamed from: e */
    public HashMap<String, byte[]> f8196e = null;

    /* renamed from: f */
    public C3354k f8197f = new C3354k();

    /* renamed from: g */
    public HashMap<String, Object> f8198g = new HashMap<>();

    /* renamed from: c */
    private void m8488c(String str, Object obj) {
        this.f8198g.put(str, obj);
    }

    @Override // com.tencent.bugly.proguard.C3346c
    /* renamed from: a */
    public /* bridge */ /* synthetic */ void mo38413a(String str) {
        super.mo38413a(str);
    }

    /* renamed from: b */
    public void mo38418b() {
        this.f8196e = new HashMap<>();
    }

    @Override // com.tencent.bugly.proguard.C3346c
    /* renamed from: a */
    public <T> void mo38414a(String str, T t) {
        if (this.f8196e == null) {
            super.mo38414a(str, t);
        } else if (str == null) {
            throw new IllegalArgumentException("put key can not is null");
        } else if (t == null) {
            throw new IllegalArgumentException("put value can not is null");
        } else if (!(t instanceof Set)) {
            C3356l lVar = new C3356l();
            lVar.mo38471a(this.f8193c);
            lVar.mo38480a((Object) t, 0);
            this.f8196e.put(str, C3358n.m8594a(lVar.mo38472a()));
        } else {
            throw new IllegalArgumentException("can not support Set");
        }
    }

    /* renamed from: b */
    public <T> T mo38417b(String str, T t) throws C3336b {
        HashMap<String, byte[]> hashMap = this.f8196e;
        if (hashMap != null) {
            if (!hashMap.containsKey(str)) {
                return null;
            }
            if (this.f8198g.containsKey(str)) {
                return (T) this.f8198g.get(str);
            }
            try {
                T t2 = (T) m8487a(this.f8196e.get(str), t);
                if (t2 != null) {
                    m8488c(str, t2);
                }
                return t2;
            } catch (Exception e) {
                throw new C3336b(e);
            }
        } else if (!this.f8191a.containsKey(str)) {
            return null;
        } else {
            if (this.f8198g.containsKey(str)) {
                return (T) this.f8198g.get(str);
            }
            byte[] bArr = new byte[0];
            Iterator<Map.Entry<String, byte[]>> it = this.f8191a.get(str).entrySet().iterator();
            if (it.hasNext()) {
                Map.Entry<String, byte[]> next = it.next();
                next.getKey();
                bArr = next.getValue();
            }
            try {
                this.f8197f.mo38460a(bArr);
                this.f8197f.mo38450a(this.f8193c);
                T t3 = (T) this.f8197f.mo38453a((Object) t, 0, true);
                m8488c(str, t3);
                return t3;
            } catch (Exception e2) {
                throw new C3336b(e2);
            }
        }
    }

    /* renamed from: a */
    private Object m8487a(byte[] bArr, Object obj) {
        this.f8197f.mo38460a(bArr);
        this.f8197f.mo38450a(this.f8193c);
        return this.f8197f.mo38453a(obj, 0, true);
    }

    @Override // com.tencent.bugly.proguard.C3346c
    /* renamed from: a */
    public byte[] mo38416a() {
        if (this.f8196e == null) {
            return super.mo38416a();
        }
        C3356l lVar = new C3356l(0);
        lVar.mo38471a(this.f8193c);
        lVar.mo38483a((Map) this.f8196e, 0);
        return C3358n.m8594a(lVar.mo38472a());
    }

    @Override // com.tencent.bugly.proguard.C3346c
    /* renamed from: a */
    public void mo38415a(byte[] bArr) {
        try {
            super.mo38415a(bArr);
        } catch (Exception unused) {
            this.f8197f.mo38460a(bArr);
            this.f8197f.mo38450a(this.f8193c);
            HashMap hashMap = new HashMap(1);
            hashMap.put("", new byte[0]);
            this.f8196e = this.f8197f.mo38455a((Map) hashMap, 0, false);
        }
    }
}

package com.tencent.bugly.proguard;

import com.p118pd.sdk.C8932ooOOO0o;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: com.tencent.bugly.proguard.c */
public class C3346c {

    /* renamed from: a */
    public HashMap<String, HashMap<String, byte[]>> f8191a = new HashMap<>();

    /* renamed from: b */
    public HashMap<String, Object> f8192b = new HashMap<>();

    /* renamed from: c */
    public String f8193c = "GBK";

    /* renamed from: d */
    public C3354k f8194d = new C3354k();

    /* renamed from: e */
    public HashMap<String, Object> f8195e = new HashMap<>();

    /* renamed from: a */
    public void mo38413a(String str) {
        this.f8193c = str;
    }

    /* renamed from: a */
    public <T> void mo38414a(String str, T t) {
        if (str == null) {
            throw new IllegalArgumentException("put key can not is null");
        } else if (t == null) {
            throw new IllegalArgumentException("put value can not is null");
        } else if (!(t instanceof Set)) {
            C3356l lVar = new C3356l();
            lVar.mo38471a(this.f8193c);
            lVar.mo38480a((Object) t, 0);
            byte[] a = C3358n.m8594a(lVar.mo38472a());
            HashMap<String, byte[]> hashMap = new HashMap<>(1);
            ArrayList<String> arrayList = new ArrayList<>(1);
            m8482a(arrayList, t);
            hashMap.put(C3300a.m8224a(arrayList), a);
            this.f8195e.remove(str);
            this.f8191a.put(str, hashMap);
        } else {
            throw new IllegalArgumentException("can not support Set");
        }
    }

    /* renamed from: a */
    private void m8482a(ArrayList<String> arrayList, Object obj) {
        if (obj.getClass().isArray()) {
            if (!obj.getClass().getComponentType().toString().equals("byte")) {
                throw new IllegalArgumentException("only byte[] is supported");
            } else if (Array.getLength(obj) > 0) {
                arrayList.add("java.util.List");
                m8482a(arrayList, Array.get(obj, 0));
            } else {
                arrayList.add("Array");
                arrayList.add(C8932ooOOO0o.f22176OooO00o);
            }
        } else if (obj instanceof Array) {
            throw new IllegalArgumentException("can not support Array, please use List");
        } else if (obj instanceof List) {
            arrayList.add("java.util.List");
            List list = (List) obj;
            if (list.size() > 0) {
                m8482a(arrayList, list.get(0));
            } else {
                arrayList.add(C8932ooOOO0o.f22176OooO00o);
            }
        } else if (obj instanceof Map) {
            arrayList.add("java.util.Map");
            Map map = (Map) obj;
            if (map.size() > 0) {
                Object next = map.keySet().iterator().next();
                Object obj2 = map.get(next);
                arrayList.add(next.getClass().getName());
                m8482a(arrayList, obj2);
                return;
            }
            arrayList.add(C8932ooOOO0o.f22176OooO00o);
            arrayList.add(C8932ooOOO0o.f22176OooO00o);
        } else {
            arrayList.add(obj.getClass().getName());
        }
    }

    /* renamed from: a */
    public byte[] mo38416a() {
        C3356l lVar = new C3356l(0);
        lVar.mo38471a(this.f8193c);
        lVar.mo38483a((Map) this.f8191a, 0);
        return C3358n.m8594a(lVar.mo38472a());
    }

    /* renamed from: a */
    public void mo38415a(byte[] bArr) {
        this.f8194d.mo38460a(bArr);
        this.f8194d.mo38450a(this.f8193c);
        HashMap hashMap = new HashMap(1);
        HashMap hashMap2 = new HashMap(1);
        hashMap2.put("", new byte[0]);
        hashMap.put("", hashMap2);
        this.f8191a = this.f8194d.mo38455a((Map) hashMap, 0, false);
    }
}

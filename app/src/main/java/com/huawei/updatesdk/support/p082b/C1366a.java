package com.huawei.updatesdk.support.p082b;

import java.io.Serializable;
import java.util.Comparator;

/* renamed from: com.huawei.updatesdk.support.b.a */
public class C1366a implements Serializable, Comparator<C1366a> {

    /* renamed from: a */
    public String f1652a = null;

    /* renamed from: b */
    public long f1653b = 0;

    /* renamed from: c */
    public long f1654c = 0;

    /* renamed from: d */
    public EnumC1367a f1655d = EnumC1367a.SYSTEM_STORAGE;

    /* renamed from: com.huawei.updatesdk.support.b.a$a */
    public enum EnumC1367a {
        SYSTEM_STORAGE,
        INNER_SDCARD,
        EXTERNAL_SDCARD,
        UNKNOWN_TYPE
    }

    /* renamed from: a */
    public int compare(C1366a aVar, C1366a aVar2) {
        long j = aVar.f1653b;
        long j2 = aVar2.f1653b;
        if (j > j2) {
            return 1;
        }
        return j < j2 ? -1 : 0;
    }

    /* renamed from: a */
    public String mo16194a() {
        return this.f1652a;
    }

    /* renamed from: a */
    public void mo16195a(long j) {
        this.f1654c = j;
    }

    /* renamed from: a */
    public void mo16196a(EnumC1367a aVar) {
        this.f1655d = aVar;
    }

    /* renamed from: a */
    public void mo16197a(String str) {
        this.f1652a = str;
    }

    /* renamed from: b */
    public long mo16198b() {
        return this.f1653b;
    }

    /* renamed from: b */
    public void mo16199b(long j) {
        this.f1653b = j;
    }

    public String toString() {
        return "StorageInfo[ storagePath = " + this.f1652a + ", totalSpace = " + this.f1654c + ", freeSpace = " + this.f1653b + ", storageType = " + this.f1655d;
    }
}

package com.megvii.meglive_sdk.volley.toolbox;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

/* renamed from: com.megvii.meglive_sdk.volley.toolbox.b */
public final class C1640b {

    /* renamed from: a */
    public static final Comparator<byte[]> f2925a = new OooO00o();

    /* renamed from: b */
    public final List<byte[]> f2926b = new LinkedList();

    /* renamed from: c */
    public final List<byte[]> f2927c = new ArrayList(64);

    /* renamed from: d */
    public int f2928d = 0;

    /* renamed from: e */
    public final int f2929e = 4096;

    /* renamed from: com.megvii.meglive_sdk.volley.toolbox.b$OooO00o */
    public static class OooO00o implements Comparator<byte[]> {
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // java.util.Comparator
        public final /* bridge */ /* synthetic */ int compare(byte[] bArr, byte[] bArr2) {
            return bArr.length - bArr2.length;
        }
    }

    /* renamed from: a */
    public final synchronized byte[] mo17368a(int i) {
        for (int i2 = 0; i2 < this.f2927c.size(); i2++) {
            byte[] bArr = this.f2927c.get(i2);
            if (bArr.length >= i) {
                this.f2928d -= bArr.length;
                this.f2927c.remove(i2);
                this.f2926b.remove(bArr);
                return bArr;
            }
        }
        return new byte[i];
    }

    /* renamed from: a */
    public final synchronized void mo17367a(byte[] bArr) {
        if (bArr != null) {
            if (bArr.length <= this.f2929e) {
                this.f2926b.add(bArr);
                int binarySearch = Collections.binarySearch(this.f2927c, bArr, f2925a);
                if (binarySearch < 0) {
                    binarySearch = (-binarySearch) - 1;
                }
                this.f2927c.add(binarySearch, bArr);
                this.f2928d += bArr.length;
                m2828a();
            }
        }
    }

    /* renamed from: a */
    private synchronized void m2828a() {
        while (this.f2928d > this.f2929e) {
            byte[] remove = this.f2926b.remove(0);
            this.f2927c.remove(remove);
            this.f2928d -= remove.length;
        }
    }
}

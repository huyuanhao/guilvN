package com.p118pd.sdk;

import com.rxhui.rxcache.CacheTarget;
import java.lang.reflect.Type;

/* renamed from: com.pd.sdk.ooOoO0O0  reason: case insensitive filesystem */
public class C9033ooOoO0O0 extends AbstractC9028ooOoO0 {
    public static C9033ooOoO0O0 OooO00o = new C9033ooOoO0O0();

    /* renamed from: com.pd.sdk.ooOoO0O0$OooO00o */
    public class OooO00o implements AbstractC9847l1<C9031ooOoO00O<T>, Boolean> {
        public OooO00o() {
        }

        /* renamed from: OooO00o */
        public Boolean call(C9031ooOoO00O<T> ooooo00o) {
            return Boolean.valueOf((ooooo00o == null || ooooo00o.m20688OooO00o() == null) ? false : true);
        }
    }

    @Override // com.p118pd.sdk.AbstractC9034ooOoO0OO, com.p118pd.sdk.AbstractC9028ooOoO0
    public <T> C9349III<C9031ooOoO00O<T>> OooO00o(C9021ooOo0oOO oooo0ooo, String str, C9349III<T> r4, Type type) {
        return C9349III.OooO0O0((C9349III) OooO00o(oooo0ooo, str, type), (C9349III) OooO00o(oooo0ooo, str, r4, CacheTarget.MemoryAndDisk)).OooOO0O(new OooO00o());
    }
}

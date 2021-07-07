package com.p118pd.sdk;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.pd.sdk.丨liIIL  reason: invalid class name and case insensitive filesystem */
public class C9702liIIL implements Illiiil {
    public static final Illiiil OooO00o = new C9702liIIL();

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final Map f23325OooO00o;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put(new LlLI1(C1L1l.OooO0Oo), I11I.OooO00o(128));
        hashMap.put(AbstractC5711LiLli.OoooOoo, I11I.OooO00o(192));
        hashMap.put(AbstractC5711LiLli.o000oo00, I11I.OooO00o(192));
        hashMap.put(AbstractC5711LiLli.OoooOoo, I11I.OooO00o(192));
        hashMap.put(AbstractC5711LiLli.o000oOoO, I11I.OooO00o(64));
        hashMap.put(AbstractC5711LiLli.OoooO, I11I.OooO00o(64));
        hashMap.put(AbstractC5905LllI.OooOo0, I11I.OooO00o(128));
        hashMap.put(AbstractC5905LllI.OooOoo, I11I.OooO00o(192));
        hashMap.put(AbstractC5905LllI.Oooo0OO, I11I.OooO00o(256));
        hashMap.put(AbstractC5905LllI.OooOoO0, I11I.OooO00o(128));
        hashMap.put(AbstractC5905LllI.Oooo00O, I11I.OooO00o(192));
        hashMap.put(AbstractC5905LllI.Oooo0oo, I11I.OooO00o(256));
        hashMap.put(AbstractC5905LllI.OooOoO, I11I.OooO00o(128));
        hashMap.put(AbstractC5905LllI.Oooo00o, I11I.OooO00o(192));
        hashMap.put(AbstractC5905LllI.Oooo, I11I.OooO00o(256));
        hashMap.put(AbstractC5905LllI.OooOo, I11I.OooO00o(128));
        hashMap.put(AbstractC5905LllI.Oooo000, I11I.OooO00o(192));
        hashMap.put(AbstractC5905LllI.Oooo0oO, I11I.OooO00o(256));
        hashMap.put(lILIiLL.OooO00o, I11I.OooO00o(128));
        hashMap.put(lILIiLL.OooO0O0, I11I.OooO00o(192));
        hashMap.put(lILIiLL.OooO0OO, I11I.OooO00o(256));
        hashMap.put(lILIiLL.OooO0Oo, I11I.OooO00o(128));
        hashMap.put(lILIiLL.OooO0o0, I11I.OooO00o(192));
        hashMap.put(lILIiLL.OooO0o, I11I.OooO00o(256));
        hashMap.put(ll1IL1.OooO00o, I11I.OooO00o(128));
        hashMap.put(AbstractC9733l.OooO0o0, I11I.OooO00o(64));
        hashMap.put(AbstractC5331ILi.OooO0o, I11I.OooO00o(256));
        f23325OooO00o = Collections.unmodifiableMap(hashMap);
    }

    @Override // com.p118pd.sdk.Illiiil
    public int OooO00o(LlLI1 llLI1) {
        Integer num = (Integer) f23325OooO00o.get(llLI1);
        if (num != null) {
            return num.intValue();
        }
        return -1;
    }

    @Override // com.p118pd.sdk.Illiiil
    public int OooO00o(C6456l1ilL r1) {
        int OooO00o2 = OooO00o(r1.OooO00o());
        if (OooO00o2 > 0) {
            return OooO00o2;
        }
        return -1;
    }
}

package com.p118pd.sdk;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.bouncycastle.cert.dane.DANEException;

/* renamed from: com.pd.sdk.iIIIiLi */
public class iIIIiLi {
    public final LL11Lill OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final C9838iii f17479OooO00o;

    public iIIIiLi(LL11Lill lL11Lill, I111LIL r2) {
        this.OooO00o = lL11Lill;
        this.f17479OooO00o = new C9838iii(r2);
    }

    public List OooO00o(String str) throws DANEException {
        LiIi1LIl OooO00o2 = this.f17479OooO00o.OooO00o(str);
        List<C9469L11iL> OooO00o3 = this.OooO00o.OooO00o(OooO00o2.OooO0O0()).OooO00o();
        ArrayList arrayList = new ArrayList(OooO00o3.size());
        for (C9469L11iL r2 : OooO00o3) {
            if (OooO00o2.OooO00o(r2)) {
                arrayList.add(r2.m21520OooO00o());
            }
        }
        return Collections.unmodifiableList(arrayList);
    }
}

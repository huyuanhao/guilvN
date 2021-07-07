package com.p118pd.sdk;

import com.drew.lang.annotations.NotNull;
import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: com.pd.sdk.oOO0OO  reason: case insensitive filesystem */
public class C8038oOO0OO extends C7929oO0o0OoO<oOO0OOOO> {
    public C8038oOO0OO(@NotNull oOO0OOOO ooo0oooo) {
        super(ooo0oooo);
    }

    private String OooO00o() {
        String[] OooO00o = ((oOO0OOOO) this.f20998OooO00o).m19655OooO00o(4098);
        if (OooO00o == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : OooO00o) {
            String OooO00o2 = oOO0OOO.OooO00o(4096, str);
            if (OooO00o2 != null) {
                str = OooO00o2;
            }
            arrayList.add(str);
        }
        return Arrays.toString(arrayList.toArray());
    }

    private String OooO0O0() {
        Long OooO00o = ((oOO0OOOO) this.f20998OooO00o).m19641OooO00o(259);
        if (OooO00o == null) {
            return null;
        }
        double longValue = (double) OooO00o.longValue();
        double pow = Math.pow(60.0d, 2.0d);
        Double.isNaN(longValue);
        Integer valueOf = Integer.valueOf((int) (longValue / pow));
        double longValue2 = (double) OooO00o.longValue();
        double pow2 = Math.pow(60.0d, 1.0d);
        Double.isNaN(longValue2);
        double d = longValue2 / pow2;
        double intValue = (double) (valueOf.intValue() * 60);
        Double.isNaN(intValue);
        Integer valueOf2 = Integer.valueOf((int) (d - intValue));
        double longValue3 = (double) OooO00o.longValue();
        double pow3 = Math.pow(60.0d, AbstractC8352oOoOOoO0.OooO0O0);
        Double.isNaN(longValue3);
        double d2 = longValue3 / pow3;
        double intValue2 = (double) (valueOf2.intValue() * 60);
        Double.isNaN(intValue2);
        return String.format("%1$02d:%2$02d:%3$02d", valueOf, valueOf2, Integer.valueOf((int) Math.ceil(d2 - intValue2)));
    }

    @Override // com.p118pd.sdk.C7929oO0o0OoO
    public String OooO0OO(int i) {
        if (i == 259) {
            return OooO0O0();
        }
        if (i == 4096) {
            return OooO0OO();
        }
        if (i != 4098) {
            return super.OooO0OO(i);
        }
        return OooO00o();
    }

    private String OooO0OO() {
        byte[] OooO00o = ((oOO0OOOO) this.f20998OooO00o).m19651OooO00o(4096);
        if (OooO00o == null) {
            return null;
        }
        return oOO0OOO.OooO00o(4096, new String(OooO00o));
    }
}

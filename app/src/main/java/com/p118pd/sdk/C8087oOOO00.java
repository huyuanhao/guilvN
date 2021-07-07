package com.p118pd.sdk;

import com.drew.lang.annotations.NotNull;
import com.p118pd.sdk.AbstractC7922oO0o0O0O;
import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: com.pd.sdk.oOOO00  reason: case insensitive filesystem */
public class C8087oOOO00<T extends AbstractC7922oO0o0O0O> extends C7929oO0o0OoO<C8091oOOO00Oo> {
    public C8087oOOO00(@NotNull C8091oOOO00Oo oooo00oo) {
        super(oooo00oo);
    }

    private String OooO00o() {
        String[] OooO00o = ((C8091oOOO00Oo) this.f20998OooO00o).m19655OooO00o(3);
        if (OooO00o == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : OooO00o) {
            String OooO00o2 = C8090oOOO00O.OooO00o(1, str);
            if (OooO00o2 != null) {
                str = OooO00o2;
            }
            arrayList.add(str);
        }
        return Arrays.toString(arrayList.toArray());
    }

    private String OooO0O0() {
        Long OooO00o = ((C8091oOOO00Oo) this.f20998OooO00o).m19641OooO00o(259);
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
        if (i == 1) {
            return OooO0OO();
        }
        if (i == 3) {
            return OooO00o();
        }
        if (i != 259) {
            return ((C8091oOOO00Oo) this.f20998OooO00o).OooO0O0(i);
        }
        return OooO0O0();
    }

    private String OooO0OO() {
        byte[] OooO00o = ((C8091oOOO00Oo) this.f20998OooO00o).m19651OooO00o(1);
        if (OooO00o == null) {
            return null;
        }
        return C8090oOOO00O.OooO00o(1, new String(OooO00o));
    }
}

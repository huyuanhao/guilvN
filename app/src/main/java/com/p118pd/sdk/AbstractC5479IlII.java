package com.p118pd.sdk;

import java.io.IOException;
import java.util.Enumeration;
import java.util.Hashtable;
import org.bouncycastle.asn1.ASN1ParsingException;

/* renamed from: com.pd.sdk.Il丨II  reason: invalid class name and case insensitive filesystem */
public abstract class AbstractC5479IlII implements AbstractC5662LLi {
    private int OooO00o(AbstractC6854lLi1LL r1) {
        return C9581iI.m21622OooO00o(C9581iI.OooO00o(r1)).hashCode();
    }

    public static Hashtable OooO00o(Hashtable hashtable) {
        Hashtable hashtable2 = new Hashtable();
        Enumeration keys = hashtable.keys();
        while (keys.hasMoreElements()) {
            Object nextElement = keys.nextElement();
            hashtable2.put(nextElement, hashtable.get(nextElement));
        }
        return hashtable2;
    }

    private boolean OooO00o(boolean z, LILlIL lILlIL, LILlIL[] lILlILArr) {
        if (z) {
            for (int length = lILlILArr.length - 1; length >= 0; length--) {
                if (lILlILArr[length] != null && OooO00o(lILlIL, lILlILArr[length])) {
                    lILlILArr[length] = null;
                    return true;
                }
            }
        } else {
            for (int i = 0; i != lILlILArr.length; i++) {
                if (lILlILArr[i] != null && OooO00o(lILlIL, lILlILArr[i])) {
                    lILlILArr[i] = null;
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.p118pd.sdk.AbstractC5662LLi, com.p118pd.sdk.AbstractC5662LLi
    public int OooO00o(l1LILI1 r7) {
        LILlIL[] OooO00o = r7.m17571OooO00o();
        int i = 0;
        for (int i2 = 0; i2 != OooO00o.length; i2++) {
            if (OooO00o[i2].m16060OooO00o()) {
                C5605L1ll[] OooO00o2 = OooO00o[i2].m16061OooO00o();
                for (int i3 = 0; i3 != OooO00o2.length; i3++) {
                    i = (i ^ OooO00o2[i3].OooO00o().hashCode()) ^ OooO00o(OooO00o2[i3].m16007OooO0O0());
                }
            } else {
                i = (i ^ OooO00o[i2].OooO00o().OooO00o().hashCode()) ^ OooO00o(OooO00o[i2].OooO00o().m16007OooO0O0());
            }
        }
        return i;
    }

    @Override // com.p118pd.sdk.AbstractC5662LLi
    public AbstractC6854lLi1LL OooO00o(LlLI1 llLI1, String str) {
        if (str.length() == 0 || str.charAt(0) != '#') {
            if (str.length() != 0 && str.charAt(0) == '\\') {
                str = str.substring(1);
            }
            return OooO0O0(llLI1, str);
        }
        try {
            return C9581iI.OooO00o(str, 1);
        } catch (IOException unused) {
            throw new ASN1ParsingException("can't recode value for oid " + llLI1.m16387OooO0O0());
        }
    }

    public boolean OooO00o(LILlIL lILlIL, LILlIL lILlIL2) {
        return C9581iI.OooO00o(lILlIL, lILlIL2);
    }

    @Override // com.p118pd.sdk.AbstractC5662LLi
    public boolean OooO00o(l1LILI1 r6, l1LILI1 r7) {
        LILlIL[] OooO00o = r6.m17571OooO00o();
        LILlIL[] OooO00o2 = r7.m17571OooO00o();
        if (OooO00o.length != OooO00o2.length) {
            return false;
        }
        boolean z = (OooO00o[0].OooO00o() == null || OooO00o2[0].OooO00o() == null) ? false : !OooO00o[0].OooO00o().OooO00o().equals(OooO00o2[0].OooO00o().OooO00o());
        for (int i = 0; i != OooO00o.length; i++) {
            if (!OooO00o(z, OooO00o[i], OooO00o2)) {
                return false;
            }
        }
        return true;
    }

    public AbstractC6854lLi1LL OooO0O0(LlLI1 llLI1, String str) {
        return new LII(str);
    }
}

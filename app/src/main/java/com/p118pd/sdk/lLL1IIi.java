package com.p118pd.sdk;

import com.xiaomi.mipush.sdk.Constants;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.pd.sdk.lLL1丨IIi  reason: invalid class name */
public final class lLL1IIi implements AbstractC9486LL1iI1L {
    public static final Map<String, lLL1IIi> OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final int f18500OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final String f18501OooO00o;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put(m17684OooO00o(LL1i.OooO0Oo, 32, 16, 67, 20, 2), new lLL1IIi(16777217, "XMSSMT_SHA2-256_W16_H20_D2"));
        hashMap.put(m17684OooO00o(LL1i.OooO0Oo, 32, 16, 67, 20, 4), new lLL1IIi(16777217, "XMSSMT_SHA2-256_W16_H20_D4"));
        hashMap.put(m17684OooO00o(LL1i.OooO0Oo, 32, 16, 67, 40, 2), new lLL1IIi(16777217, "XMSSMT_SHA2-256_W16_H40_D2"));
        hashMap.put(m17684OooO00o(LL1i.OooO0Oo, 32, 16, 67, 40, 2), new lLL1IIi(16777217, "XMSSMT_SHA2-256_W16_H40_D4"));
        hashMap.put(m17684OooO00o(LL1i.OooO0Oo, 32, 16, 67, 40, 4), new lLL1IIi(16777217, "XMSSMT_SHA2-256_W16_H40_D8"));
        hashMap.put(m17684OooO00o(LL1i.OooO0Oo, 32, 16, 67, 60, 8), new lLL1IIi(16777217, "XMSSMT_SHA2-256_W16_H60_D3"));
        hashMap.put(m17684OooO00o(LL1i.OooO0Oo, 32, 16, 67, 60, 6), new lLL1IIi(16777217, "XMSSMT_SHA2-256_W16_H60_D6"));
        hashMap.put(m17684OooO00o(LL1i.OooO0Oo, 32, 16, 67, 60, 12), new lLL1IIi(16777217, "XMSSMT_SHA2-256_W16_H60_D12"));
        hashMap.put(m17684OooO00o("SHA2-512", 64, 16, 131, 20, 2), new lLL1IIi(16777217, "XMSSMT_SHA2-512_W16_H20_D2"));
        hashMap.put(m17684OooO00o("SHA2-512", 64, 16, 131, 20, 4), new lLL1IIi(16777217, "XMSSMT_SHA2-512_W16_H20_D4"));
        hashMap.put(m17684OooO00o("SHA2-512", 64, 16, 131, 40, 2), new lLL1IIi(16777217, "XMSSMT_SHA2-512_W16_H40_D2"));
        hashMap.put(m17684OooO00o("SHA2-512", 64, 16, 131, 40, 4), new lLL1IIi(16777217, "XMSSMT_SHA2-512_W16_H40_D4"));
        hashMap.put(m17684OooO00o("SHA2-512", 64, 16, 131, 40, 8), new lLL1IIi(16777217, "XMSSMT_SHA2-512_W16_H40_D8"));
        hashMap.put(m17684OooO00o("SHA2-512", 64, 16, 131, 60, 3), new lLL1IIi(16777217, "XMSSMT_SHA2-512_W16_H60_D3"));
        hashMap.put(m17684OooO00o("SHA2-512", 64, 16, 131, 60, 6), new lLL1IIi(16777217, "XMSSMT_SHA2-512_W16_H60_D6"));
        hashMap.put(m17684OooO00o("SHA2-512", 64, 16, 131, 60, 12), new lLL1IIi(16777217, "XMSSMT_SHA2-512_W16_H60_D12"));
        hashMap.put(m17684OooO00o("SHAKE128", 32, 16, 67, 20, 2), new lLL1IIi(16777217, "XMSSMT_SHAKE128_W16_H20_D2"));
        hashMap.put(m17684OooO00o("SHAKE128", 32, 16, 67, 20, 4), new lLL1IIi(16777217, "XMSSMT_SHAKE128_W16_H20_D4"));
        hashMap.put(m17684OooO00o("SHAKE128", 32, 16, 67, 40, 2), new lLL1IIi(16777217, "XMSSMT_SHAKE128_W16_H40_D2"));
        hashMap.put(m17684OooO00o("SHAKE128", 32, 16, 67, 40, 4), new lLL1IIi(16777217, "XMSSMT_SHAKE128_W16_H40_D4"));
        hashMap.put(m17684OooO00o("SHAKE128", 32, 16, 67, 40, 8), new lLL1IIi(16777217, "XMSSMT_SHAKE128_W16_H40_D8"));
        hashMap.put(m17684OooO00o("SHAKE128", 32, 16, 67, 60, 3), new lLL1IIi(16777217, "XMSSMT_SHAKE128_W16_H60_D3"));
        hashMap.put(m17684OooO00o("SHAKE128", 32, 16, 67, 60, 6), new lLL1IIi(16777217, "XMSSMT_SHAKE128_W16_H60_D6"));
        hashMap.put(m17684OooO00o("SHAKE128", 32, 16, 67, 60, 12), new lLL1IIi(16777217, "XMSSMT_SHAKE128_W16_H60_D12"));
        hashMap.put(m17684OooO00o("SHAKE256", 64, 16, 131, 20, 2), new lLL1IIi(16777217, "XMSSMT_SHAKE256_W16_H20_D2"));
        hashMap.put(m17684OooO00o("SHAKE256", 64, 16, 131, 20, 4), new lLL1IIi(16777217, "XMSSMT_SHAKE256_W16_H20_D4"));
        hashMap.put(m17684OooO00o("SHAKE256", 64, 16, 131, 40, 2), new lLL1IIi(16777217, "XMSSMT_SHAKE256_W16_H40_D2"));
        hashMap.put(m17684OooO00o("SHAKE256", 64, 16, 131, 40, 4), new lLL1IIi(16777217, "XMSSMT_SHAKE256_W16_H40_D4"));
        hashMap.put(m17684OooO00o("SHAKE256", 64, 16, 131, 40, 8), new lLL1IIi(16777217, "XMSSMT_SHAKE256_W16_H40_D8"));
        hashMap.put(m17684OooO00o("SHAKE256", 64, 16, 131, 60, 3), new lLL1IIi(16777217, "XMSSMT_SHAKE256_W16_H60_D3"));
        hashMap.put(m17684OooO00o("SHAKE256", 64, 16, 131, 60, 6), new lLL1IIi(16777217, "XMSSMT_SHAKE256_W16_H60_D6"));
        hashMap.put(m17684OooO00o("SHAKE256", 64, 16, 131, 60, 12), new lLL1IIi(16777217, "XMSSMT_SHAKE256_W16_H60_D12"));
        OooO00o = Collections.unmodifiableMap(hashMap);
    }

    public lLL1IIi(int i, String str) {
        this.f18500OooO00o = i;
        this.f18501OooO00o = str;
    }

    public static lLL1IIi OooO00o(String str, int i, int i2, int i3, int i4, int i5) {
        if (str != null) {
            return OooO00o.get(m17684OooO00o(str, i, i2, i3, i4, i5));
        }
        throw new NullPointerException("algorithmName == null");
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static String m17684OooO00o(String str, int i, int i2, int i3, int i4, int i5) {
        if (str != null) {
            return str + Constants.ACCEPT_TIME_SEPARATOR_SERVER + i + Constants.ACCEPT_TIME_SEPARATOR_SERVER + i2 + Constants.ACCEPT_TIME_SEPARATOR_SERVER + i3 + Constants.ACCEPT_TIME_SEPARATOR_SERVER + i4 + Constants.ACCEPT_TIME_SEPARATOR_SERVER + i5;
        }
        throw new NullPointerException("algorithmName == null");
    }

    @Override // com.p118pd.sdk.AbstractC9486LL1iI1L
    public int OooO00o() {
        return this.f18500OooO00o;
    }

    @Override // com.p118pd.sdk.AbstractC9486LL1iI1L
    public String toString() {
        return this.f18501OooO00o;
    }
}

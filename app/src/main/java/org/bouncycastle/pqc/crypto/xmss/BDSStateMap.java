package org.bouncycastle.pqc.crypto.xmss;

import com.p118pd.sdk.C5532IiIllL;
import com.p118pd.sdk.C6454l1ii;
import com.p118pd.sdk.C9341I1iilI1;
import com.p118pd.sdk.I11I;
import com.p118pd.sdk.iL1iI1L;
import java.io.Serializable;
import java.util.Map;
import java.util.TreeMap;

public class BDSStateMap implements Serializable {
    public final Map<Integer, BDS> bdsState = new TreeMap();

    public BDSStateMap() {
    }

    public BDSStateMap(C6454l1ii l1ii, long j, byte[] bArr, byte[] bArr2) {
        for (long j2 = 0; j2 < j; j2++) {
            OooO00o(l1ii, j2, bArr, bArr2);
        }
    }

    public BDSStateMap(BDSStateMap bDSStateMap, C6454l1ii l1ii, long j, byte[] bArr, byte[] bArr2) {
        for (Integer num : bDSStateMap.bdsState.keySet()) {
            this.bdsState.put(num, bDSStateMap.bdsState.get(num));
        }
        OooO00o(l1ii, j, bArr, bArr2);
    }

    private void OooO00o(C6454l1ii l1ii, long j, byte[] bArr, byte[] bArr2) {
        C9341I1iilI1 OooO00o = l1ii.m17580OooO00o();
        int OooO0O0 = OooO00o.OooO0O0();
        long OooO00o2 = C5532IiIllL.m15804OooO00o(j, OooO0O0);
        int OooO00o3 = C5532IiIllL.OooO00o(j, OooO0O0);
        iL1iI1L il1ii1l = (iL1iI1L) ((iL1iI1L.OooO0O0) new iL1iI1L.OooO0O0().OooO00o(OooO00o2)).OooO0OO(OooO00o3).OooO00o();
        int i = (1 << OooO0O0) - 1;
        if (OooO00o3 < i) {
            if (get(0) == null || OooO00o3 == 0) {
                put(0, new BDS(OooO00o, bArr, bArr2, il1ii1l));
            }
            update(0, bArr, bArr2, il1ii1l);
        }
        for (int i2 = 1; i2 < l1ii.OooO0OO(); i2++) {
            int OooO00o4 = C5532IiIllL.OooO00o(OooO00o2, OooO0O0);
            OooO00o2 = C5532IiIllL.m15804OooO00o(OooO00o2, OooO0O0);
            iL1iI1L il1ii1l2 = (iL1iI1L) ((iL1iI1L.OooO0O0) ((iL1iI1L.OooO0O0) new iL1iI1L.OooO0O0().OooO0O0(i2)).OooO00o(OooO00o2)).OooO0OO(OooO00o4).OooO00o();
            if (OooO00o4 < i && C5532IiIllL.OooO00o(j, OooO0O0, i2)) {
                if (get(i2) == null) {
                    put(i2, new BDS(l1ii.m17580OooO00o(), bArr, bArr2, il1ii1l2));
                }
                update(i2, bArr, bArr2, il1ii1l2);
            }
        }
    }

    public BDS get(int i) {
        return this.bdsState.get(I11I.OooO00o(i));
    }

    public boolean isEmpty() {
        return this.bdsState.isEmpty();
    }

    public void put(int i, BDS bds) {
        this.bdsState.put(I11I.OooO00o(i), bds);
    }

    public void setXMSS(C9341I1iilI1 r4) {
        for (Integer num : this.bdsState.keySet()) {
            BDS bds = this.bdsState.get(num);
            bds.setXMSS(r4);
            bds.validate();
        }
    }

    public BDS update(int i, byte[] bArr, byte[] bArr2, iL1iI1L il1ii1l) {
        return this.bdsState.put(I11I.OooO00o(i), this.bdsState.get(I11I.OooO00o(i)).getNextState(bArr, bArr2, il1ii1l));
    }
}

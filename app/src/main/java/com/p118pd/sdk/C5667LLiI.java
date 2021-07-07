package com.p118pd.sdk;

import com.p118pd.sdk.C9694lL1;
import com.p118pd.sdk.I1111L;
import org.bouncycastle.pqc.crypto.xmss.XMSSNode;

/* renamed from: com.pd.sdk.LLi丨I  reason: invalid class name and case insensitive filesystem */
public class C5667LLiI {
    public static XMSSNode OooO00o(C5558Il1l r9, int i, byte[] bArr, C6190iLlIl illil, iL1iI1L il1ii1l, int i2) {
        I1111L.OooO0O0 oooO0O0;
        if (bArr.length != r9.m15837OooO00o().OooO00o()) {
            throw new IllegalArgumentException("size of messageDigest needs to be equal to size of digest");
        } else if (illil == null) {
            throw new NullPointerException("signature == null");
        } else if (il1ii1l != null) {
            I1111L r1 = (I1111L) ((I1111L.OooO0O0) ((I1111L.OooO0O0) new I1111L.OooO0O0().OooO0O0(il1ii1l.OooO0O0())).OooO00o(il1ii1l.m15365OooO00o())).OooO0O0(il1ii1l.OooO0o()).m15212OooO00o();
            XMSSNode[] xMSSNodeArr = new XMSSNode[2];
            xMSSNodeArr[0] = LIii1i1.OooO00o(r9, r9.OooO00o(bArr, illil.OooO00o(), il1ii1l), (C9694lL1) ((C9694lL1.OooO0O0) ((C9694lL1.OooO0O0) new C9694lL1.OooO0O0().OooO0O0(il1ii1l.OooO0O0())).OooO00o(il1ii1l.m15365OooO00o())).OooO00o(il1ii1l.OooO0o()).OooO00o());
            for (int i3 = 0; i3 < i; i3++) {
                I1111L r12 = (I1111L) ((I1111L.OooO0O0) ((I1111L.OooO0O0) ((I1111L.OooO0O0) new I1111L.OooO0O0().OooO0O0(r1.OooO0O0())).OooO00o(r1.m15365OooO00o())).OooO00o(i3).OooO0O0(r1.OooO0o()).OooO00o(r1.OooO00o())).m15212OooO00o();
                if (Math.floor((double) (i2 / (1 << i3))) % 2.0d == AbstractC8352oOoOOoO0.OooO0O0) {
                    r1 = (I1111L) ((I1111L.OooO0O0) ((I1111L.OooO0O0) ((I1111L.OooO0O0) oooO0O0.OooO0O0(r12.OooO0O0())).OooO00o(r12.m15365OooO00o())).OooO00o(r12.OooO0o0()).OooO0O0(r12.OooO0o() / 2).OooO00o(r12.OooO00o())).m15212OooO00o();
                    xMSSNodeArr[1] = LIii1i1.OooO00o(r9, xMSSNodeArr[0], illil.m17158OooO00o().get(i3), r1);
                    xMSSNodeArr[1] = new XMSSNode(xMSSNodeArr[1].getHeight() + 1, xMSSNodeArr[1].getValue());
                } else {
                    oooO0O0 = new I1111L.OooO0O0();
                    r1 = (I1111L) ((I1111L.OooO0O0) ((I1111L.OooO0O0) ((I1111L.OooO0O0) oooO0O0.OooO0O0(r12.OooO0O0())).OooO00o(r12.m15365OooO00o())).OooO00o(r12.OooO0o0()).OooO0O0((r12.OooO0o() - 1) / 2).OooO00o(r12.OooO00o())).m15212OooO00o();
                    xMSSNodeArr[1] = LIii1i1.OooO00o(r9, illil.m17158OooO00o().get(i3), xMSSNodeArr[0], r1);
                    xMSSNodeArr[1] = new XMSSNode(xMSSNodeArr[1].getHeight() + 1, xMSSNodeArr[1].getValue());
                }
                xMSSNodeArr[0] = xMSSNodeArr[1];
            }
            return xMSSNodeArr[0];
        } else {
            throw new NullPointerException("otsHashAddress == null");
        }
    }
}

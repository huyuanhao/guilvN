package com.p118pd.sdk;

import com.p118pd.sdk.C9694lL1;
import com.p118pd.sdk.I1111L;
import com.p118pd.sdk.III1lIi;
import org.bouncycastle.pqc.crypto.xmss.XMSSNode;

/* renamed from: com.pd.sdk.LIii1丨i1  reason: invalid class name */
public class LIii1i1 {
    public static XMSSNode OooO00o(C5558Il1l r8, C6880lli r9, C9694lL1 r10) {
        double d;
        if (r9 == null) {
            throw new NullPointerException("publicKey == null");
        } else if (r10 != null) {
            int OooO0O0 = r8.m15837OooO00o().OooO0O0();
            byte[][] OooO00o = r9.OooO00o();
            XMSSNode[] xMSSNodeArr = new XMSSNode[OooO00o.length];
            for (int i = 0; i < OooO00o.length; i++) {
                xMSSNodeArr[i] = new XMSSNode(0, OooO00o[i]);
            }
            III1lIi.OooO00o OooO00o2 = ((C9694lL1.OooO0O0) ((C9694lL1.OooO0O0) new C9694lL1.OooO0O0().OooO0O0(r10.OooO0O0())).OooO00o(r10.m15365OooO00o())).OooO00o(r10.OooO0Oo()).OooO0O0(0).OooO0OO(r10.OooO0o()).OooO00o(r10.OooO00o());
            while (true) {
                C9694lL1 r92 = (C9694lL1) ((C9694lL1.OooO0O0) OooO00o2).OooO00o();
                if (OooO0O0 <= 1) {
                    return xMSSNodeArr[0];
                }
                int i2 = 0;
                while (true) {
                    d = (double) (OooO0O0 / 2);
                    if (i2 >= ((int) Math.floor(d))) {
                        break;
                    }
                    r92 = (C9694lL1) ((C9694lL1.OooO0O0) ((C9694lL1.OooO0O0) ((C9694lL1.OooO0O0) new C9694lL1.OooO0O0().OooO0O0(r92.OooO0O0())).OooO00o(r92.m15365OooO00o())).OooO00o(r92.OooO0Oo()).OooO0O0(r92.OooO0o0()).OooO0OO(i2).OooO00o(r92.OooO00o())).OooO00o();
                    int i3 = i2 * 2;
                    xMSSNodeArr[i2] = OooO00o(r8, xMSSNodeArr[i3], xMSSNodeArr[i3 + 1], r92);
                    i2++;
                }
                if (OooO0O0 % 2 == 1) {
                    xMSSNodeArr[(int) Math.floor(d)] = xMSSNodeArr[OooO0O0 - 1];
                }
                double d2 = (double) OooO0O0;
                Double.isNaN(d2);
                OooO0O0 = (int) Math.ceil(d2 / 2.0d);
                OooO00o2 = ((C9694lL1.OooO0O0) ((C9694lL1.OooO0O0) new C9694lL1.OooO0O0().OooO0O0(r92.OooO0O0())).OooO00o(r92.m15365OooO00o())).OooO00o(r92.OooO0Oo()).OooO0O0(r92.OooO0o0() + 1).OooO0OO(r92.OooO0o()).OooO00o(r92.OooO00o());
            }
        } else {
            throw new NullPointerException("address == null");
        }
    }

    public static XMSSNode OooO00o(C5558Il1l r8, XMSSNode xMSSNode, XMSSNode xMSSNode2, III1lIi iII1lIi) {
        if (xMSSNode == null) {
            throw new NullPointerException("left == null");
        } else if (xMSSNode2 == null) {
            throw new NullPointerException("right == null");
        } else if (xMSSNode.getHeight() != xMSSNode2.getHeight()) {
            throw new IllegalStateException("height of both nodes must be equal");
        } else if (iII1lIi != null) {
            byte[] OooO00o = r8.m15840OooO00o();
            if (iII1lIi instanceof C9694lL1) {
                C9694lL1 r11 = (C9694lL1) iII1lIi;
                iII1lIi = (C9694lL1) ((C9694lL1.OooO0O0) ((C9694lL1.OooO0O0) ((C9694lL1.OooO0O0) new C9694lL1.OooO0O0().OooO0O0(r11.OooO0O0())).OooO00o(r11.m15365OooO00o())).OooO00o(r11.OooO0Oo()).OooO0O0(r11.OooO0o0()).OooO0OO(r11.OooO0o()).OooO00o(0)).OooO00o();
            } else if (iII1lIi instanceof I1111L) {
                I1111L r112 = (I1111L) iII1lIi;
                iII1lIi = (I1111L) ((I1111L.OooO0O0) ((I1111L.OooO0O0) ((I1111L.OooO0O0) new I1111L.OooO0O0().OooO0O0(r112.OooO0O0())).OooO00o(r112.m15365OooO00o())).OooO00o(r112.OooO0o0()).OooO0O0(r112.OooO0o()).OooO00o(0)).m15212OooO00o();
            }
            byte[] OooO0Oo = r8.OooO00o().OooO0Oo(OooO00o, iII1lIi.m15366OooO00o());
            if (iII1lIi instanceof C9694lL1) {
                C9694lL1 r113 = (C9694lL1) iII1lIi;
                iII1lIi = (C9694lL1) ((C9694lL1.OooO0O0) ((C9694lL1.OooO0O0) ((C9694lL1.OooO0O0) new C9694lL1.OooO0O0().OooO0O0(r113.OooO0O0())).OooO00o(r113.m15365OooO00o())).OooO00o(r113.OooO0Oo()).OooO0O0(r113.OooO0o0()).OooO0OO(r113.OooO0o()).OooO00o(1)).OooO00o();
            } else if (iII1lIi instanceof I1111L) {
                I1111L r114 = (I1111L) iII1lIi;
                iII1lIi = (I1111L) ((I1111L.OooO0O0) ((I1111L.OooO0O0) ((I1111L.OooO0O0) new I1111L.OooO0O0().OooO0O0(r114.OooO0O0())).OooO00o(r114.m15365OooO00o())).OooO00o(r114.OooO0o0()).OooO0O0(r114.OooO0o()).OooO00o(1)).m15212OooO00o();
            }
            byte[] OooO0Oo2 = r8.OooO00o().OooO0Oo(OooO00o, iII1lIi.m15366OooO00o());
            if (iII1lIi instanceof C9694lL1) {
                C9694lL1 r115 = (C9694lL1) iII1lIi;
                iII1lIi = (C9694lL1) ((C9694lL1.OooO0O0) ((C9694lL1.OooO0O0) ((C9694lL1.OooO0O0) new C9694lL1.OooO0O0().OooO0O0(r115.OooO0O0())).OooO00o(r115.m15365OooO00o())).OooO00o(r115.OooO0Oo()).OooO0O0(r115.OooO0o0()).OooO0OO(r115.OooO0o()).OooO00o(2)).OooO00o();
            } else if (iII1lIi instanceof I1111L) {
                I1111L r116 = (I1111L) iII1lIi;
                iII1lIi = (I1111L) ((I1111L.OooO0O0) ((I1111L.OooO0O0) ((I1111L.OooO0O0) new I1111L.OooO0O0().OooO0O0(r116.OooO0O0())).OooO00o(r116.m15365OooO00o())).OooO00o(r116.OooO0o0()).OooO0O0(r116.OooO0o()).OooO00o(2)).m15212OooO00o();
            }
            byte[] OooO0Oo3 = r8.OooO00o().OooO0Oo(OooO00o, iII1lIi.m15366OooO00o());
            int OooO00o2 = r8.m15837OooO00o().OooO00o();
            byte[] bArr = new byte[(OooO00o2 * 2)];
            for (int i = 0; i < OooO00o2; i++) {
                bArr[i] = (byte) (xMSSNode.getValue()[i] ^ OooO0Oo2[i]);
            }
            for (int i2 = 0; i2 < OooO00o2; i2++) {
                bArr[i2 + OooO00o2] = (byte) (xMSSNode2.getValue()[i2] ^ OooO0Oo3[i2]);
            }
            return new XMSSNode(xMSSNode.getHeight(), r8.OooO00o().OooO0O0(OooO0Oo, bArr));
        } else {
            throw new NullPointerException("address == null");
        }
    }
}

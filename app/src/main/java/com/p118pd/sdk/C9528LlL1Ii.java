package com.p118pd.sdk;

import java.util.Vector;

/* renamed from: com.pd.sdk.丨LlL1Ii  reason: invalid class name and case insensitive filesystem */
public class C9528LlL1Ii implements AbstractC9827L {
    public Vector OooO00o;

    private void OooO00o(int i) {
        int size = this.OooO00o.size();
        if (size <= i) {
            long[] jArr = (long[]) this.OooO00o.elementAt(size - 1);
            do {
                jArr = C9586iIILl.m21639OooO00o(jArr);
                liL1I.OooO(jArr, jArr);
                this.OooO00o.addElement(jArr);
                size++;
            } while (size <= i);
        }
    }

    @Override // com.p118pd.sdk.AbstractC9827L
    public void OooO00o(long j, byte[] bArr) {
        long[] OooO00o2 = liL1I.m17814OooO00o();
        int i = 0;
        while (j > 0) {
            if ((1 & j) != 0) {
                OooO00o(i);
                liL1I.OooO0OO(OooO00o2, (long[]) this.OooO00o.elementAt(i));
            }
            i++;
            j >>>= 1;
        }
        liL1I.OooO00o(OooO00o2, bArr);
    }

    @Override // com.p118pd.sdk.AbstractC9827L
    public void OooO00o(byte[] bArr) {
        long[] OooO00o2 = liL1I.m17815OooO00o(bArr);
        Vector vector = this.OooO00o;
        if (vector == null || !C9586iIILl.OooO00o(OooO00o2, (long[]) vector.elementAt(0))) {
            Vector vector2 = new Vector(8);
            this.OooO00o = vector2;
            vector2.addElement(OooO00o2);
        }
    }
}

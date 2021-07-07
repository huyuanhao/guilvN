package com.p118pd.sdk;

import java.util.Vector;

/* renamed from: com.pd.sdk.丨il1丨1丨  reason: invalid class name and case insensitive filesystem */
public class C9626il11 {
    public Vector OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public short f23208OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public byte[] f23209OooO00o;

    /* renamed from: com.pd.sdk.丨il1丨1丨$OooO00o */
    public static class OooO00o {
        public int OooO00o;
        public int OooO0O0;

        public OooO00o(int i, int i2) {
            this.OooO00o = i;
            this.OooO0O0 = i2;
        }

        public int OooO00o() {
            return this.OooO0O0;
        }

        public void OooO00o(int i) {
            this.OooO0O0 = i;
        }

        public int OooO0O0() {
            return this.OooO00o;
        }

        public void OooO0O0(int i) {
            this.OooO00o = i;
        }
    }

    public C9626il11(short s, int i) {
        Vector vector = new Vector();
        this.OooO00o = vector;
        this.f23208OooO00o = s;
        this.f23209OooO00o = new byte[i];
        vector.addElement(new OooO00o(0, i));
    }

    public short OooO00o() {
        return this.f23208OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m21691OooO00o() {
        this.OooO00o.removeAllElements();
        this.OooO00o.addElement(new OooO00o(0, this.f23209OooO00o.length));
    }

    public void OooO00o(short s, int i, byte[] bArr, int i2, int i3, int i4) {
        int i5 = i3 + i4;
        if (this.f23208OooO00o == s && this.f23209OooO00o.length == i && i5 <= i) {
            int i6 = 0;
            if (i4 != 0) {
                while (i6 < this.OooO00o.size()) {
                    OooO00o oooO00o = (OooO00o) this.OooO00o.elementAt(i6);
                    if (oooO00o.OooO0O0() < i5) {
                        if (oooO00o.OooO00o() > i3) {
                            int max = Math.max(oooO00o.OooO0O0(), i3);
                            int min = Math.min(oooO00o.OooO00o(), i5);
                            System.arraycopy(bArr, (i2 + max) - i3, this.f23209OooO00o, max, min - max);
                            if (max != oooO00o.OooO0O0()) {
                                if (min != oooO00o.OooO00o()) {
                                    i6++;
                                    this.OooO00o.insertElementAt(new OooO00o(min, oooO00o.OooO00o()), i6);
                                }
                                oooO00o.OooO00o(max);
                            } else if (min == oooO00o.OooO00o()) {
                                this.OooO00o.removeElementAt(i6);
                                i6--;
                            } else {
                                oooO00o.OooO0O0(min);
                            }
                        }
                        i6++;
                    } else {
                        return;
                    }
                }
            } else if (i3 == 0 && !this.OooO00o.isEmpty() && ((OooO00o) this.OooO00o.firstElement()).OooO00o() == 0) {
                this.OooO00o.removeElementAt(0);
            }
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public byte[] m21692OooO00o() {
        if (this.OooO00o.isEmpty()) {
            return this.f23209OooO00o;
        }
        return null;
    }
}

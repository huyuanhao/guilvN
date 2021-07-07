package com.p118pd.sdk;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;
import org.bouncycastle.crypto.tls.TlsFatalAlert;

/* renamed from: com.pd.sdk.iL1IiIl */
public class iL1IiIl {
    public static final int OooO0OO = 16;
    public static final int OooO0Oo = 12;
    public int OooO00o = 0;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C1IlLiL1 f17661OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public AbstractC9439IL f17662OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Hashtable f17663OooO00o = new Hashtable();

    /* renamed from: OooO00o  reason: collision with other field name */
    public Vector f17664OooO00o = new Vector();

    /* renamed from: OooO00o  reason: collision with other field name */
    public boolean f17665OooO00o = true;
    public int OooO0O0 = 0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public Hashtable f17666OooO0O0 = null;

    /* renamed from: com.pd.sdk.iL1IiIl$OooO00o */
    public class OooO00o implements AbstractC9686lL1 {
        public OooO00o() {
        }

        @Override // com.p118pd.sdk.AbstractC9686lL1
        public void OooO00o(int i, byte[] bArr, int i2, int i3) throws IOException {
            iL1IiIl.this.OooO00o(0, i, bArr, i2, i3);
        }
    }

    /* renamed from: com.pd.sdk.iL1IiIl$OooO0O0 */
    public static class OooO0O0 {
        public final int OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final short f17667OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final byte[] f17668OooO00o;

        public OooO0O0(int i, short s, byte[] bArr) {
            this.OooO00o = i;
            this.f17667OooO00o = s;
            this.f17668OooO00o = bArr;
        }

        public /* synthetic */ OooO0O0(int i, short s, byte[] bArr, OooO00o oooO00o) {
            this(i, s, bArr);
        }

        public int OooO00o() {
            return this.OooO00o;
        }

        /* renamed from: OooO00o  reason: collision with other method in class */
        public short m17061OooO00o() {
            return this.f17667OooO00o;
        }

        /* renamed from: OooO00o  reason: collision with other method in class */
        public byte[] m17062OooO00o() {
            return this.f17668OooO00o;
        }
    }

    /* renamed from: com.pd.sdk.iL1IiIl$OooO0OO */
    public static class OooO0OO extends ByteArrayOutputStream {
        public OooO0OO(int i) {
            super(i);
        }

        public void OooO00o(C1IlLiL1 r4) throws IOException {
            r4.OooO00o(((ByteArrayOutputStream) this).buf, 0, ((ByteArrayOutputStream) this).count);
            ((ByteArrayOutputStream) this).buf = null;
        }
    }

    public iL1IiIl(iL1liI il1lii, C1IlLiL1 r3) {
        this.f17661OooO00o = r3;
        C6367iI11 r32 = new C6367iI11();
        this.f17662OooO00o = r32;
        r32.OooO00o(il1lii);
    }

    private int OooO00o(int i) {
        return Math.min(i * 2, 60000);
    }

    private OooO0O0 OooO00o(OooO0O0 oooO0O0) throws IOException {
        if (oooO0O0.m17061OooO00o() != 0) {
            byte[] OooO00o2 = oooO0O0.m17062OooO00o();
            byte[] bArr = new byte[12];
            L1LL1Ii.OooO00o(oooO0O0.m17061OooO00o(), bArr, 0);
            L1LL1Ii.OooO0O0(OooO00o2.length, bArr, 1);
            L1LL1Ii.OooO00o(oooO0O0.OooO00o(), bArr, 4);
            L1LL1Ii.OooO0O0(0, bArr, 6);
            L1LL1Ii.OooO0O0(OooO00o2.length, bArr, 9);
            this.f17662OooO00o.update(bArr, 0, 12);
            this.f17662OooO00o.update(OooO00o2, 0, OooO00o2.length);
        }
        return oooO0O0;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    private void m17055OooO00o(OooO0O0 oooO0O0) throws IOException {
        int OooO00o2 = this.f17661OooO00o.OooO00o() - 12;
        if (OooO00o2 >= 1) {
            int length = oooO0O0.m17062OooO00o().length;
            int i = 0;
            do {
                int min = Math.min(length - i, OooO00o2);
                OooO00o(oooO0O0, i, min);
                i += min;
            } while (i < length);
            return;
        }
        throw new TlsFatalAlert(80);
    }

    private void OooO00o(OooO0O0 oooO0O0, int i, int i2) throws IOException {
        OooO0OO oooO0OO = new OooO0OO(i2 + 12);
        L1LL1Ii.OooO00o(oooO0O0.m17061OooO00o(), (OutputStream) oooO0OO);
        L1LL1Ii.OooO0O0(oooO0O0.m17062OooO00o().length, (OutputStream) oooO0OO);
        L1LL1Ii.OooO00o(oooO0O0.OooO00o(), (OutputStream) oooO0OO);
        L1LL1Ii.OooO0O0(i, (OutputStream) oooO0OO);
        L1LL1Ii.OooO0O0(i2, (OutputStream) oooO0OO);
        oooO0OO.write(oooO0O0.m17062OooO00o(), i, i2);
        oooO0OO.OooO00o(this.f17661OooO00o);
    }

    private void OooO00o(Hashtable hashtable) {
        OooO0O0(this.f17663OooO00o);
        this.f17666OooO0O0 = this.f17663OooO00o;
        this.f17663OooO00o = hashtable;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private boolean OooO00o(int i, int i2, byte[] bArr, int i3, int i4) throws IOException {
        int OooO0O02;
        int OooO0O03;
        C9626il11 r1;
        boolean z = false;
        int i5 = i3;
        int i6 = i4;
        boolean z2 = false;
        while (i6 >= 12 && i6 >= (OooO0O03 = (OooO0O02 = L1LL1Ii.OooO0O0(bArr, i5 + 9)) + 12)) {
            int OooO0O04 = L1LL1Ii.OooO0O0(bArr, i5 + 1);
            int OooO0O05 = L1LL1Ii.OooO0O0(bArr, i5 + 6);
            if (OooO0O05 + OooO0O02 > OooO0O04) {
                break;
            }
            short OooO00o2 = L1LL1Ii.m15924OooO00o(bArr, i5 + 0);
            if (i2 != (OooO00o2 == 20 ? 1 : 0)) {
                break;
            }
            int OooO00o3 = L1LL1Ii.OooO00o(bArr, i5 + 4);
            int i7 = this.OooO0O0;
            if (OooO00o3 < i7 + i) {
                if (OooO00o3 >= i7) {
                    C9626il11 r4 = (C9626il11) this.f17663OooO00o.get(I11I.OooO00o(OooO00o3));
                    if (r4 == null) {
                        r4 = new C9626il11(OooO00o2, OooO0O04);
                        this.f17663OooO00o.put(I11I.OooO00o(OooO00o3), r4);
                    }
                    r4.OooO00o(OooO00o2, OooO0O04, bArr, i5 + 12, OooO0O05, OooO0O02);
                } else {
                    Hashtable hashtable = this.f17666OooO0O0;
                    if (!(hashtable == null || (r1 = (C9626il11) hashtable.get(I11I.OooO00o(OooO00o3))) == null)) {
                        r1.OooO00o(OooO00o2, OooO0O04, bArr, i5 + 12, OooO0O05, OooO0O02);
                        z2 = true;
                    }
                }
            }
            i5 += OooO0O03;
            i6 -= OooO0O03;
        }
        if (z2 && m17056OooO00o(this.f17666OooO0O0)) {
            z = true;
        }
        if (z) {
            OooO0o0();
            OooO0O0(this.f17666OooO0O0);
        }
        return z;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static boolean m17056OooO00o(Hashtable hashtable) {
        Enumeration elements = hashtable.elements();
        while (elements.hasMoreElements()) {
            if (((C9626il11) elements.nextElement()).m21692OooO00o() == null) {
                return false;
            }
        }
        return true;
    }

    private OooO0O0 OooO0O0() throws IOException {
        byte[] OooO00o2;
        C9626il11 r0 = (C9626il11) this.f17663OooO00o.get(I11I.OooO00o(this.OooO0O0));
        if (r0 == null || (OooO00o2 = r0.m21692OooO00o()) == null) {
            return null;
        }
        this.f17666OooO0O0 = null;
        int i = this.OooO0O0;
        this.OooO0O0 = i + 1;
        return OooO00o(new OooO0O0(i, r0.OooO00o(), OooO00o2, null));
    }

    public static void OooO0O0(Hashtable hashtable) {
        Enumeration elements = hashtable.elements();
        while (elements.hasMoreElements()) {
            ((C9626il11) elements.nextElement()).m21691OooO00o();
        }
    }

    private void OooO0Oo() {
        Enumeration keys = this.f17663OooO00o.keys();
        while (keys.hasMoreElements()) {
            ((Integer) keys.nextElement()).intValue();
        }
    }

    private void OooO0o0() throws IOException {
        this.f17661OooO00o.m21298OooO0O0();
        for (int i = 0; i < this.f17664OooO00o.size(); i++) {
            m17055OooO00o((OooO0O0) this.f17664OooO00o.elementAt(i));
        }
    }

    public OooO0O0 OooO00o() throws IOException {
        if (this.f17665OooO00o) {
            this.f17665OooO00o = false;
            OooO00o(new Hashtable());
        }
        byte[] bArr = null;
        int i = 1000;
        while (true) {
            try {
                OooO0O0 OooO0O02 = OooO0O0();
                if (OooO0O02 != null) {
                    return OooO0O02;
                }
                int OooO0O03 = this.f17661OooO00o.OooO0O0();
                if (bArr == null || bArr.length < OooO0O03) {
                    bArr = new byte[OooO0O03];
                }
                int OooO00o2 = this.f17661OooO00o.OooO00o(bArr, 0, OooO0O03, i);
                if (OooO00o2 < 0) {
                    OooO0o0();
                    i = OooO00o(i);
                } else if (OooO00o(16, this.f17661OooO00o.m21299OooO0OO(), bArr, 0, OooO00o2)) {
                    i = OooO00o(i);
                }
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public AbstractC9439IL m17057OooO00o() {
        return this.f17662OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m17058OooO00o() {
        OooO00o oooO00o = null;
        if (!this.f17665OooO00o) {
            OooO0Oo();
        } else {
            OooO00o((Hashtable) null);
            if (this.f17666OooO0O0 != null) {
                oooO00o = new OooO00o();
            }
        }
        this.f17661OooO00o.OooO00o(oooO00o);
    }

    public void OooO00o(short s, byte[] bArr) throws IOException {
        L1LL1Ii.m15939OooO0O0(bArr.length);
        if (!this.f17665OooO00o) {
            OooO0Oo();
            this.f17665OooO00o = true;
            this.f17664OooO00o.removeAllElements();
        }
        int i = this.OooO00o;
        this.OooO00o = i + 1;
        OooO0O0 oooO0O0 = new OooO0O0(i, s, bArr, null);
        this.f17664OooO00o.addElement(oooO0O0);
        m17055OooO00o(oooO0O0);
        OooO00o(oooO0O0);
    }

    public byte[] OooO00o(short s) throws IOException {
        OooO0O0 OooO00o2 = OooO00o();
        if (OooO00o2.m17061OooO00o() == s) {
            return OooO00o2.m17062OooO00o();
        }
        throw new TlsFatalAlert(10);
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public AbstractC9439IL m17059OooO0O0() {
        AbstractC9439IL r0 = this.f17662OooO00o;
        this.f17662OooO00o = r0.m21477OooO00o();
        return r0;
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public void m17060OooO0O0() {
        this.f17662OooO00o = this.f17662OooO00o.OooO0O0();
    }

    public void OooO0OO() {
        this.f17662OooO00o.reset();
    }
}

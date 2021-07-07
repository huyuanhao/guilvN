package com.p118pd.sdk;

import com.p118pd.sdk.C5495I1I1;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.SecureRandom;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;
import org.bouncycastle.crypto.tls.TlsFatalAlert;
import org.bouncycastle.crypto.tls.TlsFatalAlertReceived;
import org.bouncycastle.crypto.tls.TlsNoCloseNotifyException;

/* renamed from: com.pd.sdk.l丨丨1  reason: invalid class name and case insensitive filesystem */
public abstract class AbstractC6892l1 {
    public static final short OooO = 7;
    public static final Integer OooO00o = I11I.OooO00o(65281);
    public static final Integer OooO0O0 = I11I.OooO00o(35);

    /* renamed from: OooO0O0  reason: collision with other field name */
    public static final short f18987OooO0O0 = 0;
    public static final short OooO0OO = 1;
    public static final short OooO0Oo = 2;
    public static final short OooO0o = 4;
    public static final short OooO0o0 = 3;
    public static final short OooO0oO = 5;
    public static final short OooO0oo = 6;
    public static final short OooOO0 = 8;
    public static final short OooOO0O = 9;
    public static final short OooOO0o = 10;
    public static final short OooOOO = 12;
    public static final short OooOOO0 = 11;
    public static final short OooOOOO = 13;
    public static final short OooOOOo = 14;
    public static final short OooOOo = 16;
    public static final short OooOOo0 = 15;
    public static final short OooOOoo = 0;
    public static final short OooOo0 = 2;
    public static final short OooOo00 = 1;

    /* renamed from: OooO  reason: collision with other field name */
    public boolean f18988OooO;

    /* renamed from: OooO00o  reason: collision with other field name */
    public volatile int f18989OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C5495I1I1 f18990OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public L1lL1 f18991OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C5631LIilL f18992OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C5802Llli f18993OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C5918Lil f18994OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C6107iIiL f18995OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C6284iiL f18996OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C6398iii f18997OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C6827lIIi1I1 f18998OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public AbstractC6830lILl1 f18999OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public SecureRandom f19000OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Hashtable f19001OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public short f19002OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public volatile boolean f19003OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public byte[] f19004OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public int[] f19005OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public short[] f19006OooO00o;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public C5802Llli f19007OooO0O0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public Hashtable f19008OooO0O0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public volatile boolean f19009OooO0O0;

    /* renamed from: OooO0OO  reason: collision with other field name */
    public C5802Llli f19010OooO0OO;

    /* renamed from: OooO0OO  reason: collision with other field name */
    public volatile boolean f19011OooO0OO;

    /* renamed from: OooO0Oo  reason: collision with other field name */
    public volatile boolean f19012OooO0Oo;

    /* renamed from: OooO0o  reason: collision with other field name */
    public boolean f19013OooO0o;

    /* renamed from: OooO0o0  reason: collision with other field name */
    public boolean f19014OooO0o0;

    /* renamed from: OooO0oO  reason: collision with other field name */
    public boolean f19015OooO0oO;

    /* renamed from: OooO0oo  reason: collision with other field name */
    public boolean f19016OooO0oo;

    /* renamed from: OooOO0  reason: collision with other field name */
    public boolean f19017OooOO0;

    /* renamed from: com.pd.sdk.l丨丨1$OooO00o */
    public class OooO00o extends ByteArrayOutputStream {
        public OooO00o(AbstractC6892l1 r2, short s) throws IOException {
            this(s, 60);
        }

        public OooO00o(short s, int i) throws IOException {
            super(i + 4);
            L1LL1Ii.OooO00o(s, (OutputStream) this);
            ((ByteArrayOutputStream) this).count += 3;
        }

        public void OooO00o() throws IOException {
            int i = ((ByteArrayOutputStream) this).count - 4;
            L1LL1Ii.m15939OooO0O0(i);
            L1LL1Ii.OooO0O0(i, ((ByteArrayOutputStream) this).buf, 1);
            AbstractC6892l1.this.m18060OooO0OO(((ByteArrayOutputStream) this).buf, 0, ((ByteArrayOutputStream) this).count);
            ((ByteArrayOutputStream) this).buf = null;
        }
    }

    public AbstractC6892l1(InputStream inputStream, OutputStream outputStream, SecureRandom secureRandom) {
        this.f18993OooO00o = new C5802Llli(0);
        this.f19007OooO0O0 = new C5802Llli(2);
        this.f19010OooO0OO = new C5802Llli(0);
        this.f18991OooO00o = null;
        this.f18997OooO00o = null;
        this.f19003OooO00o = false;
        this.f19009OooO0O0 = false;
        this.f19011OooO0OO = false;
        this.f19012OooO0Oo = true;
        this.f18989OooO00o = 0;
        this.f19004OooO00o = null;
        this.f18999OooO00o = null;
        this.f18990OooO00o = null;
        this.f18995OooO00o = null;
        this.f18998OooO00o = null;
        this.f19005OooO00o = null;
        this.f19006OooO00o = null;
        this.f19001OooO00o = null;
        this.f19008OooO0O0 = null;
        this.f19002OooO00o = 0;
        this.f19014OooO0o0 = false;
        this.f19013OooO0o = false;
        this.f19015OooO0oO = false;
        this.f19016OooO0oo = false;
        this.f18988OooO = false;
        this.f19017OooOO0 = true;
        this.f18992OooO00o = new C5631LIilL(this, inputStream, outputStream);
        this.f19000OooO00o = secureRandom;
    }

    public AbstractC6892l1(SecureRandom secureRandom) {
        this.f18993OooO00o = new C5802Llli(0);
        this.f19007OooO0O0 = new C5802Llli(2);
        this.f19010OooO0OO = new C5802Llli(0);
        this.f18991OooO00o = null;
        this.f18997OooO00o = null;
        this.f19003OooO00o = false;
        this.f19009OooO0O0 = false;
        this.f19011OooO0OO = false;
        this.f19012OooO0Oo = true;
        this.f18989OooO00o = 0;
        this.f19004OooO00o = null;
        this.f18999OooO00o = null;
        this.f18990OooO00o = null;
        this.f18995OooO00o = null;
        this.f18998OooO00o = null;
        this.f19005OooO00o = null;
        this.f19006OooO00o = null;
        this.f19001OooO00o = null;
        this.f19008OooO0O0 = null;
        this.f19002OooO00o = 0;
        this.f19014OooO0o0 = false;
        this.f19013OooO0o = false;
        this.f19015OooO0oO = false;
        this.f19016OooO0oo = false;
        this.f18988OooO = false;
        this.f19017OooOO0 = false;
        this.f18994OooO00o = new C5918Lil();
        this.f18996OooO00o = new C6284iiL();
        this.f18992OooO00o = new C5631LIilL(this, this.f18994OooO00o, this.f18996OooO00o);
        this.f19000OooO00o = secureRandom;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x002b  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x002f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int OooO00o(com.p118pd.sdk.iL1liI r4, int r5) throws java.io.IOException {
        /*
        // Method dump skipped, instructions count: 480
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p118pd.sdk.AbstractC6892l1.OooO00o(com.pd.sdk.iL1liI, int):int");
    }

    public static Hashtable OooO00o(ByteArrayInputStream byteArrayInputStream) throws IOException {
        if (byteArrayInputStream.available() < 1) {
            return null;
        }
        byte[] OooO00o2 = L1LL1Ii.m15931OooO00o((InputStream) byteArrayInputStream);
        OooO0O0(byteArrayInputStream);
        ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(OooO00o2);
        Hashtable hashtable = new Hashtable();
        while (byteArrayInputStream2.available() > 0) {
            if (hashtable.put(I11I.OooO00o(L1LL1Ii.OooO00o((InputStream) byteArrayInputStream2)), L1LL1Ii.m15931OooO00o((InputStream) byteArrayInputStream2)) != null) {
                throw new TlsFatalAlert(47);
            }
        }
        return hashtable;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static Vector m18045OooO00o(ByteArrayInputStream byteArrayInputStream) throws IOException {
        byte[] OooO0O02 = L1LL1Ii.m15942OooO0O0((InputStream) byteArrayInputStream);
        OooO0O0(byteArrayInputStream);
        ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(OooO0O02);
        Vector vector = new Vector();
        while (byteArrayInputStream2.available() > 0) {
            vector.addElement(new LLIL11I(L1LL1Ii.OooO00o((InputStream) byteArrayInputStream2), L1LL1Ii.m15931OooO00o((InputStream) byteArrayInputStream2)));
        }
        return vector;
    }

    private void OooO00o(C5802Llli r10) throws IOException {
        while (r10.OooO00o() >= 4) {
            byte[] bArr = new byte[4];
            boolean z = false;
            r10.OooO00o(bArr, 0, 4, 0);
            short OooO00o2 = L1LL1Ii.m15924OooO00o(bArr, 0);
            int OooO0O02 = L1LL1Ii.OooO0O0(bArr, 1);
            int i = OooO0O02 + 4;
            if (r10.OooO00o() >= i) {
                if (this.f19002OooO00o == 16 || OooO00o2 == 20) {
                    z = true;
                }
                OooO00o(z);
                if (OooO00o2 != 0) {
                    if (OooO00o2 == 20) {
                        iL1liI OooO00o3 = m18046OooO00o();
                        if (this.f19004OooO00o == null && OooO00o3.m17074OooO00o().m16976OooO0O0() != null) {
                            this.f19004OooO00o = m18056OooO00o(!OooO00o3.m17079OooO00o());
                        }
                    }
                    r10.OooO00o(this.f18992OooO00o.m16104OooO00o(), i);
                }
                r10.m16407OooO00o(4);
                OooO00o(OooO00o2, r10.m16405OooO00o(OooO0O02));
            } else {
                return;
            }
        }
    }

    public static void OooO00o(iL1liI il1lii, AbstractC97431Llli r3) throws IOException {
        byte[] OooO00o2 = r3.m21855OooO00o();
        try {
            il1lii.m17074OooO00o().f17561OooO00o = L1LL1Ii.OooO00o(il1lii, OooO00o2);
        } finally {
            if (OooO00o2 != null) {
                C9586iIILl.OooO00o(OooO00o2, (byte) 0);
            }
        }
    }

    public static void OooO00o(OutputStream outputStream, Hashtable hashtable) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        OooO00o((OutputStream) byteArrayOutputStream, hashtable, true);
        OooO00o((OutputStream) byteArrayOutputStream, hashtable, false);
        L1LL1Ii.OooO00o(byteArrayOutputStream.toByteArray(), outputStream);
    }

    public static void OooO00o(OutputStream outputStream, Hashtable hashtable, boolean z) throws IOException {
        Enumeration keys = hashtable.keys();
        while (keys.hasMoreElements()) {
            Integer num = (Integer) keys.nextElement();
            int intValue = num.intValue();
            byte[] bArr = (byte[]) hashtable.get(num);
            if (z == (bArr.length == 0)) {
                L1LL1Ii.m15925OooO00o(intValue);
                L1LL1Ii.OooO00o(intValue, outputStream);
                L1LL1Ii.OooO00o(bArr, outputStream);
            }
        }
    }

    public static void OooO00o(OutputStream outputStream, Vector vector) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        for (int i = 0; i < vector.size(); i++) {
            LLIL11I llil11i = (LLIL11I) vector.elementAt(i);
            int OooO00o2 = llil11i.OooO00o();
            L1LL1Ii.m15925OooO00o(OooO00o2);
            L1LL1Ii.OooO00o(OooO00o2, (OutputStream) byteArrayOutputStream);
            L1LL1Ii.OooO00o(llil11i.m16195OooO00o(), (OutputStream) byteArrayOutputStream);
        }
        L1LL1Ii.OooO0O0(byteArrayOutputStream.toByteArray(), outputStream);
    }

    public static byte[] OooO00o(iL1liI il1lii, AbstractC9439IL r2, byte[] bArr) {
        AbstractC6436l11LI OooO00o2 = r2.OooO00o();
        if (bArr != null && L1LL1Ii.OooO00o(il1lii)) {
            OooO00o2.update(bArr, 0, bArr.length);
        }
        byte[] bArr2 = new byte[OooO00o2.OooO0O0()];
        OooO00o2.OooO00o(bArr2, 0);
        return bArr2;
    }

    public static byte[] OooO00o(boolean z, iiIi11 r2) {
        byte[] bArr = new byte[32];
        r2.OooO0O0(bArr);
        if (z) {
            L1LL1Ii.m15927OooO00o(bArr, 0);
        }
        return bArr;
    }

    public static byte[] OooO00o(byte[] bArr) throws IOException {
        return L1LL1Ii.m15933OooO00o(bArr);
    }

    public static void OooO0O0(ByteArrayInputStream byteArrayInputStream) throws IOException {
        if (byteArrayInputStream.available() > 0) {
            throw new TlsFatalAlert(50);
        }
    }

    private void OooO0Oo(byte[] bArr, int i, int i2) throws IOException {
        for (int i3 = 0; i3 < i2; i3++) {
            if (L1LL1Ii.m15924OooO00o(bArr, i + i3) != 1) {
                throw new TlsFatalAlert(50);
            } else if (this.f19013OooO0o || this.f19007OooO0O0.OooO00o() > 0 || this.f19010OooO0OO.OooO00o() > 0) {
                throw new TlsFatalAlert(10);
            } else {
                this.f18992OooO00o.OooO0Oo();
                this.f19013OooO0o = true;
                OooO0oo();
            }
        }
    }

    private void OooOOOO() throws IOException {
        while (this.f19007OooO0O0.OooO00o() >= 2) {
            byte[] OooO00o2 = this.f19007OooO0O0.OooO00o(2, 0);
            OooO00o((short) OooO00o2[0], (short) OooO00o2[1]);
        }
    }

    private void OooOOOo() {
    }

    public void OooO() {
        this.f19003OooO00o = true;
        this.f19009OooO0O0 = true;
        OooOO0();
        this.f18992OooO00o.OooO0o0();
        if (!this.f19011OooO0OO) {
            m18059OooO0OO();
        }
    }

    public int OooO00o() {
        return this.f18993OooO00o.OooO00o();
    }

    public int OooO00o(byte[] bArr, int i, int i2) throws IOException {
        if (i2 < 1) {
            return 0;
        }
        while (this.f18993OooO00o.OooO00o() == 0) {
            if (!this.f19003OooO00o) {
                OooOO0o();
            } else if (this.f19009OooO0O0) {
                throw new IOException("Cannot read application data on failed TLS connection");
            } else if (this.f19011OooO0OO) {
                return -1;
            } else {
                throw new IllegalStateException("Cannot read application data until initial handshake completed.");
            }
        }
        int min = Math.min(i2, this.f18993OooO00o.OooO00o());
        this.f18993OooO00o.OooO0O0(bArr, i, min, 0);
        return min;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public abstract iL1liI m18046OooO00o();

    /* renamed from: OooO00o  reason: collision with other method in class */
    public abstract AbstractC6333illiL m18047OooO00o();

    /* renamed from: OooO00o  reason: collision with other method in class */
    public abstract AbstractC9462L1Lii m18048OooO00o();

    /* renamed from: OooO00o  reason: collision with other method in class */
    public InputStream m18049OooO00o() {
        if (this.f19017OooOO0) {
            return this.f18991OooO00o;
        }
        throw new IllegalStateException("Cannot use InputStream in non-blocking mode! Use offerInput() instead.");
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public OutputStream m18050OooO00o() {
        if (this.f19017OooOO0) {
            return this.f18997OooO00o;
        }
        throw new IllegalStateException("Cannot use OutputStream in non-blocking mode! Use offerOutput() instead.");
    }

    public short OooO00o(Hashtable hashtable, Hashtable hashtable2, short s) throws IOException {
        short OooO00o2 = C6115iIiL.m17003OooO00o(hashtable2);
        if (OooO00o2 < 0 || (ii1l1L.OooO00o(OooO00o2) && (this.f19014OooO0o0 || OooO00o2 == C6115iIiL.m17003OooO00o(hashtable)))) {
            return OooO00o2;
        }
        throw new TlsFatalAlert(s);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m18051OooO00o() throws IOException {
        short s = this.f18995OooO00o.f17562OooO0O0;
        if (s < 0) {
            return;
        }
        if (ii1l1L.OooO00o(s)) {
            this.f18992OooO00o.OooO00o(1 << (this.f18995OooO00o.f17562OooO0O0 + 8));
            return;
        }
        throw new TlsFatalAlert(80);
    }

    public void OooO00o(int i) {
        if (i < 0 || i > 2) {
            throw new IllegalArgumentException("Illegal appDataSplitMode mode: " + i);
        }
        this.f18989OooO00o = i;
    }

    public void OooO00o(C6827lIIi1I1 r3) throws IOException {
        if (r3 == null) {
            r3 = C6827lIIi1I1.OooO00o;
        }
        if (r3.m17955OooO00o() && !m18046OooO00o().m17079OooO00o()) {
            i1iiIl OooO0O02 = m18046OooO00o().OooO0O0();
            if (OooO0O02.m16893OooO0O0()) {
                OooO00o((short) 41, OooO0O02.toString() + " client didn't provide credentials");
                return;
            }
        }
        OooO00o oooO00o = new OooO00o(this, 11);
        r3.OooO00o(oooO00o);
        oooO00o.OooO00o();
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m18052OooO00o(ByteArrayInputStream byteArrayInputStream) throws IOException {
        byte[] bArr = this.f19004OooO00o;
        if (bArr != null) {
            byte[] OooO0O02 = L1LL1Ii.OooO0O0(bArr.length, byteArrayInputStream);
            OooO0O0(byteArrayInputStream);
            if (!C9586iIILl.OooO0O0(this.f19004OooO00o, OooO0O02)) {
                throw new TlsFatalAlert(51);
            }
            return;
        }
        throw new TlsFatalAlert(80);
    }

    public void OooO00o(Vector vector) throws IOException {
        OooO00o oooO00o = new OooO00o(this, 23);
        OooO00o(oooO00o, vector);
        oooO00o.OooO00o();
    }

    public void OooO00o(short s) throws IOException {
        if (s != 0) {
            return;
        }
        if (this.f19011OooO0OO) {
            OooO0O0(false);
            return;
        }
        throw new TlsFatalAlert(40);
    }

    public abstract void OooO00o(short s, ByteArrayInputStream byteArrayInputStream) throws IOException;

    public void OooO00o(short s, String str) throws IOException {
        m18047OooO00o().OooO00o(1, s, str, null);
        OooO0O0(21, new byte[]{1, (byte) s}, 0, 2);
    }

    public void OooO00o(short s, String str, Throwable th) throws IOException {
        if (!this.f19003OooO00o) {
            OooO0O0(s, str, th);
            OooO();
        }
    }

    public void OooO00o(short s, short s2) throws IOException {
        m18047OooO00o().OooO00o(s, s2);
        if (s == 1) {
            OooO00o(s2);
        } else {
            OooO();
            throw new TlsFatalAlertReceived(s2);
        }
    }

    public void OooO00o(short s, byte[] bArr, int i, int i2) throws IOException {
        switch (s) {
            case 20:
                OooO0Oo(bArr, i, i2);
                return;
            case 21:
                this.f19007OooO0O0.OooO00o(bArr, i, i2);
                OooOOOO();
                return;
            case 22:
                if (this.f19010OooO0OO.OooO00o() > 0) {
                    this.f19010OooO0OO.OooO00o(bArr, i, i2);
                    OooO00o(this.f19010OooO0OO);
                    return;
                }
                C5802Llli r2 = new C5802Llli(bArr, i, i2);
                OooO00o(r2);
                int OooO00o2 = r2.OooO00o();
                if (OooO00o2 > 0) {
                    this.f19010OooO0OO.OooO00o(bArr, (i + i2) - OooO00o2, OooO00o2);
                    return;
                }
                return;
            case 23:
                if (this.f19011OooO0OO) {
                    this.f18993OooO00o.OooO00o(bArr, i, i2);
                    OooOOOo();
                    return;
                }
                throw new TlsFatalAlert(10);
            default:
                throw new TlsFatalAlert(80);
        }
    }

    public void OooO00o(boolean z) throws IOException {
        if (z != this.f19013OooO0o) {
            throw new TlsFatalAlert(10);
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m18053OooO00o(byte[] bArr) throws IOException {
        if (this.f19017OooOO0) {
            throw new IllegalStateException("Cannot use offerInput() in blocking mode! Use getInputStream() instead.");
        } else if (!this.f19003OooO00o) {
            this.f18994OooO00o.m16494OooO00o(bArr);
            while (this.f18994OooO00o.available() >= 5) {
                byte[] bArr2 = new byte[5];
                this.f18994OooO00o.OooO00o(bArr2);
                if (this.f18994OooO00o.available() < L1LL1Ii.OooO00o(bArr2, 3) + 5) {
                    OooO0O0(bArr2);
                    return;
                }
                OooOO0o();
                if (this.f19003OooO00o) {
                    if (this.f19002OooO00o != 16) {
                        throw new TlsFatalAlert(80);
                    }
                    return;
                }
            }
        } else {
            throw new IOException("Connection is closed, cannot accept any more input");
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m18054OooO00o(byte[] bArr, int i, int i2) throws IOException {
        if (this.f19017OooOO0) {
            throw new IllegalStateException("Cannot use offerOutput() in blocking mode! Use getOutputStream() instead.");
        } else if (this.f19011OooO0OO) {
            m18058OooO0O0(bArr, i, i2);
        } else {
            throw new IOException("Application data cannot be sent until the handshake is complete!");
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m18055OooO00o() {
        return this.f19003OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public byte[] m18056OooO00o(boolean z) {
        iL1liI OooO00o2 = m18046OooO00o();
        return L1LL1Ii.OooO00o(OooO00o2, z ? LiLLlii.OooO0O0 : LiLLlii.OooO00o, OooO00o(OooO00o2, this.f18992OooO00o.m16103OooO00o(), z ? L1LL1Ii.OooO0OO : L1LL1Ii.OooO0O0));
    }

    public int OooO0O0() {
        if (!this.f19017OooOO0) {
            return OooO00o();
        }
        throw new IllegalStateException("Cannot use getAvailableInputBytes() in blocking mode! Use getInputStream().available() instead.");
    }

    public int OooO0O0(byte[] bArr, int i, int i2) {
        if (!this.f19017OooOO0) {
            try {
                return OooO00o(bArr, i, Math.min(i2, OooO00o()));
            } catch (IOException e) {
                throw new RuntimeException(e.toString());
            }
        } else {
            throw new IllegalStateException("Cannot use readInput() in blocking mode! Use getInputStream() instead.");
        }
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public void m18057OooO0O0() throws IOException {
        if (this.f19017OooOO0) {
            while (this.f19002OooO00o != 16) {
                if (!this.f19003OooO00o) {
                    OooOO0o();
                } else {
                    throw new TlsFatalAlert(80);
                }
            }
        }
    }

    public void OooO0O0(short s, String str, Throwable th) throws IOException {
        m18047OooO00o().OooO00o(2, s, str, th);
        try {
            this.f18992OooO00o.OooO00o(21, new byte[]{2, (byte) s}, 0, 2);
        } catch (Exception unused) {
        }
    }

    public void OooO0O0(short s, byte[] bArr, int i, int i2) throws IOException {
        try {
            this.f18992OooO00o.OooO00o(s, bArr, i, i2);
        } catch (TlsFatalAlert e) {
            OooO00o(e.getAlertDescription(), "Failed to write record", e);
            throw e;
        } catch (IOException e2) {
            OooO00o((short) 80, "Failed to write record", e2);
            throw e2;
        } catch (RuntimeException e3) {
            OooO00o((short) 80, "Failed to write record", e3);
            throw new TlsFatalAlert(80, e3);
        }
    }

    public void OooO0O0(boolean z) throws IOException {
        if (!this.f19003OooO00o) {
            this.f19003OooO00o = true;
            if (z && !this.f19011OooO0OO) {
                OooO00o((short) 90, "User canceled handshake");
            }
            OooO00o((short) 0, "Connection closed");
            this.f18992OooO00o.OooO0o0();
            if (!this.f19011OooO0OO) {
                m18059OooO0OO();
            }
        }
    }

    public void OooO0O0(byte[] bArr) throws IOException {
        try {
            this.f18992OooO00o.OooO00o(bArr);
        } catch (TlsFatalAlert e) {
            OooO00o(e.getAlertDescription(), "Failed to read record", e);
            throw e;
        } catch (IOException e2) {
            OooO00o((short) 80, "Failed to read record", e2);
            throw e2;
        } catch (RuntimeException e3) {
            OooO00o((short) 80, "Failed to read record", e3);
            throw new TlsFatalAlert(80, e3);
        }
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public void m18058OooO0O0(byte[] bArr, int i, int i2) throws IOException {
        if (!this.f19003OooO00o) {
            while (i2 > 0) {
                if (this.f19012OooO0Oo) {
                    int i3 = this.f18989OooO00o;
                    if (i3 != 1) {
                        if (i3 != 2) {
                            OooO0O0(23, bArr, i, 1);
                            i++;
                            i2--;
                        } else {
                            this.f19012OooO0Oo = false;
                        }
                    }
                    OooO0O0(23, L1LL1Ii.f16174OooO00o, 0, 0);
                }
                if (i2 > 0) {
                    int min = Math.min(i2, this.f18992OooO00o.m16101OooO00o());
                    OooO0O0(23, bArr, i, min);
                    i += min;
                    i2 -= min;
                }
            }
            return;
        }
        throw new IOException("Cannot write application data on closed/failed TLS connection");
    }

    public int OooO0OO() {
        if (!this.f19017OooOO0) {
            return this.f18996OooO00o.OooO00o().OooO00o();
        }
        throw new IllegalStateException("Cannot use getAvailableOutputBytes() in blocking mode! Use getOutputStream() instead.");
    }

    public int OooO0OO(byte[] bArr, int i, int i2) {
        if (!this.f19017OooOO0) {
            int min = Math.min(OooO0OO(), i2);
            this.f18996OooO00o.OooO00o().OooO0O0(bArr, i, min, 0);
            return min;
        }
        throw new IllegalStateException("Cannot use readOutput() in blocking mode! Use getOutputStream() instead.");
    }

    /* renamed from: OooO0OO  reason: collision with other method in class */
    public void m18059OooO0OO() {
        byte[] bArr = this.f19004OooO00o;
        if (bArr != null) {
            C9586iIILl.OooO00o(bArr, (byte) 0);
            this.f19004OooO00o = null;
        }
        this.f18995OooO00o.m16974OooO00o();
        this.f18998OooO00o = null;
        this.f19005OooO00o = null;
        this.f19006OooO00o = null;
        this.f19001OooO00o = null;
        this.f19008OooO0O0 = null;
        this.f19014OooO0o0 = false;
        this.f19013OooO0o = false;
        this.f19015OooO0oO = false;
        this.f19016OooO0oo = false;
        this.f18988OooO = false;
    }

    /* renamed from: OooO0OO  reason: collision with other method in class */
    public void m18060OooO0OO(byte[] bArr, int i, int i2) throws IOException {
        if (i2 >= 4) {
            if (L1LL1Ii.m15924OooO00o(bArr, i) != 0) {
                this.f18992OooO00o.m16104OooO00o().write(bArr, i, i2);
            }
            int i3 = 0;
            do {
                int min = Math.min(i2 - i3, this.f18992OooO00o.m16101OooO00o());
                OooO0O0(22, bArr, i + i3, min);
                i3 += min;
            } while (i3 < i2);
            return;
        }
        throw new TlsFatalAlert(80);
    }

    public void OooO0Oo() throws IOException {
        OooO0O0(true);
    }

    public void OooO0o() throws IOException {
        try {
            this.f19002OooO00o = 16;
            this.f19007OooO0O0.m16406OooO00o();
            this.f19010OooO0OO.m16406OooO00o();
            this.f18992OooO00o.m16105OooO00o();
            this.f19012OooO0Oo = !L1LL1Ii.OooO0O0(m18046OooO00o());
            if (!this.f19011OooO0OO) {
                this.f19011OooO0OO = true;
                if (this.f19017OooOO0) {
                    this.f18991OooO00o = new L1lL1(this);
                    this.f18997OooO00o = new C6398iii(this);
                }
            }
            if (this.f18999OooO00o != null) {
                if (this.f18990OooO00o == null) {
                    this.f18990OooO00o = new C5495I1I1.OooO0O0().OooO00o(this.f18995OooO00o.OooO00o()).OooO00o(this.f18995OooO00o.m16973OooO00o()).OooO00o(this.f18995OooO00o.m16976OooO0O0()).OooO00o(this.f18998OooO00o).OooO0O0(this.f18995OooO00o.m16977OooO0OO()).OooO0Oo(this.f18995OooO00o.OooO0o0()).OooO00o(this.f19008OooO0O0).OooO00o();
                    this.f18999OooO00o = new IL1ll1(this.f18999OooO00o.m17964OooO00o(), this.f18990OooO00o);
                }
                m18048OooO00o().OooO00o(this.f18999OooO00o);
            }
            m18047OooO00o().m17396OooO00o();
        } finally {
            m18059OooO0OO();
        }
    }

    public void OooO0o0() throws IOException {
        if (this.f19017OooOO0) {
            throw new IllegalStateException("Cannot use closeInput() in blocking mode!");
        } else if (!this.f19003OooO00o) {
            if (this.f18994OooO00o.available() > 0) {
                throw new EOFException();
            } else if (!this.f19011OooO0OO) {
                throw new TlsFatalAlert(40);
            } else {
                throw new TlsNoCloseNotifyException();
            }
        }
    }

    public void OooO0oO() throws IOException {
        this.f18992OooO00o.m16107OooO0O0();
    }

    public void OooO0oo() throws IOException {
    }

    public void OooOO0() {
        C5495I1I1 r0 = this.f18990OooO00o;
        if (r0 != null) {
            r0.m15730OooO00o();
            this.f18990OooO00o = null;
        }
        AbstractC6830lILl1 r02 = this.f18999OooO00o;
        if (r02 != null) {
            r02.invalidate();
            this.f18999OooO00o = null;
        }
    }

    public void OooOO0O() throws IOException {
        if (!L1LL1Ii.OooO00o(m18046OooO00o())) {
            OooO00o((short) 100, "Renegotiation not supported");
            return;
        }
        throw new TlsFatalAlert(40);
    }

    public void OooOO0o() throws IOException {
        try {
            if (!this.f18992OooO00o.m16106OooO00o()) {
                if (!this.f19011OooO0OO) {
                    throw new TlsFatalAlert(40);
                }
                OooO();
                throw new TlsNoCloseNotifyException();
            }
        } catch (TlsFatalAlertReceived e) {
            throw e;
        } catch (TlsFatalAlert e2) {
            OooO00o(e2.getAlertDescription(), "Failed to read record", e2);
            throw e2;
        } catch (IOException e3) {
            OooO00o((short) 80, "Failed to read record", e3);
            throw e3;
        } catch (RuntimeException e4) {
            OooO00o((short) 80, "Failed to read record", e4);
            throw new TlsFatalAlert(80, e4);
        }
    }

    public void OooOOO() throws IOException {
        byte[] OooO00o2 = m18056OooO00o(m18046OooO00o().m17079OooO00o());
        OooO00o oooO00o = new OooO00o(20, OooO00o2.length);
        oooO00o.write(OooO00o2);
        oooO00o.OooO00o();
    }

    public void OooOOO0() throws IOException {
        OooO0O0(20, new byte[]{1}, 0, 1);
        this.f18992OooO00o.OooO0o();
    }
}

package com.p118pd.sdk;

import com.p118pd.sdk.C5495I1I1;
import com.p118pd.sdk.iL1IiIl;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.SecureRandom;
import java.util.Hashtable;
import java.util.Vector;
import org.bouncycastle.crypto.tls.TlsFatalAlert;

/* renamed from: com.pd.sdk.丨lLl  reason: invalid class name and case insensitive filesystem */
public class C9691lLl extends LLILiL11 {
    public boolean OooO00o = true;

    /* renamed from: com.pd.sdk.丨lLl$OooO00o */
    public static class OooO00o {
        public C5394IiL1l OooO00o = null;

        /* renamed from: OooO00o  reason: collision with other field name */
        public C5495I1I1.OooO0O0 f23304OooO00o = null;

        /* renamed from: OooO00o  reason: collision with other field name */
        public C5495I1I1 f23305OooO00o = null;

        /* renamed from: OooO00o  reason: collision with other field name */
        public LIiillil f23306OooO00o = null;

        /* renamed from: OooO00o  reason: collision with other field name */
        public lilLii1 f23307OooO00o = null;

        /* renamed from: OooO00o  reason: collision with other field name */
        public ll1iiLI f23308OooO00o = null;

        /* renamed from: OooO00o  reason: collision with other field name */
        public C6827lIIi1I1 f23309OooO00o = null;

        /* renamed from: OooO00o  reason: collision with other field name */
        public AbstractC6830lILl1 f23310OooO00o = null;

        /* renamed from: OooO00o  reason: collision with other field name */
        public AbstractC97431Llli f23311OooO00o = null;

        /* renamed from: OooO00o  reason: collision with other field name */
        public Hashtable f23312OooO00o = null;

        /* renamed from: OooO00o  reason: collision with other field name */
        public short f23313OooO00o = -1;

        /* renamed from: OooO00o  reason: collision with other field name */
        public boolean f23314OooO00o = false;

        /* renamed from: OooO00o  reason: collision with other field name */
        public int[] f23315OooO00o = null;

        /* renamed from: OooO00o  reason: collision with other field name */
        public short[] f23316OooO00o = null;
        public Hashtable OooO0O0 = null;

        /* renamed from: OooO0O0  reason: collision with other field name */
        public boolean f23317OooO0O0 = false;
        public boolean OooO0OO = false;
        public boolean OooO0Oo = false;
    }

    public C9691lLl(SecureRandom secureRandom) {
        super(secureRandom);
    }

    public C6502lIL OooO00o(LIiillil lIiillil, AbstractC6681liLI r7) throws IOException {
        if (lIiillil == null) {
            throw new IllegalArgumentException("'server' cannot be null");
        } else if (r7 != null) {
            C6107iIiL iiil = new C6107iIiL();
            iiil.OooO00o = 0;
            OooO00o oooO00o = new OooO00o();
            oooO00o.f23306OooO00o = lIiillil;
            oooO00o.OooO00o = new C5394IiL1l(super.OooO00o, iiil);
            iiil.f17566OooO0OO = AbstractC6892l1.OooO00o(lIiillil.OooO0O0(), oooO00o.OooO00o.m21514OooO00o());
            lIiillil.OooO00o(oooO00o.OooO00o);
            C1IlLiL1 r2 = new C1IlLiL1(r7, oooO00o.OooO00o, lIiillil, 22);
            try {
                C6502lIL OooO00o2 = OooO00o(oooO00o, r2);
                iiil.m16974OooO00o();
                return OooO00o2;
            } catch (TlsFatalAlert e) {
                OooO00o(oooO00o, r2, e.getAlertDescription());
                throw e;
            } catch (IOException e2) {
                OooO00o(oooO00o, r2, (short) 80);
                throw e2;
            } catch (RuntimeException e3) {
                OooO00o(oooO00o, r2, (short) 80);
                throw new TlsFatalAlert(80, e3);
            } catch (Throwable th) {
                iiil.m16974OooO00o();
                throw th;
            }
        } else {
            throw new IllegalArgumentException("'transport' cannot be null");
        }
    }

    public C6502lIL OooO00o(OooO00o oooO00o, C1IlLiL1 r12) throws IOException {
        C6827lIIi1I1 r2;
        C9824LiI OooO00o2;
        C6107iIiL OooO00o3 = oooO00o.OooO00o.m21513OooO00o();
        iL1IiIl il1iiil = new iL1IiIl(oooO00o.OooO00o, r12);
        iL1IiIl.OooO0O0 OooO00o4 = il1iiil.OooO00o();
        boolean z = true;
        if (OooO00o4.m17061OooO00o() == 1) {
            OooO0O0(oooO00o, OooO00o4.m17062OooO00o());
            byte[] OooO00o5 = m21729OooO00o(oooO00o);
            LLILiL11.OooO00o(r12, OooO00o3.f17562OooO0O0);
            i1iiIl OooO0O0 = oooO00o.OooO00o.OooO0O0();
            r12.OooO00o(OooO0O0);
            r12.OooO0O0(OooO0O0);
            il1iiil.OooO00o(2, OooO00o5);
            il1iiil.m17060OooO0O0();
            Vector OooO00o6 = oooO00o.f23306OooO00o.m16097OooO00o();
            if (OooO00o6 != null) {
                il1iiil.OooO00o(23, LLILiL11.OooO00o(OooO00o6));
            }
            AbstractC97431Llli OooO00o7 = oooO00o.f23306OooO00o.m16094OooO00o();
            oooO00o.f23311OooO00o = OooO00o7;
            OooO00o7.OooO00o(oooO00o.OooO00o);
            ll1iiLI OooO00o8 = oooO00o.f23306OooO00o.m16093OooO00o();
            oooO00o.f23308OooO00o = OooO00o8;
            if (OooO00o8 == null) {
                oooO00o.f23311OooO00o.OooO00o();
                r2 = null;
            } else {
                oooO00o.f23311OooO00o.OooO00o(OooO00o8);
                r2 = oooO00o.f23308OooO00o.OooO00o();
                il1iiil.OooO00o(11, LLILiL11.OooO00o(r2));
            }
            if (r2 == null || r2.m17955OooO00o()) {
                oooO00o.OooO0OO = false;
            }
            if (oooO00o.OooO0OO && (OooO00o2 = oooO00o.f23306OooO00o.m16095OooO00o()) != null) {
                il1iiil.OooO00o(22, OooO00o(oooO00o, OooO00o2));
            }
            byte[] OooO0O02 = oooO00o.f23311OooO00o.m21856OooO0O0();
            if (OooO0O02 != null) {
                il1iiil.OooO00o(12, OooO0O02);
            }
            if (oooO00o.f23308OooO00o != null) {
                lilLii1 OooO00o9 = oooO00o.f23306OooO00o.m16092OooO00o();
                oooO00o.f23307OooO00o = OooO00o9;
                if (OooO00o9 != null) {
                    boolean OooO0OO = L1LL1Ii.OooO0OO(oooO00o.OooO00o);
                    if (oooO00o.f23307OooO00o.OooO0O0() == null) {
                        z = false;
                    }
                    if (OooO0OO == z) {
                        oooO00o.f23311OooO00o.OooO00o(oooO00o.f23307OooO00o);
                        il1iiil.OooO00o(13, OooO00o(oooO00o, oooO00o.f23307OooO00o));
                        L1LL1Ii.OooO00o(il1iiil.m17057OooO00o(), oooO00o.f23307OooO00o.OooO0O0());
                    } else {
                        throw new TlsFatalAlert(80);
                    }
                }
            }
            il1iiil.OooO00o(14, L1LL1Ii.f16174OooO00o);
            il1iiil.m17057OooO00o().m21478OooO00o();
            iL1IiIl.OooO0O0 OooO00o10 = il1iiil.OooO00o();
            if (OooO00o10.m17061OooO00o() == 23) {
                OooO0Oo(oooO00o, OooO00o10.m17062OooO00o());
                OooO00o10 = il1iiil.OooO00o();
            } else {
                oooO00o.f23306OooO00o.OooO0O0((Vector) null);
            }
            if (oooO00o.f23307OooO00o == null) {
                oooO00o.f23311OooO00o.OooO0O0();
            } else if (OooO00o10.m17061OooO00o() == 11) {
                OooO00o(oooO00o, OooO00o10.m17062OooO00o());
                OooO00o10 = il1iiil.OooO00o();
            } else if (!L1LL1Ii.OooO0OO(oooO00o.OooO00o)) {
                OooO00o(oooO00o, C6827lIIi1I1.OooO00o);
            } else {
                throw new TlsFatalAlert(10);
            }
            if (OooO00o10.m17061OooO00o() == 16) {
                OooO0OO(oooO00o, OooO00o10.m17062OooO00o());
                AbstractC9439IL OooO0O03 = il1iiil.m17059OooO0O0();
                OooO00o3.f17567OooO0Oo = AbstractC6892l1.OooO00o(oooO00o.OooO00o, OooO0O03, (byte[]) null);
                AbstractC6892l1.OooO00o(oooO00o.OooO00o, oooO00o.f23311OooO00o);
                r12.OooO00o(oooO00o.f23306OooO00o.OooO00o());
                if (m21728OooO00o(oooO00o)) {
                    OooO00o(oooO00o, il1iiil.OooO00o((short) 15), OooO0O03);
                }
                C5394IiL1l r0 = oooO00o.OooO00o;
                OooO00o(il1iiil.OooO00o((short) 20), L1LL1Ii.OooO00o(r0, LiLLlii.OooO00o, AbstractC6892l1.OooO00o(r0, il1iiil.m17057OooO00o(), (byte[]) null)));
                if (oooO00o.OooO0Oo) {
                    il1iiil.OooO00o(4, OooO00o(oooO00o, oooO00o.f23306OooO00o.m16091OooO00o()));
                }
                C5394IiL1l r02 = oooO00o.OooO00o;
                il1iiil.OooO00o(20, L1LL1Ii.OooO00o(r02, LiLLlii.OooO0O0, AbstractC6892l1.OooO00o(r02, il1iiil.m17057OooO00o(), (byte[]) null)));
                il1iiil.m17058OooO00o();
                oooO00o.f23306OooO00o.m17396OooO00o();
                return new C6502lIL(r12);
            }
            throw new TlsFatalAlert(10);
        }
        throw new TlsFatalAlert(10);
    }

    public void OooO00o(OooO00o oooO00o) {
        C5495I1I1 r0 = oooO00o.f23305OooO00o;
        if (r0 != null) {
            r0.m15730OooO00o();
            oooO00o.f23305OooO00o = null;
        }
        AbstractC6830lILl1 r02 = oooO00o.f23310OooO00o;
        if (r02 != null) {
            r02.invalidate();
            oooO00o.f23310OooO00o = null;
        }
    }

    public void OooO00o(OooO00o oooO00o, C6827lIIi1I1 r3) throws IOException {
        if (oooO00o.f23307OooO00o == null) {
            throw new IllegalStateException();
        } else if (oooO00o.f23309OooO00o == null) {
            oooO00o.f23309OooO00o = r3;
            if (r3.m17955OooO00o()) {
                oooO00o.f23311OooO00o.OooO0O0();
            } else {
                oooO00o.f23313OooO00o = L1LL1Ii.OooO00o(r3, oooO00o.f23308OooO00o.OooO00o());
                oooO00o.f23311OooO00o.OooO0O0(r3);
            }
            oooO00o.f23306OooO00o.OooO00o(r3);
        } else {
            throw new TlsFatalAlert(10);
        }
    }

    public void OooO00o(OooO00o oooO00o, C1IlLiL1 r2, short s) {
        r2.OooO00o(s);
        OooO00o(oooO00o);
    }

    public void OooO00o(OooO00o oooO00o, byte[] bArr) throws IOException {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        C6827lIIi1I1 OooO00o2 = C6827lIIi1I1.OooO00o(byteArrayInputStream);
        AbstractC6892l1.OooO0O0(byteArrayInputStream);
        OooO00o(oooO00o, OooO00o2);
    }

    public void OooO00o(OooO00o oooO00o, byte[] bArr, AbstractC9439IL r8) throws IOException {
        byte[] bArr2;
        if (oooO00o.f23307OooO00o != null) {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            C5394IiL1l r7 = oooO00o.OooO00o;
            iLlLiLll OooO00o2 = iLlLiLll.OooO00o(r7, byteArrayInputStream);
            AbstractC6892l1.OooO0O0(byteArrayInputStream);
            try {
                II1LLIl OooO00o3 = OooO00o2.OooO00o();
                if (L1LL1Ii.OooO0OO(r7)) {
                    L1LL1Ii.OooO00o(oooO00o.f23307OooO00o.OooO0O0(), OooO00o3);
                    bArr2 = r8.m21479OooO00o(OooO00o3.OooO00o());
                } else {
                    bArr2 = r7.m21513OooO00o().OooO0oO();
                }
                C6213iL11I OooO00o4 = IILLl.OooO00o(oooO00o.f23309OooO00o.OooO00o(0).m16321OooO00o());
                L1Illl1i OooO00o5 = L1LL1Ii.OooO00o(oooO00o.f23313OooO00o);
                OooO00o5.OooO00o(r7);
                if (!OooO00o5.OooO00o(OooO00o3, OooO00o2.m17161OooO00o(), OooO00o4, bArr2)) {
                    throw new TlsFatalAlert(51);
                }
            } catch (TlsFatalAlert e) {
                throw e;
            } catch (Exception e2) {
                throw new TlsFatalAlert(51, e2);
            }
        } else {
            throw new IllegalStateException();
        }
    }

    public void OooO00o(boolean z) {
        this.OooO00o = z;
    }

    public boolean OooO00o() {
        return this.OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m21728OooO00o(OooO00o oooO00o) {
        short s = oooO00o.f23313OooO00o;
        return s >= 0 && L1LL1Ii.m15930OooO00o(s);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public byte[] m21729OooO00o(OooO00o oooO00o) throws IOException {
        C6107iIiL OooO00o2 = oooO00o.OooO00o.m21513OooO00o();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        i1iiIl OooO0O0 = oooO00o.f23306OooO00o.OooO0O0();
        if (OooO0O0.OooO0O0(oooO00o.OooO00o.m21512OooO00o())) {
            oooO00o.OooO00o.OooO0O0(OooO0O0);
            L1LL1Ii.OooO00o(oooO00o.OooO00o.OooO0O0(), byteArrayOutputStream);
            byteArrayOutputStream.write(OooO00o2.OooO0o());
            L1LL1Ii.OooO0OO(L1LL1Ii.f16174OooO00o, byteArrayOutputStream);
            int OooO00o3 = oooO00o.f23306OooO00o.OooO00o();
            if (!C9586iIILl.m21628OooO00o(oooO00o.f23315OooO00o, OooO00o3) || OooO00o3 == 0 || Lillilli.OooO00o(OooO00o3) || !L1LL1Ii.OooO00o(OooO00o3, oooO00o.OooO00o.OooO0O0())) {
                throw new TlsFatalAlert(80);
            }
            LLILiL11.OooO00o(OooO00o3, (short) 80);
            OooO00o2.OooO0O0 = OooO00o3;
            short OooO00o4 = oooO00o.f23306OooO00o.m16098OooO00o();
            if (C9586iIILl.m21629OooO00o(oooO00o.f23316OooO00o, OooO00o4)) {
                OooO00o2.f17559OooO00o = OooO00o4;
                L1LL1Ii.OooO00o(OooO00o3, (OutputStream) byteArrayOutputStream);
                L1LL1Ii.OooO00o(OooO00o4, (OutputStream) byteArrayOutputStream);
                Hashtable OooO00o5 = oooO00o.f23306OooO00o.m16096OooO00o();
                oooO00o.OooO0O0 = OooO00o5;
                boolean z = true;
                if (oooO00o.f23317OooO0O0) {
                    if (L1LL1Ii.OooO00o(OooO00o5, AbstractC6892l1.OooO00o) == null) {
                        Hashtable OooO00o6 = C6115iIiL.m17002OooO00o(oooO00o.OooO0O0);
                        oooO00o.OooO0O0 = OooO00o6;
                        OooO00o6.put(AbstractC6892l1.OooO00o, AbstractC6892l1.OooO00o(L1LL1Ii.f16174OooO00o));
                    }
                }
                if (OooO00o2.f17565OooO0OO) {
                    Hashtable OooO00o7 = C6115iIiL.m17002OooO00o(oooO00o.OooO0O0);
                    oooO00o.OooO0O0 = OooO00o7;
                    C6115iIiL.OooO0O0(OooO00o7);
                }
                Hashtable hashtable = oooO00o.OooO0O0;
                if (hashtable != null) {
                    OooO00o2.f17563OooO0O0 = C6115iIiL.m17006OooO00o(hashtable);
                    OooO00o2.f17562OooO0O0 = LLILiL11.OooO00o(oooO00o.f23314OooO00o, oooO00o.f23312OooO00o, oooO00o.OooO0O0, 80);
                    OooO00o2.f17560OooO00o = C6115iIiL.m17009OooO0OO(oooO00o.OooO0O0);
                    oooO00o.OooO0OO = !oooO00o.f23314OooO00o && L1LL1Ii.OooO00o(oooO00o.OooO0O0, C6115iIiL.OooO0oO, 80);
                    if (oooO00o.f23314OooO00o || !L1LL1Ii.OooO00o(oooO00o.OooO0O0, AbstractC6892l1.OooO0O0, (short) 80)) {
                        z = false;
                    }
                    oooO00o.OooO0Oo = z;
                    AbstractC6892l1.OooO00o(byteArrayOutputStream, oooO00o.OooO0O0);
                }
                OooO00o2.OooO0OO = AbstractC6892l1.OooO00o(oooO00o.OooO00o, OooO00o2.OooO00o());
                OooO00o2.OooO0Oo = 12;
                return byteArrayOutputStream.toByteArray();
            }
            throw new TlsFatalAlert(80);
        }
        throw new TlsFatalAlert(80);
    }

    public byte[] OooO00o(OooO00o oooO00o, LI1lll r2) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        r2.OooO00o(byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

    public byte[] OooO00o(OooO00o oooO00o, lilLii1 r2) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        r2.OooO00o(byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

    public byte[] OooO00o(OooO00o oooO00o, C9824LiI r2) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        r2.OooO00o(byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

    public void OooO0O0(OooO00o oooO00o, byte[] bArr) throws IOException {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        i1iiIl OooO00o2 = L1LL1Ii.m15917OooO00o((InputStream) byteArrayInputStream);
        if (OooO00o2.m16892OooO00o()) {
            byte[] OooO0O0 = L1LL1Ii.OooO0O0(32, byteArrayInputStream);
            if (L1LL1Ii.m15946OooO0OO((InputStream) byteArrayInputStream).length <= 32) {
                L1LL1Ii.m15946OooO0OO((InputStream) byteArrayInputStream);
                int OooO00o3 = L1LL1Ii.OooO00o((InputStream) byteArrayInputStream);
                if (OooO00o3 < 2 || (OooO00o3 & 1) != 0) {
                    throw new TlsFatalAlert(50);
                }
                oooO00o.f23315OooO00o = L1LL1Ii.m15934OooO00o(OooO00o3 / 2, (InputStream) byteArrayInputStream);
                short OooO00o4 = L1LL1Ii.m15923OooO00o((InputStream) byteArrayInputStream);
                if (OooO00o4 >= 1) {
                    oooO00o.f23316OooO00o = L1LL1Ii.m15935OooO00o((int) OooO00o4, (InputStream) byteArrayInputStream);
                    oooO00o.f23312OooO00o = AbstractC6892l1.OooO00o(byteArrayInputStream);
                    C5394IiL1l r0 = oooO00o.OooO00o;
                    C6107iIiL OooO00o5 = r0.m21513OooO00o();
                    OooO00o5.f17565OooO0OO = C6115iIiL.m17008OooO0O0(oooO00o.f23312OooO00o);
                    r0.OooO00o(OooO00o2);
                    oooO00o.f23306OooO00o.OooO0O0(OooO00o2);
                    oooO00o.f23306OooO00o.OooO00o(C9586iIILl.m21628OooO00o(oooO00o.f23315OooO00o, (int) Lillilli.o00Oo0O0));
                    OooO00o5.f17564OooO0O0 = OooO0O0;
                    oooO00o.f23306OooO00o.OooO00o(oooO00o.f23315OooO00o);
                    oooO00o.f23306OooO00o.OooO00o(oooO00o.f23316OooO00o);
                    if (C9586iIILl.m21628OooO00o(oooO00o.f23315OooO00o, 255)) {
                        oooO00o.f23317OooO0O0 = true;
                    }
                    byte[] OooO00o6 = L1LL1Ii.OooO00o(oooO00o.f23312OooO00o, AbstractC6892l1.OooO00o);
                    if (OooO00o6 != null) {
                        oooO00o.f23317OooO0O0 = true;
                        if (!C9586iIILl.OooO0O0(OooO00o6, AbstractC6892l1.OooO00o(L1LL1Ii.f16174OooO00o))) {
                            throw new TlsFatalAlert(40);
                        }
                    }
                    oooO00o.f23306OooO00o.OooO0O0(oooO00o.f23317OooO0O0);
                    Hashtable hashtable = oooO00o.f23312OooO00o;
                    if (hashtable != null) {
                        C6115iIiL.OooO00o(hashtable);
                        oooO00o.f23306OooO00o.OooO0O0(oooO00o.f23312OooO00o);
                        return;
                    }
                    return;
                }
                throw new TlsFatalAlert(47);
            }
            throw new TlsFatalAlert(47);
        }
        throw new TlsFatalAlert(47);
    }

    public void OooO0OO(OooO00o oooO00o, byte[] bArr) throws IOException {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        oooO00o.f23311OooO00o.OooO0O0(byteArrayInputStream);
        AbstractC6892l1.OooO0O0(byteArrayInputStream);
    }

    public void OooO0Oo(OooO00o oooO00o, byte[] bArr) throws IOException {
        oooO00o.f23306OooO00o.OooO0O0(AbstractC6892l1.m18045OooO00o(new ByteArrayInputStream(bArr)));
    }
}

package com.p118pd.sdk;

import com.p118pd.sdk.C5495I1I1;
import com.p118pd.sdk.iL1IiIl;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.SecureRandom;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;
import org.bouncycastle.crypto.tls.TlsFatalAlert;

/* renamed from: com.pd.sdk.L11LlI */
public class L11LlI extends LLILiL11 {

    /* renamed from: com.pd.sdk.L11LlI$OooO00o */
    public static class OooO00o {
        public C5495I1I1.OooO0O0 OooO00o = null;

        /* renamed from: OooO00o  reason: collision with other field name */
        public C5495I1I1 f16130OooO00o = null;

        /* renamed from: OooO00o  reason: collision with other field name */
        public L1ILiLl f16131OooO00o = null;

        /* renamed from: OooO00o  reason: collision with other field name */
        public AbstractC5653LL1lI f16132OooO00o = null;

        /* renamed from: OooO00o  reason: collision with other field name */
        public C6583lLLI f16133OooO00o = null;

        /* renamed from: OooO00o  reason: collision with other field name */
        public lilLii1 f16134OooO00o = null;

        /* renamed from: OooO00o  reason: collision with other field name */
        public ll1iiLI f16135OooO00o = null;

        /* renamed from: OooO00o  reason: collision with other field name */
        public AbstractC6830lILl1 f16136OooO00o = null;

        /* renamed from: OooO00o  reason: collision with other field name */
        public AbstractC97431Llli f16137OooO00o = null;

        /* renamed from: OooO00o  reason: collision with other field name */
        public C9824LiI f16138OooO00o = null;

        /* renamed from: OooO00o  reason: collision with other field name */
        public Hashtable f16139OooO00o = null;

        /* renamed from: OooO00o  reason: collision with other field name */
        public boolean f16140OooO00o = false;

        /* renamed from: OooO00o  reason: collision with other field name */
        public byte[] f16141OooO00o = null;

        /* renamed from: OooO00o  reason: collision with other field name */
        public int[] f16142OooO00o = null;

        /* renamed from: OooO00o  reason: collision with other field name */
        public short[] f16143OooO00o = null;
        public Hashtable OooO0O0 = null;

        /* renamed from: OooO0O0  reason: collision with other field name */
        public boolean f16144OooO0O0 = false;
        public boolean OooO0OO = false;
        public boolean OooO0Oo = false;
    }

    public L11LlI(SecureRandom secureRandom) {
        super(secureRandom);
    }

    public static byte[] OooO00o(byte[] bArr, byte[] bArr2) throws IOException {
        int OooO00o2 = 35 + L1LL1Ii.m15924OooO00o(bArr, 34);
        int i = OooO00o2 + 1;
        byte[] bArr3 = new byte[(bArr.length + bArr2.length)];
        System.arraycopy(bArr, 0, bArr3, 0, OooO00o2);
        L1LL1Ii.m15943OooO0OO(bArr2.length);
        L1LL1Ii.OooO0OO(bArr2.length, bArr3, OooO00o2);
        System.arraycopy(bArr2, 0, bArr3, i, bArr2.length);
        System.arraycopy(bArr, i, bArr3, bArr2.length + i, bArr.length - i);
        return bArr3;
    }

    public C6502lIL OooO00o(OooO00o oooO00o, C1IlLiL1 r15) throws IOException {
        iL1IiIl.OooO0O0 oooO0O0;
        C6827lIIi1I1 r2;
        C6107iIiL OooO00o2 = oooO00o.f16133OooO00o.m21513OooO00o();
        iL1IiIl il1iiil = new iL1IiIl(oooO00o.f16133OooO00o, r15);
        byte[] OooO00o3 = OooO00o(oooO00o, oooO00o.f16132OooO00o);
        r15.OooO0O0(i1iiIl.OooO0o0);
        il1iiil.OooO00o(1, OooO00o3);
        while (true) {
            iL1IiIl.OooO0O0 OooO00o4 = il1iiil.OooO00o();
            if (OooO00o4.m17061OooO00o() == 3) {
                if (r15.m21296OooO00o().OooO0O0(oooO00o.f16133OooO00o.m21512OooO00o())) {
                    r15.OooO00o((i1iiIl) null);
                    byte[] OooO00o5 = OooO00o(OooO00o3, m15885OooO00o(oooO00o, OooO00o4.m17062OooO00o()));
                    il1iiil.OooO0OO();
                    il1iiil.OooO00o(1, OooO00o5);
                } else {
                    throw new TlsFatalAlert(47);
                }
            } else if (OooO00o4.m17061OooO00o() == 2) {
                i1iiIl OooO00o6 = r15.m21296OooO00o();
                OooO00o(oooO00o, OooO00o6);
                r15.OooO0O0(OooO00o6);
                OooO0Oo(oooO00o, OooO00o4.m17062OooO00o());
                il1iiil.m17060OooO0O0();
                LLILiL11.OooO00o(r15, OooO00o2.f17562OooO0O0);
                if (oooO00o.f16140OooO00o) {
                    OooO00o2.f17561OooO00o = C9586iIILl.m21630OooO00o(oooO00o.f16130OooO00o.m15731OooO00o());
                    r15.OooO00o(oooO00o.f16132OooO00o.OooO00o());
                    C6583lLLI llli = oooO00o.f16133OooO00o;
                    OooO00o(il1iiil.OooO00o((short) 20), L1LL1Ii.OooO00o(llli, LiLLlii.OooO0O0, AbstractC6892l1.OooO00o(llli, il1iiil.m17057OooO00o(), (byte[]) null)));
                    C6583lLLI llli2 = oooO00o.f16133OooO00o;
                    il1iiil.OooO00o(20, L1LL1Ii.OooO00o(llli2, LiLLlii.OooO00o, AbstractC6892l1.OooO00o(llli2, il1iiil.m17057OooO00o(), (byte[]) null)));
                    il1iiil.m17058OooO00o();
                    oooO00o.f16133OooO00o.OooO00o(oooO00o.f16136OooO00o);
                    oooO00o.f16132OooO00o.m17396OooO00o();
                    return new C6502lIL(r15);
                }
                OooO00o(oooO00o);
                byte[] bArr = oooO00o.f16141OooO00o;
                if (bArr.length > 0) {
                    oooO00o.f16136OooO00o = new IL1ll1(bArr, null);
                }
                iL1IiIl.OooO0O0 OooO00o7 = il1iiil.OooO00o();
                if (OooO00o7.m17061OooO00o() == 23) {
                    OooO0o(oooO00o, OooO00o7.m17062OooO00o());
                    OooO00o7 = il1iiil.OooO00o();
                } else {
                    oooO00o.f16132OooO00o.OooO00o((Vector) null);
                }
                AbstractC97431Llli OooO00o8 = oooO00o.f16132OooO00o.m16182OooO00o();
                oooO00o.f16137OooO00o = OooO00o8;
                OooO00o8.OooO00o(oooO00o.f16133OooO00o);
                if (OooO00o7.m17061OooO00o() == 11) {
                    r2 = OooO00o(oooO00o, OooO00o7.m17062OooO00o());
                    oooO0O0 = il1iiil.OooO00o();
                } else {
                    oooO00o.f16137OooO00o.OooO00o();
                    oooO0O0 = OooO00o7;
                    r2 = null;
                }
                if (r2 == null || r2.m17955OooO00o()) {
                    oooO00o.OooO0OO = false;
                }
                if (oooO0O0.m17061OooO00o() == 22) {
                    OooO0O0(oooO00o, oooO0O0.m17062OooO00o());
                    oooO0O0 = il1iiil.OooO00o();
                }
                if (oooO0O0.m17061OooO00o() == 12) {
                    OooO0o0(oooO00o, oooO0O0.m17062OooO00o());
                    oooO0O0 = il1iiil.OooO00o();
                } else {
                    oooO00o.f16137OooO00o.OooO0OO();
                }
                if (oooO0O0.m17061OooO00o() == 13) {
                    m15883OooO00o(oooO00o, oooO0O0.m17062OooO00o());
                    L1LL1Ii.OooO00o(il1iiil.m17057OooO00o(), oooO00o.f16134OooO00o.OooO0O0());
                    oooO0O0 = il1iiil.OooO00o();
                }
                if (oooO0O0.m17061OooO00o() != 14) {
                    throw new TlsFatalAlert(10);
                } else if (oooO0O0.m17062OooO00o().length == 0) {
                    il1iiil.m17057OooO00o().m21478OooO00o();
                    Vector OooO0O0 = oooO00o.f16132OooO00o.m16186OooO0O0();
                    if (OooO0O0 != null) {
                        il1iiil.OooO00o(23, LLILiL11.OooO00o(OooO0O0));
                    }
                    lilLii1 r8 = oooO00o.f16134OooO00o;
                    if (r8 != null) {
                        ll1iiLI OooO00o9 = oooO00o.f16131OooO00o.OooO00o(r8);
                        oooO00o.f16135OooO00o = OooO00o9;
                        C6827lIIi1I1 OooO00o10 = OooO00o9 != null ? OooO00o9.OooO00o() : null;
                        if (OooO00o10 == null) {
                            OooO00o10 = C6827lIIi1I1.OooO00o;
                        }
                        il1iiil.OooO00o(11, LLILiL11.OooO00o(OooO00o10));
                    }
                    ll1iiLI ll1iili = oooO00o.f16135OooO00o;
                    if (ll1iili != null) {
                        oooO00o.f16137OooO00o.OooO0O0(ll1iili);
                    } else {
                        oooO00o.f16137OooO00o.OooO0O0();
                    }
                    il1iiil.OooO00o(16, m15884OooO00o(oooO00o));
                    AbstractC9439IL OooO0O02 = il1iiil.m17059OooO0O0();
                    OooO00o2.f17567OooO0Oo = AbstractC6892l1.OooO00o(oooO00o.f16133OooO00o, OooO0O02, (byte[]) null);
                    AbstractC6892l1.OooO00o(oooO00o.f16133OooO00o, oooO00o.f16137OooO00o);
                    r15.OooO00o(oooO00o.f16132OooO00o.OooO00o());
                    ll1iiLI ll1iili2 = oooO00o.f16135OooO00o;
                    if (ll1iili2 != null && (ll1iili2 instanceof AbstractC5842L1)) {
                        AbstractC5842L1 r9 = (AbstractC5842L1) ll1iili2;
                        II1LLIl OooO00o11 = L1LL1Ii.OooO00o(oooO00o.f16133OooO00o, r9);
                        il1iiil.OooO00o(15, OooO00o(oooO00o, new iLlLiLll(OooO00o11, r9.OooO00o(OooO00o11 == null ? OooO00o2.OooO0oO() : OooO0O02.m21479OooO00o(OooO00o11.OooO00o())))));
                    }
                    C6583lLLI llli3 = oooO00o.f16133OooO00o;
                    il1iiil.OooO00o(20, L1LL1Ii.OooO00o(llli3, LiLLlii.OooO00o, AbstractC6892l1.OooO00o(llli3, il1iiil.m17057OooO00o(), (byte[]) null)));
                    if (oooO00o.OooO0Oo) {
                        iL1IiIl.OooO0O0 OooO00o12 = il1iiil.OooO00o();
                        if (OooO00o12.m17061OooO00o() == 4) {
                            OooO0OO(oooO00o, OooO00o12.m17062OooO00o());
                        } else {
                            throw new TlsFatalAlert(10);
                        }
                    }
                    C6583lLLI llli4 = oooO00o.f16133OooO00o;
                    OooO00o(il1iiil.OooO00o((short) 20), L1LL1Ii.OooO00o(llli4, LiLLlii.OooO0O0, AbstractC6892l1.OooO00o(llli4, il1iiil.m17057OooO00o(), (byte[]) null)));
                    il1iiil.m17058OooO00o();
                    if (oooO00o.f16136OooO00o != null) {
                        oooO00o.f16130OooO00o = new C5495I1I1.OooO0O0().OooO00o(OooO00o2.OooO00o()).OooO00o(OooO00o2.m16973OooO00o()).OooO00o(OooO00o2.m16976OooO0O0()).OooO00o(r2).OooO0O0(OooO00o2.m16977OooO0OO()).OooO0Oo(OooO00o2.OooO0o0()).OooO00o(oooO00o.OooO0O0).OooO00o();
                        AbstractC6830lILl1 OooO00o13 = L1LL1Ii.OooO00o(oooO00o.f16136OooO00o.m17964OooO00o(), oooO00o.f16130OooO00o);
                        oooO00o.f16136OooO00o = OooO00o13;
                        oooO00o.f16133OooO00o.OooO00o(OooO00o13);
                    }
                    oooO00o.f16132OooO00o.m17396OooO00o();
                    return new C6502lIL(r15);
                } else {
                    throw new TlsFatalAlert(50);
                }
            } else {
                throw new TlsFatalAlert(10);
            }
        }
    }

    public C6502lIL OooO00o(AbstractC5653LL1lI r6, AbstractC6681liLI r7) throws IOException {
        C5495I1I1 OooO00o2;
        if (r6 == null) {
            throw new IllegalArgumentException("'client' cannot be null");
        } else if (r7 != null) {
            C6107iIiL iiil = new C6107iIiL();
            iiil.OooO00o = 1;
            OooO00o oooO00o = new OooO00o();
            oooO00o.f16132OooO00o = r6;
            oooO00o.f16133OooO00o = new C6583lLLI(this.OooO00o, iiil);
            iiil.f17564OooO0O0 = AbstractC6892l1.OooO00o(r6.OooO0O0(), oooO00o.f16133OooO00o.m21514OooO00o());
            r6.OooO00o(oooO00o.f16133OooO00o);
            C1IlLiL1 r2 = new C1IlLiL1(r7, oooO00o.f16133OooO00o, r6, 22);
            AbstractC6830lILl1 OooO00o3 = oooO00o.f16132OooO00o.m16181OooO00o();
            if (!(OooO00o3 == null || !OooO00o3.m17963OooO00o() || (OooO00o2 = OooO00o3.OooO00o()) == null)) {
                oooO00o.f16136OooO00o = OooO00o3;
                oooO00o.f16130OooO00o = OooO00o2;
            }
            try {
                C6502lIL OooO00o4 = OooO00o(oooO00o, r2);
                iiil.m16974OooO00o();
                return OooO00o4;
            } catch (TlsFatalAlert e) {
                OooO00o(oooO00o, r2, e.getAlertDescription());
                throw e;
            } catch (IOException e2) {
                OooO00o(oooO00o, r2, 80);
                throw e2;
            } catch (RuntimeException e3) {
                OooO00o(oooO00o, r2, 80);
                throw new TlsFatalAlert(80, e3);
            } catch (Throwable th) {
                iiil.m16974OooO00o();
                throw th;
            }
        } else {
            throw new IllegalArgumentException("'transport' cannot be null");
        }
    }

    public C6827lIIi1I1 OooO00o(OooO00o oooO00o, byte[] bArr) throws IOException {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        C6827lIIi1I1 OooO00o2 = C6827lIIi1I1.OooO00o(byteArrayInputStream);
        AbstractC6892l1.OooO0O0(byteArrayInputStream);
        oooO00o.f16137OooO00o.OooO00o(OooO00o2);
        L1ILiLl OooO00o3 = oooO00o.f16132OooO00o.OooO00o();
        oooO00o.f16131OooO00o = OooO00o3;
        OooO00o3.OooO00o(OooO00o2);
        return OooO00o2;
    }

    public void OooO00o(OooO00o oooO00o) {
        C5495I1I1 r0 = oooO00o.f16130OooO00o;
        if (r0 != null) {
            r0.m15730OooO00o();
            oooO00o.f16130OooO00o = null;
        }
        AbstractC6830lILl1 r02 = oooO00o.f16136OooO00o;
        if (r02 != null) {
            r02.invalidate();
            oooO00o.f16136OooO00o = null;
        }
    }

    public void OooO00o(OooO00o oooO00o, i1iiIl i1iiil) throws IOException {
        C6583lLLI llli = oooO00o.f16133OooO00o;
        i1iiIl OooO0O0 = llli.OooO0O0();
        if (OooO0O0 == null) {
            llli.OooO0O0(i1iiil);
            oooO00o.f16132OooO00o.OooO00o(i1iiil);
        } else if (!OooO0O0.OooO00o(i1iiil)) {
            throw new TlsFatalAlert(47);
        }
    }

    public void OooO00o(OooO00o oooO00o, C1IlLiL1 r2, short s) {
        r2.OooO00o(s);
        OooO00o(oooO00o);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m15883OooO00o(OooO00o oooO00o, byte[] bArr) throws IOException {
        if (oooO00o.f16131OooO00o != null) {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            oooO00o.f16134OooO00o = lilLii1.OooO00o(oooO00o.f16133OooO00o, byteArrayInputStream);
            AbstractC6892l1.OooO0O0(byteArrayInputStream);
            oooO00o.f16137OooO00o.OooO00o(oooO00o.f16134OooO00o);
            return;
        }
        throw new TlsFatalAlert(40);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public byte[] m15884OooO00o(OooO00o oooO00o) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        oooO00o.f16137OooO00o.OooO00o(byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

    public byte[] OooO00o(OooO00o oooO00o, AbstractC5653LL1lI r8) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        i1iiIl OooO00o2 = r8.m16180OooO00o();
        if (OooO00o2.m16892OooO00o()) {
            C6583lLLI llli = oooO00o.f16133OooO00o;
            llli.OooO00o(OooO00o2);
            L1LL1Ii.OooO00o(OooO00o2, byteArrayOutputStream);
            byteArrayOutputStream.write(llli.m21513OooO00o().m16975OooO00o());
            byte[] bArr = L1LL1Ii.f16174OooO00o;
            AbstractC6830lILl1 r2 = oooO00o.f16136OooO00o;
            if (r2 != null && ((bArr = r2.m17964OooO00o()) == null || bArr.length > 32)) {
                bArr = L1LL1Ii.f16174OooO00o;
            }
            L1LL1Ii.OooO0OO(bArr, byteArrayOutputStream);
            L1LL1Ii.OooO0OO(L1LL1Ii.f16174OooO00o, byteArrayOutputStream);
            boolean OooO00o3 = r8.m16183OooO00o();
            oooO00o.f16142OooO00o = r8.m16184OooO00o();
            Hashtable OooO0O0 = r8.OooO0O0();
            oooO00o.f16139OooO00o = OooO0O0;
            boolean z = L1LL1Ii.OooO00o(OooO0O0, AbstractC6892l1.OooO00o) == null;
            boolean z2 = !C9586iIILl.m21628OooO00o(oooO00o.f16142OooO00o, 255);
            if (z && z2) {
                oooO00o.f16142OooO00o = C9586iIILl.m21636OooO00o(oooO00o.f16142OooO00o, 255);
            }
            if (OooO00o3 && !C9586iIILl.m21628OooO00o(oooO00o.f16142OooO00o, (int) Lillilli.o00Oo0O0)) {
                oooO00o.f16142OooO00o = C9586iIILl.m21636OooO00o(oooO00o.f16142OooO00o, (int) Lillilli.o00Oo0O0);
            }
            L1LL1Ii.OooO0O0(oooO00o.f16142OooO00o, byteArrayOutputStream);
            short[] sArr = {0};
            oooO00o.f16143OooO00o = sArr;
            L1LL1Ii.OooO0O0(sArr, (OutputStream) byteArrayOutputStream);
            Hashtable hashtable = oooO00o.f16139OooO00o;
            if (hashtable != null) {
                AbstractC6892l1.OooO00o(byteArrayOutputStream, hashtable);
            }
            return byteArrayOutputStream.toByteArray();
        }
        throw new TlsFatalAlert(80);
    }

    public byte[] OooO00o(OooO00o oooO00o, iLlLiLll illlilll) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        illlilll.OooO00o(byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public byte[] m15885OooO00o(OooO00o oooO00o, byte[] bArr) throws IOException {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        i1iiIl OooO00o2 = L1LL1Ii.m15917OooO00o((InputStream) byteArrayInputStream);
        byte[] OooO0OO = L1LL1Ii.m15946OooO0OO((InputStream) byteArrayInputStream);
        AbstractC6892l1.OooO0O0(byteArrayInputStream);
        if (!OooO00o2.OooO0O0(oooO00o.f16133OooO00o.m21512OooO00o())) {
            throw new TlsFatalAlert(47);
        } else if (i1iiIl.OooO0o.OooO0O0(OooO00o2) || OooO0OO.length <= 32) {
            return OooO0OO;
        } else {
            throw new TlsFatalAlert(47);
        }
    }

    public void OooO0O0(OooO00o oooO00o, byte[] bArr) throws IOException {
        if (oooO00o.OooO0OO) {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            oooO00o.f16138OooO00o = C9824LiI.OooO00o(byteArrayInputStream);
            AbstractC6892l1.OooO0O0(byteArrayInputStream);
            return;
        }
        throw new TlsFatalAlert(10);
    }

    public void OooO0OO(OooO00o oooO00o, byte[] bArr) throws IOException {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        LI1lll OooO00o2 = LI1lll.OooO00o(byteArrayInputStream);
        AbstractC6892l1.OooO0O0(byteArrayInputStream);
        oooO00o.f16132OooO00o.OooO00o(OooO00o2);
    }

    public void OooO0Oo(OooO00o oooO00o, byte[] bArr) throws IOException {
        AbstractC6830lILl1 r2;
        C6107iIiL OooO00o2 = oooO00o.f16133OooO00o.m21513OooO00o();
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        OooO00o(oooO00o, L1LL1Ii.m15917OooO00o((InputStream) byteArrayInputStream));
        OooO00o2.f17566OooO0OO = L1LL1Ii.OooO0O0(32, byteArrayInputStream);
        byte[] OooO0OO = L1LL1Ii.m15946OooO0OO((InputStream) byteArrayInputStream);
        oooO00o.f16141OooO00o = OooO0OO;
        if (OooO0OO.length <= 32) {
            oooO00o.f16132OooO00o.OooO00o(OooO0OO);
            byte[] bArr2 = oooO00o.f16141OooO00o;
            boolean z = false;
            oooO00o.f16140OooO00o = bArr2.length > 0 && (r2 = oooO00o.f16136OooO00o) != null && C9586iIILl.m21627OooO00o(bArr2, r2.m17964OooO00o());
            int OooO00o3 = L1LL1Ii.OooO00o((InputStream) byteArrayInputStream);
            if (!C9586iIILl.m21628OooO00o(oooO00o.f16142OooO00o, OooO00o3) || OooO00o3 == 0 || Lillilli.OooO00o(OooO00o3) || !L1LL1Ii.OooO00o(OooO00o3, oooO00o.f16133OooO00o.OooO0O0())) {
                throw new TlsFatalAlert(47);
            }
            LLILiL11.OooO00o(OooO00o3, (short) 47);
            oooO00o.f16132OooO00o.OooO00o(OooO00o3);
            short OooO00o4 = L1LL1Ii.m15923OooO00o((InputStream) byteArrayInputStream);
            if (C9586iIILl.m21629OooO00o(oooO00o.f16143OooO00o, OooO00o4)) {
                oooO00o.f16132OooO00o.OooO00o(OooO00o4);
                Hashtable OooO00o5 = AbstractC6892l1.OooO00o(byteArrayInputStream);
                oooO00o.OooO0O0 = OooO00o5;
                if (OooO00o5 != null) {
                    Enumeration keys = OooO00o5.keys();
                    while (keys.hasMoreElements()) {
                        Integer num = (Integer) keys.nextElement();
                        if (!num.equals(AbstractC6892l1.OooO00o)) {
                            if (L1LL1Ii.OooO00o(oooO00o.f16139OooO00o, num) != null) {
                                boolean z2 = oooO00o.f16140OooO00o;
                            } else {
                                throw new TlsFatalAlert(C6728ll11.OooOoO0);
                            }
                        }
                    }
                }
                byte[] OooO00o6 = L1LL1Ii.OooO00o(oooO00o.OooO0O0, AbstractC6892l1.OooO00o);
                if (OooO00o6 != null) {
                    oooO00o.f16144OooO0O0 = true;
                    if (!C9586iIILl.OooO0O0(OooO00o6, AbstractC6892l1.OooO00o(L1LL1Ii.f16174OooO00o))) {
                        throw new TlsFatalAlert(40);
                    }
                }
                oooO00o.f16132OooO00o.OooO0O0(oooO00o.f16144OooO0O0);
                Hashtable hashtable = oooO00o.f16139OooO00o;
                Hashtable hashtable2 = oooO00o.OooO0O0;
                if (oooO00o.f16140OooO00o) {
                    if (OooO00o3 == oooO00o.f16130OooO00o.OooO00o() && OooO00o4 == oooO00o.f16130OooO00o.m15729OooO00o()) {
                        hashtable = null;
                        hashtable2 = oooO00o.f16130OooO00o.m15728OooO00o();
                    } else {
                        throw new TlsFatalAlert(47);
                    }
                }
                OooO00o2.OooO0O0 = OooO00o3;
                OooO00o2.f17559OooO00o = OooO00o4;
                if (hashtable2 != null) {
                    boolean OooO00o7 = C6115iIiL.m17006OooO00o(hashtable2);
                    if (!OooO00o7 || L1LL1Ii.m15940OooO0O0(OooO00o2.OooO00o())) {
                        OooO00o2.f17563OooO0O0 = OooO00o7;
                        OooO00o2.f17565OooO0OO = C6115iIiL.m17008OooO0O0(hashtable2);
                        OooO00o2.f17562OooO0O0 = LLILiL11.OooO00o(oooO00o.f16140OooO00o, hashtable, hashtable2, 47);
                        OooO00o2.f17560OooO00o = C6115iIiL.m17009OooO0OO(hashtable2);
                        oooO00o.OooO0OO = !oooO00o.f16140OooO00o && L1LL1Ii.OooO00o(hashtable2, C6115iIiL.OooO0oO, 47);
                        if (!oooO00o.f16140OooO00o && L1LL1Ii.OooO00o(hashtable2, AbstractC6892l1.OooO0O0, (short) 47)) {
                            z = true;
                        }
                        oooO00o.OooO0Oo = z;
                    } else {
                        throw new TlsFatalAlert(47);
                    }
                }
                if (hashtable != null) {
                    oooO00o.f16132OooO00o.OooO00o(hashtable2);
                }
                OooO00o2.OooO0OO = AbstractC6892l1.OooO00o(oooO00o.f16133OooO00o, OooO00o2.OooO00o());
                OooO00o2.OooO0Oo = 12;
                return;
            }
            throw new TlsFatalAlert(47);
        }
        throw new TlsFatalAlert(47);
    }

    public void OooO0o(OooO00o oooO00o, byte[] bArr) throws IOException {
        oooO00o.f16132OooO00o.OooO00o(AbstractC6892l1.m18045OooO00o(new ByteArrayInputStream(bArr)));
    }

    public void OooO0o0(OooO00o oooO00o, byte[] bArr) throws IOException {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        oooO00o.f16137OooO00o.OooO00o(byteArrayInputStream);
        AbstractC6892l1.OooO0O0(byteArrayInputStream);
    }
}

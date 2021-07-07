package com.p118pd.sdk;

import com.p118pd.sdk.AbstractC6892l1;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.SecureRandom;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;
import org.bouncycastle.crypto.tls.TlsFatalAlert;

/* renamed from: com.pd.sdk.i1l1  reason: case insensitive filesystem */
public class C6042i1l1 extends AbstractC6892l1 {
    public L1ILiLl OooO00o = null;

    /* renamed from: OooO00o  reason: collision with other field name */
    public AbstractC5653LL1lI f17412OooO00o = null;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C6583lLLI f17413OooO00o = null;

    /* renamed from: OooO00o  reason: collision with other field name */
    public lilLii1 f17414OooO00o = null;

    /* renamed from: OooO00o  reason: collision with other field name */
    public AbstractC97431Llli f17415OooO00o = null;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C9824LiI f17416OooO00o = null;
    public byte[] OooO0O0 = null;

    public C6042i1l1(InputStream inputStream, OutputStream outputStream, SecureRandom secureRandom) {
        super(inputStream, outputStream, secureRandom);
    }

    public C6042i1l1(SecureRandom secureRandom) {
        super(secureRandom);
    }

    @Override // com.p118pd.sdk.AbstractC6892l1, com.p118pd.sdk.AbstractC6892l1, com.p118pd.sdk.AbstractC6892l1, com.p118pd.sdk.AbstractC6892l1, com.p118pd.sdk.AbstractC6892l1, com.p118pd.sdk.AbstractC6892l1, com.p118pd.sdk.AbstractC6892l1, com.p118pd.sdk.AbstractC6892l1
    public iL1liI OooO00o() {
        return this.f17413OooO00o;
    }

    @Override // com.p118pd.sdk.AbstractC6892l1, com.p118pd.sdk.AbstractC6892l1, com.p118pd.sdk.AbstractC6892l1, com.p118pd.sdk.AbstractC6892l1, com.p118pd.sdk.AbstractC6892l1, com.p118pd.sdk.AbstractC6892l1, com.p118pd.sdk.AbstractC6892l1, com.p118pd.sdk.AbstractC6892l1
    /* renamed from: OooO00o  reason: collision with other method in class */
    public AbstractC6333illiL m16895OooO00o() {
        return this.f17412OooO00o;
    }

    @Override // com.p118pd.sdk.AbstractC6892l1, com.p118pd.sdk.AbstractC6892l1, com.p118pd.sdk.AbstractC6892l1, com.p118pd.sdk.AbstractC6892l1, com.p118pd.sdk.AbstractC6892l1, com.p118pd.sdk.AbstractC6892l1, com.p118pd.sdk.AbstractC6892l1, com.p118pd.sdk.AbstractC6892l1
    /* renamed from: OooO00o  reason: collision with other method in class */
    public AbstractC9462L1Lii m16896OooO00o() {
        return this.f17413OooO00o;
    }

    public void OooO00o(AbstractC5653LL1lI r5) throws IOException {
        C5495I1I1 OooO00o2;
        if (r5 == null) {
            throw new IllegalArgumentException("'tlsClient' cannot be null");
        } else if (this.f17412OooO00o == null) {
            this.f17412OooO00o = r5;
            C6107iIiL iiil = new C6107iIiL();
            ((AbstractC6892l1) this).f18995OooO00o = iiil;
            iiil.OooO00o = 1;
            this.f17413OooO00o = new C6583lLLI(((AbstractC6892l1) this).f19000OooO00o, ((AbstractC6892l1) this).f18995OooO00o);
            ((AbstractC6892l1) this).f18995OooO00o.f17564OooO0O0 = AbstractC6892l1.OooO00o(r5.OooO0O0(), this.f17413OooO00o.m21514OooO00o());
            this.f17412OooO00o.OooO00o(this.f17413OooO00o);
            ((AbstractC6892l1) this).f18992OooO00o.OooO00o(this.f17413OooO00o);
            AbstractC6830lILl1 OooO00o3 = r5.m16181OooO00o();
            if (!(OooO00o3 == null || !OooO00o3.m17963OooO00o() || (OooO00o2 = OooO00o3.OooO00o()) == null)) {
                ((AbstractC6892l1) this).f18999OooO00o = OooO00o3;
                ((AbstractC6892l1) this).f18990OooO00o = OooO00o2;
            }
            OooOOo0();
            ((AbstractC6892l1) this).f19002OooO00o = 1;
            m18057OooO0O0();
        } else {
            throw new IllegalStateException("'connect' can only be called once");
        }
    }

    public void OooO00o(iLlLiLll illlilll) throws IOException {
        AbstractC6892l1.OooO00o oooO00o = new AbstractC6892l1.OooO00o(this, 15);
        illlilll.OooO00o(oooO00o);
        oooO00o.OooO00o();
    }

    @Override // com.p118pd.sdk.AbstractC6892l1
    public void OooO00o(short s, ByteArrayInputStream byteArrayInputStream) throws IOException {
        ll1iiLI ll1iili;
        C6827lIIi1I1 r10;
        if (this.f19014OooO0o0) {
            if (s == 20 && ((AbstractC6892l1) this).f19002OooO00o == 2) {
                m18052OooO00o(byteArrayInputStream);
                ((AbstractC6892l1) this).f19002OooO00o = 15;
                OooOOO0();
                OooOOO();
                ((AbstractC6892l1) this).f19002OooO00o = 13;
                OooO0o();
                return;
            }
            throw new TlsFatalAlert(10);
        } else if (s == 0) {
            AbstractC6892l1.OooO0O0(byteArrayInputStream);
            if (((AbstractC6892l1) this).f19002OooO00o == 16) {
                OooOO0O();
            }
        } else if (s != 2) {
            if (s != 4) {
                if (s == 20) {
                    short s2 = ((AbstractC6892l1) this).f19002OooO00o;
                    if (s2 != 13) {
                        if (s2 != 14) {
                            throw new TlsFatalAlert(10);
                        }
                    } else if (this.f18988OooO) {
                        throw new TlsFatalAlert(10);
                    }
                    m18052OooO00o(byteArrayInputStream);
                    ((AbstractC6892l1) this).f19002OooO00o = 15;
                    OooO0o();
                } else if (s != 22) {
                    if (s != 23) {
                        switch (s) {
                            case 11:
                                short s3 = ((AbstractC6892l1) this).f19002OooO00o;
                                if (s3 == 2) {
                                    OooO0O0((Vector) null);
                                } else if (s3 != 3) {
                                    throw new TlsFatalAlert(10);
                                }
                                ((AbstractC6892l1) this).f18998OooO00o = C6827lIIi1I1.OooO00o(byteArrayInputStream);
                                AbstractC6892l1.OooO0O0(byteArrayInputStream);
                                C6827lIIi1I1 r9 = ((AbstractC6892l1) this).f18998OooO00o;
                                if (r9 == null || r9.m17955OooO00o()) {
                                    this.f19016OooO0oo = false;
                                }
                                this.f17415OooO00o.OooO00o(((AbstractC6892l1) this).f18998OooO00o);
                                L1ILiLl OooO00o2 = this.f17412OooO00o.OooO00o();
                                this.OooO00o = OooO00o2;
                                OooO00o2.OooO00o(((AbstractC6892l1) this).f18998OooO00o);
                                ((AbstractC6892l1) this).f19002OooO00o = 4;
                                return;
                            case 12:
                                short s4 = ((AbstractC6892l1) this).f19002OooO00o;
                                if (s4 == 2) {
                                    OooO0O0((Vector) null);
                                } else if (s4 != 3) {
                                    if (!(s4 == 4 || s4 == 5)) {
                                        throw new TlsFatalAlert(10);
                                    }
                                    this.f17415OooO00o.OooO00o(byteArrayInputStream);
                                    AbstractC6892l1.OooO0O0(byteArrayInputStream);
                                    ((AbstractC6892l1) this).f19002OooO00o = 6;
                                    return;
                                }
                                this.f17415OooO00o.OooO00o();
                                this.OooO00o = null;
                                this.f17415OooO00o.OooO00o(byteArrayInputStream);
                                AbstractC6892l1.OooO0O0(byteArrayInputStream);
                                ((AbstractC6892l1) this).f19002OooO00o = 6;
                                return;
                            case 13:
                                short s5 = ((AbstractC6892l1) this).f19002OooO00o;
                                if (s5 == 4 || s5 == 5) {
                                    this.f17415OooO00o.OooO0OO();
                                } else if (s5 != 6) {
                                    throw new TlsFatalAlert(10);
                                }
                                if (this.OooO00o != null) {
                                    this.f17414OooO00o = lilLii1.OooO00o(OooO00o(), byteArrayInputStream);
                                    AbstractC6892l1.OooO0O0(byteArrayInputStream);
                                    this.f17415OooO00o.OooO00o(this.f17414OooO00o);
                                    L1LL1Ii.OooO00o(((AbstractC6892l1) this).f18992OooO00o.m16103OooO00o(), this.f17414OooO00o.OooO0O0());
                                    ((AbstractC6892l1) this).f19002OooO00o = 7;
                                    return;
                                }
                                throw new TlsFatalAlert(40);
                            case 14:
                                switch (((AbstractC6892l1) this).f19002OooO00o) {
                                    case 2:
                                        OooO0O0((Vector) null);
                                    case 3:
                                        this.f17415OooO00o.OooO00o();
                                        this.OooO00o = null;
                                    case 4:
                                    case 5:
                                        this.f17415OooO00o.OooO0OO();
                                        break;
                                    case 6:
                                    case 7:
                                        break;
                                    default:
                                        throw new TlsFatalAlert(10);
                                }
                                AbstractC6892l1.OooO0O0(byteArrayInputStream);
                                ((AbstractC6892l1) this).f19002OooO00o = 8;
                                ((AbstractC6892l1) this).f18992OooO00o.m16103OooO00o().m21478OooO00o();
                                Vector OooO0O02 = this.f17412OooO00o.m16186OooO0O0();
                                if (OooO0O02 != null) {
                                    OooO00o(OooO0O02);
                                }
                                ((AbstractC6892l1) this).f19002OooO00o = 9;
                                lilLii1 r92 = this.f17414OooO00o;
                                if (r92 == null) {
                                    this.f17415OooO00o.OooO0O0();
                                    ll1iili = null;
                                } else {
                                    ll1iili = this.OooO00o.OooO00o(r92);
                                    AbstractC97431Llli r102 = this.f17415OooO00o;
                                    if (ll1iili == null) {
                                        r102.OooO0O0();
                                        r10 = C6827lIIi1I1.OooO00o;
                                    } else {
                                        r102.OooO0O0(ll1iili);
                                        r10 = ll1iili.OooO00o();
                                    }
                                    OooO00o(r10);
                                }
                                ((AbstractC6892l1) this).f19002OooO00o = 10;
                                OooOOo();
                                ((AbstractC6892l1) this).f19002OooO00o = 11;
                                if (L1LL1Ii.OooO00o(OooO00o())) {
                                    AbstractC6892l1.OooO00o(OooO00o(), this.f17415OooO00o);
                                }
                                AbstractC9439IL OooO0O03 = ((AbstractC6892l1) this).f18992OooO00o.OooO0O0();
                                ((AbstractC6892l1) this).f18995OooO00o.f17567OooO0Oo = AbstractC6892l1.OooO00o(OooO00o(), OooO0O03, (byte[]) null);
                                if (!L1LL1Ii.OooO00o(OooO00o())) {
                                    AbstractC6892l1.OooO00o(OooO00o(), this.f17415OooO00o);
                                }
                                ((AbstractC6892l1) this).f18992OooO00o.OooO00o(m16895OooO00o().m17395OooO00o(), m16895OooO00o().OooO00o());
                                if (ll1iili != null && (ll1iili instanceof AbstractC5842L1)) {
                                    AbstractC5842L1 r93 = (AbstractC5842L1) ll1iili;
                                    II1LLIl OooO00o3 = L1LL1Ii.OooO00o(OooO00o(), r93);
                                    OooO00o(new iLlLiLll(OooO00o3, r93.OooO00o(OooO00o3 == null ? ((AbstractC6892l1) this).f18995OooO00o.OooO0oO() : OooO0O03.m21479OooO00o(OooO00o3.OooO00o()))));
                                    ((AbstractC6892l1) this).f19002OooO00o = 12;
                                }
                                OooOOO0();
                                OooOOO();
                                ((AbstractC6892l1) this).f19002OooO00o = 13;
                                return;
                            default:
                                throw new TlsFatalAlert(10);
                        }
                    } else if (((AbstractC6892l1) this).f19002OooO00o == 2) {
                        OooO0O0(AbstractC6892l1.m18045OooO00o(byteArrayInputStream));
                    } else {
                        throw new TlsFatalAlert(10);
                    }
                } else if (((AbstractC6892l1) this).f19002OooO00o != 4) {
                    throw new TlsFatalAlert(10);
                } else if (this.f19016OooO0oo) {
                    this.f17416OooO00o = C9824LiI.OooO00o(byteArrayInputStream);
                    AbstractC6892l1.OooO0O0(byteArrayInputStream);
                    ((AbstractC6892l1) this).f19002OooO00o = 5;
                } else {
                    throw new TlsFatalAlert(10);
                }
            } else if (((AbstractC6892l1) this).f19002OooO00o != 13) {
                throw new TlsFatalAlert(10);
            } else if (this.f18988OooO) {
                OooOO0();
                OooO0OO(byteArrayInputStream);
                ((AbstractC6892l1) this).f19002OooO00o = 14;
            } else {
                throw new TlsFatalAlert(10);
            }
        } else if (((AbstractC6892l1) this).f19002OooO00o == 1) {
            OooO0Oo(byteArrayInputStream);
            ((AbstractC6892l1) this).f19002OooO00o = 2;
            ((AbstractC6892l1) this).f18992OooO00o.OooO0OO();
            m18051OooO00o();
            if (this.f19014OooO0o0) {
                ((AbstractC6892l1) this).f18995OooO00o.f17561OooO00o = C9586iIILl.m21630OooO00o(((AbstractC6892l1) this).f18990OooO00o.m15731OooO00o());
                ((AbstractC6892l1) this).f18992OooO00o.OooO00o(m16895OooO00o().m17395OooO00o(), m16895OooO00o().OooO00o());
                return;
            }
            OooOO0();
            byte[] bArr = this.OooO0O0;
            if (bArr.length > 0) {
                ((AbstractC6892l1) this).f18999OooO00o = new IL1ll1(bArr, null);
            }
        } else {
            throw new TlsFatalAlert(10);
        }
    }

    public void OooO0O0(Vector vector) throws IOException {
        this.f17412OooO00o.OooO00o(vector);
        ((AbstractC6892l1) this).f19002OooO00o = 3;
        AbstractC97431Llli OooO00o2 = this.f17412OooO00o.m16182OooO00o();
        this.f17415OooO00o = OooO00o2;
        OooO00o2.OooO00o(OooO00o());
    }

    @Override // com.p118pd.sdk.AbstractC6892l1, com.p118pd.sdk.AbstractC6892l1
    public void OooO0OO() {
        super.m18059OooO0OO();
        this.OooO0O0 = null;
        this.f17415OooO00o = null;
        this.OooO00o = null;
        this.f17416OooO00o = null;
        this.f17414OooO00o = null;
    }

    public void OooO0OO(ByteArrayInputStream byteArrayInputStream) throws IOException {
        LI1lll OooO00o2 = LI1lll.OooO00o(byteArrayInputStream);
        AbstractC6892l1.OooO0O0(byteArrayInputStream);
        this.f17412OooO00o.OooO00o(OooO00o2);
    }

    public void OooO0Oo(ByteArrayInputStream byteArrayInputStream) throws IOException {
        AbstractC6830lILl1 r1;
        i1iiIl OooO00o2 = L1LL1Ii.m15917OooO00o((InputStream) byteArrayInputStream);
        if (OooO00o2.m16892OooO00o()) {
            throw new TlsFatalAlert(47);
        } else if (!OooO00o2.OooO00o(((AbstractC6892l1) this).f18992OooO00o.m16102OooO00o())) {
            throw new TlsFatalAlert(47);
        } else if (OooO00o2.OooO0O0(OooO00o().OooO00o())) {
            ((AbstractC6892l1) this).f18992OooO00o.OooO0O0(OooO00o2);
            m16896OooO00o().OooO0O0(OooO00o2);
            this.f17412OooO00o.OooO00o(OooO00o2);
            ((AbstractC6892l1) this).f18995OooO00o.f17566OooO0OO = L1LL1Ii.OooO0O0(32, byteArrayInputStream);
            byte[] OooO0OO = L1LL1Ii.m15946OooO0OO((InputStream) byteArrayInputStream);
            this.OooO0O0 = OooO0OO;
            if (OooO0OO.length <= 32) {
                this.f17412OooO00o.OooO00o(OooO0OO);
                byte[] bArr = this.OooO0O0;
                boolean z = false;
                this.f19014OooO0o0 = bArr.length > 0 && (r1 = ((AbstractC6892l1) this).f18999OooO00o) != null && C9586iIILl.m21627OooO00o(bArr, r1.m17964OooO00o());
                int OooO00o3 = L1LL1Ii.OooO00o((InputStream) byteArrayInputStream);
                if (!C9586iIILl.m21628OooO00o(((AbstractC6892l1) this).f19005OooO00o, OooO00o3) || OooO00o3 == 0 || Lillilli.OooO00o(OooO00o3) || !L1LL1Ii.OooO00o(OooO00o3, OooO00o().OooO0O0())) {
                    throw new TlsFatalAlert(47);
                }
                this.f17412OooO00o.OooO00o(OooO00o3);
                short OooO00o4 = L1LL1Ii.m15923OooO00o((InputStream) byteArrayInputStream);
                if (C9586iIILl.m21629OooO00o(((AbstractC6892l1) this).f19006OooO00o, OooO00o4)) {
                    this.f17412OooO00o.OooO00o(OooO00o4);
                    Hashtable OooO00o5 = AbstractC6892l1.OooO00o(byteArrayInputStream);
                    ((AbstractC6892l1) this).f19008OooO0O0 = OooO00o5;
                    if (OooO00o5 != null) {
                        Enumeration keys = OooO00o5.keys();
                        while (keys.hasMoreElements()) {
                            Integer num = (Integer) keys.nextElement();
                            if (!num.equals(AbstractC6892l1.OooO00o) && L1LL1Ii.OooO00o(((AbstractC6892l1) this).f19001OooO00o, num) == null) {
                                throw new TlsFatalAlert(C6728ll11.OooOoO0);
                            }
                        }
                    }
                    byte[] OooO00o6 = L1LL1Ii.OooO00o(((AbstractC6892l1) this).f19008OooO0O0, AbstractC6892l1.OooO00o);
                    if (OooO00o6 != null) {
                        this.f19015OooO0oO = true;
                        if (!C9586iIILl.OooO0O0(OooO00o6, AbstractC6892l1.OooO00o(L1LL1Ii.f16174OooO00o))) {
                            throw new TlsFatalAlert(40);
                        }
                    }
                    this.f17412OooO00o.OooO0O0(this.f19015OooO0oO);
                    Hashtable hashtable = ((AbstractC6892l1) this).f19001OooO00o;
                    Hashtable hashtable2 = ((AbstractC6892l1) this).f19008OooO0O0;
                    if (this.f19014OooO0o0) {
                        if (OooO00o3 == ((AbstractC6892l1) this).f18990OooO00o.OooO00o() && OooO00o4 == ((AbstractC6892l1) this).f18990OooO00o.m15729OooO00o()) {
                            hashtable = null;
                            hashtable2 = ((AbstractC6892l1) this).f18990OooO00o.m15728OooO00o();
                        } else {
                            throw new TlsFatalAlert(47);
                        }
                    }
                    C6107iIiL iiil = ((AbstractC6892l1) this).f18995OooO00o;
                    iiil.OooO0O0 = OooO00o3;
                    iiil.f17559OooO00o = OooO00o4;
                    if (hashtable2 != null) {
                        boolean OooO00o7 = C6115iIiL.m17006OooO00o(hashtable2);
                        if (!OooO00o7 || L1LL1Ii.m15940OooO0O0(OooO00o3)) {
                            C6107iIiL iiil2 = ((AbstractC6892l1) this).f18995OooO00o;
                            iiil2.f17563OooO0O0 = OooO00o7;
                            iiil2.f17565OooO0OO = C6115iIiL.m17008OooO0O0(hashtable2);
                            ((AbstractC6892l1) this).f18995OooO00o.f17562OooO0O0 = OooO00o(hashtable, hashtable2, (short) 47);
                            ((AbstractC6892l1) this).f18995OooO00o.f17560OooO00o = C6115iIiL.m17009OooO0OO(hashtable2);
                            this.f19016OooO0oo = !this.f19014OooO0o0 && L1LL1Ii.OooO00o(hashtable2, C6115iIiL.OooO0oO, 47);
                            if (!this.f19014OooO0o0 && L1LL1Ii.OooO00o(hashtable2, AbstractC6892l1.OooO0O0, (short) 47)) {
                                z = true;
                            }
                            this.f18988OooO = z;
                        } else {
                            throw new TlsFatalAlert(47);
                        }
                    }
                    if (hashtable != null) {
                        this.f17412OooO00o.OooO00o(hashtable2);
                    }
                    ((AbstractC6892l1) this).f18995OooO00o.OooO0OO = AbstractC6892l1.OooO00o(OooO00o(), ((AbstractC6892l1) this).f18995OooO00o.OooO00o());
                    ((AbstractC6892l1) this).f18995OooO00o.OooO0Oo = 12;
                    return;
                }
                throw new TlsFatalAlert(47);
            }
            throw new TlsFatalAlert(47);
        } else {
            throw new TlsFatalAlert(47);
        }
    }

    public void OooOOo() throws IOException {
        AbstractC6892l1.OooO00o oooO00o = new AbstractC6892l1.OooO00o(this, 16);
        this.f17415OooO00o.OooO00o(oooO00o);
        oooO00o.OooO00o();
    }

    public void OooOOo0() throws IOException {
        C5495I1I1 r3;
        ((AbstractC6892l1) this).f18992OooO00o.OooO0O0(this.f17412OooO00o.OooO0OO());
        i1iiIl OooO00o2 = this.f17412OooO00o.m16180OooO00o();
        if (!OooO00o2.m16892OooO00o()) {
            m16896OooO00o().OooO00o(OooO00o2);
            byte[] bArr = L1LL1Ii.f16174OooO00o;
            AbstractC6830lILl1 r2 = ((AbstractC6892l1) this).f18999OooO00o;
            if (r2 != null && ((bArr = r2.m17964OooO00o()) == null || bArr.length > 32)) {
                bArr = L1LL1Ii.f16174OooO00o;
            }
            boolean OooO00o3 = this.f17412OooO00o.m16183OooO00o();
            ((AbstractC6892l1) this).f19005OooO00o = this.f17412OooO00o.m16184OooO00o();
            ((AbstractC6892l1) this).f19006OooO00o = this.f17412OooO00o.m16185OooO00o();
            if (bArr.length > 0 && (r3 = ((AbstractC6892l1) this).f18990OooO00o) != null && (!C9586iIILl.m21628OooO00o(((AbstractC6892l1) this).f19005OooO00o, r3.OooO00o()) || !C9586iIILl.m21629OooO00o(((AbstractC6892l1) this).f19006OooO00o, ((AbstractC6892l1) this).f18990OooO00o.m15729OooO00o()))) {
                bArr = L1LL1Ii.f16174OooO00o;
            }
            ((AbstractC6892l1) this).f19001OooO00o = this.f17412OooO00o.OooO0O0();
            AbstractC6892l1.OooO00o oooO00o = new AbstractC6892l1.OooO00o(this, 1);
            L1LL1Ii.OooO00o(OooO00o2, oooO00o);
            oooO00o.write(((AbstractC6892l1) this).f18995OooO00o.m16975OooO00o());
            L1LL1Ii.OooO0OO(bArr, oooO00o);
            boolean z = L1LL1Ii.OooO00o(((AbstractC6892l1) this).f19001OooO00o, AbstractC6892l1.OooO00o) == null;
            boolean z2 = !C9586iIILl.m21628OooO00o(((AbstractC6892l1) this).f19005OooO00o, 255);
            if (z && z2) {
                ((AbstractC6892l1) this).f19005OooO00o = C9586iIILl.m21636OooO00o(((AbstractC6892l1) this).f19005OooO00o, 255);
            }
            if (OooO00o3 && !C9586iIILl.m21628OooO00o(((AbstractC6892l1) this).f19005OooO00o, (int) Lillilli.o00Oo0O0)) {
                ((AbstractC6892l1) this).f19005OooO00o = C9586iIILl.m21636OooO00o(((AbstractC6892l1) this).f19005OooO00o, (int) Lillilli.o00Oo0O0);
            }
            L1LL1Ii.OooO0O0(((AbstractC6892l1) this).f19005OooO00o, oooO00o);
            L1LL1Ii.OooO0O0(((AbstractC6892l1) this).f19006OooO00o, (OutputStream) oooO00o);
            Hashtable hashtable = ((AbstractC6892l1) this).f19001OooO00o;
            if (hashtable != null) {
                AbstractC6892l1.OooO00o(oooO00o, hashtable);
            }
            oooO00o.OooO00o();
            return;
        }
        throw new TlsFatalAlert(80);
    }
}
